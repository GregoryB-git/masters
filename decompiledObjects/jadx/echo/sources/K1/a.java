package K1;

import V5.q;
import W5.F;
import android.util.Patterns;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f3149a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static Map f3150b;

    /* renamed from: c, reason: collision with root package name */
    public static Map f3151c;

    /* renamed from: d, reason: collision with root package name */
    public static Map f3152d;

    /* renamed from: e, reason: collision with root package name */
    public static JSONObject f3153e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f3154f;

    public static final float[] a(JSONObject viewHierarchy, String appName) {
        String lowerCase;
        JSONObject jSONObject;
        String screenName;
        JSONArray jSONArray;
        a aVar;
        JSONObject b7;
        if (T1.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            Intrinsics.checkNotNullParameter(appName, "appName");
            if (!f3154f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i7 = 0; i7 < 30; i7++) {
                fArr[i7] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new JSONObject(viewHierarchy.optJSONObject("view").toString());
                screenName = viewHierarchy.optString("screenname");
                jSONArray = new JSONArray();
                aVar = f3149a;
                aVar.j(jSONObject, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject));
                b7 = aVar.b(jSONObject);
            } catch (JSONException unused) {
            }
            if (b7 == null) {
                return null;
            }
            Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            String jSONObject2 = jSONObject.toString();
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            aVar.m(fArr, aVar.h(b7, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return null;
        }
    }

    public static final String c(String buttonText, String activityName, String appName) {
        if (T1.a.d(a.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            Intrinsics.checkNotNullParameter(appName, "appName");
            String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return null;
        }
    }

    public static final void d(File file) {
        Map f7;
        Map f8;
        Map f9;
        if (T1.a.d(a.class)) {
            return;
        }
        try {
            try {
                f3153e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f3153e = new JSONObject(new String(bArr, kotlin.text.b.f16240b));
                f7 = F.f(q.a("ENGLISH", "1"), q.a("GERMAN", "2"), q.a("SPANISH", "3"), q.a("JAPANESE", "4"));
                f3150b = f7;
                f8 = F.f(q.a("VIEW_CONTENT", "0"), q.a("SEARCH", "1"), q.a("ADD_TO_CART", "2"), q.a("ADD_TO_WISHLIST", "3"), q.a("INITIATE_CHECKOUT", "4"), q.a("ADD_PAYMENT_INFO", "5"), q.a("PURCHASE", "6"), q.a("LEAD", "7"), q.a("COMPLETE_REGISTRATION", "8"));
                f3151c = f8;
                f9 = F.f(q.a("BUTTON_TEXT", "1"), q.a("PAGE_TITLE", "2"), q.a("RESOLVED_DOCUMENT_LINK", "3"), q.a("BUTTON_ID", "4"));
                f3152d = f9;
                f3154f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, a.class);
        }
    }

    public static final boolean f() {
        if (T1.a.d(a.class)) {
            return false;
        }
        try {
            return f3154f;
        } catch (Throwable th) {
            T1.a.b(th, a.class);
            return false;
        }
    }

    public final JSONObject b(JSONObject jSONObject) {
        int length;
        if (T1.a.d(this)) {
            return null;
        }
        try {
        } catch (JSONException unused) {
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
        if (jSONObject.optBoolean("is_interacted")) {
            return jSONObject;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                Intrinsics.checkNotNullExpressionValue(jSONObject2, "children.getJSONObject(i)");
                JSONObject b7 = b(jSONObject2);
                if (b7 != null) {
                    return b7;
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
        }
        return null;
    }

    public final boolean e(JSONObject jSONObject) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return ((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean g(String[] strArr, String[] strArr2) {
        boolean v7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                int length2 = strArr2.length;
                int i8 = 0;
                while (i8 < length2) {
                    String str2 = strArr2[i8];
                    i8++;
                    v7 = s.v(str2, str, false, 2, null);
                    if (v7) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        boolean v7;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i7 = 0; i7 < 30; i7++) {
                fArr[i7] = 0.0f;
            }
            int length = jSONArray.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                if (length2 > 0) {
                    int i8 = 0;
                    while (true) {
                        int i9 = i8 + 1;
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "siblings.getJSONObject(i)");
                        if (e(jSONObject2)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i9 >= length2) {
                            break;
                        }
                        i8 = i9;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str4 = str + '|' + str3;
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            n(jSONObject, sb2, sb);
            String sb3 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "hintSB.toString()");
            String sb4 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "textSB.toString()");
            fArr[15] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[16] = l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[17] = l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb3) ? 1.0f : 0.0f;
            v7 = s.v(str2, "password", false, 2, null);
            fArr[18] = v7 ? 1.0f : 0.0f;
            fArr[19] = k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2) ? 1.0f : 0.0f;
            fArr[20] = k("(?i)(sign in)|login|signIn", str2) ? 1.0f : 0.0f;
            fArr[21] = k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2) ? 1.0f : 0.0f;
            fArr[22] = l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[24] = l("ENGLISH", "PURCHASE", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            fArr[25] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb4) ? 1.0f : 0.0f;
            fArr[27] = k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4) ? 1.0f : 0.0f;
            fArr[28] = l("ENGLISH", "LEAD", "BUTTON_TEXT", sb4) ? 1.0f : 0.0f;
            fArr[29] = l("ENGLISH", "LEAD", "PAGE_TITLE", str4) ? 1.0f : 0.0f;
            return fArr;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final float[] i(JSONObject jSONObject) {
        boolean v7;
        boolean v8;
        boolean v9;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i7 = 0;
            for (int i8 = 0; i8 < 30; i8++) {
                fArr[i8] = 0.0f;
            }
            String optString = jSONObject.optString("text");
            Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            v7 = s.v(lowerCase3, "checkbox", false, 2, null);
            if (v7) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            v8 = s.v(lowerCase3, "radio", false, 2, null);
            if (v8) {
                v9 = s.v(lowerCase3, "button", false, 2, null);
                if (v9) {
                    fArr[12] = fArr[12] + 1.0f;
                }
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i9 = i7 + 1;
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                        Intrinsics.checkNotNullExpressionValue(jSONObject2, "childViews.getJSONObject(i)");
                        m(fArr, i(jSONObject2));
                        if (i9 >= length) {
                            break;
                        }
                        i7 = i9;
                    }
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z7;
        if (T1.a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (optJSONArray.getJSONObject(i7).optBoolean("is_interacted")) {
                        z7 = true;
                        break;
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            z7 = false;
            boolean z8 = z7;
            JSONArray jSONArray2 = new JSONArray();
            if (z7) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i9 = 0;
                    while (true) {
                        int i10 = i9 + 1;
                        jSONArray.put(optJSONArray.getJSONObject(i9));
                        if (i10 >= length2) {
                            break;
                        }
                        i9 = i10;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i11 = 0;
                    while (true) {
                        int i12 = i11 + 1;
                        JSONObject child = optJSONArray.getJSONObject(i11);
                        Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (j(child, jSONArray)) {
                            jSONArray2.put(child);
                            z8 = true;
                        }
                        if (i12 >= length3) {
                            break;
                        }
                        i11 = i12;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z8;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    public final boolean k(String str, String str2) {
        if (T1.a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th) {
            T1.a.b(th, this);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0064, B:27:0x0069, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x006a, B:35:0x006f, B:36:0x0017, B:38:0x001b, B:39:0x0070, B:40:0x0075, B:41:0x0076, B:42:0x007b), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = T1.a.d(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.json.JSONObject r0 = K1.a.f3153e     // Catch: java.lang.Throwable -> L62
            r2 = 0
            if (r0 == 0) goto L76
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L17
            r5 = r2
            goto L25
        L17:
            java.util.Map r3 = K1.a.f3150b     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L70
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L62
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L62
        L25:
            if (r5 != 0) goto L29
        L27:
            r5 = r2
            goto L40
        L29:
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L32
            goto L27
        L32:
            java.util.Map r0 = K1.a.f3151c     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L6a
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L62
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L62
        L40:
            if (r5 != 0) goto L43
            goto L5a
        L43:
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != 0) goto L4c
            goto L5a
        L4c:
            java.util.Map r6 = K1.a.f3152d     // Catch: java.lang.Throwable -> L62
            if (r6 == 0) goto L64
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L62
            java.lang.String r2 = r5.optString(r6)     // Catch: java.lang.Throwable -> L62
        L5a:
            if (r2 != 0) goto L5d
            goto L61
        L5d:
            boolean r1 = r4.k(r2, r8)     // Catch: java.lang.Throwable -> L62
        L61:
            return r1
        L62:
            r5 = move-exception
            goto L7c
        L64:
            java.lang.String r5 = "textTypeInfo"
            kotlin.jvm.internal.Intrinsics.n(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L6a:
            java.lang.String r5 = "eventInfo"
            kotlin.jvm.internal.Intrinsics.n(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L70:
            java.lang.String r5 = "languageInfo"
            kotlin.jvm.internal.Intrinsics.n(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L76:
            java.lang.String r5 = "rules"
            kotlin.jvm.internal.Intrinsics.n(r5)     // Catch: java.lang.Throwable -> L62
            throw r2     // Catch: java.lang.Throwable -> L62
        L7c:
            T1.a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K1.a.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public final void m(float[] fArr, float[] fArr2) {
        if (T1.a.d(this)) {
            return;
        }
        try {
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                fArr[i7] = fArr[i7] + fArr2[i7];
                if (i8 > length) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }

    public final void n(JSONObject jSONObject, StringBuilder sb, StringBuilder sb2) {
        int length;
        if (T1.a.d(this)) {
            return;
        }
        try {
            String optString = jSONObject.optString("text", "");
            Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            String lowerCase = optString.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = optString2.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb.append(lowerCase);
                sb.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb2.append(lowerCase2);
                sb2.append(" ");
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                try {
                    JSONObject currentChildView = optJSONArray.getJSONObject(i7);
                    Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    n(currentChildView, sb, sb2);
                } catch (JSONException unused) {
                }
                if (i8 >= length) {
                    return;
                } else {
                    i7 = i8;
                }
            }
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
