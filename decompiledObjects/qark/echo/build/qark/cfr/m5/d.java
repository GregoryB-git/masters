/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.audiofx.AudioEffect
 *  android.media.audiofx.Equalizer
 *  android.media.audiofx.LoudnessEnhancer
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Random
 *  java.util.Set
 */
package m5;

import E5.j;
import E5.k;
import F0.m;
import S0.c;
import X2.v;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.dash.DashMediaSource;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import d0.B;
import d0.C;
import d0.D;
import d0.E;
import d0.I;
import d0.J;
import d0.K;
import d0.L;
import d0.P;
import d0.b;
import d0.l;
import d0.u;
import d0.x;
import g0.M;
import i0.g;
import i0.l;
import i0.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import k0.q;
import k0.r;
import k0.u;
import k0.w;
import k0.w0;
import k0.x0;
import m5.e;
import x0.L;
import x0.T;
import x0.U;
import x0.f;

public class d
implements k.c,
D.d,
u0.b {
    public static Random H = new Random();
    public Map A;
    public w B;
    public Integer C;
    public x0.x D;
    public Integer E;
    public final Handler F = new Handler(Looper.getMainLooper());
    public final Runnable G;
    public final Context a;
    public final k b;
    public final e c;
    public final e d;
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
    public Map o = new HashMap();
    public c p;
    public S0.b q;
    public int r;
    public d0.b s;
    public x0 t;
    public boolean u;
    public w0 v;
    public List w;
    public List x = new ArrayList();
    public Map y = new HashMap();
    public int z = 0;

    public d(Context object, E5.c object2, String string2, Map map, List list, Boolean bl) {
        this.G = new Runnable(){

            /*
             * Enabled aggressive block sorting
             */
            public void run() {
                int n8;
                Handler handler;
                long l8;
                if (d.this.B == null) {
                    return;
                }
                if (d.this.B.t() != d.this.h) {
                    d.this.g0();
                }
                if ((n8 = d.this.B.f()) != 2) {
                    if (n8 != 3) {
                        return;
                    }
                    if (d.this.B.u()) {
                        handler = d.this.F;
                        l8 = 500L;
                    } else {
                        handler = d.this.F;
                        l8 = 1000L;
                    }
                } else {
                    handler = d.this.F;
                    l8 = 200L;
                }
                handler.postDelayed((Runnable)this, l8);
            }
        };
        this.a = object;
        this.w = list;
        boolean bl2 = bl != null ? bl : false;
        this.u = bl2;
        object = new StringBuilder();
        object.append("com.ryanheise.just_audio.methods.");
        object.append(string2);
        this.b = object = new k((E5.c)object2, object.toString());
        object.e(this);
        object = new StringBuilder();
        object.append("com.ryanheise.just_audio.events.");
        object.append(string2);
        this.c = new e((E5.c)object2, object.toString());
        object = new StringBuilder();
        object.append("com.ryanheise.just_audio.data.");
        object.append(string2);
        this.d = new e((E5.c)object2, object.toString());
        this.e = b.o;
        if (map != null) {
            object = (Map)map.get((Object)"androidLoadControl");
            if (object != null) {
                object2 = new r.b().c((int)(d.L0(object.get((Object)"minBufferDuration")) / 1000L), (int)(d.L0(object.get((Object)"maxBufferDuration")) / 1000L), (int)(d.L0(object.get((Object)"bufferForPlaybackDuration")) / 1000L), (int)(d.L0(object.get((Object)"bufferForPlaybackAfterRebufferDuration")) / 1000L)).d((Boolean)object.get((Object)"prioritizeTimeOverSizeThresholds")).b((int)(d.L0(object.get((Object)"backBufferDuration")) / 1000L), false);
                if (object.get((Object)"targetBufferBytes") != null) {
                    object2.e((Integer)object.get((Object)"targetBufferBytes"));
                }
                this.t = object2.a();
            }
            if ((object = (Map)map.get((Object)"androidLivePlaybackSpeedControl")) != null) {
                this.v = new q.b().c((float)((Double)object.get((Object)"fallbackMinPlaybackSpeed")).doubleValue()).b((float)((Double)object.get((Object)"fallbackMaxPlaybackSpeed")).doubleValue()).f(d.L0(object.get((Object)"minUpdateInterval")) / 1000L).g((float)((Double)object.get((Object)"proportionalControlFactor")).doubleValue()).d(d.L0(object.get((Object)"maxLiveOffsetErrorForUnitSpeed")) / 1000L).h(d.L0(object.get((Object)"targetLiveOffsetIncrementOnRebuffer")) / 1000L).e((float)((Double)object.get((Object)"minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
            }
        }
    }

    public static /* synthetic */ void K(k.d d8) {
        d8.a((Object)new HashMap());
    }

    public static Long L0(Object object) {
        if (object != null && !(object instanceof Long)) {
            return (long)((Integer)object);
        }
        return (Long)object;
    }

    public static /* synthetic */ void M(k.d d8) {
        d8.a((Object)new HashMap());
    }

    public static Object R0(Object object, String string2) {
        if (object instanceof Map) {
            return ((Map)object).get((Object)string2);
        }
        return null;
    }

    public static /* synthetic */ void S(k.d d8) {
        d8.a((Object)new HashMap());
    }

    public static /* varargs */ Map S0(Object ... arrobject) {
        HashMap hashMap = new HashMap();
        for (int i8 = 0; i8 < arrobject.length; i8 += 2) {
            hashMap.put((Object)((String)arrobject[i8]), arrobject[i8 + 1]);
        }
        return hashMap;
    }

    public static Map s0(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Object object : map.keySet()) {
            hashMap.put((Object)((String)object), (Object)((String)map.get(object)));
        }
        return hashMap;
    }

    public final T A0(List list) {
        int n8 = list.size();
        int[] arrn = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrn[i8] = (Integer)list.get(i8);
        }
        return new T.a(arrn, H.nextLong());
    }

    @Override
    public /* synthetic */ void B(int n8) {
        E.o(this, n8);
    }

    public void B0() {
        Object object;
        if (this.e == b.p) {
            this.T();
        }
        if ((object = this.m) != null) {
            object.a((Object)new HashMap());
            this.m = null;
        }
        this.o.clear();
        this.D = null;
        this.t0();
        object = this.B;
        if (object != null) {
            object.release();
            this.B = null;
            this.e = b.o;
            this.g0();
        }
        this.c.c();
        this.d.c();
    }

    @Override
    public /* synthetic */ void C(boolean bl, int n8) {
        E.q(this, bl, n8);
    }

    public final void C0() {
        new HashMap();
        this.A = this.x0();
    }

    @Override
    public /* synthetic */ void D(K k8) {
        E.x(this, k8);
    }

    public final void D0() {
        if (this.B == null) {
            Object object = new w.b(this.a);
            Object object2 = this.t;
            if (object2 != null) {
                object.m((x0)object2);
            }
            if ((object2 = this.v) != null) {
                object.l((w0)object2);
            }
            this.B = object = object.f();
            object.F(object.O().a().F(new K.b.a().f(this.u ^ true).g(this.u ^ true).e(1).d()).C());
            this.Z0(this.B.j());
            this.B.v(this);
        }
    }

    @Override
    public /* synthetic */ void E(B b8) {
        E.p(this, b8);
    }

    public final Map E0() {
        Equalizer equalizer = (Equalizer)this.y.get((Object)"AndroidEqualizer");
        ArrayList arrayList = new ArrayList();
        for (short s8 = 0; s8 < equalizer.getNumberOfBands(); s8 = (short)(s8 + 1)) {
            arrayList.add((Object)d.S0("index", s8, "lowerFrequency", (double)equalizer.getBandFreqRange(s8)[0] / 1000.0, "upperFrequency", (double)equalizer.getBandFreqRange(s8)[1] / 1000.0, "centerFrequency", (double)equalizer.getCenterFreq(s8) / 1000.0, "gain", (double)equalizer.getBandLevel(s8) / 1000.0));
        }
        return d.S0(new Object[]{"parameters", d.S0(new Object[]{"minDecibels", (double)equalizer.getBandLevelRange()[0] / 1000.0, "maxDecibels", (double)equalizer.getBandLevelRange()[1] / 1000.0, "bands", arrayList})});
    }

    @Override
    public /* synthetic */ void F(d0.b b8) {
        E.a(this, b8);
    }

    public final void F0(int n8, double d8) {
        ((Equalizer)this.y.get((Object)"AndroidEqualizer")).setBandLevel((short)n8, (short)Math.round((double)(d8 * 1000.0)));
    }

    @Override
    public /* synthetic */ void G(boolean bl) {
        E.j(this, bl);
    }

    public final x0.x G0(Object object) {
        Map map = (Map)object;
        String string2 = (String)map.get((Object)"id");
        x0.x x8 = (x0.x)this.o.get((Object)string2);
        object = x8;
        if (x8 == null) {
            object = this.z0((Object)map);
            this.o.put((Object)string2, object);
        }
        return object;
    }

    @Override
    public /* synthetic */ void H(int n8) {
        E.r(this, n8);
    }

    public final List H0(Object object) {
        if (object instanceof List) {
            object = (List)object;
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < object.size(); ++i8) {
                arrayList.add((Object)this.G0(object.get(i8)));
            }
            return arrayList;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("List expected: ");
        stringBuilder.append(object);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    public /* synthetic */ void I(d0.w w8) {
        E.l(this, w8);
    }

    public final x0.x[] I0(Object object) {
        object = this.H0(object);
        Object[] arrobject = new x0.x[object.size()];
        object.toArray(arrobject);
        return arrobject;
    }

    @Override
    public void J(L l8) {
        for (int i8 = 0; i8 < l8.a().size(); ++i8) {
            J j8 = ((L.a)l8.a().get(i8)).a();
            for (int i9 = 0; i9 < j8.a; ++i9) {
                x x8 = j8.a((int)i9).k;
                if (x8 == null) continue;
                for (int i10 = 0; i10 < x8.e(); ++i10) {
                    x.b b8 = x8.d(i10);
                    if (!(b8 instanceof S0.b)) continue;
                    this.q = (S0.b)b8;
                    this.g0();
                }
            }
        }
    }

    public final long J0() {
        long l8;
        long l9 = this.j;
        if (l9 != -9223372036854775807L) {
            return l9;
        }
        b b8 = this.e;
        if (b8 != b.o && b8 != b.p) {
            b8 = this.i;
            if (b8 != null && b8.longValue() != -9223372036854775807L) {
                return this.i;
            }
            return this.B.P();
        }
        l9 = l8 = this.B.P();
        if (l8 < 0L) {
            l9 = 0L;
        }
        return l9;
    }

    public final long K0() {
        Object object = this.e;
        if (object != b.o && object != b.p && (object = this.B) != null) {
            return object.K();
        }
        return -9223372036854775807L;
    }

    @Override
    public /* synthetic */ void O(d0.u u8, int n8) {
        E.k(this, u8, n8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void P(I var1_1, int var2_3) {
        block8 : {
            var4_4 = this.j;
            var3_5 = 0;
            if (var4_4 != -9223372036854775807L || this.k != null) {
                var1_1 = this.k;
                var2_3 = var1_1 != null ? var1_1.intValue() : 0;
                this.B.s(var2_3, this.j);
                this.k = null;
                this.j = -9223372036854775807L;
            }
            if (this.i1()) {
                this.g0();
            }
            if (this.B.f() != 4) break block8;
            try {
                if (!this.B.u()) ** GOTO lbl21
                if (this.z == 0 && this.B.M() > 0) {
                    var1_1 = this.B;
                    var2_3 = var3_5;
                } else {
                    if (this.B.B()) {
                        this.B.y();
                    }
                    break block8;
lbl21: // 1 sources:
                    if (this.B.E() >= this.B.M()) break block8;
                    var1_1 = this.B;
                    var2_3 = var1_1.E();
                }
                var1_1.s(var2_3, 0L);
                break block8;
            }
            catch (Exception var1_2) {}
            var1_2.printStackTrace();
        }
        this.z = this.B.M();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void P0(x0.x x8, long l8, Integer n8, k.d d8) {
        this.j = l8;
        this.k = n8;
        int n9 = n8 != null ? n8 : 0;
        this.E = n9;
        n9 = this.e.ordinal();
        if (n9 != 0) {
            if (n9 == 1) {
                this.T();
            }
            this.B.stop();
        }
        this.r = 0;
        this.l = d8;
        this.j1();
        this.e = b.p;
        this.C0();
        this.D = x8;
        this.B.e(x8);
        this.B.g();
    }

    @Override
    public /* synthetic */ void Q(boolean bl) {
        E.h(this, bl);
    }

    public final void Q0(double d8) {
        int n8 = (int)Math.round((double)(d8 * 1000.0));
        ((LoudnessEnhancer)this.y.get((Object)"AndroidLoudnessEnhancer")).setTargetGain(n8);
    }

    @Override
    public /* synthetic */ void R() {
        E.s(this);
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
        k.d d8 = this.m;
        if (d8 != null) {
            d8.a((Object)new HashMap());
            this.m = null;
        }
    }

    @Override
    public /* synthetic */ void U(float f8) {
        E.z(this, f8);
    }

    public void U0(k.d d8) {
        if (this.B.u()) {
            d8.a((Object)new HashMap());
            return;
        }
        k.d d9 = this.m;
        if (d9 != null) {
            d9.a((Object)new HashMap());
        }
        this.m = d8;
        this.B.n(true);
        this.j1();
        if (this.e == b.s && (d8 = this.m) != null) {
            d8.a((Object)new HashMap());
            this.m = null;
        }
    }

    @Override
    public /* synthetic */ void V(l l8) {
        E.e(this, l8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void V0(long var1_1, Integer var3_2, k.d var4_4) {
        block2 : {
            var6_5 = this.e;
            if (var6_5 == b.o || var6_5 == b.p) break block2;
            this.W();
            this.i = var1_1;
            this.n = var4_4;
            if (var3_2 == null) ** GOTO lbl10
            try {
                block3 : {
                    var5_6 = var3_2;
                    break block3;
lbl10: // 1 sources:
                    var5_6 = this.B.E();
                }
                this.B.s(var5_6, var1_1);
                return;
            }
            catch (RuntimeException var3_3) {}
        }
        var4_4.a((Object)new HashMap());
        return;
        this.n = null;
        this.i = null;
        throw var3_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void W() {
        k.d d8 = this.n;
        if (d8 != null) {
            try {
                d8.a((Object)new HashMap());
            }
            catch (RuntimeException runtimeException) {}
            this.n = null;
            this.i = null;
        }
    }

    public final void W0(String string2, String string3) {
        this.X0(string2, string3, null);
    }

    @Override
    public void X(int n8) {
        if (n8 != 2) {
            if (n8 != 3) {
                if (n8 != 4) {
                    return;
                }
                Object object = this.e;
                b b8 = b.s;
                if (object != b8) {
                    this.j1();
                    this.e = b8;
                    this.g0();
                }
                if (this.l != null) {
                    object = new HashMap();
                    this.l.a(object);
                    this.l = null;
                    object = this.s;
                    if (object != null) {
                        this.B.A((d0.b)object, false);
                        this.s = null;
                    }
                }
                if ((object = this.m) != null) {
                    object.a((Object)new HashMap());
                    this.m = null;
                    return;
                }
            } else {
                if (this.B.u()) {
                    this.j1();
                }
                this.e = b.r;
                this.g0();
                if (this.l != null) {
                    HashMap hashMap = new HashMap();
                    Object object = this.K0() == -9223372036854775807L ? null : Long.valueOf((long)(this.K0() * 1000L));
                    hashMap.put((Object)"duration", object);
                    this.l.a((Object)hashMap);
                    this.l = null;
                    object = this.s;
                    if (object != null) {
                        this.B.A((d0.b)object, false);
                        this.s = null;
                    }
                }
                if (this.n != null) {
                    this.v0();
                    return;
                }
            }
        } else {
            this.k1();
            b b9 = this.e;
            b b10 = b.q;
            if (b9 != b10 && b9 != b.p) {
                this.e = b10;
                this.g0();
            }
            this.h1();
        }
    }

    public final void X0(String string2, String string3, Object object) {
        k.d d8 = this.l;
        if (d8 != null) {
            d8.b(string2, string3, object);
            this.l = null;
        }
        this.c.b(string2, string3, object);
    }

    @Override
    public /* synthetic */ void Y(boolean bl, int n8) {
        E.m(this, bl, n8);
    }

    public final void Y0(int n8, int n9, int n10) {
        Object object = new b.e();
        object.b(n8);
        object.c(n9);
        object.d(n10);
        object = object.a();
        if (this.e == b.p) {
            this.s = object;
            return;
        }
        this.B.A((d0.b)object, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void Z0(int n8) {
        Integer n9 = n8 == 0 ? null : Integer.valueOf((int)n8);
        this.C = n9;
        this.t0();
        if (this.C != null) {
            n9 = this.w.iterator();
            while (n9.hasNext()) {
                Object object = n9.next();
                Map map = (Map)object;
                object = this.y0(object, this.C);
                if (((Boolean)map.get((Object)"enabled")).booleanValue()) {
                    object.setEnabled(true);
                }
                this.x.add(object);
                this.y.put((Object)((String)map.get((Object)"type")), object);
            }
        }
        this.C0();
    }

    public void a1(int n8) {
        this.B.i(n8);
    }

    @Override
    public /* synthetic */ void b(P p8) {
        E.y(this, p8);
    }

    public void b1(float f8) {
        C c8 = this.B.h();
        if (c8.b == f8) {
            return;
        }
        this.B.k(new C(c8.a, f8));
        this.C0();
    }

    @Override
    public /* synthetic */ void c(boolean bl) {
        E.v(this, bl);
    }

    public void c1(boolean bl) {
        this.B.x(bl);
    }

    public final void d0(String string2, boolean bl) {
        ((AudioEffect)this.y.get((Object)string2)).setEnabled(bl);
    }

    public final void d1(Object object) {
        object = (Map)object;
        Object object2 = (String)d.R0(object, "id");
        if ((object2 = (x0.x)this.o.get(object2)) == null) {
            return;
        }
        String string2 = (String)d.R0(object, "type");
        string2.hashCode();
        if (!string2.equals((Object)"concatenating")) {
            if (!string2.equals((Object)"looping")) {
                return;
            }
            this.d1(d.R0(object, "child"));
            return;
        }
        ((x0.l)object2).r0(this.A0((List)d.R0(object, "shuffleOrder")));
        object = ((List)d.R0(object, "children")).iterator();
        while (object.hasNext()) {
            this.d1(object.next());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void e0(B b8) {
        int n8;
        Object object;
        Object object2;
        if (b8 instanceof u) {
            object2 = (u)b8;
            n8 = object2.x;
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 2) {
                        b8 = new StringBuilder();
                        object = "default ExoPlaybackException: ";
                    } else {
                        b8 = new StringBuilder();
                        object = "TYPE_UNEXPECTED: ";
                    }
                    b8.append((String)object);
                    object = object2.h();
                } else {
                    b8 = new StringBuilder();
                    b8.append("TYPE_RENDERER: ");
                    object = object2.f();
                }
            } else {
                b8 = new StringBuilder();
                b8.append("TYPE_SOURCE: ");
                object = object2.g();
            }
            b8.append(object.getMessage());
            t5.b.b("AudioPlayer", b8.toString());
            object = String.valueOf((int)object2.x);
            object2 = object2.getMessage();
            b8 = d.S0(new Object[]{"index", this.E});
        } else {
            object = new StringBuilder();
            object.append("default PlaybackException: ");
            object.append(b8.getMessage());
            t5.b.b("AudioPlayer", object.toString());
            object = String.valueOf((int)b8.o);
            object2 = b8.getMessage();
            b8 = d.S0(new Object[]{"index", this.E});
        }
        this.X0((String)object, (String)object2, (Object)b8);
        ++this.r;
        if (this.B.B() && (b8 = this.E) != null && this.r <= 5 && (n8 = b8.intValue() + 1) < this.B.L().p()) {
            this.B.e(this.D);
            this.B.g();
            this.B.s(n8, 0L);
        }
    }

    public void e1(boolean bl) {
        this.B.d(bl);
    }

    public void f1(float f8) {
        C c8 = this.B.h();
        if (c8.a == f8) {
            return;
        }
        this.B.k(new C(f8, c8.b));
        if (this.B.u()) {
            this.j1();
        }
        this.C0();
    }

    public final void g0() {
        this.C0();
        this.l0();
    }

    public void g1(float f8) {
        this.B.l(f8);
    }

    @Override
    public /* synthetic */ void h0(boolean bl) {
        E.u(this, bl);
    }

    public final void h1() {
        this.F.removeCallbacks(this.G);
        this.F.post(this.G);
    }

    @Override
    public /* synthetic */ void i0(int n8, int n9) {
        E.w(this, n8, n9);
    }

    public final boolean i1() {
        Integer n8 = this.B.E();
        if (!n8.equals((Object)this.E)) {
            this.E = n8;
            return true;
        }
        return false;
    }

    @Override
    public /* synthetic */ void j(C c8) {
        E.n(this, c8);
    }

    @Override
    public /* synthetic */ void j0(D.b b8) {
        E.b(this, b8);
    }

    public final void j1() {
        this.f = this.J0();
        this.g = System.currentTimeMillis();
    }

    @Override
    public /* synthetic */ void k(List list) {
        E.d(this, list);
    }

    @Override
    public void k0(D.e e8, D.e e9, int n8) {
        this.j1();
        if (n8 == 0 || n8 == 1) {
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
        Map map = this.A;
        if (map != null) {
            this.c.a((Object)map);
            this.A = null;
        }
    }

    @Override
    public /* synthetic */ void m(int n8) {
        E.t(this, n8);
    }

    public final g.a m0(Map object) {
        Object object2;
        Map map = d.s0((Map)object);
        if (map != null) {
            object = object2 = (String)map.remove((Object)"User-Agent");
            if (object2 == null) {
                object = (String)map.remove((Object)"user-agent");
            }
        } else {
            object = null;
        }
        object2 = object;
        if (object == null) {
            object2 = M.q0(this.a, "just_audio");
        }
        object = new m.b().e((String)object2).c(true);
        if (map != null && map.size() > 0) {
            object.d(map);
        }
        return new l.a(this.a, (g.a)object);
    }

    @Override
    public /* synthetic */ void n0(D d8, D.c c8) {
        E.g(this, d8, c8);
    }

    /*
     * Exception decompiling
     */
    @Override
    public void onMethodCall(j var1_1, k.d var2_6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public final m p0(Map map) {
        int n8;
        boolean bl;
        boolean bl2;
        m m8 = new m();
        if (map != null && (map = (Map)map.get((Object)"androidExtractorOptions")) != null) {
            bl2 = (Boolean)map.get((Object)"constantBitrateSeekingEnabled");
            bl = (Boolean)map.get((Object)"constantBitrateSeekingAlwaysEnabled");
            n8 = (Integer)map.get((Object)"mp3Flags");
        } else {
            bl2 = true;
            bl = false;
            n8 = 0;
        }
        m8.i(bl2);
        m8.h(bl);
        m8.j(n8);
        return m8;
    }

    @Override
    public /* synthetic */ void q0(int n8, boolean bl) {
        E.f(this, n8, bl);
    }

    @Override
    public /* synthetic */ void r(f0.b b8) {
        E.c(this, b8);
    }

    @Override
    public /* synthetic */ void r0(boolean bl) {
        E.i(this, bl);
    }

    public final void t0() {
        Iterator iterator = this.x.iterator();
        while (iterator.hasNext()) {
            ((AudioEffect)iterator.next()).release();
            iterator.remove();
        }
        this.y.clear();
    }

    public final Map u0() {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        if (this.p != null) {
            hashMap = new HashMap();
            hashMap.put((Object)"title", (Object)this.p.p);
            hashMap.put((Object)"url", (Object)this.p.q);
            hashMap2.put((Object)"info", (Object)hashMap);
        }
        if (this.q != null) {
            hashMap = new HashMap();
            hashMap.put((Object)"bitrate", (Object)this.q.o);
            hashMap.put((Object)"genre", (Object)this.q.p);
            hashMap.put((Object)"name", (Object)this.q.q);
            hashMap.put((Object)"metadataInterval", (Object)this.q.t);
            hashMap.put((Object)"url", (Object)this.q.r);
            hashMap.put((Object)"isPublic", (Object)this.q.s);
            hashMap2.put((Object)"headers", (Object)hashMap);
        }
        return hashMap2;
    }

    public final void v0() {
        this.i = null;
        this.n.a((Object)new HashMap());
        this.n = null;
    }

    public final x0.l w0(Object object) {
        return (x0.l)this.o.get((Object)((String)object));
    }

    @Override
    public void x(x x8) {
        for (int i8 = 0; i8 < x8.e(); ++i8) {
            x.b b8 = x8.d(i8);
            if (!(b8 instanceof c)) continue;
            this.p = (c)b8;
            this.g0();
        }
    }

    public final Map x0() {
        HashMap hashMap = new HashMap();
        Long l8 = this.K0() == -9223372036854775807L ? null : Long.valueOf((long)(this.K0() * 1000L));
        w w8 = this.B;
        long l9 = w8 != null ? w8.t() : 0L;
        this.h = l9;
        hashMap.put((Object)"processingState", (Object)this.e.ordinal());
        hashMap.put((Object)"updatePosition", (Object)(this.f * 1000L));
        hashMap.put((Object)"updateTime", (Object)this.g);
        hashMap.put((Object)"bufferedPosition", (Object)(Math.max((long)this.f, (long)this.h) * 1000L));
        hashMap.put((Object)"icyMetadata", (Object)this.u0());
        hashMap.put((Object)"duration", (Object)l8);
        hashMap.put((Object)"currentIndex", (Object)this.E);
        hashMap.put((Object)"androidAudioSessionId", (Object)this.C);
        return hashMap;
    }

    public final AudioEffect y0(Object object, int n8) {
        object = (Map)object;
        String string2 = (String)object.get((Object)"type");
        string2.hashCode();
        if (!string2.equals((Object)"AndroidEqualizer")) {
            if (string2.equals((Object)"AndroidLoudnessEnhancer")) {
                int n9 = (int)Math.round((double)((Double)object.get((Object)"targetGain") * 1000.0));
                object = new LoudnessEnhancer(n8);
                object.setTargetGain(n9);
                return object;
            }
            string2 = new StringBuilder();
            string2.append("Unknown AudioEffect type: ");
            string2.append(object.get((Object)"type"));
            throw new IllegalArgumentException(string2.toString());
        }
        return new Equalizer(0, n8);
    }

    public final x0.x z0(Object object) {
        object = (Map)object;
        x0.x[] arrx = (x0.x[])object.get((Object)"id");
        String string2 = (String)object.get((Object)"type");
        string2.hashCode();
        int n8 = string2.hashCode();
        int n9 = 0;
        int n10 = -1;
        switch (n8) {
            default: {
                break;
            }
            case 2092627105: {
                if (!string2.equals((Object)"silence")) break;
                n10 = 6;
                break;
            }
            case 1131547531: {
                if (!string2.equals((Object)"progressive")) break;
                n10 = 5;
                break;
            }
            case 918617282: {
                if (!string2.equals((Object)"clipping")) break;
                n10 = 4;
                break;
            }
            case 349937342: {
                if (!string2.equals((Object)"looping")) break;
                n10 = 3;
                break;
            }
            case 3075986: {
                if (!string2.equals((Object)"dash")) break;
                n10 = 2;
                break;
            }
            case 103407: {
                if (!string2.equals((Object)"hls")) break;
                n10 = 1;
                break;
            }
            case -445916622: {
                if (!string2.equals((Object)"concatenating")) break;
                n10 = 0;
            }
        }
        switch (n10) {
            default: {
                arrx = new StringBuilder();
                arrx.append("Unknown AudioSource type: ");
                arrx.append(object.get((Object)"type"));
                throw new IllegalArgumentException(arrx.toString());
            }
            case 6: {
                return new U.b().b(d.L0(object.get((Object)"duration"))).c(arrx).a();
            }
            case 5: {
                return new L.b(this.m0((Map)d.R0(object, "headers")), this.p0((Map)d.R0(object, "options"))).b(new u.c().e(Uri.parse((String)((String)object.get((Object)"uri")))).d(arrx).a());
            }
            case 4: {
                arrx = d.L0(object.get((Object)"start"));
                string2 = d.L0(object.get((Object)"end"));
                object = this.G0(object.get((Object)"child"));
                long l8 = arrx != null ? arrx.longValue() : 0L;
                long l9 = string2 != null ? string2.longValue() : Long.MIN_VALUE;
                return new f((x0.x)object, l8, l9);
            }
            case 3: {
                arrx = (Integer)object.get((Object)"count");
                object = this.G0(object.get((Object)"child"));
                n8 = arrx.intValue();
                arrx = new x0.x[n8];
                for (n10 = n9; n10 < n8; ++n10) {
                    arrx[n10] = object;
                }
                return new x0.l(arrx);
            }
            case 2: {
                return new DashMediaSource.Factory(this.m0((Map)d.R0(object, "headers"))).a(new u.c().e(Uri.parse((String)((String)object.get((Object)"uri")))).c("application/dash+xml").d(arrx).a());
            }
            case 1: {
                return new HlsMediaSource.Factory(this.m0((Map)d.R0(object, "headers"))).a(new u.c().e(Uri.parse((String)((String)object.get((Object)"uri")))).c("application/x-mpegURL").a());
            }
            case 0: 
        }
        arrx = this.I0(object.get((Object)"children"));
        return new x0.l(false, (Boolean)object.get((Object)"useLazyPreparation"), this.A0((List)d.R0(object, "shuffleOrder")), arrx);
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o = new b();
        public static final /* enum */ b p = new b();
        public static final /* enum */ b q = new b();
        public static final /* enum */ b r = new b();
        public static final /* enum */ b s = new b();
        public static final /* synthetic */ b[] t;

        static {
            t = b.c();
        }

        public static /* synthetic */ b[] c() {
            return new b[]{o, p, q, r, s};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])t.clone();
        }
    }

}

