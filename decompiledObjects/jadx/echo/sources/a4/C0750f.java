package a4;

import V3.AbstractC0669h;
import Y3.m;
import a4.InterfaceC0749e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: a4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0750f {

    /* renamed from: a, reason: collision with root package name */
    public final i f8100a;

    /* renamed from: b, reason: collision with root package name */
    public final d4.h f8101b;

    /* renamed from: a4.f$a */
    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C0747c c0747c, C0747c c0747c2) {
            m.f((c0747c.i() == null || c0747c2.i() == null) ? false : true);
            return C0750f.this.f8101b.compare(new d4.m(c0747c.i(), c0747c.k().k()), new d4.m(c0747c2.i(), c0747c2.k().k()));
        }
    }

    public C0750f(i iVar) {
        this.f8100a = iVar;
        this.f8101b = iVar.c();
    }

    public final Comparator b() {
        return new a();
    }

    public final C0748d c(C0747c c0747c, AbstractC0669h abstractC0669h, d4.i iVar) {
        if (!c0747c.j().equals(InterfaceC0749e.a.VALUE) && !c0747c.j().equals(InterfaceC0749e.a.CHILD_REMOVED)) {
            c0747c = c0747c.a(iVar.q(c0747c.i(), c0747c.k().k(), this.f8101b));
        }
        return abstractC0669h.b(c0747c, this.f8100a);
    }

    public List d(List list, d4.i iVar, List list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0747c c0747c = (C0747c) it.next();
            if (c0747c.j().equals(InterfaceC0749e.a.CHILD_CHANGED) && this.f8101b.d(c0747c.l().k(), c0747c.k().k())) {
                arrayList2.add(C0747c.f(c0747c.i(), c0747c.k()));
            }
        }
        e(arrayList, InterfaceC0749e.a.CHILD_REMOVED, list, list2, iVar);
        e(arrayList, InterfaceC0749e.a.CHILD_ADDED, list, list2, iVar);
        e(arrayList, InterfaceC0749e.a.CHILD_MOVED, arrayList2, list2, iVar);
        e(arrayList, InterfaceC0749e.a.CHILD_CHANGED, list, list2, iVar);
        e(arrayList, InterfaceC0749e.a.VALUE, list, list2, iVar);
        return arrayList;
    }

    public final void e(List list, InterfaceC0749e.a aVar, List list2, List list3, d4.i iVar) {
        ArrayList<C0747c> arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C0747c c0747c = (C0747c) it.next();
            if (c0747c.j().equals(aVar)) {
                arrayList.add(c0747c);
            }
        }
        Collections.sort(arrayList, b());
        for (C0747c c0747c2 : arrayList) {
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                AbstractC0669h abstractC0669h = (AbstractC0669h) it2.next();
                if (abstractC0669h.i(aVar)) {
                    list.add(c(c0747c2, abstractC0669h, iVar));
                }
            }
        }
    }
}
