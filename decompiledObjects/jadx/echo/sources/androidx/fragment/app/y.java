package androidx.fragment.app;

import I.AbstractC0421s;
import I.AbstractC0424v;
import I.ViewTreeObserverOnPreDrawListenerC0420q;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class y {

    public class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f9636o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9637p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9638q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9639r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9640s;

        public a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f9636o = i7;
            this.f9637p = arrayList;
            this.f9638q = arrayList2;
            this.f9639r = arrayList3;
            this.f9640s = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f9636o; i7++) {
                AbstractC0421s.I((View) this.f9637p.get(i7), (String) this.f9638q.get(i7));
                AbstractC0421s.I((View) this.f9639r.get(i7), (String) this.f9640s.get(i7));
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9642o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Map f9643p;

        public b(ArrayList arrayList, Map map) {
            this.f9642o = arrayList;
            this.f9643p = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9642o.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f9642o.get(i7);
                String q7 = AbstractC0421s.q(view);
                if (q7 != null) {
                    AbstractC0421s.I(view, y.i(this.f9643p, q7));
                }
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ ArrayList f9645o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Map f9646p;

        public c(ArrayList arrayList, Map map) {
            this.f9645o = arrayList;
            this.f9646p = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9645o.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f9645o.get(i7);
                AbstractC0421s.I(view, (String) this.f9646p.get(AbstractC0421s.q(view)));
            }
        }
    }

    public static void d(List list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = (View) list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    public static String i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z7 = view instanceof ViewGroup;
            View view2 = view;
            if (z7) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean a7 = AbstractC0424v.a(viewGroup);
                view2 = viewGroup;
                if (!a7) {
                    int childCount = viewGroup.getChildCount();
                    for (int i7 = 0; i7 < childCount; i7++) {
                        f(arrayList, viewGroup.getChildAt(i7));
                    }
                    return;
                }
            }
            arrayList.add(view2);
        }
    }

    public abstract Object g(Object obj);

    public void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String q7 = AbstractC0421s.q(view);
            if (q7 != null) {
                map.put(q7, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    j(map, viewGroup.getChildAt(i7));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (AbstractC0421s.t(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            arrayList2.add(AbstractC0421s.q(view));
            AbstractC0421s.I(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public void s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0420q.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(Fragment fragment, Object obj, E.c cVar, Runnable runnable);

    public void x(View view, ArrayList arrayList, Map map) {
        ViewTreeObserverOnPreDrawListenerC0420q.a(view, new b(arrayList, map));
    }

    public void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList.get(i7);
            String q7 = AbstractC0421s.q(view2);
            arrayList4.add(q7);
            if (q7 != null) {
                AbstractC0421s.I(view2, null);
                String str = (String) map.get(q7);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        AbstractC0421s.I((View) arrayList2.get(i8), q7);
                        break;
                    }
                    i8++;
                }
            }
        }
        ViewTreeObserverOnPreDrawListenerC0420q.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
