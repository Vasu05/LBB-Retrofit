package com.example.vasuchand.lbb_retrofit;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.vasuchand.lbb_retrofit.Adapter.adapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="MainActivity" ;
    private List<data>person_info;
    private  List<model_ids>person_ids;
    private List<model_address>person_address;

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    Apiinterface api;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setNestedScrollingEnabled(false);


        getBooks();
    }

    private void getBooks(){
        //While the app fetched data we are displaying a progress dialog
      //  final ProgressDialog loading = ProgressDialog.show(this,"Fetching Data","Please wait...",false,false);

        //Creating a rest adapter
        Retrofit retrofit = apiclient.getClient();

        //Creating an object of our api interface
        api = retrofit.create(Apiinterface.class);

        Thread one = new Thread() {
            public void run() {
                func1();

            }
        };
        one.start();


//        adapter = new adapter( MainActivity.this,person_info,person_ids,person_address);
//        recyclerView.setAdapter(adapter);
//        adapter.notifyDataSetChanged();


    }

    public void func1()
    {

        Call<name> call = api.getBooks();

        call.enqueue(new Callback<name>() {
            @Override
            public void onResponse(Call<name> call, Response<name> response) {

                Contacts movies = response.body().getResults();
                List <data> move =movies.getResults();
                person_info = move;

                System.out.println(move.get(1).getName());
                func2();


            }

            @Override
            public void onFailure(Call<name> call, Throwable t) {
                Log.e("fasilure",t.getMessage());

                System.out.println("Error"+ " "+t.getCause() + " " +t.getLocalizedMessage());
            }

        });
    }

    public void func2()
    {
        Call<model>  call2 = api.getidsplusgetaddress();
        call2.enqueue(new Callback<model>() {
            @Override
            public void onResponse(Call<model> call, Response<model> response) {


                model_combine m = response.body().getResults();
                person_address = m.getResult2();
                person_ids = m.getResult();
              //  System.out.println(person_address.get(0).getMobile().getMobile().getMobile());

                adapter = new adapter( MainActivity.this,person_info,person_ids,person_address);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<model> call, Throwable t) {


                System.out.println("error");
            }
        });
    }
}
