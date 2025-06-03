// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import java.util.Set;
import java.util.Collection;
import W5.m;
import java.util.List;
import T1.a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.HashMap;
import java.io.Serializable;

public final class G implements Serializable
{
    public static final a p;
    private static final long serialVersionUID = 20160629001L;
    public final HashMap o;
    
    static {
        p = new a(null);
    }
    
    public G() {
        this.o = new HashMap();
    }
    
    public G(final HashMap m) {
        Intrinsics.checkNotNullParameter(m, "appEventMap");
        (this.o = new HashMap()).putAll(m);
    }
    
    private final Object writeReplace() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            return new b(this.o);
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public final void a(final y1.a a, final List list) {
        if (a.d(this)) {
            return;
        }
        while (true) {
            try {
                Intrinsics.checkNotNullParameter(a, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(list, "appEvents");
                if (!this.o.containsKey(a)) {
                    this.o.put(a, m.I(list));
                    return;
                }
                final List list2 = this.o.get(a);
                if (list2 == null) {
                    return;
                }
                list2.addAll(list);
                return;
                final Throwable t;
                a.b(t, this);
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final Set b() {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            final Set entrySet = this.o.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
            return entrySet;
        }
        finally {
            final Throwable t;
            T1.a.b(t, this);
            return null;
        }
    }
    
    public static final class a
    {
    }
    
    public static final class b implements Serializable
    {
        public static final a p;
        private static final long serialVersionUID = 20160629001L;
        public final HashMap o;
        
        static {
            p = new a(null);
        }
        
        public b(final HashMap o) {
            Intrinsics.checkNotNullParameter(o, "proxyEvents");
            this.o = o;
        }
        
        private final Object readResolve() {
            return new G(this.o);
        }
        
        public static final class a
        {
        }
    }
}
