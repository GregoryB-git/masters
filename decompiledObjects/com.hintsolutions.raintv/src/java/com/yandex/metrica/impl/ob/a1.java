/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Process
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.yandex.metrica.impl.ob;

import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B1;
import com.yandex.metrica.impl.ob.em;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class A1
implements B1 {
    private final em<String, Integer> a = new em();
    private final Map<e, d> b = new LinkedHashMap();
    private final Map<e, d> c = new LinkedHashMap();

    private void a(@NonNull Intent intent, @NonNull Map<e, d> iterator) {
        for (Map.Entry entry : iterator.entrySet()) {
            if (!(entry.getValue()).a(intent, this)) continue;
            (entry.getKey()).a(intent);
        }
    }

    public static boolean a(A1 a1) {
        boolean bl = a1.c() == 0;
        return bl;
    }

    public static boolean a(A1 a1, Intent intent) {
        boolean bl;
        boolean bl2 = a1.e(intent);
        boolean bl3 = bl = false;
        if (bl2) {
            boolean bl4 = a1.c() == 1;
            bl3 = bl;
            if (bl4) {
                bl3 = true;
            }
        }
        return bl3;
    }

    private int c() {
        Iterator iterator = this.a.a("com.yandex.metrica.IMetricaService");
        boolean bl = A2.b(iterator);
        int n = 0;
        if (!bl) {
            iterator = iterator.iterator();
            n = 0;
            while (iterator.hasNext()) {
                boolean bl2 = (Integer)iterator.next() == Process.myPid();
                if (bl2) continue;
                ++n;
            }
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int d(@NonNull Intent intent) {
        if ((intent = intent.getData()) == null) return -1;
        if (!intent.getPath().equals((Object)"/client")) return -1;
        try {
            return Integer.parseInt((String)intent.getQueryParameter("pid"));
        }
        catch (Throwable throwable) {
            return -1;
        }
    }

    private boolean e(@NonNull Intent intent) {
        boolean bl = "com.yandex.metrica.IMetricaService".equals((Object)intent.getAction());
        boolean bl2 = false;
        if (bl) {
            if (this.d(intent) == Process.myPid()) {
                bl2 = true;
            }
            return bl2 ^ true;
        }
        return false;
    }

    @Override
    public void a(Intent intent) {
        if (intent != null) {
            String string2 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.a.a(string2, this.d(intent));
            }
            this.a(intent, this.b);
        }
    }

    public void a(@NonNull e e2) {
        this.c.put((Object)e2, (Object)new d(this){
            public final A1 a;
            {
                this.a = a1;
            }

            @Override
            public boolean a(@NonNull Intent intent, @NonNull A1 a1) {
                boolean bl = this.a.e(intent) && A1.a(this.a);
                return bl;
            }
        });
    }

    @Override
    public void b(Intent intent) {
        if (intent != null) {
            String string2 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.a.b(string2, this.d(intent));
            }
            this.a(intent, this.c);
        }
    }

    public void b(@NonNull e e2) {
        this.b.put((Object)e2, (Object)new d(this){
            public final A1 a;
            {
                this.a = a1;
            }

            @Override
            public boolean a(@NonNull Intent intent, @NonNull A1 a1) {
                return A1.a(this.a, intent);
            }
        });
    }

    @Override
    public void c(Intent intent) {
        if (intent != null) {
            String string2 = intent.getAction();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                this.a.a(string2, this.d(intent));
            }
            this.a(intent, this.b);
        }
    }

    public void c(@NonNull e e2) {
        this.b.put((Object)e2, (Object)new d(this){
            public final A1 a;
            {
                this.a = a1;
            }

            @Override
            public boolean a(@NonNull Intent intent, @NonNull A1 a1) {
                return this.a.e(intent);
            }
        });
    }
}

