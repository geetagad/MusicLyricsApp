package com.example.musiclyricsapp;

import com.example.musiclyricsapp.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class LyricsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lyrics);
    }


    public void onButtonClick(View view)
    {
        switch (view.getId()){

            case  R.id.RedButton :
                Toast.makeText(this, "Doe, a deer, a female deer", Toast.LENGTH_SHORT).show();
                break;

            case R.id.OrangeButton:
                Toast.makeText(this, "Ray, a drop of golden sun", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.YellowButton :
                Toast.makeText(this, "Me, a name I call myself", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.GreenButton :
                Toast.makeText(this, "Far, a long long way to run", Toast.LENGTH_SHORT).show();
                break;

            case R.id.BlueButton:
                Toast.makeText(this, "Sew, a needle pulling thread", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.IndigoButton :
                Toast.makeText(this, "La, a note to follow sew", Toast.LENGTH_SHORT).show();
                break;

            case  R.id.VioletButton :
                Toast.makeText(this, "Tea, I drink with jam and bread", Toast.LENGTH_SHORT).show();
                break;
        }


    }


}
