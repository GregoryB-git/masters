// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import java.util.Collection;
import k0.y0;
import g0.a;
import java.util.List;
import X2.v;

public final class i implements S
{
    public final v o;
    public long p;
    
    public i(final List list, final List list2) {
        final v.a m = v.M();
        final int size = list.size();
        final int size2 = list2.size();
        int i = 0;
        g0.a.a(size == size2);
        while (i < list.size()) {
            m.h(new a(list.get(i), list2.get(i)));
            ++i;
        }
        this.o = m.k();
        this.p = -9223372036854775807L;
    }
    
    @Override
    public boolean b() {
        for (int i = 0; i < this.o.size(); ++i) {
            if (((a)this.o.get(i)).b()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public long c() {
        int i = 0;
        long a = Long.MAX_VALUE;
        while (i < this.o.size()) {
            final long c = this.o.get(i).c();
            long min = a;
            if (c != Long.MIN_VALUE) {
                min = Math.min(a, c);
            }
            ++i;
            a = min;
        }
        long n = a;
        if (a == Long.MAX_VALUE) {
            n = Long.MIN_VALUE;
        }
        return n;
    }
    
    @Override
    public long f() {
        int i = 0;
        long a;
        long n = a = Long.MAX_VALUE;
        while (i < this.o.size()) {
            final a a2 = this.o.get(i);
            final long f = a2.f();
            long min = 0L;
            Label_0114: {
                if (!a2.a().contains(1) && !a2.a().contains(2)) {
                    min = n;
                    if (!a2.a().contains(4)) {
                        break Label_0114;
                    }
                }
                min = n;
                if (f != Long.MIN_VALUE) {
                    min = Math.min(n, f);
                }
            }
            long min2 = a;
            if (f != Long.MIN_VALUE) {
                min2 = Math.min(a, f);
            }
            ++i;
            n = min;
            a = min2;
        }
        if (n != Long.MAX_VALUE) {
            return this.p = n;
        }
        if (a != Long.MAX_VALUE) {
            final long p = this.p;
            if (p != -9223372036854775807L) {
                a = p;
            }
            return a;
        }
        return Long.MIN_VALUE;
    }
    
    @Override
    public boolean g(final y0 y0) {
        boolean b = false;
        boolean b2;
        boolean b5;
        do {
            final long c = this.c();
            if (c == Long.MIN_VALUE) {
                return b;
            }
            boolean b4;
            for (int i = (b2 = false) ? 1 : 0; i < this.o.size(); ++i, b2 = b4) {
                final long c2 = this.o.get(i).c();
                final boolean b3 = c2 != Long.MIN_VALUE && c2 <= y0.a;
                if (c2 != c) {
                    b4 = b2;
                    if (!b3) {
                        continue;
                    }
                }
                b4 = (b2 | this.o.get(i).g(y0));
            }
            b5 = (b |= b2);
        } while (b2);
        return b5;
    }
    
    @Override
    public void h(final long n) {
        for (int i = 0; i < this.o.size(); ++i) {
            ((a)this.o.get(i)).h(n);
        }
    }
    
    public static final class a implements S
    {
        public final S o;
        public final v p;
        
        public a(final S o, final List list) {
            this.o = o;
            this.p = v.U(list);
        }
        
        public v a() {
            return this.p;
        }
        
        @Override
        public boolean b() {
            return this.o.b();
        }
        
        @Override
        public long c() {
            return this.o.c();
        }
        
        @Override
        public long f() {
            return this.o.f();
        }
        
        @Override
        public boolean g(final y0 y0) {
            return this.o.g(y0);
        }
        
        @Override
        public void h(final long n) {
            this.o.h(n);
        }
    }
}
