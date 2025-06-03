/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  java.lang.Object
 *  java.lang.String
 */
package w;

import android.os.Bundle;
import android.os.IBinder;

public abstract class d {
    public static IBinder a(Bundle bundle, String string2) {
        return a.a(bundle, string2);
    }

    public static void b(Bundle bundle, String string2, IBinder iBinder) {
        a.b(bundle, string2, iBinder);
    }

    public static abstract class a {
        public static IBinder a(Bundle bundle, String string2) {
            return bundle.getBinder(string2);
        }

        public static void b(Bundle bundle, String string2, IBinder iBinder) {
            bundle.putBinder(string2, iBinder);
        }
    }

}

