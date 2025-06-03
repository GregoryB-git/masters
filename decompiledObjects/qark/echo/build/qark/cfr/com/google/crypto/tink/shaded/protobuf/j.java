/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.F;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.f;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.m;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.y;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.List;
import java.util.Map;

public final class j
implements d0 {
    public final i a;
    public int b;
    public int c;
    public int d = 0;

    public j(i i8) {
        this.a = i8 = (i)z.b(i8, "input");
        i8.d = this;
    }

    public static j O(i i8) {
        j j8 = i8.d;
        if (j8 != null) {
            return j8;
        }
        return new j(i8);
    }

    @Override
    public void A(List list) {
        if (q0.b(this.b) == 2) {
            int n8;
            do {
                list.add((Object)this.u());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        throw A.e();
    }

    @Override
    public void B(List list) {
        if (list instanceof m) {
            list = (m)list;
            int n8 = q0.b(this.b);
            if (n8 != 1) {
                if (n8 == 2) {
                    n8 = this.a.C();
                    this.X(n8);
                    int n9 = this.a.d();
                    do {
                        list.d(this.a.o());
                    } while (this.a.d() < n9 + n8);
                    return;
                }
                throw A.e();
            }
            do {
                list.d(this.a.o());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 1) {
            if (n10 == 2) {
                n10 = this.a.C();
                this.X(n10);
                int n11 = this.a.d();
                do {
                    list.add((Object)this.a.o());
                } while (this.a.d() < n11 + n10);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.o());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    @Override
    public void C(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.d(this.a.u());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.d(this.a.u());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.u());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.u());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public void D(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = q0.b(this.b);
            if (n8 != 1) {
                if (n8 == 2) {
                    n8 = this.a.C();
                    this.X(n8);
                    int n9 = this.a.d();
                    do {
                        list.d(this.a.w());
                    } while (this.a.d() < n9 + n8);
                    return;
                }
                throw A.e();
            }
            do {
                list.d(this.a.w());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 1) {
            if (n10 == 2) {
                n10 = this.a.C();
                this.X(n10);
                int n11 = this.a.d();
                do {
                    list.add((Object)this.a.w());
                } while (this.a.d() < n11 + n10);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.w());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    @Override
    public long E() {
        this.V(0);
        return this.a.u();
    }

    @Override
    public String F() {
        this.V(2);
        return this.a.A();
    }

    @Override
    public void G(List list) {
        if (list instanceof F) {
            list = (F)list;
            int n8 = q0.b(this.b);
            if (n8 != 1) {
                if (n8 == 2) {
                    n8 = this.a.C();
                    this.X(n8);
                    int n9 = this.a.d();
                    do {
                        list.d(this.a.r());
                    } while (this.a.d() < n9 + n8);
                    return;
                }
                throw A.e();
            }
            do {
                list.d(this.a.r());
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 1) {
            if (n10 == 2) {
                n10 = this.a.C();
                this.X(n10);
                int n11 = this.a.d();
                do {
                    list.add((Object)this.a.r());
                } while (this.a.d() < n11 + n10);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.r());
            if (!this.a.e()) continue;
            return;
        } while ((n10 = this.a.B()) == this.b);
        this.d = n10;
    }

    @Override
    public void H(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.z(this.a.t());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.z(this.a.t());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.t());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.t());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public void I(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.z(this.a.p());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.z(this.a.p());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.p());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.p());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public void J(Object object, e0 e02, p p8) {
        this.V(2);
        this.Q(object, e02, p8);
    }

    @Override
    public void K(List list, e0 e02, p p8) {
        if (q0.b(this.b) == 2) {
            block2 : {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.S(e02, p8));
                    if (this.a.e()) break block2;
                    if (this.d == 0) continue;
                    return;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw A.e();
    }

    @Override
    public void L(Object object, e0 e02, p p8) {
        this.V(3);
        this.P(object, e02, p8);
    }

    @Override
    public void M(Map map, H.a a8, p p8) {
        this.V(2);
        int n8 = this.a.C();
        this.a.l(n8);
        throw null;
    }

    @Override
    public void N(List list, e0 e02, p p8) {
        if (q0.b(this.b) == 3) {
            block2 : {
                int n8;
                int n9 = this.b;
                do {
                    list.add(this.R(e02, p8));
                    if (this.a.e()) break block2;
                    if (this.d == 0) continue;
                    return;
                } while ((n8 = this.a.B()) == n9);
                this.d = n8;
            }
            return;
        }
        throw A.e();
    }

    public final void P(Object object, e0 e02, p p8) {
        block3 : {
            int n8 = this.c;
            this.c = q0.c(q0.a(this.b), 4);
            try {
                e02.j(object, this, p8);
                int n9 = this.b;
                int n10 = this.c;
                if (n9 != n10) break block3;
            }
            catch (Throwable throwable) {
                this.c = n8;
                throw throwable;
            }
            this.c = n8;
            return;
        }
        throw A.h();
    }

    public final void Q(Object object, e0 e02, p p8) {
        int n8 = this.a.C();
        i i8 = this.a;
        if (i8.a < i8.b) {
            n8 = i8.l(n8);
            i8 = this.a;
            ++i8.a;
            e02.j(object, this, p8);
            this.a.a(0);
            object = this.a;
            --object.a;
            object.k(n8);
            return;
        }
        throw A.i();
    }

    public final Object R(e0 e02, p p8) {
        Object object = e02.f();
        this.P(object, e02, p8);
        e02.b(object);
        return object;
    }

    public final Object S(e0 e02, p p8) {
        Object object = e02.f();
        this.Q(object, e02, p8);
        e02.b(object);
        return object;
    }

    public void T(List list, boolean bl) {
        if (q0.b(this.b) == 2) {
            int n8;
            if (list instanceof D && !bl) {
                int n9;
                list = (D)list;
                do {
                    list.C(this.u());
                    if (!this.a.e()) continue;
                    return;
                } while ((n9 = this.a.B()) == this.b);
                this.d = n9;
                return;
            }
            do {
                String string2 = bl ? this.F() : this.m();
                list.add((Object)string2);
                if (!this.a.e()) continue;
                return;
            } while ((n8 = this.a.B()) == this.b);
            this.d = n8;
            return;
        }
        throw A.e();
    }

    public final void U(int n8) {
        if (this.a.d() == n8) {
            return;
        }
        throw A.m();
    }

    public final void V(int n8) {
        if (q0.b(this.b) == n8) {
            return;
        }
        throw A.e();
    }

    public final void W(int n8) {
        if ((n8 & 3) == 0) {
            return;
        }
        throw A.h();
    }

    public final void X(int n8) {
        if ((n8 & 7) == 0) {
            return;
        }
        throw A.h();
    }

    @Override
    public void a(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.z(this.a.x());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.z(this.a.x());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.x());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.x());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public int b() {
        this.V(0);
        return this.a.p();
    }

    @Override
    public long c() {
        this.V(0);
        return this.a.D();
    }

    @Override
    public void d(List list) {
        if (list instanceof y) {
            list = (y)list;
            int n8 = q0.b(this.b);
            if (n8 != 2) {
                if (n8 == 5) {
                    do {
                        list.z(this.a.q());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n8 = this.a.B()) == this.b);
                    this.d = n8;
                    return;
                }
                throw A.e();
            }
            n8 = this.a.C();
            this.W(n8);
            int n9 = this.a.d();
            do {
                list.z(this.a.q());
            } while (this.a.d() < n9 + n8);
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 2) {
            if (n10 == 5) {
                do {
                    list.add((Object)this.a.q());
                    if (!this.a.e()) continue;
                    return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            throw A.e();
        }
        n10 = this.a.C();
        this.W(n10);
        int n11 = this.a.d();
        do {
            list.add((Object)this.a.q());
        } while (this.a.d() < n11 + n10);
    }

    @Override
    public int e() {
        return this.b;
    }

    @Override
    public long f() {
        this.V(1);
        return this.a.r();
    }

    @Override
    public void g(List list) {
        if (list instanceof y) {
            list = (y)list;
            int n8 = q0.b(this.b);
            if (n8 != 2) {
                if (n8 == 5) {
                    do {
                        list.z(this.a.v());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n8 = this.a.B()) == this.b);
                    this.d = n8;
                    return;
                }
                throw A.e();
            }
            n8 = this.a.C();
            this.W(n8);
            int n9 = this.a.d();
            do {
                list.z(this.a.v());
            } while (this.a.d() < n9 + n8);
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 2) {
            if (n10 == 5) {
                do {
                    list.add((Object)this.a.v());
                    if (!this.a.e()) continue;
                    return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            throw A.e();
        }
        n10 = this.a.C();
        this.W(n10);
        int n11 = this.a.d();
        do {
            list.add((Object)this.a.v());
        } while (this.a.d() < n11 + n10);
    }

    @Override
    public int h() {
        this.V(0);
        return this.a.x();
    }

    @Override
    public void i(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.d(this.a.y());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.d(this.a.y());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.y());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.y());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public long j() {
        this.V(0);
        return this.a.y();
    }

    @Override
    public void k(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof y)) break block6;
                                list = (y)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.z(this.a.C());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.z(this.a.C());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.C());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.C());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public void l(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof f)) break block6;
                                list = (f)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.d(this.a.m());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.d(this.a.m());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.m());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.m());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public String m() {
        this.V(2);
        return this.a.z();
    }

    @Override
    public int n() {
        this.V(5);
        return this.a.q();
    }

    @Override
    public boolean o() {
        this.V(0);
        return this.a.m();
    }

    @Override
    public int p() {
        int n8 = this.d;
        if (n8 != 0) {
            this.b = n8;
            this.d = 0;
        } else {
            this.b = this.a.B();
        }
        n8 = this.b;
        if (n8 != 0 && n8 != this.c) {
            return q0.a(n8);
        }
        return Integer.MAX_VALUE;
    }

    @Override
    public void q(List list) {
        this.T(list, false);
    }

    @Override
    public long r() {
        this.V(1);
        return this.a.w();
    }

    @Override
    public double readDouble() {
        this.V(1);
        return this.a.o();
    }

    @Override
    public float readFloat() {
        this.V(5);
        return this.a.s();
    }

    @Override
    public void s(List list) {
        int n8;
        block10 : {
            block11 : {
                block9 : {
                    block6 : {
                        block7 : {
                            block8 : {
                                if (!(list instanceof F)) break block6;
                                list = (F)list;
                                n8 = q0.b(this.b);
                                if (n8 == 0) break block7;
                                if (n8 != 2) break block8;
                                n8 = this.a.C();
                                n8 = this.a.d() + n8;
                                do {
                                    list.d(this.a.D());
                                } while (this.a.d() < n8);
                                break block9;
                            }
                            throw A.e();
                        }
                        do {
                            list.d(this.a.D());
                            if (!this.a.e()) continue;
                            return;
                        } while ((n8 = this.a.B()) == this.b);
                        this.d = n8;
                        return;
                    }
                    n8 = q0.b(this.b);
                    if (n8 == 0) break block10;
                    if (n8 != 2) break block11;
                    n8 = this.a.C();
                    n8 = this.a.d() + n8;
                    do {
                        list.add((Object)this.a.D());
                    } while (this.a.d() < n8);
                }
                this.U(n8);
                return;
            }
            throw A.e();
        }
        do {
            list.add((Object)this.a.D());
            if (!this.a.e()) continue;
            return;
        } while ((n8 = this.a.B()) == this.b);
        this.d = n8;
    }

    @Override
    public void t(List list) {
        this.T(list, true);
    }

    @Override
    public h u() {
        this.V(2);
        return this.a.n();
    }

    @Override
    public void v(List list) {
        if (list instanceof v) {
            list = (v)list;
            int n8 = q0.b(this.b);
            if (n8 != 2) {
                if (n8 == 5) {
                    do {
                        list.d(this.a.s());
                        if (!this.a.e()) continue;
                        return;
                    } while ((n8 = this.a.B()) == this.b);
                    this.d = n8;
                    return;
                }
                throw A.e();
            }
            n8 = this.a.C();
            this.W(n8);
            int n9 = this.a.d();
            do {
                list.d(this.a.s());
            } while (this.a.d() < n9 + n8);
            return;
        }
        int n10 = q0.b(this.b);
        if (n10 != 2) {
            if (n10 == 5) {
                do {
                    list.add((Object)Float.valueOf((float)this.a.s()));
                    if (!this.a.e()) continue;
                    return;
                } while ((n10 = this.a.B()) == this.b);
                this.d = n10;
                return;
            }
            throw A.e();
        }
        n10 = this.a.C();
        this.W(n10);
        int n11 = this.a.d();
        do {
            list.add((Object)Float.valueOf((float)this.a.s()));
        } while (this.a.d() < n11 + n10);
    }

    @Override
    public int w() {
        this.V(0);
        return this.a.C();
    }

    @Override
    public int x() {
        this.V(0);
        return this.a.t();
    }

    @Override
    public boolean y() {
        int n8;
        if (!this.a.e() && (n8 = this.b) != this.c) {
            return this.a.E(n8);
        }
        return false;
    }

    @Override
    public int z() {
        this.V(5);
        return this.a.v();
    }
}

