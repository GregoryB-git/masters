package gb;

import eb.a;
import eb.u0;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class c3 extends s0 {

    /* renamed from: d, reason: collision with root package name */
    public static final a.b<b> f6209d = new a.b<>("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");

    /* renamed from: b, reason: collision with root package name */
    public final b3 f6210b;

    /* renamed from: c, reason: collision with root package name */
    public final eb.h1 f6211c;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c3.this.b();
        }
    }

    public class b {
        public b() {
        }

        public final void a(eb.e1 e1Var) {
            if (e1Var.e()) {
                k kVar = (k) c3.this.f6210b;
                kVar.f6552b.d();
                kVar.f6552b.execute(new b.d(kVar, 23));
            } else {
                c3 c3Var = c3.this;
                ((k) c3Var.f6210b).a(c3Var.new a());
            }
        }
    }

    public class c extends u0.d {

        /* renamed from: a, reason: collision with root package name */
        public u0.d f6214a;

        public c(u0.d dVar) {
            this.f6214a = dVar;
        }

        @Override // eb.u0.d
        public final void a(eb.e1 e1Var) {
            this.f6214a.a(e1Var);
            c3.this.f6211c.execute(new u.a(this, 20));
        }

        @Override // eb.u0.d
        public final void b(u0.e eVar) {
            eb.a aVar = eVar.f5247b;
            a.b<b> bVar = c3.f6209d;
            if (aVar.a(bVar) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            u0.d dVar = this.f6214a;
            Collections.emptyList();
            eb.a aVar2 = eb.a.f5012b;
            List<eb.u> list = eVar.f5246a;
            eb.a aVar3 = eVar.f5247b;
            u0.b bVar2 = eVar.f5248c;
            aVar3.getClass();
            b bVar3 = c3.this.new b();
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar, bVar3);
            for (Map.Entry<a.b<?>, Object> entry : aVar3.f5013a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            dVar.b(new u0.e(list, new eb.a(identityHashMap), bVar2));
        }
    }

    public c3(eb.u0 u0Var, k kVar, eb.h1 h1Var) {
        super(u0Var);
        this.f6210b = kVar;
        this.f6211c = h1Var;
    }

    @Override // gb.s0, eb.u0
    public final void c() {
        super.c();
        k kVar = (k) this.f6210b;
        kVar.f6552b.d();
        kVar.f6552b.execute(new b.d(kVar, 23));
    }

    @Override // gb.s0, eb.u0
    public final void d(u0.d dVar) {
        super.d(new c(dVar));
    }
}
