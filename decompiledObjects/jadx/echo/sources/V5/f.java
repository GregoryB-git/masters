package V5;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: s, reason: collision with root package name */
    public static final a f6788s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final f f6789t = g.a();

    /* renamed from: o, reason: collision with root package name */
    public final int f6790o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6791p;

    /* renamed from: q, reason: collision with root package name */
    public final int f6792q;

    /* renamed from: r, reason: collision with root package name */
    public final int f6793r;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f(int i7, int i8, int i9) {
        this.f6790o = i7;
        this.f6791p = i8;
        this.f6792q = i9;
        this.f6793r = e(i7, i8, i9);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f6793r - other.f6793r;
    }

    public final int e(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 < 256 && i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f fVar = obj instanceof f ? (f) obj : null;
        return fVar != null && this.f6793r == fVar.f6793r;
    }

    public int hashCode() {
        return this.f6793r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6790o);
        sb.append('.');
        sb.append(this.f6791p);
        sb.append('.');
        sb.append(this.f6792q);
        return sb.toString();
    }
}
