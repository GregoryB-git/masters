package androidx.activity.result;

import android.annotation.SuppressLint;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;

public abstract class ActivityResultLauncher<I>
{
  @NonNull
  public abstract ActivityResultContract<I, ?> getContract();
  
  public void launch(@SuppressLint({"UnknownNullness"}) I paramI)
  {
    launch(paramI, null);
  }
  
  public abstract void launch(@SuppressLint({"UnknownNullness"}) I paramI, @Nullable ActivityOptionsCompat paramActivityOptionsCompat);
  
  @MainThread
  public abstract void unregister();
}

/* Location:
 * Qualified Name:     androidx.activity.result.ActivityResultLauncher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */