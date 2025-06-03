/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.yg;
import com.yandex.metrica.networktasks.api.ConfigProvider;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class d1
implements ConfigProvider {
    private final Lazy a;
    private final L3 b;

    public d1(@NotNull L3 l3) {
        this.b = l3;
        this.a = LazyKt.lazy((Function0)new Function0<yg>(this){
            public final d1 a;
            {
                this.a = d12;
                super(0);
            }

            public Object invoke() {
                return d1.a(this.a).m();
            }
        });
    }

    public static final /* synthetic */ L3 a(d1 d12) {
        return d12.b;
    }

    @NotNull
    public yg a() {
        yg yg2 = (yg)this.a.getValue();
        Intrinsics.checkNotNullExpressionValue((Object)yg2, (String)"cachedConfig");
        return yg2;
    }

    @Override
    public Object getConfig() {
        yg yg2 = (yg)this.a.getValue();
        Intrinsics.checkNotNullExpressionValue((Object)yg2, (String)"cachedConfig");
        return yg2;
    }
}

