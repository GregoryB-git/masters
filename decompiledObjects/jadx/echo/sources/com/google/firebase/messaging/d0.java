package com.google.firebase.messaging;

import A2.AbstractC0327m;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11743d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f11744a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11745b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11746c;

    public d0(String str, String str2) {
        this.f11744a = d(str2, str);
        this.f11745b = str;
        this.f11746c = str + "!" + str2;
    }

    public static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new d0(split[0], split[1]);
    }

    public static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f11743d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static d0 f(String str) {
        return new d0("S", str);
    }

    public static d0 g(String str) {
        return new d0("U", str);
    }

    public String b() {
        return this.f11745b;
    }

    public String c() {
        return this.f11744a;
    }

    public String e() {
        return this.f11746c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f11744a.equals(d0Var.f11744a) && this.f11745b.equals(d0Var.f11745b);
    }

    public int hashCode() {
        return AbstractC0327m.b(this.f11745b, this.f11744a);
    }
}
