package com.example.deepamgoel.aboutustemplate;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void web(View view) {
        Uri uri = Uri.parse("https://www.blueorigin.com/");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(intent);
    }

    public void map(View view) {
        Uri gmmIntentUri = Uri.parse("geo:0,0?q=" + Uri.encode(" Blue Origin, 21218 76th Ave S, Kent, WA 98032, USA"));
        Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

        intent.setPackage("com.google.android.apps.maps");

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void facebook(View view) {
        Uri uri = Uri.parse("fb://page/138573820028233");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        intent.setPackage("com.facebook.katana");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://www.facebook.com/138573820028233")));
        }
    }

    public void twitter(View view) {
        Uri uri = Uri.parse("twitter://user?screen_name=blueorigin");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        intent.setPackage("com.twitter.android");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://twitter.com/#!/blueorigiin")));
        }
    }

    public void instagram(View view) {
        Uri uri = Uri.parse("http://instagram.com/_u/blueorigin");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        intent.setPackage("com.instagram.android");

        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://instagram.com/blueorigin")));
        }
    }

}
