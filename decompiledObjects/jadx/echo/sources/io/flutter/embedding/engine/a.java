package io.flutter.embedding.engine;

import D5.f;
import D5.k;
import D5.l;
import D5.m;
import D5.n;
import D5.o;
import D5.r;
import D5.s;
import D5.t;
import D5.u;
import D5.v;
import D5.w;
import F5.e;
import T5.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import t5.AbstractC1995b;
import t5.C1994a;
import v5.C2063b;
import w5.C2105a;

/* loaded from: classes.dex */
public class a implements g.a {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f14894a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterRenderer f14895b;

    /* renamed from: c, reason: collision with root package name */
    public final C2105a f14896c;

    /* renamed from: d, reason: collision with root package name */
    public final C2063b f14897d;

    /* renamed from: e, reason: collision with root package name */
    public final e f14898e;

    /* renamed from: f, reason: collision with root package name */
    public final D5.a f14899f;

    /* renamed from: g, reason: collision with root package name */
    public final D5.g f14900g;

    /* renamed from: h, reason: collision with root package name */
    public final k f14901h;

    /* renamed from: i, reason: collision with root package name */
    public final l f14902i;

    /* renamed from: j, reason: collision with root package name */
    public final m f14903j;

    /* renamed from: k, reason: collision with root package name */
    public final n f14904k;

    /* renamed from: l, reason: collision with root package name */
    public final f f14905l;

    /* renamed from: m, reason: collision with root package name */
    public final s f14906m;

    /* renamed from: n, reason: collision with root package name */
    public final o f14907n;

    /* renamed from: o, reason: collision with root package name */
    public final r f14908o;

    /* renamed from: p, reason: collision with root package name */
    public final t f14909p;

    /* renamed from: q, reason: collision with root package name */
    public final u f14910q;

    /* renamed from: r, reason: collision with root package name */
    public final v f14911r;

    /* renamed from: s, reason: collision with root package name */
    public final w f14912s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.r f14913t;

    /* renamed from: u, reason: collision with root package name */
    public final Set f14914u;

    /* renamed from: v, reason: collision with root package name */
    public final b f14915v;

    /* renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    public class C0218a implements b {
        public C0218a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
            AbstractC1995b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f14914u.iterator();
            while (it.hasNext()) {
                ((b) it.next()).b();
            }
            a.this.f14913t.X();
            a.this.f14906m.g();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context) {
        this(context, null);
    }

    public a A(Context context, C2105a.c cVar, String str, List list, io.flutter.plugin.platform.r rVar, boolean z7, boolean z8) {
        if (z()) {
            return new a(context, null, this.f14894a.spawn(cVar.f20414c, cVar.f20413b, str, list), rVar, null, z7, z8);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // T5.g.a
    public void a(float f7, float f8, float f9) {
        this.f14894a.updateDisplayMetrics(0, f7, f8, f9);
    }

    public void e(b bVar) {
        this.f14914u.add(bVar);
    }

    public final void f() {
        AbstractC1995b.f("FlutterEngine", "Attaching to JNI.");
        this.f14894a.attachToNative();
        if (!z()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void g() {
        AbstractC1995b.f("FlutterEngine", "Destroying.");
        Iterator it = this.f14914u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        this.f14897d.k();
        this.f14913t.T();
        this.f14896c.o();
        this.f14894a.removeEngineLifecycleListener(this.f14915v);
        this.f14894a.setDeferredComponentManager(null);
        this.f14894a.detachFromNativeAndReleaseResources();
        C1994a.e().a();
    }

    public D5.a h() {
        return this.f14899f;
    }

    public B5.b i() {
        return this.f14897d;
    }

    public f j() {
        return this.f14905l;
    }

    public C2105a k() {
        return this.f14896c;
    }

    public k l() {
        return this.f14901h;
    }

    public e m() {
        return this.f14898e;
    }

    public m n() {
        return this.f14903j;
    }

    public n o() {
        return this.f14904k;
    }

    public o p() {
        return this.f14907n;
    }

    public io.flutter.plugin.platform.r q() {
        return this.f14913t;
    }

    public A5.b r() {
        return this.f14897d;
    }

    public r s() {
        return this.f14908o;
    }

    public FlutterRenderer t() {
        return this.f14895b;
    }

    public s u() {
        return this.f14906m;
    }

    public t v() {
        return this.f14909p;
    }

    public u w() {
        return this.f14910q;
    }

    public v x() {
        return this.f14911r;
    }

    public w y() {
        return this.f14912s;
    }

    public final boolean z() {
        return this.f14894a.isAttached();
    }

    public a(Context context, y5.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z7) {
        this(context, fVar, flutterJNI, rVar, strArr, z7, false);
    }

    public a(Context context, y5.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z7, boolean z8) {
        this(context, fVar, flutterJNI, rVar, strArr, z7, z8, null);
    }

    public a(Context context, y5.f fVar, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z7, boolean z8, io.flutter.embedding.engine.b bVar) {
        AssetManager assets;
        this.f14914u = new HashSet();
        this.f14915v = new C0218a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        C1994a e7 = C1994a.e();
        flutterJNI = flutterJNI == null ? e7.d().a() : flutterJNI;
        this.f14894a = flutterJNI;
        C2105a c2105a = new C2105a(flutterJNI, assets);
        this.f14896c = c2105a;
        c2105a.n();
        C1994a.e().a();
        this.f14899f = new D5.a(c2105a, flutterJNI);
        this.f14900g = new D5.g(c2105a);
        this.f14901h = new k(c2105a);
        l lVar = new l(c2105a);
        this.f14902i = lVar;
        this.f14903j = new m(c2105a);
        this.f14904k = new n(c2105a);
        this.f14905l = new f(c2105a);
        this.f14907n = new o(c2105a);
        this.f14908o = new r(c2105a, context.getPackageManager());
        this.f14906m = new s(c2105a, z8);
        this.f14909p = new t(c2105a);
        this.f14910q = new u(c2105a);
        this.f14911r = new v(c2105a);
        this.f14912s = new w(c2105a);
        e eVar = new e(context, lVar);
        this.f14898e = eVar;
        fVar = fVar == null ? e7.c() : fVar;
        if (!flutterJNI.isAttached()) {
            fVar.p(context.getApplicationContext());
            fVar.h(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f14915v);
        flutterJNI.setPlatformViewsController(rVar);
        flutterJNI.setLocalizationPlugin(eVar);
        e7.a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f14895b = new FlutterRenderer(flutterJNI);
        this.f14913t = rVar;
        rVar.R();
        C2063b c2063b = new C2063b(context.getApplicationContext(), this, fVar, bVar);
        this.f14897d = c2063b;
        eVar.d(context.getResources().getConfiguration());
        if (z7 && fVar.g()) {
            C5.a.a(this);
        }
        g.a(context, this);
        c2063b.c(new H5.a(s()));
    }

    public a(Context context, y5.f fVar, FlutterJNI flutterJNI, String[] strArr, boolean z7) {
        this(context, fVar, flutterJNI, new io.flutter.plugin.platform.r(), strArr, z7);
    }

    public a(Context context, String[] strArr) {
        this(context, null, null, strArr, true);
    }
}
