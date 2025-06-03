package androidx.fragment.app;

import a;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
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
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.UiThread;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import z2;

public class Fragment
  implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller
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
  public AnimationInfo mAnimationInfo;
  public Bundle mArguments;
  public int mBackStackNesting;
  private boolean mCalled;
  @NonNull
  public FragmentManager mChildFragmentManager = new FragmentManagerImpl();
  public ViewGroup mContainer;
  public int mContainerId;
  @LayoutRes
  private int mContentLayoutId;
  public ViewModelProvider.Factory mDefaultFactory;
  public boolean mDeferStart;
  public boolean mDetached;
  public int mFragmentId;
  public FragmentManager mFragmentManager;
  public boolean mFromLayout;
  public boolean mHasMenu;
  public boolean mHidden;
  public boolean mHiddenChanged;
  public FragmentHostCallback<?> mHost;
  public boolean mInLayout;
  public boolean mIsCreated;
  public boolean mIsNewlyAdded;
  private Boolean mIsPrimaryNavigationFragment = null;
  public LayoutInflater mLayoutInflater;
  public LifecycleRegistry mLifecycleRegistry;
  public Lifecycle.State mMaxState = Lifecycle.State.RESUMED;
  public boolean mMenuVisible = true;
  private final AtomicInteger mNextLocalRequestCode = new AtomicInteger();
  private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners = new ArrayList();
  public Fragment mParentFragment;
  public boolean mPerformedCreateView;
  public float mPostponedAlpha;
  public Runnable mPostponedDurationRunnable = new Runnable()
  {
    public void run()
    {
      startPostponedEnterTransition();
    }
  };
  public boolean mRemoving;
  public boolean mRestored;
  public boolean mRetainInstance;
  public boolean mRetainInstanceChangedWhileDetached;
  public Bundle mSavedFragmentState;
  public SavedStateRegistryController mSavedStateRegistryController;
  @Nullable
  public Boolean mSavedUserVisibleHint;
  public Bundle mSavedViewRegistryState;
  public SparseArray<Parcelable> mSavedViewState;
  public int mState = -1;
  public String mTag;
  public Fragment mTarget;
  public int mTargetRequestCode;
  public String mTargetWho = null;
  public boolean mUserVisibleHint = true;
  public View mView;
  @Nullable
  public FragmentViewLifecycleOwner mViewLifecycleOwner;
  public MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData = new MutableLiveData();
  @NonNull
  public String mWho = UUID.randomUUID().toString();
  
  public Fragment()
  {
    initLifecycle();
  }
  
  @ContentView
  public Fragment(@LayoutRes int paramInt)
  {
    this();
    mContentLayoutId = paramInt;
  }
  
  private AnimationInfo ensureAnimationInfo()
  {
    if (mAnimationInfo == null) {
      mAnimationInfo = new AnimationInfo();
    }
    return mAnimationInfo;
  }
  
  private int getMinimumMaxLifecycleState()
  {
    Lifecycle.State localState = mMaxState;
    if ((localState != Lifecycle.State.INITIALIZED) && (mParentFragment != null)) {
      return Math.min(localState.ordinal(), mParentFragment.getMinimumMaxLifecycleState());
    }
    return localState.ordinal();
  }
  
  private void initLifecycle()
  {
    mLifecycleRegistry = new LifecycleRegistry(this);
    mSavedStateRegistryController = SavedStateRegistryController.create(this);
    mDefaultFactory = null;
  }
  
  @Deprecated
  @NonNull
  public static Fragment instantiate(@NonNull Context paramContext, @NonNull String paramString)
  {
    return instantiate(paramContext, paramString, null);
  }
  
  @Deprecated
  @NonNull
  public static Fragment instantiate(@NonNull Context paramContext, @NonNull String paramString, @Nullable Bundle paramBundle)
  {
    try
    {
      paramContext = (Fragment)FragmentFactory.loadFragmentClass(paramContext.getClassLoader(), paramString).getConstructor(new Class[0]).newInstance(new Object[0]);
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(paramContext.getClass().getClassLoader());
        paramContext.setArguments(paramBundle);
      }
      return paramContext;
    }
    catch (InvocationTargetException paramContext)
    {
      throw new InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": calling Fragment constructor caused an exception"), paramContext);
    }
    catch (NoSuchMethodException paramContext)
    {
      throw new InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": could not find Fragment constructor"), paramContext);
    }
    catch (IllegalAccessException paramContext)
    {
      throw new InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramContext);
    }
    catch (InstantiationException paramContext)
    {
      throw new InstantiationException(z2.p("Unable to instantiate fragment ", paramString, ": make sure class name exists, is public, and has an empty constructor that is public"), paramContext);
    }
  }
  
  @NonNull
  private <I, O> ActivityResultLauncher<I> prepareCallInternal(@NonNull final ActivityResultContract<I, O> paramActivityResultContract, @NonNull final Function<Void, ActivityResultRegistry> paramFunction, @NonNull final ActivityResultCallback<O> paramActivityResultCallback)
  {
    if (mState <= 1)
    {
      final AtomicReference localAtomicReference = new AtomicReference();
      registerOnPreAttachListener(new OnPreAttachedListener(paramFunction)
      {
        public void onPreAttached()
        {
          String str = generateActivityResultKey();
          ActivityResultRegistry localActivityResultRegistry = (ActivityResultRegistry)paramFunction.apply(null);
          localAtomicReference.set(localActivityResultRegistry.register(str, Fragment.this, paramActivityResultContract, paramActivityResultCallback));
        }
      });
      new ActivityResultLauncher()
      {
        @NonNull
        public ActivityResultContract<I, ?> getContract()
        {
          return paramActivityResultContract;
        }
        
        public void launch(I paramAnonymousI, @Nullable ActivityOptionsCompat paramAnonymousActivityOptionsCompat)
        {
          ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)localAtomicReference.get();
          if (localActivityResultLauncher != null)
          {
            localActivityResultLauncher.launch(paramAnonymousI, paramAnonymousActivityOptionsCompat);
            return;
          }
          throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        
        public void unregister()
        {
          ActivityResultLauncher localActivityResultLauncher = (ActivityResultLauncher)localAtomicReference.getAndSet(null);
          if (localActivityResultLauncher != null) {
            localActivityResultLauncher.unregister();
          }
        }
      };
    }
    throw new IllegalStateException(a.j("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
  }
  
  private void registerOnPreAttachListener(@NonNull OnPreAttachedListener paramOnPreAttachedListener)
  {
    if (mState >= 0) {
      paramOnPreAttachedListener.onPreAttached();
    } else {
      mOnPreAttachedListeners.add(paramOnPreAttachedListener);
    }
  }
  
  private void restoreViewState()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("moveto RESTORE_VIEW_STATE: ");
      localStringBuilder.append(this);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    if (mView != null) {
      restoreViewState(mSavedFragmentState);
    }
    mSavedFragmentState = null;
  }
  
  public void callStartTransitionListener(boolean paramBoolean)
  {
    Object localObject1 = mAnimationInfo;
    final Object localObject2 = null;
    if (localObject1 != null)
    {
      mEnterTransitionPostponed = false;
      localObject2 = mStartEnterTransitionListener;
      mStartEnterTransitionListener = null;
    }
    if (localObject2 != null)
    {
      ((OnStartEnterTransitionListener)localObject2).onStartEnterTransition();
    }
    else if ((FragmentManager.USE_STATE_MANAGER) && (mView != null))
    {
      localObject1 = mContainer;
      if (localObject1 != null)
      {
        localObject2 = mFragmentManager;
        if (localObject2 != null)
        {
          localObject2 = SpecialEffectsController.getOrCreateController((ViewGroup)localObject1, (FragmentManager)localObject2);
          ((SpecialEffectsController)localObject2).markPostponedState();
          if (paramBoolean) {
            mHost.getHandler().post(new Runnable()
            {
              public void run()
              {
                localObject2.executePendingOperations();
              }
            });
          } else {
            ((SpecialEffectsController)localObject2).executePendingOperations();
          }
        }
      }
    }
  }
  
  @NonNull
  public FragmentContainer createFragmentContainer()
  {
    new FragmentContainer()
    {
      @Nullable
      public View onFindViewById(int paramAnonymousInt)
      {
        Object localObject = mView;
        if (localObject != null) {
          return ((View)localObject).findViewById(paramAnonymousInt);
        }
        localObject = z2.t("Fragment ");
        ((StringBuilder)localObject).append(Fragment.this);
        ((StringBuilder)localObject).append(" does not have a view");
        throw new IllegalStateException(((StringBuilder)localObject).toString());
      }
      
      public boolean onHasView()
      {
        boolean bool;
        if (mView != null) {
          bool = true;
        } else {
          bool = false;
        }
        return bool;
      }
    };
  }
  
  public void dump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
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
    Object localObject = getTargetFragment();
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
      LoaderManager.getInstance(this).dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    paramPrintWriter.print(paramString);
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Child ");
    ((StringBuilder)localObject).append(mChildFragmentManager);
    ((StringBuilder)localObject).append(":");
    paramPrintWriter.println(((StringBuilder)localObject).toString());
    mChildFragmentManager.dump(z2.o(paramString, "  "), paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public final boolean equals(@Nullable Object paramObject)
  {
    return super.equals(paramObject);
  }
  
  @Nullable
  public Fragment findFragmentByWho(@NonNull String paramString)
  {
    if (paramString.equals(mWho)) {
      return this;
    }
    return mChildFragmentManager.findFragmentByWho(paramString);
  }
  
  @NonNull
  public String generateActivityResultKey()
  {
    StringBuilder localStringBuilder = z2.t("fragment_");
    localStringBuilder.append(mWho);
    localStringBuilder.append("_rq#");
    localStringBuilder.append(mNextLocalRequestCode.getAndIncrement());
    return localStringBuilder.toString();
  }
  
  @Nullable
  public final FragmentActivity getActivity()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (FragmentActivity)((FragmentHostCallback)localObject).getActivity();
    }
    return (FragmentActivity)localObject;
  }
  
  public boolean getAllowEnterTransitionOverlap()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = mAllowEnterTransitionOverlap;
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
      localObject = mAllowReturnTransitionOverlap;
      if (localObject != null) {
        return ((Boolean)localObject).booleanValue();
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public View getAnimatingAway()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mAnimatingAway;
  }
  
  public Animator getAnimator()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mAnimator;
  }
  
  @Nullable
  public final Bundle getArguments()
  {
    return mArguments;
  }
  
  @NonNull
  public final FragmentManager getChildFragmentManager()
  {
    if (mHost != null) {
      return mChildFragmentManager;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " has not been attached yet."));
  }
  
  @Nullable
  public Context getContext()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((FragmentHostCallback)localObject).getContext();
    }
    return (Context)localObject;
  }
  
  @NonNull
  public ViewModelProvider.Factory getDefaultViewModelProviderFactory()
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
        if ((localObject3 == null) && (FragmentManager.isLoggingEnabled(3)))
        {
          localObject2 = z2.t("Could not find Application instance from Context ");
          ((StringBuilder)localObject2).append(requireContext().getApplicationContext());
          ((StringBuilder)localObject2).append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
          Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        mDefaultFactory = new SavedStateViewModelFactory((Application)localObject3, this, getArguments());
      }
      return mDefaultFactory;
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  public int getEnterAnim()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 0;
    }
    return mEnterAnim;
  }
  
  @Nullable
  public Object getEnterTransition()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mEnterTransition;
  }
  
  public SharedElementCallback getEnterTransitionCallback()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mEnterTransitionCallback;
  }
  
  public int getExitAnim()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 0;
    }
    return mExitAnim;
  }
  
  @Nullable
  public Object getExitTransition()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mExitTransition;
  }
  
  public SharedElementCallback getExitTransitionCallback()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mExitTransitionCallback;
  }
  
  public View getFocusedView()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mFocusedView;
  }
  
  @Deprecated
  @Nullable
  public final FragmentManager getFragmentManager()
  {
    return mFragmentManager;
  }
  
  @Nullable
  public final Object getHost()
  {
    Object localObject = mHost;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((FragmentHostCallback)localObject).onGetHost();
    }
    return localObject;
  }
  
  public final int getId()
  {
    return mFragmentId;
  }
  
  @NonNull
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
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public LayoutInflater getLayoutInflater(@Nullable Bundle paramBundle)
  {
    paramBundle = mHost;
    if (paramBundle != null)
    {
      paramBundle = paramBundle.onGetLayoutInflater();
      LayoutInflaterCompat.setFactory2(paramBundle, mChildFragmentManager.getLayoutInflaterFactory());
      return paramBundle;
    }
    throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  @Deprecated
  @NonNull
  public LoaderManager getLoaderManager()
  {
    return LoaderManager.getInstance(this);
  }
  
  public int getNextTransition()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 0;
    }
    return mNextTransition;
  }
  
  @Nullable
  public final Fragment getParentFragment()
  {
    return mParentFragment;
  }
  
  @NonNull
  public final FragmentManager getParentFragmentManager()
  {
    FragmentManager localFragmentManager = mFragmentManager;
    if (localFragmentManager != null) {
      return localFragmentManager;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not associated with a fragment manager."));
  }
  
  public boolean getPopDirection()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return false;
    }
    return mIsPop;
  }
  
  public int getPopEnterAnim()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 0;
    }
    return mPopEnterAnim;
  }
  
  public int getPopExitAnim()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 0;
    }
    return mPopExitAnim;
  }
  
  public float getPostOnViewCreatedAlpha()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return 1.0F;
    }
    return mPostOnViewCreatedAlpha;
  }
  
  @Nullable
  public Object getReenterTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = mReenterTransition;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getExitTransition();
    }
    return localObject1;
  }
  
  @NonNull
  public final Resources getResources()
  {
    return requireContext().getResources();
  }
  
  @Deprecated
  public final boolean getRetainInstance()
  {
    return mRetainInstance;
  }
  
  @Nullable
  public Object getReturnTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = mReturnTransition;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getEnterTransition();
    }
    return localObject1;
  }
  
  @NonNull
  public final SavedStateRegistry getSavedStateRegistry()
  {
    return mSavedStateRegistryController.getSavedStateRegistry();
  }
  
  @Nullable
  public Object getSharedElementEnterTransition()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return null;
    }
    return mSharedElementEnterTransition;
  }
  
  @Nullable
  public Object getSharedElementReturnTransition()
  {
    Object localObject1 = mAnimationInfo;
    if (localObject1 == null) {
      return null;
    }
    Object localObject2 = mSharedElementReturnTransition;
    localObject1 = localObject2;
    if (localObject2 == USE_DEFAULT_TRANSITION) {
      localObject1 = getSharedElementEnterTransition();
    }
    return localObject1;
  }
  
  @NonNull
  public ArrayList<String> getSharedElementSourceNames()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = mSharedElementSourceNames;
      if (localObject != null) {
        return (ArrayList<String>)localObject;
      }
    }
    return new ArrayList();
  }
  
  @NonNull
  public ArrayList<String> getSharedElementTargetNames()
  {
    Object localObject = mAnimationInfo;
    if (localObject != null)
    {
      localObject = mSharedElementTargetNames;
      if (localObject != null) {
        return (ArrayList<String>)localObject;
      }
    }
    return new ArrayList();
  }
  
  @NonNull
  public final String getString(@StringRes int paramInt)
  {
    return getResources().getString(paramInt);
  }
  
  @NonNull
  public final String getString(@StringRes int paramInt, @Nullable Object... paramVarArgs)
  {
    return getResources().getString(paramInt, paramVarArgs);
  }
  
  @Nullable
  public final String getTag()
  {
    return mTag;
  }
  
  @Deprecated
  @Nullable
  public final Fragment getTargetFragment()
  {
    Object localObject = mTarget;
    if (localObject != null) {
      return (Fragment)localObject;
    }
    localObject = mFragmentManager;
    if (localObject != null)
    {
      String str = mTargetWho;
      if (str != null) {
        return ((FragmentManager)localObject).findActiveFragment(str);
      }
    }
    return null;
  }
  
  @Deprecated
  public final int getTargetRequestCode()
  {
    return mTargetRequestCode;
  }
  
  @NonNull
  public final CharSequence getText(@StringRes int paramInt)
  {
    return getResources().getText(paramInt);
  }
  
  @Deprecated
  public boolean getUserVisibleHint()
  {
    return mUserVisibleHint;
  }
  
  @Nullable
  public View getView()
  {
    return mView;
  }
  
  @MainThread
  @NonNull
  public LifecycleOwner getViewLifecycleOwner()
  {
    FragmentViewLifecycleOwner localFragmentViewLifecycleOwner = mViewLifecycleOwner;
    if (localFragmentViewLifecycleOwner != null) {
      return localFragmentViewLifecycleOwner;
    }
    throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
  }
  
  @NonNull
  public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData()
  {
    return mViewLifecycleOwnerLiveData;
  }
  
  @NonNull
  public ViewModelStore getViewModelStore()
  {
    if (mFragmentManager != null)
    {
      if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
        return mFragmentManager.getViewModelStore(this);
      }
      throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }
    throw new IllegalStateException("Can't access ViewModels from detached fragment");
  }
  
  @SuppressLint({"KotlinPropertyAccess"})
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
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
    mWho = UUID.randomUUID().toString();
    mAdded = false;
    mRemoving = false;
    mFromLayout = false;
    mInLayout = false;
    mRestored = false;
    mBackStackNesting = 0;
    mFragmentManager = null;
    mChildFragmentManager = new FragmentManagerImpl();
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
    return mHidden;
  }
  
  public boolean isHideReplaced()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return false;
    }
    return mIsHideReplaced;
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
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public final boolean isMenuVisible()
  {
    if (mMenuVisible)
    {
      FragmentManager localFragmentManager = mFragmentManager;
      if ((localFragmentManager == null) || (localFragmentManager.isParentMenuVisible(mParentFragment))) {
        return true;
      }
    }
    boolean bool = false;
    return bool;
  }
  
  public boolean isPostponed()
  {
    AnimationInfo localAnimationInfo = mAnimationInfo;
    if (localAnimationInfo == null) {
      return false;
    }
    return mEnterTransitionPostponed;
  }
  
  public final boolean isRemoving()
  {
    return mRemoving;
  }
  
  public final boolean isRemovingParent()
  {
    Fragment localFragment = getParentFragment();
    boolean bool;
    if ((localFragment != null) && ((localFragment.isRemoving()) || (localFragment.isRemovingParent()))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
    FragmentManager localFragmentManager = mFragmentManager;
    if (localFragmentManager == null) {
      return false;
    }
    return localFragmentManager.isStateSaved();
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
    mChildFragmentManager.noteStateNotSaved();
  }
  
  @Deprecated
  @CallSuper
  @MainThread
  public void onActivityCreated(@Nullable Bundle paramBundle)
  {
    mCalled = true;
  }
  
  @Deprecated
  public void onActivityResult(int paramInt1, int paramInt2, @Nullable Intent paramIntent)
  {
    if (FragmentManager.isLoggingEnabled(2))
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
  @CallSuper
  @MainThread
  public void onAttach(@NonNull Activity paramActivity)
  {
    mCalled = true;
  }
  
  @CallSuper
  @MainThread
  public void onAttach(@NonNull Context paramContext)
  {
    mCalled = true;
    paramContext = mHost;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.getActivity();
    }
    if (paramContext != null)
    {
      mCalled = false;
      onAttach(paramContext);
    }
  }
  
  @Deprecated
  @MainThread
  public void onAttachFragment(@NonNull Fragment paramFragment) {}
  
  @CallSuper
  public void onConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    mCalled = true;
  }
  
  @MainThread
  public boolean onContextItemSelected(@NonNull MenuItem paramMenuItem)
  {
    return false;
  }
  
  @CallSuper
  @MainThread
  public void onCreate(@Nullable Bundle paramBundle)
  {
    mCalled = true;
    restoreChildFragmentState(paramBundle);
    if (!mChildFragmentManager.isStateAtLeast(1)) {
      mChildFragmentManager.dispatchCreate();
    }
  }
  
  @MainThread
  @Nullable
  public Animation onCreateAnimation(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  @MainThread
  @Nullable
  public Animator onCreateAnimator(int paramInt1, boolean paramBoolean, int paramInt2)
  {
    return null;
  }
  
  @MainThread
  public void onCreateContextMenu(@NonNull ContextMenu paramContextMenu, @NonNull View paramView, @Nullable ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    requireActivity().onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
  }
  
  @MainThread
  public void onCreateOptionsMenu(@NonNull Menu paramMenu, @NonNull MenuInflater paramMenuInflater) {}
  
  @MainThread
  @Nullable
  public View onCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    int i = mContentLayoutId;
    if (i != 0) {
      return paramLayoutInflater.inflate(i, paramViewGroup, false);
    }
    return null;
  }
  
  @CallSuper
  @MainThread
  public void onDestroy()
  {
    mCalled = true;
  }
  
  @MainThread
  public void onDestroyOptionsMenu() {}
  
  @CallSuper
  @MainThread
  public void onDestroyView()
  {
    mCalled = true;
  }
  
  @CallSuper
  @MainThread
  public void onDetach()
  {
    mCalled = true;
  }
  
  @NonNull
  public LayoutInflater onGetLayoutInflater(@Nullable Bundle paramBundle)
  {
    return getLayoutInflater(paramBundle);
  }
  
  @MainThread
  public void onHiddenChanged(boolean paramBoolean) {}
  
  @Deprecated
  @CallSuper
  @UiThread
  public void onInflate(@NonNull Activity paramActivity, @NonNull AttributeSet paramAttributeSet, @Nullable Bundle paramBundle)
  {
    mCalled = true;
  }
  
  @CallSuper
  @UiThread
  public void onInflate(@NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet, @Nullable Bundle paramBundle)
  {
    mCalled = true;
    paramContext = mHost;
    if (paramContext == null) {
      paramContext = null;
    } else {
      paramContext = paramContext.getActivity();
    }
    if (paramContext != null)
    {
      mCalled = false;
      onInflate(paramContext, paramAttributeSet, paramBundle);
    }
  }
  
  @CallSuper
  @MainThread
  public void onLowMemory()
  {
    mCalled = true;
  }
  
  public void onMultiWindowModeChanged(boolean paramBoolean) {}
  
  @MainThread
  public boolean onOptionsItemSelected(@NonNull MenuItem paramMenuItem)
  {
    return false;
  }
  
  @MainThread
  public void onOptionsMenuClosed(@NonNull Menu paramMenu) {}
  
  @CallSuper
  @MainThread
  public void onPause()
  {
    mCalled = true;
  }
  
  public void onPictureInPictureModeChanged(boolean paramBoolean) {}
  
  @MainThread
  public void onPrepareOptionsMenu(@NonNull Menu paramMenu) {}
  
  @MainThread
  public void onPrimaryNavigationFragmentChanged(boolean paramBoolean) {}
  
  @Deprecated
  public void onRequestPermissionsResult(int paramInt, @NonNull String[] paramArrayOfString, @NonNull int[] paramArrayOfInt) {}
  
  @CallSuper
  @MainThread
  public void onResume()
  {
    mCalled = true;
  }
  
  @MainThread
  public void onSaveInstanceState(@NonNull Bundle paramBundle) {}
  
  @CallSuper
  @MainThread
  public void onStart()
  {
    mCalled = true;
  }
  
  @CallSuper
  @MainThread
  public void onStop()
  {
    mCalled = true;
  }
  
  @MainThread
  public void onViewCreated(@NonNull View paramView, @Nullable Bundle paramBundle) {}
  
  @CallSuper
  @MainThread
  public void onViewStateRestored(@Nullable Bundle paramBundle)
  {
    mCalled = true;
  }
  
  public void performActivityCreated(Bundle paramBundle)
  {
    mChildFragmentManager.noteStateNotSaved();
    mState = 3;
    mCalled = false;
    onActivityCreated(paramBundle);
    if (mCalled)
    {
      restoreViewState();
      mChildFragmentManager.dispatchActivityCreated();
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onActivityCreated()"));
  }
  
  public void performAttach()
  {
    Iterator localIterator = mOnPreAttachedListeners.iterator();
    while (localIterator.hasNext()) {
      ((OnPreAttachedListener)localIterator.next()).onPreAttached();
    }
    mOnPreAttachedListeners.clear();
    mChildFragmentManager.attachController(mHost, createFragmentContainer(), this);
    mState = 0;
    mCalled = false;
    onAttach(mHost.getContext());
    if (mCalled)
    {
      mFragmentManager.dispatchOnAttachFragment(this);
      mChildFragmentManager.dispatchAttach();
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onAttach()"));
  }
  
  public void performConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    onConfigurationChanged(paramConfiguration);
    mChildFragmentManager.dispatchConfigurationChanged(paramConfiguration);
  }
  
  public boolean performContextItemSelected(@NonNull MenuItem paramMenuItem)
  {
    if (!mHidden)
    {
      if (onContextItemSelected(paramMenuItem)) {
        return true;
      }
      return mChildFragmentManager.dispatchContextItemSelected(paramMenuItem);
    }
    return false;
  }
  
  public void performCreate(Bundle paramBundle)
  {
    mChildFragmentManager.noteStateNotSaved();
    mState = 1;
    mCalled = false;
    mLifecycleRegistry.addObserver(new LifecycleEventObserver()
    {
      public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
      {
        if (paramAnonymousEvent == Lifecycle.Event.ON_STOP)
        {
          paramAnonymousLifecycleOwner = mView;
          if (paramAnonymousLifecycleOwner != null) {
            paramAnonymousLifecycleOwner.cancelPendingInputEvents();
          }
        }
      }
    });
    mSavedStateRegistryController.performRestore(paramBundle);
    onCreate(paramBundle);
    mIsCreated = true;
    if (mCalled)
    {
      mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onCreate()"));
  }
  
  public boolean performCreateOptionsMenu(@NonNull Menu paramMenu, @NonNull MenuInflater paramMenuInflater)
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
      bool2 = j | mChildFragmentManager.dispatchCreateOptionsMenu(paramMenu, paramMenuInflater);
    }
    return bool2;
  }
  
  public void performCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    mChildFragmentManager.noteStateNotSaved();
    mPerformedCreateView = true;
    mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore());
    paramLayoutInflater = onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    mView = paramLayoutInflater;
    if (paramLayoutInflater != null)
    {
      mViewLifecycleOwner.initialize();
      ViewTreeLifecycleOwner.set(mView, mViewLifecycleOwner);
      ViewTreeViewModelStoreOwner.set(mView, mViewLifecycleOwner);
      ViewTreeSavedStateRegistryOwner.set(mView, mViewLifecycleOwner);
      mViewLifecycleOwnerLiveData.setValue(mViewLifecycleOwner);
    }
    else
    {
      if (mViewLifecycleOwner.isInitialized()) {
        break label115;
      }
      mViewLifecycleOwner = null;
    }
    return;
    label115:
    throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
  }
  
  public void performDestroy()
  {
    mChildFragmentManager.dispatchDestroy();
    mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    mState = 0;
    mCalled = false;
    mIsCreated = false;
    onDestroy();
    if (mCalled) {
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onDestroy()"));
  }
  
  public void performDestroyView()
  {
    mChildFragmentManager.dispatchDestroyView();
    if ((mView != null) && (mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED))) {
      mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }
    mState = 1;
    mCalled = false;
    onDestroyView();
    if (mCalled)
    {
      LoaderManager.getInstance(this).markForRedelivery();
      mPerformedCreateView = false;
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onDestroyView()"));
  }
  
  public void performDetach()
  {
    mState = -1;
    mCalled = false;
    onDetach();
    mLayoutInflater = null;
    if (mCalled)
    {
      if (!mChildFragmentManager.isDestroyed())
      {
        mChildFragmentManager.dispatchDestroy();
        mChildFragmentManager = new FragmentManagerImpl();
      }
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onDetach()"));
  }
  
  @NonNull
  public LayoutInflater performGetLayoutInflater(@Nullable Bundle paramBundle)
  {
    paramBundle = onGetLayoutInflater(paramBundle);
    mLayoutInflater = paramBundle;
    return paramBundle;
  }
  
  public void performLowMemory()
  {
    onLowMemory();
    mChildFragmentManager.dispatchLowMemory();
  }
  
  public void performMultiWindowModeChanged(boolean paramBoolean)
  {
    onMultiWindowModeChanged(paramBoolean);
    mChildFragmentManager.dispatchMultiWindowModeChanged(paramBoolean);
  }
  
  public boolean performOptionsItemSelected(@NonNull MenuItem paramMenuItem)
  {
    if (!mHidden)
    {
      if ((mHasMenu) && (mMenuVisible) && (onOptionsItemSelected(paramMenuItem))) {
        return true;
      }
      return mChildFragmentManager.dispatchOptionsItemSelected(paramMenuItem);
    }
    return false;
  }
  
  public void performOptionsMenuClosed(@NonNull Menu paramMenu)
  {
    if (!mHidden)
    {
      if ((mHasMenu) && (mMenuVisible)) {
        onOptionsMenuClosed(paramMenu);
      }
      mChildFragmentManager.dispatchOptionsMenuClosed(paramMenu);
    }
  }
  
  public void performPause()
  {
    mChildFragmentManager.dispatchPause();
    if (mView != null) {
      mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }
    mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    mState = 6;
    mCalled = false;
    onPause();
    if (mCalled) {
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onPause()"));
  }
  
  public void performPictureInPictureModeChanged(boolean paramBoolean)
  {
    onPictureInPictureModeChanged(paramBoolean);
    mChildFragmentManager.dispatchPictureInPictureModeChanged(paramBoolean);
  }
  
  public boolean performPrepareOptionsMenu(@NonNull Menu paramMenu)
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
      bool2 = j | mChildFragmentManager.dispatchPrepareOptionsMenu(paramMenu);
    }
    return bool2;
  }
  
  public void performPrimaryNavigationFragmentChanged()
  {
    boolean bool = mFragmentManager.isPrimaryNavigation(this);
    Boolean localBoolean = mIsPrimaryNavigationFragment;
    if ((localBoolean == null) || (localBoolean.booleanValue() != bool))
    {
      mIsPrimaryNavigationFragment = Boolean.valueOf(bool);
      onPrimaryNavigationFragmentChanged(bool);
      mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
    }
  }
  
  public void performResume()
  {
    mChildFragmentManager.noteStateNotSaved();
    mChildFragmentManager.execPendingActions(true);
    mState = 7;
    mCalled = false;
    onResume();
    if (mCalled)
    {
      LifecycleRegistry localLifecycleRegistry = mLifecycleRegistry;
      Lifecycle.Event localEvent = Lifecycle.Event.ON_RESUME;
      localLifecycleRegistry.handleLifecycleEvent(localEvent);
      if (mView != null) {
        mViewLifecycleOwner.handleLifecycleEvent(localEvent);
      }
      mChildFragmentManager.dispatchResume();
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onResume()"));
  }
  
  public void performSaveInstanceState(Bundle paramBundle)
  {
    onSaveInstanceState(paramBundle);
    mSavedStateRegistryController.performSave(paramBundle);
    Parcelable localParcelable = mChildFragmentManager.saveAllState();
    if (localParcelable != null) {
      paramBundle.putParcelable("android:support:fragments", localParcelable);
    }
  }
  
  public void performStart()
  {
    mChildFragmentManager.noteStateNotSaved();
    mChildFragmentManager.execPendingActions(true);
    mState = 5;
    mCalled = false;
    onStart();
    if (mCalled)
    {
      LifecycleRegistry localLifecycleRegistry = mLifecycleRegistry;
      Lifecycle.Event localEvent = Lifecycle.Event.ON_START;
      localLifecycleRegistry.handleLifecycleEvent(localEvent);
      if (mView != null) {
        mViewLifecycleOwner.handleLifecycleEvent(localEvent);
      }
      mChildFragmentManager.dispatchStart();
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onStart()"));
  }
  
  public void performStop()
  {
    mChildFragmentManager.dispatchStop();
    if (mView != null) {
      mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }
    mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    mState = 4;
    mCalled = false;
    onStop();
    if (mCalled) {
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onStop()"));
  }
  
  public void performViewCreated()
  {
    onViewCreated(mView, mSavedFragmentState);
    mChildFragmentManager.dispatchViewCreated();
  }
  
  public void postponeEnterTransition()
  {
    ensureAnimationInfomEnterTransitionPostponed = true;
  }
  
  public final void postponeEnterTransition(long paramLong, @NonNull TimeUnit paramTimeUnit)
  {
    ensureAnimationInfomEnterTransitionPostponed = true;
    Object localObject = mFragmentManager;
    if (localObject != null) {
      localObject = ((FragmentManager)localObject).getHost().getHandler();
    } else {
      localObject = new Handler(Looper.getMainLooper());
    }
    ((Handler)localObject).removeCallbacks(mPostponedDurationRunnable);
    ((Handler)localObject).postDelayed(mPostponedDurationRunnable, paramTimeUnit.toMillis(paramLong));
  }
  
  @MainThread
  @NonNull
  public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull ActivityResultCallback<O> paramActivityResultCallback)
  {
    prepareCallInternal(paramActivityResultContract, new Function()
    {
      public ActivityResultRegistry apply(Void paramAnonymousVoid)
      {
        paramAnonymousVoid = Fragment.this;
        FragmentHostCallback localFragmentHostCallback = mHost;
        if ((localFragmentHostCallback instanceof ActivityResultRegistryOwner)) {
          return ((ActivityResultRegistryOwner)localFragmentHostCallback).getActivityResultRegistry();
        }
        return paramAnonymousVoid.requireActivity().getActivityResultRegistry();
      }
    }, paramActivityResultCallback);
  }
  
  @MainThread
  @NonNull
  public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> paramActivityResultContract, @NonNull final ActivityResultRegistry paramActivityResultRegistry, @NonNull ActivityResultCallback<O> paramActivityResultCallback)
  {
    prepareCallInternal(paramActivityResultContract, new Function()
    {
      public ActivityResultRegistry apply(Void paramAnonymousVoid)
      {
        return paramActivityResultRegistry;
      }
    }, paramActivityResultCallback);
  }
  
  public void registerForContextMenu(@NonNull View paramView)
  {
    paramView.setOnCreateContextMenuListener(this);
  }
  
  @Deprecated
  public final void requestPermissions(@NonNull String[] paramArrayOfString, int paramInt)
  {
    if (mHost != null)
    {
      getParentFragmentManager().launchRequestPermissions(this, paramArrayOfString, paramInt);
      return;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to Activity"));
  }
  
  @NonNull
  public final FragmentActivity requireActivity()
  {
    FragmentActivity localFragmentActivity = getActivity();
    if (localFragmentActivity != null) {
      return localFragmentActivity;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to an activity."));
  }
  
  @NonNull
  public final Bundle requireArguments()
  {
    Bundle localBundle = getArguments();
    if (localBundle != null) {
      return localBundle;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " does not have any arguments."));
  }
  
  @NonNull
  public final Context requireContext()
  {
    Context localContext = getContext();
    if (localContext != null) {
      return localContext;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to a context."));
  }
  
  @Deprecated
  @NonNull
  public final FragmentManager requireFragmentManager()
  {
    return getParentFragmentManager();
  }
  
  @NonNull
  public final Object requireHost()
  {
    Object localObject = getHost();
    if (localObject != null) {
      return localObject;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to a host."));
  }
  
  @NonNull
  public final Fragment requireParentFragment()
  {
    Object localObject = getParentFragment();
    if (localObject == null)
    {
      if (getContext() == null) {
        throw new IllegalStateException(a.j("Fragment ", this, " is not attached to any Fragment or host"));
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(this);
      ((StringBuilder)localObject).append(" is not a child Fragment, it is directly attached to ");
      ((StringBuilder)localObject).append(getContext());
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    return (Fragment)localObject;
  }
  
  @NonNull
  public final View requireView()
  {
    View localView = getView();
    if (localView != null) {
      return localView;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
  }
  
  public void restoreChildFragmentState(@Nullable Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getParcelable("android:support:fragments");
      if (paramBundle != null)
      {
        mChildFragmentManager.restoreSaveState(paramBundle);
        mChildFragmentManager.dispatchCreate();
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
    if (mView != null)
    {
      mViewLifecycleOwner.performRestore(mSavedViewRegistryState);
      mSavedViewRegistryState = null;
    }
    mCalled = false;
    onViewStateRestored(paramBundle);
    if (mCalled)
    {
      if (mView != null) {
        mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
      }
      return;
    }
    throw new SuperNotCalledException(a.j("Fragment ", this, " did not call through to super.onViewStateRestored()"));
  }
  
  public void setAllowEnterTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfomAllowEnterTransitionOverlap = Boolean.valueOf(paramBoolean);
  }
  
  public void setAllowReturnTransitionOverlap(boolean paramBoolean)
  {
    ensureAnimationInfomAllowReturnTransitionOverlap = Boolean.valueOf(paramBoolean);
  }
  
  public void setAnimatingAway(View paramView)
  {
    ensureAnimationInfomAnimatingAway = paramView;
  }
  
  public void setAnimations(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((mAnimationInfo == null) && (paramInt1 == 0) && (paramInt2 == 0) && (paramInt3 == 0) && (paramInt4 == 0)) {
      return;
    }
    ensureAnimationInfomEnterAnim = paramInt1;
    ensureAnimationInfomExitAnim = paramInt2;
    ensureAnimationInfomPopEnterAnim = paramInt3;
    ensureAnimationInfomPopExitAnim = paramInt4;
  }
  
  public void setAnimator(Animator paramAnimator)
  {
    ensureAnimationInfomAnimator = paramAnimator;
  }
  
  public void setArguments(@Nullable Bundle paramBundle)
  {
    if ((mFragmentManager != null) && (isStateSaved())) {
      throw new IllegalStateException("Fragment already added and state has been saved");
    }
    mArguments = paramBundle;
  }
  
  public void setEnterSharedElementCallback(@Nullable SharedElementCallback paramSharedElementCallback)
  {
    ensureAnimationInfomEnterTransitionCallback = paramSharedElementCallback;
  }
  
  public void setEnterTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomEnterTransition = paramObject;
  }
  
  public void setExitSharedElementCallback(@Nullable SharedElementCallback paramSharedElementCallback)
  {
    ensureAnimationInfomExitTransitionCallback = paramSharedElementCallback;
  }
  
  public void setExitTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomExitTransition = paramObject;
  }
  
  public void setFocusedView(View paramView)
  {
    ensureAnimationInfomFocusedView = paramView;
  }
  
  public void setHasOptionsMenu(boolean paramBoolean)
  {
    if (mHasMenu != paramBoolean)
    {
      mHasMenu = paramBoolean;
      if ((isAdded()) && (!isHidden())) {
        mHost.onSupportInvalidateOptionsMenu();
      }
    }
  }
  
  public void setHideReplaced(boolean paramBoolean)
  {
    ensureAnimationInfomIsHideReplaced = paramBoolean;
  }
  
  public void setInitialSavedState(@Nullable SavedState paramSavedState)
  {
    if (mFragmentManager == null)
    {
      if (paramSavedState != null)
      {
        paramSavedState = mState;
        if (paramSavedState != null) {}
      }
      else
      {
        paramSavedState = null;
      }
      mSavedFragmentState = paramSavedState;
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
        mHost.onSupportInvalidateOptionsMenu();
      }
    }
  }
  
  public void setNextTransition(int paramInt)
  {
    if ((mAnimationInfo == null) && (paramInt == 0)) {
      return;
    }
    ensureAnimationInfo();
    mAnimationInfo.mNextTransition = paramInt;
  }
  
  public void setOnStartEnterTransitionListener(OnStartEnterTransitionListener paramOnStartEnterTransitionListener)
  {
    ensureAnimationInfo();
    AnimationInfo localAnimationInfo = mAnimationInfo;
    OnStartEnterTransitionListener localOnStartEnterTransitionListener = mStartEnterTransitionListener;
    if (paramOnStartEnterTransitionListener == localOnStartEnterTransitionListener) {
      return;
    }
    if ((paramOnStartEnterTransitionListener != null) && (localOnStartEnterTransitionListener != null))
    {
      paramOnStartEnterTransitionListener = new StringBuilder();
      paramOnStartEnterTransitionListener.append("Trying to set a replacement startPostponedEnterTransition on ");
      paramOnStartEnterTransitionListener.append(this);
      throw new IllegalStateException(paramOnStartEnterTransitionListener.toString());
    }
    if (mEnterTransitionPostponed) {
      mStartEnterTransitionListener = paramOnStartEnterTransitionListener;
    }
    if (paramOnStartEnterTransitionListener != null) {
      paramOnStartEnterTransitionListener.startListening();
    }
  }
  
  public void setPopDirection(boolean paramBoolean)
  {
    if (mAnimationInfo == null) {
      return;
    }
    ensureAnimationInfomIsPop = paramBoolean;
  }
  
  public void setPostOnViewCreatedAlpha(float paramFloat)
  {
    ensureAnimationInfomPostOnViewCreatedAlpha = paramFloat;
  }
  
  public void setReenterTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomReenterTransition = paramObject;
  }
  
  @Deprecated
  public void setRetainInstance(boolean paramBoolean)
  {
    mRetainInstance = paramBoolean;
    FragmentManager localFragmentManager = mFragmentManager;
    if (localFragmentManager != null)
    {
      if (paramBoolean) {
        localFragmentManager.addRetainedFragment(this);
      } else {
        localFragmentManager.removeRetainedFragment(this);
      }
    }
    else {
      mRetainInstanceChangedWhileDetached = true;
    }
  }
  
  public void setReturnTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomReturnTransition = paramObject;
  }
  
  public void setSharedElementEnterTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomSharedElementEnterTransition = paramObject;
  }
  
  public void setSharedElementNames(@Nullable ArrayList<String> paramArrayList1, @Nullable ArrayList<String> paramArrayList2)
  {
    ensureAnimationInfo();
    AnimationInfo localAnimationInfo = mAnimationInfo;
    mSharedElementSourceNames = paramArrayList1;
    mSharedElementTargetNames = paramArrayList2;
  }
  
  public void setSharedElementReturnTransition(@Nullable Object paramObject)
  {
    ensureAnimationInfomSharedElementReturnTransition = paramObject;
  }
  
  @Deprecated
  public void setTargetFragment(@Nullable Fragment paramFragment, int paramInt)
  {
    FragmentManager localFragmentManager = mFragmentManager;
    if (paramFragment != null) {
      localObject = mFragmentManager;
    } else {
      localObject = null;
    }
    if ((localFragmentManager != null) && (localObject != null) && (localFragmentManager != localObject)) {
      throw new IllegalArgumentException(a.j("Fragment ", paramFragment, " must share the same FragmentManager to be set as a target fragment"));
    }
    Object localObject = paramFragment;
    while (localObject != null) {
      if (!((Fragment)localObject).equals(this))
      {
        localObject = ((Fragment)localObject).getTargetFragment();
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Setting ");
        ((StringBuilder)localObject).append(paramFragment);
        ((StringBuilder)localObject).append(" as the target of ");
        ((StringBuilder)localObject).append(this);
        ((StringBuilder)localObject).append(" would create a target cycle");
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
    }
    if (paramFragment == null)
    {
      mTargetWho = null;
      mTarget = null;
    }
    else if ((mFragmentManager != null) && (mFragmentManager != null))
    {
      mTargetWho = mWho;
      mTarget = null;
    }
    else
    {
      mTargetWho = null;
      mTarget = paramFragment;
    }
    mTargetRequestCode = paramInt;
  }
  
  @Deprecated
  public void setUserVisibleHint(boolean paramBoolean)
  {
    if ((!mUserVisibleHint) && (paramBoolean) && (mState < 5) && (mFragmentManager != null) && (isAdded()) && (mIsCreated))
    {
      FragmentManager localFragmentManager = mFragmentManager;
      localFragmentManager.performPendingDeferredStart(localFragmentManager.createOrGetFragmentStateManager(this));
    }
    mUserVisibleHint = paramBoolean;
    boolean bool;
    if ((mState < 5) && (!paramBoolean)) {
      bool = true;
    } else {
      bool = false;
    }
    mDeferStart = bool;
    if (mSavedFragmentState != null) {
      mSavedUserVisibleHint = Boolean.valueOf(paramBoolean);
    }
  }
  
  public boolean shouldShowRequestPermissionRationale(@NonNull String paramString)
  {
    FragmentHostCallback localFragmentHostCallback = mHost;
    if (localFragmentHostCallback != null) {
      return localFragmentHostCallback.onShouldShowRequestPermissionRationale(paramString);
    }
    return false;
  }
  
  public void startActivity(@SuppressLint({"UnknownNullness"}) Intent paramIntent)
  {
    startActivity(paramIntent, null);
  }
  
  public void startActivity(@SuppressLint({"UnknownNullness"}) Intent paramIntent, @Nullable Bundle paramBundle)
  {
    FragmentHostCallback localFragmentHostCallback = mHost;
    if (localFragmentHostCallback != null)
    {
      localFragmentHostCallback.onStartActivityFromFragment(this, paramIntent, -1, paramBundle);
      return;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to Activity"));
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt)
  {
    startActivityForResult(paramIntent, paramInt, null);
  }
  
  @Deprecated
  public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    if (mHost != null)
    {
      getParentFragmentManager().launchStartActivityForResult(this, paramIntent, paramInt, paramBundle);
      return;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to Activity"));
  }
  
  @Deprecated
  public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    if (mHost != null)
    {
      if (FragmentManager.isLoggingEnabled(2))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Fragment ");
        localStringBuilder.append(this);
        localStringBuilder.append(" received the following in startIntentSenderForResult() requestCode: ");
        localStringBuilder.append(paramInt1);
        localStringBuilder.append(" IntentSender: ");
        localStringBuilder.append(paramIntentSender);
        localStringBuilder.append(" fillInIntent: ");
        localStringBuilder.append(paramIntent);
        localStringBuilder.append(" options: ");
        localStringBuilder.append(paramBundle);
        Log.v("FragmentManager", localStringBuilder.toString());
      }
      getParentFragmentManager().launchStartIntentSenderForResult(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    throw new IllegalStateException(a.j("Fragment ", this, " not attached to Activity"));
  }
  
  public void startPostponedEnterTransition()
  {
    if ((mAnimationInfo != null) && (ensureAnimationInfomEnterTransitionPostponed)) {
      if (mHost == null) {
        ensureAnimationInfomEnterTransitionPostponed = false;
      } else if (Looper.myLooper() != mHost.getHandler().getLooper()) {
        mHost.getHandler().postAtFrontOfQueue(new Runnable()
        {
          public void run()
          {
            callStartTransitionListener(false);
          }
        });
      } else {
        callStartTransitionListener(true);
      }
    }
  }
  
  @NonNull
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
  
  public void unregisterForContextMenu(@NonNull View paramView)
  {
    paramView.setOnCreateContextMenuListener(null);
  }
  
  public static class AnimationInfo
  {
    public Boolean mAllowEnterTransitionOverlap;
    public Boolean mAllowReturnTransitionOverlap;
    public View mAnimatingAway;
    public Animator mAnimator;
    public int mEnterAnim;
    public Object mEnterTransition = null;
    public SharedElementCallback mEnterTransitionCallback;
    public boolean mEnterTransitionPostponed;
    public int mExitAnim;
    public Object mExitTransition;
    public SharedElementCallback mExitTransitionCallback;
    public View mFocusedView;
    public boolean mIsHideReplaced;
    public boolean mIsPop;
    public int mNextTransition;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public float mPostOnViewCreatedAlpha;
    public Object mReenterTransition;
    public Object mReturnTransition;
    public Object mSharedElementEnterTransition;
    public Object mSharedElementReturnTransition;
    public ArrayList<String> mSharedElementSourceNames;
    public ArrayList<String> mSharedElementTargetNames;
    public Fragment.OnStartEnterTransitionListener mStartEnterTransitionListener;
    
    public AnimationInfo()
    {
      Object localObject = Fragment.USE_DEFAULT_TRANSITION;
      mReturnTransition = localObject;
      mExitTransition = null;
      mReenterTransition = localObject;
      mSharedElementEnterTransition = null;
      mSharedElementReturnTransition = localObject;
      mEnterTransitionCallback = null;
      mExitTransitionCallback = null;
      mPostOnViewCreatedAlpha = 1.0F;
      mFocusedView = null;
    }
  }
  
  public static class InstantiationException
    extends RuntimeException
  {
    public InstantiationException(@NonNull String paramString, @Nullable Exception paramException)
    {
      super(paramException);
    }
  }
  
  public static abstract class OnPreAttachedListener
  {
    public abstract void onPreAttached();
  }
  
  public static abstract interface OnStartEnterTransitionListener
  {
    public abstract void onStartEnterTransition();
    
    public abstract void startListening();
  }
  
  @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
  public static class SavedState
    implements Parcelable
  {
    @NonNull
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator()
    {
      public Fragment.SavedState createFromParcel(Parcel paramAnonymousParcel)
      {
        return new Fragment.SavedState(paramAnonymousParcel, null);
      }
      
      public Fragment.SavedState createFromParcel(Parcel paramAnonymousParcel, ClassLoader paramAnonymousClassLoader)
      {
        return new Fragment.SavedState(paramAnonymousParcel, paramAnonymousClassLoader);
      }
      
      public Fragment.SavedState[] newArray(int paramAnonymousInt)
      {
        return new Fragment.SavedState[paramAnonymousInt];
      }
    };
    public final Bundle mState;
    
    public SavedState(Bundle paramBundle)
    {
      mState = paramBundle;
    }
    
    public SavedState(@NonNull Parcel paramParcel, @Nullable ClassLoader paramClassLoader)
    {
      paramParcel = paramParcel.readBundle();
      mState = paramParcel;
      if ((paramClassLoader != null) && (paramParcel != null)) {
        paramParcel.setClassLoader(paramClassLoader);
      }
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(@NonNull Parcel paramParcel, int paramInt)
    {
      paramParcel.writeBundle(mState);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.Fragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */