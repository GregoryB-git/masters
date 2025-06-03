/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.database.ContentObserver
 *  android.media.AudioDeviceCallback
 *  android.media.AudioDeviceInfo
 *  android.media.AudioManager
 *  android.net.Uri
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.String
 */
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
import g0.M;
import g0.a;
import m0.j;

public final class i {
    public final Context a;
    public final f b;
    public final Handler c;
    public final c d;
    public final BroadcastReceiver e;
    public final d f;
    public m0.e g;
    public j h;
    public d0.b i;
    public boolean j;

    public i(Context object, f f8, d0.b b8, j j8) {
        Context context;
        this.a = context = object.getApplicationContext();
        this.b = (f)a.e(f8);
        this.i = b8;
        this.h = j8;
        b8 = M.C();
        this.c = b8;
        int n8 = M.a;
        f8 = null;
        object = n8 >= 23 ? new c(null) : null;
        this.d = object;
        object = n8 >= 21 ? new e(null) : null;
        this.e = object;
        j8 = m0.e.j();
        object = f8;
        if (j8 != null) {
            object = new d((Handler)b8, context.getContentResolver(), (Uri)j8);
        }
        this.f = object;
    }

    public final void f(m0.e e8) {
        if (this.j && !e8.equals(this.g)) {
            this.g = e8;
            this.b.a(e8);
        }
    }

    public m0.e g() {
        if (this.j) {
            return (m0.e)a.e(this.g);
        }
        this.j = true;
        Object object = this.f;
        if (object != null) {
            object.a();
        }
        if (M.a >= 23 && (object = this.d) != null) {
            b.a(this.a, (AudioDeviceCallback)object, this.c);
        }
        BroadcastReceiver broadcastReceiver = this.e;
        object = null;
        if (broadcastReceiver != null) {
            object = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
            object = this.a.registerReceiver(this.e, (IntentFilter)object, null, this.c);
        }
        this.g = object = m0.e.f(this.a, (Intent)object, this.i, this.h);
        return object;
    }

    public void h(d0.b b8) {
        this.i = b8;
        this.f(m0.e.g(this.a, b8, this.h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        j j8 = this.h;
        Object var3_3 = null;
        j8 = j8 == null ? null : j8.a;
        if (M.c((Object)audioDeviceInfo, j8)) {
            return;
        }
        j8 = var3_3;
        if (audioDeviceInfo != null) {
            j8 = new j(audioDeviceInfo);
        }
        this.h = j8;
        this.f(m0.e.g(this.a, this.i, j8));
    }

    public void j() {
        Object object;
        if (!this.j) {
            return;
        }
        this.g = null;
        if (M.a >= 23 && (object = this.d) != null) {
            b.b(this.a, (AudioDeviceCallback)object);
        }
        if ((object = this.e) != null) {
            this.a.unregisterReceiver((BroadcastReceiver)object);
        }
        if ((object = this.f) != null) {
            object.b();
        }
        this.j = false;
    }

    public static final abstract class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager)a.e((Object)((AudioManager)context.getSystemService("audio")))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager)a.e((Object)((AudioManager)context.getSystemService("audio")))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    public final class c
    extends AudioDeviceCallback {
        public c() {
        }

        public /* synthetic */ c( a8) {
            this();
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] object) {
            object = i.this;
            ((i)object).f(m0.e.g(((i)object).a, i.this.i, i.this.h));
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] object) {
            if (M.s((Object[])object, i.this.h)) {
                i.this.h = null;
            }
            object = i.this;
            ((i)object).f(m0.e.g(((i)object).a, i.this.i, i.this.h));
        }
    }

    public final class d
    extends ContentObserver {
        public final ContentResolver a;
        public final Uri b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.a = contentResolver;
            this.b = uri;
        }

        public void a() {
            this.a.registerContentObserver(this.b, false, (ContentObserver)this);
        }

        public void b() {
            this.a.unregisterContentObserver((ContentObserver)this);
        }

        public void onChange(boolean bl) {
            i i8 = i.this;
            i8.f(m0.e.g(i8.a, i.this.i, i.this.h));
        }
    }

    public final class e
    extends BroadcastReceiver {
        public e() {
        }

        public /* synthetic */ e( a8) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            if (!this.isInitialStickyBroadcast()) {
                i i8 = i.this;
                i8.f(m0.e.f(context, intent, i8.i, i.this.h));
            }
        }
    }

    public static interface f {
        public void a(m0.e var1);
    }

}

