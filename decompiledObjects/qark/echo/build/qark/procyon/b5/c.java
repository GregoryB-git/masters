// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public class c implements g
{
    public static String d(final CharSequence charSequence, int n) {
        n = charSequence.charAt(n) * '\u0640' + charSequence.charAt(n + 1) * '(' + charSequence.charAt(n + 2) + 1;
        return new String(new char[] { (char)(n / 256), (char)(n % 256) });
    }
    
    public static void g(final h h, final StringBuilder sb) {
        h.s(d(sb, 0));
        sb.delete(0, 3);
    }
    
    @Override
    public void a(final h h) {
        final StringBuilder sb = new StringBuilder();
        while (h.i()) {
            final char c = h.c();
            ++h.d;
            final int c2 = this.c(c, sb);
            final int n = h.a() + (sb.length() / 3 << 1);
            h.q(n);
            final int n2 = h.g().a() - n;
            if (!h.i()) {
                final StringBuilder sb2 = new StringBuilder();
                int b = c2;
                while (true) {
                    Label_0138: {
                        if (sb.length() % 3 != 2) {
                            break Label_0138;
                        }
                        int n3 = c2;
                        if (n2 >= 2) {
                            b = c2;
                            if (n2 <= 2) {
                                break Label_0138;
                            }
                            n3 = c2;
                        }
                        b = this.b(h, sb, sb2, n3);
                    }
                    if (sb.length() % 3 != 1) {
                        break;
                    }
                    if (b <= 3) {
                        final int n3 = b;
                        if (n2 != 1) {
                            continue;
                        }
                    }
                    if (b > 3) {
                        final int n3 = b;
                        continue;
                    }
                    break;
                }
                break;
            }
            else {
                if (sb.length() % 3 == 0 && j.n(h.d(), h.d, this.e()) != this.e()) {
                    h.o(0);
                    break;
                }
                continue;
            }
        }
        this.f(h, sb);
    }
    
    public final int b(final h h, final StringBuilder sb, final StringBuilder sb2, int c) {
        final int length = sb.length();
        sb.delete(length - c, length);
        --h.d;
        c = this.c(h.c(), sb2);
        h.k();
        return c;
    }
    
    public int c(char c, final StringBuilder sb) {
        char c2;
        if (c == ' ') {
            c2 = '\u0003';
        }
        else {
            int n;
            if (c >= '0' && c <= '9') {
                n = c - ',';
            }
            else {
                if (c < 'A' || c > 'Z') {
                    if (c < ' ') {
                        sb.append('\0');
                    }
                    else {
                        int n2;
                        if (c >= '!' && c <= '/') {
                            sb.append('\u0001');
                            n2 = c - '!';
                        }
                        else if (c >= ':' && c <= '@') {
                            sb.append('\u0001');
                            n2 = c - '+';
                        }
                        else if (c >= '[' && c <= '_') {
                            sb.append('\u0001');
                            n2 = c - 'E';
                        }
                        else {
                            if (c < '`' || c > '\u007f') {
                                sb.append("\u0001\u001e");
                                return this.c((char)(c - '\u0080'), sb) + 2;
                            }
                            sb.append('\u0002');
                            n2 = c - '`';
                        }
                        c = (char)n2;
                    }
                    sb.append(c);
                    return 2;
                }
                n = c - '3';
            }
            c2 = (char)n;
        }
        sb.append(c2);
        return 1;
    }
    
    public int e() {
        return 1;
    }
    
    public void f(final h h, final StringBuilder sb) {
        final int n = sb.length() / 3;
        final int n2 = sb.length() % 3;
        final int n3 = h.a() + (n << 1);
        h.q(n3);
        final int n4 = h.g().a() - n3;
        Label_0177: {
            if (n2 == 2) {
                sb.append('\0');
                while (sb.length() >= 3) {
                    g(h, sb);
                }
                if (!h.i()) {
                    break Label_0177;
                }
            }
            else {
                if (n4 == 1 && n2 == 1) {
                    while (sb.length() >= 3) {
                        g(h, sb);
                    }
                    if (h.i()) {
                        h.r('\u00fe');
                    }
                    --h.d;
                    break Label_0177;
                }
                if (n2 != 0) {
                    throw new IllegalStateException("Unexpected case. Please report!");
                }
                while (sb.length() >= 3) {
                    g(h, sb);
                }
                if (n4 <= 0) {
                    if (!h.i()) {
                        break Label_0177;
                    }
                }
            }
            h.r('\u00fe');
        }
        h.o(0);
    }
}
