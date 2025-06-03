package m2;

import java.util.Map;
import p2.InterfaceC1791a;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1666b extends f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1791a f17669a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f17670b;

    public C1666b(InterfaceC1791a interfaceC1791a, Map map) {
        if (interfaceC1791a == null) {
            throw new NullPointerException("Null clock");
        }
        this.f17669a = interfaceC1791a;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f17670b = map;
    }

    @Override // m2.f
    public InterfaceC1791a e() {
        return this.f17669a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f17669a.equals(fVar.e()) && this.f17670b.equals(fVar.h());
    }

    @Override // m2.f
    public Map h() {
        return this.f17670b;
    }

    public int hashCode() {
        return ((this.f17669a.hashCode() ^ 1000003) * 1000003) ^ this.f17670b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f17669a + ", values=" + this.f17670b + "}";
    }
}
