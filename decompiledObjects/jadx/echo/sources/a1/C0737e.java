package a1;

import F0.AbstractC0375u;
import F0.InterfaceC0373s;
import g0.AbstractC1297a;
import g0.z;
import java.util.Arrays;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0737e {

    /* renamed from: a, reason: collision with root package name */
    public final C0738f f8026a = new C0738f();

    /* renamed from: b, reason: collision with root package name */
    public final z f8027b = new z(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f8028c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8029d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8030e;

    public final int a(int i7) {
        int i8;
        int i9 = 0;
        this.f8029d = 0;
        do {
            int i10 = this.f8029d;
            int i11 = i7 + i10;
            C0738f c0738f = this.f8026a;
            if (i11 >= c0738f.f8037g) {
                break;
            }
            int[] iArr = c0738f.f8040j;
            this.f8029d = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public C0738f b() {
        return this.f8026a;
    }

    public z c() {
        return this.f8027b;
    }

    public boolean d(InterfaceC0373s interfaceC0373s) {
        int i7;
        AbstractC1297a.f(interfaceC0373s != null);
        if (this.f8030e) {
            this.f8030e = false;
            this.f8027b.P(0);
        }
        while (!this.f8030e) {
            if (this.f8028c < 0) {
                if (!this.f8026a.c(interfaceC0373s) || !this.f8026a.a(interfaceC0373s, true)) {
                    return false;
                }
                C0738f c0738f = this.f8026a;
                int i8 = c0738f.f8038h;
                if ((c0738f.f8032b & 1) == 1 && this.f8027b.g() == 0) {
                    i8 += a(0);
                    i7 = this.f8029d;
                } else {
                    i7 = 0;
                }
                if (!AbstractC0375u.e(interfaceC0373s, i8)) {
                    return false;
                }
                this.f8028c = i7;
            }
            int a7 = a(this.f8028c);
            int i9 = this.f8028c + this.f8029d;
            if (a7 > 0) {
                z zVar = this.f8027b;
                zVar.c(zVar.g() + a7);
                if (!AbstractC0375u.d(interfaceC0373s, this.f8027b.e(), this.f8027b.g(), a7)) {
                    return false;
                }
                z zVar2 = this.f8027b;
                zVar2.S(zVar2.g() + a7);
                this.f8030e = this.f8026a.f8040j[i9 + (-1)] != 255;
            }
            if (i9 == this.f8026a.f8037g) {
                i9 = -1;
            }
            this.f8028c = i9;
        }
        return true;
    }

    public void e() {
        this.f8026a.b();
        this.f8027b.P(0);
        this.f8028c = -1;
        this.f8030e = false;
    }

    public void f() {
        if (this.f8027b.e().length == 65025) {
            return;
        }
        z zVar = this.f8027b;
        zVar.R(Arrays.copyOf(zVar.e(), Math.max(65025, this.f8027b.g())), this.f8027b.g());
    }
}
