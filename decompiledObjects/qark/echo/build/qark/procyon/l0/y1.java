// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l0;

import k0.g0;
import java.util.Objects;
import g0.a;
import android.media.metrics.LogSessionId;
import g0.M;

public final class y1
{
    public static final y1 d;
    public final String a;
    public final a b;
    public final Object c;
    
    static {
        y1 d2;
        if (M.a < 31) {
            d2 = new y1("");
        }
        else {
            d2 = new y1(a.b, "");
        }
        d = d2;
    }
    
    public y1(final LogSessionId logSessionId, final String s) {
        this(new a(logSessionId), s);
    }
    
    public y1(final String a) {
        g0.a.f(M.a < 31);
        this.a = a;
        this.b = null;
        this.c = new Object();
    }
    
    public y1(final a b, final String a) {
        this.b = b;
        this.a = a;
        this.c = new Object();
    }
    
    public LogSessionId a() {
        return ((a)g0.a.e(this.b)).a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y1)) {
            return false;
        }
        final y1 y1 = (y1)o;
        return Objects.equals(this.a, y1.a) && Objects.equals(this.b, y1.b) && Objects.equals(this.c, y1.c);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
    
    public static final class a
    {
        public static final a b;
        public final LogSessionId a;
        
        static {
            b = new a(g0.a());
        }
        
        public a(final LogSessionId a) {
            this.a = a;
        }
    }
}
