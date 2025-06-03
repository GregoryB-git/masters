package d9;

import com.google.firebase.firestore.FirebaseFirestore;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f3641a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<k9.f> f3642b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f3643c = false;

    public a1(FirebaseFirestore firebaseFirestore) {
        this.f3641a = firebaseFirestore;
    }

    public final void a(com.google.firebase.firestore.c cVar, Map map, t0 t0Var) {
        this.f3641a.j(cVar);
        if (t0Var == null) {
            throw new NullPointerException("Provided options must not be null.");
        }
        b();
        this.f3642b.add((t0Var.f3719a ? this.f3641a.f3135h.d(map, t0Var.f3720b) : this.f3641a.f3135h.f(map)).r(cVar.f3146a, k9.m.f9167c));
    }

    public final void b() {
        if (this.f3643c) {
            throw new IllegalStateException("A write batch can no longer be used after commit() has been called.");
        }
    }
}
