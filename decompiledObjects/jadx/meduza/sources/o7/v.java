package o7;

import o7.b0;

/* loaded from: classes.dex */
public final class v extends x0<Object> {

    /* renamed from: a, reason: collision with root package name */
    public x0 f12066a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f12067b;

    public v(w wVar) {
        u<K, ? extends r<V>> uVar = wVar.f12069d;
        r rVar = uVar.f12059c;
        if (rVar == null) {
            rVar = uVar.e();
            uVar.f12059c = rVar;
        }
        this.f12066a = rVar.iterator();
        this.f12067b = b0.a.f11940e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12067b.hasNext() || this.f12066a.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f12067b.hasNext()) {
            this.f12067b = ((r) this.f12066a.next()).iterator();
        }
        return this.f12067b.next();
    }
}
