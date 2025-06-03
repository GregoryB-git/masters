package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class F implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3732a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3733b;

    /* renamed from: c, reason: collision with root package name */
    public b f3734c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3735d;

    /* renamed from: e, reason: collision with root package name */
    public Messenger f3736e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3737f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3738g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3739h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3740i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3741j;

    public static final class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (T1.a.d(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(message, "message");
                F.this.d(message);
            } catch (Throwable th) {
                T1.a.b(th, this);
            }
        }
    }

    public interface b {
        void a(Bundle bundle);
    }

    public F(Context context, int i7, int i8, int i9, String applicationId, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f3732a = applicationContext != null ? applicationContext : context;
        this.f3737f = i7;
        this.f3738g = i8;
        this.f3739h = applicationId;
        this.f3740i = i9;
        this.f3741j = str;
        this.f3733b = new a();
    }

    public final void a(Bundle bundle) {
        if (this.f3735d) {
            this.f3735d = false;
            b bVar = this.f3734c;
            if (bVar == null) {
                return;
            }
            bVar.a(bundle);
        }
    }

    public final void b() {
        this.f3735d = false;
    }

    public final Context c() {
        return this.f3732a;
    }

    public final void d(Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what == this.f3738g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            a(data);
            try {
                this.f3732a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public abstract void e(Bundle bundle);

    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f3739h);
        String str = this.f3741j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        e(bundle);
        Message obtain = Message.obtain((Handler) null, this.f3737f);
        obtain.arg1 = this.f3740i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f3733b);
        try {
            Messenger messenger = this.f3736e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    public final void g(b bVar) {
        this.f3734c = bVar;
    }

    public final boolean h() {
        synchronized (this) {
            boolean z7 = false;
            if (this.f3735d) {
                return false;
            }
            E e7 = E.f3721a;
            if (E.s(this.f3740i) == -1) {
                return false;
            }
            Intent l7 = E.l(c());
            if (l7 != null) {
                z7 = true;
                this.f3735d = true;
                c().bindService(l7, this, 1);
            }
            return z7;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f3736e = new Messenger(service);
        f();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f3736e = null;
        try {
            this.f3732a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
