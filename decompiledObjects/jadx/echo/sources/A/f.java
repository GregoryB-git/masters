package A;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f1e = new f(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5d;

    public static class a {
        public static Insets a(int i7, int i8, int i9, int i10) {
            return Insets.of(i7, i8, i9, i10);
        }
    }

    public f(int i7, int i8, int i9, int i10) {
        this.f2a = i7;
        this.f3b = i8;
        this.f4c = i9;
        this.f5d = i10;
    }

    public static f a(f fVar, f fVar2) {
        return b(Math.max(fVar.f2a, fVar2.f2a), Math.max(fVar.f3b, fVar2.f3b), Math.max(fVar.f4c, fVar2.f4c), Math.max(fVar.f5d, fVar2.f5d));
    }

    public static f b(int i7, int i8, int i9, int i10) {
        return (i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) ? f1e : new f(i7, i8, i9, i10);
    }

    public static f c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static f d(Insets insets) {
        int i7;
        int i8;
        int i9;
        int i10;
        i7 = insets.left;
        i8 = insets.top;
        i9 = insets.right;
        i10 = insets.bottom;
        return b(i7, i8, i9, i10);
    }

    public Insets e() {
        return a.a(this.f2a, this.f3b, this.f4c, this.f5d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f5d == fVar.f5d && this.f2a == fVar.f2a && this.f4c == fVar.f4c && this.f3b == fVar.f3b;
    }

    public int hashCode() {
        return (((((this.f2a * 31) + this.f3b) * 31) + this.f4c) * 31) + this.f5d;
    }

    public String toString() {
        return "Insets{left=" + this.f2a + ", top=" + this.f3b + ", right=" + this.f4c + ", bottom=" + this.f5d + '}';
    }
}
