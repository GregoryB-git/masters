package p2;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 extends ec.h implements dc.t<Context, androidx.work.a, a3.b, WorkDatabase, v2.n, r, List<? extends t>> {

    /* renamed from: a, reason: collision with root package name */
    public static final l0 f12887a = new l0();

    public l0() {
        super(6, m0.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);
    }

    public final List e(Object obj, Object obj2, a3.b bVar, WorkDatabase workDatabase, v2.n nVar, r rVar) {
        Context context = (Context) obj;
        androidx.work.a aVar = (androidx.work.a) obj2;
        ec.i.e(context, "p0");
        ec.i.e(aVar, "p1");
        String str = w.f12964a;
        s2.b bVar2 = new s2.b(context, workDatabase, aVar);
        y2.o.a(context, SystemJobService.class, true);
        o2.j.d().a(w.f12964a, "Created SystemJobScheduler and enabled SystemJobService");
        return va.a.g(bVar2, new q2.c(context, aVar, nVar, rVar, new i0(rVar, bVar), bVar));
    }
}
