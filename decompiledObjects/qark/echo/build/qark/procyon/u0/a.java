// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u0;

import T0.h;
import Q0.b;
import V0.c;
import d0.q;

public interface a
{
    public static final a a = new a() {
        @Override
        public boolean a(final q q) {
            final String n = q.n;
            return "application/id3".equals(n) || "application/x-emsg".equals(n) || "application/x-scte35".equals(n) || "application/x-icy".equals(n) || "application/vnd.dvb.ait".equals(n);
        }
        
        @Override
        public O0.a b(final q q) {
            final String n = q.n;
            if (n != null) {
                final int hashCode = n.hashCode();
                int n2 = -1;
                switch (hashCode) {
                    case 1652648887: {
                        if (!n.equals("application/x-scte35")) {
                            break;
                        }
                        n2 = 4;
                        break;
                    }
                    case 1154383568: {
                        if (!n.equals("application/x-emsg")) {
                            break;
                        }
                        n2 = 3;
                        break;
                    }
                    case -1248341703: {
                        if (!n.equals("application/id3")) {
                            break;
                        }
                        n2 = 2;
                        break;
                    }
                    case -1348231605: {
                        if (!n.equals("application/x-icy")) {
                            break;
                        }
                        n2 = 1;
                        break;
                    }
                    case -1354451219: {
                        if (!n.equals("application/vnd.dvb.ait")) {
                            break;
                        }
                        n2 = 0;
                        break;
                    }
                }
                switch (n2) {
                    case 4: {
                        return new c();
                    }
                    case 3: {
                        return new b();
                    }
                    case 2: {
                        return new h();
                    }
                    case 1: {
                        return new S0.a();
                    }
                    case 0: {
                        return new P0.b();
                    }
                }
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Attempted to create decoder for unsupported MIME type: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
    };
    
    boolean a(final q p0);
    
    O0.a b(final q p0);
}
