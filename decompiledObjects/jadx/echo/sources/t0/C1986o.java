package t0;

import android.media.MediaCodec;

/* renamed from: t0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1986o extends j0.h {

    /* renamed from: o, reason: collision with root package name */
    public final p f19479o;

    /* renamed from: p, reason: collision with root package name */
    public final String f19480p;

    /* renamed from: q, reason: collision with root package name */
    public final int f19481q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1986o(java.lang.Throwable r4, t0.p r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f19482a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f19479o = r5
            int r5 = g0.M.f14261a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = a(r4)
        L27:
            r3.f19480p = r1
            r0 = 23
            if (r5 < r0) goto L32
            int r4 = b(r4)
            goto L36
        L32:
            int r4 = g0.M.X(r1)
        L36:
            r3.f19481q = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1986o.<init>(java.lang.Throwable, t0.p):void");
    }

    public static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }

    public static int b(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getErrorCode();
        }
        return 0;
    }
}
