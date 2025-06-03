package s0;

import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s0.g;

/* loaded from: classes.dex */
public final class q0 {
    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static final void b(StringBuilder sb2, int i10, String str, Object obj) {
        String obj2;
        String q10;
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
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            g.e eVar = g.f13982b;
            q10 = b.a0.q(new g.e(((String) obj).getBytes(x.f14119a)));
        } else {
            if (!(obj instanceof g)) {
                if (obj instanceof v) {
                    sb2.append(" {");
                    c((v) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb2.append(": ");
                        obj2 = obj.toString();
                        sb2.append(obj2);
                        return;
                    }
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    b(sb2, i13, Constants.KEY, entry.getKey());
                    b(sb2, i13, "value", entry.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                }
                obj2 = "}";
                sb2.append(obj2);
                return;
            }
            sb2.append(": \"");
            q10 = b.a0.q((g) obj);
        }
        sb2.append(q10);
        sb2.append('\"');
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cd, code lost:
    
        if (((java.lang.Integer) r11).intValue() == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021e, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01de, code lost:
    
        if (((java.lang.Float) r11).floatValue() == 0.0f) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01f0, code lost:
    
        if (((java.lang.Double) r11).doubleValue() == 0.0d) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(s0.o0 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.q0.c(s0.o0, java.lang.StringBuilder, int):void");
    }
}
