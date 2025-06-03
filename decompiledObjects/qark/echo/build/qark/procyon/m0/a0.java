// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import g0.M;
import Z2.d;
import java.math.RoundingMode;
import a3.f;

public class a0 implements e
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    
    public a0(final a a) {
        this.b = a.a(a);
        this.c = a.b(a);
        this.d = a.c(a);
        this.e = a.d(a);
        this.f = a.e(a);
        this.g = a.f(a);
        this.h = a.g(a);
    }
    
    public static int b(final int n, final int n2, final int n3) {
        return a3.f.d(n * (long)n2 * n3 / 1000000L);
    }
    
    public static int d(final int n) {
        if (n != 20) {
            if (n != 30) {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                throw new IllegalArgumentException();
                            }
                            case 17: {
                                return 336000;
                            }
                            case 16: {
                                return 256000;
                            }
                            case 15: {
                                return 8000;
                            }
                            case 14: {
                                return 3062500;
                            }
                            case 18: {
                                return 768000;
                            }
                        }
                        break;
                    }
                    case 12: {
                        return 7000;
                    }
                    case 11: {
                        return 16000;
                    }
                    case 10: {
                        return 100000;
                    }
                    case 9: {
                        return 40000;
                    }
                    case 7: {
                        return 192000;
                    }
                    case 6: {
                        return 768000;
                    }
                    case 5: {
                        return 80000;
                    }
                    case 8: {
                        break;
                    }
                }
            }
            return 2250000;
        }
        return 63750;
    }
    
    @Override
    public int a(final int a, final int n, final int n2, final int n3, final int n4, final int n5, final double n6) {
        return (Math.max(a, (int)(this.c(a, n, n2, n3, n4, n5) * n6)) + n3 - 1) / n3 * n3;
    }
    
    public int c(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n3 == 0) {
            return this.g(n, n5, n4);
        }
        if (n3 == 1) {
            return this.e(n2);
        }
        if (n3 == 2) {
            return this.f(n2, n6);
        }
        throw new IllegalArgumentException();
    }
    
    public int e(int d) {
        d = d(d);
        return a3.f.d(this.f * (long)d / 1000000L);
    }
    
    public int f(int n, final int n2) {
        final int e = this.e;
        int n4 = 0;
        Label_0041: {
            int n3;
            if (n == 5) {
                n3 = this.g;
            }
            else {
                n4 = e;
                if (n != 8) {
                    break Label_0041;
                }
                n3 = this.h;
            }
            n4 = e * n3;
        }
        if (n2 != -1) {
            n = Z2.d.b(n2, 8, RoundingMode.CEILING);
        }
        else {
            n = d(n);
        }
        return a3.f.d(n4 * (long)n / 1000000L);
    }
    
    public int g(final int n, final int n2, final int n3) {
        return g0.M.p(n * this.d, b(this.b, n2, n3), b(this.c, n2, n3));
    }
    
    public static class a
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        
        public a() {
            this.a = 250000;
            this.b = 750000;
            this.c = 4;
            this.d = 250000;
            this.e = 50000000;
            this.f = 2;
            this.g = 4;
        }
        
        public static /* synthetic */ int a(final a a) {
            return a.a;
        }
        
        public static /* synthetic */ int b(final a a) {
            return a.b;
        }
        
        public static /* synthetic */ int c(final a a) {
            return a.c;
        }
        
        public static /* synthetic */ int d(final a a) {
            return a.d;
        }
        
        public static /* synthetic */ int e(final a a) {
            return a.e;
        }
        
        public static /* synthetic */ int f(final a a) {
            return a.f;
        }
        
        public static /* synthetic */ int g(final a a) {
            return a.g;
        }
        
        public a0 h() {
            return new a0(this);
        }
    }
}
