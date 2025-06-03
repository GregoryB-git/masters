// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import V4.d;
import Y4.b;
import java.util.Map;
import V4.a;

public final class j extends q
{
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == a.v) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(obj)));
    }
    
    @Override
    public boolean[] c(String string) {
        final int length = string.length();
        Label_0064: {
            if (length == 12) {
                break Label_0064;
            }
            Label_0047: {
                if (length != 13) {
                    break Label_0047;
                }
                while (true) {
                    while (true) {
                        try {
                            if (!p.a(string)) {
                                throw new IllegalArgumentException("Contents do not pass checksum");
                            }
                            Label_0098: {
                                break Label_0098;
                                try {
                                    final int b = p.b(string);
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(b);
                                    string = sb.toString();
                                    final int n = i.f[Character.digit(string.charAt(0), 10)];
                                    final boolean[] array = new boolean[95];
                                    int b2 = c5.n.b(array, 0, p.a, true);
                                    for (int i = 1; i <= 6; ++i) {
                                        int digit = Character.digit(string.charAt(i), 10);
                                        if ((n >> 6 - i & 0x1) == 0x1) {
                                            digit += 10;
                                        }
                                        b2 += c5.n.b(array, b2, p.e[digit], false);
                                    }
                                    int n2 = b2 + c5.n.b(array, b2, p.b, false);
                                    for (int j = 7; j <= 12; ++j) {
                                        n2 += c5.n.b(array, n2, p.d[Character.digit(string.charAt(j), 10)], true);
                                    }
                                    c5.n.b(array, n2, p.a, true);
                                    return array;
                                }
                                catch (d cause) {
                                    throw new IllegalArgumentException(cause);
                                }
                            }
                            throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
                            throw new IllegalArgumentException("Illegal contents");
                        }
                        catch (d d) {}
                        continue;
                    }
                }
            }
        }
    }
}
