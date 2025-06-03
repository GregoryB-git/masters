package ma;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ma.h;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11094a;

    static {
        char[] cArr = new char[80];
        f11094a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f11094a;
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(cArr, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        String i11;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char charAt = str.charAt(i12);
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
            h.C0164h c0164h = h.f10961b;
            i11 = b.z.i(new h.C0164h(((String) obj).getBytes(a0.f10909a)));
        } else {
            if (!(obj instanceof h)) {
                if (obj instanceof w) {
                    sb2.append(" {");
                    c((w) obj, sb2, i10 + 2);
                } else if (!(obj instanceof Map.Entry)) {
                    sb2.append(": ");
                    sb2.append(obj);
                    return;
                } else {
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    b(sb2, i13, Constants.KEY, entry.getKey());
                    b(sb2, i13, "value", entry.getValue());
                }
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            i11 = b.z.i((h) obj);
        }
        sb2.append(i11);
        sb2.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a9, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0201, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bb, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d1, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(ma.s0 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ma.u0.c(ma.s0, java.lang.StringBuilder, int):void");
    }
}
