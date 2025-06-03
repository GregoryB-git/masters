package androidx.fragment.app;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

public abstract interface FragmentOnAttachListener
{
  @MainThread
  public abstract void onAttachFragment(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment);
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentOnAttachListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */