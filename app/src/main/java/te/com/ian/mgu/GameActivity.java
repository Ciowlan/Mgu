package te.com.ian.mgu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Intent it = getIntent();
        String user = it.getStringExtra("user");
        int stage = it.getIntExtra("stage", 0);
        String role = it.getStringExtra("role");
        Log.v("GameActivity",user+","+stage+","+role);

    }
}