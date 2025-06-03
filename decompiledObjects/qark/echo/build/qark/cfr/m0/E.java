/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioAttributes
 *  android.media.AudioFormat
 *  android.media.AudioManager
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package m0;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import d0.b;
import d0.q;
import d0.z;
import g0.M;
import m0.D;
import m0.F;
import m0.N;
import m0.k;

public final class E
implements N.d {
    public final Context a;
    public Boolean b;

    public E(Context context) {
        this.a = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public k a(q q8, d0.b b8) {
        g0.a.e(q8);
        g0.a.e(b8);
        int n8 = M.a;
        if (n8 < 29 || q8.C == -1) return k.d;
        boolean bl = this.b(this.a);
        int n9 = z.f((String)g0.a.e(q8.n), q8.j);
        if (n9 == 0 || n8 < M.K(n9)) return k.d;
        int n10 = M.M(q8.B);
        if (n10 == 0) {
            return k.d;
        }
        try {
            q8 = M.L(q8.C, n10, n9);
            b8 = b8.a().a;
            if (n8 < 31) return a.a((AudioFormat)q8, (AudioAttributes)b8, bl);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return k.d;
        }
        return b.a((AudioFormat)q8, (AudioAttributes)b8, bl);
    }

    public final boolean b(Context object) {
        Boolean bl = this.b;
        if (bl != null) {
            return bl;
        }
        if (object != null && (object = (AudioManager)object.getSystemService("audio")) != null) {
            boolean bl2 = (object = object.getParameters("offloadVariableRateSupported")) != null && object.equals((Object)"offloadVariableRateSupported=1");
            object = bl2;
        } else {
            object = Boolean.FALSE;
        }
        this.b = object;
        return this.b;
    }

    public static final abstract class a {
        public static k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean bl) {
            if (!D.a(audioFormat, audioAttributes)) {
                return k.d;
            }
            return new k.b().e(true).g(bl).d();
        }
    }

    public static final abstract class b {
        public static k a(AudioFormat object, AudioAttributes audioAttributes, boolean bl) {
            int n8 = F.a((AudioFormat)object, audioAttributes);
            if (n8 == 0) {
                return k.d;
            }
            object = new k.b();
            boolean bl2 = M.a > 32 && n8 == 2;
            return object.e(true).f(bl2).g(bl).d();
        }
    }

}

