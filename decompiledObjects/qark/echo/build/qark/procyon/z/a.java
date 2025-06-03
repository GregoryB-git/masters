// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

public class a
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    
    public a(final float a, final float b, final float c, final float d, final float e, final float f, final float g, final float h, final float i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static a b(final float n, final float n2, final float n3) {
        float n4 = 100.0f;
        float n5 = 1000.0f;
        float n6 = 0.0f;
        a a = null;
        float n7 = 1000.0f;
        while (Math.abs(n6 - n4) > 0.01f) {
            final float n8 = (n4 - n6) / 2.0f + n6;
            final int p3 = e(n8, n2, n).p();
            final float b = z.b.b(p3);
            final float abs = Math.abs(n3 - b);
            float n9 = n5;
            float n10 = n7;
            a a2 = a;
            if (abs < 0.2f) {
                final a c = c(p3);
                final float a3 = c.a(e(c.k(), c.i(), n));
                n9 = n5;
                n10 = n7;
                a2 = a;
                if (a3 <= 1.0f) {
                    a2 = c;
                    n9 = abs;
                    n10 = a3;
                }
            }
            if (n9 == 0.0f && n10 == 0.0f) {
                return a2;
            }
            if (b < n3) {
                n6 = n8;
                n5 = n9;
                n7 = n10;
                a = a2;
            }
            else {
                n4 = n8;
                n5 = n9;
                n7 = n10;
                a = a2;
            }
        }
        return a;
    }
    
    public static a c(final int n) {
        return d(n, l.k);
    }
    
    public static a d(final int n, final l l) {
        final float[] f = b.f(n);
        final float[][] a = b.a;
        final float n2 = f[0];
        final float[] array = a[0];
        final float n3 = array[0];
        final float n4 = f[1];
        final float n5 = array[1];
        final float n6 = f[2];
        final float n7 = array[2];
        final float[] array2 = a[1];
        final float n8 = array2[0];
        final float n9 = array2[1];
        final float n10 = array2[2];
        final float[] array3 = a[2];
        final float n11 = array3[0];
        final float n12 = array3[1];
        final float n13 = array3[2];
        final float n14 = l.i()[0] * (n3 * n2 + n5 * n4 + n7 * n6);
        final float n15 = l.i()[1] * (n8 * n2 + n9 * n4 + n10 * n6);
        final float n16 = l.i()[2] * (n2 * n11 + n4 * n12 + n6 * n13);
        final float n17 = (float)Math.pow(l.c() * Math.abs(n14) / 100.0, 0.42);
        final float n18 = (float)Math.pow(l.c() * Math.abs(n15) / 100.0, 0.42);
        final float n19 = (float)Math.pow(l.c() * Math.abs(n16) / 100.0, 0.42);
        final float n20 = Math.signum(n14) * 400.0f * n17 / (n17 + 27.13f);
        final float n21 = Math.signum(n15) * 400.0f * n18 / (n18 + 27.13f);
        final float n22 = Math.signum(n16) * 400.0f * n19 / (n19 + 27.13f);
        final double n23 = n20;
        final double n24 = n21;
        final double n25 = n22;
        final float n26 = (float)(n23 * 11.0 + n24 * -12.0 + n25) / 11.0f;
        final float n27 = (float)(n20 + n21 - n25 * 2.0) / 9.0f;
        final float n28 = n21 * 20.0f;
        final float n29 = (n20 * 20.0f + n28 + 21.0f * n22) / 20.0f;
        final float n30 = (n20 * 40.0f + n28 + n22) / 20.0f;
        final float n31 = (float)Math.atan2(n27, n26) * 180.0f / 3.1415927f;
        float n32;
        if (n31 < 0.0f) {
            n32 = n31 + 360.0f;
        }
        else {
            n32 = n31;
            if (n31 >= 360.0f) {
                n32 = n31 - 360.0f;
            }
        }
        final float n33 = 3.1415927f * n32 / 180.0f;
        final float n34 = (float)Math.pow(n30 * l.f() / l.a(), l.b() * l.j()) * 100.0f;
        final float n35 = 4.0f / l.b();
        final float n36 = (float)Math.sqrt(n34 / 100.0f);
        final float a2 = l.a();
        final float d = l.d();
        float n37;
        if (n32 < 20.14) {
            n37 = 360.0f + n32;
        }
        else {
            n37 = n32;
        }
        final float n38 = (float)Math.pow(1.64 - Math.pow(0.29, l.e()), 0.73) * (float)Math.pow((float)(Math.cos(n37 * 3.141592653589793 / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f * l.g() * l.h() * (float)Math.sqrt(n26 * n26 + n27 * n27) / (n29 + 0.305f), 0.9);
        final float n39 = n38 * (float)Math.sqrt(n34 / 100.0);
        final float n40 = n39 * l.d();
        final float n41 = (float)Math.sqrt(n38 * l.b() / (l.a() + 4.0f));
        final float n42 = 1.7f * n34 / (0.007f * n34 + 1.0f);
        final float n43 = (float)Math.log(0.0228f * n40 + 1.0f) * 43.85965f;
        final double n44 = n33;
        return new a(n32, n39, n34, d * (n35 * n36 * (a2 + 4.0f)), n40, n41 * 50.0f, n42, n43 * (float)Math.cos(n44), n43 * (float)Math.sin(n44));
    }
    
    public static a e(final float n, final float n2, final float n3) {
        return f(n, n2, n3, l.k);
    }
    
    public static a f(final float n, final float n2, final float n3, final l l) {
        final float n4 = 4.0f / l.b();
        final double n5 = n / 100.0;
        final float n6 = (float)Math.sqrt(n5);
        final float a = l.a();
        final float d = l.d();
        final float n7 = n2 * l.d();
        final float n8 = (float)Math.sqrt(n2 / (float)Math.sqrt(n5) * l.b() / (l.a() + 4.0f));
        final float n9 = 3.1415927f * n3 / 180.0f;
        final float n10 = 1.7f * n / (0.007f * n + 1.0f);
        final float n11 = (float)Math.log(n7 * 0.0228 + 1.0) * 43.85965f;
        final double n12 = n9;
        return new a(n3, n2, n, n4 * n6 * (a + 4.0f) * d, n7, n8 * 50.0f, n10, n11 * (float)Math.cos(n12), n11 * (float)Math.sin(n12));
    }
    
    public static int m(final float n, final float n2, final float n3) {
        return n(n, n2, n3, l.k);
    }
    
    public static int n(float b, float n, final float n2, final l l) {
        if (n < 1.0 || Math.round(n2) <= 0.0 || Math.round(n2) >= 100.0) {
            return b.a(n2);
        }
        float min;
        if (b < 0.0f) {
            min = 0.0f;
        }
        else {
            min = Math.min(360.0f, b);
        }
        a a = null;
        int n3 = 1;
        final float n4 = 0.0f;
        b = n;
        float n5 = n;
        n = n4;
        while (Math.abs(n - n5) >= 0.4f) {
            final a b2 = b(min, b, n2);
            if (n3 != 0) {
                if (b2 != null) {
                    return b2.o(l);
                }
                b = (n5 - n) / 2.0f + n;
                n3 = 0;
            }
            else {
                if (b2 == null) {
                    n5 = b;
                }
                else {
                    a = b2;
                    n = b;
                }
                b = (n5 - n) / 2.0f + n;
            }
        }
        if (a == null) {
            return b.a(n2);
        }
        return a.o(l);
    }
    
    public float a(final a a) {
        final float n = this.l() - a.l();
        final float n2 = this.g() - a.g();
        final float n3 = this.h() - a.h();
        return (float)(Math.pow(Math.sqrt(n * n + n2 * n2 + n3 * n3), 0.63) * 1.41);
    }
    
    public float g() {
        return this.h;
    }
    
    public float h() {
        return this.i;
    }
    
    public float i() {
        return this.b;
    }
    
    public float j() {
        return this.a;
    }
    
    public float k() {
        return this.c;
    }
    
    public float l() {
        return this.g;
    }
    
    public int o(final l l) {
        float n;
        if (this.i() != 0.0 && this.k() != 0.0) {
            n = this.i() / (float)Math.sqrt(this.k() / 100.0);
        }
        else {
            n = 0.0f;
        }
        final float n2 = (float)Math.pow(n / Math.pow(1.64 - Math.pow(0.29, l.e()), 0.73), 1.1111111111111112);
        final double n3 = this.j() * 3.1415927f / 180.0f;
        final float n4 = (float)(Math.cos(2.0 + n3) + 3.8);
        final float a = l.a();
        final float n5 = (float)Math.pow(this.k() / 100.0, 1.0 / l.b() / l.j());
        final float g = l.g();
        final float h = l.h();
        final float n6 = a * n5 / l.f();
        final float n7 = (float)Math.sin(n3);
        final float n8 = (float)Math.cos(n3);
        final float n9 = (0.305f + n6) * 23.0f * n2 / (n4 * 0.25f * 3846.1538f * g * h * 23.0f + 11.0f * n2 * n8 + n2 * 108.0f * n7);
        final float n10 = n8 * n9;
        final float n11 = n9 * n7;
        final float n12 = n6 * 460.0f;
        final float f = (451.0f * n10 + n12 + 288.0f * n11) / 1403.0f;
        final float f2 = (n12 - 891.0f * n10 - 261.0f * n11) / 1403.0f;
        final float f3 = (n12 - n10 * 220.0f - n11 * 6300.0f) / 1403.0f;
        final float n13 = (float)Math.max(0.0, Math.abs(f) * 27.13 / (400.0 - Math.abs(f)));
        final float signum = Math.signum(f);
        final float n14 = 100.0f / l.c();
        final float n15 = (float)Math.pow(n13, 2.380952380952381);
        final float n16 = (float)Math.max(0.0, Math.abs(f2) * 27.13 / (400.0 - Math.abs(f2)));
        final float signum2 = Math.signum(f2);
        final float n17 = 100.0f / l.c();
        final float n18 = (float)Math.pow(n16, 2.380952380952381);
        final float n19 = (float)Math.max(0.0, Math.abs(f3) * 27.13 / (400.0 - Math.abs(f3)));
        final float signum3 = Math.signum(f3);
        final float n20 = 100.0f / l.c();
        final float n21 = (float)Math.pow(n19, 2.380952380952381);
        final float n22 = signum * n14 * n15 / l.i()[0];
        final float n23 = signum2 * n17 * n18 / l.i()[1];
        final float n24 = signum3 * n20 * n21 / l.i()[2];
        final float[][] b = z.b.b;
        final float[] array = b[0];
        final float n25 = array[0];
        final float n26 = array[1];
        final float n27 = array[2];
        final float[] array2 = b[1];
        final float n28 = array2[0];
        final float n29 = array2[1];
        final float n30 = array2[2];
        final float[] array3 = b[2];
        return A.a.a(n25 * n22 + n26 * n23 + n27 * n24, n28 * n22 + n29 * n23 + n30 * n24, n22 * array3[0] + n23 * array3[1] + n24 * array3[2]);
    }
    
    public int p() {
        return this.o(l.k);
    }
}
