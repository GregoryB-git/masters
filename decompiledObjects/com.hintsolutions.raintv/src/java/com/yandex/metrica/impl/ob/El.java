/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Uk;
import com.yandex.metrica.impl.ob.nk;
import org.json.JSONArray;
import org.json.JSONObject;
import static a.B;

public class el {
    @NonNull
    public final String a;
    @NonNull
    public final String b;
    @Nullable
    public final b c;
    public final int d;
    public final boolean e;
    @NonNull
    public final c f;
    @NonNull
    public final a g;

    public el(@NonNull String string, @NonNull String string2, @Nullable b b2, int n4, boolean bl, @NonNull c c3, @NonNull a a2) {
        this.a = string;
        this.b = string2;
        this.c = b2;
        this.d = n4;
        this.e = bl;
        this.f = c3;
        this.g = a2;
    }

    @Nullable
    public b a(@NonNull nk nk2) {
        return this.c;
    }

    @Nullable
    public JSONArray a(@NonNull Uk uk2) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public JSONObject a(@NonNull Uk uk2, @Nullable b b2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("t", (Object)this.f.a);
            if (b2 == null) {
                jSONObject.put("cnt", (Object)this.a(uk2));
            }
            if (!uk2.e) return jSONObject;
            uk2 = new JSONObject();
            uk2 = uk2.put("ct", this.g.a);
            uk2 = uk2.put("cn", this.a);
            uk2 = uk2.put("rid", this.b);
            uk2 = uk2.put("d", this.d);
            uk2 = uk2.put("lc", this.e);
            boolean bl = b2 != null;
            uk2 = uk2.put("if", bl);
            if (b2 != null) {
                uk2.put("fr", b2.a);
            }
            jSONObject.put("i", (Object)uk2);
            return jSONObject;
        }
        catch (Throwable throwable) {
            return jSONObject;
        }
    }

    public boolean a() {
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("UiElement{mClassName='");
        B(stringBuilder, this.a, '\'', ", mId='");
        B(stringBuilder, this.b, '\'', ", mParseFilterReason=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", mDepth=");
        stringBuilder.append(this.d);
        stringBuilder.append(", mListItem=");
        stringBuilder.append(this.e);
        stringBuilder.append(", mViewType=");
        stringBuilder.append((Object)this.f);
        stringBuilder.append(", mClassType=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a b;
        public static final /* enum */ a c;
        public static final /* enum */ a d;
        public static final /* enum */ a e;
        public static final /* enum */ a f;
        public static final /* enum */ a g;
        public static final /* enum */ a h;
        public static final /* enum */ a i;
        public static final /* enum */ a j;
        private static final a[] k;
        @NonNull
        private final String a;

        static {
            a a2;
            a a3;
            a a5;
            a a7;
            a a9;
            a a10;
            a a11;
            a a12;
            a a13;
            b = a13 = new a("LIST");
            c = a12 = new a("LABEL");
            d = a11 = new a("BUTTON");
            e = a10 = new a("CONTAINER");
            f = a9 = new a("TOOLBAR");
            g = a7 = new a("INPUT");
            h = a5 = new a("IMAGE");
            i = a3 = new a("WEBVIEW");
            j = a2 = new a("OTHER");
            k = new a[]{a13, a12, a11, a10, a9, a7, a5, a3, a2};
        }

        private a(String string2) {
            this.a = string2;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])k.clone();
        }
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        public static final /* enum */ b d;
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        private static final b[] h;
        @NonNull
        private final String a;

        static {
            b b2;
            b b3;
            b b4;
            b b5;
            b b6;
            b b7;
            b = b7 = new b("TEXT_TOO_LONG");
            c = b6 = new b("REGEXP_NOT_MATCHED");
            d = b5 = new b("IRRELEVANT_CLASS");
            e = b4 = new b("BAD_REGEXP_MATCHED");
            f = b3 = new b("EQUALS");
            g = b2 = new b("CONTAINS");
            h = new b[]{b7, b6, b5, b4, b3, b2};
        }

        private b(String string2) {
            this.a = string2;
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])h.clone();
        }
    }

    public static final class c
    extends Enum<c> {
        public static final /* enum */ c b;
        public static final /* enum */ c c;
        private static final c[] d;
        @NonNull
        private final String a;

        static {
            c c3;
            c c5;
            b = c5 = new c("VIEW_CONTAINER");
            c = c3 = new c("VIEW");
            d = new c[]{c5, c3};
        }

        private c(String string2) {
            this.a = string2;
        }

        public static c valueOf(String string) {
            return (c)Enum.valueOf(c.class, (String)string);
        }

        public static c[] values() {
            return (c[])d.clone();
        }
    }
}

