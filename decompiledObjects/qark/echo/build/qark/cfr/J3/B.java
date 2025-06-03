/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 */
package J3;

import J3.C;
import J3.b;
import J3.c;
import J3.d;
import J3.e;
import J3.f;
import J3.g;
import J3.h;
import J3.i;
import J3.k;
import J3.l;
import J3.m;
import J3.n;
import J3.o;
import J3.p;
import J3.q;
import J3.r;
import J3.s;
import J3.t;
import J3.u;
import J3.v;
import J3.w;
import java.nio.charset.Charset;

public abstract class B {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static b b() {
        return new b.b();
    }

    public abstract a c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract d j();

    public abstract int k();

    public abstract String l();

    public abstract e m();

    public abstract b n();

    public B o(String string2) {
        b b8 = this.n().c(string2);
        if (this.m() != null) {
            b8.l(this.m().p(string2));
        }
        return b8.a();
    }

    public B p(a a8) {
        if (a8 == null) {
            return this;
        }
        return this.n().b(a8).a();
    }

    public B q(C c8) {
        if (this.m() != null) {
            return this.n().l(this.m().q(c8)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public B r(String string2) {
        return this.n().f(string2).a();
    }

    public B s(d d8) {
        return this.n().l(null).i(d8).a();
    }

    public B t(long l8, boolean bl, String string2) {
        b b8 = this.n();
        if (this.m() != null) {
            b8.l(this.m().r(l8, bl, string2));
        }
        return b8.a();
    }

    public static abstract class J3.B$a {
        public static b a() {
            return new c.b();
        }

        public abstract C b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();

        public static abstract class J3.B$a$a {
            public static a a() {
                return new d.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public static abstract class a {
                public abstract J3.B$a$a a();

                public abstract a b(String var1);

                public abstract a c(String var1);

                public abstract a d(String var1);
            }

        }

        public static abstract class b {
            public abstract J3.B$a a();

            public abstract b b(C var1);

            public abstract b c(int var1);

            public abstract b d(int var1);

            public abstract b e(String var1);

            public abstract b f(long var1);

            public abstract b g(int var1);

            public abstract b h(long var1);

            public abstract b i(long var1);

            public abstract b j(String var1);
        }

    }

    public static abstract class b {
        public abstract B a();

        public abstract b b(a var1);

        public abstract b c(String var1);

        public abstract b d(String var1);

        public abstract b e(String var1);

        public abstract b f(String var1);

        public abstract b g(String var1);

        public abstract b h(String var1);

        public abstract b i(d var1);

        public abstract b j(int var1);

        public abstract b k(String var1);

        public abstract b l(e var1);
    }

    public static abstract class c {
        public static a a() {
            return new e.b();
        }

        public abstract String b();

        public abstract String c();

        public static abstract class a {
            public abstract c a();

            public abstract a b(String var1);

            public abstract a c(String var1);
        }

    }

    public static abstract class d {
        public static a a() {
            return new f.b();
        }

        public abstract C b();

        public abstract String c();

        public static abstract class a {
            public abstract d a();

            public abstract a b(C var1);

            public abstract a c(String var1);
        }

        public static abstract class b {
            public static a a() {
                return new g.b();
            }

            public abstract byte[] b();

            public abstract String c();

            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] var1);

                public abstract a c(String var1);
            }

        }

    }

    public static abstract class J3.B$e {
        public static b a() {
            return new h.b().d(false);
        }

        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract C f();

        public abstract String g();

        public abstract int h();

        public abstract String i();

        public byte[] j() {
            return this.i().getBytes(a);
        }

        public abstract e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        public J3.B$e p(String string2) {
            return this.o().c(string2).a();
        }

        public J3.B$e q(C c8) {
            return this.o().g(c8).a();
        }

        public J3.B$e r(long l8, boolean bl, String string2) {
            b b8 = this.o();
            b8.f(l8);
            b8.d(bl);
            if (string2 != null) {
                b8.n(f.a().b(string2).a());
            }
            return b8.a();
        }

        public static abstract class J3.B$e$a {
            public static a a() {
                return new i.b();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();

            public static abstract class a {
                public abstract J3.B$e$a a();

                public abstract a b(String var1);

                public abstract a c(String var1);

                public abstract a d(String var1);

                public abstract a e(String var1);

                public abstract a f(String var1);

                public abstract a g(String var1);
            }

            public static abstract class b {
            }

        }

        public static abstract class b {
            public abstract J3.B$e a();

            public abstract b b(a var1);

            public abstract b c(String var1);

            public abstract b d(boolean var1);

            public abstract b e(c var1);

            public abstract b f(Long var1);

            public abstract b g(C var1);

            public abstract b h(String var1);

            public abstract b i(int var1);

            public abstract b j(String var1);

            public b k(byte[] arrby) {
                return this.j(new String(arrby, a));
            }

            public abstract b l(e var1);

            public abstract b m(long var1);

            public abstract b n(f var1);
        }

        public static abstract class c {
            public static a a() {
                return new k.b();
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();

            public static abstract class a {
                public abstract c a();

                public abstract a b(int var1);

                public abstract a c(int var1);

                public abstract a d(long var1);

                public abstract a e(String var1);

                public abstract a f(String var1);

                public abstract a g(String var1);

                public abstract a h(long var1);

                public abstract a i(boolean var1);

                public abstract a j(int var1);
            }

        }

        public static abstract class J3.B$e$d {
            public static b a() {
                return new l.b();
            }

            public abstract a b();

            public abstract c c();

            public abstract d d();

            public abstract long e();

            public abstract String f();

            public abstract b g();

            public static abstract class J3.B$e$d$a {
                public static a a() {
                    return new m.b();
                }

                public abstract Boolean b();

                public abstract C c();

                public abstract b d();

                public abstract C e();

                public abstract int f();

                public abstract a g();

                public static abstract class a {
                    public abstract J3.B$e$d$a a();

                    public abstract a b(Boolean var1);

                    public abstract a c(C var1);

                    public abstract a d(b var1);

                    public abstract a e(C var1);

                    public abstract a f(int var1);
                }

                public static abstract class J3.B$e$d$a$b {
                    public static b a() {
                        return new n.b();
                    }

                    public abstract J3.B$a b();

                    public abstract C c();

                    public abstract c d();

                    public abstract d e();

                    public abstract C f();

                    public static abstract class J3.B$e$d$a$b$a {
                        public static a a() {
                            return new o.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public byte[] f() {
                            String string2 = this.e();
                            if (string2 != null) {
                                return string2.getBytes(a);
                            }
                            return null;
                        }

                        public static abstract class a {
                            public abstract J3.B$e$d$a$b$a a();

                            public abstract a b(long var1);

                            public abstract a c(String var1);

                            public abstract a d(long var1);

                            public abstract a e(String var1);

                            public a f(byte[] arrby) {
                                return this.e(new String(arrby, a));
                            }
                        }

                    }

                    public static abstract class b {
                        public abstract J3.B$e$d$a$b a();

                        public abstract b b(J3.B$a var1);

                        public abstract b c(C var1);

                        public abstract b d(c var1);

                        public abstract b e(d var1);

                        public abstract b f(C var1);
                    }

                    public static abstract class c {
                        public static a a() {
                            return new p.b();
                        }

                        public abstract c b();

                        public abstract C c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();

                        public static abstract class a {
                            public abstract c a();

                            public abstract a b(c var1);

                            public abstract a c(C var1);

                            public abstract a d(int var1);

                            public abstract a e(String var1);

                            public abstract a f(String var1);
                        }

                    }

                    public static abstract class d {
                        public static a a() {
                            return new q.b();
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();

                        public static abstract class a {
                            public abstract d a();

                            public abstract a b(long var1);

                            public abstract a c(String var1);

                            public abstract a d(String var1);
                        }

                    }

                    public static abstract class e {
                        public static a a() {
                            return new r.b();
                        }

                        public abstract C b();

                        public abstract int c();

                        public abstract String d();

                        public static abstract class a {
                            public abstract e a();

                            public abstract a b(C var1);

                            public abstract a c(int var1);

                            public abstract a d(String var1);
                        }

                        public static abstract class b {
                            public static a a() {
                                return new s.b();
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();

                            public static abstract class a {
                                public abstract b a();

                                public abstract a b(String var1);

                                public abstract a c(int var1);

                                public abstract a d(long var1);

                                public abstract a e(long var1);

                                public abstract a f(String var1);
                            }

                        }

                    }

                }

            }

            public static abstract class b {
                public abstract J3.B$e$d a();

                public abstract b b(a var1);

                public abstract b c(c var1);

                public abstract b d(d var1);

                public abstract b e(long var1);

                public abstract b f(String var1);
            }

            public static abstract class c {
                public static a a() {
                    return new t.b();
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();

                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double var1);

                    public abstract a c(int var1);

                    public abstract a d(long var1);

                    public abstract a e(int var1);

                    public abstract a f(boolean var1);

                    public abstract a g(long var1);
                }

            }

            public static abstract class d {
                public static a a() {
                    return new u.b();
                }

                public abstract String b();

                public static abstract class a {
                    public abstract d a();

                    public abstract a b(String var1);
                }

            }

        }

        public static abstract class e {
            public static a a() {
                return new v.b();
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();

            public static abstract class a {
                public abstract e a();

                public abstract a b(String var1);

                public abstract a c(boolean var1);

                public abstract a d(int var1);

                public abstract a e(String var1);
            }

        }

        public static abstract class f {
            public static a a() {
                return new w.b();
            }

            public abstract String b();

            public static abstract class a {
                public abstract f a();

                public abstract a b(String var1);
            }

        }

    }

}

