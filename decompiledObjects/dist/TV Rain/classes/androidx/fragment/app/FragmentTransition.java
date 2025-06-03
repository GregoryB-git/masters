package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.transition.FragmentTransitionSupport;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class FragmentTransition
{
  private static final int[] INVERSE_OPS = { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10 };
  public static final FragmentTransitionImpl PLATFORM_IMPL = new FragmentTransitionCompat21();
  public static final FragmentTransitionImpl SUPPORT_IMPL = resolveSupportImpl();
  
  private static void addSharedElementsWithMatchingNames(ArrayList<View> paramArrayList, ArrayMap<String, View> paramArrayMap, Collection<String> paramCollection)
  {
    for (int i = paramArrayMap.size() - 1; i >= 0; i--)
    {
      View localView = (View)paramArrayMap.valueAt(i);
      if (paramCollection.contains(ViewCompat.getTransitionName(localView))) {
        paramArrayList.add(localView);
      }
    }
  }
  
  private static void addToFirstInLastOut(BackStackRecord paramBackStackRecord, FragmentTransaction.Op paramOp, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    Fragment localFragment = mFragment;
    if (localFragment == null) {
      return;
    }
    int i = mContainerId;
    if (i == 0) {
      return;
    }
    if (paramBoolean1) {
      j = INVERSE_OPS[mCmd];
    } else {
      j = mCmd;
    }
    boolean bool = false;
    int k = 1;
    if (j != 1)
    {
      if (j != 3) {
        if (j != 4)
        {
          if (j != 5)
          {
            if (j != 6)
            {
              if (j == 7) {
                break label283;
              }
              m = 0;
              j = m;
              n = j;
              break label334;
            }
          }
          else
          {
            if (paramBoolean2)
            {
              if ((!mHiddenChanged) || (mHidden) || (!mAdded)) {
                break label320;
              }
              break label314;
            }
            bool = mHidden;
            break label323;
          }
        }
        else
        {
          if (paramBoolean2) {
            if ((!mHiddenChanged) || (!mAdded) || (!mHidden)) {
              break label245;
            }
          }
          for (;;)
          {
            break;
            if ((!mAdded) || (mHidden)) {
              break label245;
            }
          }
        }
      }
      if (paramBoolean2) {
        if (!mAdded)
        {
          paramOp = mView;
          if ((paramOp == null) || (paramOp.getVisibility() != 0) || (mPostponedAlpha < 0.0F)) {}
        }
      }
      for (;;)
      {
        j = 1;
        break;
        label245:
        do
        {
          j = 0;
          break;
        } while ((!mAdded) || (mHidden));
      }
      n = j;
      m = 1;
      j = 0;
      break label334;
    }
    label283:
    if (paramBoolean2) {
      bool = mIsNewlyAdded;
    } else if ((!mAdded) && (!mHidden)) {
      label314:
      bool = true;
    } else {
      label320:
      bool = false;
    }
    label323:
    int n = 0;
    int m = n;
    int j = k;
    label334:
    Object localObject = (FragmentContainerTransition)paramSparseArray.get(i);
    paramOp = (FragmentTransaction.Op)localObject;
    if (bool)
    {
      paramOp = ensureContainer((FragmentContainerTransition)localObject, paramSparseArray, i);
      lastIn = localFragment;
      lastInIsPop = paramBoolean1;
      lastInTransaction = paramBackStackRecord;
    }
    if ((!paramBoolean2) && (j != 0))
    {
      if ((paramOp != null) && (firstOut == localFragment)) {
        firstOut = null;
      }
      if (!mReorderingAllowed)
      {
        FragmentManager localFragmentManager = mManager;
        localObject = localFragmentManager.createOrGetFragmentStateManager(localFragment);
        localFragmentManager.getFragmentStore().makeActive((FragmentStateManager)localObject);
        localFragmentManager.moveToState(localFragment);
      }
    }
    localObject = paramOp;
    if (n != 0) {
      if (paramOp != null)
      {
        localObject = paramOp;
        if (firstOut != null) {}
      }
      else
      {
        localObject = ensureContainer(paramOp, paramSparseArray, i);
        firstOut = localFragment;
        firstOutIsPop = paramBoolean1;
        firstOutTransaction = paramBackStackRecord;
      }
    }
    if ((!paramBoolean2) && (m != 0) && (localObject != null) && (lastIn == localFragment)) {
      lastIn = null;
    }
  }
  
  public static void calculateFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    int i = mOps.size();
    for (int j = 0; j < i; j++) {
      addToFirstInLastOut(paramBackStackRecord, (FragmentTransaction.Op)mOps.get(j), paramSparseArray, false, paramBoolean);
    }
  }
  
  private static ArrayMap<String, String> calculateNameOverrides(int paramInt1, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3)
  {
    ArrayMap localArrayMap = new ArrayMap();
    paramInt3--;
    while (paramInt3 >= paramInt2)
    {
      Object localObject = (BackStackRecord)paramArrayList.get(paramInt3);
      if (((BackStackRecord)localObject).interactsWith(paramInt1))
      {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        ArrayList localArrayList1 = mSharedElementSourceNames;
        if (localArrayList1 != null)
        {
          int i = localArrayList1.size();
          ArrayList localArrayList2;
          if (bool)
          {
            localArrayList1 = mSharedElementSourceNames;
            localArrayList2 = mSharedElementTargetNames;
          }
          else
          {
            localArrayList2 = mSharedElementSourceNames;
            localArrayList1 = mSharedElementTargetNames;
          }
          for (int j = 0; j < i; j++)
          {
            String str1 = (String)localArrayList2.get(j);
            localObject = (String)localArrayList1.get(j);
            String str2 = (String)localArrayMap.remove(localObject);
            if (str2 != null) {
              localArrayMap.put(str1, str2);
            } else {
              localArrayMap.put(str1, localObject);
            }
          }
        }
      }
      paramInt3--;
    }
    return localArrayMap;
  }
  
  public static void calculatePopFragments(BackStackRecord paramBackStackRecord, SparseArray<FragmentContainerTransition> paramSparseArray, boolean paramBoolean)
  {
    if (!mManager.getContainer().onHasView()) {
      return;
    }
    for (int i = mOps.size() - 1; i >= 0; i--) {
      addToFirstInLastOut(paramBackStackRecord, (FragmentTransaction.Op)mOps.get(i), paramSparseArray, true, paramBoolean);
    }
  }
  
  public static void callSharedElementStartEnd(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean1, ArrayMap<String, View> paramArrayMap, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      paramFragment1 = paramFragment2.getEnterTransitionCallback();
    } else {
      paramFragment1 = paramFragment1.getEnterTransitionCallback();
    }
    if (paramFragment1 != null)
    {
      paramFragment2 = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      int j;
      if (paramArrayMap == null) {
        j = 0;
      } else {
        j = paramArrayMap.size();
      }
      while (i < j)
      {
        localArrayList.add(paramArrayMap.keyAt(i));
        paramFragment2.add(paramArrayMap.valueAt(i));
        i++;
      }
      if (paramBoolean2) {
        paramFragment1.onSharedElementStart(localArrayList, paramFragment2, null);
      } else {
        paramFragment1.onSharedElementEnd(localArrayList, paramFragment2, null);
      }
    }
  }
  
  private static boolean canHandleAll(FragmentTransitionImpl paramFragmentTransitionImpl, List<Object> paramList)
  {
    int i = paramList.size();
    for (int j = 0; j < i; j++) {
      if (!paramFragmentTransitionImpl.canHandle(paramList.get(j))) {
        return false;
      }
    }
    return true;
  }
  
  public static ArrayMap<String, View> captureInSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayMap<String, String> paramArrayMap, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    Fragment localFragment = lastIn;
    View localView = localFragment.getView();
    if ((!paramArrayMap.isEmpty()) && (paramObject != null) && (localView != null))
    {
      ArrayMap localArrayMap = new ArrayMap();
      paramFragmentTransitionImpl.findNamedViews(localArrayMap, localView);
      paramFragmentTransitionImpl = lastInTransaction;
      if (lastInIsPop)
      {
        paramObject = localFragment.getExitTransitionCallback();
        paramFragmentTransitionImpl = mSharedElementSourceNames;
      }
      else
      {
        paramObject = localFragment.getEnterTransitionCallback();
        paramFragmentTransitionImpl = mSharedElementTargetNames;
      }
      if (paramFragmentTransitionImpl != null)
      {
        localArrayMap.retainAll(paramFragmentTransitionImpl);
        localArrayMap.retainAll(paramArrayMap.values());
      }
      if (paramObject != null)
      {
        ((SharedElementCallback)paramObject).onMapSharedElements(paramFragmentTransitionImpl, localArrayMap);
        for (int i = paramFragmentTransitionImpl.size() - 1; i >= 0; i--)
        {
          paramFragmentContainerTransition = (String)paramFragmentTransitionImpl.get(i);
          paramObject = (View)localArrayMap.get(paramFragmentContainerTransition);
          if (paramObject == null)
          {
            paramObject = findKeyForValue(paramArrayMap, paramFragmentContainerTransition);
            if (paramObject != null) {
              paramArrayMap.remove(paramObject);
            }
          }
          else if (!paramFragmentContainerTransition.equals(ViewCompat.getTransitionName((View)paramObject)))
          {
            paramFragmentContainerTransition = findKeyForValue(paramArrayMap, paramFragmentContainerTransition);
            if (paramFragmentContainerTransition != null) {
              paramArrayMap.put(paramFragmentContainerTransition, ViewCompat.getTransitionName((View)paramObject));
            }
          }
        }
      }
      retainValues(paramArrayMap, localArrayMap);
      return localArrayMap;
    }
    paramArrayMap.clear();
    return null;
  }
  
  private static ArrayMap<String, View> captureOutSharedElements(FragmentTransitionImpl paramFragmentTransitionImpl, ArrayMap<String, String> paramArrayMap, Object paramObject, FragmentContainerTransition paramFragmentContainerTransition)
  {
    if ((!paramArrayMap.isEmpty()) && (paramObject != null))
    {
      paramObject = firstOut;
      ArrayMap localArrayMap = new ArrayMap();
      paramFragmentTransitionImpl.findNamedViews(localArrayMap, ((Fragment)paramObject).requireView());
      paramFragmentTransitionImpl = firstOutTransaction;
      if (firstOutIsPop)
      {
        paramObject = ((Fragment)paramObject).getEnterTransitionCallback();
        paramFragmentTransitionImpl = mSharedElementTargetNames;
      }
      else
      {
        paramObject = ((Fragment)paramObject).getExitTransitionCallback();
        paramFragmentTransitionImpl = mSharedElementSourceNames;
      }
      if (paramFragmentTransitionImpl != null) {
        localArrayMap.retainAll(paramFragmentTransitionImpl);
      }
      if (paramObject != null)
      {
        ((SharedElementCallback)paramObject).onMapSharedElements(paramFragmentTransitionImpl, localArrayMap);
        for (int i = paramFragmentTransitionImpl.size() - 1; i >= 0; i--)
        {
          paramFragmentContainerTransition = (String)paramFragmentTransitionImpl.get(i);
          paramObject = (View)localArrayMap.get(paramFragmentContainerTransition);
          if (paramObject == null)
          {
            paramArrayMap.remove(paramFragmentContainerTransition);
          }
          else if (!paramFragmentContainerTransition.equals(ViewCompat.getTransitionName((View)paramObject)))
          {
            paramFragmentContainerTransition = (String)paramArrayMap.remove(paramFragmentContainerTransition);
            paramArrayMap.put(ViewCompat.getTransitionName((View)paramObject), paramFragmentContainerTransition);
          }
        }
      }
      paramArrayMap.retainAll(localArrayMap.keySet());
      return localArrayMap;
    }
    paramArrayMap.clear();
    return null;
  }
  
  private static FragmentTransitionImpl chooseImpl(Fragment paramFragment1, Fragment paramFragment2)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramFragment1 != null)
    {
      Object localObject = paramFragment1.getExitTransition();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      localObject = paramFragment1.getReturnTransition();
      if (localObject != null) {
        localArrayList.add(localObject);
      }
      paramFragment1 = paramFragment1.getSharedElementReturnTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (paramFragment2 != null)
    {
      paramFragment1 = paramFragment2.getEnterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.getReenterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
      paramFragment1 = paramFragment2.getSharedElementEnterTransition();
      if (paramFragment1 != null) {
        localArrayList.add(paramFragment1);
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    paramFragment1 = PLATFORM_IMPL;
    if ((paramFragment1 != null) && (canHandleAll(paramFragment1, localArrayList))) {
      return paramFragment1;
    }
    paramFragment2 = SUPPORT_IMPL;
    if ((paramFragment2 != null) && (canHandleAll(paramFragment2, localArrayList))) {
      return paramFragment2;
    }
    if ((paramFragment1 == null) && (paramFragment2 == null)) {
      return null;
    }
    throw new IllegalArgumentException("Invalid Transition types");
  }
  
  public static ArrayList<View> configureEnteringExitingViews(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView)
  {
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramFragment = paramFragment.getView();
      if (paramFragment != null) {
        paramFragmentTransitionImpl.captureTransitioningViews(localArrayList, paramFragment);
      }
      if (paramArrayList != null) {
        localArrayList.removeAll(paramArrayList);
      }
      paramFragment = localArrayList;
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        paramFragmentTransitionImpl.addTargets(paramObject, localArrayList);
        paramFragment = localArrayList;
      }
    }
    else
    {
      paramFragment = null;
    }
    return paramFragment;
  }
  
  private static Object configureSharedElementsOrdered(FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final View paramView, final ArrayMap<String, String> paramArrayMap, final FragmentContainerTransition paramFragmentContainerTransition, final ArrayList<View> paramArrayList1, final ArrayList<View> paramArrayList2, final Object paramObject1, final Object paramObject2)
  {
    final Fragment localFragment1 = lastIn;
    final Fragment localFragment2 = firstOut;
    if ((localFragment1 != null) && (localFragment2 != null))
    {
      final boolean bool = lastInIsPop;
      final Object localObject;
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        localObject = getSharedElementTransition(paramFragmentTransitionImpl, localFragment1, localFragment2, bool);
      }
      ArrayMap localArrayMap = captureOutSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        paramArrayList1.addAll(localArrayMap.values());
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (localObject == null)) {
        return null;
      }
      callSharedElementStartEnd(localFragment1, localFragment2, bool, localArrayMap, true);
      if (localObject != null)
      {
        Rect localRect = new Rect();
        paramFragmentTransitionImpl.setSharedElementTargets(localObject, paramView, paramArrayList1);
        setOutEpicenter(paramFragmentTransitionImpl, localObject, paramObject2, localArrayMap, firstOutIsPop, firstOutTransaction);
        paramObject2 = localRect;
        if (paramObject1 != null)
        {
          paramFragmentTransitionImpl.setEpicenter(paramObject1, localRect);
          paramObject2 = localRect;
        }
      }
      else
      {
        paramObject2 = null;
      }
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        public void run()
        {
          ArrayMap localArrayMap = FragmentTransition.captureInSharedElements(FragmentTransition.this, paramArrayMap, localObject, paramFragmentContainerTransition);
          if (localArrayMap != null)
          {
            paramArrayList2.addAll(localArrayMap.values());
            paramArrayList2.add(paramView);
          }
          FragmentTransition.callSharedElementStartEnd(localFragment1, localFragment2, bool, localArrayMap, false);
          Object localObject = localObject;
          if (localObject != null)
          {
            swapSharedElementTargets(localObject, paramArrayList1, paramArrayList2);
            localObject = FragmentTransition.getInEpicenterView(localArrayMap, paramFragmentContainerTransition, paramObject1, bool);
            if (localObject != null) {
              getBoundsOnScreen((View)localObject, paramObject2);
            }
          }
        }
      });
      return localObject;
    }
    return null;
  }
  
  private static Object configureSharedElementsReordered(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final View paramView, ArrayMap<String, String> paramArrayMap, final FragmentContainerTransition paramFragmentContainerTransition, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2, Object paramObject1, Object paramObject2)
  {
    Fragment localFragment1 = lastIn;
    final Fragment localFragment2 = firstOut;
    if (localFragment1 != null) {
      localFragment1.requireView().setVisibility(0);
    }
    if ((localFragment1 != null) && (localFragment2 != null))
    {
      final boolean bool = lastInIsPop;
      Object localObject;
      if (paramArrayMap.isEmpty()) {
        localObject = null;
      } else {
        localObject = getSharedElementTransition(paramFragmentTransitionImpl, localFragment1, localFragment2, bool);
      }
      ArrayMap localArrayMap1 = captureOutSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      final ArrayMap localArrayMap2 = captureInSharedElements(paramFragmentTransitionImpl, paramArrayMap, localObject, paramFragmentContainerTransition);
      if (paramArrayMap.isEmpty())
      {
        if (localArrayMap1 != null) {
          localArrayMap1.clear();
        }
        if (localArrayMap2 != null) {
          localArrayMap2.clear();
        }
        paramArrayMap = null;
      }
      else
      {
        addSharedElementsWithMatchingNames(paramArrayList1, localArrayMap1, paramArrayMap.keySet());
        addSharedElementsWithMatchingNames(paramArrayList2, localArrayMap2, paramArrayMap.values());
        paramArrayMap = (ArrayMap<String, String>)localObject;
      }
      if ((paramObject1 == null) && (paramObject2 == null) && (paramArrayMap == null)) {
        return null;
      }
      callSharedElementStartEnd(localFragment1, localFragment2, bool, localArrayMap1, true);
      if (paramArrayMap != null)
      {
        paramArrayList2.add(paramView);
        paramFragmentTransitionImpl.setSharedElementTargets(paramArrayMap, paramView, paramArrayList1);
        setOutEpicenter(paramFragmentTransitionImpl, paramArrayMap, paramObject2, localArrayMap1, firstOutIsPop, firstOutTransaction);
        paramView = new Rect();
        paramFragmentContainerTransition = getInEpicenterView(localArrayMap2, paramFragmentContainerTransition, paramObject1, bool);
        if (paramFragmentContainerTransition != null) {
          paramFragmentTransitionImpl.setEpicenter(paramObject1, paramView);
        }
      }
      else
      {
        paramFragmentContainerTransition = null;
        paramView = paramFragmentContainerTransition;
      }
      OneShotPreDrawListener.add(paramViewGroup, new Runnable()
      {
        public void run()
        {
          FragmentTransition.callSharedElementStartEnd(FragmentTransition.this, localFragment2, bool, localArrayMap2, false);
          View localView = paramFragmentContainerTransition;
          if (localView != null) {
            paramFragmentTransitionImpl.getBoundsOnScreen(localView, paramView);
          }
        }
      });
      return paramArrayMap;
    }
    return null;
  }
  
  private static void configureTransitionsOrdered(@NonNull ViewGroup paramViewGroup, FragmentContainerTransition paramFragmentContainerTransition, View paramView, ArrayMap<String, String> paramArrayMap, Callback paramCallback)
  {
    Fragment localFragment1 = lastIn;
    final Fragment localFragment2 = firstOut;
    FragmentTransitionImpl localFragmentTransitionImpl = chooseImpl(localFragment2, localFragment1);
    if (localFragmentTransitionImpl == null) {
      return;
    }
    boolean bool1 = lastInIsPop;
    boolean bool2 = firstOutIsPop;
    Object localObject1 = getEnterTransition(localFragmentTransitionImpl, localFragment1, bool1);
    Object localObject2 = getExitTransition(localFragmentTransitionImpl, localFragment2, bool2);
    final Object localObject3 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject4 = configureSharedElementsOrdered(localFragmentTransitionImpl, paramViewGroup, paramView, paramArrayMap, paramFragmentContainerTransition, (ArrayList)localObject3, localArrayList1, localObject1, localObject2);
    if ((localObject1 == null) && (localObject4 == null) && (localObject2 == null)) {
      return;
    }
    ArrayList localArrayList2 = configureEnteringExitingViews(localFragmentTransitionImpl, localObject2, localFragment2, (ArrayList)localObject3, paramView);
    if ((localArrayList2 == null) || (localArrayList2.isEmpty())) {
      localObject2 = null;
    }
    localFragmentTransitionImpl.addTarget(localObject1, paramView);
    paramFragmentContainerTransition = mergeTransitions(localFragmentTransitionImpl, localObject1, localObject2, localObject4, localFragment1, lastInIsPop);
    if ((localFragment2 != null) && (localArrayList2 != null) && ((localArrayList2.size() > 0) || (((ArrayList)localObject3).size() > 0)))
    {
      localObject3 = new CancellationSignal();
      paramCallback.onStart(localFragment2, (CancellationSignal)localObject3);
      localFragmentTransitionImpl.setListenerForTransitionEnd(localFragment2, paramFragmentContainerTransition, (CancellationSignal)localObject3, new Runnable()
      {
        public void run()
        {
          onComplete(localFragment2, localObject3);
        }
      });
    }
    if (paramFragmentContainerTransition != null)
    {
      paramCallback = new ArrayList();
      localFragmentTransitionImpl.scheduleRemoveTargets(paramFragmentContainerTransition, localObject1, paramCallback, localObject2, localArrayList2, localObject4, localArrayList1);
      scheduleTargetChange(localFragmentTransitionImpl, paramViewGroup, localFragment1, paramView, localArrayList1, localObject1, paramCallback, localObject2, localArrayList2);
      localFragmentTransitionImpl.setNameOverridesOrdered(paramViewGroup, localArrayList1, paramArrayMap);
      localFragmentTransitionImpl.beginDelayedTransition(paramViewGroup, paramFragmentContainerTransition);
      localFragmentTransitionImpl.scheduleNameReset(paramViewGroup, localArrayList1, paramArrayMap);
    }
  }
  
  private static void configureTransitionsReordered(@NonNull ViewGroup paramViewGroup, FragmentContainerTransition paramFragmentContainerTransition, View paramView, ArrayMap<String, String> paramArrayMap, Callback paramCallback)
  {
    Object localObject1 = lastIn;
    final Fragment localFragment = firstOut;
    FragmentTransitionImpl localFragmentTransitionImpl = chooseImpl(localFragment, (Fragment)localObject1);
    if (localFragmentTransitionImpl == null) {
      return;
    }
    boolean bool1 = lastInIsPop;
    boolean bool2 = firstOutIsPop;
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject2 = getEnterTransition(localFragmentTransitionImpl, (Fragment)localObject1, bool1);
    Object localObject3 = getExitTransition(localFragmentTransitionImpl, localFragment, bool2);
    Object localObject4 = configureSharedElementsReordered(localFragmentTransitionImpl, paramViewGroup, paramView, paramArrayMap, paramFragmentContainerTransition, localArrayList2, localArrayList1, localObject2, localObject3);
    if ((localObject2 == null) && (localObject4 == null) && (localObject3 == null)) {
      return;
    }
    paramFragmentContainerTransition = (FragmentContainerTransition)localObject3;
    localObject3 = configureEnteringExitingViews(localFragmentTransitionImpl, paramFragmentContainerTransition, localFragment, localArrayList2, paramView);
    paramView = configureEnteringExitingViews(localFragmentTransitionImpl, localObject2, (Fragment)localObject1, localArrayList1, paramView);
    setViewVisibility(paramView, 4);
    localObject1 = mergeTransitions(localFragmentTransitionImpl, localObject2, paramFragmentContainerTransition, localObject4, (Fragment)localObject1, bool1);
    if ((localFragment != null) && (localObject3 != null) && ((((ArrayList)localObject3).size() > 0) || (localArrayList2.size() > 0)))
    {
      final CancellationSignal localCancellationSignal = new CancellationSignal();
      paramCallback.onStart(localFragment, localCancellationSignal);
      localFragmentTransitionImpl.setListenerForTransitionEnd(localFragment, localObject1, localCancellationSignal, new Runnable()
      {
        public void run()
        {
          onComplete(localFragment, localCancellationSignal);
        }
      });
    }
    if (localObject1 != null)
    {
      replaceHide(localFragmentTransitionImpl, paramFragmentContainerTransition, localFragment, (ArrayList)localObject3);
      paramCallback = localFragmentTransitionImpl.prepareSetNameOverridesReordered(localArrayList1);
      localFragmentTransitionImpl.scheduleRemoveTargets(localObject1, localObject2, paramView, paramFragmentContainerTransition, (ArrayList)localObject3, localObject4, localArrayList1);
      localFragmentTransitionImpl.beginDelayedTransition(paramViewGroup, localObject1);
      localFragmentTransitionImpl.setNameOverridesReordered(paramViewGroup, localArrayList2, localArrayList1, paramCallback, paramArrayMap);
      setViewVisibility(paramView, 0);
      localFragmentTransitionImpl.swapSharedElementTargets(localObject4, localArrayList2, localArrayList1);
    }
  }
  
  private static FragmentContainerTransition ensureContainer(FragmentContainerTransition paramFragmentContainerTransition, SparseArray<FragmentContainerTransition> paramSparseArray, int paramInt)
  {
    FragmentContainerTransition localFragmentContainerTransition = paramFragmentContainerTransition;
    if (paramFragmentContainerTransition == null)
    {
      localFragmentContainerTransition = new FragmentContainerTransition();
      paramSparseArray.put(paramInt, localFragmentContainerTransition);
    }
    return localFragmentContainerTransition;
  }
  
  public static String findKeyForValue(ArrayMap<String, String> paramArrayMap, String paramString)
  {
    int i = paramArrayMap.size();
    for (int j = 0; j < i; j++) {
      if (paramString.equals(paramArrayMap.valueAt(j))) {
        return (String)paramArrayMap.keyAt(j);
      }
    }
    return null;
  }
  
  private static Object getEnterTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.getReenterTransition();
    } else {
      paramFragment = paramFragment.getEnterTransition();
    }
    return paramFragmentTransitionImpl.cloneTransition(paramFragment);
  }
  
  private static Object getExitTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null) {
      return null;
    }
    if (paramBoolean) {
      paramFragment = paramFragment.getReturnTransition();
    } else {
      paramFragment = paramFragment.getExitTransition();
    }
    return paramFragmentTransitionImpl.cloneTransition(paramFragment);
  }
  
  public static View getInEpicenterView(ArrayMap<String, View> paramArrayMap, FragmentContainerTransition paramFragmentContainerTransition, Object paramObject, boolean paramBoolean)
  {
    paramFragmentContainerTransition = lastInTransaction;
    if ((paramObject != null) && (paramArrayMap != null))
    {
      paramObject = mSharedElementSourceNames;
      if ((paramObject != null) && (!((ArrayList)paramObject).isEmpty()))
      {
        if (paramBoolean) {
          paramFragmentContainerTransition = (String)mSharedElementSourceNames.get(0);
        } else {
          paramFragmentContainerTransition = (String)mSharedElementTargetNames.get(0);
        }
        return (View)paramArrayMap.get(paramFragmentContainerTransition);
      }
    }
    return null;
  }
  
  private static Object getSharedElementTransition(FragmentTransitionImpl paramFragmentTransitionImpl, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 != null) && (paramFragment2 != null))
    {
      if (paramBoolean) {
        paramFragment1 = paramFragment2.getSharedElementReturnTransition();
      } else {
        paramFragment1 = paramFragment1.getSharedElementEnterTransition();
      }
      return paramFragmentTransitionImpl.wrapTransitionInSet(paramFragmentTransitionImpl.cloneTransition(paramFragment1));
    }
    return null;
  }
  
  private static Object mergeTransitions(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    if ((paramObject1 != null) && (paramObject2 != null) && (paramFragment != null))
    {
      if (paramBoolean) {
        paramBoolean = paramFragment.getAllowReturnTransitionOverlap();
      } else {
        paramBoolean = paramFragment.getAllowEnterTransitionOverlap();
      }
    }
    else {
      paramBoolean = true;
    }
    if (paramBoolean) {
      paramFragmentTransitionImpl = paramFragmentTransitionImpl.mergeTransitionsTogether(paramObject2, paramObject1, paramObject3);
    } else {
      paramFragmentTransitionImpl = paramFragmentTransitionImpl.mergeTransitionsInSequence(paramObject2, paramObject1, paramObject3);
    }
    return paramFragmentTransitionImpl;
  }
  
  private static void replaceHide(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList)
  {
    if ((paramFragment != null) && (paramObject != null) && (mAdded) && (mHidden) && (mHiddenChanged))
    {
      paramFragment.setHideReplaced(true);
      paramFragmentTransitionImpl.scheduleHideFragmentView(paramObject, paramFragment.getView(), paramArrayList);
      OneShotPreDrawListener.add(mContainer, new Runnable()
      {
        public void run()
        {
          FragmentTransition.setViewVisibility(FragmentTransition.this, 4);
        }
      });
    }
  }
  
  private static FragmentTransitionImpl resolveSupportImpl()
  {
    try
    {
      FragmentTransitionImpl localFragmentTransitionImpl = (FragmentTransitionImpl)FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localFragmentTransitionImpl;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static void retainValues(@NonNull ArrayMap<String, String> paramArrayMap, @NonNull ArrayMap<String, View> paramArrayMap1)
  {
    for (int i = paramArrayMap.size() - 1; i >= 0; i--) {
      if (!paramArrayMap1.containsKey((String)paramArrayMap.valueAt(i))) {
        paramArrayMap.removeAt(i);
      }
    }
  }
  
  private static void scheduleTargetChange(final FragmentTransitionImpl paramFragmentTransitionImpl, ViewGroup paramViewGroup, final Fragment paramFragment, final View paramView, final ArrayList<View> paramArrayList1, Object paramObject1, final ArrayList<View> paramArrayList2, final Object paramObject2, final ArrayList<View> paramArrayList3)
  {
    OneShotPreDrawListener.add(paramViewGroup, new Runnable()
    {
      public void run()
      {
        Object localObject = FragmentTransition.this;
        if (localObject != null)
        {
          paramFragmentTransitionImpl.removeTarget(localObject, paramView);
          localObject = FragmentTransition.configureEnteringExitingViews(paramFragmentTransitionImpl, FragmentTransition.this, paramFragment, paramArrayList1, paramView);
          paramArrayList2.addAll((Collection)localObject);
        }
        if (paramArrayList3 != null)
        {
          if (paramObject2 != null)
          {
            localObject = new ArrayList();
            ((ArrayList)localObject).add(paramView);
            paramFragmentTransitionImpl.replaceTargets(paramObject2, paramArrayList3, (ArrayList)localObject);
          }
          paramArrayList3.clear();
          paramArrayList3.add(paramView);
        }
      }
    });
  }
  
  private static void setOutEpicenter(FragmentTransitionImpl paramFragmentTransitionImpl, Object paramObject1, Object paramObject2, ArrayMap<String, View> paramArrayMap, boolean paramBoolean, BackStackRecord paramBackStackRecord)
  {
    ArrayList localArrayList = mSharedElementSourceNames;
    if ((localArrayList != null) && (!localArrayList.isEmpty()))
    {
      if (paramBoolean) {
        paramBackStackRecord = (String)mSharedElementTargetNames.get(0);
      } else {
        paramBackStackRecord = (String)mSharedElementSourceNames.get(0);
      }
      paramArrayMap = (View)paramArrayMap.get(paramBackStackRecord);
      paramFragmentTransitionImpl.setEpicenter(paramObject1, paramArrayMap);
      if (paramObject2 != null) {
        paramFragmentTransitionImpl.setEpicenter(paramObject2, paramArrayMap);
      }
    }
  }
  
  public static void setViewVisibility(ArrayList<View> paramArrayList, int paramInt)
  {
    if (paramArrayList == null) {
      return;
    }
    for (int i = paramArrayList.size() - 1; i >= 0; i--) {
      ((View)paramArrayList.get(i)).setVisibility(paramInt);
    }
  }
  
  public static void startTransitions(@NonNull Context paramContext, @NonNull FragmentContainer paramFragmentContainer, ArrayList<BackStackRecord> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean, Callback paramCallback)
  {
    SparseArray localSparseArray = new SparseArray();
    Object localObject;
    for (int i = paramInt1; i < paramInt2; i++)
    {
      localObject = (BackStackRecord)paramArrayList.get(i);
      if (((Boolean)paramArrayList1.get(i)).booleanValue()) {
        calculatePopFragments((BackStackRecord)localObject, localSparseArray, paramBoolean);
      } else {
        calculateFragments((BackStackRecord)localObject, localSparseArray, paramBoolean);
      }
    }
    if (localSparseArray.size() != 0)
    {
      View localView = new View(paramContext);
      int j = localSparseArray.size();
      for (i = 0; i < j; i++)
      {
        int k = localSparseArray.keyAt(i);
        ArrayMap localArrayMap = calculateNameOverrides(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
        localObject = (FragmentContainerTransition)localSparseArray.valueAt(i);
        if (paramFragmentContainer.onHasView())
        {
          paramContext = (ViewGroup)paramFragmentContainer.onFindViewById(k);
          if (paramContext != null) {
            if (paramBoolean) {
              configureTransitionsReordered(paramContext, (FragmentContainerTransition)localObject, localView, localArrayMap, paramCallback);
            } else {
              configureTransitionsOrdered(paramContext, (FragmentContainerTransition)localObject, localView, localArrayMap, paramCallback);
            }
          }
        }
      }
    }
  }
  
  public static boolean supportsTransition()
  {
    boolean bool;
    if ((PLATFORM_IMPL == null) && (SUPPORT_IMPL == null)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static abstract interface Callback
  {
    public abstract void onComplete(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal);
    
    public abstract void onStart(@NonNull Fragment paramFragment, @NonNull CancellationSignal paramCancellationSignal);
  }
  
  public static class FragmentContainerTransition
  {
    public Fragment firstOut;
    public boolean firstOutIsPop;
    public BackStackRecord firstOutTransaction;
    public Fragment lastIn;
    public boolean lastInIsPop;
    public BackStackRecord lastInTransaction;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransition
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */