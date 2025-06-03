package x0;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16699a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16700b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16701c = null;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f16702d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16703e;
    public final /* synthetic */ ArrayList f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f16704g;

    public k0(j0 j0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f16704g = j0Var;
        this.f16699a = obj;
        this.f16700b = arrayList;
        this.f16703e = obj2;
        this.f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        Object obj = this.f16699a;
        if (obj != null) {
            j0 j0Var = this.f16704g;
            ArrayList arrayList = this.f16700b;
            j0Var.getClass();
            j0.t(obj, arrayList, null);
        }
        Object obj2 = this.f16701c;
        if (obj2 != null) {
            j0 j0Var2 = this.f16704g;
            ArrayList arrayList2 = this.f16702d;
            j0Var2.getClass();
            j0.t(obj2, arrayList2, null);
        }
        Object obj3 = this.f16703e;
        if (obj3 != null) {
            j0 j0Var3 = this.f16704g;
            ArrayList arrayList3 = this.f;
            j0Var3.getClass();
            j0.t(obj3, arrayList3, null);
        }
    }
}
