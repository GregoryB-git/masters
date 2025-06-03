package p2;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12919d;

    public /* synthetic */ q(Context context, boolean z10, TaskCompletionSource taskCompletionSource) {
        this.f12916a = 1;
        this.f12918c = context;
        this.f12917b = z10;
        this.f12919d = taskCompletionSource;
    }

    public /* synthetic */ q(r rVar, x2.l lVar) {
        this.f12916a = 0;
        this.f12918c = rVar;
        this.f12919d = lVar;
        this.f12917b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String notificationDelegate;
        switch (this.f12916a) {
            case 0:
                r rVar = (r) this.f12918c;
                x2.l lVar = (x2.l) this.f12919d;
                boolean z10 = this.f12917b;
                synchronized (rVar.f12953k) {
                    Iterator it = rVar.f12952j.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).a(lVar, z10);
                    }
                }
                return;
            default:
                Context context = (Context) this.f12918c;
                boolean z11 = this.f12917b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f12919d;
                try {
                    if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                        SharedPreferences.Editor edit = aa.y.a(context).edit();
                        edit.putBoolean("proxy_notification_initialized", true);
                        edit.apply();
                        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                        if (z11) {
                            notificationManager.setNotificationDelegate("com.google.android.gms");
                        } else {
                            notificationDelegate = notificationManager.getNotificationDelegate();
                            if ("com.google.android.gms".equals(notificationDelegate)) {
                                notificationManager.setNotificationDelegate(null);
                            }
                        }
                    } else {
                        Log.e("FirebaseMessaging", "error configuring notification delegate for package " + context.getPackageName());
                    }
                    return;
                } finally {
                    taskCompletionSource.trySetResult(null);
                }
        }
    }
}
