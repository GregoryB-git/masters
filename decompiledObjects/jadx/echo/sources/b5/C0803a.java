package b5;

/* renamed from: b5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0803a implements g {
    public static char b(char c7, char c8) {
        if (j.f(c7) && j.f(c8)) {
            return (char) (((c7 - '0') * 10) + (c8 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c7 + c8);
    }

    @Override // b5.g
    public void a(h hVar) {
        if (j.a(hVar.d(), hVar.f9987d) >= 2) {
            hVar.r(b(hVar.d().charAt(hVar.f9987d), hVar.d().charAt(hVar.f9987d + 1)));
            hVar.f9987d += 2;
            return;
        }
        char c7 = hVar.c();
        int n7 = j.n(hVar.d(), hVar.f9987d, c());
        if (n7 == c()) {
            if (!j.g(c7)) {
                hVar.r((char) (c7 + 1));
                hVar.f9987d++;
                return;
            } else {
                hVar.r((char) 235);
                hVar.r((char) (c7 - 127));
                hVar.f9987d++;
                return;
            }
        }
        if (n7 == 1) {
            hVar.r((char) 230);
            hVar.o(1);
            return;
        }
        if (n7 == 2) {
            hVar.r((char) 239);
            hVar.o(2);
            return;
        }
        if (n7 == 3) {
            hVar.r((char) 238);
            hVar.o(3);
        } else if (n7 == 4) {
            hVar.r((char) 240);
            hVar.o(4);
        } else {
            if (n7 != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n7)));
            }
            hVar.r((char) 231);
            hVar.o(5);
        }
    }

    public int c() {
        return 0;
    }
}
