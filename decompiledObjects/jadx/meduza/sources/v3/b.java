package v3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import v3.d0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15239a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15240b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15241c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0247b f15242a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f15243b;

        public a(Handler handler, d0.b bVar) {
            this.f15243b = handler;
            this.f15242a = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f15243b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (b.this.f15241c) {
                d0.this.r0(-1, 3, false);
            }
        }
    }

    /* renamed from: v3.b$b, reason: collision with other inner class name */
    public interface InterfaceC0247b {
    }

    public b(Context context, Handler handler, d0.b bVar) {
        this.f15239a = context.getApplicationContext();
        this.f15240b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f15241c) {
            this.f15239a.unregisterReceiver(this.f15240b);
            this.f15241c = false;
        }
    }
}
