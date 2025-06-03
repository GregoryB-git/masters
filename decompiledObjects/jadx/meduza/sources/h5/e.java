package h5;

/* loaded from: classes.dex */
public final class e extends l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f7136e;

    public e(f fVar) {
        this.f7136e = fVar;
    }

    @Override // z3.h
    public final void o() {
        f fVar = this.f7136e;
        synchronized (fVar.f17544b) {
            boolean z10 = false;
            this.f17508a = 0;
            this.f7139c = null;
            O[] oArr = fVar.f;
            int i10 = fVar.f17549h;
            fVar.f17549h = i10 + 1;
            oArr[i10] = this;
            if (!fVar.f17545c.isEmpty() && fVar.f17549h > 0) {
                z10 = true;
            }
            if (z10) {
                fVar.f17544b.notify();
            }
        }
    }
}
