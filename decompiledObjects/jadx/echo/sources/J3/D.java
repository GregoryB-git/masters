package J3;

/* loaded from: classes.dex */
public abstract class D {

    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i7, E3.e eVar) {
            return new y(str, str2, str3, str4, i7, eVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract E3.e d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class b {
        public static b c(int i7, String str, int i8, long j7, long j8, boolean z7, int i9, String str2, String str3) {
            return new z(i7, str, i8, j7, j8, z7, i9, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static c a(String str, String str2, boolean z7) {
            return new A(str, str2, z7);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static D b(a aVar, c cVar, b bVar) {
        return new x(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
