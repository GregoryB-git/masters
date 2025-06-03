package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import v3.d0;
import v3.f1;
import v5.l;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15690a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f15691b;

    /* renamed from: c, reason: collision with root package name */
    public final a f15692c;

    /* renamed from: d, reason: collision with root package name */
    public final AudioManager f15693d;

    /* renamed from: e, reason: collision with root package name */
    public b f15694e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f15695g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15696h;

    public interface a {
    }

    public final class b extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f15697b = 0;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            p1 p1Var = p1.this;
            p1Var.f15691b.post(new b.d(p1Var, 7));
        }
    }

    public p1(Context context, Handler handler, d0.b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15690a = applicationContext;
        this.f15691b = handler;
        this.f15692c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        x6.b.K(audioManager);
        this.f15693d = audioManager;
        this.f = 3;
        this.f15695g = a(audioManager, 3);
        int i10 = this.f;
        this.f15696h = v5.e0.f15881a >= 23 ? audioManager.isStreamMute(i10) : a(audioManager, i10) == 0;
        b bVar2 = new b();
        try {
            applicationContext.registerReceiver(bVar2, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f15694e = bVar2;
        } catch (RuntimeException e10) {
            v5.m.g("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            v5.m.g("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public final void b(int i10) {
        if (this.f == i10) {
            return;
        }
        this.f = i10;
        c();
        d0.b bVar = (d0.b) this.f15692c;
        m Y = d0.Y(d0.this.B);
        if (Y.equals(d0.this.f15272c0)) {
            return;
        }
        d0 d0Var = d0.this;
        d0Var.f15272c0 = Y;
        d0Var.f15284l.e(29, new aa.m0(Y, 2));
    }

    public final void c() {
        final int a10 = a(this.f15693d, this.f);
        AudioManager audioManager = this.f15693d;
        int i10 = this.f;
        final boolean isStreamMute = v5.e0.f15881a >= 23 ? audioManager.isStreamMute(i10) : a(audioManager, i10) == 0;
        if (this.f15695g == a10 && this.f15696h == isStreamMute) {
            return;
        }
        this.f15695g = a10;
        this.f15696h = isStreamMute;
        d0.this.f15284l.e(30, new l.a() { // from class: v3.e0
            @Override // v5.l.a
            public final void invoke(Object obj) {
                ((f1.c) obj).W(a10, isStreamMute);
            }
        });
    }
}
