package b5;

/* loaded from: classes.dex */
public final class f implements g {
    public static void b(char c7, StringBuilder sb) {
        if (c7 >= ' ' && c7 <= '?') {
            sb.append(c7);
        } else if (c7 < '@' || c7 > '^') {
            j.e(c7);
        } else {
            sb.append((char) (c7 - '@'));
        }
    }

    private static String c(CharSequence charSequence, int i7) {
        int length = charSequence.length() - i7;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int charAt = (charSequence.charAt(i7) << 18) + ((length >= 2 ? charSequence.charAt(i7 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i7 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i7 + 3) : (char) 0);
        char c7 = (char) ((charAt >> 16) & 255);
        char c8 = (char) ((charAt >> 8) & 255);
        char c9 = (char) (charAt & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c7);
        if (length >= 2) {
            sb.append(c8);
        }
        if (length >= 3) {
            sb.append(c9);
        }
        return sb.toString();
    }

    public static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z7 = true;
            if (length == 1) {
                hVar.p();
                int a7 = hVar.g().a() - hVar.a();
                int f7 = hVar.f();
                if (f7 > a7) {
                    hVar.q(hVar.a() + 1);
                    a7 = hVar.g().a() - hVar.a();
                }
                if (f7 <= a7 && a7 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i7 = length - 1;
            String c7 = c(charSequence, 0);
            if (!(!hVar.i()) || i7 > 2) {
                z7 = false;
            }
            if (i7 <= 2) {
                hVar.q(hVar.a() + i7);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + c7.length());
                    hVar.s(c7);
                }
            }
            if (z7) {
                hVar.k();
                hVar.f9987d -= i7;
            }
            hVar.s(c7);
        } finally {
            hVar.o(0);
        }
    }

    @Override // b5.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb);
            hVar.f9987d++;
            if (sb.length() >= 4) {
                hVar.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(hVar.d(), hVar.f9987d, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        e(hVar, sb);
    }

    public int d() {
        return 4;
    }
}
