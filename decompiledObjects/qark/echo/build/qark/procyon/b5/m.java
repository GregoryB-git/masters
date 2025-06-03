// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

public final class m extends c
{
    @Override
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
                if (c < 'a' || c > 'z') {
                    if (c < ' ') {
                        sb.append('\0');
                    }
                    else {
                        int n2 = 0;
                        Label_0102: {
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
                                if (c != '`') {
                                    if (c >= 'A' && c <= 'Z') {
                                        sb.append('\u0002');
                                        n2 = c - '@';
                                        break Label_0102;
                                    }
                                    if (c < '{' || c > '\u007f') {
                                        sb.append("\u0001\u001e");
                                        return this.c((char)(c - '\u0080'), sb) + 2;
                                    }
                                }
                                sb.append('\u0002');
                                n2 = c - '`';
                            }
                        }
                        c = (char)n2;
                    }
                    sb.append(c);
                    return 2;
                }
                n = c - 'S';
            }
            c2 = (char)n;
        }
        sb.append(c2);
        return 1;
    }
    
    @Override
    public int e() {
        return 2;
    }
}
