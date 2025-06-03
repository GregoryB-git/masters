package e2;

import e2.AbstractC1252k;

/* renamed from: e2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1246e extends AbstractC1252k {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1252k.b f13845a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1242a f13846b;

    /* renamed from: e2.e$b */
    public static final class b extends AbstractC1252k.a {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC1252k.b f13847a;

        /* renamed from: b, reason: collision with root package name */
        public AbstractC1242a f13848b;

        @Override // e2.AbstractC1252k.a
        public AbstractC1252k a() {
            return new C1246e(this.f13847a, this.f13848b);
        }

        @Override // e2.AbstractC1252k.a
        public AbstractC1252k.a b(AbstractC1242a abstractC1242a) {
            this.f13848b = abstractC1242a;
            return this;
        }

        @Override // e2.AbstractC1252k.a
        public AbstractC1252k.a c(AbstractC1252k.b bVar) {
            this.f13847a = bVar;
            return this;
        }
    }

    public C1246e(AbstractC1252k.b bVar, AbstractC1242a abstractC1242a) {
        this.f13845a = bVar;
        this.f13846b = abstractC1242a;
    }

    @Override // e2.AbstractC1252k
    public AbstractC1242a b() {
        return this.f13846b;
    }

    @Override // e2.AbstractC1252k
    public AbstractC1252k.b c() {
        return this.f13845a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1252k)) {
            return false;
        }
        AbstractC1252k abstractC1252k = (AbstractC1252k) obj;
        AbstractC1252k.b bVar = this.f13845a;
        if (bVar != null ? bVar.equals(abstractC1252k.c()) : abstractC1252k.c() == null) {
            AbstractC1242a abstractC1242a = this.f13846b;
            AbstractC1242a b7 = abstractC1252k.b();
            if (abstractC1242a == null) {
                if (b7 == null) {
                    return true;
                }
            } else if (abstractC1242a.equals(b7)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC1252k.b bVar = this.f13845a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC1242a abstractC1242a = this.f13846b;
        return hashCode ^ (abstractC1242a != null ? abstractC1242a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f13845a + ", androidClientInfo=" + this.f13846b + "}";
    }
}
