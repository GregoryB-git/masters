package x2;

import android.database.Cursor;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import o2.c;
import o2.o;
import p2.m0;
import x2.s;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16869a;

    /* renamed from: b, reason: collision with root package name */
    public final i f16870b;

    /* renamed from: c, reason: collision with root package name */
    public final k f16871c;

    /* renamed from: d, reason: collision with root package name */
    public final l f16872d;

    /* renamed from: e, reason: collision with root package name */
    public final m f16873e;
    public final n f;

    /* renamed from: g, reason: collision with root package name */
    public final o f16874g;

    /* renamed from: h, reason: collision with root package name */
    public final p f16875h;

    /* renamed from: i, reason: collision with root package name */
    public final q f16876i;

    /* renamed from: j, reason: collision with root package name */
    public final a f16877j;

    /* renamed from: k, reason: collision with root package name */
    public final c f16878k;

    /* renamed from: l, reason: collision with root package name */
    public final d f16879l;

    /* renamed from: m, reason: collision with root package name */
    public final e f16880m;

    /* renamed from: n, reason: collision with root package name */
    public final h f16881n;

    public class a extends p1.p {
        public a(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class b extends p1.p {
        public b(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    public class c extends p1.p {
        public c(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    public class d extends p1.p {
        public d(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class e extends p1.p {
        public e(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class f extends p1.p {
        public f(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public class g extends p1.p {
        public g(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    public class h extends p1.p {
        public h(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    public class i extends p1.d {
        public i(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            int i10;
            int i11;
            byte[] byteArray;
            s sVar = (s) obj;
            String str = sVar.f16830a;
            int i12 = 1;
            if (str == null) {
                fVar.d0(1);
            } else {
                fVar.n(1, str);
            }
            fVar.F(2, z.f(sVar.f16831b));
            String str2 = sVar.f16832c;
            if (str2 == null) {
                fVar.d0(3);
            } else {
                fVar.n(3, str2);
            }
            String str3 = sVar.f16833d;
            if (str3 == null) {
                fVar.d0(4);
            } else {
                fVar.n(4, str3);
            }
            byte[] e10 = androidx.work.c.e(sVar.f16834e);
            if (e10 == null) {
                fVar.d0(5);
            } else {
                fVar.T(e10, 5);
            }
            byte[] e11 = androidx.work.c.e(sVar.f);
            if (e11 == null) {
                fVar.d0(6);
            } else {
                fVar.T(e11, 6);
            }
            fVar.F(7, sVar.f16835g);
            fVar.F(8, sVar.f16836h);
            fVar.F(9, sVar.f16837i);
            fVar.F(10, sVar.f16839k);
            int i13 = sVar.f16840l;
            a0.j.p(i13, "backoffPolicy");
            int c10 = q0.g.c(i13);
            if (c10 == 0) {
                i10 = 0;
            } else {
                if (c10 != 1) {
                    throw new n7.w();
                }
                i10 = 1;
            }
            fVar.F(11, i10);
            fVar.F(12, sVar.f16841m);
            fVar.F(13, sVar.f16842n);
            fVar.F(14, sVar.f16843o);
            fVar.F(15, sVar.f16844p);
            fVar.F(16, sVar.f16845q ? 1L : 0L);
            int i14 = sVar.f16846r;
            a0.j.p(i14, "policy");
            int c11 = q0.g.c(i14);
            if (c11 == 0) {
                i11 = 0;
            } else {
                if (c11 != 1) {
                    throw new n7.w();
                }
                i11 = 1;
            }
            fVar.F(17, i11);
            fVar.F(18, sVar.f16847s);
            fVar.F(19, sVar.t);
            fVar.F(20, sVar.f16848u);
            fVar.F(21, sVar.f16849v);
            fVar.F(22, sVar.f16850w);
            o2.c cVar = sVar.f16838j;
            if (cVar == null) {
                fVar.d0(23);
                fVar.d0(24);
                fVar.d0(25);
                fVar.d0(26);
                fVar.d0(27);
                fVar.d0(28);
                fVar.d0(29);
                fVar.d0(30);
                return;
            }
            int i15 = cVar.f11703a;
            a0.j.p(i15, "networkType");
            int c12 = q0.g.c(i15);
            if (c12 == 0) {
                i12 = 0;
            } else if (c12 != 1) {
                if (c12 == 2) {
                    i12 = 2;
                } else if (c12 == 3) {
                    i12 = 3;
                } else if (c12 == 4) {
                    i12 = 4;
                } else {
                    if (Build.VERSION.SDK_INT < 30 || i15 != 6) {
                        StringBuilder l10 = defpackage.f.l("Could not convert ");
                        l10.append(a0.j.x(i15));
                        l10.append(" to int");
                        throw new IllegalArgumentException(l10.toString());
                    }
                    i12 = 5;
                }
            }
            fVar.F(23, i12);
            fVar.F(24, cVar.f11704b ? 1L : 0L);
            fVar.F(25, cVar.f11705c ? 1L : 0L);
            fVar.F(26, cVar.f11706d ? 1L : 0L);
            fVar.F(27, cVar.f11707e ? 1L : 0L);
            fVar.F(28, cVar.f);
            fVar.F(29, cVar.f11708g);
            Set<c.a> set = cVar.f11709h;
            ec.i.e(set, "triggers");
            if (set.isEmpty()) {
                byteArray = new byte[0];
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeInt(set.size());
                        for (c.a aVar : set) {
                            objectOutputStream.writeUTF(aVar.f11710a.toString());
                            objectOutputStream.writeBoolean(aVar.f11711b);
                        }
                        rb.h hVar = rb.h.f13851a;
                        x6.b.L(objectOutputStream, null);
                        x6.b.L(byteArrayOutputStream, null);
                        byteArray = byteArrayOutputStream.toByteArray();
                        ec.i.d(byteArray, "outputStream.toByteArray()");
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        x6.b.L(byteArrayOutputStream, th);
                        throw th2;
                    }
                }
            }
            fVar.T(byteArray, 30);
        }
    }

    public class j extends p1.d {
        public j(p1.j jVar) {
            super(jVar, 0);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    public class k extends p1.p {
        public k(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class l extends p1.p {
        public l(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    public class m extends p1.p {
        public m(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    public class n extends p1.p {
        public n(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    public class o extends p1.p {
        public o(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class p extends p1.p {
        public p(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    public class q extends p1.p {
        public q(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public u(p1.j jVar) {
        this.f16869a = jVar;
        this.f16870b = new i(jVar);
        new j(jVar);
        this.f16871c = new k(jVar);
        this.f16872d = new l(jVar);
        this.f16873e = new m(jVar);
        this.f = new n(jVar);
        this.f16874g = new o(jVar);
        this.f16875h = new p(jVar);
        this.f16876i = new q(jVar);
        this.f16877j = new a(jVar);
        new b(jVar);
        this.f16878k = new c(jVar);
        this.f16879l = new d(jVar);
        this.f16880m = new e(jVar);
        new f(jVar);
        new g(jVar);
        this.f16881n = new h(jVar);
    }

    @Override // x2.t
    public final int A() {
        p1.l C = p1.l.C(0, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            return o10.moveToFirst() ? o10.getInt(0) : 0;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final int B() {
        this.f16869a.b();
        t1.f a10 = this.f16880m.a();
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16880m.d(a10);
        }
    }

    public final void C(HashMap<String, ArrayList<androidx.work.c>> hashMap) {
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap<String, ArrayList<androidx.work.c>> hashMap2 = new HashMap<>(999);
            loop0: while (true) {
                i10 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, hashMap.get(str));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                C(hashMap2);
                hashMap2 = new HashMap<>(999);
            }
            if (i10 > 0) {
                C(hashMap2);
                return;
            }
            return;
        }
        StringBuilder l10 = defpackage.f.l("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        x6.b.f(size, l10);
        l10.append(")");
        p1.l C = p1.l.C(size + 0, l10.toString());
        int i11 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                C.d0(i11);
            } else {
                C.n(i11, str2);
            }
            i11++;
        }
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            int I = m0.I(o10, "work_spec_id");
            if (I == -1) {
                return;
            }
            while (o10.moveToNext()) {
                ArrayList<androidx.work.c> arrayList = hashMap.get(o10.getString(I));
                if (arrayList != null) {
                    arrayList.add(androidx.work.c.a(o10.isNull(0) ? null : o10.getBlob(0)));
                }
            }
        } finally {
            o10.close();
        }
    }

    public final void D(HashMap<String, ArrayList<String>> hashMap) {
        int i10;
        Set<String> keySet = hashMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (hashMap.size() > 999) {
            HashMap<String, ArrayList<String>> hashMap2 = new HashMap<>(999);
            loop0: while (true) {
                i10 = 0;
                for (String str : keySet) {
                    hashMap2.put(str, hashMap.get(str));
                    i10++;
                    if (i10 == 999) {
                        break;
                    }
                }
                D(hashMap2);
                hashMap2 = new HashMap<>(999);
            }
            if (i10 > 0) {
                D(hashMap2);
                return;
            }
            return;
        }
        StringBuilder l10 = defpackage.f.l("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = keySet.size();
        x6.b.f(size, l10);
        l10.append(")");
        p1.l C = p1.l.C(size + 0, l10.toString());
        int i11 = 1;
        for (String str2 : keySet) {
            if (str2 == null) {
                C.d0(i11);
            } else {
                C.n(i11, str2);
            }
            i11++;
        }
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            int I = m0.I(o10, "work_spec_id");
            if (I == -1) {
                return;
            }
            while (o10.moveToNext()) {
                ArrayList<String> arrayList = hashMap.get(o10.getString(I));
                if (arrayList != null) {
                    arrayList.add(o10.isNull(0) ? null : o10.getString(0));
                }
            }
        } finally {
            o10.close();
        }
    }

    @Override // x2.t
    public final void a(String str) {
        this.f16869a.b();
        t1.f a10 = this.f16871c.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f16871c.d(a10);
        }
    }

    @Override // x2.t
    public final void b(s sVar) {
        this.f16869a.b();
        this.f16869a.c();
        try {
            this.f16870b.f(sVar);
            this.f16869a.n();
        } finally {
            this.f16869a.j();
        }
    }

    @Override // x2.t
    public final ArrayList c() {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        C.F(1, 200);
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i15 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i16 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                int i17 = i15;
                long j15 = o10.getLong(i17);
                int i18 = J12;
                int i19 = J15;
                long j16 = o10.getLong(i19);
                J15 = i19;
                int i20 = J16;
                if (o10.getInt(i20) != 0) {
                    J16 = i20;
                    i10 = J17;
                    z10 = true;
                } else {
                    J16 = i20;
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                J17 = i10;
                int i21 = J18;
                int i22 = o10.getInt(i21);
                J18 = i21;
                int i23 = J19;
                int i24 = o10.getInt(i23);
                J19 = i23;
                int i25 = J20;
                long j17 = o10.getLong(i25);
                J20 = i25;
                int i26 = J21;
                int i27 = o10.getInt(i26);
                J21 = i26;
                int i28 = J22;
                int i29 = o10.getInt(i28);
                J22 = i28;
                int i30 = J23;
                int c10 = z.c(o10.getInt(i30));
                J23 = i30;
                int i31 = J24;
                if (o10.getInt(i31) != 0) {
                    J24 = i31;
                    i11 = J25;
                    z11 = true;
                } else {
                    J24 = i31;
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    J25 = i11;
                    i12 = J26;
                    z12 = true;
                } else {
                    J25 = i11;
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J26 = i12;
                    i13 = J27;
                    z13 = true;
                } else {
                    J26 = i12;
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J27 = i13;
                    i14 = J28;
                    z14 = true;
                } else {
                    J27 = i13;
                    i14 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i14);
                J28 = i14;
                int i32 = J29;
                long j19 = o10.getLong(i32);
                J29 = i32;
                int i33 = J30;
                if (!o10.isNull(i33)) {
                    bArr = o10.getBlob(i33);
                }
                J30 = i33;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(bArr)), i16, b10, j13, j14, j15, j16, z10, d10, i22, i24, j17, i27, i29));
                J12 = i18;
                i15 = i17;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final void d(String str) {
        this.f16869a.b();
        t1.f a10 = this.f.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f.d(a10);
        }
    }

    @Override // x2.t
    public final int e(o.b bVar, String str) {
        this.f16869a.b();
        t1.f a10 = this.f16872d.a();
        a10.F(1, z.f(bVar));
        if (str == null) {
            a10.d0(2);
        } else {
            a10.n(2, str);
        }
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16872d.d(a10);
        }
    }

    @Override // x2.t
    public final int f(String str, long j10) {
        this.f16869a.b();
        t1.f a10 = this.f16879l.a();
        a10.F(1, j10);
        if (str == null) {
            a10.d0(2);
        } else {
            a10.n(2, str);
        }
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16879l.d(a10);
        }
    }

    @Override // x2.t
    public final ArrayList g(String str) {
        p1.l C = p1.l.C(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                arrayList.add(new s.b(z.e(o10.getInt(1)), o10.isNull(0) ? null : o10.getString(0)));
            }
            return arrayList;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final ArrayList h(long j10) {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(1, "SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
        C.F(1, j10);
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i15 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j11 = o10.getLong(J7);
                long j12 = o10.getLong(J8);
                long j13 = o10.getLong(J9);
                int i16 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j14 = o10.getLong(J12);
                long j15 = o10.getLong(J13);
                int i17 = i15;
                long j16 = o10.getLong(i17);
                int i18 = J12;
                int i19 = J15;
                long j17 = o10.getLong(i19);
                J15 = i19;
                int i20 = J16;
                if (o10.getInt(i20) != 0) {
                    J16 = i20;
                    i10 = J17;
                    z10 = true;
                } else {
                    J16 = i20;
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                J17 = i10;
                int i21 = J18;
                int i22 = o10.getInt(i21);
                J18 = i21;
                int i23 = J19;
                int i24 = o10.getInt(i23);
                J19 = i23;
                int i25 = J20;
                long j18 = o10.getLong(i25);
                J20 = i25;
                int i26 = J21;
                int i27 = o10.getInt(i26);
                J21 = i26;
                int i28 = J22;
                int i29 = o10.getInt(i28);
                J22 = i28;
                int i30 = J23;
                int c10 = z.c(o10.getInt(i30));
                J23 = i30;
                int i31 = J24;
                if (o10.getInt(i31) != 0) {
                    J24 = i31;
                    i11 = J25;
                    z11 = true;
                } else {
                    J24 = i31;
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    J25 = i11;
                    i12 = J26;
                    z12 = true;
                } else {
                    J25 = i11;
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J26 = i12;
                    i13 = J27;
                    z13 = true;
                } else {
                    J26 = i12;
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J27 = i13;
                    i14 = J28;
                    z14 = true;
                } else {
                    J27 = i13;
                    i14 = J28;
                    z14 = false;
                }
                long j19 = o10.getLong(i14);
                J28 = i14;
                int i32 = J29;
                long j20 = o10.getLong(i32);
                J29 = i32;
                int i33 = J30;
                if (!o10.isNull(i33)) {
                    bArr = o10.getBlob(i33);
                }
                J30 = i33;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j11, j12, j13, new o2.c(c10, z11, z12, z13, z14, j19, j20, z.a(bArr)), i16, b10, j14, j15, j16, j17, z10, d10, i22, i24, j18, i27, i29));
                J12 = i18;
                i15 = i17;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final ArrayList i(int i10) {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        p1.l C = p1.l.C(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
        C.F(1, i10);
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i16 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i17 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                int i18 = i16;
                long j15 = o10.getLong(i18);
                int i19 = J12;
                int i20 = J15;
                long j16 = o10.getLong(i20);
                J15 = i20;
                int i21 = J16;
                if (o10.getInt(i21) != 0) {
                    J16 = i21;
                    i11 = J17;
                    z10 = true;
                } else {
                    J16 = i21;
                    i11 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i11));
                J17 = i11;
                int i22 = J18;
                int i23 = o10.getInt(i22);
                J18 = i22;
                int i24 = J19;
                int i25 = o10.getInt(i24);
                J19 = i24;
                int i26 = J20;
                long j17 = o10.getLong(i26);
                J20 = i26;
                int i27 = J21;
                int i28 = o10.getInt(i27);
                J21 = i27;
                int i29 = J22;
                int i30 = o10.getInt(i29);
                J22 = i29;
                int i31 = J23;
                int c10 = z.c(o10.getInt(i31));
                J23 = i31;
                int i32 = J24;
                if (o10.getInt(i32) != 0) {
                    J24 = i32;
                    i12 = J25;
                    z11 = true;
                } else {
                    J24 = i32;
                    i12 = J25;
                    z11 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J25 = i12;
                    i13 = J26;
                    z12 = true;
                } else {
                    J25 = i12;
                    i13 = J26;
                    z12 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J26 = i13;
                    i14 = J27;
                    z13 = true;
                } else {
                    J26 = i13;
                    i14 = J27;
                    z13 = false;
                }
                if (o10.getInt(i14) != 0) {
                    J27 = i14;
                    i15 = J28;
                    z14 = true;
                } else {
                    J27 = i14;
                    i15 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i15);
                J28 = i15;
                int i33 = J29;
                long j19 = o10.getLong(i33);
                J29 = i33;
                int i34 = J30;
                if (!o10.isNull(i34)) {
                    bArr = o10.getBlob(i34);
                }
                J30 = i34;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(bArr)), i17, b10, j13, j14, j15, j16, z10, d10, i23, i25, j17, i28, i30));
                J12 = i19;
                i16 = i18;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final void j(int i10, String str) {
        this.f16869a.b();
        t1.f a10 = this.f16878k.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        a10.F(2, i10);
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f16878k.d(a10);
        }
    }

    @Override // x2.t
    public final ArrayList k() {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i15 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i16 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                int i17 = i15;
                long j15 = o10.getLong(i17);
                int i18 = J13;
                int i19 = J15;
                long j16 = o10.getLong(i19);
                J15 = i19;
                int i20 = J16;
                if (o10.getInt(i20) != 0) {
                    J16 = i20;
                    i10 = J17;
                    z10 = true;
                } else {
                    J16 = i20;
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                J17 = i10;
                int i21 = J18;
                int i22 = o10.getInt(i21);
                J18 = i21;
                int i23 = J19;
                int i24 = o10.getInt(i23);
                J19 = i23;
                int i25 = J20;
                long j17 = o10.getLong(i25);
                J20 = i25;
                int i26 = J21;
                int i27 = o10.getInt(i26);
                J21 = i26;
                int i28 = J22;
                int i29 = o10.getInt(i28);
                J22 = i28;
                int i30 = J23;
                int c10 = z.c(o10.getInt(i30));
                J23 = i30;
                int i31 = J24;
                if (o10.getInt(i31) != 0) {
                    J24 = i31;
                    i11 = J25;
                    z11 = true;
                } else {
                    J24 = i31;
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    J25 = i11;
                    i12 = J26;
                    z12 = true;
                } else {
                    J25 = i11;
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J26 = i12;
                    i13 = J27;
                    z13 = true;
                } else {
                    J26 = i12;
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J27 = i13;
                    i14 = J28;
                    z14 = true;
                } else {
                    J27 = i13;
                    i14 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i14);
                J28 = i14;
                int i32 = J29;
                long j19 = o10.getLong(i32);
                J29 = i32;
                int i33 = J30;
                if (!o10.isNull(i33)) {
                    bArr = o10.getBlob(i33);
                }
                J30 = i33;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(bArr)), i16, b10, j13, j14, j15, j16, z10, d10, i22, i24, j17, i27, i29));
                J13 = i18;
                i15 = i17;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final void l(String str, androidx.work.c cVar) {
        this.f16869a.b();
        t1.f a10 = this.f16874g.a();
        byte[] e10 = androidx.work.c.e(cVar);
        if (e10 == null) {
            a10.d0(1);
        } else {
            a10.T(e10, 1);
        }
        if (str == null) {
            a10.d0(2);
        } else {
            a10.n(2, str);
        }
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f16874g.d(a10);
        }
    }

    @Override // x2.t
    public final void m(String str, long j10) {
        this.f16869a.b();
        t1.f a10 = this.f16875h.a();
        a10.F(1, j10);
        if (str == null) {
            a10.d0(2);
        } else {
            a10.n(2, str);
        }
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f16875h.d(a10);
        }
    }

    @Override // x2.t
    public final ArrayList n() {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(0, "SELECT * FROM workspec WHERE state=1");
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i15 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i16 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                int i17 = i15;
                long j15 = o10.getLong(i17);
                int i18 = J13;
                int i19 = J15;
                long j16 = o10.getLong(i19);
                J15 = i19;
                int i20 = J16;
                if (o10.getInt(i20) != 0) {
                    J16 = i20;
                    i10 = J17;
                    z10 = true;
                } else {
                    J16 = i20;
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                J17 = i10;
                int i21 = J18;
                int i22 = o10.getInt(i21);
                J18 = i21;
                int i23 = J19;
                int i24 = o10.getInt(i23);
                J19 = i23;
                int i25 = J20;
                long j17 = o10.getLong(i25);
                J20 = i25;
                int i26 = J21;
                int i27 = o10.getInt(i26);
                J21 = i26;
                int i28 = J22;
                int i29 = o10.getInt(i28);
                J22 = i28;
                int i30 = J23;
                int c10 = z.c(o10.getInt(i30));
                J23 = i30;
                int i31 = J24;
                if (o10.getInt(i31) != 0) {
                    J24 = i31;
                    i11 = J25;
                    z11 = true;
                } else {
                    J24 = i31;
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    J25 = i11;
                    i12 = J26;
                    z12 = true;
                } else {
                    J25 = i11;
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J26 = i12;
                    i13 = J27;
                    z13 = true;
                } else {
                    J26 = i12;
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J27 = i13;
                    i14 = J28;
                    z14 = true;
                } else {
                    J27 = i13;
                    i14 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i14);
                J28 = i14;
                int i32 = J29;
                long j19 = o10.getLong(i32);
                J29 = i32;
                int i33 = J30;
                if (!o10.isNull(i33)) {
                    bArr = o10.getBlob(i33);
                }
                J30 = i33;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(bArr)), i16, b10, j13, j14, j15, j16, z10, d10, i22, i24, j17, i27, i29));
                J13 = i18;
                i15 = i17;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final void o(int i10, String str) {
        this.f16869a.b();
        t1.f a10 = this.f16881n.a();
        a10.F(1, i10);
        if (str == null) {
            a10.d0(2);
        } else {
            a10.n(2, str);
        }
        this.f16869a.c();
        try {
            a10.p();
            this.f16869a.n();
        } finally {
            this.f16869a.j();
            this.f16881n.d(a10);
        }
    }

    @Override // x2.t
    public final boolean p() {
        boolean z10 = false;
        p1.l C = p1.l.C(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            if (o10.moveToFirst()) {
                if (o10.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final ArrayList q(String str) {
        p1.l C = p1.l.C(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                arrayList.add(o10.isNull(0) ? null : o10.getString(0));
            }
            return arrayList;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final ArrayList r() {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            int i15 = J14;
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                byte[] bArr = null;
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i16 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                int i17 = i15;
                long j15 = o10.getLong(i17);
                int i18 = J13;
                int i19 = J15;
                long j16 = o10.getLong(i19);
                J15 = i19;
                int i20 = J16;
                if (o10.getInt(i20) != 0) {
                    J16 = i20;
                    i10 = J17;
                    z10 = true;
                } else {
                    J16 = i20;
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                J17 = i10;
                int i21 = J18;
                int i22 = o10.getInt(i21);
                J18 = i21;
                int i23 = J19;
                int i24 = o10.getInt(i23);
                J19 = i23;
                int i25 = J20;
                long j17 = o10.getLong(i25);
                J20 = i25;
                int i26 = J21;
                int i27 = o10.getInt(i26);
                J21 = i26;
                int i28 = J22;
                int i29 = o10.getInt(i28);
                J22 = i28;
                int i30 = J23;
                int c10 = z.c(o10.getInt(i30));
                J23 = i30;
                int i31 = J24;
                if (o10.getInt(i31) != 0) {
                    J24 = i31;
                    i11 = J25;
                    z11 = true;
                } else {
                    J24 = i31;
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    J25 = i11;
                    i12 = J26;
                    z12 = true;
                } else {
                    J25 = i11;
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    J26 = i12;
                    i13 = J27;
                    z13 = true;
                } else {
                    J26 = i12;
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    J27 = i13;
                    i14 = J28;
                    z14 = true;
                } else {
                    J27 = i13;
                    i14 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i14);
                J28 = i14;
                int i32 = J29;
                long j19 = o10.getLong(i32);
                J29 = i32;
                int i33 = J30;
                if (!o10.isNull(i33)) {
                    bArr = o10.getBlob(i33);
                }
                J30 = i33;
                arrayList.add(new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(bArr)), i16, b10, j13, j14, j15, j16, z10, d10, i22, i24, j17, i27, i29));
                J13 = i18;
                i15 = i17;
            }
            o10.close();
            lVar.H();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final o.b s(String str) {
        p1.l C = p1.l.C(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        o.b bVar = null;
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            if (o10.moveToFirst()) {
                Integer valueOf = o10.isNull(0) ? null : Integer.valueOf(o10.getInt(0));
                if (valueOf != null) {
                    bVar = z.e(valueOf.intValue());
                }
            }
            return bVar;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final s t(String str) {
        p1.l lVar;
        int J;
        int J2;
        int J3;
        int J4;
        int J5;
        int J6;
        int J7;
        int J8;
        int J9;
        int J10;
        int J11;
        int J12;
        int J13;
        int J14;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        boolean z14;
        p1.l C = p1.l.C(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            J = m0.J(o10, "id");
            J2 = m0.J(o10, "state");
            J3 = m0.J(o10, "worker_class_name");
            J4 = m0.J(o10, "input_merger_class_name");
            J5 = m0.J(o10, "input");
            J6 = m0.J(o10, "output");
            J7 = m0.J(o10, "initial_delay");
            J8 = m0.J(o10, "interval_duration");
            J9 = m0.J(o10, "flex_duration");
            J10 = m0.J(o10, "run_attempt_count");
            J11 = m0.J(o10, "backoff_policy");
            J12 = m0.J(o10, "backoff_delay_duration");
            J13 = m0.J(o10, "last_enqueue_time");
            J14 = m0.J(o10, "minimum_retention_duration");
            lVar = C;
        } catch (Throwable th) {
            th = th;
            lVar = C;
        }
        try {
            int J15 = m0.J(o10, "schedule_requested_at");
            int J16 = m0.J(o10, "run_in_foreground");
            int J17 = m0.J(o10, "out_of_quota_policy");
            int J18 = m0.J(o10, "period_count");
            int J19 = m0.J(o10, "generation");
            int J20 = m0.J(o10, "next_schedule_time_override");
            int J21 = m0.J(o10, "next_schedule_time_override_generation");
            int J22 = m0.J(o10, "stop_reason");
            int J23 = m0.J(o10, "required_network_type");
            int J24 = m0.J(o10, "requires_charging");
            int J25 = m0.J(o10, "requires_device_idle");
            int J26 = m0.J(o10, "requires_battery_not_low");
            int J27 = m0.J(o10, "requires_storage_not_low");
            int J28 = m0.J(o10, "trigger_content_update_delay");
            int J29 = m0.J(o10, "trigger_max_content_delay");
            int J30 = m0.J(o10, "content_uri_triggers");
            s sVar = null;
            byte[] blob = null;
            if (o10.moveToFirst()) {
                String string = o10.isNull(J) ? null : o10.getString(J);
                o.b e10 = z.e(o10.getInt(J2));
                String string2 = o10.isNull(J3) ? null : o10.getString(J3);
                String string3 = o10.isNull(J4) ? null : o10.getString(J4);
                androidx.work.c a10 = androidx.work.c.a(o10.isNull(J5) ? null : o10.getBlob(J5));
                androidx.work.c a11 = androidx.work.c.a(o10.isNull(J6) ? null : o10.getBlob(J6));
                long j10 = o10.getLong(J7);
                long j11 = o10.getLong(J8);
                long j12 = o10.getLong(J9);
                int i15 = o10.getInt(J10);
                int b10 = z.b(o10.getInt(J11));
                long j13 = o10.getLong(J12);
                long j14 = o10.getLong(J13);
                long j15 = o10.getLong(J14);
                long j16 = o10.getLong(J15);
                if (o10.getInt(J16) != 0) {
                    i10 = J17;
                    z10 = true;
                } else {
                    i10 = J17;
                    z10 = false;
                }
                int d10 = z.d(o10.getInt(i10));
                int i16 = o10.getInt(J18);
                int i17 = o10.getInt(J19);
                long j17 = o10.getLong(J20);
                int i18 = o10.getInt(J21);
                int i19 = o10.getInt(J22);
                int c10 = z.c(o10.getInt(J23));
                if (o10.getInt(J24) != 0) {
                    i11 = J25;
                    z11 = true;
                } else {
                    i11 = J25;
                    z11 = false;
                }
                if (o10.getInt(i11) != 0) {
                    i12 = J26;
                    z12 = true;
                } else {
                    i12 = J26;
                    z12 = false;
                }
                if (o10.getInt(i12) != 0) {
                    i13 = J27;
                    z13 = true;
                } else {
                    i13 = J27;
                    z13 = false;
                }
                if (o10.getInt(i13) != 0) {
                    i14 = J28;
                    z14 = true;
                } else {
                    i14 = J28;
                    z14 = false;
                }
                long j18 = o10.getLong(i14);
                long j19 = o10.getLong(J29);
                if (!o10.isNull(J30)) {
                    blob = o10.getBlob(J30);
                }
                sVar = new s(string, e10, string2, string3, a10, a11, j10, j11, j12, new o2.c(c10, z11, z12, z13, z14, j18, j19, z.a(blob)), i15, b10, j13, j14, j15, j16, z10, d10, i16, i17, j17, i18, i19);
            }
            o10.close();
            lVar.H();
            return sVar;
        } catch (Throwable th2) {
            th = th2;
            o10.close();
            lVar.H();
            throw th;
        }
    }

    @Override // x2.t
    public final int u(String str) {
        this.f16869a.b();
        t1.f a10 = this.f16877j.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16877j.d(a10);
        }
    }

    @Override // x2.t
    public final p1.n v(List list) {
        StringBuilder l10 = defpackage.f.l("SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        x6.b.f(size, l10);
        l10.append(")");
        p1.l C = p1.l.C(size + 0, l10.toString());
        Iterator it = list.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null) {
                C.d0(i10);
            } else {
                C.n(i10, str);
            }
            i10++;
        }
        p1.e eVar = this.f16869a.f12796e;
        v vVar = new v(this, C);
        eVar.getClass();
        l.l lVar = eVar.f12775j;
        String[] d10 = eVar.d(new String[]{"WorkTag", "WorkProgress", "workspec"});
        for (String str2 : d10) {
            LinkedHashMap linkedHashMap = eVar.f12770d;
            Locale locale = Locale.US;
            ec.i.d(locale, "US");
            String lowerCase = str2.toLowerCase(locale);
            ec.i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!linkedHashMap.containsKey(lowerCase)) {
                throw new IllegalArgumentException(defpackage.g.d("There is no table with name ", str2).toString());
            }
        }
        lVar.getClass();
        return new p1.n((p1.j) lVar.f9390b, lVar, vVar, d10);
    }

    @Override // x2.t
    public final int w(String str) {
        this.f16869a.b();
        t1.f a10 = this.f16873e.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16873e.d(a10);
        }
    }

    @Override // x2.t
    public final ArrayList x(String str) {
        p1.l C = p1.l.C(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                arrayList.add(o10.isNull(0) ? null : o10.getString(0));
            }
            return arrayList;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final ArrayList y(String str) {
        p1.l C = p1.l.C(1, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16869a.b();
        Cursor o10 = b.z.o(this.f16869a, C, false);
        try {
            ArrayList arrayList = new ArrayList(o10.getCount());
            while (o10.moveToNext()) {
                arrayList.add(androidx.work.c.a(o10.isNull(0) ? null : o10.getBlob(0)));
            }
            return arrayList;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.t
    public final int z(String str) {
        this.f16869a.b();
        t1.f a10 = this.f16876i.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16869a.c();
        try {
            int p10 = a10.p();
            this.f16869a.n();
            return p10;
        } finally {
            this.f16869a.j();
            this.f16876i.d(a10);
        }
    }
}
