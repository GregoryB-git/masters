package m8;

import m8.f0;

/* loaded from: classes.dex */
public final class w extends f0.e.d.AbstractC0160e {

    /* renamed from: a, reason: collision with root package name */
    public final f0.e.d.AbstractC0160e.b f10703a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10704b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10705c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10706d;

    public static final class a extends f0.e.d.AbstractC0160e.a {

        /* renamed from: a, reason: collision with root package name */
        public f0.e.d.AbstractC0160e.b f10707a;

        /* renamed from: b, reason: collision with root package name */
        public String f10708b;

        /* renamed from: c, reason: collision with root package name */
        public String f10709c;

        /* renamed from: d, reason: collision with root package name */
        public long f10710d;

        /* renamed from: e, reason: collision with root package name */
        public byte f10711e;

        public final w a() {
            f0.e.d.AbstractC0160e.b bVar;
            String str;
            String str2;
            if (this.f10711e == 1 && (bVar = this.f10707a) != null && (str = this.f10708b) != null && (str2 = this.f10709c) != null) {
                return new w(bVar, str, str2, this.f10710d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f10707a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f10708b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f10709c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f10711e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException(a0.j.l("Missing required properties:", sb2));
        }
    }

    public w(f0.e.d.AbstractC0160e.b bVar, String str, String str2, long j10) {
        this.f10703a = bVar;
        this.f10704b = str;
        this.f10705c = str2;
        this.f10706d = j10;
    }

    @Override // m8.f0.e.d.AbstractC0160e
    public final String a() {
        return this.f10704b;
    }

    @Override // m8.f0.e.d.AbstractC0160e
    public final String b() {
        return this.f10705c;
    }

    @Override // m8.f0.e.d.AbstractC0160e
    public final f0.e.d.AbstractC0160e.b c() {
        return this.f10703a;
    }

    @Override // m8.f0.e.d.AbstractC0160e
    public final long d() {
        return this.f10706d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.e.d.AbstractC0160e)) {
            return false;
        }
        f0.e.d.AbstractC0160e abstractC0160e = (f0.e.d.AbstractC0160e) obj;
        return this.f10703a.equals(abstractC0160e.c()) && this.f10704b.equals(abstractC0160e.a()) && this.f10705c.equals(abstractC0160e.b()) && this.f10706d == abstractC0160e.d();
    }

    public final int hashCode() {
        int hashCode = (((((this.f10703a.hashCode() ^ 1000003) * 1000003) ^ this.f10704b.hashCode()) * 1000003) ^ this.f10705c.hashCode()) * 1000003;
        long j10 = this.f10706d;
        return hashCode ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("RolloutAssignment{rolloutVariant=");
        l10.append(this.f10703a);
        l10.append(", parameterKey=");
        l10.append(this.f10704b);
        l10.append(", parameterValue=");
        l10.append(this.f10705c);
        l10.append(", templateVersion=");
        l10.append(this.f10706d);
        l10.append("}");
        return l10.toString();
    }
}
