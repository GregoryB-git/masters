package gb;

import eb.h0;
import eb.s0;
import gb.a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class y0 extends a.b {

    /* renamed from: v, reason: collision with root package name */
    public static final s0.f f6903v = eb.h0.a(":status", new a());

    /* renamed from: r, reason: collision with root package name */
    public eb.e1 f6904r;

    /* renamed from: s, reason: collision with root package name */
    public eb.s0 f6905s;
    public Charset t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6906u;

    public class a implements h0.a<Integer> {
        @Override // eb.s0.g
        public final byte[] a(Serializable serializable) {
            throw new UnsupportedOperationException();
        }

        @Override // eb.s0.g
        public final Object b(byte[] bArr) {
            if (bArr.length >= 3) {
                return Integer.valueOf((bArr[2] - 48) + ((bArr[1] - 48) * 10) + ((bArr[0] - 48) * 100));
            }
            StringBuilder l10 = defpackage.f.l("Malformed status code ");
            l10.append(new String(bArr, eb.h0.f5116a));
            throw new NumberFormatException(l10.toString());
        }
    }

    public y0(int i10, l3 l3Var, r3 r3Var) {
        super(i10, l3Var, r3Var);
        this.t = n7.d.f11284c;
    }

    public static Charset k(eb.s0 s0Var) {
        String str = (String) s0Var.c(v0.f6835i);
        if (str != null) {
            try {
                return Charset.forName(str.split("charset=", 2)[r2.length - 1].trim());
            } catch (Exception unused) {
            }
        }
        return n7.d.f11284c;
    }

    public static eb.e1 l(eb.s0 s0Var) {
        char charAt;
        Integer num = (Integer) s0Var.c(f6903v);
        if (num == null) {
            return eb.e1.f5077m.g("Missing HTTP status code");
        }
        String str = (String) s0Var.c(v0.f6835i);
        boolean z10 = false;
        if (str != null && 16 <= str.length()) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.startsWith("application/grpc") && (lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';')) {
                z10 = true;
            }
        }
        if (z10) {
            return null;
        }
        return v0.f(num.intValue()).a("invalid content-type: " + str);
    }
}
