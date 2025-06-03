package J3;

import J3.B;

/* loaded from: classes.dex */
public final class w extends B.e.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f3023a;

    public static final class b extends B.e.f.a {

        /* renamed from: a, reason: collision with root package name */
        public String f3024a;

        @Override // J3.B.e.f.a
        public B.e.f a() {
            String str = "";
            if (this.f3024a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new w(this.f3024a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J3.B.e.f.a
        public B.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f3024a = str;
            return this;
        }
    }

    public w(String str) {
        this.f3023a = str;
    }

    @Override // J3.B.e.f
    public String b() {
        return this.f3023a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B.e.f) {
            return this.f3023a.equals(((B.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3023a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f3023a + "}";
    }
}
