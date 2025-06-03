/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.metrica.impl.ob.B4
 *  com.yandex.metrica.impl.ob.Bg
 *  com.yandex.metrica.impl.ob.C0
 *  com.yandex.metrica.impl.ob.Cg
 *  com.yandex.metrica.impl.ob.Dg
 *  com.yandex.metrica.impl.ob.Dm
 *  com.yandex.metrica.impl.ob.Eg
 *  com.yandex.metrica.impl.ob.P1
 *  com.yandex.metrica.impl.ob.Vc
 *  com.yandex.metrica.impl.ob.Y8
 *  com.yandex.metrica.impl.ob.Zc
 *  com.yandex.metrica.impl.ob.d1
 *  com.yandex.metrica.impl.ob.ed
 *  com.yandex.metrica.impl.ob.gd
 *  com.yandex.metrica.impl.ob.hd
 *  com.yandex.metrica.impl.ob.id
 *  com.yandex.metrica.impl.ob.mm
 *  com.yandex.metrica.impl.ob.q2
 *  com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.coreutils.network.UserAgent;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B4;
import com.yandex.metrica.impl.ob.Bg;
import com.yandex.metrica.impl.ob.C0;
import com.yandex.metrica.impl.ob.Cg;
import com.yandex.metrica.impl.ob.Dg;
import com.yandex.metrica.impl.ob.Dm;
import com.yandex.metrica.impl.ob.E4;
import com.yandex.metrica.impl.ob.Eg;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.P1;
import com.yandex.metrica.impl.ob.Vc;
import com.yandex.metrica.impl.ob.W7;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.Zc;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.d1;
import com.yandex.metrica.impl.ob.dd;
import com.yandex.metrica.impl.ob.ed;
import com.yandex.metrica.impl.ob.ei;
import com.yandex.metrica.impl.ob.gd;
import com.yandex.metrica.impl.ob.hd;
import com.yandex.metrica.impl.ob.id;
import com.yandex.metrica.impl.ob.jd;
import com.yandex.metrica.impl.ob.mm;
import com.yandex.metrica.impl.ob.q2;
import com.yandex.metrica.impl.ob.s2;
import com.yandex.metrica.impl.ob.tm;
import com.yandex.metrica.impl.ob.xg;
import com.yandex.metrica.impl.ob.yc;
import com.yandex.metrica.impl.ob.zg;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import com.yandex.metrica.networktasks.api.DefaultNetworkResponseHandler;
import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.FullUrlFormer;
import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import com.yandex.metrica.networktasks.api.IParamsAppender;
import com.yandex.metrica.networktasks.api.NetworkResponseHandler;
import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.api.RequestBodyEncrypter;
import com.yandex.metrica.networktasks.api.RequestDataHolder;
import com.yandex.metrica.networktasks.api.ResponseDataHolder;
import com.yandex.metrica.networktasks.api.ResponseValidityChecker;
import com.yandex.metrica.networktasks.api.UnderlyingNetworkTask;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class kd {
    private static final Map<jd, ExponentialBackoffDataHolder> a;
    private static final String b;
    @NotNull
    public static final kd c;

    static {
        c = new kd();
        a = new LinkedHashMap();
        b = UserAgent.getFor("com.yandex.mobile.metrica.sdk", "5.2.0", "45002146");
    }

    private kd() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final ExponentialBackoffDataHolder a(jd object) {
        kd kd2 = this;
        synchronized (kd2) {
            Object object2;
            Map<jd, ExponentialBackoffDataHolder> map = a;
            Object object3 = object2 = map.get(object);
            if (object2 != null) return (ExponentialBackoffDataHolder)object3;
            F0 f02 = F0.g();
            Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance()");
            f02 = f02.s();
            Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.get\u2026ance().servicePreferences");
            object2 = new id((Y8)f02, object);
            object3 = new ExponentialBackoffDataHolder((HostRetryInfoProvider)object2);
            map.put(object, object3);
            return (ExponentialBackoffDataHolder)object3;
        }
    }

    @JvmStatic
    @NotNull
    public static final NetworkTask a(@NotNull Context context, @NotNull Zc zc2, @NotNull s2 s22, @NotNull yc yc2) {
        mm mm2 = new mm();
        Cg cg2 = new Cg((RequestBodyEncrypter)mm2);
        zc2 = new C0((Object)zc2);
        return new NetworkTask(new tm(), (IExecutionPolicy)new hd(context), (ExponentialBackoffPolicy)new ed(c.a(jd.b)), (UnderlyingNetworkTask)new Vc(context, s22, yc2, cg2, (ConfigProvider)zc2, new RequestDataHolder(), new ResponseDataHolder((ResponseValidityChecker)new gd()), new FullUrlFormer((IParamsAppender)cg2, (ConfigProvider)zc2), (RequestBodyEncrypter)mm2), CollectionsKt.listOf((Object)A2.a()), b);
    }

    @JvmStatic
    @NotNull
    public static final NetworkTask a(@NotNull Context context, @NotNull ConfigProvider configProvider, @NotNull c0 c02, @NotNull E4 e4, @NotNull W7 w72) {
        FullUrlFormer fullUrlFormer = new FullUrlFormer((IParamsAppender)new Bg(), configProvider);
        return new NetworkTask(new tm(), (IExecutionPolicy)new hd(context), (ExponentialBackoffPolicy)new ed(c.a(jd.d)), (UnderlyingNetworkTask)new B4(configProvider, c02, e4, w72, (NetworkResponseHandler)new DefaultNetworkResponseHandler(), new RequestDataHolder(), new ResponseDataHolder((ResponseValidityChecker)new gd()), fullUrlFormer), CollectionsKt.listOf((Object)A2.a()), b);
    }

    @JvmStatic
    @NotNull
    public static final NetworkTask a(@NotNull L3 l32) {
        mm mm2 = new mm();
        Dg dg2 = new Dg((RequestBodyEncrypter)mm2);
        d1 d12 = new d1(l32);
        return new NetworkTask(new tm(), (IExecutionPolicy)new hd(l32.g()), (ExponentialBackoffPolicy)new ed(c.a(jd.a)), (UnderlyingNetworkTask)new P1(l32, dg2, d12, new FullUrlFormer((IParamsAppender)dg2, (ConfigProvider)d12), new RequestDataHolder(), new ResponseDataHolder((ResponseValidityChecker)new gd()), (RequestBodyEncrypter)mm2), CollectionsKt.listOf((Object)A2.a()), b);
    }

    @JvmStatic
    @NotNull
    public static final NetworkTask a(@NotNull ei ei2, @NotNull zg zg2) {
        xg xg2 = new xg();
        F0 f02 = F0.g();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance()");
        xg2 = new Eg(xg2, (dd)f02.j());
        zg2 = new C0((Object)zg2);
        return new NetworkTask((Executor)new Dm(), (IExecutionPolicy)new hd(ei2.b()), (ExponentialBackoffPolicy)new ed(c.a(jd.c)), (UnderlyingNetworkTask)new q2(ei2, new FullUrlFormer((IParamsAppender)((Object)xg2), (ConfigProvider)((Object)zg2)), new RequestDataHolder(), new ResponseDataHolder((ResponseValidityChecker)new gd()), (ConfigProvider)((Object)zg2)), CollectionsKt.emptyList(), b);
    }
}

