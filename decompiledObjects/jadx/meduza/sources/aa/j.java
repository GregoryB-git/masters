package aa;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f310c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static o0 f311d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f312a;

    /* renamed from: b, reason: collision with root package name */
    public final m1.c f313b = new m1.c(1);

    public j(Context context) {
        this.f312a = context;
    }

    public static Task<Integer> a(Context context, Intent intent, boolean z10) {
        o0 o0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f310c) {
            if (f311d == null) {
                f311d = new o0(context);
            }
            o0Var = f311d;
        }
        if (!z10) {
            return o0Var.b(intent).continueWith(new m1.b(5), new w3.v(21));
        }
        if (d0.a().c(context)) {
            synchronized (l0.f335b) {
                if (l0.f336c == null) {
                    i7.a aVar = new i7.a(context);
                    l0.f336c = aVar;
                    synchronized (aVar.f7629a) {
                        aVar.f7634g = true;
                    }
                }
                int i10 = 0;
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    l0.f336c.a(l0.f334a);
                }
                o0Var.b(intent).addOnCompleteListener(new defpackage.e(intent, i10));
            }
        } else {
            o0Var.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = this.f312a;
        boolean z10 = v6.e.a() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.call(this.f313b, new Callable() { // from class: aa.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i10;
                ComponentName startService;
                Context context2 = context;
                Intent intent2 = intent;
                d0 a10 = d0.a();
                a10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a10.f279d.offer(intent2);
                Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent3.setPackage(context2.getPackageName());
                synchronized (a10) {
                    String str3 = a10.f276a;
                    if (str3 == null) {
                        ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                        str = null;
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                if (str2.startsWith(".")) {
                                    str3 = context2.getPackageName() + serviceInfo.name;
                                } else {
                                    str3 = serviceInfo.name;
                                }
                                a10.f276a = str3;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + serviceInfo.name);
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                    str = str3;
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + str);
                    }
                    intent3.setClassName(context2.getPackageName(), str);
                }
                try {
                    if (a10.c(context2)) {
                        startService = l0.b(context2, intent3);
                    } else {
                        startService = context2.startService(intent3);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i10 = 404;
                    } else {
                        i10 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i10 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i10 = 401;
                }
                return Integer.valueOf(i10);
            }
        }).continueWithTask(this.f313b, new r5.d(context, intent, z11)) : a(context, intent, z11);
    }
}
