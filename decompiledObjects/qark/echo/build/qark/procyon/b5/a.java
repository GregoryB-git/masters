// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public final class a implements g
{
    public static char b(final char c, final char c2) {
        if (j.f(c) && j.f(c2)) {
            return (char)((c - '0') * 10 + (c2 - '0') + 130);
        }
        final StringBuilder sb = new StringBuilder("not digits: ");
        sb.append(c);
        sb.append(c2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public void a(final h h) {
        if (j.a(h.d(), h.d) >= 2) {
            h.r(b(h.d().charAt(h.d), h.d().charAt(h.d + 1)));
            h.d += 2;
            return;
        }
        final char c = h.c();
        final int n = j.n(h.d(), h.d, this.c());
        if (n != this.c()) {
            if (n == 1) {
                h.r('\u00e6');
                h.o(1);
                return;
            }
            if (n == 2) {
                h.r('\u00ef');
                h.o(2);
                return;
            }
            if (n == 3) {
                h.r('\u00ee');
                h.o(3);
                return;
            }
            if (n == 4) {
                h.r('\u00f0');
                h.o(4);
                return;
            }
            if (n == 5) {
                h.r('\u00e7');
                h.o(5);
                return;
            }
            throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(n)));
        }
        else {
            if (j.g(c)) {
                h.r('\u00eb');
                h.r((char)(c - '\u007f'));
                ++h.d;
                return;
            }
            h.r((char)(c + '\u0001'));
            ++h.d;
        }
    }
    
    public int c() {
        return 0;
    }
}
