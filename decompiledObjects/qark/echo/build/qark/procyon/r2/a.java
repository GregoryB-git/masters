// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r2;

import android.os.Parcel;
import android.os.Parcelable;
import b2.c;
import android.os.IBinder;
import b2.b;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    Bundle P(final Bundle p0);
    
    public abstract static class a extends b implements a
    {
        public static a n(final IBinder binder) {
            if (binder == null) {
                return null;
            }
            final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof a) {
                return (a)queryLocalInterface;
            }
            return new a(binder);
        }
        
        public static class a extends b2.a implements r2.a
        {
            public a(final IBinder binder) {
                super(binder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }
            
            @Override
            public final Bundle P(final Bundle bundle) {
                final Parcel n = this.n();
                b2.c.b(n, (Parcelable)bundle);
                final Parcel o = this.o(n);
                final Bundle bundle2 = (Bundle)b2.c.a(o, Bundle.CREATOR);
                o.recycle();
                return bundle2;
            }
        }
    }
}
