package E4;

import com.google.firebase.perf.session.SessionManager;
import q5.AbstractC1906b;

/* loaded from: classes.dex */
public final class g implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1644a;

    public g(a aVar) {
        this.f1644a = aVar;
    }

    public static g a(a aVar) {
        return new g(aVar);
    }

    public static SessionManager c(a aVar) {
        return (SessionManager) AbstractC1906b.c(aVar.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SessionManager get() {
        return c(this.f1644a);
    }
}
