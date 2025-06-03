/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.String
 */
package A2;

import A2.a0;
import A2.j;
import M2.b;
import M2.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class L
extends b
implements j {
    public L() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override
    public final boolean n(int n8, Parcel parcel, Parcel parcel2, int n9) {
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    return false;
                }
                n8 = parcel.readInt();
                IBinder iBinder = parcel.readStrongBinder();
                a0 a02 = (a0)c.a(parcel, a0.CREATOR);
                c.b(parcel);
                this.F0(n8, iBinder, a02);
            } else {
                n8 = parcel.readInt();
                Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                this.q0(n8, bundle);
            }
        } else {
            n8 = parcel.readInt();
            IBinder iBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            this.W0(n8, iBinder, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}

