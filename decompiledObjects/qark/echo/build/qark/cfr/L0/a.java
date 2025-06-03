/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.List
 */
package L0;

import F0.T;
import F0.a;
import L0.e;
import d0.q;
import g0.z;
import java.util.Collections;
import java.util.List;

public final class a
extends e {
    public static final int[] e = new int[]{5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public a(T t8) {
        super(t8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean b(z var1_1) {
        block4 : {
            if (this.b) {
                var1_1.U(1);
                return true;
            }
            var2_2 = var1_1.G();
            this.d = var3_3 = var2_2 >> 4 & 15;
            if (var3_3 != 2) break block4;
            var2_2 = a.e[var2_2 >> 2 & 3];
            var1_1 = new q.b().o0("audio/mpeg").N(1).p0(var2_2);
            ** GOTO lbl20
        }
        if (var3_3 != 7 && var3_3 != 8) {
            if (var3_3 != 10) {
                var1_1 = new StringBuilder();
                var1_1.append("Audio format not supported: ");
                var1_1.append(this.d);
                throw new e.a(var1_1.toString());
            }
        } else {
            var1_1 = var3_3 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
            var1_1 = new q.b().o0((String)var1_1).N(1).p0(8000);
lbl20: // 2 sources:
            var1_1 = var1_1.K();
            this.a.d((q)var1_1);
            this.c = true;
        }
        this.b = true;
        return true;
    }

    @Override
    public boolean c(z object, long l8) {
        if (this.d == 2) {
            int n8 = object.a();
            this.a.e((z)object, n8);
            this.a.b(l8, 1, n8, 0, null);
            return true;
        }
        int n9 = object.G();
        if (n9 == 0 && !this.c) {
            n9 = object.a();
            byte[] arrby = new byte[n9];
            object.l(arrby, 0, n9);
            object = F0.a.e(arrby);
            object = new q.b().o0("audio/mp4a-latm").O(object.c).N(object.b).p0(object.a).b0(Collections.singletonList((Object)arrby)).K();
            this.a.d((q)object);
            this.c = true;
            return false;
        }
        if (this.d == 10 && n9 != 1) {
            return false;
        }
        n9 = object.a();
        this.a.e((z)object, n9);
        this.a.b(l8, 1, n9, 0, null);
        return true;
    }
}

