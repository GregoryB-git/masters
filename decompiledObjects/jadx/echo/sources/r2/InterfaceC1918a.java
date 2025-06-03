package r2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import b2.AbstractBinderC0790b;
import b2.AbstractC0789a;
import b2.AbstractC0791c;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1918a extends IInterface {

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0258a extends AbstractBinderC0790b implements InterfaceC1918a {

        /* renamed from: r2.a$a$a, reason: collision with other inner class name */
        public static class C0259a extends AbstractC0789a implements InterfaceC1918a {
            public C0259a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override // r2.InterfaceC1918a
            public final Bundle P(Bundle bundle) {
                Parcel n7 = n();
                AbstractC0791c.b(n7, bundle);
                Parcel o7 = o(n7);
                Bundle bundle2 = (Bundle) AbstractC0791c.a(o7, Bundle.CREATOR);
                o7.recycle();
                return bundle2;
            }
        }

        public static InterfaceC1918a n(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return queryLocalInterface instanceof InterfaceC1918a ? (InterfaceC1918a) queryLocalInterface : new C0259a(iBinder);
        }
    }

    Bundle P(Bundle bundle);
}
