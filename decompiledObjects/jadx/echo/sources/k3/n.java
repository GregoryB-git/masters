package k3;

import c3.AbstractC0829g;
import c3.C0844v;
import c3.InterfaceC0845w;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16168a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16169b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map f16170a;

        /* renamed from: b, reason: collision with root package name */
        public final Map f16171b;

        public b() {
            this.f16170a = new HashMap();
            this.f16171b = new HashMap();
        }

        public n c() {
            return new n(this);
        }

        public b d(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("primitive constructor must be non-null");
            }
            c cVar = new c(lVar.c(), lVar.d());
            if (this.f16170a.containsKey(cVar)) {
                l lVar2 = (l) this.f16170a.get(cVar);
                if (!lVar2.equals(lVar) || !lVar.equals(lVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + cVar);
                }
            } else {
                this.f16170a.put(cVar, lVar);
            }
            return this;
        }

        public b e(InterfaceC0845w interfaceC0845w) {
            if (interfaceC0845w == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class c7 = interfaceC0845w.c();
            if (this.f16171b.containsKey(c7)) {
                InterfaceC0845w interfaceC0845w2 = (InterfaceC0845w) this.f16171b.get(c7);
                if (!interfaceC0845w2.equals(interfaceC0845w) || !interfaceC0845w.equals(interfaceC0845w2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + c7);
                }
            } else {
                this.f16171b.put(c7, interfaceC0845w);
            }
            return this;
        }

        public b(n nVar) {
            this.f16170a = new HashMap(nVar.f16168a);
            this.f16171b = new HashMap(nVar.f16169b);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class f16172a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f16173b;

        public c(Class cls, Class cls2) {
            this.f16172a = cls;
            this.f16173b = cls2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f16172a.equals(this.f16172a) && cVar.f16173b.equals(this.f16173b);
        }

        public int hashCode() {
            return Objects.hash(this.f16172a, this.f16173b);
        }

        public String toString() {
            return this.f16172a.getSimpleName() + " with primitive type: " + this.f16173b.getSimpleName();
        }
    }

    public n(b bVar) {
        this.f16168a = new HashMap(bVar.f16170a);
        this.f16169b = new HashMap(bVar.f16171b);
    }

    public Class c(Class cls) {
        if (this.f16169b.containsKey(cls)) {
            return ((InterfaceC0845w) this.f16169b.get(cls)).a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    public Object d(AbstractC0829g abstractC0829g, Class cls) {
        c cVar = new c(abstractC0829g.getClass(), cls);
        if (this.f16168a.containsKey(cVar)) {
            return ((l) this.f16168a.get(cVar)).a(abstractC0829g);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + cVar + " available");
    }

    public Object e(C0844v c0844v, Class cls) {
        if (!this.f16169b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + cls);
        }
        InterfaceC0845w interfaceC0845w = (InterfaceC0845w) this.f16169b.get(cls);
        if (c0844v.g().equals(interfaceC0845w.a()) && interfaceC0845w.a().equals(c0844v.g())) {
            return interfaceC0845w.b(c0844v);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
