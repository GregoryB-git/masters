package j8;

import aa.m0;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8625a;

    /* renamed from: b, reason: collision with root package name */
    public final w f8626b;

    /* renamed from: c, reason: collision with root package name */
    public final l.l f8627c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8628d;

    /* renamed from: e, reason: collision with root package name */
    public r4.c f8629e;
    public r4.c f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8630g;

    /* renamed from: h, reason: collision with root package name */
    public n f8631h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f8632i;

    /* renamed from: j, reason: collision with root package name */
    public final p8.e f8633j;

    /* renamed from: k, reason: collision with root package name */
    public final i8.b f8634k;

    /* renamed from: l, reason: collision with root package name */
    public final h8.a f8635l;

    /* renamed from: m, reason: collision with root package name */
    public final j f8636m;

    /* renamed from: n, reason: collision with root package name */
    public final g8.a f8637n;

    /* renamed from: o, reason: collision with root package name */
    public final g8.f f8638o;

    /* renamed from: p, reason: collision with root package name */
    public final k8.i f8639p;

    public s(u7.f fVar, a0 a0Var, g8.b bVar, w wVar, defpackage.e eVar, m0 m0Var, p8.e eVar2, j jVar, g8.f fVar2, k8.i iVar) {
        this.f8626b = wVar;
        fVar.a();
        this.f8625a = fVar.f15084a;
        this.f8632i = a0Var;
        this.f8637n = bVar;
        this.f8634k = eVar;
        this.f8635l = m0Var;
        this.f8633j = eVar2;
        this.f8636m = jVar;
        this.f8638o = fVar2;
        this.f8639p = iVar;
        this.f8628d = System.currentTimeMillis();
        this.f8627c = new l.l(6);
    }

    public final void a(r8.h hVar) {
        r8.f fVar;
        k8.i.a();
        k8.i.a();
        this.f8629e.d();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.f8634k.c(new i8.a() { // from class: j8.r
                    @Override // i8.a
                    public final void a(String str) {
                        s sVar = s.this;
                        sVar.getClass();
                        sVar.f8639p.f9140a.a(new q(sVar, System.currentTimeMillis() - sVar.f8628d, str));
                    }
                });
                this.f8631h.h();
                fVar = (r8.f) hVar;
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
            }
            if (!fVar.b().f13786b.f13790a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
            }
            if (!this.f8631h.d(fVar)) {
                Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
            }
            this.f8631h.j(fVar.f13804i.get().getTask());
            c();
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(r8.f fVar) {
        String str;
        Future<?> submit = this.f8639p.f9140a.f9133a.submit(new x0.f(14, this, fVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            e = e11;
            str = "Crashlytics encountered a problem during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        } catch (TimeoutException e12) {
            e = e12;
            str = "Crashlytics timed out during initialization.";
            Log.e("FirebaseCrashlytics", str, e);
        }
    }

    public final void c() {
        k8.i.a();
        try {
            r4.c cVar = this.f8629e;
            p8.e eVar = (p8.e) cVar.f13613c;
            String str = (String) cVar.f13612b;
            eVar.getClass();
            if (new File(eVar.f13042c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }
}
