package E4;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f1635a;

    /* renamed from: b, reason: collision with root package name */
    public final i f1636b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1922b f1637c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1922b f1638d;

    public a(C1947e c1947e, i iVar, InterfaceC1922b interfaceC1922b, InterfaceC1922b interfaceC1922b2) {
        this.f1635a = c1947e;
        this.f1636b = iVar;
        this.f1637c = interfaceC1922b;
        this.f1638d = interfaceC1922b2;
    }

    public C4.a a() {
        return C4.a.g();
    }

    public C1947e b() {
        return this.f1635a;
    }

    public i c() {
        return this.f1636b;
    }

    public InterfaceC1922b d() {
        return this.f1637c;
    }

    public RemoteConfigManager e() {
        return RemoteConfigManager.getInstance();
    }

    public SessionManager f() {
        return SessionManager.getInstance();
    }

    public InterfaceC1922b g() {
        return this.f1638d;
    }
}
