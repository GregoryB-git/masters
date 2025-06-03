/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 *  java.util.Random
 */
package x0;

import java.util.Arrays;
import java.util.Random;

public interface T {
    public int a();

    public T b(int var1, int var2);

    public int c(int var1);

    public T d(int var1, int var2);

    public int e();

    public int f(int var1);

    public int g();

    public T h();

    public static class a
    implements T {
        public final Random a;
        public final int[] b;
        public final int[] c;

        public a(int n8) {
            this(n8, new Random());
        }

        public a(int n8, Random random) {
            this(a.i(n8, random), random);
        }

        public a(int[] arrn, long l8) {
            this(Arrays.copyOf((int[])arrn, (int)arrn.length), new Random(l8));
        }

        public a(int[] arrn, Random random) {
            this.b = arrn;
            this.a = random;
            this.c = new int[arrn.length];
            int n8 = 0;
            while (n8 < arrn.length) {
                this.c[arrn[n8]] = n8++;
            }
        }

        public static int[] i(int n8, Random random) {
            int[] arrn = new int[n8];
            int n9 = 0;
            while (n9 < n8) {
                int n10 = n9 + 1;
                int n11 = random.nextInt(n10);
                arrn[n9] = arrn[n11];
                arrn[n11] = n9;
                n9 = n10;
            }
            return arrn;
        }

        @Override
        public int a() {
            return this.b.length;
        }

        @Override
        public T b(int n8, int n9) {
            int[] arrn;
            int n10 = n9 - n8;
            int[] arrn2 = new int[this.b.length - n10];
            int n11 = 0;
            for (int i8 = 0; i8 < (arrn = this.b).length; ++i8) {
                int n12 = arrn[i8];
                if (n12 >= n8 && n12 < n9) {
                    ++n11;
                    continue;
                }
                int n13 = n12;
                if (n12 >= n8) {
                    n13 = n12 - n10;
                }
                arrn2[i8 - n11] = n13;
            }
            return new a(arrn2, new Random(this.a.nextLong()));
        }

        @Override
        public int c(int n8) {
            int[] arrn = this.b;
            if ((n8 = this.c[n8] + 1) < arrn.length) {
                return arrn[n8];
            }
            return -1;
        }

        @Override
        public T d(int n8, int n9) {
            int n10;
            Random random;
            int[] arrn;
            int n11;
            int[] arrn2 = new int[n9];
            int[] arrn3 = new int[n9];
            int n12 = 0;
            int n13 = 0;
            while (n13 < n9) {
                arrn2[n13] = this.a.nextInt(this.b.length + 1);
                random = this.a;
                n11 = n13 + 1;
                n10 = random.nextInt(n11);
                arrn3[n13] = arrn3[n10];
                arrn3[n10] = n13 + n8;
                n13 = n11;
            }
            Arrays.sort((int[])arrn2);
            random = new int[this.b.length + n9];
            n11 = n10 = 0;
            for (n13 = n12; n13 < (arrn = this.b).length + n9; ++n13) {
                if (n10 < n9 && n11 == arrn2[n10]) {
                    random[n13] = arrn3[n10];
                    ++n10;
                    continue;
                }
                n12 = arrn[n11];
                random[n13] = n12;
                if (n12 >= n8) {
                    random[n13] = n12 + n9;
                }
                ++n11;
            }
            return new a((int[])random, new Random(this.a.nextLong()));
        }

        @Override
        public int e() {
            int[] arrn = this.b;
            if (arrn.length > 0) {
                return arrn[0];
            }
            return -1;
        }

        @Override
        public int f(int n8) {
            int n9 = this.c[n8];
            n8 = -1;
            if (--n9 >= 0) {
                n8 = this.b[n9];
            }
            return n8;
        }

        @Override
        public int g() {
            int[] arrn = this.b;
            if (arrn.length > 0) {
                return arrn[arrn.length - 1];
            }
            return -1;
        }

        @Override
        public T h() {
            return new a(0, new Random(this.a.nextLong()));
        }
    }

}

