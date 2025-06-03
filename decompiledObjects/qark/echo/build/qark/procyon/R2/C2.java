// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.List;
import com.google.android.gms.internal.measurement.Q7;
import com.google.android.gms.internal.measurement.T7;

public final class C2 implements T7
{
    public final /* synthetic */ x2 a;
    
    public C2(final x2 a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Q7 q7, final String s, final List list, final boolean b, final boolean b2) {
        final int n = E2.a[q7.ordinal()];
        a2 a2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        a2 = this.a.j().J();
                    }
                    else {
                        a2 = this.a.j().K();
                    }
                }
                else {
                    final Y1 j = this.a.j();
                    if (b) {
                        a2 = j.N();
                    }
                    else if (!b2) {
                        a2 = j.M();
                    }
                    else {
                        a2 = j.L();
                    }
                }
            }
            else {
                final Y1 i = this.a.j();
                if (b) {
                    a2 = i.I();
                }
                else if (!b2) {
                    a2 = i.H();
                }
                else {
                    a2 = i.G();
                }
            }
        }
        else {
            a2 = this.a.j().F();
        }
        final int size = list.size();
        if (size == 1) {
            a2.b(s, list.get(0));
            return;
        }
        if (size == 2) {
            a2.c(s, list.get(0), list.get(1));
            return;
        }
        if (size != 3) {
            a2.a(s);
            return;
        }
        a2.d(s, list.get(0), list.get(1), list.get(2));
    }
}
