package ga;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f6132a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f6133b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6134c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f6135d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6136e;

    public g(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f6132a = bool;
        this.f6133b = d10;
        this.f6134c = num;
        this.f6135d = num2;
        this.f6136e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return ec.i.a(this.f6132a, gVar.f6132a) && ec.i.a(this.f6133b, gVar.f6133b) && ec.i.a(this.f6134c, gVar.f6134c) && ec.i.a(this.f6135d, gVar.f6135d) && ec.i.a(this.f6136e, gVar.f6136e);
    }

    public final int hashCode() {
        Boolean bool = this.f6132a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f6133b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f6134c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6135d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f6136e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SessionConfigs(sessionEnabled=");
        l10.append(this.f6132a);
        l10.append(", sessionSamplingRate=");
        l10.append(this.f6133b);
        l10.append(", sessionRestartTimeout=");
        l10.append(this.f6134c);
        l10.append(", cacheDuration=");
        l10.append(this.f6135d);
        l10.append(", cacheUpdatedTime=");
        l10.append(this.f6136e);
        l10.append(')');
        return l10.toString();
    }
}
