/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.RemoteException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package O1;

import O1.E;
import T1.a;
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

public abstract class F
implements ServiceConnection {
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

    public F(Context context, int n8, int n9, int n10, String string2, String string3) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        Intrinsics.checkNotNullParameter(string2, "applicationId");
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context2;
        }
        this.a = context;
        this.f = n8;
        this.g = n9;
        this.h = string2;
        this.i = n10;
        this.j = string3;
        this.b = new Handler(){

            public void handleMessage(Message message) {
                if (a.d((Object)this)) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter((Object)message, "message");
                    this.d(message);
                    return;
                }
                catch (Throwable throwable) {
                    a.b(throwable, (Object)this);
                    return;
                }
            }
        };
    }

    public final void a(Bundle bundle) {
        if (!this.d) {
            return;
        }
        this.d = false;
        b b8 = this.c;
        if (b8 == null) {
            return;
        }
        b8.a(bundle);
    }

    public final void b() {
        this.d = false;
    }

    public final Context c() {
        return this.a;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d(Message message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        if (message.what != this.g) return;
        Bundle bundle = message.getData();
        message = bundle;
        if (bundle.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
            message = null;
        }
        this.a((Bundle)message);
        try {
            this.a.unbindService((ServiceConnection)this);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
    }

    public abstract void e(Bundle var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.h);
        String string2 = this.j;
        if (string2 != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", string2);
        }
        this.e(bundle);
        string2 = Message.obtain((Handler)null, (int)this.f);
        string2.arg1 = this.i;
        string2.setData(bundle);
        string2.replyTo = new Messenger(this.b);
        try {
            bundle = this.e;
            if (bundle == null) {
                return;
            }
            bundle.send((Message)string2);
            return;
        }
        catch (RemoteException remoteException) {}
        this.a(null);
    }

    public final void g(b b8) {
        this.c = b8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean h() {
        synchronized (this) {
            boolean bl = this.d;
            boolean bl2 = false;
            if (bl) {
                return false;
            }
            E e8 = E.a;
            int n8 = E.s(this.i);
            if (n8 == -1) {
                return false;
            }
            e8 = E.l(this.c());
            if (e8 != null) {
                bl2 = true;
                this.d = true;
                this.c().bindService((Intent)e8, (ServiceConnection)this, 1);
            }
            return bl2;
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Intrinsics.checkNotNullParameter((Object)componentName, "name");
        Intrinsics.checkNotNullParameter((Object)iBinder, "service");
        this.e = new Messenger(iBinder);
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter((Object)componentName, "name");
        this.e = null;
        try {
            this.a.unbindService((ServiceConnection)this);
        }
        catch (IllegalArgumentException illegalArgumentException) {}
        this.a(null);
    }

    public static interface b {
        public void a(Bundle var1);
    }

}

