package te.com.ian.mgu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatEditText ed_user,ed_password;
    String user,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_user = findViewById(R.id.user);
        ed_password = findViewById(R.id.password);
    }

    public void login(View view) {
        user = ed_user.getText().toString();
        password = ed_password.getText().toString();
        Log.v("MainActivity",user+","+password);
        if (ed_user.getText().toString().equals("Jacky")
                && ed_password.getText().toString().equals("12345678")){
        Intent it = new Intent(this,GameActivity.class);
        it.putExtra("user","魔關羽");
        it.putExtra("stage",2);
        it.putExtra("role",user);
        startActivity(it);
        }
        else{
            Toast.makeText(this,"帳密錯誤", Toast.LENGTH_LONG).show();
        }
    }
}