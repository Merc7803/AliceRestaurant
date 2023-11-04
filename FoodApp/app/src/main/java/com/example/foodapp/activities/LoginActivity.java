package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodapp.MainActivity;
import com.example.foodapp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegistrationActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void handleLogin(View view) {
        // Đọc dữ liệu từ EditText
        EditText emailEditText = findViewById(R.id.editText2);
        EditText passwordEditText = findViewById(R.id.editText3);
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Kiểm tra thông tin đăng nhập
        // Bạn cần thực hiện việc xác thực thông tin đăng nhập ở đây
        if (1 == 1) {
            // Nếu đăng nhập thành công, chuyển sang MainActivity
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        } else {
            // Hiển thị thông báo lỗi đăng nhập
            Toast.makeText(LoginActivity.this, "Thông tin đăng nhập không hợp lệ", Toast.LENGTH_SHORT).show();
        }
    }
}