package q5;

import java.util.regex.Pattern;
import v5.u;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f13279c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f13280d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final u f13281a = new u();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f13282b = new StringBuilder();

    public static String a(u uVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = uVar.f15975b;
        int i11 = uVar.f15976c;
        while (i10 < i11 && !z10) {
            char c10 = (char) uVar.f15974a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        uVar.H(i10 - uVar.f15975b);
        return sb2.toString();
    }

    public static String b(u uVar, StringBuilder sb2) {
        c(uVar);
        if (uVar.f15976c - uVar.f15975b == 0) {
            return null;
        }
        String a10 = a(uVar, sb2);
        if (!"".equals(a10)) {
            return a10;
        }
        StringBuilder l10 = defpackage.f.l("");
        l10.append((char) uVar.v());
        return l10.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[LOOP:1: B:3:0x0002->B:41:0x0067, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(v5.u r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.f15976c
            int r3 = r8.f15975b
            int r2 = r2 - r3
            if (r2 <= 0) goto L69
            if (r1 == 0) goto L69
            byte[] r1 = r8.f15974a
            r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L27
            r2 = 10
            if (r1 == r2) goto L27
            r2 = 12
            if (r1 == r2) goto L27
            r2 = 13
            if (r1 == r2) goto L27
            r2 = 32
            if (r1 == r2) goto L27
            r1 = r3
            goto L2b
        L27:
            r8.H(r0)
            r1 = r0
        L2b:
            if (r1 != 0) goto L1
            int r1 = r8.f15975b
            int r2 = r8.f15976c
            byte[] r4 = r8.f15974a
            int r5 = r1 + 2
            if (r5 > r2) goto L63
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L63
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L63
        L47:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5b
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L59
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L59
            int r2 = r5 + 1
            r1 = r2
            goto L47
        L59:
            r1 = r5
            goto L47
        L5b:
            int r1 = r8.f15975b
            int r2 = r2 - r1
            r8.H(r2)
            r1 = r0
            goto L64
        L63:
            r1 = r3
        L64:
            if (r1 == 0) goto L67
            goto L1
        L67:
            r1 = r3
            goto L2
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.c.c(v5.u):void");
    }
}
