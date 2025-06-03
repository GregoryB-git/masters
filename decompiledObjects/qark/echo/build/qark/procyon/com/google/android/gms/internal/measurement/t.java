// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class t extends n implements m
{
    public final List q;
    public final List r;
    public f3 s;
    
    public t(final t t) {
        super(t.o);
        (this.q = new ArrayList(t.q.size())).addAll(t.q);
        (this.r = new ArrayList(t.r.size())).addAll(t.r);
        this.s = t.s;
    }
    
    public t(final String s, final List list, final List c, final f3 s2) {
        super(s);
        this.q = new ArrayList();
        this.s = s2;
        if (!list.isEmpty()) {
            final Iterator<s> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.q.add(iterator.next().g());
            }
        }
        this.r = new ArrayList(c);
    }
    
    @Override
    public final s b(final f3 f3, final List list) {
        final f3 d = this.s.d();
        for (int i = 0; i < this.q.size(); ++i) {
            String s;
            s s2;
            if (i < list.size()) {
                s = this.q.get(i);
                s2 = f3.b(list.get(i));
            }
            else {
                s = this.q.get(i);
                s2 = com.google.android.gms.internal.measurement.s.d;
            }
            d.e(s, s2);
        }
        for (final s s3 : this.r) {
            s s4;
            if ((s4 = d.b(s3)) instanceof v) {
                s4 = d.b(s3);
            }
            if (s4 instanceof l) {
                return ((l)s4).a();
            }
        }
        return com.google.android.gms.internal.measurement.s.d;
    }
    
    @Override
    public final s c() {
        return new t(this);
    }
}
