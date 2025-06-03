// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m5;

import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.dash.DashMediaSource;
import x0.f;
import android.net.Uri;
import x0.U;
import java.util.Collection;
import E5.j;
import i0.m;
import g0.M;
import i0.g;
import d0.C;
import d0.P;
import android.media.audiofx.AudioEffect;
import d0.l;
import android.media.audiofx.LoudnessEnhancer;
import d0.I;
import d0.u;
import d0.J;
import d0.L;
import android.media.audiofx.Equalizer;
import d0.B;
import d0.K;
import d0.E;
import x0.T;
import java.util.Iterator;
import k0.q;
import k0.r;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k0.w0;
import k0.x0;
import S0.c;
import android.content.Context;
import android.os.Handler;
import x0.x;
import k0.w;
import java.util.Map;
import java.util.Random;
import u0.b;
import d0.D;
import E5.k;

public class d implements k.c, D.d, u0.b
{
    public static Random H;
    public Map A;
    public w B;
    public Integer C;
    public x D;
    public Integer E;
    public final Handler F;
    public final Runnable G;
    public final Context a;
    public final k b;
    public final m5.e c;
    public final m5.e d;
    public b e;
    public long f;
    public long g;
    public long h;
    public Long i;
    public long j;
    public Integer k;
    public k.d l;
    public k.d m;
    public k.d n;
    public Map o;
    public c p;
    public S0.b q;
    public int r;
    public d0.b s;
    public x0 t;
    public boolean u;
    public w0 v;
    public List w;
    public List x;
    public Map y;
    public int z;
    
    static {
        d.H = new Random();
    }
    
    public d(final Context a, final E5.c c, final String str, final Map map, final List w, final Boolean b) {
        this.o = new HashMap();
        this.x = new ArrayList();
        this.y = new HashMap();
        this.z = 0;
        this.F = new Handler(Looper.getMainLooper());
        this.G = new Runnable() {
            @Override
            public void run() {
                if (m5.d.Z(m5.d.this) == null) {
                    return;
                }
                if (m5.d.Z(m5.d.this).t() != m5.d.a0(m5.d.this)) {
                    m5.d.this.g0();
                }
                final int f = m5.d.Z(m5.d.this).f();
                Handler handler;
                long n;
                if (f != 2) {
                    if (f != 3) {
                        return;
                    }
                    if (m5.d.Z(m5.d.this).u()) {
                        handler = m5.d.c0(m5.d.this);
                        n = 500L;
                    }
                    else {
                        handler = m5.d.c0(m5.d.this);
                        n = 1000L;
                    }
                }
                else {
                    handler = m5.d.c0(m5.d.this);
                    n = 200L;
                }
                handler.postDelayed((Runnable)this, n);
            }
        };
        this.a = a;
        this.w = w;
        this.u = (b != null && b);
        final StringBuilder sb = new StringBuilder();
        sb.append("com.ryanheise.just_audio.methods.");
        sb.append(str);
        (this.b = new k(c, sb.toString())).e((k.c)this);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("com.ryanheise.just_audio.events.");
        sb2.append(str);
        this.c = new m5.e(c, sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("com.ryanheise.just_audio.data.");
        sb3.append(str);
        this.d = new m5.e(c, sb3.toString());
        this.e = m5.d.b.o;
        if (map != null) {
            final Map<K, Object> map2 = map.get("androidLoadControl");
            if (map2 != null) {
                final r.b b2 = new r.b().c((int)(L0(map2.get("minBufferDuration")) / 1000L), (int)(L0(map2.get("maxBufferDuration")) / 1000L), (int)(L0(map2.get("bufferForPlaybackDuration")) / 1000L), (int)(L0(map2.get("bufferForPlaybackAfterRebufferDuration")) / 1000L)).d(map2.get("prioritizeTimeOverSizeThresholds")).b((int)(L0(map2.get("backBufferDuration")) / 1000L), false);
                if (map2.get("targetBufferBytes") != null) {
                    b2.e(map2.get("targetBufferBytes"));
                }
                this.t = b2.a();
            }
            final Map<K, Object> map3 = map.get("androidLivePlaybackSpeedControl");
            if (map3 != null) {
                this.v = new q.b().c((float)(double)map3.get("fallbackMinPlaybackSpeed")).b((float)(double)map3.get("fallbackMaxPlaybackSpeed")).f(L0(map3.get("minUpdateInterval")) / 1000L).g((float)(double)map3.get("proportionalControlFactor")).d(L0(map3.get("maxLiveOffsetErrorForUnitSpeed")) / 1000L).h(L0(map3.get("targetLiveOffsetIncrementOnRebuffer")) / 1000L).e((float)(double)map3.get("minPossibleLiveOffsetSmoothingFactor")).a();
            }
        }
    }
    
    public static Long L0(final Object o) {
        if (o != null && !(o instanceof Long)) {
            return (long)(int)o;
        }
        return (Long)o;
    }
    
    public static Object R0(final Object o, final String s) {
        if (o instanceof Map) {
            return ((Map)o).get(s);
        }
        return null;
    }
    
    public static Map S0(final Object... array) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (int i = 0; i < array.length; i += 2) {
            hashMap.put((String)array[i], array[i + 1]);
        }
        return hashMap;
    }
    
    public static /* synthetic */ w Z(final d d) {
        return d.B;
    }
    
    public static /* synthetic */ long a0(final d d) {
        return d.h;
    }
    
    public static /* synthetic */ Handler c0(final d d) {
        return d.F;
    }
    
    public static Map s0(final Map map) {
        if (map == null) {
            return null;
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        for (final String next : map.keySet()) {
            hashMap.put(next, (String)map.get(next));
        }
        return hashMap;
    }
    
    public final T A0(final List list) {
        final int size = list.size();
        final int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            array[i] = list.get(i);
        }
        return new T.a(array, m5.d.H.nextLong());
    }
    
    public void B0() {
        if (this.e == m5.d.b.p) {
            this.T();
        }
        final k.d m = this.m;
        if (m != null) {
            m.a(new HashMap());
            this.m = null;
        }
        this.o.clear();
        this.D = null;
        this.t0();
        final w b = this.B;
        if (b != null) {
            b.release();
            this.B = null;
            this.e = m5.d.b.o;
            this.g0();
        }
        this.c.c();
        this.d.c();
    }
    
    public final void C0() {
        new HashMap();
        this.A = this.x0();
    }
    
    public final void D0() {
        if (this.B == null) {
            final w.b b = new w.b(this.a);
            final x0 t = this.t;
            if (t != null) {
                b.m(t);
            }
            final w0 v = this.v;
            if (v != null) {
                b.l(v);
            }
            final w f = b.f();
            (this.B = f).F(f.O().a().F(new K.b.a().f(this.u ^ true).g(this.u ^ true).e(1).d()).C());
            this.Z0(this.B.j());
            this.B.v((D.d)this);
        }
    }
    
    public final Map E0() {
        final Equalizer equalizer = this.y.get("AndroidEqualizer");
        final ArrayList<Map> list = new ArrayList<Map>();
        for (short s = 0; s < equalizer.getNumberOfBands(); ++s) {
            list.add(S0("index", s, "lowerFrequency", equalizer.getBandFreqRange(s)[0] / 1000.0, "upperFrequency", equalizer.getBandFreqRange(s)[1] / 1000.0, "centerFrequency", equalizer.getCenterFreq(s) / 1000.0, "gain", equalizer.getBandLevel(s) / 1000.0));
        }
        return S0("parameters", S0("minDecibels", equalizer.getBandLevelRange()[0] / 1000.0, "maxDecibels", equalizer.getBandLevelRange()[1] / 1000.0, "bands", list));
    }
    
    public final void F0(final int n, final double n2) {
        this.y.get("AndroidEqualizer").setBandLevel((short)n, (short)Math.round(n2 * 1000.0));
    }
    
    public final x G0(final Object o) {
        final Map map = (Map)o;
        final String s = map.get("id");
        x z0;
        if ((z0 = this.o.get(s)) == null) {
            z0 = this.z0(map);
            this.o.put(s, z0);
        }
        return z0;
    }
    
    public final List H0(final Object obj) {
        if (obj instanceof List) {
            final List list = (List)obj;
            final ArrayList<x> list2 = new ArrayList<x>();
            for (int i = 0; i < list.size(); ++i) {
                list2.add(this.G0(list.get(i)));
            }
            return list2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("List expected: ");
        sb.append(obj);
        throw new RuntimeException(sb.toString());
    }
    
    public final x[] I0(final Object o) {
        final List h0 = this.H0(o);
        final x[] array = new x[h0.size()];
        h0.toArray(array);
        return array;
    }
    
    @Override
    public void J(final L l) {
        for (int i = 0; i < l.a().size(); ++i) {
            final J a = ((L.a)l.a().get(i)).a();
            for (int j = 0; j < a.a; ++j) {
                final d0.x k = a.a(j).k;
                if (k != null) {
                    for (int n = 0; n < k.e(); ++n) {
                        final d0.x.b d = k.d(n);
                        if (d instanceof S0.b) {
                            this.q = (S0.b)d;
                            this.g0();
                        }
                    }
                }
            }
        }
    }
    
    public final long J0() {
        final long j = this.j;
        if (j != -9223372036854775807L) {
            return j;
        }
        final b e = this.e;
        if (e == m5.d.b.o || e == m5.d.b.p) {
            long p;
            if ((p = this.B.P()) < 0L) {
                p = 0L;
            }
            return p;
        }
        final Long i = this.i;
        if (i != null && i != -9223372036854775807L) {
            return this.i;
        }
        return this.B.P();
    }
    
    public final long K0() {
        final b e = this.e;
        if (e != m5.d.b.o && e != m5.d.b.p) {
            final w b = this.B;
            if (b != null) {
                return b.K();
            }
        }
        return -9223372036854775807L;
    }
    
    @Override
    public void P(final I i, int n) {
        final long j = this.j;
        final int n2 = 0;
        if (j != -9223372036854775807L || this.k != null) {
            final Integer k = this.k;
            if (k != null) {
                n = k;
            }
            else {
                n = 0;
            }
            this.B.s(n, this.j);
            this.k = null;
            this.j = -9223372036854775807L;
        }
        if (this.i1()) {
            this.g0();
        }
    Label_0202_Outer:
        while (true) {
            if (this.B.f() == 4) {
                while (true) {
                    try {
                        w w;
                        if (this.B.u()) {
                            if (this.z == 0 && this.B.M() > 0) {
                                w = this.B;
                                n = n2;
                            }
                            else {
                                if (this.B.B()) {
                                    this.B.y();
                                }
                                break Label_0206;
                            }
                        }
                        else {
                            if (this.B.E() >= this.B.M()) {
                                break Label_0206;
                            }
                            w = this.B;
                            n = w.E();
                        }
                        w.s(n, 0L);
                        this.z = this.B.M();
                        return;
                        final Exception ex;
                        ex.printStackTrace();
                        continue Label_0202_Outer;
                    }
                    catch (Exception ex2) {}
                    final Exception ex2;
                    final Exception ex = ex2;
                    continue;
                }
            }
            continue;
        }
    }
    
    public final void P0(final x d, final long j, final Integer k, final k.d l) {
        this.j = j;
        this.k = k;
        int intValue;
        if (k != null) {
            intValue = k;
        }
        else {
            intValue = 0;
        }
        this.E = intValue;
        final int ordinal = this.e.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.T();
            }
            this.B.stop();
        }
        this.r = 0;
        this.l = l;
        this.j1();
        this.e = m5.d.b.p;
        this.C0();
        this.D = d;
        this.B.e(d);
        this.B.g();
    }
    
    public final void Q0(final double n) {
        this.y.get("AndroidLoudnessEnhancer").setTargetGain((int)Math.round(n * 1000.0));
    }
    
    public final void T() {
        this.W0("abort", "Connection aborted");
    }
    
    public void T0() {
        if (!this.B.u()) {
            return;
        }
        this.B.n(false);
        this.j1();
        final k.d m = this.m;
        if (m != null) {
            m.a(new HashMap());
            this.m = null;
        }
    }
    
    public void U0(k.d m) {
        if (this.B.u()) {
            m.a(new HashMap());
            return;
        }
        final k.d i = this.m;
        if (i != null) {
            i.a(new HashMap());
        }
        this.m = m;
        this.B.n(true);
        this.j1();
        if (this.e == m5.d.b.s) {
            m = this.m;
            if (m != null) {
                m.a(new HashMap());
                this.m = null;
            }
        }
    }
    
    public void V0(final long l, final Integer n, final k.d n2) {
        final b e = this.e;
        while (true) {
            Label_0092: {
                if (e == m5.d.b.o || e == m5.d.b.p) {
                    break Label_0092;
                }
                this.W();
                this.i = l;
                this.n = n2;
                Label_0056: {
                    if (n == null) {
                        break Label_0056;
                    }
                    try {
                        int n3 = n;
                        while (true) {
                            this.B.s(n3, l);
                            return;
                            n3 = this.B.E();
                            continue;
                        }
                        n2.a(new HashMap());
                        return;
                        this.n = null;
                        this.i = null;
                        throw;
                    }
                    catch (RuntimeException ex2) {}
                }
            }
            final RuntimeException ex2;
            final RuntimeException ex = ex2;
            continue;
        }
    }
    
    public final void W() {
        final k.d n = this.n;
        if (n == null) {
            return;
        }
        while (true) {
            try {
                n.a(new HashMap());
                this.n = null;
                this.i = null;
            }
            catch (RuntimeException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void W0(final String s, final String s2) {
        this.X0(s, s2, null);
    }
    
    @Override
    public void X(final int n) {
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    return;
                }
                final b e = this.e;
                final b s = m5.d.b.s;
                if (e != s) {
                    this.j1();
                    this.e = s;
                    this.g0();
                }
                if (this.l != null) {
                    this.l.a(new HashMap());
                    this.l = null;
                    final d0.b s2 = this.s;
                    if (s2 != null) {
                        this.B.A(s2, false);
                        this.s = null;
                    }
                }
                final k.d m = this.m;
                if (m != null) {
                    m.a(new HashMap());
                    this.m = null;
                }
            }
            else {
                if (this.B.u()) {
                    this.j1();
                }
                this.e = m5.d.b.r;
                this.g0();
                if (this.l != null) {
                    final HashMap<String, Long> hashMap = new HashMap<String, Long>();
                    Long value;
                    if (this.K0() == -9223372036854775807L) {
                        value = null;
                    }
                    else {
                        value = this.K0() * 1000L;
                    }
                    hashMap.put("duration", value);
                    this.l.a(hashMap);
                    this.l = null;
                    final d0.b s3 = this.s;
                    if (s3 != null) {
                        this.B.A(s3, false);
                        this.s = null;
                    }
                }
                if (this.n != null) {
                    this.v0();
                }
            }
        }
        else {
            this.k1();
            final b e2 = this.e;
            final b q = m5.d.b.q;
            if (e2 != q && e2 != m5.d.b.p) {
                this.e = q;
                this.g0();
            }
            this.h1();
        }
    }
    
    public final void X0(final String s, final String s2, final Object o) {
        final k.d l = this.l;
        if (l != null) {
            l.b(s, s2, o);
            this.l = null;
        }
        this.c.b(s, s2, o);
    }
    
    public final void Y0(final int n, final int n2, final int n3) {
        final d0.b.e e = new d0.b.e();
        e.b(n);
        e.c(n2);
        e.d(n3);
        final d0.b a = e.a();
        if (this.e == m5.d.b.p) {
            this.s = a;
            return;
        }
        this.B.A(a, false);
    }
    
    public final void Z0(final int i) {
        Integer value;
        if (i == 0) {
            value = null;
        }
        else {
            value = i;
        }
        this.C = value;
        this.t0();
        if (this.C != null) {
            for (final Map<K, Boolean> next : this.w) {
                final Map<K, Boolean> map = next;
                final AudioEffect y0 = this.y0(next, this.C);
                if (map.get("enabled")) {
                    y0.setEnabled(true);
                }
                this.x.add(y0);
                this.y.put(map.get("type"), y0);
            }
        }
        this.C0();
    }
    
    public void a1(final int n) {
        this.B.i(n);
    }
    
    public void b1(final float n) {
        final C h = this.B.h();
        if (h.b == n) {
            return;
        }
        this.B.k(new C(h.a, n));
        this.C0();
    }
    
    public void c1(final boolean b) {
        this.B.x(b);
    }
    
    public final void d0(final String s, final boolean enabled) {
        this.y.get(s).setEnabled(enabled);
    }
    
    public final void d1(final Object o) {
        final Map map = (Map)o;
        final x x = this.o.get(R0(map, "id"));
        if (x == null) {
            return;
        }
        final String s = (String)R0(map, "type");
        s.hashCode();
        if (s.equals("concatenating")) {
            ((x0.l)x).r0(this.A0((List)R0(map, "shuffleOrder")));
            final Iterator iterator = ((List)R0(map, "children")).iterator();
            while (iterator.hasNext()) {
                this.d1(iterator.next());
            }
            return;
        }
        if (!s.equals("looping")) {
            return;
        }
        this.d1(R0(map, "child"));
    }
    
    @Override
    public void e0(final B b) {
        String s;
        String s2;
        Map map;
        if (b instanceof k0.u) {
            final k0.u u = (k0.u)b;
            final int x = u.x;
            StringBuilder sb;
            Exception ex;
            if (x != 0) {
                if (x != 1) {
                    String str;
                    if (x != 2) {
                        sb = new StringBuilder();
                        str = "default ExoPlaybackException: ";
                    }
                    else {
                        sb = new StringBuilder();
                        str = "TYPE_UNEXPECTED: ";
                    }
                    sb.append(str);
                    ex = u.h();
                }
                else {
                    sb = new StringBuilder();
                    sb.append("TYPE_RENDERER: ");
                    ex = u.f();
                }
            }
            else {
                sb = new StringBuilder();
                sb.append("TYPE_SOURCE: ");
                ex = u.g();
            }
            sb.append(ex.getMessage());
            t5.b.b("AudioPlayer", sb.toString());
            s = String.valueOf(u.x);
            s2 = u.getMessage();
            map = S0("index", this.E);
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("default PlaybackException: ");
            sb2.append(b.getMessage());
            t5.b.b("AudioPlayer", sb2.toString());
            s = String.valueOf(b.o);
            s2 = b.getMessage();
            map = S0("index", this.E);
        }
        this.X0(s, s2, map);
        ++this.r;
        if (this.B.B()) {
            final Integer e = this.E;
            if (e != null && this.r <= 5) {
                final int n = e + 1;
                if (n < this.B.L().p()) {
                    this.B.e(this.D);
                    this.B.g();
                    this.B.s(n, 0L);
                }
            }
        }
    }
    
    public void e1(final boolean b) {
        this.B.d(b);
    }
    
    public void f1(final float n) {
        final C h = this.B.h();
        if (h.a == n) {
            return;
        }
        this.B.k(new C(n, h.b));
        if (this.B.u()) {
            this.j1();
        }
        this.C0();
    }
    
    public final void g0() {
        this.C0();
        this.l0();
    }
    
    public void g1(final float n) {
        this.B.l(n);
    }
    
    public final void h1() {
        this.F.removeCallbacks(this.G);
        this.F.post(this.G);
    }
    
    public final boolean i1() {
        final Integer value = this.B.E();
        if (!value.equals(this.E)) {
            this.E = value;
            return true;
        }
        return false;
    }
    
    public final void j1() {
        this.f = this.J0();
        this.g = System.currentTimeMillis();
    }
    
    @Override
    public void k0(final e e, final e e2, final int n) {
        this.j1();
        if (n == 0 || n == 1) {
            this.i1();
        }
        this.g0();
    }
    
    public final boolean k1() {
        if (this.J0() == this.f) {
            return false;
        }
        this.f = this.J0();
        this.g = System.currentTimeMillis();
        return true;
    }
    
    public final void l0() {
        final Map a = this.A;
        if (a != null) {
            this.c.a(a);
            this.A = null;
        }
    }
    
    public final g.a m0(final Map map) {
        final Map s0 = s0(map);
        String s2;
        if (s0 != null) {
            if ((s2 = s0.remove("User-Agent")) == null) {
                s2 = s0.remove("user-agent");
            }
        }
        else {
            s2 = null;
        }
        String q0;
        if ((q0 = s2) == null) {
            q0 = M.q0(this.a, "just_audio");
        }
        final m.b c = new m.b().e(q0).c(true);
        if (s0 != null && s0.size() > 0) {
            c.d(s0);
        }
        return new i0.l.a(this.a, c);
    }
    
    @Override
    public void onMethodCall(final j j, final k.d d) {
    Label_1253_Outer:
        while (true) {
            this.D0();
            while (true) {
                Label_1628: {
                    while (true) {
                        try {
                            while (true) {
                                while (true) {
                                    try {
                                        final String a = j.a;
                                        int n = 0;
                                        Label_0574: {
                                            switch (a.hashCode()) {
                                                case 2117606630: {
                                                    if (a.equals("audioEffectSetEnabled")) {
                                                        n = 18;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 1631191096: {
                                                    if (a.equals("setAutomaticallyWaitsToMinimizeStalling")) {
                                                        n = 10;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 1624925565: {
                                                    if (a.equals("androidEqualizerGetParameters")) {
                                                        n = 20;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 1454606831: {
                                                    if (a.equals("setPreferredPeakBitRate")) {
                                                        n = 12;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 1404354821: {
                                                    if (a.equals("setSpeed")) {
                                                        n = 4;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 1401390078: {
                                                    if (a.equals("setPitch")) {
                                                        n = 5;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 986980643: {
                                                    if (a.equals("concatenatingMove")) {
                                                        n = 16;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 845471111: {
                                                    if (a.equals("concatenatingRemoveRange")) {
                                                        n = 15;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 670514716: {
                                                    if (a.equals("setVolume")) {
                                                        n = 3;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 106440182: {
                                                    if (a.equals("pause")) {
                                                        n = 2;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 3526264: {
                                                    if (a.equals("seek")) {
                                                        n = 13;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 3443508: {
                                                    if (a.equals("play")) {
                                                        n = 1;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case 3327206: {
                                                    if (a.equals("load")) {
                                                        n = 0;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -48357143: {
                                                    if (a.equals("setLoopMode")) {
                                                        n = 7;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -104999328: {
                                                    if (a.equals("setAndroidAudioAttributes")) {
                                                        n = 17;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -345307082: {
                                                    if (a.equals("androidLoudnessEnhancerSetTargetGain")) {
                                                        n = 19;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -704119678: {
                                                    if (a.equals("setCanUseNetworkResourcesForLiveStreamingWhilePaused")) {
                                                        n = 11;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -1484304041: {
                                                    if (a.equals("setShuffleOrder")) {
                                                        n = 9;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -1540835818: {
                                                    if (a.equals("concatenatingInsertAll")) {
                                                        n = 14;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -1875704736: {
                                                    if (a.equals("setSkipSilence")) {
                                                        n = 6;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -1987605894: {
                                                    if (a.equals("setShuffleMode")) {
                                                        n = 8;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                                case -2058172951: {
                                                    if (a.equals("androidEqualizerBandSetGain")) {
                                                        n = 21;
                                                        break Label_0574;
                                                    }
                                                    break;
                                                }
                                            }
                                            n = -1;
                                        }
                                        long n2 = -9223372036854775807L;
                                        while (true) {
                                            x0.l l = null;
                                            T t = null;
                                            Label_0949: {
                                                Map e0 = null;
                                                switch (n) {
                                                    default: {
                                                        d.c();
                                                        break Label_1501;
                                                    }
                                                    case 21: {
                                                        this.F0((int)j.a("bandIndex"), (double)j.a("gain"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 20: {
                                                        e0 = this.E0();
                                                        break;
                                                    }
                                                    case 19: {
                                                        this.Q0((double)j.a("targetGain"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 18: {
                                                        this.d0((String)j.a("type"), (boolean)j.a("enabled"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 17: {
                                                        this.Y0((int)j.a("contentType"), (int)j.a("flags"), (int)j.a("usage"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 16: {
                                                        this.w0(j.a("id")).h0((int)j.a("currentIndex"), (int)j.a("newIndex"), this.F, new c(d));
                                                        l = this.w0(j.a("id"));
                                                        t = this.A0((List)j.a("shuffleOrder"));
                                                        break Label_0949;
                                                    }
                                                    case 15: {
                                                        this.w0(j.a("id")).m0((int)j.a("startIndex"), (int)j.a("endIndex"), this.F, new m5.b(d));
                                                        l = this.w0(j.a("id"));
                                                        t = this.A0((List)j.a("shuffleOrder"));
                                                        break Label_0949;
                                                    }
                                                    case 14: {
                                                        this.w0(j.a("id")).P((int)j.a("index"), this.H0(j.a("children")), this.F, new a(d));
                                                        l = this.w0(j.a("id"));
                                                        t = this.A0((List)j.a("shuffleOrder"));
                                                        break Label_0949;
                                                    }
                                                    case 13: {
                                                        final Long l2 = L0(j.a("position"));
                                                        final Integer n3 = (Integer)j.a("index");
                                                        if (l2 != null) {
                                                            n2 = l2 / 1000L;
                                                        }
                                                        this.V0(n2, n3, d);
                                                        break Label_1501;
                                                    }
                                                    case 12: {
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 11: {
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 10: {
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 9: {
                                                        this.d1(j.a("audioSource"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 8: {
                                                        if ((int)j.a("shuffleMode") == 1) {
                                                            final boolean b = true;
                                                            this.c1(b);
                                                            e0 = new HashMap();
                                                            break;
                                                        }
                                                        break Label_1628;
                                                    }
                                                    case 7: {
                                                        this.a1((int)j.a("loopMode"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 6: {
                                                        this.e1((boolean)j.a("enabled"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 5: {
                                                        this.b1((float)(double)j.a("pitch"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 4: {
                                                        this.f1((float)(double)j.a("speed"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 3: {
                                                        this.g1((float)(double)j.a("volume"));
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 2: {
                                                        this.T0();
                                                        e0 = new HashMap();
                                                        break;
                                                    }
                                                    case 1: {
                                                        this.U0(d);
                                                        break Label_1501;
                                                    }
                                                    case 0: {
                                                        final Long l3 = L0(j.a("initialPosition"));
                                                        final Integer n4 = (Integer)j.a("initialIndex");
                                                        final x g0 = this.G0(j.a("audioSource"));
                                                        if (l3 != null) {
                                                            n2 = l3 / 1000L;
                                                        }
                                                        this.P0(g0, n2, n4, d);
                                                        break Label_1501;
                                                    }
                                                }
                                                d.a(e0);
                                                break Label_1501;
                                            }
                                            l.r0(t);
                                            this.l0();
                                            return;
                                            final IllegalStateException ex;
                                            ex.printStackTrace();
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("Illegal state: ");
                                            sb.append(ex.getMessage());
                                            d.b(sb.toString(), ex.toString(), null);
                                            continue Label_1253_Outer;
                                        }
                                        this.l0();
                                    }
                                    finally {}
                                    continue;
                                }
                            }
                        }
                        catch (Exception ex3) {}
                        catch (IllegalStateException ex2) {}
                        final IllegalStateException ex2;
                        final IllegalStateException ex = ex2;
                        continue;
                    }
                }
                final boolean b = false;
                continue;
            }
        }
    }
    
    public final F0.m p0(Map map) {
        final F0.m m = new F0.m();
        boolean booleanValue = false;
        boolean booleanValue2 = false;
        int intValue = 0;
        Label_0089: {
            if (map != null) {
                map = map.get("androidExtractorOptions");
                if (map != null) {
                    booleanValue = (boolean)map.get("constantBitrateSeekingEnabled");
                    booleanValue2 = (boolean)map.get("constantBitrateSeekingAlwaysEnabled");
                    intValue = (int)map.get("mp3Flags");
                    break Label_0089;
                }
            }
            booleanValue = true;
            booleanValue2 = false;
            intValue = 0;
        }
        m.i(booleanValue);
        m.h(booleanValue2);
        m.j(intValue);
        return m;
    }
    
    public final void t0() {
        final Iterator<AudioEffect> iterator = (Iterator<AudioEffect>)this.x.iterator();
        while (iterator.hasNext()) {
            iterator.next().release();
            iterator.remove();
        }
        this.y.clear();
    }
    
    public final Map u0() {
        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        if (this.p != null) {
            final HashMap<String, String> hashMap2 = new HashMap<String, String>();
            hashMap2.put("title", this.p.p);
            hashMap2.put("url", this.p.q);
            hashMap.put("info", hashMap2);
        }
        if (this.q != null) {
            final HashMap<String, String> hashMap3 = new HashMap<String, String>();
            hashMap3.put("bitrate", (String)this.q.o);
            hashMap3.put("genre", this.q.p);
            hashMap3.put("name", this.q.q);
            hashMap3.put("metadataInterval", (String)this.q.t);
            hashMap3.put("url", this.q.r);
            hashMap3.put("isPublic", (String)this.q.s);
            hashMap.put("headers", hashMap3);
        }
        return hashMap;
    }
    
    public final void v0() {
        this.i = null;
        this.n.a(new HashMap());
        this.n = null;
    }
    
    public final x0.l w0(final Object o) {
        return this.o.get(o);
    }
    
    @Override
    public void x(final d0.x x) {
        for (int i = 0; i < x.e(); ++i) {
            final d0.x.b d = x.d(i);
            if (d instanceof c) {
                this.p = (c)d;
                this.g0();
            }
        }
    }
    
    public final Map x0() {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        Number value;
        if (this.K0() == -9223372036854775807L) {
            value = null;
        }
        else {
            value = this.K0() * 1000L;
        }
        final w b = this.B;
        long t;
        if (b != null) {
            t = b.t();
        }
        else {
            t = 0L;
        }
        this.h = t;
        hashMap.put("processingState", this.e.ordinal());
        hashMap.put("updatePosition", (Integer)(Object)Long.valueOf(this.f * 1000L));
        hashMap.put("updateTime", (Integer)(Object)Long.valueOf(this.g));
        hashMap.put("bufferedPosition", (Integer)(Object)Long.valueOf(Math.max(this.f, this.h) * 1000L));
        hashMap.put("icyMetadata", (Integer)this.u0());
        hashMap.put("duration", (Integer)value);
        hashMap.put("currentIndex", this.E);
        hashMap.put("androidAudioSessionId", this.C);
        return hashMap;
    }
    
    public final AudioEffect y0(final Object o, final int n) {
        final Map map = (Map)o;
        final String s = map.get("type");
        s.hashCode();
        if (s.equals("AndroidEqualizer")) {
            return (AudioEffect)new Equalizer(0, n);
        }
        if (s.equals("AndroidLoudnessEnhancer")) {
            final int targetGain = (int)Math.round((double)map.get("targetGain") * 1000.0);
            final LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(n);
            loudnessEnhancer.setTargetGain(targetGain);
            return (AudioEffect)loudnessEnhancer;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown AudioEffect type: ");
        sb.append((Object)map.get("type"));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final x z0(final Object o) {
        final Map map = (Map)o;
        final String s = map.get("id");
        final String s2 = map.get("type");
        s2.hashCode();
        final int hashCode = s2.hashCode();
        final int n = 0;
        int n2 = -1;
        switch (hashCode) {
            case 2092627105: {
                if (!s2.equals("silence")) {
                    break;
                }
                n2 = 6;
                break;
            }
            case 1131547531: {
                if (!s2.equals("progressive")) {
                    break;
                }
                n2 = 5;
                break;
            }
            case 918617282: {
                if (!s2.equals("clipping")) {
                    break;
                }
                n2 = 4;
                break;
            }
            case 349937342: {
                if (!s2.equals("looping")) {
                    break;
                }
                n2 = 3;
                break;
            }
            case 3075986: {
                if (!s2.equals("dash")) {
                    break;
                }
                n2 = 2;
                break;
            }
            case 103407: {
                if (!s2.equals("hls")) {
                    break;
                }
                n2 = 1;
                break;
            }
            case -445916622: {
                if (!s2.equals("concatenating")) {
                    break;
                }
                n2 = 0;
                break;
            }
        }
        switch (n2) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown AudioSource type: ");
                sb.append((Object)map.get("type"));
                throw new IllegalArgumentException(sb.toString());
            }
            case 6: {
                return new U.b().b(L0(map.get("duration"))).c(s).a();
            }
            case 5: {
                return new x0.L.b(this.m0((Map)R0(map, "headers")), this.p0((Map)R0(map, "options"))).b(new u.c().e(Uri.parse((String)map.get("uri"))).d(s).a());
            }
            case 4: {
                final Long l0 = L0(map.get("start"));
                final Long l2 = L0(map.get("end"));
                final x g0 = this.G0(map.get("child"));
                long longValue;
                if (l0 != null) {
                    longValue = l0;
                }
                else {
                    longValue = 0L;
                }
                long longValue2;
                if (l2 != null) {
                    longValue2 = l2;
                }
                else {
                    longValue2 = Long.MIN_VALUE;
                }
                return new f(g0, longValue, longValue2);
            }
            case 3: {
                final Integer n3 = (Integer)map.get("count");
                final x g2 = this.G0(map.get("child"));
                final int intValue = n3;
                final x[] array = new x[intValue];
                for (int i = n; i < intValue; ++i) {
                    array[i] = g2;
                }
                return new x0.l(array);
            }
            case 2: {
                return new DashMediaSource.Factory(this.m0((Map)R0(map, "headers"))).a(new u.c().e(Uri.parse((String)map.get("uri"))).c("application/dash+xml").d(s).a());
            }
            case 1: {
                return new HlsMediaSource.Factory(this.m0((Map)R0(map, "headers"))).a(new u.c().e(Uri.parse((String)map.get("uri"))).c("application/x-mpegURL").a());
            }
            case 0: {
                return new x0.l(false, (boolean)map.get("useLazyPreparation"), this.A0((List)R0(map, "shuffleOrder")), this.I0(map.get("children")));
            }
        }
    }
    
    public enum b
    {
        o("none", 0), 
        p("loading", 1), 
        q("buffering", 2), 
        r("ready", 3), 
        s("completed", 4);
        
        static {
            t = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p, b.q, b.r, b.s };
        }
    }
}
