package com.google.android.gms.internal.measurement;

import defpackage.g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzlr {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzlm zzlmVar, String str) {
        StringBuilder g10 = g.g("# ", str);
        zza(zzlmVar, g10, 0);
        return g10.toString();
    }

    private static void zza(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = zza;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0163, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a6, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ce, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zza(com.google.android.gms.internal.measurement.zzlm r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlr.zza(com.google.android.gms.internal.measurement.zzlm, java.lang.StringBuilder, int):void");
    }

    public static void zza(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        zza(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (Character.isUpperCase(charAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(charAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzmq.zza(zziy.zza((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zziy) {
            sb2.append(": \"");
            sb2.append(zzmq.zza((zziy) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzkg) {
            sb2.append(" {");
            zza((zzkg) obj, sb2, i10 + 2);
            sb2.append("\n");
            zza(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        zza(sb2, i12, Constants.KEY, entry.getKey());
        zza(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        zza(i10, sb2);
        sb2.append("}");
    }
}
