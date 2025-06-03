/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package androidx.fragment.app;

import E.c;
import I.q;
import I.s;
import I.v;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class y {
    public static void d(List list, View view) {
        int n8 = list.size();
        if (y.h(list, view, n8)) {
            return;
        }
        list.add((Object)view);
        for (int i8 = n8; i8 < list.size(); ++i8) {
            view = (View)list.get(i8);
            if (!(view instanceof ViewGroup)) continue;
            view = (ViewGroup)view;
            int n9 = view.getChildCount();
            for (int i9 = 0; i9 < n9; ++i9) {
                View view2 = view.getChildAt(i9);
                if (y.h(list, view2, n8)) continue;
                list.add((Object)view2);
            }
        }
    }

    public static boolean h(List list, View view, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            if (list.get(i8) != view) continue;
            return true;
        }
        return false;
    }

    public static String i(Map map, String string2) {
        for (Map.Entry entry : map.entrySet()) {
            if (!string2.equals(entry.getValue())) continue;
            return (String)entry.getKey();
        }
        return null;
    }

    public static boolean l(List list) {
        if (list != null && !list.isEmpty()) {
            return false;
        }
        return true;
    }

    public abstract void A(Object var1, ArrayList var2, ArrayList var3);

    public abstract Object B(Object var1);

    public abstract void a(Object var1, View var2);

    public abstract void b(Object var1, ArrayList var2);

    public abstract void c(ViewGroup var1, Object var2);

    public abstract boolean e(Object var1);

    public void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            View view2 = view;
            if (view instanceof ViewGroup && !v.a((ViewGroup)(view2 = (ViewGroup)view))) {
                int n8 = view2.getChildCount();
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.f(arrayList, view2.getChildAt(i8));
                }
            } else {
                arrayList.add((Object)view2);
            }
        }
    }

    public abstract Object g(Object var1);

    public void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String string2 = s.q(view);
            if (string2 != null) {
                map.put((Object)string2, (Object)view);
            }
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                int n8 = view.getChildCount();
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.j(map, view.getChildAt(i8));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (!s.t(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset((float)view.getLeft(), (float)view.getTop());
        ViewParent viewParent = view.getParent();
        while (viewParent instanceof View) {
            viewParent = (View)viewParent;
            rectF.offset((float)(- viewParent.getScrollX()), (float)(- viewParent.getScrollY()));
            viewParent.getMatrix().mapRect(rectF);
            rectF.offset((float)viewParent.getLeft(), (float)viewParent.getTop());
            viewParent = viewParent.getParent();
        }
        viewParent = new int[2];
        view.getRootView().getLocationOnScreen((int[])viewParent);
        rectF.offset((float)viewParent[0], (float)viewParent[1]);
        rect.set(Math.round((float)rectF.left), Math.round((float)rectF.top), Math.round((float)rectF.right), Math.round((float)rectF.bottom));
    }

    public abstract Object m(Object var1, Object var2, Object var3);

    public abstract Object n(Object var1, Object var2, Object var3);

    public ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            View view = (View)arrayList.get(i8);
            arrayList2.add((Object)s.q(view));
            s.I(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object var1, View var2);

    public abstract void q(Object var1, ArrayList var2, ArrayList var3);

    public abstract void r(Object var1, View var2, ArrayList var3);

    public void s(ViewGroup viewGroup, final ArrayList arrayList, final Map map) {
        q.a((View)viewGroup, new Runnable(){

            public void run() {
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    View view = (View)arrayList.get(i8);
                    String string2 = s.q(view);
                    s.I(view, (String)map.get((Object)string2));
                }
            }
        });
    }

    public abstract void t(Object var1, Object var2, ArrayList var3, Object var4, ArrayList var5, Object var6, ArrayList var7);

    public abstract void u(Object var1, Rect var2);

    public abstract void v(Object var1, View var2);

    public abstract void w(Fragment var1, Object var2, c var3, Runnable var4);

    public void x(View view, final ArrayList arrayList, final Map map) {
        q.a(view, new Runnable(){

            public void run() {
                int n8 = arrayList.size();
                for (int i8 = 0; i8 < n8; ++i8) {
                    View view = (View)arrayList.get(i8);
                    String string2 = s.q(view);
                    if (string2 == null) continue;
                    s.I(view, y.i(map, string2));
                }
            }
        });
    }

    public void y(View view, final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3, Map map) {
        final int n8 = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        block0 : for (int i8 = 0; i8 < n8; ++i8) {
            Object object = (View)arrayList.get(i8);
            String string2 = s.q((View)object);
            arrayList4.add((Object)string2);
            if (string2 == null) continue;
            s.I((View)object, null);
            object = (String)map.get((Object)string2);
            for (int i9 = 0; i9 < n8; ++i9) {
                if (!object.equals(arrayList3.get(i9))) continue;
                s.I((View)arrayList2.get(i9), string2);
                continue block0;
            }
        }
        q.a(view, new Runnable(){

            public void run() {
                for (int i8 = 0; i8 < n8; ++i8) {
                    s.I((View)arrayList2.get(i8), (String)arrayList3.get(i8));
                    s.I((View)arrayList.get(i8), (String)arrayList4.get(i8));
                }
            }
        });
    }

    public abstract void z(Object var1, View var2, ArrayList var3);

}

