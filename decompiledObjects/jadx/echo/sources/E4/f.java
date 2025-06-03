package E4;

import com.google.firebase.perf.config.RemoteConfigManager;
import q5.AbstractC1906b;

/* loaded from: classes.dex */
public final class f implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final a f1643a;

    public f(a aVar) {
        this.f1643a = aVar;
    }

    public static f a(a aVar) {
        return new f(aVar);
    }

    public static RemoteConfigManager c(a aVar) {
        return (RemoteConfigManager) AbstractC1906b.c(aVar.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RemoteConfigManager get() {
        return c(this.f1643a);
    }
}
