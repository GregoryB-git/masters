/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package m0;

import e0.b;
import e0.d;
import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class e0
extends d {
    public static final int i = Float.floatToIntBits((float)Float.NaN);

    public static void n(int n8, ByteBuffer byteBuffer) {
        int n9;
        n8 = n9 = Float.floatToIntBits((float)((float)((double)n8 * 4.656612875245797E-10)));
        if (n9 == i) {
            n8 = Float.floatToIntBits((float)0.0f);
        }
        byteBuffer.putInt(n8);
    }

    @Override
    public void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        block11 : {
            int n8 = byteBuffer.position();
            int n9 = byteBuffer.limit();
            int n10 = n9 - n8;
            int n11 = this.b.c;
            if (n11 != 21) {
                if (n11 != 22) {
                    if (n11 != 1342177280) {
                        if (n11 == 1610612736) {
                            ByteBuffer byteBuffer3 = this.m(n10);
                            do {
                                byteBuffer2 = byteBuffer3;
                                if (n8 < n9) {
                                    e0.n(byteBuffer.get(n8 + 3) & 255 | (byteBuffer.get(n8 + 2) & 255) << 8 | (byteBuffer.get(n8 + 1) & 255) << 16 | (byteBuffer.get(n8) & 255) << 24, byteBuffer3);
                                    n8 += 4;
                                    continue;
                                }
                                break block11;
                                break;
                            } while (true);
                        }
                        throw new IllegalStateException();
                    }
                    ByteBuffer byteBuffer4 = this.m(n10 / 3 * 4);
                    do {
                        byteBuffer2 = byteBuffer4;
                        if (n8 < n9) {
                            e0.n((byteBuffer.get(n8 + 2) & 255) << 8 | (byteBuffer.get(n8 + 1) & 255) << 16 | (byteBuffer.get(n8) & 255) << 24, byteBuffer4);
                            n8 += 3;
                            continue;
                        }
                        break block11;
                        break;
                    } while (true);
                }
                ByteBuffer byteBuffer5 = this.m(n10);
                do {
                    byteBuffer2 = byteBuffer5;
                    if (n8 < n9) {
                        e0.n(byteBuffer.get(n8) & 255 | (byteBuffer.get(n8 + 1) & 255) << 8 | (byteBuffer.get(n8 + 2) & 255) << 16 | (byteBuffer.get(n8 + 3) & 255) << 24, byteBuffer5);
                        n8 += 4;
                        continue;
                    }
                    break block11;
                    break;
                } while (true);
            }
            ByteBuffer byteBuffer6 = this.m(n10 / 3 * 4);
            do {
                byteBuffer2 = byteBuffer6;
                if (n8 >= n9) break;
                e0.n((byteBuffer.get(n8) & 255) << 8 | (byteBuffer.get(n8 + 1) & 255) << 16 | (byteBuffer.get(n8 + 2) & 255) << 24, byteBuffer6);
                n8 += 3;
            } while (true);
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public b.a i(b.a a8) {
        int n8 = a8.c;
        if (M.z0(n8)) {
            if (n8 != 4) {
                return new b.a(a8.a, a8.b, 4);
            }
            return b.a.e;
        }
        throw new b.b(a8);
    }
}

