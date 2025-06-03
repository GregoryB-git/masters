package androidx.core.app;

import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import c;

public class DialogCompat
{
  @NonNull
  public static View requireViewById(@NonNull Dialog paramDialog, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return (View)Api28Impl.requireViewById(paramDialog, paramInt);
    }
    paramDialog = paramDialog.findViewById(paramInt);
    if (paramDialog != null) {
      return paramDialog;
    }
    throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
  }
  
  @RequiresApi(28)
  public static class Api28Impl
  {
    @DoNotInline
    public static <T> T requireViewById(Dialog paramDialog, int paramInt)
    {
      return c.j(paramDialog, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.app.DialogCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */