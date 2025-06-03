package e2;

import e2.AbstractC1256o;

/* renamed from: e2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1250i extends AbstractC1256o {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1256o.c f13878a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1256o.b f13879b;

    /* renamed from: e2.i$b */
    public static final class b extends AbstractC1256o.a {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1256o.c f13880a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC1256o.b f13881b;

        @Override // e2.AbstractC1256o.a
        public AbstractC1256o a() {
            return new C1250i(this.f13880a, this.f13881b);
        }

        @Override // e2.AbstractC1256o.a
        public AbstractC1256o.a b(AbstractC1256o.b bVar) {
            this.f13881b = bVar;
            return this;
        }

        @Override // e2.AbstractC1256o.a
        public AbstractC1256o.a c(AbstractC1256o.c cVar) {
            this.f13880a = cVar;
            return this;
        }
    }

    public C1250i(AbstractC1256o.c cVar, AbstractC1256o.b bVar) {
        this.f13878a = cVar;
        this.f13879b = bVar;
    }

    @Override // e2.AbstractC1256o
    public AbstractC1256o.b b() {
        return this.f13879b;
    }

    @Override // e2.AbstractC1256o
    public AbstractC1256o.c c() {
        return this.f13878a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1256o)) {
            return false;
        }
        AbstractC1256o abstractC1256o = (AbstractC1256o) obj;
        AbstractC1256o.c cVar = this.f13878a;
        if (cVar != null ? cVar.equals(abstractC1256o.c()) : abstractC1256o.c() == null) {
            AbstractC1256o.b bVar = this.f13879b;
            AbstractC1256o.b b7 = abstractC1256o.b();
            if (bVar == null) {
                if (b7 == null) {
                    return true;
                }
            } else if (bVar.equals(b7)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC1256o.c cVar = this.f13878a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC1256o.b bVar = this.f13879b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f13878a + ", mobileSubtype=" + this.f13879b + "}";
    }
}
