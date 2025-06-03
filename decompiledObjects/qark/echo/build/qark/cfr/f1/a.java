/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  java.util.zip.Inflater
 */
package f1;

import android.graphics.Bitmap;
import c1.e;
import c1.k;
import c1.s;
import c1.t;
import f0.a;
import g0.M;
import g0.g;
import g0.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

public final class a
implements t {
    public final z a = new z();
    public final z b = new z();
    public final a c = new a();
    public Inflater d;

    public static f0.a f(z z8, a object) {
        int n8 = z8.g();
        int n9 = z8.G();
        int n10 = z8.M();
        int n11 = z8.f() + n10;
        f0.a a8 = null;
        if (n11 > n8) {
            z8.T(n8);
            return null;
        }
        if (n9 != 128) {
            switch (n9) {
                default: {
                    object = a8;
                    break;
                }
                case 22: {
                    ((a)object).f(z8, n10);
                    object = a8;
                    break;
                }
                case 21: {
                    ((a)object).e(z8, n10);
                    object = a8;
                    break;
                }
                case 20: {
                    ((a)object).g(z8, n10);
                    object = a8;
                    break;
                }
            }
        } else {
            a8 = object.d();
            object.h();
            object = a8;
        }
        z8.T(n11);
        return object;
    }

    @Override
    public /* synthetic */ k a(byte[] arrby, int n8, int n9) {
        return s.a(this, arrby, n8, n9);
    }

    @Override
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override
    public void c(byte[] arrayList, int n8, int n9, t.b object, g g8) {
        this.a.R((byte[])arrayList, n9 + n8);
        this.a.T(n8);
        this.e(this.a);
        this.c.h();
        arrayList = new ArrayList();
        while (this.a.a() >= 3) {
            object = a.f(this.a, this.c);
            if (object == null) continue;
            arrayList.add(object);
        }
        g8.accept(new e((List)arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override
    public int d() {
        return 2;
    }

    public final void e(z z8) {
        if (z8.a() > 0 && z8.j() == 120) {
            if (this.d == null) {
                this.d = new Inflater();
            }
            if (M.v0(z8, this.b, this.d)) {
                z8.R(this.b.e(), this.b.g());
            }
        }
    }

    public static final class a {
        public final z a = new z();
        public final int[] b = new int[256];
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public f0.a d() {
            if (this.d != 0 && this.e != 0 && this.h != 0 && this.i != 0 && this.a.g() != 0 && this.a.f() == this.a.g() && this.c) {
                this.a.T(0);
                int n8 = this.h * this.i;
                Bitmap bitmap = new int[n8];
                int n9 = 0;
                while (n9 < n8) {
                    int n10;
                    int n11 = this.a.G();
                    if (n11 != 0) {
                        n10 = n9 + 1;
                        bitmap[n9] = this.b[n11];
                        n9 = n10;
                        continue;
                    }
                    n11 = this.a.G();
                    if (n11 == 0) continue;
                    n10 = (n11 & 64) == 0 ? n11 & 63 : (n11 & 63) << 8 | this.a.G();
                    n11 = (n11 & 128) == 0 ? this.b[0] : this.b[this.a.G()];
                    Arrays.fill((int[])bitmap, (int)n9, (int)(n10 += n9), (int)n11);
                    n9 = n10;
                }
                bitmap = Bitmap.createBitmap((int[])bitmap, (int)this.h, (int)this.i, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                return new a.b().f(bitmap).k((float)this.f / (float)this.d).l(0).h((float)this.g / (float)this.e, 0).i(0).n((float)this.h / (float)this.d).g((float)this.i / (float)this.e).a();
            }
            return null;
        }

        public final void e(z z8, int n8) {
            int n9;
            if (n8 < 4) {
                return;
            }
            z8.U(3);
            int n10 = (z8.G() & 128) != 0 ? 1 : 0;
            int n11 = n9 = n8 - 4;
            if (n10 != 0) {
                if (n9 < 7) {
                    return;
                }
                n11 = z8.J();
                if (n11 < 4) {
                    return;
                }
                this.h = z8.M();
                this.i = z8.M();
                this.a.P(n11 - 4);
                n11 = n8 - 11;
            }
            if ((n8 = this.a.f()) < (n10 = this.a.g()) && n11 > 0) {
                n11 = Math.min((int)n11, (int)(n10 - n8));
                z8.l(this.a.e(), n8, n11);
                this.a.T(n8 + n11);
            }
        }

        public final void f(z z8, int n8) {
            if (n8 < 19) {
                return;
            }
            this.d = z8.M();
            this.e = z8.M();
            z8.U(11);
            this.f = z8.M();
            this.g = z8.M();
        }

        public final void g(z z8, int n8) {
            if (n8 % 5 != 2) {
                return;
            }
            z8.U(2);
            Arrays.fill((int[])this.b, (int)0);
            int n9 = n8 / 5;
            for (n8 = 0; n8 < n9; ++n8) {
                int n10 = z8.G();
                int n11 = z8.G();
                int n12 = z8.G();
                int n13 = z8.G();
                int n14 = z8.G();
                double d8 = n11;
                double d9 = n12 - 128;
                n11 = (int)(1.402 * d9 + d8);
                double d10 = n13 - 128;
                n13 = (int)(d8 - 0.34414 * d10 - d9 * 0.71414);
                n12 = (int)(d8 + d10 * 1.772);
                int[] arrn = this.b;
                n11 = M.p(n11, 0, 255);
                arrn[n10] = M.p(n13, 0, 255) << 8 | (n14 << 24 | n11 << 16) | M.p(n12, 0, 255);
            }
            this.c = true;
        }

        public void h() {
            this.d = 0;
            this.e = 0;
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.a.P(0);
            this.c = false;
        }
    }

}

