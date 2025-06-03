// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.util.Map;
import java.util.List;

public final class j implements d0
{
    public final i a;
    public int b;
    public int c;
    public int d;
    
    public j(i a) {
        this.d = 0;
        a = (i)z.b(a, "input");
        this.a = a;
        a.d = this;
    }
    
    public static j O(final i i) {
        final j d = i.d;
        if (d != null) {
            return d;
        }
        return new j(i);
    }
    
    @Override
    public void A(final List list) {
        if (q0.b(this.b) == 2) {
            int i;
            do {
                list.add(this.u());
                if (this.a.e()) {
                    return;
                }
                i = this.a.B();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw A.e();
    }
    
    @Override
    public void B(final List list) {
        if (list instanceof m) {
            final m m = (m)list;
            final int b = q0.b(this.b);
            if (b == 1) {
                int i;
                do {
                    m.d(this.a.o());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    m.d(this.a.o());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.o());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.X(c2);
                do {
                    list.add(this.a.o());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            throw A.e();
        }
    }
    
    @Override
    public void C(final List list) {
        int n;
        if (list instanceof F) {
            final F f = (F)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    f.d(this.a.u());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                f.d(this.a.u());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.u());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.u());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public void D(final List list) {
        if (list instanceof F) {
            final F f = (F)list;
            final int b = q0.b(this.b);
            if (b == 1) {
                int i;
                do {
                    f.d(this.a.w());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    f.d(this.a.w());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.w());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.X(c2);
                do {
                    list.add(this.a.w());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            throw A.e();
        }
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
    public void G(final List list) {
        if (list instanceof F) {
            final F f = (F)list;
            final int b = q0.b(this.b);
            if (b == 1) {
                int i;
                do {
                    f.d(this.a.r());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    f.d(this.a.r());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 1) {
                int j;
                do {
                    list.add(this.a.r());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.X(c2);
                do {
                    list.add(this.a.r());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            throw A.e();
        }
    }
    
    @Override
    public void H(final List list) {
        int n;
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    y.z(this.a.t());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                y.z(this.a.t());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.t());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.t());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public void I(final List list) {
        int n;
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    y.z(this.a.p());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                y.z(this.a.p());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.p());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.p());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public void J(final Object o, final e0 e0, final p p3) {
        this.V(2);
        this.Q(o, e0, p3);
    }
    
    @Override
    public void K(final List list, final e0 e0, final p p3) {
        if (q0.b(this.b) == 2) {
            int i;
            do {
                list.add(this.S(e0, p3));
                if (this.a.e()) {
                    return;
                }
                if (this.d != 0) {
                    return;
                }
                i = this.a.B();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw A.e();
    }
    
    @Override
    public void L(final Object o, final e0 e0, final p p3) {
        this.V(3);
        this.P(o, e0, p3);
    }
    
    @Override
    public void M(final Map map, final H.a a, final p p3) {
        this.V(2);
        this.a.l(this.a.C());
        throw null;
    }
    
    @Override
    public void N(final List list, final e0 e0, final p p3) {
        if (q0.b(this.b) == 3) {
            int i;
            do {
                list.add(this.R(e0, p3));
                if (this.a.e()) {
                    return;
                }
                if (this.d != 0) {
                    return;
                }
                i = this.a.B();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw A.e();
    }
    
    public final void P(final Object o, final e0 e0, final p p3) {
        final int c = this.c;
        this.c = q0.c(q0.a(this.b), 4);
        try {
            e0.j(o, this, p3);
            if (this.b == this.c) {
                return;
            }
            throw A.h();
        }
        finally {
            this.c = c;
        }
    }
    
    public final void Q(final Object o, final e0 e0, final p p3) {
        final int c = this.a.C();
        final i a = this.a;
        if (a.a < a.b) {
            final int l = a.l(c);
            final i a2 = this.a;
            ++a2.a;
            e0.j(o, this, p3);
            this.a.a(0);
            final i a3 = this.a;
            --a3.a;
            a3.k(l);
            return;
        }
        throw A.i();
    }
    
    public final Object R(final e0 e0, final p p2) {
        final Object f = e0.f();
        this.P(f, e0, p2);
        e0.b(f);
        return f;
    }
    
    public final Object S(final e0 e0, final p p2) {
        final Object f = e0.f();
        this.Q(f, e0, p2);
        e0.b(f);
        return f;
    }
    
    public void T(final List list, final boolean b) {
        if (q0.b(this.b) != 2) {
            throw A.e();
        }
        if (list instanceof D && !b) {
            final D d = (D)list;
            int i;
            do {
                d.C(this.u());
                if (this.a.e()) {
                    return;
                }
                i = this.a.B();
            } while (i == this.b);
            this.d = i;
            return;
        }
        int j;
        do {
            String s;
            if (b) {
                s = this.F();
            }
            else {
                s = this.m();
            }
            list.add(s);
            if (this.a.e()) {
                return;
            }
            j = this.a.B();
        } while (j == this.b);
        this.d = j;
    }
    
    public final void U(final int n) {
        if (this.a.d() == n) {
            return;
        }
        throw A.m();
    }
    
    public final void V(final int n) {
        if (q0.b(this.b) == n) {
            return;
        }
        throw A.e();
    }
    
    public final void W(final int n) {
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw A.h();
    }
    
    public final void X(final int n) {
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw A.h();
    }
    
    @Override
    public void a(final List list) {
        int n;
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    y.z(this.a.x());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                y.z(this.a.x());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.x());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.x());
            } while (this.a.d() < n);
        }
        this.U(n);
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
    public void d(final List list) {
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    y.z(this.a.q());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b == 5) {
                int i;
                do {
                    y.z(this.a.q());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.W(c2);
                do {
                    list.add(this.a.q());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            if (b2 == 5) {
                int j;
                do {
                    list.add(this.a.q());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw A.e();
        }
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
    public void g(final List list) {
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    y.z(this.a.v());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b == 5) {
                int i;
                do {
                    y.z(this.a.v());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.W(c2);
                do {
                    list.add(this.a.v());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            if (b2 == 5) {
                int j;
                do {
                    list.add(this.a.v());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw A.e();
        }
    }
    
    @Override
    public int h() {
        this.V(0);
        return this.a.x();
    }
    
    @Override
    public void i(final List list) {
        int n;
        if (list instanceof F) {
            final F f = (F)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    f.d(this.a.y());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                f.d(this.a.y());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.y());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.y());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public long j() {
        this.V(0);
        return this.a.y();
    }
    
    @Override
    public void k(final List list) {
        int n;
        if (list instanceof y) {
            final y y = (y)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    y.z(this.a.C());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                y.z(this.a.C());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.C());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.C());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public void l(final List list) {
        int n;
        if (list instanceof f) {
            final f f = (f)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    f.d(this.a.m());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                f.d(this.a.m());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.m());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.m());
            } while (this.a.d() < n);
        }
        this.U(n);
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
        final int d = this.d;
        if (d != 0) {
            this.b = d;
            this.d = 0;
        }
        else {
            this.b = this.a.B();
        }
        final int b = this.b;
        if (b != 0 && b != this.c) {
            return q0.a(b);
        }
        return Integer.MAX_VALUE;
    }
    
    @Override
    public void q(final List list) {
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
    public void s(final List list) {
        int n;
        if (list instanceof F) {
            final F f = (F)list;
            final int b = q0.b(this.b);
            if (b == 0) {
                int i;
                do {
                    f.d(this.a.D());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                f.d(this.a.D());
            } while (this.a.d() < n);
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 0) {
                int j;
                do {
                    list.add(this.a.D());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (b2 != 2) {
                throw A.e();
            }
            n = this.a.d() + this.a.C();
            do {
                list.add(this.a.D());
            } while (this.a.d() < n);
        }
        this.U(n);
    }
    
    @Override
    public void t(final List list) {
        this.T(list, true);
    }
    
    @Override
    public h u() {
        this.V(2);
        return this.a.n();
    }
    
    @Override
    public void v(final List list) {
        if (list instanceof v) {
            final v v = (v)list;
            final int b = q0.b(this.b);
            if (b == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    v.d(this.a.s());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b == 5) {
                int i;
                do {
                    v.d(this.a.s());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw A.e();
        }
        else {
            final int b2 = q0.b(this.b);
            if (b2 == 2) {
                final int c2 = this.a.C();
                this.W(c2);
                do {
                    list.add(this.a.s());
                } while (this.a.d() < this.a.d() + c2);
                return;
            }
            if (b2 == 5) {
                int j;
                do {
                    list.add(this.a.s());
                    if (this.a.e()) {
                        return;
                    }
                    j = this.a.B();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw A.e();
        }
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
        if (!this.a.e()) {
            final int b = this.b;
            if (b != this.c) {
                return this.a.E(b);
            }
        }
        return false;
    }
    
    @Override
    public int z() {
        this.V(5);
        return this.a.v();
    }
}
