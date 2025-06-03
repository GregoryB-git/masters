package F0;

import d0.AbstractC1199v;
import d0.InterfaceC1186i;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: F0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365j implements InterfaceC0373s {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1186i f1910b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1911c;

    /* renamed from: d, reason: collision with root package name */
    public long f1912d;

    /* renamed from: f, reason: collision with root package name */
    public int f1914f;

    /* renamed from: g, reason: collision with root package name */
    public int f1915g;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f1913e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1909a = new byte[4096];

    static {
        AbstractC1199v.a("media3.extractor");
    }

    public C0365j(InterfaceC1186i interfaceC1186i, long j7, long j8) {
        this.f1910b = interfaceC1186i;
        this.f1912d = j7;
        this.f1911c = j8;
    }

    @Override // F0.InterfaceC0373s
    public long a() {
        return this.f1911c;
    }

    @Override // F0.InterfaceC0373s
    public int b(int i7) {
        int u7 = u(i7);
        if (u7 == 0) {
            byte[] bArr = this.f1909a;
            u7 = t(bArr, 0, Math.min(i7, bArr.length), 0, true);
        }
        q(u7);
        return u7;
    }

    @Override // F0.InterfaceC0373s
    public boolean d(byte[] bArr, int i7, int i8, boolean z7) {
        int s7 = s(bArr, i7, i8);
        while (s7 < i8 && s7 != -1) {
            s7 = t(bArr, i7, i8, s7, z7);
        }
        q(s7);
        return s7 != -1;
    }

    @Override // F0.InterfaceC0373s
    public int f(byte[] bArr, int i7, int i8) {
        int min;
        r(i8);
        int i9 = this.f1915g;
        int i10 = this.f1914f;
        int i11 = i9 - i10;
        if (i11 == 0) {
            min = t(this.f1913e, i10, i8, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f1915g += min;
        } else {
            min = Math.min(i8, i11);
        }
        System.arraycopy(this.f1913e, this.f1914f, bArr, i7, min);
        this.f1914f += min;
        return min;
    }

    @Override // F0.InterfaceC0373s
    public void h() {
        this.f1914f = 0;
    }

    @Override // F0.InterfaceC0373s
    public void i(int i7) {
        v(i7, false);
    }

    @Override // F0.InterfaceC0373s
    public boolean j(int i7, boolean z7) {
        r(i7);
        int i8 = this.f1915g - this.f1914f;
        while (i8 < i7) {
            i8 = t(this.f1913e, this.f1914f, i7, i8, z7);
            if (i8 == -1) {
                return false;
            }
            this.f1915g = this.f1914f + i8;
        }
        this.f1914f += i7;
        return true;
    }

    @Override // F0.InterfaceC0373s
    public boolean l(byte[] bArr, int i7, int i8, boolean z7) {
        if (!j(i8, z7)) {
            return false;
        }
        System.arraycopy(this.f1913e, this.f1914f - i8, bArr, i7, i8);
        return true;
    }

    @Override // F0.InterfaceC0373s
    public long m() {
        return this.f1912d + this.f1914f;
    }

    @Override // F0.InterfaceC0373s
    public void n(byte[] bArr, int i7, int i8) {
        l(bArr, i7, i8, false);
    }

    @Override // F0.InterfaceC0373s
    public void o(int i7) {
        j(i7, false);
    }

    @Override // F0.InterfaceC0373s
    public long p() {
        return this.f1912d;
    }

    public final void q(int i7) {
        if (i7 != -1) {
            this.f1912d += i7;
        }
    }

    public final void r(int i7) {
        int i8 = this.f1914f + i7;
        byte[] bArr = this.f1913e;
        if (i8 > bArr.length) {
            this.f1913e = Arrays.copyOf(this.f1913e, g0.M.p(bArr.length * 2, 65536 + i8, i8 + 524288));
        }
    }

    @Override // F0.InterfaceC0373s, d0.InterfaceC1186i
    public int read(byte[] bArr, int i7, int i8) {
        int s7 = s(bArr, i7, i8);
        if (s7 == 0) {
            s7 = t(bArr, i7, i8, 0, true);
        }
        q(s7);
        return s7;
    }

    @Override // F0.InterfaceC0373s
    public void readFully(byte[] bArr, int i7, int i8) {
        d(bArr, i7, i8, false);
    }

    public final int s(byte[] bArr, int i7, int i8) {
        int i9 = this.f1915g;
        if (i9 == 0) {
            return 0;
        }
        int min = Math.min(i9, i8);
        System.arraycopy(this.f1913e, 0, bArr, i7, min);
        w(min);
        return min;
    }

    public final int t(byte[] bArr, int i7, int i8, int i9, boolean z7) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int read = this.f1910b.read(bArr, i7 + i9, i8 - i9);
        if (read != -1) {
            return i9 + read;
        }
        if (i9 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    public final int u(int i7) {
        int min = Math.min(this.f1915g, i7);
        w(min);
        return min;
    }

    public boolean v(int i7, boolean z7) {
        int u7 = u(i7);
        while (u7 < i7 && u7 != -1) {
            u7 = t(this.f1909a, -u7, Math.min(i7, this.f1909a.length + u7), u7, z7);
        }
        q(u7);
        return u7 != -1;
    }

    public final void w(int i7) {
        int i8 = this.f1915g - i7;
        this.f1915g = i8;
        this.f1914f = 0;
        byte[] bArr = this.f1913e;
        byte[] bArr2 = i8 < bArr.length - 524288 ? new byte[65536 + i8] : bArr;
        System.arraycopy(bArr, i7, bArr2, 0, i8);
        this.f1913e = bArr2;
    }
}
