package j6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: c, reason: collision with root package name */
    public static k f8504c;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8505a;

    /* renamed from: b, reason: collision with root package name */
    public volatile String f8506b;

    public k(Context context) {
        this.f8505a = context.getApplicationContext();
    }

    public static k a(Context context) {
        m6.j.i(context);
        synchronized (k.class) {
            if (f8504c == null) {
                s sVar = y.f8520a;
                synchronized (y.class) {
                    if (y.f8524e == null) {
                        y.f8524e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f8504c = new k(context);
            }
        }
        return f8504c;
    }

    public static final u c(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            v vVar = new v(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < uVarArr.length; i10++) {
                if (uVarArr[i10].equals(vVar)) {
                    return uVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean d(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L2a
            if (r4 == 0) goto L28
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L2a
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L2a
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
            goto L2a
        L28:
            r2 = 0
            goto L2b
        L2a:
            r2 = r4
        L2b:
            if (r4 == 0) goto L49
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L49
            if (r5 == 0) goto L3a
            j6.u[] r4 = j6.x.f8519a
            j6.u r4 = c(r2, r4)
            goto L46
        L3a:
            j6.u[] r4 = new j6.u[r0]
            j6.u[] r5 = j6.x.f8519a
            r5 = r5[r1]
            r4[r1] = r5
            j6.u r4 = c(r2, r4)
        L46:
            if (r4 == 0) goto L49
            return r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.k.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0183 A[LOOP:0: B:6:0x0019->B:12:0x0183, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0194 A[EDGE_INSN: B:13:0x0194->B:14:0x0194 BREAK  A[LOOP:0: B:6:0x0019->B:12:0x0183], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0166  */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r21) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.k.b(int):boolean");
    }
}
