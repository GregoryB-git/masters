package n2;

import n2.AbstractC1708e;

/* renamed from: n2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1704a extends AbstractC1708e {

    /* renamed from: b, reason: collision with root package name */
    public final long f17904b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17905c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17906d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17907e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17908f;

    /* renamed from: n2.a$b */
    public static final class b extends AbstractC1708e.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f17909a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f17910b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f17911c;

        /* renamed from: d, reason: collision with root package name */
        public Long f17912d;

        /* renamed from: e, reason: collision with root package name */
        public Integer f17913e;

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e a() {
            String str = "";
            if (this.f17909a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f17910b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f17911c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f17912d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f17913e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C1704a(this.f17909a.longValue(), this.f17910b.intValue(), this.f17911c.intValue(), this.f17912d.longValue(), this.f17913e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e.a b(int i7) {
            this.f17911c = Integer.valueOf(i7);
            return this;
        }

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e.a c(long j7) {
            this.f17912d = Long.valueOf(j7);
            return this;
        }

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e.a d(int i7) {
            this.f17910b = Integer.valueOf(i7);
            return this;
        }

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e.a e(int i7) {
            this.f17913e = Integer.valueOf(i7);
            return this;
        }

        @Override // n2.AbstractC1708e.a
        public AbstractC1708e.a f(long j7) {
            this.f17909a = Long.valueOf(j7);
            return this;
        }
    }

    public C1704a(long j7, int i7, int i8, long j8, int i9) {
        this.f17904b = j7;
        this.f17905c = i7;
        this.f17906d = i8;
        this.f17907e = j8;
        this.f17908f = i9;
    }

    @Override // n2.AbstractC1708e
    public int b() {
        return this.f17906d;
    }

    @Override // n2.AbstractC1708e
    public long c() {
        return this.f17907e;
    }

    @Override // n2.AbstractC1708e
    public int d() {
        return this.f17905c;
    }

    @Override // n2.AbstractC1708e
    public int e() {
        return this.f17908f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1708e)) {
            return false;
        }
        AbstractC1708e abstractC1708e = (AbstractC1708e) obj;
        return this.f17904b == abstractC1708e.f() && this.f17905c == abstractC1708e.d() && this.f17906d == abstractC1708e.b() && this.f17907e == abstractC1708e.c() && this.f17908f == abstractC1708e.e();
    }

    @Override // n2.AbstractC1708e
    public long f() {
        return this.f17904b;
    }

    public int hashCode() {
        long j7 = this.f17904b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f17905c) * 1000003) ^ this.f17906d) * 1000003;
        long j8 = this.f17907e;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f17908f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f17904b + ", loadBatchSize=" + this.f17905c + ", criticalSectionEnterTimeoutMs=" + this.f17906d + ", eventCleanUpAge=" + this.f17907e + ", maxBlobByteSizePerRow=" + this.f17908f + "}";
    }
}
