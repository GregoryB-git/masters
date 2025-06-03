package x2;

import A2.AbstractC0328n;
import A2.p0;
import A2.q0;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: x2.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2171A extends p0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f21134b;

    public AbstractBinderC2171A(byte[] bArr) {
        AbstractC0328n.a(bArr.length == 25);
        this.f21134b = Arrays.hashCode(bArr);
    }

    public static byte[] v(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }

    public abstract byte[] Z0();

    @Override // A2.q0
    public final int c() {
        return this.f21134b;
    }

    @Override // A2.q0
    public final H2.a d() {
        return H2.b.Z0(Z0());
    }

    public final boolean equals(Object obj) {
        H2.a d7;
        if (obj != null && (obj instanceof q0)) {
            try {
                q0 q0Var = (q0) obj;
                if (q0Var.c() == this.f21134b && (d7 = q0Var.d()) != null) {
                    return Arrays.equals(Z0(), (byte[]) H2.b.v(d7));
                }
                return false;
            } catch (RemoteException e7) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21134b;
    }
}
