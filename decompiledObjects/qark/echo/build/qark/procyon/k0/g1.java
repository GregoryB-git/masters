// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.content.Intent;
import g0.M;
import g0.o;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import g0.a;
import android.media.AudioManager;
import android.os.Handler;
import android.content.Context;

public final class g1
{
    public final Context a;
    public final Handler b;
    public final b c;
    public final AudioManager d;
    public c e;
    public int f;
    public int g;
    public boolean h;
    
    public g1(Context applicationContext, final Handler b, final b c) {
        applicationContext = applicationContext.getApplicationContext();
        this.a = applicationContext;
        this.b = b;
        this.c = c;
        final AudioManager d = (AudioManager)g0.a.h(applicationContext.getSystemService("audio"));
        this.d = d;
        this.f = 3;
        this.g = f(d, 3);
        this.h = e(d, this.f);
        final c e = new c(null);
        final IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        try {
            applicationContext.registerReceiver((BroadcastReceiver)e, intentFilter);
            this.e = e;
        }
        catch (RuntimeException ex) {
            o.i("StreamVolumeManager", "Error registering stream volume receiver", ex);
        }
    }
    
    public static /* synthetic */ Handler a(final g1 g1) {
        return g1.b;
    }
    
    public static boolean e(final AudioManager audioManager, final int n) {
        if (M.a >= 23) {
            return audioManager.isStreamMute(n);
        }
        return f(audioManager, n) == 0;
    }
    
    public static int f(final AudioManager audioManager, final int i) {
        try {
            return audioManager.getStreamVolume(i);
        }
        catch (RuntimeException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            o.i("StreamVolumeManager", sb.toString(), ex);
            return audioManager.getStreamMaxVolume(i);
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
        final c e = this.e;
        if (e != null) {
            try {
                this.a.unregisterReceiver((BroadcastReceiver)e);
            }
            catch (RuntimeException ex) {
                o.i("StreamVolumeManager", "Error unregistering stream volume receiver", ex);
            }
            this.e = null;
        }
    }
    
    public void h(final int f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        this.i();
        this.c.D(f);
    }
    
    public final void i() {
        final int f = f(this.d, this.f);
        final boolean e = e(this.d, this.f);
        if (this.g != f || this.h != e) {
            this.g = f;
            this.h = e;
            this.c.B(f, e);
        }
    }
    
    public interface b
    {
        void B(final int p0, final boolean p1);
        
        void D(final int p0);
    }
    
    public final class c extends BroadcastReceiver
    {
        public void onReceive(final Context context, final Intent intent) {
            g1.a(g1.this).post((Runnable)new h1(g1.this));
        }
    }
}
