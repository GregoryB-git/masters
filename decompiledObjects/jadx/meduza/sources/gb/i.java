package gb;

import eb.k0;
import gb.r1;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final eb.m0 f6465a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6466b;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k0.e f6467a;

        /* renamed from: b, reason: collision with root package name */
        public eb.k0 f6468b;

        /* renamed from: c, reason: collision with root package name */
        public eb.l0 f6469c;

        public a(r1.k kVar) {
            this.f6467a = kVar;
            eb.l0 b10 = i.this.f6465a.b(i.this.f6466b);
            this.f6469c = b10;
            if (b10 == null) {
                throw new IllegalStateException(defpackage.g.f(defpackage.f.l("Could not find policy '"), i.this.f6466b, "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files."));
            }
            this.f6468b = b10.a(kVar);
        }
    }

    public static final class b extends k0.j {
        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return k0.f.f5160e;
        }

        public final String toString() {
            return n7.g.a(b.class).toString();
        }
    }

    public static final class c extends k0.j {

        /* renamed from: a, reason: collision with root package name */
        public final eb.e1 f6471a;

        public c(eb.e1 e1Var) {
            this.f6471a = e1Var;
        }

        @Override // eb.k0.j
        public final k0.f a(k0.g gVar) {
            return k0.f.a(this.f6471a);
        }
    }

    public static final class d extends eb.k0 {
        @Override // eb.k0
        public final eb.e1 a(k0.h hVar) {
            return eb.e1.f5070e;
        }

        @Override // eb.k0
        public final void c(eb.e1 e1Var) {
        }

        @Override // eb.k0
        @Deprecated
        public final void d(k0.h hVar) {
        }

        @Override // eb.k0
        public final void f() {
        }
    }

    public static final class e extends Exception {
        public e(String str) {
            super(str);
        }
    }

    public i(String str) {
        eb.m0 a10 = eb.m0.a();
        x6.b.y(a10, "registry");
        this.f6465a = a10;
        x6.b.y(str, "defaultPolicy");
        this.f6466b = str;
    }

    public static eb.l0 a(i iVar, String str) {
        eb.l0 b10 = iVar.f6465a.b(str);
        if (b10 != null) {
            return b10;
        }
        throw new e("Trying to load '" + str + "' because using default policy, but it's unavailable");
    }
}
