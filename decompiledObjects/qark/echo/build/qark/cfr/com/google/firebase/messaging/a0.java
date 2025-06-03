/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Iterator
 *  java.util.concurrent.Executor
 */
package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Z;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class a0 {
    public final SharedPreferences a;
    public final String b;
    public final String c;
    public final ArrayDeque d = new ArrayDeque();
    public final Executor e;
    public boolean f = false;

    public a0(SharedPreferences sharedPreferences, String string2, String string3, Executor executor) {
        this.a = sharedPreferences;
        this.b = string2;
        this.c = string3;
        this.e = executor;
    }

    public static /* synthetic */ void a(a0 a02) {
        a02.i();
    }

    public static a0 d(SharedPreferences object, String string2, String string3, Executor executor) {
        object = new a0((SharedPreferences)object, string2, string3, executor);
        object.e();
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b(String string2) {
        if (TextUtils.isEmpty((CharSequence)string2)) return false;
        if (string2.contains((CharSequence)this.c)) {
            return false;
        }
        ArrayDeque arrayDeque = this.d;
        synchronized (arrayDeque) {
            return this.c(this.d.add((Object)string2));
        }
    }

    public final boolean c(boolean bl) {
        if (bl && !this.f) {
            this.j();
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void e() {
        var3_1 = this.d;
        synchronized (var3_1) {
            block8 : {
                this.d.clear();
                var4_2 = this.a.getString(this.b, "");
                if (TextUtils.isEmpty((CharSequence)var4_2) || !var4_2.contains((CharSequence)this.c)) ** GOTO lbl17
                if ((var4_2 = var4_2.split(this.c, -1)).length == 0) {
                    Log.e((String)"FirebaseMessaging", (String)"Corrupted queue. Please check the queue contents and item separator provided");
                }
                var2_4 = var4_2.length;
                var1_5 = 0;
lbl11: // 2 sources:
                if (var1_5 >= var2_4) return;
                var5_6 = var4_2[var1_5];
                try {
                    if (!TextUtils.isEmpty((CharSequence)var5_6)) {
                        this.d.add((Object)var5_6);
                    }
                    break block8;
lbl17: // 1 sources:
                    return;
lbl18: // 1 sources:
                    ** do 
                }
                catch (Throwable var4_3) {
                    ** continue;
                }
lbl-1000: // 1 sources:
                {
                    throw var4_3;
                }
            }
            ++var1_5;
            ** GOTO lbl11
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String f() {
        ArrayDeque arrayDeque = this.d;
        synchronized (arrayDeque) {
            return (String)this.d.peek();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean g(Object object) {
        ArrayDeque arrayDeque = this.d;
        synchronized (arrayDeque) {
            return this.c(this.d.remove(object));
        }
    }

    public String h() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.d.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append((String)iterator.next());
            stringBuilder.append(this.c);
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        ArrayDeque arrayDeque = this.d;
        synchronized (arrayDeque) {
            this.a.edit().putString(this.b, this.h()).commit();
            return;
        }
    }

    public final void j() {
        this.e.execute((Runnable)new Z(this));
    }
}

