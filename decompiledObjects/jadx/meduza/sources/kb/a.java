package kb;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9234b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9235c;

    /* renamed from: kb.a$a, reason: collision with other inner class name */
    public static final class C0139a {

        /* renamed from: a, reason: collision with root package name */
        public String f9236a;

        /* renamed from: b, reason: collision with root package name */
        public String f9237b;

        /* renamed from: c, reason: collision with root package name */
        public int f9238c = -1;

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f9236a);
            sb2.append("://");
            int i10 = -1;
            if (this.f9237b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f9237b);
                sb2.append(']');
            } else {
                sb2.append(this.f9237b);
            }
            int i11 = this.f9238c;
            if (i11 == -1) {
                String str = this.f9236a;
                i11 = str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
            }
            String str2 = this.f9236a;
            if (str2.equals("http")) {
                i10 = 80;
            } else if (str2.equals("https")) {
                i10 = 443;
            }
            if (i11 != i10) {
                sb2.append(':');
                sb2.append(i11);
            }
            return sb2.toString();
        }
    }

    public a(C0139a c0139a) {
        String str = c0139a.f9236a;
        this.f9233a = c0139a.f9237b;
        int i10 = c0139a.f9238c;
        this.f9234b = i10 == -1 ? str.equals("http") ? 80 : str.equals("https") ? 443 : -1 : i10;
        this.f9235c = c0139a.toString();
    }

    public static int a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f9235c.equals(this.f9235c);
    }

    public final int hashCode() {
        return this.f9235c.hashCode();
    }

    public final String toString() {
        return this.f9235c;
    }
}
