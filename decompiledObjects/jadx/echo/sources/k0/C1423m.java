package k0;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.android.installreferrer.api.InstallReferrerClient;
import d0.C1179b;
import g0.AbstractC1297a;
import k0.C1423m;

/* renamed from: k0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423m {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f15820a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15821b;

    /* renamed from: c, reason: collision with root package name */
    public b f15822c;

    /* renamed from: d, reason: collision with root package name */
    public C1179b f15823d;

    /* renamed from: f, reason: collision with root package name */
    public int f15825f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f15827h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15828i;

    /* renamed from: g, reason: collision with root package name */
    public float f15826g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f15824e = 0;

    /* renamed from: k0.m$a */
    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: o, reason: collision with root package name */
        public final Handler f15829o;

        public a(Handler handler) {
            this.f15829o = handler;
        }

        public final /* synthetic */ void b(int i7) {
            C1423m.this.h(i7);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i7) {
            this.f15829o.post(new Runnable() { // from class: k0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C1423m.a.this.b(i7);
                }
            });
        }
    }

    /* renamed from: k0.m$b */
    public interface b {
        void F(float f7);

        void j(int i7);
    }

    public C1423m(Context context, Handler handler, b bVar) {
        this.f15820a = (AudioManager) AbstractC1297a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
        this.f15822c = bVar;
        this.f15821b = new a(handler);
    }

    public static int e(C1179b c1179b) {
        if (c1179b == null) {
            return 0;
        }
        switch (c1179b.f12602c) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                g0.o.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c1179b.f12600a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 3;
            case 15:
            default:
                g0.o.h("AudioFocusManager", "Unidentified audio usage: " + c1179b.f12602c);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void a() {
        this.f15820a.abandonAudioFocus(this.f15821b);
    }

    public final void b() {
        int i7 = this.f15824e;
        if (i7 == 1 || i7 == 0) {
            return;
        }
        if (g0.M.f14261a >= 26) {
            c();
        } else {
            a();
        }
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest = this.f15827h;
        if (audioFocusRequest != null) {
            this.f15820a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    public final void f(int i7) {
        b bVar = this.f15822c;
        if (bVar != null) {
            bVar.j(i7);
        }
    }

    public float g() {
        return this.f15826g;
    }

    public final void h(int i7) {
        int i8;
        if (i7 == -3 || i7 == -2) {
            if (i7 == -2 || q()) {
                f(0);
                i8 = 3;
            } else {
                i8 = 4;
            }
            n(i8);
            return;
        }
        if (i7 == -1) {
            f(-1);
            b();
            n(1);
        } else if (i7 == 1) {
            n(2);
            f(1);
        } else {
            g0.o.h("AudioFocusManager", "Unknown focus change type: " + i7);
        }
    }

    public void i() {
        this.f15822c = null;
        b();
        n(0);
    }

    public final int j() {
        if (this.f15824e == 2) {
            return 1;
        }
        if ((g0.M.f14261a >= 26 ? l() : k()) == 1) {
            n(2);
            return 1;
        }
        n(1);
        return -1;
    }

    public final int k() {
        return this.f15820a.requestAudioFocus(this.f15821b, g0.M.k0(((C1179b) AbstractC1297a.e(this.f15823d)).f12602c), this.f15825f);
    }

    public final int l() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f15827h;
        if (audioFocusRequest == null || this.f15828i) {
            AbstractC1407e.a();
            AudioFocusRequest.Builder a7 = audioFocusRequest == null ? AbstractC1403c.a(this.f15825f) : AbstractC1405d.a(this.f15827h);
            boolean q7 = q();
            audioAttributes = a7.setAudioAttributes(((C1179b) AbstractC1297a.e(this.f15823d)).a().f12606a);
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(q7);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f15821b);
            build = onAudioFocusChangeListener.build();
            this.f15827h = build;
            this.f15828i = false;
        }
        requestAudioFocus = this.f15820a.requestAudioFocus(this.f15827h);
        return requestAudioFocus;
    }

    public void m(C1179b c1179b) {
        if (g0.M.c(this.f15823d, c1179b)) {
            return;
        }
        this.f15823d = c1179b;
        int e7 = e(c1179b);
        this.f15825f = e7;
        boolean z7 = true;
        if (e7 != 1 && e7 != 0) {
            z7 = false;
        }
        AbstractC1297a.b(z7, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void n(int i7) {
        if (this.f15824e == i7) {
            return;
        }
        this.f15824e = i7;
        float f7 = i7 == 4 ? 0.2f : 1.0f;
        if (this.f15826g == f7) {
            return;
        }
        this.f15826g = f7;
        b bVar = this.f15822c;
        if (bVar != null) {
            bVar.F(f7);
        }
    }

    public final boolean o(int i7) {
        return i7 != 1 && this.f15825f == 1;
    }

    public int p(boolean z7, int i7) {
        if (!o(i7)) {
            b();
            n(0);
            return 1;
        }
        if (z7) {
            return j();
        }
        int i8 = this.f15824e;
        if (i8 != 1) {
            return i8 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean q() {
        C1179b c1179b = this.f15823d;
        return c1179b != null && c1179b.f12600a == 1;
    }
}
