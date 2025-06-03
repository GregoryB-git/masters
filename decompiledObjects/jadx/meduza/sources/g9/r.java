package g9;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.a;
import com.google.firebase.firestore.f;
import eb.t0;
import io.flutter.plugins.firebase.firestore.FlutterFirebaseFirestorePlugin;
import io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import ka.a0;
import ka.w;
import ka.y;
import ka.z;
import lb.b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6058a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f6059b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6060c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f6061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6062e;

    public /* synthetic */ r(Object obj, Object obj2, List list, Object obj3, int i10) {
        this.f6058a = i10;
        this.f6060c = obj;
        this.f6061d = obj2;
        this.f6059b = list;
        this.f6062e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Task forException;
        k0 k0Var;
        switch (this.f6058a) {
            case 0:
                u uVar = (u) this.f6060c;
                f0 f0Var = (f0) this.f6061d;
                List<com.google.firebase.firestore.a> list = this.f6059b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6062e;
                m9.h0 h0Var = uVar.f6094i.f5980b;
                if (h0Var.f10800h) {
                    m9.j jVar = h0Var.f10797d;
                    m9.e0 e0Var = jVar.f10816a;
                    synchronized (f0Var) {
                        if (f0Var.f5948d == null) {
                            f0Var.f5948d = f0Var.j(f0Var.f5945a);
                        }
                        k0Var = f0Var.f5948d;
                    }
                    a0.c l10 = e0Var.l(k0Var);
                    HashMap hashMap = new HashMap();
                    jVar.f10816a.getClass();
                    y.b I = ka.y.I();
                    ka.z K = l10.K();
                    I.m();
                    ka.y.G((ka.y) I.f11120b, K);
                    ArrayList arrayList = new ArrayList();
                    HashSet hashSet = new HashSet();
                    int i10 = 1;
                    for (com.google.firebase.firestore.a aVar : list) {
                        if (!hashSet.contains(aVar.f3143c)) {
                            hashSet.add(aVar.f3143c);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("aggregate_");
                            int i11 = i10 + 1;
                            sb2.append(i10);
                            String sb3 = sb2.toString();
                            hashMap.put(sb3, aVar.f3143c);
                            y.a.b K2 = y.a.K();
                            z.f.a J = z.f.J();
                            String a10 = aVar.a();
                            J.m();
                            z.f.G((z.f) J.f11120b, a10);
                            z.f k10 = J.k();
                            if (aVar instanceof a.b) {
                                y.a.c G = y.a.c.G();
                                K2.m();
                                y.a.G((y.a) K2.f11120b, G);
                            } else if (aVar instanceof a.c) {
                                y.a.d.C0138a H = y.a.d.H();
                                H.m();
                                y.a.d.G((y.a.d) H.f11120b, k10);
                                y.a.d k11 = H.k();
                                K2.m();
                                y.a.H((y.a) K2.f11120b, k11);
                            } else {
                                if (!(aVar instanceof a.C0053a)) {
                                    throw new RuntimeException("Unsupported aggregation");
                                }
                                y.a.C0135a.C0136a H2 = y.a.C0135a.H();
                                H2.m();
                                y.a.C0135a.G((y.a.C0135a) H2.f11120b, k10);
                                y.a.C0135a k12 = H2.k();
                                K2.m();
                                y.a.I((y.a) K2.f11120b, k12);
                            }
                            K2.m();
                            y.a.J((y.a) K2.f11120b, sb3);
                            arrayList.add(K2.k());
                            i10 = i11;
                        }
                    }
                    I.m();
                    ka.y.H((ka.y) I.f11120b, arrayList);
                    ka.y k13 = I.k();
                    w.a J2 = ka.w.J();
                    String J3 = l10.J();
                    J2.m();
                    ka.w.G((ka.w) J2.f11120b, J3);
                    J2.m();
                    ka.w.H((ka.w) J2.f11120b, k13);
                    m9.v vVar = jVar.f10818c;
                    t0<ka.w, ka.x> t0Var = ka.r.f9194c;
                    if (t0Var == null) {
                        synchronized (ka.r.class) {
                            t0Var = ka.r.f9194c;
                            if (t0Var == null) {
                                t0.a b10 = t0.b();
                                b10.f5226c = t0.c.SERVER_STREAMING;
                                b10.f5227d = t0.a("google.firestore.v1.Firestore", "RunAggregationQuery");
                                b10.f5228e = true;
                                ka.w I2 = ka.w.I();
                                ma.o oVar = lb.b.f9824a;
                                b10.f5224a = new b.a(I2);
                                b10.f5225b = new b.a(ka.x.G());
                                t0Var = b10.a();
                                ka.r.f9194c = t0Var;
                            }
                        }
                    }
                    forException = vVar.b(t0Var, J2.k()).continueWith(jVar.f10817b.f11322a, new q3.h(9, jVar, hashMap));
                } else {
                    forException = Tasks.forException(new com.google.firebase.firestore.f("Failed to get result from server.", f.a.UNAVAILABLE));
                }
                forException.addOnSuccessListener(new io.flutter.plugins.firebase.auth.g(taskCompletionSource, 19)).addOnFailureListener(new defpackage.d(taskCompletionSource, 11));
                return;
            default:
                FlutterFirebaseFirestorePlugin.lambda$aggregateQuery$18((d9.a) this.f6060c, (GeneratedAndroidFirebaseFirestore.AggregateSource) this.f6061d, this.f6059b, (GeneratedAndroidFirebaseFirestore.Result) this.f6062e);
                return;
        }
    }
}
