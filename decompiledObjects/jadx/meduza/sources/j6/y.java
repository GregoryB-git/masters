package j6;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final s f8520a;

    /* renamed from: b, reason: collision with root package name */
    public static final t f8521b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile m6.e0 f8522c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f8523d;

    /* renamed from: e, reason: collision with root package name */
    public static Context f8524e;

    static {
        new q(u.g("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new r(u.g("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f8520a = new s(u.g("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f8521b = new t(u.g("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        f8523d = new Object();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [j6.p] */
    public static g0 a(final String str, final u uVar, final boolean z10, boolean z11) {
        try {
            b();
            m6.j.i(f8524e);
            try {
                return f8522c.H2(new d0(str, uVar, z10, z11), ObjectWrapper.wrap(f8524e.getPackageManager())) ? g0.f8493d : new f0(new Callable() { // from class: j6.p
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        MessageDigest messageDigest;
                        boolean z12 = z10;
                        String str2 = str;
                        u uVar2 = uVar;
                        Object[] objArr = new Object[5];
                        objArr[0] = true != (!z12 && y.a(str2, uVar2, true, false).f8494a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 2) {
                                messageDigest = null;
                                break;
                            }
                            try {
                                messageDigest = MessageDigest.getInstance("SHA-256");
                            } catch (NoSuchAlgorithmException unused) {
                            }
                            if (messageDigest != null) {
                                break;
                            }
                            i10++;
                        }
                        m6.j.i(messageDigest);
                        byte[] digest = messageDigest.digest(uVar2.r());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i11 = 0;
                        for (byte b10 : digest) {
                            int i12 = b10 & 255;
                            int i13 = i11 + 1;
                            char[] cArr2 = b.a0.f1572i0;
                            cArr[i11] = cArr2[i12 >>> 4];
                            cArr[i13] = cArr2[i12 & 15];
                            i11 = i13 + 1;
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z12);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return new g0(false, "module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            return new g0(false, "module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    public static void b() {
        if (f8522c != null) {
            return;
        }
        m6.j.i(f8524e);
        synchronized (f8523d) {
            if (f8522c == null) {
                f8522c = zzaf.zzb(DynamiteModule.c(f8524e, DynamiteModule.f2862c, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}
