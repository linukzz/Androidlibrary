 package bear.coding.scientificcalculator;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {

     EditText txtResult;
     String num;
     int value;

     int Division = 1;
     int Plus = 2;
     int Multi = 3;
     int Minus = 4;
     int Cos = 5;
     int Sin = 6;
     int Tan = 7;
     int LOG= 8;
     int Root = 9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = "";

        final EditText txtResult = (EditText) findViewById(R.id.txtResult);

        final Button zero = (Button) findViewById(R.id.zero);
        final Button one = (Button) findViewById(R.id.one);
        final Button two = (Button) findViewById(R.id.two);
        final Button three = (Button) findViewById(R.id.three);
        final Button four = (Button) findViewById(R.id.four);
        final Button five = (Button) findViewById(R.id.five);
        final Button six = (Button) findViewById(R.id.six);
        final Button seven = (Button) findViewById(R.id.seven);
        final Button eight = (Button) findViewById(R.id.eight);
        final Button nine = (Button) findViewById(R.id.nine);


        final Button plus = (Button) findViewById(R.id.plus);
        final Button minus = (Button) findViewById(R.id.minus);
        final Button div = (Button) findViewById(R.id.div);
        final Button mul = (Button) findViewById(R.id.mul);
        final Button equal = (Button) findViewById(R.id.equal);


        final Button cos = (Button) findViewById(R.id.cos);
        final Button sin = (Button) findViewById(R.id.sin);
        final Button tan = (Button) findViewById(R.id.tan);
        final Button AC = (Button) findViewById(R.id.AC);
        final Button root = (Button) findViewById(R.id.root);
        final Button log = (Button) findViewById(R.id.log);


       AC.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               num = "";
               txtResult.setText("");
           }
       });


        Button.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.plus:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Plus;
                        Toast.makeText(MainActivity.this, "+", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.minus:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Minus;
                        Toast.makeText(MainActivity.this, "-", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.mul:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Multi;
                        Toast.makeText(MainActivity.this, "×", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.div:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Division;
                        Toast.makeText(MainActivity.this, "÷", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.cos:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Cos;
                        Toast.makeText(MainActivity.this, "cos", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.sin:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Sin;
                        Toast.makeText(MainActivity.this, "sin", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.tan:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Tan;
                        Toast.makeText(MainActivity.this, "tan", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.root:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = Root;
                        Toast.makeText(MainActivity.this, "√", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.log:

                        num = txtResult.getText().toString();
                        txtResult.setText("");
                        value = LOG;
                        Toast.makeText(MainActivity.this, "LOG", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.equal:
                        if (value == Plus) {

                            txtResult.setText("" + (Double.parseDouble(num) +
                                    Double.parseDouble(txtResult.getText().toString())));

                        }

                        else if (value == Minus) {

                            txtResult.setText("" + (Double.parseDouble(num) -
                                    Double.parseDouble(txtResult.getText().toString())));

                        }

                        else if (value == Multi) {

                            txtResult.setText("" + (Double.parseDouble(num) *
                                    Double.parseDouble(txtResult.getText().toString())));

                        }

                        else if (value == Division) {

                            txtResult.setText("" + (Double.parseDouble(num) /
                                    Double.parseDouble(txtResult.getText().toString())));

                        }

                        else if(value == Cos) {

                            txtResult.setText("" + (Double.parseDouble(num)
                                    Double.parseDouble(txtResult.getText().toString()));
                        }

                        else if(value == Sin) {



                        }


                        else if(value == Tan) {



                        }


                        else if(value == Root) {


                        }


                        else if(value == LOG) {


                        }

                        num = txtResult.getText().toString();
                        break;

                }
            }
        };
    }

        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.div :
                    txtResult.setText(txtResult.getText().toString() + 1);
                    break;
                case R.id.plus :
                    txtResult.setText(txtResult.getText().toString() + 2);
                    break;
                case R.id.mul :
                    txtResult.setText(txtResult.getText().toString() + 3);
                    break;
                case R.id.minus :
                    txtResult.setText(txtResult.getText().toString() + 4);
                    break;
                case R.id.cos :
                    txtResult.setText(txtResult.getText().toString() + 5);
                    break;
                case R.id.sin :
                    txtResult.setText(txtResult.getText().toString() + 6);
                    break;
                case R.id.tan :
                    txtResult.setText(txtResult.getText().toString() + 7);
                    break;
                case R.id.log :
                    txtResult.setText(txtResult.getText().toString() + 8);
                    break;
                case R.id.root :
                    txtResult.setText(txtResult.getText().toString() + 9);
                    break;
            }

     }



 }




