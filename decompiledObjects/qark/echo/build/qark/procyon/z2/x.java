// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package z2;

import android.os.Bundle;
import android.os.Looper;
import android.os.DeadObjectException;
import java.util.Collection;
import A2.m;
import V2.k;
import android.os.Message;
import A2.c;
import android.util.Log;
import android.app.PendingIntent;
import A2.n;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import y2.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import y2.d;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y2.a;
import java.util.Queue;
import y2.e;

public final class x implements a, b
{
    public final Queue b;
    public final y2.a.f c;
    public final z2.b d;
    public final o e;
    public final Set f;
    public final Map g;
    public final int h;
    public final M i;
    public boolean j;
    public final List k;
    public x2.b l;
    public int m;
    public final /* synthetic */ z2.e n;
    
    public x(final z2.e n, final y2.d d) {
        this.n = n;
        this.b = new LinkedList();
        this.f = new HashSet();
        this.g = new HashMap();
        this.k = new ArrayList();
        this.l = null;
        this.m = 0;
        final y2.a.f g = d.g(z2.e.r(n).getLooper(), this);
        this.c = g;
        this.d = d.d();
        this.e = new o();
        this.h = d.f();
        if (g.m()) {
            this.i = d.h(z2.e.q(n), z2.e.r(n));
            return;
        }
        this.i = null;
    }
    
    public final void C() {
        A2.n.c(z2.e.r(this.n));
        this.l = null;
    }
    
    public final void D() {
        A2.n.c(z2.e.r(this.n));
        if (this.c.a()) {
            return;
        }
        if (this.c.i()) {
            return;
        }
        while (true) {
            Label_0227: {
                try {
                    final z2.e n = this.n;
                    final int b = z2.e.y(n).b(z2.e.q(n), this.c);
                    if (b != 0) {
                        final x2.b b2 = new x2.b(b, null);
                        final String name = this.c.getClass().getName();
                        final String string = b2.toString();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("The service for ");
                        sb.append(name);
                        sb.append(" is not available: ");
                        sb.append(string);
                        Log.w("GoogleApiManager", sb.toString());
                        this.G(b2, null);
                        return;
                    }
                }
                catch (IllegalStateException ex) {
                    break Label_0227;
                }
                final z2.e n2 = this.n;
                final y2.a.f c = this.c;
                final B b3 = new B(n2, c, this.d);
                if (c.m()) {
                    ((M)A2.n.i(this.i)).c1(b3);
                }
                x2.b b4;
                try {
                    this.c.p(b3);
                    return;
                }
                catch (SecurityException ex) {
                    b4 = new x2.b(10);
                }
                final IllegalStateException ex;
                this.G(b4, ex);
                return;
            }
            x2.b b4 = new x2.b(10);
            continue;
        }
    }
    
    public final void E(final T t) {
        A2.n.c(z2.e.r(this.n));
        if (this.c.a()) {
            if (this.l(t)) {
                this.i();
                return;
            }
            this.b.add(t);
        }
        else {
            this.b.add(t);
            final x2.b l = this.l;
            if (l != null && l.g()) {
                this.G(this.l, null);
                return;
            }
            this.D();
        }
    }
    
    public final void F() {
        ++this.m;
    }
    
    public final void G(final x2.b l, final Exception ex) {
        A2.n.c(z2.e.r(this.n));
        final M i = this.i;
        if (i != null) {
            i.d1();
        }
        this.C();
        z2.e.y(this.n).c();
        this.c(l);
        if (this.c instanceof C2.e && l.a() != 24) {
            z2.e.C(this.n, true);
            final z2.e n = this.n;
            z2.e.r(n).sendMessageDelayed(z2.e.r(n).obtainMessage(19), 300000L);
        }
        if (l.a() == 4) {
            this.d(z2.e.t());
            return;
        }
        if (this.b.isEmpty()) {
            this.l = l;
            return;
        }
        if (ex != null) {
            A2.n.c(z2.e.r(this.n));
            this.e(null, ex, false);
            return;
        }
        if (!z2.e.e(this.n)) {
            this.d(z2.e.u(this.d, l));
            return;
        }
        this.e(z2.e.u(this.d, l), null, true);
        if (this.b.isEmpty()) {
            return;
        }
        if (this.m(l)) {
            return;
        }
        if (!this.n.g(l, this.h)) {
            if (l.a() == 18) {
                this.j = true;
            }
            if (this.j) {
                final z2.e n2 = this.n;
                z2.e.r(n2).sendMessageDelayed(Message.obtain(z2.e.r(n2), 9, (Object)this.d), z2.e.n(this.n));
                return;
            }
            this.d(z2.e.u(this.d, l));
        }
    }
    
    public final void H(final x2.b obj) {
        A2.n.c(z2.e.r(this.n));
        final y2.a.f c = this.c;
        final String name = c.getClass().getName();
        final String value = String.valueOf(obj);
        final StringBuilder sb = new StringBuilder();
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(value);
        c.f(sb.toString());
        this.G(obj, null);
    }
    
    public final void I() {
        A2.n.c(z2.e.r(this.n));
        if (this.j) {
            this.D();
        }
    }
    
    public final void J() {
        A2.n.c(z2.e.r(this.n));
        this.d(z2.e.F);
        this.e.d();
        final Set keySet = this.g.keySet();
        int i = 0;
        for (h[] array = (h[])keySet.toArray(new h[0]); i < array.length; ++i) {
            final h h = array[i];
            this.E(new S(null, new k()));
        }
        this.c(new x2.b(4));
        if (this.c.a()) {
            this.c.b(new w(this));
        }
    }
    
    public final void K() {
        A2.n.c(z2.e.r(this.n));
        if (this.j) {
            this.k();
            final z2.e n = this.n;
            Status status;
            if (z2.e.s(n).g(z2.e.q(n)) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            }
            else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            this.d(status);
            this.c.f("Timing out connection while resuming.");
        }
    }
    
    public final boolean L() {
        return this.c.m();
    }
    
    public final boolean a() {
        return this.p(true);
    }
    
    public final x2.d b(final x2.d[] array) {
        if (array != null) {
            if (array.length == 0) {
                return null;
            }
            final x2.d[] j = this.c.j();
            final int n = 0;
            x2.d[] array2;
            if ((array2 = j) == null) {
                array2 = new x2.d[0];
            }
            final int length = array2.length;
            final t.a a = new t.a(length);
            for (int i = 0; i < length; ++i) {
                final x2.d d = array2[i];
                a.put(d.a(), d.d());
            }
            for (int length2 = array.length, k = n; k < length2; ++k) {
                final x2.d d2 = array[k];
                final Long n2 = a.get(d2.a());
                if (n2 == null) {
                    return d2;
                }
                if (n2 < d2.d()) {
                    return d2;
                }
            }
        }
        return null;
    }
    
    public final void c(final x2.b b) {
        final Iterator<Object> iterator = this.f.iterator();
        if (iterator.hasNext()) {
            android.support.v4.media.a.a(iterator.next());
            if (A2.m.a(b, x2.b.s)) {
                this.c.k();
            }
            throw null;
        }
        this.f.clear();
    }
    
    public final void d(final Status status) {
        A2.n.c(z2.e.r(this.n));
        this.e(status, null, false);
    }
    
    public final void e(final Status status, final Exception ex, final boolean b) {
        A2.n.c(z2.e.r(this.n));
        int n = true ? 1 : 0;
        final boolean b2 = status == null;
        if (ex != null) {
            n = (false ? 1 : 0);
        }
        if ((b2 ? 1 : 0) != n) {
            final Iterator iterator = this.b.iterator();
            while (iterator.hasNext()) {
                final T t = iterator.next();
                if (!b || t.a == 2) {
                    if (status != null) {
                        t.a(status);
                    }
                    else {
                        t.b(ex);
                    }
                    iterator.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }
    
    public final void f() {
        final ArrayList<Object> list = new ArrayList<Object>(this.b);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final T t = list.get(i);
            if (!this.c.a()) {
                return;
            }
            if (this.l(t)) {
                this.b.remove(t);
            }
        }
    }
    
    public final void g() {
        this.C();
        this.c(x2.b.s);
        this.k();
        final Iterator<Object> iterator = this.g.values().iterator();
        if (!iterator.hasNext()) {
            this.f();
            this.i();
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    public final void h(final int n) {
        this.C();
        this.j = true;
        this.e.c(n, this.c.l());
        final z2.e n2 = this.n;
        z2.e.r(n2).sendMessageDelayed(Message.obtain(z2.e.r(n2), 9, (Object)this.d), z2.e.n(this.n));
        final z2.e n3 = this.n;
        z2.e.r(n3).sendMessageDelayed(Message.obtain(z2.e.r(n3), 11, (Object)this.d), z2.e.o(this.n));
        z2.e.y(this.n).c();
        final Iterator<Object> iterator = this.g.values().iterator();
        if (!iterator.hasNext()) {
            return;
        }
        android.support.v4.media.a.a(iterator.next());
        throw null;
    }
    
    public final void i() {
        z2.e.r(this.n).removeMessages(12, (Object)this.d);
        final z2.e n = this.n;
        z2.e.r(n).sendMessageDelayed(z2.e.r(n).obtainMessage(12, (Object)this.d), z2.e.p(this.n));
    }
    
    public final void j(final T t) {
        t.d(this.e, this.L());
        while (true) {
            try {
                t.c(this);
                return;
                this.n(1);
                this.c.f("DeadObjectException thrown while running ApiCallRunner.");
            }
            catch (DeadObjectException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void k() {
        if (this.j) {
            z2.e.r(this.n).removeMessages(11, (Object)this.d);
            z2.e.r(this.n).removeMessages(9, (Object)this.d);
            this.j = false;
        }
    }
    
    public final boolean l(final T t) {
        if (!(t instanceof F)) {
            this.j(t);
            return true;
        }
        final F f = (F)t;
        final x2.d b = this.b(f.g(this));
        if (b == null) {
            this.j(t);
            return true;
        }
        final String name = this.c.getClass().getName();
        final String a = b.a();
        final long d = b.d();
        final StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(a);
        sb.append(", ");
        sb.append(d);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (z2.e.e(this.n) && f.f(this)) {
            final z z = new z(this.d, b, null);
            final int index = this.k.indexOf(z);
            if (index >= 0) {
                final z z2 = this.k.get(index);
                z2.e.r(this.n).removeMessages(15, (Object)z2);
                final z2.e n = this.n;
                z2.e.r(n).sendMessageDelayed(Message.obtain(z2.e.r(n), 15, (Object)z2), z2.e.n(this.n));
            }
            else {
                this.k.add(z);
                final z2.e n2 = this.n;
                z2.e.r(n2).sendMessageDelayed(Message.obtain(z2.e.r(n2), 15, (Object)z), z2.e.n(this.n));
                final z2.e n3 = this.n;
                z2.e.r(n3).sendMessageDelayed(Message.obtain(z2.e.r(n3), 16, (Object)z), z2.e.o(this.n));
                final x2.b b2 = new x2.b(2, null);
                if (!this.m(b2)) {
                    this.n.g(b2, this.h);
                }
            }
            return false;
        }
        f.b(new g(b));
        return true;
    }
    
    public final boolean m(final x2.b b) {
        final Object z = z2.e.z();
        // monitorenter(z)
        while (true) {
            try {
                final z2.e n = this.n;
                if (z2.e.v(n) != null && z2.e.B(n).contains(this.d)) {
                    z2.e.v(this.n).s(b, this.h);
                    // monitorexit(z)
                    return true;
                }
                // monitorexit(z)
                return false;
                // monitorexit(z)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void n(final int n) {
        if (Looper.myLooper() == z2.e.r(this.n).getLooper()) {
            this.h(n);
            return;
        }
        z2.e.r(this.n).post((Runnable)new u(this, n));
    }
    
    @Override
    public final void o(final x2.b b) {
        this.G(b, null);
    }
    
    public final boolean p(final boolean b) {
        A2.n.c(z2.e.r(this.n));
        if (!this.c.a() || this.g.size() != 0) {
            return false;
        }
        if (this.e.e()) {
            if (b) {
                this.i();
            }
            return false;
        }
        this.c.f("Timing out service connection.");
        return true;
    }
    
    public final int q() {
        return this.h;
    }
    
    public final int r() {
        return this.m;
    }
    
    public final y2.a.f t() {
        return this.c;
    }
    
    @Override
    public final void v(final Bundle bundle) {
        if (Looper.myLooper() == z2.e.r(this.n).getLooper()) {
            this.g();
            return;
        }
        z2.e.r(this.n).post((Runnable)new t(this));
    }
    
    public final Map w() {
        return this.g;
    }
}
