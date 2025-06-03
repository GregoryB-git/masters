// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Collection;
import org.json.JSONObject;
import java.util.ArrayList;
import W5.m;
import org.json.JSONArray;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.ParseException;
import android.util.Base64;
import kotlin.text.d;
import kotlin.text.f;
import kotlin.text.i;
import kotlin.text.Regex;
import java.util.Arrays;
import kotlin.text.b;
import java.security.MessageDigest;
import kotlin.jvm.internal.Intrinsics;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import kotlin.Metadata;

@Metadata
public interface AFc1uSDK
{
    void valueOf(@NotNull final byte[] p0, final Map<String, String> p1, final int p2);
    
    @Metadata
    public static final class AFa1wSDK
    {
        public final Boolean AFInAppEventType;
        public final String valueOf;
        public Boolean values;
        
        public AFa1wSDK() {
        }
        
        public AFa1wSDK(final String valueOf, final Boolean afInAppEventType) {
            this.valueOf = valueOf;
            this.AFInAppEventType = afInAppEventType;
        }
        
        @NotNull
        public static String AFInAppEventParameterName(String s) {
            Intrinsics.checkNotNullParameter(s, "");
            final MessageDigest instance = MessageDigest.getInstance("SHA-256");
            final byte[] bytes = s.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            final byte[] digest = instance.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "");
            final int length = digest.length;
            s = "";
            for (int i = 0; i < length; ++i) {
                final byte b = digest[i];
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                s = String.format("%02x", Arrays.copyOf(new Object[] { b }, 1));
                Intrinsics.checkNotNullExpressionValue(s, "");
                sb.append(s);
                s = sb.toString();
            }
            return s;
        }
        
        public static int AFKeystoreWrapper(String a) {
            Intrinsics.checkNotNullParameter(a, "");
            final f a2 = new Regex("(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?").a(a);
            if (a2 != null) {
                final d value = a2.a().get(1);
                final boolean b = false;
                int intValue = 0;
                Label_0081: {
                    if (value != null) {
                        final String a3 = value.a();
                        if (a3 != null) {
                            final Integer f = i.f(a3);
                            if (f != null) {
                                intValue = f.intValue();
                                break Label_0081;
                            }
                        }
                    }
                    intValue = 0;
                }
                final d value2 = a2.a().get(2);
                int intValue2 = 0;
                Label_0135: {
                    if (value2 != null) {
                        final String a4 = value2.a();
                        if (a4 != null) {
                            final Integer f2 = i.f(a4);
                            if (f2 != null) {
                                intValue2 = f2.intValue();
                                break Label_0135;
                            }
                        }
                    }
                    intValue2 = 0;
                }
                final d value3 = a2.a().get(3);
                int intValue3 = b ? 1 : 0;
                if (value3 != null) {
                    a = value3.a();
                    intValue3 = (b ? 1 : 0);
                    if (a != null) {
                        final Integer f3 = i.f(a);
                        intValue3 = (b ? 1 : 0);
                        if (f3 != null) {
                            intValue3 = f3.intValue();
                        }
                    }
                }
                return intValue * 1000000 + intValue2 * 1000 + intValue3;
            }
            return -1;
        }
        
        @NotNull
        public static String valueOf(String encodeToString) {
            Intrinsics.checkNotNullParameter(encodeToString, "");
            final byte[] bytes = encodeToString.getBytes(b.b);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return encodeToString;
        }
        
        public static double values(String parse) {
            Intrinsics.checkNotNullParameter(parse, "");
            while (true) {
                try {
                    return Double.parseDouble(parse);
                    Label_0033: {
                        throw new ParseException("Failed parse String into number", 0);
                    }
                    parse = (String)NumberFormat.getInstance(Locale.getDefault()).parse(parse);
                    // iftrue(Label_0033:, parse == null)
                    return ((Number)parse).doubleValue();
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                break;
            }
        }
        
        @NotNull
        public static JSONArray values(final List<AFc1zSDK> list) {
            Intrinsics.checkNotNullParameter(list, "");
            final List<AFc1zSDK> list2 = list;
            final ArrayList list3 = new ArrayList<JSONObject>(m.l(list2, 10));
            final Iterator<Object> iterator = list2.iterator();
            while (iterator.hasNext()) {
                list3.add(iterator.next().AFInAppEventParameterName());
            }
            return new JSONArray((Collection)list3);
        }
        
        public static boolean values(final HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }
    }
}
