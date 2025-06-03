package x2;

import A2.p0;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: x2.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2180J extends B2.a {
    public static final Parcelable.Creator<C2180J> CREATOR = new C2181K();

    /* renamed from: o, reason: collision with root package name */
    public final String f21155o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractBinderC2171A f21156p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f21157q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f21158r;

    public C2180J(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f21155o = str;
        BinderC2172B binderC2172B = null;
        if (iBinder != null) {
            try {
                H2.a d7 = p0.o(iBinder).d();
                byte[] bArr = d7 == null ? null : (byte[]) H2.b.v(d7);
                if (bArr != null) {
                    binderC2172B = new BinderC2172B(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e7) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e7);
            }
        }
        this.f21156p = binderC2172B;
        this.f21157q = z7;
        this.f21158r = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int a7 = B2.c.a(parcel);
        B2.c.n(parcel, 1, this.f21155o, false);
        AbstractBinderC2171A abstractBinderC2171A = this.f21156p;
        if (abstractBinderC2171A == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            abstractBinderC2171A = null;
        }
        B2.c.h(parcel, 2, abstractBinderC2171A, false);
        B2.c.c(parcel, 3, this.f21157q);
        B2.c.c(parcel, 4, this.f21158r);
        B2.c.b(parcel, a7);
    }

    public C2180J(String str, AbstractBinderC2171A abstractBinderC2171A, boolean z7, boolean z8) {
        this.f21155o = str;
        this.f21156p = abstractBinderC2171A;
        this.f21157q = z7;
        this.f21158r = z8;
    }
}
