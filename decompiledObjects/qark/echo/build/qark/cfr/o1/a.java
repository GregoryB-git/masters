/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package o1;

import android.os.Build;

public final class a {
    public static final a a = new a();

    public final int a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return a.a.a();
        }
        return 0;
    }

    public static final class a {
        public static final a a = new a();

        public final int a() {
            return E.a.a(1000000);
        }
    }

}

