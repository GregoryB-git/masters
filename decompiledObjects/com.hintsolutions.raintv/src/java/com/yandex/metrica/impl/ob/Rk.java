/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.rk$a
 *  com.yandex.metrica.impl.ob.rk$b
 *  com.yandex.metrica.uiaccessor.a
 *  com.yandex.metrica.uiaccessor.a$a
 *  com.yandex.metrica.uiaccessor.b
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.rk;
import com.yandex.metrica.uiaccessor.a;

class rk {
    @NonNull
    public com.yandex.metrica.uiaccessor.b a(@NonNull Zl<Activity> object) {
        Object object2;
        try {
            a a2 = new a(this, object);
            object = object2 = new com.yandex.metrica.uiaccessor.a((a.a)a2);
        }
        catch (Throwable throwable) {
            object = null;
        }
        object2 = object;
        if (object == null) {
            object2 = new b(this);
        }
        return object2;
    }
}

