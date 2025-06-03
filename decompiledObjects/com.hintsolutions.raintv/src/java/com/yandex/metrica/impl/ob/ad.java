/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.text.TextUtils
 *  com.yandex.metrica.impl.ob.Id
 *  com.yandex.metrica.impl.ob.Z8
 *  com.yandex.metrica.impl.ob.ca
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.Id;
import com.yandex.metrica.impl.ob.Kd;
import com.yandex.metrica.impl.ob.N7;
import com.yandex.metrica.impl.ob.X8;
import com.yandex.metrica.impl.ob.Z8;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.ca;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ad {
    private Context a;

    public Ad(Context context) {
        this.a = context;
    }

    private List<String> a(Map<String, ?> object2, String string) {
        ArrayList arrayList = new ArrayList();
        for (Object object2 : object2.keySet()) {
            if (!object2.startsWith(string)) continue;
            arrayList.add((Object)object2.replace((CharSequence)string, (CharSequence)""));
        }
        return arrayList;
    }

    private void a(N7 n7, String string) {
        long l2;
        n7 = new Z8(n7, string);
        String string2 = (string = new Id(this.a, string)).h(null);
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            n7.o(string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = string.c(null)))) {
            n7.j(string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = string.d(null)))) {
            n7.k(string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = string.f(null)))) {
            n7.m(string2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = string.e(null)))) {
            n7.l(string2);
        }
        if ((l2 = string.a(-1L)) != -1L) {
            n7.b(l2);
        }
        if (!TextUtils.isEmpty((CharSequence)(string2 = string.g(null)))) {
            n7.n(string2);
        }
        ((X8)((Object)n7)).d();
        string.f();
    }

    public void a() {
        SharedPreferences sharedPreferences = b.a(this.a, "_bidoptpreferences");
        if (sharedPreferences.getAll().size() > 0) {
            Kd kd = Id.p;
            String string2 = sharedPreferences.getString(kd.b(), null);
            Object object = new Id(this.a, null);
            if (!TextUtils.isEmpty((CharSequence)string2) && TextUtils.isEmpty((CharSequence)object.b(null))) {
                object.i(string2).b();
                sharedPreferences.edit().remove(kd.b()).apply();
            }
            if ((kd = sharedPreferences.getAll()).size() > 0) {
                for (String string2 : (ArrayList)this.a((Map<String, ?>)kd, Id.q.b())) {
                    object = sharedPreferences.getString(new Kd(Id.q.b(), string2).a(), null);
                    string2 = new Id(this.a, string2);
                    if (TextUtils.isEmpty((CharSequence)object) || !TextUtils.isEmpty((CharSequence)string2.h(null))) continue;
                    string2.j((String)object).b();
                }
            }
            sharedPreferences.edit().clear().apply();
        }
    }

    public void b() {
        N7 n7 = ca.a((Context)this.a).p();
        SharedPreferences sharedPreferences = b.a(this.a, "_startupserviceinfopreferences");
        Z8 z8 = new Z8(n7, null);
        Kd kd = Id.p;
        String string = sharedPreferences.getString(kd.b(), null);
        if (!TextUtils.isEmpty((CharSequence)string) && TextUtils.isEmpty((CharSequence)z8.g().b)) {
            z8.i(string).d();
            sharedPreferences.edit().remove(kd.b()).apply();
        }
        string = new Z8(n7, this.a.getPackageName());
        boolean bl = sharedPreferences.getBoolean(Id.y.b(), false);
        if (bl) {
            string.a(bl).d();
        }
        this.a(n7, this.a.getPackageName());
        sharedPreferences = ((ArrayList)this.a(sharedPreferences.getAll(), Id.q.b())).iterator();
        while (sharedPreferences.hasNext()) {
            this.a(n7, (String)sharedPreferences.next());
        }
    }
}

