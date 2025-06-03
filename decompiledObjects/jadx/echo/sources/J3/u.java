package J3;

import J3.B;

/* loaded from: classes.dex */
public final class u extends B.e.d.AbstractC0056d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3013a;

    public static final class b extends B.e.d.AbstractC0056d.a {

        /* renamed from: a, reason: collision with root package name */
        public String f3014a;

        @Override // J3.B.e.d.AbstractC0056d.a
        public B.e.d.AbstractC0056d a() {
            String str = "";
            if (this.f3014a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new u(this.f3014a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.d.AbstractC0056d.a
        public B.e.d.AbstractC0056d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f3014a = str;
            return this;
        }
    }

    public u(String str) {
        this.f3013a = str;
    }

    @Override // J3.B.e.d.AbstractC0056d
    public String b() {
        return this.f3013a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.d.AbstractC0056d) {
            return this.f3013a.equals(((B.e.d.AbstractC0056d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3013a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f3013a + "}";
    }
}
