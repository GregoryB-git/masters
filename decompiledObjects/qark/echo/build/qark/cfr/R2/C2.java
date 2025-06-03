/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package R2;

import R2.E2;
import R2.Y1;
import R2.a2;
import R2.x2;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.T7;
import java.util.List;

public final class C2
implements T7 {
    public final /* synthetic */ x2 a;

    public C2(x2 x22) {
        this.a = x22;
    }

    @Override
    public final void a(Q7 object, String string2, List list, boolean bl, boolean bl2) {
        int n8 = E2.a[object.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    object = n8 != 4 ? this.a.j().J() : this.a.j().K();
                } else {
                    object = this.a.j();
                    object = bl ? object.N() : (!bl2 ? object.M() : object.L());
                }
            } else {
                object = this.a.j();
                object = bl ? object.I() : (!bl2 ? object.H() : object.G());
            }
        } else {
            object = this.a.j().F();
        }
        n8 = list.size();
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    object.a(string2);
                    return;
                }
                object.d(string2, list.get(0), list.get(1), list.get(2));
                return;
            }
            object.c(string2, list.get(0), list.get(1));
            return;
        }
        object.b(string2, list.get(0));
    }
}

