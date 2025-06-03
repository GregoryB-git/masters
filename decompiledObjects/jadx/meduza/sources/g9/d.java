package g9;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d<T> implements d9.l<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f5920a;

    /* renamed from: b, reason: collision with root package name */
    public final d9.l<T> f5921b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5922c = false;

    public d(Executor executor, d9.l<T> lVar) {
        this.f5920a = executor;
        this.f5921b = lVar;
    }

    @Override // d9.l
    public final void a(T t, com.google.firebase.firestore.f fVar) {
        this.f5920a.execute(new t0.d(this, t, fVar, 5));
    }
}
