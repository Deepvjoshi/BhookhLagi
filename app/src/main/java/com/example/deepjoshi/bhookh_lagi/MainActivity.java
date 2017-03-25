package com.example.deepjoshi.bhookh_lagi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.deepjoshi.bhookh_lagi.R.id.checkBox;
import static com.example.deepjoshi.bhookh_lagi.R.id.navubox;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    //String states[] = getResources().getStringArray(R.array.states);
//static boolean ramram=false;
   // SparseBooleanArray sp= new SparseBooleanArray();
    int[] imageView = new int[]{R.drawable.dominos_logo,R.drawable.mr_pizza,R.drawable.pizz_hut,R.drawable.dominos_logo,R.drawable.mr_pizza,R.drawable.pizz_hut,R.drawable.apizza,R.drawable.pizz_hut,R.drawable.mr_pizza,R.drawable.apizza};
    int[] img_veg = new int[]{R.drawable.veg};
    int[] img_non_veg = new int[]{R.drawable.veg_non_veg_con_02};
    String dominos[];
    String address[];
   // CustomAdapter customAdapter = new CustomAdapter(this, dominos, address, imageView, img_veg, img_non_veg);
    //int count=0;
   // CheckBox hcbox;

  //  String[] contact = new String[]{"7874772010"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);


        dominos = getResources().getStringArray(R.array.dominos);
        address = getResources().getStringArray(R.array.address);

//
   listView = (ListView) findViewById(R.id.list_one);
//        if(ramram) {
//            final View hder=getLayoutInflater().inflate(R.layout.activity_main,listView,false);
//          hcbox  =(CheckBox)hder.findViewById(R.id.navubox);
//            hcbox.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    for (int d=0;d<count;d++){
//                        sp.put(d,hcbox.isChecked());
//
//                    }
//                    customAdapter
//
//                }
//            });
    ///    }
            CustomAdapter customAdapter = new CustomAdapter(this, dominos, address, imageView, img_veg, img_non_veg);
            listView.setAdapter(customAdapter);


            AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {



                @Override
                public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                   CheckBox chk = (CheckBox) findViewById(checkBox);
                  //  int checkedItemCount = getCheckedItemCount();
//                    if (listView.getCount() == checkedItemCount)
//                        chk.setChecked(true);
//                    else
//                        chk.setChecked(false);
                }
            };
//

//




    }

//
//    private int getCheckedItemCount(){
//        int cnt = 0;
//        SparseBooleanArray positions = listView.getCheckedItemPositions();
//        int itemCount = listView.getCount();
//
//        for(int i=0;i<itemCount;i++){
//            if(positions.get(i))
//                cnt++;
//        }
//        return cnt;
//    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();

        } else if (id == R.id.action_refresh) {
           // CheckBox checkBox=(CheckBox)findViewById(R.id.checkBox);

       //     checkBox.is();
        //finish();
        }
        return super.onOptionsItemSelected(item);


//       int trademarks[] =new int[]{R.drawable.veg,R.drawable.veg_non_veg_con_02};
//        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.dj);
//       for(int i = 0 ; i < trademarks.length; i++){
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT,1.0f);
//            ImageView imageView = new ImageView(this);
//            imageView.setLayoutParams(params);
//            imageView.setImageResource(trademarks[i]);
//            linearLayout.addView(imageView);
//        }


    }}