package hue.com.event;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editNumberA;
    private EditText editNumberB;
    private Button btnAdd;
    private TextView result;
    private int numberA, numberB, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNumberA = (EditText) findViewById(R.id.edit_numberA);
        editNumberB = (EditText) findViewById(R.id.edit_numberB);
        btnAdd = (Button) findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        result = (TextView) findViewById(R.id.text_result);
        switch (view.getId()) {
            case (R.id.btn_add):
                if (!editNumberA.getText().toString().isEmpty() && !editNumberB.getText().toString().isEmpty()) {
                    numberA = (Integer.parseInt(editNumberA.getText().toString()));
                    numberB = (Integer.parseInt(editNumberB.getText().toString()));
                    sum = numberA + numberB;
                    result.setText(sum + "");

                } else {
                    result.setText("vui lòng nhập số ");
                }
                break;
            default:
                break;

        }
    }

}

