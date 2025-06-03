package androidx.appcompat.resources;

import android.animation.ObjectAnimator;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
public class Compatibility$Api18Impl
{
  @DoNotInline
  public static void setAutoCancel(@NonNull ObjectAnimator paramObjectAnimator, boolean paramBoolean)
  {
    paramObjectAnimator.setAutoCancel(paramBoolean);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.resources.Compatibility.Api18Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */