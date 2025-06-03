package q3;

import java.util.Set;
import q3.e;

/* loaded from: classes.dex */
public final class c extends e.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f13224a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13225b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<e.b> f13226c;

    public static final class a extends e.a.AbstractC0199a {

        /* renamed from: a, reason: collision with root package name */
        public Long f13227a;

        /* renamed from: b, reason: collision with root package name */
        public Long f13228b;

        /* renamed from: c, reason: collision with root package name */
        public Set<e.b> f13229c;

        public final c a() {
            String str = this.f13227a == null ? " delta" : "";
            if (this.f13228b == null) {
                str = defpackage.g.d(str, " maxAllowedDelay");
            }
            if (this.f13229c == null) {
                str = defpackage.g.d(str, " flags");
            }
            if (str.isEmpty()) {
                return new c(this.f13227a.longValue(), this.f13228b.longValue(), this.f13229c);
            }
            throw new IllegalStateException(defpackage.g.d("Missing required properties:", str));
        }
    }

    public c(long j10, long j11, Set set) {
        this.f13224a = j10;
        this.f13225b = j11;
        this.f13226c = set;
    }

    @Override // q3.e.a
    public final long a() {
        return this.f13224a;
    }

    @Override // q3.e.a
    public final Set<e.b> b() {
        return this.f13226c;
    }

    @Override // q3.e.a
    public final long c() {
        return this.f13225b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e.a)) {
            return false;
        }
        e.a aVar = (e.a) obj;
        return this.f13224a == aVar.a() && this.f13225b == aVar.c() && this.f13226c.equals(aVar.b());
    }

    public final int hashCode() {
        long j10 = this.f13224a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        long j11 = this.f13225b;
        return ((i10 ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f13226c.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("ConfigValue{delta=");
        l10.append(this.f13224a);
        l10.append(", maxAllowedDelay=");
        l10.append(this.f13225b);
        l10.append(", flags=");
        l10.append(this.f13226c);
        l10.append("}");
        return l10.toString();
    }
}
