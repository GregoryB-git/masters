/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.U;
import com.yandex.metrica.impl.ob.Zc;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.pg;
import com.yandex.metrica.impl.ob.rg;
import java.util.List;

public class Zc
extends rg {
    @NonNull
    private final fc m;

    private Zc(@NonNull fc fc2) {
        this.m = fc2;
    }

    public /* synthetic */ Zc(fc fc2, a a2) {
        this(fc2);
    }

    @Nullable
    public List<String> A() {
        return this.v().x();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = z2.t("RequestConfig{mSuitableCollectionConfig=");
        stringBuilder.append((Object)this.m);
        stringBuilder.append("} ");
        stringBuilder.append(super.toString());
        return stringBuilder.toString();
    }

    @NonNull
    public fc z() {
        return this.m;
    }

    public static class c
    implements rg.d<Zc, b> {
        @NonNull
        private final Context a;
        @NonNull
        private final pg b;

        public c(@NonNull Context context, @NonNull pg pg2) {
            this.a = context;
            this.b = pg2;
        }

        @Override
        @NonNull
        public Zc a(b b2) {
            Zc zc = new Zc(b2.b, null);
            pg pg2 = this.b;
            Context context = this.a;
            pg2.getClass();
            zc.b(A2.a(context, context.getPackageName()));
            pg2 = this.b;
            context = this.a;
            pg2.getClass();
            zc.a(String.valueOf((int)A2.b(context, context.getPackageName())));
            zc.a(b2.a);
            zc.a(U.a());
            zc.a(F0.g().n().a());
            zc.e(this.a.getPackageName());
            zc.a(F0.g().r().a(this.a));
            zc.a(F0.g().a().a());
            return zc;
        }
    }
}

