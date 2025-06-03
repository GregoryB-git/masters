/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.billing_interface.d;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Rl;
import com.yandex.metrica.impl.ob.S3;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.h3;
import com.yandex.metrica.impl.ob.m;
import java.util.List;

public class b3
implements m {
    @NonNull
    private final S3 a;
    @NonNull
    private final ICommonExecutor b;

    public b3(@NonNull S3 s32, @NonNull ICommonExecutor iCommonExecutor) {
        this.a = s32;
        this.b = iCommonExecutor;
    }

    public void a(@NonNull List<d> object2) {
        for (Object object2 : object2) {
            this.b.execute(new Rl(this, (d)object2){
                public final d a;
                public final b3 b;
                {
                    this.b = b32;
                    this.a = d2;
                }

                @Override
                public void a() throws Exception {
                    S3 s32 = this.b.a;
                    b3 b32 = this.b;
                    Object object = this.a;
                    b32.getClass();
                    object = new h3((d)object);
                    s32.a(c0.a().a(((h3)object).a()));
                }
            });
        }
    }
}

