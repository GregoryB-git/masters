package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public final class ViewParentCompat
{
  private static final String TAG = "ViewParentCompat";
  private static int[] sTempNestedScrollConsumed;
  
  private static int[] getTempNestedScrollConsumed()
  {
    int[] arrayOfInt = sTempNestedScrollConsumed;
    if (arrayOfInt == null)
    {
      sTempNestedScrollConsumed = new int[2];
    }
    else
    {
      arrayOfInt[0] = 0;
      arrayOfInt[1] = 0;
    }
    return sTempNestedScrollConsumed;
  }
  
  public static void notifySubtreeAccessibilityStateChanged(@NonNull ViewParent paramViewParent, @NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    Api19Impl.notifySubtreeAccessibilityStateChanged(paramViewParent, paramView1, paramView2, paramInt);
  }
  
  public static boolean onNestedFling(@NonNull ViewParent paramViewParent, @NonNull View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    try
    {
      paramBoolean = Api21Impl.onNestedFling(paramViewParent, paramView, paramFloat1, paramFloat2, paramBoolean);
      return paramBoolean;
    }
    catch (AbstractMethodError localAbstractMethodError)
    {
      paramView = new StringBuilder();
      paramView.append("ViewParent ");
      paramView.append(paramViewParent);
      paramView.append(" does not implement interface method onNestedFling");
      Log.e("ViewParentCompat", paramView.toString(), localAbstractMethodError);
    }
    return false;
  }
  
  public static boolean onNestedPreFling(@NonNull ViewParent paramViewParent, @NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    try
    {
      boolean bool = Api21Impl.onNestedPreFling(paramViewParent, paramView, paramFloat1, paramFloat2);
      return bool;
    }
    catch (AbstractMethodError paramView)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("ViewParent ");
      localStringBuilder.append(paramViewParent);
      localStringBuilder.append(" does not implement interface method onNestedPreFling");
      Log.e("ViewParentCompat", localStringBuilder.toString(), paramView);
    }
    return false;
  }
  
  public static void onNestedPreScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt)
  {
    onNestedPreScroll(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt, 0);
  }
  
  public static void onNestedPreScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt1, int paramInt2, @NonNull int[] paramArrayOfInt, int paramInt3)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt, paramInt3);
    } else if (paramInt3 == 0) {
      try
      {
        Api21Impl.onNestedPreScroll(paramViewParent, paramView, paramInt1, paramInt2, paramArrayOfInt);
      }
      catch (AbstractMethodError paramView)
      {
        paramArrayOfInt = new StringBuilder();
        paramArrayOfInt.append("ViewParent ");
        paramArrayOfInt.append(paramViewParent);
        paramArrayOfInt.append(" does not implement interface method onNestedPreScroll");
        Log.e("ViewParentCompat", paramArrayOfInt.toString(), paramView);
      }
    }
  }
  
  public static void onNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    onNestedScroll(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4, 0, getTempNestedScrollConsumed());
  }
  
  public static void onNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    onNestedScroll(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, getTempNestedScrollConsumed());
  }
  
  public static void onNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @NonNull int[] paramArrayOfInt)
  {
    if ((paramViewParent instanceof NestedScrollingParent3))
    {
      ((NestedScrollingParent3)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramArrayOfInt);
    }
    else
    {
      paramArrayOfInt[0] += paramInt3;
      paramArrayOfInt[1] += paramInt4;
      if ((paramViewParent instanceof NestedScrollingParent2)) {
        ((NestedScrollingParent2)paramViewParent).onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      } else if (paramInt5 == 0) {
        try
        {
          Api21Impl.onNestedScroll(paramViewParent, paramView, paramInt1, paramInt2, paramInt3, paramInt4);
        }
        catch (AbstractMethodError paramArrayOfInt)
        {
          paramView = new StringBuilder();
          paramView.append("ViewParent ");
          paramView.append(paramViewParent);
          paramView.append(" does not implement interface method onNestedScroll");
          Log.e("ViewParentCompat", paramView.toString(), paramArrayOfInt);
        }
      }
    }
  }
  
  public static void onNestedScrollAccepted(@NonNull ViewParent paramViewParent, @NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    onNestedScrollAccepted(paramViewParent, paramView1, paramView2, paramInt, 0);
  }
  
  public static void onNestedScrollAccepted(@NonNull ViewParent paramViewParent, @NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onNestedScrollAccepted(paramView1, paramView2, paramInt1, paramInt2);
    } else if (paramInt2 == 0) {
      try
      {
        Api21Impl.onNestedScrollAccepted(paramViewParent, paramView1, paramView2, paramInt1);
      }
      catch (AbstractMethodError paramView2)
      {
        paramView1 = new StringBuilder();
        paramView1.append("ViewParent ");
        paramView1.append(paramViewParent);
        paramView1.append(" does not implement interface method onNestedScrollAccepted");
        Log.e("ViewParentCompat", paramView1.toString(), paramView2);
      }
    }
  }
  
  public static boolean onStartNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView1, @NonNull View paramView2, int paramInt)
  {
    return onStartNestedScroll(paramViewParent, paramView1, paramView2, paramInt, 0);
  }
  
  public static boolean onStartNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView1, @NonNull View paramView2, int paramInt1, int paramInt2)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      return ((NestedScrollingParent2)paramViewParent).onStartNestedScroll(paramView1, paramView2, paramInt1, paramInt2);
    }
    if (paramInt2 == 0) {
      try
      {
        boolean bool = Api21Impl.onStartNestedScroll(paramViewParent, paramView1, paramView2, paramInt1);
        return bool;
      }
      catch (AbstractMethodError paramView2)
      {
        paramView1 = new StringBuilder();
        paramView1.append("ViewParent ");
        paramView1.append(paramViewParent);
        paramView1.append(" does not implement interface method onStartNestedScroll");
        Log.e("ViewParentCompat", paramView1.toString(), paramView2);
      }
    }
    return false;
  }
  
  public static void onStopNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView)
  {
    onStopNestedScroll(paramViewParent, paramView, 0);
  }
  
  public static void onStopNestedScroll(@NonNull ViewParent paramViewParent, @NonNull View paramView, int paramInt)
  {
    if ((paramViewParent instanceof NestedScrollingParent2)) {
      ((NestedScrollingParent2)paramViewParent).onStopNestedScroll(paramView, paramInt);
    } else if (paramInt == 0) {
      try
      {
        Api21Impl.onStopNestedScroll(paramViewParent, paramView);
      }
      catch (AbstractMethodError localAbstractMethodError)
      {
        paramView = new StringBuilder();
        paramView.append("ViewParent ");
        paramView.append(paramViewParent);
        paramView.append(" does not implement interface method onStopNestedScroll");
        Log.e("ViewParentCompat", paramView.toString(), localAbstractMethodError);
      }
    }
  }
  
  @Deprecated
  public static boolean requestSendAccessibilityEvent(ViewParent paramViewParent, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return paramViewParent.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  @RequiresApi(19)
  public static class Api19Impl
  {
    @DoNotInline
    public static void notifySubtreeAccessibilityStateChanged(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      paramViewParent.notifySubtreeAccessibilityStateChanged(paramView1, paramView2, paramInt);
    }
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static boolean onNestedFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
    {
      return paramViewParent.onNestedFling(paramView, paramFloat1, paramFloat2, paramBoolean);
    }
    
    @DoNotInline
    public static boolean onNestedPreFling(ViewParent paramViewParent, View paramView, float paramFloat1, float paramFloat2)
    {
      return paramViewParent.onNestedPreFling(paramView, paramFloat1, paramFloat2);
    }
    
    @DoNotInline
    public static void onNestedPreScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
    {
      paramViewParent.onNestedPreScroll(paramView, paramInt1, paramInt2, paramArrayOfInt);
    }
    
    @DoNotInline
    public static void onNestedScroll(ViewParent paramViewParent, View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramViewParent.onNestedScroll(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    @DoNotInline
    public static void onNestedScrollAccepted(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      paramViewParent.onNestedScrollAccepted(paramView1, paramView2, paramInt);
    }
    
    @DoNotInline
    public static boolean onStartNestedScroll(ViewParent paramViewParent, View paramView1, View paramView2, int paramInt)
    {
      return paramViewParent.onStartNestedScroll(paramView1, paramView2, paramInt);
    }
    
    @DoNotInline
    public static void onStopNestedScroll(ViewParent paramViewParent, View paramView)
    {
      paramViewParent.onStopNestedScroll(paramView);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewParentCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */