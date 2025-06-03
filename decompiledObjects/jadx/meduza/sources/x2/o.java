package x2;

import android.database.Cursor;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16824a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16825b;

    public class a extends p1.d {
        public a(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.f16822a;
            if (str == null) {
                fVar.d0(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = mVar.f16823b;
            if (str2 == null) {
                fVar.d0(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public o(p1.j jVar) {
        this.f16824a = jVar;
        this.f16825b = new a(jVar);
    }

    @Override // x2.n
    public final void a(m mVar) {
        this.f16824a.b();
        this.f16824a.c();
        try {
            this.f16825b.f(mVar);
            this.f16824a.n();
        } finally {
            this.f16824a.j();
        }
    }

    @Override // x2.n
    public final ArrayList b(String str) {
        p1.l C = p1.l.C(1, "SELECT name FROM workname WHERE work_spec_id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16824a.b();
        Cursor o10 = b.z.o(this.f16824a, C, false);
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
}
