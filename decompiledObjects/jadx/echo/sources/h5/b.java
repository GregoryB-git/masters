package h5;

import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f14589a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14590b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14591c;

    public b(int i7, int i8) {
        this.f14589a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i8, i7);
        this.f14590b = i7;
        this.f14591c = i8;
    }

    public void a(byte b7) {
        for (byte[] bArr : this.f14589a) {
            Arrays.fill(bArr, b7);
        }
    }

    public byte b(int i7, int i8) {
        return this.f14589a[i8][i7];
    }

    public byte[][] c() {
        return this.f14589a;
    }

    public int d() {
        return this.f14591c;
    }

    public int e() {
        return this.f14590b;
    }

    public void f(int i7, int i8, int i9) {
        this.f14589a[i8][i7] = (byte) i9;
    }

    public void g(int i7, int i8, boolean z7) {
        this.f14589a[i8][i7] = z7 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f14590b * 2 * this.f14591c) + 2);
        for (int i7 = 0; i7 < this.f14591c; i7++) {
            byte[] bArr = this.f14589a[i7];
            for (int i8 = 0; i8 < this.f14590b; i8++) {
                byte b7 = bArr[i8];
                sb.append(b7 != 0 ? b7 != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
