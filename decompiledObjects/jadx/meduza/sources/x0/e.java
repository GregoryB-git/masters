package x0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import e0.d0;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import r.g;
import x0.r0;

/* loaded from: classes.dex */
public final class e extends r0 {

    public static final class a extends r0.a {

        /* renamed from: c, reason: collision with root package name */
        public final b f16561c;

        /* renamed from: x0.e$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0256a implements Animation.AnimationListener {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ r0.c f16562a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f16563b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ View f16564c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f16565d;

            public AnimationAnimationListenerC0256a(r0.c cVar, ViewGroup viewGroup, View view, a aVar) {
                this.f16562a = cVar;
                this.f16563b = viewGroup;
                this.f16564c = view;
                this.f16565d = aVar;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                ec.i.e(animation, "animation");
                ViewGroup viewGroup = this.f16563b;
                viewGroup.post(new x0.d(viewGroup, this.f16564c, this.f16565d, 0));
                if (y.L(2)) {
                    StringBuilder l10 = defpackage.f.l("Animation from operation ");
                    l10.append(this.f16562a);
                    l10.append(" has ended.");
                    Log.v("FragmentManager", l10.toString());
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
                ec.i.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
                ec.i.e(animation, "animation");
                if (y.L(2)) {
                    StringBuilder l10 = defpackage.f.l("Animation from operation ");
                    l10.append(this.f16562a);
                    l10.append(" has reached onAnimationStart.");
                    Log.v("FragmentManager", l10.toString());
                }
            }
        }

        public a(b bVar) {
            this.f16561c = bVar;
        }

        @Override // x0.r0.a
        public final void b(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            r0.c cVar = this.f16561c.f16578a;
            View view = cVar.f16746c.mView;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f16561c.f16578a.c(this);
            if (y.L(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has been cancelled.");
            }
        }

        @Override // x0.r0.a
        public final void c(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            if (this.f16561c.a()) {
                this.f16561c.f16578a.c(this);
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f16561c;
            r0.c cVar = bVar.f16578a;
            View view = cVar.f16746c.mView;
            ec.i.d(context, "context");
            n b10 = bVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            Animation animation = b10.f16714a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            if (cVar.f16744a != 1) {
                view.startAnimation(animation);
                this.f16561c.f16578a.c(this);
                return;
            }
            viewGroup.startViewTransition(view);
            o oVar = new o(animation, viewGroup, view);
            oVar.setAnimationListener(new AnimationAnimationListenerC0256a(cVar, viewGroup, view, this));
            view.startAnimation(oVar);
            if (y.L(2)) {
                Log.v("FragmentManager", "Animation from operation " + cVar + " has started.");
            }
        }
    }

    public static final class b extends f {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f16566b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f16567c;

        /* renamed from: d, reason: collision with root package name */
        public n f16568d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(r0.c cVar, boolean z10) {
            super(cVar);
            ec.i.e(cVar, "operation");
            this.f16566b = z10;
        }

        public final n b(Context context) {
            n nVar;
            int i10;
            int i11;
            if (this.f16567c) {
                return this.f16568d;
            }
            r0.c cVar = this.f16578a;
            x0.i iVar = cVar.f16746c;
            boolean z10 = false;
            boolean z11 = cVar.f16744a == 2;
            boolean z12 = this.f16566b;
            int nextTransition = iVar.getNextTransition();
            int popEnterAnim = z12 ? z11 ? iVar.getPopEnterAnim() : iVar.getPopExitAnim() : z11 ? iVar.getEnterAnim() : iVar.getExitAnim();
            iVar.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = iVar.mContainer;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                iVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = iVar.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = iVar.onCreateAnimation(nextTransition, z11, popEnterAnim);
                if (onCreateAnimation != null) {
                    nVar = new n(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = iVar.onCreateAnimator(nextTransition, z11, popEnterAnim);
                    if (onCreateAnimator != null) {
                        nVar = new n(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            popEnterAnim = -1;
                            if (nextTransition == 4097) {
                                i10 = z11 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                            } else if (nextTransition != 8194) {
                                if (nextTransition == 8197) {
                                    i11 = z11 ? android.R.attr.activityCloseEnterAnimation : android.R.attr.activityCloseExitAnimation;
                                } else if (nextTransition == 4099) {
                                    i10 = z11 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit;
                                } else if (nextTransition == 4100) {
                                    i11 = z11 ? android.R.attr.activityOpenEnterAnimation : android.R.attr.activityOpenExitAnimation;
                                }
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i11});
                                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                                obtainStyledAttributes.recycle();
                                popEnterAnim = resourceId;
                            } else {
                                i10 = z11 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit;
                            }
                            popEnterAnim = i10;
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation != null) {
                                        nVar = new n(loadAnimation);
                                    } else {
                                        z10 = true;
                                    }
                                } catch (Resources.NotFoundException e10) {
                                    throw e10;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z10) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (loadAnimator != null) {
                                        nVar = new n(loadAnimator);
                                    }
                                } catch (RuntimeException e11) {
                                    if (equals) {
                                        throw e11;
                                    }
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation2 != null) {
                                        nVar = new n(loadAnimation2);
                                    }
                                }
                            }
                        }
                    }
                }
                this.f16568d = nVar;
                this.f16567c = true;
                return nVar;
            }
            nVar = null;
            this.f16568d = nVar;
            this.f16567c = true;
            return nVar;
        }
    }

    public static final class c extends r0.a {

        /* renamed from: c, reason: collision with root package name */
        public final b f16569c;

        /* renamed from: d, reason: collision with root package name */
        public AnimatorSet f16570d;

        public static final class a extends AnimatorListenerAdapter {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f16571a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f16572b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f16573c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r0.c f16574d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ c f16575e;

            public a(ViewGroup viewGroup, View view, boolean z10, r0.c cVar, c cVar2) {
                this.f16571a = viewGroup;
                this.f16572b = view;
                this.f16573c = z10;
                this.f16574d = cVar;
                this.f16575e = cVar2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ec.i.e(animator, "anim");
                this.f16571a.endViewTransition(this.f16572b);
                if (this.f16573c) {
                    int i10 = this.f16574d.f16744a;
                    View view = this.f16572b;
                    ec.i.d(view, "viewToAnimate");
                    a0.j.a(i10, view, this.f16571a);
                }
                c cVar = this.f16575e;
                cVar.f16569c.f16578a.c(cVar);
                if (y.L(2)) {
                    StringBuilder l10 = defpackage.f.l("Animator from operation ");
                    l10.append(this.f16574d);
                    l10.append(" has ended.");
                    Log.v("FragmentManager", l10.toString());
                }
            }
        }

        public c(b bVar) {
            this.f16569c = bVar;
        }

        @Override // x0.r0.a
        public final void b(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            AnimatorSet animatorSet = this.f16570d;
            if (animatorSet == null) {
                this.f16569c.f16578a.c(this);
                return;
            }
            r0.c cVar = this.f16569c.f16578a;
            if (!cVar.f16749g) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0257e.f16577a.a(animatorSet);
            }
            if (y.L(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(cVar);
                sb2.append(" has been canceled");
                sb2.append(cVar.f16749g ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // x0.r0.a
        public final void c(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            r0.c cVar = this.f16569c.f16578a;
            AnimatorSet animatorSet = this.f16570d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            animatorSet.start();
            if (y.L(2)) {
                Log.v("FragmentManager", "Animator from operation " + cVar + " has started.");
            }
        }

        @Override // x0.r0.a
        public final void d(b.b bVar, ViewGroup viewGroup) {
            ec.i.e(bVar, "backEvent");
            ec.i.e(viewGroup, "container");
            r0.c cVar = this.f16569c.f16578a;
            AnimatorSet animatorSet = this.f16570d;
            if (animatorSet == null) {
                cVar.c(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !cVar.f16746c.mTransitioning) {
                return;
            }
            if (y.L(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + cVar);
            }
            long a10 = d.f16576a.a(animatorSet);
            long j10 = (long) (bVar.f1587c * a10);
            if (j10 == 0) {
                j10 = 1;
            }
            if (j10 == a10) {
                j10 = a10 - 1;
            }
            if (y.L(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + j10 + " for Animator " + animatorSet + " on operation " + cVar);
            }
            C0257e.f16577a.b(animatorSet, j10);
        }

        @Override // x0.r0.a
        public final void e(ViewGroup viewGroup) {
            if (this.f16569c.a()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f16569c;
            ec.i.d(context, "context");
            n b10 = bVar.b(context);
            this.f16570d = b10 != null ? b10.f16715b : null;
            r0.c cVar = this.f16569c.f16578a;
            x0.i iVar = cVar.f16746c;
            boolean z10 = cVar.f16744a == 3;
            View view = iVar.mView;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f16570d;
            if (animatorSet != null) {
                animatorSet.addListener(new a(viewGroup, view, z10, cVar, this));
            }
            AnimatorSet animatorSet2 = this.f16570d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f16576a = new d();

        public final long a(AnimatorSet animatorSet) {
            long totalDuration;
            ec.i.e(animatorSet, "animatorSet");
            totalDuration = animatorSet.getTotalDuration();
            return totalDuration;
        }
    }

    /* renamed from: x0.e$e, reason: collision with other inner class name */
    public static final class C0257e {

        /* renamed from: a, reason: collision with root package name */
        public static final C0257e f16577a = new C0257e();

        public final void a(AnimatorSet animatorSet) {
            ec.i.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            ec.i.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final r0.c f16578a;

        public f(r0.c cVar) {
            ec.i.e(cVar, "operation");
            this.f16578a = cVar;
        }

        public final boolean a() {
            View view = this.f16578a.f16746c.mView;
            int a10 = view != null ? s0.a(view) : 0;
            int i10 = this.f16578a.f16744a;
            return a10 == i10 || !(a10 == 2 || i10 == 2);
        }
    }

    public static final class g extends r0.a {

        /* renamed from: c, reason: collision with root package name */
        public final List<h> f16579c;

        /* renamed from: d, reason: collision with root package name */
        public final r0.c f16580d;

        /* renamed from: e, reason: collision with root package name */
        public final r0.c f16581e;
        public final n0 f;

        /* renamed from: g, reason: collision with root package name */
        public final Object f16582g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList<View> f16583h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList<View> f16584i;

        /* renamed from: j, reason: collision with root package name */
        public final r.b<String, String> f16585j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList<String> f16586k;

        /* renamed from: l, reason: collision with root package name */
        public final ArrayList<String> f16587l;

        /* renamed from: m, reason: collision with root package name */
        public final r.b<String, View> f16588m;

        /* renamed from: n, reason: collision with root package name */
        public final r.b<String, View> f16589n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f16590o;

        /* renamed from: p, reason: collision with root package name */
        public final a0.c f16591p = new a0.c();

        public static final class a extends ec.j implements dc.a<rb.h> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ViewGroup f16593b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f16594c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f16593b = viewGroup;
                this.f16594c = obj;
            }

            @Override // dc.a
            public final rb.h invoke() {
                g.this.f.c(this.f16593b, this.f16594c);
                return rb.h.f13851a;
            }
        }

        public g(ArrayList arrayList, r0.c cVar, r0.c cVar2, n0 n0Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, r.b bVar, ArrayList arrayList4, ArrayList arrayList5, r.b bVar2, r.b bVar3, boolean z10) {
            this.f16579c = arrayList;
            this.f16580d = cVar;
            this.f16581e = cVar2;
            this.f = n0Var;
            this.f16582g = obj;
            this.f16583h = arrayList2;
            this.f16584i = arrayList3;
            this.f16585j = bVar;
            this.f16586k = arrayList4;
            this.f16587l = arrayList5;
            this.f16588m = bVar2;
            this.f16589n = bVar3;
            this.f16590o = z10;
        }

        public static void f(ArrayList arrayList, View view) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (!e0.k0.b(viewGroup)) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        if (childAt.getVisibility() == 0) {
                            f(arrayList, childAt);
                        }
                    }
                    return;
                }
                if (arrayList.contains(view)) {
                    return;
                }
            } else if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }

        @Override // x0.r0.a
        public final boolean a() {
            this.f.h();
            return false;
        }

        @Override // x0.r0.a
        public final void b(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            a0.c cVar = this.f16591p;
            synchronized (cVar) {
                if (cVar.f3a) {
                    return;
                }
                cVar.f3a = true;
                synchronized (cVar) {
                    cVar.notifyAll();
                }
            }
        }

        @Override // x0.r0.a
        public final void c(ViewGroup viewGroup) {
            ec.i.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                for (h hVar : this.f16579c) {
                    r0.c cVar = hVar.f16578a;
                    if (y.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + cVar);
                    }
                    hVar.f16578a.c(this);
                }
                return;
            }
            rb.d<ArrayList<View>, Object> g10 = g(viewGroup, this.f16581e, this.f16580d);
            ArrayList<View> arrayList = g10.f13844a;
            Object obj = g10.f13845b;
            List<h> list = this.f16579c;
            ArrayList arrayList2 = new ArrayList(sb.m.j(list));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).f16578a);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                r0.c cVar2 = (r0.c) it2.next();
                n0 n0Var = this.f;
                x0.i iVar = cVar2.f16746c;
                n0Var.o(obj, new x0.f(0, cVar2, this));
            }
            i(arrayList, viewGroup, new a(viewGroup, obj));
            if (y.L(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f16580d + " to " + this.f16581e);
            }
        }

        @Override // x0.r0.a
        public final void d(b.b bVar, ViewGroup viewGroup) {
            ec.i.e(bVar, "backEvent");
            ec.i.e(viewGroup, "container");
        }

        @Override // x0.r0.a
        public final void e(ViewGroup viewGroup) {
            if (!viewGroup.isLaidOut()) {
                Iterator<T> it = this.f16579c.iterator();
                while (it.hasNext()) {
                    r0.c cVar = ((h) it.next()).f16578a;
                    if (y.L(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + cVar);
                    }
                }
                return;
            }
            if (h() && this.f16582g != null) {
                a();
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f16582g + " between " + this.f16580d + " and " + this.f16581e + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            a();
        }

        public final rb.d<ArrayList<View>, Object> g(ViewGroup viewGroup, r0.c cVar, r0.c cVar2) {
            r0.c cVar3 = cVar;
            View view = new View(viewGroup.getContext());
            Rect rect = new Rect();
            Iterator<h> it = this.f16579c.iterator();
            int i10 = 0;
            TransitionSet transitionSet = null;
            boolean z10 = false;
            View view2 = null;
            while (it.hasNext()) {
                if ((it.next().f16597d != null) && cVar2 != null && cVar3 != null && (!this.f16585j.isEmpty()) && this.f16582g != null) {
                    h0.a(cVar3.f16746c, cVar2.f16746c, this.f16590o, this.f16588m);
                    e0.w.a(viewGroup, new x0.g(cVar3, cVar2, this, i10));
                    this.f16583h.addAll(this.f16588m.values());
                    if (!this.f16587l.isEmpty()) {
                        String str = this.f16587l.get(0);
                        ec.i.d(str, "exitingNames[0]");
                        view2 = this.f16588m.getOrDefault(str, null);
                        this.f.m(view2, this.f16582g);
                    }
                    this.f16584i.addAll(this.f16589n.values());
                    if (!this.f16586k.isEmpty()) {
                        String str2 = this.f16586k.get(0);
                        ec.i.d(str2, "enteringNames[0]");
                        View orDefault = this.f16589n.getOrDefault(str2, null);
                        if (orDefault != null) {
                            e0.w.a(viewGroup, new x0.d(this.f, orDefault, rect, 1));
                            z10 = true;
                        }
                    }
                    this.f.p(this.f16582g, view, this.f16583h);
                    n0 n0Var = this.f;
                    Object obj = this.f16582g;
                    n0Var.l(obj, null, null, obj, this.f16584i);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator<h> it2 = this.f16579c.iterator();
            TransitionSet transitionSet2 = null;
            while (it2.hasNext()) {
                h next = it2.next();
                r0.c cVar4 = next.f16578a;
                Iterator<h> it3 = it2;
                Transition e10 = this.f.e(next.f16595b);
                if (e10 != null) {
                    ArrayList<View> arrayList2 = new ArrayList<>();
                    TransitionSet transitionSet3 = transitionSet2;
                    View view3 = cVar4.f16746c.mView;
                    TransitionSet transitionSet4 = transitionSet;
                    ec.i.d(view3, "operation.fragment.mView");
                    f(arrayList2, view3);
                    if (this.f16582g != null && (cVar4 == cVar2 || cVar4 == cVar3)) {
                        arrayList2.removeAll(sb.q.x(cVar4 == cVar2 ? this.f16583h : this.f16584i));
                    }
                    if (arrayList2.isEmpty()) {
                        this.f.a(view, e10);
                    } else {
                        this.f.b(e10, arrayList2);
                        this.f.l(e10, e10, arrayList2, null, null);
                        if (cVar4.f16744a == 3) {
                            cVar4.f16751i = false;
                            ArrayList<View> arrayList3 = new ArrayList<>(arrayList2);
                            arrayList3.remove(cVar4.f16746c.mView);
                            this.f.k(e10, cVar4.f16746c.mView, arrayList3);
                            e0.w.a(viewGroup, new b.k(arrayList2, 4));
                        }
                    }
                    if (cVar4.f16744a == 2) {
                        arrayList.addAll(arrayList2);
                        if (z10) {
                            this.f.n(e10, rect);
                        }
                        if (y.L(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + e10);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            Iterator<View> it4 = arrayList2.iterator();
                            while (it4.hasNext()) {
                                View next2 = it4.next();
                                ec.i.d(next2, "transitioningViews");
                                Log.v("FragmentManager", "View: " + next2);
                            }
                        }
                    } else {
                        this.f.m(view2, e10);
                        if (y.L(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + e10);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            Iterator<View> it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                View next3 = it5.next();
                                ec.i.d(next3, "transitioningViews");
                                Log.v("FragmentManager", "View: " + next3);
                            }
                        }
                    }
                    if (next.f16596c) {
                        transitionSet = this.f.j(transitionSet4, e10);
                        transitionSet2 = transitionSet3;
                    } else {
                        transitionSet = transitionSet4;
                        transitionSet2 = this.f.j(transitionSet3, e10);
                    }
                }
                cVar3 = cVar;
                it2 = it3;
            }
            Transition i11 = this.f.i(transitionSet, transitionSet2, this.f16582g);
            if (y.L(2)) {
                Log.v("FragmentManager", "Final merged transition: " + i11);
            }
            return new rb.d<>(arrayList, i11);
        }

        public final boolean h() {
            List<h> list = this.f16579c;
            if ((list instanceof Collection) && list.isEmpty()) {
                return true;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).f16578a.f16746c.mTransitioning) {
                    return false;
                }
            }
            return true;
        }

        public final void i(ArrayList<View> arrayList, ViewGroup viewGroup, dc.a<rb.h> aVar) {
            h0.c(4, arrayList);
            n0 n0Var = this.f;
            ArrayList<View> arrayList2 = this.f16584i;
            n0Var.getClass();
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = arrayList2.get(i10);
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                arrayList3.add(d0.d.k(view));
                d0.d.v(view, null);
            }
            if (y.L(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                Iterator<View> it = this.f16583h.iterator();
                while (it.hasNext()) {
                    View next = it.next();
                    ec.i.d(next, "sharedElementFirstOutViews");
                    View view2 = next;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("View: ");
                    sb2.append(view2);
                    sb2.append(" Name: ");
                    WeakHashMap<View, e0.o0> weakHashMap2 = e0.d0.f3766a;
                    sb2.append(d0.d.k(view2));
                    Log.v("FragmentManager", sb2.toString());
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                Iterator<View> it2 = this.f16584i.iterator();
                while (it2.hasNext()) {
                    View next2 = it2.next();
                    ec.i.d(next2, "sharedElementLastInViews");
                    View view3 = next2;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("View: ");
                    sb3.append(view3);
                    sb3.append(" Name: ");
                    WeakHashMap<View, e0.o0> weakHashMap3 = e0.d0.f3766a;
                    sb3.append(d0.d.k(view3));
                    Log.v("FragmentManager", sb3.toString());
                }
            }
            aVar.invoke();
            n0 n0Var2 = this.f;
            ArrayList<View> arrayList4 = this.f16583h;
            ArrayList<View> arrayList5 = this.f16584i;
            r.b<String, String> bVar = this.f16585j;
            n0Var2.getClass();
            int size2 = arrayList5.size();
            ArrayList arrayList6 = new ArrayList();
            for (int i11 = 0; i11 < size2; i11++) {
                View view4 = arrayList4.get(i11);
                WeakHashMap<View, e0.o0> weakHashMap4 = e0.d0.f3766a;
                String k10 = d0.d.k(view4);
                arrayList6.add(k10);
                if (k10 != null) {
                    d0.d.v(view4, null);
                    String orDefault = bVar.getOrDefault(k10, null);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            break;
                        }
                        if (orDefault.equals(arrayList3.get(i12))) {
                            d0.d.v(arrayList5.get(i12), k10);
                            break;
                        }
                        i12++;
                    }
                }
            }
            e0.w.a(viewGroup, new m0(size2, arrayList5, arrayList3, arrayList4, arrayList6));
            h0.c(0, arrayList);
            this.f.q(this.f16582g, this.f16583h, this.f16584i);
        }
    }

    public static final class h extends f {

        /* renamed from: b, reason: collision with root package name */
        public final Object f16595b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f16596c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f16597d;

        public h(r0.c cVar, boolean z10, boolean z11) {
            super(cVar);
            this.f16595b = cVar.f16744a == 2 ? z10 ? cVar.f16746c.getReenterTransition() : cVar.f16746c.getEnterTransition() : z10 ? cVar.f16746c.getReturnTransition() : cVar.f16746c.getExitTransition();
            this.f16596c = cVar.f16744a == 2 ? z10 ? cVar.f16746c.getAllowReturnTransitionOverlap() : cVar.f16746c.getAllowEnterTransitionOverlap() : true;
            this.f16597d = z11 ? z10 ? cVar.f16746c.getSharedElementReturnTransition() : cVar.f16746c.getSharedElementEnterTransition() : null;
        }

        public final n0 b() {
            n0 c10 = c(this.f16595b);
            n0 c11 = c(this.f16597d);
            if (c10 == null || c11 == null || c10 == c11) {
                return c10 == null ? c11 : c10;
            }
            StringBuilder l10 = defpackage.f.l("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            l10.append(this.f16578a.f16746c);
            l10.append(" returned Transition ");
            l10.append(this.f16595b);
            l10.append(" which uses a different Transition  type than its shared element transition ");
            l10.append(this.f16597d);
            throw new IllegalArgumentException(l10.toString().toString());
        }

        public final n0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            j0 j0Var = h0.f16656a;
            if (j0Var != null && (obj instanceof Transition)) {
                return j0Var;
            }
            n0 n0Var = h0.f16657b;
            if (n0Var != null && n0Var.d(obj)) {
                return n0Var;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f16578a.f16746c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static final class i extends ec.j implements dc.l<Map.Entry<String, View>, Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Collection<String> f16598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Collection<String> collection) {
            super(1);
            this.f16598a = collection;
        }

        @Override // dc.l
        public final Boolean invoke(Map.Entry<String, View> entry) {
            Map.Entry<String, View> entry2 = entry;
            ec.i.e(entry2, "entry");
            Collection<String> collection = this.f16598a;
            View value = entry2.getValue();
            WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
            return Boolean.valueOf(sb.q.l(collection, d0.d.k(value)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewGroup viewGroup) {
        super(viewGroup);
        ec.i.e(viewGroup, "container");
    }

    public static void q(r.b bVar, View view) {
        WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
        String k10 = d0.d.k(view);
        if (k10 != null) {
            bVar.put(k10, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    q(bVar, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void r(r.b bVar, Collection collection) {
        Set entrySet = bVar.entrySet();
        ec.i.d(entrySet, "entries");
        i iVar = new i(collection);
        Iterator it = ((g.b) entrySet).iterator();
        while (it.hasNext()) {
            if (!((Boolean) iVar.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0455  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v35, types: [java.lang.Object] */
    @Override // x0.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.ArrayList r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 1513
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.b(java.util.ArrayList, boolean):void");
    }
}
