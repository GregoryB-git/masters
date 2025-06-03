package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f11721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11722b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11723c;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f11725e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f11724d = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public boolean f11726f = false;

    public a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f11721a = sharedPreferences;
        this.f11722b = str;
        this.f11723c = str2;
        this.f11725e = executor;
    }

    public static a0 d(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        a0Var.e();
        return a0Var;
    }

    public boolean b(String str) {
        boolean c7;
        if (TextUtils.isEmpty(str) || str.contains(this.f11723c)) {
            return false;
        }
        synchronized (this.f11724d) {
            c7 = c(this.f11724d.add(str));
        }
        return c7;
    }

    public final boolean c(boolean z7) {
        if (z7 && !this.f11726f) {
            j();
        }
        return z7;
    }

    public final void e() {
        synchronized (this.f11724d) {
            try {
                this.f11724d.clear();
                String string = this.f11721a.getString(this.f11722b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f11723c)) {
                    String[] split = string.split(this.f11723c, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f11724d.add(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public String f() {
        String str;
        synchronized (this.f11724d) {
            str = (String) this.f11724d.peek();
        }
        return str;
    }

    public boolean g(Object obj) {
        boolean c7;
        synchronized (this.f11724d) {
            c7 = c(this.f11724d.remove(obj));
        }
        return c7;
    }

    public String h() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f11724d.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(this.f11723c);
        }
        return sb.toString();
    }

    public final void i() {
        synchronized (this.f11724d) {
            this.f11721a.edit().putString(this.f11722b, h()).commit();
        }
    }

    public final void j() {
        this.f11725e.execute(new Runnable() { // from class: com.google.firebase.messaging.Z
            @Override // java.lang.Runnable
            public final void run() {
                a0.this.i();
            }
        });
    }
}
