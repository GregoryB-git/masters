package T4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f6249a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f6250b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f6251c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f6252d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6253e;

    public e(Boolean bool, Double d7, Integer num, Integer num2, Long l7) {
        this.f6249a = bool;
        this.f6250b = d7;
        this.f6251c = num;
        this.f6252d = num2;
        this.f6253e = l7;
    }

    public final Integer a() {
        return this.f6252d;
    }

    public final Long b() {
        return this.f6253e;
    }

    public final Boolean c() {
        return this.f6249a;
    }

    public final Integer d() {
        return this.f6251c;
    }

    public final Double e() {
        return this.f6250b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.a(this.f6249a, eVar.f6249a) && Intrinsics.a(this.f6250b, eVar.f6250b) && Intrinsics.a(this.f6251c, eVar.f6251c) && Intrinsics.a(this.f6252d, eVar.f6252d) && Intrinsics.a(this.f6253e, eVar.f6253e);
    }

    public int hashCode() {
        Boolean bool = this.f6249a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d7 = this.f6250b;
        int hashCode2 = (hashCode + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num = this.f6251c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6252d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l7 = this.f6253e;
        return hashCode4 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f6249a + ", sessionSamplingRate=" + this.f6250b + ", sessionRestartTimeout=" + this.f6251c + ", cacheDuration=" + this.f6252d + ", cacheUpdatedTime=" + this.f6253e + ')';
    }
}
