/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.yandex.metrica.impl.ob.a0$a
 *  com.yandex.metrica.impl.ob.q
 *  com.yandex.metrica.impl.ob.q$a
 *  com.yandex.metrica.impl.ob.q$b
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.jvm.JvmOverloads
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.impl.ob.a0;
import com.yandex.metrica.impl.ob.bh;
import com.yandex.metrica.impl.ob.q;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class a0 {
    private Context a;
    private final q.b b;
    private final q c;
    private final IReporter d;

    @JvmOverloads
    public a0(@NotNull q q2) {
        this(q2, null, 2);
    }

    @JvmOverloads
    public a0(@NotNull q q2, @NotNull IReporter iReporter) {
        this.c = q2;
        this.d = iReporter;
        this.b = new a(this);
    }

    public /* synthetic */ a0(q q2, IReporter iReporter, int n2) {
        if ((n2 & 2) != 0) {
            iReporter = bh.a();
            Intrinsics.checkNotNullExpressionValue((Object)iReporter, (String)"YandexMetricaSelfReportFacade.getReporter()");
        } else {
            iReporter = null;
        }
        this(q2, iReporter);
    }

    public static final /* synthetic */ IReporter a(a0 a02) {
        return a02.d;
    }

    public final void a(@NotNull Context context) {
        a0 a02 = this;
        synchronized (a02) {
            if (this.a == null) {
                context = context.getApplicationContext();
                this.c.a(context);
                this.c.a(this.b, new q.a[]{q.a.b, q.a.c});
                this.a = context;
            }
            return;
        }
    }
}

