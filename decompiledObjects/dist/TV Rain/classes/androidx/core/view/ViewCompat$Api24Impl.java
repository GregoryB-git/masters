package androidx.core.view;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.DragShadowBuilder;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
class ViewCompat$Api24Impl
{
  @DoNotInline
  public static void cancelDragAndDrop(@NonNull View paramView)
  {
    paramView.cancelDragAndDrop();
  }
  
  @DoNotInline
  public static void dispatchFinishTemporaryDetach(View paramView)
  {
    paramView.dispatchFinishTemporaryDetach();
  }
  
  @DoNotInline
  public static void dispatchStartTemporaryDetach(View paramView)
  {
    paramView.dispatchStartTemporaryDetach();
  }
  
  @DoNotInline
  public static void setPointerIcon(@NonNull View paramView, PointerIcon paramPointerIcon)
  {
    paramView.setPointerIcon(paramPointerIcon);
  }
  
  @DoNotInline
  public static boolean startDragAndDrop(@NonNull View paramView, @Nullable ClipData paramClipData, @NonNull View.DragShadowBuilder paramDragShadowBuilder, @Nullable Object paramObject, int paramInt)
  {
    return paramView.startDragAndDrop(paramClipData, paramDragShadowBuilder, paramObject, paramInt);
  }
  
  @DoNotInline
  public static void updateDragShadow(@NonNull View paramView, @NonNull View.DragShadowBuilder paramDragShadowBuilder)
  {
    paramView.updateDragShadow(paramDragShadowBuilder);
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.ViewCompat.Api24Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */