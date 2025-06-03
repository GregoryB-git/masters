package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.os.CancellationSignal.OnCancelListener;
import androidx.core.util.Preconditions;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

class DefaultSpecialEffectsController
  extends SpecialEffectsController
{
  public DefaultSpecialEffectsController(@NonNull ViewGroup paramViewGroup)
  {
    super(paramViewGroup);
  }
  
  private void startAnimations(@NonNull final List<AnimationInfo> paramList, @NonNull List<SpecialEffectsController.Operation> paramList1, boolean paramBoolean, @NonNull Map<SpecialEffectsController.Operation, Boolean> paramMap)
  {
    final ViewGroup localViewGroup = getContainer();
    Context localContext = localViewGroup.getContext();
    final Object localObject1 = new ArrayList();
    paramList = paramList.iterator();
    int i = 0;
    final Object localObject2;
    while (paramList.hasNext())
    {
      localObject2 = (AnimationInfo)paramList.next();
      if (((SpecialEffectsInfo)localObject2).isVisibilityUnchanged()) {
        ((SpecialEffectsInfo)localObject2).completeSpecialEffect();
      }
      final Animator localAnimator;
      for (;;)
      {
        break;
        localObject3 = ((AnimationInfo)localObject2).getAnimation(localContext);
        if (localObject3 == null)
        {
          ((SpecialEffectsInfo)localObject2).completeSpecialEffect();
        }
        else
        {
          localAnimator = animator;
          if (localAnimator != null) {
            break label113;
          }
          ((ArrayList)localObject1).add(localObject2);
        }
      }
      label113:
      final Object localObject4 = ((SpecialEffectsInfo)localObject2).getOperation();
      final Object localObject3 = ((SpecialEffectsController.Operation)localObject4).getFragment();
      if (Boolean.TRUE.equals(paramMap.get(localObject4)))
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          localObject4 = new StringBuilder();
          ((StringBuilder)localObject4).append("Ignoring Animator set on ");
          ((StringBuilder)localObject4).append(localObject3);
          ((StringBuilder)localObject4).append(" as this Fragment was involved in a Transition.");
          Log.v("FragmentManager", ((StringBuilder)localObject4).toString());
        }
        ((SpecialEffectsInfo)localObject2).completeSpecialEffect();
      }
      else
      {
        final boolean bool;
        if (((SpecialEffectsController.Operation)localObject4).getFinalState() == SpecialEffectsController.Operation.State.GONE) {
          bool = true;
        } else {
          bool = false;
        }
        if (bool) {
          paramList1.remove(localObject4);
        }
        localObject3 = mView;
        localViewGroup.startViewTransition((View)localObject3);
        localAnimator.addListener(new AnimatorListenerAdapter()
        {
          public void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            localViewGroup.endViewTransition(localObject3);
            if (bool) {
              localObject4.getFinalState().applyState(localObject3);
            }
            localObject2.completeSpecialEffect();
          }
        });
        localAnimator.setTarget(localObject3);
        localAnimator.start();
        ((SpecialEffectsInfo)localObject2).getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener()
        {
          public void onCancel()
          {
            localAnimator.end();
          }
        });
        i = 1;
      }
    }
    paramList1 = ((ArrayList)localObject1).iterator();
    while (paramList1.hasNext())
    {
      paramList = (AnimationInfo)paramList1.next();
      paramMap = paramList.getOperation();
      localObject1 = paramMap.getFragment();
      if (paramBoolean)
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          paramMap = new StringBuilder();
          paramMap.append("Ignoring Animation set on ");
          paramMap.append(localObject1);
          paramMap.append(" as Animations cannot run alongside Transitions.");
          Log.v("FragmentManager", paramMap.toString());
        }
        paramList.completeSpecialEffect();
      }
      else if (i != 0)
      {
        if (FragmentManager.isLoggingEnabled(2))
        {
          paramMap = new StringBuilder();
          paramMap.append("Ignoring Animation set on ");
          paramMap.append(localObject1);
          paramMap.append(" as Animations cannot run alongside Animators.");
          Log.v("FragmentManager", paramMap.toString());
        }
        paramList.completeSpecialEffect();
      }
      else
      {
        localObject1 = mView;
        localObject2 = (Animation)Preconditions.checkNotNull(checkNotNullgetAnimationanimation);
        if (paramMap.getFinalState() != SpecialEffectsController.Operation.State.REMOVED)
        {
          ((View)localObject1).startAnimation((Animation)localObject2);
          paramList.completeSpecialEffect();
        }
        else
        {
          localViewGroup.startViewTransition((View)localObject1);
          paramMap = new FragmentAnim.EndViewTransitionAnimation((Animation)localObject2, localViewGroup, (View)localObject1);
          paramMap.setAnimationListener(new Animation.AnimationListener()
          {
            public void onAnimationEnd(Animation paramAnonymousAnimation)
            {
              localViewGroup.post(new Runnable()
              {
                public void run()
                {
                  DefaultSpecialEffectsController.4 local4 = DefaultSpecialEffectsController.4.this;
                  val$container.endViewTransition(val$viewToAnimate);
                  val$animationInfo.completeSpecialEffect();
                }
              });
            }
            
            public void onAnimationRepeat(Animation paramAnonymousAnimation) {}
            
            public void onAnimationStart(Animation paramAnonymousAnimation) {}
          });
          ((View)localObject1).startAnimation(paramMap);
        }
        paramList.getSignal().setOnCancelListener(new CancellationSignal.OnCancelListener()
        {
          public void onCancel()
          {
            localObject1.clearAnimation();
            localViewGroup.endViewTransition(localObject1);
            paramList.completeSpecialEffect();
          }
        });
      }
    }
  }
  
  @NonNull
  private Map<SpecialEffectsController.Operation, Boolean> startTransitions(@NonNull final List<TransitionInfo> paramList, @NonNull List<SpecialEffectsController.Operation> paramList1, final boolean paramBoolean, @Nullable final SpecialEffectsController.Operation paramOperation1, @Nullable final SpecialEffectsController.Operation paramOperation2)
  {
    Object localObject1 = new HashMap();
    final Object localObject2 = paramList.iterator();
    Object localObject3 = null;
    while (((Iterator)localObject2).hasNext())
    {
      localObject4 = (TransitionInfo)((Iterator)localObject2).next();
      if (!((SpecialEffectsInfo)localObject4).isVisibilityUnchanged())
      {
        localObject5 = ((TransitionInfo)localObject4).getHandlingImpl();
        if (localObject3 == null)
        {
          localObject3 = localObject5;
        }
        else if ((localObject5 != null) && (localObject3 != localObject5))
        {
          paramList = z2.t("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
          paramList.append(((SpecialEffectsInfo)localObject4).getOperation().getFragment());
          paramList.append(" returned Transition ");
          paramList.append(((TransitionInfo)localObject4).getTransition());
          paramList.append(" which uses a different Transition  type than other Fragments.");
          throw new IllegalArgumentException(paramList.toString());
        }
      }
    }
    if (localObject3 == null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        paramList1 = (TransitionInfo)paramList.next();
        ((HashMap)localObject1).put(paramList1.getOperation(), Boolean.FALSE);
        paramList1.completeSpecialEffect();
      }
      return (Map<SpecialEffectsController.Operation, Boolean>)localObject1;
    }
    Object localObject5 = new View(getContainer().getContext());
    final Object localObject6 = new Rect();
    Object localObject7 = new ArrayList();
    ArrayList localArrayList1 = new ArrayList();
    Object localObject8 = new ArrayMap();
    Object localObject9 = paramList.iterator();
    final Object localObject10 = null;
    localObject2 = paramOperation2;
    Object localObject11 = null;
    int i = 0;
    DefaultSpecialEffectsController localDefaultSpecialEffectsController = this;
    Object localObject4 = paramOperation1;
    final Object localObject12 = localObject3;
    localObject3 = localObject11;
    int j;
    final Object localObject13;
    Object localObject14;
    Object localObject15;
    for (;;)
    {
      boolean bool = paramBoolean;
      if (!((Iterator)localObject9).hasNext()) {
        break;
      }
      localObject11 = (TransitionInfo)((Iterator)localObject9).next();
      if ((((TransitionInfo)localObject11).hasSharedElementTransition()) && (localObject4 != null) && (localObject2 != null))
      {
        localObject11 = ((FragmentTransitionImpl)localObject12).wrapTransitionInSet(((FragmentTransitionImpl)localObject12).cloneTransition(((TransitionInfo)localObject11).getSharedElementTransition()));
        localObject2 = paramOperation2.getFragment().getSharedElementSourceNames();
        localObject10 = paramOperation1.getFragment().getSharedElementSourceNames();
        localObject4 = paramOperation1.getFragment().getSharedElementTargetNames();
        for (j = 0; j < ((ArrayList)localObject4).size(); j++)
        {
          k = ((ArrayList)localObject2).indexOf(((ArrayList)localObject4).get(j));
          if (k != -1) {
            ((ArrayList)localObject2).set(k, ((ArrayList)localObject10).get(j));
          }
        }
        localObject13 = paramOperation2.getFragment().getSharedElementTargetNames();
        if (!bool)
        {
          localObject10 = paramOperation1.getFragment().getExitTransitionCallback();
          localObject4 = paramOperation2.getFragment().getEnterTransitionCallback();
        }
        else
        {
          localObject10 = paramOperation1.getFragment().getEnterTransitionCallback();
          localObject4 = paramOperation2.getFragment().getExitTransitionCallback();
        }
        j = ((ArrayList)localObject2).size();
        for (int k = 0; k < j; k++) {
          ((SimpleArrayMap)localObject8).put((String)((ArrayList)localObject2).get(k), (String)((ArrayList)localObject13).get(k));
        }
        localObject14 = new ArrayMap();
        localDefaultSpecialEffectsController.findNamedViews((Map)localObject14, getFragmentmView);
        ((ArrayMap)localObject14).retainAll((Collection)localObject2);
        if (localObject10 != null)
        {
          ((SharedElementCallback)localObject10).onMapSharedElements((List)localObject2, (Map)localObject14);
          for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
          {
            localObject15 = (String)((ArrayList)localObject2).get(j);
            localObject10 = (View)((SimpleArrayMap)localObject14).get(localObject15);
            if (localObject10 == null)
            {
              ((SimpleArrayMap)localObject8).remove(localObject15);
            }
            else if (!((String)localObject15).equals(ViewCompat.getTransitionName((View)localObject10)))
            {
              localObject15 = (String)((SimpleArrayMap)localObject8).remove(localObject15);
              ((SimpleArrayMap)localObject8).put(ViewCompat.getTransitionName((View)localObject10), localObject15);
            }
          }
        }
        else
        {
          ((ArrayMap)localObject8).retainAll(((ArrayMap)localObject14).keySet());
        }
        localObject10 = new ArrayMap();
        localDefaultSpecialEffectsController.findNamedViews((Map)localObject10, getFragmentmView);
        ((ArrayMap)localObject10).retainAll((Collection)localObject13);
        ((ArrayMap)localObject10).retainAll(((ArrayMap)localObject8).values());
        if (localObject4 != null)
        {
          ((SharedElementCallback)localObject4).onMapSharedElements((List)localObject13, (Map)localObject10);
          for (j = ((ArrayList)localObject13).size() - 1; j >= 0; j--)
          {
            localObject15 = (String)((ArrayList)localObject13).get(j);
            localObject4 = (View)((SimpleArrayMap)localObject10).get(localObject15);
            if (localObject4 == null)
            {
              localObject4 = FragmentTransition.findKeyForValue((ArrayMap)localObject8, (String)localObject15);
              if (localObject4 != null) {
                ((SimpleArrayMap)localObject8).remove(localObject4);
              }
            }
            else if (!((String)localObject15).equals(ViewCompat.getTransitionName((View)localObject4)))
            {
              localObject15 = FragmentTransition.findKeyForValue((ArrayMap)localObject8, (String)localObject15);
              if (localObject15 != null) {
                ((SimpleArrayMap)localObject8).put(localObject15, ViewCompat.getTransitionName((View)localObject4));
              }
            }
          }
        }
        FragmentTransition.retainValues((ArrayMap)localObject8, (ArrayMap)localObject10);
        localDefaultSpecialEffectsController.retainMatchingViews((ArrayMap)localObject14, ((ArrayMap)localObject8).keySet());
        localDefaultSpecialEffectsController.retainMatchingViews((ArrayMap)localObject10, ((ArrayMap)localObject8).values());
        if (((SimpleArrayMap)localObject8).isEmpty())
        {
          ((ArrayList)localObject7).clear();
          localArrayList1.clear();
          localObject10 = null;
          localObject4 = paramOperation1;
          localObject2 = paramOperation2;
        }
      }
      for (;;)
      {
        break;
        FragmentTransition.callSharedElementStartEnd(paramOperation2.getFragment(), paramOperation1.getFragment(), bool, (ArrayMap)localObject14, true);
        OneShotPreDrawListener.add(getContainer(), new Runnable()
        {
          public void run()
          {
            FragmentTransition.callSharedElementStartEnd(paramOperation2.getFragment(), paramOperation1.getFragment(), paramBoolean, localObject10, false);
          }
        });
        ((ArrayList)localObject7).addAll(((ArrayMap)localObject14).values());
        if (!((ArrayList)localObject2).isEmpty())
        {
          localObject3 = (View)((SimpleArrayMap)localObject14).get((String)((ArrayList)localObject2).get(0));
          ((FragmentTransitionImpl)localObject12).setEpicenter(localObject11, (View)localObject3);
        }
        localArrayList1.addAll(((ArrayMap)localObject10).values());
        if (!((ArrayList)localObject13).isEmpty())
        {
          localObject2 = (View)((SimpleArrayMap)localObject10).get((String)((ArrayList)localObject13).get(0));
          if (localObject2 != null)
          {
            OneShotPreDrawListener.add(getContainer(), new Runnable()
            {
              public void run()
              {
                localObject12.getBoundsOnScreen(localObject2, localObject6);
              }
            });
            i = 1;
          }
        }
        ((FragmentTransitionImpl)localObject12).setSharedElementTargets(localObject11, (View)localObject5, (ArrayList)localObject7);
        ((FragmentTransitionImpl)localObject12).scheduleRemoveTargets(localObject11, null, null, null, null, localObject11, localArrayList1);
        localObject2 = Boolean.TRUE;
        ((HashMap)localObject1).put(paramOperation1, localObject2);
        ((HashMap)localObject1).put(paramOperation2, localObject2);
        localObject10 = localObject11;
        localObject4 = paramOperation1;
        localDefaultSpecialEffectsController = this;
        localObject2 = paramOperation2;
        break;
      }
    }
    paramOperation2 = (SpecialEffectsController.Operation)localObject3;
    localObject11 = localObject8;
    localObject9 = localObject5;
    localObject5 = localObject6;
    localObject8 = localObject7;
    paramOperation1 = new ArrayList();
    Iterator localIterator = paramList.iterator();
    localObject6 = null;
    localObject3 = null;
    localObject7 = localObject1;
    localObject1 = localObject6;
    localObject6 = localObject11;
    localObject11 = localObject9;
    while (localIterator.hasNext())
    {
      TransitionInfo localTransitionInfo = (TransitionInfo)localIterator.next();
      if (localTransitionInfo.isVisibilityUnchanged())
      {
        ((HashMap)localObject7).put(localTransitionInfo.getOperation(), Boolean.FALSE);
        localTransitionInfo.completeSpecialEffect();
      }
      else
      {
        localObject15 = ((FragmentTransitionImpl)localObject12).cloneTransition(localTransitionInfo.getTransition());
        localObject9 = localTransitionInfo.getOperation();
        if ((localObject10 != null) && ((localObject9 == localObject4) || (localObject9 == localObject2))) {
          j = 1;
        } else {
          j = 0;
        }
        if (localObject15 == null)
        {
          if (j == 0)
          {
            ((HashMap)localObject7).put(localObject9, Boolean.FALSE);
            localTransitionInfo.completeSpecialEffect();
          }
          localObject9 = localObject1;
          localObject1 = localObject5;
          localObject5 = localObject3;
          localObject3 = localObject1;
          localObject1 = paramOperation2;
          paramOperation2 = (SpecialEffectsController.Operation)localObject5;
          localObject5 = paramOperation1;
          paramOperation1 = (SpecialEffectsController.Operation)localObject9;
        }
        else
        {
          localObject14 = new ArrayList();
          localDefaultSpecialEffectsController.captureTransitioningViews((ArrayList)localObject14, getFragmentmView);
          if (j != 0) {
            if (localObject9 == localObject4) {
              ((ArrayList)localObject14).removeAll((Collection)localObject8);
            } else {
              ((ArrayList)localObject14).removeAll(localArrayList1);
            }
          }
          if (((ArrayList)localObject14).isEmpty())
          {
            ((FragmentTransitionImpl)localObject12).addTarget(localObject15, (View)localObject11);
          }
          else
          {
            ((FragmentTransitionImpl)localObject12).addTargets(localObject15, (ArrayList)localObject14);
            localObject13 = localObject14;
            ((FragmentTransitionImpl)localObject12).scheduleRemoveTargets(localObject15, localObject15, (ArrayList)localObject14, null, null, null, null);
            if (((SpecialEffectsController.Operation)localObject9).getFinalState() == SpecialEffectsController.Operation.State.GONE)
            {
              localObject16 = localObject9;
              paramList1.remove(localObject16);
              ArrayList localArrayList2 = new ArrayList((Collection)localObject13);
              localArrayList2.remove(getFragmentmView);
              ((FragmentTransitionImpl)localObject12).scheduleHideFragmentView(localObject15, getFragmentmView, localArrayList2);
              OneShotPreDrawListener.add(getContainer(), new Runnable()
              {
                public void run()
                {
                  FragmentTransition.setViewVisibility(localObject13, 4);
                }
              });
            }
          }
          localObject13 = paramOperation1;
          paramOperation1 = (SpecialEffectsController.Operation)localObject1;
          Object localObject16 = localObject9;
          if (((SpecialEffectsController.Operation)localObject16).getFinalState() == SpecialEffectsController.Operation.State.VISIBLE)
          {
            ((ArrayList)localObject13).addAll((Collection)localObject14);
            if (i != 0) {
              ((FragmentTransitionImpl)localObject12).setEpicenter(localObject15, (Rect)localObject5);
            }
          }
          else
          {
            ((FragmentTransitionImpl)localObject12).setEpicenter(localObject15, paramOperation2);
          }
          localObject9 = localObject13;
          localObject1 = paramOperation2;
          localObject13 = localObject5;
          ((HashMap)localObject7).put(localObject16, Boolean.TRUE);
          if (localTransitionInfo.isOverlapAllowed())
          {
            paramOperation2 = ((FragmentTransitionImpl)localObject12).mergeTransitionsTogether(localObject3, localObject15, null);
            localObject3 = localObject13;
            localObject5 = localObject9;
          }
          else
          {
            paramOperation2 = (SpecialEffectsController.Operation)localObject3;
            paramOperation1 = ((FragmentTransitionImpl)localObject12).mergeTransitionsTogether(paramOperation1, localObject15, null);
            localObject5 = localObject9;
            localObject3 = localObject13;
          }
        }
        localObject13 = localObject7;
        localObject7 = localObject5;
        localObject5 = localObject3;
        localObject9 = localObject1;
        localObject3 = paramOperation2;
        localObject1 = paramOperation1;
        paramOperation1 = (SpecialEffectsController.Operation)localObject7;
        localObject7 = localObject13;
        paramOperation2 = (SpecialEffectsController.Operation)localObject9;
      }
    }
    paramList1 = ((FragmentTransitionImpl)localObject12).mergeTransitionsInSequence(localObject3, localObject1, localObject10);
    paramOperation2 = paramList.iterator();
    while (paramOperation2.hasNext())
    {
      paramList = (TransitionInfo)paramOperation2.next();
      if (!paramList.isVisibilityUnchanged())
      {
        localObject1 = paramList.getTransition();
        localObject3 = paramList.getOperation();
        if ((localObject10 != null) && ((localObject3 == localObject4) || (localObject3 == localObject2))) {
          i = 1;
        } else {
          i = 0;
        }
        if ((localObject1 != null) || (i != 0)) {
          if (!ViewCompat.isLaidOut(getContainer()))
          {
            if (FragmentManager.isLoggingEnabled(2))
            {
              localObject1 = z2.t("SpecialEffectsController: Container ");
              ((StringBuilder)localObject1).append(getContainer());
              ((StringBuilder)localObject1).append(" has not been laid out. Completing operation ");
              ((StringBuilder)localObject1).append(localObject3);
              Log.v("FragmentManager", ((StringBuilder)localObject1).toString());
            }
            paramList.completeSpecialEffect();
          }
          else
          {
            ((FragmentTransitionImpl)localObject12).setListenerForTransitionEnd(paramList.getOperation().getFragment(), paramList1, paramList.getSignal(), new Runnable()
            {
              public void run()
              {
                paramList.completeSpecialEffect();
              }
            });
          }
        }
      }
    }
    if (!ViewCompat.isLaidOut(getContainer())) {
      return (Map<SpecialEffectsController.Operation, Boolean>)localObject7;
    }
    FragmentTransition.setViewVisibility(paramOperation1, 4);
    paramList = ((FragmentTransitionImpl)localObject12).prepareSetNameOverridesReordered(localArrayList1);
    ((FragmentTransitionImpl)localObject12).beginDelayedTransition(getContainer(), paramList1);
    ((FragmentTransitionImpl)localObject12).setNameOverridesReordered(getContainer(), (ArrayList)localObject8, localArrayList1, paramList, (Map)localObject6);
    FragmentTransition.setViewVisibility(paramOperation1, 0);
    ((FragmentTransitionImpl)localObject12).swapSharedElementTargets(localObject10, (ArrayList)localObject8, localArrayList1);
    return (Map<SpecialEffectsController.Operation, Boolean>)localObject7;
  }
  
  public void applyContainerChanges(@NonNull SpecialEffectsController.Operation paramOperation)
  {
    View localView = getFragmentmView;
    paramOperation.getFinalState().applyState(localView);
  }
  
  public void captureTransitioningViews(ArrayList<View> paramArrayList, View paramView)
  {
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      if (ViewGroupCompat.isTransitionGroup(localViewGroup))
      {
        if (!paramArrayList.contains(paramView)) {
          paramArrayList.add(localViewGroup);
        }
      }
      else
      {
        int i = localViewGroup.getChildCount();
        for (int j = 0; j < i; j++)
        {
          paramView = localViewGroup.getChildAt(j);
          if (paramView.getVisibility() == 0) {
            captureTransitioningViews(paramArrayList, paramView);
          }
        }
      }
    }
    else if (!paramArrayList.contains(paramView))
    {
      paramArrayList.add(paramView);
    }
  }
  
  public void executeOperations(@NonNull List<SpecialEffectsController.Operation> paramList, boolean paramBoolean)
  {
    Object localObject1 = paramList.iterator();
    Object localObject2 = null;
    Object localObject3 = localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject4 = (SpecialEffectsController.Operation)((Iterator)localObject1).next();
      localObject5 = SpecialEffectsController.Operation.State.from(getFragmentmView);
      int i = 10.$SwitchMap$androidx$fragment$app$SpecialEffectsController$Operation$State[localObject4.getFinalState().ordinal()];
      if ((i != 1) && (i != 2) && (i != 3))
      {
        if ((i == 4) && (localObject5 != SpecialEffectsController.Operation.State.VISIBLE)) {
          localObject3 = localObject4;
        }
      }
      else if ((localObject5 == SpecialEffectsController.Operation.State.VISIBLE) && (localObject2 == null)) {
        localObject2 = localObject4;
      }
    }
    localObject1 = new ArrayList();
    Object localObject5 = new ArrayList();
    final Object localObject4 = new ArrayList(paramList);
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      final SpecialEffectsController.Operation localOperation = (SpecialEffectsController.Operation)paramList.next();
      CancellationSignal localCancellationSignal = new CancellationSignal();
      localOperation.markStartedSpecialEffect(localCancellationSignal);
      ((ArrayList)localObject1).add(new AnimationInfo(localOperation, localCancellationSignal, paramBoolean));
      localCancellationSignal = new CancellationSignal();
      localOperation.markStartedSpecialEffect(localCancellationSignal);
      boolean bool = false;
      if (paramBoolean ? localOperation == localObject2 : localOperation == localObject3) {
        bool = true;
      }
      ((ArrayList)localObject5).add(new TransitionInfo(localOperation, localCancellationSignal, paramBoolean, bool));
      localOperation.addCompletionListener(new Runnable()
      {
        public void run()
        {
          if (localObject4.contains(localOperation))
          {
            localObject4.remove(localOperation);
            applyContainerChanges(localOperation);
          }
        }
      });
    }
    paramList = startTransitions((List)localObject5, (List)localObject4, paramBoolean, (SpecialEffectsController.Operation)localObject2, (SpecialEffectsController.Operation)localObject3);
    startAnimations((List)localObject1, (List)localObject4, paramList.containsValue(Boolean.TRUE), paramList);
    paramList = ((ArrayList)localObject4).iterator();
    while (paramList.hasNext()) {
      applyContainerChanges((SpecialEffectsController.Operation)paramList.next());
    }
    ((ArrayList)localObject4).clear();
  }
  
  public void findNamedViews(Map<String, View> paramMap, @NonNull View paramView)
  {
    Object localObject = ViewCompat.getTransitionName(paramView);
    if (localObject != null) {
      paramMap.put(localObject, paramView);
    }
    if ((paramView instanceof ViewGroup))
    {
      localObject = (ViewGroup)paramView;
      int i = ((ViewGroup)localObject).getChildCount();
      for (int j = 0; j < i; j++)
      {
        paramView = ((ViewGroup)localObject).getChildAt(j);
        if (paramView.getVisibility() == 0) {
          findNamedViews(paramMap, paramView);
        }
      }
    }
  }
  
  public void retainMatchingViews(@NonNull ArrayMap<String, View> paramArrayMap, @NonNull Collection<String> paramCollection)
  {
    paramArrayMap = paramArrayMap.entrySet().iterator();
    while (paramArrayMap.hasNext()) {
      if (!paramCollection.contains(ViewCompat.getTransitionName((View)((Map.Entry)paramArrayMap.next()).getValue()))) {
        paramArrayMap.remove();
      }
    }
  }
  
  public static class AnimationInfo
    extends DefaultSpecialEffectsController.SpecialEffectsInfo
  {
    @Nullable
    private FragmentAnim.AnimationOrAnimator mAnimation;
    private boolean mIsPop;
    private boolean mLoadedAnim = false;
    
    public AnimationInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal, boolean paramBoolean)
    {
      super(paramCancellationSignal);
      mIsPop = paramBoolean;
    }
    
    @Nullable
    public FragmentAnim.AnimationOrAnimator getAnimation(@NonNull Context paramContext)
    {
      if (mLoadedAnim) {
        return mAnimation;
      }
      Fragment localFragment = getOperation().getFragment();
      boolean bool;
      if (getOperation().getFinalState() == SpecialEffectsController.Operation.State.VISIBLE) {
        bool = true;
      } else {
        bool = false;
      }
      paramContext = FragmentAnim.loadAnimation(paramContext, localFragment, bool, mIsPop);
      mAnimation = paramContext;
      mLoadedAnim = true;
      return paramContext;
    }
  }
  
  public static class SpecialEffectsInfo
  {
    @NonNull
    private final SpecialEffectsController.Operation mOperation;
    @NonNull
    private final CancellationSignal mSignal;
    
    public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal)
    {
      mOperation = paramOperation;
      mSignal = paramCancellationSignal;
    }
    
    public void completeSpecialEffect()
    {
      mOperation.completeSpecialEffect(mSignal);
    }
    
    @NonNull
    public SpecialEffectsController.Operation getOperation()
    {
      return mOperation;
    }
    
    @NonNull
    public CancellationSignal getSignal()
    {
      return mSignal;
    }
    
    public boolean isVisibilityUnchanged()
    {
      SpecialEffectsController.Operation.State localState1 = SpecialEffectsController.Operation.State.from(mOperation.getFragment().mView);
      SpecialEffectsController.Operation.State localState2 = mOperation.getFinalState();
      if (localState1 != localState2)
      {
        SpecialEffectsController.Operation.State localState3 = SpecialEffectsController.Operation.State.VISIBLE;
        if ((localState1 == localState3) || (localState2 == localState3))
        {
          bool = false;
          break label53;
        }
      }
      boolean bool = true;
      label53:
      return bool;
    }
  }
  
  public static class TransitionInfo
    extends DefaultSpecialEffectsController.SpecialEffectsInfo
  {
    private final boolean mOverlapAllowed;
    @Nullable
    private final Object mSharedElementTransition;
    @Nullable
    private final Object mTransition;
    
    public TransitionInfo(@NonNull SpecialEffectsController.Operation paramOperation, @NonNull CancellationSignal paramCancellationSignal, boolean paramBoolean1, boolean paramBoolean2)
    {
      super(paramCancellationSignal);
      if (paramOperation.getFinalState() == SpecialEffectsController.Operation.State.VISIBLE)
      {
        if (paramBoolean1) {
          paramCancellationSignal = paramOperation.getFragment().getReenterTransition();
        } else {
          paramCancellationSignal = paramOperation.getFragment().getEnterTransition();
        }
        mTransition = paramCancellationSignal;
        boolean bool;
        if (paramBoolean1) {
          bool = paramOperation.getFragment().getAllowReturnTransitionOverlap();
        } else {
          bool = paramOperation.getFragment().getAllowEnterTransitionOverlap();
        }
        mOverlapAllowed = bool;
      }
      else
      {
        if (paramBoolean1) {
          paramCancellationSignal = paramOperation.getFragment().getReturnTransition();
        } else {
          paramCancellationSignal = paramOperation.getFragment().getExitTransition();
        }
        mTransition = paramCancellationSignal;
        mOverlapAllowed = true;
      }
      if (paramBoolean2)
      {
        if (paramBoolean1) {
          mSharedElementTransition = paramOperation.getFragment().getSharedElementReturnTransition();
        } else {
          mSharedElementTransition = paramOperation.getFragment().getSharedElementEnterTransition();
        }
      }
      else {
        mSharedElementTransition = null;
      }
    }
    
    @Nullable
    private FragmentTransitionImpl getHandlingImpl(Object paramObject)
    {
      if (paramObject == null) {
        return null;
      }
      Object localObject = FragmentTransition.PLATFORM_IMPL;
      if ((localObject != null) && (((FragmentTransitionImpl)localObject).canHandle(paramObject))) {
        return (FragmentTransitionImpl)localObject;
      }
      localObject = FragmentTransition.SUPPORT_IMPL;
      if ((localObject != null) && (((FragmentTransitionImpl)localObject).canHandle(paramObject))) {
        return (FragmentTransitionImpl)localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Transition ");
      ((StringBuilder)localObject).append(paramObject);
      ((StringBuilder)localObject).append(" for fragment ");
      ((StringBuilder)localObject).append(getOperation().getFragment());
      ((StringBuilder)localObject).append(" is not a valid framework Transition or AndroidX Transition");
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    
    @Nullable
    public FragmentTransitionImpl getHandlingImpl()
    {
      FragmentTransitionImpl localFragmentTransitionImpl = getHandlingImpl(mTransition);
      Object localObject = getHandlingImpl(mSharedElementTransition);
      if ((localFragmentTransitionImpl != null) && (localObject != null) && (localFragmentTransitionImpl != localObject))
      {
        localObject = z2.t("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
        ((StringBuilder)localObject).append(getOperation().getFragment());
        ((StringBuilder)localObject).append(" returned Transition ");
        ((StringBuilder)localObject).append(mTransition);
        ((StringBuilder)localObject).append(" which uses a different Transition  type than its shared element transition ");
        ((StringBuilder)localObject).append(mSharedElementTransition);
        throw new IllegalArgumentException(((StringBuilder)localObject).toString());
      }
      if (localFragmentTransitionImpl != null) {
        localObject = localFragmentTransitionImpl;
      }
      return (FragmentTransitionImpl)localObject;
    }
    
    @Nullable
    public Object getSharedElementTransition()
    {
      return mSharedElementTransition;
    }
    
    @Nullable
    public Object getTransition()
    {
      return mTransition;
    }
    
    public boolean hasSharedElementTransition()
    {
      boolean bool;
      if (mSharedElementTransition != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean isOverlapAllowed()
    {
      return mOverlapAllowed;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DefaultSpecialEffectsController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */