package androidx.fragment.app;

import a;
import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.R.id;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStoreOwner;
import java.util.Iterator;
import java.util.List;
import z2;

class FragmentStateManager
{
  private static final String TAG = "FragmentManager";
  private static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
  private static final String TARGET_STATE_TAG = "android:target_state";
  private static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
  private static final String VIEW_REGISTRY_STATE_TAG = "android:view_registry_state";
  private static final String VIEW_STATE_TAG = "android:view_state";
  private final FragmentLifecycleCallbacksDispatcher mDispatcher;
  @NonNull
  private final Fragment mFragment;
  private int mFragmentManagerState = -1;
  private final FragmentStore mFragmentStore;
  private boolean mMovingToState = false;
  
  public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore paramFragmentStore, @NonNull Fragment paramFragment)
  {
    mDispatcher = paramFragmentLifecycleCallbacksDispatcher;
    mFragmentStore = paramFragmentStore;
    mFragment = paramFragment;
  }
  
  public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore paramFragmentStore, @NonNull Fragment paramFragment, @NonNull FragmentState paramFragmentState)
  {
    mDispatcher = paramFragmentLifecycleCallbacksDispatcher;
    mFragmentStore = paramFragmentStore;
    mFragment = paramFragment;
    mSavedViewState = null;
    mSavedViewRegistryState = null;
    mBackStackNesting = 0;
    mInLayout = false;
    mAdded = false;
    paramFragmentLifecycleCallbacksDispatcher = mTarget;
    if (paramFragmentLifecycleCallbacksDispatcher != null) {
      paramFragmentLifecycleCallbacksDispatcher = mWho;
    } else {
      paramFragmentLifecycleCallbacksDispatcher = null;
    }
    mTargetWho = paramFragmentLifecycleCallbacksDispatcher;
    mTarget = null;
    paramFragmentLifecycleCallbacksDispatcher = mSavedFragmentState;
    if (paramFragmentLifecycleCallbacksDispatcher != null) {
      mSavedFragmentState = paramFragmentLifecycleCallbacksDispatcher;
    } else {
      mSavedFragmentState = new Bundle();
    }
  }
  
  public FragmentStateManager(@NonNull FragmentLifecycleCallbacksDispatcher paramFragmentLifecycleCallbacksDispatcher, @NonNull FragmentStore paramFragmentStore, @NonNull ClassLoader paramClassLoader, @NonNull FragmentFactory paramFragmentFactory, @NonNull FragmentState paramFragmentState)
  {
    mDispatcher = paramFragmentLifecycleCallbacksDispatcher;
    mFragmentStore = paramFragmentStore;
    paramFragmentLifecycleCallbacksDispatcher = paramFragmentFactory.instantiate(paramClassLoader, mClassName);
    mFragment = paramFragmentLifecycleCallbacksDispatcher;
    paramFragmentStore = mArguments;
    if (paramFragmentStore != null) {
      paramFragmentStore.setClassLoader(paramClassLoader);
    }
    paramFragmentLifecycleCallbacksDispatcher.setArguments(mArguments);
    mWho = mWho;
    mFromLayout = mFromLayout;
    mRestored = true;
    mFragmentId = mFragmentId;
    mContainerId = mContainerId;
    mTag = mTag;
    mRetainInstance = mRetainInstance;
    mRemoving = mRemoving;
    mDetached = mDetached;
    mHidden = mHidden;
    mMaxState = androidx.lifecycle.Lifecycle.State.values()[mMaxLifecycleState];
    paramFragmentStore = mSavedFragmentState;
    if (paramFragmentStore != null) {
      mSavedFragmentState = paramFragmentStore;
    } else {
      mSavedFragmentState = new Bundle();
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      paramFragmentStore = new StringBuilder();
      paramFragmentStore.append("Instantiated fragment ");
      paramFragmentStore.append(paramFragmentLifecycleCallbacksDispatcher);
      Log.v("FragmentManager", paramFragmentStore.toString());
    }
  }
  
  private boolean isFragmentViewChild(@NonNull View paramView)
  {
    if (paramView == mFragment.mView) {
      return true;
    }
    for (paramView = paramView.getParent(); paramView != null; paramView = paramView.getParent()) {
      if (paramView == mFragment.mView) {
        return true;
      }
    }
    return false;
  }
  
  private Bundle saveBasicState()
  {
    Object localObject1 = new Bundle();
    mFragment.performSaveInstanceState((Bundle)localObject1);
    mDispatcher.dispatchOnFragmentSaveInstanceState(mFragment, (Bundle)localObject1, false);
    Object localObject2 = localObject1;
    if (((BaseBundle)localObject1).isEmpty()) {
      localObject2 = null;
    }
    if (mFragment.mView != null) {
      saveViewState();
    }
    localObject1 = localObject2;
    if (mFragment.mSavedViewState != null)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((Bundle)localObject1).putSparseParcelableArray("android:view_state", mFragment.mSavedViewState);
    }
    localObject2 = localObject1;
    if (mFragment.mSavedViewRegistryState != null)
    {
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = new Bundle();
      }
      ((Bundle)localObject2).putBundle("android:view_registry_state", mFragment.mSavedViewRegistryState);
    }
    localObject1 = localObject2;
    if (!mFragment.mUserVisibleHint)
    {
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new Bundle();
      }
      ((BaseBundle)localObject1).putBoolean("android:user_visible_hint", mFragment.mUserVisibleHint);
    }
    return (Bundle)localObject1;
  }
  
  public void activityCreated()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject = z2.t("moveto ACTIVITY_CREATED: ");
      ((StringBuilder)localObject).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = mFragment;
    ((Fragment)localObject).performActivityCreated(mSavedFragmentState);
    localObject = mDispatcher;
    Fragment localFragment = mFragment;
    ((FragmentLifecycleCallbacksDispatcher)localObject).dispatchOnFragmentActivityCreated(localFragment, mSavedFragmentState, false);
  }
  
  public void addViewToContainer()
  {
    int i = mFragmentStore.findFragmentIndexInContainer(mFragment);
    Fragment localFragment = mFragment;
    mContainer.addView(mView, i);
  }
  
  public void attach()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject1 = z2.t("moveto ATTACHED: ");
      ((StringBuilder)localObject1).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject2 = mFragment;
    Fragment localFragment = mTarget;
    Object localObject1 = null;
    if (localFragment != null)
    {
      localObject1 = mFragmentStore.getFragmentStateManager(mWho);
      if (localObject1 != null)
      {
        localObject2 = mFragment;
        mTargetWho = mTarget.mWho;
        mTarget = null;
      }
      else
      {
        localObject1 = z2.t("Fragment ");
        ((StringBuilder)localObject1).append(mFragment);
        ((StringBuilder)localObject1).append(" declared target fragment ");
        ((StringBuilder)localObject1).append(mFragment.mTarget);
        ((StringBuilder)localObject1).append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
    }
    else
    {
      localObject2 = mTargetWho;
      if (localObject2 != null)
      {
        localObject1 = mFragmentStore.getFragmentStateManager((String)localObject2);
        if (localObject1 == null)
        {
          localObject1 = z2.t("Fragment ");
          ((StringBuilder)localObject1).append(mFragment);
          ((StringBuilder)localObject1).append(" declared target fragment ");
          throw new IllegalStateException(z2.s((StringBuilder)localObject1, mFragment.mTargetWho, " that does not belong to this FragmentManager!"));
        }
      }
    }
    if ((localObject1 != null) && ((FragmentManager.USE_STATE_MANAGER) || (getFragmentmState < 1))) {
      ((FragmentStateManager)localObject1).moveToExpectedState();
    }
    localObject1 = mFragment;
    mHost = mFragmentManager.getHost();
    localObject1 = mFragment;
    mParentFragment = mFragmentManager.getParent();
    mDispatcher.dispatchOnFragmentPreAttached(mFragment, false);
    mFragment.performAttach();
    mDispatcher.dispatchOnFragmentAttached(mFragment, false);
  }
  
  public int computeExpectedState()
  {
    Object localObject1 = mFragment;
    if (mFragmentManager == null) {
      return mState;
    }
    int i = mFragmentManagerState;
    int j = 2.$SwitchMap$androidx$lifecycle$Lifecycle$State[mMaxState.ordinal()];
    int k = i;
    if (j != 1) {
      if (j != 2)
      {
        if (j != 3)
        {
          if (j != 4) {
            k = Math.min(i, -1);
          } else {
            k = Math.min(i, 0);
          }
        }
        else {
          k = Math.min(i, 1);
        }
      }
      else {
        k = Math.min(i, 5);
      }
    }
    localObject1 = mFragment;
    i = k;
    if (mFromLayout) {
      if (mInLayout)
      {
        k = Math.max(mFragmentManagerState, 2);
        localObject1 = mFragment.mView;
        i = k;
        if (localObject1 != null)
        {
          i = k;
          if (((View)localObject1).getParent() == null) {
            i = Math.min(k, 2);
          }
        }
      }
      else if (mFragmentManagerState < 4)
      {
        i = Math.min(k, mState);
      }
      else
      {
        i = Math.min(k, 1);
      }
    }
    j = i;
    if (!mFragment.mAdded) {
      j = Math.min(i, 1);
    }
    Object localObject2 = null;
    localObject1 = localObject2;
    if (FragmentManager.USE_STATE_MANAGER)
    {
      Fragment localFragment = mFragment;
      ViewGroup localViewGroup = mContainer;
      localObject1 = localObject2;
      if (localViewGroup != null) {
        localObject1 = SpecialEffectsController.getOrCreateController(localViewGroup, localFragment.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
      }
    }
    if (localObject1 == SpecialEffectsController.Operation.LifecycleImpact.ADDING)
    {
      k = Math.min(j, 6);
    }
    else if (localObject1 == SpecialEffectsController.Operation.LifecycleImpact.REMOVING)
    {
      k = Math.max(j, 3);
    }
    else
    {
      localObject1 = mFragment;
      k = j;
      if (mRemoving) {
        if (((Fragment)localObject1).isInBackStack()) {
          k = Math.min(j, 1);
        } else {
          k = Math.min(j, -1);
        }
      }
    }
    localObject1 = mFragment;
    i = k;
    if (mDeferStart)
    {
      i = k;
      if (mState < 5) {
        i = Math.min(k, 4);
      }
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      localObject1 = a.r("computeExpectedState() of ", i, " for ");
      ((StringBuilder)localObject1).append(mFragment);
      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    return i;
  }
  
  public void create()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject = z2.t("moveto CREATED: ");
      ((StringBuilder)localObject).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = mFragment;
    if (!mIsCreated)
    {
      mDispatcher.dispatchOnFragmentPreCreated((Fragment)localObject, mSavedFragmentState, false);
      localObject = mFragment;
      ((Fragment)localObject).performCreate(mSavedFragmentState);
      FragmentLifecycleCallbacksDispatcher localFragmentLifecycleCallbacksDispatcher = mDispatcher;
      localObject = mFragment;
      localFragmentLifecycleCallbacksDispatcher.dispatchOnFragmentCreated((Fragment)localObject, mSavedFragmentState, false);
    }
    else
    {
      ((Fragment)localObject).restoreChildFragmentState(mSavedFragmentState);
      mFragment.mState = 1;
    }
  }
  
  public void createView()
  {
    if (mFragment.mFromLayout) {
      return;
    }
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject1 = z2.t("moveto CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = mFragment;
    LayoutInflater localLayoutInflater = ((Fragment)localObject1).performGetLayoutInflater(mSavedFragmentState);
    localObject1 = null;
    Fragment localFragment = mFragment;
    Object localObject3 = mContainer;
    int i;
    final Object localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject3;
    }
    else
    {
      i = mContainerId;
      if (i != 0) {
        if (i != -1)
        {
          localObject3 = (ViewGroup)mFragmentManager.getContainer().onFindViewById(mFragment.mContainerId);
          localObject1 = localObject3;
          if (localObject3 == null)
          {
            localObject1 = mFragment;
            if (mRestored)
            {
              localObject1 = localObject3;
            }
            else
            {
              try
              {
                localObject1 = ((Fragment)localObject1).getResources().getResourceName(mFragment.mContainerId);
              }
              catch (Resources.NotFoundException localNotFoundException)
              {
                localObject2 = "unknown";
              }
              localObject3 = z2.t("No view found for id 0x");
              ((StringBuilder)localObject3).append(Integer.toHexString(mFragment.mContainerId));
              ((StringBuilder)localObject3).append(" (");
              ((StringBuilder)localObject3).append((String)localObject2);
              ((StringBuilder)localObject3).append(") for fragment ");
              ((StringBuilder)localObject3).append(mFragment);
              throw new IllegalArgumentException(((StringBuilder)localObject3).toString());
            }
          }
        }
        else
        {
          localObject2 = z2.t("Cannot create fragment ");
          ((StringBuilder)localObject2).append(mFragment);
          ((StringBuilder)localObject2).append(" for a container view with no id");
          throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
        }
      }
    }
    localObject3 = mFragment;
    mContainer = ((ViewGroup)localObject2);
    ((Fragment)localObject3).performCreateView(localLayoutInflater, (ViewGroup)localObject2, mSavedFragmentState);
    localObject3 = mFragment.mView;
    if (localObject3 != null)
    {
      boolean bool1 = false;
      ((View)localObject3).setSaveFromParentEnabled(false);
      localObject3 = mFragment;
      mView.setTag(R.id.fragment_container_view_tag, localObject3);
      if (localObject2 != null) {
        addViewToContainer();
      }
      localObject2 = mFragment;
      if (mHidden) {
        mView.setVisibility(8);
      }
      if (ViewCompat.isAttachedToWindow(mFragment.mView))
      {
        ViewCompat.requestApplyInsets(mFragment.mView);
      }
      else
      {
        localObject2 = mFragment.mView;
        ((View)localObject2).addOnAttachStateChangeListener(new View.OnAttachStateChangeListener()
        {
          public void onViewAttachedToWindow(View paramAnonymousView)
          {
            localObject2.removeOnAttachStateChangeListener(this);
            ViewCompat.requestApplyInsets(localObject2);
          }
          
          public void onViewDetachedFromWindow(View paramAnonymousView) {}
        });
      }
      mFragment.performViewCreated();
      localObject3 = mDispatcher;
      localObject2 = mFragment;
      ((FragmentLifecycleCallbacksDispatcher)localObject3).dispatchOnFragmentViewCreated((Fragment)localObject2, mView, mSavedFragmentState, false);
      i = mFragment.mView.getVisibility();
      float f = mFragment.mView.getAlpha();
      if (FragmentManager.USE_STATE_MANAGER)
      {
        mFragment.setPostOnViewCreatedAlpha(f);
        localObject2 = mFragment;
        if ((mContainer != null) && (i == 0))
        {
          localObject3 = mView.findFocus();
          if (localObject3 != null)
          {
            mFragment.setFocusedView((View)localObject3);
            if (FragmentManager.isLoggingEnabled(2))
            {
              localObject2 = new StringBuilder();
              ((StringBuilder)localObject2).append("requestFocus: Saved focused view ");
              ((StringBuilder)localObject2).append(localObject3);
              ((StringBuilder)localObject2).append(" for Fragment ");
              ((StringBuilder)localObject2).append(mFragment);
              Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
            }
          }
          mFragment.mView.setAlpha(0.0F);
        }
      }
      else
      {
        localObject2 = mFragment;
        boolean bool2 = bool1;
        if (i == 0)
        {
          bool2 = bool1;
          if (mContainer != null) {
            bool2 = true;
          }
        }
        mIsNewlyAdded = bool2;
      }
    }
    mFragment.mState = 2;
  }
  
  public void destroy()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject1 = z2.t("movefrom CREATED: ");
      ((StringBuilder)localObject1).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject1 = mFragment;
    boolean bool1 = mRemoving;
    boolean bool2 = true;
    int i;
    if ((bool1) && (!((Fragment)localObject1).isInBackStack())) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((i == 0) && (!mFragmentStore.getNonConfig().shouldDestroy(mFragment))) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0)
    {
      localObject1 = mFragment.mHost;
      if ((localObject1 instanceof ViewModelStoreOwner)) {
        bool2 = mFragmentStore.getNonConfig().isCleared();
      } else if ((((FragmentHostCallback)localObject1).getContext() instanceof Activity)) {
        bool2 = true ^ ((Activity)((FragmentHostCallback)localObject1).getContext()).isChangingConfigurations();
      }
      if ((i != 0) || (bool2)) {
        mFragmentStore.getNonConfig().clearNonConfigState(mFragment);
      }
      mFragment.performDestroy();
      mDispatcher.dispatchOnFragmentDestroyed(mFragment, false);
      localObject1 = mFragmentStore.getActiveFragmentStateManagers().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (FragmentStateManager)((Iterator)localObject1).next();
        if (localObject2 != null)
        {
          localObject2 = ((FragmentStateManager)localObject2).getFragment();
          if (mFragment.mWho.equals(mTargetWho))
          {
            mTarget = mFragment;
            mTargetWho = null;
          }
        }
      }
      Object localObject2 = mFragment;
      localObject1 = mTargetWho;
      if (localObject1 != null) {
        mTarget = mFragmentStore.findActiveFragment((String)localObject1);
      }
      mFragmentStore.makeInactive(this);
    }
    else
    {
      localObject1 = mFragment.mTargetWho;
      if (localObject1 != null)
      {
        localObject1 = mFragmentStore.findActiveFragment((String)localObject1);
        if ((localObject1 != null) && (mRetainInstance)) {
          mFragment.mTarget = ((Fragment)localObject1);
        }
      }
      mFragment.mState = 0;
    }
  }
  
  public void destroyFragmentView()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject1 = z2.t("movefrom CREATE_VIEW: ");
      ((StringBuilder)localObject1).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
    }
    Object localObject2 = mFragment;
    Object localObject1 = mContainer;
    if (localObject1 != null)
    {
      localObject2 = mView;
      if (localObject2 != null) {
        ((ViewGroup)localObject1).removeView((View)localObject2);
      }
    }
    mFragment.performDestroyView();
    mDispatcher.dispatchOnFragmentViewDestroyed(mFragment, false);
    localObject1 = mFragment;
    mContainer = null;
    mView = null;
    mViewLifecycleOwner = null;
    mViewLifecycleOwnerLiveData.setValue(null);
    mFragment.mInLayout = false;
  }
  
  public void detach()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject = z2.t("movefrom ATTACHED: ");
      ((StringBuilder)localObject).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    mFragment.performDetach();
    FragmentLifecycleCallbacksDispatcher localFragmentLifecycleCallbacksDispatcher = mDispatcher;
    Object localObject = mFragment;
    int i = 0;
    localFragmentLifecycleCallbacksDispatcher.dispatchOnFragmentDetached((Fragment)localObject, false);
    localObject = mFragment;
    mState = -1;
    mHost = null;
    mParentFragment = null;
    mFragmentManager = null;
    int j = i;
    if (mRemoving)
    {
      j = i;
      if (!((Fragment)localObject).isInBackStack()) {
        j = 1;
      }
    }
    if ((j != 0) || (mFragmentStore.getNonConfig().shouldDestroy(mFragment)))
    {
      if (FragmentManager.isLoggingEnabled(3))
      {
        localObject = z2.t("initState called for fragment: ");
        ((StringBuilder)localObject).append(mFragment);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      mFragment.initState();
    }
  }
  
  public void ensureInflatedView()
  {
    Object localObject = mFragment;
    if ((mFromLayout) && (mInLayout) && (!mPerformedCreateView))
    {
      if (FragmentManager.isLoggingEnabled(3))
      {
        localObject = z2.t("moveto CREATE_VIEW: ");
        ((StringBuilder)localObject).append(mFragment);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      localObject = mFragment;
      ((Fragment)localObject).performCreateView(((Fragment)localObject).performGetLayoutInflater(mSavedFragmentState), null, mFragment.mSavedFragmentState);
      localObject = mFragment.mView;
      if (localObject != null)
      {
        ((View)localObject).setSaveFromParentEnabled(false);
        localObject = mFragment;
        mView.setTag(R.id.fragment_container_view_tag, localObject);
        localObject = mFragment;
        if (mHidden) {
          mView.setVisibility(8);
        }
        mFragment.performViewCreated();
        localObject = mDispatcher;
        Fragment localFragment = mFragment;
        ((FragmentLifecycleCallbacksDispatcher)localObject).dispatchOnFragmentViewCreated(localFragment, mView, mSavedFragmentState, false);
        mFragment.mState = 2;
      }
    }
  }
  
  @NonNull
  public Fragment getFragment()
  {
    return mFragment;
  }
  
  public void moveToExpectedState()
  {
    Object localObject1;
    if (mMovingToState)
    {
      if (FragmentManager.isLoggingEnabled(2))
      {
        localObject1 = z2.t("Ignoring re-entrant call to moveToExpectedState() for ");
        ((StringBuilder)localObject1).append(getFragment());
        Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
      }
      return;
    }
    try
    {
      mMovingToState = true;
      Object localObject3;
      for (;;)
      {
        int i = computeExpectedState();
        localObject1 = mFragment;
        int j = mState;
        if (i == j) {
          break;
        }
        if (i > j) {
          switch (j + 1)
          {
          default: 
            break;
          case 7: 
            resume();
            break;
          case 6: 
            mState = 6;
            break;
          case 5: 
            start();
            break;
          case 4: 
            if (mView != null)
            {
              localObject3 = mContainer;
              if (localObject3 != null) {
                SpecialEffectsController.getOrCreateController((ViewGroup)localObject3, ((Fragment)localObject1).getParentFragmentManager()).enqueueAdd(SpecialEffectsController.Operation.State.from(mFragment.mView.getVisibility()), this);
              }
            }
            mFragment.mState = 4;
            break;
          case 3: 
            activityCreated();
            break;
          case 2: 
            ensureInflatedView();
            createView();
            break;
          case 1: 
            create();
            break;
          case 0: 
            attach();
            break;
          }
        } else {
          switch (j - 1)
          {
          default: 
            break;
          case 6: 
            pause();
            break;
          case 5: 
            mState = 5;
            break;
          case 4: 
            stop();
            break;
          case 3: 
            if (FragmentManager.isLoggingEnabled(3))
            {
              localObject1 = new java/lang/StringBuilder;
              ((StringBuilder)localObject1).<init>();
              ((StringBuilder)localObject1).append("movefrom ACTIVITY_CREATED: ");
              ((StringBuilder)localObject1).append(mFragment);
              Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
            }
            localObject1 = mFragment;
            if ((mView != null) && (mSavedViewState == null)) {
              saveViewState();
            }
            localObject1 = mFragment;
            if (mView != null)
            {
              localObject3 = mContainer;
              if (localObject3 != null) {
                SpecialEffectsController.getOrCreateController((ViewGroup)localObject3, ((Fragment)localObject1).getParentFragmentManager()).enqueueRemove(this);
              }
            }
            mFragment.mState = 3;
            break;
          case 2: 
            mInLayout = false;
            mState = 2;
            break;
          case 1: 
            destroyFragmentView();
            mFragment.mState = 1;
            break;
          case 0: 
            destroy();
            break;
          case -1: 
            detach();
          }
        }
      }
      if ((FragmentManager.USE_STATE_MANAGER) && (mHiddenChanged))
      {
        if (mView != null)
        {
          localObject3 = mContainer;
          if (localObject3 != null)
          {
            localObject1 = SpecialEffectsController.getOrCreateController((ViewGroup)localObject3, ((Fragment)localObject1).getParentFragmentManager());
            if (mFragment.mHidden) {
              ((SpecialEffectsController)localObject1).enqueueHide(this);
            } else {
              ((SpecialEffectsController)localObject1).enqueueShow(this);
            }
          }
        }
        localObject1 = mFragment;
        localObject3 = mFragmentManager;
        if (localObject3 != null) {
          ((FragmentManager)localObject3).invalidateMenuForFragment((Fragment)localObject1);
        }
        localObject1 = mFragment;
        mHiddenChanged = false;
        ((Fragment)localObject1).onHiddenChanged(mHidden);
      }
      return;
    }
    finally
    {
      mMovingToState = false;
    }
  }
  
  public void pause()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      StringBuilder localStringBuilder = z2.t("movefrom RESUMED: ");
      localStringBuilder.append(mFragment);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    mFragment.performPause();
    mDispatcher.dispatchOnFragmentPaused(mFragment, false);
  }
  
  public void restoreState(@NonNull ClassLoader paramClassLoader)
  {
    Object localObject = mFragment.mSavedFragmentState;
    if (localObject == null) {
      return;
    }
    ((Bundle)localObject).setClassLoader(paramClassLoader);
    paramClassLoader = mFragment;
    mSavedViewState = mSavedFragmentState.getSparseParcelableArray("android:view_state");
    paramClassLoader = mFragment;
    mSavedViewRegistryState = mSavedFragmentState.getBundle("android:view_registry_state");
    paramClassLoader = mFragment;
    mTargetWho = mSavedFragmentState.getString("android:target_state");
    paramClassLoader = mFragment;
    if (mTargetWho != null) {
      mTargetRequestCode = mSavedFragmentState.getInt("android:target_req_state", 0);
    }
    localObject = mFragment;
    paramClassLoader = mSavedUserVisibleHint;
    if (paramClassLoader != null)
    {
      mUserVisibleHint = paramClassLoader.booleanValue();
      mFragment.mSavedUserVisibleHint = null;
    }
    else
    {
      mUserVisibleHint = mSavedFragmentState.getBoolean("android:user_visible_hint", true);
    }
    paramClassLoader = mFragment;
    if (!mUserVisibleHint) {
      mDeferStart = true;
    }
  }
  
  public void resume()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      localObject = z2.t("moveto RESUMED: ");
      ((StringBuilder)localObject).append(mFragment);
      Log.d("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = mFragment.getFocusedView();
    if ((localObject != null) && (isFragmentViewChild((View)localObject)))
    {
      boolean bool = ((View)localObject).requestFocus();
      if (FragmentManager.isLoggingEnabled(2))
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("requestFocus: Restoring focused view ");
        localStringBuilder.append(localObject);
        localStringBuilder.append(" ");
        if (bool) {
          localObject = "succeeded";
        } else {
          localObject = "failed";
        }
        localStringBuilder.append((String)localObject);
        localStringBuilder.append(" on Fragment ");
        localStringBuilder.append(mFragment);
        localStringBuilder.append(" resulting in focused view ");
        localStringBuilder.append(mFragment.mView.findFocus());
        Log.v("FragmentManager", localStringBuilder.toString());
      }
    }
    mFragment.setFocusedView(null);
    mFragment.performResume();
    mDispatcher.dispatchOnFragmentResumed(mFragment, false);
    localObject = mFragment;
    mSavedFragmentState = null;
    mSavedViewState = null;
    mSavedViewRegistryState = null;
  }
  
  @Nullable
  public Fragment.SavedState saveInstanceState()
  {
    int i = mFragment.mState;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (i > -1)
    {
      Bundle localBundle = saveBasicState();
      localObject2 = localObject1;
      if (localBundle != null) {
        localObject2 = new Fragment.SavedState(localBundle);
      }
    }
    return (Fragment.SavedState)localObject2;
  }
  
  @NonNull
  public FragmentState saveState()
  {
    FragmentState localFragmentState = new FragmentState(mFragment);
    Object localObject = mFragment;
    if ((mState > -1) && (mSavedFragmentState == null))
    {
      localObject = saveBasicState();
      mSavedFragmentState = ((Bundle)localObject);
      if (mFragment.mTargetWho != null)
      {
        if (localObject == null) {
          mSavedFragmentState = new Bundle();
        }
        mSavedFragmentState.putString("android:target_state", mFragment.mTargetWho);
        int i = mFragment.mTargetRequestCode;
        if (i != 0) {
          mSavedFragmentState.putInt("android:target_req_state", i);
        }
      }
    }
    else
    {
      mSavedFragmentState = mSavedFragmentState;
    }
    return localFragmentState;
  }
  
  public void saveViewState()
  {
    if (mFragment.mView == null) {
      return;
    }
    Object localObject = new SparseArray();
    mFragment.mView.saveHierarchyState((SparseArray)localObject);
    if (((SparseArray)localObject).size() > 0) {
      mFragment.mSavedViewState = ((SparseArray)localObject);
    }
    localObject = new Bundle();
    mFragment.mViewLifecycleOwner.performSave((Bundle)localObject);
    if (!((BaseBundle)localObject).isEmpty()) {
      mFragment.mSavedViewRegistryState = ((Bundle)localObject);
    }
  }
  
  public void setFragmentManagerState(int paramInt)
  {
    mFragmentManagerState = paramInt;
  }
  
  public void start()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      StringBuilder localStringBuilder = z2.t("moveto STARTED: ");
      localStringBuilder.append(mFragment);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    mFragment.performStart();
    mDispatcher.dispatchOnFragmentStarted(mFragment, false);
  }
  
  public void stop()
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      StringBuilder localStringBuilder = z2.t("movefrom STARTED: ");
      localStringBuilder.append(mFragment);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    mFragment.performStop();
    mDispatcher.dispatchOnFragmentStopped(mFragment, false);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentStateManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */