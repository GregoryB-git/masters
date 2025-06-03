package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.foreground.a;
import b1.r;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import o2.d;
import o2.j;
import w2.c;
import x2.l;

/* loaded from: classes.dex */
public class SystemForegroundService extends r implements a.InterfaceC0026a {
    public static final String f = j.f("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f1525b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1526c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.work.impl.foreground.a f1527d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f1528e;

    public static class a {
        public static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    public static class b {
        public static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                j d10 = j.d();
                String str = SystemForegroundService.f;
                if (((j.a) d10).f11721c <= 5) {
                    Log.w(str, "Unable to start foreground service", e10);
                }
            }
        }
    }

    public final void a() {
        this.f1525b = new Handler(Looper.getMainLooper());
        this.f1528e = (NotificationManager) getApplicationContext().getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f1527d = aVar;
        if (aVar.f1537q != null) {
            j.d().b(androidx.work.impl.foreground.a.f1529r, "A callback already exists.");
        } else {
            aVar.f1537q = this;
        }
    }

    @Override // b1.r, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // b1.r, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1527d.e();
    }

    @Override // b1.r, android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        int i12 = 0;
        if (this.f1526c) {
            j.d().e(f, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f1527d.e();
            a();
            this.f1526c = false;
        }
        if (intent == null) {
            return 3;
        }
        androidx.work.impl.foreground.a aVar = this.f1527d;
        aVar.getClass();
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            j.d().e(androidx.work.impl.foreground.a.f1529r, "Started foreground service " + intent);
            aVar.f1531b.d(new w2.b(aVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                j.d().e(androidx.work.impl.foreground.a.f1529r, "Stopping foreground work for " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    return 3;
                }
                aVar.f1530a.c(UUID.fromString(stringExtra));
                return 3;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            j.d().e(androidx.work.impl.foreground.a.f1529r, "Stopping foreground service");
            a.InterfaceC0026a interfaceC0026a = aVar.f1537q;
            if (interfaceC0026a == null) {
                return 3;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC0026a;
            systemForegroundService.f1526c = true;
            j.d().a(f, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        l lVar = new l(stringExtra2, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.d().a(androidx.work.impl.foreground.a.f1529r, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra2 + ", notificationType :" + intExtra2 + ")");
        if (notification == null || aVar.f1537q == null) {
            return 3;
        }
        aVar.f1534e.put(lVar, new d(intExtra, intExtra2, notification));
        if (aVar.f1533d == null) {
            aVar.f1533d = lVar;
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar.f1537q;
            systemForegroundService2.f1525b.post(new androidx.work.impl.foreground.b(systemForegroundService2, intExtra, notification, intExtra2));
            return 3;
        }
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) aVar.f1537q;
        systemForegroundService3.f1525b.post(new c(systemForegroundService3, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return 3;
        }
        Iterator it = aVar.f1534e.entrySet().iterator();
        while (it.hasNext()) {
            i12 |= ((d) ((Map.Entry) it.next()).getValue()).f11713b;
        }
        d dVar = (d) aVar.f1534e.get(aVar.f1533d);
        if (dVar == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService4 = (SystemForegroundService) aVar.f1537q;
        systemForegroundService4.f1525b.post(new androidx.work.impl.foreground.b(systemForegroundService4, dVar.f11712a, dVar.f11714c, i12));
        return 3;
    }
}
