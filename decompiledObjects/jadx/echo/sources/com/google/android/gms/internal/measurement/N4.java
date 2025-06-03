package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class N4 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f10522a;

    static {
        char[] cArr = new char[80];
        f10522a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(I4 i42, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(i42, sb, 0);
        return sb.toString();
    }

    public static void b(int i7, StringBuilder sb) {
        while (i7 > 0) {
            char[] cArr = f10522a;
            int length = i7 > cArr.length ? cArr.length : i7;
            sb.append(cArr, 0, length);
            i7 -= length;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x020d, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.internal.measurement.Y3.s(r13, r19, new java.lang.Object[0])).booleanValue() != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0164, code lost:
    
        if (r5.containsKey("get" + r9.substring(0, r9.length() - 5)) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0193, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a1, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b3, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ca, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e0, code lost:
    
        if (r7.equals(r13) == false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.measurement.I4 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.N4.c(com.google.android.gms.internal.measurement.I4, java.lang.StringBuilder, int):void");
    }

    public static void d(StringBuilder sb, int i7, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i7, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i7, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        b(i7, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i8 = 1; i8 < str.length(); i8++) {
                char charAt = str.charAt(i8);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC1022s5.a(AbstractC1003q3.k((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1003q3) {
            sb.append(": \"");
            sb.append(AbstractC1022s5.a((AbstractC1003q3) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof Y3) {
            sb.append(" {");
            c((Y3) obj, sb, i7 + 2);
            sb.append("\n");
            b(i7, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i9 = i7 + 2;
        d(sb, i9, "key", entry.getKey());
        d(sb, i9, "value", entry.getValue());
        sb.append("\n");
        b(i7, sb);
        sb.append("}");
    }
}
