package x;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f16490e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f16491a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16492b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16493c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16494d;

    public static class a {
        public static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    public b(int i10, int i11, int i12, int i13) {
        this.f16491a = i10;
        this.f16492b = i11;
        this.f16493c = i12;
        this.f16494d = i13;
    }

    public static b a(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f16490e : new b(i10, i11, i12, i13);
    }

    public final Insets b() {
        return a.a(this.f16491a, this.f16492b, this.f16493c, this.f16494d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f16494d == bVar.f16494d && this.f16491a == bVar.f16491a && this.f16493c == bVar.f16493c && this.f16492b == bVar.f16492b;
    }

    public final int hashCode() {
        return (((((this.f16491a * 31) + this.f16492b) * 31) + this.f16493c) * 31) + this.f16494d;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Insets{left=");
        l10.append(this.f16491a);
        l10.append(", top=");
        l10.append(this.f16492b);
        l10.append(", right=");
        l10.append(this.f16493c);
        l10.append(", bottom=");
        l10.append(this.f16494d);
        l10.append('}');
        return l10.toString();
    }
}
