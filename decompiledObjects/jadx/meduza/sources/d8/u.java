package d8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n7.w;

/* loaded from: classes.dex */
public final class u implements c {

    /* renamed from: a, reason: collision with root package name */
    public final Set<t<?>> f3629a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<t<?>> f3630b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<t<?>> f3631c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<t<?>> f3632d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<Class<?>> f3633e;
    public final c f;

    public static class a implements c9.c {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f3634a;

        /* renamed from: b, reason: collision with root package name */
        public final c9.c f3635b;

        public a(Set<Class<?>> set, c9.c cVar) {
            this.f3634a = set;
            this.f3635b = cVar;
        }

        @Override // c9.c
        public final void b(c9.a<?> aVar) {
            if (!this.f3634a.contains(aVar.f2548a)) {
                throw new w(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f3635b.b(aVar);
        }
    }

    public u(b bVar, i iVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k kVar : bVar.f3584c) {
            int i10 = kVar.f3612c;
            if (i10 == 0) {
                if (kVar.f3611b == 2) {
                    hashSet4.add(kVar.f3610a);
                } else {
                    hashSet.add(kVar.f3610a);
                }
            } else if (i10 == 2) {
                hashSet3.add(kVar.f3610a);
            } else if (kVar.f3611b == 2) {
                hashSet5.add(kVar.f3610a);
            } else {
                hashSet2.add(kVar.f3610a);
            }
        }
        if (!bVar.f3587g.isEmpty()) {
            hashSet.add(t.a(c9.c.class));
        }
        this.f3629a = Collections.unmodifiableSet(hashSet);
        this.f3630b = Collections.unmodifiableSet(hashSet2);
        this.f3631c = Collections.unmodifiableSet(hashSet3);
        this.f3632d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        this.f3633e = bVar.f3587g;
        this.f = iVar;
    }

    @Override // d8.c
    public final <T> t9.a<T> a(t<T> tVar) {
        if (this.f3631c.contains(tVar)) {
            return this.f.a(tVar);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Deferred<%s>.", tVar));
    }

    @Override // d8.c
    public final <T> t9.b<T> b(Class<T> cls) {
        return c(t.a(cls));
    }

    @Override // d8.c
    public final <T> t9.b<T> c(t<T> tVar) {
        if (this.f3630b.contains(tVar)) {
            return this.f.c(tVar);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Provider<%s>.", tVar));
    }

    @Override // d8.c
    public final <T> Set<T> d(t<T> tVar) {
        if (this.f3632d.contains(tVar)) {
            return this.f.d(tVar);
        }
        throw new w(String.format("Attempting to request an undeclared dependency Set<%s>.", tVar));
    }

    @Override // d8.c
    public final <T> T e(t<T> tVar) {
        if (this.f3629a.contains(tVar)) {
            return (T) this.f.e(tVar);
        }
        throw new w(String.format("Attempting to request an undeclared dependency %s.", tVar));
    }

    @Override // d8.c
    public final <T> t9.a<T> f(Class<T> cls) {
        return a(t.a(cls));
    }

    public final Set g(Class cls) {
        return d(t.a(cls));
    }

    @Override // d8.c
    public final <T> T get(Class<T> cls) {
        if (!this.f3629a.contains(t.a(cls))) {
            throw new w(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f.get(cls);
        return !cls.equals(c9.c.class) ? t : (T) new a(this.f3633e, (c9.c) t);
    }
}
