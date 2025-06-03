// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Collection;
import android.view.View;
import I.s;
import java.util.List;
import android.util.Log;
import E.c;
import U.b;
import java.util.ArrayList;
import android.view.ViewGroup;

public abstract class B
{
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    
    public B(final ViewGroup a) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = false;
        this.e = false;
        this.a = a;
    }
    
    public static B n(final ViewGroup viewGroup, final n n) {
        return o(viewGroup, n.x0());
    }
    
    public static B o(final ViewGroup viewGroup, final C c) {
        final Object tag = ((View)viewGroup).getTag(U.b.b);
        if (tag instanceof B) {
            return (B)tag;
        }
        final B a = c.a(viewGroup);
        ((View)viewGroup).setTag(U.b.b, (Object)a);
        return a;
    }
    
    public final void a(final c c, final b b, final t t) {
        final ArrayList b2 = this.b;
        // monitorenter(b2)
        while (true) {
            try {
                final E.c c2 = new E.c();
                final e h = this.h(t.k());
                if (h != null) {
                    h.k(c, b);
                    // monitorexit(b2)
                    return;
                }
                final d e = new d(c, b, t, c2);
                this.b.add(e);
                ((e)e).a(new Runnable() {
                    @Override
                    public void run() {
                        if (B.this.b.contains(e)) {
                            ((e)e).e().c(((e)e).f().V);
                        }
                    }
                });
                ((e)e).a(new Runnable() {
                    @Override
                    public void run() {
                        B.this.b.remove(e);
                        B.this.c.remove(e);
                    }
                });
                // monitorexit(b2)
                return;
                // monitorexit(b2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void b(final c c, final t t) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing add operation for fragment ");
            sb.append(t.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(c, B.e.b.p, t);
    }
    
    public void c(final t t) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
            sb.append(t.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(B.e.c.q, B.e.b.o, t);
    }
    
    public void d(final t t) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
            sb.append(t.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(B.e.c.o, B.e.b.q, t);
    }
    
    public void e(final t t) {
        if (n.D0(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: Enqueuing show operation for fragment ");
            sb.append(t.k());
            Log.v("FragmentManager", sb.toString());
        }
        this.a(B.e.c.p, B.e.b.o, t);
    }
    
    public abstract void f(final List p0, final boolean p1);
    
    public void g() {
        if (this.e) {
            return;
        }
        if (!s.t((View)this.a)) {
            this.j();
            this.d = false;
            return;
        }
        final ArrayList b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                if (!this.b.isEmpty()) {
                    final ArrayList<e> list = new ArrayList<e>(this.c);
                    this.c.clear();
                    for (final e e : list) {
                        if (n.D0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: Cancelling operation ");
                            sb.append(e);
                            Log.v("FragmentManager", sb.toString());
                        }
                        e.b();
                        if (!e.i()) {
                            this.c.add(e);
                        }
                    }
                    this.q();
                    final ArrayList<e> c = new ArrayList<e>(this.b);
                    this.b.clear();
                    this.c.addAll(c);
                    final Iterator<e> iterator2 = c.iterator();
                    while (iterator2.hasNext()) {
                        iterator2.next().l();
                    }
                    this.f(c, this.d);
                    this.d = false;
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public final e h(final Fragment fragment) {
        for (final e e : this.b) {
            if (e.f().equals(fragment) && !e.h()) {
                return e;
            }
        }
        return null;
    }
    
    public final e i(final Fragment fragment) {
        for (final e e : this.c) {
            if (e.f().equals(fragment) && !e.h()) {
                return e;
            }
        }
        return null;
    }
    
    public void j() {
        final boolean t = s.t((View)this.a);
        final ArrayList b = this.b;
        // monitorenter(b)
        while (true) {
            try {
                this.q();
                final Iterator<e> iterator = this.b.iterator();
                while (iterator.hasNext()) {
                    iterator.next().l();
                }
                for (final e obj : new ArrayList<e>(this.c)) {
                    if (n.D0(2)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        String string;
                        if (t) {
                            string = "";
                        }
                        else {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.a);
                            sb2.append(" is not attached to window. ");
                            string = sb2.toString();
                        }
                        sb.append(string);
                        sb.append("Cancelling running operation ");
                        sb.append(obj);
                        Log.v("FragmentManager", sb.toString());
                    }
                    obj.b();
                }
                for (final e obj2 : new ArrayList<e>(this.b)) {
                    if (n.D0(2)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("SpecialEffectsController: ");
                        String string2;
                        if (t) {
                            string2 = "";
                        }
                        else {
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append("Container ");
                            sb4.append(this.a);
                            sb4.append(" is not attached to window. ");
                            string2 = sb4.toString();
                        }
                        sb3.append(string2);
                        sb3.append("Cancelling pending operation ");
                        sb3.append(obj2);
                        Log.v("FragmentManager", sb3.toString());
                    }
                    obj2.b();
                }
                // monitorexit(b)
                return;
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void k() {
        if (this.e) {
            this.e = false;
            this.g();
        }
    }
    
    public b l(final t t) {
        final e h = this.h(t.k());
        if (h != null) {
            return h.g();
        }
        final e i = this.i(t.k());
        if (i != null) {
            return i.g();
        }
        return null;
    }
    
    public ViewGroup m() {
        return this.a;
    }
    
    public void p() {
        while (true) {
            final ArrayList b = this.b;
            // monitorenter(b)
            while (true) {
                int index = 0;
                Label_0104: {
                    while (true) {
                        try {
                            this.q();
                            this.e = false;
                            index = this.b.size() - 1;
                            if (index >= 0) {
                                final e e = this.b.get(index);
                                final c h = B.e.c.h(e.f().V);
                                final c e2 = e.e();
                                final c p = B.e.c.p;
                                if (e2 != p || h == p) {
                                    break Label_0104;
                                }
                                this.e = e.f().a0();
                            }
                            // monitorexit(b)
                            return;
                            // monitorexit(b)
                            throw;
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                --index;
                continue;
            }
        }
    }
    
    public final void q() {
        for (final e e : this.b) {
            if (e.g() == B.e.b.p) {
                e.k(B.e.c.e(e.f().q1().getVisibility()), B.e.b.o);
            }
        }
    }
    
    public void r(final boolean d) {
        this.d = d;
    }
    
    public static class d extends e
    {
        public final t h;
        
        public d(final c c, final b b, final t h, final E.c c2) {
            super(c, b, h.k(), c2);
            this.h = h;
        }
        
        @Override
        public void c() {
            super.c();
            this.h.m();
        }
        
        @Override
        public void l() {
            final Fragment k = this.h.k();
            final View focus = k.V.findFocus();
            if (focus != null) {
                k.x1(focus);
                if (n.D0(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Saved focused view ");
                    sb.append(focus);
                    sb.append(" for Fragment ");
                    sb.append(k);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            if (((e)this).g() == B.e.b.p) {
                final View q1 = ((e)this).f().q1();
                if (q1.getParent() == null) {
                    this.h.b();
                    q1.setAlpha(0.0f);
                }
                if (q1.getAlpha() == 0.0f && q1.getVisibility() == 0) {
                    q1.setVisibility(4);
                }
                q1.setAlpha(k.G());
            }
        }
    }
    
    public abstract static class e
    {
        public c a;
        public b b;
        public final Fragment c;
        public final List d;
        public final HashSet e;
        public boolean f;
        public boolean g;
        
        public e(final c a, final b b, final Fragment c, final E.c c2) {
            this.d = new ArrayList();
            this.e = new HashSet();
            this.f = false;
            this.g = false;
            this.a = a;
            this.b = b;
            this.c = c;
            c2.c((E.c.b)new E.c.b() {
                @Override
                public void a() {
                    B.e.this.b();
                }
            });
        }
        
        public final void a(final Runnable runnable) {
            this.d.add(runnable);
        }
        
        public final void b() {
            if (this.h()) {
                return;
            }
            this.f = true;
            if (this.e.isEmpty()) {
                this.c();
                return;
            }
            final Iterator<E.c> iterator = new ArrayList<E.c>(this.e).iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
        
        public void c() {
            if (this.g) {
                return;
            }
            if (n.D0(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("SpecialEffectsController: ");
                sb.append(this);
                sb.append(" has called complete.");
                Log.v("FragmentManager", sb.toString());
            }
            this.g = true;
            final Iterator<Runnable> iterator = this.d.iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
        }
        
        public final void d(final E.c o) {
            if (this.e.remove(o) && this.e.isEmpty()) {
                this.c();
            }
        }
        
        public c e() {
            return this.a;
        }
        
        public final Fragment f() {
            return this.c;
        }
        
        public b g() {
            return this.b;
        }
        
        public final boolean h() {
            return this.f;
        }
        
        public final boolean i() {
            return this.g;
        }
        
        public final void j(final E.c e) {
            this.l();
            this.e.add(e);
        }
        
        public final void k(final c c, final b b) {
            final int n = B$c.b[b.ordinal()];
            b b2;
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        return;
                    }
                    if (this.a != B.e.c.o) {
                        if (androidx.fragment.app.n.D0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("SpecialEffectsController: For fragment ");
                            sb.append(this.c);
                            sb.append(" mFinalState = ");
                            sb.append(this.a);
                            sb.append(" -> ");
                            sb.append(c);
                            sb.append(". ");
                            Log.v("FragmentManager", sb.toString());
                        }
                        this.a = c;
                    }
                    return;
                }
                else {
                    if (androidx.fragment.app.n.D0(2)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: For fragment ");
                        sb2.append(this.c);
                        sb2.append(" mFinalState = ");
                        sb2.append(this.a);
                        sb2.append(" -> REMOVED. mLifecycleImpact  = ");
                        sb2.append(this.b);
                        sb2.append(" to REMOVING.");
                        Log.v("FragmentManager", sb2.toString());
                    }
                    this.a = B.e.c.o;
                    b2 = B.e.b.q;
                }
            }
            else {
                if (this.a != B.e.c.o) {
                    return;
                }
                if (androidx.fragment.app.n.D0(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: For fragment ");
                    sb3.append(this.c);
                    sb3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb3.append(this.b);
                    sb3.append(" to ADDING.");
                    Log.v("FragmentManager", sb3.toString());
                }
                this.a = B.e.c.p;
                b2 = B.e.b.p;
            }
            this.b = b2;
        }
        
        public abstract void l();
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Operation ");
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("} ");
            sb.append("{");
            sb.append("mFinalState = ");
            sb.append(this.a);
            sb.append("} ");
            sb.append("{");
            sb.append("mLifecycleImpact = ");
            sb.append(this.b);
            sb.append("} ");
            sb.append("{");
            sb.append("mFragment = ");
            sb.append(this.c);
            sb.append("}");
            return sb.toString();
        }
        
        public enum b
        {
            o("NONE", 0), 
            p("ADDING", 1), 
            q("REMOVING", 2);
            
            public b(final String name, final int ordinal) {
            }
        }
        
        public enum c
        {
            o("REMOVED", 0), 
            p("VISIBLE", 1), 
            q("GONE", 2), 
            r("INVISIBLE", 3);
            
            public c(final String name, final int ordinal) {
            }
            
            public static c e(final int i) {
                if (i == 0) {
                    return c.p;
                }
                if (i == 4) {
                    return c.r;
                }
                if (i == 8) {
                    return c.q;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown visibility ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            
            public static c h(final View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return c.r;
                }
                return e(view.getVisibility());
            }
            
            public void c(final View view) {
                final int n = B$c.a[this.ordinal()];
                if (n != 1) {
                    int visibility;
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                return;
                            }
                            if (androidx.fragment.app.n.D0(2)) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("SpecialEffectsController: Setting view ");
                                sb.append(view);
                                sb.append(" to INVISIBLE");
                                Log.v("FragmentManager", sb.toString());
                            }
                            view.setVisibility(4);
                            return;
                        }
                        else {
                            if (androidx.fragment.app.n.D0(2)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("SpecialEffectsController: Setting view ");
                                sb2.append(view);
                                sb2.append(" to GONE");
                                Log.v("FragmentManager", sb2.toString());
                            }
                            visibility = 8;
                        }
                    }
                    else {
                        if (androidx.fragment.app.n.D0(2)) {
                            final StringBuilder sb3 = new StringBuilder();
                            sb3.append("SpecialEffectsController: Setting view ");
                            sb3.append(view);
                            sb3.append(" to VISIBLE");
                            Log.v("FragmentManager", sb3.toString());
                        }
                        visibility = 0;
                    }
                    view.setVisibility(visibility);
                    return;
                }
                final ViewGroup obj = (ViewGroup)view.getParent();
                if (obj != null) {
                    if (androidx.fragment.app.n.D0(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Removing view ");
                        sb4.append(view);
                        sb4.append(" from container ");
                        sb4.append(obj);
                        Log.v("FragmentManager", sb4.toString());
                    }
                    obj.removeView(view);
                }
            }
        }
    }
}
