/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package F0;

import F0.W;
import d0.q;
import d0.x;
import g0.M;
import g0.y;
import java.util.Collections;
import java.util.List;

public final class B {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final x l;

    public B(int n8, int n9, int n10, int n11, int n12, int n13, int n14, long l8, a a8, x x8) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
        this.d = n11;
        this.e = n12;
        this.f = B.j(n12);
        this.g = n13;
        this.h = n14;
        this.i = B.e(n14);
        this.j = l8;
        this.k = a8;
        this.l = x8;
    }

    public B(byte[] object, int n8) {
        object = new y((byte[])object);
        object.p(n8 * 8);
        this.a = object.h(16);
        this.b = object.h(16);
        this.c = object.h(24);
        this.d = object.h(24);
        this.e = n8 = object.h(20);
        this.f = B.j(n8);
        this.g = object.h(3) + 1;
        this.h = n8 = object.h(5) + 1;
        this.i = B.e(n8);
        this.j = object.j(36);
        this.k = null;
        this.l = null;
    }

    public static int e(int n8) {
        if (n8 != 8) {
            if (n8 != 12) {
                if (n8 != 16) {
                    if (n8 != 20) {
                        if (n8 != 24) {
                            return -1;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int j(int n8) {
        switch (n8) {
            default: {
                return -1;
            }
            case 192000: {
                return 3;
            }
            case 176400: {
                return 2;
            }
            case 96000: {
                return 11;
            }
            case 88200: {
                return 1;
            }
            case 48000: {
                return 10;
            }
            case 44100: {
                return 9;
            }
            case 32000: {
                return 8;
            }
            case 24000: {
                return 7;
            }
            case 22050: {
                return 6;
            }
            case 16000: {
                return 5;
            }
            case 8000: 
        }
        return 4;
    }

    public B a(List object) {
        object = this.h(new x((List)object));
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, (x)object);
    }

    public B b(a a8) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, a8, this.l);
    }

    public B c(List object) {
        object = this.h(W.d((List)object));
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, (x)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long d() {
        long l8;
        long l9;
        int n8 = this.d;
        if (n8 > 0) {
            l8 = ((long)n8 + (long)this.c) / 2L;
            l9 = 1L;
            do {
                return l8 + l9;
                break;
            } while (true);
        }
        n8 = this.a;
        l8 = n8 == this.b && n8 > 0 ? (long)n8 : 4096L;
        l8 = l8 * (long)this.g * (long)this.h / 8L;
        l9 = 64L;
        return l8 + l9;
    }

    public long f() {
        long l8 = this.j;
        if (l8 == 0L) {
            return -9223372036854775807L;
        }
        return l8 * 1000000L / (long)this.e;
    }

    public q g(byte[] arrby, x x8) {
        arrby[4] = -128;
        int n8 = this.d;
        if (n8 <= 0) {
            n8 = -1;
        }
        x8 = this.h(x8);
        return new q.b().o0("audio/flac").f0(n8).N(this.g).p0(this.e).i0(M.e0(this.h)).b0(Collections.singletonList((Object)arrby)).h0(x8).K();
    }

    public x h(x x8) {
        x x9 = this.l;
        if (x9 == null) {
            return x8;
        }
        return x9.b(x8);
    }

    public long i(long l8) {
        return M.q(l8 * (long)this.e / 1000000L, 0L, this.j - 1L);
    }

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] arrl, long[] arrl2) {
            this.a = arrl;
            this.b = arrl2;
        }
    }

}

