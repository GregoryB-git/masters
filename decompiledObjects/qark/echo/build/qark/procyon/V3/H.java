// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.HashSet;
import Y3.m;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class H implements i
{
    public static H b;
    public final HashMap a;
    
    static {
        H.b = new H();
    }
    
    public H() {
        this.a = new HashMap();
    }
    
    public static H b() {
        return H.b;
    }
    
    @Override
    public void a(final h h) {
        this.d(h);
    }
    
    public void c(final h h) {
        final HashMap a = this.a;
        // monitorenter(a)
        while (true) {
            try {
                List<h> value;
                if ((value = this.a.get(h)) == null) {
                    value = new ArrayList<h>();
                    this.a.put(h, value);
                }
                value.add(h);
                if (!h.e().f()) {
                    final h a2 = h.a(a4.i.a(h.e().e()));
                    List<h> value2;
                    if ((value2 = this.a.get(a2)) == null) {
                        value2 = new ArrayList<h>();
                        this.a.put(a2, value2);
                    }
                    value2.add(h);
                }
                h.j(true);
                h.k(this);
                // monitorexit(a)
                return;
                // monitorexit(a)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final void d(final h h) {
        HashMap a;
        Object a2;
        boolean b = false;
        int n;
        int n2 = 0;
        boolean b2;
        List list;
        Label_0071_Outer:Label_0093_Outer:Label_0107_Outer:Label_0159_Outer:
        while (true) {
            a = this.a;
            // monitorenter(a)
            while (true) {
            Label_0256:
                while (true) {
                    Label_0250: {
                        while (true) {
                        Label_0239:
                            while (true) {
                            Label_0234:
                                while (true) {
                                    Label_0227: {
                                        while (true) {
                                            try {
                                                a2 = this.a.get(h);
                                                b = true;
                                                n = 0;
                                                if (a2 != null) {
                                                    n2 = 0;
                                                    if (n2 >= ((List)a2).size()) {
                                                        break Label_0234;
                                                    }
                                                    if (((List)a2).get(n2) != h) {
                                                        break Label_0227;
                                                    }
                                                    ((List)a2).remove(n2);
                                                    n2 = 1;
                                                    if (((List)a2).isEmpty()) {
                                                        this.a.remove(h);
                                                    }
                                                    break Label_0239;
                                                }
                                                else {
                                                    if (!h.g()) {
                                                        b2 = b;
                                                        m.f(b2);
                                                        if (!h.e().f()) {
                                                            a2 = h.a(a4.i.a(h.e().e()));
                                                            list = this.a.get(a2);
                                                            if (list != null) {
                                                                n2 = n;
                                                                if (n2 < list.size()) {
                                                                    if (list.get(n2) != h) {
                                                                        break Label_0256;
                                                                    }
                                                                    list.remove(n2);
                                                                }
                                                                if (list.isEmpty()) {
                                                                    this.a.remove(a2);
                                                                }
                                                            }
                                                        }
                                                        // monitorexit(a)
                                                        return;
                                                    }
                                                    break Label_0250;
                                                }
                                                // monitorexit(a)
                                                throw h;
                                            }
                                            finally {
                                                continue;
                                            }
                                            break;
                                        }
                                    }
                                    ++n2;
                                    continue Label_0071_Outer;
                                }
                                n2 = 0;
                                continue Label_0093_Outer;
                            }
                            b2 = b;
                            if (n2 == 0) {
                                continue Label_0107_Outer;
                            }
                            break;
                        }
                        continue Label_0159_Outer;
                    }
                    b2 = false;
                    continue Label_0159_Outer;
                }
                ++n2;
                continue;
            }
        }
    }
    
    public void e(final h key) {
        while (true) {
            final HashMap a = this.a;
            // monitorenter(a)
            while (true) {
                int n = 0;
                Label_0135: {
                    while (true) {
                        try {
                            final List<h> list = this.a.get(key);
                            if (list != null && !list.isEmpty()) {
                                if (key.e().f()) {
                                    final HashSet<a4.i> set = new HashSet<a4.i>();
                                    n = list.size() - 1;
                                    if (n >= 0) {
                                        final h h = list.get(n);
                                        if (!set.contains(h.e())) {
                                            set.add(h.e());
                                            h.l();
                                        }
                                        break Label_0135;
                                    }
                                }
                                else {
                                    list.get(0).l();
                                }
                            }
                            // monitorexit(a)
                            return;
                            // monitorexit(a)
                            throw null;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                --n;
                continue;
            }
        }
    }
}
