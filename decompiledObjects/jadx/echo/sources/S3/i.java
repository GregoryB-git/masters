package S3;

import S3.h;

/* loaded from: classes.dex */
public class i extends j {
    public i(Object obj, Object obj2) {
        super(obj, obj2, g.j(), g.j());
    }

    @Override // S3.h
    public boolean d() {
        return true;
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
        return new i(obj, obj2, hVar, hVar2);
    }

    @Override // S3.j
    public h.a n() {
        return h.a.RED;
    }

    @Override // S3.h
    public int size() {
        return a().size() + 1 + f().size();
    }

    public i(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
    }
}
