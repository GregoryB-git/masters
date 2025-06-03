// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import x1.B;
import O1.P;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.io.Serializable;

public final class a implements Serializable
{
    public static final a q;
    private static final long serialVersionUID = 1L;
    public final String o;
    public final String p;
    
    static {
        q = new a(null);
    }
    
    public a(final String s, String s2) {
        Intrinsics.checkNotNullParameter(s2, "applicationId");
        this.o = s2;
        s2 = s;
        if (P.c0(s)) {
            s2 = null;
        }
        this.p = s2;
    }
    
    public a(final a a) {
        Intrinsics.checkNotNullParameter(a, "accessToken");
        this(a.l(), B.m());
    }
    
    private final Object writeReplace() {
        return new b(this.p, this.o);
    }
    
    public final String a() {
        return this.p;
    }
    
    public final String b() {
        return this.o;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = o instanceof a;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final P a = P.a;
        final a a2 = (a)o;
        boolean b3 = b2;
        if (P.e(a2.p, this.p)) {
            b3 = b2;
            if (P.e(a2.o, this.o)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public int hashCode() {
        final String p = this.p;
        int hashCode;
        if (p == null) {
            hashCode = 0;
        }
        else {
            hashCode = p.hashCode();
        }
        return hashCode ^ this.o.hashCode();
    }
    
    public static final class a
    {
    }
    
    public static final class b implements Serializable
    {
        public static final a q;
        private static final long serialVersionUID = -2488473066578201069L;
        public final String o;
        public final String p;
        
        static {
            q = new a(null);
        }
        
        public b(final String o, final String p2) {
            Intrinsics.checkNotNullParameter(p2, "appId");
            this.o = o;
            this.p = p2;
        }
        
        private final Object readResolve() {
            return new y1.a(this.o, this.p);
        }
        
        public static final class a
        {
        }
    }
}
