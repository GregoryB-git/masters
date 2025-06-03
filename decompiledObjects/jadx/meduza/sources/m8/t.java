package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class t extends f0.e.d.a.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10684c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10685d;

    public static final class a extends f0.e.d.a.c.AbstractC0158a {

        /* renamed from: a, reason: collision with root package name */
        public String f10686a;

        /* renamed from: b, reason: collision with root package name */
        public int f10687b;

        /* renamed from: c, reason: collision with root package name */
        public int f10688c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f10689d;

        /* renamed from: e, reason: collision with root package name */
        public byte f10690e;

        public final t a() {
            String str;
            if (this.f10690e == 7 && (str = this.f10686a) != null) {
                return new t(str, this.f10687b, this.f10688c, this.f10689d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f10686a == null) {
                sb2.append(" processName");
            }
            if ((this.f10690e & 1) == 0) {
                sb2.append(" pid");
            }
            if ((this.f10690e & 2) == 0) {
                sb2.append(" importance");
            }
            if ((this.f10690e & 4) == 0) {
                sb2.append(" defaultProcess");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public t(String str, int i10, int i11, boolean z10) {
        this.f10682a = str;
        this.f10683b = i10;
        this.f10684c = i11;
        this.f10685d = z10;
    }

    @Override // m8.f0.e.d.a.c
    public final int a() {
        return this.f10684c;
    }

    @Override // m8.f0.e.d.a.c
    public final int b() {
        return this.f10683b;
    }

    @Override // m8.f0.e.d.a.c
    public final String c() {
        return this.f10682a;
    }

    @Override // m8.f0.e.d.a.c
    public final boolean d() {
        return this.f10685d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.a.c)) {
            return false;
        }
        f0.e.d.a.c cVar = (f0.e.d.a.c) obj;
        return this.f10682a.equals(cVar.c()) && this.f10683b == cVar.b() && this.f10684c == cVar.a() && this.f10685d == cVar.d();
    }

    public final int hashCode() {
        return ((((((this.f10682a.hashCode() ^ 1000003) * 1000003) ^ this.f10683b) * 1000003) ^ this.f10684c) * 1000003) ^ (this.f10685d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ProcessDetails{processName=");
        l10.append(this.f10682a);
        l10.append(", pid=");
        l10.append(this.f10683b);
        l10.append(", importance=");
        l10.append(this.f10684c);
        l10.append(", defaultProcess=");
        l10.append(this.f10685d);
        l10.append("}");
        return l10.toString();
    }
}
