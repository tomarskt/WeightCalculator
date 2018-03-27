package com.morticia.android.applicationproj;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.HashMap;

/**
 * Created by Morticia on 3/22/18.
 */

public class WeightStack {

    int quantity = 0;
    TextView displayAmnt;
    LinearLayout linearLayout;
    ImageView weightImage;
    public String weight;

    int imageResource;

    public WeightStack(int quantity, TextView textView, LinearLayout linearLayout, ImageView img, String weight, int imageResource){
        this.quantity = quantity;
        this.displayAmnt = textView;
        this.linearLayout = linearLayout;
        this.weightImage = img;
        this.weight = weight;
        this.imageResource = imageResource;

        checkPlates();
    }

    private void checkPlates(){
        if(quantity==0){
            this.linearLayout.removeAllViews();
            this.linearLayout.setVisibility(View.GONE);
        }else{
            this.displayAmnt.setText(Integer.toString(this.quantity));
        }
        setPhoto();
    }

    private void setPhoto(){
        weightImage.setImageResource(imageResource);
    }

    public void setTypeFace(Context context){
        FontUtil.setNoType(displayAmnt, context);
    }


}
