package D3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r4.InterfaceC1921a;
import r4.InterfaceC1922b;
import w3.InterfaceC2100a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1921a f1253a;

    /* renamed from: b, reason: collision with root package name */
    public volatile F3.a f1254b;

    /* renamed from: c, reason: collision with root package name */
    public volatile G3.b f1255c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1256d;

    public d(InterfaceC1921a interfaceC1921a) {
        this(interfaceC1921a, new G3.c(), new F3.f());
    }

    public static InterfaceC2100a.InterfaceC0288a j(InterfaceC2100a interfaceC2100a, e eVar) {
        InterfaceC2100a.InterfaceC0288a g7 = interfaceC2100a.g("clx", eVar);
        if (g7 == null) {
            E3.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            g7 = interfaceC2100a.g("crash", eVar);
            if (g7 != null) {
                E3.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return g7;
    }

    public F3.a d() {
        return new F3.a() { // from class: D3.b
            @Override // F3.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public G3.b e() {
        return new G3.b() { // from class: D3.a
            @Override // G3.b
            public final void a(G3.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public final void f() {
        this.f1253a.a(new InterfaceC1921a.InterfaceC0260a() { // from class: D3.c
            @Override // r4.InterfaceC1921a.InterfaceC0260a
            public final void a(InterfaceC1922b interfaceC1922b) {
                d.this.i(interfaceC1922b);
            }
        });
    }

    public final /* synthetic */ void g(String str, Bundle bundle) {
        this.f1254b.a(str, bundle);
    }

    public final /* synthetic */ void h(G3.a aVar) {
        synchronized (this) {
            try {
                if (this.f1255c instanceof G3.c) {
                    this.f1256d.add(aVar);
                }
                this.f1255c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void i(InterfaceC1922b interfaceC1922b) {
        E3.f.f().b("AnalyticsConnector now available.");
        InterfaceC2100a interfaceC2100a = (InterfaceC2100a) interfaceC1922b.get();
        F3.e eVar = new F3.e(interfaceC2100a);
        e eVar2 = new e();
        if (j(interfaceC2100a, eVar2) == null) {
            E3.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        E3.f.f().b("Registered Firebase Analytics listener.");
        F3.d dVar = new F3.d();
        F3.c cVar = new F3.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (this) {
            try {
                Iterator it = this.f1256d.iterator();
                while (it.hasNext()) {
                    dVar.a((G3.a) it.next());
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f1255c = dVar;
                this.f1254b = cVar;
            } finally {
            }
        }
    }

    public d(InterfaceC1921a interfaceC1921a, G3.b bVar, F3.a aVar) {
        this.f1253a = interfaceC1921a;
        this.f1255c = bVar;
        this.f1256d = new ArrayList();
        this.f1254b = aVar;
        f();
    }
}
