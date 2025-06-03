package gb;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class c1<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Set<T> f6207a = Collections.newSetFromMap(new IdentityHashMap());

    public abstract void a();

    public abstract void b();

    public final void c(T t, boolean z10) {
        int size = this.f6207a.size();
        if (z10) {
            this.f6207a.add(t);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (this.f6207a.remove(t) && size == 1) {
            b();
        }
    }
}
