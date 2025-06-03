package B3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: B3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0342c {

    /* renamed from: a, reason: collision with root package name */
    public final String f750a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f751b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f752c;

    /* renamed from: d, reason: collision with root package name */
    public final int f753d;

    /* renamed from: e, reason: collision with root package name */
    public final int f754e;

    /* renamed from: f, reason: collision with root package name */
    public final h f755f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f756g;

    public C0342c(String str, Set set, Set set2, int i7, int i8, h hVar, Set set3) {
        this.f750a = str;
        this.f751b = Collections.unmodifiableSet(set);
        this.f752c = Collections.unmodifiableSet(set2);
        this.f753d = i7;
        this.f754e = i8;
        this.f755f = hVar;
        this.f756g = Collections.unmodifiableSet(set3);
    }

    public static b c(F f7) {
        return new b(f7, new F[0]);
    }

    public static b d(F f7, F... fArr) {
        return new b(f7, fArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C0342c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: B3.a
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                Object q7;
                q7 = C0342c.q(obj, interfaceC0344e);
                return q7;
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C0342c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: B3.b
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                Object r7;
                r7 = C0342c.r(obj, interfaceC0344e);
                return r7;
            }
        }).d();
    }

    public Set g() {
        return this.f752c;
    }

    public h h() {
        return this.f755f;
    }

    public String i() {
        return this.f750a;
    }

    public Set j() {
        return this.f751b;
    }

    public Set k() {
        return this.f756g;
    }

    public boolean n() {
        return this.f753d == 1;
    }

    public boolean o() {
        return this.f753d == 2;
    }

    public boolean p() {
        return this.f754e == 0;
    }

    public C0342c t(h hVar) {
        return new C0342c(this.f750a, this.f751b, this.f752c, this.f753d, this.f754e, hVar, this.f756g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f751b.toArray()) + ">{" + this.f753d + ", type=" + this.f754e + ", deps=" + Arrays.toString(this.f752c.toArray()) + "}";
    }

    /* renamed from: B3.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f757a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f758b;

        /* renamed from: c, reason: collision with root package name */
        public final Set f759c;

        /* renamed from: d, reason: collision with root package name */
        public int f760d;

        /* renamed from: e, reason: collision with root package name */
        public int f761e;

        /* renamed from: f, reason: collision with root package name */
        public h f762f;

        /* renamed from: g, reason: collision with root package name */
        public final Set f763g;

        public b(F f7, F... fArr) {
            this.f757a = null;
            HashSet hashSet = new HashSet();
            this.f758b = hashSet;
            this.f759c = new HashSet();
            this.f760d = 0;
            this.f761e = 0;
            this.f763g = new HashSet();
            E.c(f7, "Null interface");
            hashSet.add(f7);
            for (F f8 : fArr) {
                E.c(f8, "Null interface");
            }
            Collections.addAll(this.f758b, fArr);
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f759c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C0342c d() {
            E.d(this.f762f != null, "Missing required property: factory.");
            return new C0342c(this.f757a, new HashSet(this.f758b), new HashSet(this.f759c), this.f760d, this.f761e, this.f762f, this.f763g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f762f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public final b g() {
            this.f761e = 1;
            return this;
        }

        public b h(String str) {
            this.f757a = str;
            return this;
        }

        public final b i(int i7) {
            E.d(this.f760d == 0, "Instantiation type has already been set.");
            this.f760d = i7;
            return this;
        }

        public final void j(F f7) {
            E.a(!this.f758b.contains(f7), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.f757a = null;
            HashSet hashSet = new HashSet();
            this.f758b = hashSet;
            this.f759c = new HashSet();
            this.f760d = 0;
            this.f761e = 0;
            this.f763g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f758b.add(F.b(cls2));
            }
        }
    }

    public static /* synthetic */ Object q(Object obj, InterfaceC0344e interfaceC0344e) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, InterfaceC0344e interfaceC0344e) {
        return obj;
    }
}
