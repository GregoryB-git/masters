package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.SharedValues;
import androidx.constraintlayout.widget.SharedValues.SharedValuesListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import z2;

public class ViewTransitionController
{
  private String TAG = "ViewTransitionController";
  public ArrayList<ViewTransition.Animate> animations;
  private final MotionLayout mMotionLayout;
  private HashSet<View> mRelatedViews;
  public ArrayList<ViewTransition.Animate> removeList = new ArrayList();
  private ArrayList<ViewTransition> viewTransitions = new ArrayList();
  
  public ViewTransitionController(MotionLayout paramMotionLayout)
  {
    mMotionLayout = paramMotionLayout;
  }
  
  private void listenForSharedVariable(final ViewTransition paramViewTransition, final boolean paramBoolean)
  {
    final int i = paramViewTransition.getSharedValueID();
    final int j = paramViewTransition.getSharedValue();
    ConstraintLayout.getSharedValues().addListener(paramViewTransition.getSharedValueID(), new SharedValues.SharedValuesListener()
    {
      public void onNewValue(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        paramAnonymousInt3 = paramViewTransition.getSharedValueCurrent();
        paramViewTransition.setSharedValueCurrent(paramAnonymousInt2);
        if ((i == paramAnonymousInt1) && (paramAnonymousInt3 != paramAnonymousInt2))
        {
          Object localObject1;
          Object localObject2;
          Object localObject3;
          ViewTransitionController localViewTransitionController;
          if (paramBoolean)
          {
            if (j == paramAnonymousInt2)
            {
              paramAnonymousInt2 = ViewTransitionController.access$000(ViewTransitionController.this).getChildCount();
              for (paramAnonymousInt1 = 0; paramAnonymousInt1 < paramAnonymousInt2; paramAnonymousInt1++)
              {
                localObject1 = ViewTransitionController.access$000(ViewTransitionController.this).getChildAt(paramAnonymousInt1);
                if (paramViewTransition.matchesView((View)localObject1))
                {
                  paramAnonymousInt3 = ViewTransitionController.access$000(ViewTransitionController.this).getCurrentState();
                  localObject2 = ViewTransitionController.access$000(ViewTransitionController.this).getConstraintSet(paramAnonymousInt3);
                  localObject3 = paramViewTransition;
                  localViewTransitionController = ViewTransitionController.this;
                  ((ViewTransition)localObject3).applyTransition(localViewTransitionController, ViewTransitionController.access$000(localViewTransitionController), paramAnonymousInt3, (ConstraintSet)localObject2, new View[] { localObject1 });
                }
              }
            }
          }
          else if (j != paramAnonymousInt2)
          {
            paramAnonymousInt2 = ViewTransitionController.access$000(ViewTransitionController.this).getChildCount();
            for (paramAnonymousInt1 = 0; paramAnonymousInt1 < paramAnonymousInt2; paramAnonymousInt1++)
            {
              localObject3 = ViewTransitionController.access$000(ViewTransitionController.this).getChildAt(paramAnonymousInt1);
              if (paramViewTransition.matchesView((View)localObject3))
              {
                paramAnonymousInt3 = ViewTransitionController.access$000(ViewTransitionController.this).getCurrentState();
                localObject1 = ViewTransitionController.access$000(ViewTransitionController.this).getConstraintSet(paramAnonymousInt3);
                localObject2 = paramViewTransition;
                localViewTransitionController = ViewTransitionController.this;
                ((ViewTransition)localObject2).applyTransition(localViewTransitionController, ViewTransitionController.access$000(localViewTransitionController), paramAnonymousInt3, (ConstraintSet)localObject1, new View[] { localObject3 });
              }
            }
          }
        }
      }
    });
  }
  
  private void viewTransition(ViewTransition paramViewTransition, View... paramVarArgs)
  {
    int i = mMotionLayout.getCurrentState();
    if (mViewTransitionMode != 2)
    {
      if (i == -1)
      {
        paramVarArgs = TAG;
        paramViewTransition = z2.t("No support for ViewTransition within transition yet. Currently: ");
        paramViewTransition.append(mMotionLayout.toString());
        Log.w(paramVarArgs, paramViewTransition.toString());
        return;
      }
      ConstraintSet localConstraintSet = mMotionLayout.getConstraintSet(i);
      if (localConstraintSet == null) {
        return;
      }
      paramViewTransition.applyTransition(this, mMotionLayout, i, localConstraintSet, paramVarArgs);
    }
    else
    {
      paramViewTransition.applyTransition(this, mMotionLayout, i, null, paramVarArgs);
    }
  }
  
  public void add(ViewTransition paramViewTransition)
  {
    viewTransitions.add(paramViewTransition);
    mRelatedViews = null;
    if (paramViewTransition.getStateTransition() == 4) {
      listenForSharedVariable(paramViewTransition, true);
    } else if (paramViewTransition.getStateTransition() == 5) {
      listenForSharedVariable(paramViewTransition, false);
    }
  }
  
  public void addAnimation(ViewTransition.Animate paramAnimate)
  {
    if (animations == null) {
      animations = new ArrayList();
    }
    animations.add(paramAnimate);
  }
  
  public void animate()
  {
    Object localObject = animations;
    if (localObject == null) {
      return;
    }
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ViewTransition.Animate)((Iterator)localObject).next()).mutate();
    }
    animations.removeAll(removeList);
    removeList.clear();
    if (animations.isEmpty()) {
      animations = null;
    }
  }
  
  public boolean applyViewTransition(int paramInt, MotionController paramMotionController)
  {
    Iterator localIterator = viewTransitions.iterator();
    while (localIterator.hasNext())
    {
      ViewTransition localViewTransition = (ViewTransition)localIterator.next();
      if (localViewTransition.getId() == paramInt)
      {
        mKeyFrames.addAllFrames(paramMotionController);
        return true;
      }
    }
    return false;
  }
  
  public void enableViewTransition(int paramInt, boolean paramBoolean)
  {
    Iterator localIterator = viewTransitions.iterator();
    while (localIterator.hasNext())
    {
      ViewTransition localViewTransition = (ViewTransition)localIterator.next();
      if (localViewTransition.getId() == paramInt) {
        localViewTransition.setEnabled(paramBoolean);
      }
    }
  }
  
  public void invalidate()
  {
    mMotionLayout.invalidate();
  }
  
  public boolean isViewTransitionEnabled(int paramInt)
  {
    Iterator localIterator = viewTransitions.iterator();
    while (localIterator.hasNext())
    {
      ViewTransition localViewTransition = (ViewTransition)localIterator.next();
      if (localViewTransition.getId() == paramInt) {
        return localViewTransition.isEnabled();
      }
    }
    return false;
  }
  
  public void remove(int paramInt)
  {
    Iterator localIterator = viewTransitions.iterator();
    while (localIterator.hasNext())
    {
      localViewTransition = (ViewTransition)localIterator.next();
      if (localViewTransition.getId() == paramInt) {
        break label40;
      }
    }
    ViewTransition localViewTransition = null;
    label40:
    if (localViewTransition != null)
    {
      mRelatedViews = null;
      viewTransitions.remove(localViewTransition);
    }
  }
  
  public void removeAnimation(ViewTransition.Animate paramAnimate)
  {
    removeList.add(paramAnimate);
  }
  
  public void touchEvent(MotionEvent paramMotionEvent)
  {
    int i = mMotionLayout.getCurrentState();
    if (i == -1) {
      return;
    }
    Object localObject2;
    Object localObject3;
    if (mRelatedViews == null)
    {
      mRelatedViews = new HashSet();
      localObject1 = viewTransitions.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (ViewTransition)((Iterator)localObject1).next();
        int j = mMotionLayout.getChildCount();
        for (k = 0; k < j; k++)
        {
          localObject3 = mMotionLayout.getChildAt(k);
          if (((ViewTransition)localObject2).matchesView((View)localObject3))
          {
            ((View)localObject3).getId();
            mRelatedViews.add(localObject3);
          }
        }
      }
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    Object localObject1 = new Rect();
    int k = paramMotionEvent.getAction();
    paramMotionEvent = animations;
    if ((paramMotionEvent != null) && (!paramMotionEvent.isEmpty()))
    {
      paramMotionEvent = animations.iterator();
      while (paramMotionEvent.hasNext()) {
        ((ViewTransition.Animate)paramMotionEvent.next()).reactTo(k, f1, f2);
      }
    }
    if ((k == 0) || (k == 1))
    {
      localObject3 = mMotionLayout.getConstraintSet(i);
      localObject2 = viewTransitions.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramMotionEvent = (ViewTransition)((Iterator)localObject2).next();
        if (paramMotionEvent.supports(k))
        {
          Iterator localIterator = mRelatedViews.iterator();
          while (localIterator.hasNext())
          {
            View localView = (View)localIterator.next();
            if (paramMotionEvent.matchesView(localView))
            {
              localView.getHitRect((Rect)localObject1);
              if (((Rect)localObject1).contains((int)f1, (int)f2)) {
                paramMotionEvent.applyTransition(this, mMotionLayout, i, (ConstraintSet)localObject3, new View[] { localView });
              }
            }
          }
        }
      }
    }
  }
  
  public void viewTransition(int paramInt, View... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = viewTransitions.iterator();
    Object localObject = null;
    while (localIterator.hasNext())
    {
      ViewTransition localViewTransition = (ViewTransition)localIterator.next();
      if (localViewTransition.getId() == paramInt)
      {
        int i = paramVarArgs.length;
        for (int j = 0; j < i; j++)
        {
          localObject = paramVarArgs[j];
          if (localViewTransition.checkTags((View)localObject)) {
            localArrayList.add(localObject);
          }
        }
        if (!localArrayList.isEmpty())
        {
          viewTransition(localViewTransition, (View[])localArrayList.toArray(new View[0]));
          localArrayList.clear();
        }
        localObject = localViewTransition;
      }
    }
    if (localObject == null) {
      Log.e(TAG, " Could not find ViewTransition");
    }
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransitionController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */