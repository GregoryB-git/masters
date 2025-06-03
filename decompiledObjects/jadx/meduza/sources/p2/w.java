package p2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12964a = o2.j.f("Schedulers");

    public static void a(x2.t tVar, m0 m0Var, List list) {
        if (list.size() > 0) {
            m0Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tVar.f(((x2.s) it.next()).f16830a, currentTimeMillis);
            }
        }
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<t> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        x2.t u10 = workDatabase.u();
        workDatabase.c();
        ArrayList arrayList = null;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                arrayList = u10.r();
                a(u10, aVar.f1444c, arrayList);
            }
            ArrayList i10 = u10.i(aVar.f1450j);
            a(u10, aVar.f1444c, i10);
            if (arrayList != null) {
                i10.addAll(arrayList);
            }
            ArrayList c10 = u10.c();
            workDatabase.n();
            workDatabase.j();
            if (i10.size() > 0) {
                x2.s[] sVarArr = (x2.s[]) i10.toArray(new x2.s[i10.size()]);
                for (t tVar : list) {
                    if (tVar.b()) {
                        tVar.e(sVarArr);
                    }
                }
            }
            if (c10.size() > 0) {
                x2.s[] sVarArr2 = (x2.s[]) c10.toArray(new x2.s[c10.size()]);
                for (t tVar2 : list) {
                    if (!tVar2.b()) {
                        tVar2.e(sVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
