package toong.vn.androidfloatconstantxml;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        float floatValueFromDimen = AppUtils.getFloatResource(this, R.dimen.my_dimen_float_value);
        float floatValueFromInteger = AppUtils.getFloatResource(this, R.integer.my_integer_float_value);

        Log.i("TAG", "floatValueFromDimen: " + floatValueFromDimen);
        Log.i("TAG", "floatValueFromFromInteger: " + floatValueFromInteger);

        /**
         * Output
         * TAG: floatValueFromDimen: 0.1
         * TAG: floatValueFromFromInteger: 0.5
         */
    }

    private void getFloatFromDimen() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.my_dimen_float_value, typedValue, true);
        float floatValueFromDimen = typedValue.getFloat();
        Log.i("TAG", "floatValueFromDimen: " + floatValueFromDimen);
    }

    private void getFloatFromInteger() {
        TypedValue typedValue2 = new TypedValue();
        getResources().getValue(R.integer.my_integer_float_value, typedValue2, true);
        float floatValueFromInteger = typedValue2.getFloat();
        Log.i("TAG", "floatValueFromFromInteger: " + floatValueFromInteger);
    }
}
