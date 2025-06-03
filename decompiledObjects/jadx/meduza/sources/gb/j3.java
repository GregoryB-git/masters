package gb;

import gb.h3;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j3<T> implements m2<T> {

    /* renamed from: a, reason: collision with root package name */
    public final h3.c<T> f6550a;

    public j3(h3.c<T> cVar) {
        this.f6550a = cVar;
    }

    @Override // gb.m2
    public final void a(Executor executor) {
        h3.b(this.f6550a, executor);
    }

    @Override // gb.m2
    public final T b() {
        return (T) h3.a(this.f6550a);
    }
}
