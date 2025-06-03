package f2;

import f2.i;
import java.util.Map;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1289b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f14171a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f14172b;

    /* renamed from: c, reason: collision with root package name */
    public final h f14173c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14174d;

    /* renamed from: e, reason: collision with root package name */
    public final long f14175e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f14176f;

    /* renamed from: f2.b$b, reason: collision with other inner class name */
    public static final class C0206b extends i.a {

        /* renamed from: a, reason: collision with root package name */
        public String f14177a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f14178b;

        /* renamed from: c, reason: collision with root package name */
        public h f14179c;

        /* renamed from: d, reason: collision with root package name */
        public Long f14180d;

        /* renamed from: e, reason: collision with root package name */
        public Long f14181e;

        /* renamed from: f, reason: collision with root package name */
        public Map f14182f;

        @Override // f2.i.a
        public i d() {
            String str = "";
            if (this.f14177a == null) {
                str = " transportName";
            }
            if (this.f14179c == null) {
                str = str + " encodedPayload";
            }
            if (this.f14180d == null) {
                str = str + " eventMillis";
            }
            if (this.f14181e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f14182f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C1289b(this.f14177a, this.f14178b, this.f14179c, this.f14180d.longValue(), this.f14181e.longValue(), this.f14182f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f2.i.a
        public Map e() {
            Map map = this.f14182f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // f2.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f14182f = map;
            return this;
        }

        @Override // f2.i.a
        public i.a g(Integer num) {
            this.f14178b = num;
            return this;
        }

        @Override // f2.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f14179c = hVar;
            return this;
        }

        @Override // f2.i.a
        public i.a i(long j7) {
            this.f14180d = Long.valueOf(j7);
            return this;
        }

        @Override // f2.i.a
        public i.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f14177a = str;
            return this;
        }

        @Override // f2.i.a
        public i.a k(long j7) {
            this.f14181e = Long.valueOf(j7);
            return this;
        }
    }

    public C1289b(String str, Integer num, h hVar, long j7, long j8, Map map) {
        this.f14171a = str;
        this.f14172b = num;
        this.f14173c = hVar;
        this.f14174d = j7;
        this.f14175e = j8;
        this.f14176f = map;
    }

    @Override // f2.i
    public Map c() {
        return this.f14176f;
    }

    @Override // f2.i
    public Integer d() {
        return this.f14172b;
    }

    @Override // f2.i
    public h e() {
        return this.f14173c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f14171a.equals(iVar.j()) && ((num = this.f14172b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f14173c.equals(iVar.e()) && this.f14174d == iVar.f() && this.f14175e == iVar.k() && this.f14176f.equals(iVar.c());
    }

    @Override // f2.i
    public long f() {
        return this.f14174d;
    }

    public int hashCode() {
        int hashCode = (this.f14171a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f14172b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f14173c.hashCode()) * 1000003;
        long j7 = this.f14174d;
        int i7 = (hashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f14175e;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f14176f.hashCode();
    }

    @Override // f2.i
    public String j() {
        return this.f14171a;
    }

    @Override // f2.i
    public long k() {
        return this.f14175e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f14171a + ", code=" + this.f14172b + ", encodedPayload=" + this.f14173c + ", eventMillis=" + this.f14174d + ", uptimeMillis=" + this.f14175e + ", autoMetadata=" + this.f14176f + "}";
    }
}
