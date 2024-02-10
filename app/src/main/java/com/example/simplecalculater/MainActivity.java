package com.example.simplecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

import com.example.simplecalculater.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    double number,number2;
    char operation= ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("1");

            }
        });

        binding.but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            binding.textView.append("2");
            }
        });

        binding.but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("3");

            }
        });


        binding.but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("4");

            }
        });


        binding.but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("5");

            }
        });

        binding.but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("6");

            }
        });

        binding.but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("7");


            }
        });

        binding.but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("8");
            }
        });

        binding.but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("9");
            }
        });

        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.textView.append("9");

            }
        });
        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1=binding.textView.getText().toString();
                     number=Double.parseDouble(s1);

                     binding.textView.setText(" ");
                    binding.textView2.setText(String.valueOf(number));

                     operation='+';
                    binding.textView3.setText(String.valueOf(operation));



                }
            }
        });

        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1=binding.textView.getText().toString();
                    number=Double.parseDouble(s1);
                    binding.textView.setText(" ");
                    binding.textView2.setText(String.valueOf(number));
                    operation='-';
                    binding.textView2.setText(String.valueOf(number));




                }
            }
        });

        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1=binding.textView.getText().toString();
                    number=Double.parseDouble(s1);
                    binding.textView.setText(" ");
                    binding.textView2.setText(String.valueOf(number));
                    operation='*';
                    binding.textView2.setText(String.valueOf(number));




                }
            }
        });
        binding.division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1=binding.textView.getText().toString();
                    number=Double.parseDouble(s1);
                    binding.textView.setText(" ");
                    binding.textView2.setText(String.valueOf(number));

                    operation='/';
                    binding.textView2.setText(String.valueOf(number));




                }
            }
        });


        binding.clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operation=' ';
                binding.textView.setText(" ");
                binding.textView3.setText(String.valueOf(operation));
            }
        });

        binding.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (binding.textView.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Enter Number", Toast.LENGTH_SHORT).show();
                }
                else{
                    String s1=binding.textView.getText().toString();
                    number2=Double.parseDouble(s1);
                    if (operation=='+'){
                        binding.textView2.setText(String.valueOf(number+number2));

                    }
                    if  (operation=='-'){
                        binding.textView2.setText(String.valueOf(number-number2));

                    }
                    if  (operation=='*'){
                        binding.textView2.setText(String.valueOf(number*number2));

                    }
                    if  (operation=='/'){
                        binding.textView2.setText(String.valueOf(number/number2));

                    }







                }
            }
        });




    }
}