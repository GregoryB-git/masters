// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k5;

import E5.j;
import E5.c;
import java.util.Iterator;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import E5.k;
import A5.a;

public class F implements a, c
{
    public static Map c;
    public static List d;
    public k a;
    public E b;
    
    static {
        F.d = new ArrayList();
    }
    
    public final void a(final String s, final Object... a) {
        final Iterator<F> iterator = F.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a.c(s, new ArrayList(Arrays.asList(a)));
        }
    }
    
    @Override
    public void onAttachedToEngine(final b b) {
        final E5.c b2 = b.b();
        (this.a = new k(b2, "com.ryanheise.audio_session")).e((k.c)this);
        this.b = new E(b.a(), b2);
        F.d.add(this);
    }
    
    @Override
    public void onDetachedFromEngine(final b b) {
        this.a.e(null);
        this.a = null;
        this.b.b();
        this.b = null;
        F.d.remove(this);
    }
    
    @Override
    public void onMethodCall(final j j, final d d) {
        final List list = (List)j.b;
        final String a = j.a;
        a.hashCode();
        if (a.equals("setConfiguration")) {
            F.c = list.get(0);
            d.a(null);
            this.a("onConfigurationChanged", F.c);
            return;
        }
        if (!a.equals("getConfiguration")) {
            d.c();
            return;
        }
        d.a(F.c);
    }
}
