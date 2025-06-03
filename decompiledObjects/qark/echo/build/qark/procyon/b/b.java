// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b;

import android.os.IInterface;
import android.os.RemoteException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Handler;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class b implements Parcelable
{
    public static final Parcelable$Creator<b> CREATOR;
    public final boolean o;
    public final Handler p;
    public a q;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator() {
            public b a(final Parcel parcel) {
                return new b(parcel);
            }
            
            public b[] b(final int n) {
                return new b[n];
            }
        };
    }
    
    public b(final Parcel parcel) {
        this.o = false;
        this.p = null;
        this.q = a.a.n(parcel.readStrongBinder());
    }
    
    public void a(final int n, final Bundle bundle) {
    }
    
    public void b(final int n, final Bundle bundle) {
        if (this.o) {
            final Handler p2 = this.p;
            if (p2 != null) {
                p2.post((Runnable)new c(n, bundle));
                return;
            }
            this.a(n, bundle);
        }
        else {
            final a q = this.q;
            if (q == null) {
                return;
            }
            try {
                q.T0(n, bundle);
            }
            catch (RemoteException ex) {}
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        // monitorenter(this)
        while (true) {
            try {
                if (this.q == null) {
                    this.q = new b();
                }
                parcel.writeStrongBinder(((IInterface)this.q).asBinder());
                // monitorexit(this)
                return;
                // monitorexit(this)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public class b extends a.a
    {
        public void T0(final int n, final Bundle bundle) {
            final b.b b = b.b.this;
            final Handler p2 = b.p;
            if (p2 != null) {
                p2.post((Runnable)b.new c(n, bundle));
                return;
            }
            b.a(n, bundle);
        }
    }
    
    public class c implements Runnable
    {
        public final int o;
        public final Bundle p;
        
        public c(final int o, final Bundle p3) {
            this.o = o;
            this.p = p3;
        }
        
        @Override
        public void run() {
            b.this.a(this.o, this.p);
        }
    }
}
