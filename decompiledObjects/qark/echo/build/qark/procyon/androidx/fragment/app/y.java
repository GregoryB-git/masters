// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.fragment.app;

import E.c;
import I.q;
import android.view.ViewParent;
import android.graphics.RectF;
import android.graphics.Rect;
import I.s;
import I.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;

public abstract class y
{
    public static void d(final List list, View view) {
        final int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); ++i) {
            view = list.get(i);
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), j = 0; j < childCount; ++j) {
                    final View child = viewGroup.getChildAt(j);
                    if (!h(list, child, size)) {
                        list.add(child);
                    }
                }
            }
        }
    }
    
    public static boolean h(final List list, final View view, final int n) {
        for (int i = 0; i < n; ++i) {
            if (list.get(i) == view) {
                return true;
            }
        }
        return false;
    }
    
    public static String i(final Map map, final String s) {
        for (final Map.Entry<K, Object> entry : map.entrySet()) {
            if (s.equals(entry.getValue())) {
                return (String)entry.getKey();
            }
        }
        return null;
    }
    
    public static boolean l(final List list) {
        return list == null || list.isEmpty();
    }
    
    public abstract void A(final Object p0, final ArrayList p1, final ArrayList p2);
    
    public abstract Object B(final Object p0);
    
    public abstract void a(final Object p0, final View p1);
    
    public abstract void b(final Object p0, final ArrayList p1);
    
    public abstract void c(final ViewGroup p0, final Object p1);
    
    public abstract boolean e(final Object p0);
    
    public void f(final ArrayList list, final View view) {
        if (view.getVisibility() == 0) {
            Object e = view;
            if (view instanceof ViewGroup) {
                e = view;
                if (!v.a((ViewGroup)e)) {
                    for (int childCount = ((ViewGroup)e).getChildCount(), i = 0; i < childCount; ++i) {
                        this.f(list, ((ViewGroup)e).getChildAt(i));
                    }
                    return;
                }
            }
            list.add(e);
        }
    }
    
    public abstract Object g(final Object p0);
    
    public void j(final Map map, final View view) {
        if (view.getVisibility() == 0) {
            final String q = s.q(view);
            if (q != null) {
                map.put(q, view);
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    this.j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
    
    public void k(final View view, final Rect rect) {
        if (!s.t(view)) {
            return;
        }
        final RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        View view2;
        for (ViewParent viewParent = view.getParent(); viewParent instanceof View; viewParent = view2.getParent()) {
            view2 = (View)viewParent;
            rectF.offset((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
            view2.getMatrix().mapRect(rectF);
            rectF.offset((float)view2.getLeft(), (float)view2.getTop());
        }
        final int[] array = new int[2];
        view.getRootView().getLocationOnScreen(array);
        rectF.offset((float)array[0], (float)array[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }
    
    public abstract Object m(final Object p0, final Object p1, final Object p2);
    
    public abstract Object n(final Object p0, final Object p1, final Object p2);
    
    public ArrayList o(final ArrayList list) {
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int size = list.size(), i = 0; i < size; ++i) {
            final View view = list.get(i);
            list2.add(s.q(view));
            s.I(view, null);
        }
        return list2;
    }
    
    public abstract void p(final Object p0, final View p1);
    
    public abstract void q(final Object p0, final ArrayList p1, final ArrayList p2);
    
    public abstract void r(final Object p0, final View p1, final ArrayList p2);
    
    public void s(final ViewGroup viewGroup, final ArrayList list, final Map map) {
        q.a((View)viewGroup, new Runnable() {
            @Override
            public void run() {
                for (int size = list.size(), i = 0; i < size; ++i) {
                    final View view = list.get(i);
                    s.I(view, (String)map.get(s.q(view)));
                }
            }
        });
    }
    
    public abstract void t(final Object p0, final Object p1, final ArrayList p2, final Object p3, final ArrayList p4, final Object p5, final ArrayList p6);
    
    public abstract void u(final Object p0, final Rect p1);
    
    public abstract void v(final Object p0, final View p1);
    
    public abstract void w(final Fragment p0, final Object p1, final c p2, final Runnable p3);
    
    public void x(final View view, final ArrayList list, final Map map) {
        q.a(view, new Runnable() {
            @Override
            public void run() {
                for (int size = list.size(), i = 0; i < size; ++i) {
                    final View view = list.get(i);
                    final String q = s.q(view);
                    if (q != null) {
                        s.I(view, y.i(map, q));
                    }
                }
            }
        });
    }
    
    public void y(final View view, final ArrayList list, final ArrayList list2, final ArrayList list3, final Map map) {
        final int size = list2.size();
        final ArrayList<String> list4 = new ArrayList<String>();
        for (int i = 0; i < size; ++i) {
            final View view2 = list.get(i);
            final String q = s.q(view2);
            list4.add(q);
            if (q != null) {
                s.I(view2, null);
                final String s = map.get(q);
                for (int j = 0; j < size; ++j) {
                    if (s.equals(list3.get(j))) {
                        I.s.I(list2.get(j), q);
                        break;
                    }
                }
            }
        }
        q.a(view, new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < size; ++i) {
                    I.s.I((View)list2.get(i), (String)list3.get(i));
                    I.s.I((View)list.get(i), (String)list4.get(i));
                }
            }
        });
    }
    
    public abstract void z(final Object p0, final View p1, final ArrayList p2);
}
