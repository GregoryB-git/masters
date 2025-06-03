package c8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class l extends b8.v {

    /* renamed from: a, reason: collision with root package name */
    public final i f2477a;

    public l(i iVar) {
        m6.j.i(iVar);
        this.f2477a = iVar;
    }

    @Override // b8.v
    public final Task<Void> a(b8.w wVar, String str) {
        m6.j.i(wVar);
        i iVar = this.f2477a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVar.K());
        firebaseAuth.getClass();
        return wVar instanceof b8.g0 ? firebaseAuth.f3061e.zza(firebaseAuth.f3057a, (b8.g0) wVar, iVar, str, firebaseAuth.new d()) : wVar instanceof b8.k0 ? firebaseAuth.f3061e.zza(firebaseAuth.f3057a, (b8.k0) wVar, iVar, str, firebaseAuth.f3066k, firebaseAuth.new d()) : Tasks.forException(zzadr.zza(new Status(17499, null, null, null)));
    }

    @Override // b8.v
    public final ArrayList b() {
        e0 e0Var = this.f2477a.t;
        if (e0Var == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<b8.h0> it = e0Var.f2438a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        Iterator<b8.l0> it2 = e0Var.f2439b.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // b8.v
    public final Task<b8.z> c() {
        i iVar = this.f2477a;
        return FirebaseAuth.getInstance(iVar.K()).j(iVar, false).continueWithTask(new g.s(this, 4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [c8.s0, com.google.firebase.auth.FirebaseAuth$c] */
    @Override // b8.v
    public final Task<Void> d(String str) {
        m6.j.e(str);
        i iVar = this.f2477a;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(iVar.K());
        firebaseAuth.getClass();
        m6.j.e(str);
        return firebaseAuth.f3061e.zza(firebaseAuth.f3057a, iVar, str, firebaseAuth.f3066k, (s0) firebaseAuth.new c()).continueWithTask(new b.a0(0));
    }
}
