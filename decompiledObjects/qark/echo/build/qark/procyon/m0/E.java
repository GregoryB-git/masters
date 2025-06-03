// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import android.media.AudioManager;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import d0.z;
import g0.M;
import g0.a;
import d0.b;
import d0.q;
import android.content.Context;

public final class E implements d
{
    public final Context a;
    public Boolean b;
    
    public E(final Context a) {
        this.a = a;
    }
    
    @Override
    public m0.k a(final q q, final d0.b b) {
        g0.a.e(q);
        g0.a.e(b);
        final int a = g0.M.a;
        Label_0145: {
            if (a < 29 || q.C == -1) {
                break Label_0145;
            }
            final boolean b2 = this.b(this.a);
            final int f = d0.z.f((String)g0.a.e(q.n), q.j);
            Label_0141: {
                if (f == 0 || a < g0.M.K(f)) {
                    break Label_0141;
                }
                final int m = g0.M.M(q.B);
                if (m == 0) {
                    return m0.k.d;
                }
                while (true) {
                    while (true) {
                        try {
                            final AudioFormat l = g0.M.L(q.C, m, f);
                            final AudioAttributes a2 = b.a().a;
                            if (a >= 31) {
                                return E.b.a(l, a2, b2);
                            }
                            return E.a.a(l, a2, b2);
                            return m0.k.d;
                            return m0.k.d;
                            return m0.k.d;
                        }
                        catch (IllegalArgumentException ex) {}
                        continue;
                    }
                }
            }
        }
    }
    
    public final boolean b(final Context context) {
        final Boolean b = this.b;
        if (b != null) {
            return b;
        }
        Boolean b2 = null;
        Label_0071: {
            if (context != null) {
                final AudioManager audioManager = (AudioManager)context.getSystemService("audio");
                if (audioManager != null) {
                    final String parameters = audioManager.getParameters("offloadVariableRateSupported");
                    b2 = (parameters != null && parameters.equals("offloadVariableRateSupported=1"));
                    break Label_0071;
                }
            }
            b2 = Boolean.FALSE;
        }
        this.b = b2;
        return this.b;
    }
    
    public abstract static final class a
    {
        public static m0.k a(final AudioFormat audioFormat, final AudioAttributes audioAttributes, final boolean b) {
            if (!D.a(audioFormat, audioAttributes)) {
                return m0.k.d;
            }
            return new m0.k.b().e(true).g(b).d();
        }
    }
    
    public abstract static final class b
    {
        public static m0.k a(final AudioFormat audioFormat, final AudioAttributes audioAttributes, final boolean b) {
            final int a = F.a(audioFormat, audioAttributes);
            if (a == 0) {
                return m0.k.d;
            }
            return new m0.k.b().e(true).f(M.a > 32 && a == 2).g(b).d();
        }
    }
}
