package e;

import android.content.Intent;
import b.j;
import ec.i;

/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0064a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f3746a;

        public C0064a(T t) {
            this.f3746a = t;
        }
    }

    public abstract Intent a(j jVar, Object obj);

    public C0064a b(j jVar, Object obj) {
        i.e(jVar, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
