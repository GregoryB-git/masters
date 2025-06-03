/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.Iterator
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
public final class AFc1zSDK {
    @NotNull
    public static final AFa1xSDK AFInAppEventParameterName = new AFa1xSDK(0);
    @NotNull
    public final String AFInAppEventType;
    @NotNull
    public final String AFKeystoreWrapper;
    public int valueOf;
    @NotNull
    public final String values;

    public /* synthetic */ AFc1zSDK(String string2, String string3, String string4) {
        this(string2, string3, string4, 1);
    }

    public AFc1zSDK(@NotNull String string2, @NotNull String string3, @NotNull String string4, int n8) {
        Intrinsics.checkNotNullParameter(string2, "");
        Intrinsics.checkNotNullParameter(string3, "");
        Intrinsics.checkNotNullParameter(string4, "");
        this.AFInAppEventType = string2;
        this.AFKeystoreWrapper = string3;
        this.values = string4;
        this.valueOf = n8;
    }

    @NotNull
    public final JSONObject AFInAppEventParameterName() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("label", (Object)this.AFInAppEventType);
        jSONObject.put("hash_name", (Object)this.AFKeystoreWrapper);
        jSONObject.put("st", (Object)this.values);
        jSONObject.put("c", (Object)String.valueOf((int)this.valueOf));
        return jSONObject;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof AFc1zSDK)) {
            return false;
        }
        object = (AFc1zSDK)object;
        if (!Intrinsics.a(this.AFInAppEventType, object.AFInAppEventType)) {
            return false;
        }
        if (!Intrinsics.a(this.AFKeystoreWrapper, object.AFKeystoreWrapper)) {
            return false;
        }
        if (!Intrinsics.a(this.values, object.values)) {
            return false;
        }
        if (this.valueOf != object.valueOf) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.AFInAppEventType.hashCode() * 31 + this.AFKeystoreWrapper.hashCode()) * 31 + this.values.hashCode()) * 31 + this.valueOf;
    }

    @NotNull
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ExceptionInfo(label=");
        stringBuilder.append(this.AFInAppEventType);
        stringBuilder.append(", hashName=");
        stringBuilder.append(this.AFKeystoreWrapper);
        stringBuilder.append(", stackTrace=");
        stringBuilder.append(this.values);
        stringBuilder.append(", counter=");
        stringBuilder.append(this.valueOf);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    @Metadata
    public static final class AFa1xSDK {
        private AFa1xSDK() {
        }

        public /* synthetic */ AFa1xSDK(byte by) {
            this();
        }

        public static AFc1zSDK AFInAppEventParameterName(@NotNull String string2) {
            String string3;
            String string4;
            Intrinsics.checkNotNullParameter(string2, "");
            string2 = i.V(string2, new String[]{"\n"}, false, 0, 6, null);
            if (string2.size() != 4) {
                return null;
            }
            Iterator iterator = string2.iterator();
            String string5 = string3 = (string2 = (string4 = null));
            while (iterator.hasNext()) {
                String string6 = (String)iterator.next();
                if (i.s(string6, "label=", false, 2, null)) {
                    string4 = AFa1xSDK.values(string6, "label=");
                    continue;
                }
                if (i.s(string6, "hashName=", false, 2, null)) {
                    string2 = AFa1xSDK.values(string6, "hashName=");
                    continue;
                }
                if (i.s(string6, "stackTrace=", false, 2, null)) {
                    string3 = AFa1xSDK.values(string6, "stackTrace=");
                    continue;
                }
                if (!i.s(string6, "c=", false, 2, null)) break;
                string5 = string6.substring(2);
                Intrinsics.checkNotNullExpressionValue(string5, "");
                string5 = Integer.valueOf((int)Integer.parseInt((String)i.f0(string5).toString()));
            }
            if (AFa1xSDK.AFKeystoreWrapper((Integer)string5, string4, string2, string3)) {
                return null;
            }
            Intrinsics.b(string4);
            Intrinsics.b(string2);
            Intrinsics.b(string3);
            Intrinsics.b(string5);
            return new AFc1zSDK(string4, string2, string3, string5.intValue());
        }

        private static /* varargs */ boolean AFKeystoreWrapper(Integer object, String ... arrstring) {
            boolean bl = object == null;
            int n8 = arrstring.length;
            for (n8 = 0; n8 < 3; ++n8) {
                object = arrstring[n8];
                if (!bl && object != null && object.length() != 0) {
                    bl = false;
                    continue;
                }
                bl = true;
            }
            return bl;
        }

        private static String values(String string2, String arrby) {
            string2 = string2.substring(arrby.length());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            arrby = i.f0(string2).toString();
            Intrinsics.checkNotNullParameter(arrby, "");
            string2 = b.b;
            arrby = arrby.getBytes((Charset)string2);
            Intrinsics.checkNotNullExpressionValue(arrby, "");
            Intrinsics.checkNotNullParameter(arrby, "");
            arrby = Base64.decode((byte[])arrby, (int)2);
            Intrinsics.checkNotNullExpressionValue(arrby, "");
            return new String(arrby, (Charset)string2);
        }
    }

}

