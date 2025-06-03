package ma;

import java.nio.charset.Charset;
import java.util.List;
import ma.b0;

/* loaded from: classes.dex */
public final class j implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final i f11009a;

    /* renamed from: b, reason: collision with root package name */
    public int f11010b;

    /* renamed from: c, reason: collision with root package name */
    public int f11011c;

    /* renamed from: d, reason: collision with root package name */
    public int f11012d = 0;

    public j(i iVar) {
        Charset charset = a0.f10909a;
        if (iVar == null) {
            throw new NullPointerException("input");
        }
        this.f11009a = iVar;
        iVar.f10982d = this;
    }

    public static void y(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.g();
        }
    }

    public static void z(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.g();
        }
    }

    public final int a() {
        int i10 = this.f11012d;
        if (i10 != 0) {
            this.f11010b = i10;
            this.f11012d = 0;
        } else {
            this.f11010b = this.f11009a.x();
        }
        int i11 = this.f11010b;
        if (i11 == 0 || i11 == this.f11011c) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public final <T> void b(T t, i1<T> i1Var, o oVar) {
        int i10 = this.f11011c;
        this.f11011c = ((this.f11010b >>> 3) << 3) | 4;
        try {
            i1Var.i(t, this, oVar);
            if (this.f11010b == this.f11011c) {
            } else {
                throw b0.g();
            }
        } finally {
            this.f11011c = i10;
        }
    }

    public final <T> void c(T t, i1<T> i1Var, o oVar) {
        int y10 = this.f11009a.y();
        i iVar = this.f11009a;
        if (iVar.f10979a >= iVar.f10980b) {
            throw new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int h10 = iVar.h(y10);
        this.f11009a.f10979a++;
        i1Var.i(t, this, oVar);
        this.f11009a.a(0);
        r5.f10979a--;
        this.f11009a.g(h10);
    }

    public final void d(List<Boolean> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof g) {
            g gVar = (g) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    gVar.h(this.f11009a.i());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                gVar.h(this.f11009a.i());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f11009a.i()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Boolean.valueOf(this.f11009a.i()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final h e() {
        w(2);
        return this.f11009a.j();
    }

    public final void f(List<h> list) {
        int x10;
        if ((this.f11010b & 7) != 2) {
            throw b0.d();
        }
        do {
            list.add(e());
            if (this.f11009a.e()) {
                return;
            } else {
                x10 = this.f11009a.x();
            }
        } while (x10 == this.f11010b);
        this.f11012d = x10;
    }

    public final void g(List<Double> list) {
        int x10;
        int x11;
        if (!(list instanceof m)) {
            int i10 = this.f11010b & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.f11009a.k()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i10 != 2) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            int y10 = this.f11009a.y();
            z(y10);
            int d10 = this.f11009a.d() + y10;
            do {
                list.add(Double.valueOf(this.f11009a.k()));
            } while (this.f11009a.d() < d10);
            return;
        }
        m mVar = (m) list;
        int i12 = this.f11010b & 7;
        if (i12 == 1) {
            do {
                mVar.h(this.f11009a.k());
                if (this.f11009a.e()) {
                    return;
                } else {
                    x11 = this.f11009a.x();
                }
            } while (x11 == this.f11010b);
            this.f11012d = x11;
            return;
        }
        if (i12 != 2) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        int y11 = this.f11009a.y();
        z(y11);
        int d11 = this.f11009a.d() + y11;
        do {
            mVar.h(this.f11009a.k());
        } while (this.f11009a.d() < d11);
    }

    public final void h(List<Integer> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof z) {
            z zVar = (z) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    zVar.h(this.f11009a.l());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                zVar.h(this.f11009a.l());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11009a.l()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Integer.valueOf(this.f11009a.l()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final Object i(v1 v1Var, Class<?> cls, o oVar) {
        switch (v1Var.ordinal()) {
            case 0:
                w(1);
                return Double.valueOf(this.f11009a.k());
            case 1:
                w(5);
                return Float.valueOf(this.f11009a.o());
            case 2:
                w(0);
                return Long.valueOf(this.f11009a.q());
            case 3:
                w(0);
                return Long.valueOf(this.f11009a.z());
            case 4:
                w(0);
                return Integer.valueOf(this.f11009a.p());
            case 5:
                w(1);
                return Long.valueOf(this.f11009a.n());
            case 6:
                w(5);
                return Integer.valueOf(this.f11009a.m());
            case 7:
                w(0);
                return Boolean.valueOf(this.f11009a.i());
            case 8:
                w(2);
                return this.f11009a.w();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                i1 a10 = d1.f10940c.a(cls);
                Object f = a10.f();
                c(f, a10, oVar);
                a10.b(f);
                return f;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(this.f11009a.y());
            case 13:
                w(0);
                return Integer.valueOf(this.f11009a.l());
            case 14:
                w(5);
                return Integer.valueOf(this.f11009a.r());
            case 15:
                w(1);
                return Long.valueOf(this.f11009a.s());
            case 16:
                w(0);
                return Integer.valueOf(this.f11009a.t());
            case 17:
                w(0);
                return Long.valueOf(this.f11009a.u());
        }
    }

    public final void j(List<Integer> list) {
        int x10;
        int x11;
        if (!(list instanceof z)) {
            int i10 = this.f11010b & 7;
            if (i10 == 2) {
                int y10 = this.f11009a.y();
                y(y10);
                int d10 = this.f11009a.d() + y10;
                do {
                    list.add(Integer.valueOf(this.f11009a.m()));
                } while (this.f11009a.d() < d10);
                return;
            }
            if (i10 != 5) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            do {
                list.add(Integer.valueOf(this.f11009a.m()));
                if (this.f11009a.e()) {
                    return;
                } else {
                    x10 = this.f11009a.x();
                }
            } while (x10 == this.f11010b);
            this.f11012d = x10;
            return;
        }
        z zVar = (z) list;
        int i12 = this.f11010b & 7;
        if (i12 == 2) {
            int y11 = this.f11009a.y();
            y(y11);
            int d11 = this.f11009a.d() + y11;
            do {
                zVar.h(this.f11009a.m());
            } while (this.f11009a.d() < d11);
            return;
        }
        if (i12 != 5) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        do {
            zVar.h(this.f11009a.m());
            if (this.f11009a.e()) {
                return;
            } else {
                x11 = this.f11009a.x();
            }
        } while (x11 == this.f11010b);
        this.f11012d = x11;
    }

    public final void k(List<Long> list) {
        int x10;
        int x11;
        if (!(list instanceof j0)) {
            int i10 = this.f11010b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f11009a.n()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i10 != 2) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            int y10 = this.f11009a.y();
            z(y10);
            int d10 = this.f11009a.d() + y10;
            do {
                list.add(Long.valueOf(this.f11009a.n()));
            } while (this.f11009a.d() < d10);
            return;
        }
        j0 j0Var = (j0) list;
        int i12 = this.f11010b & 7;
        if (i12 == 1) {
            do {
                j0Var.h(this.f11009a.n());
                if (this.f11009a.e()) {
                    return;
                } else {
                    x11 = this.f11009a.x();
                }
            } while (x11 == this.f11010b);
            this.f11012d = x11;
            return;
        }
        if (i12 != 2) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        int y11 = this.f11009a.y();
        z(y11);
        int d11 = this.f11009a.d() + y11;
        do {
            j0Var.h(this.f11009a.n());
        } while (this.f11009a.d() < d11);
    }

    public final void l(List<Float> list) {
        int x10;
        int x11;
        if (!(list instanceof u)) {
            int i10 = this.f11010b & 7;
            if (i10 == 2) {
                int y10 = this.f11009a.y();
                y(y10);
                int d10 = this.f11009a.d() + y10;
                do {
                    list.add(Float.valueOf(this.f11009a.o()));
                } while (this.f11009a.d() < d10);
                return;
            }
            if (i10 != 5) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            do {
                list.add(Float.valueOf(this.f11009a.o()));
                if (this.f11009a.e()) {
                    return;
                } else {
                    x10 = this.f11009a.x();
                }
            } while (x10 == this.f11010b);
            this.f11012d = x10;
            return;
        }
        u uVar = (u) list;
        int i12 = this.f11010b & 7;
        if (i12 == 2) {
            int y11 = this.f11009a.y();
            y(y11);
            int d11 = this.f11009a.d() + y11;
            do {
                uVar.h(this.f11009a.o());
            } while (this.f11009a.d() < d11);
            return;
        }
        if (i12 != 5) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        do {
            uVar.h(this.f11009a.o());
            if (this.f11009a.e()) {
                return;
            } else {
                x11 = this.f11009a.x();
            }
        } while (x11 == this.f11010b);
        this.f11012d = x11;
    }

    public final void m(List<Integer> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof z) {
            z zVar = (z) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    zVar.h(this.f11009a.p());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                zVar.h(this.f11009a.p());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11009a.p()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Integer.valueOf(this.f11009a.p()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void n(List<Long> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    j0Var.h(this.f11009a.q());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                j0Var.h(this.f11009a.q());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f11009a.q()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Long.valueOf(this.f11009a.q()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void o(List<Integer> list) {
        int x10;
        int x11;
        if (!(list instanceof z)) {
            int i10 = this.f11010b & 7;
            if (i10 == 2) {
                int y10 = this.f11009a.y();
                y(y10);
                int d10 = this.f11009a.d() + y10;
                do {
                    list.add(Integer.valueOf(this.f11009a.r()));
                } while (this.f11009a.d() < d10);
                return;
            }
            if (i10 != 5) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            do {
                list.add(Integer.valueOf(this.f11009a.r()));
                if (this.f11009a.e()) {
                    return;
                } else {
                    x10 = this.f11009a.x();
                }
            } while (x10 == this.f11010b);
            this.f11012d = x10;
            return;
        }
        z zVar = (z) list;
        int i12 = this.f11010b & 7;
        if (i12 == 2) {
            int y11 = this.f11009a.y();
            y(y11);
            int d11 = this.f11009a.d() + y11;
            do {
                zVar.h(this.f11009a.r());
            } while (this.f11009a.d() < d11);
            return;
        }
        if (i12 != 5) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        do {
            zVar.h(this.f11009a.r());
            if (this.f11009a.e()) {
                return;
            } else {
                x11 = this.f11009a.x();
            }
        } while (x11 == this.f11010b);
        this.f11012d = x11;
    }

    public final void p(List<Long> list) {
        int x10;
        int x11;
        if (!(list instanceof j0)) {
            int i10 = this.f11010b & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.f11009a.s()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i10 != 2) {
                int i11 = b0.f10916c;
                throw new b0.a();
            }
            int y10 = this.f11009a.y();
            z(y10);
            int d10 = this.f11009a.d() + y10;
            do {
                list.add(Long.valueOf(this.f11009a.s()));
            } while (this.f11009a.d() < d10);
            return;
        }
        j0 j0Var = (j0) list;
        int i12 = this.f11010b & 7;
        if (i12 == 1) {
            do {
                j0Var.h(this.f11009a.s());
                if (this.f11009a.e()) {
                    return;
                } else {
                    x11 = this.f11009a.x();
                }
            } while (x11 == this.f11010b);
            this.f11012d = x11;
            return;
        }
        if (i12 != 2) {
            int i13 = b0.f10916c;
            throw new b0.a();
        }
        int y11 = this.f11009a.y();
        z(y11);
        int d11 = this.f11009a.d() + y11;
        do {
            j0Var.h(this.f11009a.s());
        } while (this.f11009a.d() < d11);
    }

    public final void q(List<Integer> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof z) {
            z zVar = (z) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    zVar.h(this.f11009a.t());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                zVar.h(this.f11009a.t());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11009a.t()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Integer.valueOf(this.f11009a.t()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void r(List<Long> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    j0Var.h(this.f11009a.u());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                j0Var.h(this.f11009a.u());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f11009a.u()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Long.valueOf(this.f11009a.u()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void s(List<String> list, boolean z10) {
        String v10;
        int x10;
        int x11;
        if ((this.f11010b & 7) != 2) {
            int i10 = b0.f10916c;
            throw new b0.a();
        }
        if ((list instanceof h0) && !z10) {
            h0 h0Var = (h0) list;
            do {
                h0Var.v(e());
                if (this.f11009a.e()) {
                    return;
                } else {
                    x11 = this.f11009a.x();
                }
            } while (x11 == this.f11010b);
            this.f11012d = x11;
            return;
        }
        do {
            if (z10) {
                w(2);
                v10 = this.f11009a.w();
            } else {
                w(2);
                v10 = this.f11009a.v();
            }
            list.add(v10);
            if (this.f11009a.e()) {
                return;
            } else {
                x10 = this.f11009a.x();
            }
        } while (x10 == this.f11010b);
        this.f11012d = x10;
    }

    public final void t(List<Integer> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof z) {
            z zVar = (z) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    zVar.h(this.f11009a.y());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                zVar.h(this.f11009a.y());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11009a.y()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Integer.valueOf(this.f11009a.y()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void u(List<Long> list) {
        int x10;
        int d10;
        int x11;
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            int i10 = this.f11010b & 7;
            if (i10 == 0) {
                do {
                    j0Var.h(this.f11009a.z());
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x11 = this.f11009a.x();
                    }
                } while (x11 == this.f11010b);
                this.f11012d = x11;
                return;
            }
            if (i10 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                j0Var.h(this.f11009a.z());
            } while (this.f11009a.d() < d10);
        } else {
            int i11 = this.f11010b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(this.f11009a.z()));
                    if (this.f11009a.e()) {
                        return;
                    } else {
                        x10 = this.f11009a.x();
                    }
                } while (x10 == this.f11010b);
                this.f11012d = x10;
                return;
            }
            if (i11 != 2) {
                throw b0.d();
            }
            d10 = this.f11009a.d() + this.f11009a.y();
            do {
                list.add(Long.valueOf(this.f11009a.z()));
            } while (this.f11009a.d() < d10);
        }
        v(d10);
    }

    public final void v(int i10) {
        if (this.f11009a.d() != i10) {
            throw b0.h();
        }
    }

    public final void w(int i10) {
        if ((this.f11010b & 7) != i10) {
            throw b0.d();
        }
    }

    public final boolean x() {
        int i10;
        if (this.f11009a.e() || (i10 = this.f11010b) == this.f11011c) {
            return false;
        }
        return this.f11009a.A(i10);
    }
}
