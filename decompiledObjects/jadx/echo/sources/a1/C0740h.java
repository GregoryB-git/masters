package a1;

import F0.K;
import F0.W;
import X2.AbstractC0703v;
import a1.AbstractC0741i;
import d0.C1194q;
import d0.C1201x;
import g0.AbstractC1297a;
import g0.z;
import java.util.Arrays;
import java.util.List;

/* renamed from: a1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0740h extends AbstractC0741i {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f8042o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f8043p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f8044n;

    public static boolean n(z zVar, byte[] bArr) {
        if (zVar.a() < bArr.length) {
            return false;
        }
        int f7 = zVar.f();
        byte[] bArr2 = new byte[bArr.length];
        zVar.l(bArr2, 0, bArr.length);
        zVar.T(f7);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(z zVar) {
        return n(zVar, f8042o);
    }

    @Override // a1.AbstractC0741i
    public long f(z zVar) {
        return c(K.e(zVar.e()));
    }

    @Override // a1.AbstractC0741i
    public boolean i(z zVar, long j7, AbstractC0741i.b bVar) {
        C1194q.b h02;
        if (n(zVar, f8042o)) {
            byte[] copyOf = Arrays.copyOf(zVar.e(), zVar.g());
            int c7 = K.c(copyOf);
            List a7 = K.a(copyOf);
            if (bVar.f8058a != null) {
                return true;
            }
            h02 = new C1194q.b().o0("audio/opus").N(c7).p0(48000).b0(a7);
        } else {
            byte[] bArr = f8043p;
            if (!n(zVar, bArr)) {
                AbstractC1297a.h(bVar.f8058a);
                return false;
            }
            AbstractC1297a.h(bVar.f8058a);
            if (this.f8044n) {
                return true;
            }
            this.f8044n = true;
            zVar.U(bArr.length);
            C1201x d7 = W.d(AbstractC0703v.V(W.k(zVar, false, false).f1821b));
            if (d7 == null) {
                return true;
            }
            h02 = bVar.f8058a.a().h0(d7.b(bVar.f8058a.f12723k));
        }
        bVar.f8058a = h02.K();
        return true;
    }

    @Override // a1.AbstractC0741i
    public void l(boolean z7) {
        super.l(z7);
        if (z7) {
            this.f8044n = false;
        }
    }
}
