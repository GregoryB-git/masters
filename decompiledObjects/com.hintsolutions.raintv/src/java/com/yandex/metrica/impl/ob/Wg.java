/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.t2
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.t2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

public final class wg {
    private final List<String> a;
    private final t2 b;

    public wg() {
        F0 f02 = F0.g();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance()");
        f02 = f02.e();
        Intrinsics.checkNotNullExpressionValue((Object)f02, (String)"GlobalServiceLocator.getInstance().context");
        this(new t2((Context)f02, "appmetrica_startup_hosts"));
    }

    @VisibleForTesting
    public wg(@NotNull t2 t22) {
        this.b = t22;
        this.a = this.a(new String[]{"https://startup.mobile.yandex.net/", "", "", ""});
    }

    private final List<String> a(String[] stringArray) {
        ArrayList arrayList = new ArrayList();
        for (String string : stringArray) {
            if (string == null || !(StringsKt.j((String)string) ^ true)) {
                string = null;
            }
            if (string == null) continue;
            arrayList.add((Object)string);
        }
        return arrayList;
    }

    @NotNull
    public final Collection<String> a() {
        String[] stringArray;
        block5: {
            block4: {
                stringArray = (String[])this.b.a();
                if (stringArray == null) break block4;
                if (!((stringArray = this.a(stringArray)).isEmpty() ^ true)) {
                    stringArray = null;
                }
                if (stringArray != null) break block5;
            }
            stringArray = this.a;
        }
        return stringArray;
    }
}

