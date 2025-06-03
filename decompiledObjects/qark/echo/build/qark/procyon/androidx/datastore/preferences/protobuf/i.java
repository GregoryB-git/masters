// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.util.Map;
import java.util.List;

public final class i implements d0
{
    public final h a;
    public int b;
    public int c;
    public int d;
    
    public i(h a) {
        this.d = 0;
        a = (h)y.b(a, "input");
        this.a = a;
        a.d = this;
    }
    
    public static i O(final h h) {
        final i d = h.d;
        if (d != null) {
            return d;
        }
        return new i(h);
    }
    
    private Object P(final r0.b b, final Class clazz, final o o) {
        switch (i$a.a[b.ordinal()]) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                return this.c();
            }
            case 16: {
                return this.w();
            }
            case 15: {
                return this.F();
            }
            case 14: {
                return this.j();
            }
            case 13: {
                return this.h();
            }
            case 12: {
                return this.r();
            }
            case 11: {
                return this.z();
            }
            case 10: {
                return this.S(clazz, o);
            }
            case 9: {
                return this.E();
            }
            case 8: {
                return this.x();
            }
            case 7: {
                return this.readFloat();
            }
            case 6: {
                return this.f();
            }
            case 5: {
                return this.n();
            }
            case 4: {
                return this.b();
            }
            case 3: {
                return this.readDouble();
            }
            case 2: {
                return this.u();
            }
            case 1: {
                return this.o();
            }
        }
    }
    
    private Object Q(final e0 e0, final o o) {
        final int c = this.c;
        this.c = r0.c(r0.a(this.b), 4);
        try {
            final Object f = e0.f();
            e0.h(f, this, o);
            e0.b(f);
            if (this.b == this.c) {
                return f;
            }
            throw z.g();
        }
        finally {
            this.c = c;
        }
    }
    
    private Object R(final e0 e0, final o o) {
        final int c = this.a.C();
        final h a = this.a;
        if (a.a < a.b) {
            final int l = a.l(c);
            final Object f = e0.f();
            final h a2 = this.a;
            ++a2.a;
            e0.h(f, this, o);
            e0.b(f);
            this.a.a(0);
            final h a3 = this.a;
            --a3.a;
            a3.k(l);
            return f;
        }
        throw z.h();
    }
    
    private void U(final int n) {
        if (this.a.d() == n) {
            return;
        }
        throw z.k();
    }
    
    private void V(final int n) {
        if (r0.b(this.b) == n) {
            return;
        }
        throw z.d();
    }
    
    private void W(final int n) {
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw z.g();
    }
    
    private void X(final int n) {
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw z.g();
    }
    
    @Override
    public void A(final List list) {
        if (r0.b(this.b) == 2) {
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
        throw z.d();
    }
    
    @Override
    public void B(final List list) {
        if (list instanceof l) {
            final l l = (l)list;
            final int b = r0.b(this.b);
            if (b == 1) {
                this.a.o();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.X(this.a.C());
            this.a.d();
            this.a.o();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 1) {
                int i;
                do {
                    list.add(this.a.o());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    list.add(this.a.o());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void C(final List list) {
        if (list instanceof F) {
            final F f = (F)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.u();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.u();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.u());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.u());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void D(final List list) {
        if (list instanceof F) {
            final F f = (F)list;
            final int b = r0.b(this.b);
            if (b == 1) {
                this.a.w();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.X(this.a.C());
            this.a.d();
            this.a.w();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 1) {
                int i;
                do {
                    list.add(this.a.w());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    list.add(this.a.w());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw z.d();
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
            final int b = r0.b(this.b);
            if (b == 1) {
                this.a.r();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.X(this.a.C());
            this.a.d();
            this.a.r();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 1) {
                int i;
                do {
                    list.add(this.a.r());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int c = this.a.C();
                this.X(c);
                do {
                    list.add(this.a.r());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void H(final List list) {
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.t();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.t();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.t());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.t());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void I(final List list) {
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.p();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.p();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.p());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.p());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public Object J(final e0 e0, final o o) {
        this.V(2);
        return this.R(e0, o);
    }
    
    @Override
    public void K(Map map, final H.a a, final o o) {
        this.V(2);
        final int l = this.a.l(this.a.C());
        Object o2 = a.b;
        Object o3 = a.d;
        while (true) {
            try {
                while (true) {
                    final int p3 = this.p();
                    Label_0166: {
                        if (p3 == Integer.MAX_VALUE || this.a.e()) {
                            break Label_0166;
                        }
                        Label_0126: {
                            if (p3 == 1) {
                                break Label_0126;
                            }
                            Label_0101: {
                                if (p3 == 2) {
                                    break Label_0101;
                                }
                                while (true) {
                                    while (true) {
                                        try {
                                            if (this.y()) {
                                                break;
                                            }
                                            throw new z("Unable to parse map entry.");
                                            o3 = this.P(a.c, a.d.getClass(), o);
                                            break;
                                            // iftrue(Label_0155:, !this.y())
                                            break;
                                            this.a.k(l);
                                            break;
                                            Label_0155: {
                                                throw new z("Unable to parse map entry.");
                                            }
                                            map.put(o2, o3);
                                            this.a.k(l);
                                            return;
                                            o2 = this.P(a.a, null, null);
                                            break;
                                        }
                                        catch (z.a a2) {}
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            finally {}
            final Map<Object, Object> map2;
            map = map2;
            continue;
        }
    }
    
    @Override
    public void L(final List list, final e0 e0, final o o) {
        if (r0.b(this.b) == 3) {
            int i;
            do {
                list.add(this.Q(e0, o));
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
        throw z.d();
    }
    
    @Override
    public void M(final List list, final e0 e0, final o o) {
        if (r0.b(this.b) == 2) {
            int i;
            do {
                list.add(this.R(e0, o));
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
        throw z.d();
    }
    
    @Override
    public Object N(final e0 e0, final o o) {
        this.V(3);
        return this.Q(e0, o);
    }
    
    public Object S(final Class clazz, final o o) {
        this.V(2);
        return this.R(a0.a().c(clazz), o);
    }
    
    public void T(final List list, final boolean b) {
        if (r0.b(this.b) != 2) {
            throw z.d();
        }
        if (list instanceof D && !b) {
            final D d = (D)list;
            int i;
            do {
                d.H(this.u());
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
    
    @Override
    public void a(final List list) {
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.x();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.x();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.x());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.x());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
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
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 2) {
                this.W(this.a.C());
                this.a.d();
                this.a.q();
                throw null;
            }
            if (b != 5) {
                throw z.d();
            }
            this.a.q();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    list.add(this.a.q());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b2 == 5) {
                int i;
                do {
                    list.add(this.a.q());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw z.d();
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
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 2) {
                this.W(this.a.C());
                this.a.d();
                this.a.v();
                throw null;
            }
            if (b != 5) {
                throw z.d();
            }
            this.a.v();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    list.add(this.a.v());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b2 == 5) {
                int i;
                do {
                    list.add(this.a.v());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public int h() {
        this.V(0);
        return this.a.x();
    }
    
    @Override
    public void i(final List list) {
        if (list instanceof F) {
            final F f = (F)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.y();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.y();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.y());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.y());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public long j() {
        this.V(0);
        return this.a.y();
    }
    
    @Override
    public void k(final List list) {
        if (list instanceof x) {
            final x x = (x)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.C();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.C();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.C());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.C());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void l(final List list) {
        if (list instanceof e) {
            final e e = (e)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.m();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.m();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.m());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.m());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
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
            return r0.a(b);
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
        if (list instanceof F) {
            final F f = (F)list;
            final int b = r0.b(this.b);
            if (b == 0) {
                this.a.D();
                throw null;
            }
            if (b != 2) {
                throw z.d();
            }
            this.a.C();
            this.a.d();
            this.a.D();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 0) {
                int i;
                do {
                    list.add(this.a.D());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (b2 == 2) {
                final int n = this.a.d() + this.a.C();
                do {
                    list.add(this.a.D());
                } while (this.a.d() < n);
                this.U(n);
                return;
            }
            throw z.d();
        }
    }
    
    @Override
    public void t(final List list) {
        this.T(list, true);
    }
    
    @Override
    public g u() {
        this.V(2);
        return this.a.n();
    }
    
    @Override
    public void v(final List list) {
        if (list instanceof u) {
            final u u = (u)list;
            final int b = r0.b(this.b);
            if (b == 2) {
                this.W(this.a.C());
                this.a.d();
                this.a.s();
                throw null;
            }
            if (b != 5) {
                throw z.d();
            }
            this.a.s();
            throw null;
        }
        else {
            final int b2 = r0.b(this.b);
            if (b2 == 2) {
                final int c = this.a.C();
                this.W(c);
                do {
                    list.add(this.a.s());
                } while (this.a.d() < this.a.d() + c);
                return;
            }
            if (b2 == 5) {
                int i;
                do {
                    list.add(this.a.s());
                    if (this.a.e()) {
                        return;
                    }
                    i = this.a.B();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw z.d();
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
