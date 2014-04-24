package com.cbsb.android.easytimer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import net.cbsb.android.easytimer.R;

public class About extends Activity implements OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

    }

    public void onClick(View v) {
        switch (v.getId()) {

        }
    }

    private void openProjectUrlInBrowser() {
        Uri uri = Uri.parse(getString(R.string.about_project_url));
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
