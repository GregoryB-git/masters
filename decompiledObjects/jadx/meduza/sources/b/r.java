package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class r extends ec.j implements dc.l<b, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1631a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w wVar) {
        super(1);
        this.f1631a = wVar;
    }

    @Override // dc.l
    public final rb.h invoke(b bVar) {
        p pVar;
        b bVar2 = bVar;
        ec.i.e(bVar2, "backEvent");
        w wVar = this.f1631a;
        p pVar2 = wVar.f1640d;
        if (pVar2 == null) {
            sb.i<p> iVar = wVar.f1639c;
            ListIterator<p> listIterator = iVar.listIterator(iVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    pVar = null;
                    break;
                }
                pVar = listIterator.previous();
                if (pVar.isEnabled()) {
                    break;
                }
            }
            pVar2 = pVar;
        }
        if (pVar2 != null) {
            pVar2.handleOnBackProgressed(bVar2);
        }
        return rb.h.f13851a;
    }
}
