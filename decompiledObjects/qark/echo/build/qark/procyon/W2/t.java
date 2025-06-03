// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.io.Serializable;

public abstract class t
{
    public static s a(final s s) {
        if (s instanceof b) {
            return s;
        }
        if (s instanceof a) {
            return s;
        }
        if (s instanceof Serializable) {
            return new a(s);
        }
        return new b(s);
    }
    
    public static s b(final Object o) {
        return new c(o);
    }
    
    public static class a implements s, Serializable
    {
        private static final long serialVersionUID = 0L;
        public final s o;
        public transient volatile boolean p;
        public transient Object q;
        
        public a(final s s) {
            this.o = (s)m.j(s);
        }
        
        @Override
        public Object get() {
            while (true) {
                if (!this.p) {
                    // monitorenter(this)
                    while (true) {
                        try {
                            if (!this.p) {
                                final Object value = this.o.get();
                                this.q = value;
                                this.p = true;
                                // monitorexit(this)
                                return value;
                            }
                            // monitorexit(this)
                            return j.a(this.q);
                        }
                        // monitorexit(this)
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            Object obj;
            if (this.p) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("<supplier that returned ");
                sb2.append(this.q);
                sb2.append(">");
                obj = sb2.toString();
            }
            else {
                obj = this.o;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static class b implements s
    {
        public static final s q;
        public volatile s o;
        public Object p;
        
        static {
            q = new u();
        }
        
        public b(final s s) {
            this.o = (s)m.j(s);
        }
        
        @Override
        public Object get() {
            final s o = this.o;
            final s q = b.q;
            while (true) {
                if (o != q) {
                    // monitorenter(this)
                    while (true) {
                        try {
                            if (this.o != q) {
                                final Object value = this.o.get();
                                this.p = value;
                                this.o = q;
                                // monitorexit(this)
                                return value;
                            }
                            // monitorexit(this)
                            return j.a(this.p);
                        }
                        // monitorexit(this)
                        finally {}
                        continue;
                    }
                }
                continue;
            }
        }
        
        @Override
        public String toString() {
            final s o = this.o;
            final StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            Object string = o;
            if (o == b.q) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("<supplier that returned ");
                sb2.append(this.p);
                sb2.append(">");
                string = sb2.toString();
            }
            sb.append(string);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static class c implements s, Serializable
    {
        private static final long serialVersionUID = 0L;
        public final Object o;
        
        public c(final Object o) {
            this.o = o;
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof c && k.a(this.o, ((c)o).o);
        }
        
        @Override
        public Object get() {
            return this.o;
        }
        
        @Override
        public int hashCode() {
            return k.b(this.o);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.ofInstance(");
            sb.append(this.o);
            sb.append(")");
            return sb.toString();
        }
    }
}
