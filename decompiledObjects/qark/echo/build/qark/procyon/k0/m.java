// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k0;

import android.media.AudioFocusRequest$Builder;
import g0.M;
import android.media.AudioManager$OnAudioFocusChangeListener;
import g0.o;
import g0.a;
import android.os.Handler;
import android.content.Context;
import android.media.AudioFocusRequest;
import d0.b;
import android.media.AudioManager;

public final class m
{
    public final AudioManager a;
    public final a b;
    public b c;
    public d0.b d;
    public int e;
    public int f;
    public float g;
    public AudioFocusRequest h;
    public boolean i;
    
    public m(final Context context, final Handler handler, final b c) {
        this.g = 1.0f;
        this.a = (AudioManager)g0.a.e(context.getApplicationContext().getSystemService("audio"));
        this.c = c;
        this.b = new a(handler);
        this.e = 0;
    }
    
    public static int e(final d0.b b) {
        if (b == null) {
            return 0;
        }
        switch (b.c) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unidentified audio usage: ");
                sb.append(b.c);
                o.h("AudioFocusManager", sb.toString());
                return 0;
            }
            case 16: {
                return 4;
            }
            case 11: {
                if (b.a == 1) {
                    return 2;
                }
                return 3;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13: {
                return 3;
            }
            case 3: {
                return 0;
            }
            case 2:
            case 4: {
                return 2;
            }
            case 1:
            case 14: {
                return 1;
            }
            case 0: {
                o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            }
        }
    }
    
    public final void a() {
        this.a.abandonAudioFocus((AudioManager$OnAudioFocusChangeListener)this.b);
    }
    
    public final void b() {
        final int e = this.e;
        if (e != 1) {
            if (e == 0) {
                return;
            }
            if (M.a >= 26) {
                this.c();
                return;
            }
            this.a();
        }
    }
    
    public final void c() {
        final AudioFocusRequest h = this.h;
        if (h != null) {
            k.a(this.a, h);
        }
    }
    
    public final void f(final int n) {
        final b c = this.c;
        if (c != null) {
            c.j(n);
        }
    }
    
    public float g() {
        return this.g;
    }
    
    public final void h(int i) {
        if (i == -3 || i == -2) {
            if (i != -2 && !this.q()) {
                i = 4;
            }
            else {
                this.f(0);
                i = 3;
            }
            this.n(i);
            return;
        }
        if (i == -1) {
            this.f(-1);
            this.b();
            this.n(1);
            return;
        }
        if (i != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown focus change type: ");
            sb.append(i);
            o.h("AudioFocusManager", sb.toString());
            return;
        }
        this.n(2);
        this.f(1);
    }
    
    public void i() {
        this.c = null;
        this.b();
        this.n(0);
    }
    
    public final int j() {
        if (this.e == 2) {
            return 1;
        }
        int n;
        if (M.a >= 26) {
            n = this.l();
        }
        else {
            n = this.k();
        }
        if (n == 1) {
            this.n(2);
            return 1;
        }
        this.n(1);
        return -1;
    }
    
    public final int k() {
        return this.a.requestAudioFocus((AudioManager$OnAudioFocusChangeListener)this.b, M.k0(((d0.b)g0.a.e(this.d)).c), this.f);
    }
    
    public final int l() {
        final AudioFocusRequest h = this.h;
        if (h == null || this.i) {
            k0.e.a();
            AudioFocusRequest$Builder audioFocusRequest$Builder;
            if (h == null) {
                audioFocusRequest$Builder = k0.c.a(this.f);
            }
            else {
                audioFocusRequest$Builder = k0.d.a(this.h);
            }
            this.h = k0.i.a(k0.h.a(k0.g.a(k0.f.a(audioFocusRequest$Builder, ((d0.b)g0.a.e(this.d)).a().a), this.q()), (AudioManager$OnAudioFocusChangeListener)this.b));
            this.i = false;
        }
        return j.a(this.a, this.h);
    }
    
    public void m(final d0.b d) {
        if (!M.c(this.d, d)) {
            this.d = d;
            final int e = e(d);
            this.f = e;
            boolean b = true;
            if (e != 1) {
                b = (e == 0 && b);
            }
            g0.a.b(b, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }
    
    public final void n(final int e) {
        if (this.e == e) {
            return;
        }
        float g;
        if ((this.e = e) == 4) {
            g = 0.2f;
        }
        else {
            g = 1.0f;
        }
        if (this.g == g) {
            return;
        }
        this.g = g;
        final b c = this.c;
        if (c != null) {
            c.F(g);
        }
    }
    
    public final boolean o(final int n) {
        return n != 1 && this.f == 1;
    }
    
    public int p(final boolean b, int e) {
        if (!this.o(e)) {
            this.b();
            this.n(0);
            return 1;
        }
        if (b) {
            return this.j();
        }
        e = this.e;
        if (e == 1) {
            return -1;
        }
        if (e != 3) {
            return 1;
        }
        return 0;
    }
    
    public final boolean q() {
        final d0.b d = this.d;
        return d != null && d.a == 1;
    }
    
    public class a implements AudioManager$OnAudioFocusChangeListener
    {
        public final Handler o;
        
        public a(final Handler o) {
            this.o = o;
        }
        
        public void onAudioFocusChange(final int n) {
            this.o.post((Runnable)new l(this, n));
        }
    }
    
    public interface b
    {
        void F(final float p0);
        
        void j(final int p0);
    }
}
