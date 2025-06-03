package i2;

import android.graphics.Rect;
import i2.b;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f2.a f7364a;

    /* renamed from: b, reason: collision with root package name */
    public final a f7365b;

    /* renamed from: c, reason: collision with root package name */
    public final b.C0108b f7366c;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f7367b = new a("FOLD");

        /* renamed from: c, reason: collision with root package name */
        public static final a f7368c = new a("HINGE");

        /* renamed from: a, reason: collision with root package name */
        public final String f7369a;

        public a(String str) {
            this.f7369a = str;
        }

        public final String toString() {
            return this.f7369a;
        }
    }

    public c(f2.a aVar, a aVar2, b.C0108b c0108b) {
        this.f7364a = aVar;
        this.f7365b = aVar2;
        this.f7366c = c0108b;
        int i10 = aVar.f5303c;
        int i11 = aVar.f5301a;
        if (!((i10 - i11 == 0 && aVar.f5304d - aVar.f5302b == 0) ? false : true)) {
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
        if (!(i11 == 0 || aVar.f5302b == 0)) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
        }
    }

    @Override // i2.b
    public final b.a a() {
        f2.a aVar = this.f7364a;
        return (aVar.f5303c - aVar.f5301a == 0 || aVar.f5304d - aVar.f5302b == 0) ? b.a.f7358b : b.a.f7359c;
    }

    @Override // i2.b
    public final b.C0108b e() {
        return this.f7366c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ec.i.a(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ec.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        c cVar = (c) obj;
        return ec.i.a(this.f7364a, cVar.f7364a) && ec.i.a(this.f7365b, cVar.f7365b) && ec.i.a(this.f7366c, cVar.f7366c);
    }

    @Override // i2.a
    public final Rect getBounds() {
        f2.a aVar = this.f7364a;
        aVar.getClass();
        return new Rect(aVar.f5301a, aVar.f5302b, aVar.f5303c, aVar.f5304d);
    }

    public final int hashCode() {
        return this.f7366c.hashCode() + ((this.f7365b.hashCode() + (this.f7364a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f7364a + ", type=" + this.f7365b + ", state=" + this.f7366c + " }";
    }
}
