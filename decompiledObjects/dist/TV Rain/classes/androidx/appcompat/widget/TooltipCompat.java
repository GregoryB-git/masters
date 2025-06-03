package androidx.appcompat.widget;

import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p3;

public class TooltipCompat
{
  public static void setTooltipText(@NonNull View paramView, @Nullable CharSequence paramCharSequence)
  {
    if (Build.VERSION.SDK_INT >= 26) {
      Api26Impl.setTooltipText(paramView, paramCharSequence);
    } else {
      TooltipCompatHandler.setTooltipText(paramView, paramCharSequence);
    }
  }
  
  @RequiresApi(26)
  public static class Api26Impl
  {
    @DoNotInline
    public static void setTooltipText(View paramView, CharSequence paramCharSequence)
    {
      p3.p(paramView, paramCharSequence);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TooltipCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */