// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class S7 extends n
{
    public boolean q;
    public boolean r;
    public final /* synthetic */ P7 s;
    
    public S7(final P7 s, final boolean q, final boolean r) {
        this.s = s;
        super("log");
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final s b(final f3 f3, List emptyList) {
        C2.k("log", 1, emptyList);
        if (emptyList.size() == 1) {
            P7.h(this.s).a(Q7.r, f3.b(emptyList.get(0)).g(), Collections.emptyList(), this.q, this.r);
        }
        else {
            final Q7 c = Q7.c(C2.i(f3.b(emptyList.get(0)).f()));
            final String g = f3.b(emptyList.get(1)).g();
            final int size = emptyList.size();
            int i = 2;
            T7 t7;
            if (size == 2) {
                t7 = P7.h(this.s);
                emptyList = Collections.emptyList();
            }
            else {
                final ArrayList<s> list = new ArrayList<s>();
                while (i < Math.min(emptyList.size(), 5)) {
                    list.add((s)f3.b(emptyList.get(i)).g());
                    ++i;
                }
                t7 = P7.h(this.s);
                emptyList = list;
            }
            t7.a(c, g, emptyList, this.q, this.r);
        }
        return com.google.android.gms.internal.measurement.s.d;
    }
}
