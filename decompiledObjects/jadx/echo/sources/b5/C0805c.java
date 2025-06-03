package b5;

/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0805c implements g {
    public static String d(CharSequence charSequence, int i7) {
        int charAt = (charSequence.charAt(i7) * 1600) + (charSequence.charAt(i7 + 1) * '(') + charSequence.charAt(i7 + 2) + 1;
        return new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)});
    }

    public static void g(h hVar, StringBuilder sb) {
        hVar.s(d(sb, 0));
        sb.delete(0, 3);
    }

    @Override // b5.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c7 = hVar.c();
            hVar.f9987d++;
            int c8 = c(c7, sb);
            int a7 = hVar.a() + ((sb.length() / 3) << 1);
            hVar.q(a7);
            int a8 = hVar.g().a() - a7;
            if (!hVar.i()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (a8 < 2 || a8 > 2)) {
                    c8 = b(hVar, sb, sb2, c8);
                }
                while (sb.length() % 3 == 1) {
                    if (c8 <= 3 && a8 != 1) {
                        c8 = b(hVar, sb, sb2, c8);
                    } else if (c8 <= 3) {
                        break;
                    } else {
                        c8 = b(hVar, sb, sb2, c8);
                    }
                }
            } else if (sb.length() % 3 == 0 && j.n(hVar.d(), hVar.f9987d, e()) != e()) {
                hVar.o(0);
                break;
            }
        }
        f(hVar, sb);
    }

    public final int b(h hVar, StringBuilder sb, StringBuilder sb2, int i7) {
        int length = sb.length();
        sb.delete(length - i7, length);
        hVar.f9987d--;
        int c7 = c(hVar.c(), sb2);
        hVar.k();
        return c7;
    }

    public int c(char c7, StringBuilder sb) {
        int i7;
        int i8;
        char c8;
        if (c7 == ' ') {
            c8 = 3;
        } else {
            if (c7 >= '0' && c7 <= '9') {
                i8 = c7 - ',';
            } else {
                if (c7 < 'A' || c7 > 'Z') {
                    if (c7 < ' ') {
                        sb.append((char) 0);
                    } else {
                        if (c7 >= '!' && c7 <= '/') {
                            sb.append((char) 1);
                            i7 = c7 - '!';
                        } else if (c7 >= ':' && c7 <= '@') {
                            sb.append((char) 1);
                            i7 = c7 - '+';
                        } else if (c7 >= '[' && c7 <= '_') {
                            sb.append((char) 1);
                            i7 = c7 - 'E';
                        } else {
                            if (c7 < '`' || c7 > 127) {
                                sb.append("\u0001\u001e");
                                return c((char) (c7 - 128), sb) + 2;
                            }
                            sb.append((char) 2);
                            i7 = c7 - '`';
                        }
                        c7 = (char) i7;
                    }
                    sb.append(c7);
                    return 2;
                }
                i8 = c7 - '3';
            }
            c8 = (char) i8;
        }
        sb.append(c8);
        return 1;
    }

    public int e() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r8.i() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r8.i() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(b5.h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.q(r4)
            b5.k r0 = r8.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 2
            r5 = 0
            r6 = 254(0xfe, float:3.56E-43)
            if (r3 != r4) goto L3b
            r9.append(r5)
        L27:
            int r0 = r9.length()
            if (r0 < r1) goto L31
            g(r8, r9)
            goto L27
        L31:
            boolean r9 = r8.i()
            if (r9 == 0) goto L6d
        L37:
            r8.r(r6)
            goto L6d
        L3b:
            if (r0 != r2) goto L58
            if (r3 != r2) goto L58
        L3f:
            int r0 = r9.length()
            if (r0 < r1) goto L49
            g(r8, r9)
            goto L3f
        L49:
            boolean r9 = r8.i()
            if (r9 == 0) goto L52
            r8.r(r6)
        L52:
            int r9 = r8.f9987d
            int r9 = r9 - r2
            r8.f9987d = r9
            goto L6d
        L58:
            if (r3 != 0) goto L71
        L5a:
            int r2 = r9.length()
            if (r2 < r1) goto L64
            g(r8, r9)
            goto L5a
        L64:
            if (r0 > 0) goto L37
            boolean r9 = r8.i()
            if (r9 == 0) goto L6d
            goto L37
        L6d:
            r8.o(r5)
            return
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0805c.f(b5.h, java.lang.StringBuilder):void");
    }
}
