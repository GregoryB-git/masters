package x3;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f17028a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final float f17029b = 0.0f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f17028a == pVar.f17028a && Float.compare(pVar.f17029b, this.f17029b) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f17029b) + ((527 + this.f17028a) * 31);
    }
}
