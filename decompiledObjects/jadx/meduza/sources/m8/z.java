package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class z extends f0.e.AbstractC0161e {

    /* renamed from: a, reason: collision with root package name */
    public final int f10715a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10716b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10717c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10718d;

    public static final class a extends f0.e.AbstractC0161e.a {

        /* renamed from: a, reason: collision with root package name */
        public int f10719a;

        /* renamed from: b, reason: collision with root package name */
        public String f10720b;

        /* renamed from: c, reason: collision with root package name */
        public String f10721c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10722d;

        /* renamed from: e, reason: collision with root package name */
        public byte f10723e;

        public final z a() {
            String str;
            String str2;
            if (this.f10723e == 3 && (str = this.f10720b) != null && (str2 = this.f10721c) != null) {
                return new z(this.f10719a, str, str2, this.f10722d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f10723e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f10720b == null) {
                sb2.append(" version");
            }
            if (this.f10721c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f10723e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public z(int i10, String str, String str2, boolean z10) {
        this.f10715a = i10;
        this.f10716b = str;
        this.f10717c = str2;
        this.f10718d = z10;
    }

    @Override // m8.f0.e.AbstractC0161e
    public final String a() {
        return this.f10717c;
    }

    @Override // m8.f0.e.AbstractC0161e
    public final int b() {
        return this.f10715a;
    }

    @Override // m8.f0.e.AbstractC0161e
    public final String c() {
        return this.f10716b;
    }

    @Override // m8.f0.e.AbstractC0161e
    public final boolean d() {
        return this.f10718d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.AbstractC0161e)) {
            return false;
        }
        f0.e.AbstractC0161e abstractC0161e = (f0.e.AbstractC0161e) obj;
        return this.f10715a == abstractC0161e.b() && this.f10716b.equals(abstractC0161e.c()) && this.f10717c.equals(abstractC0161e.a()) && this.f10718d == abstractC0161e.d();
    }

    public final int hashCode() {
        return ((((((this.f10715a ^ 1000003) * 1000003) ^ this.f10716b.hashCode()) * 1000003) ^ this.f10717c.hashCode()) * 1000003) ^ (this.f10718d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("OperatingSystem{platform=");
        l10.append(this.f10715a);
        l10.append(", version=");
        l10.append(this.f10716b);
        l10.append(", buildVersion=");
        l10.append(this.f10717c);
        l10.append(", jailbroken=");
        l10.append(this.f10718d);
        l10.append("}");
        return l10.toString();
    }
}
