package k0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: k0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1401b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15685a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15687c;

    /* renamed from: k0.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final InterfaceC0225b f15688o;

        /* renamed from: p, reason: collision with root package name */
        public final Handler f15689p;

        public a(Handler handler, InterfaceC0225b interfaceC0225b) {
            this.f15689p = handler;
            this.f15688o = interfaceC0225b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f15689p.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1401b.this.f15687c) {
                this.f15688o.E();
            }
        }
    }

    /* renamed from: k0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0225b {
        void E();
    }

    public C1401b(Context context, Handler handler, InterfaceC0225b interfaceC0225b) {
        this.f15685a = context.getApplicationContext();
        this.f15686b = new a(handler, interfaceC0225b);
    }

    public void b(boolean z7) {
        boolean z8;
        if (z7 && !this.f15687c) {
            this.f15685a.registerReceiver(this.f15686b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z8 = true;
        } else {
            if (z7 || !this.f15687c) {
                return;
            }
            this.f15685a.unregisterReceiver(this.f15686b);
            z8 = false;
        }
        this.f15687c = z8;
    }
}
