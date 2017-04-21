package com.thethoughtfield.ad340;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() method started");
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() method started");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() method started");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() method started");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() method started");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() method started");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() method started");
    }
    /** Called when the user taps the What's Up button */
    public void sendMessage(View view) {
        // The Intent constructor takes two parameters
        // A Context as its first parm (this is used because the Activity class is a subclass of Context
        //The Class of the app component to which the system should deliver the Intent
        //   (in this case, the activity that shoulc be started)

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        // The putExtra method add the EditText's value to the intent.
        // An intent can carry data types as key-value pairs called extras.
        // key is a public constant EXTRA_MESSAGE because the next activity uses the key to retrieve
        // the text value.
        // Note:  good practice to define keys for intent extras using app's package name as a prefix
        // to ensure the keys are unique in case this app interacts with other apps.
        intent.putExtra(EXTRA_MESSAGE, message);

        // The startActivity() method starts an instance of the DisplayMessageActivity specified by the intent
        startActivity(intent);
    }
}
