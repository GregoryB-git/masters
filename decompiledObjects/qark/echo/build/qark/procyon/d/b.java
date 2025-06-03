// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d;

import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import android.content.Context;
import android.content.Intent;

public final class b extends a
{
    public static Intent e(final String[] array) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array);
    }
    
    public Intent d(final Context context, final String[] array) {
        return e(array);
    }
    
    public a f(final Context context, final String[] array) {
        if (array == null || array.length == 0) {
            return new a(Collections.emptyMap());
        }
        final t.a a = new t.a();
        final int length = array.length;
        int i = 0;
        boolean b = true;
        while (i < length) {
            final String s = array[i];
            final boolean b2 = x.a.a(context, s) == 0;
            a.put(s, b2);
            if (!b2) {
                b = false;
            }
            ++i;
        }
        if (b) {
            return new a(a);
        }
        return null;
    }
    
    public Map g(int i, final Intent intent) {
        if (i != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        final String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra != null && stringArrayExtra != null) {
            final HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
            int length;
            for (length = stringArrayExtra.length, i = 0; i < length; ++i) {
                hashMap.put(stringArrayExtra[i], intArrayExtra[i] == 0);
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}
