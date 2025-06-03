/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.executors.ICommonExecutor
 *  com.yandex.metrica.impl.ob.Bf
 *  com.yandex.metrica.impl.ob.P
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0010JA\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, d2={"Lcom/yandex/metrica/ModulesFacade;", "", "", "type", "", "name", "value", "", "environment", "", "reportEvent", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "isActivatedForApp", "()Z", "sendEventsBuffer", "()V", "Lcom/yandex/metrica/impl/ob/Bf;", "proxy", "setProxy", "(Lcom/yandex/metrica/impl/ob/Bf;)V", "a", "Lcom/yandex/metrica/impl/ob/Bf;", "sProxy", "<init>", "mobmetricalib_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
public final class ModulesFacade {
    private static Bf a;

    static {
        P p2 = P.g();
        Intrinsics.checkNotNullExpressionValue((Object)p2, (String)"ClientServiceLocator.getInstance()");
        p2 = p2.c();
        Intrinsics.checkNotNullExpressionValue((Object)p2, (String)"ClientServiceLocator.get\u2026stance().apiProxyExecutor");
        a = new Bf((ICommonExecutor)p2);
    }

    private ModulesFacade() {
    }

    @JvmStatic
    public static final boolean isActivatedForApp() {
        return a.a();
    }

    @JvmStatic
    public static final void reportEvent(int n, @NotNull String string2, @Nullable String string3, @Nullable Map<String, String> map) {
        a.a(n, string2, string3, map);
    }

    @JvmStatic
    public static final void sendEventsBuffer() {
        a.getClass();
        YandexMetrica.sendEventsBuffer();
    }

    @VisibleForTesting
    public final void setProxy(@NotNull Bf bf) {
        a = bf;
    }
}

