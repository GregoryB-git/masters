package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1095j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1094i f11373a;

    /* renamed from: b, reason: collision with root package name */
    public int f11374b;

    /* renamed from: c, reason: collision with root package name */
    public int f11375c;

    /* renamed from: d, reason: collision with root package name */
    public int f11376d = 0;

    public C1095j(AbstractC1094i abstractC1094i) {
        AbstractC1094i abstractC1094i2 = (AbstractC1094i) AbstractC1110z.b(abstractC1094i, "input");
        this.f11373a = abstractC1094i2;
        abstractC1094i2.f11353d = this;
    }

    public static C1095j O(AbstractC1094i abstractC1094i) {
        C1095j c1095j = abstractC1094i.f11353d;
        return c1095j != null ? c1095j : new C1095j(abstractC1094i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void A(List list) {
        int B7;
        if (q0.b(this.f11374b) != 2) {
            throw A.e();
        }
        do {
            list.add(u());
            if (this.f11373a.e()) {
                return;
            } else {
                B7 = this.f11373a.B();
            }
        } while (B7 == this.f11374b);
        this.f11376d = B7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void B(List list) {
        int B7;
        int B8;
        if (!(list instanceof AbstractC1098m)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 1) {
                do {
                    list.add(Double.valueOf(this.f11373a.o()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            int C7 = this.f11373a.C();
            X(C7);
            int d7 = this.f11373a.d() + C7;
            do {
                list.add(Double.valueOf(this.f11373a.o()));
            } while (this.f11373a.d() < d7);
            return;
        }
        AbstractC1098m abstractC1098m = (AbstractC1098m) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 1) {
            do {
                abstractC1098m.d(this.f11373a.o());
                if (this.f11373a.e()) {
                    return;
                } else {
                    B8 = this.f11373a.B();
                }
            } while (B8 == this.f11374b);
            this.f11376d = B8;
            return;
        }
        if (b8 != 2) {
            throw A.e();
        }
        int C8 = this.f11373a.C();
        X(C8);
        int d8 = this.f11373a.d() + C8;
        do {
            abstractC1098m.d(this.f11373a.o());
        } while (this.f11373a.d() < d8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void C(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof F) {
            F f7 = (F) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    f7.d(this.f11373a.u());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                f7.d(this.f11373a.u());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Long.valueOf(this.f11373a.u()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Long.valueOf(this.f11373a.u()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void D(List list) {
        int B7;
        int B8;
        if (!(list instanceof F)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 1) {
                do {
                    list.add(Long.valueOf(this.f11373a.w()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            int C7 = this.f11373a.C();
            X(C7);
            int d7 = this.f11373a.d() + C7;
            do {
                list.add(Long.valueOf(this.f11373a.w()));
            } while (this.f11373a.d() < d7);
            return;
        }
        F f7 = (F) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 1) {
            do {
                f7.d(this.f11373a.w());
                if (this.f11373a.e()) {
                    return;
                } else {
                    B8 = this.f11373a.B();
                }
            } while (B8 == this.f11374b);
            this.f11376d = B8;
            return;
        }
        if (b8 != 2) {
            throw A.e();
        }
        int C8 = this.f11373a.C();
        X(C8);
        int d8 = this.f11373a.d() + C8;
        do {
            f7.d(this.f11373a.w());
        } while (this.f11373a.d() < d8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long E() {
        V(0);
        return this.f11373a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String F() {
        V(2);
        return this.f11373a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void G(List list) {
        int B7;
        int B8;
        if (!(list instanceof F)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 1) {
                do {
                    list.add(Long.valueOf(this.f11373a.r()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            int C7 = this.f11373a.C();
            X(C7);
            int d7 = this.f11373a.d() + C7;
            do {
                list.add(Long.valueOf(this.f11373a.r()));
            } while (this.f11373a.d() < d7);
            return;
        }
        F f7 = (F) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 1) {
            do {
                f7.d(this.f11373a.r());
                if (this.f11373a.e()) {
                    return;
                } else {
                    B8 = this.f11373a.B();
                }
            } while (B8 == this.f11374b);
            this.f11376d = B8;
            return;
        }
        if (b8 != 2) {
            throw A.e();
        }
        int C8 = this.f11373a.C();
        X(C8);
        int d8 = this.f11373a.d() + C8;
        do {
            f7.d(this.f11373a.r());
        } while (this.f11373a.d() < d8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void H(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    abstractC1109y.z(this.f11373a.t());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                abstractC1109y.z(this.f11373a.t());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11373a.t()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Integer.valueOf(this.f11373a.t()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void I(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    abstractC1109y.z(this.f11373a.p());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                abstractC1109y.z(this.f11373a.p());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11373a.p()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Integer.valueOf(this.f11373a.p()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void J(Object obj, e0 e0Var, C1101p c1101p) {
        V(2);
        Q(obj, e0Var, c1101p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void K(List list, e0 e0Var, C1101p c1101p) {
        int B7;
        if (q0.b(this.f11374b) != 2) {
            throw A.e();
        }
        int i7 = this.f11374b;
        do {
            list.add(S(e0Var, c1101p));
            if (this.f11373a.e() || this.f11376d != 0) {
                return;
            } else {
                B7 = this.f11373a.B();
            }
        } while (B7 == i7);
        this.f11376d = B7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void L(Object obj, e0 e0Var, C1101p c1101p) {
        V(3);
        P(obj, e0Var, c1101p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void M(Map map, H.a aVar, C1101p c1101p) {
        V(2);
        this.f11373a.l(this.f11373a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void N(List list, e0 e0Var, C1101p c1101p) {
        int B7;
        if (q0.b(this.f11374b) != 3) {
            throw A.e();
        }
        int i7 = this.f11374b;
        do {
            list.add(R(e0Var, c1101p));
            if (this.f11373a.e() || this.f11376d != 0) {
                return;
            } else {
                B7 = this.f11373a.B();
            }
        } while (B7 == i7);
        this.f11376d = B7;
    }

    public final void P(Object obj, e0 e0Var, C1101p c1101p) {
        int i7 = this.f11375c;
        this.f11375c = q0.c(q0.a(this.f11374b), 4);
        try {
            e0Var.j(obj, this, c1101p);
            if (this.f11374b == this.f11375c) {
            } else {
                throw A.h();
            }
        } finally {
            this.f11375c = i7;
        }
    }

    public final void Q(Object obj, e0 e0Var, C1101p c1101p) {
        int C7 = this.f11373a.C();
        AbstractC1094i abstractC1094i = this.f11373a;
        if (abstractC1094i.f11350a >= abstractC1094i.f11351b) {
            throw A.i();
        }
        int l7 = abstractC1094i.l(C7);
        this.f11373a.f11350a++;
        e0Var.j(obj, this, c1101p);
        this.f11373a.a(0);
        r5.f11350a--;
        this.f11373a.k(l7);
    }

    public final Object R(e0 e0Var, C1101p c1101p) {
        Object f7 = e0Var.f();
        P(f7, e0Var, c1101p);
        e0Var.b(f7);
        return f7;
    }

    public final Object S(e0 e0Var, C1101p c1101p) {
        Object f7 = e0Var.f();
        Q(f7, e0Var, c1101p);
        e0Var.b(f7);
        return f7;
    }

    public void T(List list, boolean z7) {
        int B7;
        int B8;
        if (q0.b(this.f11374b) != 2) {
            throw A.e();
        }
        if (!(list instanceof D) || z7) {
            do {
                list.add(z7 ? F() : m());
                if (this.f11373a.e()) {
                    return;
                } else {
                    B7 = this.f11373a.B();
                }
            } while (B7 == this.f11374b);
            this.f11376d = B7;
            return;
        }
        D d7 = (D) list;
        do {
            d7.C(u());
            if (this.f11373a.e()) {
                return;
            } else {
                B8 = this.f11373a.B();
            }
        } while (B8 == this.f11374b);
        this.f11376d = B8;
    }

    public final void U(int i7) {
        if (this.f11373a.d() != i7) {
            throw A.m();
        }
    }

    public final void V(int i7) {
        if (q0.b(this.f11374b) != i7) {
            throw A.e();
        }
    }

    public final void W(int i7) {
        if ((i7 & 3) != 0) {
            throw A.h();
        }
    }

    public final void X(int i7) {
        if ((i7 & 7) != 0) {
            throw A.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void a(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    abstractC1109y.z(this.f11373a.x());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                abstractC1109y.z(this.f11373a.x());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11373a.x()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Integer.valueOf(this.f11373a.x()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int b() {
        V(0);
        return this.f11373a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long c() {
        V(0);
        return this.f11373a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void d(List list) {
        int B7;
        int B8;
        if (!(list instanceof AbstractC1109y)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 2) {
                int C7 = this.f11373a.C();
                W(C7);
                int d7 = this.f11373a.d() + C7;
                do {
                    list.add(Integer.valueOf(this.f11373a.q()));
                } while (this.f11373a.d() < d7);
                return;
            }
            if (b7 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f11373a.q()));
                if (this.f11373a.e()) {
                    return;
                } else {
                    B7 = this.f11373a.B();
                }
            } while (B7 == this.f11374b);
            this.f11376d = B7;
            return;
        }
        AbstractC1109y abstractC1109y = (AbstractC1109y) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 2) {
            int C8 = this.f11373a.C();
            W(C8);
            int d8 = this.f11373a.d() + C8;
            do {
                abstractC1109y.z(this.f11373a.q());
            } while (this.f11373a.d() < d8);
            return;
        }
        if (b8 != 5) {
            throw A.e();
        }
        do {
            abstractC1109y.z(this.f11373a.q());
            if (this.f11373a.e()) {
                return;
            } else {
                B8 = this.f11373a.B();
            }
        } while (B8 == this.f11374b);
        this.f11376d = B8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int e() {
        return this.f11374b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long f() {
        V(1);
        return this.f11373a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void g(List list) {
        int B7;
        int B8;
        if (!(list instanceof AbstractC1109y)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 2) {
                int C7 = this.f11373a.C();
                W(C7);
                int d7 = this.f11373a.d() + C7;
                do {
                    list.add(Integer.valueOf(this.f11373a.v()));
                } while (this.f11373a.d() < d7);
                return;
            }
            if (b7 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f11373a.v()));
                if (this.f11373a.e()) {
                    return;
                } else {
                    B7 = this.f11373a.B();
                }
            } while (B7 == this.f11374b);
            this.f11376d = B7;
            return;
        }
        AbstractC1109y abstractC1109y = (AbstractC1109y) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 2) {
            int C8 = this.f11373a.C();
            W(C8);
            int d8 = this.f11373a.d() + C8;
            do {
                abstractC1109y.z(this.f11373a.v());
            } while (this.f11373a.d() < d8);
            return;
        }
        if (b8 != 5) {
            throw A.e();
        }
        do {
            abstractC1109y.z(this.f11373a.v());
            if (this.f11373a.e()) {
                return;
            } else {
                B8 = this.f11373a.B();
            }
        } while (B8 == this.f11374b);
        this.f11376d = B8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int h() {
        V(0);
        return this.f11373a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void i(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof F) {
            F f7 = (F) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    f7.d(this.f11373a.y());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                f7.d(this.f11373a.y());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Long.valueOf(this.f11373a.y()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Long.valueOf(this.f11373a.y()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long j() {
        V(0);
        return this.f11373a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void k(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof AbstractC1109y) {
            AbstractC1109y abstractC1109y = (AbstractC1109y) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    abstractC1109y.z(this.f11373a.C());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                abstractC1109y.z(this.f11373a.C());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Integer.valueOf(this.f11373a.C()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Integer.valueOf(this.f11373a.C()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void l(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof AbstractC1091f) {
            AbstractC1091f abstractC1091f = (AbstractC1091f) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    abstractC1091f.d(this.f11373a.m());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                abstractC1091f.d(this.f11373a.m());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f11373a.m()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Boolean.valueOf(this.f11373a.m()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String m() {
        V(2);
        return this.f11373a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int n() {
        V(5);
        return this.f11373a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean o() {
        V(0);
        return this.f11373a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int p() {
        int i7 = this.f11376d;
        if (i7 != 0) {
            this.f11374b = i7;
            this.f11376d = 0;
        } else {
            this.f11374b = this.f11373a.B();
        }
        int i8 = this.f11374b;
        if (i8 == 0 || i8 == this.f11375c) {
            return Integer.MAX_VALUE;
        }
        return q0.a(i8);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void q(List list) {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long r() {
        V(1);
        return this.f11373a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public double readDouble() {
        V(1);
        return this.f11373a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public float readFloat() {
        V(5);
        return this.f11373a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void s(List list) {
        int B7;
        int d7;
        int B8;
        if (list instanceof F) {
            F f7 = (F) list;
            int b7 = q0.b(this.f11374b);
            if (b7 == 0) {
                do {
                    f7.d(this.f11373a.D());
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B8 = this.f11373a.B();
                    }
                } while (B8 == this.f11374b);
                this.f11376d = B8;
                return;
            }
            if (b7 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                f7.d(this.f11373a.D());
            } while (this.f11373a.d() < d7);
        } else {
            int b8 = q0.b(this.f11374b);
            if (b8 == 0) {
                do {
                    list.add(Long.valueOf(this.f11373a.D()));
                    if (this.f11373a.e()) {
                        return;
                    } else {
                        B7 = this.f11373a.B();
                    }
                } while (B7 == this.f11374b);
                this.f11376d = B7;
                return;
            }
            if (b8 != 2) {
                throw A.e();
            }
            d7 = this.f11373a.d() + this.f11373a.C();
            do {
                list.add(Long.valueOf(this.f11373a.D()));
            } while (this.f11373a.d() < d7);
        }
        U(d7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void t(List list) {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public AbstractC1093h u() {
        V(2);
        return this.f11373a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void v(List list) {
        int B7;
        int B8;
        if (!(list instanceof AbstractC1106v)) {
            int b7 = q0.b(this.f11374b);
            if (b7 == 2) {
                int C7 = this.f11373a.C();
                W(C7);
                int d7 = this.f11373a.d() + C7;
                do {
                    list.add(Float.valueOf(this.f11373a.s()));
                } while (this.f11373a.d() < d7);
                return;
            }
            if (b7 != 5) {
                throw A.e();
            }
            do {
                list.add(Float.valueOf(this.f11373a.s()));
                if (this.f11373a.e()) {
                    return;
                } else {
                    B7 = this.f11373a.B();
                }
            } while (B7 == this.f11374b);
            this.f11376d = B7;
            return;
        }
        AbstractC1106v abstractC1106v = (AbstractC1106v) list;
        int b8 = q0.b(this.f11374b);
        if (b8 == 2) {
            int C8 = this.f11373a.C();
            W(C8);
            int d8 = this.f11373a.d() + C8;
            do {
                abstractC1106v.d(this.f11373a.s());
            } while (this.f11373a.d() < d8);
            return;
        }
        if (b8 != 5) {
            throw A.e();
        }
        do {
            abstractC1106v.d(this.f11373a.s());
            if (this.f11373a.e()) {
                return;
            } else {
                B8 = this.f11373a.B();
            }
        } while (B8 == this.f11374b);
        this.f11376d = B8;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int w() {
        V(0);
        return this.f11373a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int x() {
        V(0);
        return this.f11373a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean y() {
        int i7;
        if (this.f11373a.e() || (i7 = this.f11374b) == this.f11375c) {
            return false;
        }
        return this.f11373a.E(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int z() {
        V(5);
        return this.f11373a.v();
    }
}
