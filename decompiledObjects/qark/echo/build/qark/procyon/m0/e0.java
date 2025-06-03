// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import g0.M;
import e0.b;
import java.nio.ByteBuffer;
import e0.d;

public final class e0 extends d
{
    public static final int i;
    
    static {
        i = Float.floatToIntBits(Float.NaN);
    }
    
    public static void n(int n, final ByteBuffer byteBuffer) {
        if ((n = Float.floatToIntBits((float)(n * 4.656612875245797E-10))) == e0.i) {
            n = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n);
    }
    
    @Override
    public void f(final ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        final int c = super.b.c;
        ByteBuffer byteBuffer2;
        if (c != 21) {
            if (c != 22) {
                if (c != 1342177280) {
                    if (c != 1610612736) {
                        throw new IllegalStateException();
                    }
                    final ByteBuffer m = this.m(n);
                    while (true) {
                        byteBuffer2 = m;
                        if (position >= limit) {
                            break;
                        }
                        n((byteBuffer.get(position + 3) & 0xFF) | (byteBuffer.get(position + 2) & 0xFF) << 8 | (byteBuffer.get(position + 1) & 0xFF) << 16 | (byteBuffer.get(position) & 0xFF) << 24, m);
                        position += 4;
                    }
                }
                else {
                    final ByteBuffer i = this.m(n / 3 * 4);
                    while (true) {
                        byteBuffer2 = i;
                        if (position >= limit) {
                            break;
                        }
                        n((byteBuffer.get(position + 2) & 0xFF) << 8 | (byteBuffer.get(position + 1) & 0xFF) << 16 | (byteBuffer.get(position) & 0xFF) << 24, i);
                        position += 3;
                    }
                }
            }
            else {
                final ByteBuffer j = this.m(n);
                while (true) {
                    byteBuffer2 = j;
                    if (position >= limit) {
                        break;
                    }
                    n((byteBuffer.get(position) & 0xFF) | (byteBuffer.get(position + 1) & 0xFF) << 8 | (byteBuffer.get(position + 2) & 0xFF) << 16 | (byteBuffer.get(position + 3) & 0xFF) << 24, j);
                    position += 4;
                }
            }
        }
        else {
            final ByteBuffer k = this.m(n / 3 * 4);
            while (true) {
                byteBuffer2 = k;
                if (position >= limit) {
                    break;
                }
                n((byteBuffer.get(position) & 0xFF) << 8 | (byteBuffer.get(position + 1) & 0xFF) << 16 | (byteBuffer.get(position + 2) & 0xFF) << 24, k);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }
    
    @Override
    public a i(final a a) {
        final int c = a.c;
        if (!M.z0(c)) {
            throw new b.b(a);
        }
        if (c != 4) {
            return new a(a.a, a.b, 4);
        }
        return e0.b.a.e;
    }
}
