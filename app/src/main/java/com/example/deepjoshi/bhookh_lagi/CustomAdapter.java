 package com.example.deepjoshi.bhookh_lagi;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

import static android.R.attr.animation;
import static android.R.attr.drawable;
import static com.example.deepjoshi.bhookh_lagi.R.id.activity_main;
import static com.example.deepjoshi.bhookh_lagi.R.id.checkBox;
import static com.example.deepjoshi.bhookh_lagi.R.id.imageView;



public class CustomAdapter extends ArrayAdapter<String> {

    Context context;
    String[] dominos;
    String[] address;
    //String[] contact={};
    int[] imgDominos;
    int[] imgVeg;
    int[] imgNonVeg;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] dominos, String[] address, int[] imgDominos, int[] imgVeg, int[] imgNonVeg) {
        super(context, R.layout.single_row_layout_view, dominos);
        this.context = context;
        this.dominos = dominos;
        this.address = address;
        // this.contact=contact;
        this.imgDominos = imgDominos;
        this.imgVeg = imgVeg;
        this.imgNonVeg = imgNonVeg;
        inflater = LayoutInflater.from(context);

    }


    public class ViewHolder {

        ImageView imageView;
//        ImageView img_veg;
//        ImageView img_non_veg;
        TextView text_dominos;
        TextView text_address;
        TextView text_contact;
        CheckBox checkBox;
    }

/*    public CustomAdapter(Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public CustomAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    public CustomAdapter(Context context, int resource, int textViewResourceId, String[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public CustomAdapter(Context context, int resource, List<String> objects) {
        super(context, resource, objects);
    }

    public CustomAdapter(Context context, int resource, int textViewResourceId, List<String> objects) {
        super(context, resource, textViewResourceId, objects);
    }*/


    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
ViewHolder holder=null;

//      inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        convertView = inflater.inflate(R.layout.single_row_layout_view, parent, false);
//        TextView td = (TextView) convertView.findViewById(R.id.text_dominos);
//        td.setText(dominos[position]);
//        TextView ta = (TextView) convertView.findViewById(R.id.text_address);
//        ta.setText(address[position]);
//        ImageView id = (ImageView) convertView.findViewById(R.id.imageView);
//        id.setImageResource(imgDominos[position]);

        if (convertView==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.single_row_layout_view, parent, false);

            int trademarks[] = new int[]{R.drawable.veg, R.drawable.veg_non_veg_con_02};
            LinearLayout linearLayout = (LinearLayout) convertView.findViewById(R.id.dj);
            for (int i = 0; i < trademarks.length; i++) {
                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(80, 80);
                ImageView imageView = new ImageView(context);
                imageView.setLayoutParams(params);
                imageView.setImageResource(trademarks[i]);
                linearLayout.addView(imageView);
            }

            holder = new ViewHolder();
            holder.text_dominos = (TextView) convertView.findViewById(R.id.text_dominos);
            holder.text_address = (TextView) convertView.findViewById(R.id.text_address);
            //  holder.text_contact = (TextView) convertView.findViewById(R.id.text_contact);

            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            Picasso.with(context)
                    .load(imgDominos[position])
                    .resize(600, 200)
                    .into(holder.imageView);
            holder.checkBox = (CheckBox) convertView.findViewById(R.id.checkBox);
            holder.checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    Toast.makeText(context, "ram ram", Toast.LENGTH_SHORT).show();
                }
            });

            convertView.setTag(holder);
          //  holder.checkBox.setSelected(true);
        }
        else {

            holder=(ViewHolder)convertView.getTag();
        }
        holder.imageView.setImageResource(imgDominos[position]);
 //holder.text_contact.setText(contact[position]);
    holder.text_address.setText(address[position]);
        holder.text_dominos.setText(dominos[position]);

//        ImageView vg=(ImageView) convertView.findViewById(R.id.img_veg);
//        ImageView ng =(ImageView)convertView.findViewById(R.id.img_non_veg);
//        vg.setImageResource(imgVeg[0]);
//        ng.setImageResource(imgNonVeg[0]);
//        if (convertView==null)
//        {
//
//            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            convertView = inflater.inflate(R.layout.single_row_layout_view,parent,false);
//        }
//

//
////        holder.text_dominos = (TextView) convertView.findViewById(R.id.text_dominos);
////        holder.text_address = (TextView) convertView.findViewById(R.id.text_address);
////      //  holder.text_contact = (TextView) convertView.findViewById(R.id.text_contact);
////        holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
////        holder.img_veg = (ImageView) convertView.findViewById(R.id.img_veg);
////        holder.img_non_veg = (ImageView) convertView.findViewById(R.id.img_non_veg);
////
////        holder.img_veg.setImageResource(imgVeg[position]);
////        holder.img_non_veg.setImageResource(imgNonVeg[position]);
////        holder.imageView.setImageResource(imgDominos[position]);
////       // holder.text_contact.setText(contact[position]);
////        holder.text_address.setText(address[position]);
////        holder.text_dominos.setText(dominos[position]);
//        final CheckBox c =(CheckBox) convertView.findViewById(R.id.checkBox);
// animation = new TranslateAnimation(metrics_.widthPixels / 2, 0, 0, 0);
        //animation = AnimationUtils.loadAnimation(activity, R.anim.your_animation);

       //

//Animation animation = null;
        //animation = new TranslateAnimation(metrics_.widthPixels / 2, 0, 0, 0);
        // animation = AnimationUtils.loadAnimation(context,R.anim.anim);
        // animation.setDuration(400);
        //convertView.startAnimation(animation);
        //animation = null;
//            public void onClick(View v) {
//                if (convertView==null){
//                if(((CheckBox)v).isChecked())
//                   checkBox[position]=true;
//                else
//                    checkBoxState[position]=false;
//            }
//        });}
//

        return convertView;
    }


}
