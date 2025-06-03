package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressLint({"UnknownNullness"})
@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class FragmentTransitionImpl
{
  public static void bfsAddViewChildren(List<View> paramList, View paramView)
  {
    int i = paramList.size();
    if (containedBeforeIndex(paramList, paramView, i)) {
      return;
    }
    if (ViewCompat.getTransitionName(paramView) != null) {
      paramList.add(paramView);
    }
    for (int j = i; j < paramList.size(); j++)
    {
      paramView = (View)paramList.get(j);
      if ((paramView instanceof ViewGroup))
      {
        ViewGroup localViewGroup = (ViewGroup)paramView;
        int k = localViewGroup.getChildCount();
        for (int m = 0; m < k; m++)
        {
          paramView = localViewGroup.getChildAt(m);
          if ((!containedBeforeIndex(paramList, paramView, i)) && (ViewCompat.getTransitionName(paramView) != null)) {
            paramList.add(paramView);
          }
        }
      }
    }
  }
  
  private static boolean containedBeforeIndex(List<View> paramList, View paramView, int paramInt)
  {
    for (int i = 0; i < paramInt; i++) {
      if (paramList.get(i) == paramView) {
        return true;
      }
    }
    return false;
  }
  
  public static String findKeyForValue(Map<String, String> paramMap, String paramString)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      if (paramString.equals(localEntry.getValue())) {
        return (String)localEntry.getKey();
      }
    }
    return null;
  }
  
  public static boolean isNullOrEmpty(List paramList)
  {
    boolean bool;
    if ((paramList != null) && (!paramList.isEmpty())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public abstract void addTarget(Object paramObject, View paramView);
  
  public abstract void addTargets(Object paramObject, ArrayList<View> paramArrayList);
  
  public abstract void beginDelayedTransition(ViewGroup paramViewGroup, Object paramObject);
  
  public abstract boolean canHandle(Object paramObject);
  
  public void captureTransitioningViews(ArrayList<View> paramArrayList, View paramView)
  {
    if (paramView.getVisibility() == 0) {
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        if (ViewGroupCompat.isTransitionGroup(paramView))
        {
          paramArrayList.add(paramView);
        }
        else
        {
          int i = paramView.getChildCount();
          for (int j = 0; j < i; j++) {
            captureTransitioningViews(paramArrayList, paramView.getChildAt(j));
          }
        }
      }
      else
      {
        paramArrayList.add(paramView);
      }
    }
  }
  
  public abstract Object cloneTransition(Object paramObject);
  
  public void findNamedViews(Map<String, View> paramMap, @NonNull View paramView)
  {
    if (paramView.getVisibility() == 0)
    {
      String str = ViewCompat.getTransitionName(paramView);
      if (str != null) {
        paramMap.put(str, paramView);
      }
      if ((paramView instanceof ViewGroup))
      {
        paramView = (ViewGroup)paramView;
        int i = paramView.getChildCount();
        for (int j = 0; j < i; j++) {
          findNamedViews(paramMap, paramView.getChildAt(j));
        }
      }
    }
  }
  
  public void getBoundsOnScreen(View paramView, Rect paramRect)
  {
    if (!ViewCompat.isAttachedToWindow(paramView)) {
      return;
    }
    RectF localRectF = new RectF();
    localRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    paramView.getMatrix().mapRect(localRectF);
    localRectF.offset(paramView.getLeft(), paramView.getTop());
    for (Object localObject = paramView.getParent(); (localObject instanceof View); localObject = ((View)localObject).getParent())
    {
      localObject = (View)localObject;
      localRectF.offset(-((View)localObject).getScrollX(), -((View)localObject).getScrollY());
      ((View)localObject).getMatrix().mapRect(localRectF);
      localRectF.offset(((View)localObject).getLeft(), ((View)localObject).getTop());
    }
    localObject = new int[2];
    paramView.getRootView().getLocationOnScreen((int[])localObject);
    localRectF.offset(localObject[0], localObject[1]);
    paramRect.set(Math.round(left), Math.round(top), Math.round(right), Math.round(bottom));
  }
  
  public abstract Object mergeTransitionsInSequence(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public abstract Object mergeTransitionsTogether(Object paramObject1, Object paramObject2, Object paramObject3);
  
  public ArrayList<String> prepareSetNameOverridesReordered(ArrayList<View> paramArrayList)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayList.size();
    for (int j = 0; j < i; j++)
    {
      View localView = (View)paramArrayList.get(j);
      localArrayList.add(ViewCompat.getTransitionName(localView));
      ViewCompat.setTransitionName(localView, null);
    }
    return localArrayList;
  }
  
  public abstract void removeTarget(Object paramObject, View paramView);
  
  public abstract void replaceTargets(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract void scheduleHideFragmentView(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public void scheduleNameReset(ViewGroup paramViewGroup, final ArrayList<View> paramArrayList, final Map<String, String> paramMap)
  {
    OneShotPreDrawListener.add(paramViewGroup, new Runnable()
    {
      public void run()
      {
        int i = paramArrayList.size();
        for (int j = 0; j < i; j++)
        {
          View localView = (View)paramArrayList.get(j);
          String str = ViewCompat.getTransitionName(localView);
          ViewCompat.setTransitionName(localView, (String)paramMap.get(str));
        }
      }
    });
  }
  
  public abstract void scheduleRemoveTargets(Object paramObject1, Object paramObject2, ArrayList<View> paramArrayList1, Object paramObject3, ArrayList<View> paramArrayList2, Object paramObject4, ArrayList<View> paramArrayList3);
  
  public abstract void setEpicenter(Object paramObject, Rect paramRect);
  
  public abstract void setEpicenter(Object paramObject, View paramView);
  
  public void setListenerForTransitionEnd(@NonNull Fragment paramFragment, @NonNull Object paramObject, @NonNull CancellationSignal paramCancellationSignal, @NonNull Runnable paramRunnable)
  {
    paramRunnable.run();
  }
  
  public void setNameOverridesOrdered(View paramView, final ArrayList<View> paramArrayList, final Map<String, String> paramMap)
  {
    OneShotPreDrawListener.add(paramView, new Runnable()
    {
      public void run()
      {
        int i = paramArrayList.size();
        for (int j = 0; j < i; j++)
        {
          View localView = (View)paramArrayList.get(j);
          String str = ViewCompat.getTransitionName(localView);
          if (str != null) {
            ViewCompat.setTransitionName(localView, FragmentTransitionImpl.findKeyForValue(paramMap, str));
          }
        }
      }
    });
  }
  
  public void setNameOverridesReordered(View paramView, final ArrayList<View> paramArrayList1, final ArrayList<View> paramArrayList2, final ArrayList<String> paramArrayList, Map<String, String> paramMap)
  {
    final int i = paramArrayList2.size();
    final ArrayList localArrayList = new ArrayList();
    for (int j = 0; j < i; j++)
    {
      Object localObject = (View)paramArrayList1.get(j);
      String str = ViewCompat.getTransitionName((View)localObject);
      localArrayList.add(str);
      if (str != null)
      {
        ViewCompat.setTransitionName((View)localObject, null);
        localObject = (String)paramMap.get(str);
        for (int k = 0; k < i; k++) {
          if (((String)localObject).equals(paramArrayList.get(k)))
          {
            ViewCompat.setTransitionName((View)paramArrayList2.get(k), str);
            break;
          }
        }
      }
    }
    OneShotPreDrawListener.add(paramView, new Runnable()
    {
      public void run()
      {
        for (int i = 0; i < i; i++)
        {
          ViewCompat.setTransitionName((View)paramArrayList2.get(i), (String)paramArrayList.get(i));
          ViewCompat.setTransitionName((View)paramArrayList1.get(i), (String)localArrayList.get(i));
        }
      }
    });
  }
  
  public abstract void setSharedElementTargets(Object paramObject, View paramView, ArrayList<View> paramArrayList);
  
  public abstract void swapSharedElementTargets(Object paramObject, ArrayList<View> paramArrayList1, ArrayList<View> paramArrayList2);
  
  public abstract Object wrapTransitionInSet(Object paramObject);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTransitionImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */