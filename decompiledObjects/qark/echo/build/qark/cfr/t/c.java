/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 */
package t;

public final class c {
    public int[] a;
    public int b;
    public int c;
    public int d;

    public c() {
        this(8);
    }

    public c(int n8) {
        if (n8 >= 1) {
            if (n8 <= 1073741824) {
                int n9 = n8;
                if (Integer.bitCount((int)n8) != 1) {
                    n9 = Integer.highestOneBit((int)(n8 - 1)) << 1;
                }
                this.d = n9 - 1;
                this.a = new int[n9];
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        throw new IllegalArgumentException("capacity must be >= 1");
    }

    public void a(int n8) {
        int[] arrn = this.a;
        int n9 = this.c;
        arrn[n9] = n8;
        this.c = n8 = this.d & n9 + 1;
        if (n8 == this.b) {
            this.c();
        }
    }

    public void b() {
        this.c = this.b;
    }

    public final void c() {
        int[] arrn = this.a;
        int n8 = arrn.length;
        int n9 = this.b;
        int n10 = n8 - n9;
        int n11 = n8 << 1;
        if (n11 >= 0) {
            int[] arrn2 = new int[n11];
            System.arraycopy((Object)arrn, (int)n9, (Object)arrn2, (int)0, (int)n10);
            System.arraycopy((Object)this.a, (int)0, (Object)arrn2, (int)n10, (int)this.b);
            this.a = arrn2;
            this.b = 0;
            this.c = n8;
            this.d = n11 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public boolean d() {
        if (this.b == this.c) {
            return true;
        }
        return false;
    }

    public int e() {
        int n8 = this.b;
        if (n8 != this.c) {
            int n9 = this.a[n8];
            this.b = n8 + 1 & this.d;
            return n9;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}

