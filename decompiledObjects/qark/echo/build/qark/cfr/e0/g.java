/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package e0;

import e0.b;
import e0.d;
import g0.M;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class g
extends d {
    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void f(ByteBuffer byteBuffer) {
        int n8;
        int n9;
        int n10;
        int n11;
        block22 : {
            block20 : {
                block19 : {
                    block21 : {
                        n8 = byteBuffer.position();
                        n11 = byteBuffer.limit();
                        n9 = n11 - n8;
                        int n12 = this.b.c;
                        n10 = n9;
                        if (n12 == 3) break block19;
                        if (n12 == 4) break block20;
                        if (n12 == 21) break block21;
                        if (n12 == 22) break block20;
                        n10 = n9;
                        if (n12 == 268435456) break block22;
                        if (n12 == 1342177280) break block21;
                        if (n12 != 1610612736) throw new IllegalStateException();
                        break block20;
                    }
                    n10 = n9 / 3;
                }
                n10 *= 2;
                break block22;
            }
            n10 = n9 / 2;
        }
        ByteBuffer byteBuffer2 = this.m(n10);
        n9 = this.b.c;
        if (n9 != 3) {
            if (n9 != 4) {
                if (n9 != 21) {
                    if (n9 != 22) {
                        if (n9 != 268435456) {
                            if (n9 != 1342177280) {
                                if (n9 != 1610612736) throw new IllegalStateException();
                                while (n8 < n11) {
                                    byteBuffer2.put(byteBuffer.get(n8 + 1));
                                    byteBuffer2.put(byteBuffer.get(n8));
                                    n8 += 4;
                                }
                            } else {
                                for (n10 = n8; n10 < n11; n10 += 3) {
                                    byteBuffer2.put(byteBuffer.get(n10 + 1));
                                    byteBuffer2.put(byteBuffer.get(n10));
                                }
                            }
                        } else {
                            for (n10 = n8; n10 < n11; n10 += 2) {
                                byteBuffer2.put(byteBuffer.get(n10 + 1));
                                byteBuffer2.put(byteBuffer.get(n10));
                            }
                        }
                    } else {
                        for (n10 = n8; n10 < n11; n10 += 4) {
                            byteBuffer2.put(byteBuffer.get(n10 + 2));
                            byteBuffer2.put(byteBuffer.get(n10 + 3));
                        }
                    }
                } else {
                    for (n10 = n8; n10 < n11; n10 += 3) {
                        byteBuffer2.put(byteBuffer.get(n10 + 1));
                        byteBuffer2.put(byteBuffer.get(n10 + 2));
                    }
                }
            } else {
                for (n10 = n8; n10 < n11; n10 += 4) {
                    n8 = (short)(M.o(byteBuffer.getFloat(n10), -1.0f, 1.0f) * 32767.0f);
                    byteBuffer2.put((byte)(n8 & 255));
                    byteBuffer2.put((byte)(n8 >> 8 & 255));
                }
            }
        } else {
            for (n10 = n8; n10 < n11; ++n10) {
                byteBuffer2.put((byte)0);
                byteBuffer2.put((byte)((byteBuffer.get(n10) & 255) - 128));
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    @Override
    public b.a i(b.a a8) {
        int n8 = a8.c;
        if (n8 != 3 && n8 != 2 && n8 != 268435456 && n8 != 21 && n8 != 1342177280 && n8 != 22 && n8 != 1610612736 && n8 != 4) {
            throw new b.b(a8);
        }
        if (n8 != 2) {
            return new b.a(a8.a, a8.b, 2);
        }
        return b.a.e;
    }
}

