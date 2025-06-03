/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.google.android.gms.appset.AppSet
 *  com.google.android.gms.appset.AppSetIdInfo
 *  com.google.android.gms.tasks.OnCompleteListener
 *  com.google.android.gms.tasks.Task
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.appsetid;

import android.content.Context;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.yandex.metrica.appsetid.a;
import com.yandex.metrica.appsetid.c;
import com.yandex.metrica.appsetid.d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class b
implements d {
    private final Object a = new Object();
    private final List<OnCompleteListener<AppSetIdInfo>> b = new ArrayList();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NotNull Context context, @NotNull a object) throws Throwable {
        Object object2;
        context = AppSet.getClient((Context)context);
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"AppSet.getClient(context)");
        context = context.getAppSetIdInfo();
        Intrinsics.checkNotNullExpressionValue((Object)context, (String)"client.appSetIdInfo");
        OnCompleteListener<AppSetIdInfo> onCompleteListener = new OnCompleteListener<AppSetIdInfo>(this, (a)object2){
            public final b a;
            public final a b;
            {
                this.a = b4;
                this.b = a4;
            }

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void onComplete(@NotNull Task<AppSetIdInfo> object) {
                void var1_6;
                Object object2;
                Object object3 = object2 = this.a.a;
                // MONITORENTER : object3
                this.a.b.remove((Object)this);
                // MONITOREXIT : object3
                if (!object.isSuccessful()) {
                    this.b.a(object.getException());
                    return;
                }
                object2 = this.b;
                Object object4 = object.getResult();
                Intrinsics.checkNotNullExpressionValue((Object)object4, (String)"completedTask.result");
                object4 = ((AppSetIdInfo)object4).getId();
                b b4 = this.a;
                Object object5 = object.getResult();
                Intrinsics.checkNotNullExpressionValue((Object)object5, (String)"completedTask.result");
                int n = ((AppSetIdInfo)object5).getScope();
                b4.getClass();
                if (n != 1) {
                    if (n != 2) {
                        c c2 = c.b;
                    } else {
                        c c5 = c.d;
                    }
                } else {
                    c c6 = c.c;
                }
                object2.a((String)object4, (c)var1_6);
            }
        };
        Object object3 = object2 = this.a;
        synchronized (object3) {
            this.b.add((Object)onCompleteListener);
        }
        context.addOnCompleteListener((OnCompleteListener)onCompleteListener);
    }
}

