package T5;

/* loaded from: classes.dex */
public final class f implements AutoCloseable {
    public f(String str) {
        a(str);
    }

    public static void a(String str) {
        t1.b.c(c(str));
    }

    public static void b(String str, int i7) {
        t1.b.a(c(str), i7);
    }

    public static String c(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void e() {
        t1.b.f();
    }

    public static void h(String str, int i7) {
        t1.b.d(c(str), i7);
    }

    public static f i(String str) {
        return new f(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e();
    }
}
