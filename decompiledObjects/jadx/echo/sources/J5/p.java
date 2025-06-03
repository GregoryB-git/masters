package J5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class p {

    public interface a {
        void b(String str, Boolean bool, f fVar);

        void d(String str, f fVar);

        void f(String str, Boolean bool, f fVar);
    }

    public interface b {
        void a(f fVar);

        void c(f fVar);

        void e(String str, d dVar, f fVar);
    }

    public static class c extends E5.p {

        /* renamed from: d, reason: collision with root package name */
        public static final c f3083d = new c();

        @Override // E5.p
        public Object g(byte b7, ByteBuffer byteBuffer) {
            return b7 != Byte.MIN_VALUE ? b7 != -127 ? super.g(b7, byteBuffer) : e.a((ArrayList) f(byteBuffer)) : d.a((ArrayList) f(byteBuffer));
        }

        @Override // E5.p
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            ArrayList f7;
            if (obj instanceof d) {
                byteArrayOutputStream.write(128);
                f7 = ((d) obj).w();
            } else if (!(obj instanceof e)) {
                super.p(byteArrayOutputStream, obj);
                return;
            } else {
                byteArrayOutputStream.write(129);
                f7 = ((e) obj).f();
            }
            p(byteArrayOutputStream, f7);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public String f3084a;

        /* renamed from: b, reason: collision with root package name */
        public String f3085b;

        /* renamed from: c, reason: collision with root package name */
        public String f3086c;

        /* renamed from: d, reason: collision with root package name */
        public String f3087d;

        /* renamed from: e, reason: collision with root package name */
        public String f3088e;

        /* renamed from: f, reason: collision with root package name */
        public String f3089f;

        /* renamed from: g, reason: collision with root package name */
        public String f3090g;

        /* renamed from: h, reason: collision with root package name */
        public String f3091h;

        /* renamed from: i, reason: collision with root package name */
        public String f3092i;

        /* renamed from: j, reason: collision with root package name */
        public String f3093j;

        /* renamed from: k, reason: collision with root package name */
        public String f3094k;

        /* renamed from: l, reason: collision with root package name */
        public String f3095l;

        /* renamed from: m, reason: collision with root package name */
        public String f3096m;

        /* renamed from: n, reason: collision with root package name */
        public String f3097n;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public String f3098a;

            /* renamed from: b, reason: collision with root package name */
            public String f3099b;

            /* renamed from: c, reason: collision with root package name */
            public String f3100c;

            /* renamed from: d, reason: collision with root package name */
            public String f3101d;

            /* renamed from: e, reason: collision with root package name */
            public String f3102e;

            /* renamed from: f, reason: collision with root package name */
            public String f3103f;

            /* renamed from: g, reason: collision with root package name */
            public String f3104g;

            /* renamed from: h, reason: collision with root package name */
            public String f3105h;

            /* renamed from: i, reason: collision with root package name */
            public String f3106i;

            /* renamed from: j, reason: collision with root package name */
            public String f3107j;

            /* renamed from: k, reason: collision with root package name */
            public String f3108k;

            /* renamed from: l, reason: collision with root package name */
            public String f3109l;

            /* renamed from: m, reason: collision with root package name */
            public String f3110m;

            /* renamed from: n, reason: collision with root package name */
            public String f3111n;

            public d a() {
                d dVar = new d();
                dVar.j(this.f3098a);
                dVar.l(this.f3099b);
                dVar.s(this.f3100c);
                dVar.t(this.f3101d);
                dVar.m(this.f3102e);
                dVar.n(this.f3103f);
                dVar.u(this.f3104g);
                dVar.r(this.f3105h);
                dVar.v(this.f3106i);
                dVar.o(this.f3107j);
                dVar.i(this.f3108k);
                dVar.q(this.f3109l);
                dVar.p(this.f3110m);
                dVar.k(this.f3111n);
                return dVar;
            }

            public a b(String str) {
                this.f3098a = str;
                return this;
            }

            public a c(String str) {
                this.f3099b = str;
                return this;
            }

            public a d(String str) {
                this.f3103f = str;
                return this;
            }

            public a e(String str) {
                this.f3100c = str;
                return this;
            }

            public a f(String str) {
                this.f3101d = str;
                return this;
            }

            public a g(String str) {
                this.f3104g = str;
                return this;
            }

            public a h(String str) {
                this.f3106i = str;
                return this;
            }
        }

        public static d a(ArrayList arrayList) {
            d dVar = new d();
            dVar.j((String) arrayList.get(0));
            dVar.l((String) arrayList.get(1));
            dVar.s((String) arrayList.get(2));
            dVar.t((String) arrayList.get(3));
            dVar.m((String) arrayList.get(4));
            dVar.n((String) arrayList.get(5));
            dVar.u((String) arrayList.get(6));
            dVar.r((String) arrayList.get(7));
            dVar.v((String) arrayList.get(8));
            dVar.o((String) arrayList.get(9));
            dVar.i((String) arrayList.get(10));
            dVar.q((String) arrayList.get(11));
            dVar.p((String) arrayList.get(12));
            dVar.k((String) arrayList.get(13));
            return dVar;
        }

        public String b() {
            return this.f3084a;
        }

        public String c() {
            return this.f3085b;
        }

        public String d() {
            return this.f3089f;
        }

        public String e() {
            return this.f3086c;
        }

        public String f() {
            return this.f3087d;
        }

        public String g() {
            return this.f3090g;
        }

        public String h() {
            return this.f3092i;
        }

        public void i(String str) {
            this.f3094k = str;
        }

        public void j(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
            }
            this.f3084a = str;
        }

        public void k(String str) {
            this.f3097n = str;
        }

        public void l(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"appId\" is null.");
            }
            this.f3085b = str;
        }

        public void m(String str) {
            this.f3088e = str;
        }

        public void n(String str) {
            this.f3089f = str;
        }

        public void o(String str) {
            this.f3093j = str;
        }

        public void p(String str) {
            this.f3096m = str;
        }

        public void q(String str) {
            this.f3095l = str;
        }

        public void r(String str) {
            this.f3091h = str;
        }

        public void s(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
            }
            this.f3086c = str;
        }

        public void t(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"projectId\" is null.");
            }
            this.f3087d = str;
        }

        public void u(String str) {
            this.f3090g = str;
        }

        public void v(String str) {
            this.f3092i = str;
        }

        public ArrayList w() {
            ArrayList arrayList = new ArrayList(14);
            arrayList.add(this.f3084a);
            arrayList.add(this.f3085b);
            arrayList.add(this.f3086c);
            arrayList.add(this.f3087d);
            arrayList.add(this.f3088e);
            arrayList.add(this.f3089f);
            arrayList.add(this.f3090g);
            arrayList.add(this.f3091h);
            arrayList.add(this.f3092i);
            arrayList.add(this.f3093j);
            arrayList.add(this.f3094k);
            arrayList.add(this.f3095l);
            arrayList.add(this.f3096m);
            arrayList.add(this.f3097n);
            return arrayList;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public String f3112a;

        /* renamed from: b, reason: collision with root package name */
        public d f3113b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f3114c;

        /* renamed from: d, reason: collision with root package name */
        public Map f3115d;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public String f3116a;

            /* renamed from: b, reason: collision with root package name */
            public d f3117b;

            /* renamed from: c, reason: collision with root package name */
            public Boolean f3118c;

            /* renamed from: d, reason: collision with root package name */
            public Map f3119d;

            public e a() {
                e eVar = new e();
                eVar.c(this.f3116a);
                eVar.d(this.f3117b);
                eVar.b(this.f3118c);
                eVar.e(this.f3119d);
                return eVar;
            }

            public a b(Boolean bool) {
                this.f3118c = bool;
                return this;
            }

            public a c(String str) {
                this.f3116a = str;
                return this;
            }

            public a d(d dVar) {
                this.f3117b = dVar;
                return this;
            }

            public a e(Map map) {
                this.f3119d = map;
                return this;
            }
        }

        public static e a(ArrayList arrayList) {
            e eVar = new e();
            eVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            eVar.d(obj == null ? null : d.a((ArrayList) obj));
            eVar.b((Boolean) arrayList.get(2));
            eVar.e((Map) arrayList.get(3));
            return eVar;
        }

        public void b(Boolean bool) {
            this.f3114c = bool;
        }

        public void c(String str) {
            if (str == null) {
                throw new IllegalStateException("Nonnull field \"name\" is null.");
            }
            this.f3112a = str;
        }

        public void d(d dVar) {
            if (dVar == null) {
                throw new IllegalStateException("Nonnull field \"options\" is null.");
            }
            this.f3113b = dVar;
        }

        public void e(Map map) {
            if (map == null) {
                throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
            }
            this.f3115d = map;
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(this.f3112a);
            d dVar = this.f3113b;
            arrayList.add(dVar == null ? null : dVar.w());
            arrayList.add(this.f3114c);
            arrayList.add(this.f3115d);
            return arrayList;
        }
    }

    public interface f {
        void a(Object obj);

        void b(Throwable th);
    }

    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
