package o2;

/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c f11723a = new a.c();

    /* renamed from: b, reason: collision with root package name */
    public static final a.b f11724b = new a.b();

    public static abstract class a {

        /* renamed from: o2.m$a$a, reason: collision with other inner class name */
        public static final class C0184a extends a {

            /* renamed from: a, reason: collision with root package name */
            public final Throwable f11725a;

            public C0184a(Throwable th) {
                this.f11725a = th;
            }

            public final String toString() {
                StringBuilder l10 = defpackage.f.l("FAILURE (");
                l10.append(this.f11725a.getMessage());
                l10.append(")");
                return l10.toString();
            }
        }

        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
