package c4;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import v3.h0;
import v5.e0;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public final t5.h f2274b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2275c;

    /* renamed from: d, reason: collision with root package name */
    public long f2276d;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f2278g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f2277e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2273a = new byte[4096];

    static {
        h0.a("goog.exo.extractor");
    }

    public e(t5.h hVar, long j10, long j11) {
        this.f2274b = hVar;
        this.f2276d = j10;
        this.f2275c = j11;
    }

    @Override // c4.i
    public final boolean b(byte[] bArr, int i10, int i11, boolean z10) {
        int min;
        int i12 = this.f2278g;
        if (i12 == 0) {
            min = 0;
        } else {
            min = Math.min(i12, i11);
            System.arraycopy(this.f2277e, 0, bArr, i10, min);
            q(min);
        }
        int i13 = min;
        while (i13 < i11 && i13 != -1) {
            i13 = p(bArr, i10, i11, i13, z10);
        }
        if (i13 != -1) {
            this.f2276d += i13;
        }
        return i13 != -1;
    }

    @Override // c4.i
    public final boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        if (!k(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f2277e, this.f - i11, bArr, i10, i11);
        return true;
    }

    @Override // c4.i
    public final long d() {
        return this.f2276d + this.f;
    }

    @Override // c4.i
    public final void e(int i10) {
        k(i10, false);
    }

    @Override // c4.i
    public final int g(byte[] bArr, int i10, int i11) {
        int min;
        o(i11);
        int i12 = this.f2278g;
        int i13 = this.f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            min = p(this.f2277e, i13, i11, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f2278g += min;
        } else {
            min = Math.min(i11, i14);
        }
        System.arraycopy(this.f2277e, this.f, bArr, i10, min);
        this.f += min;
        return min;
    }

    @Override // c4.i
    public final long getLength() {
        return this.f2275c;
    }

    @Override // c4.i
    public final long getPosition() {
        return this.f2276d;
    }

    @Override // c4.i
    public final void i() {
        this.f = 0;
    }

    @Override // c4.i
    public final void j(int i10) {
        int min = Math.min(this.f2278g, i10);
        q(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = p(this.f2273a, -i11, Math.min(i10, this.f2273a.length + i11), i11, false);
        }
        if (i11 != -1) {
            this.f2276d += i11;
        }
    }

    @Override // c4.i
    public final boolean k(int i10, boolean z10) {
        o(i10);
        int i11 = this.f2278g - this.f;
        while (i11 < i10) {
            i11 = p(this.f2277e, this.f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f2278g = this.f + i11;
        }
        this.f += i10;
        return true;
    }

    @Override // c4.i
    public final void m(byte[] bArr, int i10, int i11) {
        c(bArr, i10, i11, false);
    }

    @Override // c4.i
    public final int n() {
        int min = Math.min(this.f2278g, 1);
        q(min);
        if (min == 0) {
            byte[] bArr = this.f2273a;
            min = p(bArr, 0, Math.min(1, bArr.length), 0, true);
        }
        if (min != -1) {
            this.f2276d += min;
        }
        return min;
    }

    public final void o(int i10) {
        int i11 = this.f + i10;
        byte[] bArr = this.f2277e;
        if (i11 > bArr.length) {
            this.f2277e = Arrays.copyOf(this.f2277e, e0.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int p(byte[] bArr, int i10, int i11, int i12, boolean z10) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f2274b.read(bArr, i10 + i12, i11 - i12);
        if (read != -1) {
            return i12 + read;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void q(int i10) {
        int i11 = this.f2278g - i10;
        this.f2278g = i11;
        this.f = 0;
        byte[] bArr = this.f2277e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f2277e = bArr2;
    }

    @Override // c4.i, t5.h
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.f2278g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f2277e, 0, bArr, i10, min);
            q(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = p(bArr, i10, i11, 0, true);
        }
        if (i13 != -1) {
            this.f2276d += i13;
        }
        return i13;
    }

    @Override // c4.i
    public final void readFully(byte[] bArr, int i10, int i11) {
        b(bArr, i10, i11, false);
    }
}
