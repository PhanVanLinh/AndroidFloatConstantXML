package toong.vn.androidfloatconstantxml;

import android.content.Context;
import android.support.annotation.AnyRes;
import android.util.TypedValue;

/**
 * Created by PhanVanLinh on 17/01/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class AppUtils {

    public static float getFloatResource(Context context, @AnyRes int id){
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(id, typedValue, true);
        return typedValue.getFloat();
    }
}
