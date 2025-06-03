package r6;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f19127a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final c f19128b = new c();

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f19129a;

        public a(Throwable th) {
            this.f19129a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.a(this.f19129a, ((a) obj).f19129a);
        }

        public int hashCode() {
            Throwable th = this.f19129a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // r6.g.c
        public String toString() {
            return "Closed(" + this.f19129a + ')';
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final Object a(Throwable th) {
            return g.b(new a(th));
        }

        public final Object b() {
            return g.b(g.f19128b);
        }

        public final Object c(Object obj) {
            return g.b(obj);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f19129a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
