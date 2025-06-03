package b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnDrawListener;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import b1.c0;
import b1.c0.b;
import b1.h0;
import b1.k.a;
import b1.k.b;
import b1.k0;
import b1.p;
import b1.p0;
import b1.q0.b;
import b1.s0;
import b1.t0;
import e.a.a;
import e0.m.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u.v;

public class j
  extends u.j
  implements t0, b1.h, s1.e, y, d.h, v.c, v.d, v, u.w, e0.j
{
  private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
  private final d.g mActivityResultRegistry;
  private int mContentLayoutId;
  public final c.a mContextAwareHelper = new c.a();
  private q0.b mDefaultFactory;
  private boolean mDispatchingOnMultiWindowModeChanged;
  private boolean mDispatchingOnPictureInPictureModeChanged;
  public final n mFullyDrawnReporter;
  private final p mLifecycleRegistry = new p(this);
  private final e0.m mMenuHostHelper = new e0.m(new d(this, 0));
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
  
  public j()
  {
    s1.d locald = new s1.d(this);
    mSavedStateRegistryController = locald;
    mOnBackPressedDispatcher = null;
    i locali = createFullyDrawnExecutor();
    mReportFullyDrawnExecutor = locali;
    mFullyDrawnReporter = new n(locali, new e(this, 0));
    mNextLocalRequestCode = new AtomicInteger();
    mActivityResultRegistry = new a();
    mOnConfigurationChangedListeners = new CopyOnWriteArrayList();
    mOnTrimMemoryListeners = new CopyOnWriteArrayList();
    mOnNewIntentListeners = new CopyOnWriteArrayList();
    mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
    mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
    mDispatchingOnMultiWindowModeChanged = false;
    mDispatchingOnPictureInPictureModeChanged = false;
    if (getLifecycle() != null)
    {
      int i = Build.VERSION.SDK_INT;
      getLifecycle().a(new b());
      getLifecycle().a(new c());
      getLifecycle().a(new d());
      locald.a();
      h0.b(this);
      if (i <= 23) {
        getLifecycle().a(new o(this));
      }
      getSavedStateRegistry().c("android:support:activity-result", new f(this));
      addOnContextAvailableListener(new g(this, 0));
      return;
    }
    throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
  }
  
  public j(int paramInt)
  {
    this();
    mContentLayoutId = paramInt;
  }
  
  private i createFullyDrawnExecutor()
  {
    return new j();
  }
  
  private Bundle lambda$new$1()
  {
    Bundle localBundle = new Bundle();
    d.g localg = mActivityResultRegistry;
    localg.getClass();
    localBundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(b.values()));
    localBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(b.keySet()));
    localBundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(d));
    localBundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)g.clone());
    return localBundle;
  }
  
  private void lambda$new$2(Context paramContext)
  {
    Object localObject = getSavedStateRegistry().a("android:support:activity-result");
    if (localObject != null)
    {
      d.g localg = mActivityResultRegistry;
      localg.getClass();
      ArrayList localArrayList = ((Bundle)localObject).getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
      paramContext = ((Bundle)localObject).getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
      if ((paramContext != null) && (localArrayList != null))
      {
        d = ((Bundle)localObject).getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        g.putAll(((Bundle)localObject).getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i = 0; i < paramContext.size(); i++)
        {
          String str = (String)paramContext.get(i);
          if (b.containsKey(str))
          {
            localObject = (Integer)b.remove(str);
            if (!g.containsKey(str)) {
              a.remove(localObject);
            }
          }
          int j = ((Integer)localArrayList.get(i)).intValue();
          localObject = (String)paramContext.get(i);
          a.put(Integer.valueOf(j), localObject);
          b.put(localObject, Integer.valueOf(j));
        }
      }
    }
  }
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
    super.addContentView(paramView, paramLayoutParams);
  }
  
  public void addMenuProvider(e0.o paramo)
  {
    e0.m localm = mMenuHostHelper;
    b.add(paramo);
    a.run();
  }
  
  public void addMenuProvider(e0.o paramo, b1.o paramo1)
  {
    e0.m localm = mMenuHostHelper;
    b.add(paramo);
    a.run();
    paramo1 = paramo1.getLifecycle();
    Object localObject = (m.a)c.remove(paramo);
    if (localObject != null)
    {
      a.c(b);
      b = null;
    }
    localObject = new e0.k(localm, paramo);
    c.put(paramo, new m.a(paramo1, (b1.m)localObject));
  }
  
  public void addMenuProvider(e0.o paramo, b1.o paramo1, k.b paramb)
  {
    e0.m localm = mMenuHostHelper;
    localm.getClass();
    paramo1 = paramo1.getLifecycle();
    m.a locala = (m.a)c.remove(paramo);
    if (locala != null)
    {
      a.c(b);
      b = null;
    }
    paramb = new e0.l(localm, paramb, paramo);
    c.put(paramo, new m.a(paramo1, paramb));
  }
  
  public final void addOnConfigurationChangedListener(d0.a<Configuration> parama)
  {
    mOnConfigurationChangedListeners.add(parama);
  }
  
  public final void addOnContextAvailableListener(c.b paramb)
  {
    c.a locala = mContextAwareHelper;
    locala.getClass();
    ec.i.e(paramb, "listener");
    Context localContext = b;
    if (localContext != null) {
      paramb.a(localContext);
    }
    a.add(paramb);
  }
  
  public final void addOnMultiWindowModeChangedListener(d0.a<u.l> parama)
  {
    mOnMultiWindowModeChangedListeners.add(parama);
  }
  
  public final void addOnNewIntentListener(d0.a<Intent> parama)
  {
    mOnNewIntentListeners.add(parama);
  }
  
  public final void addOnPictureInPictureModeChangedListener(d0.a<u.y> parama)
  {
    mOnPictureInPictureModeChangedListeners.add(parama);
  }
  
  public final void addOnTrimMemoryListener(d0.a<Integer> parama)
  {
    mOnTrimMemoryListeners.add(parama);
  }
  
  public void ensureViewModelStore()
  {
    if (mViewModelStore == null)
    {
      h localh = (h)getLastNonConfigurationInstance();
      if (localh != null) {
        mViewModelStore = b;
      }
      if (mViewModelStore == null) {
        mViewModelStore = new s0();
      }
    }
  }
  
  public final d.g getActivityResultRegistry()
  {
    return mActivityResultRegistry;
  }
  
  public c1.a getDefaultViewModelCreationExtras()
  {
    c1.b localb = new c1.b();
    Object localObject2;
    if (getApplication() != null)
    {
      localObject1 = p0.a;
      localObject2 = getApplication();
      a.put(localObject1, localObject2);
    }
    Object localObject1 = h0.a;
    a.put(localObject1, this);
    localObject1 = h0.b;
    a.put(localObject1, this);
    if ((getIntent() != null) && (getIntent().getExtras() != null))
    {
      localObject1 = h0.c;
      localObject2 = getIntent().getExtras();
      a.put(localObject1, localObject2);
    }
    return localb;
  }
  
  public q0.b getDefaultViewModelProviderFactory()
  {
    if (mDefaultFactory == null)
    {
      Application localApplication = getApplication();
      Bundle localBundle;
      if (getIntent() != null) {
        localBundle = getIntent().getExtras();
      } else {
        localBundle = null;
      }
      mDefaultFactory = new k0(localApplication, this, localBundle);
    }
    return mDefaultFactory;
  }
  
  public n getFullyDrawnReporter()
  {
    return mFullyDrawnReporter;
  }
  
  @Deprecated
  public Object getLastCustomNonConfigurationInstance()
  {
    Object localObject = (h)getLastNonConfigurationInstance();
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return localObject;
  }
  
  public b1.k getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  public final w getOnBackPressedDispatcher()
  {
    if (mOnBackPressedDispatcher == null)
    {
      mOnBackPressedDispatcher = new w(new e());
      getLifecycle().a(new f());
    }
    return mOnBackPressedDispatcher;
  }
  
  public final s1.c getSavedStateRegistry()
  {
    return mSavedStateRegistryController.b;
  }
  
  public s0 getViewModelStore()
  {
    if (getApplication() != null)
    {
      ensureViewModelStore();
      return mViewModelStore;
    }
    throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
  }
  
  public void initializeViewTreeOwners()
  {
    a0.G(getWindow().getDecorView(), this);
    View localView = getWindow().getDecorView();
    ec.i.e(localView, "<this>");
    localView.setTag(2131362065, this);
    a0.H(getWindow().getDecorView(), this);
    a0.F(getWindow().getDecorView(), this);
    localView = getWindow().getDecorView();
    ec.i.e(localView, "<this>");
    localView.setTag(2131361996, this);
  }
  
  public void invalidateMenu()
  {
    invalidateOptionsMenu();
  }
  
  @Deprecated
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!mActivityResultRegistry.a(paramInt1, paramInt2, paramIntent)) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
  }
  
  @Deprecated
  public void onBackPressed()
  {
    getOnBackPressedDispatcher().b();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Iterator localIterator = mOnConfigurationChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((d0.a)localIterator.next()).accept(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mSavedStateRegistryController.b(paramBundle);
    Object localObject = mContextAwareHelper;
    localObject.getClass();
    b = this;
    localObject = a.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((c.b)((Iterator)localObject).next()).a(this);
    }
    super.onCreate(paramBundle);
    int i = c0.b;
    c0.b.b(this);
    i = mContentLayoutId;
    if (i != 0) {
      setContentView(i);
    }
  }
  
  public boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onCreatePanelMenu(paramInt, paramMenu);
      Object localObject = mMenuHostHelper;
      MenuInflater localMenuInflater = getMenuInflater();
      localObject = b.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((e0.o)((Iterator)localObject).next()).c(paramMenu, localMenuInflater);
      }
    }
    return true;
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool1 = super.onMenuItemSelected(paramInt, paramMenuItem);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    if (paramInt == 0)
    {
      Iterator localIterator = mMenuHostHelper.b.iterator();
      while (localIterator.hasNext()) {
        if (((e0.o)localIterator.next()).a(paramMenuItem)) {
          break label67;
        }
      }
      bool2 = false;
      label67:
      return bool2;
    }
    return false;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    if (mDispatchingOnMultiWindowModeChanged) {
      return;
    }
    Iterator localIterator = mOnMultiWindowModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((d0.a)localIterator.next()).accept(new u.l(paramBoolean));
    }
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    mDispatchingOnMultiWindowModeChanged = true;
    try
    {
      super.onMultiWindowModeChanged(paramBoolean, paramConfiguration);
      mDispatchingOnMultiWindowModeChanged = false;
      Iterator localIterator = mOnMultiWindowModeChangedListeners.iterator();
      while (localIterator.hasNext())
      {
        d0.a locala = (d0.a)localIterator.next();
        ec.i.e(paramConfiguration, "newConfig");
        locala.accept(new u.l(paramBoolean));
      }
      return;
    }
    finally
    {
      mDispatchingOnMultiWindowModeChanged = false;
    }
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    Iterator localIterator = mOnNewIntentListeners.iterator();
    while (localIterator.hasNext()) {
      ((d0.a)localIterator.next()).accept(paramIntent);
    }
  }
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    Iterator localIterator = mMenuHostHelper.b.iterator();
    while (localIterator.hasNext()) {
      ((e0.o)localIterator.next()).b(paramMenu);
    }
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    if (mDispatchingOnPictureInPictureModeChanged) {
      return;
    }
    Iterator localIterator = mOnPictureInPictureModeChangedListeners.iterator();
    while (localIterator.hasNext()) {
      ((d0.a)localIterator.next()).accept(new u.y(paramBoolean));
    }
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean, Configuration paramConfiguration)
  {
    mDispatchingOnPictureInPictureModeChanged = true;
    try
    {
      super.onPictureInPictureModeChanged(paramBoolean, paramConfiguration);
      mDispatchingOnPictureInPictureModeChanged = false;
      Iterator localIterator = mOnPictureInPictureModeChangedListeners.iterator();
      while (localIterator.hasNext())
      {
        d0.a locala = (d0.a)localIterator.next();
        ec.i.e(paramConfiguration, "newConfig");
        locala.accept(new u.y(paramBoolean));
      }
      return;
    }
    finally
    {
      mDispatchingOnPictureInPictureModeChanged = false;
    }
  }
  
  public boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    if (paramInt == 0)
    {
      super.onPreparePanel(paramInt, paramView, paramMenu);
      paramView = mMenuHostHelper.b.iterator();
      while (paramView.hasNext()) {
        ((e0.o)paramView.next()).d(paramMenu);
      }
    }
    return true;
  }
  
  @Deprecated
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    if (!mActivityResultRegistry.a(paramInt, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", paramArrayOfInt))) {
      super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
    }
  }
  
  @Deprecated
  public Object onRetainCustomNonConfigurationInstance()
  {
    return null;
  }
  
  public final Object onRetainNonConfigurationInstance()
  {
    Object localObject1 = onRetainCustomNonConfigurationInstance();
    Object localObject2 = mViewModelStore;
    Object localObject3 = localObject2;
    if (localObject2 == null)
    {
      h localh = (h)getLastNonConfigurationInstance();
      localObject3 = localObject2;
      if (localh != null) {
        localObject3 = b;
      }
    }
    if ((localObject3 == null) && (localObject1 == null)) {
      return null;
    }
    localObject2 = new h();
    a = localObject1;
    b = ((s0)localObject3);
    return localObject2;
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    b1.k localk = getLifecycle();
    if ((localk instanceof p)) {
      ((p)localk).h(k.b.c);
    }
    super.onSaveInstanceState(paramBundle);
    mSavedStateRegistryController.c(paramBundle);
  }
  
  public void onTrimMemory(int paramInt)
  {
    super.onTrimMemory(paramInt);
    Iterator localIterator = mOnTrimMemoryListeners.iterator();
    while (localIterator.hasNext()) {
      ((d0.a)localIterator.next()).accept(Integer.valueOf(paramInt));
    }
  }
  
  public Context peekAvailableContext()
  {
    return mContextAwareHelper.b;
  }
  
  public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> parama, d.b<O> paramb)
  {
    return registerForActivityResult(parama, mActivityResultRegistry, paramb);
  }
  
  public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> parama, d.g paramg, d.b<O> paramb)
  {
    StringBuilder localStringBuilder = f.l("activity_rq#");
    localStringBuilder.append(mNextLocalRequestCode.getAndIncrement());
    return paramg.c(localStringBuilder.toString(), this, parama, paramb);
  }
  
  public void removeMenuProvider(e0.o paramo)
  {
    mMenuHostHelper.a(paramo);
  }
  
  public final void removeOnConfigurationChangedListener(d0.a<Configuration> parama)
  {
    mOnConfigurationChangedListeners.remove(parama);
  }
  
  public final void removeOnContextAvailableListener(c.b paramb)
  {
    c.a locala = mContextAwareHelper;
    locala.getClass();
    ec.i.e(paramb, "listener");
    a.remove(paramb);
  }
  
  public final void removeOnMultiWindowModeChangedListener(d0.a<u.l> parama)
  {
    mOnMultiWindowModeChangedListeners.remove(parama);
  }
  
  public final void removeOnNewIntentListener(d0.a<Intent> parama)
  {
    mOnNewIntentListeners.remove(parama);
  }
  
  public final void removeOnPictureInPictureModeChangedListener(d0.a<u.y> parama)
  {
    mOnPictureInPictureModeChangedListeners.remove(parama);
  }
  
  public final void removeOnTrimMemoryListener(d0.a<Integer> parama)
  {
    mOnTrimMemoryListeners.remove(parama);
  }
  
  /* Error */
  public void reportFullyDrawn()
  {
    // Byte code:
    //   0: invokestatic 781	z1/a:b	()Z
    //   3: ifeq +12 -> 15
    //   6: ldc_w 783
    //   9: invokestatic 786	z1/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   12: invokestatic 791	android/os/Trace:beginSection	(Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokespecial 792	android/app/Activity:reportFullyDrawn	()V
    //   19: aload_0
    //   20: getfield 145	b/j:mFullyDrawnReporter	Lb/n;
    //   23: astore_1
    //   24: aload_1
    //   25: getfield 794	b/n:b	Ljava/lang/Object;
    //   28: astore_2
    //   29: aload_2
    //   30: monitorenter
    //   31: aload_1
    //   32: iconst_1
    //   33: putfield 796	b/n:c	Z
    //   36: aload_1
    //   37: getfield 797	b/n:d	Ljava/util/ArrayList;
    //   40: invokevirtual 798	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   43: astore_3
    //   44: aload_3
    //   45: invokeinterface 615 1 0
    //   50: ifeq +21 -> 71
    //   53: aload_3
    //   54: invokeinterface 618 1 0
    //   59: checkcast 800	dc/a
    //   62: invokeinterface 803 1 0
    //   67: pop
    //   68: goto -24 -> 44
    //   71: aload_1
    //   72: getfield 797	b/n:d	Ljava/util/ArrayList;
    //   75: invokevirtual 806	java/util/ArrayList:clear	()V
    //   78: getstatic 811	rb/h:a	Lrb/h;
    //   81: astore_1
    //   82: aload_2
    //   83: monitorexit
    //   84: invokestatic 814	android/os/Trace:endSection	()V
    //   87: return
    //   88: astore_2
    //   89: goto +8 -> 97
    //   92: astore_1
    //   93: aload_2
    //   94: monitorexit
    //   95: aload_1
    //   96: athrow
    //   97: invokestatic 814	android/os/Trace:endSection	()V
    //   100: aload_2
    //   101: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	this	j
    //   23	59	1	localObject1	Object
    //   92	4	1	localObject2	Object
    //   88	13	2	localObject4	Object
    //   43	11	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   0	15	88	finally
    //   15	31	88	finally
    //   82	84	88	finally
    //   93	97	88	finally
    //   31	44	92	finally
    //   44	68	92	finally
    //   71	82	92	finally
  }
  
  public void setContentView(int paramInt)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
    super.setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
    super.setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    mReportFullyDrawnExecutor.c0(getWindow().getDecorView());
    super.setContentView(paramView, paramLayoutParams);
  }
  
  @Deprecated
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    super.startActivityForResult(paramIntent, paramInt);
  }
  
  @Deprecated
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    super.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  @Deprecated
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    super.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public final class a
    extends d.g
  {
    public a() {}
    
    public final void b(int paramInt, e.a parama, Object paramObject)
    {
      j localj = j.this;
      Object localObject = parama.b(localj, paramObject);
      if (localObject != null)
      {
        new Handler(Looper.getMainLooper()).post(new h(this, paramInt, (a.a)localObject));
        return;
      }
      paramObject = parama.a(localj, paramObject);
      parama = null;
      if ((((Intent)paramObject).getExtras() != null) && (((Intent)paramObject).getExtras().getClassLoader() == null)) {
        ((Intent)paramObject).setExtrasClassLoader(localj.getClassLoader());
      }
      if (((Intent)paramObject).hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"))
      {
        parama = ((Intent)paramObject).getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        ((Intent)paramObject).removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      }
      if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(((Intent)paramObject).getAction()))
      {
        paramObject = ((Intent)paramObject).getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        parama = (e.a)paramObject;
        if (paramObject == null) {
          parama = new String[0];
        }
        u.b.a(localj, parama, paramInt);
      }
      else
      {
        int i;
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(((Intent)paramObject).getAction()))
        {
          d.i locali = (d.i)((Intent)paramObject).getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
          try
          {
            localObject = a;
            paramObject = b;
            i = c;
            int j = d;
            int k = u.b.a;
            localj.startIntentSenderForResult((IntentSender)localObject, paramInt, (Intent)paramObject, i, j, 0, parama);
          }
          catch (IntentSender.SendIntentException parama)
          {
            new Handler(Looper.getMainLooper()).post(new i(this, paramInt, parama));
          }
        }
        else
        {
          i = u.b.a;
          localj.startActivityForResult((Intent)paramObject, paramInt, parama);
        }
      }
    }
  }
  
  public final class b
    implements b1.m
  {
    public b() {}
    
    public final void a(b1.o paramo, k.a parama)
    {
      if (parama == k.a.ON_STOP)
      {
        paramo = getWindow();
        if (paramo != null) {
          paramo = paramo.peekDecorView();
        } else {
          paramo = null;
        }
        if (paramo != null) {
          paramo.cancelPendingInputEvents();
        }
      }
    }
  }
  
  public final class c
    implements b1.m
  {
    public c() {}
    
    public final void a(b1.o paramo, k.a parama)
    {
      if (parama == k.a.ON_DESTROY)
      {
        mContextAwareHelper.b = null;
        if (!isChangingConfigurations()) {
          getViewModelStore().a();
        }
        paramo = (j.j)mReportFullyDrawnExecutor;
        d.getWindow().getDecorView().removeCallbacks(paramo);
        d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(paramo);
      }
    }
  }
  
  public final class d
    implements b1.m
  {
    public d() {}
    
    public final void a(b1.o paramo, k.a parama)
    {
      ensureViewModelStore();
      getLifecycle().c(this);
    }
  }
  
  public final class e
    implements Runnable
  {
    public e() {}
    
    public final void run()
    {
      try
      {
        j.access$001(j.this);
      }
      catch (NullPointerException localNullPointerException)
      {
        if (!TextUtils.equals(localNullPointerException.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
          throw localNullPointerException;
        }
      }
      catch (IllegalStateException localIllegalStateException)
      {
        if (!TextUtils.equals(localIllegalStateException.getMessage(), "Can not perform this action after onSaveInstanceState")) {
          break label42;
        }
      }
      return;
      label42:
      throw localIllegalStateException;
    }
  }
  
  public final class f
    implements b1.m
  {
    public f() {}
    
    public final void a(b1.o paramo, k.a parama)
    {
      if ((parama == k.a.ON_CREATE) && (Build.VERSION.SDK_INT >= 33))
      {
        parama = j.access$100(j.this);
        paramo = j.g.a((j)paramo);
        parama.getClass();
        ec.i.e(paramo, "invoker");
        f = paramo;
        parama.c(h);
      }
    }
  }
  
  public static final class g
  {
    public static OnBackInvokedDispatcher a(Activity paramActivity)
    {
      return paramActivity.getOnBackInvokedDispatcher();
    }
  }
  
  public static final class h
  {
    public Object a;
    public s0 b;
  }
  
  public static abstract interface i
    extends Executor
  {
    public abstract void c0(View paramView);
  }
  
  public final class j
    implements j.i, ViewTreeObserver.OnDrawListener, Runnable
  {
    public final long a = SystemClock.uptimeMillis() + 10000L;
    public Runnable b;
    public boolean c = false;
    
    public j() {}
    
    public final void c0(View paramView)
    {
      if (!c)
      {
        c = true;
        paramView.getViewTreeObserver().addOnDrawListener(this);
      }
    }
    
    public final void execute(Runnable paramRunnable)
    {
      b = paramRunnable;
      paramRunnable = getWindow().getDecorView();
      if (c)
      {
        if (Looper.myLooper() == Looper.getMainLooper()) {
          paramRunnable.invalidate();
        } else {
          paramRunnable.postInvalidate();
        }
      }
      else {
        paramRunnable.postOnAnimation(new d(this, 1));
      }
    }
    
    public final void onDraw()
    {
      ??? = b;
      n localn;
      if (??? != null)
      {
        ((Runnable)???).run();
        b = null;
        localn = mFullyDrawnReporter;
      }
      synchronized (b)
      {
        boolean bool = c;
        if (!bool) {
          return;
        }
      }
      c = false;
      getWindow().getDecorView().post(this);
    }
    
    public final void run()
    {
      getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
  }
}

/* Location:
 * Qualified Name:     b.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */