// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Map;
import java.util.Collection;

public abstract class i
{
    public static b a(final Object o) {
        return new b(o.getClass().getSimpleName(), null);
    }
    
    public static final class b
    {
        public final String a;
        public final a b;
        public a c;
        public boolean d;
        public boolean e;
        
        public b(final String s) {
            final a a = new a();
            this.b = a;
            this.c = a;
            this.d = false;
            this.e = false;
            this.a = (String)m.j(s);
        }
        
        public static boolean d(final Object o) {
            final boolean b = o instanceof CharSequence;
            final boolean b2 = false;
            boolean b3 = false;
            if (b) {
                if (((CharSequence)o).length() == 0) {
                    b3 = true;
                }
                return b3;
            }
            if (o instanceof Collection) {
                return ((Collection)o).isEmpty();
            }
            if (o instanceof Map) {
                return ((Map)o).isEmpty();
            }
            if (o instanceof l) {
                return ((l)o).c() ^ true;
            }
            boolean b4 = b2;
            if (o.getClass().isArray()) {
                b4 = b2;
                if (Array.getLength(o) == 0) {
                    b4 = true;
                }
            }
            return b4;
        }
        
        public final a a() {
            final a a = new a();
            this.c.c = a;
            return this.c = a;
        }
        
        public final b b(final Object b) {
            this.a().b = b;
            return this;
        }
        
        public b c(final Object o) {
            return this.b(o);
        }
        
        @Override
        public String toString() {
            final boolean d = this.d;
            final boolean e = this.e;
            final StringBuilder sb = new StringBuilder(32);
            sb.append(this.a);
            sb.append('{');
            a a = this.b.c;
            String str = "";
            while (a != null) {
                final Object b = a.b;
                String s = null;
                Label_0189: {
                    if (b == null) {
                        s = str;
                        if (d) {
                            break Label_0189;
                        }
                    }
                    else if (e) {
                        s = str;
                        if (d(b)) {
                            break Label_0189;
                        }
                    }
                    sb.append(str);
                    final String a2 = a.a;
                    if (a2 != null) {
                        sb.append(a2);
                        sb.append('=');
                    }
                    if (b != null && b.getClass().isArray()) {
                        final String deepToString = Arrays.deepToString(new Object[] { b });
                        sb.append(deepToString, 1, deepToString.length() - 1);
                    }
                    else {
                        sb.append(b);
                    }
                    s = ", ";
                }
                a = a.c;
                str = s;
            }
            sb.append('}');
            return sb.toString();
        }
        
        public static class a
        {
            public String a;
            public Object b;
            public a c;
        }
    }
}
