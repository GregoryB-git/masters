package e2;

import e2.AbstractC1253l;
import java.util.Arrays;

/* renamed from: e2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1247f extends AbstractC1253l {

    /* renamed from: a, reason: collision with root package name */
    public final long f13849a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13850b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13851c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f13852d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13853e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13854f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1256o f13855g;

    /* renamed from: e2.f$b */
    public static final class b extends AbstractC1253l.a {

        /* renamed from: a, reason: collision with root package name */
        public Long f13856a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f13857b;

        /* renamed from: c, reason: collision with root package name */
        public Long f13858c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f13859d;

        /* renamed from: e, reason: collision with root package name */
        public String f13860e;

        /* renamed from: f, reason: collision with root package name */
        public Long f13861f;

        /* renamed from: g, reason: collision with root package name */
        public AbstractC1256o f13862g;

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l a() {
            String str = "";
            if (this.f13856a == null) {
                str = " eventTimeMs";
            }
            if (this.f13858c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f13861f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C1247f(this.f13856a.longValue(), this.f13857b, this.f13858c.longValue(), this.f13859d, this.f13860e, this.f13861f.longValue(), this.f13862g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a b(Integer num) {
            this.f13857b = num;
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a c(long j7) {
            this.f13856a = Long.valueOf(j7);
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a d(long j7) {
            this.f13858c = Long.valueOf(j7);
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a e(AbstractC1256o abstractC1256o) {
            this.f13862g = abstractC1256o;
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a f(byte[] bArr) {
            this.f13859d = bArr;
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a g(String str) {
            this.f13860e = str;
            return this;
        }

        @Override // e2.AbstractC1253l.a
        public AbstractC1253l.a h(long j7) {
            this.f13861f = Long.valueOf(j7);
            return this;
        }
    }

    public C1247f(long j7, Integer num, long j8, byte[] bArr, String str, long j9, AbstractC1256o abstractC1256o) {
        this.f13849a = j7;
        this.f13850b = num;
        this.f13851c = j8;
        this.f13852d = bArr;
        this.f13853e = str;
        this.f13854f = j9;
        this.f13855g = abstractC1256o;
    }

    @Override // e2.AbstractC1253l
    public Integer b() {
        return this.f13850b;
    }

    @Override // e2.AbstractC1253l
    public long c() {
        return this.f13849a;
    }

    @Override // e2.AbstractC1253l
    public long d() {
        return this.f13851c;
    }

    @Override // e2.AbstractC1253l
    public AbstractC1256o e() {
        return this.f13855g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1253l)) {
            return false;
        }
        AbstractC1253l abstractC1253l = (AbstractC1253l) obj;
        if (this.f13849a == abstractC1253l.c() && ((num = this.f13850b) != null ? num.equals(abstractC1253l.b()) : abstractC1253l.b() == null) && this.f13851c == abstractC1253l.d()) {
            if (Arrays.equals(this.f13852d, abstractC1253l instanceof C1247f ? ((C1247f) abstractC1253l).f13852d : abstractC1253l.f()) && ((str = this.f13853e) != null ? str.equals(abstractC1253l.g()) : abstractC1253l.g() == null) && this.f13854f == abstractC1253l.h()) {
                AbstractC1256o abstractC1256o = this.f13855g;
                AbstractC1256o e7 = abstractC1253l.e();
                if (abstractC1256o == null) {
                    if (e7 == null) {
                        return true;
                    }
                } else if (abstractC1256o.equals(e7)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // e2.AbstractC1253l
    public byte[] f() {
        return this.f13852d;
    }

    @Override // e2.AbstractC1253l
    public String g() {
        return this.f13853e;
    }

    @Override // e2.AbstractC1253l
    public long h() {
        return this.f13854f;
    }

    public int hashCode() {
        long j7 = this.f13849a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f13850b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j8 = this.f13851c;
        int hashCode2 = (((((i7 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f13852d)) * 1000003;
        String str = this.f13853e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j9 = this.f13854f;
        int i8 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        AbstractC1256o abstractC1256o = this.f13855g;
        return i8 ^ (abstractC1256o != null ? abstractC1256o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f13849a + ", eventCode=" + this.f13850b + ", eventUptimeMs=" + this.f13851c + ", sourceExtension=" + Arrays.toString(this.f13852d) + ", sourceExtensionJsonProto3=" + this.f13853e + ", timezoneOffsetSeconds=" + this.f13854f + ", networkConnectionInfo=" + this.f13855g + "}";
    }
}
