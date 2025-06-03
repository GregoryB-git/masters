/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.text.TextUtils
 *  androidx.annotation.MainThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.E1;
import com.yandex.metrica.impl.ob.P;
import com.yandex.metrica.impl.ob.j0;
import com.yandex.metrica.impl.ob.q;
import com.yandex.metrica.impl.ob.t;
import java.util.ArrayList;
import java.util.List;

public class u
implements q.b {
    @NonNull
    private final List<E1<j0>> a = new ArrayList();
    @Nullable
    private volatile j0 b = null;
    @NonNull
    private final q c;
    @NonNull
    private final ICommonExecutor d;

    public u(@NonNull ICommonExecutor iCommonExecutor) {
        this(iCommonExecutor, P.g().b());
    }

    @VisibleForTesting
    public u(@NonNull ICommonExecutor iCommonExecutor, @NonNull q q9) {
        this.d = iCommonExecutor;
        this.c = q9;
    }

    public void a() {
        this.c.a(this, q.a.a);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @MainThread
    public void a(@NonNull Activity object, @NonNull q.a object2) {
        void var1_8;
        void var1_5;
        Object var2_12 = null;
        if (object != null) {
            try {
                Intent intent = object.getIntent();
            }
            catch (Throwable throwable) {}
        }
        Object var1_4 = null;
        if (var1_5 == null) {
            Object var1_6 = var2_12;
        } else {
            String string = var1_5.getDataString();
        }
        if (!TextUtils.isEmpty((CharSequence)var1_8)) {
            E1<j0> e12 = new E1<j0>(){
                public final String a;
                {
                    this.a = string;
                }

                @Override
                public void b(@NonNull Object object) {
                    ((j0)object).b(this.a);
                }
            };
            u u3 = this;
            synchronized (u3) {
                j0 j02 = this.b;
                if (j02 == null) {
                    this.a.add((Object)e12);
                } else {
                    ICommonExecutor iCommonExecutor = this.d;
                    t t3 = new t(this, e12, j02);
                    iCommonExecutor.execute(t3);
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull j0 j02) {
        ArrayList arrayList;
        u u3 = this;
        synchronized (u3) {
            this.b = j02;
            u3 = this;
            synchronized (u3) {
                arrayList = new ArrayList(this.a);
                this.a.clear();
            }
        }
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            ((E1)arrayList.next()).b(j02);
        }
        return;
    }
}

