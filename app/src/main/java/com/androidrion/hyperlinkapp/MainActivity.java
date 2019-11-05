package com.androidrion.hyperlinkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spanned spanned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.hyperLink);
        spanned = Html.fromHtml("Jangan lupa untuk kunjungi blog <a href='https://androidrion.com'>androidrion.com</a>");

        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spanned);
        textView.setLinkTextColor(getResources().getColor(R.color.colorPrimary));
    }
}
