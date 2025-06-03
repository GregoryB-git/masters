package qc;

/* loaded from: classes.dex */
public class c<T> extends rc.f<T> {

    /* renamed from: d, reason: collision with root package name */
    public final dc.p<pc.q<? super T>, ub.e<? super rb.h>, Object> f13394d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(dc.p<? super pc.q<? super T>, ? super ub.e<? super rb.h>, ? extends Object> pVar, ub.h hVar, int i10, pc.a aVar) {
        super(hVar, i10, aVar);
        this.f13394d = pVar;
    }

    @Override // rc.f
    public final String toString() {
        StringBuilder l10 = defpackage.f.l("block[");
        l10.append(this.f13394d);
        l10.append("] -> ");
        l10.append(super.toString());
        return l10.toString();
    }
}
