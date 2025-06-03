/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D5;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.w5;
import java.util.List;

@Deprecated
public class v5
extends w5<X4> {
    public v5(D5 d5) {
        super(d5);
    }

    @Override
    public void a(@NonNull List<X4> list) {
        list.add((Object)this.a().n());
        list.add((Object)this.a().m());
        list.add((Object)this.a().q());
    }
}

