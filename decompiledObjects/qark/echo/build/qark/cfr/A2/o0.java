/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  java.lang.String
 */
package A2;

import A2.q0;
import H2.a;
import M2.a;
import android.os.IBinder;
import android.os.Parcel;

public final class o0
extends a
implements q0 {
    public o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override
    public final int c() {
        Parcel parcel = this.n(2, this.o());
        int n8 = parcel.readInt();
        parcel.recycle();
        return n8;
    }

    @Override
    public final H2.a d() {
        Parcel parcel = this.n(1, this.o());
        H2.a a8 = a.a.o(parcel.readStrongBinder());
        parcel.recycle();
        return a8;
    }
}

