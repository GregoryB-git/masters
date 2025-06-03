package B3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import n4.C1728a;
import n4.InterfaceC1730c;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;

/* loaded from: classes.dex */
public final class G implements InterfaceC0344e {

    /* renamed from: a, reason: collision with root package name */
    public final Set f739a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f740b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f741c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f742d;

    /* renamed from: e, reason: collision with root package name */
    public final Set f743e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f744f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0344e f745g;

    public static class a implements InterfaceC1730c {

        /* renamed from: a, reason: collision with root package name */
        public final Set f746a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC1730c f747b;

        public a(Set set, InterfaceC1730c interfaceC1730c) {
            this.f746a = set;
            this.f747b = interfaceC1730c;
        }

        @Override // n4.InterfaceC1730c
        public void a(C1728a c1728a) {
            if (!this.f746a.contains(c1728a.b())) {
                throw new t(String.format("Attempting to publish an undeclared event %s.", c1728a));
            }
            this.f747b.a(c1728a);
        }
    }

    public G(C0342c c0342c, InterfaceC0344e interfaceC0344e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c0342c.g()) {
            if (rVar.e()) {
                boolean g7 = rVar.g();
                F c7 = rVar.c();
                if (g7) {
                    hashSet4.add(c7);
                } else {
                    hashSet.add(c7);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean g8 = rVar.g();
                F c8 = rVar.c();
                if (g8) {
                    hashSet5.add(c8);
                } else {
                    hashSet2.add(c8);
                }
            }
        }
        if (!c0342c.k().isEmpty()) {
            hashSet.add(F.b(InterfaceC1730c.class));
        }
        this.f739a = Collections.unmodifiableSet(hashSet);
        this.f740b = Collections.unmodifiableSet(hashSet2);
        this.f741c = Collections.unmodifiableSet(hashSet3);
        this.f742d = Collections.unmodifiableSet(hashSet4);
        this.f743e = Collections.unmodifiableSet(hashSet5);
        this.f744f = c0342c.k();
        this.f745g = interfaceC0344e;
    }

    @Override // B3.InterfaceC0344e
    public Object a(Class cls) {
        if (!this.f739a.contains(F.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a7 = this.f745g.a(cls);
        return !cls.equals(InterfaceC1730c.class) ? a7 : new a(this.f744f, (InterfaceC1730c) a7);
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1922b b(F f7) {
        if (this.f740b.contains(f7)) {
            return this.f745g.b(f7);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f7));
    }

    @Override // B3.InterfaceC0344e
    public /* synthetic */ Set c(Class cls) {
        return AbstractC0343d.f(this, cls);
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1921a d(F f7) {
        if (this.f741c.contains(f7)) {
            return this.f745g.d(f7);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f7));
    }

    @Override // B3.InterfaceC0344e
    public Set e(F f7) {
        if (this.f742d.contains(f7)) {
            return this.f745g.e(f7);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f7));
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1922b f(F f7) {
        if (this.f743e.contains(f7)) {
            return this.f745g.f(f7);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f7));
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1922b g(Class cls) {
        return b(F.b(cls));
    }

    @Override // B3.InterfaceC0344e
    public Object h(F f7) {
        if (this.f739a.contains(f7)) {
            return this.f745g.h(f7);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f7));
    }

    @Override // B3.InterfaceC0344e
    public InterfaceC1921a i(Class cls) {
        return d(F.b(cls));
    }
}
