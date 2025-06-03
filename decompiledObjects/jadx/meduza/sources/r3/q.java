package r3;

import android.database.sqlite.SQLiteDatabase;
import i9.c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.d0;
import n3.a;
import r3.t;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements t.a, n9.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13576b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13577c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13578d;

    public /* synthetic */ q(i9.n nVar, HashSet hashSet, List list, u7.m mVar) {
        this.f13575a = nVar;
        this.f13576b = hashSet;
        this.f13577c = list;
        this.f13578d = mVar;
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        t tVar = (t) this.f13575a;
        String str = (String) this.f13576b;
        Map map = (Map) this.f13577c;
        a.C0169a c0169a = (a.C0169a) this.f13578d;
        tVar.getClass();
        return (n3.a) t.k0(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new r(tVar, map, c0169a, 1));
    }

    @Override // n9.l
    public final Object get() {
        i9.n nVar = (i9.n) this.f13575a;
        Set set = (Set) this.f13576b;
        List list = (List) this.f13577c;
        u7.m mVar = (u7.m) this.f13578d;
        HashMap a10 = nVar.f7747e.a(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : a10.entrySet()) {
            if (!(true ^ q0.g.b(((j9.m) entry.getValue()).f8694c, 1))) {
                hashSet.add((j9.i) entry.getKey());
            }
        }
        i9.h hVar = nVar.f;
        hVar.getClass();
        HashMap hashMap = new HashMap();
        hVar.f(hashMap, a10.keySet());
        HashMap a11 = hVar.a(a10, hashMap, new HashSet());
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            j9.n nVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            k9.f fVar = (k9.f) it.next();
            j9.g gVar = ((c0) a11.get(fVar.f9150a)).f7654a;
            for (k9.e eVar : fVar.f9152c) {
                d0 c10 = eVar.f9149b.c(gVar.g(eVar.f9148a));
                if (c10 != null) {
                    if (nVar2 == null) {
                        nVar2 = new j9.n();
                    }
                    nVar2.f(eVar.f9148a, c10);
                }
            }
            if (nVar2 != null) {
                arrayList.add(new k9.l(fVar.f9150a, nVar2, j9.n.c(nVar2.b().Y()), k9.m.a(true)));
            }
        }
        k9.g d10 = nVar.f7745c.d(mVar, arrayList, list);
        d10.getClass();
        HashMap hashMap2 = new HashMap();
        Iterator it2 = d10.b().iterator();
        while (it2.hasNext()) {
            j9.i iVar = (j9.i) it2.next();
            j9.m mVar2 = (j9.m) ((c0) a11.get(iVar)).f7654a;
            k9.d a12 = d10.a(mVar2, ((c0) a11.get(iVar)).f7655b);
            if (hashSet.contains(iVar)) {
                a12 = null;
            }
            k9.f c11 = k9.f.c(mVar2, a12);
            if (c11 != null) {
                hashMap2.put(iVar, c11);
            }
            if (!(!q0.g.b(mVar2.f8694c, 1))) {
                mVar2.l(j9.q.f8701b);
            }
        }
        nVar.f7746d.a(d10.f9153a, hashMap2);
        return i9.g.a(d10.f9153a, a11);
    }
}
