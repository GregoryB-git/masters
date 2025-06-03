/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.networktasks.impl;

import com.yandex.metrica.networktasks.api.NetworkTask;
import com.yandex.metrica.networktasks.impl.c;
import com.yandex.metrica.networktasks.impl.d;
import com.yandex.metrica.networktasks.impl.f;
import kotlin.jvm.internal.Intrinsics;

public final class e {
    public final f a(NetworkTask networkTask, c c3) {
        Intrinsics.checkNotNullParameter((Object)networkTask, (String)"networkTask");
        Intrinsics.checkNotNullParameter((Object)((Object)c3), (String)"rootThreadStateSource");
        Intrinsics.checkNotNullParameter((Object)networkTask, (String)"networkTask");
        Intrinsics.checkNotNullParameter((Object)((Object)c3), (String)"rootThreadStateSource");
        return new f(networkTask, c3, new d());
    }
}

