// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P0;

import java.nio.ByteBuffer;
import java.util.List;
import W2.e;
import java.util.ArrayList;
import d0.x;
import g0.y;
import O0.c;

public final class b extends c
{
    public static x c(final y y) {
        y.r(12);
        final int h = y.h(12);
        final int d = y.d();
        y.r(44);
        y.s(y.h(12));
        y.r(16);
        final ArrayList<P0.a> list = new ArrayList<P0.a>();
        while (true) {
            final int d2 = y.d();
            String str = null;
            if (d2 >= d + h - 4) {
                break;
            }
            y.r(48);
            final int h2 = y.h(8);
            y.r(4);
            final int n = y.d() + y.h(12);
            String str2 = null;
            while (y.d() < n) {
                final int h3 = y.h(8);
                final int h4 = y.h(8);
                final int n2 = y.d() + h4;
                String s;
                String l;
                if (h3 == 2) {
                    final int h5 = y.h(16);
                    y.r(8);
                    s = str;
                    l = str2;
                    if (h5 == 3) {
                        while (true) {
                            s = str;
                            l = str2;
                            if (y.d() >= n2) {
                                break;
                            }
                            final String i = y.l(y.h(8), e.a);
                            final int h6 = y.h(8);
                            int n3 = 0;
                            while (true) {
                                str = i;
                                if (n3 >= h6) {
                                    break;
                                }
                                y.s(y.h(8));
                                ++n3;
                            }
                        }
                    }
                }
                else {
                    s = str;
                    l = str2;
                    if (h3 == 21) {
                        l = y.l(h4, e.a);
                        s = str;
                    }
                }
                y.p(n2 * 8);
                str = s;
                str2 = l;
            }
            y.p(n * 8);
            if (str == null || str2 == null) {
                continue;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            list.add(new P0.a(h2, sb.toString()));
        }
        if (list.isEmpty()) {
            return null;
        }
        return new x(list);
    }
    
    @Override
    public x b(final O0.b b, final ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
