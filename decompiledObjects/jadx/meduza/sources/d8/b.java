package d8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f3582a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<t<? super T>> f3583b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<k> f3584c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3585d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3586e;
    public final e<T> f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f3587g;

    public b(String str, Set<t<? super T>> set, Set<k> set2, int i10, int i11, e<T> eVar, Set<Class<?>> set3) {
        this.f3582a = str;
        this.f3583b = Collections.unmodifiableSet(set);
        this.f3584c = Collections.unmodifiableSet(set2);
        this.f3585d = i10;
        this.f3586e = i11;
        this.f = eVar;
        this.f3587g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(t<T> tVar) {
        return new a<>(tVar, new t[0]);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> c(T t, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(t.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            if (cls2 == null) {
                throw new NullPointerException("Null interface");
            }
            hashSet.add(t.a(cls2));
        }
        return new b<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new defpackage.d(t, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f3583b.toArray()) + ">{" + this.f3585d + ", type=" + this.f3586e + ", deps=" + Arrays.toString(this.f3584c.toArray()) + "}";
    }

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f3588a = null;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f3589b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f3590c;

        /* renamed from: d, reason: collision with root package name */
        public int f3591d;

        /* renamed from: e, reason: collision with root package name */
        public int f3592e;
        public e<T> f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet f3593g;

        public a(t tVar, t[] tVarArr) {
            HashSet hashSet = new HashSet();
            this.f3589b = hashSet;
            this.f3590c = new HashSet();
            this.f3591d = 0;
            this.f3592e = 0;
            this.f3593g = new HashSet();
            hashSet.add(tVar);
            for (t tVar2 : tVarArr) {
                if (tVar2 == null) {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.f3589b, tVarArr);
        }

        public final void a(k kVar) {
            if (!(!this.f3589b.contains(kVar.f3610a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f3590c.add(kVar);
        }

        public final b<T> b() {
            if (this.f != null) {
                return new b<>(this.f3588a, new HashSet(this.f3589b), new HashSet(this.f3590c), this.f3591d, this.f3592e, this.f, this.f3593g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            if (!(this.f3591d == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f3591d = i10;
        }

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f3589b = hashSet;
            this.f3590c = new HashSet();
            this.f3591d = 0;
            this.f3592e = 0;
            this.f3593g = new HashSet();
            hashSet.add(t.a(cls));
            for (Class cls2 : clsArr) {
                if (cls2 == null) {
                    throw new NullPointerException("Null interface");
                }
                this.f3589b.add(t.a(cls2));
            }
        }
    }
}
