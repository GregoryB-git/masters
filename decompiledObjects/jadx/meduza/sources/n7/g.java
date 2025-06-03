package n7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f11288a;

        /* renamed from: b, reason: collision with root package name */
        public final b f11289b;

        /* renamed from: c, reason: collision with root package name */
        public b f11290c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f11291d;

        /* renamed from: n7.g$a$a, reason: collision with other inner class name */
        public static final class C0172a extends b {
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public String f11292a;

            /* renamed from: b, reason: collision with root package name */
            public Object f11293b;

            /* renamed from: c, reason: collision with root package name */
            public b f11294c;
        }

        public a(String str) {
            b bVar = new b();
            this.f11289b = bVar;
            this.f11290c = bVar;
            this.f11291d = false;
            this.f11288a = str;
        }

        public final void a(Object obj, String str) {
            b bVar = new b();
            this.f11290c.f11294c = bVar;
            this.f11290c = bVar;
            bVar.f11293b = obj;
            bVar.f11292a = str;
        }

        public final void b(String str, long j10) {
            d(String.valueOf(j10), str);
        }

        public final void c(String str, boolean z10) {
            d(String.valueOf(z10), str);
        }

        public final void d(String str, String str2) {
            C0172a c0172a = new C0172a();
            this.f11290c.f11294c = c0172a;
            this.f11290c = c0172a;
            c0172a.f11293b = str;
            c0172a.f11292a = str2;
        }

        public final String toString() {
            boolean z10 = this.f11291d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f11288a);
            sb2.append('{');
            String str = "";
            for (b bVar = this.f11289b.f11294c; bVar != null; bVar = bVar.f11294c) {
                Object obj = bVar.f11293b;
                if ((bVar instanceof C0172a) || obj != null || !z10) {
                    sb2.append(str);
                    String str2 = bVar.f11292a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb2.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static a a(Class<?> cls) {
        return new a(cls.getSimpleName());
    }

    public static a b(Object obj) {
        return new a(obj.getClass().getSimpleName());
    }
}
