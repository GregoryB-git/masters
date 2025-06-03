// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.List;

public final class X5 extends r
{
    public final d p;
    
    public X5(final d p) {
        this.p = p;
    }
    
    @Override
    public final s s(String s, final f3 f3, final List list) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1570616835: {
                if (!s.equals("setEventName")) {
                    break;
                }
                n = 5;
                break;
            }
            case 920706790: {
                if (!s.equals("setParamValue")) {
                    break;
                }
                n = 4;
                break;
            }
            case 700587132: {
                if (!s.equals("getParams")) {
                    break;
                }
                n = 3;
                break;
            }
            case 146575578: {
                if (!s.equals("getParamValue")) {
                    break;
                }
                n = 2;
                break;
            }
            case 45521504: {
                if (!s.equals("getTimestamp")) {
                    break;
                }
                n = 1;
                break;
            }
            case 21624207: {
                if (!s.equals("getEventName")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return super.s(s, f3, list);
            }
            case 5: {
                C2.g("setEventName", 1, list);
                final s b = f3.b(list.get(0));
                if (!s.d.equals(b) && !s.e.equals(b)) {
                    this.p.d().f(b.g());
                    return new u(b.g());
                }
                throw new IllegalArgumentException("Illegal event name");
            }
            case 4: {
                C2.g("setParamValue", 2, list);
                s = f3.b(list.get(0)).g();
                final s b2 = f3.b(list.get(1));
                this.p.d().d(s, C2.d(b2));
                return b2;
            }
            case 3: {
                C2.g("getParams", 0, list);
                final Map g = this.p.d().g();
                final r r = new r();
                for (final String s2 : g.keySet()) {
                    r.a(s2, b4.b(g.get(s2)));
                }
                return r;
            }
            case 2: {
                C2.g("getParamValue", 1, list);
                s = f3.b(list.get(0)).g();
                return b4.b(this.p.d().b(s));
            }
            case 1: {
                C2.g("getTimestamp", 0, list);
                return new k(Double.valueOf(this.p.d().a()));
            }
            case 0: {
                C2.g("getEventName", 0, list);
                return new u(this.p.d().e());
            }
        }
    }
}
