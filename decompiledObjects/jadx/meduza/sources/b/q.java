package b;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class q extends ec.j implements dc.l<b, rb.h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f1630a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(w wVar) {
        super(1);
        this.f1630a = wVar;
    }

    @Override // dc.l
    public final rb.h invoke(b bVar) {
        p pVar;
        b bVar2 = bVar;
        ec.i.e(bVar2, "backEvent");
        w wVar = this.f1630a;
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
        p pVar2 = pVar;
        wVar.f1640d = pVar2;
        if (pVar2 != null) {
            pVar2.handleOnBackStarted(bVar2);
        }
        return rb.h.f13851a;
    }
}
