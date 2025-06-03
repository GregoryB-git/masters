package x2;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public final p1.j f16811a;

    /* renamed from: b, reason: collision with root package name */
    public final f f16812b;

    public g(WorkDatabase workDatabase) {
        this.f16811a = workDatabase;
        this.f16812b = new f(workDatabase);
    }

    @Override // x2.e
    public final Long a(String str) {
        p1.l C = p1.l.C(1, "SELECT long_value FROM Preference where `key`=?");
        C.n(1, str);
        this.f16811a.b();
        Long l10 = null;
        Cursor o10 = b.z.o(this.f16811a, C, false);
        try {
            if (o10.moveToFirst() && !o10.isNull(0)) {
                l10 = Long.valueOf(o10.getLong(0));
            }
            return l10;
        } finally {
            o10.close();
            C.H();
        }
    }

    @Override // x2.e
    public final void b(d dVar) {
        this.f16811a.b();
        this.f16811a.c();
        try {
            this.f16812b.f(dVar);
            this.f16811a.n();
        } finally {
            this.f16811a.j();
        }
    }
}
