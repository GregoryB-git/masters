package j6;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzz;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class u extends zzz {

    /* renamed from: a, reason: collision with root package name */
    public final int f8515a;

    public u(byte[] bArr) {
        m6.j.b(bArr.length == 25);
        this.f8515a = Arrays.hashCode(bArr);
    }

    public static byte[] g(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        IObjectWrapper zzd;
        if (obj != null && (obj instanceof m6.b0)) {
            try {
                m6.b0 b0Var = (m6.b0) obj;
                if (b0Var.zzc() == this.f8515a && (zzd = b0Var.zzd()) != null) {
                    return Arrays.equals(r(), (byte[]) ObjectWrapper.unwrap(zzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8515a;
    }

    public abstract byte[] r();

    @Override // m6.b0
    public final int zzc() {
        return this.f8515a;
    }

    @Override // m6.b0
    public final IObjectWrapper zzd() {
        return ObjectWrapper.wrap(r());
    }
}
