package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nhapa, nhapb;
    TextView ketqua;
    Button tinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nhapa = (EditText) findViewById(R.id.et_a);
        nhapb = (EditText) findViewById(R.id.et_b);
        ketqua = (TextView) findViewById(R.id.tv_ketqua);
        tinh = (Button) findViewById(R.id.btn_tinh);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String soa = nhapa.getText().toString().trim();
                String sob = nhapb.getText().toString().trim();
                Double a = 0.0;
                Double b = 0.0;
                try{
                    a = Double.parseDouble(soa);
                    b = Double.parseDouble(sob);
                    Double cong = (a + b);
                    Double tru = (a - b);
                    Double nhan = (a * b);
                    Double chia = (a / b);
                    String chuoi = "Phép cộng a và b bằng: " + cong
                            + "\nPhép trừ a và b bằng: " + tru
                            + "\nPhép nhân a và b bằng: " + nhan
                            + "\nPhép chia a và b bằng: " + chia;
                    ketqua.setText(chuoi);

                }catch (NumberFormatException e) {
                    ketqua.setText(e.getMessage());
                }
            }
        });
    }
}