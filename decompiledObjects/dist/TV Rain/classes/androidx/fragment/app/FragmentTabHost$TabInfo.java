package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class FragmentTabHost$TabInfo
{
  @Nullable
  public final Bundle args;
  @NonNull
  public final Class<?> clss;
  public Fragment fragment;
  @NonNull
  public final String tag;
  
  public FragmentTabHost$TabInfo(@NonNull String paramString, @NonNull Class<?> paramClass, @Nullable Bundle paramBundle)
  {
    tag = paramString;
    clss = paramClass;
    args = paramBundle;
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentTabHost.TabInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */