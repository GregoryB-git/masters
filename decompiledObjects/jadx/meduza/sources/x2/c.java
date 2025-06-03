package x2;

import android.database.Cursor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16807a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16808b;

    public class a extends p1.d {
        public a(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            x2.a aVar = (x2.a) obj;
            String str = aVar.f16805a;
            if (str == null) {
                fVar.d0(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = aVar.f16806b;
            if (str2 == null) {
                fVar.d0(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public c(p1.j jVar) {
        this.f16807a = jVar;
        this.f16808b = new a(jVar);
    }

    @Override // x2.b
    public final ArrayList a(String str) {
        p1.l C = p1.l.C(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16807a.b();
        Cursor o10 = b.z.o(this.f16807a, C, false);
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

    @Override // x2.b
    public final void b(x2.a aVar) {
        this.f16807a.b();
        this.f16807a.c();
        try {
            this.f16808b.f(aVar);
            this.f16807a.n();
        } finally {
            this.f16807a.j();
        }
    }

    @Override // x2.b
    public final boolean c(String str) {
        p1.l C = p1.l.C(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16807a.b();
        boolean z10 = false;
        Cursor o10 = b.z.o(this.f16807a, C, false);
        try {
            if (o10.moveToFirst()) {
                z10 = o10.getInt(0) != 0;
            }
            return z10;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.b
    public final boolean d(String str) {
        p1.l C = p1.l.C(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16807a.b();
        boolean z10 = false;
        Cursor o10 = b.z.o(this.f16807a, C, false);
        try {
            if (o10.moveToFirst()) {
                z10 = o10.getInt(0) != 0;
            }
            return z10;
        } finally {
            o10.close();
            C.H();
        }
    }
}
