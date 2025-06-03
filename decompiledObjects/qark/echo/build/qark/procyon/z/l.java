// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z;

public final class l
{
    public static final l k;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float[] g;
    public final float h;
    public final float i;
    public final float j;
    
    static {
        k = k(b.c, (float)(b.h(50.0f) * 63.66197723675813 / 100.0), 50.0f, 2.0f, false);
    }
    
    public l(final float f, final float a, final float b, final float c, final float d, final float e, final float[] g, final float h, final float i, final float j) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public static l k(float[] array, float n, float n2, float n3, final boolean b) {
        final float[][] a = b.a;
        final float n4 = array[0];
        final float[] array2 = a[0];
        final float n5 = array2[0];
        final float n6 = array[1];
        final float n7 = array2[1];
        final float n8 = array[2];
        final float n9 = n5 * n4 + n7 * n6 + array2[2] * n8;
        final float[] array3 = a[1];
        final float n10 = array3[0] * n4 + array3[1] * n6 + array3[2] * n8;
        final float[] array4 = a[2];
        final float n11 = n4 * array4[0] + n6 * array4[1] + n8 * array4[2];
        final float n12 = n3 / 10.0f + 0.8f;
        float n13;
        if (n12 >= 0.9) {
            n13 = b.d(0.59f, 0.69f, (n12 - 0.9f) * 10.0f);
        }
        else {
            n13 = b.d(0.525f, 0.59f, (n12 - 0.8f) * 10.0f);
        }
        if (b) {
            n3 = 1.0f;
        }
        else {
            n3 = (1.0f - (float)Math.exp((-n - 42.0f) / 92.0f) * 0.2777778f) * n12;
        }
        final double n14 = n3;
        if (n14 > 1.0) {
            n3 = 1.0f;
        }
        else if (n14 < 0.0) {
            n3 = 0.0f;
        }
        final float[] array5 = { 100.0f / n9 * n3 + 1.0f - n3, 100.0f / n10 * n3 + 1.0f - n3, 100.0f / n11 * n3 + 1.0f - n3 };
        n3 = 1.0f / (5.0f * n + 1.0f);
        n3 *= n3 * n3 * n3;
        final float n15 = 1.0f - n3;
        n = n3 * n + 0.1f * n15 * n15 * (float)Math.cbrt(n * 5.0);
        n2 = b.h(n2) / array[1];
        final double n16 = n2;
        n3 = (float)Math.sqrt(n16);
        final float n17 = 0.725f / (float)Math.pow(n16, 0.2);
        array = new float[] { (float)Math.pow(array5[0] * n * n9 / 100.0, 0.42), (float)Math.pow(array5[1] * n * n10 / 100.0, 0.42), (float)Math.pow(array5[2] * n * n11 / 100.0, 0.42) };
        final float n18 = array[0];
        final float n19 = n18 * 400.0f / (n18 + 27.13f);
        final float n20 = array[1];
        final float n21 = n20 * 400.0f / (n20 + 27.13f);
        final float n22 = array[2];
        array = new float[] { n19, n21, 400.0f * n22 / (n22 + 27.13f) };
        return new l(n2, (array[0] * 2.0f + array[1] + array[2] * 0.05f) * n17, n17, n17, n13, n12, array5, n, (float)Math.pow(n, 0.25), n3 + 1.48f);
    }
    
    public float a() {
        return this.a;
    }
    
    public float b() {
        return this.d;
    }
    
    public float c() {
        return this.h;
    }
    
    public float d() {
        return this.i;
    }
    
    public float e() {
        return this.f;
    }
    
    public float f() {
        return this.b;
    }
    
    public float g() {
        return this.e;
    }
    
    public float h() {
        return this.c;
    }
    
    public float[] i() {
        return this.g;
    }
    
    public float j() {
        return this.j;
    }
}
