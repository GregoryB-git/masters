package q3;

import java.util.Map;
import q3.e;

/* loaded from: classes.dex */
public final class b extends e {

    /* renamed from: a, reason: collision with root package name */
    public final t3.a f13222a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<h3.e, e.a> f13223b;

    public b(t3.a aVar, Map<h3.e, e.a> map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f13222a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f13223b = map;
    }

    @Override // q3.e
    public final t3.a a() {
        return this.f13222a;
    }

    @Override // q3.e
    public final Map<h3.e, e.a> c() {
        return this.f13223b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13222a.equals(eVar.a()) && this.f13223b.equals(eVar.c());
    }

    public final int hashCode() {
        return ((this.f13222a.hashCode() ^ 1000003) * 1000003) ^ this.f13223b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("SchedulerConfig{clock=");
        l10.append(this.f13222a);
        l10.append(", values=");
        l10.append(this.f13223b);
        l10.append("}");
        return l10.toString();
    }
}
