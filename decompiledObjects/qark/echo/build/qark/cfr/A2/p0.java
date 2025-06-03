/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import A2.o0;
import A2.q0;
import H2.a;
import M2.b;
import M2.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class p0
extends b
implements q0 {
    public p0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static q0 o(IBinder iBinder) {
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (iInterface instanceof q0) {
            return (q0)iInterface;
        }
        return new o0(iBinder);
    }

    @Override
    public final boolean n(int n8, Parcel object, Parcel parcel, int n9) {
        if (n8 != 1) {
            if (n8 != 2) {
                return false;
            }
            n8 = this.c();
            parcel.writeNoException();
            parcel.writeInt(n8);
            return true;
        }
        object = this.d();
        parcel.writeNoException();
        c.e(parcel, (IInterface)object);
        return true;
    }
}

