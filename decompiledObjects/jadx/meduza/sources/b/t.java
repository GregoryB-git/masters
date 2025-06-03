package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class t extends ec.j implements dc.a<rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1633a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar) {
        super(0);
        this.f1633a = wVar;
    }

    @Override // dc.a
    public final rb.h invoke() {
        p pVar;
        w wVar = this.f1633a;
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
        wVar.f1640d = null;
        if (pVar2 != null) {
            pVar2.handleOnBackCancelled();
        }
        return rb.h.f13851a;
    }
}
