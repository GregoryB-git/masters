/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Iterable
 *  java.lang.Number
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.HttpURLConnection
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.text.NumberFormat
 *  java.text.ParseException
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.appsflyer.internal;

import W5.m;
import android.util.Base64;
import com.appsflyer.internal.AFc1zSDK;
import java.net.HttpURLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.b;
import kotlin.text.d;
import kotlin.text.e;
import kotlin.text.f;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
public interface AFc1uSDK {
    public void valueOf(@NotNull byte[] var1, Map<String, String> var2, int var3);

    @Metadata
    public static final class AFa1wSDK {
        public final Boolean AFInAppEventType;
        public final String valueOf;
        public Boolean values;

        public AFa1wSDK() {
        }

        public AFa1wSDK(String string2, Boolean bl) {
            this.valueOf = string2;
            this.AFInAppEventType = bl;
        }

        @NotNull
        public static String AFInAppEventParameterName(String object) {
            Intrinsics.checkNotNullParameter(object, "");
            byte[] arrby = MessageDigest.getInstance((String)"SHA-256");
            object = object.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(object, "");
            arrby = arrby.digest((byte[])object);
            Intrinsics.checkNotNullExpressionValue(arrby, "");
            int n8 = arrby.length;
            object = "";
            for (int i8 = 0; i8 < n8; ++i8) {
                byte by = arrby[i8];
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                object = String.format((String)"%02x", (Object[])Arrays.copyOf((Object[])new Object[]{by}, (int)1));
                Intrinsics.checkNotNullExpressionValue(object, "");
                stringBuilder.append((String)object);
                object = stringBuilder.toString();
            }
            return object;
        }

        public static int AFKeystoreWrapper(String object) {
            Intrinsics.checkNotNullParameter(object, "");
            object = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").a((CharSequence)object);
            if (object != null) {
                Object object2 = object.a().get(1);
                int n8 = 0;
                int n9 = object2 != null && (object2 = object2.a()) != null && (object2 = i.f((String)object2)) != null ? object2.intValue() : 0;
                object2 = object.a().get(2);
                int n10 = object2 != null && (object2 = object2.a()) != null && (object2 = i.f((String)object2)) != null ? object2.intValue() : 0;
                object = object.a().get(3);
                int n11 = n8;
                if (object != null) {
                    object = object.a();
                    n11 = n8;
                    if (object != null) {
                        object = i.f((String)object);
                        n11 = n8;
                        if (object != null) {
                            n11 = object.intValue();
                        }
                    }
                }
                return n9 * 1000000 + n10 * 1000 + n11;
            }
            return -1;
        }

        @NotNull
        public static String valueOf(String object) {
            Intrinsics.checkNotNullParameter(object, "");
            object = object.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(object, "");
            object = Base64.encodeToString((byte[])object, (int)2);
            Intrinsics.checkNotNullExpressionValue(object, "");
            return object;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static double values(String string2) {
            Intrinsics.checkNotNullParameter(string2, "");
            try {
                return Double.parseDouble((String)string2);
            }
            catch (NumberFormatException numberFormatException) {}
            string2 = NumberFormat.getInstance((Locale)Locale.getDefault()).parse(string2);
            if (string2 == null) throw new ParseException("Failed parse String into number", 0);
            return string2.doubleValue();
        }

        @NotNull
        public static JSONArray values(List<AFc1zSDK> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Iterable iterable = (Iterable)arrayList;
            arrayList = new ArrayList(m.l(iterable, 10));
            iterable = iterable.iterator();
            while (iterable.hasNext()) {
                arrayList.add((Object)((AFc1zSDK)iterable.next()).AFInAppEventParameterName());
            }
            return new JSONArray((Collection)arrayList);
        }

        public static boolean values(HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter((Object)httpURLConnection, "");
            if (httpURLConnection.getResponseCode() / 100 == 2) {
                return true;
            }
            return false;
        }
    }

}

