// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

import java.util.Arrays;

public class e
{
    public final CharSequence a;
    public final int b;
    public final int c;
    public final byte[] d;
    
    public e(final CharSequence a, final int c, final int b) {
        this.a = a;
        this.c = c;
        this.b = b;
        Arrays.fill(this.d = new byte[c * b], (byte)(-1));
    }
    
    public final void a(final int n) {
        this.g(this.b - 1, 0, n, 1);
        this.g(this.b - 1, 1, n, 2);
        this.g(this.b - 1, 2, n, 3);
        this.g(0, this.c - 2, n, 4);
        this.g(0, this.c - 1, n, 5);
        this.g(1, this.c - 1, n, 6);
        this.g(2, this.c - 1, n, 7);
        this.g(3, this.c - 1, n, 8);
    }
    
    public final void b(final int n) {
        this.g(this.b - 3, 0, n, 1);
        this.g(this.b - 2, 0, n, 2);
        this.g(this.b - 1, 0, n, 3);
        this.g(0, this.c - 4, n, 4);
        this.g(0, this.c - 3, n, 5);
        this.g(0, this.c - 2, n, 6);
        this.g(0, this.c - 1, n, 7);
        this.g(1, this.c - 1, n, 8);
    }
    
    public final void c(final int n) {
        this.g(this.b - 3, 0, n, 1);
        this.g(this.b - 2, 0, n, 2);
        this.g(this.b - 1, 0, n, 3);
        this.g(0, this.c - 2, n, 4);
        this.g(0, this.c - 1, n, 5);
        this.g(1, this.c - 1, n, 6);
        this.g(2, this.c - 1, n, 7);
        this.g(3, this.c - 1, n, 8);
    }
    
    public final void d(final int n) {
        this.g(this.b - 1, 0, n, 1);
        this.g(this.b - 1, this.c - 1, n, 2);
        this.g(0, this.c - 3, n, 3);
        this.g(0, this.c - 2, n, 4);
        this.g(0, this.c - 1, n, 5);
        this.g(1, this.c - 3, n, 6);
        this.g(1, this.c - 2, n, 7);
        this.g(1, this.c - 1, n, 8);
    }
    
    public final boolean e(final int n, final int n2) {
        return this.d[n2 * this.c + n] == 1;
    }
    
    public final boolean f(final int n, final int n2) {
        return this.d[n2 * this.c + n] >= 0;
    }
    
    public final void g(int n, int c, int char1, final int n2) {
        int n3 = n;
        int n4 = c;
        if (n < 0) {
            final int b = this.b;
            n3 = n + b;
            n4 = c + (4 - (b + 4) % 8);
        }
        c = n3;
        if ((n = n4) < 0) {
            c = this.c;
            n = n4 + c;
            c = n3 + (4 - (c + 4) % 8);
        }
        char1 = this.a.charAt(char1);
        boolean b2 = true;
        if ((char1 & 1 << 8 - n2) == 0x0) {
            b2 = false;
        }
        this.i(n, c, b2);
    }
    
    public final void h() {
        int n = 0;
        int n2 = 0;
        int n3 = 4;
        int b;
        int c;
        while (true) {
            int n4 = n2;
            if (n3 == this.b) {
                n4 = n2;
                if (n == 0) {
                    this.a(n2);
                    n4 = n2 + 1;
                }
            }
            int n5 = n4;
            if (n3 == this.b - 2) {
                n5 = n4;
                if (n == 0) {
                    n5 = n4;
                    if (this.c % 4 != 0) {
                        this.b(n4);
                        n5 = n4 + 1;
                    }
                }
            }
            int n6 = n5;
            if (n3 == this.b - 2) {
                n6 = n5;
                if (n == 0) {
                    n6 = n5;
                    if (this.c % 8 == 4) {
                        this.c(n5);
                        n6 = n5 + 1;
                    }
                }
            }
            int n7 = n;
            int n8 = n6;
            int n9;
            if ((n9 = n3) == this.b + 4) {
                n7 = n;
                n8 = n6;
                n9 = n3;
                if (n == 2) {
                    n7 = n;
                    n8 = n6;
                    n9 = n3;
                    if (this.c % 8 == 0) {
                        this.d(n6);
                        n8 = n6 + 1;
                        n9 = n3;
                        n7 = n;
                    }
                }
            }
            int n10;
            while (true) {
                n10 = n8;
                if (n9 < this.b) {
                    n10 = n8;
                    if (n7 >= 0) {
                        n10 = n8;
                        if (!this.f(n7, n9)) {
                            this.j(n9, n7, n8);
                            n10 = n8 + 1;
                        }
                    }
                }
                final int n11 = n9 - 2;
                final int n12 = n7 + 2;
                if (n11 < 0 || n12 >= this.c) {
                    break;
                }
                n9 = n11;
                n7 = n12;
                n8 = n10;
            }
            int n13 = n9 - 1;
            final int n14 = n7 + 5;
            int n15 = n10;
            int n16 = n14;
            int n17;
            while (true) {
                n17 = n15;
                if (n13 >= 0) {
                    n17 = n15;
                    if (n16 < this.c) {
                        n17 = n15;
                        if (!this.f(n16, n13)) {
                            this.j(n13, n16, n15);
                            n17 = n15 + 1;
                        }
                    }
                }
                final int n18 = n13 + 2;
                final int n19 = n16 - 2;
                b = this.b;
                if (n18 >= b || n19 < 0) {
                    break;
                }
                n13 = n18;
                n16 = n19;
                n15 = n17;
            }
            final int n20 = n13 + 5;
            final int n21 = n = n16 - 1;
            n2 = n17;
            if ((n3 = n20) >= b) {
                c = this.c;
                n = n21;
                n2 = n17;
                n3 = n20;
                if (n21 >= c) {
                    break;
                }
                continue;
            }
        }
        if (!this.f(c - 1, b - 1)) {
            this.i(this.c - 1, this.b - 1, true);
            this.i(this.c - 2, this.b - 2, true);
        }
    }
    
    public final void i(final int n, final int n2, final boolean b) {
        this.d[n2 * this.c + n] = (byte)(b ? 1 : 0);
    }
    
    public final void j(final int n, final int n2, final int n3) {
        final int n4 = n - 2;
        final int n5 = n2 - 2;
        this.g(n4, n5, n3, 1);
        final int n6 = n2 - 1;
        this.g(n4, n6, n3, 2);
        final int n7 = n - 1;
        this.g(n7, n5, n3, 3);
        this.g(n7, n6, n3, 4);
        this.g(n7, n2, n3, 5);
        this.g(n, n5, n3, 6);
        this.g(n, n6, n3, 7);
        this.g(n, n2, n3, 8);
    }
}
