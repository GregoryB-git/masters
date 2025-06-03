package v3;

import android.content.Intent;
import android.util.Pair;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.firestore.f;
import e8.g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.auth.FlutterFirebaseAuthUser;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v3.z0;
import w5.n;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f15815d;

    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, int i10) {
        this.f15812a = i10;
        this.f15814c = obj;
        this.f15815d = obj2;
        this.f15813b = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15812a) {
            case 0:
                z0.a aVar = (z0.a) this.f15814c;
                Pair pair = (Pair) this.f15815d;
                z4.q qVar = (z4.q) this.f15813b;
                w3.a aVar2 = z0.this.f15830h;
                int intValue = ((Integer) pair.first).intValue();
                t.b bVar = (t.b) pair.second;
                bVar.getClass();
                aVar2.o0(intValue, bVar, qVar);
                return;
            case 1:
                w.a aVar3 = (w.a) this.f15814c;
                ((z4.w) this.f15815d).V(aVar3.f17740a, aVar3.f17741b, (z4.q) this.f15813b);
                return;
            case 2:
                n.a aVar4 = (n.a) this.f15814c;
                i0 i0Var = (i0) this.f15815d;
                z3.i iVar = (z3.i) this.f15813b;
                w5.n nVar = aVar4.f16425b;
                int i10 = v5.e0.f15881a;
                nVar.x();
                aVar4.f16425b.h(i0Var, iVar);
                return;
            case 3:
                ((e8.f) this.f15814c).f4831a.execute(new g.q((Runnable) this.f15815d, (g.b) this.f15813b));
                return;
            case 4:
                g9.u uVar = (g9.u) this.f15814c;
                f9.f fVar = (f9.f) this.f15815d;
                d9.c0 c0Var = (d9.c0) this.f15813b;
                g9.j0 j0Var = uVar.f6094i;
                j0Var.getClass();
                try {
                    try {
                        f9.e b10 = fVar.b();
                        i9.n nVar2 = j0Var.f5979a;
                        if (((Boolean) nVar2.f7743a.x("Has newer bundle", new k1.a(10, nVar2, b10))).booleanValue()) {
                            int i11 = b10.f5493d;
                            long j10 = b10.f5494e;
                            c0Var.b(new d9.d0(i11, i11, j10, j10, null, 3));
                            try {
                                fVar.f5496b.close();
                                return;
                            } catch (IOException e10) {
                                p2.m0.y(2, "SyncEngine", "Exception while closing bundle", e10);
                                return;
                            }
                        }
                        c0Var.c(new d9.d0(0, b10.f5493d, 0L, b10.f5494e, null, 2));
                        f9.d dVar = new f9.d(j0Var.f5979a, b10);
                        long j11 = 0;
                        while (true) {
                            fVar.b();
                            f9.c d10 = fVar.d();
                            if (d10 == null) {
                                j0Var.h(dVar.b(), null);
                                i9.n nVar3 = j0Var.f5979a;
                                nVar3.f7743a.y("Save bundle", new g.q(17, nVar3, b10));
                                int i12 = b10.f5493d;
                                long j12 = b10.f5494e;
                                c0Var.b(new d9.d0(i12, i12, j12, j12, null, 3));
                                try {
                                    fVar.f5496b.close();
                                    return;
                                } catch (IOException e11) {
                                    p2.m0.y(2, "SyncEngine", "Exception while closing bundle", e11);
                                    return;
                                }
                            }
                            long j13 = fVar.f5499e;
                            d9.d0 a10 = dVar.a(d10, j13 - j11);
                            if (a10 != null) {
                                c0Var.c(a10);
                            }
                            j11 = j13;
                        }
                    } catch (Exception e12) {
                        p2.m0.y(2, "Firestore", "Loading bundle failed : %s", e12);
                        c0Var.a(new com.google.firebase.firestore.f("Bundle failed to load", f.a.INVALID_ARGUMENT, e12));
                        try {
                            fVar.f5496b.close();
                            return;
                        } catch (IOException e13) {
                            p2.m0.y(2, "SyncEngine", "Exception while closing bundle", e13);
                            return;
                        }
                    }
                } finally {
                }
            case 5:
                g9.u uVar2 = (g9.u) this.f15814c;
                String str = (String) this.f15815d;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f15813b;
                i9.n nVar4 = uVar2.f6092g;
                f9.j jVar = (f9.j) nVar4.f7743a.x("Get named query", new r3.l(5, nVar4, str));
                if (jVar == null) {
                    taskCompletionSource.setResult(null);
                    return;
                } else {
                    g9.k0 k0Var = jVar.f5509b.f5506a;
                    taskCompletionSource.setResult(new g9.f0(k0Var.f6007d, k0Var.f6008e, k0Var.f6006c, k0Var.f6005b, k0Var.f, jVar.f5509b.f5507b, k0Var.f6009g, k0Var.f6010h));
                    return;
                }
            case 6:
                g9.u uVar3 = (g9.u) this.f15814c;
                List list = (List) this.f15815d;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f15813b;
                g9.j0 j0Var2 = uVar3.f6094i;
                j0Var2.g("writeMutations");
                i9.n nVar5 = j0Var2.f5979a;
                nVar5.getClass();
                u7.m mVar = new u7.m(new Date());
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((k9.f) it.next()).f9150a);
                }
                i9.g gVar = (i9.g) nVar5.f7743a.x("Locally write mutations", new r3.q(nVar5, hashSet, list, mVar));
                int i13 = gVar.f7682a;
                Map map = (Map) j0Var2.f5987j.get(j0Var2.f5990m);
                if (map == null) {
                    map = new HashMap();
                    j0Var2.f5987j.put(j0Var2.f5990m, map);
                }
                map.put(Integer.valueOf(i13), taskCompletionSource2);
                j0Var2.h(gVar.f7683b, null);
                j0Var2.f5980b.c();
                return;
            case 7:
                ((aa.h) this.f15814c).lambda$processIntent$0((Intent) this.f15815d, (TaskCompletionSource) this.f15813b);
                return;
            case 8:
                MethodCall methodCall = (MethodCall) this.f15814c;
                MethodChannel.Result result = (MethodChannel.Result) this.f15815d;
                va.d dVar2 = (va.d) this.f15813b;
                HashMap hashMap = va.s.f16073c;
                wa.c cVar = new wa.c(methodCall, result);
                dVar2.getClass();
                dVar2.l(cVar, new x0.q0(20, dVar2, cVar));
                return;
            case 9:
                FlutterFirebaseAuthUser.lambda$getIdToken$1((GeneratedAndroidFirebaseAuth.AuthPigeonFirebaseApp) this.f15814c, (GeneratedAndroidFirebaseAuth.Result) this.f15815d, (Boolean) this.f15813b);
                return;
            case 10:
                FlutterFirebaseCorePlugin.lambda$setAutomaticDataCollectionEnabled$5((String) this.f15814c, (Boolean) this.f15815d, (TaskCompletionSource) this.f15813b);
                return;
            case 11:
                ((FlutterFirebaseCrashlyticsPlugin) this.f15814c).lambda$recordError$4((Map) this.f15815d, (TaskCompletionSource) this.f15813b);
                return;
            default:
                FlutterFirebaseFirestorePlugin.lambda$persistenceCacheIndexManagerRequest$9((GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp) this.f15814c, (GeneratedAndroidFirebaseFirestore.PersistenceCacheIndexManagerRequest) this.f15815d, (GeneratedAndroidFirebaseFirestore.Result) this.f15813b);
                return;
        }
    }
}
