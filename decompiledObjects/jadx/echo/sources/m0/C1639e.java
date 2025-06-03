package m0;

import X2.AbstractC0703v;
import X2.AbstractC0704w;
import X2.AbstractC0706y;
import X2.g0;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import d0.AbstractC1203z;
import d0.C1179b;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1639e {

    /* renamed from: c, reason: collision with root package name */
    public static final C1639e f17539c = new C1639e(AbstractC0703v.Z(C0235e.f17544d));

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC0703v f17540d = AbstractC0703v.b0(2, 5, 6);

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0704w f17541e = new AbstractC0704w.a().f(5, 6).f(17, 6).f(7, 6).f(30, 10).f(18, 6).f(6, 8).f(8, 8).f(14, 8).c();

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f17542a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17543b;

    /* renamed from: m0.e$b */
    public static final class b {
        private static AbstractC0706y a() {
            AbstractC0706y.a i7 = new AbstractC0706y.a().i(8, 7);
            int i8 = g0.M.f14261a;
            if (i8 >= 31) {
                i7.i(26, 27);
            }
            if (i8 >= 33) {
                i7.a(30);
            }
            return i7.l();
        }

        public static boolean b(AudioManager audioManager, C1644j c1644j) {
            AudioDeviceInfo[] devices = c1644j == null ? ((AudioManager) AbstractC1297a.e(audioManager)).getDevices(2) : new AudioDeviceInfo[]{c1644j.f17571a};
            AbstractC0706y a7 = a();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (a7.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: m0.e$c */
    public static final class c {
        public static AbstractC0703v a(C1179b c1179b) {
            boolean isDirectPlaybackSupported;
            AbstractC0703v.a M6 = AbstractC0703v.M();
            g0 it = C1639e.f17541e.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (g0.M.f14261a >= g0.M.K(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), c1179b.a().f12606a);
                    if (isDirectPlaybackSupported) {
                        M6.a(num);
                    }
                }
            }
            M6.a(2);
            return M6.k();
        }

        public static int b(int i7, int i8, C1179b c1179b) {
            boolean isDirectPlaybackSupported;
            for (int i9 = 10; i9 > 0; i9--) {
                int M6 = g0.M.M(i9);
                if (M6 != 0) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i8).setChannelMask(M6).build(), c1179b.a().f12606a);
                    if (isDirectPlaybackSupported) {
                        return i9;
                    }
                }
            }
            return 0;
        }
    }

    /* renamed from: m0.e$d */
    public static final class d {
        public static C1639e a(AudioManager audioManager, C1179b c1179b) {
            List directProfilesForAttributes;
            directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(c1179b.a().f12606a);
            return new C1639e(C1639e.c(directProfilesForAttributes));
        }

        public static C1644j b(AudioManager audioManager, C1179b c1179b) {
            List audioDevicesForAttributes;
            try {
                audioDevicesForAttributes = ((AudioManager) AbstractC1297a.e(audioManager)).getAudioDevicesForAttributes(c1179b.a().f12606a);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new C1644j((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    /* renamed from: m0.e$e, reason: collision with other inner class name */
    public static final class C0235e {

        /* renamed from: d, reason: collision with root package name */
        public static final C0235e f17544d;

        /* renamed from: a, reason: collision with root package name */
        public final int f17545a;

        /* renamed from: b, reason: collision with root package name */
        public final int f17546b;

        /* renamed from: c, reason: collision with root package name */
        public final AbstractC0706y f17547c;

        static {
            f17544d = g0.M.f14261a >= 33 ? new C0235e(2, a(10)) : new C0235e(2, 10);
        }

        public C0235e(int i7, int i8) {
            this.f17545a = i7;
            this.f17546b = i8;
            this.f17547c = null;
        }

        public static AbstractC0706y a(int i7) {
            AbstractC0706y.a aVar = new AbstractC0706y.a();
            for (int i8 = 1; i8 <= i7; i8++) {
                aVar.a(Integer.valueOf(g0.M.M(i8)));
            }
            return aVar.l();
        }

        public int b(int i7, C1179b c1179b) {
            return this.f17547c != null ? this.f17546b : g0.M.f14261a >= 29 ? c.b(this.f17545a, i7, c1179b) : ((Integer) AbstractC1297a.e((Integer) C1639e.f17541e.getOrDefault(Integer.valueOf(this.f17545a), 0))).intValue();
        }

        public boolean c(int i7) {
            if (this.f17547c == null) {
                return i7 <= this.f17546b;
            }
            int M6 = g0.M.M(i7);
            if (M6 == 0) {
                return false;
            }
            return this.f17547c.contains(Integer.valueOf(M6));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0235e)) {
                return false;
            }
            C0235e c0235e = (C0235e) obj;
            return this.f17545a == c0235e.f17545a && this.f17546b == c0235e.f17546b && g0.M.c(this.f17547c, c0235e.f17547c);
        }

        public int hashCode() {
            int i7 = ((this.f17545a * 31) + this.f17546b) * 31;
            AbstractC0706y abstractC0706y = this.f17547c;
            return i7 + (abstractC0706y == null ? 0 : abstractC0706y.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.f17545a + ", maxChannelCount=" + this.f17546b + ", channelMasks=" + this.f17547c + "]";
        }

        public C0235e(int i7, Set set) {
            this.f17545a = i7;
            AbstractC0706y T6 = AbstractC0706y.T(set);
            this.f17547c = T6;
            g0 it = T6.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                i8 = Math.max(i8, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f17546b = i8;
        }
    }

    public C1639e(List list) {
        this.f17542a = new SparseArray();
        for (int i7 = 0; i7 < list.size(); i7++) {
            C0235e c0235e = (C0235e) list.get(i7);
            this.f17542a.put(c0235e.f17545a, c0235e);
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.f17542a.size(); i9++) {
            i8 = Math.max(i8, ((C0235e) this.f17542a.valueAt(i9)).f17546b);
        }
        this.f17543b = i8;
    }

    public static boolean b() {
        String str = g0.M.f14263c;
        return "Amazon".equals(str) || "Xiaomi".equals(str);
    }

    public static AbstractC0703v c(List list) {
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(a3.f.c(12)));
        for (int i7 = 0; i7 < list.size(); i7++) {
            AudioProfile a7 = AbstractC1635a.a(list.get(i7));
            encapsulationType = a7.getEncapsulationType();
            if (encapsulationType != 1) {
                format = a7.getFormat();
                if (g0.M.A0(format) || f17541e.containsKey(Integer.valueOf(format))) {
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(format));
                    Integer valueOf = Integer.valueOf(format);
                    if (containsKey) {
                        Set set = (Set) AbstractC1297a.e((Set) hashMap.get(valueOf));
                        channelMasks2 = a7.getChannelMasks();
                        set.addAll(a3.f.c(channelMasks2));
                    } else {
                        channelMasks = a7.getChannelMasks();
                        hashMap.put(valueOf, new HashSet(a3.f.c(channelMasks)));
                    }
                }
            }
        }
        AbstractC0703v.a M6 = AbstractC0703v.M();
        for (Map.Entry entry : hashMap.entrySet()) {
            M6.a(new C0235e(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return M6.k();
    }

    public static AbstractC0703v d(int[] iArr, int i7) {
        AbstractC0703v.a M6 = AbstractC0703v.M();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i8 : iArr) {
            M6.a(new C0235e(i8, i7));
        }
        return M6.k();
    }

    public static C1639e e(Context context, C1179b c1179b, AudioDeviceInfo audioDeviceInfo) {
        return g(context, c1179b, (g0.M.f14261a < 23 || audioDeviceInfo == null) ? null : new C1644j(audioDeviceInfo));
    }

    public static C1639e f(Context context, Intent intent, C1179b c1179b, C1644j c1644j) {
        AudioManager audioManager = (AudioManager) AbstractC1297a.e(context.getSystemService("audio"));
        if (c1644j == null) {
            c1644j = g0.M.f14261a >= 33 ? d.b(audioManager, c1179b) : null;
        }
        int i7 = g0.M.f14261a;
        if (i7 >= 33 && (g0.M.E0(context) || g0.M.x0(context))) {
            return d.a(audioManager, c1179b);
        }
        if (i7 >= 23 && b.b(audioManager, c1644j)) {
            return f17539c;
        }
        AbstractC0706y.a aVar = new AbstractC0706y.a();
        aVar.a(2);
        if (i7 >= 29 && (g0.M.E0(context) || g0.M.x0(context))) {
            aVar.j(c.a(c1179b));
            return new C1639e(d(a3.f.n(aVar.l()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z7 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z7 || b()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            aVar.j(f17540d);
        }
        if (intent == null || z7 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1639e(d(a3.f.n(aVar.l()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            aVar.j(a3.f.c(intArrayExtra));
        }
        return new C1639e(d(a3.f.n(aVar.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    public static C1639e g(Context context, C1179b c1179b, C1644j c1644j) {
        return f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c1179b, c1644j);
    }

    public static int h(int i7) {
        int i8 = g0.M.f14261a;
        if (i8 <= 28) {
            if (i7 == 7) {
                i7 = 8;
            } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                i7 = 6;
            }
        }
        if (i8 <= 26 && "fugu".equals(g0.M.f14262b) && i7 == 1) {
            i7 = 2;
        }
        return g0.M.M(i7);
    }

    public static Uri j() {
        if (b()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1639e)) {
            return false;
        }
        C1639e c1639e = (C1639e) obj;
        return g0.M.t(this.f17542a, c1639e.f17542a) && this.f17543b == c1639e.f17543b;
    }

    public int hashCode() {
        return this.f17543b + (g0.M.u(this.f17542a) * 31);
    }

    public Pair i(C1194q c1194q, C1179b c1179b) {
        int f7 = AbstractC1203z.f((String) AbstractC1297a.e(c1194q.f12726n), c1194q.f12722j);
        if (!f17541e.containsKey(Integer.valueOf(f7))) {
            return null;
        }
        if (f7 == 18 && !l(18)) {
            f7 = 6;
        } else if ((f7 == 8 && !l(8)) || (f7 == 30 && !l(30))) {
            f7 = 7;
        }
        if (!l(f7)) {
            return null;
        }
        C0235e c0235e = (C0235e) AbstractC1297a.e((C0235e) this.f17542a.get(f7));
        int i7 = c1194q.f12702B;
        if (i7 == -1 || f7 == 18) {
            int i8 = c1194q.f12703C;
            if (i8 == -1) {
                i8 = 48000;
            }
            i7 = c0235e.b(i8, c1179b);
        } else if (!c1194q.f12726n.equals("audio/vnd.dts.uhd;profile=p2") || g0.M.f14261a >= 33) {
            if (!c0235e.c(i7)) {
                return null;
            }
        } else if (i7 > 10) {
            return null;
        }
        int h7 = h(i7);
        if (h7 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(f7), Integer.valueOf(h7));
    }

    public boolean k(C1194q c1194q, C1179b c1179b) {
        return i(c1194q, c1179b) != null;
    }

    public boolean l(int i7) {
        return g0.M.r(this.f17542a, i7);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f17543b + ", audioProfiles=" + this.f17542a + "]";
    }
}
