package com.appsflyer.internal;

import android.util.Base64;
import java.net.HttpURLConnection;
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
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* loaded from: classes.dex */
public interface AFc1uSDK {

    @Metadata
    public static final class AFa1wSDK {
        public final Boolean AFInAppEventType;
        public final String valueOf;
        public Boolean values;

        public AFa1wSDK() {
        }

        public AFa1wSDK(String str, Boolean bool) {
            this.valueOf = str;
            this.AFInAppEventType = bool;
        }

        @NotNull
        public static String AFInAppEventParameterName(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = str.getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "");
            String str2 = "";
            for (byte b7 : digest) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b7)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                sb.append(format);
                str2 = sb.toString();
            }
            return str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            r2 = kotlin.text.q.f(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        
            r4 = kotlin.text.q.f(r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        
            r0 = kotlin.text.q.f(r0);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int AFKeystoreWrapper(java.lang.String r4) {
            /*
                java.lang.String r0 = ""
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "(\\d+).?(\\d+)?.?(\\d+)?(-rc\\d+)?(_.*)?"
                r0.<init>(r1)
                kotlin.text.f r4 = r0.a(r4)
                if (r4 == 0) goto L71
                kotlin.text.e r0 = r4.a()
                r1 = 1
                kotlin.text.d r0 = r0.get(r1)
                r1 = 0
                if (r0 == 0) goto L2f
                java.lang.String r0 = r0.a()
                if (r0 == 0) goto L2f
                java.lang.Integer r0 = kotlin.text.i.f(r0)
                if (r0 == 0) goto L2f
                int r0 = r0.intValue()
                goto L30
            L2f:
                r0 = r1
            L30:
                r2 = 1000000(0xf4240, float:1.401298E-39)
                int r0 = r0 * r2
                kotlin.text.e r2 = r4.a()
                r3 = 2
                kotlin.text.d r2 = r2.get(r3)
                if (r2 == 0) goto L50
                java.lang.String r2 = r2.a()
                if (r2 == 0) goto L50
                java.lang.Integer r2 = kotlin.text.i.f(r2)
                if (r2 == 0) goto L50
                int r2 = r2.intValue()
                goto L51
            L50:
                r2 = r1
            L51:
                int r2 = r2 * 1000
                int r0 = r0 + r2
                kotlin.text.e r4 = r4.a()
                r2 = 3
                kotlin.text.d r4 = r4.get(r2)
                if (r4 == 0) goto L6f
                java.lang.String r4 = r4.a()
                if (r4 == 0) goto L6f
                java.lang.Integer r4 = kotlin.text.i.f(r4)
                if (r4 == 0) goto L6f
                int r1 = r4.intValue()
            L6f:
                int r0 = r0 + r1
                return r0
            L71:
                r4 = -1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1uSDK.AFa1wSDK.AFKeystoreWrapper(java.lang.String):int");
        }

        @NotNull
        public static String valueOf(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            byte[] bytes = str.getBytes(kotlin.text.b.f16240b);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            String encodeToString = Base64.encodeToString(bytes, 2);
            Intrinsics.checkNotNullExpressionValue(encodeToString, "");
            return encodeToString;
        }

        public static double values(String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                return Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                Number parse = NumberFormat.getInstance(Locale.getDefault()).parse(str);
                if (parse != null) {
                    return parse.doubleValue();
                }
                throw new ParseException("Failed parse String into number", 0);
            }
        }

        @NotNull
        public static JSONArray values(List<AFc1zSDK> list) {
            int l7;
            Intrinsics.checkNotNullParameter(list, "");
            List<AFc1zSDK> list2 = list;
            l7 = W5.p.l(list2, 10);
            ArrayList arrayList = new ArrayList(l7);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((AFc1zSDK) it.next()).AFInAppEventParameterName());
            }
            return new JSONArray((Collection) arrayList);
        }

        public static boolean values(HttpURLConnection httpURLConnection) {
            Intrinsics.checkNotNullParameter(httpURLConnection, "");
            return httpURLConnection.getResponseCode() / 100 == 2;
        }
    }

    void valueOf(@NotNull byte[] bArr, Map<String, String> map, int i7);
}
