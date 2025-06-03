package x0;

import android.util.Log;
import android.util.Pair;
import android.view.KeyEvent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e8.g;
import i9.m1;
import i9.n;
import io.flutter.embedding.android.KeyEmbedderResponder;
import io.flutter.embedding.android.KeyboardMap;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import o7.t;
import v3.z0;
import x0.e;
import x0.r0;
import x3.l;
import z4.t;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16615d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i10) {
        this.f16612a = i10;
        this.f16613b = obj;
        this.f16614c = obj2;
        this.f16615d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16612a) {
            case 0:
                r0.c cVar = (r0.c) this.f16613b;
                r0.c cVar2 = (r0.c) this.f16614c;
                e.g gVar = (e.g) this.f16615d;
                ec.i.e(gVar, "this$0");
                h0.a(cVar.f16746c, cVar2.f16746c, gVar.f16590o, gVar.f16589n);
                return;
            case 1:
                p1.g gVar2 = (p1.g) this.f16613b;
                t1.e eVar = (t1.e) this.f16614c;
                p1.h hVar = (p1.h) this.f16615d;
                ec.i.e(gVar2, "this$0");
                ec.i.e(eVar, "$query");
                ec.i.e(hVar, "$queryInterceptorProgram");
                gVar2.getClass();
                eVar.g();
                throw null;
            case 2:
                ((v3.s0) this.f16613b).f15774c.J(((t.a) this.f16614c).e(), (t.b) this.f16615d);
                return;
            case 3:
                z0.a aVar = (z0.a) this.f16613b;
                Pair pair = (Pair) this.f16614c;
                z0.this.f15830h.V(((Integer) pair.first).intValue(), (t.b) pair.second, (z4.q) this.f16615d);
                return;
            case 4:
                l.a aVar2 = (l.a) this.f16613b;
                v3.i0 i0Var = (v3.i0) this.f16614c;
                z3.i iVar = (z3.i) this.f16615d;
                x3.l lVar = aVar2.f16987b;
                int i10 = v5.e0.f15881a;
                lVar.q();
                aVar2.f16987b.u(i0Var, iVar);
                return;
            case 5:
                ((e8.f) this.f16613b).f4831a.execute(new q0(8, (Runnable) this.f16614c, (g.b) this.f16615d));
                return;
            case 6:
                j8.s sVar = (j8.s) this.f16613b;
                Throwable th = (Throwable) this.f16614c;
                Map map = (Map) this.f16615d;
                j8.n nVar = sVar.f8631h;
                Thread currentThread = Thread.currentThread();
                nVar.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                j8.v vVar = nVar.f8605n;
                if (vVar != null && vVar.f8650e.get()) {
                    return;
                }
                long j10 = currentTimeMillis / 1000;
                String e10 = nVar.e();
                if (e10 == null) {
                    Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                    return;
                }
                l8.c cVar3 = new l8.c(e10, j10, map);
                j8.d0 d0Var = nVar.f8604m;
                d0Var.getClass();
                String str = "Persisting non-fatal event for session " + cVar3.f9758a;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str, null);
                }
                d0Var.e(th, currentThread, "error", cVar3, false);
                return;
            case 7:
                ((j8.s) this.f16613b).f8631h.i((String) this.f16614c, (String) this.f16615d);
                return;
            case 8:
                i9.n nVar2 = (i9.n) this.f16613b;
                n.a aVar3 = (n.a) this.f16614c;
                g9.k0 k0Var = (g9.k0) this.f16615d;
                g9.l0 l0Var = nVar2.f7754m;
                int i11 = l0Var.f6024a;
                l0Var.f6024a = i11 + 2;
                aVar3.f7756b = i11;
                m1 m1Var = new m1(k0Var, i11, nVar2.f7743a.p().h(), i9.e0.LISTEN);
                aVar3.f7755a = m1Var;
                nVar2.f7750i.c(m1Var);
                return;
            case 9:
                Callable callable = (Callable) this.f16613b;
                Executor executor = (Executor) this.f16614c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16615d;
                try {
                    ((Task) callable.call()).continueWith(executor, new aa.m0(taskCompletionSource, 11));
                    return;
                } catch (Exception e11) {
                    taskCompletionSource.setException(e11);
                    return;
                } catch (Throwable th2) {
                    taskCompletionSource.setException(new IllegalStateException("Unhandled throwable in callTask.", th2));
                    return;
                }
            case 10:
                ((KeyEmbedderResponder) this.f16613b).lambda$synchronizePressingKey$1((KeyboardMap.KeyPair) this.f16614c, (KeyEvent) this.f16615d);
                return;
            case 11:
                ((FlutterFirebaseCorePlugin) this.f16613b).lambda$firebaseAppToMap$0((u7.f) this.f16614c, (TaskCompletionSource) this.f16615d);
                return;
            case 12:
                FlutterFirebaseCorePlugin.lambda$setAutomaticResourceManagementEnabled$6((String) this.f16613b, (Boolean) this.f16614c, (TaskCompletionSource) this.f16615d);
                return;
            case 13:
                ((FlutterFirebaseCrashlyticsPlugin) this.f16613b).lambda$setCrashlyticsCollectionEnabled$7((Map) this.f16614c, (TaskCompletionSource) this.f16615d);
                return;
            default:
                FlutterFirebaseFirestorePlugin.lambda$documentReferenceDelete$16((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f16613b, (GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest) this.f16614c, (GeneratedAndroidFirebaseFirestore.Result) this.f16615d);
                return;
        }
    }
}
