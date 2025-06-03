package S3;

import S3.h;

/* loaded from: classes.dex */
public class f extends j {

    /* renamed from: e, reason: collision with root package name */
    public int f5865e;

    public f(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
        this.f5865e = -1;
    }

    @Override // S3.h
    public boolean d() {
        return false;
    }

    @Override // S3.j
    public j l(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = getKey();
        }
        if (obj2 == null) {
            obj2 = getValue();
        }
        if (hVar == null) {
            hVar = a();
        }
        if (hVar2 == null) {
            hVar2 = f();
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    @Override // S3.j
    public h.a n() {
        return h.a.BLACK;
    }

    @Override // S3.h
    public int size() {
        if (this.f5865e == -1) {
            this.f5865e = a().size() + 1 + f().size();
        }
        return this.f5865e;
    }

    @Override // S3.j
    public void u(h hVar) {
        if (this.f5865e != -1) {
            throw new IllegalStateException("Can't set left after using size");
        }
        super.u(hVar);
    }
}
