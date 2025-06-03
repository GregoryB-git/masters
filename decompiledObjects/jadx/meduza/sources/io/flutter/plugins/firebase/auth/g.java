package io.flutter.plugins.firebase.auth;

import aa.j0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.f;
import com.google.firebase.messaging.FirebaseMessaging;
import g9.f0;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin;
import j8.e0;
import j9.k;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p2.m0;
import r3.t;
import s3.b;
import t9.a;
import v3.d0;
import v3.d1;
import v3.f1;
import v3.g0;
import v3.p0;
import v5.l;
import w5.j;
import z3.h;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements OnCompleteListener, b.a, t.a, g0.e, l.a, h.a, j.b.a, a.InterfaceC0234a, Continuation, OnSuccessListener, n9.l, SuccessContinuation, BasicMessageChannel.MessageHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8032b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f8031a = i10;
        this.f8032b = obj;
    }

    @Override // s3.b.a
    public Object a() {
        switch (this.f8031a) {
            case 0:
                return Integer.valueOf(((r3.d) this.f8032b).a());
            default:
                q3.m mVar = (q3.m) this.f8032b;
                Iterator it = mVar.f13272b.x().iterator();
                while (it.hasNext()) {
                    mVar.f13273c.b((k3.s) it.next(), 1);
                }
                return null;
        }
    }

    @Override // r3.t.a
    public Object apply(Object obj) {
        switch (this.f8031a) {
            case 3:
                r3.t tVar = (r3.t) this.f8032b;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                h3.c cVar = r3.t.f;
                tVar.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + tVar.f13585b.a()).execute();
                break;
            default:
                Map map = (Map) this.f8032b;
                Cursor cursor = (Cursor) obj;
                h3.c cVar2 = r3.t.f;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new t.b(cursor.getString(1), cursor.getString(2)));
                }
                break;
        }
        return null;
    }

    public void b(Display display) {
        long j10;
        w5.j jVar = (w5.j) this.f8032b;
        jVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            jVar.f16397k = refreshRate;
            j10 = (refreshRate * 80) / 100;
        } else {
            v5.m.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
            jVar.f16397k = -9223372036854775807L;
        }
        jVar.f16398l = j10;
    }

    @Override // n9.l
    public Object get() {
        i9.e eVar = (i9.e) this.f8032b;
        i9.f fVar = eVar.f7667c.get();
        HashSet hashSet = new HashSet();
        int i10 = eVar.f7669e;
        while (i10 > 0) {
            String e10 = fVar.e();
            if (e10 == null || hashSet.contains(e10)) {
                break;
            }
            m0.y(1, "IndexBackfiller", "Processing collection: %s", e10);
            i9.f fVar2 = eVar.f7667c.get();
            i9.h hVar = eVar.f7668d.get();
            j9.b i11 = fVar2.i(e10);
            Map<j9.i, j9.m> c10 = hVar.f7687a.c(e10, i11, i10);
            HashMap b10 = i10 - c10.size() > 0 ? hVar.f7689c.b(i11.f8672e, i10 - c10.size(), e10) : new HashMap();
            int i12 = -1;
            for (k9.k kVar : b10.values()) {
                if (!c10.containsKey(kVar.a())) {
                    j9.i a10 = kVar.a();
                    j9.i a11 = kVar.a();
                    c10.put(a10, kVar.c() instanceof k9.l ? hVar.f7687a.g(a11) : j9.m.m(a11));
                }
                i12 = Math.max(i12, kVar.b());
            }
            hVar.f(b10, c10.keySet());
            i9.g a12 = i9.g.a(i12, hVar.a(c10, b10, Collections.emptySet()));
            fVar2.h(a12.f7683b);
            Iterator<Map.Entry<j9.i, j9.g>> it = a12.f7683b.iterator();
            j9.b bVar = i11;
            while (it.hasNext()) {
                j9.b g10 = k.a.g(it.next().getValue());
                if (g10.compareTo(bVar) > 0) {
                    bVar = g10;
                }
            }
            j9.b bVar2 = new j9.b(bVar.f8670c, bVar.f8671d, Math.max(a12.f7682a, i11.f8672e));
            m0.y(1, "IndexBackfiller", "Updating offset: %s", bVar2);
            fVar2.n(e10, bVar2);
            i10 -= a12.f7683b.size();
            hashSet.add(e10);
        }
        return Integer.valueOf(eVar.f7669e - i10);
    }

    @Override // t9.a.InterfaceC0234a
    public void h(t9.b bVar) {
        switch (this.f8031a) {
            case 12:
                f8.a aVar = (f8.a) this.f8032b;
                aVar.getClass();
                b.z zVar = b.z.f1660e;
                zVar.h("AnalyticsConnector now available.");
                w7.a aVar2 = (w7.a) bVar.get();
                d2.q qVar = new d2.q(aVar2, 8);
                f8.b bVar2 = new f8.b();
                w7.b a10 = aVar2.a("clx", bVar2);
                if (a10 == null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
                    }
                    w7.b a11 = aVar2.a("crash", bVar2);
                    if (a11 != null) {
                        Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
                    }
                    a10 = a11;
                }
                if (a10 == null) {
                    zVar.s("Could not register Firebase Analytics listener; a listener is already registered.", null);
                    return;
                }
                zVar.h("Registered Firebase Analytics listener.");
                g.s sVar = new g.s(9);
                h8.c cVar = new h8.c(qVar, TimeUnit.MILLISECONDS);
                synchronized (aVar) {
                    Iterator it = aVar.f5479d.iterator();
                    while (it.hasNext()) {
                        sVar.c((i8.a) it.next());
                    }
                    bVar2.f5481b = sVar;
                    bVar2.f5480a = cVar;
                    aVar.f5478c = sVar;
                    aVar.f5477b = cVar;
                }
                return;
            case 13:
                g8.b bVar3 = (g8.b) this.f8032b;
                bVar3.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar3.f5908b.set((g8.a) bVar.get());
                return;
            default:
                ((da.a) bVar.get()).a();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Registering RemoteConfig Rollouts subscriber", null);
                    return;
                }
                return;
        }
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f8031a) {
            case 6:
                ((f1.c) obj).p0(d0.d0((d1) this.f8032b));
                break;
            case 7:
                p0 p0Var = (p0) this.f8032b;
                int i10 = d0.f15267h0;
                ((f1.c) obj).R(p0Var);
                break;
            case 8:
                ((f1.c) obj).R(d0.this.O);
                break;
            default:
                ((w3.b) obj).U();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f8031a) {
            case 0:
                FlutterFirebaseAuthPlugin.lambda$sendPasswordResetEmail$11((GeneratedAndroidFirebaseAuth.VoidResult) this.f8032b, task);
                break;
            case 1:
                FlutterFirebaseAuthPlugin.lambda$confirmPasswordReset$2((GeneratedAndroidFirebaseAuth.VoidResult) this.f8032b, task);
                break;
            case 2:
                FlutterFirebaseAuthUser.lambda$sendEmailVerification$7((GeneratedAndroidFirebaseAuth.VoidResult) this.f8032b, task);
                break;
            case 3:
                FlutterFirebaseMultiFactor.lambda$unenroll$3((GeneratedAndroidFirebaseAuth.VoidResult) this.f8032b, task);
                break;
            default:
                ((MethodChannel.Result) this.f8032b).success(null);
                break;
        }
    }

    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
    public void onMessage(Object obj, BasicMessageChannel.Reply reply) {
        switch (this.f8031a) {
            case 24:
                GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi.CC.b((GeneratedAndroidFirebaseAuth.MultiFactoResolverHostApi) this.f8032b, obj, reply);
                break;
            case 25:
                GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi.CC.b((GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi) this.f8032b, obj, reply);
                break;
            case 26:
                GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi.CC.d((GeneratedAndroidFirebaseAuth.MultiFactorUserHostApi) this.f8032b, obj, reply);
                break;
            case 27:
                GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.b((GeneratedAndroidFirebaseCore.FirebaseAppHostApi) this.f8032b, obj, reply);
                break;
            default:
                GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.c((GeneratedAndroidFirebaseCore.FirebaseCoreHostApi) this.f8032b, obj, reply);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.f8031a) {
            case 19:
                ((TaskCompletionSource) this.f8032b).setResult((Map) obj);
                break;
            default:
                ((FlutterFirebaseDynamicLinksPlugin) this.f8032b).lambda$onNewIntent$0((v8.c) obj);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String str = (String) this.f8032b;
        j0 j0Var = (j0) obj;
        com.google.firebase.messaging.a aVar = FirebaseMessaging.f3229m;
        j0Var.getClass();
        Task<Void> e10 = j0Var.e(new aa.g0("U", str));
        j0Var.f();
        return e10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        j9.q qVar;
        boolean z10 = false;
        switch (this.f8031a) {
            case 15:
                ((j8.d0) this.f8032b).getClass();
                if (task.isSuccessful()) {
                    j8.u uVar = (j8.u) task.getResult();
                    b.z zVar = b.z.f1660e;
                    StringBuilder l10 = defpackage.f.l("Crashlytics report successfully enqueued to DataTransport: ");
                    l10.append(uVar.c());
                    zVar.h(l10.toString());
                    File b10 = uVar.b();
                    if (b10.delete()) {
                        StringBuilder l11 = defpackage.f.l("Deleted report file: ");
                        l11.append(b10.getPath());
                        zVar.h(l11.toString());
                    } else {
                        StringBuilder l12 = defpackage.f.l("Crashlytics could not delete report file: ");
                        l12.append(b10.getPath());
                        zVar.s(l12.toString(), null);
                    }
                    z10 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                }
                return Boolean.valueOf(z10);
            case 16:
                CountDownLatch countDownLatch = (CountDownLatch) this.f8032b;
                ExecutorService executorService = e0.f8575a;
                countDownLatch.countDown();
                return null;
            case 17:
                ((Runnable) this.f8032b).run();
                return Tasks.forResult(null);
            case 18:
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f8032b;
                firebaseFirestore.getClass();
                f0 f0Var = (f0) task.getResult();
                if (f0Var != null) {
                    return new com.google.firebase.firestore.i(f0Var, firebaseFirestore);
                }
                return null;
            case 19:
            default:
                ((aa.o) this.f8032b).getClass();
                Bundle bundle = (Bundle) task.getResult(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 20:
                g9.m0 m0Var = (g9.m0) this.f8032b;
                ThreadPoolExecutor threadPoolExecutor = g9.m0.f6025g;
                m0Var.getClass();
                if (task.isSuccessful()) {
                    for (j9.m mVar : (List) task.getResult()) {
                        if (mVar.b()) {
                            qVar = mVar.f8695d;
                        } else {
                            if (!mVar.h()) {
                                x6.b.T("Unexpected document type in transaction: " + mVar, new Object[0]);
                                throw null;
                            }
                            qVar = j9.q.f8701b;
                        }
                        if (m0Var.f6027b.containsKey(mVar.f8693b)) {
                            if (!m0Var.f6027b.get(mVar.f8693b).equals(mVar.f8695d)) {
                                throw new com.google.firebase.firestore.f("Document version changed between two reads.", f.a.ABORTED);
                            }
                        } else {
                            m0Var.f6027b.put(mVar.f8693b, qVar);
                        }
                    }
                }
                return task;
        }
    }
}
