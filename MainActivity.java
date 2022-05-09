package com.example.aniket_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b7,b6,b8,b9,b0,bp,bm,bmu,bd,bc,be;
    EditText edit1;
    float mvalueone,mvaluetwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        b0=(Button) findViewById(R.id.b0);
        bp=(Button) findViewById(R.id.bp);
        bm=(Button) findViewById(R.id.bm);
        bmu=(Button) findViewById(R.id.bmu);
        bd=(Button) findViewById(R.id.bd);
        bc=(Button) findViewById(R.id.bc);
        be=(Button) findViewById(R.id.be);
        edit1=(EditText) findViewById(R.id.edit1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"9");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"+");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"-");
            }
        });
        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"*");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText(edit1.getText()+"/");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = edit1.getText().toString();
                String op1= "";
                String op2="";
                String operator="/*-+";
                int n= t.length();
                int flag=0;
                String oper="";
                for(int i = 0 ;i<n;i++)
                {

                    int skip=0;
                    for(int j=0;j<4;j++)
                    {
                        if(t.charAt(i)==operator.charAt(j))
                        {
                            oper+=t.charAt(i)+"";
                            flag=1;
                            skip=1;
                        }
                    }
                    if(skip==1) {
                        continue;
                    }
                    if(flag==0) {
                        op1+=(t.charAt(i)+"");
                    }
                    else {
                        op2 += (t.charAt(i) + "");
                    }

                }
                int res1=0;
                res1= Integer.parseInt(op1);
                int res2 = Integer.parseInt((op2));
                if(oper.equals("+"))
                {
                    res1= (res1+res2);
                }
                else if (oper.equals("-"))
                {
                    res1=(res1-res2);
                }
                else if(oper.equals("/"))
                {
                    res1=(res1/res2);
                }
                else
                {
                    res1= ( res1*res2);
                }
                String ansstr="";
                ansstr= res1+"";
                edit1.setText(ansstr);
            }
        });



    }
}
