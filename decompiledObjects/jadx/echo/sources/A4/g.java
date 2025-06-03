package A4;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.i;

/* loaded from: classes.dex */
public final class g implements U5.a {

    /* renamed from: a, reason: collision with root package name */
    public final U5.a f559a;

    /* renamed from: b, reason: collision with root package name */
    public final U5.a f560b;

    /* renamed from: c, reason: collision with root package name */
    public final U5.a f561c;

    /* renamed from: d, reason: collision with root package name */
    public final U5.a f562d;

    /* renamed from: e, reason: collision with root package name */
    public final U5.a f563e;

    /* renamed from: f, reason: collision with root package name */
    public final U5.a f564f;

    /* renamed from: g, reason: collision with root package name */
    public final U5.a f565g;

    public g(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, U5.a aVar7) {
        this.f559a = aVar;
        this.f560b = aVar2;
        this.f561c = aVar3;
        this.f562d = aVar4;
        this.f563e = aVar5;
        this.f564f = aVar6;
        this.f565g = aVar7;
    }

    public static g a(U5.a aVar, U5.a aVar2, U5.a aVar3, U5.a aVar4, U5.a aVar5, U5.a aVar6, U5.a aVar7) {
        return new g(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static e c(C1947e c1947e, InterfaceC1922b interfaceC1922b, i iVar, InterfaceC1922b interfaceC1922b2, RemoteConfigManager remoteConfigManager, C4.a aVar, SessionManager sessionManager) {
        return new e(c1947e, interfaceC1922b, iVar, interfaceC1922b2, remoteConfigManager, aVar, sessionManager);
    }

    @Override // U5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((C1947e) this.f559a.get(), (InterfaceC1922b) this.f560b.get(), (i) this.f561c.get(), (InterfaceC1922b) this.f562d.get(), (RemoteConfigManager) this.f563e.get(), (C4.a) this.f564f.get(), (SessionManager) this.f565g.get());
    }
}
