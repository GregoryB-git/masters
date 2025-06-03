package X3;

import V3.k;
import Y3.d;
import d4.C1227b;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    public static final Y3.i f7234b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final Y3.i f7235c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final Y3.d f7236d = new Y3.d(Boolean.TRUE);

    /* renamed from: e, reason: collision with root package name */
    public static final Y3.d f7237e = new Y3.d(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final Y3.d f7238a;

    public class a implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    public class b implements Y3.i {
        @Override // Y3.i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(Boolean bool) {
            return bool.booleanValue();
        }
    }

    public class c implements d.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.c f7239a;

        public c(d.c cVar) {
            this.f7239a = cVar;
        }

        @Override // Y3.d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Object a(k kVar, Boolean bool, Object obj) {
            return !bool.booleanValue() ? this.f7239a.a(kVar, null, obj) : obj;
        }
    }

    public g() {
        this.f7238a = Y3.d.d();
    }

    public g a(C1227b c1227b) {
        Y3.d D7 = this.f7238a.D(c1227b);
        if (D7 == null) {
            D7 = new Y3.d((Boolean) this.f7238a.getValue());
        } else if (D7.getValue() == null && this.f7238a.getValue() != null) {
            D7 = D7.W(k.Y(), (Boolean) this.f7238a.getValue());
        }
        return new g(D7);
    }

    public Object b(Object obj, d.c cVar) {
        return this.f7238a.k(obj, new c(cVar));
    }

    public g c(k kVar) {
        return this.f7238a.V(kVar, f7234b) != null ? this : new g(this.f7238a.X(kVar, f7237e));
    }

    public g d(k kVar) {
        if (this.f7238a.V(kVar, f7234b) == null) {
            return this.f7238a.V(kVar, f7235c) != null ? this : new g(this.f7238a.X(kVar, f7236d));
        }
        throw new IllegalArgumentException("Can't prune path that was kept previously!");
    }

    public boolean e() {
        return this.f7238a.a(f7235c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f7238a.equals(((g) obj).f7238a);
    }

    public boolean f(k kVar) {
        Boolean bool = (Boolean) this.f7238a.S(kVar);
        return (bool == null || bool.booleanValue()) ? false : true;
    }

    public boolean g(k kVar) {
        Boolean bool = (Boolean) this.f7238a.S(kVar);
        return bool != null && bool.booleanValue();
    }

    public int hashCode() {
        return this.f7238a.hashCode();
    }

    public String toString() {
        return "{PruneForest:" + this.f7238a.toString() + "}";
    }

    public g(Y3.d dVar) {
        this.f7238a = dVar;
    }
}
