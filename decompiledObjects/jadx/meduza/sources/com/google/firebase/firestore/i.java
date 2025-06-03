package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.firestore.e;
import com.google.firebase.firestore.f;
import d9.b0;
import d9.n;
import d9.o0;
import d9.p0;
import d9.v0;
import d9.y0;
import g9.e0;
import g9.f0;
import g9.k;
import g9.l;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import j9.o;
import j9.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import ka.b;
import ka.d0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f3189a;

    /* renamed from: b, reason: collision with root package name */
    public final FirebaseFirestore f3190b;

    public i(f0 f0Var, FirebaseFirestore firebaseFirestore) {
        f0Var.getClass();
        this.f3189a = f0Var;
        firebaseFirestore.getClass();
        this.f3190b = firebaseFirestore;
    }

    public static void i(Object obj, l.a aVar) {
        if (!(obj instanceof List) || ((List) obj).size() == 0) {
            throw new IllegalArgumentException(defpackage.g.f(defpackage.f.l("Invalid Query. A non-empty array is required for '"), aVar.f6023a, "' filters."));
        }
    }

    public final g9.e a(String str, boolean z10, Object[] objArr) {
        d0 e10;
        List<e0> list = this.f3189a.f5945a;
        if (objArr.length > list.size()) {
            throw new IllegalArgumentException(defpackage.g.e("Too many arguments provided to ", str, "(). The number of arguments must be less than or equal to the number of orderBy() clauses."));
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            Object obj = objArr[i10];
            if (!list.get(i10).f5930b.equals(j9.l.f8691b)) {
                e10 = this.f3190b.f3135h.e(obj, false);
            } else {
                if (!(obj instanceof String)) {
                    throw new IllegalArgumentException("Invalid query. Expected a string for document ID in " + str + "(), but got " + obj + ".");
                }
                String str2 = (String) obj;
                if (!(this.f3189a.f5950g != null) && str2.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection and ordering by FieldPath.documentId(), the value passed to " + str + "() must be a plain document ID, but '" + str2 + "' contains a slash.");
                }
                o f = this.f3189a.f.f(o.t(str2));
                if (!j9.i.l(f)) {
                    throw new IllegalArgumentException("Invalid query. When querying a collection group and ordering by FieldPath.documentId(), the value passed to " + str + "() must result in a valid document path, but '" + f + "' is not because it contains an odd number of segments.");
                }
                e10 = s.m(this.f3190b.f3131c, new j9.i(f));
            }
            arrayList.add(e10);
        }
        return new g9.e(arrayList, z10);
    }

    public final Task<k> b(final v0 v0Var) {
        j();
        if (v0Var == v0.CACHE) {
            return ((Task) this.f3190b.a(new d9.s(this, 2))).continueWith(n9.f.f11361b, new defpackage.e(this, 8));
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        k.a aVar = new k.a();
        aVar.f5998a = true;
        aVar.f5999b = true;
        aVar.f6000c = true;
        m.a aVar2 = n9.f.f11361b;
        d9.l lVar = new d9.l() { // from class: d9.n0
            @Override // d9.l
            public final void a(Object obj, com.google.firebase.firestore.f fVar) {
                TaskCompletionSource taskCompletionSource3 = TaskCompletionSource.this;
                TaskCompletionSource taskCompletionSource4 = taskCompletionSource2;
                v0 v0Var2 = v0Var;
                com.google.firebase.firestore.k kVar = (com.google.firebase.firestore.k) obj;
                if (fVar != null) {
                    taskCompletionSource3.setException(fVar);
                    return;
                }
                try {
                    ((b0) Tasks.await(taskCompletionSource4.getTask())).remove();
                    if (kVar.f.f3723b && v0Var2 == v0.SERVER) {
                        taskCompletionSource3.setException(new com.google.firebase.firestore.f("Failed to get documents from server. (However, these documents may exist in the local cache. Run again without setting source to SERVER to retrieve the cached documents.)", f.a.UNAVAILABLE));
                    } else {
                        taskCompletionSource3.setResult(kVar);
                    }
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    x6.b.S("Failed to register a listener for a query result", e10, new Object[0]);
                    throw null;
                } catch (ExecutionException e11) {
                    x6.b.S("Failed to register a listener for a query result", e11, new Object[0]);
                    throw null;
                }
            }
        };
        j();
        taskCompletionSource2.setResult((b0) this.f3190b.a(new p0(this, aVar, new g9.d(aVar2, new o0(0, this, lVar)))));
        return taskCompletionSource.getTask();
    }

    public final i c(long j10) {
        if (j10 > 0) {
            return new i(this.f3189a.f(j10), this.f3190b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limit (" + j10 + ") is invalid. Limit must be positive.");
    }

    public final i d(long j10) {
        if (j10 > 0) {
            f0 f0Var = this.f3189a;
            return new i(new f0(f0Var.f, f0Var.f5950g, f0Var.f5949e, f0Var.f5945a, j10, 2, f0Var.f5953j, f0Var.f5954k), this.f3190b);
        }
        throw new IllegalArgumentException("Invalid Query. Query limitToLast (" + j10 + ") is invalid. Limit must be positive.");
    }

    public final i e(n nVar, int i10) {
        if (nVar == null) {
            throw new NullPointerException("Provided field path must not be null.");
        }
        j9.l lVar = nVar.f3690a;
        defpackage.f.o(i10, "Provided direction must not be null.");
        f0 f0Var = this.f3189a;
        if (f0Var.f5953j != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.startAt() or Query.startAfter() before calling Query.orderBy().");
        }
        if (f0Var.f5954k != null) {
            throw new IllegalArgumentException("Invalid query. You must not call Query.endAt() or Query.endBefore() before calling Query.orderBy().");
        }
        e0 e0Var = new e0(i10 == 1 ? 1 : 2, lVar);
        x6.b.Z("No ordering is allowed for document query", !f0Var.e(), new Object[0]);
        ArrayList arrayList = new ArrayList(f0Var.f5945a);
        arrayList.add(e0Var);
        return new i(new f0(f0Var.f, f0Var.f5950g, f0Var.f5949e, arrayList, f0Var.f5951h, f0Var.f5952i, f0Var.f5953j, f0Var.f5954k), this.f3190b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3189a.equals(iVar.f3189a) && this.f3190b.equals(iVar.f3190b);
    }

    public final g9.m f(e.a aVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = aVar.f3156a.iterator();
        while (it.hasNext()) {
            g9.m h10 = h(it.next());
            if (!h10.b().isEmpty()) {
                arrayList.add(h10);
            }
        }
        return arrayList.size() == 1 ? (g9.m) arrayList.get(0) : new g9.g(arrayList, aVar.f3157b);
    }

    public final d0 g(Object obj) {
        if (!(obj instanceof String)) {
            if (obj instanceof c) {
                return s.m(this.f3190b.f3131c, ((c) obj).f3146a);
            }
            StringBuilder l10 = defpackage.f.l("Invalid query. When querying with FieldPath.documentId() you must provide a valid String or DocumentReference, but it was of type: ");
            l10.append(n9.o.j(obj));
            throw new IllegalArgumentException(l10.toString());
        }
        String str = (String) obj;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Invalid query. When querying with FieldPath.documentId() you must provide a valid document ID, but it was an empty string.");
        }
        if (!(this.f3189a.f5950g != null) && str.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            throw new IllegalArgumentException(defpackage.g.e("Invalid query. When querying a collection by FieldPath.documentId() you must provide a plain document ID, but '", str, "' contains a '/' character."));
        }
        o f = this.f3189a.f.f(o.t(str));
        if (j9.i.l(f)) {
            return s.m(this.f3190b.f3131c, new j9.i(f));
        }
        throw new IllegalArgumentException("Invalid query. When querying a collection group by FieldPath.documentId(), the value provided must result in a valid document path, but '" + f + "' is not because it has an odd number of segments (" + f.q() + ").");
    }

    public final g9.m h(e eVar) {
        d0 e10;
        boolean z10 = eVar instanceof e.b;
        boolean z11 = true;
        x6.b.Z("Parsing is only supported for Filter.UnaryFilter and Filter.CompositeFilter.", z10 || (eVar instanceof e.a), new Object[0]);
        if (!z10) {
            return f((e.a) eVar);
        }
        e.b bVar = (e.b) eVar;
        l.a aVar = l.a.ARRAY_CONTAINS_ANY;
        l.a aVar2 = l.a.IN;
        l.a aVar3 = l.a.NOT_IN;
        n nVar = bVar.f3158a;
        l.a aVar4 = bVar.f3159b;
        Object obj = bVar.f3160c;
        x6.b.B(nVar, "Provided field path must not be null.");
        x6.b.B(aVar4, "Provided op must not be null.");
        if (!nVar.f3690a.u()) {
            if (aVar4 == aVar2 || aVar4 == aVar3 || aVar4 == aVar) {
                i(obj, aVar4);
            }
            y0 y0Var = this.f3190b.f3135h;
            if (aVar4 != aVar2 && aVar4 != aVar3) {
                z11 = false;
            }
            e10 = y0Var.e(obj, z11);
        } else {
            if (aVar4 == l.a.ARRAY_CONTAINS || aVar4 == aVar) {
                throw new IllegalArgumentException(defpackage.g.f(defpackage.f.l("Invalid query. You can't perform '"), aVar4.f6023a, "' queries on FieldPath.documentId()."));
            }
            if (aVar4 == aVar2 || aVar4 == aVar3) {
                i(obj, aVar4);
                b.a M = ka.b.M();
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    d0 g10 = g(it.next());
                    M.m();
                    ka.b.G((ka.b) M.f11120b, g10);
                }
                d0.a d02 = d0.d0();
                d02.p(M);
                e10 = d02.k();
            } else {
                e10 = g(obj);
            }
        }
        return g9.l.e(nVar.f3690a, aVar4, e10);
    }

    public final int hashCode() {
        return this.f3190b.hashCode() + (this.f3189a.hashCode() * 31);
    }

    public final void j() {
        if (q0.g.b(this.f3189a.f5952i, 2) && this.f3189a.f5945a.isEmpty()) {
            throw new IllegalStateException("limitToLast() queries require specifying at least one orderBy() clause");
        }
    }

    public final i k(e eVar) {
        l.a aVar;
        g9.m h10 = h(eVar);
        if (h10.b().isEmpty()) {
            return this;
        }
        f0 f0Var = this.f3189a;
        for (g9.l lVar : h10.c()) {
            l.a aVar2 = lVar.f6011a;
            List<g9.m> list = f0Var.f5949e;
            l.a aVar3 = l.a.NOT_EQUAL;
            l.a aVar4 = l.a.NOT_IN;
            int ordinal = aVar2.ordinal();
            List asList = ordinal != 3 ? (ordinal == 7 || ordinal == 8) ? Arrays.asList(aVar4) : ordinal != 9 ? new ArrayList() : Arrays.asList(l.a.ARRAY_CONTAINS_ANY, l.a.IN, aVar4, aVar3) : Arrays.asList(aVar3, aVar4);
            Iterator<g9.m> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                for (g9.l lVar2 : it.next().c()) {
                    if (asList.contains(lVar2.f6011a)) {
                        aVar = lVar2.f6011a;
                        break;
                    }
                }
            }
            if (aVar != null) {
                if (aVar == aVar2) {
                    throw new IllegalArgumentException(defpackage.g.f(defpackage.f.l("Invalid Query. You cannot use more than one '"), aVar2.f6023a, "' filter."));
                }
                StringBuilder l10 = defpackage.f.l("Invalid Query. You cannot use '");
                l10.append(aVar2.f6023a);
                l10.append("' filters with '");
                throw new IllegalArgumentException(defpackage.g.f(l10, aVar.f6023a, "' filters."));
            }
            f0Var = f0Var.b(lVar);
        }
        return new i(this.f3189a.b(h10), this.f3190b);
    }
}
