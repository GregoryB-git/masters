package pc;

/* loaded from: classes.dex */
public final class j<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final b f13163b = new b();

    /* renamed from: a, reason: collision with root package name */
    public final Object f13164a;

    public static final class a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f13165a;

        public a(Throwable th) {
            this.f13165a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && ec.i.a(this.f13165a, ((a) obj).f13165a);
        }

        public final int hashCode() {
            Throwable th = this.f13165a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // pc.j.b
        public final String toString() {
            StringBuilder l10 = defpackage.f.l("Closed(");
            l10.append(this.f13165a);
            l10.append(')');
            return l10.toString();
        }
    }

    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ j(Object obj) {
        this.f13164a = obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof j) && ec.i.a(this.f13164a, ((j) obj).f13164a);
    }

    public final int hashCode() {
        Object obj = this.f13164a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13164a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
