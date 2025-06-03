package w2;

import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0651b;
import V2.InterfaceC0654e;
import V2.InterfaceC0658i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: w2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2081c {

    /* renamed from: h, reason: collision with root package name */
    public static int f20329h;

    /* renamed from: i, reason: collision with root package name */
    public static PendingIntent f20330i;

    /* renamed from: j, reason: collision with root package name */
    public static final Executor f20331j = new Executor() { // from class: w2.D
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f20332k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: b, reason: collision with root package name */
    public final Context f20334b;

    /* renamed from: c, reason: collision with root package name */
    public final x f20335c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f20336d;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f20338f;

    /* renamed from: g, reason: collision with root package name */
    public C2086h f20339g;

    /* renamed from: a, reason: collision with root package name */
    public final t.h f20333a = new t.h();

    /* renamed from: e, reason: collision with root package name */
    public Messenger f20337e = new Messenger(new HandlerC2083e(this, Looper.getMainLooper()));

    public C2081c(Context context) {
        this.f20334b = context;
        this.f20335c = new x(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f20336d = scheduledThreadPoolExecutor;
    }

    public static /* synthetic */ AbstractC0659j b(Bundle bundle) {
        return j(bundle) ? V2.m.e(null) : V2.m.e(bundle);
    }

    public static /* bridge */ /* synthetic */ void d(C2081c c2081c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C2085g());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C2086h) {
                        c2081c.f20339g = (C2086h) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c2081c.f20338f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!"com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    if (Log.isLoggable("Rpc", 3)) {
                        String valueOf = String.valueOf(action);
                        Log.d("Rpc", valueOf.length() != 0 ? "Unexpected response action: ".concat(valueOf) : new String("Unexpected response action: "));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f20332k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                            return;
                        }
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        c2081c.i(group, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf2 = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(valueOf2.length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf2);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c2081c.f20333a) {
                        for (int i7 = 0; i7 < c2081c.f20333a.size(); i7++) {
                            try {
                                c2081c.i((String) c2081c.f20333a.i(i7), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] split = stringExtra2.split("\\|");
                if (split.length <= 2 || !"ID".equals(split[1])) {
                    Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                    return;
                }
                String str = split[2];
                String str2 = split[3];
                if (str2.startsWith(":")) {
                    str2 = str2.substring(1);
                }
                c2081c.i(str, intent2.putExtra("error", str2).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    public static synchronized String g() {
        String num;
        synchronized (C2081c.class) {
            int i7 = f20329h;
            f20329h = i7 + 1;
            num = Integer.toString(i7);
        }
        return num;
    }

    public static synchronized void h(Context context, Intent intent) {
        synchronized (C2081c.class) {
            try {
                if (f20330i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f20330i = L2.a.a(context, 0, intent2, L2.a.f3324a);
                }
                intent.putExtra("app", f20330i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public AbstractC0659j a(final Bundle bundle) {
        return this.f20335c.a() < 12000000 ? this.f20335c.b() != 0 ? f(bundle).h(f20331j, new InterfaceC0651b() { // from class: w2.y
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                return C2081c.this.c(bundle, abstractC0659j);
            }
        }) : V2.m.d(new IOException("MISSING_INSTANCEID_SERVICE")) : w.b(this.f20334b).d(1, bundle).g(f20331j, new InterfaceC0651b() { // from class: w2.z
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                if (abstractC0659j.n()) {
                    return (Bundle) abstractC0659j.j();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    String valueOf = String.valueOf(abstractC0659j.i());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                    sb.append("Error making request: ");
                    sb.append(valueOf);
                    Log.d("Rpc", sb.toString());
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC0659j.i());
            }
        });
    }

    public final /* synthetic */ AbstractC0659j c(Bundle bundle, AbstractC0659j abstractC0659j) {
        return !abstractC0659j.n() ? abstractC0659j : !j((Bundle) abstractC0659j.j()) ? abstractC0659j : f(bundle).p(f20331j, new InterfaceC0658i() { // from class: w2.B
            @Override // V2.InterfaceC0658i
            public final AbstractC0659j a(Object obj) {
                return C2081c.b((Bundle) obj);
            }
        });
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, AbstractC0659j abstractC0659j) {
        synchronized (this.f20333a) {
            this.f20333a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public final AbstractC0659j f(Bundle bundle) {
        final String g7 = g();
        final C0660k c0660k = new C0660k();
        synchronized (this.f20333a) {
            this.f20333a.put(g7, c0660k);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.f20335c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.f20334b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g7).length() + 5);
        sb.append("|ID|");
        sb.append(g7);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f20337e);
        if (this.f20338f != null || this.f20339g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f20338f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f20339g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            final ScheduledFuture<?> schedule = this.f20336d.schedule(new Runnable() { // from class: w2.C
                @Override // java.lang.Runnable
                public final void run() {
                    if (C0660k.this.d(new IOException("TIMEOUT"))) {
                        Log.w("Rpc", "No response");
                    }
                }
            }, 30L, TimeUnit.SECONDS);
            c0660k.a().c(f20331j, new InterfaceC0654e() { // from class: w2.A
                @Override // V2.InterfaceC0654e
                public final void a(AbstractC0659j abstractC0659j) {
                    C2081c.this.e(g7, schedule, abstractC0659j);
                }
            });
            return c0660k.a();
        }
        if (this.f20335c.b() == 2) {
            this.f20334b.sendBroadcast(intent);
        } else {
            this.f20334b.startService(intent);
        }
        final ScheduledFuture schedule2 = this.f20336d.schedule(new Runnable() { // from class: w2.C
            @Override // java.lang.Runnable
            public final void run() {
                if (C0660k.this.d(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                }
            }
        }, 30L, TimeUnit.SECONDS);
        c0660k.a().c(f20331j, new InterfaceC0654e() { // from class: w2.A
            @Override // V2.InterfaceC0654e
            public final void a(AbstractC0659j abstractC0659j) {
                C2081c.this.e(g7, schedule2, abstractC0659j);
            }
        });
        return c0660k.a();
    }

    public final void i(String str, Bundle bundle) {
        synchronized (this.f20333a) {
            try {
                C0660k c0660k = (C0660k) this.f20333a.remove(str);
                if (c0660k != null) {
                    c0660k.c(bundle);
                } else {
                    String valueOf = String.valueOf(str);
                    Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
