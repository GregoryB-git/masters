/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.Queue
 */
package V2;

import V2.G;
import V2.j;
import java.util.ArrayDeque;
import java.util.Queue;

public final class H {
    public final Object a = new Object();
    public Queue b;
    public boolean c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(G g8) {
        Object object = this.a;
        synchronized (object) {
            try {
                if (this.b == null) {
                    this.b = new ArrayDeque();
                }
                this.b.add((Object)g8);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void b(j var1_1) {
        var2_4 = this.a;
        // MONITORENTER : var2_4
        if (this.b == null || this.c) {
            // MONITOREXIT : var2_4
            return;
        }
        this.c = true;
        // MONITOREXIT : var2_4
        do lbl-1000: // 2 sources:
        {
            var2_4 = this.a;
            // MONITORENTER : var2_4
            var3_5 = (G)this.b.poll();
            if (var3_5 == null) {
                this.c = false;
                // MONITOREXIT : var2_4
                return;
            }
            // MONITOREXIT : var2_4
            break;
        } while (true);
        catch (Throwable var1_2) {
            throw var1_2;
        }
        {
            var3_5.c(var1_1);
            ** while (true)
        }
    }
}

