package S3;

import S3.h;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class j implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5870a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5871b;

    /* renamed from: c, reason: collision with root package name */
    public h f5872c;

    /* renamed from: d, reason: collision with root package name */
    public final h f5873d;

    public j(Object obj, Object obj2, h hVar, h hVar2) {
        this.f5870a = obj;
        this.f5871b = obj2;
        this.f5872c = hVar == null ? g.j() : hVar;
        this.f5873d = hVar2 == null ? g.j() : hVar2;
    }

    public static h.a q(h hVar) {
        return hVar.d() ? h.a.BLACK : h.a.RED;
    }

    @Override // S3.h
    public h a() {
        return this.f5872c;
    }

    @Override // S3.h
    public h b(Object obj, Object obj2, Comparator comparator) {
        int compare = comparator.compare(obj, this.f5870a);
        return (compare < 0 ? l(null, null, this.f5872c.b(obj, obj2, comparator), null) : compare == 0 ? l(obj, obj2, null, null) : l(null, null, null, this.f5873d.b(obj, obj2, comparator))).m();
    }

    @Override // S3.h
    public void e(h.b bVar) {
        this.f5872c.e(bVar);
        bVar.a(this.f5870a, this.f5871b);
        this.f5873d.e(bVar);
    }

    @Override // S3.h
    public h f() {
        return this.f5873d;
    }

    @Override // S3.h
    public h g(Object obj, Comparator comparator) {
        j l7;
        if (comparator.compare(obj, this.f5870a) < 0) {
            j o7 = (this.f5872c.isEmpty() || this.f5872c.d() || ((j) this.f5872c).f5872c.d()) ? this : o();
            l7 = o7.l(null, null, o7.f5872c.g(obj, comparator), null);
        } else {
            j t7 = this.f5872c.d() ? t() : this;
            if (!t7.f5873d.isEmpty() && !t7.f5873d.d() && !((j) t7.f5873d).f5872c.d()) {
                t7 = t7.p();
            }
            if (comparator.compare(obj, t7.f5870a) == 0) {
                if (t7.f5873d.isEmpty()) {
                    return g.j();
                }
                h h7 = t7.f5873d.h();
                t7 = t7.l(h7.getKey(), h7.getValue(), null, ((j) t7.f5873d).r());
            }
            l7 = t7.l(null, null, null, t7.f5873d.g(obj, comparator));
        }
        return l7.m();
    }

    @Override // S3.h
    public Object getKey() {
        return this.f5870a;
    }

    @Override // S3.h
    public Object getValue() {
        return this.f5871b;
    }

    @Override // S3.h
    public h h() {
        return this.f5872c.isEmpty() ? this : this.f5872c.h();
    }

    @Override // S3.h
    public h i() {
        return this.f5873d.isEmpty() ? this : this.f5873d.i();
    }

    @Override // S3.h
    public boolean isEmpty() {
        return false;
    }

    public final j j() {
        h hVar = this.f5872c;
        h c7 = hVar.c(null, null, q(hVar), null, null);
        h hVar2 = this.f5873d;
        return c(null, null, q(this), c7, hVar2.c(null, null, q(hVar2), null, null));
    }

    @Override // S3.h
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public j c(Object obj, Object obj2, h.a aVar, h hVar, h hVar2) {
        if (obj == null) {
            obj = this.f5870a;
        }
        if (obj2 == null) {
            obj2 = this.f5871b;
        }
        if (hVar == null) {
            hVar = this.f5872c;
        }
        if (hVar2 == null) {
            hVar2 = this.f5873d;
        }
        return aVar == h.a.RED ? new i(obj, obj2, hVar, hVar2) : new f(obj, obj2, hVar, hVar2);
    }

    public abstract j l(Object obj, Object obj2, h hVar, h hVar2);

    public final j m() {
        j s7 = (!this.f5873d.d() || this.f5872c.d()) ? this : s();
        if (s7.f5872c.d() && ((j) s7.f5872c).f5872c.d()) {
            s7 = s7.t();
        }
        return (s7.f5872c.d() && s7.f5873d.d()) ? s7.j() : s7;
    }

    public abstract h.a n();

    public final j o() {
        j j7 = j();
        return j7.f().a().d() ? j7.l(null, null, null, ((j) j7.f()).t()).s().j() : j7;
    }

    public final j p() {
        j j7 = j();
        return j7.a().a().d() ? j7.t().j() : j7;
    }

    public final h r() {
        if (this.f5872c.isEmpty()) {
            return g.j();
        }
        j o7 = (a().d() || a().a().d()) ? this : o();
        return o7.l(null, null, ((j) o7.f5872c).r(), null).m();
    }

    public final j s() {
        return (j) this.f5873d.c(null, null, n(), c(null, null, h.a.RED, null, ((j) this.f5873d).f5872c), null);
    }

    public final j t() {
        return (j) this.f5872c.c(null, null, n(), null, c(null, null, h.a.RED, ((j) this.f5872c).f5873d, null));
    }

    public void u(h hVar) {
        this.f5872c = hVar;
    }
}
