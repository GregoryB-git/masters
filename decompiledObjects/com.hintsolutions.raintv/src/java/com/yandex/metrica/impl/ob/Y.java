/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  com.yandex.metrica.impl.ob.y$a
 *  com.yandex.metrica.impl.ob.y$b
 *  java.lang.Boolean
 *  java.lang.Object
 *  kotlin.Metadata
 *  kotlin.jvm.JvmStatic
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.Context;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.v;
import com.yandex.metrica.impl.ob.y;
import com.yandex.metrica.impl.ob.z;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(bv={1, 0, 3}, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\b\u00a8\u0006\u000b"}, d2={"Lcom/yandex/metrica/impl/ob/y;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/v;", "converter", "Lcom/yandex/metrica/impl/ob/z;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/v;)Lcom/yandex/metrica/impl/ob/z;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, k=1, mv={1, 1, 15})
@TargetApi(value=28)
@DoNotInline
public final class y {
    @NotNull
    public static final y a = new y();

    private y() {
    }

    @JvmStatic
    @NotNull
    public static final z a(@NotNull Context context, @NotNull v v4) {
        return new z((z.a)((Object)A2.a(new a(v4), context, "usagestats", "getting app standby bucket", "usageStatsManager")), (Boolean)A2.a(b.a, context, "activity", "getting is background restricted", "activityManager"));
    }
}

