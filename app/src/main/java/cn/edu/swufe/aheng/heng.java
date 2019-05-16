package cn.edu.swufe.aheng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class heng extends AppCompatActivity implements View.OnClickListener {
    TextView out;
    String str="0";
    Button button;
    Double flo1=0.00;
    String flo2;
    EditText inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heng);
        out = findViewById(R.id.txtout);
        button = findViewById(R.id.btn);
        button.setText("转换为华氏度");
        button.setOnClickListener(this);
        inp = findViewById(R.id.inp);
    }

    @Override
    public void onClick(View v) {
        try{
            DecimalFormat df = new DecimalFormat( "0.00");
            str = inp.getText().toString();
            flo1=(Double.parseDouble(str)*9)/5+32;
            flo2=df.format(flo1);
            Log.i("idla","idlaa");
            out.setText(flo2+"华氏度");
        }
        catch (Exception e){
            out.setText("请输入正确格式的温度");
        }

    }
}
