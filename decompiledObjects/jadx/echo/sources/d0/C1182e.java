package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1182e {

    /* renamed from: a, reason: collision with root package name */
    public final int f12612a;

    /* renamed from: b, reason: collision with root package name */
    public final float f12613b;

    public C1182e(int i7, float f7) {
        this.f12612a = i7;
        this.f12613b = f7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1182e.class != obj.getClass()) {
            return false;
        }
        C1182e c1182e = (C1182e) obj;
        return this.f12612a == c1182e.f12612a && Float.compare(c1182e.f12613b, this.f12613b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f12612a) * 31) + Float.floatToIntBits(this.f12613b);
    }
}
