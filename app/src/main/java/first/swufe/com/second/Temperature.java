package first.swufe.com.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity implements View.OnClickListener {

    float ss;
    Double res;
    EditText edit;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        edit = findViewById(R.id.inpTxt);
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
        out = findViewById(R.id.txt);
    }

    @Override
    public void onClick(View v) {
        String str = edit.getText().toString();
        if(str.matches("[a-zA-Z|_]")) {
            out.setText("请输入阿拉伯数字！");
        }
        else{
            ss = Float.valueOf(str);
            res = ss * 33.8 * 1.0000;
            String aa = res.toString();
            //out.setText(aa);
            out.setText(String.format("%.2f", aa));
        }

    }
}
