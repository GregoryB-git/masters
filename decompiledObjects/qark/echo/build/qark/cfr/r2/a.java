/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package r2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b2.b;
import b2.c;

public interface a
extends IInterface {
    public Bundle P(Bundle var1);

    public static abstract class r2.a$a
    extends b
    implements r2.a {
        public static r2.a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (iInterface instanceof r2.a) {
                return (r2.a)iInterface;
            }
            return new a(iBinder);
        }

        public static class a
        extends b2.a
        implements r2.a {
            public a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override
            public final Bundle P(Bundle bundle) {
                Parcel parcel = this.n();
                c.b(parcel, (Parcelable)bundle);
                bundle = this.o(parcel);
                parcel = (Bundle)c.a((Parcel)bundle, Bundle.CREATOR);
                bundle.recycle();
                return parcel;
            }
        }

    }

}

