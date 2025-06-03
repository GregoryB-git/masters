package com.google.firebase.firestore;

import aa.m0;
import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.f;
import d9.b0;
import d9.n;
import d9.o;
import d9.t0;
import d9.v0;
import d9.y0;
import e7.p3;
import g9.f0;
import g9.k;
import g9.o0;
import g9.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import ka.d0;
import n9.e;
import n9.o;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final j9.i f3146a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3147b;

    public c(j9.i iVar, FirebaseFirestore firebaseFirestore) {
        iVar.getClass();
        this.f3146a = iVar;
        this.f3147b = firebaseFirestore;
    }

    public final b0 a(Executor executor, final k.a aVar, final d9.l lVar) {
        final g9.d dVar = new g9.d(executor, new d9.l() { // from class: d9.i
            @Override // d9.l
            public final void a(Object obj, com.google.firebase.firestore.f fVar) {
                com.google.firebase.firestore.d dVar2;
                com.google.firebase.firestore.c cVar = com.google.firebase.firestore.c.this;
                l lVar2 = lVar;
                g9.s0 s0Var = (g9.s0) obj;
                cVar.getClass();
                if (fVar != null) {
                    lVar2.a(null, fVar);
                    return;
                }
                x6.b.Z("Got event without value or error set", s0Var != null, new Object[0]);
                x6.b.Z("Too many documents returned on a document query", s0Var.f6077b.size() <= 1, new Object[0]);
                j9.g h10 = s0Var.f6077b.f8685a.h(cVar.f3146a);
                if (h10 != null) {
                    dVar2 = new com.google.firebase.firestore.d(cVar.f3147b, h10.getKey(), h10, s0Var.f6080e, s0Var.f.contains(h10.getKey()));
                } else {
                    dVar2 = new com.google.firebase.firestore.d(cVar.f3147b, cVar.f3146a, null, s0Var.f6080e, false);
                }
                lVar2.a(dVar2, null);
            }
        });
        final f0 f0Var = new f0(this.f3146a.f8684a, null);
        return (b0) this.f3147b.a(new n9.i() { // from class: d9.j

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Activity f3679d = null;

            @Override // n9.i
            public final Object apply(Object obj) {
                g9.f0 f0Var2 = g9.f0.this;
                k.a aVar2 = aVar;
                final g9.d dVar2 = dVar;
                Activity activity = this.f3679d;
                final g9.u uVar = (g9.u) obj;
                uVar.d();
                final g9.g0 g0Var = new g9.g0(f0Var2, aVar2, dVar2);
                uVar.f6090d.a(new x0.f(18, uVar, g0Var));
                b0 b0Var = new b0() { // from class: d9.k
                    @Override // d9.b0
                    public final void remove() {
                        g9.d dVar3 = g9.d.this;
                        g9.u uVar2 = uVar;
                        g9.g0 g0Var2 = g0Var;
                        dVar3.f5922c = true;
                        uVar2.f6090d.a(new w.g(18, uVar2, g0Var2));
                    }
                };
                g9.a.a(activity, b0Var);
                return b0Var;
            }
        });
    }

    public final Task<d> b(final v0 v0Var) {
        if (v0Var == v0.CACHE) {
            return ((Task) this.f3147b.a(new m0(this, 0))).continueWith(n9.f.f11361b, new defpackage.d(this, 8));
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        k.a aVar = new k.a();
        aVar.f5998a = true;
        aVar.f5999b = true;
        aVar.f6000c = true;
        taskCompletionSource2.setResult(a(n9.f.f11361b, aVar, new d9.l() { // from class: d9.h
            @Override // d9.l
            public final void a(Object obj, com.google.firebase.firestore.f fVar) {
                com.google.firebase.firestore.f fVar2;
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
                TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                v0 v0Var2 = v0Var;
                com.google.firebase.firestore.d dVar = (com.google.firebase.firestore.d) obj;
                if (fVar != null) {
                    taskCompletionSource3.setException(fVar);
                    return;
                }
                try {
                    ((b0) Tasks.await(taskCompletionSource4.getTask())).remove();
                    j9.g gVar = dVar.f3150c;
                    boolean z10 = true;
                    if ((gVar != null) || !dVar.f3151d.f3723b) {
                        if (gVar == null) {
                            z10 = false;
                        }
                        if (!z10 || !dVar.f3151d.f3723b || v0Var2 != v0.SERVER) {
                            taskCompletionSource3.setResult(dVar);
                            return;
                        }
                        fVar2 = new com.google.firebase.firestore.f("Failed to get document from server. (However, this document does exist in the local cache. Run again without setting source to SERVER to retrieve the cached document.)", f.a.UNAVAILABLE);
                    } else {
                        fVar2 = new com.google.firebase.firestore.f("Failed to get document because the client is offline.", f.a.UNAVAILABLE);
                    }
                    taskCompletionSource3.setException(fVar2);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    x6.b.S("Failed to register a listener for a single document", e10, new Object[0]);
                    throw null;
                } catch (ExecutionException e11) {
                    x6.b.S("Failed to register a listener for a single document", e11, new Object[0]);
                    throw null;
                }
            }
        }));
        return taskCompletionSource.getTask();
    }

    public final String c() {
        return this.f3146a.f8684a.h();
    }

    public final Task d(Map map, t0 t0Var) {
        if (t0Var != null) {
            return ((Task) this.f3147b.a(new d9.g(Collections.singletonList((t0Var.f3719a ? this.f3147b.f3135h.d(map, t0Var.f3720b) : this.f3147b.f3135h.f(map)).r(this.f3146a, k9.m.f9167c)), 0))).continueWith(n9.f.f11361b, o.f11373a);
        }
        throw new NullPointerException("Provided options must not be null.");
    }

    public final Task<Void> e(n nVar, Object obj, Object... objArr) {
        y0 y0Var = this.f3147b.f3135h;
        r3.j jVar = o.f11373a;
        int i10 = 1;
        if (objArr.length % 2 == 1) {
            throw new IllegalArgumentException("Missing value in call to update().  There must be an even number of arguments that alternate between field names and values");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(nVar);
        arrayList.add(obj);
        Collections.addAll(arrayList, objArr);
        for (int i11 = 0; i11 < arrayList.size(); i11 += 2) {
            Object obj2 = arrayList.get(i11);
            if (!(obj2 instanceof String) && !(obj2 instanceof n)) {
                StringBuilder l10 = defpackage.f.l("Excepted field name at argument position ");
                l10.append(i11 + 1 + 1);
                l10.append(" but got ");
                l10.append(obj2);
                l10.append(" in call to update.  The arguments to update should alternate between field names and values");
                throw new IllegalArgumentException(l10.toString());
            }
        }
        y0Var.getClass();
        x6.b.Z("Expected fieldAndValues to contain an even number of elements", arrayList.size() % 2 == 0, new Object[0]);
        p3 p3Var = new p3(p0.Update);
        o0 a10 = p3Var.a();
        j9.n nVar2 = new j9.n();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z10 = next instanceof String;
            x6.b.Z("Expected argument to be String or FieldPath.", z10 || (next instanceof n), new Object[0]);
            j9.l lVar = z10 ? n.a((String) next).f3690a : ((n) next).f3690a;
            if (next2 instanceof o.c) {
                a10.a(lVar);
            } else {
                d0 c10 = y0Var.c(n9.e.b(next2, e.b.f11356d), a10.b(lVar));
                if (c10 != null) {
                    a10.a(lVar);
                    nVar2.f(lVar, c10);
                }
            }
        }
        return ((Task) this.f3147b.a(new defpackage.e(Collections.singletonList(new k9.l(this.f3146a, nVar2, new k9.d((Set) p3Var.f4568c), k9.m.a(true), Collections.unmodifiableList((ArrayList) p3Var.f4569d))), i10))).continueWith(n9.f.f11361b, n9.o.f11373a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f3146a.equals(cVar.f3146a) && this.f3147b.equals(cVar.f3147b);
    }

    public final int hashCode() {
        return this.f3147b.hashCode() + (this.f3146a.hashCode() * 31);
    }
}
