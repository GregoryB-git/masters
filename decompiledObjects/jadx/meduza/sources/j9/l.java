package j9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends e<l> {

    /* renamed from: b, reason: collision with root package name */
    public static final l f8691b = new l(Collections.singletonList("__name__"));

    /* renamed from: c, reason: collision with root package name */
    public static final l f8692c = new l(Collections.emptyList());

    public l(List<String> list) {
        super(list);
    }

    public static l t(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        boolean z10 = false;
        while (i10 < str.length()) {
            char charAt = str.charAt(i10);
            if (charAt == '\\') {
                i10++;
                if (i10 == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                charAt = str.charAt(i10);
            } else if (charAt == '.') {
                if (!z10) {
                    String sb3 = sb2.toString();
                    if (sb3.isEmpty()) {
                        throw new IllegalArgumentException(defpackage.g.e("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
                    }
                    StringBuilder sb4 = new StringBuilder();
                    arrayList.add(sb3);
                    sb2 = sb4;
                    i10++;
                }
            } else if (charAt == '`') {
                z10 = !z10;
                i10++;
            }
            sb2.append(charAt);
            i10++;
        }
        String sb5 = sb2.toString();
        if (sb5.isEmpty()) {
            throw new IllegalArgumentException(defpackage.g.e("Invalid field path (", str, "). Paths must not be empty, begin with '.', end with '.', or contain '..'"));
        }
        arrayList.add(sb5);
        return new l(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087 A[SYNTHETIC] */
    @Override // j9.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h() {
        /*
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            java.util.List<java.lang.String> r3 = r13.f8677a
            int r3 = r3.size()
            if (r2 >= r3) goto L8e
            if (r2 <= 0) goto L16
            java.lang.String r3 = "."
            r0.append(r3)
        L16:
            java.util.List<java.lang.String> r3 = r13.f8677a
            java.lang.Object r3 = r3.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "\\"
            java.lang.String r5 = "\\\\"
            java.lang.String r3 = r3.replace(r4, r5)
            java.lang.String r4 = "`"
            java.lang.String r5 = "\\`"
            java.lang.String r3 = r3.replace(r4, r5)
            boolean r4 = r3.isEmpty()
            r5 = 1
            if (r4 == 0) goto L37
        L35:
            r5 = r1
            goto L71
        L37:
            char r4 = r3.charAt(r1)
            r6 = 90
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 65
            r9 = 97
            r10 = 95
            if (r4 == r10) goto L50
            if (r4 < r9) goto L4b
            if (r4 <= r7) goto L50
        L4b:
            if (r4 < r8) goto L35
            if (r4 <= r6) goto L50
            goto L35
        L50:
            r4 = r5
        L51:
            int r11 = r3.length()
            if (r4 >= r11) goto L71
            char r11 = r3.charAt(r4)
            if (r11 == r10) goto L6e
            if (r11 < r9) goto L61
            if (r11 <= r7) goto L6e
        L61:
            if (r11 < r8) goto L65
            if (r11 <= r6) goto L6e
        L65:
            r12 = 48
            if (r11 < r12) goto L35
            r12 = 57
            if (r11 <= r12) goto L6e
            goto L35
        L6e:
            int r4 = r4 + 1
            goto L51
        L71:
            if (r5 != 0) goto L87
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 96
            r4.append(r5)
            r4.append(r3)
            r4.append(r5)
            java.lang.String r3 = r4.toString()
        L87:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L8e:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.l.h():java.lang.String");
    }

    @Override // j9.e
    public final l l(List list) {
        return new l(list);
    }

    public final boolean u() {
        return equals(f8691b);
    }
}
