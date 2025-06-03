package xc;

import b.a0;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class v extends i {

    /* renamed from: e, reason: collision with root package name */
    public final transient byte[][] f17295e;
    public final transient int[] f;

    public v(byte[][] bArr, int[] iArr) {
        super(i.f17259d.f17260a);
        this.f17295e = bArr;
        this.f = iArr;
    }

    @Override // xc.i
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (iVar.i() != i() || !q(iVar, i())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // xc.i
    public final String f() {
        return new i(s()).f();
    }

    @Override // xc.i
    public final i h(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f17295e.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            messageDigest.update(this.f17295e[i10], i12, i13 - i11);
            i10++;
            i11 = i13;
        }
        byte[] digest = messageDigest.digest();
        ec.i.d(digest, "digestBytes");
        return new i(digest);
    }

    @Override // xc.i
    public final int hashCode() {
        int i10 = this.f17261b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f17295e.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            int[] iArr = this.f;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            byte[] bArr = this.f17295e[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f17261b = i12;
        return i12;
    }

    @Override // xc.i
    public final int i() {
        return this.f[this.f17295e.length - 1];
    }

    @Override // xc.i
    public final String l() {
        return new i(s()).l();
    }

    @Override // xc.i
    public final byte[] m() {
        return s();
    }

    @Override // xc.i
    public final byte n(int i10) {
        b.b(this.f[this.f17295e.length - 1], i10, 1L);
        int E = a0.E(this, i10);
        int i11 = E == 0 ? 0 : this.f[E - 1];
        int[] iArr = this.f;
        byte[][] bArr = this.f17295e;
        return bArr[E][(i10 - i11) + iArr[bArr.length + E]];
    }

    @Override // xc.i
    public final boolean p(int i10, byte[] bArr, int i11, int i12) {
        ec.i.e(bArr, "other");
        if (i10 < 0 || i10 > i() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int E = a0.E(this, i10);
        while (i10 < i13) {
            int i14 = E == 0 ? 0 : this.f[E - 1];
            int[] iArr = this.f;
            int i15 = iArr[E] - i14;
            int i16 = iArr[this.f17295e.length + E];
            int min = Math.min(i13, i15 + i14) - i10;
            if (!b.a(this.f17295e[E], (i10 - i14) + i16, bArr, i11, min)) {
                return false;
            }
            i11 += min;
            i10 += min;
            E++;
        }
        return true;
    }

    @Override // xc.i
    public final boolean q(i iVar, int i10) {
        ec.i.e(iVar, "other");
        if (i() - i10 < 0) {
            return false;
        }
        int i11 = i10 + 0;
        int E = a0.E(this, 0);
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int i14 = E == 0 ? 0 : this.f[E - 1];
            int[] iArr = this.f;
            int i15 = iArr[E] - i14;
            int i16 = iArr[this.f17295e.length + E];
            int min = Math.min(i11, i15 + i14) - i12;
            if (!iVar.p(i13, this.f17295e[E], (i12 - i14) + i16, min)) {
                return false;
            }
            i13 += min;
            i12 += min;
            E++;
        }
        return true;
    }

    @Override // xc.i
    public final i r() {
        return new i(s()).r();
    }

    @Override // xc.i
    public final byte[] s() {
        byte[] bArr = new byte[i()];
        int length = this.f17295e.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int[] iArr = this.f;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = i14 - i11;
            sb.j.k(this.f17295e[i10], i12, bArr, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    @Override // xc.i
    public final String toString() {
        return new i(s()).toString();
    }

    @Override // xc.i
    public final void u(f fVar, int i10) {
        ec.i.e(fVar, "buffer");
        int i11 = 0 + i10;
        int E = a0.E(this, 0);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = E == 0 ? 0 : this.f[E - 1];
            int[] iArr = this.f;
            int i14 = iArr[E] - i13;
            int i15 = iArr[this.f17295e.length + E];
            int min = Math.min(i11, i14 + i13) - i12;
            int i16 = (i12 - i13) + i15;
            t tVar = new t(this.f17295e[E], i16, i16 + min, true, false);
            t tVar2 = fVar.f17251a;
            if (tVar2 == null) {
                tVar.f17291g = tVar;
                tVar.f = tVar;
                fVar.f17251a = tVar;
            } else {
                t tVar3 = tVar2.f17291g;
                ec.i.b(tVar3);
                tVar3.b(tVar);
            }
            i12 += min;
            E++;
        }
        fVar.f17252b += i10;
    }
}
