package e2;

import e2.AbstractC1254m;
import java.util.List;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1248g extends AbstractC1254m {

    /* renamed from: a, reason: collision with root package name */
    public final long f13863a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13864b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1252k f13865c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f13866d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13867e;

    /* renamed from: f, reason: collision with root package name */
    public final List f13868f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC1257p f13869g;

    /* renamed from: e2.g$b */
    public static final class b extends AbstractC1254m.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f13870a;

        /* renamed from: b, reason: collision with root package name */
        public Long f13871b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC1252k f13872c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f13873d;

        /* renamed from: e, reason: collision with root package name */
        public String f13874e;

        /* renamed from: f, reason: collision with root package name */
        public List f13875f;

        /* renamed from: g, reason: collision with root package name */
        public EnumC1257p f13876g;

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m a() {
            String str = "";
            if (this.f13870a == null) {
                str = " requestTimeMs";
            }
            if (this.f13871b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C1248g(this.f13870a.longValue(), this.f13871b.longValue(), this.f13872c, this.f13873d, this.f13874e, this.f13875f, this.f13876g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a b(AbstractC1252k abstractC1252k) {
            this.f13872c = abstractC1252k;
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a c(List list) {
            this.f13875f = list;
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a d(Integer num) {
            this.f13873d = num;
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a e(String str) {
            this.f13874e = str;
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a f(EnumC1257p enumC1257p) {
            this.f13876g = enumC1257p;
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a g(long j7) {
            this.f13870a = Long.valueOf(j7);
            return this;
        }

        @Override // e2.AbstractC1254m.a
        public AbstractC1254m.a h(long j7) {
            this.f13871b = Long.valueOf(j7);
            return this;
        }
    }

    public C1248g(long j7, long j8, AbstractC1252k abstractC1252k, Integer num, String str, List list, EnumC1257p enumC1257p) {
        this.f13863a = j7;
        this.f13864b = j8;
        this.f13865c = abstractC1252k;
        this.f13866d = num;
        this.f13867e = str;
        this.f13868f = list;
        this.f13869g = enumC1257p;
    }

    @Override // e2.AbstractC1254m
    public AbstractC1252k b() {
        return this.f13865c;
    }

    @Override // e2.AbstractC1254m
    public List c() {
        return this.f13868f;
    }

    @Override // e2.AbstractC1254m
    public Integer d() {
        return this.f13866d;
    }

    @Override // e2.AbstractC1254m
    public String e() {
        return this.f13867e;
    }

    public boolean equals(Object obj) {
        AbstractC1252k abstractC1252k;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1254m)) {
            return false;
        }
        AbstractC1254m abstractC1254m = (AbstractC1254m) obj;
        if (this.f13863a == abstractC1254m.g() && this.f13864b == abstractC1254m.h() && ((abstractC1252k = this.f13865c) != null ? abstractC1252k.equals(abstractC1254m.b()) : abstractC1254m.b() == null) && ((num = this.f13866d) != null ? num.equals(abstractC1254m.d()) : abstractC1254m.d() == null) && ((str = this.f13867e) != null ? str.equals(abstractC1254m.e()) : abstractC1254m.e() == null) && ((list = this.f13868f) != null ? list.equals(abstractC1254m.c()) : abstractC1254m.c() == null)) {
            EnumC1257p enumC1257p = this.f13869g;
            EnumC1257p f7 = abstractC1254m.f();
            if (enumC1257p == null) {
                if (f7 == null) {
                    return true;
                }
            } else if (enumC1257p.equals(f7)) {
                return true;
            }
        }
        return false;
    }

    @Override // e2.AbstractC1254m
    public EnumC1257p f() {
        return this.f13869g;
    }

    @Override // e2.AbstractC1254m
    public long g() {
        return this.f13863a;
    }

    @Override // e2.AbstractC1254m
    public long h() {
        return this.f13864b;
    }

    public int hashCode() {
        long j7 = this.f13863a;
        long j8 = this.f13864b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        AbstractC1252k abstractC1252k = this.f13865c;
        int hashCode = (i7 ^ (abstractC1252k == null ? 0 : abstractC1252k.hashCode())) * 1000003;
        Integer num = this.f13866d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f13867e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f13868f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC1257p enumC1257p = this.f13869g;
        return hashCode4 ^ (enumC1257p != null ? enumC1257p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f13863a + ", requestUptimeMs=" + this.f13864b + ", clientInfo=" + this.f13865c + ", logSource=" + this.f13866d + ", logSourceName=" + this.f13867e + ", logEvents=" + this.f13868f + ", qosTier=" + this.f13869g + "}";
    }
}
