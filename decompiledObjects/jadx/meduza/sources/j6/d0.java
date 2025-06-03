package j6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class d0 extends n6.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public final String f8483a;

    /* renamed from: b, reason: collision with root package name */
    public final u f8484b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8485c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8486d;

    public d0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f8483a = str;
        v vVar = null;
        if (iBinder != null) {
            try {
                IObjectWrapper zzd = zzz.zzg(iBinder).zzd();
                byte[] bArr = zzd == null ? null : (byte[]) ObjectWrapper.unwrap(zzd);
                if (bArr != null) {
                    vVar = new v(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f8484b = vVar;
        this.f8485c = z10;
        this.f8486d = z11;
    }

    public d0(String str, u uVar, boolean z10, boolean z11) {
        this.f8483a = str;
        this.f8484b = uVar;
        this.f8485c = z10;
        this.f8486d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f8483a;
        int J = b.z.J(20293, parcel);
        b.z.F(parcel, 1, str, false);
        u uVar = this.f8484b;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        }
        b.z.y(parcel, 2, uVar);
        b.z.t(parcel, 3, this.f8485c);
        b.z.t(parcel, 4, this.f8486d);
        b.z.L(J, parcel);
    }
}
