// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L0;

import java.util.List;
import java.util.Collections;
import d0.q;
import g0.z;
import F0.T;

public final class a extends e
{
    public static final int[] e;
    public boolean b;
    public boolean c;
    public int d;
    
    static {
        e = new int[] { 5512, 11025, 22050, 44100 };
    }
    
    public a(final T t) {
        super(t);
    }
    
    @Override
    public boolean b(final z z) {
        if (!this.b) {
            final int g = z.G();
            final int d = g >> 4 & 0xF;
            q.b b;
            if ((this.d = d) == 2) {
                b = new q.b().o0("audio/mpeg").N(1).p0(a.e[g >> 2 & 0x3]);
            }
            else if (d != 7 && d != 8) {
                if (d == 10) {
                    return this.b = true;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Audio format not supported: ");
                sb.append(this.d);
                throw new e.a(sb.toString());
            }
            else {
                String s;
                if (d == 7) {
                    s = "audio/g711-alaw";
                }
                else {
                    s = "audio/g711-mlaw";
                }
                b = new q.b().o0(s).N(1).p0(8000);
            }
            super.a.d(b.K());
            this.c = true;
            return this.b = true;
        }
        z.U(1);
        return true;
    }
    
    @Override
    public boolean c(final z z, final long n) {
        if (this.d == 2) {
            final int a = z.a();
            super.a.e(z, a);
            super.a.b(n, 1, a, 0, null);
            return true;
        }
        final int g = z.G();
        if (g == 0 && !this.c) {
            final int a2 = z.a();
            final byte[] o = new byte[a2];
            z.l(o, 0, a2);
            final F0.a.b e = F0.a.e(o);
            super.a.d(new q.b().o0("audio/mp4a-latm").O(e.c).N(e.b).p0(e.a).b0(Collections.singletonList(o)).K());
            this.c = true;
            return false;
        }
        if (this.d == 10 && g != 1) {
            return false;
        }
        final int a3 = z.a();
        super.a.e(z, a3);
        super.a.b(n, 1, a3, 0, null);
        return true;
    }
}
