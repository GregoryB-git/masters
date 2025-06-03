package com.google.firebase.firestore;

import com.google.firebase.firestore.d;
import d9.y;
import d9.z0;
import j9.o;
import j9.p;
import j9.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka.d0;
import ma.n1;
import p2.m0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f3200a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f3201b;

    public m(FirebaseFirestore firebaseFirestore, d.a aVar) {
        this.f3200a = firebaseFirestore;
        this.f3201b = aVar;
    }

    public final HashMap a(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), b((d0) entry.getValue()));
        }
        return hashMap;
    }

    public final Object b(d0 d0Var) {
        d0 b10;
        switch (s.n(d0Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(d0Var.S());
            case 2:
                return q0.g.b(d0Var.c0(), 3) ? Long.valueOf(d0Var.X()) : Double.valueOf(d0Var.V());
            case 3:
                n1 b02 = d0Var.b0();
                return new u7.m(b02.J(), b02.K());
            case 4:
                int ordinal = this.f3201b.ordinal();
                if (ordinal == 1) {
                    n1 a10 = p.a(d0Var);
                    return new u7.m(a10.J(), a10.K());
                }
                if (ordinal == 2 && (b10 = p.b(d0Var)) != null) {
                    return b(b10);
                }
                return null;
            case 5:
                return d0Var.a0();
            case 6:
                ma.h T = d0Var.T();
                x6.b.B(T, "Provided ByteString must not be null.");
                return new d9.c(T);
            case 7:
                o t = o.t(d0Var.Z());
                x6.b.Z("Tried to parse an invalid resource name: %s", t.q() > 3 && t.n(0).equals("projects") && t.n(2).equals("databases"), t);
                String n2 = t.n(1);
                String n10 = t.n(3);
                j9.f fVar = new j9.f(n2, n10);
                j9.i h10 = j9.i.h(d0Var.Z());
                j9.f fVar2 = this.f3200a.f3131c;
                if (!fVar.equals(fVar2)) {
                    m0.y(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", h10.f8684a, n2, n10, fVar2.f8678a, fVar2.f8679b);
                }
                return new c(h10, this.f3200a);
            case 8:
                return new y(d0Var.W().J(), d0Var.W().K());
            case 9:
                ka.b R = d0Var.R();
                ArrayList arrayList = new ArrayList(R.L());
                Iterator<d0> it = R.h().iterator();
                while (it.hasNext()) {
                    arrayList.add(b(it.next()));
                }
                return arrayList;
            case 10:
                List<d0> h11 = d0Var.Y().J().get("value").R().h();
                double[] dArr = new double[h11.size()];
                for (int i10 = 0; i10 < h11.size(); i10++) {
                    dArr[i10] = h11.get(i10).V();
                }
                return new z0(dArr);
            case 11:
                return a(d0Var.Y().J());
            default:
                StringBuilder l10 = defpackage.f.l("Unknown value type: ");
                l10.append(defpackage.f.s(d0Var.c0()));
                x6.b.T(l10.toString(), new Object[0]);
                throw null;
        }
    }
}
