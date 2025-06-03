/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.lang.Object
 *  java.lang.System
 */
package F0;

import F0.s;
import T0.h;
import d0.x;
import g0.z;
import java.io.EOFException;

public final class G {
    public final z a = new z(10);

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public x a(s s8, h.a a8) {
        int n8;
        Object object;
        object = null;
        n8 = 0;
        do {
            s8.n(this.a.e(), 0, 10);
            break;
        } while (true);
        catch (EOFException eOFException) {}
        {
            this.a.T(0);
            if (this.a.J() == 4801587) {
                this.a.U(3);
                int n9 = this.a.F();
                int n10 = n9 + 10;
                if (object == null) {
                    object = new byte[n10];
                    System.arraycopy((Object)this.a.e(), (int)0, (Object)object, (int)0, (int)10);
                    s8.n((byte[])object, 10, n9);
                    object = new h(a8).e((byte[])object, n10);
                } else {
                    s8.o(n9);
                }
                n8 += n10;
                continue;
            }
        }
        s8.h();
        s8.o(n8);
        return object;
    }
}

