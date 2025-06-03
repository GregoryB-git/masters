/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.EnumSet
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.El;
import com.yandex.metrica.impl.ob.H1;
import com.yandex.metrica.impl.ob.zl;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.util.EnumSet;

public class hd
implements IExecutionPolicy {
    private static final EnumSet<H1.d> c = EnumSet.of((Enum)H1.d.m);
    private El a = new zl();
    private final Context b;

    public hd(@NonNull Context context) {
        this.b = context;
    }

    @Override
    public boolean canBeExecuted() {
        Object object = this.a;
        Context context = this.b;
        ((zl)object).getClass();
        object = H1.a(context);
        return c.contains(object) ^ true;
    }
}

