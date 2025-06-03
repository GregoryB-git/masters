package k1;

import aa.b0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import eb.t0;
import f9.e;
import g9.m0;
import g9.n0;
import i9.n;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.firebase.firestore.streamhandler.LoadBundleStreamHandler;
import io.flutter.plugins.firebase.firestore.streamhandler.TransactionStreamHandler;
import j9.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k3.s;
import k9.q;
import ka.e0;
import ka.h;
import ka.r;
import lb.b;
import m9.j;
import m9.v;
import ma.o;
import n3.c;
import o9.m;
import q3.k;
import r5.f;
import s3.b;
import v5.l;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements b.a, l.a, f.h.a, Continuation, n9.l, OnFailureListener, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8834a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8836c;

    public /* synthetic */ a(int i10, Object obj, Object obj2) {
        this.f8834a = i10;
        this.f8835b = obj;
        this.f8836c = obj2;
    }

    @Override // s3.b.a
    public Object a() {
        switch (this.f8834a) {
            case 1:
                return ((k) this.f8835b).f13257c.z((s) this.f8836c);
            default:
                k kVar = (k) this.f8835b;
                Map map = (Map) this.f8836c;
                kVar.getClass();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    kVar.f13262i.C(((Integer) r2.getValue()).intValue(), c.a.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    @Override // r5.f.h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o7.l0 b(int r20, z4.i0 r21, int[] r22) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.b(int, z4.i0, int[]):o7.l0");
    }

    @Override // n9.l
    public Object get() {
        n nVar = (n) this.f8835b;
        e eVar = (e) this.f8836c;
        e a10 = nVar.f7751j.a(eVar.f5490a);
        return Boolean.valueOf(a10 != null && a10.f5492c.compareTo(eVar.f5492c) >= 0);
    }

    @Override // v5.l.a
    public void invoke(Object obj) {
        switch (this.f8834a) {
            case 3:
                ((w3.b) obj).m0();
                break;
            case 4:
                ((w3.b) obj).I0();
                break;
            case 5:
                ((w3.b) obj).u0();
                break;
            case 6:
                ((w3.b) obj).k0();
                break;
            default:
                ((w3.b) obj).l0();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Task continueWithTask;
        switch (this.f8834a) {
            case 0:
                n0 n0Var = (n0) this.f8835b;
                m0 m0Var = (m0) this.f8836c;
                n0Var.getClass();
                if (!task.isSuccessful()) {
                    n0Var.a(task);
                    return;
                }
                x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", !m0Var.f6029d, new Object[0]);
                com.google.firebase.firestore.f fVar = m0Var.f6030e;
                if (fVar != null) {
                    continueWithTask = Tasks.forException(fVar);
                } else {
                    HashSet hashSet = new HashSet(m0Var.f6027b.keySet());
                    Iterator<k9.f> it = m0Var.f6028c.iterator();
                    while (it.hasNext()) {
                        hashSet.remove(it.next().f9150a);
                    }
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        i iVar = (i) it2.next();
                        m0Var.f6028c.add(new q(iVar, m0Var.a(iVar)));
                    }
                    m0Var.f6029d = true;
                    j jVar = m0Var.f6026a;
                    ArrayList<k9.f> arrayList = m0Var.f6028c;
                    jVar.getClass();
                    h.a J = h.J();
                    String str = jVar.f10816a.f10779b;
                    J.m();
                    h.G((h) J.f11120b, str);
                    Iterator<k9.f> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        e0 k10 = jVar.f10816a.k(it3.next());
                        J.m();
                        h.H((h) J.f11120b, k10);
                    }
                    v vVar = jVar.f10818c;
                    t0<h, ka.i> t0Var = r.f9193b;
                    if (t0Var == null) {
                        synchronized (r.class) {
                            t0Var = r.f9193b;
                            if (t0Var == null) {
                                t0.a b10 = t0.b();
                                b10.f5226c = t0.c.UNARY;
                                b10.f5227d = t0.a("google.firestore.v1.Firestore", "Commit");
                                b10.f5228e = true;
                                h I = h.I();
                                o oVar = lb.b.f9824a;
                                b10.f5224a = new b.a(I);
                                b10.f5225b = new b.a(ka.i.H());
                                t0<h, ka.i> a10 = b10.a();
                                r.f9193b = a10;
                                t0Var = a10;
                            }
                        }
                    }
                    continueWithTask = vVar.b(t0Var, J.k()).continueWith(jVar.f10817b.f11322a, new aa.m0(jVar, 9)).continueWithTask(n9.f.f11361b, new w3.v(19));
                }
                continueWithTask.addOnCompleteListener(n0Var.f6033a.f11322a, new io.flutter.plugins.firebase.auth.l(3, n0Var, task));
                return;
            default:
                ((TransactionStreamHandler) this.f8835b).lambda$onListen$3((EventChannel.EventSink) this.f8836c, task);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((LoadBundleStreamHandler) this.f8835b).lambda$onListen$0((EventChannel.EventSink) this.f8836c, exc);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f8834a) {
            case 9:
                d9.a aVar = (d9.a) this.f8835b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f8836c;
                aVar.getClass();
                if (task.isSuccessful()) {
                    taskCompletionSource.setResult(new com.google.firebase.firestore.b(aVar, (Map) task.getResult()));
                    return null;
                }
                taskCompletionSource.setException(task.getException());
                return null;
            case 10:
            default:
                b0 b0Var = (b0) this.f8835b;
                String str = (String) this.f8836c;
                synchronized (b0Var) {
                    b0Var.f270b.remove(str);
                }
                return task;
            case 11:
                o9.e eVar = (o9.e) this.f8835b;
                m mVar = (m) this.f8836c;
                TaskCompletionSource<Void> taskCompletionSource2 = o9.e.f12090j;
                ec.i.e(eVar, "this$0");
                ec.i.e(mVar, "$options");
                return eVar.f12095d.a(mVar.f12129c);
        }
    }
}
