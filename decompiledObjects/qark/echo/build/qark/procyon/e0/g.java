// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import g0.M;
import java.nio.ByteBuffer;

public final class g extends d
{
    @Override
    public void f(final ByteBuffer byteBuffer) {
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - i;
        final int c = super.b.c;
        int n2 = n;
        int n3 = 0;
        Label_0107: {
            Label_0095: {
                if (c != 3) {
                    Label_0102: {
                        if (c != 4) {
                            if (c != 21) {
                                if (c == 22) {
                                    break Label_0102;
                                }
                                n3 = n;
                                if (c == 268435456) {
                                    break Label_0107;
                                }
                                if (c != 1342177280) {
                                    if (c == 1610612736) {
                                        break Label_0102;
                                    }
                                    throw new IllegalStateException();
                                }
                            }
                            n2 = n / 3;
                            break Label_0095;
                        }
                    }
                    n3 = n / 2;
                    break Label_0107;
                }
            }
            n3 = n2 * 2;
        }
        final ByteBuffer m = this.m(n3);
        final int c2 = super.b.c;
        int j = i;
        if (c2 != 3) {
            int k = i;
            if (c2 != 4) {
                int l = i;
                if (c2 != 21) {
                    int n4 = i;
                    if (c2 != 22) {
                        int n5 = i;
                        if (c2 != 268435456) {
                            int n6 = i;
                            if (c2 != 1342177280) {
                                if (c2 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                                while (i < limit) {
                                    m.put(byteBuffer.get(i + 1));
                                    m.put(byteBuffer.get(i));
                                    i += 4;
                                }
                            }
                            else {
                                while (n6 < limit) {
                                    m.put(byteBuffer.get(n6 + 1));
                                    m.put(byteBuffer.get(n6));
                                    n6 += 3;
                                }
                            }
                        }
                        else {
                            while (n5 < limit) {
                                m.put(byteBuffer.get(n5 + 1));
                                m.put(byteBuffer.get(n5));
                                n5 += 2;
                            }
                        }
                    }
                    else {
                        while (n4 < limit) {
                            m.put(byteBuffer.get(n4 + 2));
                            m.put(byteBuffer.get(n4 + 3));
                            n4 += 4;
                        }
                    }
                }
                else {
                    while (l < limit) {
                        m.put(byteBuffer.get(l + 1));
                        m.put(byteBuffer.get(l + 2));
                        l += 3;
                    }
                }
            }
            else {
                while (k < limit) {
                    final short n7 = (short)(M.o(byteBuffer.getFloat(k), -1.0f, 1.0f) * 32767.0f);
                    m.put((byte)(n7 & 0xFF));
                    m.put((byte)(n7 >> 8 & 0xFF));
                    k += 4;
                }
            }
        }
        else {
            while (j < limit) {
                m.put((byte)0);
                m.put((byte)((byteBuffer.get(j) & 0xFF) - 128));
                ++j;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m.flip();
    }
    
    @Override
    public a i(final a a) {
        final int c = a.c;
        if (c != 3 && c != 2 && c != 268435456 && c != 21 && c != 1342177280 && c != 22 && c != 1610612736 && c != 4) {
            throw new b.b(a);
        }
        if (c != 2) {
            return new a(a.a, a.b, 2);
        }
        return e0.b.a.e;
    }
}
