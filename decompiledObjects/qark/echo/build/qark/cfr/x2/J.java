/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package x2;

import A2.p0;
import B2.a;
import B2.c;
import H2.b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import x2.A;
import x2.B;
import x2.K;

public final class J
extends a {
    public static final Parcelable.Creator<J> CREATOR = new K();
    public final String o;
    public final A p;
    public final boolean q;
    public final boolean r;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public J(String object, IBinder iBinder, boolean bl, boolean bl2) {
        block6 : {
            this.o = object;
            Object var5_6 = null;
            if (iBinder == null) {
                object = var5_6;
            } else {
                object = p0.o(iBinder).d();
                object = object == null ? null : (byte[])b.v((H2.a)object);
                if (object != null) {
                    object = new B((byte[])object);
                } else {
                    Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate");
                    object = var5_6;
                }
            }
            break block6;
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificatesQuery", (String)"Could not unwrap certificate", (Throwable)remoteException);
                object = var5_6;
            }
        }
        this.p = object;
        this.q = bl;
        this.r = bl2;
    }

    public J(String string2, A a8, boolean bl, boolean bl2) {
        this.o = string2;
        this.p = a8;
        this.q = bl;
        this.r = bl2;
    }

    public final void writeToParcel(Parcel parcel, int n8) {
        A a8;
        n8 = c.a(parcel);
        c.n(parcel, 1, this.o, false);
        A a9 = a8 = this.p;
        if (a8 == null) {
            Log.w((String)"GoogleCertificatesQuery", (String)"certificate binder is null");
            a9 = null;
        }
        c.h(parcel, 2, (IBinder)a9, false);
        c.c(parcel, 3, this.q);
        c.c(parcel, 4, this.r);
        c.b(parcel, n8);
    }
}

