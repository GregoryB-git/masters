package ca;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final String f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final c f2553b;

    public b(Set<d> set, c cVar) {
        this.f2552a = b(set);
        this.f2553b = cVar;
    }

    public static String b(Set<d> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<d> it = set.iterator();
        while (it.hasNext()) {
            d next = it.next();
            sb2.append(next.a());
            sb2.append('/');
            sb2.append(next.b());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ca.f
    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        c cVar = this.f2553b;
        synchronized (cVar.f2555a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f2555a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f2552a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2552a);
        sb2.append(' ');
        c cVar2 = this.f2553b;
        synchronized (cVar2.f2555a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar2.f2555a);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
