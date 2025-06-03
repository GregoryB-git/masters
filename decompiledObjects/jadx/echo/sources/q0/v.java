package q0;

import android.util.SparseArray;
import g0.E;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f18793a = new SparseArray();

    public E a(int i7) {
        E e7 = (E) this.f18793a.get(i7);
        if (e7 != null) {
            return e7;
        }
        E e8 = new E(9223372036854775806L);
        this.f18793a.put(i7, e8);
        return e8;
    }

    public void b() {
        this.f18793a.clear();
    }
}
