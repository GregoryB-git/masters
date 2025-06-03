package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15795a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15796b;

    /* renamed from: c, reason: collision with root package name */
    public final b f15797c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f15798d;

    /* renamed from: e, reason: collision with root package name */
    public c f15799e;

    /* renamed from: f, reason: collision with root package name */
    public int f15800f;

    /* renamed from: g, reason: collision with root package name */
    public int f15801g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15802h;

    public interface b {
        void B(int i7, boolean z7);

        void D(int i7);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = g1.this.f15796b;
            final g1 g1Var = g1.this;
            handler.post(new Runnable() { // from class: k0.h1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.b(g1.this);
                }
            });
        }
    }

    public g1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15795a = applicationContext;
        this.f15796b = handler;
        this.f15797c = bVar;
        AudioManager audioManager = (AudioManager) AbstractC1297a.h((AudioManager) applicationContext.getSystemService("audio"));
        this.f15798d = audioManager;
        this.f15800f = 3;
        this.f15801g = f(audioManager, 3);
        this.f15802h = e(audioManager, this.f15800f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f15799e = cVar;
        } catch (RuntimeException e7) {
            g0.o.i("StreamVolumeManager", "Error registering stream volume receiver", e7);
        }
    }

    public static /* synthetic */ void b(g1 g1Var) {
        g1Var.i();
    }

    public static boolean e(AudioManager audioManager, int i7) {
        return g0.M.f14261a >= 23 ? audioManager.isStreamMute(i7) : f(audioManager, i7) == 0;
    }

    public static int f(AudioManager audioManager, int i7) {
        try {
            return audioManager.getStreamVolume(i7);
        } catch (RuntimeException e7) {
            g0.o.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i7, e7);
            return audioManager.getStreamMaxVolume(i7);
        }
    }

    public int c() {
        return this.f15798d.getStreamMaxVolume(this.f15800f);
    }

    public int d() {
        int streamMinVolume;
        if (g0.M.f14261a < 28) {
            return 0;
        }
        streamMinVolume = this.f15798d.getStreamMinVolume(this.f15800f);
        return streamMinVolume;
    }

    public void g() {
        c cVar = this.f15799e;
        if (cVar != null) {
            try {
                this.f15795a.unregisterReceiver(cVar);
            } catch (RuntimeException e7) {
                g0.o.i("StreamVolumeManager", "Error unregistering stream volume receiver", e7);
            }
            this.f15799e = null;
        }
    }

    public void h(int i7) {
        if (this.f15800f == i7) {
            return;
        }
        this.f15800f = i7;
        i();
        this.f15797c.D(i7);
    }

    public final void i() {
        int f7 = f(this.f15798d, this.f15800f);
        boolean e7 = e(this.f15798d, this.f15800f);
        if (this.f15801g == f7 && this.f15802h == e7) {
            return;
        }
        this.f15801g = f7;
        this.f15802h = e7;
        this.f15797c.B(f7, e7);
    }
}
