package com.example.w_mvvm_recyclerview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    private TextView txtName, txtAge, txtAddr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();
    }

    private void init() {
        txtName = findViewById(R.id.txtName);
        txtAge = findViewById(R.id.txtAge);
        txtAddr = findViewById(R.id.txtAddr);

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mainViewModel.getUsers().observe(this, new Observer<List<User>>() {
            @Override
            public void onChanged(List<User> users) {
                Log.v("hank", "onChanged");
                for (User u : users) {
                    txtName.setText(u.getName());
                    txtAge.setText(u.getAge());
                    txtAddr.setText(u.getAdder());
                }
            }
        });
    }
}
