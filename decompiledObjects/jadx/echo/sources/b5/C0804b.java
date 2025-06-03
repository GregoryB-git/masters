package b5;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804b implements g {
    public static char c(char c7, int i7) {
        int i8 = c7 + ((i7 * 149) % 255) + 1;
        return i8 <= 255 ? (char) i8 : (char) (i8 - 256);
    }

    @Override // b5.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) 0);
        while (true) {
            if (!hVar.i()) {
                break;
            }
            sb.append(hVar.c());
            hVar.f9987d++;
            if (j.n(hVar.d(), hVar.f9987d, b()) != b()) {
                hVar.o(0);
                break;
            }
        }
        int length = sb.length() - 1;
        int a7 = hVar.a() + length + 1;
        hVar.q(a7);
        boolean z7 = hVar.g().a() - a7 > 0;
        if (hVar.i() || z7) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
                }
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb.length();
        for (int i7 = 0; i7 < length2; i7++) {
            hVar.r(c(sb.charAt(i7), hVar.a() + 1));
        }
    }

    public int b() {
        return 5;
    }
}
