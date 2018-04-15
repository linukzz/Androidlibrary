 package bear.coding.scientificcalculator;

 import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button zero = (Button)findViewById(R.id.zero);
        final Button one = (Button)findViewById(R.id.one);
        final Button two = (Button)findViewById(R.id.two);
        final Button three = (Button)findViewById(R.id.three);
        final Button four = (Button)findViewById(R.id.four);
        final Button five = (Button)findViewById(R.id.five);
        final Button six = (Button)findViewById(R.id.six);
        final Button seven = (Button)findViewById(R.id.seven);
        final Button eight = (Button)findViewById(R.id.eight);
        final Button nine = (Button)findViewById(R.id.nine);


        final Button plus = (Button)findViewById(R.id.plus);
        final Button minus = (Button)findViewById(R.id.minus);
        final Button div = (Button)findViewById(R.id.div);
        final Button mul = (Button)findViewById(R.id.mul);


        final Button cos = (Button)findViewById(R.id.cos);
        final Button sin = (Button)findViewById(R.id.sin);
        final Button tan = (Button)findViewById(R.id.tan);
        final Button AC = (Button)findViewById(R.id.AC);
        final Button root = (Button)findViewById(R.id.root);
        final Button log = (Button)findViewById(R.id.log);


        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), ((Button) v).getText(), Toast.LENGTH_SHORT).show();
                String text ="";
            }
        };
    }
}
