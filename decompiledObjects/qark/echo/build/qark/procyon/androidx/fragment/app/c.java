// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import I.q;
import android.graphics.Rect;
import java.util.HashMap;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import H.e;
import android.view.animation.Animation;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import t.a;
import I.s;
import I.v;
import android.view.View;
import java.util.Map;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup;

public class c extends B
{
    public c(final ViewGroup viewGroup) {
        super(viewGroup);
    }
    
    @Override
    public void f(final List c, final boolean b) {
        final Iterator<e> iterator = c.iterator();
        e e = null;
        e e2 = null;
        while (iterator.hasNext()) {
            final e e3 = iterator.next();
            final e.c h = B.e.c.h(e3.f().V);
            final int n = c$a.a[e3.e().ordinal()];
            if (n != 1 && n != 2 && n != 3) {
                if (n != 4) {
                    continue;
                }
                if (h == B.e.c.p) {
                    continue;
                }
                e2 = e3;
            }
            else {
                if (h != B.e.c.p || e != null) {
                    continue;
                }
                e = e3;
            }
        }
        final ArrayList<k> list = new ArrayList<k>();
        final ArrayList<m> list2 = new ArrayList<m>();
        final ArrayList<e> list3 = new ArrayList<e>(c);
        for (final e e4 : c) {
            final E.c c2 = new E.c();
            e4.j(c2);
            list.add(new k(e4, c2));
            final E.c c3 = new E.c();
            e4.j(c3);
            boolean b2 = false;
            Label_0256: {
                if (b) {
                    if (e4 != e) {
                        break Label_0256;
                    }
                }
                else if (e4 != e2) {
                    break Label_0256;
                }
                b2 = true;
            }
            list2.add(new m(e4, c3, b, b2));
            e4.a(new Runnable() {
                @Override
                public void run() {
                    if (list3.contains(e4)) {
                        list3.remove(e4);
                        c.this.s(e4);
                    }
                }
            });
        }
        final Map x = this.x(list2, b, e, e2);
        this.w(list, list3, x.containsValue(Boolean.TRUE), x);
        final Iterator<Object> iterator3 = list3.iterator();
        while (iterator3.hasNext()) {
            this.s(iterator3.next());
        }
        list3.clear();
    }
    
    public void s(final e e) {
        e.e().c(e.f().V);
    }
    
    public void t(final ArrayList list, View child) {
        Object e = child;
        if (child instanceof ViewGroup) {
            e = child;
            if (!v.a((ViewGroup)e)) {
                for (int childCount = ((ViewGroup)e).getChildCount(), i = 0; i < childCount; ++i) {
                    child = ((ViewGroup)e).getChildAt(i);
                    if (child.getVisibility() == 0) {
                        this.t(list, child);
                    }
                }
                return;
            }
        }
        list.add(e);
    }
    
    public void u(final Map map, final View view) {
        final String q = s.q(view);
        if (q != null) {
            map.put(q, view);
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child.getVisibility() == 0) {
                    this.u(map, child);
                }
            }
        }
    }
    
    public void v(final a a, final Collection collection) {
        final Iterator<Map.Entry<K, View>> iterator = (Iterator<Map.Entry<K, View>>)a.entrySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(s.q(iterator.next().getValue()))) {
                iterator.remove();
            }
        }
    }
    
    public final void w(final List list, final List list2, final boolean b, final Map map) {
        final ViewGroup m = this.m();
        final Context context = ((View)m).getContext();
        final ArrayList<k> list3 = new ArrayList<k>();
        final Iterator<k> iterator = list.iterator();
        boolean b2 = false;
        while (iterator.hasNext()) {
            final k e = iterator.next();
            if (!((l)e).d()) {
                final f.d e2 = e.e(context);
                if (e2 != null) {
                    final Animator b3 = e2.b;
                    if (b3 == null) {
                        list3.add(e);
                        continue;
                    }
                    final e b4 = ((l)e).b();
                    final Fragment f = b4.f();
                    if (Boolean.TRUE.equals(map.get(b4))) {
                        if (n.D0(2)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring Animator set on ");
                            sb.append(f);
                            sb.append(" as this Fragment was involved in a Transition.");
                            Log.v("FragmentManager", sb.toString());
                        }
                        ((l)e).a();
                        continue;
                    }
                    final boolean b5 = b4.e() == B.e.c.q;
                    if (b5) {
                        list2.remove(b4);
                    }
                    final View v = f.V;
                    m.startViewTransition(v);
                    b3.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                        public void onAnimationEnd(final Animator animator) {
                            m.endViewTransition(v);
                            if (b5) {
                                b4.e().c(v);
                            }
                            ((l)e).a();
                        }
                    });
                    b3.setTarget((Object)v);
                    b3.start();
                    ((l)e).c().c((E.c.b)new E.c.b() {
                        @Override
                        public void a() {
                            b3.end();
                        }
                    });
                    b2 = true;
                    continue;
                }
            }
            ((l)e).a();
        }
        for (final k k : list3) {
            final e b6 = ((l)k).b();
            final Fragment f2 = b6.f();
            Label_0403: {
                StringBuilder sb2;
                String str;
                if (b) {
                    if (!n.D0(2)) {
                        break Label_0403;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f2);
                    str = " as Animations cannot run alongside Transitions.";
                }
                else {
                    if (!b2) {
                        final View v2 = f2.V;
                        final Animation animation = (Animation)H.e.b(((f.d)H.e.b(k.e(context))).a);
                        if (b6.e() != B.e.c.o) {
                            v2.startAnimation(animation);
                            ((l)k).a();
                        }
                        else {
                            m.startViewTransition(v2);
                            final f.e e3 = new f.e(animation, m, v2);
                            ((Animation)e3).setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                                public void onAnimationEnd(final Animation animation) {
                                    ((View)m).post((Runnable)new Runnable() {
                                        @Override
                                        public void run() {
                                            final Animation$AnimationListener o = (Animation$AnimationListener)Animation$AnimationListener.this;
                                            m.endViewTransition(v2);
                                            ((l)k).a();
                                        }
                                    });
                                }
                                
                                public void onAnimationRepeat(final Animation animation) {
                                }
                                
                                public void onAnimationStart(final Animation animation) {
                                }
                            });
                            v2.startAnimation((Animation)e3);
                        }
                        ((l)k).c().c((E.c.b)new E.c.b() {
                            @Override
                            public void a() {
                                v2.clearAnimation();
                                m.endViewTransition(v2);
                                ((l)k).a();
                            }
                        });
                        continue;
                    }
                    if (!n.D0(2)) {
                        break Label_0403;
                    }
                    sb2 = new StringBuilder();
                    sb2.append("Ignoring Animation set on ");
                    sb2.append(f2);
                    str = " as Animations cannot run alongside Animators.";
                }
                sb2.append(str);
                Log.v("FragmentManager", sb2.toString());
            }
            ((l)k).a();
        }
    }
    
    public final Map x(final List list, final boolean b, final e e, final e e2) {
        e e3 = e;
        e e4 = e2;
        final HashMap<e, Boolean> hashMap = new HashMap<e, Boolean>();
        final Iterator<m> iterator = list.iterator();
        y y = null;
        while (iterator.hasNext()) {
            final m m = iterator.next();
            if (((l)m).d()) {
                continue;
            }
            final y e5 = m.e();
            if (y == null) {
                y = e5;
            }
            else {
                if (e5 == null) {
                    continue;
                }
                if (y == e5) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(((l)m).b().f());
                sb.append(" returned Transition ");
                sb.append(m.h());
                sb.append(" which uses a different Transition  type than other Fragments.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (y == null) {
            for (final m i : list) {
                hashMap.put(((l)i).b(), Boolean.FALSE);
                ((l)i).a();
            }
            return hashMap;
        }
        final View view = new View(((View)this.m()).getContext());
        final Rect rect = new Rect();
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        final a a = new a();
        final Iterator<m> iterator3 = list.iterator();
        Object o = null;
        final View view2 = null;
        int n = 0;
        final y y2 = y;
        View view3 = view2;
        while (iterator3.hasNext()) {
            final m j = iterator3.next();
            if (j.i() && e3 != null && e4 != null) {
                final Object b2 = y2.B(y2.g(j.g()));
                final ArrayList n2 = e2.f().N();
                final ArrayList n3 = e.f().N();
                final ArrayList o2 = e.f().O();
                for (int k = 0; k < o2.size(); ++k) {
                    final int index = n2.indexOf(o2.get(k));
                    if (index != -1) {
                        n2.set(index, n3.get(k));
                    }
                }
                final ArrayList o3 = e2.f().O();
                final Fragment f = e.f();
                if (!b) {
                    f.x();
                    e2.f().v();
                }
                else {
                    f.v();
                    e2.f().x();
                }
                for (int size = n2.size(), l = 0; l < size; ++l) {
                    a.put(n2.get(l), o3.get(l));
                }
                final a a2 = new a();
                this.u(a2, e.f().V);
                a2.p(n2);
                a.p(a2.keySet());
                final a a3 = new a();
                this.u(a3, e2.f().V);
                a3.p(o3);
                a3.p(a.values());
                w.x(a, a3);
                this.v(a2, a.keySet());
                this.v(a3, a.values());
                if (a.isEmpty()) {
                    list2.clear();
                    list3.clear();
                    o = null;
                }
                else {
                    w.f(e2.f(), e.f(), b, a2, true);
                    q.a((View)this.m(), new Runnable() {
                        @Override
                        public void run() {
                            w.f(e2.f(), e.f(), b, a3, false);
                        }
                    });
                    final Iterator iterator4 = a2.values().iterator();
                    while (iterator4.hasNext()) {
                        this.t(list2, iterator4.next());
                    }
                    if (!n2.isEmpty()) {
                        view3 = (View)a2.get(n2.get(0));
                        y2.v(b2, view3);
                    }
                    final Iterator iterator5 = a3.values().iterator();
                    while (iterator5.hasNext()) {
                        this.t(list3, iterator5.next());
                    }
                    int n4 = n;
                    if (!o3.isEmpty()) {
                        final View view4 = (View)a3.get(o3.get(0));
                        n4 = n;
                        if (view4 != null) {
                            q.a((View)this.m(), new Runnable() {
                                @Override
                                public void run() {
                                    y2.k(view4, rect);
                                }
                            });
                            n4 = 1;
                        }
                    }
                    y2.z(b2, view, list2);
                    y2.t(b2, null, null, null, null, b2, list3);
                    final Boolean true = Boolean.TRUE;
                    e3 = e;
                    hashMap.put(e3, true);
                    e4 = e2;
                    hashMap.put(e4, true);
                    o = b2;
                    n = n4;
                }
            }
        }
        final ArrayList list4 = list3;
        final ArrayList list5 = list2;
        final ArrayList list6 = new ArrayList();
        final Iterator<m> iterator6 = list.iterator();
        Object n5 = null;
        Object n6 = null;
        final View view5 = view3;
        final e e6 = e4;
        final View view6 = view;
        final ArrayList c = list5;
        final ArrayList c2 = list4;
        while (iterator6.hasNext()) {
            final m m2 = iterator6.next();
            if (((l)m2).d()) {
                hashMap.put(((l)m2).b(), Boolean.FALSE);
                ((l)m2).a();
            }
            else {
                final Object g = y2.g(m2.h());
                final e b3 = ((l)m2).b();
                final boolean b4 = o != null && (b3 == e3 || b3 == e6);
                if (g == null) {
                    if (b4) {
                        continue;
                    }
                    hashMap.put(b3, Boolean.FALSE);
                    ((l)m2).a();
                }
                else {
                    final ArrayList c3 = new ArrayList();
                    this.t(c3, b3.f().V);
                    if (b4) {
                        if (b3 == e3) {
                            c3.removeAll(c);
                        }
                        else {
                            c3.removeAll(c2);
                        }
                    }
                    if (c3.isEmpty()) {
                        y2.a(g, view6);
                    }
                    else {
                        y2.b(g, c3);
                        final e e7 = b3;
                        y2.t(g, g, c3, null, null, null, null);
                        if (e7.e() == B.e.c.q) {
                            y2.r(g, e7.f().V, c3);
                            q.a((View)this.m(), new Runnable() {
                                @Override
                                public void run() {
                                    w.A(c3, 4);
                                }
                            });
                        }
                    }
                    if (b3.e() == B.e.c.p) {
                        list6.addAll(c3);
                        if (n != 0) {
                            y2.u(g, rect);
                        }
                    }
                    else {
                        y2.v(g, view5);
                    }
                    hashMap.put(b3, Boolean.TRUE);
                    if (m2.j()) {
                        n6 = y2.n(n6, g, null);
                    }
                    else {
                        n5 = y2.n(n5, g, null);
                    }
                }
            }
        }
        final Object m3 = y2.m(n6, n5, o);
        for (final m m4 : list) {
            if (((l)m4).d()) {
                continue;
            }
            final Object h = m4.h();
            final e b5 = ((l)m4).b();
            final boolean b6 = o != null && (b5 == e3 || b5 == e6);
            if (h == null && !b6) {
                continue;
            }
            y2.w(((l)m4).b().f(), m3, ((l)m4).c(), new Runnable() {
                @Override
                public void run() {
                    ((l)m4).a();
                }
            });
        }
        w.A(list6, 4);
        final ArrayList o4 = y2.o(c2);
        y2.c(this.m(), m3);
        y2.y((View)this.m(), c, c2, o4, a);
        w.A(list6, 0);
        y2.A(o, c, c2);
        return hashMap;
    }
    
    public static class k extends l
    {
        public boolean c;
        public f.d d;
        
        public k(final e e, final E.c c) {
            super(e, c);
            this.c = false;
        }
        
        public f.d e(final Context context) {
            if (this.c) {
                return this.d;
            }
            final f.d b = f.b(context, ((l)this).b().f(), ((l)this).b().e() == B.e.c.p);
            this.d = b;
            this.c = true;
            return b;
        }
    }
    
    public abstract static class l
    {
        public final e a;
        public final E.c b;
        
        public l(final e a, final E.c b) {
            this.a = a;
            this.b = b;
        }
        
        public void a() {
            this.a.d(this.b);
        }
        
        public e b() {
            return this.a;
        }
        
        public E.c c() {
            return this.b;
        }
        
        public boolean d() {
            final e.c h = B.e.c.h(this.a.f().V);
            final e.c e = this.a.e();
            if (h != e) {
                final e.c p = B.e.c.p;
                if (h == p || e == p) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static class m extends l
    {
        public final Object c;
        public final boolean d;
        public final Object e;
        
        public m(final e e, final E.c c, final boolean b, final boolean b2) {
            super(e, c);
            boolean d;
            if (e.e() == e.c.p) {
                final Fragment f = e.f();
                Object c2;
                if (b) {
                    c2 = f.H();
                }
                else {
                    c2 = f.u();
                }
                this.c = c2;
                final Fragment f2 = e.f();
                if (b) {
                    d = f2.p();
                }
                else {
                    d = f2.o();
                }
            }
            else {
                final Fragment f3 = e.f();
                Object c3;
                if (b) {
                    c3 = f3.K();
                }
                else {
                    c3 = f3.w();
                }
                this.c = c3;
                d = true;
            }
            this.d = d;
            Object e2;
            if (b2) {
                final Fragment f4 = e.f();
                if (b) {
                    e2 = f4.M();
                }
                else {
                    e2 = f4.L();
                }
            }
            else {
                e2 = null;
            }
            this.e = e2;
        }
        
        public y e() {
            final y f = this.f(this.c);
            final y f2 = this.f(this.e);
            if (f != null && f2 != null && f != f2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(((l)this).b().f());
                sb.append(" returned Transition ");
                sb.append(this.c);
                sb.append(" which uses a different Transition  type than its shared element transition ");
                sb.append(this.e);
                throw new IllegalArgumentException(sb.toString());
            }
            if (f != null) {
                return f;
            }
            return f2;
        }
        
        public final y f(final Object obj) {
            if (obj == null) {
                return null;
            }
            final y b = w.b;
            if (b != null && b.e(obj)) {
                return b;
            }
            final y c = w.c;
            if (c != null && c.e(obj)) {
                return c;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Transition ");
            sb.append(obj);
            sb.append(" for fragment ");
            sb.append(((l)this).b().f());
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }
        
        public Object g() {
            return this.e;
        }
        
        public Object h() {
            return this.c;
        }
        
        public boolean i() {
            return this.e != null;
        }
        
        public boolean j() {
            return this.d;
        }
    }
}
