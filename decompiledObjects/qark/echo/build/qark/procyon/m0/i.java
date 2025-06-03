// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.media.AudioDeviceInfo;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.net.Uri;
import g0.M;
import g0.a;
import d0.b;
import android.content.BroadcastReceiver;
import android.os.Handler;
import android.content.Context;

public final class i
{
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
    
    public i(final Context context, final f f, final d0.b i, final j h) {
        final Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = (f)g0.a.e(f);
        this.i = i;
        this.h = h;
        final Handler c = M.C();
        this.c = c;
        final int a = M.a;
        final d d = null;
        c d2;
        if (a >= 23) {
            d2 = new c(null);
        }
        else {
            d2 = null;
        }
        this.d = d2;
        BroadcastReceiver e;
        if (a >= 21) {
            e = new e(null);
        }
        else {
            e = null;
        }
        this.e = e;
        final Uri j = m0.e.j();
        d f2 = d;
        if (j != null) {
            f2 = new d(c, applicationContext.getContentResolver(), j);
        }
        this.f = f2;
    }
    
    public static /* synthetic */ d0.b a(final i i) {
        return i.i;
    }
    
    public static /* synthetic */ j b(final i i) {
        return i.h;
    }
    
    public static /* synthetic */ j c(final i i, final j h) {
        return i.h = h;
    }
    
    public static /* synthetic */ Context e(final i i) {
        return i.a;
    }
    
    public final void f(final m0.e g) {
        if (this.j && !g.equals(this.g)) {
            this.g = g;
            this.b.a(g);
        }
    }
    
    public m0.e g() {
        if (this.j) {
            return (m0.e)g0.a.e(this.g);
        }
        this.j = true;
        final d f = this.f;
        if (f != null) {
            f.a();
        }
        if (M.a >= 23) {
            final c d = this.d;
            if (d != null) {
                m0.i.b.a(this.a, d, this.c);
            }
        }
        final BroadcastReceiver e = this.e;
        Intent registerReceiver = null;
        if (e != null) {
            registerReceiver = this.a.registerReceiver(this.e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String)null, this.c);
        }
        return this.g = m0.e.f(this.a, registerReceiver, this.i, this.h);
    }
    
    public void h(final d0.b i) {
        this.i = i;
        this.f(m0.e.g(this.a, i, this.h));
    }
    
    public void i(final AudioDeviceInfo audioDeviceInfo) {
        final j h = this.h;
        final j j = null;
        Object a;
        if (h == null) {
            a = null;
        }
        else {
            a = h.a;
        }
        if (M.c(audioDeviceInfo, a)) {
            return;
        }
        j h2 = j;
        if (audioDeviceInfo != null) {
            h2 = new j(audioDeviceInfo);
        }
        this.h = h2;
        this.f(m0.e.g(this.a, this.i, h2));
    }
    
    public void j() {
        if (!this.j) {
            return;
        }
        this.g = null;
        if (M.a >= 23) {
            final c d = this.d;
            if (d != null) {
                m0.i.b.b(this.a, d);
            }
        }
        final BroadcastReceiver e = this.e;
        if (e != null) {
            this.a.unregisterReceiver(e);
        }
        final d f = this.f;
        if (f != null) {
            f.b();
        }
        this.j = false;
    }
    
    public abstract static final class b
    {
        public static void a(final Context context, final AudioDeviceCallback audioDeviceCallback, final Handler handler) {
            ((AudioManager)a.e(context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
        
        public static void b(final Context context, final AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager)a.e(context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }
    
    public final class c extends AudioDeviceCallback
    {
        public void onAudioDevicesAdded(final AudioDeviceInfo[] array) {
            final i a = m0.i.this;
            a.f(m0.e.g(m0.i.e(a), m0.i.a(m0.i.this), m0.i.b(m0.i.this)));
        }
        
        public void onAudioDevicesRemoved(final AudioDeviceInfo[] array) {
            if (M.s(array, m0.i.b(m0.i.this))) {
                m0.i.c(m0.i.this, null);
            }
            final i a = m0.i.this;
            a.f(m0.e.g(m0.i.e(a), m0.i.a(m0.i.this), m0.i.b(m0.i.this)));
        }
    }
    
    public final class d extends ContentObserver
    {
        public final ContentResolver a;
        public final Uri b;
        
        public d(final Handler handler, final ContentResolver a, final Uri b) {
            super(handler);
            this.a = a;
            this.b = b;
        }
        
        public void a() {
            this.a.registerContentObserver(this.b, false, (ContentObserver)this);
        }
        
        public void b() {
            this.a.unregisterContentObserver((ContentObserver)this);
        }
        
        public void onChange(final boolean b) {
            final i c = m0.i.this;
            c.f(m0.e.g(m0.i.e(c), m0.i.a(m0.i.this), m0.i.b(m0.i.this)));
        }
    }
    
    public final class e extends BroadcastReceiver
    {
        public void onReceive(final Context context, final Intent intent) {
            if (!this.isInitialStickyBroadcast()) {
                final i a = m0.i.this;
                a.f(m0.e.f(context, intent, m0.i.a(a), m0.i.b(m0.i.this)));
            }
        }
    }
    
    public interface f
    {
        void a(final m0.e p0);
    }
}
