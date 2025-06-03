package x0;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f0 implements m3.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16608a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16609b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16610c;

    /* renamed from: d, reason: collision with root package name */
    public Object f16611d;

    public /* synthetic */ f0() {
        this.f16608a = new ArrayList();
        this.f16609b = new HashMap();
        this.f16610c = new HashMap();
    }

    public /* synthetic */ f0(qb.a aVar, qb.a aVar2, p3.f fVar, qb.a aVar3) {
        this.f16608a = aVar;
        this.f16609b = aVar2;
        this.f16610c = fVar;
        this.f16611d = aVar3;
    }

    public final void a(i iVar) {
        if (((ArrayList) this.f16608a).contains(iVar)) {
            throw new IllegalStateException("Fragment already added: " + iVar);
        }
        synchronized (((ArrayList) this.f16608a)) {
            ((ArrayList) this.f16608a).add(iVar);
        }
        iVar.mAdded = true;
    }

    public final void b() {
        ((HashMap) this.f16609b).values().removeAll(Collections.singleton(null));
    }

    public final i c(String str) {
        e0 e0Var = (e0) ((HashMap) this.f16609b).get(str);
        if (e0Var != null) {
            return e0Var.f16601c;
        }
        return null;
    }

    public final i d(String str) {
        i findFragmentByWho;
        for (e0 e0Var : ((HashMap) this.f16609b).values()) {
            if (e0Var != null && (findFragmentByWho = e0Var.f16601c.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.f16609b).values()) {
            if (e0Var != null) {
                arrayList.add(e0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (e0 e0Var : ((HashMap) this.f16609b).values()) {
            arrayList.add(e0Var != null ? e0Var.f16601c : null);
        }
        return arrayList;
    }

    public final List g() {
        ArrayList arrayList;
        if (((ArrayList) this.f16608a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f16608a)) {
            arrayList = new ArrayList((ArrayList) this.f16608a);
        }
        return arrayList;
    }

    @Override // qb.a
    public final Object get() {
        return new q3.m((Executor) ((qb.a) this.f16608a).get(), (r3.d) ((qb.a) this.f16609b).get(), (q3.n) ((qb.a) this.f16610c).get(), (s3.b) ((qb.a) this.f16611d).get());
    }

    public final void h(e0 e0Var) {
        i iVar = e0Var.f16601c;
        if (((HashMap) this.f16609b).get(iVar.mWho) != null) {
            return;
        }
        ((HashMap) this.f16609b).put(iVar.mWho, e0Var);
        if (iVar.mRetainInstanceChangedWhileDetached) {
            if (iVar.mRetainInstance) {
                ((b0) this.f16611d).c(iVar);
            } else {
                ((b0) this.f16611d).g(iVar);
            }
            iVar.mRetainInstanceChangedWhileDetached = false;
        }
        if (y.L(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + iVar);
        }
    }

    public final void i(e0 e0Var) {
        i iVar = e0Var.f16601c;
        if (iVar.mRetainInstance) {
            ((b0) this.f16611d).g(iVar);
        }
        if (((HashMap) this.f16609b).get(iVar.mWho) == e0Var && ((e0) ((HashMap) this.f16609b).put(iVar.mWho, null)) != null && y.L(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + iVar);
        }
    }

    public final Bundle j(Bundle bundle, String str) {
        return (Bundle) (bundle != null ? ((HashMap) this.f16610c).put(str, bundle) : ((HashMap) this.f16610c).remove(str));
    }
}
