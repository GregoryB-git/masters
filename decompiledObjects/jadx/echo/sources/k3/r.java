package k3;

import c3.AbstractC0829g;
import c3.C0847y;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import r3.C1919a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16180a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16181b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f16182c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f16183d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f16184a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f16185b;

        /* renamed from: c, reason: collision with root package name */
        public final Map f16186c;

        /* renamed from: d, reason: collision with root package name */
        public final Map f16187d;

        public b() {
            this.f16184a = new HashMap();
            this.f16185b = new HashMap();
            this.f16186c = new HashMap();
            this.f16187d = new HashMap();
        }

        public r e() {
            return new r(this);
        }

        public b f(AbstractC1464b abstractC1464b) {
            c cVar = new c(abstractC1464b.c(), abstractC1464b.b());
            if (this.f16185b.containsKey(cVar)) {
                AbstractC1464b abstractC1464b2 = (AbstractC1464b) this.f16185b.get(cVar);
                if (!abstractC1464b2.equals(abstractC1464b) || !abstractC1464b.equals(abstractC1464b2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f16185b.put(cVar, abstractC1464b);
            }
            return this;
        }

        public b g(AbstractC1465c abstractC1465c) {
            d dVar = new d(abstractC1465c.b(), abstractC1465c.c());
            if (this.f16184a.containsKey(dVar)) {
                AbstractC1465c abstractC1465c2 = (AbstractC1465c) this.f16184a.get(dVar);
                if (!abstractC1465c2.equals(abstractC1465c) || !abstractC1465c.equals(abstractC1465c2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f16184a.put(dVar, abstractC1465c);
            }
            return this;
        }

        public b h(j jVar) {
            c cVar = new c(jVar.c(), jVar.b());
            if (this.f16187d.containsKey(cVar)) {
                j jVar2 = (j) this.f16187d.get(cVar);
                if (!jVar2.equals(jVar) || !jVar.equals(jVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + cVar);
                }
            } else {
                this.f16187d.put(cVar, jVar);
            }
            return this;
        }

        public b i(k kVar) {
            d dVar = new d(kVar.b(), kVar.c());
            if (this.f16186c.containsKey(dVar)) {
                k kVar2 = (k) this.f16186c.get(dVar);
                if (!kVar2.equals(kVar) || !kVar.equals(kVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + dVar);
                }
            } else {
                this.f16186c.put(dVar, kVar);
            }
            return this;
        }

        public b(r rVar) {
            this.f16184a = new HashMap(rVar.f16180a);
            this.f16185b = new HashMap(rVar.f16181b);
            this.f16186c = new HashMap(rVar.f16182c);
            this.f16187d = new HashMap(rVar.f16183d);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16188a;

        /* renamed from: b, reason: collision with root package name */
        public final C1919a f16189b;

        public c(Class cls, C1919a c1919a) {
            this.f16188a = cls;
            this.f16189b = c1919a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f16188a.equals(this.f16188a) && cVar.f16189b.equals(this.f16189b);
        }

        public int hashCode() {
            return Objects.hash(this.f16188a, this.f16189b);
        }

        public String toString() {
            return this.f16188a.getSimpleName() + ", object identifier: " + this.f16189b;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16190a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f16191b;

        public d(Class cls, Class cls2) {
            this.f16190a = cls;
            this.f16191b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return dVar.f16190a.equals(this.f16190a) && dVar.f16191b.equals(this.f16191b);
        }

        public int hashCode() {
            return Objects.hash(this.f16190a, this.f16191b);
        }

        public String toString() {
            return this.f16190a.getSimpleName() + " with serialization type: " + this.f16191b.getSimpleName();
        }
    }

    public r(b bVar) {
        this.f16180a = new HashMap(bVar.f16184a);
        this.f16181b = new HashMap(bVar.f16185b);
        this.f16182c = new HashMap(bVar.f16186c);
        this.f16183d = new HashMap(bVar.f16187d);
    }

    public boolean e(q qVar) {
        return this.f16181b.containsKey(new c(qVar.getClass(), qVar.a()));
    }

    public AbstractC0829g f(q qVar, C0847y c0847y) {
        c cVar = new c(qVar.getClass(), qVar.a());
        if (this.f16181b.containsKey(cVar)) {
            return ((AbstractC1464b) this.f16181b.get(cVar)).d(qVar, c0847y);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + cVar + " available");
    }
}
