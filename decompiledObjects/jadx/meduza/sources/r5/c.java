package r5;

import j9.k;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o7.k0;
import o7.n;
import r5.f;
import t5.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13635a;

    public /* synthetic */ c(int i10) {
        this.f13635a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13635a) {
            case 0:
                k0<Integer> k0Var = f.f13640j;
                return 0;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                return n.a.f(new q5.i(1).compare((f.i) Collections.max(list, new b0.d(4)), (f.i) Collections.max(list2, new c(2)))).a(list.size(), list2.size()).b((f.i) Collections.max(list, new v4.d(5)), (f.i) Collections.max(list2, new b0.d(5)), new c(3)).e();
            case 2:
                return f.i.h((f.i) obj, (f.i) obj2);
            case 3:
                return f.i.i((f.i) obj, (f.i) obj2);
            case 4:
                return Float.compare(((i0.a) obj).f14522c, ((i0.a) obj2).f14522c);
            case 5:
                Charset charset = p8.c.f13031e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 6:
                i9.c cVar = (i9.c) obj;
                i9.c cVar2 = (i9.c) obj2;
                int d10 = n9.o.d(cVar.f7653b, cVar2.f7653b);
                return d10 != 0 ? d10 : cVar.f7652a.compareTo(cVar2.f7652a);
            default:
                j9.k kVar = (j9.k) obj;
                j9.k kVar2 = (j9.k) obj2;
                j9.c cVar3 = j9.k.f8687a;
                int compareTo = kVar.b().compareTo(kVar2.b());
                if (compareTo != 0) {
                    return compareTo;
                }
                Iterator<k.c> it = kVar.f().iterator();
                Iterator<k.c> it2 = kVar2.f().iterator();
                while (it.hasNext() && it2.hasNext()) {
                    k.c next = it.next();
                    k.c next2 = it2.next();
                    int compareTo2 = next.f().compareTo(next2.f());
                    int a10 = compareTo2 != 0 ? compareTo2 : q0.g.a(next.g(), next2.g());
                    if (a10 != 0) {
                        return a10;
                    }
                }
                return Boolean.compare(it.hasNext(), it2.hasNext());
        }
    }
}
