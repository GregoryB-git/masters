package b5;

/* loaded from: classes.dex */
public final class n extends C0805c {
    @Override // b5.C0805c, b5.g
    public void a(h hVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c7 = hVar.c();
            hVar.f9987d++;
            c(c7, sb);
            if (sb.length() % 3 == 0) {
                C0805c.g(hVar, sb);
                if (j.n(hVar.d(), hVar.f9987d, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        f(hVar, sb);
    }

    @Override // b5.C0805c
    public int c(char c7, StringBuilder sb) {
        char c8;
        int i7;
        if (c7 == '\r') {
            c8 = 0;
        } else {
            if (c7 != ' ') {
                if (c7 == '*') {
                    sb.append((char) 1);
                } else if (c7 != '>') {
                    if (c7 >= '0' && c7 <= '9') {
                        i7 = c7 - ',';
                    } else if (c7 < 'A' || c7 > 'Z') {
                        j.e(c7);
                    } else {
                        i7 = c7 - '3';
                    }
                    c8 = (char) i7;
                } else {
                    c8 = 2;
                }
                return 1;
            }
            c8 = 3;
        }
        sb.append(c8);
        return 1;
    }

    @Override // b5.C0805c
    public int e() {
        return 3;
    }

    @Override // b5.C0805c
    public void f(h hVar, StringBuilder sb) {
        hVar.p();
        int a7 = hVar.g().a() - hVar.a();
        hVar.f9987d -= sb.length();
        if (hVar.f() > 1 || a7 > 1 || hVar.f() != a7) {
            hVar.r((char) 254);
        }
        if (hVar.e() < 0) {
            hVar.o(0);
        }
    }
}
