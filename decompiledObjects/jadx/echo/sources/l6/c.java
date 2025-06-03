package l6;

import kotlin.jvm.internal.g;

/* loaded from: classes.dex */
public final class c extends l6.a {

    /* renamed from: s, reason: collision with root package name */
    public static final a f17305s = new a(null);

    /* renamed from: t, reason: collision with root package name */
    public static final c f17306t = new c(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final c a() {
            return c.f17306t;
        }
    }

    public c(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // l6.a
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || d() != cVar.d()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // l6.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + d();
    }

    @Override // l6.a
    public boolean isEmpty() {
        return a() > d();
    }

    public Integer k() {
        return Integer.valueOf(d());
    }

    public Integer q() {
        return Integer.valueOf(a());
    }

    @Override // l6.a
    public String toString() {
        return a() + ".." + d();
    }
}
