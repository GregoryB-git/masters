/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import g0.M;
import g0.a;
import g0.o;
import k0.f1;
import k0.h1;

public final class g1 {
    public final Context a;
    public final Handler b;
    public final b c;
    public final AudioManager d;
    public c e;
    public int f;
    public int g;
    public boolean h;

    public g1(Context context, Handler object, b b8) {
        this.a = context = context.getApplicationContext();
        this.b = object;
        this.c = b8;
        object = (AudioManager)a.h((Object)((AudioManager)context.getSystemService("audio")));
        this.d = object;
        this.f = 3;
        this.g = g1.f((AudioManager)object, 3);
        this.h = g1.e((AudioManager)object, this.f);
        object = new c(null);
        b8 = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            context.registerReceiver((BroadcastReceiver)object, (IntentFilter)b8);
            this.e = object;
            return;
        }
        catch (RuntimeException runtimeException) {
            o.i("StreamVolumeManager", "Error registering stream volume receiver", (Throwable)runtimeException);
            return;
        }
    }

    public static boolean e(AudioManager audioManager, int n8) {
        if (M.a >= 23) {
            return audioManager.isStreamMute(n8);
        }
        if (g1.f(audioManager, n8) == 0) {
            return true;
        }
        return false;
    }

    public static int f(AudioManager audioManager, int n8) {
        try {
            int n9 = audioManager.getStreamVolume(n8);
            return n9;
        }
        catch (RuntimeException runtimeException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not retrieve stream volume for stream type ");
            stringBuilder.append(n8);
            o.i("StreamVolumeManager", stringBuilder.toString(), (Throwable)runtimeException);
            return audioManager.getStreamMaxVolume(n8);
        }
    }

    public int c() {
        return this.d.getStreamMaxVolume(this.f);
    }

    public int d() {
        if (M.a >= 28) {
            return f1.a(this.d, this.f);
        }
        return 0;
    }

    public void g() {
        c c8 = this.e;
        if (c8 != null) {
            try {
                this.a.unregisterReceiver((BroadcastReceiver)c8);
            }
            catch (RuntimeException runtimeException) {
                o.i("StreamVolumeManager", "Error unregistering stream volume receiver", (Throwable)runtimeException);
            }
            this.e = null;
        }
    }

    public void h(int n8) {
        if (this.f == n8) {
            return;
        }
        this.f = n8;
        this.i();
        this.c.D(n8);
    }

    public final void i() {
        int n8 = g1.f(this.d, this.f);
        boolean bl = g1.e(this.d, this.f);
        if (this.g != n8 || this.h != bl) {
            this.g = n8;
            this.h = bl;
            this.c.B(n8, bl);
        }
    }

    public static interface b {
        public void B(int var1, boolean var2);

        public void D(int var1);
    }

    public final class c
    extends BroadcastReceiver {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public static /* synthetic */ void a(g1 g12) {
            c.b(g12);
        }

        public static /* synthetic */ void b(g1 g12) {
            g12.i();
        }

        public void onReceive(Context context, Intent intent) {
            g1.this.b.post((Runnable)new h1(g1.this));
        }
    }

}

