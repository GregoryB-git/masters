/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.identifiers.AdsIdentifiersProvider;
import com.yandex.metrica.impl.ob.Bb;
import com.yandex.metrica.impl.ob.Cb;
import com.yandex.metrica.impl.ob.U0;
import com.yandex.metrica.impl.ob.mb;
import com.yandex.metrica.impl.ob.nb;
import com.yandex.metrica.impl.ob.ob;
import com.yandex.metrica.impl.ob.yb;
import com.yandex.metrica.impl.ob.zb;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Db
implements ob {
    @NonNull
    private final String a;
    @NonNull
    private final Cb b;

    public Db(@NonNull String string2) {
        this(string2, new Cb());
    }

    @VisibleForTesting
    public Db(@NonNull String string2, @NonNull Cb cb) {
        this.a = string2;
        this.b = cb;
    }

    @Nullable
    private nb b(@NonNull Context object) throws Throwable {
        int n = AdsIdentifiersProvider.a;
        Method method = AdsIdentifiersProvider.class.getMethod("requestIdentifiers", new Class[]{Context.class, Bundle.class});
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.a);
        Object object2 = this.b;
        mb.a a2 = null;
        Bundle bundle2 = null;
        Object var3_8 = null;
        method = (Bundle)method.invoke(null, new Object[]{object, bundle});
        object2.getClass();
        object = bundle2;
        if (method != null) {
            bundle2 = method.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
            object = a2;
            if (bundle2 != null) {
                object = Bb.a.get((Object)bundle2.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
                if (object != null) {
                    a2 = (mb.a)((Object)object);
                    object2 = bundle2.getString("com.yandex.metrica.identifiers.extra.ID");
                    object = var3_8;
                    if (bundle2.containsKey("com.yandex.metrica.identifiers.extra.LIMITED")) {
                        object = bundle2.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED");
                    }
                    object = new mb(a2, (String)object2, (Boolean)object);
                } else {
                    object = z2.t("Provider ");
                    object.append(bundle2.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
                    object.append(" is invalid");
                    throw new IllegalArgumentException(object.toString().toString());
                }
            }
            object = new nb((mb)object, U0.a(method.getString("com.yandex.metrica.identifiers.extra.STATUS")), method.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
        }
        return object;
    }

    @Override
    @NonNull
    public nb a(@NonNull Context context) {
        return this.a(context, new yb());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    @NonNull
    public nb a(@NonNull Context object, @NonNull zb zb2) {
        zb2.c();
        Object object2 = null;
        while (zb2.b()) {
            try {
                return this.b((Context)object);
            }
            catch (Throwable throwable) {
                U0 u0 = U0.g;
                object2 = z2.t("exception while fetching ");
                object2.append(this.a);
                object2.append(" adv_id: ");
                object2.append(throwable.getMessage());
                object2 = new nb(null, u0, object2.toString());
            }
            catch (InvocationTargetException invocationTargetException) {
                object2 = invocationTargetException.getTargetException() != null ? invocationTargetException.getTargetException().getMessage() : null;
                object2 = new nb(null, U0.g, a.p(z2.t("exception while fetching "), this.a, " adv_id: ", (String)object2));
            }
            try {
                Thread.sleep((long)zb2.a());
            }
            catch (InterruptedException interruptedException) {}
        }
        object = object2;
        if (object2 != null) return object;
        return new nb();
    }
}

