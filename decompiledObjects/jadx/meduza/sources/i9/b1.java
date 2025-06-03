package i9;

import android.database.Cursor;
import i9.y0;
import j9.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b1 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7647a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7648b;

    /* renamed from: c, reason: collision with root package name */
    public f f7649c;

    public b1(y0 y0Var, i iVar) {
        this.f7647a = y0Var;
        this.f7648b = iVar;
    }

    @Override // i9.g0
    public final HashMap a(Iterable iterable) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            arrayList.add(p2.m0.A(iVar.f8684a));
            hashMap.put(iVar, j9.m.m(iVar));
        }
        y0.b bVar = new y0.b(this.f7647a, arrayList);
        n9.c cVar = new n9.c();
        while (bVar.f.hasNext()) {
            bVar.a().d(new k0(this, cVar, hashMap, 2));
        }
        cVar.a();
        return hashMap;
    }

    @Override // i9.g0
    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        t8.c<j9.i, j9.g> cVar = j9.h.f8681a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j9.i iVar = (j9.i) it.next();
            arrayList2.add(p2.m0.A(iVar.f8684a));
            cVar = cVar.n(iVar, j9.m.n(iVar, j9.q.f8701b));
        }
        y0 y0Var = this.f7647a;
        List emptyList = Collections.emptyList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList3 = new ArrayList(emptyList);
            for (int i10 = 0; it2.hasNext() && i10 < 900 - emptyList.size(); i10++) {
                arrayList3.add(it2.next());
            }
            Object[] array = arrayList3.toArray();
            StringBuilder l10 = defpackage.f.l("DELETE FROM remote_documents WHERE path IN (");
            l10.append((Object) n9.o.h("?", array.length, ", "));
            l10.append(")");
            y0Var.G(l10.toString(), array);
        }
        this.f7649c.h(cVar);
    }

    @Override // i9.g0
    public final Map<j9.i, j9.m> c(String str, k.a aVar, int i10) {
        List<j9.o> f = this.f7649c.f(str);
        ArrayList arrayList = new ArrayList(f.size());
        Iterator<j9.o> it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g(str));
        }
        if (arrayList.isEmpty()) {
            return Collections.emptyMap();
        }
        if (arrayList.size() * 9 < 900) {
            return h(arrayList, aVar, i10, null, null);
        }
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            int i12 = i11 + 100;
            hashMap.putAll(h(arrayList.subList(i11, Math.min(arrayList.size(), i12)), aVar, i10, null, null));
            i11 = i12;
        }
        final q5.i iVar = k.a.f8690b;
        r3.j jVar = n9.o.f11373a;
        if (hashMap.size() > i10) {
            ArrayList arrayList2 = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList2, new Comparator() { // from class: n9.n
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return iVar.compare(((Map.Entry) obj).getValue(), ((Map.Entry) obj2).getValue());
                }
            });
            hashMap = new HashMap();
            for (int i13 = 0; i13 < i10; i13++) {
                hashMap.put(((Map.Entry) arrayList2.get(i13)).getKey(), ((Map.Entry) arrayList2.get(i13)).getValue());
            }
        }
        return hashMap;
    }

    @Override // i9.g0
    public final void d(j9.m mVar, j9.q qVar) {
        x6.b.Z("Cannot add document to the RemoteDocumentCache with a read time of zero", !qVar.equals(j9.q.f8701b), new Object[0]);
        j9.i iVar = mVar.f8693b;
        u7.m mVar2 = qVar.f8702a;
        this.f7647a.G("INSERT OR REPLACE INTO remote_documents (path, path_length, read_time_seconds, read_time_nanos, contents) VALUES (?, ?, ?, ?, ?)", p2.m0.A(iVar.f8684a), Integer.valueOf(iVar.f8684a.q()), Long.valueOf(mVar2.f15102a), Integer.valueOf(mVar2.f15103b), this.f7648b.e(mVar).j());
        this.f7649c.j(mVar.f8693b.i());
    }

    @Override // i9.g0
    public final void e(f fVar) {
        this.f7649c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [i9.z0] */
    @Override // i9.g0
    public final HashMap f(final g9.f0 f0Var, k.a aVar, final Set set, a.a aVar2) {
        return h(Collections.singletonList(f0Var.f), aVar, Integer.MAX_VALUE, new n9.i() { // from class: i9.z0
            @Override // n9.i
            public final Object apply(Object obj) {
                j9.m mVar = (j9.m) obj;
                return Boolean.valueOf(g9.f0.this.g(mVar) || set.contains(mVar.f8693b));
            }
        }, aVar2);
    }

    @Override // i9.g0
    public final j9.m g(j9.i iVar) {
        return (j9.m) a(Collections.singletonList(iVar)).get(iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final HashMap h(List list, k.a aVar, int i10, z0 z0Var, a.a aVar2) {
        u7.m mVar = aVar.l().f8702a;
        j9.i h10 = aVar.h();
        StringBuilder h11 = n9.o.h("SELECT contents, read_time_seconds, read_time_nanos, path FROM remote_documents WHERE path >= ? AND path < ? AND path_length = ? AND (read_time_seconds > ? OR ( read_time_seconds = ? AND read_time_nanos > ?) OR ( read_time_seconds = ? AND read_time_nanos = ? and path > ?)) ", list.size(), " UNION ");
        h11.append("ORDER BY read_time_seconds, read_time_nanos, path LIMIT ?");
        char c10 = 1;
        Object[] objArr = new Object[(list.size() * 9) + 1];
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            j9.o oVar = (j9.o) it.next();
            String A = p2.m0.A(oVar);
            int i13 = i12 + 1;
            objArr[i12] = A;
            int i14 = i13 + 1;
            StringBuilder sb2 = new StringBuilder(A);
            int length = sb2.length() - c10;
            char charAt = sb2.charAt(length);
            x6.b.Z("successor may only operate on paths generated by encode", charAt == c10 ? c10 : i11, new Object[i11]);
            sb2.setCharAt(length, (char) (charAt + 1));
            objArr[i13] = sb2.toString();
            int i15 = i14 + 1;
            objArr[i14] = Integer.valueOf(oVar.q() + 1);
            int i16 = i15 + 1;
            objArr[i15] = Long.valueOf(mVar.f15102a);
            int i17 = i16 + 1;
            objArr[i16] = Long.valueOf(mVar.f15102a);
            int i18 = i17 + 1;
            objArr[i17] = Integer.valueOf(mVar.f15103b);
            int i19 = i18 + 1;
            objArr[i18] = Long.valueOf(mVar.f15102a);
            int i20 = i19 + 1;
            objArr[i19] = Integer.valueOf(mVar.f15103b);
            i12 = i20 + 1;
            objArr[i20] = p2.m0.A(h10.f8684a);
            c10 = 1;
            i11 = 0;
        }
        objArr[i12] = Integer.valueOf(i10);
        n9.c cVar = new n9.c();
        HashMap hashMap = new HashMap();
        y0.d H = this.f7647a.H(h11.toString());
        H.a(objArr);
        Cursor e10 = H.e();
        while (e10.moveToNext()) {
            try {
                i(cVar, hashMap, e10, z0Var);
                if (aVar2 != null) {
                    aVar2.f1a++;
                }
            } finally {
            }
        }
        e10.close();
        cVar.a();
        return hashMap;
    }

    public final void i(n9.c cVar, final Map<j9.i, j9.m> map, Cursor cursor, final n9.i<j9.m, Boolean> iVar) {
        final byte[] blob = cursor.getBlob(0);
        final int i10 = cursor.getInt(1);
        final int i11 = cursor.getInt(2);
        Executor executor = cVar;
        if (cursor.isLast()) {
            executor = n9.f.f11361b;
        }
        executor.execute(new Runnable() { // from class: i9.a1
            @Override // java.lang.Runnable
            public final void run() {
                b1 b1Var = b1.this;
                byte[] bArr = blob;
                int i12 = i10;
                int i13 = i11;
                n9.i iVar2 = iVar;
                Map map2 = map;
                b1Var.getClass();
                try {
                    j9.m b10 = b1Var.f7648b.b(l9.a.Q(bArr));
                    b10.f8696e = new j9.q(new u7.m(i13, i12));
                    if (iVar2 == null || ((Boolean) iVar2.apply(b10)).booleanValue()) {
                        synchronized (map2) {
                            map2.put(b10.f8693b, b10);
                        }
                    }
                } catch (ma.b0 e10) {
                    x6.b.T("MaybeDocument failed to parse: %s", e10);
                    throw null;
                }
            }
        });
    }
}
