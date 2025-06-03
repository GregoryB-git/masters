package t3;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r4.InterfaceC1922b;
import w3.InterfaceC2100a;

/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1991c {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1922b f19586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19587b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f19588c = null;

    public C1991c(Context context, InterfaceC1922b interfaceC1922b, String str) {
        this.f19586a = interfaceC1922b;
        this.f19587b = str;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C1990b.b((Map) it.next()));
        }
        return arrayList;
    }

    public final void a(InterfaceC2100a.c cVar) {
        ((InterfaceC2100a) this.f19586a.get()).b(cVar);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i7 = i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1990b c1990b = (C1990b) it.next();
            while (arrayDeque.size() >= i7) {
                k(((InterfaceC2100a.c) arrayDeque.pollFirst()).f20379b);
            }
            InterfaceC2100a.c f7 = c1990b.f(this.f19587b);
            a(f7);
            arrayDeque.offer(f7);
        }
    }

    public final boolean d(List list, C1990b c1990b) {
        String c7 = c1990b.c();
        String e7 = c1990b.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1990b c1990b2 = (C1990b) it.next();
            if (c1990b2.c().equals(c7) && c1990b2.e().equals(e7)) {
                return true;
            }
        }
        return false;
    }

    public List e() {
        o();
        List f7 = f();
        ArrayList arrayList = new ArrayList();
        Iterator it = f7.iterator();
        while (it.hasNext()) {
            arrayList.add(C1990b.a((InterfaceC2100a.c) it.next()));
        }
        return arrayList;
    }

    public final List f() {
        return ((InterfaceC2100a) this.f19586a.get()).c(this.f19587b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1990b c1990b = (C1990b) it.next();
            if (!d(list2, c1990b)) {
                arrayList.add(c1990b);
            }
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1990b c1990b = (C1990b) it.next();
            if (!d(list2, c1990b)) {
                arrayList.add(c1990b.f(this.f19587b));
            }
        }
        return arrayList;
    }

    public final int i() {
        if (this.f19588c == null) {
            this.f19588c = Integer.valueOf(((InterfaceC2100a) this.f19586a.get()).f(this.f19587b));
        }
        return this.f19588c.intValue();
    }

    public void j() {
        o();
        l(f());
    }

    public final void k(String str) {
        ((InterfaceC2100a) this.f19586a.get()).clearConditionalUserProperty(str, null, null);
    }

    public final void l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            k(((InterfaceC2100a.c) it.next()).f20379b);
        }
    }

    public void m(List list) {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }

    public final void n(List list) {
        if (list.isEmpty()) {
            j();
            return;
        }
        List e7 = e();
        l(h(e7, list));
        b(g(list, e7));
    }

    public final void o() {
        if (this.f19586a.get() == null) {
            throw new C1989a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
