// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.os.BaseBundle;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;
import android.os.RemoteException;
import android.os.Bundle;
import T1.a;
import android.os.Message;
import kotlin.jvm.internal.Intrinsics;
import android.os.Messenger;
import android.os.Handler;
import android.content.Context;
import android.content.ServiceConnection;

public abstract class F implements ServiceConnection
{
    public final Context a;
    public final Handler b;
    public b c;
    public boolean d;
    public Messenger e;
    public final int f;
    public final int g;
    public final String h;
    public final int i;
    public final String j;
    
    public F(Context a, final int f, final int g, final int i, final String h, final String j) {
        Intrinsics.checkNotNullParameter(a, "context");
        Intrinsics.checkNotNullParameter(h, "applicationId");
        final Context applicationContext = a.getApplicationContext();
        if (applicationContext != null) {
            a = applicationContext;
        }
        this.a = a;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.b = new Handler() {
            public final /* synthetic */ F a;
            
            public void handleMessage(final Message message) {
                if (T1.a.d(this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(message, "message");
                    this.a.d(message);
                }
                finally {
                    final Throwable t;
                    T1.a.b(t, this);
                }
            }
        };
    }
    
    public final void a(final Bundle bundle) {
        if (!this.d) {
            return;
        }
        this.d = false;
        final b c = this.c;
        if (c == null) {
            return;
        }
        c.a(bundle);
    }
    
    public final void b() {
        this.d = false;
    }
    
    public final Context c() {
        return this.a;
    }
    
    public final void d(final Message message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.what != this.g) {
            return;
        }
        Bundle data;
        if (((BaseBundle)(data = message.getData())).getString("com.facebook.platform.status.ERROR_TYPE") != null) {
            data = null;
        }
        this.a(data);
        try {
            this.a.unbindService((ServiceConnection)this);
        }
        catch (IllegalArgumentException ex) {}
    }
    
    public abstract void e(final Bundle p0);
    
    public final void f() {
        final Bundle data = new Bundle();
        ((BaseBundle)data).putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        final String j = this.j;
        if (j != null) {
            ((BaseBundle)data).putString("com.facebook.platform.extra.NONCE", j);
        }
        this.e(data);
        final Message obtain = Message.obtain((Handler)null, this.f);
        obtain.arg1 = this.i;
        obtain.setData(data);
        obtain.replyTo = new Messenger(this.b);
        while (true) {
            try {
                final Messenger e = this.e;
                if (e == null) {
                    return;
                }
                e.send(obtain);
                return;
                this.a(null);
            }
            catch (RemoteException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void g(final b c) {
        this.c = c;
    }
    
    public final boolean h() {
        synchronized (this) {
            final boolean d = this.d;
            boolean b = false;
            if (d) {
                return false;
            }
            final E a = E.a;
            if (E.s(this.i) == -1) {
                return false;
            }
            final Intent l = E.l(this.c());
            if (l != null) {
                b = true;
                this.d = true;
                this.c().bindService(l, (ServiceConnection)this, 1);
            }
            return b;
        }
    }
    
    public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        Intrinsics.checkNotNullParameter(componentName, "name");
        Intrinsics.checkNotNullParameter(binder, "service");
        this.e = new Messenger(binder);
        this.f();
    }
    
    public void onServiceDisconnected(final ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "name");
        this.e = null;
        while (true) {
            try {
                this.a.unbindService((ServiceConnection)this);
                this.a(null);
            }
            catch (IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    public interface b
    {
        void a(final Bundle p0);
    }
}
