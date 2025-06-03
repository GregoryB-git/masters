package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(17)
final class AppCompatSpinner$Api17Impl
{
  @DoNotInline
  public static int getTextAlignment(@NonNull View paramView)
  {
    return paramView.getTextAlignment();
  }
  
  @DoNotInline
  public static int getTextDirection(@NonNull View paramView)
  {
    return paramView.getTextDirection();
  }
  
  @DoNotInline
  public static void setTextAlignment(@NonNull View paramView, int paramInt)
  {
    paramView.setTextAlignment(paramInt);
  }
  
  @DoNotInline
  public static void setTextDirection(@NonNull View paramView, int paramInt)
  {
    paramView.setTextDirection(paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSpinner.Api17Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */