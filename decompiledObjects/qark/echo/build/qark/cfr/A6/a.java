/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package A6;

import A5.a;
import E5.c;
import E5.j;
import E5.k;
import android.os.Build;

public class a
implements A5.a,
k.c {
    public k a;

    @Override
    public void onAttachedToEngine(a.b object) {
        this.a = object = new k(object.b(), "flutter_native_splash");
        object.e(this);
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.a.e(null);
    }

    @Override
    public void onMethodCall(j j8, k.d d8) {
        if (j8.a.equals((Object)"getPlatformVersion")) {
            j8 = new StringBuilder();
            j8.append("Android ");
            j8.append(Build.VERSION.RELEASE);
            d8.a(j8.toString());
            return;
        }
        d8.c();
    }
}

