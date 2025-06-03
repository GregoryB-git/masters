/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  java.lang.Object
 *  java.lang.String
 */
package H2;

import H2.c;
import M2.b;
import android.os.IBinder;
import android.os.IInterface;

public interface a
extends IInterface {

    public static abstract class a
    extends b
    implements a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iInterface instanceof a) {
                return (a)iInterface;
            }
            return new c(iBinder);
        }
    }

}

