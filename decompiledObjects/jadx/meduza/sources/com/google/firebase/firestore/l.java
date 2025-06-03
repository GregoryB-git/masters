package com.google.firebase.firestore;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.f;
import eb.t0;
import g9.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import ka.d;
import ka.r;
import lb.b;
import m9.v;
import ma.o;
import r3.a0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final m0 f3198a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3199b;

    public interface a<TResult> {
    }

    public l(m0 m0Var, FirebaseFirestore firebaseFirestore) {
        m0Var.getClass();
        this.f3198a = m0Var;
        this.f3199b = firebaseFirestore;
    }

    public final d a(c cVar) {
        this.f3199b.j(cVar);
        try {
            return (d) Tasks.await(b(cVar));
        } catch (InterruptedException e10) {
            throw new RuntimeException(e10);
        } catch (ExecutionException e11) {
            if (e11.getCause() instanceof f) {
                throw ((f) e11.getCause());
            }
            throw new RuntimeException(e11.getCause());
        }
    }

    public final Task<d> b(c cVar) {
        Task continueWithTask;
        m0 m0Var = this.f3198a;
        List singletonList = Collections.singletonList(cVar.f3146a);
        x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", !m0Var.f6029d, new Object[0]);
        if (m0Var.f6028c.size() != 0) {
            continueWithTask = Tasks.forException(new f("Firestore transactions require all reads to be executed before all writes.", f.a.INVALID_ARGUMENT));
        } else {
            m9.j jVar = m0Var.f6026a;
            jVar.getClass();
            d.a J = ka.d.J();
            String str = jVar.f10816a.f10779b;
            J.m();
            ka.d.G((ka.d) J.f11120b, str);
            Iterator it = singletonList.iterator();
            while (it.hasNext()) {
                String j10 = jVar.f10816a.j((j9.i) it.next());
                J.m();
                ka.d.H((ka.d) J.f11120b, j10);
            }
            ArrayList arrayList = new ArrayList();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            final v vVar = jVar.f10818c;
            t0<ka.d, ka.e> t0Var = r.f9192a;
            if (t0Var == null) {
                synchronized (r.class) {
                    t0Var = r.f9192a;
                    if (t0Var == null) {
                        t0.a b10 = t0.b();
                        b10.f5226c = t0.c.SERVER_STREAMING;
                        b10.f5227d = t0.a("google.firestore.v1.Firestore", "BatchGetDocuments");
                        b10.f5228e = true;
                        ka.d I = ka.d.I();
                        o oVar = lb.b.f9824a;
                        b10.f5224a = new b.a(I);
                        b10.f5225b = new b.a(ka.e.G());
                        t0<ka.d, ka.e> a10 = b10.a();
                        r.f9192a = a10;
                        t0Var = a10;
                    }
                }
            }
            final ka.d k10 = J.k();
            final m9.i iVar = new m9.i(jVar, arrayList, singletonList, taskCompletionSource);
            vVar.f10896d.a(t0Var).addOnCompleteListener(vVar.f10893a.f11322a, new OnCompleteListener() { // from class: m9.o
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    v vVar2 = v.this;
                    v.a aVar = iVar;
                    Object obj = k10;
                    vVar2.getClass();
                    eb.e eVar = (eb.e) task.getResult();
                    eVar.e(new t(aVar, eVar), vVar2.a());
                    eVar.c(1);
                    eVar.d(obj);
                    eVar.b();
                }
            });
            continueWithTask = taskCompletionSource.getTask().continueWithTask(n9.f.f11361b, new io.flutter.plugins.firebase.auth.g(m0Var, 20));
        }
        return continueWithTask.continueWith(n9.f.f11361b, new aa.m0(this, 8));
    }

    public final void c(c cVar, Map map, d9.t0 t0Var) {
        this.f3199b.j(cVar);
        if (t0Var == null) {
            throw new NullPointerException("Provided options must not be null.");
        }
        a0 d10 = t0Var.f3719a ? this.f3199b.f3135h.d(map, t0Var.f3720b) : this.f3199b.f3135h.f(map);
        m0 m0Var = this.f3198a;
        j9.i iVar = cVar.f3146a;
        List singletonList = Collections.singletonList(d10.r(iVar, m0Var.a(iVar)));
        x6.b.Z("A transaction object cannot be used after its update callback has been invoked.", !m0Var.f6029d, new Object[0]);
        m0Var.f6028c.addAll(singletonList);
        m0Var.f.add(iVar);
    }
}
