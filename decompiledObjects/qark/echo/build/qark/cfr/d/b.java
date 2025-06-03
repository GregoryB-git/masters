/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package d;

import android.content.Context;
import android.content.Intent;
import d.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b
extends a {
    public static Intent e(String[] arrstring) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arrstring);
    }

    public Intent d(Context context, String[] arrstring) {
        return b.e(arrstring);
    }

    public a.a f(Context context, String[] arrstring) {
        if (arrstring != null && arrstring.length != 0) {
            t.a a8 = new t.a();
            int n8 = arrstring.length;
            boolean bl = true;
            for (int i8 = 0; i8 < n8; ++i8) {
                String string2 = arrstring[i8];
                boolean bl2 = x.a.a(context, string2) == 0;
                a8.put((Object)string2, (Object)bl2);
                if (bl2) continue;
                bl = false;
            }
            if (bl) {
                return new a.a(a8);
            }
            return null;
        }
        return new a.a((Object)Collections.emptyMap());
    }

    public Map g(int n8, Intent arrn) {
        if (n8 != -1) {
            return Collections.emptyMap();
        }
        if (arrn == null) {
            return Collections.emptyMap();
        }
        String[] arrstring = arrn.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        if ((arrn = arrn.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS")) != null && arrstring != null) {
            HashMap hashMap = new HashMap();
            int n9 = arrstring.length;
            for (n8 = 0; n8 < n9; ++n8) {
                String string2 = arrstring[n8];
                boolean bl = arrn[n8] == 0;
                hashMap.put((Object)string2, (Object)bl);
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}

