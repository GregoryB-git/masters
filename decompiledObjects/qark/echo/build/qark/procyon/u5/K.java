// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package u5;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import t5.b;
import java.nio.ByteBuffer;
import android.view.KeyEvent;
import java.util.HashMap;
import E5.c;

public class K implements d
{
    public final E5.c a;
    public final HashMap b;
    public final HashMap c;
    public final b d;
    
    public K(final E5.c a) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new L.b();
        this.a = a;
        final M.e[] a2 = M.a();
        for (int length = a2.length, i = 0; i < length; ++i) {
            final M.e value = a2[i];
            this.c.put(value.c, value);
        }
    }
    
    public static G.b e(final KeyEvent keyEvent) {
        final boolean b = keyEvent.getRepeatCount() > 0;
        final int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return G.b.q;
            }
            throw new AssertionError((Object)"Unexpected event type");
        }
        else {
            if (b) {
                return G.b.r;
            }
            return G.b.p;
        }
    }
    
    public static long j(final long n, final long n2) {
        return (n & 0xFFFFFFFFL) | n2;
    }
    
    @Override
    public void a(final KeyEvent keyEvent, final a a) {
        if (!this.i(keyEvent, a)) {
            this.q(true, 0L, 0L, 0L);
            a.a(true);
        }
    }
    
    public final Long f(final KeyEvent keyEvent) {
        final Long n = M.b.get((long)keyEvent.getKeyCode());
        if (n != null) {
            return n;
        }
        return j(keyEvent.getKeyCode(), 73014444032L);
    }
    
    public final Long g(final KeyEvent keyEvent) {
        final long l = keyEvent.getScanCode();
        int n;
        if (l == 0L) {
            n = keyEvent.getKeyCode();
        }
        else {
            final Long n2 = M.a.get(l);
            if (n2 != null) {
                return n2;
            }
            n = keyEvent.getScanCode();
        }
        return j(n, 73014444032L);
    }
    
    public Map h() {
        return Collections.unmodifiableMap((Map<?, ?>)this.b);
    }
    
    public final boolean i(final KeyEvent keyEvent, final a a) {
        if (keyEvent.getScanCode() == 0 && keyEvent.getKeyCode() == 0) {
            return false;
        }
        final Long g = this.g(keyEvent);
        final Long f = this.f(keyEvent);
        final ArrayList<Runnable> list = new ArrayList<Runnable>();
        final M.d[] c = M.c;
        for (int length = c.length, i = 0; i < length; ++i) {
            final M.d d = c[i];
            this.o(d, (keyEvent.getMetaState() & d.a) != 0x0, f, g, keyEvent, list);
        }
        for (final M.e e : this.c.values()) {
            this.p(e, (keyEvent.getMetaState() & e.a) != 0x0, f, keyEvent);
        }
        final int action = keyEvent.getAction();
        boolean b;
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            b = false;
        }
        else {
            b = true;
        }
        final Long n = this.b.get(g);
        final Long n2 = null;
        G.b q = null;
        String string = null;
        Label_0363: {
            if (b) {
                G.b b2 = null;
                Label_0287: {
                    if (n != null) {
                        if (keyEvent.getRepeatCount() > 0) {
                            b2 = G.b.r;
                            break Label_0287;
                        }
                        this.q(false, n, g, keyEvent.getEventTime());
                    }
                    b2 = G.b.p;
                }
                final char charValue = this.d.a(keyEvent.getUnicodeChar());
                q = b2;
                if (charValue != '\0') {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(charValue);
                    string = sb.toString();
                    q = b2;
                    break Label_0363;
                }
            }
            else {
                if (n == null) {
                    return false;
                }
                q = G.b.q;
            }
            string = null;
        }
        if (q != G.b.r) {
            Long n3 = n2;
            if (b) {
                n3 = f;
            }
            this.r(g, n3);
        }
        if (q == G.b.p) {
            final M.e e2 = this.c.get(f);
            if (e2 != null) {
                e2.d ^= true;
            }
        }
        final G g2 = new G();
        final int source = keyEvent.getSource();
        G.a f2;
        if (source != 513) {
            if (source != 1025) {
                if (source != 16777232) {
                    if (source != 33554433) {
                        f2 = G.a.p;
                    }
                    else {
                        f2 = G.a.t;
                    }
                }
                else {
                    f2 = G.a.s;
                }
            }
            else {
                f2 = G.a.r;
            }
        }
        else {
            f2 = G.a.q;
        }
        g2.f = f2;
        g2.a = keyEvent.getEventTime();
        g2.b = q;
        g2.d = f;
        g2.c = g;
        g2.g = string;
        g2.e = false;
        g2.f = G.a.p;
        this.n(g2, a);
        final Iterator<Runnable> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().run();
        }
        return true;
    }
    
    public final void n(final G g, final a a) {
        Object o;
        if (a == null) {
            o = null;
        }
        else {
            o = new H(a);
        }
        this.a.f("flutter/keydata", g.a(), (E5.c.b)o);
    }
    
    public void o(final M.d d, final boolean b, final long n, final long n2, final KeyEvent keyEvent, final ArrayList list) {
        final M.c[] b2 = d.b;
        final boolean[] array = new boolean[b2.length];
        final Boolean[] array2 = new Boolean[b2.length];
        final int n3 = 0;
        int n5;
        int n4 = n5 = 0;
        while (true) {
            final M.c[] b3 = d.b;
            final int length = b3.length;
            final boolean b4 = true;
            if (n5 >= length) {
                break;
            }
            final M.c c = b3[n5];
            final boolean containsKey = this.b.containsKey(c.a);
            array[n5] = containsKey;
            Label_0260: {
                int n7;
                if (c.b == n) {
                    final int n6 = K$a.a[e(keyEvent).ordinal()];
                    if (n6 != 1) {
                        if (n6 == 2) {
                            array2[n5] = array[n5];
                            break Label_0260;
                        }
                        if (n6 != 3) {
                            break Label_0260;
                        }
                        if (!b) {
                            list.add(new J(this, c, keyEvent));
                        }
                        array2[n5] = array[n5];
                        n7 = (b4 ? 1 : 0);
                    }
                    else {
                        array2[n5] = Boolean.FALSE;
                        n7 = (b4 ? 1 : 0);
                        if (!b) {
                            list.add(new I(this, c, n2, keyEvent));
                            n7 = (b4 ? 1 : 0);
                        }
                    }
                }
                else {
                    n7 = (b4 ? 1 : 0);
                    if (n4 == 0) {
                        if (containsKey) {
                            n7 = (b4 ? 1 : 0);
                        }
                        else {
                            n7 = 0;
                        }
                    }
                }
                n4 = n7;
            }
            ++n5;
        }
        int j;
        if (b) {
            for (int i = 0; i < d.b.length; ++i) {
                if (array2[i] == null) {
                    if (n4 != 0) {
                        array2[i] = array[i];
                    }
                    else {
                        array2[i] = Boolean.TRUE;
                        n4 = 1;
                    }
                }
            }
            j = n3;
            if (n4 == 0) {
                array2[0] = Boolean.TRUE;
                j = n3;
            }
        }
        else {
            int n8 = 0;
            while (true) {
                j = n3;
                if (n8 >= d.b.length) {
                    break;
                }
                if (array2[n8] == null) {
                    array2[n8] = Boolean.FALSE;
                }
                ++n8;
            }
        }
        while (j < d.b.length) {
            if (array[j] != array2[j]) {
                final M.c c2 = d.b[j];
                this.q(array2[j], c2.b, c2.a, keyEvent.getEventTime());
            }
            ++j;
        }
    }
    
    public void p(final M.e e, final boolean b, final long n, final KeyEvent keyEvent) {
        if (e.c == n) {
            return;
        }
        if (e.d != b) {
            final boolean containsKey = this.b.containsKey(e.b);
            final boolean b2 = containsKey ^ true;
            if (b2) {
                e.d ^= true;
            }
            this.q(b2, e.c, e.b, keyEvent.getEventTime());
            if (!b2) {
                e.d ^= true;
            }
            this.q(containsKey, e.c, e.b, keyEvent.getEventTime());
        }
    }
    
    public final void q(final boolean b, Long n, final Long n2, final long a) {
        final G g = new G();
        g.a = a;
        G.b b2;
        if (b) {
            b2 = G.b.p;
        }
        else {
            b2 = G.b.q;
        }
        g.b = b2;
        g.d = n;
        g.c = n2;
        g.g = null;
        g.e = true;
        g.f = G.a.p;
        if (n2 != 0L && n != 0L) {
            if (!b) {
                n = null;
            }
            this.r(n2, n);
        }
        this.n(g, null);
    }
    
    public void r(final Long n, final Long value) {
        if (value != null) {
            if (this.b.put(n, value) == null) {
                return;
            }
            throw new AssertionError((Object)"The key was not empty");
        }
        else {
            if (this.b.remove(n) != null) {
                return;
            }
            throw new AssertionError((Object)"The key was empty");
        }
    }
}
