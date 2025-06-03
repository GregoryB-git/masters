package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

public abstract interface FragmentResultOwner
{
  public abstract void clearFragmentResult(@NonNull String paramString);
  
  public abstract void clearFragmentResultListener(@NonNull String paramString);
  
  public abstract void setFragmentResult(@NonNull String paramString, @NonNull Bundle paramBundle);
  
  public abstract void setFragmentResultListener(@NonNull String paramString, @NonNull LifecycleOwner paramLifecycleOwner, @NonNull FragmentResultListener paramFragmentResultListener);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentResultOwner
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */