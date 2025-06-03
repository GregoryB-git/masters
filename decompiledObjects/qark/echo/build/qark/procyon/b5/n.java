// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public final class n extends c
{
    @Override
    public void a(final h h) {
        final StringBuilder sb = new StringBuilder();
        while (h.i()) {
            final char c = h.c();
            ++h.d;
            this.c(c, sb);
            if (sb.length() % 3 == 0) {
                b5.c.g(h, sb);
                if (j.n(h.d(), h.d, this.e()) != this.e()) {
                    h.o(0);
                    break;
                }
                continue;
            }
        }
        this.f(h, sb);
    }
    
    @Override
    public int c(final char c, final StringBuilder sb) {
        char c2;
        if (c != '\r') {
            if (c != ' ') {
                if (c == '*') {
                    sb.append('\u0001');
                    return 1;
                }
                if (c != '>') {
                    int n;
                    if (c >= '0' && c <= '9') {
                        n = c - ',';
                    }
                    else {
                        if (c < 'A' || c > 'Z') {
                            j.e(c);
                            return 1;
                        }
                        n = c - '3';
                    }
                    c2 = (char)n;
                }
                else {
                    c2 = '\u0002';
                }
            }
            else {
                c2 = '\u0003';
            }
        }
        else {
            c2 = '\0';
        }
        sb.append(c2);
        return 1;
    }
    
    @Override
    public int e() {
        return 3;
    }
    
    @Override
    public void f(final h h, final StringBuilder sb) {
        h.p();
        final int n = h.g().a() - h.a();
        h.d -= sb.length();
        if (h.f() > 1 || n > 1 || h.f() != n) {
            h.r('\u00fe');
        }
        if (h.e() < 0) {
            h.o(0);
        }
    }
}
