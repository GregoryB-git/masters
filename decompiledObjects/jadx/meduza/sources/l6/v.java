package l6;

/* loaded from: classes.dex */
public final class v extends e1 {

    /* renamed from: e, reason: collision with root package name */
    public final r.d f9731e;
    public final d f;

    public v(g gVar, d dVar, j6.e eVar) {
        super(gVar, eVar);
        this.f9731e = new r.d();
        this.f = dVar;
        this.mLifecycleFragment.c("ConnectionlessLifecycleHelper", this);
    }

    @Override // l6.f
    public final void onResume() {
        super.onResume();
        if (this.f9731e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // l6.e1, l6.f
    public final void onStart() {
        super.onStart();
        if (this.f9731e.isEmpty()) {
            return;
        }
        this.f.a(this);
    }

    @Override // l6.e1, l6.f
    public final void onStop() {
        super.onStop();
        d dVar = this.f;
        dVar.getClass();
        synchronized (d.f9643z) {
            if (dVar.f9653s == this) {
                dVar.f9653s = null;
                dVar.t.clear();
            }
        }
    }
}
