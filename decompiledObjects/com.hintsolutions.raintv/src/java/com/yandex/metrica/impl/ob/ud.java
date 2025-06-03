/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.jvm.internal.Intrinsics
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Xd;
import com.yandex.metrica.impl.ob.t0;
import kotlin.jvm.internal.Intrinsics;

public final class Ud
extends t0<Xd> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(Object object, Object object2) {
        object = (Xd)object;
        object2 = (Xd)object2;
        if (!((Xd)object).c) return false;
        if (!((Xd)object2).c) return true;
        int n3 = ((Number)this.a().a(((Xd)object).e)).intValue();
        object = this.a().a(((Xd)object2).e);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"priorities[oldData.source]");
        if (Intrinsics.compare((int)n3, (int)((Number)object).intValue()) <= 0) return false;
        return true;
    }
}

