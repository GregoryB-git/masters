/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Gl;
import com.yandex.metrica.impl.ob.W8;
import com.yandex.metrica.impl.ob.c6;

public class d6
implements c6 {
    @NonNull
    private final String a;
    @NonNull
    public final W8 b;
    @NonNull
    private Gl.a c;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d6(@NonNull W8 object, @NonNull String string) {
        void var1_4;
        String string2;
        this.b = object;
        this.a = string2;
        Gl.a a2 = new Gl.a();
        try {
            string2 = ((W8)object).g(string2);
            Gl.a a3 = a2;
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                Gl.a a5 = new Gl.a(string2);
            }
        }
        catch (Throwable throwable) {
            Gl.a a7 = a2;
        }
        this.c = var1_4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(String string, Object object) {
        try {
            this.c.put(string, object);
            return;
        }
        catch (Throwable throwable) {
            return;
        }
    }

    public d6 a(long l2) {
        this.a("SESSION_INIT_TIME", l2);
        return this;
    }

    public d6 a(boolean bl2) {
        this.a("SESSION_IS_ALIVE_REPORT_NEEDED", bl2);
        return this;
    }

    public void a() {
        this.c = new Gl.a();
        this.b();
    }

    public d6 b(long l2) {
        this.a("SESSION_LAST_EVENT_OFFSET", l2);
        return this;
    }

    public void b() {
        this.b.c(this.a, this.c.toString());
        this.b.d();
    }

    public d6 c(long l2) {
        this.a("SESSION_COUNTER_ID", l2);
        return this;
    }

    @Nullable
    public Long c() {
        return this.c.a("SESSION_INIT_TIME");
    }

    public d6 d(long l2) {
        this.a("SESSION_ID", l2);
        return this;
    }

    @Nullable
    public Long d() {
        return this.c.a("SESSION_LAST_EVENT_OFFSET");
    }

    public d6 e(long l2) {
        this.a("SESSION_SLEEP_START", l2);
        return this;
    }

    @Nullable
    public Long e() {
        return this.c.a("SESSION_COUNTER_ID");
    }

    @Nullable
    public Long f() {
        return this.c.a("SESSION_ID");
    }

    @Nullable
    public Long g() {
        return this.c.a("SESSION_SLEEP_START");
    }

    public boolean h() {
        boolean bl2 = this.c.length() > 0;
        return bl2;
    }

    @Nullable
    public Boolean i() {
        Gl.a a2 = this.c;
        a2.getClass();
        try {
            a2 = Boolean.valueOf((boolean)a2.getBoolean("SESSION_IS_ALIVE_REPORT_NEEDED"));
        }
        catch (Throwable throwable) {
            a2 = null;
        }
        return a2;
    }
}

