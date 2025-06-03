package androidx.fragment.app;

import androidx.annotation.NonNull;

class FragmentManager$3
  extends FragmentFactory
{
  public FragmentManager$3(FragmentManager paramFragmentManager) {}
  
  @NonNull
  public Fragment instantiate(@NonNull ClassLoader paramClassLoader, @NonNull String paramString)
  {
    return this$0.getHost().instantiate(this$0.getHost().getContext(), paramString, null);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManager.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */