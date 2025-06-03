package x0;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import b1.k;
import b1.q0;
import d1.b;
import io.meduza.meduza.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import x0.y;
import y0.b;

/* loaded from: classes.dex */
public class i implements ComponentCallbacks, View.OnCreateContextMenuListener, b1.o, b1.t0, b1.h, s1.e {
    public static final int ACTIVITY_CREATED = 4;
    public static final int ATTACHED = 0;
    public static final int AWAITING_ENTER_EFFECTS = 6;
    public static final int AWAITING_EXIT_EFFECTS = 3;
    public static final int CREATED = 1;
    public static final int INITIALIZING = -1;
    public static final int RESUMED = 7;
    public static final int STARTED = 5;
    public static final Object USE_DEFAULT_TRANSITION = new Object();
    public static final int VIEW_CREATED = 2;
    public boolean mAdded;
    public k mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mBeingSaved;
    private boolean mCalled;
    public y mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    private int mContentLayoutId;
    public q0.b mDefaultFactory;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public y mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public t<?> mHost;
    public boolean mInLayout;
    public boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public b1.p mLifecycleRegistry;
    public k.b mMaxState;
    public boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    public i mParentFragment;
    public boolean mPerformedCreateView;
    public Runnable mPostponedDurationRunnable;
    public Handler mPostponedHandler;
    public String mPreviousWho;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    public s1.d mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public Bundle mSavedViewRegistryState;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public i mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mTransitioning;
    public boolean mUserVisibleHint;
    public View mView;
    public o0 mViewLifecycleOwner;
    public b1.w<b1.o> mViewLifecycleOwnerLiveData;
    public String mWho;

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends d.c<I> {
        public a(AtomicReference atomicReference) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.startPostponedEnterTransition();
        }
    }

    public class c extends m {
        public c() {
        }

        @Override // x0.i.m
        public final void a() {
            i.this.mSavedStateRegistryController.a();
            b1.h0.b(i.this);
            Bundle bundle = i.this.mSavedFragmentState;
            i.this.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f16661a;

        public e(r0 r0Var) {
            this.f16661a = r0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f16661a.f16737b.isEmpty()) {
                this.f16661a.i();
            }
        }
    }

    public class f extends p {
        public f() {
        }

        @Override // x0.p
        public final View b(int i10) {
            View view = i.this.mView;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder l10 = defpackage.f.l("Fragment ");
            l10.append(i.this);
            l10.append(" does not have a view");
            throw new IllegalStateException(l10.toString());
        }

        @Override // x0.p
        public final boolean c() {
            return i.this.mView != null;
        }
    }

    public class g implements b1.m {
        public g() {
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            View view;
            if (aVar != k.a.ON_STOP || (view = i.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements o.a<Void, d.g> {
        public h() {
        }

        @Override // o.a
        public final d.g apply(Void r32) {
            i iVar = i.this;
            Object obj = iVar.mHost;
            return obj instanceof d.h ? ((d.h) obj).getActivityResultRegistry() : iVar.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: x0.i$i, reason: collision with other inner class name */
    public class C0258i implements o.a<Void, d.g> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d.g f16665a;

        public C0258i(d.g gVar) {
            this.f16665a = gVar;
        }

        @Override // o.a
        public final d.g apply(Void r12) {
            return this.f16665a;
        }
    }

    public class j extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o.a f16666a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f16667b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e.a f16668c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d.b f16669d;

        public j(o.a aVar, AtomicReference atomicReference, e.a aVar2, d.b bVar) {
            this.f16666a = aVar;
            this.f16667b = atomicReference;
            this.f16668c = aVar2;
            this.f16669d = bVar;
        }

        @Override // x0.i.m
        public final void a() {
            String generateActivityResultKey = i.this.generateActivityResultKey();
            this.f16667b.set(((d.g) this.f16666a.apply(null)).c(generateActivityResultKey, i.this, this.f16668c, this.f16669d));
        }
    }

    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16671a;

        /* renamed from: b, reason: collision with root package name */
        public int f16672b;

        /* renamed from: c, reason: collision with root package name */
        public int f16673c;

        /* renamed from: d, reason: collision with root package name */
        public int f16674d;

        /* renamed from: e, reason: collision with root package name */
        public int f16675e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<String> f16676g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList<String> f16677h;

        /* renamed from: i, reason: collision with root package name */
        public Object f16678i = null;

        /* renamed from: j, reason: collision with root package name */
        public Object f16679j;

        /* renamed from: k, reason: collision with root package name */
        public Object f16680k;

        /* renamed from: l, reason: collision with root package name */
        public Object f16681l;

        /* renamed from: m, reason: collision with root package name */
        public Object f16682m;

        /* renamed from: n, reason: collision with root package name */
        public Object f16683n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f16684o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f16685p;

        /* renamed from: q, reason: collision with root package name */
        public u.a0 f16686q;

        /* renamed from: r, reason: collision with root package name */
        public u.a0 f16687r;

        /* renamed from: s, reason: collision with root package name */
        public float f16688s;
        public View t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f16689u;

        public k() {
            Object obj = i.USE_DEFAULT_TRANSITION;
            this.f16679j = obj;
            this.f16680k = null;
            this.f16681l = obj;
            this.f16682m = null;
            this.f16683n = obj;
            this.f16686q = null;
            this.f16687r = null;
            this.f16688s = 1.0f;
            this.t = null;
        }
    }

    public static class l extends RuntimeException {
        public l(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class m {
        public abstract void a();
    }

    public static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f16690a;

        public class a implements Parcelable.ClassLoaderCreator<n> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new n(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new n[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new n(parcel, classLoader);
            }
        }

        public n(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f16690a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f16690a);
        }
    }

    public i() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new z();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = k.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new b1.w<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    public i(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        k.b bVar = this.mMaxState;
        return (bVar == k.b.INITIALIZED || this.mParentFragment == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private i getTargetFragment(boolean z10) {
        String str;
        if (z10) {
            b.c cVar = y0.b.f17301a;
            y0.f fVar = new y0.f(this);
            y0.b.c(fVar);
            b.c a10 = y0.b.a(this);
            if (a10.f17312a.contains(b.a.DETECT_TARGET_FRAGMENT_USAGE) && y0.b.f(a10, getClass(), y0.f.class)) {
                y0.b.b(a10, fVar);
            }
        }
        i iVar = this.mTarget;
        if (iVar != null) {
            return iVar;
        }
        y yVar = this.mFragmentManager;
        if (yVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return yVar.C(str);
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new b1.p(this);
        this.mSavedStateRegistryController = new s1.d(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @Deprecated
    public static i instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    @Deprecated
    public static i instantiate(Context context, String str, Bundle bundle) {
        try {
            i newInstance = s.b(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e10) {
            throw new l(defpackage.g.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e10);
        } catch (InstantiationException e11) {
            throw new l(defpackage.g.e("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new l(defpackage.g.e("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new l(defpackage.g.e("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        o0 o0Var = this.mViewLifecycleOwner;
        o0Var.f16725e.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    private <I, O> d.c<I> prepareCallInternal(e.a<I, O> aVar, o.a<Void, d.g> aVar2, d.b<O> bVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(aVar2, atomicReference, aVar, bVar));
        return new a(atomicReference);
    }

    private void registerOnPreAttachListener(m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void restoreViewState() {
        if (y.L(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z10) {
        ViewGroup viewGroup;
        y yVar;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f16689u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (yVar = this.mFragmentManager) == null) {
            return;
        }
        r0 m10 = r0.m(viewGroup, yVar);
        m10.n();
        if (z10) {
            this.mHost.f16758c.post(new e(m10));
        } else {
            m10.i();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    public p createFragmentContainer() {
        return new f();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        i targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            d1.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(defpackage.g.d(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public i findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f16769c.d(str);
    }

    public String generateActivityResultKey() {
        StringBuilder l10 = defpackage.f.l("fragment_");
        l10.append(this.mWho);
        l10.append("_rq#");
        l10.append(this.mNextLocalRequestCode.getAndIncrement());
        return l10.toString();
    }

    public final x0.m getActivity() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return (x0.m) tVar.f16756a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f16685p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f16684o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final y getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " has not been attached yet."));
    }

    public Context getContext() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.f16757b;
    }

    @Override // b1.h
    public c1.a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && y.L(3)) {
            StringBuilder l10 = defpackage.f.l("Could not find Application instance from Context ");
            l10.append(requireContext().getApplicationContext());
            l10.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            Log.d("FragmentManager", l10.toString());
        }
        c1.b bVar = new c1.b();
        if (application != null) {
            bVar.f2211a.put(b1.p0.f1779a, application);
        }
        bVar.f2211a.put(b1.h0.f1734a, this);
        bVar.f2211a.put(b1.h0.f1735b, this);
        if (getArguments() != null) {
            bVar.f2211a.put(b1.h0.f1736c, getArguments());
        }
        return bVar;
    }

    public q0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && y.L(3)) {
                StringBuilder l10 = defpackage.f.l("Could not find Application instance from Context ");
                l10.append(requireContext().getApplicationContext());
                l10.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                Log.d("FragmentManager", l10.toString());
            }
            this.mDefaultFactory = new b1.k0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16672b;
    }

    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16678i;
    }

    public u.a0 getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16686q;
    }

    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16673c;
    }

    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16680k;
    }

    public u.a0 getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16687r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.t;
    }

    @Deprecated
    public final y getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            return null;
        }
        return tVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater f10 = tVar.f();
        f10.setFactory2(this.mChildFragmentManager.f);
        return f10;
    }

    @Override // b1.o
    public b1.k getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public d1.a getLoaderManager() {
        return d1.a.a(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f;
    }

    public final i getParentFragment() {
        return this.mParentFragment;
    }

    public final y getParentFragmentManager() {
        y yVar = this.mFragmentManager;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f16671a;
    }

    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16674d;
    }

    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f16675e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f16688s;
    }

    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f16681l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        b.c cVar = y0.b.f17301a;
        y0.d dVar = new y0.d(this);
        y0.b.c(dVar);
        b.c a10 = y0.b.a(this);
        if (a10.f17312a.contains(b.a.DETECT_RETAIN_INSTANCE_USAGE) && y0.b.f(a10, getClass(), y0.d.class)) {
            y0.b.b(a10, dVar);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f16679j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // s1.e
    public final s1.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f14147b;
    }

    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f16682m;
    }

    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f16683n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f16676g) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f16677h) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i10) {
        return getResources().getString(i10);
    }

    public final String getString(int i10, Object... objArr) {
        return getResources().getString(i10, objArr);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final i getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        b.c cVar = y0.b.f17301a;
        y0.e eVar = new y0.e(this);
        y0.b.c(eVar);
        b.c a10 = y0.b.a(this);
        if (a10.f17312a.contains(b.a.DETECT_TARGET_FRAGMENT_USAGE) && y0.b.f(a10, getClass(), y0.e.class)) {
            y0.b.b(a10, eVar);
        }
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i10) {
        return getResources().getText(i10);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public b1.o getViewLifecycleOwner() {
        o0 o0Var = this.mViewLifecycleOwner;
        if (o0Var != null) {
            return o0Var;
        }
        throw new IllegalStateException(defpackage.f.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public b1.t<b1.o> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // b1.t0
    public b1.s0 getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        b0 b0Var = this.mFragmentManager.O;
        b1.s0 s0Var = b0Var.f.get(this.mWho);
        if (s0Var != null) {
            return s0Var;
        }
        b1.s0 s0Var2 = new b1.s0();
        b0Var.f.put(this.mWho, s0Var2);
        return s0Var2;
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new z();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            y yVar = this.mFragmentManager;
            if (yVar == null) {
                return false;
            }
            i iVar = this.mParentFragment;
            yVar.getClass();
            if (!(iVar == null ? false : iVar.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            i iVar = this.mParentFragment;
            if (iVar == null ? true : iVar.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f16689u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            return false;
        }
        return yVar.H || yVar.I;
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.Q();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (y.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        t<?> tVar = this.mHost;
        Activity activity = tVar == null ? null : tVar.f16756a;
        if (activity != null) {
            this.mCalled = false;
            onAttach(activity);
        }
    }

    @Deprecated
    public void onAttachFragment(i iVar) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        y yVar = this.mChildFragmentManager;
        if (yVar.f16786v >= 1) {
            return;
        }
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(1);
    }

    public Animation onCreateAnimation(int i10, boolean z10, int i11) {
        return null;
    }

    public Animator onCreateAnimator(int i10, boolean z10, int i11) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z10) {
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        t<?> tVar = this.mHost;
        Activity activity = tVar == null ? null : tVar.f16756a;
        if (activity != null) {
            this.mCalled = false;
            onInflate(activity, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z10) {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z10) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z10) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        y yVar = this.mChildFragmentManager;
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(4);
    }

    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.c(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f16757b);
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<c0> it2 = this.mFragmentManager.f16781p.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        y yVar = this.mChildFragmentManager;
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(0);
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.k(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(k.a.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z10 | this.mChildFragmentManager.l(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.Q();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new o0(this, getViewModelStore(), new u.a(this, 2));
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView == null) {
            if (this.mViewLifecycleOwner.f16724d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (y.L(3)) {
            StringBuilder l10 = defpackage.f.l("Setting ViewLifecycleOwner on View ");
            l10.append(this.mView);
            l10.append(" for Fragment ");
            l10.append(this);
            Log.d("FragmentManager", l10.toString());
        }
        b.a0.G(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        o0 o0Var = this.mViewLifecycleOwner;
        ec.i.e(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, o0Var);
        b.a0.H(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m();
        this.mLifecycleRegistry.f(k.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.v(1);
        if (this.mView != null) {
            o0 o0Var = this.mViewLifecycleOwner;
            o0Var.b();
            if (o0Var.f16724d.f1771c.compareTo(k.b.CREATED) >= 0) {
                this.mViewLifecycleOwner.a(k.a.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        b.c cVar = d1.a.a(this).f3333b;
        int i10 = cVar.f3341d.f13504c;
        for (int i11 = 0; i11 < i10; i11++) {
            ((b.a) cVar.f3341d.f13503b[i11]).a();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onDetach()"));
        }
        y yVar = this.mChildFragmentManager;
        if (yVar.J) {
            return;
        }
        yVar.m();
        this.mChildFragmentManager = new z();
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z10) {
        onMultiWindowModeChanged(z10);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.q(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(k.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(k.a.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z10) {
        onPictureInPictureModeChanged(z10);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z10 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z10 = true;
            onPrepareOptionsMenu(menu);
        }
        return z10 | this.mChildFragmentManager.u(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean O = y.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != O) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(O);
            onPrimaryNavigationFragmentChanged(O);
            y yVar = this.mChildFragmentManager;
            yVar.f0();
            yVar.s(yVar.f16790z);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onResume()"));
        }
        b1.p pVar = this.mLifecycleRegistry;
        k.a aVar = k.a.ON_RESUME;
        pVar.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f16724d.f(aVar);
        }
        y yVar = this.mChildFragmentManager;
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.Q();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onStart()"));
        }
        b1.p pVar = this.mLifecycleRegistry;
        k.a aVar = k.a.ON_START;
        pVar.f(aVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f16724d.f(aVar);
        }
        y yVar = this.mChildFragmentManager;
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(5);
    }

    public void performStop() {
        y yVar = this.mChildFragmentManager;
        yVar.I = true;
        yVar.O.f16542i = true;
        yVar.v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(k.a.ON_STOP);
        }
        this.mLifecycleRegistry.f(k.a.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.v(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f16689u = true;
    }

    public final void postponeEnterTransition(long j10, TimeUnit timeUnit) {
        ensureAnimationInfo().f16689u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        y yVar = this.mFragmentManager;
        this.mPostponedHandler = yVar != null ? yVar.f16787w.f16758c : new Handler(Looper.getMainLooper());
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j10));
    }

    public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> aVar, d.b<O> bVar) {
        return prepareCallInternal(aVar, new h(), bVar);
    }

    public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> aVar, d.g gVar, d.b<O> bVar) {
        return prepareCallInternal(aVar, new C0258i(gVar), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i10) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to Activity"));
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            parentFragmentManager.f16787w.getClass();
            ec.i.e(strArr, "permissions");
        } else {
            parentFragmentManager.F.addLast(new y.k(this.mWho, i10));
            parentFragmentManager.E.a(strArr);
        }
    }

    public final x0.m requireActivity() {
        x0.m activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to an activity."));
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " does not have any arguments."));
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to a context."));
    }

    @Deprecated
    public final y requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to a host."));
    }

    public final i requireParentFragment() {
        i parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(defpackage.f.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.V(bundle);
        y yVar = this.mChildFragmentManager;
        yVar.H = false;
        yVar.I = false;
        yVar.O.f16542i = false;
        yVar.v(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new u0(defpackage.f.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(k.a.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f16685p = Boolean.valueOf(z10);
    }

    public void setAllowReturnTransitionOverlap(boolean z10) {
        ensureAnimationInfo().f16684o = Boolean.valueOf(z10);
    }

    public void setAnimations(int i10, int i11, int i12, int i13) {
        if (this.mAnimationInfo == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        ensureAnimationInfo().f16672b = i10;
        ensureAnimationInfo().f16673c = i11;
        ensureAnimationInfo().f16674d = i12;
        ensureAnimationInfo().f16675e = i13;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(u.a0 a0Var) {
        ensureAnimationInfo().f16686q = a0Var;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f16678i = obj;
    }

    public void setExitSharedElementCallback(u.a0 a0Var) {
        ensureAnimationInfo().f16687r = a0Var;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f16680k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z10) {
        if (this.mHasMenu != z10) {
            this.mHasMenu = z10;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.i();
        }
    }

    public void setInitialSavedState(n nVar) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (nVar == null || (bundle = nVar.f16690a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z10) {
        if (this.mMenuVisible != z10) {
            this.mMenuVisible = z10;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.i();
            }
        }
    }

    public void setNextTransition(int i10) {
        if (this.mAnimationInfo == null && i10 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f = i10;
    }

    public void setPopDirection(boolean z10) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f16671a = z10;
    }

    public void setPostOnViewCreatedAlpha(float f10) {
        ensureAnimationInfo().f16688s = f10;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f16681l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z10) {
        b.c cVar = y0.b.f17301a;
        y0.h hVar = new y0.h(this);
        y0.b.c(hVar);
        b.c a10 = y0.b.a(this);
        if (a10.f17312a.contains(b.a.DETECT_RETAIN_INSTANCE_USAGE) && y0.b.f(a10, getClass(), y0.h.class)) {
            y0.b.b(a10, hVar);
        }
        this.mRetainInstance = z10;
        y yVar = this.mFragmentManager;
        if (yVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z10) {
            yVar.O.c(this);
        } else {
            yVar.O.g(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f16679j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f16682m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f16676g = arrayList;
        kVar.f16677h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f16683n = obj;
    }

    @Deprecated
    public void setTargetFragment(i iVar, int i10) {
        if (iVar != null) {
            b.c cVar = y0.b.f17301a;
            y0.i iVar2 = new y0.i(this, iVar, i10);
            y0.b.c(iVar2);
            b.c a10 = y0.b.a(this);
            if (a10.f17312a.contains(b.a.DETECT_TARGET_FRAGMENT_USAGE) && y0.b.f(a10, getClass(), y0.i.class)) {
                y0.b.b(a10, iVar2);
            }
        }
        y yVar = this.mFragmentManager;
        y yVar2 = iVar != null ? iVar.mFragmentManager : null;
        if (yVar != null && yVar2 != null && yVar != yVar2) {
            throw new IllegalArgumentException(defpackage.f.k("Fragment ", iVar, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (i iVar3 = iVar; iVar3 != null; iVar3 = iVar3.getTargetFragment(false)) {
            if (iVar3.equals(this)) {
                throw new IllegalArgumentException("Setting " + iVar + " as the target of " + this + " would create a target cycle");
            }
        }
        if (iVar == null) {
            this.mTargetWho = null;
        } else {
            if (this.mFragmentManager == null || iVar.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = iVar;
                this.mTargetRequestCode = i10;
            }
            this.mTargetWho = iVar.mWho;
        }
        this.mTarget = null;
        this.mTargetRequestCode = i10;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z10) {
        b.c cVar = y0.b.f17301a;
        y0.j jVar = new y0.j(this, z10);
        y0.b.c(jVar);
        b.c a10 = y0.b.a(this);
        if (a10.f17312a.contains(b.a.DETECT_SET_USER_VISIBLE_HINT) && y0.b.f(a10, getClass(), y0.j.class)) {
            y0.b.b(a10, jVar);
        }
        if (!this.mUserVisibleHint && z10 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            y yVar = this.mFragmentManager;
            e0 h10 = yVar.h(this);
            i iVar = h10.f16601c;
            if (iVar.mDeferStart) {
                if (yVar.f16768b) {
                    yVar.K = true;
                } else {
                    iVar.mDeferStart = false;
                    h10.k();
                }
            }
        }
        this.mUserVisibleHint = z10;
        this.mDeferStart = this.mState < 5 && !z10;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z10);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        t<?> tVar = this.mHost;
        if (tVar != null) {
            return tVar.g(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        t<?> tVar = this.mHost;
        if (tVar == null) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to Activity"));
        }
        tVar.h(this, intent, -1, bundle);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        startActivityForResult(intent, i10, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to Activity"));
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.C == null) {
            parentFragmentManager.f16787w.h(this, intent, i10, bundle);
            return;
        }
        parentFragmentManager.F.addLast(new y.k(this.mWho, i10));
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        parentFragmentManager.C.a(intent);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2 = intent;
        if (this.mHost == null) {
            throw new IllegalStateException(defpackage.f.k("Fragment ", this, " not attached to Activity"));
        }
        if (y.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        y parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D == null) {
            t<?> tVar = parentFragmentManager.f16787w;
            tVar.getClass();
            ec.i.e(intentSender, "intent");
            if (!(i10 == -1)) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
            }
            Activity activity = tVar.f16756a;
            if (activity == null) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
            }
            int i14 = u.b.f14784a;
            activity.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (y.L(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        ec.i.e(intentSender, "intentSender");
        d.i iVar = new d.i(intentSender, intent2, i11, i12);
        parentFragmentManager.F.addLast(new y.k(this.mWho, i10));
        if (y.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.D.a(iVar);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f16689u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f16689u = false;
        } else if (Looper.myLooper() != this.mHost.f16758c.getLooper()) {
            this.mHost.f16758c.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }
}
