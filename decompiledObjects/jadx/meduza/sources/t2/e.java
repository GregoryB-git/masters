package t2;

import dc.l;
import ec.i;
import ec.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.q;
import v2.n;
import x2.s;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List<u2.d<?>> f14418a;

    public static final class a extends j implements l<u2.d<?>, CharSequence> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14419a = new a();

        public a() {
            super(1);
        }

        @Override // dc.l
        public final CharSequence invoke(u2.d<?> dVar) {
            u2.d<?> dVar2 = dVar;
            i.e(dVar2, "it");
            return dVar2.getClass().getSimpleName();
        }
    }

    public e(n nVar) {
        i.e(nVar, "trackers");
        this.f14418a = va.a.g(new u2.a(nVar.f15227a), new u2.b(nVar.f15228b), new u2.i(nVar.f15230d), new u2.e(nVar.f15229c), new u2.h(nVar.f15229c), new u2.g(nVar.f15229c), new u2.f(nVar.f15229c));
    }

    public final boolean a(s sVar) {
        List<u2.d<?>> list = this.f14418a;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            u2.d dVar = (u2.d) next;
            dVar.getClass();
            if (dVar.b(sVar) && dVar.c(dVar.f14927a.a())) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            o2.j d10 = o2.j.d();
            String str = h.f14431a;
            StringBuilder l10 = defpackage.f.l("Work ");
            l10.append(sVar.f16830a);
            l10.append(" constrained by ");
            l10.append(q.p(arrayList, null, null, null, a.f14419a, 31));
            d10.a(str, l10.toString());
        }
        return arrayList.isEmpty();
    }
}
