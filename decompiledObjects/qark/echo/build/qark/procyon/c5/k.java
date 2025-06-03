// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import V4.d;
import Y4.b;
import java.util.Map;
import V4.a;

public final class k extends q
{
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        if (obj == a.u) {
            return super.a(s, obj, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(obj)));
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
                            Label_0098: {
                                break Label_0098;
                                try {
                                    final int b = p.b(string);
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(string);
                                    sb.append(b);
                                    string = sb.toString();
                                    final boolean[] array = new boolean[67];
                                    int b2 = n.b(array, 0, p.a, true);
                                    for (int i = 0; i <= 3; ++i) {
                                        b2 += n.b(array, b2, p.d[Character.digit(string.charAt(i), 10)], false);
                                    }
                                    int n = b2 + c5.n.b(array, b2, p.b, false);
                                    for (int j = 4; j <= 7; ++j) {
                                        n += c5.n.b(array, n, p.d[Character.digit(string.charAt(j), 10)], true);
                                    }
                                    c5.n.b(array, n, p.a, true);
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
