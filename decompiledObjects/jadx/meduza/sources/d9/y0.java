package d9;

import com.google.firebase.firestore.FirebaseFirestore;
import d9.o;
import e7.p3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k9.a;
import ka.b;
import ka.d0;
import ka.u;
import ma.n1;
import n9.e;
import oa.a;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final j9.f f3739a;

    public y0(j9.f fVar) {
        this.f3739a = fVar;
    }

    public static ka.d0 g(u7.m mVar) {
        int i10 = (mVar.f15103b / 1000) * 1000;
        d0.a d02 = ka.d0.d0();
        n1.a L = n1.L();
        L.p(mVar.f15102a);
        L.m();
        n1.H((n1) L.f11120b, i10);
        d02.w(L);
        return d02.k();
    }

    public final j9.n a(Map map, g9.o0 o0Var) {
        if (map.getClass().isArray()) {
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was an array");
        }
        ka.d0 c10 = c(n9.e.b(map, e.b.f11356d), o0Var);
        if (c10.c0() == 11) {
            return new j9.n(c10);
        }
        StringBuilder g10 = defpackage.g.g("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was ", "of type: ");
        g10.append(n9.o.j(map));
        throw new IllegalArgumentException(g10.toString());
    }

    public final ArrayList b(List list) {
        p3 p3Var = new p3(g9.p0.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            arrayList.add(c(n9.e.b(obj, e.b.f11356d), new g9.o0(p3Var.a().f6040a, null, true)));
        }
        return arrayList;
    }

    public final ka.d0 c(Object obj, g9.o0 o0Var) {
        d0.a d02;
        double doubleValue;
        long longValue;
        ka.d0 k10;
        k9.p jVar;
        ArrayList arrayList;
        k9.e eVar;
        d0.a d03;
        int i10 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (map.isEmpty()) {
                j9.l lVar = o0Var.f6041b;
                if (lVar != null && !lVar.o()) {
                    o0Var.a(o0Var.f6041b);
                }
                d03 = ka.d0.d0();
                d03.u(ka.u.H());
            } else {
                u.a M = ka.u.M();
                for (Map.Entry entry : map.entrySet()) {
                    if (!(entry.getKey() instanceof String)) {
                        throw o0Var.c(String.format("Non-String Map key (%s) is not allowed", entry.getValue()));
                    }
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    j9.l lVar2 = o0Var.f6041b;
                    g9.o0 o0Var2 = new g9.o0(o0Var.f6040a, lVar2 == null ? null : lVar2.g(str), false);
                    o0Var2.e(str);
                    ka.d0 c10 = c(value, o0Var2);
                    if (c10 != null) {
                        M.p(c10, str);
                    }
                }
                d03 = ka.d0.d0();
                d03.t(M);
            }
            return d03.k();
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (!o0Var.d()) {
                throw o0Var.c(String.format("%s() can only be used with set() and update()", oVar.a()));
            }
            j9.l lVar3 = o0Var.f6041b;
            if (lVar3 == null) {
                throw o0Var.c(String.format("%s() is not currently supported inside arrays", oVar.a()));
            }
            if (oVar instanceof o.c) {
                Object obj2 = o0Var.f6040a.f4567b;
                if (((g9.p0) obj2) != g9.p0.MergeSet) {
                    if (((g9.p0) obj2) != g9.p0.Update) {
                        throw o0Var.c("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
                    }
                    x6.b.Z("FieldValue.delete() at the top level should have already been handled.", lVar3.q() > 0, new Object[0]);
                    throw o0Var.c("FieldValue.delete() can only appear at the top level of your update data");
                }
                o0Var.a(lVar3);
            } else {
                if (oVar instanceof o.e) {
                    k9.n nVar = k9.n.f9170a;
                    arrayList = (ArrayList) o0Var.f6040a.f4569d;
                    eVar = new k9.e(lVar3, nVar);
                } else {
                    if (oVar instanceof o.b) {
                        jVar = new a.b(b(((o.b) oVar).f3697c));
                    } else if (oVar instanceof o.a) {
                        jVar = new a.C0132a(b(((o.a) oVar).f3696c));
                    } else {
                        if (!(oVar instanceof o.d)) {
                            x6.b.T("Unknown FieldValue type: %s", n9.o.j(oVar));
                            throw null;
                        }
                        jVar = new k9.j(e(((o.d) oVar).f3698c, false));
                    }
                    j9.l lVar4 = o0Var.f6041b;
                    arrayList = (ArrayList) o0Var.f6040a.f4569d;
                    eVar = new k9.e(lVar4, jVar);
                }
                arrayList.add(eVar);
            }
            return null;
        }
        j9.l lVar5 = o0Var.f6041b;
        if (lVar5 != null) {
            o0Var.a(lVar5);
        }
        if (obj instanceof List) {
            if (o0Var.f6042c && ((g9.p0) o0Var.f6040a.f4567b) != g9.p0.ArrayArgument) {
                throw o0Var.c("Nested arrays are not supported");
            }
            b.a M2 = ka.b.M();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                ka.d0 c11 = c(it.next(), new g9.o0(o0Var.f6040a, null, true));
                if (c11 == null) {
                    d0.a d04 = ka.d0.d0();
                    d04.m();
                    ka.d0.N((ka.d0) d04.f11120b);
                    c11 = d04.k();
                }
                M2.m();
                ka.b.G((ka.b) M2.f11120b, c11);
            }
            d0.a d05 = ka.d0.d0();
            d05.p(M2);
            return d05.k();
        }
        if (obj == null) {
            d0.a d06 = ka.d0.d0();
            d06.m();
            ka.d0.N((ka.d0) d06.f11120b);
            k10 = d06.k();
        } else {
            if (obj instanceof Integer) {
                d02 = ka.d0.d0();
                longValue = ((Integer) obj).intValue();
            } else if (obj instanceof Long) {
                d02 = ka.d0.d0();
                longValue = ((Long) obj).longValue();
            } else {
                if (obj instanceof Float) {
                    d02 = ka.d0.d0();
                    doubleValue = ((Float) obj).doubleValue();
                } else if (obj instanceof Double) {
                    d02 = ka.d0.d0();
                    doubleValue = ((Double) obj).doubleValue();
                } else {
                    if (obj instanceof Boolean) {
                        d02 = ka.d0.d0();
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        d02.m();
                        ka.d0.O((ka.d0) d02.f11120b, booleanValue);
                    } else if (obj instanceof String) {
                        d02 = ka.d0.d0();
                        d02.v((String) obj);
                    } else {
                        if (obj instanceof Date) {
                            return g(new u7.m((Date) obj));
                        }
                        if (obj instanceof u7.m) {
                            return g((u7.m) obj);
                        }
                        if (obj instanceof y) {
                            y yVar = (y) obj;
                            d02 = ka.d0.d0();
                            a.C0190a L = oa.a.L();
                            double d10 = yVar.f3737a;
                            L.m();
                            oa.a.G((oa.a) L.f11120b, d10);
                            double d11 = yVar.f3738b;
                            L.m();
                            oa.a.H((oa.a) L.f11120b, d11);
                            d02.r(L);
                        } else if (obj instanceof c) {
                            d02 = ka.d0.d0();
                            ma.h hVar = ((c) obj).f3646a;
                            d02.m();
                            ka.d0.I((ka.d0) d02.f11120b, hVar);
                        } else if (obj instanceof com.google.firebase.firestore.c) {
                            com.google.firebase.firestore.c cVar = (com.google.firebase.firestore.c) obj;
                            FirebaseFirestore firebaseFirestore = cVar.f3147b;
                            if (firebaseFirestore != null) {
                                j9.f fVar = firebaseFirestore.f3131c;
                                if (!fVar.equals(this.f3739a)) {
                                    j9.f fVar2 = this.f3739a;
                                    throw o0Var.c(String.format("Document reference is for database %s/%s but should be for database %s/%s", fVar.f8678a, fVar.f8679b, fVar2.f8678a, fVar2.f8679b));
                                }
                            }
                            d02 = ka.d0.d0();
                            j9.f fVar3 = this.f3739a;
                            String format = String.format("projects/%s/databases/%s/documents/%s", fVar3.f8678a, fVar3.f8679b, cVar.c());
                            d02.m();
                            ka.d0.J((ka.d0) d02.f11120b, format);
                        } else {
                            if (!(obj instanceof z0)) {
                                if (obj.getClass().isArray()) {
                                    throw o0Var.c("Arrays are not supported; use a List instead");
                                }
                                StringBuilder l10 = defpackage.f.l("Unsupported type: ");
                                l10.append(n9.o.j(obj));
                                throw o0Var.c(l10.toString());
                            }
                            z0 z0Var = (z0) obj;
                            u.a M3 = ka.u.M();
                            M3.p(j9.s.f, "__type__");
                            ArrayList arrayList2 = new ArrayList(z0Var.f3740a.length);
                            while (true) {
                                double[] dArr = z0Var.f3740a;
                                if (i10 >= dArr.length) {
                                    M3.p(c(arrayList2, o0Var), "value");
                                    d0.a d07 = ka.d0.d0();
                                    d07.t(M3);
                                    return d07.k();
                                }
                                arrayList2.add(i10, Double.valueOf(dArr[i10]));
                                i10++;
                            }
                        }
                    }
                    k10 = d02.k();
                }
                d02.q(doubleValue);
                k10 = d02.k();
            }
            d02.s(longValue);
            k10 = d02.k();
        }
        return k10;
    }

    public final r3.a0 d(Map map, k9.d dVar) {
        boolean z10;
        boolean z11;
        j9.l next;
        p3 p3Var = new p3(g9.p0.MergeSet);
        j9.n a10 = a(map, p3Var.a());
        if (dVar == null) {
            return new r3.a0(a10, new k9.d((Set) p3Var.f4568c), Collections.unmodifiableList((ArrayList) p3Var.f4569d));
        }
        Iterator<j9.l> it = dVar.f9147a.iterator();
        do {
            z10 = true;
            if (!it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) p3Var.f4569d).iterator();
                while (it2.hasNext()) {
                    k9.e eVar = (k9.e) it2.next();
                    j9.l lVar = eVar.f9148a;
                    Iterator<j9.l> it3 = dVar.f9147a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z11 = false;
                            break;
                        }
                        if (it3.next().p(lVar)) {
                            z11 = true;
                            break;
                        }
                    }
                    if (z11) {
                        arrayList.add(eVar);
                    }
                }
                return new r3.a0(a10, dVar, Collections.unmodifiableList(arrayList));
            }
            next = it.next();
            Iterator it4 = ((Set) p3Var.f4568c).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    Iterator it5 = ((ArrayList) p3Var.f4569d).iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            z10 = false;
                            break;
                        }
                        if (next.p(((k9.e) it5.next()).f9148a)) {
                            break;
                        }
                    }
                } else if (next.p((j9.l) it4.next())) {
                    break;
                }
            }
        } while (z10);
        StringBuilder l10 = defpackage.f.l("Field '");
        l10.append(next.h());
        l10.append("' is specified in your field mask but not in your input data.");
        throw new IllegalArgumentException(l10.toString());
    }

    public final ka.d0 e(Object obj, boolean z10) {
        p3 p3Var = new p3(z10 ? g9.p0.ArrayArgument : g9.p0.Argument);
        ka.d0 c10 = c(n9.e.b(obj, e.b.f11356d), p3Var.a());
        x6.b.Z("Parsed data should not be null.", c10 != null, new Object[0]);
        x6.b.Z("Field transforms should have been disallowed.", ((ArrayList) p3Var.f4569d).isEmpty(), new Object[0]);
        return c10;
    }

    public final r3.a0 f(Map map) {
        p3 p3Var = new p3(g9.p0.Set);
        return new r3.a0(a(map, p3Var.a()), (Object) null, Collections.unmodifiableList((ArrayList) p3Var.f4569d));
    }

    public final l3.j h(Map<String, Object> map) {
        p3 p3Var = new p3(g9.p0.Update);
        g9.o0 a10 = p3Var.a();
        j9.n nVar = new j9.n();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            j9.l lVar = n.a(entry.getKey()).f3690a;
            Object value = entry.getValue();
            if (value instanceof o.c) {
                a10.a(lVar);
            } else {
                ka.d0 c10 = c(n9.e.b(value, e.b.f11356d), a10.b(lVar));
                if (c10 != null) {
                    a10.a(lVar);
                    nVar.f(lVar, c10);
                }
            }
        }
        return new l3.j(nVar, new k9.d((Set) p3Var.f4568c), Collections.unmodifiableList((ArrayList) p3Var.f4569d));
    }
}
