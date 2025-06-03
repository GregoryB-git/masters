package v3;

/* loaded from: classes.dex */
public final class e1 implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final e1 f15326d = new e1(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f15327a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15328b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15329c;

    static {
        v5.e0.E(0);
        v5.e0.E(1);
    }

    public e1(float f) {
        this(f, 1.0f);
    }

    public e1(float f, float f10) {
        x6.b.q(f > 0.0f);
        x6.b.q(f10 > 0.0f);
        this.f15327a = f;
        this.f15328b = f10;
        this.f15329c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e1.class != obj.getClass()) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return this.f15327a == e1Var.f15327a && this.f15328b == e1Var.f15328b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f15328b) + ((Float.floatToRawIntBits(this.f15327a) + 527) * 31);
    }

    public final String toString() {
        return v5.e0.m("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f15327a), Float.valueOf(this.f15328b));
    }
}
