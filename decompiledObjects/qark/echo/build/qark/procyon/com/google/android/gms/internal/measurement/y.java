// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class y extends A
{
    public y() {
        super.a.add(Z.t);
        super.a.add(Z.u);
        super.a.add(Z.v);
        super.a.add(Z.w);
        super.a.add(Z.x);
        super.a.add(Z.y);
        super.a.add(Z.z);
    }
    
    @Override
    public final s b(final String s, final f3 f3, final List list) {
        switch (B.a[C2.c(s).ordinal()]) {
            default: {
                return super.a(s);
            }
            case 7: {
                C2.f(Z.z, 2, list);
                return new k((double)(C2.i(f3.b(list.get(0)).f()) ^ C2.i(f3.b(list.get(1)).f())));
            }
            case 6: {
                C2.f(Z.y, 2, list);
                return new k(Double.valueOf(C2.m(f3.b(list.get(0)).f()) >>> (int)(C2.m(f3.b(list.get(1)).f()) & 0x1FL)));
            }
            case 5: {
                C2.f(Z.x, 2, list);
                return new k((double)(C2.i(f3.b(list.get(0)).f()) >> (int)(C2.m(f3.b(list.get(1)).f()) & 0x1FL)));
            }
            case 4: {
                C2.f(Z.w, 2, list);
                return new k((double)(C2.i(f3.b(list.get(0)).f()) | C2.i(f3.b(list.get(1)).f())));
            }
            case 3: {
                C2.f(Z.v, 1, list);
                return new k((double)C2.i(f3.b(list.get(0)).f()));
            }
            case 2: {
                C2.f(Z.u, 2, list);
                return new k((double)(C2.i(f3.b(list.get(0)).f()) << (int)(C2.m(f3.b(list.get(1)).f()) & 0x1FL)));
            }
            case 1: {
                C2.f(Z.t, 2, list);
                return new k((double)(C2.i(f3.b(list.get(0)).f()) & C2.i(f3.b(list.get(1)).f())));
            }
        }
    }
}
