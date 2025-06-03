/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 *  java.util.Map
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.Bh;
import com.yandex.metrica.impl.ob.Ch;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Fh;
import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.Mh;
import com.yandex.metrica.impl.ob.Nh;
import com.yandex.metrica.impl.ob.Oh;
import com.yandex.metrica.impl.ob.Ph;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.V7;
import com.yandex.metrica.impl.ob.Y9;
import com.yandex.metrica.impl.ob.di;
import com.yandex.metrica.impl.ob.fi;
import com.yandex.metrica.impl.ob.gi;
import com.yandex.metrica.impl.ob.hc;
import com.yandex.metrica.impl.ob.hi;
import com.yandex.metrica.impl.ob.i;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.ud;
import com.yandex.metrica.impl.ob.w0;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ci {
    @Nullable
    private final Ph A;
    @Nullable
    private final Mh B;
    @NotNull
    private final RetryPolicyConfig C;
    @Nullable
    private final hi D;
    private final long E;
    private final long F;
    private final boolean G;
    @Nullable
    private final jl H;
    @Nullable
    private final Uk I;
    @Nullable
    private final Uk J;
    @Nullable
    private final Uk K;
    @Nullable
    private final i L;
    @Nullable
    private final Ch M;
    @NotNull
    private final ka N;
    @NotNull
    private final List<String> O;
    @Nullable
    private final Bh P;
    @Nullable
    private final Hh Q;
    @NotNull
    private final fi R;
    @NotNull
    private final Map<String, Object> S;
    @Nullable
    private final String T;
    @Nullable
    private final String U;
    private final di V;
    @Nullable
    private final String a;
    @Nullable
    private final List<String> b;
    @Nullable
    private final List<String> c;
    @Nullable
    private final List<String> d;
    @Nullable
    private final List<String> e;
    @Nullable
    private final List<String> f;
    @Nullable
    private final List<String> g;
    @Nullable
    private final Map<String, List<String>> h;
    @Nullable
    private final String i;
    @Nullable
    private final String j;
    @Nullable
    private final String k;
    @Nullable
    private final String l;
    @Nullable
    private final String m;
    @Nullable
    private final String n;
    @Nullable
    private final String o;
    @NotNull
    private final Fh p;
    @NotNull
    private final List<hc> q;
    @Nullable
    private final Qh r;
    private final long s;
    private final boolean t;
    private final boolean u;
    @Nullable
    private final List<Oh> v;
    @Nullable
    private final String w;
    @Nullable
    private final gi x;
    @Nullable
    private final Nh y;
    @Nullable
    private final List<ud> z;

    private ci(String object, String string, di di2) {
        this.T = object;
        this.U = string;
        this.V = di2;
        this.a = di2.a;
        this.b = di2.d;
        this.c = di2.i;
        this.d = di2.j;
        this.e = di2.k;
        this.f = di2.l;
        this.g = di2.m;
        this.h = di2.n;
        this.i = di2.e;
        this.j = di2.f;
        this.k = di2.g;
        this.l = di2.h;
        this.m = di2.o;
        this.n = di2.p;
        this.o = di2.q;
        object = di2.r;
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"startupStateModel.collectingFlags");
        this.p = object;
        object = di2.s;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.locationCollectionConfigs");
        this.q = object;
        this.r = di2.t;
        this.s = di2.u;
        this.t = di2.v;
        this.u = di2.w;
        this.v = di2.x;
        this.w = di2.y;
        this.x = di2.z;
        this.y = di2.A;
        this.z = di2.B;
        this.A = di2.C;
        this.B = di2.D;
        object = di2.E;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.retryPolicyConfig");
        this.C = object;
        this.D = di2.F;
        this.E = di2.G;
        this.F = di2.H;
        this.G = di2.I;
        this.H = di2.J;
        this.I = di2.K;
        this.J = di2.L;
        this.K = di2.M;
        this.L = di2.N;
        this.M = di2.O;
        object = di2.P;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.diagnosticsConfigsHolder");
        this.N = object;
        object = di2.Q;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.mediascopeApiKeys");
        this.O = object;
        this.P = di2.R;
        Intrinsics.checkNotNullExpressionValue((Object)di2.S, (String)"startupStateModel.easyCollectingConfig");
        this.Q = di2.T;
        object = di2.U;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.startupUpdateConfig");
        this.R = object;
        object = di2.V;
        Intrinsics.checkNotNullExpressionValue(object, (String)"startupStateModel.modulesRemoteConfigs");
        this.S = object;
    }

    public /* synthetic */ ci(String string, String string2, di di2, DefaultConstructorMarker defaultConstructorMarker) {
        this(string, string2, di2);
    }

    @NotNull
    public final Map<String, Object> A() {
        return this.S;
    }

    public final long B() {
        return this.E;
    }

    public final long C() {
        return this.s;
    }

    public final boolean D() {
        return this.G;
    }

    @Nullable
    public final List<ud> E() {
        return this.z;
    }

    @Nullable
    public final Nh F() {
        return this.y;
    }

    @Nullable
    public final String G() {
        return this.j;
    }

    @Nullable
    public final List<String> H() {
        return this.b;
    }

    @Nullable
    public final List<Oh> I() {
        return this.v;
    }

    @NotNull
    public final RetryPolicyConfig J() {
        return this.C;
    }

    @Nullable
    public final Ph K() {
        return this.A;
    }

    @Nullable
    public final String L() {
        return this.k;
    }

    @Nullable
    public final Qh M() {
        return this.r;
    }

    public final boolean N() {
        return this.u;
    }

    @NotNull
    public final fi O() {
        return this.R;
    }

    @Nullable
    public final gi P() {
        return this.x;
    }

    @Nullable
    public final hi Q() {
        return this.D;
    }

    @Nullable
    public final Uk R() {
        return this.K;
    }

    @Nullable
    public final Uk S() {
        return this.I;
    }

    @Nullable
    public final jl T() {
        return this.H;
    }

    @Nullable
    public final Uk U() {
        return this.J;
    }

    @Nullable
    public final String V() {
        return this.a;
    }

    @NotNull
    public final a a() {
        Object object = this.V.r;
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"startupStateModel.collectingFlags");
        object = this.V.a((Fh)object);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"startupStateModel.buildUpon(collectingFlags)");
        return new a((di.b)object).c(this.T).d(this.U);
    }

    @Nullable
    public final Bh b() {
        return this.P;
    }

    @Nullable
    public final i c() {
        return this.L;
    }

    @Nullable
    public final Ch d() {
        return this.M;
    }

    @Nullable
    public final String e() {
        return this.l;
    }

    @NotNull
    public final Fh f() {
        return this.p;
    }

    @Nullable
    public final String g() {
        return this.w;
    }

    @Nullable
    public final Map<String, List<String>> h() {
        return this.h;
    }

    @Nullable
    public final String i() {
        return this.T;
    }

    @Nullable
    public final String j() {
        return this.U;
    }

    @Nullable
    public final List<String> k() {
        return this.f;
    }

    @NotNull
    public final ka l() {
        return this.N;
    }

    @Nullable
    public final Hh m() {
        return this.Q;
    }

    @Nullable
    public final String n() {
        return this.m;
    }

    public final long o() {
        return this.F;
    }

    @Nullable
    public final String p() {
        return this.i;
    }

    public final boolean q() {
        return this.t;
    }

    @Nullable
    public final List<String> r() {
        return this.e;
    }

    @Nullable
    public final List<String> s() {
        return this.d;
    }

    @Nullable
    public final Mh t() {
        return this.B;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("StartupState(deviceId=");
        stringBuilder.append(this.T);
        stringBuilder.append(", deviceIdHash=");
        stringBuilder.append(this.U);
        stringBuilder.append(", startupStateModel=");
        stringBuilder.append((Object)this.V);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Nullable
    public final String u() {
        return this.o;
    }

    @Nullable
    public final String v() {
        return this.n;
    }

    @NotNull
    public final List<hc> w() {
        return this.q;
    }

    @Nullable
    public final List<String> x() {
        return this.c;
    }

    @NotNull
    public final List<String> y() {
        return this.O;
    }

    @Nullable
    public final List<String> z() {
        return this.g;
    }

    public static final class a {
        private String a;
        private String b;
        private final di.b c;

        public a(@NotNull di.b b2) {
            this.c = b2;
        }

        @NotNull
        public final a a(long l5) {
            this.c.a(l5);
            return this;
        }

        @NotNull
        public final a a(@Nullable Bh bh) {
            this.c.R = bh;
            return this;
        }

        @NotNull
        public final a a(@Nullable Ch ch2) {
            this.c.O = ch2;
            return this;
        }

        @NotNull
        public final a a(@NotNull Hh hh2) {
            this.c.T = hh2;
            return this;
        }

        @NotNull
        public final a a(@Nullable Mh mh2) {
            this.c.a(mh2);
            return this;
        }

        @NotNull
        public final a a(@Nullable Nh nh2) {
            this.c.u = nh2;
            return this;
        }

        @NotNull
        public final a a(@Nullable Ph ph2) {
            this.c.a(ph2);
            return this;
        }

        @NotNull
        public final a a(@Nullable Qh qh) {
            this.c.t = qh;
            return this;
        }

        @NotNull
        public final a a(@Nullable Uk uk) {
            this.c.M = uk;
            return this;
        }

        @NotNull
        public final a a(@NotNull fi fi2) {
            this.c.a(fi2);
            return this;
        }

        @NotNull
        public final a a(@Nullable gi gi2) {
            this.c.C = gi2;
            return this;
        }

        @NotNull
        public final a a(@Nullable hi hi2) {
            this.c.I = hi2;
            return this;
        }

        @NotNull
        public final a a(@Nullable i i3) {
            this.c.N = i3;
            return this;
        }

        @NotNull
        public final a a(@Nullable jl jl2) {
            this.c.J = jl2;
            return this;
        }

        @NotNull
        public final a a(@NotNull ka ka2) {
            this.c.P = ka2;
            return this;
        }

        @NotNull
        public final a a(@NotNull w0 w02) {
            this.c.S = w02;
            return this;
        }

        @NotNull
        public final a a(@NotNull RetryPolicyConfig retryPolicyConfig) {
            this.c.H = retryPolicyConfig;
            return this;
        }

        @NotNull
        public final a a(@Nullable String string) {
            this.c.h = string;
            return this;
        }

        @NotNull
        public final a a(@Nullable List<String> list) {
            this.c.l = list;
            return this;
        }

        @NotNull
        public final a a(@Nullable Map<String, ? extends List<String>> map) {
            this.c.n = map;
            return this;
        }

        @NotNull
        public final a a(boolean bl) {
            this.c.w = bl;
            return this;
        }

        @NotNull
        public final ci a() {
            String string = this.a;
            String string2 = this.b;
            di di2 = this.c.a();
            Intrinsics.checkNotNullExpressionValue((Object)di2, (String)"modelBuilder.build()");
            return new ci(string, string2, di2, null);
        }

        @NotNull
        public final a b(long l5) {
            this.c.b(l5);
            return this;
        }

        @NotNull
        public final a b(@Nullable Uk uk) {
            this.c.K = uk;
            return this;
        }

        @NotNull
        public final a b(@Nullable String string) {
            this.c.b(string);
            return this;
        }

        @NotNull
        public final a b(@Nullable List<String> list) {
            this.c.k = list;
            return this;
        }

        @NotNull
        public final a b(@NotNull Map<String, ? extends Object> map) {
            this.c.b(map);
            return this;
        }

        @NotNull
        public final a b(boolean bl) {
            this.c.F = bl;
            return this;
        }

        @NotNull
        public final a c(long l5) {
            this.c.v = l5;
            return this;
        }

        @NotNull
        public final a c(@Nullable Uk uk) {
            this.c.L = uk;
            return this;
        }

        @NotNull
        public final a c(@Nullable String string) {
            this.a = string;
            return this;
        }

        @NotNull
        public final a c(@Nullable List<String> list) {
            this.c.j = list;
            return this;
        }

        @NotNull
        public final a c(boolean bl) {
            this.c.x = bl;
            return this;
        }

        @NotNull
        public final a d(@Nullable String string) {
            this.b = string;
            return this;
        }

        @NotNull
        public final a d(@Nullable List<? extends hc> list) {
            this.c.s = list;
            return this;
        }

        @NotNull
        public final a e(@Nullable String string) {
            this.c.o = string;
            return this;
        }

        @NotNull
        public final a e(@Nullable List<String> list) {
            this.c.i = list;
            return this;
        }

        @NotNull
        public final a f(@Nullable String string) {
            this.c.e = string;
            return this;
        }

        @NotNull
        public final a f(@NotNull List<String> list) {
            this.c.Q = list;
            return this;
        }

        @NotNull
        public final a g(@Nullable String string) {
            this.c.q = string;
            return this;
        }

        @NotNull
        public final a g(@Nullable List<String> list) {
            this.c.m = list;
            return this;
        }

        @NotNull
        public final a h(@Nullable String string) {
            this.c.p = string;
            return this;
        }

        @NotNull
        public final a h(@Nullable List<? extends ud> list) {
            this.c.h(list);
            return this;
        }

        @NotNull
        public final a i(@Nullable String string) {
            this.c.f = string;
            return this;
        }

        @NotNull
        public final a i(@Nullable List<String> list) {
            this.c.d = list;
            return this;
        }

        @NotNull
        public final a j(@Nullable String string) {
            this.c.g = string;
            return this;
        }

        @NotNull
        public final a j(@Nullable List<? extends Oh> list) {
            this.c.j(list);
            return this;
        }

        @NotNull
        public final a k(@Nullable String string) {
            this.c.a = string;
            return this;
        }
    }

    public static final class b {
        private final ProtobufStateStorage a;
        private final V7 b;

        public b(@NotNull Context object) {
            ProtobufStateStorage protobufStateStorage = Y9.b.a(di.class).a((Context)object);
            Intrinsics.checkNotNullExpressionValue((Object)protobufStateStorage, (String)"StorageFactory.Provider.\u2026ass.java).create(context)");
            object = F0.g();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"GlobalServiceLocator.getInstance()");
            this(protobufStateStorage, ((F0)object).w().a());
        }

        @VisibleForTesting
        public b(@NotNull ProtobufStateStorage protobufStateStorage, @NotNull V7 v7) {
            this.a = protobufStateStorage;
            this.b = v7;
        }

        @NotNull
        public final ci a() {
            String string = this.b.a();
            String string2 = this.b.b();
            Object object = this.a.read();
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"modelStorage.read()");
            return new ci(string, string2, (di)object, null);
        }

        public final void a(@NotNull ci ci2) {
            this.b.a(ci2.i());
            this.b.b(ci2.j());
            this.a.save(ci2.V);
        }
    }
}

