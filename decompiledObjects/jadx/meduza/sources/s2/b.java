package s2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import b.a0;
import defpackage.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import o2.j;
import o2.o;
import p2.t;
import x2.i;
import x2.l;
import x2.s;

/* loaded from: classes.dex */
public final class b implements t {
    public static final String f = j.f("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f14152a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f14153b;

    /* renamed from: c, reason: collision with root package name */
    public final a f14154c;

    /* renamed from: d, reason: collision with root package name */
    public final WorkDatabase f14155d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.work.a f14156e;

    public b(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar2 = new a(context, aVar.f1444c);
        this.f14152a = context;
        this.f14153b = jobScheduler;
        this.f14154c = aVar2;
        this.f14155d = workDatabase;
        this.f14156e = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            j.d().c(f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler, String str) {
        ArrayList f10 = f(context, jobScheduler);
        if (f10 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = f10.iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            l g10 = g(jobInfo);
            if (g10 != null && str.equals(g10.f16820a)) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static ArrayList f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            j.d().c(f, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static l g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new l(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p2.t
    public final boolean b() {
        return true;
    }

    @Override // p2.t
    public final void c(String str) {
        ArrayList d10 = d(this.f14152a, this.f14153b, str);
        if (d10 == null || d10.isEmpty()) {
            return;
        }
        Iterator it = d10.iterator();
        while (it.hasNext()) {
            a(this.f14153b, ((Integer) it.next()).intValue());
        }
        this.f14155d.r().e(str);
    }

    @Override // p2.t
    public final void e(s... sVarArr) {
        int intValue;
        WorkDatabase workDatabase;
        ArrayList d10;
        int intValue2;
        final g.s sVar = new g.s(this.f14155d);
        for (s sVar2 : sVarArr) {
            this.f14155d.c();
            try {
                s t = this.f14155d.u().t(sVar2.f16830a);
                if (t == null) {
                    j.d().g(f, "Skipping scheduling " + sVar2.f16830a + " because it's no longer in the DB");
                    this.f14155d.n();
                } else {
                    if (t.f16831b != o.b.ENQUEUED) {
                        j.d().g(f, "Skipping scheduling " + sVar2.f16830a + " because it is no longer enqueued");
                        workDatabase = this.f14155d;
                    } else {
                        l s10 = a0.s(sVar2);
                        i c10 = this.f14155d.r().c(s10);
                        if (c10 != null) {
                            intValue = c10.f16815c;
                        } else {
                            this.f14156e.getClass();
                            final int i10 = this.f14156e.f1448h;
                            Object m10 = ((WorkDatabase) sVar.f5643b).m(new Callable() { // from class: y2.i

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ int f17381b = 0;

                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    g.s sVar3 = g.s.this;
                                    int i11 = this.f17381b;
                                    int i12 = i10;
                                    ec.i.e(sVar3, "this$0");
                                    int a10 = j.a((WorkDatabase) sVar3.f5643b, "next_job_scheduler_id");
                                    if (i11 <= a10 && a10 <= i12) {
                                        i11 = a10;
                                    } else {
                                        ((WorkDatabase) sVar3.f5643b).q().b(new x2.d("next_job_scheduler_id", Long.valueOf(i11 + 1)));
                                    }
                                    return Integer.valueOf(i11);
                                }
                            });
                            ec.i.d(m10, "workDatabase.runInTransa…            id\n        })");
                            intValue = ((Number) m10).intValue();
                        }
                        if (c10 == null) {
                            this.f14155d.r().d(new i(s10.f16820a, s10.f16821b, intValue));
                        }
                        h(sVar2, intValue);
                        if (Build.VERSION.SDK_INT == 23 && (d10 = d(this.f14152a, this.f14153b, sVar2.f16830a)) != null) {
                            int indexOf = d10.indexOf(Integer.valueOf(intValue));
                            if (indexOf >= 0) {
                                d10.remove(indexOf);
                            }
                            if (d10.isEmpty()) {
                                this.f14156e.getClass();
                                final int i11 = this.f14156e.f1448h;
                                Object m11 = ((WorkDatabase) sVar.f5643b).m(new Callable() { // from class: y2.i

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f17381b = 0;

                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        g.s sVar3 = g.s.this;
                                        int i112 = this.f17381b;
                                        int i12 = i11;
                                        ec.i.e(sVar3, "this$0");
                                        int a10 = j.a((WorkDatabase) sVar3.f5643b, "next_job_scheduler_id");
                                        if (i112 <= a10 && a10 <= i12) {
                                            i112 = a10;
                                        } else {
                                            ((WorkDatabase) sVar3.f5643b).q().b(new x2.d("next_job_scheduler_id", Long.valueOf(i112 + 1)));
                                        }
                                        return Integer.valueOf(i112);
                                    }
                                });
                                ec.i.d(m11, "workDatabase.runInTransa…            id\n        })");
                                intValue2 = ((Number) m11).intValue();
                            } else {
                                intValue2 = ((Integer) d10.get(0)).intValue();
                            }
                            h(sVar2, intValue2);
                        }
                        workDatabase = this.f14155d;
                    }
                    workDatabase.n();
                }
                this.f14155d.j();
            } catch (Throwable th) {
                this.f14155d.j();
                throw th;
            }
        }
    }

    public final void h(s sVar, int i10) {
        JobInfo a10 = this.f14154c.a(sVar, i10);
        j d10 = j.d();
        String str = f;
        StringBuilder l10 = f.l("Scheduling work ID ");
        l10.append(sVar.f16830a);
        l10.append("Job ID ");
        l10.append(i10);
        d10.a(str, l10.toString());
        try {
            if (this.f14153b.schedule(a10) == 0) {
                j.d().g(str, "Unable to schedule work ID " + sVar.f16830a);
                if (sVar.f16845q && sVar.f16846r == 1) {
                    sVar.f16845q = false;
                    j.d().a(str, String.format("Scheduling a non-expedited job (work ID %s)", sVar.f16830a));
                    h(sVar, i10);
                }
            }
        } catch (IllegalStateException e10) {
            ArrayList f10 = f(this.f14152a, this.f14153b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(f10 != null ? f10.size() : 0), Integer.valueOf(this.f14155d.u().k().size()), Integer.valueOf(this.f14156e.f1450j));
            j.d().b(f, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e10);
            this.f14156e.getClass();
            throw illegalStateException;
        } catch (Throwable th) {
            j.d().c(f, "Unable to schedule " + sVar, th);
        }
    }
}
