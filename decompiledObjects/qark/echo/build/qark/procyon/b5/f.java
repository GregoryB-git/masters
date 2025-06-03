// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public final class f implements g
{
    public static void b(final char c, final StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
            return;
        }
        if (c >= '@' && c <= '^') {
            sb.append((char)(c - '@'));
            return;
        }
        j.e(c);
    }
    
    private static String c(final CharSequence charSequence, int n) {
        final int n2 = charSequence.length() - n;
        if (n2 != 0) {
            final char char1 = charSequence.charAt(n);
            int char2 = 0;
            char char3;
            if (n2 >= 2) {
                char3 = charSequence.charAt(n + 1);
            }
            else {
                char3 = '\0';
            }
            char char4;
            if (n2 >= 3) {
                char4 = charSequence.charAt(n + 2);
            }
            else {
                char4 = '\0';
            }
            if (n2 >= 4) {
                char2 = charSequence.charAt(n + 3);
            }
            n = (char1 << 18) + (char3 << 12) + (char4 << 6) + char2;
            final char c = (char)(n >> 16 & 0xFF);
            final char c2 = (char)(n >> 8 & 0xFF);
            final char c3 = (char)(n & 0xFF);
            final StringBuilder sb = new StringBuilder(3);
            sb.append(c);
            if (n2 >= 2) {
                sb.append(c2);
            }
            if (n2 >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }
    
    public static void e(final h h, final CharSequence charSequence) {
        final CharSequence charSequence2;
        Label_0244: {
            int length = 0;
            boolean b = false;
            Label_0114: {
                int f;
                int a;
                try {
                    length = charSequence.length();
                    if (length == 0) {
                        h.o(0);
                        return;
                    }
                    b = true;
                    if (length != 1) {
                        break Label_0114;
                    }
                    h.p();
                    final int n = h.g().a() - h.a();
                    f = h.f();
                    if (f > (a = n)) {
                        h.q(h.a() + 1);
                        a = h.g().a();
                        a -= h.a();
                    }
                }
                finally {
                    break Label_0244;
                }
                if (f <= a && a <= 2) {
                    h.o(0);
                    return;
                }
            }
            if (length <= 4) {
                final int n2 = length - 1;
                final String c = c(charSequence2, 0);
                final boolean b2 = (h.i() ^ true) && n2 <= 2 && b;
                Label_0228: {
                    Label_0223: {
                        if (n2 <= 2) {
                            h.q(h.a() + n2);
                            if (h.g().a() - h.a() >= 3) {
                                h.q(h.a() + c.length());
                                break Label_0223;
                            }
                        }
                        if (b2) {
                            h.k();
                            h.d -= n2;
                            break Label_0228;
                        }
                    }
                    h.s(c);
                }
                h.o(0);
                return;
            }
            throw new IllegalStateException("Count must not exceed 4");
        }
        h.o(0);
        throw charSequence2;
    }
    
    @Override
    public void a(final h h) {
        final StringBuilder sb = new StringBuilder();
        while (h.i()) {
            b(h.c(), sb);
            ++h.d;
            if (sb.length() >= 4) {
                h.s(c(sb, 0));
                sb.delete(0, 4);
                if (j.n(h.d(), h.d, this.d()) != this.d()) {
                    h.o(0);
                    break;
                }
                continue;
            }
        }
        sb.append('\u001f');
        e(h, sb);
    }
    
    public int d() {
        return 4;
    }
}
