package j9;

import g9.e0;
import g9.k0;
import g9.l;
import j9.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f8703a;

    /* renamed from: b, reason: collision with root package name */
    public final TreeSet f8704b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f8705c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e0> f8706d;

    public r(k0 k0Var) {
        String str = k0Var.f6008e;
        this.f8703a = str == null ? k0Var.f6007d.m() : str;
        this.f8706d = k0Var.f6005b;
        this.f8704b = new TreeSet(new v4.d(9));
        this.f8705c = new ArrayList();
        Iterator<g9.m> it = k0Var.f6006c.iterator();
        while (it.hasNext()) {
            g9.l lVar = (g9.l) it.next();
            if (lVar.f()) {
                this.f8704b.add(lVar);
            } else {
                this.f8705c.add(lVar);
            }
        }
    }

    public static boolean b(g9.l lVar, k.c cVar) {
        if (lVar == null || !lVar.f6013c.equals(cVar.f())) {
            return false;
        }
        return q0.g.b(cVar.g(), 3) == (lVar.f6011a.equals(l.a.ARRAY_CONTAINS) || lVar.f6011a.equals(l.a.ARRAY_CONTAINS_ANY));
    }

    public static boolean c(e0 e0Var, k.c cVar) {
        if (e0Var.f5930b.equals(cVar.f())) {
            return (q0.g.b(cVar.g(), 1) && q0.g.b(e0Var.f5929a, 1)) || (q0.g.b(cVar.g(), 2) && q0.g.b(e0Var.f5929a, 2));
        }
        return false;
    }

    public final boolean a(k.c cVar) {
        Iterator it = this.f8705c.iterator();
        while (it.hasNext()) {
            if (b((g9.l) it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }
}
