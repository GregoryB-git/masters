package androidx.fragment.app;

import a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.IntentSenderRequest.Builder;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions;
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.collection.ArraySet;
import androidx.core.os.CancellationSignal;
import androidx.fragment.R.id;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import z2;

public abstract class FragmentManager
  implements FragmentResultOwner
{
  private static boolean DEBUG = false;
  private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
  public static final int POP_BACK_STACK_INCLUSIVE = 1;
  public static final String TAG = "FragmentManager";
  public static boolean USE_STATE_MANAGER = true;
  public ArrayList<BackStackRecord> mBackStack;
  private ArrayList<OnBackStackChangedListener> mBackStackChangeListeners;
  private final AtomicInteger mBackStackIndex = new AtomicInteger();
  private FragmentContainer mContainer;
  private ArrayList<Fragment> mCreatedMenus;
  public int mCurState = -1;
  private SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory = new SpecialEffectsControllerFactory()
  {
    @NonNull
    public SpecialEffectsController createController(@NonNull ViewGroup paramAnonymousViewGroup)
    {
      return new DefaultSpecialEffectsController(paramAnonymousViewGroup);
    }
  };
  private boolean mDestroyed;
  private Runnable mExecCommit = new Runnable()
  {
    public void run()
    {
      execPendingActions(true);
    }
  };
  private boolean mExecutingActions;
  private Map<Fragment, HashSet<CancellationSignal>> mExitAnimationCancellationSignals = Collections.synchronizedMap(new HashMap());
  private FragmentFactory mFragmentFactory = null;
  private final FragmentStore mFragmentStore = new FragmentStore();
  private final FragmentTransition.Callback mFragmentTransitionCallback = new FragmentTransition.Callback()
  {
    public void onComplete(@NonNull Fragment paramAnonymousFragment, @NonNull CancellationSignal paramAnonymousCancellationSignal)
    {
      if (!paramAnonymousCancellationSignal.isCanceled()) {
        removeCancellationSignal(paramAnonymousFragment, paramAnonymousCancellationSignal);
      }
    }
    
    public void onStart(@NonNull Fragment paramAnonymousFragment, @NonNull CancellationSignal paramAnonymousCancellationSignal)
    {
      addCancellationSignal(paramAnonymousFragment, paramAnonymousCancellationSignal);
    }
  };
  private boolean mHavePendingDeferredStart;
  private FragmentHostCallback<?> mHost;
  private FragmentFactory mHostFragmentFactory = new FragmentFactory()
  {
    @NonNull
    public Fragment instantiate(@NonNull ClassLoader paramAnonymousClassLoader, @NonNull String paramAnonymousString)
    {
      return getHost().instantiate(getHost().getContext(), paramAnonymousString, null);
    }
  };
  public ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque();
  private final FragmentLayoutInflaterFactory mLayoutInflaterFactory = new FragmentLayoutInflaterFactory(this);
  private final FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new FragmentLifecycleCallbacksDispatcher(this);
  private boolean mNeedMenuInvalidate;
  private FragmentManagerViewModel mNonConfig;
  private final CopyOnWriteArrayList<FragmentOnAttachListener> mOnAttachListeners = new CopyOnWriteArrayList();
  private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false)
  {
    public void handleOnBackPressed()
    {
      FragmentManager.this.handleOnBackPressed();
    }
  };
  private OnBackPressedDispatcher mOnBackPressedDispatcher;
  private Fragment mParent;
  private final ArrayList<OpGenerator> mPendingActions = new ArrayList();
  private ArrayList<StartEnterTransitionListener> mPostponedTransactions;
  @Nullable
  public Fragment mPrimaryNav;
  private ActivityResultLauncher<String[]> mRequestPermissions;
  private final Map<String, LifecycleAwareResultListener> mResultListeners = Collections.synchronizedMap(new HashMap());
  private final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
  private SpecialEffectsControllerFactory mSpecialEffectsControllerFactory = null;
  private ActivityResultLauncher<Intent> mStartActivityForResult;
  private ActivityResultLauncher<IntentSenderRequest> mStartIntentSenderForResult;
  private boolean mStateSaved;
  private boolean mStopped;
  private ArrayList<Fragment> mTmpAddedFragments;
  private ArrayList<Boolean> mTmpIsPop;
  private ArrayList<BackStackRecord> mTmpRecords;
  
  private void addAddedFragments(@NonNull ArraySet<Fragment> paramArraySet)
  {
    int i = mCurState;
    if (i < 1) {
      return;
    }
    i = Math.min(i, 5);
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (mState < i)
      {
        moveToState(localFragment, i);
        if ((mView != null) && (!mHidden) && (mIsNewlyAdded)) {
          paramArraySet.add(localFragment);
        }
      }
    }
  }
  
  private void cancelExitAnimation(@NonNull Fragment paramFragment)
  {
    HashSet localHashSet = (HashSet)mExitAnimationCancellationSignals.get(paramFragment);
    if (localHashSet != null)
    {
      Iterator localIterator = localHashSet.iterator();
      while (localIterator.hasNext()) {
        ((CancellationSignal)localIterator.next()).cancel();
      }
      localHashSet.clear();
      destroyFragmentView(paramFragment);
      mExitAnimationCancellationSignals.remove(paramFragment);
    }
  }
  
  private void checkStateLoss()
  {
    if (!isStateSaved()) {
      return;
    }
    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
  }
  
  private void cleanupExec()
  {
    mExecutingActions = false;
    mTmpIsPop.clear();
    mTmpRecords.clear();
  }
  
  private Set<SpecialEffectsController> collectAllSpecialEffectsController()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = mFragmentStore.getActiveFragmentStateManagers().iterator();
    while (localIterator.hasNext())
    {
      ViewGroup localViewGroup = nextgetFragmentmContainer;
      if (localViewGroup != null) {
        localHashSet.add(SpecialEffectsController.getOrCreateController(localViewGroup, getSpecialEffectsControllerFactory()));
      }
    }
    return localHashSet;
  }
  
  private Set<SpecialEffectsController> collectChangedControllers(@NonNull ArrayList<BackStackRecord> paramArrayList, int paramInt1, int paramInt2)
  {
    HashSet localHashSet = new HashSet();
    while (paramInt1 < paramInt2)
    {
      Iterator localIterator = getmOps.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = nextmFragment;
        if (localObject != null)
        {
          localObject = mContainer;
          if (localObject != null) {
            localHashSet.add(SpecialEffectsController.getOrCreateController((ViewGroup)localObject, this));
          }
        }
      }
      paramInt1++;
    }
    return localHashSet;
  }
  
  private void completeShowHideFragment(@NonNull final Fragment paramFragment)
  {
    if (mView != null)
    {
      FragmentAnim.AnimationOrAnimator localAnimationOrAnimator = FragmentAnim.loadAnimation(mHost.getContext(), paramFragment, mHidden ^ true, paramFragment.getPopDirection());
      if (localAnimationOrAnimator != null)
      {
        final Object localObject = animator;
        if (localObject != null)
        {
          ((Animator)localObject).setTarget(mView);
          if (mHidden)
          {
            if (paramFragment.isHideReplaced())
            {
              paramFragment.setHideReplaced(false);
            }
            else
            {
              final ViewGroup localViewGroup = mContainer;
              localObject = mView;
              localViewGroup.startViewTransition((View)localObject);
              animator.addListener(new AnimatorListenerAdapter()
              {
                public void onAnimationEnd(Animator paramAnonymousAnimator)
                {
                  localViewGroup.endViewTransition(localObject);
                  paramAnonymousAnimator.removeListener(this);
                  paramAnonymousAnimator = paramFragment;
                  View localView = mView;
                  if ((localView != null) && (mHidden)) {
                    localView.setVisibility(8);
                  }
                }
              });
            }
          }
          else {
            mView.setVisibility(0);
          }
          animator.start();
          break label196;
        }
      }
      if (localAnimationOrAnimator != null)
      {
        mView.startAnimation(animation);
        animation.start();
      }
      int i;
      if ((mHidden) && (!paramFragment.isHideReplaced())) {
        i = 8;
      } else {
        i = 0;
      }
      mView.setVisibility(i);
      if (paramFragment.isHideReplaced()) {
        paramFragment.setHideReplaced(false);
      }
    }
    label196:
    invalidateMenuForFragment(paramFragment);
    mHiddenChanged = false;
    paramFragment.onHiddenChanged(mHidden);
  }
  
  private void destroyFragmentView(@NonNull Fragment paramFragment)
  {
    paramFragment.performDestroyView();
    mLifecycleCallbacksDispatcher.dispatchOnFragmentViewDestroyed(paramFragment, false);
    mContainer = null;
    mView = null;
    mViewLifecycleOwner = null;
    mViewLifecycleOwnerLiveData.setValue(null);
    mInLayout = false;
  }
  
  private void dispatchParentPrimaryNavigationFragmentChanged(@Nullable Fragment paramFragment)
  {
    if ((paramFragment != null) && (paramFragment.equals(findActiveFragment(mWho)))) {
      paramFragment.performPrimaryNavigationFragmentChanged();
    }
  }
  
  private void dispatchStateChange(int paramInt)
  {
    try
    {
      mExecutingActions = true;
      mFragmentStore.dispatchStateChange(paramInt);
      moveToState(paramInt, false);
      if (USE_STATE_MANAGER)
      {
        Iterator localIterator = collectAllSpecialEffectsController().iterator();
        while (localIterator.hasNext()) {
          ((SpecialEffectsController)localIterator.next()).forceCompleteAllOperations();
        }
      }
      mExecutingActions = false;
      execPendingActions(true);
      return;
    }
    finally
    {
      mExecutingActions = false;
    }
  }
  
  private void doPendingDeferredStart()
  {
    if (mHavePendingDeferredStart)
    {
      mHavePendingDeferredStart = false;
      startPendingDeferredFragments();
    }
  }
  
  @Deprecated
  public static void enableDebugLogging(boolean paramBoolean)
  {
    DEBUG = paramBoolean;
  }
  
  @FragmentStateManagerControl
  public static void enableNewStateManager(boolean paramBoolean)
  {
    USE_STATE_MANAGER = paramBoolean;
  }
  
  private void endAnimatingAwayFragments()
  {
    Iterator localIterator;
    if (USE_STATE_MANAGER)
    {
      localIterator = collectAllSpecialEffectsController().iterator();
      while (localIterator.hasNext()) {
        ((SpecialEffectsController)localIterator.next()).forceCompleteAllOperations();
      }
    }
    if (!mExitAnimationCancellationSignals.isEmpty())
    {
      localIterator = mExitAnimationCancellationSignals.keySet().iterator();
      while (localIterator.hasNext())
      {
        Fragment localFragment = (Fragment)localIterator.next();
        cancelExitAnimation(localFragment);
        moveToState(localFragment);
      }
    }
  }
  
  private void ensureExecReady(boolean paramBoolean)
  {
    if (!mExecutingActions)
    {
      if (mHost == null)
      {
        if (mDestroyed) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      if (Looper.myLooper() == mHost.getHandler().getLooper())
      {
        if (!paramBoolean) {
          checkStateLoss();
        }
        if (mTmpRecords == null)
        {
          mTmpRecords = new ArrayList();
          mTmpIsPop = new ArrayList();
        }
        mExecutingActions = true;
        try
        {
          executePostponedTransaction(null, null);
          return;
        }
        finally
        {
          mExecutingActions = false;
        }
      }
      throw new IllegalStateException("Must be called from main thread of fragment host");
    }
    throw new IllegalStateException("FragmentManager is already executing transactions");
  }
  
  private static void executeOps(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    while (paramInt1 < paramInt2)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(paramInt1);
      boolean bool1 = ((Boolean)paramArrayList1.get(paramInt1)).booleanValue();
      boolean bool2 = true;
      if (bool1)
      {
        localBackStackRecord.bumpBackStackNesting(-1);
        if (paramInt1 != paramInt2 - 1) {
          bool2 = false;
        }
        localBackStackRecord.executePopOps(bool2);
      }
      else
      {
        localBackStackRecord.bumpBackStackNesting(1);
        localBackStackRecord.executeOps();
      }
      paramInt1++;
    }
  }
  
  private void executeOpsTogether(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2)
  {
    boolean bool = getmReorderingAllowed;
    Object localObject1 = mTmpAddedFragments;
    if (localObject1 == null) {
      mTmpAddedFragments = new ArrayList();
    } else {
      ((ArrayList)localObject1).clear();
    }
    mTmpAddedFragments.addAll(mFragmentStore.getFragments());
    localObject1 = getPrimaryNavigationFragment();
    int i = 0;
    Object localObject2;
    for (int j = paramInt1; j < paramInt2; j++)
    {
      localObject2 = (BackStackRecord)paramArrayList.get(j);
      if (!((Boolean)paramArrayList1.get(j)).booleanValue()) {
        localObject1 = ((BackStackRecord)localObject2).expandOps(mTmpAddedFragments, (Fragment)localObject1);
      } else {
        localObject1 = ((BackStackRecord)localObject2).trackAddedFragmentsInPop(mTmpAddedFragments, (Fragment)localObject1);
      }
      if ((i == 0) && (!mAddToBackStack)) {
        i = 0;
      } else {
        i = 1;
      }
    }
    mTmpAddedFragments.clear();
    if ((!bool) && (mCurState >= 1))
    {
      if (USE_STATE_MANAGER) {
        for (j = paramInt1; j < paramInt2; j++)
        {
          localObject1 = getmOps.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = nextmFragment;
            if ((localObject2 != null) && (mFragmentManager != null))
            {
              localObject2 = createOrGetFragmentStateManager((Fragment)localObject2);
              mFragmentStore.makeActive((FragmentStateManager)localObject2);
            }
          }
        }
      }
      FragmentTransition.startTransitions(mHost.getContext(), mContainer, paramArrayList, paramArrayList1, paramInt1, paramInt2, false, mFragmentTransitionCallback);
    }
    executeOps(paramArrayList, paramArrayList1, paramInt1, paramInt2);
    int k;
    if (USE_STATE_MANAGER)
    {
      bool = ((Boolean)paramArrayList1.get(paramInt2 - 1)).booleanValue();
      for (j = paramInt1; j < paramInt2; j++)
      {
        localObject2 = (BackStackRecord)paramArrayList.get(j);
        if (bool) {
          for (k = mOps.size() - 1; k >= 0; k--)
          {
            localObject1 = mOps.get(k)).mFragment;
            if (localObject1 != null) {
              createOrGetFragmentStateManager((Fragment)localObject1).moveToExpectedState();
            }
          }
        }
        localObject2 = mOps.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = nextmFragment;
          if (localObject1 != null) {
            createOrGetFragmentStateManager((Fragment)localObject1).moveToExpectedState();
          }
        }
      }
      moveToState(mCurState, true);
      localObject2 = collectChangedControllers(paramArrayList, paramInt1, paramInt2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = (SpecialEffectsController)((Iterator)localObject2).next();
        ((SpecialEffectsController)localObject1).updateOperationDirection(bool);
        ((SpecialEffectsController)localObject1).markPostponedState();
        ((SpecialEffectsController)localObject1).executePendingOperations();
      }
    }
    else
    {
      if (bool)
      {
        localObject1 = new ArraySet();
        addAddedFragments((ArraySet)localObject1);
        j = postponePostponableTransactions(paramArrayList, paramArrayList1, paramInt1, paramInt2, (ArraySet)localObject1);
        makeRemovedFragmentsInvisible((ArraySet)localObject1);
      }
      else
      {
        j = paramInt2;
      }
      k = 1;
      localObject1 = paramArrayList1;
      if ((j != paramInt1) && (bool))
      {
        if (mCurState >= k) {
          FragmentTransition.startTransitions(mHost.getContext(), mContainer, paramArrayList, paramArrayList1, paramInt1, j, true, mFragmentTransitionCallback);
        }
        paramArrayList1 = (ArrayList<Boolean>)localObject1;
        moveToState(mCurState, k);
      }
      else
      {
        paramArrayList1 = (ArrayList<Boolean>)localObject1;
      }
    }
    while (paramInt1 < paramInt2)
    {
      localObject1 = (BackStackRecord)paramArrayList.get(paramInt1);
      if ((((Boolean)paramArrayList1.get(paramInt1)).booleanValue()) && (mIndex >= 0)) {
        mIndex = -1;
      }
      ((BackStackRecord)localObject1).runOnCommitRunnables();
      paramInt1++;
    }
    if (i != 0) {
      reportBackStackChanged();
    }
  }
  
  private void executePostponedTransaction(@Nullable ArrayList<BackStackRecord> paramArrayList, @Nullable ArrayList<Boolean> paramArrayList1)
  {
    Object localObject = mPostponedTransactions;
    int i;
    if (localObject == null) {
      i = 0;
    } else {
      i = ((ArrayList)localObject).size();
    }
    int j = 0;
    for (int k = i; j < k; k = i)
    {
      localObject = (StartEnterTransitionListener)mPostponedTransactions.get(j);
      int m;
      if ((paramArrayList != null) && (!mIsBack))
      {
        i = paramArrayList.indexOf(mRecord);
        if ((i != -1) && (paramArrayList1 != null) && (((Boolean)paramArrayList1.get(i)).booleanValue()))
        {
          mPostponedTransactions.remove(j);
          m = j - 1;
          i = k - 1;
          ((StartEnterTransitionListener)localObject).cancelTransaction();
          break label245;
        }
      }
      if (!((StartEnterTransitionListener)localObject).isReady())
      {
        i = k;
        m = j;
        if (paramArrayList != null)
        {
          i = k;
          m = j;
          if (!mRecord.interactsWith(paramArrayList, 0, paramArrayList.size())) {}
        }
      }
      else
      {
        mPostponedTransactions.remove(j);
        m = j - 1;
        i = k - 1;
        if ((paramArrayList != null) && (!mIsBack))
        {
          j = paramArrayList.indexOf(mRecord);
          if ((j != -1) && (paramArrayList1 != null) && (((Boolean)paramArrayList1.get(j)).booleanValue()))
          {
            ((StartEnterTransitionListener)localObject).cancelTransaction();
            break label245;
          }
        }
        ((StartEnterTransitionListener)localObject).completeTransaction();
      }
      label245:
      j = m + 1;
    }
  }
  
  @NonNull
  public static <F extends Fragment> F findFragment(@NonNull View paramView)
  {
    Object localObject = findViewFragment(paramView);
    if (localObject != null) {
      return (F)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("View ");
    ((StringBuilder)localObject).append(paramView);
    ((StringBuilder)localObject).append(" does not have a Fragment set");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  @NonNull
  public static FragmentManager findFragmentManager(@NonNull View paramView)
  {
    Object localObject1 = findViewFragment(paramView);
    if (localObject1 != null)
    {
      if (((Fragment)localObject1).isAdded())
      {
        paramView = ((Fragment)localObject1).getChildFragmentManager();
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("The Fragment ");
        ((StringBuilder)localObject2).append(localObject1);
        ((StringBuilder)localObject2).append(" that owns View ");
        ((StringBuilder)localObject2).append(paramView);
        ((StringBuilder)localObject2).append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
        throw new IllegalStateException(((StringBuilder)localObject2).toString());
      }
    }
    else
    {
      localObject2 = paramView.getContext();
      Object localObject3 = null;
      for (;;)
      {
        localObject1 = localObject3;
        if (!(localObject2 instanceof ContextWrapper)) {
          break;
        }
        if ((localObject2 instanceof FragmentActivity))
        {
          localObject1 = (FragmentActivity)localObject2;
          break;
        }
        localObject2 = ((ContextWrapper)localObject2).getBaseContext();
      }
      if (localObject1 == null) {
        break label133;
      }
      paramView = ((FragmentActivity)localObject1).getSupportFragmentManager();
    }
    return paramView;
    label133:
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("View ");
    ((StringBuilder)localObject2).append(paramView);
    ((StringBuilder)localObject2).append(" is not within a subclass of FragmentActivity.");
    throw new IllegalStateException(((StringBuilder)localObject2).toString());
  }
  
  @Nullable
  private static Fragment findViewFragment(@NonNull View paramView)
  {
    while (paramView != null)
    {
      Fragment localFragment = getViewFragment(paramView);
      if (localFragment != null) {
        return localFragment;
      }
      paramView = paramView.getParent();
      if ((paramView instanceof View)) {
        paramView = (View)paramView;
      } else {
        paramView = null;
      }
    }
    return null;
  }
  
  private void forcePostponedTransactions()
  {
    if (USE_STATE_MANAGER)
    {
      Iterator localIterator = collectAllSpecialEffectsController().iterator();
      while (localIterator.hasNext()) {
        ((SpecialEffectsController)localIterator.next()).forcePostponedExecutePendingOperations();
      }
    }
    if (mPostponedTransactions != null) {
      while (!mPostponedTransactions.isEmpty()) {
        ((StartEnterTransitionListener)mPostponedTransactions.remove(0)).completeTransaction();
      }
    }
  }
  
  private boolean generateOpsForPendingActions(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1)
  {
    synchronized (mPendingActions)
    {
      boolean bool = mPendingActions.isEmpty();
      int i = 0;
      if (bool) {
        return false;
      }
      int j = mPendingActions.size();
      bool = false;
      while (i < j)
      {
        bool |= ((OpGenerator)mPendingActions.get(i)).generateOps(paramArrayList, paramArrayList1);
        i++;
      }
      mPendingActions.clear();
      mHost.getHandler().removeCallbacks(mExecCommit);
      return bool;
    }
  }
  
  @NonNull
  private FragmentManagerViewModel getChildNonConfig(@NonNull Fragment paramFragment)
  {
    return mNonConfig.getChildNonConfig(paramFragment);
  }
  
  private ViewGroup getFragmentContainer(@NonNull Fragment paramFragment)
  {
    ViewGroup localViewGroup = mContainer;
    if (localViewGroup != null) {
      return localViewGroup;
    }
    if (mContainerId <= 0) {
      return null;
    }
    if (mContainer.onHasView())
    {
      paramFragment = mContainer.onFindViewById(mContainerId);
      if ((paramFragment instanceof ViewGroup)) {
        return (ViewGroup)paramFragment;
      }
    }
    return null;
  }
  
  @Nullable
  public static Fragment getViewFragment(@NonNull View paramView)
  {
    paramView = paramView.getTag(R.id.fragment_container_view_tag);
    if ((paramView instanceof Fragment)) {
      return (Fragment)paramView;
    }
    return null;
  }
  
  public static boolean isLoggingEnabled(int paramInt)
  {
    boolean bool;
    if ((!DEBUG) && (!Log.isLoggable("FragmentManager", paramInt))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private boolean isMenuAvailable(@NonNull Fragment paramFragment)
  {
    boolean bool;
    if (((mHasMenu) && (mMenuVisible)) || (mChildFragmentManager.checkForMenus())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private void makeRemovedFragmentsInvisible(@NonNull ArraySet<Fragment> paramArraySet)
  {
    int i = paramArraySet.size();
    for (int j = 0; j < i; j++)
    {
      Fragment localFragment = (Fragment)paramArraySet.valueAt(j);
      if (!mAdded)
      {
        View localView = localFragment.requireView();
        mPostponedAlpha = localView.getAlpha();
        localView.setAlpha(0.0F);
      }
    }
  }
  
  private boolean popBackStackImmediate(@Nullable String paramString, int paramInt1, int paramInt2)
  {
    execPendingActions(false);
    ensureExecReady(true);
    Fragment localFragment = mPrimaryNav;
    if ((localFragment != null) && (paramInt1 < 0) && (paramString == null) && (localFragment.getChildFragmentManager().popBackStackImmediate())) {
      return true;
    }
    boolean bool = popBackStackState(mTmpRecords, mTmpIsPop, paramString, paramInt1, paramInt2);
    if (bool) {
      mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
      cleanupExec();
    }
    finally
    {
      cleanupExec();
    }
    doPendingDeferredStart();
    mFragmentStore.burpActive();
    return bool;
  }
  
  private int postponePostponableTransactions(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, @NonNull ArraySet<Fragment> paramArraySet)
  {
    int i = paramInt2 - 1;
    int m;
    for (int j = paramInt2; i >= paramInt1; j = m)
    {
      BackStackRecord localBackStackRecord = (BackStackRecord)paramArrayList.get(i);
      boolean bool = ((Boolean)paramArrayList1.get(i)).booleanValue();
      int k;
      if ((localBackStackRecord.isPostponed()) && (!localBackStackRecord.interactsWith(paramArrayList, i + 1, paramInt2))) {
        k = 1;
      } else {
        k = 0;
      }
      m = j;
      if (k != 0)
      {
        if (mPostponedTransactions == null) {
          mPostponedTransactions = new ArrayList();
        }
        StartEnterTransitionListener localStartEnterTransitionListener = new StartEnterTransitionListener(localBackStackRecord, bool);
        mPostponedTransactions.add(localStartEnterTransitionListener);
        localBackStackRecord.setOnStartPostponedListener(localStartEnterTransitionListener);
        if (bool) {
          localBackStackRecord.executeOps();
        } else {
          localBackStackRecord.executePopOps(false);
        }
        m = j - 1;
        if (i != m)
        {
          paramArrayList.remove(i);
          paramArrayList.add(m, localBackStackRecord);
        }
        addAddedFragments(paramArraySet);
      }
      i--;
    }
    return j;
  }
  
  private void removeRedundantOperationsAndExecute(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    if (paramArrayList.size() == paramArrayList1.size())
    {
      executePostponedTransaction(paramArrayList, paramArrayList1);
      int i = paramArrayList.size();
      int j = 0;
      int n;
      for (int k = 0; j < i; k = n)
      {
        int m = j;
        n = k;
        if (!getmReorderingAllowed)
        {
          if (k != j) {
            executeOpsTogether(paramArrayList, paramArrayList1, k, j);
          }
          k = j + 1;
          n = k;
          if (((Boolean)paramArrayList1.get(j)).booleanValue()) {
            for (;;)
            {
              n = k;
              if (k >= i) {
                break;
              }
              n = k;
              if (!((Boolean)paramArrayList1.get(k)).booleanValue()) {
                break;
              }
              n = k;
              if (getmReorderingAllowed) {
                break;
              }
              k++;
            }
          }
          executeOpsTogether(paramArrayList, paramArrayList1, j, n);
          m = n - 1;
        }
        j = m + 1;
      }
      if (k != i) {
        executeOpsTogether(paramArrayList, paramArrayList1, k, i);
      }
      return;
    }
    throw new IllegalStateException("Internal error with the back stack records");
  }
  
  private void reportBackStackChanged()
  {
    if (mBackStackChangeListeners != null) {
      for (int i = 0; i < mBackStackChangeListeners.size(); i++) {
        ((OnBackStackChangedListener)mBackStackChangeListeners.get(i)).onBackStackChanged();
      }
    }
  }
  
  public static int reverseTransit(int paramInt)
  {
    int i = 8194;
    if (paramInt != 4097) {
      if (paramInt != 4099)
      {
        if (paramInt != 8194) {
          i = 0;
        } else {
          i = 4097;
        }
      }
      else {
        i = 4099;
      }
    }
    return i;
  }
  
  private void setVisibleRemovingFragment(@NonNull Fragment paramFragment)
  {
    ViewGroup localViewGroup = getFragmentContainer(paramFragment);
    if (localViewGroup != null)
    {
      int i = paramFragment.getEnterAnim();
      int j = paramFragment.getExitAnim();
      int k = paramFragment.getPopEnterAnim();
      if (paramFragment.getPopExitAnim() + (k + (j + i)) > 0)
      {
        i = R.id.visible_removing_fragment_view_tag;
        if (localViewGroup.getTag(i) == null) {
          localViewGroup.setTag(i, paramFragment);
        }
        ((Fragment)localViewGroup.getTag(i)).setPopDirection(paramFragment.getPopDirection());
      }
    }
  }
  
  private void startPendingDeferredFragments()
  {
    Iterator localIterator = mFragmentStore.getActiveFragmentStateManagers().iterator();
    while (localIterator.hasNext()) {
      performPendingDeferredStart((FragmentStateManager)localIterator.next());
    }
  }
  
  private void throwException(RuntimeException paramRuntimeException)
  {
    Log.e("FragmentManager", paramRuntimeException.getMessage());
    Log.e("FragmentManager", "Activity state:");
    PrintWriter localPrintWriter = new PrintWriter(new LogWriter("FragmentManager"));
    FragmentHostCallback localFragmentHostCallback = mHost;
    if (localFragmentHostCallback != null) {
      try
      {
        localFragmentHostCallback.onDump("  ", null, localPrintWriter, new String[0]);
      }
      catch (Exception localException1)
      {
        Log.e("FragmentManager", "Failed dumping state", localException1);
      }
    } else {
      try
      {
        dump("  ", null, localException1, new String[0]);
      }
      catch (Exception localException2)
      {
        Log.e("FragmentManager", "Failed dumping state", localException2);
      }
    }
    throw paramRuntimeException;
  }
  
  private void updateOnBackPressedCallbackEnabled()
  {
    synchronized (mPendingActions)
    {
      boolean bool1 = mPendingActions.isEmpty();
      boolean bool2 = true;
      if (!bool1)
      {
        mOnBackPressedCallback.setEnabled(true);
        return;
      }
      OnBackPressedCallback localOnBackPressedCallback = mOnBackPressedCallback;
      if ((getBackStackEntryCount() <= 0) || (!isPrimaryNavigation(mParent))) {
        bool2 = false;
      }
      localOnBackPressedCallback.setEnabled(bool2);
      return;
    }
  }
  
  public void addBackStackState(BackStackRecord paramBackStackRecord)
  {
    if (mBackStack == null) {
      mBackStack = new ArrayList();
    }
    mBackStack.add(paramBackStackRecord);
  }
  
  public void addCancellationSignal(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
  {
    if (mExitAnimationCancellationSignals.get(paramFragment) == null) {
      mExitAnimationCancellationSignals.put(paramFragment, new HashSet());
    }
    ((HashSet)mExitAnimationCancellationSignals.get(paramFragment)).add(paramCancellationSignal);
  }
  
  public FragmentStateManager addFragment(@NonNull Fragment paramFragment)
  {
    if (isLoggingEnabled(2))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("add: ");
      ((StringBuilder)localObject).append(paramFragment);
      Log.v("FragmentManager", ((StringBuilder)localObject).toString());
    }
    Object localObject = createOrGetFragmentStateManager(paramFragment);
    mFragmentManager = this;
    mFragmentStore.makeActive((FragmentStateManager)localObject);
    if (!mDetached)
    {
      mFragmentStore.addFragment(paramFragment);
      mRemoving = false;
      if (mView == null) {
        mHiddenChanged = false;
      }
      if (isMenuAvailable(paramFragment)) {
        mNeedMenuInvalidate = true;
      }
    }
    return (FragmentStateManager)localObject;
  }
  
  public void addFragmentOnAttachListener(@NonNull FragmentOnAttachListener paramFragmentOnAttachListener)
  {
    mOnAttachListeners.add(paramFragmentOnAttachListener);
  }
  
  public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    if (mBackStackChangeListeners == null) {
      mBackStackChangeListeners = new ArrayList();
    }
    mBackStackChangeListeners.add(paramOnBackStackChangedListener);
  }
  
  public void addRetainedFragment(@NonNull Fragment paramFragment)
  {
    mNonConfig.addRetainedFragment(paramFragment);
  }
  
  public int allocBackStackIndex()
  {
    return mBackStackIndex.getAndIncrement();
  }
  
  @SuppressLint({"SyntheticAccessor"})
  public void attachController(@NonNull FragmentHostCallback<?> paramFragmentHostCallback, @NonNull FragmentContainer paramFragmentContainer, @Nullable final Fragment paramFragment)
  {
    if (mHost == null)
    {
      mHost = paramFragmentHostCallback;
      mContainer = paramFragmentContainer;
      mParent = paramFragment;
      if (paramFragment != null) {
        addFragmentOnAttachListener(new FragmentOnAttachListener()
        {
          public void onAttachFragment(@NonNull FragmentManager paramAnonymousFragmentManager, @NonNull Fragment paramAnonymousFragment)
          {
            paramFragment.onAttachFragment(paramAnonymousFragment);
          }
        });
      } else if ((paramFragmentHostCallback instanceof FragmentOnAttachListener)) {
        addFragmentOnAttachListener((FragmentOnAttachListener)paramFragmentHostCallback);
      }
      if (mParent != null) {
        updateOnBackPressedCallbackEnabled();
      }
      if ((paramFragmentHostCallback instanceof OnBackPressedDispatcherOwner))
      {
        paramFragmentContainer = (OnBackPressedDispatcherOwner)paramFragmentHostCallback;
        OnBackPressedDispatcher localOnBackPressedDispatcher = paramFragmentContainer.getOnBackPressedDispatcher();
        mOnBackPressedDispatcher = localOnBackPressedDispatcher;
        if (paramFragment != null) {
          paramFragmentContainer = paramFragment;
        }
        localOnBackPressedDispatcher.addCallback(paramFragmentContainer, mOnBackPressedCallback);
      }
      if (paramFragment != null) {
        mNonConfig = mFragmentManager.getChildNonConfig(paramFragment);
      } else if ((paramFragmentHostCallback instanceof ViewModelStoreOwner)) {
        mNonConfig = FragmentManagerViewModel.getInstance(((ViewModelStoreOwner)paramFragmentHostCallback).getViewModelStore());
      } else {
        mNonConfig = new FragmentManagerViewModel(false);
      }
      mNonConfig.setIsStateSaved(isStateSaved());
      mFragmentStore.setNonConfig(mNonConfig);
      paramFragmentHostCallback = mHost;
      if ((paramFragmentHostCallback instanceof ActivityResultRegistryOwner))
      {
        paramFragmentContainer = ((ActivityResultRegistryOwner)paramFragmentHostCallback).getActivityResultRegistry();
        if (paramFragment != null) {
          paramFragmentHostCallback = z2.s(new StringBuilder(), mWho, ":");
        } else {
          paramFragmentHostCallback = "";
        }
        paramFragmentHostCallback = z2.o("FragmentManager:", paramFragmentHostCallback);
        mStartActivityForResult = paramFragmentContainer.register(z2.o(paramFragmentHostCallback, "StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback()
        {
          public void onActivityResult(ActivityResult paramAnonymousActivityResult)
          {
            Object localObject = (FragmentManager.LaunchedFragmentInfo)mLaunchedFragments.pollFirst();
            if (localObject == null)
            {
              paramAnonymousActivityResult = new StringBuilder();
              paramAnonymousActivityResult.append("No Activities were started for result for ");
              paramAnonymousActivityResult.append(this);
              Log.w("FragmentManager", paramAnonymousActivityResult.toString());
              return;
            }
            String str = mWho;
            int i = mRequestCode;
            localObject = FragmentManager.access$200(FragmentManager.this).findFragmentByWho(str);
            if (localObject == null)
            {
              z2.A("Activity result delivered for unknown Fragment ", str, "FragmentManager");
              return;
            }
            ((Fragment)localObject).onActivityResult(i, paramAnonymousActivityResult.getResultCode(), paramAnonymousActivityResult.getData());
          }
        });
        mStartIntentSenderForResult = paramFragmentContainer.register(z2.o(paramFragmentHostCallback, "StartIntentSenderForResult"), new FragmentIntentSenderContract(), new ActivityResultCallback()
        {
          public void onActivityResult(ActivityResult paramAnonymousActivityResult)
          {
            Object localObject = (FragmentManager.LaunchedFragmentInfo)mLaunchedFragments.pollFirst();
            if (localObject == null)
            {
              paramAnonymousActivityResult = new StringBuilder();
              paramAnonymousActivityResult.append("No IntentSenders were started for ");
              paramAnonymousActivityResult.append(this);
              Log.w("FragmentManager", paramAnonymousActivityResult.toString());
              return;
            }
            String str = mWho;
            int i = mRequestCode;
            localObject = FragmentManager.access$200(FragmentManager.this).findFragmentByWho(str);
            if (localObject == null)
            {
              z2.A("Intent Sender result delivered for unknown Fragment ", str, "FragmentManager");
              return;
            }
            ((Fragment)localObject).onActivityResult(i, paramAnonymousActivityResult.getResultCode(), paramAnonymousActivityResult.getData());
          }
        });
        mRequestPermissions = paramFragmentContainer.register(z2.o(paramFragmentHostCallback, "RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback()
        {
          @SuppressLint({"SyntheticAccessor"})
          public void onActivityResult(Map<String, Boolean> paramAnonymousMap)
          {
            String[] arrayOfString = (String[])paramAnonymousMap.keySet().toArray(new String[0]);
            Object localObject1 = new ArrayList(paramAnonymousMap.values());
            paramAnonymousMap = new int[((ArrayList)localObject1).size()];
            for (int i = 0; i < ((ArrayList)localObject1).size(); i++)
            {
              int j;
              if (((Boolean)((ArrayList)localObject1).get(i)).booleanValue()) {
                j = 0;
              } else {
                j = -1;
              }
              paramAnonymousMap[i] = j;
            }
            Object localObject2 = (FragmentManager.LaunchedFragmentInfo)mLaunchedFragments.pollFirst();
            if (localObject2 == null)
            {
              paramAnonymousMap = new StringBuilder();
              paramAnonymousMap.append("No permissions were requested for ");
              paramAnonymousMap.append(this);
              Log.w("FragmentManager", paramAnonymousMap.toString());
              return;
            }
            localObject1 = mWho;
            i = mRequestCode;
            localObject2 = FragmentManager.access$200(FragmentManager.this).findFragmentByWho((String)localObject1);
            if (localObject2 == null)
            {
              z2.A("Permission request result delivered for unknown Fragment ", (String)localObject1, "FragmentManager");
              return;
            }
            ((Fragment)localObject2).onRequestPermissionsResult(i, arrayOfString, paramAnonymousMap);
          }
        });
      }
      return;
    }
    throw new IllegalStateException("Already attached");
  }
  
  public void attachFragment(@NonNull Fragment paramFragment)
  {
    StringBuilder localStringBuilder;
    if (isLoggingEnabled(2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("attach: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (mDetached)
    {
      mDetached = false;
      if (!mAdded)
      {
        mFragmentStore.addFragment(paramFragment);
        if (isLoggingEnabled(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("add from attach: ");
          localStringBuilder.append(paramFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        if (isMenuAvailable(paramFragment)) {
          mNeedMenuInvalidate = true;
        }
      }
    }
  }
  
  @NonNull
  public FragmentTransaction beginTransaction()
  {
    return new BackStackRecord(this);
  }
  
  public boolean checkForMenus()
  {
    Iterator localIterator = mFragmentStore.getActiveFragments().iterator();
    boolean bool1 = false;
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      boolean bool2 = bool1;
      if (localFragment != null) {
        bool2 = isMenuAvailable(localFragment);
      }
      bool1 = bool2;
      if (bool2) {
        return true;
      }
    }
    return false;
  }
  
  public final void clearFragmentResult(@NonNull String paramString)
  {
    mResults.remove(paramString);
  }
  
  public final void clearFragmentResultListener(@NonNull String paramString)
  {
    paramString = (LifecycleAwareResultListener)mResultListeners.remove(paramString);
    if (paramString != null) {
      paramString.removeObserver();
    }
  }
  
  public void completeExecute(@NonNull BackStackRecord paramBackStackRecord, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {
      paramBackStackRecord.executePopOps(paramBoolean3);
    } else {
      paramBackStackRecord.executeOps();
    }
    Object localObject1 = new ArrayList(1);
    Object localObject2 = new ArrayList(1);
    ((ArrayList)localObject1).add(paramBackStackRecord);
    ((ArrayList)localObject2).add(Boolean.valueOf(paramBoolean1));
    if ((paramBoolean2) && (mCurState >= 1)) {
      FragmentTransition.startTransitions(mHost.getContext(), mContainer, (ArrayList)localObject1, (ArrayList)localObject2, 0, 1, true, mFragmentTransitionCallback);
    }
    if (paramBoolean3) {
      moveToState(mCurState, true);
    }
    localObject1 = mFragmentStore.getActiveFragments().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Fragment)((Iterator)localObject1).next();
      if ((localObject2 != null) && (mView != null) && (mIsNewlyAdded) && (paramBackStackRecord.interactsWith(mContainerId)))
      {
        float f = mPostponedAlpha;
        if (f > 0.0F) {
          mView.setAlpha(f);
        }
        if (paramBoolean3)
        {
          mPostponedAlpha = 0.0F;
        }
        else
        {
          mPostponedAlpha = -1.0F;
          mIsNewlyAdded = false;
        }
      }
    }
  }
  
  @NonNull
  public FragmentStateManager createOrGetFragmentStateManager(@NonNull Fragment paramFragment)
  {
    FragmentStateManager localFragmentStateManager = mFragmentStore.getFragmentStateManager(mWho);
    if (localFragmentStateManager != null) {
      return localFragmentStateManager;
    }
    paramFragment = new FragmentStateManager(mLifecycleCallbacksDispatcher, mFragmentStore, paramFragment);
    paramFragment.restoreState(mHost.getContext().getClassLoader());
    paramFragment.setFragmentManagerState(mCurState);
    return paramFragment;
  }
  
  public void detachFragment(@NonNull Fragment paramFragment)
  {
    StringBuilder localStringBuilder;
    if (isLoggingEnabled(2))
    {
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("detach: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!mDetached)
    {
      mDetached = true;
      if (mAdded)
      {
        if (isLoggingEnabled(2))
        {
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("remove from detach: ");
          localStringBuilder.append(paramFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        mFragmentStore.removeFragment(paramFragment);
        if (isMenuAvailable(paramFragment)) {
          mNeedMenuInvalidate = true;
        }
        setVisibleRemovingFragment(paramFragment);
      }
    }
  }
  
  public void dispatchActivityCreated()
  {
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    dispatchStateChange(4);
  }
  
  public void dispatchAttach()
  {
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    dispatchStateChange(0);
  }
  
  public void dispatchConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performConfigurationChanged(paramConfiguration);
      }
    }
  }
  
  public boolean dispatchContextItemSelected(@NonNull MenuItem paramMenuItem)
  {
    if (mCurState < 1) {
      return false;
    }
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (localFragment.performContextItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void dispatchCreate()
  {
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    dispatchStateChange(1);
  }
  
  public boolean dispatchCreateOptionsMenu(@NonNull Menu paramMenu, @NonNull MenuInflater paramMenuInflater)
  {
    int i = mCurState;
    int j = 0;
    if (i < 1) {
      return false;
    }
    Object localObject1 = null;
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    boolean bool = false;
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (isParentMenuVisible(localFragment)) && (localFragment.performCreateOptionsMenu(paramMenu, paramMenuInflater)))
      {
        Object localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = new ArrayList();
        }
        ((ArrayList)localObject2).add(localFragment);
        bool = true;
        localObject1 = localObject2;
      }
    }
    if (mCreatedMenus != null) {
      while (j < mCreatedMenus.size())
      {
        paramMenu = (Fragment)mCreatedMenus.get(j);
        if ((localObject1 == null) || (!((ArrayList)localObject1).contains(paramMenu))) {
          paramMenu.onDestroyOptionsMenu();
        }
        j++;
      }
    }
    mCreatedMenus = ((ArrayList)localObject1);
    return bool;
  }
  
  public void dispatchDestroy()
  {
    mDestroyed = true;
    execPendingActions(true);
    endAnimatingAwayFragments();
    dispatchStateChange(-1);
    mHost = null;
    mContainer = null;
    mParent = null;
    if (mOnBackPressedDispatcher != null)
    {
      mOnBackPressedCallback.remove();
      mOnBackPressedDispatcher = null;
    }
    ActivityResultLauncher localActivityResultLauncher = mStartActivityForResult;
    if (localActivityResultLauncher != null)
    {
      localActivityResultLauncher.unregister();
      mStartIntentSenderForResult.unregister();
      mRequestPermissions.unregister();
    }
  }
  
  public void dispatchDestroyView()
  {
    dispatchStateChange(1);
  }
  
  public void dispatchLowMemory()
  {
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performLowMemory();
      }
    }
  }
  
  public void dispatchMultiWindowModeChanged(boolean paramBoolean)
  {
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performMultiWindowModeChanged(paramBoolean);
      }
    }
  }
  
  public void dispatchOnAttachFragment(@NonNull Fragment paramFragment)
  {
    Iterator localIterator = mOnAttachListeners.iterator();
    while (localIterator.hasNext()) {
      ((FragmentOnAttachListener)localIterator.next()).onAttachFragment(this, paramFragment);
    }
  }
  
  public boolean dispatchOptionsItemSelected(@NonNull MenuItem paramMenuItem)
  {
    if (mCurState < 1) {
      return false;
    }
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (localFragment.performOptionsItemSelected(paramMenuItem))) {
        return true;
      }
    }
    return false;
  }
  
  public void dispatchOptionsMenuClosed(@NonNull Menu paramMenu)
  {
    if (mCurState < 1) {
      return;
    }
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performOptionsMenuClosed(paramMenu);
      }
    }
  }
  
  public void dispatchPause()
  {
    dispatchStateChange(5);
  }
  
  public void dispatchPictureInPictureModeChanged(boolean paramBoolean)
  {
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.performPictureInPictureModeChanged(paramBoolean);
      }
    }
  }
  
  public boolean dispatchPrepareOptionsMenu(@NonNull Menu paramMenu)
  {
    int i = mCurState;
    boolean bool = false;
    if (i < 1) {
      return false;
    }
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if ((localFragment != null) && (isParentMenuVisible(localFragment)) && (localFragment.performPrepareOptionsMenu(paramMenu))) {
        bool = true;
      }
    }
    return bool;
  }
  
  public void dispatchPrimaryNavigationFragmentChanged()
  {
    updateOnBackPressedCallbackEnabled();
    dispatchParentPrimaryNavigationFragmentChanged(mPrimaryNav);
  }
  
  public void dispatchResume()
  {
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    dispatchStateChange(7);
  }
  
  public void dispatchStart()
  {
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    dispatchStateChange(5);
  }
  
  public void dispatchStop()
  {
    mStopped = true;
    mNonConfig.setIsStateSaved(true);
    dispatchStateChange(4);
  }
  
  public void dispatchViewCreated()
  {
    dispatchStateChange(2);
  }
  
  public void dump(@NonNull String paramString, @Nullable FileDescriptor arg2, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
  {
    String str = z2.o(paramString, "    ");
    mFragmentStore.dump(paramString, ???, paramPrintWriter, paramArrayOfString);
    ??? = mCreatedMenus;
    int i = 0;
    int j;
    int k;
    if (??? != null)
    {
      j = ???.size();
      if (j > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Fragments Created Menus:");
        for (k = 0; k < j; k++)
        {
          ??? = (Fragment)mCreatedMenus.get(k);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(k);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(???.toString());
        }
      }
    }
    ??? = mBackStack;
    if (??? != null)
    {
      j = ???.size();
      if (j > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Back Stack:");
        for (k = 0; k < j; k++)
        {
          ??? = (BackStackRecord)mBackStack.get(k);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(k);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(???.toString());
          ???.dump(str, paramPrintWriter);
        }
      }
    }
    paramPrintWriter.print(paramString);
    ??? = new StringBuilder();
    ???.append("Back Stack Index: ");
    ???.append(mBackStackIndex.get());
    paramPrintWriter.println(???.toString());
    synchronized (mPendingActions)
    {
      j = mPendingActions.size();
      if (j > 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.println("Pending Actions:");
        for (k = i; k < j; k++)
        {
          paramArrayOfString = (OpGenerator)mPendingActions.get(k);
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  #");
          paramPrintWriter.print(k);
          paramPrintWriter.print(": ");
          paramPrintWriter.println(paramArrayOfString);
        }
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("FragmentManager misc state:");
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mHost=");
      paramPrintWriter.println(mHost);
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mContainer=");
      paramPrintWriter.println(mContainer);
      if (mParent != null)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mParent=");
        paramPrintWriter.println(mParent);
      }
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("  mCurState=");
      paramPrintWriter.print(mCurState);
      paramPrintWriter.print(" mStateSaved=");
      paramPrintWriter.print(mStateSaved);
      paramPrintWriter.print(" mStopped=");
      paramPrintWriter.print(mStopped);
      paramPrintWriter.print(" mDestroyed=");
      paramPrintWriter.println(mDestroyed);
      if (mNeedMenuInvalidate)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("  mNeedMenuInvalidate=");
        paramPrintWriter.println(mNeedMenuInvalidate);
      }
      return;
    }
  }
  
  public void enqueueAction(@NonNull OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (mHost == null)
      {
        if (mDestroyed) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      checkStateLoss();
    }
    synchronized (mPendingActions)
    {
      if (mHost == null)
      {
        if (paramBoolean) {
          return;
        }
        paramOpGenerator = new java/lang/IllegalStateException;
        paramOpGenerator.<init>("Activity has been destroyed");
        throw paramOpGenerator;
      }
      mPendingActions.add(paramOpGenerator);
      scheduleCommit();
      return;
    }
  }
  
  /* Error */
  public boolean execPendingActions(boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: invokespecial 854	androidx/fragment/app/FragmentManager:ensureExecReady	(Z)V
    //   5: iconst_0
    //   6: istore_1
    //   7: aload_0
    //   8: aload_0
    //   9: getfield 332	androidx/fragment/app/FragmentManager:mTmpRecords	Ljava/util/ArrayList;
    //   12: aload_0
    //   13: getfield 329	androidx/fragment/app/FragmentManager:mTmpIsPop	Ljava/util/ArrayList;
    //   16: invokespecial 1328	androidx/fragment/app/FragmentManager:generateOpsForPendingActions	(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    //   19: ifeq +36 -> 55
    //   22: aload_0
    //   23: iconst_1
    //   24: putfield 327	androidx/fragment/app/FragmentManager:mExecutingActions	Z
    //   27: aload_0
    //   28: aload_0
    //   29: getfield 332	androidx/fragment/app/FragmentManager:mTmpRecords	Ljava/util/ArrayList;
    //   32: aload_0
    //   33: getfield 329	androidx/fragment/app/FragmentManager:mTmpIsPop	Ljava/util/ArrayList;
    //   36: invokespecial 865	androidx/fragment/app/FragmentManager:removeRedundantOperationsAndExecute	(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    //   39: aload_0
    //   40: invokespecial 867	androidx/fragment/app/FragmentManager:cleanupExec	()V
    //   43: iconst_1
    //   44: istore_1
    //   45: goto -38 -> 7
    //   48: astore_2
    //   49: aload_0
    //   50: invokespecial 867	androidx/fragment/app/FragmentManager:cleanupExec	()V
    //   53: aload_2
    //   54: athrow
    //   55: aload_0
    //   56: invokespecial 870	androidx/fragment/app/FragmentManager:updateOnBackPressedCallbackEnabled	()V
    //   59: aload_0
    //   60: invokespecial 872	androidx/fragment/app/FragmentManager:doPendingDeferredStart	()V
    //   63: aload_0
    //   64: getfield 160	androidx/fragment/app/FragmentManager:mFragmentStore	Landroidx/fragment/app/FragmentStore;
    //   67: invokevirtual 875	androidx/fragment/app/FragmentStore:burpActive	()V
    //   70: iload_1
    //   71: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	FragmentManager
    //   0	72	1	paramBoolean	boolean
    //   48	6	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   27	39	48	finally
  }
  
  public void execSingleAction(@NonNull OpGenerator paramOpGenerator, boolean paramBoolean)
  {
    if ((paramBoolean) && ((mHost == null) || (mDestroyed))) {
      return;
    }
    ensureExecReady(paramBoolean);
    if (paramOpGenerator.generateOps(mTmpRecords, mTmpIsPop)) {
      mExecutingActions = true;
    }
    try
    {
      removeRedundantOperationsAndExecute(mTmpRecords, mTmpIsPop);
      cleanupExec();
    }
    finally
    {
      cleanupExec();
    }
    doPendingDeferredStart();
    mFragmentStore.burpActive();
  }
  
  public boolean executePendingTransactions()
  {
    boolean bool = execPendingActions(true);
    forcePostponedTransactions();
    return bool;
  }
  
  @Nullable
  public Fragment findActiveFragment(@NonNull String paramString)
  {
    return mFragmentStore.findActiveFragment(paramString);
  }
  
  @Nullable
  public Fragment findFragmentById(@IdRes int paramInt)
  {
    return mFragmentStore.findFragmentById(paramInt);
  }
  
  @Nullable
  public Fragment findFragmentByTag(@Nullable String paramString)
  {
    return mFragmentStore.findFragmentByTag(paramString);
  }
  
  public Fragment findFragmentByWho(@NonNull String paramString)
  {
    return mFragmentStore.findFragmentByWho(paramString);
  }
  
  public int getActiveFragmentCount()
  {
    return mFragmentStore.getActiveFragmentCount();
  }
  
  @NonNull
  public List<Fragment> getActiveFragments()
  {
    return mFragmentStore.getActiveFragments();
  }
  
  @NonNull
  public BackStackEntry getBackStackEntryAt(int paramInt)
  {
    return (BackStackEntry)mBackStack.get(paramInt);
  }
  
  public int getBackStackEntryCount()
  {
    ArrayList localArrayList = mBackStack;
    int i;
    if (localArrayList != null) {
      i = localArrayList.size();
    } else {
      i = 0;
    }
    return i;
  }
  
  @NonNull
  public FragmentContainer getContainer()
  {
    return mContainer;
  }
  
  @Nullable
  public Fragment getFragment(@NonNull Bundle paramBundle, @NonNull String paramString)
  {
    paramBundle = paramBundle.getString(paramString);
    if (paramBundle == null) {
      return null;
    }
    Fragment localFragment = findActiveFragment(paramBundle);
    if (localFragment == null) {
      throwException(new IllegalStateException(a.m("Fragment no longer exists for key ", paramString, ": unique id ", paramBundle)));
    }
    return localFragment;
  }
  
  @NonNull
  public FragmentFactory getFragmentFactory()
  {
    Object localObject = mFragmentFactory;
    if (localObject != null) {
      return (FragmentFactory)localObject;
    }
    localObject = mParent;
    if (localObject != null) {
      return mFragmentManager.getFragmentFactory();
    }
    return mHostFragmentFactory;
  }
  
  @NonNull
  public FragmentStore getFragmentStore()
  {
    return mFragmentStore;
  }
  
  @NonNull
  public List<Fragment> getFragments()
  {
    return mFragmentStore.getFragments();
  }
  
  @NonNull
  public FragmentHostCallback<?> getHost()
  {
    return mHost;
  }
  
  @NonNull
  public LayoutInflater.Factory2 getLayoutInflaterFactory()
  {
    return mLayoutInflaterFactory;
  }
  
  @NonNull
  public FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher()
  {
    return mLifecycleCallbacksDispatcher;
  }
  
  @Nullable
  public Fragment getParent()
  {
    return mParent;
  }
  
  @Nullable
  public Fragment getPrimaryNavigationFragment()
  {
    return mPrimaryNav;
  }
  
  @NonNull
  public SpecialEffectsControllerFactory getSpecialEffectsControllerFactory()
  {
    Object localObject = mSpecialEffectsControllerFactory;
    if (localObject != null) {
      return (SpecialEffectsControllerFactory)localObject;
    }
    localObject = mParent;
    if (localObject != null) {
      return mFragmentManager.getSpecialEffectsControllerFactory();
    }
    return mDefaultSpecialEffectsControllerFactory;
  }
  
  @NonNull
  public ViewModelStore getViewModelStore(@NonNull Fragment paramFragment)
  {
    return mNonConfig.getViewModelStore(paramFragment);
  }
  
  public void handleOnBackPressed()
  {
    execPendingActions(true);
    if (mOnBackPressedCallback.isEnabled()) {
      popBackStackImmediate();
    } else {
      mOnBackPressedDispatcher.onBackPressed();
    }
  }
  
  public void hideFragment(@NonNull Fragment paramFragment)
  {
    if (isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("hide: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (!mHidden)
    {
      mHidden = true;
      mHiddenChanged = (true ^ mHiddenChanged);
      setVisibleRemovingFragment(paramFragment);
    }
  }
  
  public void invalidateMenuForFragment(@NonNull Fragment paramFragment)
  {
    if ((mAdded) && (isMenuAvailable(paramFragment))) {
      mNeedMenuInvalidate = true;
    }
  }
  
  public boolean isDestroyed()
  {
    return mDestroyed;
  }
  
  public boolean isParentMenuVisible(@Nullable Fragment paramFragment)
  {
    if (paramFragment == null) {
      return true;
    }
    return paramFragment.isMenuVisible();
  }
  
  public boolean isPrimaryNavigation(@Nullable Fragment paramFragment)
  {
    boolean bool = true;
    if (paramFragment == null) {
      return true;
    }
    FragmentManager localFragmentManager = mFragmentManager;
    if ((!paramFragment.equals(localFragmentManager.getPrimaryNavigationFragment())) || (!isPrimaryNavigation(mParent))) {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStateAtLeast(int paramInt)
  {
    boolean bool;
    if (mCurState >= paramInt) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isStateSaved()
  {
    boolean bool;
    if ((!mStateSaved) && (!mStopped)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void launchRequestPermissions(@NonNull Fragment paramFragment, @NonNull String[] paramArrayOfString, int paramInt)
  {
    if (mRequestPermissions != null)
    {
      paramFragment = new LaunchedFragmentInfo(mWho, paramInt);
      mLaunchedFragments.addLast(paramFragment);
      mRequestPermissions.launch(paramArrayOfString);
    }
    else
    {
      mHost.onRequestPermissionsFromFragment(paramFragment, paramArrayOfString, paramInt);
    }
  }
  
  public void launchStartActivityForResult(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    if (mStartActivityForResult != null)
    {
      paramFragment = new LaunchedFragmentInfo(mWho, paramInt);
      mLaunchedFragments.addLast(paramFragment);
      if ((paramIntent != null) && (paramBundle != null)) {
        paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle);
      }
      mStartActivityForResult.launch(paramIntent);
    }
    else
    {
      mHost.onStartActivityFromFragment(paramFragment, paramIntent, paramInt, paramBundle);
    }
  }
  
  public void launchStartIntentSenderForResult(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    if (mStartIntentSenderForResult != null)
    {
      if (paramBundle != null)
      {
        if (paramIntent == null)
        {
          paramIntent = new Intent();
          paramIntent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
        }
        if (isLoggingEnabled(2))
        {
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("ActivityOptions ");
          localStringBuilder.append(paramBundle);
          localStringBuilder.append(" were added to fillInIntent ");
          localStringBuilder.append(paramIntent);
          localStringBuilder.append(" for fragment ");
          localStringBuilder.append(paramFragment);
          Log.v("FragmentManager", localStringBuilder.toString());
        }
        paramIntent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", paramBundle);
      }
      paramIntentSender = new IntentSenderRequest.Builder(paramIntentSender).setFillInIntent(paramIntent).setFlags(paramInt3, paramInt2).build();
      paramIntent = new LaunchedFragmentInfo(mWho, paramInt1);
      mLaunchedFragments.addLast(paramIntent);
      if (isLoggingEnabled(2))
      {
        paramIntent = new StringBuilder();
        paramIntent.append("Fragment ");
        paramIntent.append(paramFragment);
        paramIntent.append("is launching an IntentSender for result ");
        Log.v("FragmentManager", paramIntent.toString());
      }
      mStartIntentSenderForResult.launch(paramIntentSender);
    }
    else
    {
      mHost.onStartIntentSenderFromFragment(paramFragment, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
    }
  }
  
  public void moveFragmentToExpectedState(@NonNull Fragment paramFragment)
  {
    if (!mFragmentStore.containsActiveFragment(mWho))
    {
      if (isLoggingEnabled(3))
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Ignoring moving ");
        ((StringBuilder)localObject).append(paramFragment);
        ((StringBuilder)localObject).append(" to state ");
        ((StringBuilder)localObject).append(mCurState);
        ((StringBuilder)localObject).append("since it is not added to ");
        ((StringBuilder)localObject).append(this);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      return;
    }
    moveToState(paramFragment);
    Object localObject = mView;
    if ((localObject != null) && (mIsNewlyAdded) && (mContainer != null))
    {
      float f = mPostponedAlpha;
      if (f > 0.0F) {
        ((View)localObject).setAlpha(f);
      }
      mPostponedAlpha = 0.0F;
      mIsNewlyAdded = false;
      localObject = FragmentAnim.loadAnimation(mHost.getContext(), paramFragment, true, paramFragment.getPopDirection());
      if (localObject != null)
      {
        Animation localAnimation = animation;
        if (localAnimation != null)
        {
          mView.startAnimation(localAnimation);
        }
        else
        {
          animator.setTarget(mView);
          animator.start();
        }
      }
    }
    if (mHiddenChanged) {
      completeShowHideFragment(paramFragment);
    }
  }
  
  public void moveToState(int paramInt, boolean paramBoolean)
  {
    if ((mHost == null) && (paramInt != -1)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == mCurState)) {
      return;
    }
    mCurState = paramInt;
    Object localObject;
    if (USE_STATE_MANAGER)
    {
      mFragmentStore.moveToExpectedState();
    }
    else
    {
      localObject = mFragmentStore.getFragments().iterator();
      while (((Iterator)localObject).hasNext()) {
        moveFragmentToExpectedState((Fragment)((Iterator)localObject).next());
      }
      Iterator localIterator = mFragmentStore.getActiveFragmentStateManagers().iterator();
      while (localIterator.hasNext())
      {
        FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
        localObject = localFragmentStateManager.getFragment();
        if (!mIsNewlyAdded) {
          moveFragmentToExpectedState((Fragment)localObject);
        }
        if ((mRemoving) && (!((Fragment)localObject).isInBackStack())) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        if (paramInt != 0) {
          mFragmentStore.makeInactive(localFragmentStateManager);
        }
      }
    }
    startPendingDeferredFragments();
    if (mNeedMenuInvalidate)
    {
      localObject = mHost;
      if ((localObject != null) && (mCurState == 7))
      {
        ((FragmentHostCallback)localObject).onSupportInvalidateOptionsMenu();
        mNeedMenuInvalidate = false;
      }
    }
  }
  
  public void moveToState(@NonNull Fragment paramFragment)
  {
    moveToState(paramFragment, mCurState);
  }
  
  public void moveToState(@NonNull Fragment paramFragment, int paramInt)
  {
    Object localObject1 = mFragmentStore.getFragmentStateManager(mWho);
    int i = 1;
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = new FragmentStateManager(mLifecycleCallbacksDispatcher, mFragmentStore, paramFragment);
      ((FragmentStateManager)localObject2).setFragmentManagerState(1);
    }
    int j = paramInt;
    if (mFromLayout)
    {
      j = paramInt;
      if (mInLayout)
      {
        j = paramInt;
        if (mState == 2) {
          j = Math.max(paramInt, 2);
        }
      }
    }
    paramInt = Math.min(j, ((FragmentStateManager)localObject2).computeExpectedState());
    int k = mState;
    if (k <= paramInt)
    {
      if ((k < paramInt) && (!mExitAnimationCancellationSignals.isEmpty())) {
        cancelExitAnimation(paramFragment);
      }
      j = mState;
      if (j != -1)
      {
        if (j != 0)
        {
          if (j == 1) {
            break label196;
          }
          if (j == 2) {
            break label216;
          }
          if (j == 4) {
            break label226;
          }
          if (j == 5) {
            break label236;
          }
          j = paramInt;
          break label687;
        }
      }
      else if (paramInt > -1) {
        ((FragmentStateManager)localObject2).attach();
      }
      if (paramInt > 0) {
        ((FragmentStateManager)localObject2).create();
      }
      label196:
      if (paramInt > -1) {
        ((FragmentStateManager)localObject2).ensureInflatedView();
      }
      if (paramInt > 1) {
        ((FragmentStateManager)localObject2).createView();
      }
      label216:
      if (paramInt > 2) {
        ((FragmentStateManager)localObject2).activityCreated();
      }
      label226:
      if (paramInt > 4) {
        ((FragmentStateManager)localObject2).start();
      }
      label236:
      j = paramInt;
      if (paramInt > 5)
      {
        ((FragmentStateManager)localObject2).resume();
        j = paramInt;
      }
    }
    else
    {
      j = paramInt;
      if (k > paramInt)
      {
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (k != 4)
              {
                if (k != 5)
                {
                  if (k != 7)
                  {
                    j = paramInt;
                    break label687;
                  }
                  if (paramInt < 7) {
                    ((FragmentStateManager)localObject2).pause();
                  }
                }
                if (paramInt < 5) {
                  ((FragmentStateManager)localObject2).stop();
                }
              }
              if (paramInt < 4)
              {
                if (isLoggingEnabled(3))
                {
                  localObject1 = new StringBuilder();
                  ((StringBuilder)localObject1).append("movefrom ACTIVITY_CREATED: ");
                  ((StringBuilder)localObject1).append(paramFragment);
                  Log.d("FragmentManager", ((StringBuilder)localObject1).toString());
                }
                if ((mView != null) && (mHost.onShouldSaveFragmentState(paramFragment)) && (mSavedViewState == null)) {
                  ((FragmentStateManager)localObject2).saveViewState();
                }
              }
            }
            if (paramInt < 2)
            {
              ViewGroup localViewGroup = null;
              View localView = mView;
              if (localView != null)
              {
                localObject1 = mContainer;
                if (localObject1 != null)
                {
                  ((ViewGroup)localObject1).endViewTransition(localView);
                  mView.clearAnimation();
                  if (!paramFragment.isRemovingParent())
                  {
                    localObject1 = localViewGroup;
                    if (mCurState > -1)
                    {
                      localObject1 = localViewGroup;
                      if (!mDestroyed)
                      {
                        localObject1 = localViewGroup;
                        if (mView.getVisibility() == 0)
                        {
                          localObject1 = localViewGroup;
                          if (mPostponedAlpha >= 0.0F) {
                            localObject1 = FragmentAnim.loadAnimation(mHost.getContext(), paramFragment, false, paramFragment.getPopDirection());
                          }
                        }
                      }
                    }
                    mPostponedAlpha = 0.0F;
                    localViewGroup = mContainer;
                    localView = mView;
                    if (localObject1 != null) {
                      FragmentAnim.animateRemoveFragment(paramFragment, (FragmentAnim.AnimationOrAnimator)localObject1, mFragmentTransitionCallback);
                    }
                    localViewGroup.removeView(localView);
                    if (isLoggingEnabled(2))
                    {
                      localObject1 = new StringBuilder();
                      ((StringBuilder)localObject1).append("Removing view ");
                      ((StringBuilder)localObject1).append(localView);
                      ((StringBuilder)localObject1).append(" for fragment ");
                      ((StringBuilder)localObject1).append(paramFragment);
                      ((StringBuilder)localObject1).append(" from container ");
                      ((StringBuilder)localObject1).append(localViewGroup);
                      Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
                    }
                    if (localViewGroup != mContainer) {
                      return;
                    }
                  }
                }
              }
              if (mExitAnimationCancellationSignals.get(paramFragment) == null) {
                ((FragmentStateManager)localObject2).destroyFragmentView();
              }
            }
          }
          if (paramInt < 1) {
            if (mExitAnimationCancellationSignals.get(paramFragment) != null) {
              paramInt = i;
            } else {
              ((FragmentStateManager)localObject2).destroy();
            }
          }
        }
        if (paramInt < 0) {
          ((FragmentStateManager)localObject2).detach();
        }
        j = paramInt;
      }
    }
    label687:
    if (mState != j)
    {
      if (isLoggingEnabled(3))
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("moveToState: Fragment state for ");
        ((StringBuilder)localObject2).append(paramFragment);
        ((StringBuilder)localObject2).append(" not updated inline; expected state ");
        ((StringBuilder)localObject2).append(j);
        ((StringBuilder)localObject2).append(" found ");
        ((StringBuilder)localObject2).append(mState);
        Log.d("FragmentManager", ((StringBuilder)localObject2).toString());
      }
      mState = j;
    }
  }
  
  public void noteStateNotSaved()
  {
    if (mHost == null) {
      return;
    }
    mStateSaved = false;
    mStopped = false;
    mNonConfig.setIsStateSaved(false);
    Iterator localIterator = mFragmentStore.getFragments().iterator();
    while (localIterator.hasNext())
    {
      Fragment localFragment = (Fragment)localIterator.next();
      if (localFragment != null) {
        localFragment.noteStateNotSaved();
      }
    }
  }
  
  public void onContainerAvailable(@NonNull FragmentContainerView paramFragmentContainerView)
  {
    Iterator localIterator = mFragmentStore.getActiveFragmentStateManagers().iterator();
    while (localIterator.hasNext())
    {
      FragmentStateManager localFragmentStateManager = (FragmentStateManager)localIterator.next();
      Fragment localFragment = localFragmentStateManager.getFragment();
      if (mContainerId == paramFragmentContainerView.getId())
      {
        View localView = mView;
        if ((localView != null) && (localView.getParent() == null))
        {
          mContainer = paramFragmentContainerView;
          localFragmentStateManager.addViewToContainer();
        }
      }
    }
  }
  
  @Deprecated
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public FragmentTransaction openTransaction()
  {
    return beginTransaction();
  }
  
  public void performPendingDeferredStart(@NonNull FragmentStateManager paramFragmentStateManager)
  {
    Fragment localFragment = paramFragmentStateManager.getFragment();
    if (mDeferStart)
    {
      if (mExecutingActions)
      {
        mHavePendingDeferredStart = true;
        return;
      }
      mDeferStart = false;
      if (USE_STATE_MANAGER) {
        paramFragmentStateManager.moveToExpectedState();
      } else {
        moveToState(localFragment);
      }
    }
  }
  
  public void popBackStack()
  {
    enqueueAction(new PopBackStackState(null, -1, 0), false);
  }
  
  public void popBackStack(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0)
    {
      enqueueAction(new PopBackStackState(null, paramInt1, paramInt2), false);
      return;
    }
    throw new IllegalArgumentException(a.f("Bad id: ", paramInt1));
  }
  
  public void popBackStack(@Nullable String paramString, int paramInt)
  {
    enqueueAction(new PopBackStackState(paramString, -1, paramInt), false);
  }
  
  public boolean popBackStackImmediate()
  {
    return popBackStackImmediate(null, -1, 0);
  }
  
  public boolean popBackStackImmediate(int paramInt1, int paramInt2)
  {
    if (paramInt1 >= 0) {
      return popBackStackImmediate(null, paramInt1, paramInt2);
    }
    throw new IllegalArgumentException(a.f("Bad id: ", paramInt1));
  }
  
  public boolean popBackStackImmediate(@Nullable String paramString, int paramInt)
  {
    return popBackStackImmediate(paramString, -1, paramInt);
  }
  
  public boolean popBackStackState(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1, @Nullable String paramString, int paramInt1, int paramInt2)
  {
    Object localObject = mBackStack;
    if (localObject == null) {
      return false;
    }
    if ((paramString == null) && (paramInt1 < 0) && ((paramInt2 & 0x1) == 0))
    {
      paramInt1 = ((ArrayList)localObject).size() - 1;
      if (paramInt1 < 0) {
        return false;
      }
      paramArrayList.add(mBackStack.remove(paramInt1));
      paramArrayList1.add(Boolean.TRUE);
    }
    else
    {
      if ((paramString == null) && (paramInt1 < 0))
      {
        paramInt1 = -1;
      }
      else
      {
        for (int i = ((ArrayList)localObject).size() - 1; i >= 0; i--)
        {
          localObject = (BackStackRecord)mBackStack.get(i);
          if (((paramString != null) && (paramString.equals(((BackStackRecord)localObject).getName()))) || ((paramInt1 >= 0) && (paramInt1 == mIndex))) {
            break;
          }
        }
        if (i < 0) {
          return false;
        }
        int j = i;
        if ((paramInt2 & 0x1) != 0) {
          for (;;)
          {
            paramInt2 = i - 1;
            j = paramInt2;
            if (paramInt2 < 0) {
              break;
            }
            localObject = (BackStackRecord)mBackStack.get(paramInt2);
            if (paramString != null)
            {
              i = paramInt2;
              if (paramString.equals(((BackStackRecord)localObject).getName())) {}
            }
            else
            {
              j = paramInt2;
              if (paramInt1 < 0) {
                break;
              }
              j = paramInt2;
              if (paramInt1 != mIndex) {
                break;
              }
              i = paramInt2;
            }
          }
        }
        paramInt1 = j;
      }
      if (paramInt1 == mBackStack.size() - 1) {
        return false;
      }
      for (paramInt2 = mBackStack.size() - 1; paramInt2 > paramInt1; paramInt2--)
      {
        paramArrayList.add(mBackStack.remove(paramInt2));
        paramArrayList1.add(Boolean.TRUE);
      }
    }
    return true;
  }
  
  public void putFragment(@NonNull Bundle paramBundle, @NonNull String paramString, @NonNull Fragment paramFragment)
  {
    if (mFragmentManager != this) {
      throwException(new IllegalStateException(a.j("Fragment ", paramFragment, " is not currently in the FragmentManager")));
    }
    paramBundle.putString(paramString, mWho);
  }
  
  public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks, boolean paramBoolean)
  {
    mLifecycleCallbacksDispatcher.registerFragmentLifecycleCallbacks(paramFragmentLifecycleCallbacks, paramBoolean);
  }
  
  public void removeCancellationSignal(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal)
  {
    HashSet localHashSet = (HashSet)mExitAnimationCancellationSignals.get(paramFragment);
    if ((localHashSet != null) && (localHashSet.remove(paramCancellationSignal)) && (localHashSet.isEmpty()))
    {
      mExitAnimationCancellationSignals.remove(paramFragment);
      if (mState < 5)
      {
        destroyFragmentView(paramFragment);
        moveToState(paramFragment);
      }
    }
  }
  
  public void removeFragment(@NonNull Fragment paramFragment)
  {
    if (isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("remove: ");
      localStringBuilder.append(paramFragment);
      localStringBuilder.append(" nesting=");
      localStringBuilder.append(mBackStackNesting);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    boolean bool = paramFragment.isInBackStack();
    if ((!mDetached) || ((bool ^ true)))
    {
      mFragmentStore.removeFragment(paramFragment);
      if (isMenuAvailable(paramFragment)) {
        mNeedMenuInvalidate = true;
      }
      mRemoving = true;
      setVisibleRemovingFragment(paramFragment);
    }
  }
  
  public void removeFragmentOnAttachListener(@NonNull FragmentOnAttachListener paramFragmentOnAttachListener)
  {
    mOnAttachListeners.remove(paramFragmentOnAttachListener);
  }
  
  public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener paramOnBackStackChangedListener)
  {
    ArrayList localArrayList = mBackStackChangeListeners;
    if (localArrayList != null) {
      localArrayList.remove(paramOnBackStackChangedListener);
    }
  }
  
  public void removeRetainedFragment(@NonNull Fragment paramFragment)
  {
    mNonConfig.removeRetainedFragment(paramFragment);
  }
  
  public void restoreAllState(@Nullable Parcelable paramParcelable, @Nullable FragmentManagerNonConfig paramFragmentManagerNonConfig)
  {
    if ((mHost instanceof ViewModelStoreOwner)) {
      throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
    }
    mNonConfig.restoreFromSnapshot(paramFragmentManagerNonConfig);
    restoreSaveState(paramParcelable);
  }
  
  public void restoreSaveState(@Nullable Parcelable paramParcelable)
  {
    if (paramParcelable == null) {
      return;
    }
    FragmentManagerState localFragmentManagerState = (FragmentManagerState)paramParcelable;
    if (mActive == null) {
      return;
    }
    mFragmentStore.resetActiveFragments();
    Object localObject1 = mActive.iterator();
    Object localObject3;
    while (((Iterator)localObject1).hasNext())
    {
      paramParcelable = (FragmentState)((Iterator)localObject1).next();
      if (paramParcelable != null)
      {
        Object localObject2 = mNonConfig.findRetainedFragmentByWho(mWho);
        if (localObject2 != null)
        {
          if (isLoggingEnabled(2))
          {
            localObject3 = new StringBuilder();
            ((StringBuilder)localObject3).append("restoreSaveState: re-attaching retained ");
            ((StringBuilder)localObject3).append(localObject2);
            Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
          }
          paramParcelable = new FragmentStateManager(mLifecycleCallbacksDispatcher, mFragmentStore, (Fragment)localObject2, paramParcelable);
        }
        else
        {
          paramParcelable = new FragmentStateManager(mLifecycleCallbacksDispatcher, mFragmentStore, mHost.getContext().getClassLoader(), getFragmentFactory(), paramParcelable);
        }
        localObject3 = paramParcelable.getFragment();
        mFragmentManager = this;
        if (isLoggingEnabled(2))
        {
          localObject2 = z2.t("restoreSaveState: active (");
          ((StringBuilder)localObject2).append(mWho);
          ((StringBuilder)localObject2).append("): ");
          ((StringBuilder)localObject2).append(localObject3);
          Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
        }
        paramParcelable.restoreState(mHost.getContext().getClassLoader());
        mFragmentStore.makeActive(paramParcelable);
        paramParcelable.setFragmentManagerState(mCurState);
      }
    }
    paramParcelable = mNonConfig.getRetainedFragments().iterator();
    while (paramParcelable.hasNext())
    {
      localObject1 = (Fragment)paramParcelable.next();
      if (!mFragmentStore.containsActiveFragment(mWho))
      {
        if (isLoggingEnabled(2))
        {
          localObject3 = new StringBuilder();
          ((StringBuilder)localObject3).append("Discarding retained Fragment ");
          ((StringBuilder)localObject3).append(localObject1);
          ((StringBuilder)localObject3).append(" that was not found in the set of active Fragments ");
          ((StringBuilder)localObject3).append(mActive);
          Log.v("FragmentManager", ((StringBuilder)localObject3).toString());
        }
        mNonConfig.removeRetainedFragment((Fragment)localObject1);
        mFragmentManager = this;
        localObject3 = new FragmentStateManager(mLifecycleCallbacksDispatcher, mFragmentStore, (Fragment)localObject1);
        ((FragmentStateManager)localObject3).setFragmentManagerState(1);
        ((FragmentStateManager)localObject3).moveToExpectedState();
        mRemoving = true;
        ((FragmentStateManager)localObject3).moveToExpectedState();
      }
    }
    mFragmentStore.restoreAddedFragments(mAdded);
    paramParcelable = mBackStack;
    int i = 0;
    int j;
    if (paramParcelable != null)
    {
      mBackStack = new ArrayList(mBackStack.length);
      for (j = 0;; j++)
      {
        paramParcelable = mBackStack;
        if (j >= paramParcelable.length) {
          break;
        }
        paramParcelable = paramParcelable[j].instantiate(this);
        if (isLoggingEnabled(2))
        {
          localObject1 = a.r("restoreAllState: back stack #", j, " (index ");
          ((StringBuilder)localObject1).append(mIndex);
          ((StringBuilder)localObject1).append("): ");
          ((StringBuilder)localObject1).append(paramParcelable);
          Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
          localObject1 = new PrintWriter(new LogWriter("FragmentManager"));
          paramParcelable.dump("  ", (PrintWriter)localObject1, false);
          ((PrintWriter)localObject1).close();
        }
        mBackStack.add(paramParcelable);
      }
    }
    mBackStack = null;
    mBackStackIndex.set(mBackStackIndex);
    paramParcelable = mPrimaryNavActiveWho;
    if (paramParcelable != null)
    {
      paramParcelable = findActiveFragment(paramParcelable);
      mPrimaryNav = paramParcelable;
      dispatchParentPrimaryNavigationFragmentChanged(paramParcelable);
    }
    localObject1 = mResultKeys;
    if (localObject1 != null) {
      for (j = i; j < ((ArrayList)localObject1).size(); j++)
      {
        paramParcelable = (Bundle)mResults.get(j);
        paramParcelable.setClassLoader(mHost.getContext().getClassLoader());
        mResults.put(((ArrayList)localObject1).get(j), paramParcelable);
      }
    }
    mLaunchedFragments = new ArrayDeque(mLaunchedFragments);
  }
  
  @Deprecated
  public FragmentManagerNonConfig retainNonConfig()
  {
    if ((mHost instanceof ViewModelStoreOwner)) {
      throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
    }
    return mNonConfig.getSnapshot();
  }
  
  public Parcelable saveAllState()
  {
    forcePostponedTransactions();
    endAnimatingAwayFragments();
    execPendingActions(true);
    mStateSaved = true;
    mNonConfig.setIsStateSaved(true);
    ArrayList localArrayList1 = mFragmentStore.saveActiveFragments();
    boolean bool = localArrayList1.isEmpty();
    Object localObject1 = null;
    if (bool)
    {
      if (isLoggingEnabled(2)) {
        Log.v("FragmentManager", "saveAllState: no fragments!");
      }
      return null;
    }
    ArrayList localArrayList2 = mFragmentStore.saveAddedFragments();
    ArrayList localArrayList3 = mBackStack;
    Object localObject2 = localObject1;
    if (localArrayList3 != null)
    {
      int i = localArrayList3.size();
      localObject2 = localObject1;
      if (i > 0)
      {
        localObject1 = new BackStackState[i];
        for (int j = 0;; j++)
        {
          localObject2 = localObject1;
          if (j >= i) {
            break;
          }
          localObject1[j] = new BackStackState((BackStackRecord)mBackStack.get(j));
          if (isLoggingEnabled(2))
          {
            localObject2 = a.r("saveAllState: adding back stack #", j, ": ");
            ((StringBuilder)localObject2).append(mBackStack.get(j));
            Log.v("FragmentManager", ((StringBuilder)localObject2).toString());
          }
        }
      }
    }
    localObject1 = new FragmentManagerState();
    mActive = localArrayList1;
    mAdded = localArrayList2;
    mBackStack = ((BackStackState[])localObject2);
    mBackStackIndex = mBackStackIndex.get();
    localObject2 = mPrimaryNav;
    if (localObject2 != null) {
      mPrimaryNavActiveWho = mWho;
    }
    mResultKeys.addAll(mResults.keySet());
    mResults.addAll(mResults.values());
    mLaunchedFragments = new ArrayList(mLaunchedFragments);
    return (Parcelable)localObject1;
  }
  
  @Nullable
  public Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment paramFragment)
  {
    FragmentStateManager localFragmentStateManager = mFragmentStore.getFragmentStateManager(mWho);
    if ((localFragmentStateManager == null) || (!localFragmentStateManager.getFragment().equals(paramFragment))) {
      throwException(new IllegalStateException(a.j("Fragment ", paramFragment, " is not currently in the FragmentManager")));
    }
    return localFragmentStateManager.saveInstanceState();
  }
  
  public void scheduleCommit()
  {
    synchronized (mPendingActions)
    {
      ArrayList localArrayList2 = mPostponedTransactions;
      int i = 0;
      int j;
      if ((localArrayList2 != null) && (!localArrayList2.isEmpty())) {
        j = 1;
      } else {
        j = 0;
      }
      if (mPendingActions.size() == 1) {
        i = 1;
      }
      if ((j != 0) || (i != 0))
      {
        mHost.getHandler().removeCallbacks(mExecCommit);
        mHost.getHandler().post(mExecCommit);
        updateOnBackPressedCallbackEnabled();
      }
      return;
    }
  }
  
  public void setExitAnimationOrder(@NonNull Fragment paramFragment, boolean paramBoolean)
  {
    paramFragment = getFragmentContainer(paramFragment);
    if ((paramFragment != null) && ((paramFragment instanceof FragmentContainerView))) {
      ((FragmentContainerView)paramFragment).setDrawDisappearingViewsLast(paramBoolean ^ true);
    }
  }
  
  public void setFragmentFactory(@NonNull FragmentFactory paramFragmentFactory)
  {
    mFragmentFactory = paramFragmentFactory;
  }
  
  public final void setFragmentResult(@NonNull String paramString, @NonNull Bundle paramBundle)
  {
    LifecycleAwareResultListener localLifecycleAwareResultListener = (LifecycleAwareResultListener)mResultListeners.get(paramString);
    if ((localLifecycleAwareResultListener != null) && (localLifecycleAwareResultListener.isAtLeast(Lifecycle.State.STARTED))) {
      localLifecycleAwareResultListener.onFragmentResult(paramString, paramBundle);
    } else {
      mResults.put(paramString, paramBundle);
    }
  }
  
  @SuppressLint({"SyntheticAccessor"})
  public final void setFragmentResultListener(@NonNull final String paramString, @NonNull final LifecycleOwner paramLifecycleOwner, @NonNull final FragmentResultListener paramFragmentResultListener)
  {
    paramLifecycleOwner = paramLifecycleOwner.getLifecycle();
    if (paramLifecycleOwner.getCurrentState() == Lifecycle.State.DESTROYED) {
      return;
    }
    LifecycleEventObserver local6 = new LifecycleEventObserver()
    {
      public void onStateChanged(@NonNull LifecycleOwner paramAnonymousLifecycleOwner, @NonNull Lifecycle.Event paramAnonymousEvent)
      {
        if (paramAnonymousEvent == Lifecycle.Event.ON_START)
        {
          paramAnonymousLifecycleOwner = (Bundle)FragmentManager.access$000(FragmentManager.this).get(paramString);
          if (paramAnonymousLifecycleOwner != null)
          {
            paramFragmentResultListener.onFragmentResult(paramString, paramAnonymousLifecycleOwner);
            clearFragmentResult(paramString);
          }
        }
        if (paramAnonymousEvent == Lifecycle.Event.ON_DESTROY)
        {
          paramLifecycleOwner.removeObserver(this);
          FragmentManager.access$100(FragmentManager.this).remove(paramString);
        }
      }
    };
    paramLifecycleOwner.addObserver(local6);
    paramString = (LifecycleAwareResultListener)mResultListeners.put(paramString, new LifecycleAwareResultListener(paramLifecycleOwner, paramFragmentResultListener, local6));
    if (paramString != null) {
      paramString.removeObserver();
    }
  }
  
  public void setMaxLifecycle(@NonNull Fragment paramFragment, @NonNull Lifecycle.State paramState)
  {
    if ((paramFragment.equals(findActiveFragment(mWho))) && ((mHost == null) || (mFragmentManager == this)))
    {
      mMaxState = paramState;
      return;
    }
    paramState = new StringBuilder();
    paramState.append("Fragment ");
    paramState.append(paramFragment);
    paramState.append(" is not an active fragment of FragmentManager ");
    paramState.append(this);
    throw new IllegalArgumentException(paramState.toString());
  }
  
  public void setPrimaryNavigationFragment(@Nullable Fragment paramFragment)
  {
    if ((paramFragment != null) && ((!paramFragment.equals(findActiveFragment(mWho))) || ((mHost != null) && (mFragmentManager != this))))
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Fragment ");
      ((StringBuilder)localObject).append(paramFragment);
      ((StringBuilder)localObject).append(" is not an active fragment of FragmentManager ");
      ((StringBuilder)localObject).append(this);
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    Object localObject = mPrimaryNav;
    mPrimaryNav = paramFragment;
    dispatchParentPrimaryNavigationFragmentChanged((Fragment)localObject);
    dispatchParentPrimaryNavigationFragmentChanged(mPrimaryNav);
  }
  
  public void setSpecialEffectsControllerFactory(@NonNull SpecialEffectsControllerFactory paramSpecialEffectsControllerFactory)
  {
    mSpecialEffectsControllerFactory = paramSpecialEffectsControllerFactory;
  }
  
  public void showFragment(@NonNull Fragment paramFragment)
  {
    if (isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("show: ");
      localStringBuilder.append(paramFragment);
      Log.v("FragmentManager", localStringBuilder.toString());
    }
    if (mHidden)
    {
      mHidden = false;
      mHiddenChanged ^= true;
    }
  }
  
  @NonNull
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    Object localObject = mParent;
    if (localObject != null)
    {
      localStringBuilder.append(localObject.getClass().getSimpleName());
      localStringBuilder.append("{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(mParent)));
      localStringBuilder.append("}");
    }
    else
    {
      localObject = mHost;
      if (localObject != null)
      {
        localStringBuilder.append(localObject.getClass().getSimpleName());
        localStringBuilder.append("{");
        localStringBuilder.append(Integer.toHexString(System.identityHashCode(mHost)));
        localStringBuilder.append("}");
      }
      else
      {
        localStringBuilder.append("null");
      }
    }
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
  
  public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks paramFragmentLifecycleCallbacks)
  {
    mLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(paramFragmentLifecycleCallbacks);
  }
  
  public static abstract interface BackStackEntry
  {
    @Deprecated
    @Nullable
    public abstract CharSequence getBreadCrumbShortTitle();
    
    @Deprecated
    @StringRes
    public abstract int getBreadCrumbShortTitleRes();
    
    @Deprecated
    @Nullable
    public abstract CharSequence getBreadCrumbTitle();
    
    @Deprecated
    @StringRes
    public abstract int getBreadCrumbTitleRes();
    
    public abstract int getId();
    
    @Nullable
    public abstract String getName();
  }
  
  public static class FragmentIntentSenderContract
    extends ActivityResultContract<IntentSenderRequest, ActivityResult>
  {
    @NonNull
    public Intent createIntent(@NonNull Context paramContext, IntentSenderRequest paramIntentSenderRequest)
    {
      Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
      Intent localIntent2 = paramIntentSenderRequest.getFillInIntent();
      paramContext = paramIntentSenderRequest;
      if (localIntent2 != null)
      {
        Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramContext = paramIntentSenderRequest;
        if (localBundle != null)
        {
          localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
          localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
          paramContext = paramIntentSenderRequest;
          if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
            paramContext = new IntentSenderRequest.Builder(paramIntentSenderRequest.getIntentSender()).setFillInIntent(null).setFlags(paramIntentSenderRequest.getFlagsValues(), paramIntentSenderRequest.getFlagsMask()).build();
          }
        }
      }
      localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramContext);
      if (FragmentManager.isLoggingEnabled(2))
      {
        paramContext = new StringBuilder();
        paramContext.append("CreateIntent created the following intent: ");
        paramContext.append(localIntent1);
        Log.v("FragmentManager", paramContext.toString());
      }
      return localIntent1;
    }
    
    @NonNull
    public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      return new ActivityResult(paramInt, paramIntent);
    }
  }
  
  public static abstract class FragmentLifecycleCallbacks
  {
    @Deprecated
    public void onFragmentActivityCreated(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @Nullable Bundle paramBundle) {}
    
    public void onFragmentAttached(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @NonNull Context paramContext) {}
    
    public void onFragmentCreated(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @Nullable Bundle paramBundle) {}
    
    public void onFragmentDestroyed(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentDetached(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentPaused(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentPreAttached(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @NonNull Context paramContext) {}
    
    public void onFragmentPreCreated(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @Nullable Bundle paramBundle) {}
    
    public void onFragmentResumed(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentSaveInstanceState(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @NonNull Bundle paramBundle) {}
    
    public void onFragmentStarted(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentStopped(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
    
    public void onFragmentViewCreated(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment, @NonNull View paramView, @Nullable Bundle paramBundle) {}
    
    public void onFragmentViewDestroyed(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment) {}
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class LaunchedFragmentInfo
    implements Parcelable
  {
    public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator()
    {
      public FragmentManager.LaunchedFragmentInfo createFromParcel(Parcel paramAnonymousParcel)
      {
        return new FragmentManager.LaunchedFragmentInfo(paramAnonymousParcel);
      }
      
      public FragmentManager.LaunchedFragmentInfo[] newArray(int paramAnonymousInt)
      {
        return new FragmentManager.LaunchedFragmentInfo[paramAnonymousInt];
      }
    };
    public int mRequestCode;
    public String mWho;
    
    public LaunchedFragmentInfo(@NonNull Parcel paramParcel)
    {
      mWho = paramParcel.readString();
      mRequestCode = paramParcel.readInt();
    }
    
    public LaunchedFragmentInfo(@NonNull String paramString, int paramInt)
    {
      mWho = paramString;
      mRequestCode = paramInt;
    }
    
    public int describeContents()
    {
      return 0;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      paramParcel.writeString(mWho);
      paramParcel.writeInt(mRequestCode);
    }
  }
  
  public static class LifecycleAwareResultListener
    implements FragmentResultListener
  {
    private final Lifecycle mLifecycle;
    private final FragmentResultListener mListener;
    private final LifecycleEventObserver mObserver;
    
    public LifecycleAwareResultListener(@NonNull Lifecycle paramLifecycle, @NonNull FragmentResultListener paramFragmentResultListener, @NonNull LifecycleEventObserver paramLifecycleEventObserver)
    {
      mLifecycle = paramLifecycle;
      mListener = paramFragmentResultListener;
      mObserver = paramLifecycleEventObserver;
    }
    
    public boolean isAtLeast(Lifecycle.State paramState)
    {
      return mLifecycle.getCurrentState().isAtLeast(paramState);
    }
    
    public void onFragmentResult(@NonNull String paramString, @NonNull Bundle paramBundle)
    {
      mListener.onFragmentResult(paramString, paramBundle);
    }
    
    public void removeObserver()
    {
      mLifecycle.removeObserver(mObserver);
    }
  }
  
  public static abstract interface OnBackStackChangedListener
  {
    @MainThread
    public abstract void onBackStackChanged();
  }
  
  public static abstract interface OpGenerator
  {
    public abstract boolean generateOps(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1);
  }
  
  public class PopBackStackState
    implements FragmentManager.OpGenerator
  {
    public final int mFlags;
    public final int mId;
    public final String mName;
    
    public PopBackStackState(String paramString, int paramInt1, int paramInt2)
    {
      mName = paramString;
      mId = paramInt1;
      mFlags = paramInt2;
    }
    
    public boolean generateOps(@NonNull ArrayList<BackStackRecord> paramArrayList, @NonNull ArrayList<Boolean> paramArrayList1)
    {
      Fragment localFragment = mPrimaryNav;
      if ((localFragment != null) && (mId < 0) && (mName == null) && (localFragment.getChildFragmentManager().popBackStackImmediate())) {
        return false;
      }
      return popBackStackState(paramArrayList, paramArrayList1, mName, mId, mFlags);
    }
  }
  
  public static class StartEnterTransitionListener
    implements Fragment.OnStartEnterTransitionListener
  {
    public final boolean mIsBack;
    private int mNumPostponed;
    public final BackStackRecord mRecord;
    
    public StartEnterTransitionListener(@NonNull BackStackRecord paramBackStackRecord, boolean paramBoolean)
    {
      mIsBack = paramBoolean;
      mRecord = paramBackStackRecord;
    }
    
    public void cancelTransaction()
    {
      BackStackRecord localBackStackRecord = mRecord;
      mManager.completeExecute(localBackStackRecord, mIsBack, false, false);
    }
    
    public void completeTransaction()
    {
      int i;
      if (mNumPostponed > 0) {
        i = 1;
      } else {
        i = 0;
      }
      Iterator localIterator = mRecord.mManager.getFragments().iterator();
      while (localIterator.hasNext())
      {
        localObject = (Fragment)localIterator.next();
        ((Fragment)localObject).setOnStartEnterTransitionListener(null);
        if ((i != 0) && (((Fragment)localObject).isPostponed())) {
          ((Fragment)localObject).startPostponedEnterTransition();
        }
      }
      Object localObject = mRecord;
      mManager.completeExecute((BackStackRecord)localObject, mIsBack, i ^ 0x1, true);
    }
    
    public boolean isReady()
    {
      boolean bool;
      if (mNumPostponed == 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public void onStartEnterTransition()
    {
      int i = mNumPostponed - 1;
      mNumPostponed = i;
      if (i != 0) {
        return;
      }
      mRecord.mManager.scheduleCommit();
    }
    
    public void startListening()
    {
      mNumPostponed += 1;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */