package i6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: h, reason: collision with root package name */
    public static int f7571h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f7572i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f7573j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f7575b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f7576c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f7577d;
    public Messenger f;

    /* renamed from: g, reason: collision with root package name */
    public k f7579g;

    /* renamed from: a, reason: collision with root package name */
    public final r.h f7574a = new r.h();

    /* renamed from: e, reason: collision with root package name */
    public final Messenger f7578e = new Messenger(new h(this, Looper.getMainLooper()));

    public c(Context context) {
        this.f7575b = context;
        this.f7576c = new a0(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7577d = scheduledThreadPoolExecutor;
    }

    public final Task<Bundle> a(Bundle bundle) {
        int i10;
        if (this.f7576c.a() < 12000000) {
            return this.f7576c.b() != 0 ? b(bundle).continueWithTask(b0.f7570a, new l.l(3, this, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        z a10 = z.a(this.f7575b);
        synchronized (a10) {
            i10 = a10.f7625d;
            a10.f7625d = i10 + 1;
        }
        return a10.b(new y(i10, 1, bundle)).continueWith(b0.f7570a, b.z.f);
    }

    public final Task b(Bundle bundle) {
        final String num;
        int i10;
        synchronized (c.class) {
            int i11 = f7571h;
            f7571h = i11 + 1;
            num = Integer.toString(i11);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f7574a) {
            this.f7574a.put(num, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f7576c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        Context context = this.f7575b;
        synchronized (c.class) {
            i10 = 0;
            if (f7572i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f7572i = PendingIntent.getBroadcast(context, 0, intent2, zza.zza);
            }
            intent.putExtra("app", f7572i);
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f7578e);
        if (this.f != null || this.f7579g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f7579g.f7587a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f7577d.schedule(new f(taskCompletionSource, i10), 30L, TimeUnit.SECONDS);
            taskCompletionSource.getTask().addOnCompleteListener(b0.f7570a, new OnCompleteListener() { // from class: i6.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    c cVar = c.this;
                    String str = num;
                    ScheduledFuture scheduledFuture = schedule;
                    synchronized (cVar.f7574a) {
                        cVar.f7574a.remove(str);
                    }
                    scheduledFuture.cancel(false);
                }
            });
            return taskCompletionSource.getTask();
        }
        if (this.f7576c.b() == 2) {
            this.f7575b.sendBroadcast(intent);
        } else {
            this.f7575b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f7577d.schedule(new f(taskCompletionSource, i10), 30L, TimeUnit.SECONDS);
        taskCompletionSource.getTask().addOnCompleteListener(b0.f7570a, new OnCompleteListener() { // from class: i6.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                c cVar = c.this;
                String str = num;
                ScheduledFuture scheduledFuture = schedule2;
                synchronized (cVar.f7574a) {
                    cVar.f7574a.remove(str);
                }
                scheduledFuture.cancel(false);
            }
        });
        return taskCompletionSource.getTask();
    }

    public final void c(Bundle bundle, String str) {
        synchronized (this.f7574a) {
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7574a.remove(str);
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(bundle);
                return;
            }
            Log.w("Rpc", "Missing callback for " + str);
        }
    }
}
