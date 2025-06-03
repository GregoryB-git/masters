// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.IBinder;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import M2.c;
import android.os.Parcel;
import M2.b;

public abstract class L extends b implements j
{
    public L() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    @Override
    public final boolean n(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    return false;
                }
                n = parcel.readInt();
                final IBinder strongBinder = parcel.readStrongBinder();
                final a0 a0 = (a0)c.a(parcel, A2.a0.CREATOR);
                c.b(parcel);
                this.F0(n, strongBinder, a0);
            }
            else {
                n = parcel.readInt();
                final Bundle bundle = (Bundle)c.a(parcel, Bundle.CREATOR);
                c.b(parcel);
                this.q0(n, bundle);
            }
        }
        else {
            n = parcel.readInt();
            final IBinder strongBinder2 = parcel.readStrongBinder();
            final Bundle bundle2 = (Bundle)c.a(parcel, Bundle.CREATOR);
            c.b(parcel);
            this.W0(n, strongBinder2, bundle2);
        }
        parcel2.writeNoException();
        return true;
    }
}
