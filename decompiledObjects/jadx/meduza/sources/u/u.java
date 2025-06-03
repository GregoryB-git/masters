package u;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d, reason: collision with root package name */
    public static String f14851d;

    /* renamed from: g, reason: collision with root package name */
    public static e f14853g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f14854a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f14855b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f14850c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f14852e = new HashSet();
    public static final Object f = new Object();

    public static class a {
        public static boolean a(NotificationManager notificationManager) {
            boolean areNotificationsEnabled;
            areNotificationsEnabled = notificationManager.areNotificationsEnabled();
            return areNotificationsEnabled;
        }

        public static int b(NotificationManager notificationManager) {
            int importance;
            importance = notificationManager.getImportance();
            return importance;
        }
    }

    public static class b {
        public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static String g(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static String h(NotificationChannelGroup notificationChannelGroup) {
            return notificationChannelGroup.getId();
        }

        public static NotificationChannel i(NotificationManager notificationManager, String str) {
            NotificationChannel notificationChannel;
            notificationChannel = notificationManager.getNotificationChannel(str);
            return notificationChannel;
        }

        public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
            List<NotificationChannelGroup> notificationChannelGroups;
            notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            return notificationChannelGroups;
        }

        public static List<NotificationChannel> k(NotificationManager notificationManager) {
            List<NotificationChannel> notificationChannels;
            notificationChannels = notificationManager.getNotificationChannels();
            return notificationChannels;
        }
    }

    public static class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final String f14856a;

        /* renamed from: b, reason: collision with root package name */
        public final int f14857b;

        /* renamed from: c, reason: collision with root package name */
        public final String f14858c = null;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f14859d;

        public c(String str, int i10, Notification notification) {
            this.f14856a = str;
            this.f14857b = i10;
            this.f14859d = notification;
        }

        @Override // u.u.f
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.P2(this.f14856a, this.f14857b, this.f14858c, this.f14859d);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[");
            sb2.append("packageName:");
            sb2.append(this.f14856a);
            sb2.append(", id:");
            sb2.append(this.f14857b);
            sb2.append(", tag:");
            return defpackage.g.f(sb2, this.f14858c, "]");
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f14860a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f14861b;

        public d(ComponentName componentName, IBinder iBinder) {
            this.f14860a = componentName;
            this.f14861b = iBinder;
        }
    }

    public static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14862a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f14863b;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f14864c = new HashMap();

        /* renamed from: d, reason: collision with root package name */
        public HashSet f14865d = new HashSet();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f14866a;

            /* renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f14868c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f14867b = false;

            /* renamed from: d, reason: collision with root package name */
            public ArrayDeque<f> f14869d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            public int f14870e = 0;

            public a(ComponentName componentName) {
                this.f14866a = componentName;
            }
        }

        public e(Context context) {
            this.f14862a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f14863b = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z10;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder l10 = defpackage.f.l("Processing component ");
                l10.append(aVar.f14866a);
                l10.append(", ");
                l10.append(aVar.f14869d.size());
                l10.append(" queued tasks");
                Log.d("NotifManCompat", l10.toString());
            }
            if (aVar.f14869d.isEmpty()) {
                return;
            }
            if (aVar.f14867b) {
                z10 = true;
            } else {
                boolean bindService = this.f14862a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f14866a), this, 33);
                aVar.f14867b = bindService;
                if (bindService) {
                    aVar.f14870e = 0;
                } else {
                    StringBuilder l11 = defpackage.f.l("Unable to bind to listener ");
                    l11.append(aVar.f14866a);
                    Log.w("NotifManCompat", l11.toString());
                    this.f14862a.unbindService(this);
                }
                z10 = aVar.f14867b;
            }
            if (!z10 || aVar.f14868c == null) {
                b(aVar);
                return;
            }
            while (true) {
                f peek = aVar.f14869d.peek();
                if (peek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + peek);
                    }
                    peek.a(aVar.f14868c);
                    aVar.f14869d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        StringBuilder l12 = defpackage.f.l("Remote service has died: ");
                        l12.append(aVar.f14866a);
                        Log.d("NotifManCompat", l12.toString());
                    }
                } catch (RemoteException e10) {
                    StringBuilder l13 = defpackage.f.l("RemoteException communicating with ");
                    l13.append(aVar.f14866a);
                    Log.w("NotifManCompat", l13.toString(), e10);
                }
            }
            if (aVar.f14869d.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            if (this.f14863b.hasMessages(3, aVar.f14866a)) {
                return;
            }
            int i10 = aVar.f14870e + 1;
            aVar.f14870e = i10;
            if (i10 > 6) {
                StringBuilder l10 = defpackage.f.l("Giving up on delivering ");
                l10.append(aVar.f14869d.size());
                l10.append(" tasks to ");
                l10.append(aVar.f14866a);
                l10.append(" after ");
                l10.append(aVar.f14870e);
                l10.append(" retries");
                Log.w("NotifManCompat", l10.toString());
                aVar.f14869d.clear();
                return;
            }
            int i11 = (1 << (i10 - 1)) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
            }
            this.f14863b.sendMessageDelayed(this.f14863b.obtainMessage(3, aVar.f14866a), i11);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    d dVar = (d) message.obj;
                    ComponentName componentName = dVar.f14860a;
                    IBinder iBinder = dVar.f14861b;
                    a aVar = (a) this.f14864c.get(componentName);
                    if (aVar != null) {
                        aVar.f14868c = INotificationSideChannel.Stub.asInterface(iBinder);
                        aVar.f14870e = 0;
                        a(aVar);
                    }
                    return true;
                }
                if (i10 != 2) {
                    if (i10 != 3) {
                        return false;
                    }
                    a aVar2 = (a) this.f14864c.get((ComponentName) message.obj);
                    if (aVar2 != null) {
                        a(aVar2);
                    }
                    return true;
                }
                a aVar3 = (a) this.f14864c.get((ComponentName) message.obj);
                if (aVar3 != null) {
                    if (aVar3.f14867b) {
                        this.f14862a.unbindService(this);
                        aVar3.f14867b = false;
                    }
                    aVar3.f14868c = null;
                }
                return true;
            }
            f fVar = (f) message.obj;
            String string = Settings.Secure.getString(this.f14862a.getContentResolver(), "enabled_notification_listeners");
            synchronized (u.f14850c) {
                if (string != null) {
                    if (!string.equals(u.f14851d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        u.f14852e = hashSet2;
                        u.f14851d = string;
                    }
                }
                hashSet = u.f14852e;
            }
            if (!hashSet.equals(this.f14865d)) {
                this.f14865d = hashSet;
                List<ResolveInfo> queryIntentServices = this.f14862a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f14864c.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f14864c.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.f14864c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder l10 = defpackage.f.l("Removing listener record for ");
                            l10.append(entry.getKey());
                            Log.d("NotifManCompat", l10.toString());
                        }
                        a aVar4 = (a) entry.getValue();
                        if (aVar4.f14867b) {
                            this.f14862a.unbindService(this);
                            aVar4.f14867b = false;
                        }
                        aVar4.f14868c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar5 : this.f14864c.values()) {
                aVar5.f14869d.add(fVar);
                a(aVar5);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f14863b.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f14863b.obtainMessage(2, componentName).sendToTarget();
        }
    }

    public interface f {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public u(Context context) {
        this.f14854a = context;
        this.f14855b = (NotificationManager) context.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE);
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f14855b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f14854a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f14854a.getApplicationInfo();
        String packageName = this.f14854a.getApplicationContext().getPackageName();
        int i10 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public final void b(int i10, Notification notification) {
        Bundle bundle = notification.extras;
        if (!(bundle != null && bundle.getBoolean("android.support.useSideChannel"))) {
            this.f14855b.notify(null, i10, notification);
            return;
        }
        c cVar = new c(this.f14854a.getPackageName(), i10, notification);
        synchronized (f) {
            if (f14853g == null) {
                f14853g = new e(this.f14854a.getApplicationContext());
            }
            f14853g.f14863b.obtainMessage(0, cVar).sendToTarget();
        }
        this.f14855b.cancel(null, i10);
    }
}
