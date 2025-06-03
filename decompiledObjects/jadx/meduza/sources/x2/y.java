package x2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16886a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16887b;

    public class a extends p1.d {
        public a(p1.j jVar) {
            super(jVar, 1);
        }

        @Override // p1.p
        public final String c() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // p1.d
        public final void e(t1.f fVar, Object obj) {
            w wVar = (w) obj;
            String str = wVar.f16884a;
            if (str == null) {
                fVar.d0(1);
            } else {
                fVar.n(1, str);
            }
            String str2 = wVar.f16885b;
            if (str2 == null) {
                fVar.d0(2);
            } else {
                fVar.n(2, str2);
            }
        }
    }

    public class b extends p1.p {
        public b(p1.j jVar) {
            super(jVar);
        }

        @Override // p1.p
        public final String c() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public y(p1.j jVar) {
        this.f16886a = jVar;
        this.f16887b = new a(jVar);
        new b(jVar);
    }

    @Override // x2.x
    public final ArrayList a(String str) {
        p1.l C = p1.l.C(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            C.d0(1);
        } else {
            C.n(1, str);
        }
        this.f16886a.b();
        Cursor o10 = b.z.o(this.f16886a, C, false);
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

    @Override // x2.x
    public final void b(String str, Set<String> set) {
        ec.i.e(set, "tags");
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            c(new w((String) it.next(), str));
        }
    }

    public final void c(w wVar) {
        this.f16886a.b();
        this.f16886a.c();
        try {
            this.f16887b.f(wVar);
            this.f16886a.n();
        } finally {
            this.f16886a.j();
        }
    }
}
