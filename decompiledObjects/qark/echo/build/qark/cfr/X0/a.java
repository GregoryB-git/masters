/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayDeque
 */
package X0;

import F0.s;
import X0.c;
import X0.g;
import d0.A;
import java.util.ArrayDeque;

public final class a
implements c {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final g c = new g();
    public X0.b d;
    public int e;
    public int f;
    public long g;

    public static String g(s s8, int n8) {
        if (n8 == 0) {
            return "";
        }
        byte[] arrby = new byte[n8];
        s8.readFully(arrby, 0, n8);
        while (n8 > 0 && arrby[n8 - 1] == 0) {
            --n8;
        }
        return new String(arrby, 0, n8);
    }

    public final long a(s s8) {
        s8.h();
        do {
            int n8;
            s8.n(this.a, 0, 4);
            int n9 = g.c(this.a[0]);
            if (n9 != -1 && n9 <= 4 && this.d.d(n8 = (int)g.a(this.a, n9, false))) {
                s8.i(n9);
                return n8;
            }
            s8.i(1);
        } while (true);
    }

    @Override
    public void b() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }

    @Override
    public boolean c(s s8) {
        g0.a.h(this.d);
        do {
            long l8;
            b b8;
            int n8;
            long l9;
            if ((b8 = (b)this.b.peek()) != null && s8.p() >= b8.b) {
                this.d.a(((b)this.b.pop()).a);
                return true;
            }
            if (this.e == 0) {
                l8 = l9 = this.c.d(s8, true, false, 4);
                if (l9 == -2L) {
                    l8 = this.a(s8);
                }
                if (l8 == -1L) {
                    return false;
                }
                this.f = (int)l8;
                this.e = 1;
            }
            if (this.e == 1) {
                this.g = this.c.d(s8, false, true, 8);
                this.e = 2;
            }
            if ((n8 = this.d.b(this.f)) != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        if (n8 != 3) {
                            if (n8 != 4) {
                                if (n8 == 5) {
                                    l8 = this.g;
                                    if (l8 != 4L && l8 != 8L) {
                                        s8 = new StringBuilder();
                                        s8.append("Invalid float size: ");
                                        s8.append(this.g);
                                        throw A.a(s8.toString(), null);
                                    }
                                    this.d.c(this.f, this.e(s8, (int)l8));
                                    this.e = 0;
                                    return true;
                                }
                                s8 = new StringBuilder();
                                s8.append("Invalid element type ");
                                s8.append(n8);
                                throw A.a(s8.toString(), null);
                            }
                            this.d.e(this.f, (int)this.g, s8);
                            this.e = 0;
                            return true;
                        }
                        l8 = this.g;
                        if (l8 <= Integer.MAX_VALUE) {
                            this.d.f(this.f, a.g(s8, (int)l8));
                            this.e = 0;
                            return true;
                        }
                        s8 = new StringBuilder();
                        s8.append("String element size: ");
                        s8.append(this.g);
                        throw A.a(s8.toString(), null);
                    }
                    l8 = this.g;
                    if (l8 <= 8L) {
                        this.d.h(this.f, this.f(s8, (int)l8));
                        this.e = 0;
                        return true;
                    }
                    s8 = new StringBuilder();
                    s8.append("Invalid integer size: ");
                    s8.append(this.g);
                    throw A.a(s8.toString(), null);
                }
                l8 = s8.p();
                l9 = this.g;
                this.b.push((Object)new b(this.f, l9 + l8, null));
                this.d.g(this.f, l8, this.g);
                this.e = 0;
                return true;
            }
            s8.i((int)this.g);
            this.e = 0;
        } while (true);
    }

    @Override
    public void d(X0.b b8) {
        this.d = b8;
    }

    public final double e(s s8, int n8) {
        long l8 = this.f(s8, n8);
        if (n8 == 4) {
            return Float.intBitsToFloat((int)((int)l8));
        }
        return Double.longBitsToDouble((long)l8);
    }

    public final long f(s s8, int n8) {
        byte[] arrby = this.a;
        s8.readFully(arrby, 0, n8);
        long l8 = 0L;
        for (int i8 = 0; i8 < n8; ++i8) {
            l8 = l8 << 8 | (long)(this.a[i8] & 255);
        }
        return l8;
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int n8, long l8) {
            this.a = n8;
            this.b = l8;
        }

        public /* synthetic */ b(int n8, long l8,  a8) {
            this(n8, l8);
        }
    }

}

