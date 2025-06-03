package m0;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import d0.C1179b;
import g0.AbstractC1297a;

/* renamed from: m0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1643i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17556a;

    /* renamed from: b, reason: collision with root package name */
    public final f f17557b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f17558c;

    /* renamed from: d, reason: collision with root package name */
    public final c f17559d;

    /* renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f17560e;

    /* renamed from: f, reason: collision with root package name */
    public final d f17561f;

    /* renamed from: g, reason: collision with root package name */
    public C1639e f17562g;

    /* renamed from: h, reason: collision with root package name */
    public C1644j f17563h;

    /* renamed from: i, reason: collision with root package name */
    public C1179b f17564i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17565j;

    /* renamed from: m0.i$b */
    public static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) AbstractC1297a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) AbstractC1297a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: m0.i$c */
    public final class c extends AudioDeviceCallback {
        public c() {
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C1643i c1643i = C1643i.this;
            c1643i.f(C1639e.g(c1643i.f17556a, C1643i.this.f17564i, C1643i.this.f17563h));
        }

        @Override // android.media.AudioDeviceCallback
        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (g0.M.s(audioDeviceInfoArr, C1643i.this.f17563h)) {
                C1643i.this.f17563h = null;
            }
            C1643i c1643i = C1643i.this;
            c1643i.f(C1639e.g(c1643i.f17556a, C1643i.this.f17564i, C1643i.this.f17563h));
        }
    }

    /* renamed from: m0.i$d */
    public final class d extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f17567a;

        /* renamed from: b, reason: collision with root package name */
        public final Uri f17568b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f17567a = contentResolver;
            this.f17568b = uri;
        }

        public void a() {
            this.f17567a.registerContentObserver(this.f17568b, false, this);
        }

        public void b() {
            this.f17567a.unregisterContentObserver(this);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z7) {
            C1643i c1643i = C1643i.this;
            c1643i.f(C1639e.g(c1643i.f17556a, C1643i.this.f17564i, C1643i.this.f17563h));
        }
    }

    /* renamed from: m0.i$e */
    public final class e extends BroadcastReceiver {
        public e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            C1643i c1643i = C1643i.this;
            c1643i.f(C1639e.f(context, intent, c1643i.f17564i, C1643i.this.f17563h));
        }
    }

    /* renamed from: m0.i$f */
    public interface f {
        void a(C1639e c1639e);
    }

    public C1643i(Context context, f fVar, C1179b c1179b, C1644j c1644j) {
        Context applicationContext = context.getApplicationContext();
        this.f17556a = applicationContext;
        this.f17557b = (f) AbstractC1297a.e(fVar);
        this.f17564i = c1179b;
        this.f17563h = c1644j;
        Handler C7 = g0.M.C();
        this.f17558c = C7;
        int i7 = g0.M.f14261a;
        byte b7 = 0;
        this.f17559d = i7 >= 23 ? new c() : null;
        this.f17560e = i7 >= 21 ? new e() : null;
        Uri j7 = C1639e.j();
        this.f17561f = j7 != null ? new d(C7, applicationContext.getContentResolver(), j7) : null;
    }

    public final void f(C1639e c1639e) {
        if (!this.f17565j || c1639e.equals(this.f17562g)) {
            return;
        }
        this.f17562g = c1639e;
        this.f17557b.a(c1639e);
    }

    public C1639e g() {
        c cVar;
        if (this.f17565j) {
            return (C1639e) AbstractC1297a.e(this.f17562g);
        }
        this.f17565j = true;
        d dVar = this.f17561f;
        if (dVar != null) {
            dVar.a();
        }
        if (g0.M.f14261a >= 23 && (cVar = this.f17559d) != null) {
            b.a(this.f17556a, cVar, this.f17558c);
        }
        C1639e f7 = C1639e.f(this.f17556a, this.f17560e != null ? this.f17556a.registerReceiver(this.f17560e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.f17558c) : null, this.f17564i, this.f17563h);
        this.f17562g = f7;
        return f7;
    }

    public void h(C1179b c1179b) {
        this.f17564i = c1179b;
        f(C1639e.g(this.f17556a, c1179b, this.f17563h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        C1644j c1644j = this.f17563h;
        if (g0.M.c(audioDeviceInfo, c1644j == null ? null : c1644j.f17571a)) {
            return;
        }
        C1644j c1644j2 = audioDeviceInfo != null ? new C1644j(audioDeviceInfo) : null;
        this.f17563h = c1644j2;
        f(C1639e.g(this.f17556a, this.f17564i, c1644j2));
    }

    public void j() {
        c cVar;
        if (this.f17565j) {
            this.f17562g = null;
            if (g0.M.f14261a >= 23 && (cVar = this.f17559d) != null) {
                b.b(this.f17556a, cVar);
            }
            BroadcastReceiver broadcastReceiver = this.f17560e;
            if (broadcastReceiver != null) {
                this.f17556a.unregisterReceiver(broadcastReceiver);
            }
            d dVar = this.f17561f;
            if (dVar != null) {
                dVar.b();
            }
            this.f17565j = false;
        }
    }
}
