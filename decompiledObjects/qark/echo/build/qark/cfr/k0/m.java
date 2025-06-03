/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Handler
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package k0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import d0.b;
import g0.M;
import g0.o;
import k0.c;
import k0.d;
import k0.e;
import k0.f;
import k0.g;
import k0.h;
import k0.i;
import k0.j;
import k0.k;
import k0.l;

public final class m {
    public final AudioManager a;
    public final a b;
    public b c;
    public d0.b d;
    public int e;
    public int f;
    public float g = 1.0f;
    public AudioFocusRequest h;
    public boolean i;

    public m(Context context, Handler handler, b b8) {
        this.a = (AudioManager)g0.a.e((Object)((AudioManager)context.getApplicationContext().getSystemService("audio")));
        this.c = b8;
        this.b = new a(handler);
        this.e = 0;
    }

    public static int e(d0.b b8) {
        if (b8 == null) {
            return 0;
        }
        switch (b8.c) {
            default: {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unidentified audio usage: ");
                stringBuilder.append(b8.c);
                o.h("AudioFocusManager", stringBuilder.toString());
                return 0;
            }
            case 16: {
                return 4;
            }
            case 11: {
                if (b8.a == 1) {
                    return 2;
                }
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
            case 0: 
        }
        o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
        return 1;
    }

    public final void a() {
        this.a.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)this.b);
    }

    public final void b() {
        int n8 = this.e;
        if (n8 != 1) {
            if (n8 == 0) {
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
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest != null) {
            k.a(this.a, audioFocusRequest);
        }
    }

    public final void f(int n8) {
        b b8 = this.c;
        if (b8 != null) {
            b8.j(n8);
        }
    }

    public float g() {
        return this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void h(int n8) {
        if (n8 != -3 && n8 != -2) {
            if (n8 == -1) {
                this.f(-1);
                this.b();
                this.n(1);
                return;
            }
            if (n8 != 1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown focus change type: ");
                stringBuilder.append(n8);
                o.h("AudioFocusManager", stringBuilder.toString());
                return;
            }
            this.n(2);
            this.f(1);
            return;
        }
        if (n8 != -2 && !this.q()) {
            n8 = 4;
        } else {
            this.f(0);
            n8 = 3;
        }
        this.n(n8);
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
        int n8 = M.a >= 26 ? this.l() : this.k();
        if (n8 == 1) {
            this.n(2);
            return 1;
        }
        this.n(1);
        return -1;
    }

    public final int k() {
        return this.a.requestAudioFocus((AudioManager.OnAudioFocusChangeListener)this.b, M.k0(((d0.b)g0.a.e((Object)this.d)).c), this.f);
    }

    public final int l() {
        AudioFocusRequest audioFocusRequest = this.h;
        if (audioFocusRequest == null || this.i) {
            e.a();
            audioFocusRequest = audioFocusRequest == null ? c.a(this.f) : d.a(this.h);
            boolean bl = this.q();
            this.h = i.a(h.a(g.a(f.a((AudioFocusRequest.Builder)audioFocusRequest, ((d0.b)g0.a.e((Object)this.d)).a().a), bl), this.b));
            this.i = false;
        }
        return j.a(this.a, this.h);
    }

    public void m(d0.b b8) {
        if (!M.c(this.d, b8)) {
            boolean bl;
            int n8;
            this.d = b8;
            this.f = n8 = m.e(b8);
            boolean bl2 = bl = true;
            if (n8 != 1) {
                bl2 = n8 == 0 ? bl : false;
            }
            g0.a.b(bl2, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public final void n(int n8) {
        if (this.e == n8) {
            return;
        }
        this.e = n8;
        float f8 = n8 == 4 ? 0.2f : 1.0f;
        if (this.g == f8) {
            return;
        }
        this.g = f8;
        b b8 = this.c;
        if (b8 != null) {
            b8.F(f8);
        }
    }

    public final boolean o(int n8) {
        if (n8 != 1 && this.f == 1) {
            return true;
        }
        return false;
    }

    public int p(boolean bl, int n8) {
        if (!this.o(n8)) {
            this.b();
            this.n(0);
            return 1;
        }
        if (bl) {
            return this.j();
        }
        n8 = this.e;
        if (n8 != 1) {
            if (n8 != 3) {
                return 1;
            }
            return 0;
        }
        return -1;
    }

    public final boolean q() {
        d0.b b8 = this.d;
        if (b8 != null && b8.a == 1) {
            return true;
        }
        return false;
    }

    public class a
    implements AudioManager.OnAudioFocusChangeListener {
        public final Handler o;

        public a(Handler handler) {
            this.o = handler;
        }

        public static /* synthetic */ void a(a a8, int n8) {
            a8.b(n8);
        }

        public final /* synthetic */ void b(int n8) {
            m.this.h(n8);
        }

        public void onAudioFocusChange(int n8) {
            this.o.post((Runnable)new l(this, n8));
        }
    }

    public static interface b {
        public void F(float var1);

        public void j(int var1);
    }

}

