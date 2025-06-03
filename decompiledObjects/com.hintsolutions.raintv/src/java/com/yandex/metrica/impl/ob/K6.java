/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.RequiresApi
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.coreutils.io.FileUtils
 *  com.yandex.metrica.impl.ob.Zl
 *  com.yandex.metrica.impl.ob.b
 *  com.yandex.metrica.impl.ob.j6
 *  com.yandex.metrica.impl.ob.k6$a
 *  com.yandex.metrica.impl.ob.r7
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.io.FileUtils;
import com.yandex.metrica.impl.ob.Zl;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.j6;
import com.yandex.metrica.impl.ob.k6;
import com.yandex.metrica.impl.ob.r7;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RequiresApi(value=21)
public class k6
implements j6 {
    @NonNull
    private final List<Zl<String>> a;
    @NonNull
    private final r7 b;
    @NonNull
    private final Zl<String> c;

    public k6(@NonNull Context object) {
        String string = com.yandex.metrica.impl.ob.b.a((Context)object);
        File file = FileUtils.getStorageDirectory((Context)object);
        if (file == null) {
            object = null;
        } else {
            object = new StringBuilder();
            object.append(file.getAbsolutePath());
            object.append("/");
            object.append("appmetrica_native_crashes");
            object = object.toString();
        }
        this(new r7(string, (String)object));
    }

    @VisibleForTesting
    public k6(@NonNull r7 r72) {
        this.a = new ArrayList();
        this.c = new a(this);
        this.b = r72;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(k6 k62, String string) {
        ArrayList arrayList;
        k6 k63 = k62;
        synchronized (k63) {
            arrayList = new ArrayList(k62.a);
        }
        k62 = arrayList.iterator();
        while (k62.hasNext()) {
            ((Zl)k62.next()).b((Object)string);
        }
        return;
    }

    public void a() {
        this.b.a(this.c);
    }

    public void a(@NonNull Zl<String> zl) {
        k6 k62 = this;
        synchronized (k62) {
            this.a.add(zl);
            return;
        }
    }

    public void b() {
        this.b.b(this.c);
    }

    public void b(@NonNull Zl<String> zl) {
        k6 k62 = this;
        synchronized (k62) {
            this.a.remove(zl);
            return;
        }
    }
}

