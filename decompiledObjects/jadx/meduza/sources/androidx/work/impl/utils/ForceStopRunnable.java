package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o2.j;
import o2.o;
import p2.b0;
import p2.k0;
import p2.w;
import s2.b;
import x2.d;
import x2.l;
import x2.q;
import x2.s;
import x2.t;
import y2.p;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final String f1542e = j.f("ForceStopRunnable");
    public static final long f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1543a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f1544b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1545c;

    /* renamed from: d, reason: collision with root package name */
    public int f1546d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1547a = j.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            j d10 = j.d();
            String str = f1547a;
            if (((j.a) d10).f11721c <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, k0 k0Var) {
        this.f1543a = context.getApplicationContext();
        this.f1544b = k0Var;
        this.f1545c = k0Var.f12882g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i10);
        long currentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    public final void a() {
        boolean z10;
        int i10;
        PendingIntent broadcast;
        Context context = this.f1543a;
        WorkDatabase workDatabase = this.f1544b.f12879c;
        String str = b.f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList f10 = b.f(context, jobScheduler);
        ArrayList a10 = workDatabase.r().a();
        boolean z11 = false;
        HashSet hashSet = new HashSet(f10 != null ? f10.size() : 0);
        if (f10 != null && !f10.isEmpty()) {
            Iterator it = f10.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                l g10 = b.g(jobInfo);
                if (g10 != null) {
                    hashSet.add(g10.f16820a);
                } else {
                    b.a(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it2 = a10.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (!hashSet.contains((String) it2.next())) {
                    j.d().a(b.f, "Reconciling jobs");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            workDatabase.c();
            try {
                t u10 = workDatabase.u();
                Iterator it3 = a10.iterator();
                while (it3.hasNext()) {
                    u10.f((String) it3.next(), -1L);
                }
                workDatabase.n();
            } finally {
            }
        }
        workDatabase = this.f1544b.f12879c;
        t u11 = workDatabase.u();
        q t = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList<s> n2 = u11.n();
            boolean z12 = (n2 == null || n2.isEmpty()) ? false : true;
            if (z12) {
                for (s sVar : n2) {
                    u11.e(o.b.ENQUEUED, sVar.f16830a);
                    u11.o(-512, sVar.f16830a);
                    u11.f(sVar.f16830a, -1L);
                }
            }
            t.b();
            workDatabase.n();
            boolean z13 = z12 || z10;
            Long a11 = this.f1544b.f12882g.f17391a.q().a("reschedule_needed");
            if (a11 != null && a11.longValue() == 1) {
                j.d().a(f1542e, "Rescheduling Workers.");
                this.f1544b.h();
                p pVar = this.f1544b.f12882g;
                pVar.getClass();
                pVar.f17391a.q().b(new d("reschedule_needed", 0L));
                return;
            }
            try {
                i10 = Build.VERSION.SDK_INT;
                int i11 = i10 >= 31 ? 570425344 : 536870912;
                Context context2 = this.f1543a;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context2, (Class<?>) BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context2, -1, intent, i11);
            } catch (IllegalArgumentException | SecurityException e10) {
                j d10 = j.d();
                String str2 = f1542e;
                if (((j.a) d10).f11721c <= 5) {
                    Log.w(str2, "Ignoring exception", e10);
                }
            }
            if (i10 < 30) {
                if (broadcast == null) {
                    c(this.f1543a);
                    z11 = true;
                    break;
                }
            } else {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f1543a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long a12 = this.f1545c.f17391a.q().a("last_force_stop_ms");
                    long longValue = a12 != null ? a12.longValue() : 0L;
                    for (int i12 = 0; i12 < historicalProcessExitReasons.size(); i12++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i12);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= longValue) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            if (!z11) {
                if (z13) {
                    j.d().a(f1542e, "Found unfinished work, scheduling it.");
                    k0 k0Var = this.f1544b;
                    w.b(k0Var.f12878b, k0Var.f12879c, k0Var.f12881e);
                    return;
                }
                return;
            }
            j.d().a(f1542e, "Application was force-stopped, rescheduling.");
            this.f1544b.h();
            p pVar2 = this.f1545c;
            this.f1544b.f12878b.f1444c.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            pVar2.getClass();
            pVar2.f17391a.q().b(new d("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
        } finally {
        }
    }

    public final boolean b() {
        a aVar = this.f1544b.f12878b;
        aVar.getClass();
        if (TextUtils.isEmpty(null)) {
            j.d().a(f1542e, "The default process name was not specified.");
            return true;
        }
        boolean a10 = y2.q.a(this.f1543a, aVar);
        j.d().a(f1542e, "Is default app process = " + a10);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (b()) {
                while (true) {
                    try {
                        b0.a(this.f1543a);
                        j.d().a(f1542e, "Performing cleanup operations.");
                        try {
                            a();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                            int i10 = this.f1546d + 1;
                            this.f1546d = i10;
                            if (i10 >= 3) {
                                String str = a0.o.a(this.f1543a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                j.d().c(f1542e, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                this.f1544b.f12878b.getClass();
                                throw illegalStateException;
                            }
                            long j10 = i10 * 300;
                            j d10 = j.d();
                            String str2 = f1542e;
                            String str3 = "Retrying after " + j10;
                            if (((j.a) d10).f11721c <= 3) {
                                Log.d(str2, str3, e10);
                            }
                            try {
                                Thread.sleep(this.f1546d * 300);
                            } catch (InterruptedException unused) {
                            }
                        }
                    } catch (SQLiteException e11) {
                        j.d().b(f1542e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        this.f1544b.f12878b.getClass();
                        throw illegalStateException2;
                    }
                }
            }
        } finally {
            this.f1544b.g();
        }
    }
}
