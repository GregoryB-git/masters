package d4;

import d4.c;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final List f13283a;

    /* renamed from: b, reason: collision with root package name */
    public final List f13284b;

    public class a extends c.AbstractC0192c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f13285a;

        public a(b bVar) {
            this.f13285a = bVar;
        }

        @Override // d4.c.AbstractC0192c
        public void b(C1227b c1227b, n nVar) {
            this.f13285a.q(c1227b);
            d.f(nVar, this.f13285a);
            this.f13285a.l();
        }
    }

    public static class b {

        /* renamed from: d, reason: collision with root package name */
        public int f13289d;

        /* renamed from: h, reason: collision with root package name */
        public final InterfaceC0193d f13293h;

        /* renamed from: a, reason: collision with root package name */
        public StringBuilder f13286a = null;

        /* renamed from: b, reason: collision with root package name */
        public Stack f13287b = new Stack();

        /* renamed from: c, reason: collision with root package name */
        public int f13288c = -1;

        /* renamed from: e, reason: collision with root package name */
        public boolean f13290e = true;

        /* renamed from: f, reason: collision with root package name */
        public final List f13291f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public final List f13292g = new ArrayList();

        public b(InterfaceC0193d interfaceC0193d) {
            this.f13293h = interfaceC0193d;
        }

        public final void g(StringBuilder sb, C1227b c1227b) {
            sb.append(Y3.m.j(c1227b.e()));
        }

        public boolean h() {
            return this.f13286a != null;
        }

        public int i() {
            return this.f13286a.length();
        }

        public V3.k j() {
            return k(this.f13289d);
        }

        public final V3.k k(int i7) {
            C1227b[] c1227bArr = new C1227b[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                c1227bArr[i8] = (C1227b) this.f13287b.get(i8);
            }
            return new V3.k(c1227bArr);
        }

        public final void l() {
            this.f13289d--;
            if (h()) {
                this.f13286a.append(")");
            }
            this.f13290e = true;
        }

        public final void m() {
            Y3.m.g(h(), "Can't end range without starting a range!");
            for (int i7 = 0; i7 < this.f13289d; i7++) {
                this.f13286a.append(")");
            }
            this.f13286a.append(")");
            V3.k k7 = k(this.f13288c);
            this.f13292g.add(Y3.m.i(this.f13286a.toString()));
            this.f13291f.add(k7);
            this.f13286a = null;
        }

        public final void n() {
            if (h()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            this.f13286a = sb;
            sb.append("(");
            Iterator it = k(this.f13289d).iterator();
            while (it.hasNext()) {
                g(this.f13286a, (C1227b) it.next());
                this.f13286a.append(":(");
            }
            this.f13290e = false;
        }

        public final void o() {
            Y3.m.g(this.f13289d == 0, "Can't finish hashing in the middle processing a child");
            if (h()) {
                m();
            }
            this.f13292g.add("");
        }

        public final void p(k kVar) {
            n();
            this.f13288c = this.f13289d;
            this.f13286a.append(kVar.O(n.b.V2));
            this.f13290e = true;
            if (this.f13293h.a(this)) {
                m();
            }
        }

        public final void q(C1227b c1227b) {
            n();
            if (this.f13290e) {
                this.f13286a.append(",");
            }
            g(this.f13286a, c1227b);
            this.f13286a.append(":(");
            if (this.f13289d == this.f13287b.size()) {
                this.f13287b.add(c1227b);
            } else {
                this.f13287b.set(this.f13289d, c1227b);
            }
            this.f13289d++;
            this.f13290e = false;
        }
    }

    public static class c implements InterfaceC0193d {

        /* renamed from: a, reason: collision with root package name */
        public final long f13294a;

        public c(n nVar) {
            this.f13294a = Math.max(512L, (long) Math.sqrt(Y3.e.b(nVar) * 100));
        }

        @Override // d4.d.InterfaceC0193d
        public boolean a(b bVar) {
            return ((long) bVar.i()) > this.f13294a && (bVar.j().isEmpty() || !bVar.j().X().equals(C1227b.o()));
        }
    }

    /* renamed from: d4.d$d, reason: collision with other inner class name */
    public interface InterfaceC0193d {
        boolean a(b bVar);
    }

    public d(List list, List list2) {
        if (list.size() != list2.size() - 1) {
            throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
        }
        this.f13283a = list;
        this.f13284b = list2;
    }

    public static d b(n nVar) {
        return c(nVar, new c(nVar));
    }

    public static d c(n nVar, InterfaceC0193d interfaceC0193d) {
        if (nVar.isEmpty()) {
            return new d(Collections.emptyList(), Collections.singletonList(""));
        }
        b bVar = new b(interfaceC0193d);
        f(nVar, bVar);
        bVar.o();
        return new d(bVar.f13291f, bVar.f13292g);
    }

    public static void f(n nVar, b bVar) {
        if (nVar.B()) {
            bVar.p((k) nVar);
            return;
        }
        if (nVar.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        }
        if (nVar instanceof d4.c) {
            ((d4.c) nVar).S(new a(bVar), true);
            return;
        }
        throw new IllegalStateException("Expected children node, but got: " + nVar);
    }

    public List d() {
        return Collections.unmodifiableList(this.f13284b);
    }

    public List e() {
        return Collections.unmodifiableList(this.f13283a);
    }
}
