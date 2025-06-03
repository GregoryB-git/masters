// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z0;

import c1.t;
import d1.a;
import d1.c;
import c1.l;
import java.util.Objects;
import d0.q;
import c1.h;

public interface g
{
    public static final g a = new g() {
        public final h b = new h();
        
        @Override
        public boolean a(final q q) {
            final String n = q.n;
            return this.b.a(q) || Objects.equals(n, "application/cea-608") || Objects.equals(n, "application/x-mp4-cea-608") || Objects.equals(n, "application/cea-708");
        }
        
        @Override
        public l b(final q q) {
            final String n = q.n;
            if (n != null) {
                final int hashCode = n.hashCode();
                int n2 = -1;
                switch (hashCode) {
                    case 1566016562: {
                        if (!n.equals("application/cea-708")) {
                            break;
                        }
                        n2 = 2;
                        break;
                    }
                    case 1566015601: {
                        if (!n.equals("application/cea-608")) {
                            break;
                        }
                        n2 = 1;
                        break;
                    }
                    case 930165504: {
                        if (!n.equals("application/x-mp4-cea-608")) {
                            break;
                        }
                        n2 = 0;
                        break;
                    }
                }
                switch (n2) {
                    case 2: {
                        return new c(q.G, q.q);
                    }
                    case 0:
                    case 1: {
                        return new a(n, q.G, 16000L);
                    }
                }
            }
            if (this.b.a(q)) {
                final t b = this.b.b(q);
                final StringBuilder sb = new StringBuilder();
                sb.append(b.getClass().getSimpleName());
                sb.append("Decoder");
                return new b(sb.toString(), b);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Attempted to create decoder for unsupported MIME type: ");
            sb2.append(n);
            throw new IllegalArgumentException(sb2.toString());
        }
    };
    
    boolean a(final q p0);
    
    l b(final q p0);
}
