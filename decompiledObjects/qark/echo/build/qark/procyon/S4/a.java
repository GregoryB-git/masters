// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S4;

import W5.C;
import V5.o;
import java.util.Iterator;
import X5.d;
import kotlin.jvm.internal.g;
import y6.c;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a
{
    public static final a a;
    public static final Map b;
    
    static {
        a = new a();
        b = Collections.synchronizedMap(new LinkedHashMap<Object, Object>());
    }
    
    public final void a(final b.a obj) {
        Intrinsics.checkNotNullParameter(obj, "subscriberName");
        final Map b = S4.a.b;
        if (b.containsKey(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dependency ");
            sb.append(obj);
            sb.append(" already added.");
            Log.d("SessionsDependencies", sb.toString());
            return;
        }
        Intrinsics.checkNotNullExpressionValue(b, "dependencies");
        b.put(obj, new a(c.a(true), null, 2, null));
    }
    
    public final a b(final b.a obj) {
        final Map b = S4.a.b;
        Intrinsics.checkNotNullExpressionValue(b, "dependencies");
        final a value = b.get(obj);
        if (value != null) {
            Intrinsics.checkNotNullExpressionValue(value, "dependencies.getOrElse(s\u2026load time.\"\n      )\n    }");
            return value;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot get dependency ");
        sb.append(obj);
        sb.append(". Dependencies should be added at class load time.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Object c(final d d) {
        Z5.d d3 = null;
        Label_0047: {
            if (d instanceof a$b) {
                final Z5.d d2 = (a$b)d;
                final int w = d2.w;
                if ((w & Integer.MIN_VALUE) != 0x0) {
                    d2.w = w + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public Object r;
                public Object s;
                public Object t;
                public /* synthetic */ Object u;
                public final /* synthetic */ a v;
                public int w;
                
                @Override
                public final Object invokeSuspend(final Object u) {
                    this.u = u;
                    this.w |= Integer.MIN_VALUE;
                    return this.v.c(this);
                }
            };
        }
        final Object u = d3.u;
        final Object c = Y5.b.c();
        final int w2 = d3.w;
        Object t = null;
        Label_0324: {
            Iterator iterator;
            Z5.d d4;
            if (w2 != 0) {
                if (w2 == 1) {
                    t = d3.t;
                    final Map<Map<Map, b>, b> map = (Map<Map<Map, b>, b>)d3.s;
                    final a a = (a)d3.r;
                    final b.a q = (b.a)d3.q;
                    iterator = (Iterator)d3.p;
                    final Map map2 = (Map)d3.o;
                    o.b(u);
                    d4 = d3;
                    final Map<Map, b> map3 = (Map<Map, b>)map2;
                    break Label_0324;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                o.b(u);
                final Map b = S4.a.b;
                Intrinsics.checkNotNullExpressionValue(b, "dependencies");
                t = new LinkedHashMap<Map, b>(C.a(b.size()));
                iterator = b.entrySet().iterator();
                d4 = d3;
            }
            while (true) {
                if (!iterator.hasNext()) {
                    return t;
                }
                final Map.Entry<Object, V> entry = iterator.next();
                final Map<Map<Map, b>, b> key = entry.getKey();
                final b.a q = entry.getKey();
                final a a = ((a)entry.getValue()).a();
                d4.o = t;
                d4.p = iterator;
                d4.q = q;
                d4.r = a;
                d4.s = t;
                d4.t = key;
                d4.w = 1;
                if (a.a(null, d4) == c) {
                    return c;
                }
                final Map<Map, b> map3 = (Map<Map, b>)t;
                final Map<Map<Map, b>, b> map = (Map<Map<Map, b>, b>)t;
                t = key;
                try {
                    final b d5 = S4.a.a.d(q);
                    a.b(null);
                    map.put((Map<Map, b>)t, d5);
                    t = map3;
                    continue;
                }
                finally {
                    a.b(null);
                }
                break;
            }
        }
        return t;
    }
    
    public final b d(final b.a obj) {
        Intrinsics.checkNotNullParameter(obj, "subscriberName");
        final b b = this.b(obj).b();
        if (b != null) {
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Subscriber ");
        sb.append(obj);
        sb.append(" has not been registered.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final void e(final b b) {
        Intrinsics.checkNotNullParameter(b, "subscriber");
        final b.a a = b.a();
        final a b2 = this.b(a);
        if (b2.b() != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Subscriber ");
            sb.append(a);
            sb.append(" already registered.");
            Log.d("SessionsDependencies", sb.toString());
            return;
        }
        b2.c(b);
        y6.a.a.a(b2.a(), null, 1, null);
    }
    
    public static final class a
    {
        public final y6.a a;
        public b b;
        
        public a(final y6.a a, final b b) {
            Intrinsics.checkNotNullParameter(a, "mutex");
            this.a = a;
            this.b = b;
        }
        
        public final y6.a a() {
            return this.a;
        }
        
        public final b b() {
            return this.b;
        }
        
        public final void c(final b b) {
            this.b = b;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return Intrinsics.a(this.a, a.a) && Intrinsics.a(this.b, a.b);
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final b b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dependency(mutex=");
            sb.append(this.a);
            sb.append(", subscriber=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }
    }
}
