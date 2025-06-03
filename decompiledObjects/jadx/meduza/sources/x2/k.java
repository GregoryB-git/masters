package x2;

import android.database.Cursor;
import java.util.ArrayList;
import p2.m0;

/* loaded from: classes.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16816a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16817b;

    /* renamed from: c, reason: collision with root package name */
    public final b f16818c;

    /* renamed from: d, reason: collision with root package name */
    public final c f16819d;

    public class a extends p1.d {
        public a(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            String str = ((i) obj).f16813a;
            if (str == null) {
                fVar.d0(1);
            } else {
                fVar.n(1, str);
            }
            fVar.F(2, r5.f16814b);
            fVar.F(3, r5.f16815c);
        }
    }

    public class b extends p1.p {
        public b(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    public class c extends p1.p {
        public c(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public k(p1.j jVar) {
        this.f16816a = jVar;
        this.f16817b = new a(jVar);
        this.f16818c = new b(jVar);
        this.f16819d = new c(jVar);
    }

    @Override // x2.j
    public final ArrayList a() {
        p1.l C = p1.l.C(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        this.f16816a.b();
        Cursor o10 = b.z.o(this.f16816a, C, false);
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

    @Override // x2.j
    public final void b(l lVar) {
        g(lVar.f16821b, lVar.f16820a);
    }

    @Override // x2.j
    public final i c(l lVar) {
        ec.i.e(lVar, "id");
        return f(lVar.f16821b, lVar.f16820a);
    }

    @Override // x2.j
    public final void d(i iVar) {
        this.f16816a.b();
        this.f16816a.c();
        try {
            this.f16817b.f(iVar);
            this.f16816a.n();
        } finally {
            this.f16816a.j();
        }
    }

    @Override // x2.j
    public final void e(String str) {
        this.f16816a.b();
        t1.f a10 = this.f16819d.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        this.f16816a.c();
        try {
            a10.p();
            this.f16816a.n();
        } finally {
            this.f16816a.j();
            this.f16819d.d(a10);
        }
    }

    public final i f(int i10, String str) {
        p1.l C = p1.l.C(2, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        C.F(2, i10);
        this.f16816a.b();
        i iVar = null;
        String string = null;
        Cursor o10 = b.z.o(this.f16816a, C, false);
        try {
            int J = m0.J(o10, "work_spec_id");
            int J2 = m0.J(o10, "generation");
            int J3 = m0.J(o10, "system_id");
            if (o10.moveToFirst()) {
                if (!o10.isNull(J)) {
                    string = o10.getString(J);
                }
                iVar = new i(string, o10.getInt(J2), o10.getInt(J3));
            }
            return iVar;
        } finally {
            o10.close();
            C.H();
        }
    }

    public final void g(int i10, String str) {
        this.f16816a.b();
        t1.f a10 = this.f16818c.a();
        if (str == null) {
            a10.d0(1);
        } else {
            a10.n(1, str);
        }
        a10.F(2, i10);
        this.f16816a.c();
        try {
            a10.p();
            this.f16816a.n();
        } finally {
            this.f16816a.j();
            this.f16818c.d(a10);
        }
    }
}
