/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Arrays
 */
package D0;

import java.util.Arrays;

public final class i {
    public a a = new a();
    public a b = new a();
    public boolean c;
    public boolean d;
    public long e = -9223372036854775807L;
    public int f;

    public long a() {
        if (this.e()) {
            return this.a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (this.e()) {
            return (float)(1.0E9 / (double)this.a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f;
    }

    public long d() {
        if (this.e()) {
            return this.a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.a.e();
    }

    public void f(long l8) {
        this.a.f(l8);
        boolean bl = this.a.e();
        int n8 = 0;
        if (bl && !this.d) {
            this.c = false;
        } else if (this.e != -9223372036854775807L) {
            if (!this.c || this.b.d()) {
                this.b.g();
                this.b.f(this.e);
            }
            this.c = true;
            this.b.f(l8);
        }
        if (this.c && this.b.e()) {
            a a8 = this.a;
            this.a = this.b;
            this.b = a8;
            this.c = false;
            this.d = false;
        }
        this.e = l8;
        if (!this.a.e()) {
            n8 = this.f + 1;
        }
        this.f = n8;
    }

    public void g() {
        this.a.g();
        this.b.g();
        this.c = false;
        this.e = -9223372036854775807L;
        this.f = 0;
    }

    public static final class a {
        public long a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g = new boolean[15];
        public int h;

        public static int c(long l8) {
            return (int)(l8 % 15L);
        }

        public long a() {
            long l8 = this.e;
            if (l8 == 0L) {
                return 0L;
            }
            return this.f / l8;
        }

        public long b() {
            return this.f;
        }

        public boolean d() {
            long l8 = this.d;
            if (l8 == 0L) {
                return false;
            }
            return this.g[a.c(l8 - 1L)];
        }

        public boolean e() {
            if (this.d > 15L && this.h == 0) {
                return true;
            }
            return false;
        }

        /*
         * Enabled aggressive block sorting
         */
        public void f(long l8) {
            block3 : {
                int n8;
                block6 : {
                    block5 : {
                        long l9;
                        block4 : {
                            block2 : {
                                l9 = this.d;
                                if (l9 != 0L) break block2;
                                this.a = l8;
                                break block3;
                            }
                            if (l9 != 1L) break block4;
                            this.b = l9 = l8 - this.a;
                            this.f = l9;
                            this.e = 1L;
                            break block3;
                        }
                        long l10 = l8 - this.c;
                        n8 = a.c(l9);
                        if (Math.abs((long)(l10 - this.b)) > 1000000L) break block5;
                        ++this.e;
                        this.f += l10;
                        boolean[] arrbl = this.g;
                        if (!arrbl[n8]) break block3;
                        arrbl[n8] = false;
                        n8 = this.h - 1;
                        break block6;
                    }
                    boolean[] arrbl = this.g;
                    if (arrbl[n8]) break block3;
                    arrbl[n8] = true;
                    n8 = this.h + 1;
                }
                this.h = n8;
            }
            ++this.d;
            this.c = l8;
        }

        public void g() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill((boolean[])this.g, (boolean)false);
        }
    }

}

