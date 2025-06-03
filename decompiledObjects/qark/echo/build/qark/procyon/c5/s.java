// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import V4.d;
import Y4.b;
import java.util.Map;
import V4.a;

public final class s extends q
{
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == a.D) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC_E, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(String string) {
        final int length = string.length();
        Label_0064: {
            if (length == 7) {
                break Label_0064;
            }
            Label_0047: {
                if (length != 8) {
                    break Label_0047;
                }
                while (true) {
                    while (true) {
                        try {
                            if (!p.a(string)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                            Label_0101: {
                                break Label_0101;
                                try {
                                    final int b = p.b(r.c(string));
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(b);
                                    string = sb.toString();
                                    final int digit = Character.digit(string.charAt(0), 10);
                                    if (digit != 0 && digit != 1) {
                                        throw new IllegalArgumentException("Number system must be 0 or 1");
                                    }
                                    final int n = r.g[digit][Character.digit(string.charAt(7), 10)];
                                    final boolean[] array = new boolean[51];
                                    int b2 = c5.n.b(array, 0, p.a, true);
                                    for (int i = 1; i <= 6; ++i) {
                                        int digit2 = Character.digit(string.charAt(i), 10);
                                        if ((n >> 6 - i & 0x1) == 0x1) {
                                            digit2 += 10;
                                        }
                                        b2 += c5.n.b(array, b2, p.e[digit2], false);
                                    }
                                    c5.n.b(array, b2, p.c, false);
                                    return array;
                                }
                                catch (d cause) {
                                    throw new IllegalArgumentException(cause);
                                }
                            }
                            throw new IllegalArgumentException("Illegal contents");
                            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
                        }
                        catch (d d) {}
                        continue;
                    }
                }
            }
        }
    }
}
