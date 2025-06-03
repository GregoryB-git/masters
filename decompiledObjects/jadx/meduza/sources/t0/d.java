package t0;

import android.content.Context;
import android.util.Log;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.g;
import b.a0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.b;
import g.q;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin;
import j8.n;
import j8.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import p2.q0;
import p2.r;
import x2.l;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14387a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14388b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f14390d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i10) {
        this.f14387a = i10;
        this.f14388b = obj;
        this.f14389c = obj2;
        this.f14390d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = true;
        switch (this.f14387a) {
            case 0:
                EmojiCompatInitializer.b bVar = (EmojiCompatInitializer.b) this.f14388b;
                d.h hVar = (d.h) this.f14389c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f14390d;
                bVar.getClass();
                try {
                    androidx.emoji2.text.g a10 = androidx.emoji2.text.a.a(bVar.f973a);
                    if (a10 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    g.b bVar2 = (g.b) a10.f989a;
                    synchronized (bVar2.f1008d) {
                        bVar2.f = threadPoolExecutor;
                    }
                    a10.f989a.a(new androidx.emoji2.text.e(hVar, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hVar.a(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                p1.g gVar = (p1.g) this.f14388b;
                t1.e eVar = (t1.e) this.f14389c;
                p1.h hVar2 = (p1.h) this.f14390d;
                ec.i.e(gVar, "this$0");
                ec.i.e(eVar, "$query");
                ec.i.e(hVar2, "$queryInterceptorProgram");
                gVar.getClass();
                eVar.g();
                throw null;
            case 2:
                p1.g gVar2 = (p1.g) this.f14388b;
                String str = (String) this.f14389c;
                List list = (List) this.f14390d;
                ec.i.e(gVar2, "this$0");
                ec.i.e(str, "$sql");
                ec.i.e(list, "$inputArguments");
                gVar2.getClass();
                throw null;
            case 3:
                r rVar = (r) this.f14388b;
                s7.e eVar2 = (s7.e) this.f14389c;
                q0 q0Var = (q0) this.f14390d;
                String str2 = r.f12943l;
                rVar.getClass();
                try {
                    z10 = ((Boolean) eVar2.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (rVar.f12953k) {
                    l s10 = a0.s(q0Var.f12923c);
                    String str3 = s10.f16820a;
                    if (rVar.c(str3) == q0Var) {
                        rVar.b(str3);
                    }
                    o2.j.d().a(r.f12943l, r.class.getSimpleName() + " " + str3 + " executed; reschedule = " + z10);
                    Iterator it = rVar.f12952j.iterator();
                    while (it.hasNext()) {
                        ((p2.d) it.next()).a(s10, z10);
                    }
                }
                return;
            case 4:
                s sVar = (s) this.f14388b;
                String str4 = (String) this.f14389c;
                String str5 = (String) this.f14390d;
                n nVar = sVar.f8631h;
                nVar.getClass();
                try {
                    nVar.f8596d.f9798d.b(str4, str5);
                    return;
                } catch (IllegalArgumentException e10) {
                    Context context = nVar.f8593a;
                    if (context != null) {
                        if ((context.getApplicationInfo().flags & 2) != 0) {
                            throw e10;
                        }
                    }
                    Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
                    return;
                }
            case 5:
                g9.d dVar = (g9.d) this.f14388b;
                Object obj = this.f14389c;
                com.google.firebase.firestore.f fVar = (com.google.firebase.firestore.f) this.f14390d;
                if (dVar.f5922c) {
                    return;
                }
                dVar.f5921b.a(obj, fVar);
                return;
            case 6:
                b.c cVar = (b.c) this.f14388b;
                Map map = (Map) this.f14389c;
                MethodChannel.Result result = (MethodChannel.Result) this.f14390d;
                cVar.getClass();
                try {
                    ArrayList c10 = com.ryanheise.audioservice.b.c((List) map.get("queue"));
                    AudioService audioService = AudioService.F;
                    synchronized (audioService) {
                        AudioService.I = c10;
                        audioService.f3265r.i(c10);
                    }
                    cVar.f3290d.post(new ta.c(0, result));
                    return;
                } catch (Exception e11) {
                    cVar.f3290d.post(new q(24, result, e11));
                    return;
                }
            case 7:
                ((FlutterFirebaseCrashlyticsPlugin) this.f14388b).lambda$getPluginConstantsForFirebaseApp$11((TaskCompletionSource) this.f14389c, (u7.f) this.f14390d);
                return;
            case 8:
                FlutterFirebaseFirestorePlugin.lambda$writeBatchCommit$19((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f14388b, (List) this.f14389c, (GeneratedAndroidFirebaseFirestore.Result) this.f14390d);
                return;
            case 9:
                FlutterFirebaseFirestorePlugin.lambda$setIndexConfiguration$8((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f14388b, (String) this.f14389c, (GeneratedAndroidFirebaseFirestore.Result) this.f14390d);
                return;
            default:
                ((FlutterFirebaseFunctionsPlugin) this.f14388b).lambda$httpsFunctionCall$0((Map) this.f14389c, (TaskCompletionSource) this.f14390d);
                return;
        }
    }
}
