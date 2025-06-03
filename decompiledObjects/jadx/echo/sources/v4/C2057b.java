package v4;

import v4.AbstractC2061f;

/* renamed from: v4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2057b extends AbstractC2061f {

    /* renamed from: a, reason: collision with root package name */
    public final String f20150a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20151b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC2061f.b f20152c;

    /* renamed from: v4.b$b, reason: collision with other inner class name */
    public static final class C0281b extends AbstractC2061f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f20153a;

        /* renamed from: b, reason: collision with root package name */
        public Long f20154b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC2061f.b f20155c;

        @Override // v4.AbstractC2061f.a
        public AbstractC2061f a() {
            String str = "";
            if (this.f20154b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2057b(this.f20153a, this.f20154b.longValue(), this.f20155c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // v4.AbstractC2061f.a
        public AbstractC2061f.a b(AbstractC2061f.b bVar) {
            this.f20155c = bVar;
            return this;
        }

        @Override // v4.AbstractC2061f.a
        public AbstractC2061f.a c(String str) {
            this.f20153a = str;
            return this;
        }

        @Override // v4.AbstractC2061f.a
        public AbstractC2061f.a d(long j7) {
            this.f20154b = Long.valueOf(j7);
            return this;
        }
    }

    public C2057b(String str, long j7, AbstractC2061f.b bVar) {
        this.f20150a = str;
        this.f20151b = j7;
        this.f20152c = bVar;
    }

    @Override // v4.AbstractC2061f
    public AbstractC2061f.b b() {
        return this.f20152c;
    }

    @Override // v4.AbstractC2061f
    public String c() {
        return this.f20150a;
    }

    @Override // v4.AbstractC2061f
    public long d() {
        return this.f20151b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2061f)) {
            return false;
        }
        AbstractC2061f abstractC2061f = (AbstractC2061f) obj;
        String str = this.f20150a;
        if (str != null ? str.equals(abstractC2061f.c()) : abstractC2061f.c() == null) {
            if (this.f20151b == abstractC2061f.d()) {
                AbstractC2061f.b bVar = this.f20152c;
                AbstractC2061f.b b7 = abstractC2061f.b();
                if (bVar == null) {
                    if (b7 == null) {
                        return true;
                    }
                } else if (bVar.equals(b7)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f20150a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f20151b;
        int i7 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        AbstractC2061f.b bVar = this.f20152c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f20150a + ", tokenExpirationTimestamp=" + this.f20151b + ", responseCode=" + this.f20152c + "}";
    }
}
