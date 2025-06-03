package x2;

import androidx.work.impl.WorkDatabase;

/* loaded from: classes.dex */
public final class f extends p1.d {
    public f(WorkDatabase workDatabase) {
        super(workDatabase, 1);
    }

    @Override // p1.p
    public final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // p1.d
    public final void e(t1.f fVar, Object obj) {
        d dVar = (d) obj;
        String str = dVar.f16809a;
        if (str == null) {
            fVar.d0(1);
        } else {
            fVar.n(1, str);
        }
        Long l10 = dVar.f16810b;
        if (l10 == null) {
            fVar.d0(2);
        } else {
            fVar.F(2, l10.longValue());
        }
    }
}
