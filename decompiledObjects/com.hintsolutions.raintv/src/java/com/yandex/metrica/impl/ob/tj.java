/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.pk
 *  com.yandex.metrica.impl.ob.sk
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Qk;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.Xj;
import com.yandex.metrica.impl.ob.Yk;
import com.yandex.metrica.impl.ob.el;
import com.yandex.metrica.impl.ob.il;
import com.yandex.metrica.impl.ob.jl;
import com.yandex.metrica.impl.ob.ok;
import com.yandex.metrica.impl.ob.pk;
import com.yandex.metrica.impl.ob.sk;
import java.util.List;

class Tj
implements il {
    @NonNull
    private final Xj a;
    @NonNull
    private final V8 b;
    @NonNull
    private final Yk c;
    @NonNull
    private final a d;
    private final boolean e;

    @VisibleForTesting
    public Tj(@NonNull Xj xj, @NonNull V8 v8, boolean bl, @NonNull Yk yk, @NonNull a a2) {
        this.a = xj;
        this.b = v8;
        this.e = bl;
        this.c = yk;
        this.d = a2;
    }

    private boolean b(@NonNull Sk sk) {
        boolean bl;
        block2: {
            block3: {
                boolean bl2;
                boolean bl3 = sk.c;
                bl = bl2 = false;
                if (!bl3) break block2;
                bl = bl2;
                if (sk.g == null) break block2;
                if (this.e) break block3;
                bl = bl2;
                if (!this.b.a(false)) break block2;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public void a(long l4, @NonNull Activity activity, @NonNull Qk qk2, @NonNull List<el> object, @NonNull Sk sk2, @NonNull ok ok2) {
        if (this.b(sk2)) {
            a a2 = this.d;
            Uk uk = sk2.g;
            a2.getClass();
            object = uk.h ? new sk() : new pk((List)object);
            this.a.a(object.a(activity, qk2, sk2.g, ok2.a(), l4));
            this.c.onResult(this.a.a());
        }
    }

    @Override
    public void a(@NonNull Throwable throwable, @NonNull jl object) {
        object = this.c;
        StringBuilder stringBuilder = z2.t("exception: ");
        stringBuilder.append(throwable.getMessage());
        object.onError(stringBuilder.toString());
    }

    @Override
    public boolean a(@NonNull Sk sk2) {
        boolean bl = this.b(sk2) && !sk2.g.h;
        return bl;
    }
}

