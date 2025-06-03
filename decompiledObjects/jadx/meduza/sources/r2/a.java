package r2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import g.s;
import o2.j;
import x2.i;
import x2.l;
import y2.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f13542a = j.f("Alarms");

    /* renamed from: r2.a$a, reason: collision with other inner class name */
    public static class C0206a {
        public static void a(AlarmManager alarmManager, int i10, long j10, PendingIntent pendingIntent) {
            alarmManager.setExact(i10, j10, pendingIntent);
        }
    }

    public static void a(Context context, l lVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = androidx.work.impl.background.systemalarm.a.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        j.d().a(f13542a, "Cancelling existing alarm with (workSpecId, systemId) (" + lVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, l lVar, long j10) {
        int intValue;
        x2.j r10 = workDatabase.r();
        i c10 = r10.c(lVar);
        if (c10 != null) {
            a(context, lVar, c10.f16815c);
            intValue = c10.f16815c;
        } else {
            s sVar = new s(workDatabase);
            Object m10 = ((WorkDatabase) sVar.f5643b).m(new h(sVar, 0));
            ec.i.d(m10, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
            intValue = ((Number) m10).intValue();
            r10.d(new i(lVar.f16820a, lVar.f16821b, intValue));
        }
        c(context, lVar, intValue, j10);
    }

    public static void c(Context context, l lVar, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = androidx.work.impl.background.systemalarm.a.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
        if (alarmManager != null) {
            C0206a.a(alarmManager, 0, j10, service);
        }
    }
}
