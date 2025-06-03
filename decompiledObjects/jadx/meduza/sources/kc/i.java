package kc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sb.s;

/* loaded from: classes.dex */
public class i extends g {
    public static final <T> List<T> N(b<? extends T> bVar) {
        ec.i.e(bVar, "<this>");
        Iterator<? extends T> it = bVar.iterator();
        if (!it.hasNext()) {
            return s.f14324a;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return va.a.f(next);
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            arrayList.add(next);
            if (!it.hasNext()) {
                return arrayList;
            }
            next = it.next();
        }
    }
}
