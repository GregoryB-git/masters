package p3;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import i9.m1;
import i9.n;
import j9.i;
import j9.m;
import j9.q;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k3.n;
import k3.s;
import m9.d0;
import m9.k0;
import ma.h;
import n3.c;
import n9.l;
import r3.t;
import s3.b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements b.a, t.a, l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12981a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12982b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12983c;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3) {
        this.f12983c = obj;
        this.f12982b = obj2;
        this.f12981a = obj3;
    }

    public /* synthetic */ b(t tVar, n nVar, s sVar) {
        this.f12983c = tVar;
        this.f12981a = nVar;
        this.f12982b = sVar;
    }

    @Override // s3.b.a
    public final Object a() {
        c cVar = (c) this.f12983c;
        s sVar = (s) this.f12982b;
        cVar.f12987d.j(sVar, (n) this.f12981a);
        cVar.f12984a.b(sVar, 1);
        return null;
    }

    @Override // r3.t.a
    public final Object apply(Object obj) {
        long insert;
        t tVar = (t) this.f12983c;
        n nVar = (n) this.f12981a;
        s sVar = (s) this.f12982b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        h3.c cVar = t.f;
        if (tVar.I().compileStatement("PRAGMA page_size").simpleQueryForLong() * tVar.M() >= tVar.f13587d.e()) {
            tVar.C(1L, c.a.CACHE_FULL, nVar.k());
            return -1L;
        }
        Long Q = t.Q(sQLiteDatabase, sVar);
        if (Q != null) {
            insert = Q.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", sVar.b());
            contentValues.put("priority", Integer.valueOf(u3.a.a(sVar.d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (sVar.c() != null) {
                contentValues.put("extras", Base64.encodeToString(sVar.c(), 0));
            }
            insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int d10 = tVar.f13587d.d();
        byte[] bArr = nVar.d().f8908b;
        boolean z10 = bArr.length <= d10;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(insert));
        contentValues2.put("transport_name", nVar.k());
        contentValues2.put("timestamp_ms", Long.valueOf(nVar.e()));
        contentValues2.put("uptime_ms", Long.valueOf(nVar.l()));
        contentValues2.put("payload_encoding", nVar.d().f8907a.f7066a);
        contentValues2.put("code", nVar.c());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z10));
        contentValues2.put("payload", z10 ? bArr : new byte[0]);
        contentValues2.put("product_id", nVar.i());
        contentValues2.put("pseudonymous_id", nVar.j());
        contentValues2.put("experiment_ids_clear_blob", nVar.f());
        contentValues2.put("experiment_ids_encrypted_blob", nVar.g());
        long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z10) {
            int ceil = (int) Math.ceil(bArr.length / d10);
            for (int i10 = 1; i10 <= ceil; i10++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i10 - 1) * d10, Math.min(i10 * d10, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert2));
                contentValues3.put("sequence_num", Integer.valueOf(i10));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(nVar.b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(insert2);
    }

    @Override // n9.l
    public final Object get() {
        long j10;
        Iterator it;
        i9.n nVar = (i9.n) this.f12983c;
        d0 d0Var = (d0) this.f12982b;
        q qVar = (q) this.f12981a;
        int i10 = i9.n.f7742o;
        nVar.getClass();
        Map map = (Map) d0Var.f10769b;
        long h10 = nVar.f7743a.p().h();
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            int intValue = ((Integer) entry.getKey()).intValue();
            k0 k0Var = (k0) entry.getValue();
            m1 m1Var = nVar.f7752k.get(intValue);
            if (m1Var != null) {
                nVar.f7750i.e(k0Var.f10825e, intValue);
                nVar.f7750i.b(k0Var.f10823c, intValue);
                m1 b10 = m1Var.b(h10);
                if (((Map) d0Var.f10770c).containsKey(Integer.valueOf(intValue))) {
                    h.C0164h c0164h = h.f10961b;
                    q qVar2 = q.f8701b;
                    m1 a10 = b10.a(c0164h, qVar2);
                    j10 = h10;
                    it = it2;
                    b10 = new m1(a10.f7734a, a10.f7735b, a10.f7736c, a10.f7737d, a10.f7738e, qVar2, a10.f7739g, null);
                } else {
                    j10 = h10;
                    it = it2;
                    if (!k0Var.f10821a.isEmpty()) {
                        b10 = b10.a(k0Var.f10821a, (q) d0Var.f10768a);
                    }
                }
                nVar.f7752k.put(intValue, b10);
                if (i9.n.e(m1Var, b10, k0Var)) {
                    nVar.f7750i.h(b10);
                }
                it2 = it;
                h10 = j10;
            }
        }
        Map<i, m> map2 = (Map) d0Var.f10771d;
        Set set = (Set) d0Var.f10772e;
        for (i iVar : map2.keySet()) {
            if (set.contains(iVar)) {
                nVar.f7743a.p().k(iVar);
            }
        }
        n.b d10 = nVar.d(map2);
        Map<i, m> map3 = d10.f7757a;
        q g10 = nVar.f7750i.g();
        if (!qVar.equals(q.f8701b)) {
            x6.b.Z("Watch stream reverted to previous snapshot?? (%s < %s)", qVar.compareTo(g10) >= 0, qVar, g10);
            nVar.f7750i.j(qVar);
        }
        return nVar.f.e(map3, d10.f7758b);
    }
}
