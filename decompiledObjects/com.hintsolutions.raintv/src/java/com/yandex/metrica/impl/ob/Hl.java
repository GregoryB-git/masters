/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Fk;
import com.yandex.metrica.impl.ob.Kk;
import com.yandex.metrica.impl.ob.Sk;
import com.yandex.metrica.impl.ob.Tk;
import com.yandex.metrica.impl.ob.Uj;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.Xj;
import com.yandex.metrica.impl.ob.Yj;
import com.yandex.metrica.impl.ob.Yk;
import com.yandex.metrica.impl.ob.Zj;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.kl;
import com.yandex.metrica.impl.ob.mk;
import com.yandex.metrica.impl.ob.ol;
import com.yandex.metrica.impl.ob.rl;
import com.yandex.metrica.impl.ob.yk;

public class hl
implements Tk {
    @NonNull
    private final Kk a;
    @NonNull
    private final Fk b;
    @NonNull
    private final V8 c;
    @NonNull
    private final mk d;
    @NonNull
    private final yk e;
    @Nullable
    private Activity f;
    @Nullable
    private Sk g;

    public hl(@NonNull Context context, @NonNull V8 v82, @NonNull rl rl2, @NonNull ICommonExecutor iCommonExecutor, @Nullable Sk sk2) {
        this(context, v82, rl2, iCommonExecutor, sk2, new mk(sk2));
    }

    private hl(@NonNull Context context, @NonNull V8 v82, @NonNull rl rl2, @NonNull ICommonExecutor iCommonExecutor, @Nullable Sk sk2, @NonNull mk mk2) {
        this(v82, rl2, sk2, mk2, new Xj(1, v82), new ol(iCommonExecutor, new Yj(v82), mk2), new Uj(context));
    }

    @VisibleForTesting
    public hl(@NonNull V8 object, @Nullable Sk sk2, @NonNull rl rl2, @NonNull ol ol2, @NonNull mk mk2, @NonNull Kk kk2, @NonNull Fk fk2, @NonNull Zj zj) {
        this.c = object;
        this.g = sk2;
        this.d = mk2;
        this.a = kk2;
        this.b = fk2;
        this.e = object = new yk(new Zl<Activity>(this){
            public final hl a;
            {
                this.a = hl2;
            }

            @Override
            public void b(Object object) {
                object = (Activity)object;
                this.a.a.a((Activity)object);
            }
        }, rl2);
        ol2.a(new kl[]{zj, object});
    }

    private hl(@NonNull V8 v82, @NonNull rl rl2, @Nullable Sk sk2, @NonNull mk mk2, @NonNull Xj xj, @NonNull ol ol2, @NonNull Uj uj) {
        this(v82, sk2, rl2, ol2, mk2, new Kk(sk2, xj, v82, ol2, uj), new Fk(sk2, xj, v82, ol2, uj), new Zj());
    }

    public void a(@NonNull Activity activity) {
        hl hl2 = this;
        synchronized (hl2) {
            this.e.a(activity);
            this.f = null;
            return;
        }
    }

    @Override
    public void a(@NonNull Sk sk2) {
        hl hl2 = this;
        synchronized (hl2) {
            if (!sk2.equals(this.g)) {
                this.d.a(sk2);
                this.b.a(sk2);
                this.a.a(sk2);
                this.g = sk2;
                sk2 = this.f;
                if (sk2 != null) {
                    this.a.b((Activity)sk2);
                }
            }
            return;
        }
    }

    public void a(@NonNull Yk yk2, boolean bl2) {
        hl hl2 = this;
        synchronized (hl2) {
            this.b.a(this.f, yk2, bl2);
            this.c.c(true);
            return;
        }
    }

    public void b(@NonNull Activity activity) {
        hl hl2 = this;
        synchronized (hl2) {
            this.f = activity;
            this.a.a(activity);
            return;
        }
    }
}

