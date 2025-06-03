package F1;

import O1.C0458v;
import O1.r;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.C2146B;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f1965b;

    /* renamed from: c, reason: collision with root package name */
    public static JSONArray f1966c;

    /* renamed from: a, reason: collision with root package name */
    public static final b f1964a = new b();

    /* renamed from: d, reason: collision with root package name */
    public static String[] f1967d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    public static final void a() {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            f1964a.g();
            if (f1966c != null) {
                f1965b = true;
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:6:0x000d, B:10:0x0032, B:13:0x0049, B:16:0x005c, B:19:0x0072, B:22:0x0088, B:26:0x0042, B:29:0x002b), top: B:5:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(android.os.Bundle r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "ANDROID"
            java.lang.String r1 = "event"
            java.lang.Class<F1.b> r2 = F1.b.class
            boolean r3 = T1.a.d(r2)
            if (r3 == 0) goto Ld
            return
        Ld:
            java.lang.String r3 = "params"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r3)     // Catch: java.lang.Throwable -> Lb3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r1, r7)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_locale"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            O1.P r3 = O1.P.f3756a     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.I()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r5 = ""
            if (r4 != 0) goto L2b
        L29:
            r4 = r5
            goto L32
        L2b:
            java.lang.String r4 = r4.getLanguage()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L32
            goto L29
        L32:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            r4 = 95
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.util.Locale r4 = r3.I()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L42
        L40:
            r4 = r5
            goto L49
        L42:
            java.lang.String r4 = r4.getCountry()     // Catch: java.lang.Throwable -> Lb3
            if (r4 != 0) goto L49
            goto L40
        L49:
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_appVersion"
            java.lang.String r1 = r3.P()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L5c
            r1 = r5
        L5c:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOS"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_platform"
            java.lang.String r1 = "mobile"
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceModel"
            java.lang.String r1 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L72
            r1 = r5
        L72:
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppID"
            java.lang.String r1 = x1.C2146B.m()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_nativeAppShortVersion"
            java.lang.String r1 = r3.P()     // Catch: java.lang.Throwable -> Lb3
            if (r1 != 0) goto L87
            goto L88
        L87:
            r5 = r1
        L88:
            r6.putString(r7, r5)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_timezone"
            java.lang.String r1 = r3.D()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_carrier"
            java.lang.String r1 = r3.y()     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r1)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSTypeName"
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_deviceOSVersion"
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Lb3
            r6.putString(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r7 = "_remainingDiskGB"
            long r0 = r3.w()     // Catch: java.lang.Throwable -> Lb3
            r6.putLong(r7, r0)     // Catch: java.lang.Throwable -> Lb3
            return
        Lb3:
            r6 = move-exception
            T1.a.b(r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.b.b(android.os.Bundle, java.lang.String):void");
    }

    public static final String c(JSONObject logic) {
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(logic, "logic");
            Iterator<String> keys = logic.keys();
            if (keys.hasNext()) {
                return keys.next();
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final String d(Bundle bundle) {
        String optString;
        if (T1.a.d(b.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f1966c;
            if (jSONArray == null) {
                return "[]";
            }
            Integer valueOf = jSONArray == null ? null : Integer.valueOf(jSONArray.length());
            if (valueOf != null && valueOf.intValue() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f1966c;
            if (jSONArray2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    String optString2 = jSONArray2.optString(i7);
                    if (optString2 != null) {
                        JSONObject jSONObject = new JSONObject(optString2);
                        long optLong = jSONObject.optLong("id");
                        if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && f(optString, bundle)) {
                            arrayList.add(Long.valueOf(optLong));
                        }
                    }
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final ArrayList e(JSONArray jSONArray) {
        if (T1.a.d(b.class) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    arrayList.add(jSONArray.get(i7).toString());
                    if (i8 >= length) {
                        break;
                    }
                    i7 = i8;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            T1.a.b(th, b.class);
            return null;
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        int length;
        if (!T1.a.d(b.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String c7 = c(jSONObject);
                if (c7 == null) {
                    return false;
                }
                Object obj = jSONObject.get(c7);
                int hashCode = c7.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && c7.equals("not")) {
                            return !f(obj.toString(), bundle);
                        }
                    } else if (c7.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length2 = jSONArray.length();
                        if (length2 > 0) {
                            int i7 = 0;
                            while (true) {
                                int i8 = i7 + 1;
                                if (!f(jSONArray.get(i7).toString(), bundle)) {
                                    return false;
                                }
                                if (i8 >= length2) {
                                    break;
                                }
                                i7 = i8;
                            }
                        }
                        return true;
                    }
                } else if (c7.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 != null && (length = jSONArray2.length()) > 0) {
                        int i9 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            if (f(jSONArray2.get(i9).toString(), bundle)) {
                                return true;
                            }
                            if (i10 >= length) {
                                break;
                            }
                            i9 = i10;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(c7, jSONObject2, bundle);
            } catch (Throwable th) {
                T1.a.b(th, b.class);
            }
        }
        return false;
    }

    public static final void h(Bundle bundle, String event) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(event, "event");
            if (!f1965b || bundle == null) {
                return;
            }
            try {
                b(bundle, event);
                bundle.putString("_audiencePropertyIds", d(bundle));
                bundle.putString("cs_maca", "1");
                i(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    public static final void i(Bundle params) {
        if (T1.a.d(b.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(params, "params");
            String[] strArr = f1967d;
            int length = strArr.length;
            int i7 = 0;
            while (i7 < length) {
                String str = strArr[i7];
                i7++;
                params.remove(str);
            }
        } catch (Throwable th) {
            T1.a.b(th, b.class);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0292, B:75:0x0297, B:77:0x0298, B:78:0x029d, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02ab, B:104:0x02b3, B:105:0x02b7, B:107:0x02bd, B:109:0x02c5, B:111:0x02d4, B:117:0x02e3, B:118:0x02e8, B:120:0x02e9, B:121:0x02ee, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:185:0x037d, B:187:0x018a, B:191:0x020a, B:195:0x0194, B:199:0x019e, B:203:0x0226, B:205:0x01a8, B:209:0x01c4, B:213:0x01ce, B:217:0x01ea, B:221:0x0200, B:225:0x021c, B:229:0x0230, B:233:0x024c, B:237:0x029e, B:241:0x02ef, B:245:0x02f9, B:247:0x02ff, B:249:0x030a, B:253:0x0319, B:254:0x031e, B:255:0x031f, B:256:0x0324, B:257:0x0325, B:261:0x032f, B:263:0x0339, B:269:0x0379, B:270:0x0343, B:274:0x034d, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0393, B:294:0x039c, B:296:0x03a2, B:298:0x03ad, B:302:0x03bd, B:303:0x03c2, B:304:0x03c3, B:305:0x03c8, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x038e A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0292, B:75:0x0297, B:77:0x0298, B:78:0x029d, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02ab, B:104:0x02b3, B:105:0x02b7, B:107:0x02bd, B:109:0x02c5, B:111:0x02d4, B:117:0x02e3, B:118:0x02e8, B:120:0x02e9, B:121:0x02ee, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:185:0x037d, B:187:0x018a, B:191:0x020a, B:195:0x0194, B:199:0x019e, B:203:0x0226, B:205:0x01a8, B:209:0x01c4, B:213:0x01ce, B:217:0x01ea, B:221:0x0200, B:225:0x021c, B:229:0x0230, B:233:0x024c, B:237:0x029e, B:241:0x02ef, B:245:0x02f9, B:247:0x02ff, B:249:0x030a, B:253:0x0319, B:254:0x031e, B:255:0x031f, B:256:0x0324, B:257:0x0325, B:261:0x032f, B:263:0x0339, B:269:0x0379, B:270:0x0343, B:274:0x034d, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0393, B:294:0x039c, B:296:0x03a2, B:298:0x03ad, B:302:0x03bd, B:303:0x03c2, B:304:0x03c3, B:305:0x03c8, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0378 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0379 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0292, B:75:0x0297, B:77:0x0298, B:78:0x029d, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02ab, B:104:0x02b3, B:105:0x02b7, B:107:0x02bd, B:109:0x02c5, B:111:0x02d4, B:117:0x02e3, B:118:0x02e8, B:120:0x02e9, B:121:0x02ee, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:185:0x037d, B:187:0x018a, B:191:0x020a, B:195:0x0194, B:199:0x019e, B:203:0x0226, B:205:0x01a8, B:209:0x01c4, B:213:0x01ce, B:217:0x01ea, B:221:0x0200, B:225:0x021c, B:229:0x0230, B:233:0x024c, B:237:0x029e, B:241:0x02ef, B:245:0x02f9, B:247:0x02ff, B:249:0x030a, B:253:0x0319, B:254:0x031e, B:255:0x031f, B:256:0x0324, B:257:0x0325, B:261:0x032f, B:263:0x0339, B:269:0x0379, B:270:0x0343, B:274:0x034d, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0393, B:294:0x039c, B:296:0x03a2, B:298:0x03ad, B:302:0x03bd, B:303:0x03c2, B:304:0x03c3, B:305:0x03c8, B:307:0x0055), top: B:5:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0258 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0259 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x000a, B:9:0x001b, B:13:0x003f, B:15:0x0037, B:24:0x0068, B:25:0x0070, B:28:0x007d, B:32:0x0087, B:34:0x008d, B:36:0x0098, B:38:0x00a5, B:39:0x00aa, B:40:0x00ab, B:41:0x00b0, B:42:0x00b1, B:46:0x00bb, B:51:0x00c8, B:57:0x0259, B:60:0x0261, B:61:0x0265, B:63:0x026b, B:65:0x0273, B:67:0x0282, B:74:0x0292, B:75:0x0297, B:77:0x0298, B:78:0x029d, B:80:0x00d2, B:84:0x00dc, B:86:0x00e2, B:88:0x00ed, B:90:0x00fa, B:91:0x00ff, B:92:0x0100, B:93:0x0105, B:94:0x0106, B:100:0x02ab, B:104:0x02b3, B:105:0x02b7, B:107:0x02bd, B:109:0x02c5, B:111:0x02d4, B:117:0x02e3, B:118:0x02e8, B:120:0x02e9, B:121:0x02ee, B:124:0x0110, B:128:0x011a, B:130:0x0120, B:132:0x012b, B:134:0x0138, B:135:0x013d, B:136:0x013e, B:137:0x0143, B:138:0x0144, B:142:0x01f4, B:146:0x014e, B:150:0x01d8, B:154:0x0158, B:158:0x01b2, B:162:0x0162, B:166:0x016c, B:170:0x023a, B:174:0x0176, B:178:0x0180, B:184:0x038e, B:185:0x037d, B:187:0x018a, B:191:0x020a, B:195:0x0194, B:199:0x019e, B:203:0x0226, B:205:0x01a8, B:209:0x01c4, B:213:0x01ce, B:217:0x01ea, B:221:0x0200, B:225:0x021c, B:229:0x0230, B:233:0x024c, B:237:0x029e, B:241:0x02ef, B:245:0x02f9, B:247:0x02ff, B:249:0x030a, B:253:0x0319, B:254:0x031e, B:255:0x031f, B:256:0x0324, B:257:0x0325, B:261:0x032f, B:263:0x0339, B:269:0x0379, B:270:0x0343, B:274:0x034d, B:276:0x035b, B:280:0x0364, B:282:0x036d, B:286:0x0382, B:290:0x0393, B:294:0x039c, B:296:0x03a2, B:298:0x03ad, B:302:0x03bd, B:303:0x03c2, B:304:0x03c3, B:305:0x03c8, B:307:0x0055), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean j(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: F1.b.j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }

    public final void g() {
        if (T1.a.d(this)) {
            return;
        }
        try {
            C0458v c0458v = C0458v.f3949a;
            r q7 = C0458v.q(C2146B.m(), false);
            if (q7 == null) {
                return;
            }
            f1966c = q7.f();
        } catch (Throwable th) {
            T1.a.b(th, this);
        }
    }
}
