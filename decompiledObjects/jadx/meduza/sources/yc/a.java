package yc;

import ec.i;
import xc.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f17467a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(lc.a.f9829a);
        i.d(bytes, "this as java.lang.String).getBytes(charset)");
        f17467a = bytes;
    }

    public static final String a(f fVar, long j10) {
        i.e(fVar, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (fVar.I(j11) == 13) {
                String i02 = fVar.i0(j11, lc.a.f9829a);
                fVar.skip(2L);
                return i02;
            }
        }
        String i03 = fVar.i0(j10, lc.a.f9829a);
        fVar.skip(1L);
        return i03;
    }
}
