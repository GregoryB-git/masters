package i9;

import android.text.TextUtils;
import android.util.Pair;
import g9.l;
import i9.s;
import i9.y0;
import ia.a;
import j9.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class t0 implements f {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f7797k = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final y0 f7798a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7799b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7800c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7801d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final s.a f7802e = new s.a();
    public final HashMap f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final PriorityQueue f7803g = new PriorityQueue(10, new b0.d(10));

    /* renamed from: h, reason: collision with root package name */
    public boolean f7804h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f7805i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f7806j = -1;

    public t0(y0 y0Var, i iVar, e9.e eVar) {
        this.f7798a = y0Var;
        this.f7799b = iVar;
        String str = eVar.f4854a;
        this.f7800c = str != null ? str : "";
    }

    public static Object[] o(j9.k kVar, g9.k0 k0Var, Collection collection) {
        boolean z10;
        Iterator it;
        Iterator it2;
        Iterator it3;
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new h9.c());
        Iterator it4 = collection.iterator();
        Iterator it5 = kVar.c().iterator();
        while (it5.hasNext()) {
            k.c cVar = (k.c) it5.next();
            ka.d0 d0Var = (ka.d0) it4.next();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                h9.c cVar2 = (h9.c) it6.next();
                j9.l f = cVar.f();
                for (g9.m mVar : k0Var.f6006c) {
                    if (mVar instanceof g9.l) {
                        g9.l lVar = (g9.l) mVar;
                        if (lVar.f6013c.equals(f)) {
                            l.a aVar = lVar.f6011a;
                            if (aVar.equals(l.a.IN) || aVar.equals(l.a.NOT_IN)) {
                                z10 = true;
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                z10 = false;
                if (z10 && j9.s.h(d0Var)) {
                    ArrayList arrayList2 = new ArrayList(arrayList);
                    arrayList = new ArrayList();
                    for (ka.d0 d0Var2 : d0Var.R().h()) {
                        Iterator it7 = arrayList2.iterator();
                        while (it7.hasNext()) {
                            h9.c cVar3 = (h9.c) it7.next();
                            h9.c cVar4 = new h9.c();
                            h9.f fVar = cVar3.f7194a;
                            byte[] copyOf = Arrays.copyOf(fVar.f7201a, fVar.f7202b);
                            h9.f fVar2 = cVar4.f7194a;
                            fVar2.getClass();
                            fVar2.a(copyOf.length);
                            int length = copyOf.length;
                            int i10 = 0;
                            while (i10 < length) {
                                byte b10 = copyOf[i10];
                                Iterator it8 = it4;
                                byte[] bArr = fVar2.f7201a;
                                Iterator it9 = it5;
                                int i11 = fVar2.f7202b;
                                fVar2.f7202b = i11 + 1;
                                bArr[i11] = b10;
                                i10++;
                                it4 = it8;
                                it5 = it9;
                                it6 = it6;
                            }
                            Iterator it10 = it4;
                            m.e a10 = cVar4.a(cVar.g());
                            h9.b.a(d0Var2, a10);
                            a10.r();
                            arrayList.add(cVar4);
                            it4 = it10;
                            it5 = it5;
                            it6 = it6;
                        }
                    }
                    it = it4;
                    it2 = it5;
                    it3 = it6;
                } else {
                    it = it4;
                    it2 = it5;
                    it3 = it6;
                    m.e a11 = cVar2.a(cVar.g());
                    h9.b.a(d0Var, a11);
                    a11.r();
                }
                it4 = it;
                it5 = it2;
                it6 = it3;
            }
        }
        Object[] objArr = new Object[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            h9.f fVar3 = ((h9.c) arrayList.get(i12)).f7194a;
            objArr[i12] = Arrays.copyOf(fVar3.f7201a, fVar3.f7202b);
        }
        return objArr;
    }

    public static j9.b r(Collection collection) {
        x6.b.Z("Found empty index group when looking for least recent index offset.", !collection.isEmpty(), new Object[0]);
        Iterator it = collection.iterator();
        k.a a10 = ((j9.k) it.next()).e().a();
        int i10 = a10.i();
        while (it.hasNext()) {
            k.a a11 = ((j9.k) it.next()).e().a();
            if (a11.compareTo(a10) < 0) {
                a10 = a11;
            }
            i10 = Math.max(a11.i(), i10);
        }
        return new j9.b(a10.l(), a10.h(), i10);
    }

    @Override // i9.f
    public final void a(j9.k kVar) {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        int i10 = this.f7805i + 1;
        j9.a aVar = new j9.a(i10, kVar.b(), kVar.f(), kVar.e());
        y0 y0Var = this.f7798a;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i10);
        objArr[1] = aVar.f8668d;
        i iVar = this.f7799b;
        List<k.c> list = aVar.f8669e;
        iVar.getClass();
        a.C0117a J = ia.a.J();
        J.m();
        ia.a.G((ia.a) J.f11120b);
        for (k.c cVar : list) {
            a.b.C0119b M = a.b.M();
            String h10 = cVar.f().h();
            M.m();
            a.b.G((a.b) M.f11120b, h10);
            if (cVar.g() == 3) {
                M.m();
                a.b.I((a.b) M.f11120b);
            } else {
                a.b.c cVar2 = cVar.g() == 1 ? a.b.c.ASCENDING : a.b.c.DESCENDING;
                M.m();
                a.b.H((a.b) M.f11120b, cVar2);
            }
            J.m();
            ia.a.H((ia.a) J.f11120b, M.k());
        }
        objArr[2] = J.k().j();
        y0Var.G("INSERT INTO index_configuration (index_id, collection_group, index_proto) VALUES(?, ?, ?)", objArr);
        t(aVar);
    }

    @Override // i9.f
    public final j9.b b(g9.k0 k0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<g9.k0> it = s(k0Var).iterator();
        while (it.hasNext()) {
            j9.k p10 = p(it.next());
            if (p10 != null) {
                arrayList.add(p10);
            }
        }
        return r(arrayList);
    }

    @Override // i9.f
    public final void c(j9.k kVar) {
        this.f7798a.G("DELETE FROM index_configuration WHERE index_id = ?", Integer.valueOf(kVar.d()));
        this.f7798a.G("DELETE FROM index_entries WHERE index_id = ?", Integer.valueOf(kVar.d()));
        this.f7798a.G("DELETE FROM index_state WHERE index_id = ?", Integer.valueOf(kVar.d()));
        this.f7803g.remove(kVar);
        Map map = (Map) this.f.get(kVar.b());
        if (map != null) {
            map.remove(Integer.valueOf(kVar.d()));
        }
    }

    @Override // i9.f
    public final Collection<j9.k> d() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(((Map) it.next()).values());
        }
        return arrayList;
    }

    @Override // i9.f
    public final String e() {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        j9.k kVar = (j9.k) this.f7803g.peek();
        if (kVar != null) {
            return kVar.b();
        }
        return null;
    }

    @Override // i9.f
    public final List<j9.o> f(String str) {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        ArrayList arrayList = new ArrayList();
        y0.d H = this.f7798a.H("SELECT parent FROM collection_parents WHERE collection_id = ?");
        H.a(str);
        H.d(new p0(arrayList, 0));
        return arrayList;
    }

    @Override // i9.f
    public final void g() {
        this.f7798a.G("DELETE FROM index_configuration", new Object[0]);
        this.f7798a.G("DELETE FROM index_entries", new Object[0]);
        this.f7798a.G("DELETE FROM index_state", new Object[0]);
        this.f7803g.clear();
        this.f.clear();
    }

    @Override // i9.f
    public final void h(t8.c<j9.i, j9.g> cVar) {
        byte[] copyOf;
        int i10 = 0;
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        Iterator<Map.Entry<j9.i, j9.g>> it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry<j9.i, j9.g> next = it.next();
            for (j9.k kVar : q(next.getKey().f8684a.n(r4.q() - 2))) {
                j9.i key = next.getKey();
                TreeSet treeSet = new TreeSet();
                y0.d H = this.f7798a.H("SELECT array_value, directional_value FROM index_entries WHERE index_id = ? AND document_key = ? AND uid = ?");
                Object[] objArr = new Object[3];
                objArr[i10] = Integer.valueOf(kVar.d());
                objArr[1] = key.toString();
                objArr[2] = this.f7800c;
                H.a(objArr);
                H.d(new s0(treeSet, kVar, key, i10));
                j9.g value = next.getValue();
                TreeSet treeSet2 = new TreeSet();
                h9.c cVar2 = new h9.c();
                Iterator it2 = kVar.c().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        h9.f fVar = cVar2.f7194a;
                        copyOf = Arrays.copyOf(fVar.f7201a, fVar.f7202b);
                        break;
                    }
                    k.c cVar3 = (k.c) it2.next();
                    ka.d0 g10 = value.g(cVar3.f());
                    if (g10 == null) {
                        copyOf = null;
                        break;
                    } else {
                        m.e a10 = cVar2.a(cVar3.g());
                        h9.b.a(g10, a10);
                        a10.r();
                    }
                }
                if (copyOf != null) {
                    k.c a11 = kVar.a();
                    if (a11 != null) {
                        ka.d0 g11 = value.g(a11.f());
                        if (j9.s.h(g11)) {
                            for (ka.d0 d0Var : g11.R().h()) {
                                int d10 = kVar.d();
                                j9.i key2 = value.getKey();
                                h9.c cVar4 = new h9.c();
                                m.e a12 = cVar4.a(1);
                                h9.b.a(d0Var, a12);
                                a12.r();
                                h9.f fVar2 = cVar4.f7194a;
                                treeSet2.add(new h9.a(d10, key2, Arrays.copyOf(fVar2.f7201a, fVar2.f7202b), copyOf));
                            }
                        }
                    } else {
                        treeSet2.add(new h9.a(kVar.d(), value.getKey(), new byte[0], copyOf));
                    }
                }
                if (treeSet.equals(treeSet2)) {
                    i10 = 0;
                } else {
                    j9.g value2 = next.getValue();
                    int i11 = 0;
                    p2.m0.y(1, "t0", "Updating index entries for document '%s'", value2.getKey());
                    q0 q0Var = new q0(i11, this, value2);
                    r0 r0Var = new r0(i11, this, value2);
                    r3.j jVar = n9.o.f11373a;
                    n9.o.f(treeSet.iterator(), treeSet2.iterator(), treeSet.comparator() != null ? treeSet.comparator() : new q5.i(7), q0Var, r0Var);
                    i10 = 0;
                }
            }
        }
    }

    @Override // i9.f
    public final j9.b i(String str) {
        Collection<j9.k> q10 = q(str);
        x6.b.Z("minOffset was called for collection without indexes", !q10.isEmpty(), new Object[0]);
        return r(q10);
    }

    @Override // i9.f
    public final void j(j9.o oVar) {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        x6.b.Z("Expected a collection path.", oVar.q() % 2 == 1, new Object[0]);
        if (this.f7802e.a(oVar)) {
            this.f7798a.G("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)", oVar.m(), p2.m0.A(oVar.s()));
        }
    }

    @Override // i9.f
    public final int k(g9.k0 k0Var) {
        List<g9.k0> s10 = s(k0Var);
        Iterator<g9.k0> it = s10.iterator();
        int i10 = 3;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            g9.k0 next = it.next();
            j9.k p10 = p(next);
            if (p10 == null) {
                i10 = 1;
                break;
            }
            int size = p10.f().size();
            HashSet hashSet = new HashSet();
            Iterator<g9.m> it2 = next.f6006c.iterator();
            while (it2.hasNext()) {
                for (g9.l lVar : it2.next().c()) {
                    if (!lVar.f6013c.u()) {
                        if (lVar.f6011a.equals(l.a.ARRAY_CONTAINS) || lVar.f6011a.equals(l.a.ARRAY_CONTAINS_ANY)) {
                            r6 = 1;
                        } else {
                            hashSet.add(lVar.f6013c);
                        }
                    }
                }
            }
            for (g9.e0 e0Var : next.f6005b) {
                if (!e0Var.f5930b.u()) {
                    hashSet.add(e0Var.f5930b);
                }
            }
            if (size < hashSet.size() + r6) {
                i10 = 2;
            }
        }
        if ((k0Var.f != -1 ? 1 : 0) == 0 || s10.size() <= 1 || i10 != 3) {
            return i10;
        }
        return 2;
    }

    @Override // i9.f
    public final List<j9.i> l(g9.k0 k0Var) {
        int i10;
        boolean z10;
        Iterator it;
        Collection collection;
        List<ka.d0> list;
        int i11;
        byte[] bArr;
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<g9.k0> it2 = s(k0Var).iterator();
        while (true) {
            List<ka.d0> list2 = null;
            if (!it2.hasNext()) {
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Pair pair = (Pair) it3.next();
                    g9.k0 k0Var2 = (g9.k0) pair.first;
                    j9.k kVar = (j9.k) pair.second;
                    k0Var2.getClass();
                    k.c a10 = kVar.a();
                    if (a10 != null) {
                        Iterator it4 = k0Var2.d(a10.f()).iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                list2 = null;
                                break;
                            }
                            g9.l lVar = (g9.l) it4.next();
                            int ordinal = lVar.f6011a.ordinal();
                            if (ordinal == 6) {
                                list2 = Collections.singletonList(lVar.f6012b);
                                break;
                            }
                            if (ordinal == 7) {
                                list2 = lVar.f6012b.R().h();
                                break;
                            }
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it5 = kVar.c().iterator();
                    while (it5.hasNext()) {
                        k.c cVar = (k.c) it5.next();
                        Iterator it6 = k0Var2.d(cVar.f()).iterator();
                        while (it6.hasNext()) {
                            g9.l lVar2 = (g9.l) it6.next();
                            it = it3;
                            int ordinal2 = lVar2.f6011a.ordinal();
                            Iterator it7 = it5;
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 != 8) {
                                        if (ordinal2 != 9) {
                                            it3 = it;
                                            it5 = it7;
                                        }
                                    }
                                }
                                linkedHashMap.put(cVar.f(), lVar2.f6012b);
                                collection = linkedHashMap.values();
                                break;
                            }
                            linkedHashMap.put(cVar.f(), lVar2.f6012b);
                            it3 = it;
                            it5 = it7;
                        }
                    }
                    it = it3;
                    collection = null;
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it8 = kVar.c().iterator();
                    boolean z11 = true;
                    while (it8.hasNext()) {
                        k.c cVar2 = (k.c) it8.next();
                        Iterator it9 = it8;
                        boolean b10 = q0.g.b(cVar2.g(), 1);
                        g9.e eVar = k0Var2.f6009g;
                        Pair<ka.d0, Boolean> a11 = b10 ? k0Var2.a(cVar2, eVar) : k0Var2.c(cVar2, eVar);
                        arrayList4.add((ka.d0) a11.first);
                        z11 &= ((Boolean) a11.second).booleanValue();
                        it8 = it9;
                    }
                    g9.e eVar2 = new g9.e(arrayList4, z11);
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it10 = kVar.c().iterator();
                    boolean z12 = true;
                    while (it10.hasNext()) {
                        k.c cVar3 = (k.c) it10.next();
                        Iterator it11 = it10;
                        boolean b11 = q0.g.b(cVar3.g(), 1);
                        g9.e eVar3 = k0Var2.f6010h;
                        Pair<ka.d0, Boolean> c10 = b11 ? k0Var2.c(cVar3, eVar3) : k0Var2.a(cVar3, eVar3);
                        arrayList5.add((ka.d0) c10.first);
                        z12 &= ((Boolean) c10.second).booleanValue();
                        it10 = it11;
                    }
                    g9.e eVar4 = new g9.e(arrayList5, z12);
                    if (p2.m0.S()) {
                        p2.m0.y(1, "t0", "Using index '%s' to execute '%s' (Arrays: %s, Lower bound: %s, Upper bound: %s)", kVar, k0Var2, list2, eVar2, eVar4);
                    }
                    Object[] o10 = o(kVar, k0Var2, eVar2.f5928b);
                    String str = eVar2.f5927a ? ">=" : ">";
                    Object[] o11 = o(kVar, k0Var2, arrayList5);
                    String str2 = z12 ? "<=" : "<";
                    Object[] o12 = o(kVar, k0Var2, collection);
                    int d10 = kVar.d();
                    int max = Math.max(o10.length, o11.length) * (list2 != null ? list2.size() : 1);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SELECT document_key, directional_value FROM index_entries ");
                    sb2.append("WHERE index_id = ? AND uid = ? ");
                    sb2.append("AND array_value = ? ");
                    sb2.append("AND directional_value ");
                    sb2.append(str);
                    sb2.append(" ? ");
                    sb2.append("AND directional_value ");
                    sb2.append(str2);
                    sb2.append(" ? ");
                    StringBuilder h10 = n9.o.h(sb2, max, " UNION ");
                    if (o12 != null) {
                        StringBuilder sb3 = new StringBuilder("SELECT document_key, directional_value FROM (");
                        sb3.append((CharSequence) h10);
                        sb3.append(") WHERE directional_value NOT IN (");
                        sb3.append((CharSequence) n9.o.h("?", o12.length, ", "));
                        sb3.append(")");
                        h10 = sb3;
                    }
                    int size = max / (list2 != null ? list2.size() : 1);
                    Object[] objArr = new Object[(max * 5) + (o12 != null ? o12.length : 0)];
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < max) {
                        int i14 = i13 + 1;
                        objArr[i13] = Integer.valueOf(d10);
                        int i15 = i14 + 1;
                        int i16 = d10;
                        objArr[i14] = this.f7800c;
                        int i17 = i15 + 1;
                        if (list2 != null) {
                            ka.d0 d0Var = list2.get(i12 / size);
                            list = list2;
                            h9.c cVar4 = new h9.c();
                            i11 = max;
                            m.e a12 = cVar4.a(1);
                            h9.b.a(d0Var, a12);
                            a12.r();
                            h9.f fVar = cVar4.f7194a;
                            bArr = Arrays.copyOf(fVar.f7201a, fVar.f7202b);
                        } else {
                            list = list2;
                            i11 = max;
                            bArr = f7797k;
                        }
                        objArr[i15] = bArr;
                        int i18 = i17 + 1;
                        int i19 = i12 % size;
                        objArr[i17] = o10[i19];
                        objArr[i18] = o11[i19];
                        i12++;
                        i13 = i18 + 1;
                        d10 = i16;
                        list2 = list;
                        max = i11;
                    }
                    if (o12 != null) {
                        int length = o12.length;
                        int i20 = 0;
                        while (i20 < length) {
                            objArr[i13] = o12[i20];
                            i20++;
                            i13++;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(h10.toString());
                    arrayList6.addAll(Arrays.asList(objArr));
                    Object[] array = arrayList6.toArray();
                    arrayList.add(String.valueOf(array[0]));
                    arrayList2.addAll(Arrays.asList(array).subList(1, array.length));
                    list2 = null;
                    it3 = it;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(TextUtils.join(" UNION ", arrayList));
                sb4.append("ORDER BY directional_value, document_key ");
                List<g9.e0> list3 = k0Var.f6005b;
                sb4.append(q0.g.b(list3.get(list3.size() + (-1)).f5929a, 1) ? "asc " : "desc ");
                String e10 = defpackage.g.e("SELECT DISTINCT document_key FROM (", sb4.toString(), ")");
                if (k0Var.f != -1) {
                    StringBuilder g10 = defpackage.g.g(e10, " LIMIT ");
                    g10.append(k0Var.f);
                    e10 = g10.toString();
                }
                if (arrayList2.size() < 1000) {
                    i10 = 0;
                    z10 = true;
                } else {
                    i10 = 0;
                    z10 = false;
                }
                x6.b.Z("Cannot perform query with more than 999 bind elements", z10, new Object[i10]);
                y0.d H = this.f7798a.H(e10);
                H.a(arrayList2.toArray());
                ArrayList arrayList7 = new ArrayList();
                H.d(new o0(i10, arrayList7));
                Object[] objArr2 = new Object[1];
                objArr2[i10] = Integer.valueOf(arrayList7.size());
                p2.m0.y(1, "t0", "Index scan returned %s documents", objArr2);
                return arrayList7;
            }
            g9.k0 next = it2.next();
            j9.k p10 = p(next);
            if (p10 == null) {
                return null;
            }
            arrayList3.add(Pair.create(next, p10));
        }
    }

    @Override // i9.f
    public final void m(g9.k0 k0Var) {
        j9.a aVar;
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        for (g9.k0 k0Var2 : s(k0Var)) {
            int k10 = k(k0Var2);
            if (k10 == 1 || k10 == 2) {
                String str = k0Var2.f6008e;
                if (str == null) {
                    str = k0Var2.f6007d.m();
                }
                List<g9.e0> list = k0Var2.f6005b;
                TreeSet treeSet = new TreeSet(new v4.d(9));
                ArrayList arrayList = new ArrayList();
                Iterator<g9.m> it = k0Var2.f6006c.iterator();
                while (it.hasNext()) {
                    g9.l lVar = (g9.l) it.next();
                    if (lVar.f()) {
                        treeSet.add(lVar);
                    } else {
                        arrayList.add(lVar);
                    }
                }
                if (treeSet.size() > 1) {
                    aVar = null;
                } else {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        g9.l lVar2 = (g9.l) it2.next();
                        if (!lVar2.f6013c.u()) {
                            if (lVar2.f6011a.equals(l.a.ARRAY_CONTAINS) || lVar2.f6011a.equals(l.a.ARRAY_CONTAINS_ANY)) {
                                arrayList2.add(new j9.d(lVar2.f6013c, 3));
                            } else if (!hashSet.contains(lVar2.f6013c)) {
                                hashSet.add(lVar2.f6013c);
                                arrayList2.add(new j9.d(lVar2.f6013c, 1));
                            }
                        }
                    }
                    for (g9.e0 e0Var : list) {
                        if (!e0Var.f5930b.u() && !hashSet.contains(e0Var.f5930b)) {
                            hashSet.add(e0Var.f5930b);
                            arrayList2.add(new j9.d(e0Var.f5930b, e0Var.f5929a == 1 ? 1 : 2));
                        }
                    }
                    aVar = new j9.a(-1, str, arrayList2, j9.k.f8687a);
                }
                if (aVar != null) {
                    a(aVar);
                }
            }
        }
    }

    @Override // i9.f
    public final void n(String str, j9.b bVar) {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        this.f7806j++;
        for (j9.k kVar : q(str)) {
            j9.a aVar = new j9.a(kVar.d(), kVar.b(), kVar.f(), new j9.c(this.f7806j, bVar));
            this.f7798a.G("REPLACE INTO index_state (index_id, uid,  sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id) VALUES(?, ?, ?, ?, ?, ?, ?)", Integer.valueOf(kVar.d()), this.f7800c, Long.valueOf(this.f7806j), Long.valueOf(bVar.f8670c.f8702a.f15102a), Integer.valueOf(bVar.f8670c.f8702a.f15103b), p2.m0.A(bVar.f8671d.f8684a), Integer.valueOf(bVar.f8672e));
            t(aVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d4, code lost:
    
        if (j9.r.c(r4.next(), r7) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j9.k p(g9.k0 r12) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.t0.p(g9.k0):j9.k");
    }

    public final Collection<j9.k> q(String str) {
        x6.b.Z("IndexManager not started", this.f7804h, new Object[0]);
        Map map = (Map) this.f.get(str);
        return map == null ? Collections.emptyList() : map.values();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if ((r5 && r2.e()) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<g9.k0> s(g9.k0 r14) {
        /*
            r13 = this;
            java.util.HashMap r0 = r13.f7801d
            boolean r0 = r0.containsKey(r14)
            if (r0 == 0) goto L11
            java.util.HashMap r0 = r13.f7801d
            java.lang.Object r14 = r0.get(r14)
            java.util.List r14 = (java.util.List) r14
            return r14
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<g9.m> r1 = r14.f6006c
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L23
            r0.add(r14)
            goto Lb7
        L23:
            g9.g r1 = new g9.g
            java.util.List<g9.m> r2 = r14.f6006c
            r3 = 1
            r1.<init>(r2, r3)
            java.util.List r2 = r1.b()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3a
            java.util.List r1 = java.util.Collections.emptyList()
            goto L8d
        L3a:
            g9.m r1 = n9.k.f(r1)
            g9.m r1 = n9.k.e(r1)
            boolean r2 = n9.k.g(r1)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "computeDistributedNormalForm did not result in disjunctive normal form"
            x6.b.Z(r6, r2, r5)
            boolean r2 = r1 instanceof g9.l
            if (r2 != 0) goto L89
            boolean r2 = r1 instanceof g9.g
            if (r2 == 0) goto L80
            r2 = r1
            g9.g r2 = (g9.g) r2
            java.util.ArrayList r5 = r2.f5956a
            java.util.Iterator r5 = r5.iterator()
        L5f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r5.next()
            g9.m r6 = (g9.m) r6
            boolean r6 = r6 instanceof g9.g
            if (r6 == 0) goto L5f
            r5 = r4
            goto L72
        L71:
            r5 = r3
        L72:
            if (r5 == 0) goto L7c
            boolean r2 = r2.e()
            if (r2 == 0) goto L7c
            r2 = r3
            goto L7d
        L7c:
            r2 = r4
        L7d:
            if (r2 == 0) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            if (r3 == 0) goto L84
            goto L89
        L84:
            java.util.List r1 = r1.b()
            goto L8d
        L89:
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L8d:
            java.util.Iterator r1 = r1.iterator()
        L91:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r1.next()
            g9.m r2 = (g9.m) r2
            g9.k0 r12 = new g9.k0
            j9.o r4 = r14.f6007d
            java.lang.String r5 = r14.f6008e
            java.util.List r6 = r2.b()
            java.util.List<g9.e0> r7 = r14.f6005b
            long r8 = r14.f
            g9.e r10 = r14.f6009g
            g9.e r11 = r14.f6010h
            r3 = r12
            r3.<init>(r4, r5, r6, r7, r8, r10, r11)
            r0.add(r12)
            goto L91
        Lb7:
            java.util.HashMap r1 = r13.f7801d
            r1.put(r14, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i9.t0.s(g9.k0):java.util.List");
    }

    @Override // i9.f
    public final void start() {
        HashMap hashMap = new HashMap();
        y0.d H = this.f7798a.H("SELECT index_id, sequence_number, read_time_seconds, read_time_nanos, document_key, largest_batch_id FROM index_state WHERE uid = ?");
        int i10 = 1;
        H.a(this.f7800c);
        H.d(new p0(hashMap, i10));
        this.f7798a.H("SELECT index_id, collection_group, index_proto FROM index_configuration").d(new q0(i10, this, hashMap));
        this.f7804h = true;
    }

    public final void t(j9.a aVar) {
        Map map = (Map) this.f.get(aVar.f8668d);
        if (map == null) {
            map = new HashMap();
            this.f.put(aVar.f8668d, map);
        }
        j9.k kVar = (j9.k) map.get(Integer.valueOf(aVar.f8667c));
        if (kVar != null) {
            this.f7803g.remove(kVar);
        }
        map.put(Integer.valueOf(aVar.f8667c), aVar);
        this.f7803g.add(aVar);
        this.f7805i = Math.max(this.f7805i, aVar.f8667c);
        this.f7806j = Math.max(this.f7806j, aVar.f.b());
    }
}
