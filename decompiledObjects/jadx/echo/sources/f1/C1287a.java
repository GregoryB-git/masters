package f1;

import android.graphics.Bitmap;
import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import f0.C1280a;
import g0.InterfaceC1303g;
import g0.M;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1287a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final z f14136a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final z f14137b = new z();

    /* renamed from: c, reason: collision with root package name */
    public final C0204a f14138c = new C0204a();

    /* renamed from: d, reason: collision with root package name */
    public Inflater f14139d;

    /* renamed from: f1.a$a, reason: collision with other inner class name */
    public static final class C0204a {

        /* renamed from: a, reason: collision with root package name */
        public final z f14140a = new z();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f14141b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        public boolean f14142c;

        /* renamed from: d, reason: collision with root package name */
        public int f14143d;

        /* renamed from: e, reason: collision with root package name */
        public int f14144e;

        /* renamed from: f, reason: collision with root package name */
        public int f14145f;

        /* renamed from: g, reason: collision with root package name */
        public int f14146g;

        /* renamed from: h, reason: collision with root package name */
        public int f14147h;

        /* renamed from: i, reason: collision with root package name */
        public int f14148i;

        public C1280a d() {
            int i7;
            if (this.f14143d == 0 || this.f14144e == 0 || this.f14147h == 0 || this.f14148i == 0 || this.f14140a.g() == 0 || this.f14140a.f() != this.f14140a.g() || !this.f14142c) {
                return null;
            }
            this.f14140a.T(0);
            int i8 = this.f14147h * this.f14148i;
            int[] iArr = new int[i8];
            int i9 = 0;
            while (i9 < i8) {
                int G6 = this.f14140a.G();
                if (G6 != 0) {
                    i7 = i9 + 1;
                    iArr[i9] = this.f14141b[G6];
                } else {
                    int G7 = this.f14140a.G();
                    if (G7 != 0) {
                        i7 = ((G7 & 64) == 0 ? G7 & 63 : ((G7 & 63) << 8) | this.f14140a.G()) + i9;
                        Arrays.fill(iArr, i9, i7, (G7 & 128) == 0 ? this.f14141b[0] : this.f14141b[this.f14140a.G()]);
                    }
                }
                i9 = i7;
            }
            return new C1280a.b().f(Bitmap.createBitmap(iArr, this.f14147h, this.f14148i, Bitmap.Config.ARGB_8888)).k(this.f14145f / this.f14143d).l(0).h(this.f14146g / this.f14144e, 0).i(0).n(this.f14147h / this.f14143d).g(this.f14148i / this.f14144e).a();
        }

        public final void e(z zVar, int i7) {
            int J6;
            if (i7 < 4) {
                return;
            }
            zVar.U(3);
            int i8 = i7 - 4;
            if ((zVar.G() & 128) != 0) {
                if (i8 < 7 || (J6 = zVar.J()) < 4) {
                    return;
                }
                this.f14147h = zVar.M();
                this.f14148i = zVar.M();
                this.f14140a.P(J6 - 4);
                i8 = i7 - 11;
            }
            int f7 = this.f14140a.f();
            int g7 = this.f14140a.g();
            if (f7 >= g7 || i8 <= 0) {
                return;
            }
            int min = Math.min(i8, g7 - f7);
            zVar.l(this.f14140a.e(), f7, min);
            this.f14140a.T(f7 + min);
        }

        public final void f(z zVar, int i7) {
            if (i7 < 19) {
                return;
            }
            this.f14143d = zVar.M();
            this.f14144e = zVar.M();
            zVar.U(11);
            this.f14145f = zVar.M();
            this.f14146g = zVar.M();
        }

        public final void g(z zVar, int i7) {
            if (i7 % 5 != 2) {
                return;
            }
            zVar.U(2);
            Arrays.fill(this.f14141b, 0);
            int i8 = i7 / 5;
            for (int i9 = 0; i9 < i8; i9++) {
                int G6 = zVar.G();
                int G7 = zVar.G();
                int G8 = zVar.G();
                int G9 = zVar.G();
                double d7 = G7;
                double d8 = G8 - 128;
                double d9 = G9 - 128;
                this.f14141b[G6] = (M.p((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255) << 8) | (zVar.G() << 24) | (M.p((int) ((1.402d * d8) + d7), 0, 255) << 16) | M.p((int) (d7 + (d9 * 1.772d)), 0, 255);
            }
            this.f14142c = true;
        }

        public void h() {
            this.f14143d = 0;
            this.f14144e = 0;
            this.f14145f = 0;
            this.f14146g = 0;
            this.f14147h = 0;
            this.f14148i = 0;
            this.f14140a.P(0);
            this.f14142c = false;
        }
    }

    public static C1280a f(z zVar, C0204a c0204a) {
        int g7 = zVar.g();
        int G6 = zVar.G();
        int M6 = zVar.M();
        int f7 = zVar.f() + M6;
        C1280a c1280a = null;
        if (f7 > g7) {
            zVar.T(g7);
            return null;
        }
        if (G6 != 128) {
            switch (G6) {
                case 20:
                    c0204a.g(zVar, M6);
                    break;
                case 21:
                    c0204a.e(zVar, M6);
                    break;
                case 22:
                    c0204a.f(zVar, M6);
                    break;
            }
        } else {
            c1280a = c0204a.d();
            c0204a.h();
        }
        zVar.T(f7);
        return c1280a;
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        this.f14136a.R(bArr, i8 + i7);
        this.f14136a.T(i7);
        e(this.f14136a);
        this.f14138c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f14136a.a() >= 3) {
            C1280a f7 = f(this.f14136a, this.f14138c);
            if (f7 != null) {
                arrayList.add(f7);
            }
        }
        interfaceC1303g.accept(new C0816e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // c1.t
    public int d() {
        return 2;
    }

    public final void e(z zVar) {
        if (zVar.a() <= 0 || zVar.j() != 120) {
            return;
        }
        if (this.f14139d == null) {
            this.f14139d = new Inflater();
        }
        if (M.v0(zVar, this.f14137b, this.f14139d)) {
            zVar.R(this.f14137b.e(), this.f14137b.g());
        }
    }
}
