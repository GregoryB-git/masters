/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.WorkerThread
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.WorkerThread;
import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.impl.ob.c3;
import com.yandex.metrica.impl.ob.l;
import com.yandex.metrica.impl.ob.n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class f
implements l {
    private boolean a;
    private final Map<String, a> b;
    private final n c;

    public f(@NotNull n n2) {
        Intrinsics.checkNotNullParameter((Object)n2, (String)"storage");
        this.c = n2;
        n2 = (c3)n2;
        this.a = ((c3)n2).b();
        Object object2 = ((c3)n2).a();
        Intrinsics.checkNotNullExpressionValue(object2, (String)"storage.billingInfo");
        n2 = new LinkedHashMap();
        for (Object object2 : object2) {
            n2.put(((a)object2).b, object2);
        }
        this.b = n2;
    }

    @Override
    @Nullable
    public a a(@NotNull String string) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"sku");
        return (a)this.b.get((Object)string);
    }

    @WorkerThread
    public void a(@NotNull Map<String, ? extends a> list) {
        Object object2;
        Intrinsics.checkNotNullParameter(list, (String)"history");
        for (Object object2 : list.values()) {
            list = this.b;
            String string = ((a)object2).b;
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"billingInfo.sku");
            list.put((Object)string, object2);
        }
        object2 = this.c;
        list = CollectionsKt.toList((Iterable)this.b.values());
        boolean bl2 = this.a;
        ((c3)object2).a((List<a>)list, bl2);
    }

    @Override
    public boolean a() {
        return this.a;
    }

    @Override
    public void b() {
        if (!this.a) {
            this.a = true;
            n n2 = this.c;
            List list = CollectionsKt.toList((Iterable)this.b.values());
            boolean bl2 = this.a;
            ((c3)n2).a((List<a>)list, bl2);
        }
    }
}

