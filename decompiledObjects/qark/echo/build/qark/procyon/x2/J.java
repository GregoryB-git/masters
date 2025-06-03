// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import B2.c;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import H2.b;
import A2.p0;
import android.os.IBinder;
import android.os.Parcelable$Creator;
import B2.a;

public final class J extends a
{
    public static final Parcelable$Creator<J> CREATOR;
    public final String o;
    public final A p;
    public final boolean q;
    public final boolean r;
    
    static {
        CREATOR = (Parcelable$Creator)new K();
    }
    
    public J(final String o, final IBinder binder, final boolean q, final boolean r) {
        this.o = o;
        final A a = null;
        A p4;
        if (binder == null) {
            p4 = a;
        }
        else {
            try {
                final H2.a d = p0.o(binder).d();
                byte[] array;
                if (d == null) {
                    array = null;
                }
                else {
                    array = (byte[])b.v(d);
                }
                if (array != null) {
                    p4 = new B(array);
                }
                else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                    p4 = a;
                }
            }
            catch (RemoteException ex) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", (Throwable)ex);
                p4 = a;
            }
        }
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public J(final String o, final A p4, final boolean q, final boolean r) {
        this.o = o;
        this.p = p4;
        this.q = q;
        this.r = r;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        Object p2;
        if ((p2 = this.p) == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            p2 = null;
        }
        c.h(parcel, 2, (IBinder)p2, false);
        c.c(parcel, 3, this.q);
        c.c(parcel, 4, this.r);
        c.b(parcel, a);
    }
}
