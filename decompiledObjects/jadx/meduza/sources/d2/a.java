package d2;

import android.os.Build;
import d2.j0;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class a implements p {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f3343c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3345b;

    /* renamed from: d2.a$a, reason: collision with other inner class name */
    public static class C0061a {

        /* renamed from: a, reason: collision with root package name */
        public static final HashSet f3346a = new HashSet(Arrays.asList(j0.b.f3390a.a()));
    }

    public static class b extends a {
        public b(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        public c(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static class d extends a {
        public d(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        public g() {
            super("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE");
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        public h(String str, String str2) {
            super(str, str2);
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        public i() {
            super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        }

        @Override // d2.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    public a(String str, String str2) {
        this.f3344a = str;
        this.f3345b = str2;
        f3343c.add(this);
    }

    @Override // d2.p
    public final String a() {
        return this.f3344a;
    }

    @Override // d2.p
    public final boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        HashSet hashSet = C0061a.f3346a;
        String str = this.f3345b;
        if (!hashSet.contains(str)) {
            String str2 = Build.TYPE;
            if (!("eng".equals(str2) || "userdebug".equals(str2))) {
                return false;
            }
            if (!hashSet.contains(str + ":dev")) {
                return false;
            }
        }
        return true;
    }
}
