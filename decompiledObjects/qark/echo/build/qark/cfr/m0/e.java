/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioAttributes
 *  android.media.AudioDeviceInfo
 *  android.media.AudioFormat
 *  android.media.AudioFormat$Builder
 *  android.media.AudioManager
 *  android.media.AudioProfile
 *  android.net.Uri
 *  android.provider.Settings
 *  android.provider.Settings$Global
 *  android.util.Pair
 *  android.util.SparseArray
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package m0;

import X2.g0;
import X2.v;
import X2.w;
import X2.y;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import d0.b;
import d0.q;
import d0.z;
import g0.M;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m0.a;
import m0.f;
import m0.g;
import m0.h;
import m0.j;

public final class e {
    public static final e c = new e(v.Z(e.d));
    public static final v d;
    public static final w e;
    public final SparseArray a = new SparseArray();
    public final int b;

    static {
        Object object = 5;
        Integer n8 = 6;
        d = v.b0(2, object, (Object)n8);
        object = new w.a().f(object, (Object)n8).f(17, (Object)n8).f(7, (Object)n8).f(30, 10).f(18, (Object)n8);
        Integer n9 = 8;
        e = object.f((Object)n8, (Object)n9).f((Object)n9, (Object)n9).f(14, (Object)n9).c();
    }

    public e(List list) {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < list.size(); ++n8) {
            e e8 = (e)list.get(n8);
            this.a.put(e8.a, (Object)e8);
        }
        int n10 = 0;
        for (n8 = n9; n8 < this.a.size(); ++n8) {
            n10 = Math.max((int)n10, (int)((e)this.a.valueAt((int)n8)).b);
        }
        this.b = n10;
    }

    public /* synthetic */ e(List list,  a8) {
        this(list);
    }

    public static boolean b() {
        String string2 = M.c;
        if (!"Amazon".equals((Object)string2) && !"Xiaomi".equals((Object)string2)) {
            return false;
        }
        return true;
    }

    public static v c(List object) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)2, (Object)new HashSet((Collection)a3.f.c(12)));
        for (int i8 = 0; i8 < object.size(); ++i8) {
            int n8;
            AudioProfile audioProfile = a.a(object.get(i8));
            if (m0.b.a(audioProfile) == 1 || !M.A0(n8 = m0.c.a(audioProfile)) && !e.containsKey(n8)) continue;
            boolean bl = hashMap.containsKey((Object)n8);
            Integer n9 = n8;
            if (bl) {
                ((Set)g0.a.e((Object)((Set)hashMap.get((Object)n9)))).addAll((Collection)a3.f.c(m0.d.a(audioProfile)));
                continue;
            }
            hashMap.put((Object)n9, (Object)new HashSet((Collection)a3.f.c(m0.d.a(audioProfile))));
        }
        object = v.M();
        for (AudioProfile audioProfile : hashMap.entrySet()) {
            object.h(new e((int)((Integer)audioProfile.getKey()), (Set)audioProfile.getValue()));
        }
        return object.k();
    }

    public static v d(int[] arrn, int n8) {
        int n9;
        v.a a8 = v.M();
        int n10 = n9 = 0;
        int[] arrn2 = arrn;
        if (arrn == null) {
            arrn2 = new int[]{};
            n10 = n9;
        }
        while (n10 < arrn2.length) {
            a8.h(new e(arrn2[n10], n8));
            ++n10;
        }
        return a8.k();
    }

    public static e e(Context context, d0.b b8, AudioDeviceInfo object) {
        object = M.a >= 23 && object != null ? new j((AudioDeviceInfo)object) : null;
        return e.g(context, b8, (j)object);
    }

    public static e f(Context arrn, Intent intent, d0.b b8, j object) {
        int n8;
        AudioManager audioManager = (AudioManager)g0.a.e(arrn.getSystemService("audio"));
        if (object == null) {
            object = M.a >= 33 ? d.b(audioManager, b8) : null;
        }
        if ((n8 = M.a) >= 33 && (M.E0((Context)arrn) || M.x0((Context)arrn))) {
            return d.a(audioManager, b8);
        }
        if (n8 >= 23 && b.b(audioManager, (j)object)) {
            return c;
        }
        object = new y.a();
        object.h(2);
        if (n8 >= 29 && (M.E0((Context)arrn) || M.x0((Context)arrn))) {
            object.j((Iterable)c.a(b8));
            return new e(e.d(a3.f.n((Collection)object.l()), 10));
        }
        n8 = Settings.Global.getInt((ContentResolver)(arrn = arrn.getContentResolver()), (String)"use_external_surround_sound_flag", (int)0) == 1 ? 1 : 0;
        if ((n8 != 0 || e.b()) && Settings.Global.getInt((ContentResolver)arrn, (String)"external_surround_sound_enabled", (int)0) == 1) {
            object.j((Iterable)d);
        }
        if (intent != null && n8 == 0 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            arrn = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (arrn != null) {
                object.j((Iterable)a3.f.c(arrn));
            }
            return new e(e.d(a3.f.n((Collection)object.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new e(e.d(a3.f.n((Collection)object.l()), 10));
    }

    public static e g(Context context, d0.b b8, j j8) {
        return e.f(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), b8, j8);
    }

    public static int h(int n8) {
        int n9;
        int n10;
        block6 : {
            block8 : {
                block7 : {
                    n9 = M.a;
                    n10 = n8;
                    if (n9 > 28) break block6;
                    if (n8 != 7) break block7;
                    n10 = 8;
                    break block6;
                }
                if (n8 == 3 || n8 == 4) break block8;
                n10 = n8;
                if (n8 != 5) break block6;
            }
            n10 = 6;
        }
        n8 = n10;
        if (n9 <= 26) {
            n8 = n10;
            if ("fugu".equals((Object)M.b)) {
                n8 = n10;
                if (n10 == 1) {
                    n8 = 2;
                }
            }
        }
        return M.M(n8);
    }

    public static Uri j() {
        if (e.b()) {
            return Settings.Global.getUriFor((String)"external_surround_sound_enabled");
        }
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (M.t(this.a, object.a) && this.b == object.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b + M.u(this.a) * 31;
    }

    public Pair i(q q8, d0.b b8) {
        int n8;
        int n9;
        block15 : {
            block16 : {
                block14 : {
                    n8 = z.f((String)g0.a.e(q8.n), q8.j);
                    if (!e.containsKey(n8)) {
                        return null;
                    }
                    if (n8 != 18 || this.l(18)) break block14;
                    n9 = 6;
                    break block15;
                }
                if (n8 == 8 && !this.l(8)) break block16;
                n9 = n8;
                if (n8 != 30) break block15;
                n9 = n8;
                if (this.l(30)) break block15;
            }
            n9 = 7;
        }
        if (!this.l(n9)) {
            return null;
        }
        e e8 = (e)g0.a.e((e)this.a.get(n9));
        int n10 = q8.B;
        if (n10 != -1 && n9 != 18) {
            if (q8.n.equals((Object)"audio/vnd.dts.uhd;profile=p2") && M.a < 33) {
                n8 = n10;
                if (n10 > 10) {
                    return null;
                }
            } else {
                n8 = n10;
                if (!e8.c(n10)) {
                    return null;
                }
            }
        } else {
            n8 = q8.C;
            if (n8 == -1) {
                n8 = 48000;
            }
            n8 = e8.b(n8, b8);
        }
        if ((n8 = e.h(n8)) == 0) {
            return null;
        }
        return Pair.create((Object)n9, (Object)n8);
    }

    public boolean k(q q8, d0.b b8) {
        if (this.i(q8, b8) != null) {
            return true;
        }
        return false;
    }

    public boolean l(int n8) {
        return M.r(this.a, n8);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioCapabilities[maxChannelCount=");
        stringBuilder.append(this.b);
        stringBuilder.append(", audioProfiles=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static final abstract class b {
        private static y a() {
            y.a a8 = new y.a().i((Object[])new Integer[]{8, 7});
            int n8 = M.a;
            if (n8 >= 31) {
                a8.i((Object[])new Integer[]{26, 27});
            }
            if (n8 >= 33) {
                a8.h(30);
            }
            return a8.l();
        }

        public static boolean b(AudioManager arraudioDeviceInfo, j object) {
            arraudioDeviceInfo = object == null ? ((AudioManager)g0.a.e(arraudioDeviceInfo)).getDevices(2) : new AudioDeviceInfo[]{object.a};
            object = b.a();
            int n8 = arraudioDeviceInfo.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                if (!object.contains(arraudioDeviceInfo[i8].getType())) continue;
                return true;
            }
            return false;
        }
    }

    public static final abstract class c {
        public static v a(d0.b b8) {
            v.a a8 = v.M();
            g0 g02 = e.e.i().q();
            while (g02.hasNext()) {
                Integer n8 = (Integer)g02.next();
                int n9 = n8;
                if (M.a < M.K(n9) || !f.a(new AudioFormat.Builder().setChannelMask(12).setEncoding(n9).setSampleRate(48000).build(), b8.a().a)) continue;
                a8.h((Object)n8);
            }
            a8.h(2);
            return a8.k();
        }

        public static int b(int n8, int n9, d0.b b8) {
            for (int i8 = 10; i8 > 0; --i8) {
                int n10 = M.M(i8);
                if (n10 == 0 || !f.a(new AudioFormat.Builder().setEncoding(n8).setSampleRate(n9).setChannelMask(n10).build(), b8.a().a)) continue;
                return i8;
            }
            return 0;
        }
    }

    public static final abstract class d {
        public static e a(AudioManager audioManager, d0.b b8) {
            return new e(e.c(h.a(audioManager, b8.a().a)), null);
        }

        public static j b(AudioManager audioManager, d0.b b8) {
            try {
                audioManager = g.a((AudioManager)g0.a.e((Object)audioManager), b8.a().a);
            }
            catch (RuntimeException runtimeException) {
                return null;
            }
            if (audioManager.isEmpty()) {
                return null;
            }
            return new j((AudioDeviceInfo)audioManager.get(0));
        }
    }

    public static final class e {
        public static final e d;
        public final int a;
        public final int b;
        public final y c;

        static {
            e e8 = M.a >= 33 ? new e(2, e.a(10)) : new e(2, 10);
            d = e8;
        }

        public e(int n8, int n9) {
            this.a = n8;
            this.b = n9;
            this.c = null;
        }

        public e(int n8, Set object) {
            this.a = n8;
            object = y.T((Collection)object);
            this.c = object;
            object = object.q();
            n8 = 0;
            while (object.hasNext()) {
                n8 = Math.max((int)n8, (int)Integer.bitCount((int)((Integer)object.next())));
            }
            this.b = n8;
        }

        public static y a(int n8) {
            y.a a8 = new y.a();
            for (int i8 = 1; i8 <= n8; ++i8) {
                a8.h(M.M(i8));
            }
            return a8.l();
        }

        public int b(int n8, d0.b b8) {
            if (this.c != null) {
                return this.b;
            }
            if (M.a >= 29) {
                return c.b(this.a, n8, b8);
            }
            return (Integer)g0.a.e((Object)((Integer)e.e.getOrDefault(this.a, 0)));
        }

        public boolean c(int n8) {
            y y8 = this.c;
            boolean bl = false;
            if (y8 == null) {
                if (n8 <= this.b) {
                    bl = true;
                }
                return bl;
            }
            if ((n8 = M.M(n8)) == 0) {
                return false;
            }
            return this.c.contains(n8);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof e)) {
                return false;
            }
            object = (e)object;
            if (this.a == object.a && this.b == object.b && M.c((Object)this.c, (Object)object.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int n8 = this.a;
            int n9 = this.b;
            y y8 = this.c;
            int n10 = y8 == null ? 0 : y8.hashCode();
            return (n8 * 31 + n9) * 31 + n10;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("AudioProfile[format=");
            stringBuilder.append(this.a);
            stringBuilder.append(", maxChannelCount=");
            stringBuilder.append(this.b);
            stringBuilder.append(", channelMasks=");
            stringBuilder.append((Object)this.c);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

}

