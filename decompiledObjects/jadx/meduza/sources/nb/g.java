package nb;

import eb.a;
import eb.k0;
import eb.o;
import java.util.IdentityHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a, reason: collision with root package name */
    public final k0.e f11385a;

    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        public final k0.i f11386a;

        /* renamed from: b, reason: collision with root package name */
        public final k0.k f11387b;

        /* renamed from: nb.g$a$a, reason: collision with other inner class name */
        public class C0178a implements k0.k {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ k0.k f11388a;

            public C0178a(k0.k kVar) {
                this.f11388a = kVar;
            }

            @Override // eb.k0.k
            public final void a(o oVar) {
                this.f11388a.a(oVar);
                a.this.f11387b.a(oVar);
            }
        }

        public a(k0.i iVar, k0.k kVar) {
            x6.b.y(iVar, "delegate");
            this.f11386a = iVar;
            x6.b.y(kVar, "healthListener");
            this.f11387b = kVar;
        }

        @Override // eb.k0.i
        public final eb.a c() {
            eb.a c10 = this.f11386a.c();
            c10.getClass();
            a.b<Boolean> bVar = k0.f5149d;
            Boolean bool = Boolean.TRUE;
            IdentityHashMap identityHashMap = new IdentityHashMap(1);
            identityHashMap.put(bVar, bool);
            for (Map.Entry<a.b<?>, Object> entry : c10.f5013a.entrySet()) {
                if (!identityHashMap.containsKey(entry.getKey())) {
                    identityHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            return new eb.a(identityHashMap);
        }

        @Override // eb.k0.i
        public final void h(k0.k kVar) {
            this.f11386a.h(new C0178a(kVar));
        }

        @Override // nb.d
        public final k0.i j() {
            return this.f11386a;
        }
    }

    public g(k0.e eVar) {
        x6.b.y(eVar, "helper");
        this.f11385a = eVar;
    }

    @Override // nb.c, eb.k0.e
    public final k0.i a(k0.b bVar) {
        a.b<Map<String, ?>> bVar2 = k0.f5147b;
        k0.k kVar = (k0.k) bVar.a();
        k0.i a10 = super.a(bVar);
        return !(kVar != null && a10.c().a(k0.f5149d) == null) ? a10 : new a(a10, kVar);
    }

    @Override // nb.c
    public final k0.e g() {
        return this.f11385a;
    }
}
