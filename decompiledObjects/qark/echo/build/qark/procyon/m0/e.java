// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import X2.g0;
import android.media.AudioFormat$Builder;
import d0.z;
import android.util.Pair;
import d0.q;
import android.net.Uri;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.ContentResolver;
import android.provider.Settings$Global;
import X2.y;
import android.media.AudioManager;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.content.Context;
import java.util.Iterator;
import android.media.AudioProfile;
import java.util.Map;
import java.util.Collection;
import java.util.HashSet;
import a3.f;
import java.util.Set;
import java.util.HashMap;
import g0.M;
import java.util.List;
import android.util.SparseArray;
import X2.w;
import X2.v;

public final class e
{
    public static final e c;
    public static final v d;
    public static final w e;
    public final SparseArray a;
    public final int b;
    
    static {
        c = new e(v.Z(m0.e.e.d));
        final Integer value = 5;
        final Integer value2 = 6;
        d = v.b0(2, value, value2);
        final w.a f = new w.a().f(value, value2).f(17, value2).f(7, value2).f(30, 10).f(18, value2);
        final Integer value3 = 8;
        e = f.f(value2, value3).f(value3, value3).f(14, value3).c();
    }
    
    public e(final List list) {
        this.a = new SparseArray();
        final int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            final e e = list.get(i);
            this.a.put(e.a, (Object)e);
        }
        int max = 0;
        for (int j = n; j < this.a.size(); ++j) {
            max = Math.max(max, ((e)this.a.valueAt(j)).b);
        }
        this.b = max;
    }
    
    public static boolean b() {
        final String c = M.c;
        return "Amazon".equals(c) || "Xiaomi".equals(c);
    }
    
    public static v c(final List list) {
        final HashMap<Object, Set<?>> hashMap = new HashMap<Object, Set<?>>();
        hashMap.put(2, new HashSet<Object>(f.c(12)));
        for (int i = 0; i < list.size(); ++i) {
            final AudioProfile a = m0.a.a(list.get(i));
            if (m0.b.a(a) != 1) {
                final int a2 = m0.c.a(a);
                if (M.A0(a2) || m0.e.e.containsKey(a2)) {
                    final boolean containsKey = hashMap.containsKey(a2);
                    final Integer value = a2;
                    if (containsKey) {
                        ((Set)g0.a.e(hashMap.get(value))).addAll(f.c(m0.d.a(a)));
                    }
                    else {
                        hashMap.put(value, new HashSet<Object>(f.c(m0.d.a(a))));
                    }
                }
            }
        }
        final v.a m = v.M();
        for (final Map.Entry<Integer, HashSet<Object>> entry : hashMap.entrySet()) {
            m.h(new e(entry.getKey(), entry.getValue()));
        }
        return m.k();
    }
    
    public static v d(final int[] array, final int n) {
        final v.a m = v.M();
        int i;
        final int n2 = i = 0;
        int[] array2 = array;
        if (array == null) {
            array2 = new int[0];
            i = n2;
        }
        while (i < array2.length) {
            m.h(new e(array2[i], n));
            ++i;
        }
        return m.k();
    }
    
    public static e e(final Context context, final d0.b b, final AudioDeviceInfo audioDeviceInfo) {
        j j;
        if (M.a >= 23 && audioDeviceInfo != null) {
            j = new j(audioDeviceInfo);
        }
        else {
            j = null;
        }
        return g(context, b, j);
    }
    
    public static e f(final Context context, final Intent intent, final d0.b b, j b2) {
        final AudioManager audioManager = (AudioManager)g0.a.e(context.getSystemService("audio"));
        if (b2 == null) {
            if (M.a >= 33) {
                b2 = m0.e.d.b(audioManager, b);
            }
            else {
                b2 = null;
            }
        }
        final int a = M.a;
        if (a >= 33 && (M.E0(context) || M.x0(context))) {
            return m0.e.d.a(audioManager, b);
        }
        if (a >= 23 && m0.e.b.b(audioManager, b2)) {
            return m0.e.c;
        }
        final y.a a2 = new y.a();
        a2.h(2);
        if (a >= 29 && (M.E0(context) || M.x0(context))) {
            a2.j(m0.e.c.a(b));
            return new e(d(f.n(a2.l()), 10));
        }
        final ContentResolver contentResolver = context.getContentResolver();
        final boolean b3 = Settings$Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((b3 || b()) && Settings$Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            a2.j(m0.e.d);
        }
        if (intent != null && !b3 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            final int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                a2.j(f.c(intArrayExtra));
            }
            return new e(d(f.n(a2.l()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new e(d(f.n(a2.l()), 10));
    }
    
    public static e g(final Context context, final d0.b b, final j j) {
        return f(context, context.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), b, j);
    }
    
    public static int h(int n) {
        final int a = M.a;
        int n2 = n;
        if (a <= 28) {
            if (n == 7) {
                n2 = 8;
            }
            else if (n == 3 || n == 4 || (n2 = n) == 5) {
                n2 = 6;
            }
        }
        n = n2;
        if (a <= 26) {
            n = n2;
            if ("fugu".equals(M.b) && (n = n2) == 1) {
                n = 2;
            }
        }
        return M.M(n);
    }
    
    public static Uri j() {
        if (b()) {
            return Settings$Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return M.t(this.a, e.a) && this.b == e.b;
    }
    
    @Override
    public int hashCode() {
        return this.b + M.u(this.a) * 31;
    }
    
    public Pair i(final q q, final d0.b b) {
        final int f = z.f((String)g0.a.e(q.n), q.j);
        if (!m0.e.e.containsKey(f)) {
            return null;
        }
        int i = 0;
        Label_0098: {
            if (f == 18 && !this.l(18)) {
                i = 6;
            }
            else {
                if (f != 8 || this.l(8)) {
                    if ((i = f) != 30) {
                        break Label_0098;
                    }
                    i = f;
                    if (this.l(30)) {
                        break Label_0098;
                    }
                }
                i = 7;
            }
        }
        if (!this.l(i)) {
            return null;
        }
        final e e = (e)g0.a.e(this.a.get(i));
        final int b2 = q.B;
        int b3;
        if (b2 != -1 && i != 18) {
            if (q.n.equals("audio/vnd.dts.uhd;profile=p2") && M.a < 33) {
                if ((b3 = b2) > 10) {
                    return null;
                }
            }
            else {
                b3 = b2;
                if (!e.c(b2)) {
                    return null;
                }
            }
        }
        else {
            int c = q.C;
            if (c == -1) {
                c = 48000;
            }
            b3 = e.b(c, b);
        }
        final int h = h(b3);
        if (h == 0) {
            return null;
        }
        return Pair.create((Object)i, (Object)h);
    }
    
    public boolean k(final q q, final d0.b b) {
        return this.i(q, b) != null;
    }
    
    public boolean l(final int n) {
        return M.r(this.a, n);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.a);
        sb.append("]");
        return sb.toString();
    }
    
    public abstract static final class b
    {
        private static y a() {
            final y.a i = new y.a().i(8, 7);
            final int a = M.a;
            if (a >= 31) {
                i.i(26, 27);
            }
            if (a >= 33) {
                i.h(30);
            }
            return i.l();
        }
        
        public static boolean b(final AudioManager audioManager, final j j) {
            AudioDeviceInfo[] devices;
            if (j == null) {
                devices = ((AudioManager)g0.a.e(audioManager)).getDevices(2);
            }
            else {
                devices = new AudioDeviceInfo[] { j.a };
            }
            final y a = a();
            for (int length = devices.length, i = 0; i < length; ++i) {
                if (a.contains(devices[i].getType())) {
                    return true;
                }
            }
            return false;
        }
    }
    
    public abstract static final class c
    {
        public static v a(final d0.b b) {
            final v.a m = v.M();
            final g0 q = m0.e.e.i().q();
            while (q.hasNext()) {
                final Integer n = q.next();
                final int intValue = n;
                if (M.a < M.K(intValue)) {
                    continue;
                }
                if (!m0.f.a(new AudioFormat$Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), b.a().a)) {
                    continue;
                }
                m.h(n);
            }
            m.h(2);
            return m.k();
        }
        
        public static int b(final int encoding, final int sampleRate, final d0.b b) {
            for (int i = 10; i > 0; --i) {
                final int m = M.M(i);
                if (m != 0) {
                    if (m0.f.a(new AudioFormat$Builder().setEncoding(encoding).setSampleRate(sampleRate).setChannelMask(m).build(), b.a().a)) {
                        return i;
                    }
                }
            }
            return 0;
        }
    }
    
    public abstract static final class d
    {
        public static e a(final AudioManager audioManager, final d0.b b) {
            return new e(c(h.a(audioManager, b.a().a)), null);
        }
        
        public static j b(final AudioManager audioManager, final d0.b b) {
            try {
                final List a = g.a((AudioManager)g0.a.e(audioManager), b.a().a);
                if (a.isEmpty()) {
                    return null;
                }
                return new j(a.get(0));
            }
            catch (RuntimeException ex) {
                return null;
            }
        }
    }
    
    public static final class e
    {
        public static final e d;
        public final int a;
        public final int b;
        public final y c;
        
        static {
            e d2;
            if (M.a >= 33) {
                d2 = new e(2, a(10));
            }
            else {
                d2 = new e(2, 10);
            }
            d = d2;
        }
        
        public e(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = null;
        }
        
        public e(int max, final Set set) {
            this.a = max;
            final y t = y.T(set);
            this.c = t;
            final g0 q = t.q();
            max = 0;
            while (q.hasNext()) {
                max = Math.max(max, Integer.bitCount(q.next()));
            }
            this.b = max;
        }
        
        public static y a(final int n) {
            final y.a a = new y.a();
            for (int i = 1; i <= n; ++i) {
                a.h(M.M(i));
            }
            return a.l();
        }
        
        public int b(final int n, final d0.b b) {
            if (this.c != null) {
                return this.b;
            }
            if (M.a >= 29) {
                return m0.e.c.b(this.a, n, b);
            }
            return (int)g0.a.e(m0.e.e.getOrDefault(this.a, 0));
        }
        
        public boolean c(int m) {
            final y c = this.c;
            boolean b = false;
            if (c == null) {
                if (m <= this.b) {
                    b = true;
                }
                return b;
            }
            m = M.M(m);
            return m != 0 && this.c.contains(m);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return this.a == e.a && this.b == e.b && M.c(this.c, e.c);
        }
        
        @Override
        public int hashCode() {
            final int a = this.a;
            final int b = this.b;
            final y c = this.c;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            return (a * 31 + b) * 31 + hashCode;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AudioProfile[format=");
            sb.append(this.a);
            sb.append(", maxChannelCount=");
            sb.append(this.b);
            sb.append(", channelMasks=");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }
}
