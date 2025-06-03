package v3;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import v3.d;
import v3.d0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f15258a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15259b;

    /* renamed from: c, reason: collision with root package name */
    public b f15260c;

    /* renamed from: d, reason: collision with root package name */
    public x3.d f15261d;

    /* renamed from: e, reason: collision with root package name */
    public int f15262e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public float f15263g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public AudioFocusRequest f15264h;

    public class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f15265a;

        public a(Handler handler) {
            this.f15265a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i10) {
            this.f15265a.post(new Runnable() { // from class: v3.c
                @Override // java.lang.Runnable
                public final void run() {
                    int i11;
                    d.a aVar = d.a.this;
                    int i12 = i10;
                    d dVar = d.this;
                    if (i12 == -3 || i12 == -2) {
                        if (i12 != -2) {
                            x3.d dVar2 = dVar.f15261d;
                            if (!(dVar2 != null && dVar2.f16948a == 1)) {
                                i11 = 3;
                                dVar.d(i11);
                                return;
                            }
                        }
                        dVar.b(0);
                        i11 = 2;
                        dVar.d(i11);
                        return;
                    }
                    if (i12 == -1) {
                        dVar.b(-1);
                        dVar.a();
                    } else {
                        if (i12 == 1) {
                            dVar.d(1);
                            dVar.b(1);
                            return;
                        }
                        dVar.getClass();
                        v5.m.f("AudioFocusManager", "Unknown focus change type: " + i12);
                    }
                }
            });
        }
    }

    public interface b {
    }

    public d(Context context, Handler handler, d0.b bVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f15258a = audioManager;
        this.f15260c = bVar;
        this.f15259b = new a(handler);
        this.f15262e = 0;
    }

    public final void a() {
        if (this.f15262e == 0) {
            return;
        }
        if (v5.e0.f15881a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f15264h;
            if (audioFocusRequest != null) {
                this.f15258a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f15258a.abandonAudioFocus(this.f15259b);
        }
        d(0);
    }

    public final void b(int i10) {
        b bVar = this.f15260c;
        if (bVar != null) {
            d0.b bVar2 = (d0.b) bVar;
            boolean k10 = d0.this.k();
            d0 d0Var = d0.this;
            int i11 = 1;
            if (k10 && i10 != 1) {
                i11 = 2;
            }
            d0Var.r0(i10, i11, k10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r7.f16948a == 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(x3.d r7) {
        /*
            r6 = this;
            x3.d r0 = r6.f15261d
            boolean r0 = v5.e0.a(r0, r7)
            if (r0 != 0) goto L4d
            r6.f15261d = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto Lf
            goto L40
        Lf:
            int r2 = r7.f16950c
            r3 = 3
            java.lang.String r4 = "AudioFocusManager"
            r5 = 2
            switch(r2) {
                case 0: goto L39;
                case 1: goto L3e;
                case 2: goto L37;
                case 3: goto L40;
                case 4: goto L37;
                case 5: goto L41;
                case 6: goto L41;
                case 7: goto L41;
                case 8: goto L41;
                case 9: goto L41;
                case 10: goto L41;
                case 11: goto L33;
                case 12: goto L41;
                case 13: goto L41;
                case 14: goto L3e;
                case 15: goto L18;
                case 16: goto L2b;
                default: goto L18;
            }
        L18:
            java.lang.String r2 = "Unidentified audio usage: "
            java.lang.StringBuilder r2 = defpackage.f.l(r2)
            int r7 = r7.f16950c
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            v5.m.f(r4, r7)
            goto L40
        L2b:
            int r7 = v5.e0.f15881a
            r2 = 19
            if (r7 < r2) goto L37
            r3 = 4
            goto L41
        L33:
            int r7 = r7.f16948a
            if (r7 != r1) goto L41
        L37:
            r3 = r5
            goto L41
        L39:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            v5.m.f(r4, r7)
        L3e:
            r3 = r1
            goto L41
        L40:
            r3 = r0
        L41:
            r6.f = r3
            if (r3 == r1) goto L47
            if (r3 != 0) goto L48
        L47:
            r0 = r1
        L48:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            x6.b.o(r7, r0)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.d.c(x3.d):void");
    }

    public final void d(int i10) {
        if (this.f15262e == i10) {
            return;
        }
        this.f15262e = i10;
        float f = i10 == 3 ? 0.2f : 1.0f;
        if (this.f15263g == f) {
            return;
        }
        this.f15263g = f;
        b bVar = this.f15260c;
        if (bVar != null) {
            d0 d0Var = d0.this;
            d0Var.j0(Float.valueOf(d0Var.X * d0Var.A.f15263g), 1, 2);
        }
    }

    public final int e(int i10, boolean z10) {
        int requestAudioFocus;
        int i11 = 1;
        if (i10 == 1 || this.f != 1) {
            a();
            return z10 ? 1 : -1;
        }
        if (!z10) {
            return -1;
        }
        if (this.f15262e != 1) {
            if (v5.e0.f15881a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f15264h;
                if (audioFocusRequest == null) {
                    AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f) : new AudioFocusRequest.Builder(this.f15264h);
                    x3.d dVar = this.f15261d;
                    boolean z11 = dVar != null && dVar.f16948a == 1;
                    dVar.getClass();
                    this.f15264h = builder.setAudioAttributes(dVar.a().f16953a).setWillPauseWhenDucked(z11).setOnAudioFocusChangeListener(this.f15259b).build();
                }
                requestAudioFocus = this.f15258a.requestAudioFocus(this.f15264h);
            } else {
                AudioManager audioManager = this.f15258a;
                a aVar = this.f15259b;
                x3.d dVar2 = this.f15261d;
                dVar2.getClass();
                requestAudioFocus = audioManager.requestAudioFocus(aVar, v5.e0.y(dVar2.f16950c), this.f);
            }
            if (requestAudioFocus == 1) {
                d(1);
            } else {
                d(0);
                i11 = -1;
            }
        }
        return i11;
    }
}
