// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public final class b implements g
{
    public static char c(final char c, final int n) {
        final int n2 = c + (n * 149 % 255 + 1);
        if (n2 <= 255) {
            return (char)n2;
        }
        return (char)(n2 - 256);
    }
    
    @Override
    public void a(final h h) {
        final StringBuilder sb = new StringBuilder();
        final int n = 0;
        sb.append('\0');
        while (h.i()) {
            sb.append(h.c());
            ++h.d;
            if (j.n(h.d(), h.d, this.b()) != this.b()) {
                h.o(0);
                break;
            }
        }
        final int i = sb.length() - 1;
        final int n2 = h.a() + i + 1;
        h.q(n2);
        final boolean b = h.g().a() - n2 > 0;
        if (h.i() || b) {
            if (i <= 249) {
                sb.setCharAt(0, (char)i);
            }
            else {
                if (i > 1555) {
                    throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(i)));
                }
                sb.setCharAt(0, (char)(i / 250 + 249));
                sb.insert(1, (char)(i % 250));
            }
        }
        for (int length = sb.length(), j = n; j < length; ++j) {
            h.r(c(sb.charAt(j), h.a() + 1));
        }
    }
    
    public int b() {
        return 5;
    }
}
