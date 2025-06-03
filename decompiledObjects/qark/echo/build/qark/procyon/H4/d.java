// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H4;

import M4.b;
import java.util.Iterator;
import java.util.Map;
import N4.m;
import F4.a;

public final class d extends e
{
    public static final a b;
    public final m a;
    
    static {
        b = a.e();
    }
    
    public d(final m a) {
        this.a = a;
    }
    
    @Override
    public boolean c() {
        a a;
        StringBuilder sb;
        String str;
        if (!this.o(this.a, 0)) {
            a = d.b;
            sb = new StringBuilder();
            str = "Invalid Trace:";
        }
        else {
            if (!this.j(this.a) || this.h(this.a)) {
                return true;
            }
            a = d.b;
            sb = new StringBuilder();
            str = "Invalid Counters for Trace:";
        }
        sb.append(str);
        sb.append(this.a.r0());
        a.j(sb.toString());
        return false;
    }
    
    public final boolean g(final Map map) {
        for (final Map.Entry<String, V> entry : map.entrySet()) {
            try {
                e.d(entry.getKey(), (String)entry.getValue());
                continue;
            }
            catch (IllegalArgumentException ex) {
                d.b.j(ex.getLocalizedMessage());
                return false;
            }
            break;
        }
        return true;
    }
    
    public final boolean h(final m m) {
        return this.i(m, 0);
    }
    
    public final boolean i(final m m, final int n) {
        if (m == null) {
            return false;
        }
        a a = null;
        String string = null;
        Label_0018: {
            if (n <= 1) {
                for (final Map.Entry<String, V> entry : m.l0().entrySet()) {
                    StringBuilder sb;
                    if (!this.l(entry.getKey())) {
                        a = d.b;
                        sb = new StringBuilder();
                        sb.append("invalid CounterId:");
                        sb.append(entry.getKey());
                    }
                    else {
                        if (this.m((Long)entry.getValue())) {
                            continue;
                        }
                        a = d.b;
                        sb = new StringBuilder();
                        sb.append("invalid CounterValue:");
                        sb.append(entry.getValue());
                    }
                    string = sb.toString();
                    break Label_0018;
                }
                final Iterator<m> iterator2 = (Iterator<m>)m.t0().iterator();
                while (iterator2.hasNext()) {
                    if (!this.i(iterator2.next(), n + 1)) {
                        return false;
                    }
                }
                return true;
            }
            a = d.b;
            string = "Exceed MAX_SUBTRACE_DEEP:1";
        }
        a.j(string);
        return false;
    }
    
    public final boolean j(final m m) {
        if (m.k0() > 0) {
            return true;
        }
        final Iterator<m> iterator = m.t0().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().k0() > 0) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean k(final m m) {
        return m.r0().startsWith("_st_");
    }
    
    public final boolean l(String trim) {
        if (trim == null) {
            return false;
        }
        trim = trim.trim();
        a a;
        if (trim.isEmpty()) {
            a = d.b;
            trim = "counterId is empty";
        }
        else {
            if (trim.length() <= 100) {
                return true;
            }
            a = d.b;
            trim = "counterId exceeded max length 100";
        }
        a.j(trim);
        return false;
    }
    
    public final boolean m(final Long n) {
        return n != null;
    }
    
    public final boolean n(final m m) {
        final Long n = m.l0().get(M4.b.s.toString());
        return n != null && n.compareTo(0L) > 0;
    }
    
    public final boolean o(final m m, final int n) {
        if (m == null) {
            d.b.j("TraceMetric is null");
            return false;
        }
        if (n > 1) {
            d.b.j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        if (!this.q(m.r0())) {
            final a b = d.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid TraceId:");
            sb.append(m.r0());
            b.j(sb.toString());
            return false;
        }
        if (!this.p(m)) {
            final a b2 = d.b;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid TraceDuration:");
            sb2.append(m.o0());
            b2.j(sb2.toString());
            return false;
        }
        if (!m.u0()) {
            d.b.j("clientStartTimeUs is null.");
            return false;
        }
        if (this.k(m) && !this.n(m)) {
            final a b3 = d.b;
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("non-positive totalFrames in screen trace ");
            sb3.append(m.r0());
            b3.j(sb3.toString());
            return false;
        }
        final Iterator<m> iterator = (Iterator<m>)m.t0().iterator();
        while (iterator.hasNext()) {
            if (!this.o(iterator.next(), n + 1)) {
                return false;
            }
        }
        return this.g(m.m0());
    }
    
    public final boolean p(final m m) {
        return m != null && m.o0() > 0L;
    }
    
    public final boolean q(String trim) {
        final boolean b = false;
        if (trim == null) {
            return false;
        }
        trim = trim.trim();
        boolean b2 = b;
        if (!trim.isEmpty()) {
            b2 = b;
            if (trim.length() <= 100) {
                b2 = true;
            }
        }
        return b2;
    }
}
