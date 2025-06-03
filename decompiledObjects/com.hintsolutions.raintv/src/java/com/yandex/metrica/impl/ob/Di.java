/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.xf
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.Bh;
import com.yandex.metrica.impl.ob.Ch;
import com.yandex.metrica.impl.ob.Fh;
import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.Mh;
import com.yandex.metrica.impl.ob.Nh;
import com.yandex.metrica.impl.ob.Oh;
import com.yandex.metrica.impl.ob.Ph;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.fi;
import com.yandex.metrica.impl.ob.gi;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.hi;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.m0;
import com.yandex.metrica.impl.ob.ud;
import com.yandex.metrica.impl.ob.w0;
import com.yandex.metrica.impl.ob.xf;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import static a.B;

@Deprecated
public class di {
    @Nullable
    public final Nh A;
    @Nullable
    public final List<ud> B;
    @Nullable
    public final Ph C;
    @Nullable
    public final Mh D;
    @NonNull
    public final RetryPolicyConfig E;
    @Nullable
    public final hi F;
    public final long G;
    public final long H;
    public final boolean I;
    @Nullable
    public final jl J;
    @Nullable
    public final Uk K;
    @Nullable
    public final Uk L;
    @Nullable
    public final Uk M;
    @Nullable
    public final i N;
    @Nullable
    public final Ch O;
    @NonNull
    public final ka P;
    @NonNull
    public final List<String> Q;
    @Nullable
    public final Bh R;
    @NonNull
    public final w0 S;
    @Nullable
    public final Hh T;
    @NonNull
    public final fi U;
    @NonNull
    public final Map<String, Object> V;
    @Nullable
    public final String a;
    @Deprecated
    @Nullable
    public final String b;
    @Deprecated
    @Nullable
    public final String c;
    @Nullable
    public final List<String> d;
    @Nullable
    public final String e;
    @Nullable
    public final String f;
    @Nullable
    public final String g;
    @Nullable
    public final String h;
    @Nullable
    public final List<String> i;
    @Nullable
    public final List<String> j;
    @Nullable
    public final List<String> k;
    @Nullable
    public final List<String> l;
    @Nullable
    public final List<String> m;
    @Nullable
    public final Map<String, List<String>> n;
    @Nullable
    public final String o;
    @Nullable
    public final String p;
    @Nullable
    public final String q;
    @NonNull
    public final Fh r;
    @NonNull
    public final List<hc> s;
    @Nullable
    public final Qh t;
    public final long u;
    public final boolean v;
    public final boolean w;
    @Nullable
    public final List<Oh> x;
    @Nullable
    public final String y;
    @Nullable
    public final gi z;

    private di(@NonNull b b2) {
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        Object object = b2.d;
        Object object2 = null;
        object = object == null ? null : A2.c(object);
        this.d = object;
        this.e = b2.e;
        this.f = b2.f;
        this.g = b2.g;
        this.h = b2.h;
        object = b2.i;
        object = object == null ? null : A2.c(object);
        this.i = object;
        object = b2.j;
        object = object == null ? null : A2.c(object);
        this.j = object;
        object = b2.k;
        object = object == null ? null : A2.c(object);
        this.k = object;
        object = b2.l;
        object = object == null ? null : A2.c(object);
        this.l = object;
        object = b2.m;
        object = object == null ? null : A2.c(object);
        this.m = object;
        object = b2.n;
        object = object == null ? null : A2.d(object);
        this.n = object;
        this.o = b2.o;
        this.p = b2.p;
        this.r = b2.r;
        List<hc> list = b2.s;
        object = list;
        if (list == null) {
            object = new List();
        }
        this.s = object;
        this.t = b2.t;
        this.A = b2.u;
        this.u = b2.v;
        this.v = b2.w;
        this.q = b2.q;
        this.w = b2.x;
        object = b2.y == null ? object2 : A2.c(b2.y);
        this.x = object;
        this.y = b2.z;
        this.B = b2.A;
        this.C = b2.B;
        this.z = b2.C;
        this.G = b2.D;
        this.H = b2.E;
        this.I = b2.F;
        this.D = b2.G;
        object = b2.H;
        if (object == null) {
            object = new xf();
            this.E = new RetryPolicyConfig(object.H, object.I);
        } else {
            this.E = object;
        }
        this.F = b2.I;
        this.J = b2.J;
        this.K = b2.K;
        this.L = b2.L;
        this.M = b2.M;
        this.N = b2.N;
        this.O = b2.O;
        object = object2 = b2.P;
        if (object2 == null) {
            object = new ka();
        }
        this.P = object;
        object = object2 = b2.Q;
        if (object2 == null) {
            object = new ArrayList();
        }
        this.Q = object;
        this.R = b2.R;
        object = object2 = b2.S;
        if (object2 == null) {
            object = new w0(m0.b.a);
        }
        this.S = object;
        this.T = b2.T;
        object = b2.U == null ? new fi(m0.c.a) : b2.U;
        this.U = object;
        b2 = b2.V == null ? Collections.emptyMap() : b2.V;
        this.V = b2;
    }

    public /* synthetic */ di(b b2, a a2) {
        this(b2);
    }

    public b a(@NonNull Fh object) {
        object = new b((Fh)object);
        ((b)object).a = this.a;
        ((b)object).b = this.b;
        ((b)object).c = this.c;
        ((b)object).j = this.j;
        ((b)object).k = this.k;
        ((b)object).o = this.o;
        ((b)object).d = this.d;
        ((b)object).i = this.i;
        ((b)object).e = this.e;
        ((b)object).f = this.f;
        ((b)object).g = this.g;
        ((b)object).h = this.h;
        ((b)object).l = this.l;
        ((b)object).m = this.m;
        ((b)object).s = this.s;
        ((b)object).n = this.n;
        ((b)object).t = this.t;
        ((b)object).p = this.p;
        ((b)object).q = this.q;
        ((b)object).x = this.w;
        ((b)object).v = this.u;
        ((b)object).w = this.v;
        object = ((b)object).j(this.x).b(this.y).h(this.B);
        ((b)object).u = this.A;
        object = ((b)object).a(this.C).b(this.G).a(this.H);
        ((b)object).C = this.z;
        ((b)object).F = this.I;
        b b2 = ((b)object).a(this.D);
        object = this.E;
        b2.I = this.F;
        b2.H = object;
        b2.J = this.J;
        b2.K = this.K;
        b2.L = this.L;
        b2.M = this.M;
        b2.O = this.O;
        b2.P = this.P;
        b2.Q = this.Q;
        b2.N = this.N;
        b2.R = this.R;
        b2.S = this.S;
        b2.T = this.T;
        return b2.a(this.U).b(this.V);
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("StartupStateModel{uuid='");
        B(stringBuilder, this.a, '\'', ", deviceID='");
        B(stringBuilder, this.b, '\'', ", deviceIDHash='");
        B(stringBuilder, this.c, '\'', ", reportUrls=");
        stringBuilder.append(this.d);
        stringBuilder.append(", getAdUrl='");
        B(stringBuilder, this.e, '\'', ", reportAdUrl='");
        B(stringBuilder, this.f, '\'', ", sdkListUrl='");
        B(stringBuilder, this.g, '\'', ", certificateUrl='");
        B(stringBuilder, this.h, '\'', ", locationUrls=");
        stringBuilder.append(this.i);
        stringBuilder.append(", hostUrlsFromStartup=");
        stringBuilder.append(this.j);
        stringBuilder.append(", hostUrlsFromClient=");
        stringBuilder.append(this.k);
        stringBuilder.append(", diagnosticUrls=");
        stringBuilder.append(this.l);
        stringBuilder.append(", mediascopeUrls=");
        stringBuilder.append(this.m);
        stringBuilder.append(", customSdkHosts=");
        stringBuilder.append(this.n);
        stringBuilder.append(", encodedClidsFromResponse='");
        B(stringBuilder, this.o, '\'', ", lastClientClidsForStartupRequest='");
        B(stringBuilder, this.p, '\'', ", lastChosenForRequestClids='");
        B(stringBuilder, this.q, '\'', ", collectingFlags=");
        stringBuilder.append((Object)this.r);
        stringBuilder.append(", locationCollectionConfigs=");
        stringBuilder.append(this.s);
        stringBuilder.append(", socketConfig=");
        stringBuilder.append((Object)this.t);
        stringBuilder.append(", obtainTime=");
        stringBuilder.append(this.u);
        stringBuilder.append(", hadFirstStartup=");
        stringBuilder.append(this.v);
        stringBuilder.append(", startupDidNotOverrideClids=");
        stringBuilder.append(this.w);
        stringBuilder.append(", requests=");
        stringBuilder.append(this.x);
        stringBuilder.append(", countryInit='");
        B(stringBuilder, this.y, '\'', ", statSending=");
        stringBuilder.append((Object)this.z);
        stringBuilder.append(", permissionsCollectingConfig=");
        stringBuilder.append((Object)this.A);
        stringBuilder.append(", permissions=");
        stringBuilder.append(this.B);
        stringBuilder.append(", sdkFingerprintingConfig=");
        stringBuilder.append((Object)this.C);
        stringBuilder.append(", identityLightCollectingConfig=");
        stringBuilder.append((Object)this.D);
        stringBuilder.append(", retryPolicyConfig=");
        stringBuilder.append((Object)this.E);
        stringBuilder.append(", throttlingConfig=");
        stringBuilder.append((Object)this.F);
        stringBuilder.append(", obtainServerTime=");
        stringBuilder.append(this.G);
        stringBuilder.append(", firstStartupServerTime=");
        stringBuilder.append(this.H);
        stringBuilder.append(", outdated=");
        stringBuilder.append(this.I);
        stringBuilder.append(", uiParsingConfig=");
        stringBuilder.append((Object)this.J);
        stringBuilder.append(", uiEventCollectingConfig=");
        stringBuilder.append((Object)this.K);
        stringBuilder.append(", uiRawEventCollectingConfig=");
        stringBuilder.append((Object)this.L);
        stringBuilder.append(", uiCollectingForBridgeConfig=");
        stringBuilder.append((Object)this.M);
        stringBuilder.append(", autoInappCollectingConfig=");
        stringBuilder.append((Object)this.N);
        stringBuilder.append(", cacheControl=");
        stringBuilder.append((Object)this.O);
        stringBuilder.append(", diagnosticsConfigsHolder=");
        stringBuilder.append((Object)this.P);
        stringBuilder.append(", mediascopeApiKeys=");
        stringBuilder.append(this.Q);
        stringBuilder.append(", attributionConfig=");
        stringBuilder.append((Object)this.R);
        stringBuilder.append(", easyCollectingConfig=");
        stringBuilder.append((Object)this.S);
        stringBuilder.append(", egressConfig=");
        stringBuilder.append((Object)this.T);
        stringBuilder.append(", startupUpdateConfig=");
        stringBuilder.append((Object)this.U);
        stringBuilder.append(", modulesRemoteConfigs=");
        stringBuilder.append(this.V);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    @Deprecated
    public static class b {
        @Nullable
        private List<ud> A;
        @Nullable
        private Ph B;
        @Nullable
        public gi C;
        private long D;
        private long E;
        public boolean F;
        @Nullable
        private Mh G;
        @Nullable
        public RetryPolicyConfig H;
        @Nullable
        public hi I;
        @Nullable
        public jl J;
        @Nullable
        public Uk K;
        @Nullable
        public Uk L;
        @Nullable
        public Uk M;
        @Nullable
        public i N;
        @Nullable
        public Ch O;
        @Nullable
        public ka P;
        @Nullable
        public List<String> Q;
        @Nullable
        public Bh R;
        @Nullable
        public w0 S;
        @Nullable
        public Hh T;
        @Nullable
        private fi U;
        @Nullable
        private Map<String, Object> V;
        @Nullable
        public String a;
        @Nullable
        public String b;
        @Nullable
        public String c;
        @Nullable
        public List<String> d;
        @Nullable
        public String e;
        @Nullable
        public String f;
        @Nullable
        public String g;
        @Nullable
        public String h;
        @Nullable
        public List<String> i;
        @Nullable
        public List<String> j;
        @Nullable
        public List<String> k;
        @Nullable
        public List<String> l;
        @Nullable
        public List<String> m;
        @Nullable
        public Map<String, List<String>> n;
        @Nullable
        public String o;
        @Nullable
        public String p;
        @Nullable
        public String q;
        @NonNull
        public final Fh r;
        @Nullable
        public List<hc> s;
        @Nullable
        public Qh t;
        @Nullable
        public Nh u;
        public long v;
        public boolean w;
        public boolean x;
        @Nullable
        private List<Oh> y;
        @Nullable
        private String z;

        public b(@NonNull Fh fh) {
            this.r = fh;
        }

        public b a(long l5) {
            this.E = l5;
            return this;
        }

        public b a(@Nullable Bh bh) {
            this.R = bh;
            return this;
        }

        public b a(@Nullable Ch ch2) {
            this.O = ch2;
            return this;
        }

        public b a(@Nullable Hh hh2) {
            this.T = hh2;
            return this;
        }

        public b a(@Nullable Mh mh2) {
            this.G = mh2;
            return this;
        }

        public b a(@Nullable Nh nh2) {
            this.u = nh2;
            return this;
        }

        public b a(@Nullable Ph ph2) {
            this.B = ph2;
            return this;
        }

        public b a(@Nullable Qh qh) {
            this.t = qh;
            return this;
        }

        public b a(@Nullable Uk uk2) {
            this.M = uk2;
            return this;
        }

        @NonNull
        public b a(@NonNull fi fi2) {
            this.U = fi2;
            return this;
        }

        public b a(gi gi2) {
            this.C = gi2;
            return this;
        }

        public b a(hi hi2) {
            this.I = hi2;
            return this;
        }

        public b a(@Nullable i i3) {
            this.N = i3;
            return this;
        }

        public b a(@Nullable jl jl2) {
            this.J = jl2;
            return this;
        }

        public b a(@Nullable ka ka2) {
            this.P = ka2;
            return this;
        }

        public b a(@Nullable w0 w02) {
            this.S = w02;
            return this;
        }

        public b a(@Nullable RetryPolicyConfig retryPolicyConfig) {
            this.H = retryPolicyConfig;
            return this;
        }

        public b a(@Nullable String string) {
            this.h = string;
            return this;
        }

        public b a(@Nullable List<String> list) {
            this.l = list;
            return this;
        }

        public b a(@Nullable Map<String, List<String>> map) {
            this.n = map;
            return this;
        }

        public b a(boolean bl) {
            this.w = bl;
            return this;
        }

        @NonNull
        public di a() {
            return new di(this, null);
        }

        public b b(long l5) {
            this.D = l5;
            return this;
        }

        public b b(@Nullable Uk uk2) {
            this.K = uk2;
            return this;
        }

        public b b(@Nullable String string) {
            this.z = string;
            return this;
        }

        public b b(@Nullable List<String> list) {
            this.k = list;
            return this;
        }

        @NonNull
        public b b(@NonNull Map<String, Object> map) {
            this.V = map;
            return this;
        }

        public b b(boolean bl) {
            this.F = bl;
            return this;
        }

        public b c(long l5) {
            this.v = l5;
            return this;
        }

        public b c(@Nullable Uk uk2) {
            this.L = uk2;
            return this;
        }

        @Deprecated
        public b c(@Nullable String string) {
            this.b = string;
            return this;
        }

        public b c(@Nullable List<String> list) {
            this.j = list;
            return this;
        }

        public b c(boolean bl) {
            this.x = bl;
            return this;
        }

        @Deprecated
        public b d(@Nullable String string) {
            this.c = string;
            return this;
        }

        public b d(@Nullable List<hc> list) {
            this.s = list;
            return this;
        }

        public b e(@Nullable String string) {
            this.o = string;
            return this;
        }

        public b e(@Nullable List<String> list) {
            this.i = list;
            return this;
        }

        public b f(@Nullable String string) {
            this.e = string;
            return this;
        }

        public b f(@Nullable List<String> list) {
            this.Q = list;
            return this;
        }

        public b g(@Nullable String string) {
            this.q = string;
            return this;
        }

        public b g(@Nullable List<String> list) {
            this.m = list;
            return this;
        }

        public b h(@Nullable String string) {
            this.p = string;
            return this;
        }

        public b h(@Nullable List<ud> list) {
            this.A = list;
            return this;
        }

        public b i(@Nullable String string) {
            this.f = string;
            return this;
        }

        public b i(@Nullable List<String> list) {
            this.d = list;
            return this;
        }

        public b j(@Nullable String string) {
            this.g = string;
            return this;
        }

        public b j(@Nullable List<Oh> list) {
            this.y = list;
            return this;
        }

        public b k(@Nullable String string) {
            this.a = string;
            return this;
        }
    }
}

