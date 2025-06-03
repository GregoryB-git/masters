package A4;

import L4.k;
import M4.l;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import r4.InterfaceC1922b;
import s3.C1947e;
import s4.i;

/* loaded from: classes.dex */
public class e {

    /* renamed from: i, reason: collision with root package name */
    public static final F4.a f549i = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final Map f550a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C4.a f551b;

    /* renamed from: c, reason: collision with root package name */
    public final M4.f f552c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f553d;

    /* renamed from: e, reason: collision with root package name */
    public final C1947e f554e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1922b f555f;

    /* renamed from: g, reason: collision with root package name */
    public final i f556g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1922b f557h;

    public e(C1947e c1947e, InterfaceC1922b interfaceC1922b, i iVar, InterfaceC1922b interfaceC1922b2, RemoteConfigManager remoteConfigManager, C4.a aVar, SessionManager sessionManager) {
        this.f553d = null;
        this.f554e = c1947e;
        this.f555f = interfaceC1922b;
        this.f556g = iVar;
        this.f557h = interfaceC1922b2;
        if (c1947e == null) {
            this.f553d = Boolean.FALSE;
            this.f551b = aVar;
            this.f552c = new M4.f(new Bundle());
            return;
        }
        k.l().s(c1947e, iVar, interfaceC1922b2);
        Context m7 = c1947e.m();
        M4.f a7 = a(m7);
        this.f552c = a7;
        remoteConfigManager.setFirebaseRemoteConfigProvider(interfaceC1922b);
        this.f551b = aVar;
        aVar.R(a7);
        aVar.P(m7);
        sessionManager.setApplicationContext(m7);
        this.f553d = aVar.j();
        F4.a aVar2 = f549i;
        if (aVar2.h() && d()) {
            aVar2.f(String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", F4.b.b(c1947e.r().g(), m7.getPackageName())));
        }
    }

    public static M4.f a(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e7) {
            Log.d("isEnabled", "No perf enable meta data found " + e7.getMessage());
            bundle = null;
        }
        return bundle != null ? new M4.f(bundle) : new M4.f();
    }

    public static e c() {
        return (e) C1947e.o().k(e.class);
    }

    public Map b() {
        return new HashMap(this.f550a);
    }

    public boolean d() {
        Boolean bool = this.f553d;
        return bool != null ? bool.booleanValue() : C1947e.o().x();
    }

    public G4.i e(String str, String str2) {
        return new G4.i(str, str2, k.l(), new l());
    }

    public Trace f(String str) {
        return Trace.h(str);
    }

    public synchronized void g(Boolean bool) {
        F4.a aVar;
        String str;
        try {
            C1947e.o();
            if (this.f551b.i().booleanValue()) {
                f549i.f("Firebase Performance is permanently disabled");
                return;
            }
            this.f551b.Q(bool);
            if (bool == null) {
                bool = this.f551b.j();
            }
            this.f553d = bool;
            if (!Boolean.TRUE.equals(this.f553d)) {
                if (Boolean.FALSE.equals(this.f553d)) {
                    aVar = f549i;
                    str = "Firebase Performance is Disabled";
                }
            }
            aVar = f549i;
            str = "Firebase Performance is Enabled";
            aVar.f(str);
        } catch (IllegalStateException unused) {
        }
    }
}
