package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.foodapp.MainActivity;
import com.example.foodapp.R;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void login(View view) {
        startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
    }

    public void mainActivity(View view) {
        startActivity(new Intent(RegistrationActivity.this, MainActivity.class));
    }

    public void handleRegistration(View view) {
        // Đọc dữ liệu từ EditText
        EditText emailEditText = findViewById(R.id.editText2); // Đảm bảo đặt ID phù hợp trong tệp XML layout
        EditText passwordEditText = findViewById(R.id.editText3); // Đảm bảo đặt ID phù hợp trong tệp XML layout
        String email = emailEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Kiểm tra thông tin đăng ký
        // Bạn cần xử lý thông tin đăng ký ở đây (ví dụ: lưu thông tin vào cơ sở dữ liệu hoặc gọi API đăng ký)
        if (1 == 1) {
            // Nếu đăng ký thành công, chuyển sang LoginActivity
            startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
            finish();
        } else {
            // Hiển thị thông báo lỗi đăng ký
            Toast.makeText(RegistrationActivity.this, "Đăng ký không thành công", Toast.LENGTH_SHORT).show();
        }
    }
}