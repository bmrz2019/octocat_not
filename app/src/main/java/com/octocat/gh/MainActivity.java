package com.octocat.gh;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends Activity {


    Intent intent = new Intent();

    @Override
    public void onCreate(Bundle savedInstanceState) {
//        intent.setAction(android.settings.INTERNAL_STORAGE_SETTINGS);

        intent.setAction(Intent.ACTION_VIEW);
        intent.setType("*/*");
        intent.setClassName("com.gh4a", "com.gh4a.activities.Github4AndroidActivity");
//        intent.setClassName("com.android.octocat", "com.android.octocat.files.FilesActivity");
//        intent.setClassName("com.android.octocat", "com.android.octocat.ScopedAccessActivity");
        startActivity(intent);

        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        }

        finish();
        super.onCreate(savedInstanceState);
    }

}
