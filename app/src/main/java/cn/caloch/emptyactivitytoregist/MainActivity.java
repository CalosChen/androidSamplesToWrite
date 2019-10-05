package cn.caloch.emptyactivitytoregist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_username = findViewById(R.id.et_name);
        et_password = findViewById(R.id.et_password);
    }

    public void regist_click(View view) {
        et_username.setText(et_password.getText().toString());
        Intent it_navToFull = new Intent(this, SwipeDownToRefreshListView.class);
        it_navToFull.putExtra("name", et_username.getText().toString().trim());
        it_navToFull.putExtra("password", et_password.getText().toString().trim());
        startActivity(it_navToFull);
    }
}
