// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.util.Arrays;
import java.util.Random;

public interface T
{
    int a();
    
    T b(final int p0, final int p1);
    
    int c(final int p0);
    
    T d(final int p0, final int p1);
    
    int e();
    
    int f(final int p0);
    
    int g();
    
    T h();
    
    public static class a implements T
    {
        public final Random a;
        public final int[] b;
        public final int[] c;
        
        public a(final int n) {
            this(n, new Random());
        }
        
        public a(final int n, final Random random) {
            this(i(n, random), random);
        }
        
        public a(final int[] original, final long seed) {
            this(Arrays.copyOf(original, original.length), new Random(seed));
        }
        
        public a(final int[] b, final Random a) {
            this.b = b;
            this.a = a;
            this.c = new int[b.length];
            for (int i = 0; i < b.length; ++i) {
                this.c[b[i]] = i;
            }
        }
        
        public static int[] i(final int n, final Random random) {
            final int[] array = new int[n];
            int bound;
            for (int i = 0; i < n; i = bound) {
                bound = i + 1;
                final int nextInt = random.nextInt(bound);
                array[i] = array[nextInt];
                array[nextInt] = i;
            }
            return array;
        }
        
        @Override
        public int a() {
            return this.b.length;
        }
        
        @Override
        public T b(final int n, final int n2) {
            final int n3 = n2 - n;
            final int[] array = new int[this.b.length - n3];
            int n4 = 0;
            int n5 = 0;
            while (true) {
                final int[] b = this.b;
                if (n4 >= b.length) {
                    break;
                }
                final int n6 = b[n4];
                if (n6 >= n && n6 < n2) {
                    ++n5;
                }
                else {
                    int n7;
                    if ((n7 = n6) >= n) {
                        n7 = n6 - n3;
                    }
                    array[n4 - n5] = n7;
                }
                ++n4;
            }
            return new a(array, new Random(this.a.nextLong()));
        }
        
        @Override
        public int c(int n) {
            n = this.c[n] + 1;
            final int[] b = this.b;
            if (n < b.length) {
                return b[n];
            }
            return -1;
        }
        
        @Override
        public T d(final int n, final int n2) {
            final int[] a = new int[n2];
            final int[] array = new int[n2];
            final int n3 = 0;
            int bound;
            for (int i = 0; i < n2; i = bound) {
                a[i] = this.a.nextInt(this.b.length + 1);
                final Random a2 = this.a;
                bound = i + 1;
                final int nextInt = a2.nextInt(bound);
                array[i] = array[nextInt];
                array[nextInt] = i + n;
            }
            Arrays.sort(a);
            final int[] array2 = new int[this.b.length + n2];
            int n5;
            int n4 = n5 = 0;
            int n6 = n3;
            while (true) {
                final int[] b = this.b;
                if (n6 >= b.length + n2) {
                    break;
                }
                if (n4 < n2 && n5 == a[n4]) {
                    array2[n6] = array[n4];
                    ++n4;
                }
                else {
                    final int n7 = b[n5];
                    if ((array2[n6] = n7) >= n) {
                        array2[n6] = n7 + n2;
                    }
                    ++n5;
                }
                ++n6;
            }
            return new a(array2, new Random(this.a.nextLong()));
        }
        
        @Override
        public int e() {
            final int[] b = this.b;
            if (b.length > 0) {
                return b[0];
            }
            return -1;
        }
        
        @Override
        public int f(int n) {
            final int n2 = this.c[n];
            n = -1;
            final int n3 = n2 - 1;
            if (n3 >= 0) {
                n = this.b[n3];
            }
            return n;
        }
        
        @Override
        public int g() {
            final int[] b = this.b;
            if (b.length > 0) {
                return b[b.length - 1];
            }
            return -1;
        }
        
        @Override
        public T h() {
            return new a(0, new Random(this.a.nextLong()));
        }
    }
}
