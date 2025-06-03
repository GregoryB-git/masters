package b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import b1.c0;
import b1.h0;
import b1.k;
import b1.k0;
import b1.p0;
import b1.q0;
import b1.s0;
import b1.t0;
import e.a;
import e0.m;
import io.meduza.meduza.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import s1.c;

/* loaded from: classes.dex */
public class j extends u.j implements t0, b1.h, s1.e, y, d.h, v.c, v.d, u.v, u.w, e0.j {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final d.g mActivityResultRegistry;
    private int mContentLayoutId;
    public final c.a mContextAwareHelper;
    private q0.b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    public final n mFullyDrawnReporter;
    private final b1.p mLifecycleRegistry;
    private final e0.m mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private w mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<d0.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<d0.a<u.l>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<d0.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<d0.a<u.y>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<d0.a<Integer>> mOnTrimMemoryListeners;
    public final i mReportFullyDrawnExecutor;
    public final s1.d mSavedStateRegistryController;
    private s0 mViewModelStore;

    public class a extends d.g {
        public a() {
        }

        @Override // d.g
        public final void b(int i10, e.a aVar, Object obj) {
            j jVar = j.this;
            a.C0064a b10 = aVar.b(jVar, obj);
            if (b10 != null) {
                new Handler(Looper.getMainLooper()).post(new b.h(this, i10, b10));
                return;
            }
            Intent a10 = aVar.a(jVar, obj);
            Bundle bundle = null;
            if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
                a10.setExtrasClassLoader(jVar.getClassLoader());
            }
            if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
                String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                u.b.a(jVar, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
                int i11 = u.b.f14784a;
                jVar.startActivityForResult(a10, i10, bundle2);
                return;
            }
            d.i iVar = (d.i) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = iVar.f3324a;
                Intent intent = iVar.f3325b;
                int i12 = iVar.f3326c;
                int i13 = iVar.f3327d;
                int i14 = u.b.f14784a;
                jVar.startIntentSenderForResult(intentSender, i10, intent, i12, i13, 0, bundle2);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new b.i(this, i10, e10));
            }
        }
    }

    public class b implements b1.m {
        public b() {
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            if (aVar == k.a.ON_STOP) {
                Window window = j.this.getWindow();
                View peekDecorView = window != null ? window.peekDecorView() : null;
                if (peekDecorView != null) {
                    peekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    public class c implements b1.m {
        public c() {
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            if (aVar == k.a.ON_DESTROY) {
                j.this.mContextAwareHelper.f2205b = null;
                if (!j.this.isChangingConfigurations()) {
                    j.this.getViewModelStore().a();
                }
                ViewTreeObserverOnDrawListenerC0027j viewTreeObserverOnDrawListenerC0027j = (ViewTreeObserverOnDrawListenerC0027j) j.this.mReportFullyDrawnExecutor;
                j.this.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0027j);
                j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0027j);
            }
        }
    }

    public class d implements b1.m {
        public d() {
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            j.this.ensureViewModelStore();
            j.this.getLifecycle().c(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                j.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            } catch (NullPointerException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e11;
                }
            }
        }
    }

    public class f implements b1.m {
        public f() {
        }

        @Override // b1.m
        public final void a(b1.o oVar, k.a aVar) {
            if (aVar != k.a.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            w wVar = j.this.mOnBackPressedDispatcher;
            OnBackInvokedDispatcher a10 = g.a((j) oVar);
            wVar.getClass();
            ec.i.e(a10, "invoker");
            wVar.f = a10;
            wVar.c(wVar.f1643h);
        }
    }

    public static class g {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public Object f1608a;

        /* renamed from: b, reason: collision with root package name */
        public s0 f1609b;
    }

    public interface i extends Executor {
        void c0(View view);
    }

    /* renamed from: b.j$j, reason: collision with other inner class name */
    public class ViewTreeObserverOnDrawListenerC0027j implements i, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: b, reason: collision with root package name */
        public Runnable f1611b;

        /* renamed from: a, reason: collision with root package name */
        public final long f1610a = SystemClock.uptimeMillis() + 10000;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1612c = false;

        public ViewTreeObserverOnDrawListenerC0027j() {
        }

        @Override // b.j.i
        public final void c0(View view) {
            if (this.f1612c) {
                return;
            }
            this.f1612c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f1611b = runnable;
            View decorView = j.this.getWindow().getDecorView();
            if (!this.f1612c) {
                decorView.postOnAnimation(new b.d(this, 1));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f1611b;
            if (runnable != null) {
                runnable.run();
                this.f1611b = null;
                n nVar = j.this.mFullyDrawnReporter;
                synchronized (nVar.f1622b) {
                    z10 = nVar.f1623c;
                }
                if (!z10) {
                    return;
                }
            } else if (SystemClock.uptimeMillis() <= this.f1610a) {
                return;
            }
            this.f1612c = false;
            j.this.getWindow().getDecorView().post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            j.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public j() {
        this.mContextAwareHelper = new c.a();
        int i10 = 0;
        this.mMenuHostHelper = new e0.m(new b.d(this, i10));
        this.mLifecycleRegistry = new b1.p(this);
        s1.d dVar = new s1.d(this);
        this.mSavedStateRegistryController = dVar;
        this.mOnBackPressedDispatcher = null;
        i createFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = createFullyDrawnExecutor;
        this.mFullyDrawnReporter = new n(createFullyDrawnExecutor, new b.e(this, i10));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i11 = Build.VERSION.SDK_INT;
        getLifecycle().a(new b());
        getLifecycle().a(new c());
        getLifecycle().a(new d());
        dVar.a();
        h0.b(this);
        if (i11 <= 23) {
            getLifecycle().a(new o(this));
        }
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c.b() { // from class: b.f
            @Override // s1.c.b
            public final Bundle a() {
                Bundle lambda$new$1;
                lambda$new$1 = j.this.lambda$new$1();
                return lambda$new$1;
            }
        });
        addOnContextAvailableListener(new b.g(this, i10));
    }

    public j(int i10) {
        this();
        this.mContentLayoutId = i10;
    }

    private i createFullyDrawnExecutor() {
        return new ViewTreeObserverOnDrawListenerC0027j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ rb.h lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        d.g gVar = this.mActivityResultRegistry;
        gVar.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(gVar.f3315b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(gVar.f3315b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(gVar.f3317d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) gVar.f3319g.clone());
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(Context context) {
        Bundle a10 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            d.g gVar = this.mActivityResultRegistry;
            gVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            gVar.f3317d = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            gVar.f3319g.putAll(a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                String str = stringArrayList.get(i10);
                if (gVar.f3315b.containsKey(str)) {
                    Integer num = (Integer) gVar.f3315b.remove(str);
                    if (!gVar.f3319g.containsKey(str)) {
                        gVar.f3314a.remove(num);
                    }
                }
                int intValue = integerArrayList.get(i10).intValue();
                String str2 = stringArrayList.get(i10);
                gVar.f3314a.put(Integer.valueOf(intValue), str2);
                gVar.f3315b.put(str2, Integer.valueOf(intValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // e0.j
    public void addMenuProvider(e0.o oVar) {
        e0.m mVar = this.mMenuHostHelper;
        mVar.f3807b.add(oVar);
        mVar.f3806a.run();
    }

    @Override // v.c
    public final void addOnConfigurationChangedListener(d0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(c.b bVar) {
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        ec.i.e(bVar, "listener");
        Context context = aVar.f2205b;
        if (context != null) {
            bVar.a(context);
        }
        aVar.f2204a.add(bVar);
    }

    @Override // u.v
    public final void addOnMultiWindowModeChangedListener(d0.a<u.l> aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(d0.a<Intent> aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    @Override // u.w
    public final void addOnPictureInPictureModeChangedListener(d0.a<u.y> aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    @Override // v.d
    public final void addOnTrimMemoryListener(d0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.mViewModelStore = hVar.f1609b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new s0();
            }
        }
    }

    @Override // d.h
    public final d.g getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // b1.h
    public c1.a getDefaultViewModelCreationExtras() {
        c1.b bVar = new c1.b();
        if (getApplication() != null) {
            bVar.f2211a.put(p0.f1779a, getApplication());
        }
        bVar.f2211a.put(h0.f1734a, this);
        bVar.f2211a.put(h0.f1735b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            bVar.f2211a.put(h0.f1736c, getIntent().getExtras());
        }
        return bVar;
    }

    public q0.b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new k0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    public n getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        h hVar = (h) getLastNonConfigurationInstance();
        if (hVar != null) {
            return hVar.f1608a;
        }
        return null;
    }

    @Override // u.j, b1.o
    public b1.k getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // b.y
    public final w getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new w(new e());
            getLifecycle().a(new f());
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // s1.e
    public final s1.c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f14147b;
    }

    @Override // b1.t0
    public s0 getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void initializeViewTreeOwners() {
        a0.G(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        ec.i.e(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        a0.H(getWindow().getDecorView(), this);
        a0.F(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        ec.i.e(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.mActivityResultRegistry.a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<d0.a<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // u.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        aVar.f2205b = this;
        Iterator it = aVar.f2204a.iterator();
        while (it.hasNext()) {
            ((c.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = c0.f1719b;
        c0.b.b(this);
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        e0.m mVar = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<e0.o> it = mVar.f3807b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<e0.o> it = this.mMenuHostHelper.f3807b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<d0.a<u.l>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new u.l(z10));
        }
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<d0.a<u.l>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                d0.a<u.l> next = it.next();
                ec.i.e(configuration, "newConfig");
                next.accept(new u.l(z10));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<d0.a<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<e0.o> it = this.mMenuHostHelper.f3807b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<d0.a<u.y>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new u.y(z10));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<d0.a<u.y>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                d0.a<u.y> next = it.next();
                ec.i.e(configuration, "newConfig");
                next.accept(new u.y(z10));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        Iterator<e0.o> it = this.mMenuHostHelper.f3807b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        s0 s0Var = this.mViewModelStore;
        if (s0Var == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            s0Var = hVar.f1609b;
        }
        if (s0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f1608a = onRetainCustomNonConfigurationInstance;
        hVar2.f1609b = s0Var;
        return hVar2;
    }

    @Override // u.j, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        b1.k lifecycle = getLifecycle();
        if (lifecycle instanceof b1.p) {
            ((b1.p) lifecycle).h(k.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<d0.a<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f2205b;
    }

    public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> aVar, d.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> aVar, d.g gVar, d.b<O> bVar) {
        StringBuilder l10 = defpackage.f.l("activity_rq#");
        l10.append(this.mNextLocalRequestCode.getAndIncrement());
        return gVar.c(l10.toString(), this, aVar, bVar);
    }

    @Override // e0.j
    public void removeMenuProvider(e0.o oVar) {
        this.mMenuHostHelper.a(oVar);
    }

    @Override // v.c
    public final void removeOnConfigurationChangedListener(d0.a<Configuration> aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(c.b bVar) {
        c.a aVar = this.mContextAwareHelper;
        aVar.getClass();
        ec.i.e(bVar, "listener");
        aVar.f2204a.remove(bVar);
    }

    @Override // u.v
    public final void removeOnMultiWindowModeChangedListener(d0.a<u.l> aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(d0.a<Intent> aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    @Override // u.w
    public final void removeOnPictureInPictureModeChangedListener(d0.a<u.y> aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    @Override // v.d
    public final void removeOnTrimMemoryListener(d0.a<Integer> aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (z1.a.b()) {
                Trace.beginSection(z1.a.c("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            n nVar = this.mFullyDrawnReporter;
            synchronized (nVar.f1622b) {
                nVar.f1623c = true;
                Iterator it = nVar.f1624d.iterator();
                while (it.hasNext()) {
                    ((dc.a) it.next()).invoke();
                }
                nVar.f1624d.clear();
                rb.h hVar = rb.h.f13851a;
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    public void addMenuProvider(final e0.o oVar, b1.o oVar2) {
        final e0.m mVar = this.mMenuHostHelper;
        mVar.f3807b.add(oVar);
        mVar.f3806a.run();
        b1.k lifecycle = oVar2.getLifecycle();
        m.a aVar = (m.a) mVar.f3808c.remove(oVar);
        if (aVar != null) {
            aVar.f3809a.c(aVar.f3810b);
            aVar.f3810b = null;
        }
        mVar.f3808c.put(oVar, new m.a(lifecycle, new b1.m() { // from class: e0.k
            @Override // b1.m
            public final void a(b1.o oVar3, k.a aVar2) {
                m mVar2 = m.this;
                o oVar4 = oVar;
                if (aVar2 == k.a.ON_DESTROY) {
                    mVar2.a(oVar4);
                } else {
                    mVar2.getClass();
                }
            }
        }));
    }

    public void addMenuProvider(final e0.o oVar, b1.o oVar2, final k.b bVar) {
        final e0.m mVar = this.mMenuHostHelper;
        mVar.getClass();
        b1.k lifecycle = oVar2.getLifecycle();
        m.a aVar = (m.a) mVar.f3808c.remove(oVar);
        if (aVar != null) {
            aVar.f3809a.c(aVar.f3810b);
            aVar.f3810b = null;
        }
        mVar.f3808c.put(oVar, new m.a(lifecycle, new b1.m() { // from class: e0.l
            @Override // b1.m
            public final void a(b1.o oVar3, k.a aVar2) {
                m mVar2 = m.this;
                k.b bVar2 = bVar;
                o oVar4 = oVar;
                mVar2.getClass();
                k.a.Companion.getClass();
                ec.i.e(bVar2, "state");
                int ordinal = bVar2.ordinal();
                if (aVar2 == (ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : k.a.ON_RESUME : k.a.ON_START : k.a.ON_CREATE)) {
                    mVar2.f3807b.add(oVar4);
                    mVar2.f3806a.run();
                } else if (aVar2 == k.a.ON_DESTROY) {
                    mVar2.a(oVar4);
                } else if (aVar2 == k.a.C0029a.a(bVar2)) {
                    mVar2.f3807b.remove(oVar4);
                    mVar2.f3806a.run();
                }
            }
        }));
    }
}
