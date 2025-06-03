/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.io.Serializable
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.UUID
 *  org.json.JSONObject
 */
package y1;

import G1.g;
import O1.C;
import O1.P;
import V5.t;
import android.os.Bundle;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONObject;
import x1.N;
import x1.o;

public final class e
implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final a t = new a(null);
    public static final HashSet u = new HashSet();
    public final JSONObject o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;

    public e(String string2, String string3, Double d8, Bundle bundle, boolean bl, boolean bl2, UUID uUID) {
        Intrinsics.checkNotNullParameter(string2, "contextName");
        Intrinsics.checkNotNullParameter(string3, "eventName");
        this.p = bl;
        this.q = bl2;
        this.r = string3;
        this.o = this.d(string2, string3, d8, bundle, uUID);
        this.s = this.b();
    }

    public e(String string2, boolean bl, boolean bl2, String string3) {
        string2 = new JSONObject(string2);
        this.o = string2;
        this.p = bl;
        string2 = string2.optString("_eventName");
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.r = string2;
        this.s = string3;
        this.q = bl2;
    }

    public /* synthetic */ e(String string2, boolean bl, boolean bl2, String string3, kotlin.jvm.internal.g g8) {
        this(string2, bl, bl2, string3);
    }

    private final Object writeReplace() {
        String string2 = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        return new b(string2, this.p, this.q, this.s);
    }

    public final String b() {
        a a8 = t;
        String string2 = this.o.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "jsonObject.toString()");
        return a8.c(string2);
    }

    public final boolean c() {
        return this.p;
    }

    public final JSONObject d(String object, String object2, Double object3, Bundle object42, UUID uUID) {
        a a8 = t;
        a8.d((String)object2);
        JSONObject jSONObject = new JSONObject();
        object2 = J1.a.e((String)object2);
        jSONObject.put("_eventName", object2);
        jSONObject.put("_eventName_md5", (Object)a8.c((String)object2));
        jSONObject.put("_logTime", System.currentTimeMillis() / (long)1000);
        jSONObject.put("_ui", object);
        if (uUID != null) {
            jSONObject.put("_session_id", (Object)uUID);
        }
        if (object42 != null) {
            object = this.i((Bundle)object42);
            for (Object object42 : object.keySet()) {
                jSONObject.put((String)object42, object.get(object42));
            }
        }
        if (object3 != null) {
            jSONObject.put("_valueToSum", object3.doubleValue());
        }
        if (this.q) {
            jSONObject.put("_inBackground", (Object)"1");
        }
        if (this.p) {
            jSONObject.put("_implicitlyLogged", (Object)"1");
            return jSONObject;
        }
        object = C.e;
        object2 = N.s;
        object3 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(object3, "eventObject.toString()");
        object.c((N)((Object)object2), "AppEvents", "Created app event '%s'", object3);
        return jSONObject;
    }

    public final JSONObject e() {
        return this.o;
    }

    public final String f() {
        return this.r;
    }

    public final boolean g() {
        if (this.s == null) {
            return true;
        }
        return Intrinsics.a(this.b(), this.s);
    }

    public final boolean h() {
        return this.p;
    }

    public final Map i(Bundle object) {
        HashMap hashMap = new HashMap();
        for (String string2 : object.keySet()) {
            Object object2 = t;
            Intrinsics.checkNotNullExpressionValue(string2, "key");
            ((a)object2).d(string2);
            object2 = object.get(string2);
            if (!(object2 instanceof String) && !(object2 instanceof Number)) {
                object = x.a;
                object = String.format((String)"Parameter value '%s' for key '%s' should be a string or a numeric type.", (Object[])Arrays.copyOf((Object[])new Object[]{object2, string2}, (int)2));
                Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
                throw new o((String)object);
            }
            hashMap.put((Object)string2, (Object)object2.toString());
        }
        F1.a.c((Map)hashMap);
        object = J1.a.a;
        J1.a.f((Map)hashMap, this.r);
        object = D1.a.a;
        D1.a.c((Map)hashMap, this.r);
        return hashMap;
    }

    public String toString() {
        Object object = x.a;
        object = String.format((String)"\"%s\", implicit: %b, json: %s", (Object[])Arrays.copyOf((Object[])new Object[]{this.o.optString("_eventName"), this.p, this.o.toString()}, (int)3));
        Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g g8) {
            this();
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final String c(String arrby) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
                Charset charset = Charset.forName((String)"UTF-8");
                Intrinsics.checkNotNullExpressionValue((Object)charset, "Charset.forName(charsetName)");
                if (arrby == null) throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                arrby = arrby.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(arrby, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(arrby, 0, arrby.length);
                arrby = messageDigest.digest();
                Intrinsics.checkNotNullExpressionValue(arrby, "digest.digest()");
                return g.c(arrby);
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {}
            P.i0("Failed to generate checksum: ", (Exception)unsupportedEncodingException);
            return "1";
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            P.i0("Failed to generate checksum: ", (Exception)noSuchAlgorithmException);
            return "0";
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Converted monitor instructions to comments
         * Lifted jumps to return sites
         */
        public final void d(String object) {
            if (object != null && object.length() != 0 && object.length() <= 40) {
                Object object2 = u;
                // MONITORENTER : object2
                boolean bl = u.contains(object);
                t t8 = t.a;
                // MONITOREXIT : object2
                if (bl) return;
                if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").b((CharSequence)object)) {
                    object2 = u;
                    // MONITORENTER : object2
                    u.add(object);
                    // MONITOREXIT : object2
                    return;
                }
                object2 = x.a;
                object = String.format((String)"Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", (Object[])Arrays.copyOf((Object[])new Object[]{object}, (int)1));
                Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(format, *args)");
                throw new o((String)object);
            }
            Object object3 = object;
            if (object == null) {
                object3 = "<None Provided>";
            }
            object = x.a;
            object = String.format((Locale)Locale.ROOT, (String)"Identifier '%s' must be less than %d characters", (Object[])Arrays.copyOf((Object[])new Object[]{object3, 40}, (int)2));
            Intrinsics.checkNotNullExpressionValue(object, "java.lang.String.format(locale, format, *args)");
            throw new o((String)object);
        }
    }

    public static final class b
    implements Serializable {
        public static final a s = new a(null);
        private static final long serialVersionUID = 20160803001L;
        public final String o;
        public final boolean p;
        public final boolean q;
        public final String r;

        public b(String string2, boolean bl, boolean bl2, String string3) {
            Intrinsics.checkNotNullParameter(string2, "jsonString");
            this.o = string2;
            this.p = bl;
            this.q = bl2;
            this.r = string3;
        }

        private final Object readResolve() {
            return new e(this.o, this.p, this.q, this.r, null);
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(kotlin.jvm.internal.g g8) {
                this();
            }
        }

    }

}

