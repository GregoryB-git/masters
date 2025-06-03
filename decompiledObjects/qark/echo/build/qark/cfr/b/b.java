/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 */
package b;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import b.a;

public class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n8) {
            return new b[n8];
        }
    };
    public final boolean o = false;
    public final Handler p = null;
    public a q;

    public b(Parcel parcel) {
        this.q = a.a.n(parcel.readStrongBinder());
    }

    public void a(int n8, Bundle bundle) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void b(int n8, Bundle bundle) {
        if (this.o) {
            Handler handler = this.p;
            if (handler != null) {
                handler.post((Runnable)new c(n8, bundle));
                return;
            }
            this.a(n8, bundle);
            return;
        }
        a a8 = this.q;
        if (a8 == null) return;
        try {
            a8.T0(n8, bundle);
            return;
        }
        catch (RemoteException remoteException) {
            return;
        }
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n8) {
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new b();
                }
                parcel.writeStrongBinder(this.q.asBinder());
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public class b
    extends a.a {
        @Override
        public void T0(int n8, Bundle bundle) {
            b b8 = b.this;
            Handler handler = b8.p;
            if (handler != null) {
                handler.post((Runnable)b8.new c(n8, bundle));
                return;
            }
            b8.a(n8, bundle);
        }
    }

    public class c
    implements Runnable {
        public final int o;
        public final Bundle p;

        public c(int n8, Bundle bundle) {
            this.o = n8;
            this.p = bundle;
        }

        public void run() {
            b.this.a(this.o, this.p);
        }
    }

}

