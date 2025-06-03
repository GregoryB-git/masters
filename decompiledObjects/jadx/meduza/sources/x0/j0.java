package x0;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import e0.d0;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j0 extends n0 {

    public class a implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f16694a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ArrayList f16695b;

        public a(View view, ArrayList arrayList) {
            this.f16694a = view;
            this.f16695b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f16694a.setVisibility(8);
            int size = this.f16695b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f16695b.get(i10)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class b extends Transition.EpicenterCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f16696a;

        public b(Rect rect) {
            this.f16696a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public final Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f16696a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f16696a;
        }
    }

    public static boolean s(Transition transition) {
        return (n0.g(transition.getTargetIds()) && n0.g(transition.getTargetNames()) && n0.g(transition.getTargetTypes())) ? false : true;
    }

    public static void t(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                t(transitionSet.getTransitionAt(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (s(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i10 < size) {
            transition.addTarget((View) arrayList2.get(i10));
            i10++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // x0.n0
    public final void a(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // x0.n0
    public final void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i10 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i10 < transitionCount) {
                b(transitionSet.getTransitionAt(i10), arrayList);
                i10++;
            }
            return;
        }
        if (s(transition) || !n0.g(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            transition.addTarget(arrayList.get(i10));
            i10++;
        }
    }

    @Override // x0.n0
    public final void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // x0.n0
    public final boolean d(Object obj) {
        return obj instanceof Transition;
    }

    @Override // x0.n0
    public final Transition e(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // x0.n0
    public final void h() {
        if (y.L(4)) {
            Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    @Override // x0.n0
    public final Transition i(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // x0.n0
    public final TransitionSet j(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // x0.n0
    public final void k(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new a(view, arrayList));
    }

    @Override // x0.n0
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new k0(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // x0.n0
    public final void m(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            n0.f(view, rect);
            ((Transition) obj).setEpicenterCallback(new i0(rect));
        }
    }

    @Override // x0.n0
    public final void n(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new b(rect));
    }

    @Override // x0.n0
    public final void o(Object obj, f fVar) {
        ((Transition) obj).addListener(new l0(fVar));
    }

    @Override // x0.n0
    public final void p(Object obj, View view, ArrayList<View> arrayList) {
        boolean z10;
        boolean z11;
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = arrayList.get(i10);
            int size2 = targets.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z10 = false;
                    break;
                } else {
                    if (targets.get(i11) == view2) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (!z10) {
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                if (d0.d.k(view2) != null) {
                    targets.add(view2);
                }
                for (int i12 = size2; i12 < targets.size(); i12++) {
                    View view3 = targets.get(i12);
                    if (view3 instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view3;
                        int childCount = viewGroup.getChildCount();
                        for (int i13 = 0; i13 < childCount; i13++) {
                            View childAt = viewGroup.getChildAt(i13);
                            int i14 = 0;
                            while (true) {
                                if (i14 >= size2) {
                                    z11 = false;
                                    break;
                                } else {
                                    if (targets.get(i14) == childAt) {
                                        z11 = true;
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            if (!z11 && d0.d.k(childAt) != null) {
                                targets.add(childAt);
                            }
                        }
                    }
                }
            }
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // x0.n0
    public final void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // x0.n0
    public final TransitionSet r(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
