package x0;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import b1.k;
import e0.d0;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import x0.r0;
import y0.b;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f16599a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f16600b;

    /* renamed from: c, reason: collision with root package name */
    public final i f16601c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16602d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f16603e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f16604a;

        public a(View view) {
            this.f16604a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f16604a.removeOnAttachStateChangeListener(this);
            View view2 = this.f16604a;
            WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
            d0.c.c(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public e0(v vVar, f0 f0Var, ClassLoader classLoader, s sVar, Bundle bundle) {
        this.f16599a = vVar;
        this.f16600b = f0Var;
        d0 d0Var = (d0) bundle.getParcelable("state");
        i instantiate = i.instantiate(y.this.f16787w.f16757b, d0Var.f16549a, null);
        instantiate.mWho = d0Var.f16550b;
        instantiate.mFromLayout = d0Var.f16551c;
        instantiate.mRestored = true;
        instantiate.mFragmentId = d0Var.f16552d;
        instantiate.mContainerId = d0Var.f16553e;
        instantiate.mTag = d0Var.f;
        instantiate.mRetainInstance = d0Var.f16554o;
        instantiate.mRemoving = d0Var.f16555p;
        instantiate.mDetached = d0Var.f16556q;
        instantiate.mHidden = d0Var.f16557r;
        instantiate.mMaxState = k.b.values()[d0Var.f16558s];
        instantiate.mTargetWho = d0Var.t;
        instantiate.mTargetRequestCode = d0Var.f16559u;
        instantiate.mUserVisibleHint = d0Var.f16560v;
        this.f16601c = instantiate;
        instantiate.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        instantiate.setArguments(bundle2);
        if (y.L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public e0(v vVar, f0 f0Var, i iVar) {
        this.f16599a = vVar;
        this.f16600b = f0Var;
        this.f16601c = iVar;
    }

    public e0(v vVar, f0 f0Var, i iVar, Bundle bundle) {
        this.f16599a = vVar;
        this.f16600b = f0Var;
        this.f16601c = iVar;
        iVar.mSavedViewState = null;
        iVar.mSavedViewRegistryState = null;
        iVar.mBackStackNesting = 0;
        iVar.mInLayout = false;
        iVar.mAdded = false;
        i iVar2 = iVar.mTarget;
        iVar.mTargetWho = iVar2 != null ? iVar2.mWho : null;
        iVar.mTarget = null;
        iVar.mSavedFragmentState = bundle;
        iVar.mArguments = bundle.getBundle("arguments");
    }

    public final void a() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto ACTIVITY_CREATED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        Bundle bundle = this.f16601c.mSavedFragmentState;
        this.f16601c.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f16599a.a(this.f16601c, false);
    }

    public final void b() {
        int i10;
        View view;
        View view2;
        View view3 = this.f16601c.mContainer;
        i iVar = null;
        while (true) {
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            i iVar2 = tag instanceof i ? (i) tag : null;
            if (iVar2 != null) {
                iVar = iVar2;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        i parentFragment = this.f16601c.getParentFragment();
        if (iVar != null && !iVar.equals(parentFragment)) {
            i iVar3 = this.f16601c;
            int i11 = iVar3.mContainerId;
            b.c cVar = y0.b.f17301a;
            y0.m mVar = new y0.m(iVar3, iVar, i11);
            y0.b.c(mVar);
            b.c a10 = y0.b.a(iVar3);
            if (a10.f17312a.contains(b.a.DETECT_WRONG_NESTED_HIERARCHY) && y0.b.f(a10, iVar3.getClass(), y0.m.class)) {
                y0.b.b(a10, mVar);
            }
        }
        f0 f0Var = this.f16600b;
        i iVar4 = this.f16601c;
        f0Var.getClass();
        ViewGroup viewGroup = iVar4.mContainer;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) f0Var.f16608a).indexOf(iVar4);
            int i12 = indexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) f0Var.f16608a).size()) {
                            break;
                        }
                        i iVar5 = (i) ((ArrayList) f0Var.f16608a).get(indexOf);
                        if (iVar5.mContainer == viewGroup && (view = iVar5.mView) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    i iVar6 = (i) ((ArrayList) f0Var.f16608a).get(i12);
                    if (iVar6.mContainer == viewGroup && (view2 = iVar6.mView) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
            i iVar7 = this.f16601c;
            iVar7.mContainer.addView(iVar7.mView, i10);
        }
        i10 = -1;
        i iVar72 = this.f16601c;
        iVar72.mContainer.addView(iVar72.mView, i10);
    }

    public final void c() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto ATTACHED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        i iVar = this.f16601c;
        i iVar2 = iVar.mTarget;
        e0 e0Var = null;
        if (iVar2 != null) {
            e0 e0Var2 = (e0) ((HashMap) this.f16600b.f16609b).get(iVar2.mWho);
            if (e0Var2 == null) {
                StringBuilder l11 = defpackage.f.l("Fragment ");
                l11.append(this.f16601c);
                l11.append(" declared target fragment ");
                l11.append(this.f16601c.mTarget);
                l11.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(l11.toString());
            }
            i iVar3 = this.f16601c;
            iVar3.mTargetWho = iVar3.mTarget.mWho;
            iVar3.mTarget = null;
            e0Var = e0Var2;
        } else {
            String str = iVar.mTargetWho;
            if (str != null && (e0Var = (e0) ((HashMap) this.f16600b.f16609b).get(str)) == null) {
                StringBuilder l12 = defpackage.f.l("Fragment ");
                l12.append(this.f16601c);
                l12.append(" declared target fragment ");
                throw new IllegalStateException(defpackage.g.f(l12, this.f16601c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e0Var != null) {
            e0Var.k();
        }
        i iVar4 = this.f16601c;
        y yVar = iVar4.mFragmentManager;
        iVar4.mHost = yVar.f16787w;
        iVar4.mParentFragment = yVar.f16789y;
        this.f16599a.g(iVar4, false);
        this.f16601c.performAttach();
        this.f16599a.b(this.f16601c, false);
    }

    public final int d() {
        i iVar = this.f16601c;
        if (iVar.mFragmentManager == null) {
            return iVar.mState;
        }
        int i10 = this.f16603e;
        int ordinal = iVar.mMaxState.ordinal();
        if (ordinal == 1) {
            i10 = Math.min(i10, 0);
        } else if (ordinal == 2) {
            i10 = Math.min(i10, 1);
        } else if (ordinal == 3) {
            i10 = Math.min(i10, 5);
        } else if (ordinal != 4) {
            i10 = Math.min(i10, -1);
        }
        i iVar2 = this.f16601c;
        if (iVar2.mFromLayout) {
            if (iVar2.mInLayout) {
                i10 = Math.max(this.f16603e, 2);
                View view = this.f16601c.mView;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f16603e < 4 ? Math.min(i10, iVar2.mState) : Math.min(i10, 1);
            }
        }
        if (!this.f16601c.mAdded) {
            i10 = Math.min(i10, 1);
        }
        i iVar3 = this.f16601c;
        ViewGroup viewGroup = iVar3.mContainer;
        if (viewGroup != null) {
            r0 m10 = r0.m(viewGroup, iVar3.getParentFragmentManager());
            m10.getClass();
            i iVar4 = this.f16601c;
            ec.i.d(iVar4, "fragmentStateManager.fragment");
            r0.c j10 = m10.j(iVar4);
            int i11 = j10 != null ? j10.f16745b : 0;
            r0.c k10 = m10.k(iVar4);
            r8 = k10 != null ? k10.f16745b : 0;
            int i12 = i11 == 0 ? -1 : r0.d.f16754a[q0.g.c(i11)];
            if (i12 != -1 && i12 != 1) {
                r8 = i11;
            }
        }
        if (r8 == 2) {
            i10 = Math.min(i10, 6);
        } else if (r8 == 3) {
            i10 = Math.max(i10, 3);
        } else {
            i iVar5 = this.f16601c;
            if (iVar5.mRemoving) {
                i10 = iVar5.isInBackStack() ? Math.min(i10, 1) : Math.min(i10, -1);
            }
        }
        i iVar6 = this.f16601c;
        if (iVar6.mDeferStart && iVar6.mState < 5) {
            i10 = Math.min(i10, 4);
        }
        i iVar7 = this.f16601c;
        if (iVar7.mTransitioning && iVar7.mContainer != null) {
            i10 = Math.max(i10, 3);
        }
        if (y.L(2)) {
            StringBuilder n2 = a0.j.n("computeExpectedState() of ", i10, " for ");
            n2.append(this.f16601c);
            Log.v("FragmentManager", n2.toString());
        }
        return i10;
    }

    public final void e() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto CREATED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        Bundle bundle = this.f16601c.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        i iVar = this.f16601c;
        if (iVar.mIsCreated) {
            iVar.mState = 1;
            iVar.restoreChildFragmentState();
        } else {
            this.f16599a.h(iVar, false);
            this.f16601c.performCreate(bundle2);
            this.f16599a.c(this.f16601c, false);
        }
    }

    public final void f() {
        String str;
        if (this.f16601c.mFromLayout) {
            return;
        }
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto CREATE_VIEW: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        Bundle bundle = this.f16601c.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater performGetLayoutInflater = this.f16601c.performGetLayoutInflater(bundle2);
        i iVar = this.f16601c;
        ViewGroup viewGroup2 = iVar.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i10 = iVar.mContainerId;
            if (i10 != 0) {
                if (i10 == -1) {
                    StringBuilder l11 = defpackage.f.l("Cannot create fragment ");
                    l11.append(this.f16601c);
                    l11.append(" for a container view with no id");
                    throw new IllegalArgumentException(l11.toString());
                }
                viewGroup = (ViewGroup) iVar.mFragmentManager.f16788x.b(i10);
                if (viewGroup == null) {
                    i iVar2 = this.f16601c;
                    if (!iVar2.mRestored) {
                        try {
                            str = iVar2.getResources().getResourceName(this.f16601c.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        StringBuilder l12 = defpackage.f.l("No view found for id 0x");
                        l12.append(Integer.toHexString(this.f16601c.mContainerId));
                        l12.append(" (");
                        l12.append(str);
                        l12.append(") for fragment ");
                        l12.append(this.f16601c);
                        throw new IllegalArgumentException(l12.toString());
                    }
                } else if (!(viewGroup instanceof q)) {
                    i iVar3 = this.f16601c;
                    b.c cVar = y0.b.f17301a;
                    ec.i.e(iVar3, "fragment");
                    y0.l lVar = new y0.l(iVar3, viewGroup);
                    y0.b.c(lVar);
                    b.c a10 = y0.b.a(iVar3);
                    if (a10.f17312a.contains(b.a.DETECT_WRONG_FRAGMENT_CONTAINER) && y0.b.f(a10, iVar3.getClass(), y0.l.class)) {
                        y0.b.b(a10, lVar);
                    }
                }
            }
        }
        i iVar4 = this.f16601c;
        iVar4.mContainer = viewGroup;
        iVar4.performCreateView(performGetLayoutInflater, viewGroup, bundle2);
        if (this.f16601c.mView != null) {
            if (y.L(3)) {
                StringBuilder l13 = defpackage.f.l("moveto VIEW_CREATED: ");
                l13.append(this.f16601c);
                Log.d("FragmentManager", l13.toString());
            }
            this.f16601c.mView.setSaveFromParentEnabled(false);
            i iVar5 = this.f16601c;
            iVar5.mView.setTag(R.id.fragment_container_view_tag, iVar5);
            if (viewGroup != null) {
                b();
            }
            i iVar6 = this.f16601c;
            if (iVar6.mHidden) {
                iVar6.mView.setVisibility(8);
            }
            if (this.f16601c.mView.isAttachedToWindow()) {
                View view = this.f16601c.mView;
                WeakHashMap<View, e0.o0> weakHashMap = e0.d0.f3766a;
                d0.c.c(view);
            } else {
                View view2 = this.f16601c.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f16601c.performViewCreated();
            v vVar = this.f16599a;
            i iVar7 = this.f16601c;
            vVar.m(iVar7, iVar7.mView, false);
            int visibility = this.f16601c.mView.getVisibility();
            this.f16601c.setPostOnViewCreatedAlpha(this.f16601c.mView.getAlpha());
            i iVar8 = this.f16601c;
            if (iVar8.mContainer != null && visibility == 0) {
                View findFocus = iVar8.mView.findFocus();
                if (findFocus != null) {
                    this.f16601c.setFocusedView(findFocus);
                    if (y.L(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f16601c);
                    }
                }
                this.f16601c.mView.setAlpha(0.0f);
            }
        }
        this.f16601c.mState = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e0.g():void");
    }

    public final void h() {
        View view;
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("movefrom CREATE_VIEW: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        i iVar = this.f16601c;
        ViewGroup viewGroup = iVar.mContainer;
        if (viewGroup != null && (view = iVar.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f16601c.performDestroyView();
        this.f16599a.n(this.f16601c, false);
        i iVar2 = this.f16601c;
        iVar2.mContainer = null;
        iVar2.mView = null;
        iVar2.mViewLifecycleOwner = null;
        iVar2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f16601c.mInLayout = false;
    }

    public final void i() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("movefrom ATTACHED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        this.f16601c.performDetach();
        boolean z10 = false;
        this.f16599a.e(this.f16601c, false);
        i iVar = this.f16601c;
        iVar.mState = -1;
        iVar.mHost = null;
        iVar.mParentFragment = null;
        iVar.mFragmentManager = null;
        boolean z11 = true;
        if (iVar.mRemoving && !iVar.isInBackStack()) {
            z10 = true;
        }
        if (!z10) {
            b0 b0Var = (b0) this.f16600b.f16611d;
            if (b0Var.f16538d.containsKey(this.f16601c.mWho) && b0Var.f16540g) {
                z11 = b0Var.f16541h;
            }
            if (!z11) {
                return;
            }
        }
        if (y.L(3)) {
            StringBuilder l11 = defpackage.f.l("initState called for fragment: ");
            l11.append(this.f16601c);
            Log.d("FragmentManager", l11.toString());
        }
        this.f16601c.initState();
    }

    public final void j() {
        i iVar = this.f16601c;
        if (iVar.mFromLayout && iVar.mInLayout && !iVar.mPerformedCreateView) {
            if (y.L(3)) {
                StringBuilder l10 = defpackage.f.l("moveto CREATE_VIEW: ");
                l10.append(this.f16601c);
                Log.d("FragmentManager", l10.toString());
            }
            Bundle bundle = this.f16601c.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            i iVar2 = this.f16601c;
            iVar2.performCreateView(iVar2.performGetLayoutInflater(bundle2), null, bundle2);
            View view = this.f16601c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                i iVar3 = this.f16601c;
                iVar3.mView.setTag(R.id.fragment_container_view_tag, iVar3);
                i iVar4 = this.f16601c;
                if (iVar4.mHidden) {
                    iVar4.mView.setVisibility(8);
                }
                this.f16601c.performViewCreated();
                v vVar = this.f16599a;
                i iVar5 = this.f16601c;
                vVar.m(iVar5, iVar5.mView, false);
                this.f16601c.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f16602d) {
            if (y.L(2)) {
                StringBuilder l10 = defpackage.f.l("Ignoring re-entrant call to moveToExpectedState() for ");
                l10.append(this.f16601c);
                Log.v("FragmentManager", l10.toString());
                return;
            }
            return;
        }
        try {
            this.f16602d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                i iVar = this.f16601c;
                int i10 = iVar.mState;
                int i11 = 3;
                if (d10 == i10) {
                    if (!z10 && i10 == -1 && iVar.mRemoving && !iVar.isInBackStack() && !this.f16601c.mBeingSaved) {
                        if (y.L(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f16601c);
                        }
                        ((b0) this.f16600b.f16611d).e(this.f16601c, true);
                        this.f16600b.i(this);
                        if (y.L(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f16601c);
                        }
                        this.f16601c.initState();
                    }
                    i iVar2 = this.f16601c;
                    if (iVar2.mHiddenChanged) {
                        if (iVar2.mView != null && (viewGroup = iVar2.mContainer) != null) {
                            r0 m10 = r0.m(viewGroup, iVar2.getParentFragmentManager());
                            if (this.f16601c.mHidden) {
                                m10.f(this);
                            } else {
                                m10.h(this);
                            }
                        }
                        i iVar3 = this.f16601c;
                        y yVar = iVar3.mFragmentManager;
                        if (yVar != null && iVar3.mAdded && y.M(iVar3)) {
                            yVar.G = true;
                        }
                        i iVar4 = this.f16601c;
                        iVar4.mHiddenChanged = false;
                        iVar4.onHiddenChanged(iVar4.mHidden);
                        this.f16601c.mChildFragmentManager.p();
                    }
                    return;
                }
                if (d10 <= i10) {
                    switch (i10 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (iVar.mBeingSaved) {
                                if (((Bundle) ((HashMap) this.f16600b.f16610c).get(iVar.mWho)) == null) {
                                    this.f16600b.j(o(), this.f16601c.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            this.f16601c.mState = 1;
                            break;
                        case 2:
                            iVar.mInLayout = false;
                            iVar.mState = 2;
                            break;
                        case 3:
                            if (y.L(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f16601c);
                            }
                            i iVar5 = this.f16601c;
                            if (iVar5.mBeingSaved) {
                                this.f16600b.j(o(), iVar5.mWho);
                            } else if (iVar5.mView != null && iVar5.mSavedViewState == null) {
                                p();
                            }
                            i iVar6 = this.f16601c;
                            if (iVar6.mView != null && (viewGroup2 = iVar6.mContainer) != null) {
                                r0.m(viewGroup2, iVar6.getParentFragmentManager()).g(this);
                            }
                            this.f16601c.mState = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            iVar.mState = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i10 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (iVar.mView != null && (viewGroup3 = iVar.mContainer) != null) {
                                r0 m11 = r0.m(viewGroup3, iVar.getParentFragmentManager());
                                int visibility = this.f16601c.mView.getVisibility();
                                if (visibility == 0) {
                                    i11 = 2;
                                } else if (visibility == 4) {
                                    i11 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                m11.e(i11, this);
                            }
                            this.f16601c.mState = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            iVar.mState = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z10 = true;
            }
        } finally {
            this.f16602d = false;
        }
    }

    public final void l() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("movefrom RESUMED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        this.f16601c.performPause();
        this.f16599a.f(this.f16601c, false);
    }

    public final void m(ClassLoader classLoader) {
        Bundle bundle = this.f16601c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (this.f16601c.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            this.f16601c.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            i iVar = this.f16601c;
            iVar.mSavedViewState = iVar.mSavedFragmentState.getSparseParcelableArray("viewState");
            i iVar2 = this.f16601c;
            iVar2.mSavedViewRegistryState = iVar2.mSavedFragmentState.getBundle("viewRegistryState");
            d0 d0Var = (d0) this.f16601c.mSavedFragmentState.getParcelable("state");
            if (d0Var != null) {
                i iVar3 = this.f16601c;
                iVar3.mTargetWho = d0Var.t;
                iVar3.mTargetRequestCode = d0Var.f16559u;
                Boolean bool = iVar3.mSavedUserVisibleHint;
                if (bool != null) {
                    iVar3.mUserVisibleHint = bool.booleanValue();
                    this.f16601c.mSavedUserVisibleHint = null;
                } else {
                    iVar3.mUserVisibleHint = d0Var.f16560v;
                }
            }
            i iVar4 = this.f16601c;
            if (iVar4.mUserVisibleHint) {
                return;
            }
            iVar4.mDeferStart = true;
        } catch (BadParcelableException e10) {
            StringBuilder l10 = defpackage.f.l("Failed to restore view hierarchy state for fragment ");
            l10.append(this.f16601c);
            throw new IllegalStateException(l10.toString(), e10);
        }
    }

    public final void n() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto RESUMED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        View focusedView = this.f16601c.getFocusedView();
        if (focusedView != null) {
            boolean z10 = true;
            if (focusedView != this.f16601c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z10 = false;
                        break;
                    } else if (parent == this.f16601c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z10) {
                boolean requestFocus = focusedView.requestFocus();
                if (y.L(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("requestFocus: Restoring focused view ");
                    sb2.append(focusedView);
                    sb2.append(" ");
                    sb2.append(requestFocus ? "succeeded" : "failed");
                    sb2.append(" on Fragment ");
                    sb2.append(this.f16601c);
                    sb2.append(" resulting in focused view ");
                    sb2.append(this.f16601c.mView.findFocus());
                    Log.v("FragmentManager", sb2.toString());
                }
            }
        }
        this.f16601c.setFocusedView(null);
        this.f16601c.performResume();
        this.f16599a.i(this.f16601c, false);
        this.f16600b.j(null, this.f16601c.mWho);
        i iVar = this.f16601c;
        iVar.mSavedFragmentState = null;
        iVar.mSavedViewState = null;
        iVar.mSavedViewRegistryState = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        i iVar = this.f16601c;
        if (iVar.mState == -1 && (bundle = iVar.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new d0(this.f16601c));
        if (this.f16601c.mState > -1) {
            Bundle bundle3 = new Bundle();
            this.f16601c.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f16599a.j(this.f16601c, bundle3, false);
            Bundle bundle4 = new Bundle();
            this.f16601c.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle W = this.f16601c.mChildFragmentManager.W();
            if (!W.isEmpty()) {
                bundle2.putBundle("childFragmentManager", W);
            }
            if (this.f16601c.mView != null) {
                p();
            }
            SparseArray<Parcelable> sparseArray = this.f16601c.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = this.f16601c.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = this.f16601c.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        if (this.f16601c.mView == null) {
            return;
        }
        if (y.L(2)) {
            StringBuilder l10 = defpackage.f.l("Saving view state for fragment ");
            l10.append(this.f16601c);
            l10.append(" with view ");
            l10.append(this.f16601c.mView);
            Log.v("FragmentManager", l10.toString());
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f16601c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f16601c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f16601c.mViewLifecycleOwner.f16725e.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f16601c.mSavedViewRegistryState = bundle;
    }

    public final void q() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("moveto STARTED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        this.f16601c.performStart();
        this.f16599a.k(this.f16601c, false);
    }

    public final void r() {
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("movefrom STARTED: ");
            l10.append(this.f16601c);
            Log.d("FragmentManager", l10.toString());
        }
        this.f16601c.performStop();
        this.f16599a.l(this.f16601c, false);
    }
}
