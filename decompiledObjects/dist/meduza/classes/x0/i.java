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
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import b1.h0;
import b1.k.a;
import b1.k.b;
import b1.k0;
import b1.o;
import b1.p0;
import b1.q0.b;
import b1.s0;
import b1.t0;
import b1.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class i
  implements ComponentCallbacks, View.OnCreateContextMenuListener, o, t0, b1.h, s1.e
{
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
  public y mChildFragmentManager = new z();
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
  private Boolean mIsPrimaryNavigationFragment = null;
  public LayoutInflater mLayoutInflater;
  public b1.p mLifecycleRegistry;
  public k.b mMaxState = k.b.e;
  public boolean mMenuVisible = true;
  private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
  private final ArrayList<m> mOnPreAttachedListeners = new ArrayList();
  public i mParentFragment;
  public boolean mPerformedCreateView;
  public Runnable mPostponedDurationRunnable = new b();
  public Handler mPostponedHandler;
  public String mPreviousWho;
  public boolean mRemoving;
  public boolean mRestored;
  public boolean mRetainInstance;
  public boolean mRetainInstanceChangedWhileDetached;
  public Bundle mSavedFragmentState;
  private final m mSavedStateAttachListener = new c();
  public s1.d mSavedStateRegistryController;
  public Boolean mSavedUserVisibleHint;
  public Bundle mSavedViewRegistryState;
  public SparseArray<Parcelable> mSavedViewState;
  public int mState = -1;
  public String mTag;
  public i mTarget;
  public int mTargetRequestCode;
  public String mTargetWho = null;
  public boolean mTransitioning;
  public boolean mUserVisibleHint = true;
  public View mView;
  public o0 mViewLifecycleOwner;
  public w<o> mViewLifecycleOwnerLiveData = new w();
  public String mWho = UUID.randomUUID().toString();
  
  public i()
  {
    initLifecycle();
  }
  
  public i(int paramInt)
  {
    this();
    mContentLayoutId = paramInt;
  }
  
  private k ensureAnimationInfo()
  {
    if (mAnimationInfo == null) {
      mAnimationInfo = new k();
    }
    return mAnimationInfo;
  }
  
  private int getMinimumMaxLifecycleState()
  {
    k.b localb = mMaxState;
    if ((localb != k.b.b) && (mParentFragment != null)) {
      return Math.min(localb.ordinal(), mParentFragment.getMinimumMaxLifecycleState());
    }
    return localb.ordinal();
  }
  
  private i getTargetFragment(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      localObject1 = y0.b.a;
      localObject2 = new y0.f(this);
      y0.b.c((y0.k)localObject2);
      localObject1 = y0.b.a(this);
      if ((a.contains(y0.b.a.p)) && (y0.b.f((y0.b.c)localObject1, getClass(), y0.f.class))) {
        y0.b.b((y0.b.c)localObject1, (y0.k)localObject2);
      }
    }
    Object localObject1 = mTarget;
    if (localObject1 != null) {
      return (i)localObject1;
    }
    Object localObject2 = mFragmentManager;
    if (localObject2 != null)
    {
      localObject1 = mTargetWho;
      if (localObject1 != null) {
        return ((y)localObject2).C((String)localObject1);
      }
    }
    return null;
  }
  
  private void initLifecycle()
  {
    mLifecycleRegistry = new b1.p(this);
    mSavedStateRegistryController = new s1.d(this);
    mDefaultFactory = null;
    if (!mOnPreAttachedListeners.contains(mSavedStateAttachListener)) {
      registerOnPreAttachListener(mSavedStateAttachListener);
    }
  }
  
  @Deprecated
  public static i instantiate(Context paramContext, String paramString)
  {
    return instantiate(paramContext, paramString, null);
  }
  
  @Deprecated
  public static i instantiate(Context paramContext, String paramString, Bundle paramBundle)
  {
    try
    {
      paramContext = (i)s.b(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.setArguments(paramBundle);
      }
      return paramContext;
    }
    catch (InvocationTargetException paramContext)
    {
      throw new l(g.e("Unable to instantiate fragment ", paramString, ": calling Fragment constructor caused an exception"), paramContext);
    }
    catch (NoSuchMethodException paramContext)
    {
      throw new l(g.e("Unable to instantiate fragment ", paramString, ": could not find Fragment constructor"), paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new l(g.e("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new l(g.e("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramContext);
    }
  }
  
  private void lambda$performCreateView$0()
  {
    o0 localo0 = mViewLifecycleOwner;
    Bundle localBundle = mSavedViewRegistryState;
    e.b(localBundle);
    mSavedViewRegistryState = null;
  }
  
  private <I, O> d.c<I> prepareCallInternal(final e.a<I, O> parama, final o.a<Void, d.g> parama1, final d.b<O> paramb)
  {
    if (mState <= 1)
    {
      final AtomicReference localAtomicReference = new AtomicReference();
      registerOnPreAttachListener(new j(parama1, localAtomicReference, parama, paramb));
      return new a(localAtomicReference);
    }
    throw new IllegalStateException(f.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
  }
  
  private void registerOnPreAttachListener(m paramm)
  {
    if (mState >= 0) {
      paramm.a();
    } else {
      mOnPreAttachedListeners.add(paramm);
    }
  }
  
  private void restoreViewState()
  {
    Object localObject;
    if (y.L(3))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("moveto RESTORE_VIEW_STATE: ");
      ((StringBuilder)localObject).append(this);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    if (mView != null)
    {
      localObject = mSavedFragmentState;
      if (localObject != null) {
        localObject = ((Bundle)localObject).getBundle("savedInstanceState");
      } else {
        localObject = null;
      }
      restoreViewState((Bundle)localObject);
    }
    mSavedFragmentState = null;
  }
  
  public void callStartTransitionListener(boolean paramBoolean)
  {
    Object localObject = mAnimationInfo;
    if (localObject != null) {
      u = false;
    }
    if (mView != null)
    {
      ViewGroup localViewGroup = mContainer;
      if (localViewGroup != null)
      {
        localObject = mFragmentManager;
        if (localObject != null)
        {
          localObject = r0.m(localViewGroup, (y)localObject);
          ((r0)localObject).n();
          if (paramBoolean) {
            mHost.c.post(new e((r0)localObject));
          } else {
            ((r0)localObject).i();
          }
          localObject = mPostponedHandler;
          if (localObject != null)
          {
            ((Handler)localObject).removeCallbacks(mPostponedDurationRunnable);
            mPostponedHandler = null;
          }
        }
      }
    }
  }
  
  public p createFragmentContainer()
  {
    return new f();
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mFragmentId=#");
    paramPrintWriter.print(Integer.toHexString(mFragmentId));
    paramPrintWriter.print(" mContainerId=#");
    paramPrintWriter.print(Integer.toHexString(mContainerId));
    paramPrintWriter.print(" mTag=");
    paramPrintWriter.println(mTag);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mState=");
    paramPrintWriter.print(mState);
    paramPrintWriter.print(" mWho=");
    paramPrintWriter.print(mWho);
    paramPrintWriter.print(" mBackStackNesting=");
    paramPrintWriter.println(mBackStackNesting);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mAdded=");
    paramPrintWriter.print(mAdded);
    paramPrintWriter.print(" mRemoving=");
    paramPrintWriter.print(mRemoving);
    paramPrintWriter.print(" mFromLayout=");
    paramPrintWriter.print(mFromLayout);
    paramPrintWriter.print(" mInLayout=");
    paramPrintWriter.println(mInLayout);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mHidden=");
    paramPrintWriter.print(mHidden);
    paramPrintWriter.print(" mDetached=");
    paramPrintWriter.print(mDetached);
    paramPrintWriter.print(" mMenuVisible=");
    paramPrintWriter.print(mMenuVisible);
    paramPrintWriter.print(" mHasMenu=");
    paramPrintWriter.println(mHasMenu);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mRetainInstance=");
    paramPrintWriter.print(mRetainInstance);
    paramPrintWriter.print(" mUserVisibleHint=");
    paramPrintWriter.println(mUserVisibleHint);
    if (mFragmentManager != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mFragmentManager=");
      paramPrintWriter.println(mFragmentManager);
    }
    if (mHost != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mHost=");
      paramPrintWriter.println(mHost);
    }
    if (mParentFragment != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mParentFragment=");
      paramPrintWriter.println(mParentFragment);
    }
    if (mArguments != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mArguments=");
      paramPrintWriter.println(mArguments);
    }
    if (mSavedFragmentState != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedFragmentState=");
      paramPrintWriter.println(mSavedFragmentState);
    }
    if (mSavedViewState != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewState=");
      paramPrintWriter.println(mSavedViewState);
    }
    if (mSavedViewRegistryState != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mSavedViewRegistryState=");
      paramPrintWriter.println(mSavedViewRegistryState);
    }
    Object localObject = getTargetFragment(false);
    if (localObject != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mTarget=");
      paramPrintWriter.print(localObject);
      paramPrintWriter.print(" mTargetRequestCode=");
      paramPrintWriter.println(mTargetRequestCode);
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mPopDirection=");
    paramPrintWriter.println(getPopDirection());
    if (getEnterAnim() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getEnterAnim=");
      paramPrintWriter.println(getEnterAnim());
    }
    if (getExitAnim() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getExitAnim=");
      paramPrintWriter.println(getExitAnim());
    }
    if (getPopEnterAnim() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopEnterAnim=");
      paramPrintWriter.println(getPopEnterAnim());
    }
    if (getPopExitAnim() != 0)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("getPopExitAnim=");
      paramPrintWriter.println(getPopExitAnim());
    }
    if (mContainer != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mContainer=");
      paramPrintWriter.println(mContainer);
    }
    if (mView != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mView=");
      paramPrintWriter.println(mView);
    }
    if (getAnimatingAway() != null)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mAnimatingAway=");
      paramPrintWriter.println(getAnimatingAway());
    }
    if (getContext() != null) {
      d1.a.a(this).b(paramString, paramPrintWriter);
    }
    paramPrintWriter.print(paramString);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Child ");
    ((StringBuilder)localObject).append(mChildFragmentManager);
    ((StringBuilder)localObject).append(":");
    paramPrintWriter.println(((StringBuilder)localObject).toString());
    mChildFragmentManager.w(g.d(paramString, "  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final boolean equals(Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  public i findFragmentByWho(String paramString)
  {
    if (paramString.equals(mWho)) {
      return this;
    }
    return mChildFragmentManager.c.d(paramString);
  }
  
  public String generateActivityResultKey()
  {
    StringBuilder localStringBuilder = f.l("fragment_");
    localStringBuilder.append(mWho);
    localStringBuilder.append("_rq#");
    localStringBuilder.append(mNextLocalRequestCode.getAndIncrement());
    return localStringBuilder.toString();
  }
  
  public final m getActivity()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (m)a;
    }
    return (m)localObject;
  }
  
  public boolean getAllowEnterTransitionOverlap()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = p;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public boolean getAllowReturnTransitionOverlap()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = o;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public View getAnimatingAway()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    localk.getClass();
    return null;
  }
  
  public final Bundle getArguments()
  {
    return mArguments;
  }
  
  public final y getChildFragmentManager()
  {
    if (mHost != null) {
      return mChildFragmentManager;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " has not been attached yet."));
  }
  
  public Context getContext()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = b;
    }
    return (Context)localObject;
  }
  
  public c1.a getDefaultViewModelCreationExtras()
  {
    for (Object localObject1 = requireContext().getApplicationContext(); (localObject1 instanceof ContextWrapper); localObject1 = ((ContextWrapper)localObject1).getBaseContext()) {
      if ((localObject1 instanceof Application))
      {
        localObject1 = (Application)localObject1;
        break label43;
      }
    }
    localObject1 = null;
    label43:
    if ((localObject1 == null) && (y.L(3)))
    {
      localObject2 = f.l("Could not find Application instance from Context ");
      ((StringBuilder)localObject2).append(requireContext().getApplicationContext());
      ((StringBuilder)localObject2).append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
      Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
    }
    Object localObject2 = new c1.b();
    Object localObject3;
    if (localObject1 != null)
    {
      localObject3 = p0.a;
      a.put(localObject3, localObject1);
    }
    localObject1 = h0.a;
    a.put(localObject1, this);
    localObject1 = h0.b;
    a.put(localObject1, this);
    if (getArguments() != null)
    {
      localObject3 = h0.c;
      localObject1 = getArguments();
      a.put(localObject3, localObject1);
    }
    return (c1.a)localObject2;
  }
  
  public q0.b getDefaultViewModelProviderFactory()
  {
    if (mFragmentManager != null)
    {
      if (mDefaultFactory == null)
      {
        Object localObject1 = null;
        Object localObject3;
        for (Object localObject2 = requireContext().getApplicationContext();; localObject2 = ((ContextWrapper)localObject2).getBaseContext())
        {
          localObject3 = localObject1;
          if (!(localObject2 instanceof ContextWrapper)) {
            break;
          }
          if ((localObject2 instanceof Application))
          {
            localObject3 = (Application)localObject2;
            break;
          }
        }
        if ((localObject3 == null) && (y.L(3)))
        {
          localObject2 = f.l("Could not find Application instance from Context ");
          ((StringBuilder)localObject2).append(requireContext().getApplicationContext());
          ((StringBuilder)localObject2).append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
          Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        mDefaultFactory = new k0((Application)localObject3, this, getArguments());
      }
      return mDefaultFactory;
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public int getEnterAnim()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 0;
    }
    return b;
  }
  
  public Object getEnterTransition()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return i;
  }
  
  public u.a0 getEnterTransitionCallback()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return q;
  }
  
  public int getExitAnim()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 0;
    }
    return c;
  }
  
  public Object getExitTransition()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return k;
  }
  
  public u.a0 getExitTransitionCallback()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return r;
  }
  
  public View getFocusedView()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return t;
  }
  
  @Deprecated
  public final y getFragmentManager()
  {
    return mFragmentManager;
  }
  
  public final Object getHost()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((t)localObject).e();
    }
    return localObject;
  }
  
  public final int getId()
  {
    return mFragmentId;
  }
  
  public final LayoutInflater getLayoutInflater()
  {
    LayoutInflater localLayoutInflater1 = mLayoutInflater;
    LayoutInflater localLayoutInflater2 = localLayoutInflater1;
    if (localLayoutInflater1 == null) {
      localLayoutInflater2 = performGetLayoutInflater(null);
    }
    return localLayoutInflater2;
  }
  
  @Deprecated
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    paramBundle = mHost;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.f();
      paramBundle.setFactory2(mChildFragmentManager.f);
      return paramBundle;
    }
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  public b1.k getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  @Deprecated
  public d1.a getLoaderManager()
  {
    return d1.a.a(this);
  }
  
  public int getNextTransition()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 0;
    }
    return f;
  }
  
  public final i getParentFragment()
  {
    return mParentFragment;
  }
  
  public final y getParentFragmentManager()
  {
    y localy = mFragmentManager;
    if (localy != null) {
      return localy;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not associated with a fragment manager."));
  }
  
  public boolean getPopDirection()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return false;
    }
    return a;
  }
  
  public int getPopEnterAnim()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 0;
    }
    return d;
  }
  
  public int getPopExitAnim()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 0;
    }
    return e;
  }
  
  public float getPostOnViewCreatedAlpha()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return 1.0F;
    }
    return s;
  }
  
  public Object getReenterTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = l;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getExitTransition();
    }
    return localObject1;
  }
  
  public final Resources getResources()
  {
    return requireContext().getResources();
  }
  
  @Deprecated
  public final boolean getRetainInstance()
  {
    y0.b.c localc = y0.b.a;
    y0.d locald = new y0.d(this);
    y0.b.c(locald);
    localc = y0.b.a(this);
    if ((a.contains(y0.b.a.f)) && (y0.b.f(localc, getClass(), y0.d.class))) {
      y0.b.b(localc, locald);
    }
    return mRetainInstance;
  }
  
  public Object getReturnTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = j;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getEnterTransition();
    }
    return localObject1;
  }
  
  public final s1.c getSavedStateRegistry()
  {
    return mSavedStateRegistryController.b;
  }
  
  public Object getSharedElementEnterTransition()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return null;
    }
    return m;
  }
  
  public Object getSharedElementReturnTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = n;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getSharedElementEnterTransition();
    }
    return localObject1;
  }
  
  public ArrayList<String> getSharedElementSourceNames()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = g;
      if (localObject != null) {
        return (ArrayList<String>)localObject;
      }
    }
    return new ArrayList();
  }
  
  public ArrayList<String> getSharedElementTargetNames()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = h;
      if (localObject != null) {
        return (ArrayList<String>)localObject;
      }
    }
    return new ArrayList();
  }
  
  public final String getString(int paramInt)
  {
    return getResources().getString(paramInt);
  }
  
  public final String getString(int paramInt, Object... paramVarArgs)
  {
    return getResources().getString(paramInt, paramVarArgs);
  }
  
  public final String getTag()
  {
    return mTag;
  }
  
  @Deprecated
  public final i getTargetFragment()
  {
    return getTargetFragment(true);
  }
  
  @Deprecated
  public final int getTargetRequestCode()
  {
    y0.b.c localc = y0.b.a;
    y0.e locale = new y0.e(this);
    y0.b.c(locale);
    localc = y0.b.a(this);
    if ((a.contains(y0.b.a.p)) && (y0.b.f(localc, getClass(), y0.e.class))) {
      y0.b.b(localc, locale);
    }
    return mTargetRequestCode;
  }
  
  public final CharSequence getText(int paramInt)
  {
    return getResources().getText(paramInt);
  }
  
  @Deprecated
  public boolean getUserVisibleHint()
  {
    return mUserVisibleHint;
  }
  
  public View getView()
  {
    return mView;
  }
  
  public o getViewLifecycleOwner()
  {
    o0 localo0 = mViewLifecycleOwner;
    if (localo0 != null) {
      return localo0;
    }
    throw new IllegalStateException(f.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
  }
  
  public b1.t<o> getViewLifecycleOwnerLiveData()
  {
    return mViewLifecycleOwnerLiveData;
  }
  
  public s0 getViewModelStore()
  {
    if (mFragmentManager != null)
    {
      if (getMinimumMaxLifecycleState() != 1)
      {
        b0 localb0 = mFragmentManager.O;
        s0 locals01 = (s0)f.get(mWho);
        s0 locals02 = locals01;
        if (locals01 == null)
        {
          locals02 = new s0();
          f.put(mWho, locals02);
        }
        return locals02;
      }
      throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public final boolean hasOptionsMenu()
  {
    return mHasMenu;
  }
  
  public final int hashCode()
  {
    return super.hashCode();
  }
  
  public void initState()
  {
    initLifecycle();
    mPreviousWho = mWho;
    mWho = UUID.randomUUID().toString();
    mAdded = false;
    mRemoving = false;
    mFromLayout = false;
    mInLayout = false;
    mRestored = false;
    mBackStackNesting = 0;
    mFragmentManager = null;
    mChildFragmentManager = new z();
    mHost = null;
    mFragmentId = 0;
    mContainerId = 0;
    mTag = null;
    mHidden = false;
    mDetached = false;
  }
  
  public final boolean isAdded()
  {
    boolean bool;
    if ((mHost != null) && (mAdded)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isDetached()
  {
    return mDetached;
  }
  
  public final boolean isHidden()
  {
    boolean bool1 = mHidden;
    boolean bool2 = false;
    boolean bool3;
    if (!bool1)
    {
      y localy = mFragmentManager;
      bool3 = bool2;
      if (localy != null)
      {
        i locali = mParentFragment;
        localy.getClass();
        if (locali == null) {
          bool1 = false;
        } else {
          bool1 = locali.isHidden();
        }
        bool3 = bool2;
        if (!bool1) {}
      }
    }
    else
    {
      bool3 = true;
    }
    return bool3;
  }
  
  public final boolean isInBackStack()
  {
    boolean bool;
    if (mBackStackNesting > 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isInLayout()
  {
    return mInLayout;
  }
  
  public final boolean isMenuVisible()
  {
    boolean bool1 = mMenuVisible;
    boolean bool2 = true;
    if (bool1)
    {
      bool1 = bool2;
      if (mFragmentManager == null) {
        return bool1;
      }
      i locali = mParentFragment;
      if (locali == null) {
        bool1 = true;
      } else {
        bool1 = locali.isMenuVisible();
      }
      if (bool1) {
        return bool2;
      }
    }
    bool1 = false;
    return bool1;
  }
  
  public boolean isPostponed()
  {
    k localk = mAnimationInfo;
    if (localk == null) {
      return false;
    }
    return u;
  }
  
  public final boolean isRemoving()
  {
    return mRemoving;
  }
  
  public final boolean isResumed()
  {
    boolean bool;
    if (mState >= 7) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean isStateSaved()
  {
    y localy = mFragmentManager;
    boolean bool = false;
    if (localy == null) {
      return false;
    }
    if ((H) || (I)) {
      bool = true;
    }
    return bool;
  }
  
  public final boolean isVisible()
  {
    if ((isAdded()) && (!isHidden()))
    {
      View localView = mView;
      if ((localView != null) && (localView.getWindowToken() != null) && (mView.getVisibility() == 0)) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public void noteStateNotSaved()
  {
    mChildFragmentManager.Q();
  }
  
  @Deprecated
  public void onActivityCreated(Bundle paramBundle)
  {
    mCalled = true;
  }
  
  @Deprecated
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (y.L(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Fragment ");
      localStringBuilder.append(this);
      localStringBuilder.append(" received the following in onActivityResult(): requestCode: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" resultCode: ");
      localStringBuilder.append(paramInt2);
      localStringBuilder.append(" data: ");
      localStringBuilder.append(paramIntent);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
  }
  
  @Deprecated
  public void onAttach(Activity paramActivity)
  {
    mCalled = true;
  }
  
  public void onAttach(Context paramContext)
  {
    mCalled = true;
    paramContext = mHost;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = a;
    }
    if (paramContext != null)
    {
      mCalled = false;
      onAttach(paramContext);
    }
  }
  
  @Deprecated
  public void onAttachFragment(i parami) {}
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    mCalled = true;
  }
  
  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    mCalled = true;
    restoreChildFragmentState();
    paramBundle = mChildFragmentManager;
    int i;
    if (v >= 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0)
    {
      H = false;
      I = false;
      O.i = false;
      paramBundle.v(1);
    }
  }
  
  public Animation onCreateAnimation(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public Animator onCreateAnimator(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    requireActivity().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  @Deprecated
  public void onCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater) {}
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = mContentLayoutId;
    if (i != 0) {
      return paramLayoutInflater.inflate(i, paramViewGroup, false);
    }
    return null;
  }
  
  public void onDestroy()
  {
    mCalled = true;
  }
  
  @Deprecated
  public void onDestroyOptionsMenu() {}
  
  public void onDestroyView()
  {
    mCalled = true;
  }
  
  public void onDetach()
  {
    mCalled = true;
  }
  
  public LayoutInflater onGetLayoutInflater(Bundle paramBundle)
  {
    return getLayoutInflater(paramBundle);
  }
  
  public void onHiddenChanged(boolean paramBoolean) {}
  
  @Deprecated
  public void onInflate(Activity paramActivity, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    mCalled = true;
  }
  
  public void onInflate(Context paramContext, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    mCalled = true;
    paramContext = mHost;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = a;
    }
    if (paramContext != null)
    {
      mCalled = false;
      onInflate(paramContext, paramAttributeSet, paramBundle);
    }
  }
  
  public void onLowMemory()
  {
    mCalled = true;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {}
  
  @Deprecated
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    return false;
  }
  
  @Deprecated
  public void onOptionsMenuClosed(Menu paramMenu) {}
  
  public void onPause()
  {
    mCalled = true;
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {}
  
  @Deprecated
  public void onPrepareOptionsMenu(Menu paramMenu) {}
  
  public void onPrimaryNavigationFragmentChanged(boolean paramBoolean) {}
  
  @Deprecated
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt) {}
  
  public void onResume()
  {
    mCalled = true;
  }
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart()
  {
    mCalled = true;
  }
  
  public void onStop()
  {
    mCalled = true;
  }
  
  public void onViewCreated(View paramView, Bundle paramBundle) {}
  
  public void onViewStateRestored(Bundle paramBundle)
  {
    mCalled = true;
  }
  
  public void performActivityCreated(Bundle paramBundle)
  {
    mChildFragmentManager.Q();
    mState = 3;
    mCalled = false;
    onActivityCreated(paramBundle);
    if (mCalled)
    {
      restoreViewState();
      paramBundle = mChildFragmentManager;
      H = false;
      I = false;
      O.i = false;
      paramBundle.v(4);
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onActivityCreated()"));
  }
  
  public void performAttach()
  {
    Object localObject = mOnPreAttachedListeners.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((m)((Iterator)localObject).next()).a();
    }
    mOnPreAttachedListeners.clear();
    mChildFragmentManager.c(mHost, createFragmentContainer(), this);
    mState = 0;
    mCalled = false;
    onAttach(mHost.b);
    if (mCalled)
    {
      localObject = mFragmentManager.p.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((c0)((Iterator)localObject).next()).a(this);
      }
      localObject = mChildFragmentManager;
      H = false;
      I = false;
      O.i = false;
      ((y)localObject).v(0);
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onAttach()"));
  }
  
  public void performConfigurationChanged(Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
  }
  
  public boolean performContextItemSelected(MenuItem paramMenuItem)
  {
    if (!mHidden)
    {
      if (onContextItemSelected(paramMenuItem)) {
        return true;
      }
      return mChildFragmentManager.k(paramMenuItem);
    }
    return false;
  }
  
  public void performCreate(Bundle paramBundle)
  {
    mChildFragmentManager.Q();
    mState = 1;
    mCalled = false;
    mLifecycleRegistry.a(new g());
    onCreate(paramBundle);
    mIsCreated = true;
    if (mCalled)
    {
      mLifecycleRegistry.f(k.a.ON_CREATE);
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onCreate()"));
  }
  
  public boolean performCreateOptionsMenu(Menu paramMenu, MenuInflater paramMenuInflater)
  {
    boolean bool1 = mHidden;
    boolean bool2 = false;
    int i = 0;
    if (!bool1)
    {
      int j = i;
      if (mHasMenu)
      {
        j = i;
        if (mMenuVisible)
        {
          j = 1;
          onCreateOptionsMenu(paramMenu, paramMenuInflater);
        }
      }
      bool2 = j | mChildFragmentManager.l(paramMenu, paramMenuInflater);
    }
    return bool2;
  }
  
  public void performCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    mChildFragmentManager.Q();
    int i = 1;
    mPerformedCreateView = true;
    mViewLifecycleOwner = new o0(this, getViewModelStore(), new u.a(this, 2));
    paramLayoutInflater = onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    mView = paramLayoutInflater;
    if (paramLayoutInflater != null)
    {
      mViewLifecycleOwner.b();
      if (y.L(3))
      {
        paramLayoutInflater = f.l("Setting ViewLifecycleOwner on View ");
        paramLayoutInflater.append(mView);
        paramLayoutInflater.append(" for Fragment ");
        paramLayoutInflater.append(this);
        Log.d("FragmentManager", paramLayoutInflater.toString());
      }
      b.a0.G(mView, mViewLifecycleOwner);
      paramLayoutInflater = mView;
      paramViewGroup = mViewLifecycleOwner;
      ec.i.e(paramLayoutInflater, "<this>");
      paramLayoutInflater.setTag(2131362065, paramViewGroup);
      b.a0.H(mView, mViewLifecycleOwner);
      mViewLifecycleOwnerLiveData.setValue(mViewLifecycleOwner);
    }
    else
    {
      if (mViewLifecycleOwner.d == null) {
        i = 0;
      }
      if (i != 0) {
        break label200;
      }
      mViewLifecycleOwner = null;
    }
    return;
    label200:
    throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public void performDestroy()
  {
    mChildFragmentManager.m();
    mLifecycleRegistry.f(k.a.ON_DESTROY);
    mState = 0;
    mCalled = false;
    mIsCreated = false;
    onDestroy();
    if (mCalled) {
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onDestroy()"));
  }
  
  public void performDestroyView()
  {
    mChildFragmentManager.v(1);
    Object localObject;
    int i;
    if (mView != null)
    {
      localObject = mViewLifecycleOwner;
      ((o0)localObject).b();
      if (d.c.compareTo(k.b.c) >= 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        mViewLifecycleOwner.a(k.a.ON_DESTROY);
      }
    }
    mState = 1;
    mCalled = false;
    onDestroyView();
    if (mCalled)
    {
      localObject = ab;
      int j = d.c;
      for (i = 0; i < j; i++) {
        ((d1.b.a)d.b[i]).a();
      }
      mPerformedCreateView = false;
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onDestroyView()"));
  }
  
  public void performDetach()
  {
    mState = -1;
    mCalled = false;
    onDetach();
    mLayoutInflater = null;
    if (mCalled)
    {
      y localy = mChildFragmentManager;
      if (!J)
      {
        localy.m();
        mChildFragmentManager = new z();
      }
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onDetach()"));
  }
  
  public LayoutInflater performGetLayoutInflater(Bundle paramBundle)
  {
    paramBundle = onGetLayoutInflater(paramBundle);
    mLayoutInflater = paramBundle;
    return paramBundle;
  }
  
  public void performLowMemory()
  {
    onLowMemory();
  }
  
  public void performMultiWindowModeChanged(boolean paramBoolean)
  {
    onMultiWindowModeChanged(paramBoolean);
  }
  
  public boolean performOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (!mHidden)
    {
      if ((mHasMenu) && (mMenuVisible) && (onOptionsItemSelected(paramMenuItem))) {
        return true;
      }
      return mChildFragmentManager.q(paramMenuItem);
    }
    return false;
  }
  
  public void performOptionsMenuClosed(Menu paramMenu)
  {
    if (!mHidden)
    {
      if ((mHasMenu) && (mMenuVisible)) {
        onOptionsMenuClosed(paramMenu);
      }
      mChildFragmentManager.r(paramMenu);
    }
  }
  
  public void performPause()
  {
    mChildFragmentManager.v(5);
    if (mView != null) {
      mViewLifecycleOwner.a(k.a.ON_PAUSE);
    }
    mLifecycleRegistry.f(k.a.ON_PAUSE);
    mState = 6;
    mCalled = false;
    onPause();
    if (mCalled) {
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onPause()"));
  }
  
  public void performPictureInPictureModeChanged(boolean paramBoolean)
  {
    onPictureInPictureModeChanged(paramBoolean);
  }
  
  public boolean performPrepareOptionsMenu(Menu paramMenu)
  {
    boolean bool1 = mHidden;
    boolean bool2 = false;
    int i = 0;
    if (!bool1)
    {
      int j = i;
      if (mHasMenu)
      {
        j = i;
        if (mMenuVisible)
        {
          j = 1;
          onPrepareOptionsMenu(paramMenu);
        }
      }
      bool2 = j | mChildFragmentManager.u(paramMenu);
    }
    return bool2;
  }
  
  public void performPrimaryNavigationFragmentChanged()
  {
    mFragmentManager.getClass();
    boolean bool = y.O(this);
    Object localObject = mIsPrimaryNavigationFragment;
    if ((localObject == null) || (((Boolean)localObject).booleanValue() != bool))
    {
      mIsPrimaryNavigationFragment = Boolean.valueOf(bool);
      onPrimaryNavigationFragmentChanged(bool);
      localObject = mChildFragmentManager;
      ((y)localObject).f0();
      ((y)localObject).s(z);
    }
  }
  
  public void performResume()
  {
    mChildFragmentManager.Q();
    mChildFragmentManager.A(true);
    mState = 7;
    mCalled = false;
    onResume();
    if (mCalled)
    {
      b1.p localp = mLifecycleRegistry;
      Object localObject = k.a.ON_RESUME;
      localp.f((k.a)localObject);
      if (mView != null) {
        mViewLifecycleOwner.d.f((k.a)localObject);
      }
      localObject = mChildFragmentManager;
      H = false;
      I = false;
      O.i = false;
      ((y)localObject).v(7);
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onResume()"));
  }
  
  public void performSaveInstanceState(Bundle paramBundle)
  {
    onSaveInstanceState(paramBundle);
  }
  
  public void performStart()
  {
    mChildFragmentManager.Q();
    mChildFragmentManager.A(true);
    mState = 5;
    mCalled = false;
    onStart();
    if (mCalled)
    {
      Object localObject = mLifecycleRegistry;
      k.a locala = k.a.ON_START;
      ((b1.p)localObject).f(locala);
      if (mView != null) {
        mViewLifecycleOwner.d.f(locala);
      }
      localObject = mChildFragmentManager;
      H = false;
      I = false;
      O.i = false;
      ((y)localObject).v(5);
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onStart()"));
  }
  
  public void performStop()
  {
    y localy = mChildFragmentManager;
    I = true;
    O.i = true;
    localy.v(4);
    if (mView != null) {
      mViewLifecycleOwner.a(k.a.ON_STOP);
    }
    mLifecycleRegistry.f(k.a.ON_STOP);
    mState = 4;
    mCalled = false;
    onStop();
    if (mCalled) {
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onStop()"));
  }
  
  public void performViewCreated()
  {
    Bundle localBundle = mSavedFragmentState;
    if (localBundle != null) {
      localBundle = localBundle.getBundle("savedInstanceState");
    } else {
      localBundle = null;
    }
    onViewCreated(mView, localBundle);
    mChildFragmentManager.v(2);
  }
  
  public void postponeEnterTransition()
  {
    ensureAnimationInfou = true;
  }
  
  public final void postponeEnterTransition(long paramLong, TimeUnit paramTimeUnit)
  {
    ensureAnimationInfou = true;
    Object localObject = mPostponedHandler;
    if (localObject != null) {
      ((Handler)localObject).removeCallbacks(mPostponedDurationRunnable);
    }
    localObject = mFragmentManager;
    if (localObject != null) {
      localObject = w.c;
    } else {
      localObject = new Handler(Looper.getMainLooper());
    }
    mPostponedHandler = ((Handler)localObject);
    mPostponedHandler.removeCallbacks(mPostponedDurationRunnable);
    mPostponedHandler.postDelayed(mPostponedDurationRunnable, paramTimeUnit.toMillis(paramLong));
  }
  
  public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> parama, d.b<O> paramb)
  {
    return prepareCallInternal(parama, new h(), paramb);
  }
  
  public final <I, O> d.c<I> registerForActivityResult(e.a<I, O> parama, d.g paramg, d.b<O> paramb)
  {
    return prepareCallInternal(parama, new i(paramg), paramb);
  }
  
  public void registerForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(this);
  }
  
  @Deprecated
  public final void requestPermissions(String[] paramArrayOfString, int paramInt)
  {
    if (mHost != null)
    {
      y localy = getParentFragmentManager();
      if (E != null)
      {
        y.k localk = new y.k(mWho, paramInt);
        F.addLast(localk);
        E.a(paramArrayOfString);
      }
      else
      {
        w.getClass();
        ec.i.e(paramArrayOfString, "permissions");
      }
      return;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to Activity"));
  }
  
  public final m requireActivity()
  {
    m localm = getActivity();
    if (localm != null) {
      return localm;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to an activity."));
  }
  
  public final Bundle requireArguments()
  {
    Bundle localBundle = getArguments();
    if (localBundle != null) {
      return localBundle;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " does not have any arguments."));
  }
  
  public final Context requireContext()
  {
    Context localContext = getContext();
    if (localContext != null) {
      return localContext;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to a context."));
  }
  
  @Deprecated
  public final y requireFragmentManager()
  {
    return getParentFragmentManager();
  }
  
  public final Object requireHost()
  {
    Object localObject = getHost();
    if (localObject != null) {
      return localObject;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to a host."));
  }
  
  public final i requireParentFragment()
  {
    Object localObject = getParentFragment();
    if (localObject == null)
    {
      if (getContext() == null) {
        throw new IllegalStateException(f.k("Fragment ", this, " is not attached to any Fragment or host"));
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" is not a child Fragment, it is directly attached to ");
      ((StringBuilder)localObject).append(getContext());
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return (i)localObject;
  }
  
  public final View requireView()
  {
    View localView = getView();
    if (localView != null) {
      return localView;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
  }
  
  public void restoreChildFragmentState()
  {
    Object localObject = mSavedFragmentState;
    if (localObject != null)
    {
      localObject = ((Bundle)localObject).getBundle("childFragmentManager");
      if (localObject != null)
      {
        mChildFragmentManager.V((Bundle)localObject);
        localObject = mChildFragmentManager;
        H = false;
        I = false;
        O.i = false;
        ((y)localObject).v(1);
      }
    }
  }
  
  public final void restoreViewState(Bundle paramBundle)
  {
    SparseArray localSparseArray = mSavedViewState;
    if (localSparseArray != null)
    {
      mView.restoreHierarchyState(localSparseArray);
      mSavedViewState = null;
    }
    mCalled = false;
    onViewStateRestored(paramBundle);
    if (mCalled)
    {
      if (mView != null) {
        mViewLifecycleOwner.a(k.a.ON_CREATE);
      }
      return;
    }
    throw new u0(f.k("Fragment ", this, " did not call through to super.onViewStateRestored()"));
  }
  
  public void setAllowEnterTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfop = Boolean.valueOf(paramBoolean);
  }
  
  public void setAllowReturnTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfoo = Boolean.valueOf(paramBoolean);
  }
  
  public void setAnimations(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((mAnimationInfo == null) && (paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return;
    }
    ensureAnimationInfob = paramInt1;
    ensureAnimationInfoc = paramInt2;
    ensureAnimationInfod = paramInt3;
    ensureAnimationInfoe = paramInt4;
  }
  
  public void setArguments(Bundle paramBundle)
  {
    if ((mFragmentManager != null) && (isStateSaved())) {
      throw new IllegalStateException("Fragment already added and state has been saved");
    }
    mArguments = paramBundle;
  }
  
  public void setEnterSharedElementCallback(u.a0 parama0)
  {
    ensureAnimationInfoq = parama0;
  }
  
  public void setEnterTransition(Object paramObject)
  {
    ensureAnimationInfoi = paramObject;
  }
  
  public void setExitSharedElementCallback(u.a0 parama0)
  {
    ensureAnimationInfor = parama0;
  }
  
  public void setExitTransition(Object paramObject)
  {
    ensureAnimationInfok = paramObject;
  }
  
  public void setFocusedView(View paramView)
  {
    ensureAnimationInfot = paramView;
  }
  
  @Deprecated
  public void setHasOptionsMenu(boolean paramBoolean)
  {
    if (mHasMenu != paramBoolean)
    {
      mHasMenu = paramBoolean;
      if ((isAdded()) && (!isHidden())) {
        mHost.i();
      }
    }
  }
  
  public void setInitialSavedState(n paramn)
  {
    if (mFragmentManager == null)
    {
      if (paramn != null)
      {
        paramn = a;
        if (paramn != null) {}
      }
      else
      {
        paramn = null;
      }
      mSavedFragmentState = paramn;
      return;
    }
    throw new IllegalStateException("Fragment already added");
  }
  
  public void setMenuVisibility(boolean paramBoolean)
  {
    if (mMenuVisible != paramBoolean)
    {
      mMenuVisible = paramBoolean;
      if ((mHasMenu) && (isAdded()) && (!isHidden())) {
        mHost.i();
      }
    }
  }
  
  public void setNextTransition(int paramInt)
  {
    if ((mAnimationInfo == null) && (paramInt == 0)) {
      return;
    }
    ensureAnimationInfo();
    mAnimationInfo.f = paramInt;
  }
  
  public void setPopDirection(boolean paramBoolean)
  {
    if (mAnimationInfo == null) {
      return;
    }
    ensureAnimationInfoa = paramBoolean;
  }
  
  public void setPostOnViewCreatedAlpha(float paramFloat)
  {
    ensureAnimationInfos = paramFloat;
  }
  
  public void setReenterTransition(Object paramObject)
  {
    ensureAnimationInfol = paramObject;
  }
  
  @Deprecated
  public void setRetainInstance(boolean paramBoolean)
  {
    Object localObject = y0.b.a;
    y0.h localh = new y0.h(this);
    y0.b.c(localh);
    localObject = y0.b.a(this);
    if ((a.contains(y0.b.a.f)) && (y0.b.f((y0.b.c)localObject, getClass(), y0.h.class))) {
      y0.b.b((y0.b.c)localObject, localh);
    }
    mRetainInstance = paramBoolean;
    localObject = mFragmentManager;
    if (localObject != null)
    {
      if (paramBoolean) {
        O.c(this);
      } else {
        O.g(this);
      }
    }
    else {
      mRetainInstanceChangedWhileDetached = true;
    }
  }
  
  public void setReturnTransition(Object paramObject)
  {
    ensureAnimationInfoj = paramObject;
  }
  
  public void setSharedElementEnterTransition(Object paramObject)
  {
    ensureAnimationInfom = paramObject;
  }
  
  public void setSharedElementNames(ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2)
  {
    ensureAnimationInfo();
    k localk = mAnimationInfo;
    g = paramArrayList1;
    h = paramArrayList2;
  }
  
  public void setSharedElementReturnTransition(Object paramObject)
  {
    ensureAnimationInfon = paramObject;
  }
  
  @Deprecated
  public void setTargetFragment(i parami, int paramInt)
  {
    if (parami != null)
    {
      localObject1 = y0.b.a;
      localObject1 = new y0.i(this, parami, paramInt);
      y0.b.c((y0.k)localObject1);
      localObject2 = y0.b.a(this);
      if ((a.contains(y0.b.a.p)) && (y0.b.f((y0.b.c)localObject2, getClass(), y0.i.class))) {
        y0.b.b((y0.b.c)localObject2, (y0.k)localObject1);
      }
    }
    Object localObject2 = mFragmentManager;
    if (parami != null) {
      localObject1 = mFragmentManager;
    } else {
      localObject1 = null;
    }
    if ((localObject2 != null) && (localObject1 != null) && (localObject2 != localObject1)) {
      throw new IllegalArgumentException(f.k("Fragment ", parami, " must share the same FragmentManager to be set as a target fragment"));
    }
    Object localObject1 = parami;
    while (localObject1 != null) {
      if (!((i)localObject1).equals(this))
      {
        localObject1 = ((i)localObject1).getTargetFragment(false);
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Setting ");
        ((StringBuilder)localObject1).append(parami);
        ((StringBuilder)localObject1).append(" as the target of ");
        ((StringBuilder)localObject1).append(this);
        ((StringBuilder)localObject1).append(" would create a target cycle");
        throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
      }
    }
    if (parami == null)
    {
      mTargetWho = null;
    }
    else
    {
      if ((mFragmentManager == null) || (mFragmentManager == null)) {
        break label243;
      }
      mTargetWho = mWho;
    }
    mTarget = null;
    break label253;
    label243:
    mTargetWho = null;
    mTarget = parami;
    label253:
    mTargetRequestCode = paramInt;
  }
  
  @Deprecated
  public void setUserVisibleHint(boolean paramBoolean)
  {
    Object localObject1 = y0.b.a;
    localObject1 = new y0.j(this, paramBoolean);
    y0.b.c((y0.k)localObject1);
    Object localObject2 = y0.b.a(this);
    if ((a.contains(y0.b.a.o)) && (y0.b.f((y0.b.c)localObject2, getClass(), y0.j.class))) {
      y0.b.b((y0.b.c)localObject2, (y0.k)localObject1);
    }
    boolean bool1 = mUserVisibleHint;
    boolean bool2 = true;
    if ((!bool1) && (paramBoolean) && (mState < 5) && (mFragmentManager != null) && (isAdded()) && (mIsCreated))
    {
      localObject2 = mFragmentManager;
      localObject1 = ((y)localObject2).h(this);
      i locali = c;
      if (mDeferStart) {
        if (b)
        {
          K = true;
        }
        else
        {
          mDeferStart = false;
          ((e0)localObject1).k();
        }
      }
    }
    mUserVisibleHint = paramBoolean;
    if ((mState >= 5) || (paramBoolean)) {
      bool2 = false;
    }
    mDeferStart = bool2;
    if (mSavedFragmentState != null) {
      mSavedUserVisibleHint = Boolean.valueOf(paramBoolean);
    }
  }
  
  public boolean shouldShowRequestPermissionRationale(String paramString)
  {
    t localt = mHost;
    if (localt != null) {
      return localt.g(paramString);
    }
    return false;
  }
  
  public void startActivity(Intent paramIntent)
  {
    startActivity(paramIntent, null);
  }
  
  public void startActivity(Intent paramIntent, Bundle paramBundle)
  {
    t localt = mHost;
    if (localt != null)
    {
      localt.h(this, paramIntent, -1, paramBundle);
      return;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to Activity"));
  }
  
  @Deprecated
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    startActivityForResult(paramIntent, paramInt, null);
  }
  
  @Deprecated
  public void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (mHost != null)
    {
      y localy = getParentFragmentManager();
      if (C != null)
      {
        y.k localk = new y.k(mWho, paramInt);
        F.addLast(localk);
        if (paramBundle != null) {
          paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle);
        }
        C.a(paramIntent);
      }
      else
      {
        w.h(this, paramIntent, paramInt, paramBundle);
      }
      return;
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to Activity"));
  }
  
  @Deprecated
  public void startIntentSenderForResult(IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    Object localObject1 = paramIntent;
    if (mHost != null)
    {
      if (y.L(2))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Fragment ");
        ((StringBuilder)localObject2).append(this);
        ((StringBuilder)localObject2).append(" received the following in startIntentSenderForResult() requestCode: ");
        ((StringBuilder)localObject2).append(paramInt1);
        ((StringBuilder)localObject2).append(" IntentSender: ");
        ((StringBuilder)localObject2).append(paramIntentSender);
        ((StringBuilder)localObject2).append(" fillInIntent: ");
        ((StringBuilder)localObject2).append(paramIntent);
        ((StringBuilder)localObject2).append(" options: ");
        ((StringBuilder)localObject2).append(paramBundle);
        Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
      }
      Object localObject2 = getParentFragmentManager();
      d.f localf = D;
      int i = 1;
      if (localf != null)
      {
        paramIntent = (Intent)localObject1;
        if (paramBundle != null)
        {
          paramIntent = (Intent)localObject1;
          if (localObject1 == null)
          {
            paramIntent = new Intent();
            paramIntent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
          }
          if (y.L(2))
          {
            localObject1 = new StringBuilder();
            ((StringBuilder)localObject1).append("ActivityOptions ");
            ((StringBuilder)localObject1).append(paramBundle);
            ((StringBuilder)localObject1).append(" were added to fillInIntent ");
            ((StringBuilder)localObject1).append(paramIntent);
            ((StringBuilder)localObject1).append(" for fragment ");
            ((StringBuilder)localObject1).append(this);
            Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          }
          paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle);
        }
        ec.i.e(paramIntentSender, "intentSender");
        paramIntentSender = new d.i(paramIntentSender, paramIntent, paramInt2, paramInt3);
        paramIntent = new y.k(mWho, paramInt1);
        F.addLast(paramIntent);
        if (y.L(2))
        {
          paramIntent = new StringBuilder();
          paramIntent.append("Fragment ");
          paramIntent.append(this);
          paramIntent.append("is launching an IntentSender for result ");
          Log.v("FragmentManager", paramIntent.toString());
        }
        D.a(paramIntentSender);
      }
      else
      {
        localObject1 = w;
        localObject1.getClass();
        ec.i.e(paramIntentSender, "intent");
        if (paramInt1 != -1) {
          i = 0;
        }
        if (i == 0) {
          break label447;
        }
        localObject1 = a;
        if (localObject1 == null) {
          break label433;
        }
        i = u.b.a;
        ((Activity)localObject1).startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      }
      return;
      label433:
      throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
      label447:
      throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host".toString());
    }
    throw new IllegalStateException(f.k("Fragment ", this, " not attached to Activity"));
  }
  
  public void startPostponedEnterTransition()
  {
    if ((mAnimationInfo != null) && (ensureAnimationInfou)) {
      if (mHost == null) {
        ensureAnimationInfou = false;
      } else if (Looper.myLooper() != mHost.c.getLooper()) {
        mHost.c.postAtFrontOfQueue(new d());
      } else {
        callStartTransitionListener(true);
      }
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append(getClass().getSimpleName());
    localStringBuilder.append("{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("}");
    localStringBuilder.append(" (");
    localStringBuilder.append(mWho);
    if (mFragmentId != 0)
    {
      localStringBuilder.append(" id=0x");
      localStringBuilder.append(Integer.toHexString(mFragmentId));
    }
    if (mTag != null)
    {
      localStringBuilder.append(" tag=");
      localStringBuilder.append(mTag);
    }
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
  
  public void unregisterForContextMenu(View paramView)
  {
    paramView.setOnCreateContextMenuListener(null);
  }
  
  public final class a
    extends d.c<I>
  {
    public a() {}
  }
  
  public final class b
    implements Runnable
  {
    public b() {}
    
    public final void run()
    {
      startPostponedEnterTransition();
    }
  }
  
  public final class c
    extends i.m
  {
    public c() {}
    
    public final void a()
    {
      mSavedStateRegistryController.a();
      h0.b(i.this);
      Bundle localBundle = mSavedFragmentState;
      if (localBundle != null) {
        localBundle = localBundle.getBundle("registryState");
      } else {
        localBundle = null;
      }
      mSavedStateRegistryController.b(localBundle);
    }
  }
  
  public final class d
    implements Runnable
  {
    public d() {}
    
    public final void run()
    {
      callStartTransitionListener(false);
    }
  }
  
  public final class e
    implements Runnable
  {
    public e() {}
    
    public final void run()
    {
      if ((b.isEmpty() ^ true)) {
        i();
      }
    }
  }
  
  public final class f
    extends p
  {
    public f() {}
    
    public final View b(int paramInt)
    {
      Object localObject = mView;
      if (localObject != null) {
        return ((View)localObject).findViewById(paramInt);
      }
      localObject = f.l("Fragment ");
      ((StringBuilder)localObject).append(i.this);
      ((StringBuilder)localObject).append(" does not have a view");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    public final boolean c()
    {
      boolean bool;
      if (mView != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public final class g
    implements b1.m
  {
    public g() {}
    
    public final void a(o paramo, k.a parama)
    {
      if (parama == k.a.ON_STOP)
      {
        paramo = mView;
        if (paramo != null) {
          paramo.cancelPendingInputEvents();
        }
      }
    }
  }
  
  public final class h
    implements o.a<Void, d.g>
  {
    public h() {}
    
    public final Object apply(Object paramObject)
    {
      paramObject = (Void)paramObject;
      paramObject = i.this;
      t localt = mHost;
      if ((localt instanceof d.h)) {
        paramObject = ((d.h)localt).getActivityResultRegistry();
      } else {
        paramObject = ((i)paramObject).requireActivity().getActivityResultRegistry();
      }
      return paramObject;
    }
  }
  
  public final class i
    implements o.a<Void, d.g>
  {
    public i() {}
    
    public final Object apply(Object paramObject)
    {
      paramObject = (Void)paramObject;
      return i.this;
    }
  }
  
  public final class j
    extends i.m
  {
    public j(o.a parama, AtomicReference paramAtomicReference, e.a parama1, d.b paramb) {}
    
    public final void a()
    {
      String str = generateActivityResultKey();
      d.g localg = (d.g)parama1.apply(null);
      localAtomicReference.set(localg.c(str, i.this, parama, paramb));
    }
  }
  
  public static final class k
  {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ArrayList<String> g;
    public ArrayList<String> h;
    public Object i = null;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Boolean o;
    public Boolean p;
    public u.a0 q;
    public u.a0 r;
    public float s;
    public View t;
    public boolean u;
    
    public k()
    {
      Object localObject = i.USE_DEFAULT_TRANSITION;
      j = localObject;
      k = null;
      l = localObject;
      m = null;
      n = localObject;
      q = null;
      r = null;
      s = 1.0F;
      t = null;
    }
  }
  
  public static final class l
    extends RuntimeException
  {
    public l(String paramString, Exception paramException)
    {
      super(paramException);
    }
  }
  
  public static abstract class m
  {
    public abstract void a();
  }
  
  public static final class n
    implements Parcelable
  {
    public static final Parcelable.Creator<n> CREATOR = new a();
    public final Bundle a;
    
    public n(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      paramParcel = paramParcel.readBundle();
      a = paramParcel;
      if ((paramClassLoader != null) && (paramParcel != null)) {
        paramParcel.setClassLoader(paramClassLoader);
      }
    }
    
    public final int describeContents()
    {
      return 0;
    }
    
    public final void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeBundle(a);
    }
    
    public final class a
      implements Parcelable.ClassLoaderCreator<i.n>
    {
      public final Object createFromParcel(Parcel paramParcel)
      {
        return new i.n(paramParcel, null);
      }
      
      public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
      {
        return new i.n(paramParcel, paramClassLoader);
      }
      
      public final Object[] newArray(int paramInt)
      {
        return new i.n[paramInt];
      }
    }
  }
}

/* Location:
 * Qualified Name:     x0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */