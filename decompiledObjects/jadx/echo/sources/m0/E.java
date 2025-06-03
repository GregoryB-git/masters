package m0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import d0.AbstractC1203z;
import d0.C1179b;
import d0.C1194q;
import g0.AbstractC1297a;
import m0.C1645k;
import m0.N;

/* loaded from: classes.dex */
public final class E implements N.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17368a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f17369b;

    public static final class a {
        public static C1645k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
            boolean isOffloadedPlaybackSupported;
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
            return !isOffloadedPlaybackSupported ? C1645k.f17572d : new C1645k.b().e(true).g(z7).d();
        }
    }

    public static final class b {
        public static C1645k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z7) {
            int playbackOffloadSupport;
            playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (playbackOffloadSupport == 0) {
                return C1645k.f17572d;
            }
            return new C1645k.b().e(true).f(g0.M.f14261a > 32 && playbackOffloadSupport == 2).g(z7).d();
        }
    }

    public E(Context context) {
        this.f17368a = context;
    }

    @Override // m0.N.d
    public C1645k a(C1194q c1194q, C1179b c1179b) {
        AbstractC1297a.e(c1194q);
        AbstractC1297a.e(c1179b);
        int i7 = g0.M.f14261a;
        if (i7 < 29 || c1194q.f12703C == -1) {
            return C1645k.f17572d;
        }
        boolean b7 = b(this.f17368a);
        int f7 = AbstractC1203z.f((String) AbstractC1297a.e(c1194q.f12726n), c1194q.f12722j);
        if (f7 == 0 || i7 < g0.M.K(f7)) {
            return C1645k.f17572d;
        }
        int M6 = g0.M.M(c1194q.f12702B);
        if (M6 == 0) {
            return C1645k.f17572d;
        }
        try {
            AudioFormat L6 = g0.M.L(c1194q.f12703C, M6, f7);
            AudioAttributes audioAttributes = c1179b.a().f12606a;
            return i7 >= 31 ? b.a(L6, audioAttributes, b7) : a.a(L6, audioAttributes, b7);
        } catch (IllegalArgumentException unused) {
            return C1645k.f17572d;
        }
    }

    public final boolean b(Context context) {
        Boolean bool;
        AudioManager audioManager;
        Boolean bool2 = this.f17369b;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            bool = Boolean.FALSE;
        } else {
            String parameters = audioManager.getParameters("offloadVariableRateSupported");
            bool = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
        }
        this.f17369b = bool;
        return this.f17369b.booleanValue();
    }
}
