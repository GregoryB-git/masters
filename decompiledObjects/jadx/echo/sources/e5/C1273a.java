package e5;

import java.lang.reflect.Array;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1273a {

    /* renamed from: a, reason: collision with root package name */
    public final C1274b[] f14001a;

    /* renamed from: b, reason: collision with root package name */
    public int f14002b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14003c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14004d;

    public C1273a(int i7, int i8) {
        C1274b[] c1274bArr = new C1274b[i7];
        this.f14001a = c1274bArr;
        int length = c1274bArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            this.f14001a[i9] = new C1274b(((i8 + 4) * 17) + 1);
        }
        this.f14004d = i8 * 17;
        this.f14003c = i7;
        this.f14002b = -1;
    }

    public C1274b a() {
        return this.f14001a[this.f14002b];
    }

    public byte[][] b(int i7, int i8) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, this.f14003c * i8, this.f14004d * i7);
        int i9 = this.f14003c * i8;
        for (int i10 = 0; i10 < i9; i10++) {
            bArr[(i9 - i10) - 1] = this.f14001a[i10 / i8].b(i7);
        }
        return bArr;
    }

    public void c() {
        this.f14002b++;
    }
}
