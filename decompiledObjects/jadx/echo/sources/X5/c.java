package X5;

import X5.g;
import g6.p;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.t;

/* loaded from: classes.dex */
public final class c implements g, Serializable {

    /* renamed from: o, reason: collision with root package name */
    public final g f7283o;

    /* renamed from: p, reason: collision with root package name */
    public final g.b f7284p;

    public static final class a implements Serializable {

        /* renamed from: p, reason: collision with root package name */
        public static final C0128a f7285p = new C0128a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: o, reason: collision with root package name */
        public final g[] f7286o;

        /* renamed from: X5.c$a$a, reason: collision with other inner class name */
        public static final class C0128a {
            public C0128a() {
            }

            public /* synthetic */ C0128a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public a(g[] elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f7286o = elements;
        }

        private final Object readResolve() {
            g[] gVarArr = this.f7286o;
            g gVar = h.f7293o;
            for (g gVar2 : gVarArr) {
                gVar = gVar.k(gVar2);
            }
            return gVar;
        }
    }

    public static final class b extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f7287o = new b();

        public b() {
            super(2);
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            Intrinsics.checkNotNullParameter(acc, "acc");
            Intrinsics.checkNotNullParameter(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    /* renamed from: X5.c$c, reason: collision with other inner class name */
    public static final class C0129c extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ g[] f7288o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ t f7289p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0129c(g[] gVarArr, t tVar) {
            super(2);
            this.f7288o = gVarArr;
            this.f7289p = tVar;
        }

        public final void a(V5.t tVar, g.b element) {
            Intrinsics.checkNotNullParameter(tVar, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            g[] gVarArr = this.f7288o;
            t tVar2 = this.f7289p;
            int i7 = tVar2.f16229o;
            tVar2.f16229o = i7 + 1;
            gVarArr[i7] = element;
        }

        @Override // g6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((V5.t) obj, (g.b) obj2);
            return V5.t.f6803a;
        }
    }

    public c(g left, g.b element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f7283o = left;
        this.f7284p = element;
    }

    private final Object writeReplace() {
        int g7 = g();
        g[] gVarArr = new g[g7];
        t tVar = new t();
        u(V5.t.f6803a, new C0129c(gVarArr, tVar));
        if (tVar.f16229o == g7) {
            return new a(gVarArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // X5.g
    public g.b b(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        c cVar = this;
        while (true) {
            g.b b7 = cVar.f7284p.b(key);
            if (b7 != null) {
                return b7;
            }
            g gVar = cVar.f7283o;
            if (!(gVar instanceof c)) {
                return gVar.b(key);
            }
            cVar = (c) gVar;
        }
    }

    public final boolean d(g.b bVar) {
        return Intrinsics.a(b(bVar.getKey()), bVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.g() != g() || !cVar.f(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(c cVar) {
        while (d(cVar.f7284p)) {
            g gVar = cVar.f7283o;
            if (!(gVar instanceof c)) {
                Intrinsics.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((g.b) gVar);
            }
            cVar = (c) gVar;
        }
        return false;
    }

    public final int g() {
        int i7 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f7283o;
            cVar = gVar instanceof c ? (c) gVar : null;
            if (cVar == null) {
                return i7;
            }
            i7++;
        }
    }

    public int hashCode() {
        return this.f7283o.hashCode() + this.f7284p.hashCode();
    }

    @Override // X5.g
    public g k(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) u("", b.f7287o)) + ']';
    }

    @Override // X5.g
    public Object u(Object obj, p operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f7283o.u(obj, operation), this.f7284p);
    }

    @Override // X5.g
    public g x(g.c key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (this.f7284p.b(key) != null) {
            return this.f7283o;
        }
        g x7 = this.f7283o.x(key);
        return x7 == this.f7283o ? this : x7 == h.f7293o ? this.f7284p : new c(x7, this.f7284p);
    }
}
