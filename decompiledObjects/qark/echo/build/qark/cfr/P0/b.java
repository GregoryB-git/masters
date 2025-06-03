/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.List
 */
package P0;

import O0.c;
import P0.a;
import W2.e;
import d0.x;
import g0.y;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public final class b
extends c {
    public static x c(y y8) {
        y8.r(12);
        int n8 = y8.h(12);
        int n9 = y8.d();
        y8.r(44);
        y8.s(y8.h(12));
        y8.r(16);
        ArrayList arrayList = new ArrayList();
        do {
            Object object;
            int n10 = y8.d();
            Object object2 = null;
            if (n10 >= n9 + n8 - 4) break;
            y8.r(48);
            int n11 = y8.h(8);
            y8.r(4);
            n10 = y8.h(12);
            int n12 = y8.d() + n10;
            String string2 = null;
            while (y8.d() < n12) {
                int n13;
                String string3;
                n10 = y8.h(8);
                int n14 = y8.h(8);
                n13 = y8.d() + n14;
                if (n10 == 2) {
                    n10 = y8.h(16);
                    y8.r(8);
                    object = object2;
                    string3 = string2;
                    if (n10 == 3) {
                        block2 : do {
                            object = object2;
                            string3 = string2;
                            if (y8.d() < n13) {
                                object = y8.l(y8.h(8), e.a);
                                n14 = y8.h(8);
                                n10 = 0;
                                do {
                                    object2 = object;
                                    if (n10 >= n14) continue block2;
                                    y8.s(y8.h(8));
                                    ++n10;
                                } while (true);
                            }
                            break;
                        } while (true);
                    }
                } else {
                    object = object2;
                    string3 = string2;
                    if (n10 == 21) {
                        string3 = y8.l(n14, e.a);
                        object = object2;
                    }
                }
                y8.p(n13 * 8);
                object2 = object;
                string2 = string3;
            }
            y8.p(n12 * 8);
            if (object2 == null || string2 == null) continue;
            object = new StringBuilder();
            object.append((String)object2);
            object.append(string2);
            arrayList.add((Object)new a(n11, object.toString()));
        } while (true);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new x((List)arrayList);
    }

    @Override
    public x b(O0.b b8, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return b.c(new y(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}

