/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ac.CrashpadServiceHelper;
import com.yandex.metrica.impl.ob.Z6;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.am;
import com.yandex.metrica.impl.ob.m7;
import com.yandex.metrica.impl.ob.n7;
import com.yandex.metrica.impl.ob.q7;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

@RequiresApi(value=21)
public class o7
implements Z6<String> {
    @NonNull
    private final q7 a;
    @NonNull
    private final am<String, Bundle> b;
    @NonNull
    private final Callable<List<Bundle>> c;
    @NonNull
    private final Zl<String> d;
    @NonNull
    private final n7 e;

    public o7(@NonNull q7 q72) {
        this(q72, new n7(), new am<String, Bundle>(){

            @Override
            public Object a(@NonNull Object object) {
                return CrashpadServiceHelper.readCrash((String)object);
            }
        }, new Callable<List<Bundle>>(){

            public Object call() throws Exception {
                return CrashpadServiceHelper.readOldCrashes();
            }
        }, new Zl<String>(){

            @Override
            public void b(Object object) {
                CrashpadServiceHelper.a((String)object);
            }
        });
    }

    @VisibleForTesting
    public o7(@NonNull q7 q72, @NonNull n7 n72, @NonNull am<String, Bundle> am2, @NonNull Callable<List<Bundle>> callable, @NonNull Zl<String> zl2) {
        this.a = q72;
        this.e = n72;
        this.b = am2;
        this.c = callable;
        this.d = zl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        try {
            Iterator iterator = ((List)this.c.call()).iterator();
            while (iterator.hasNext()) {
                Object object = (Bundle)iterator.next();
                String string = object.getString("arg_ui");
                if (TextUtils.isEmpty((CharSequence)string)) continue;
                if ((object = this.e.a(string, (Bundle)object)) != null) {
                    this.a.b((m7)object);
                    continue;
                }
                this.d.b(string);
            }
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(@NonNull Object object) {
        String string;
        block3: {
            string = (String)object;
            try {
                object = this.b.a(string);
                if (object == null) break block3;
                object = this.e.a(string, (Bundle)object);
            }
            catch (Throwable throwable) {}
        }
        object = null;
        if (object != null) {
            this.a.a((m7)object);
            return;
        }
        this.d.b(string);
    }
}

