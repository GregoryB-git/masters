package androidx.fragment.app;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelStore;
import java.util.Collection;
import java.util.Map;

@Deprecated
public class FragmentManagerNonConfig
{
  @Nullable
  private final Map<String, FragmentManagerNonConfig> mChildNonConfigs;
  @Nullable
  private final Collection<Fragment> mFragments;
  @Nullable
  private final Map<String, ViewModelStore> mViewModelStores;
  
  public FragmentManagerNonConfig(@Nullable Collection<Fragment> paramCollection, @Nullable Map<String, FragmentManagerNonConfig> paramMap, @Nullable Map<String, ViewModelStore> paramMap1)
  {
    mFragments = paramCollection;
    mChildNonConfigs = paramMap;
    mViewModelStores = paramMap1;
  }
  
  @Nullable
  public Map<String, FragmentManagerNonConfig> getChildNonConfigs()
  {
    return mChildNonConfigs;
  }
  
  @Nullable
  public Collection<Fragment> getFragments()
  {
    return mFragments;
  }
  
  @Nullable
  public Map<String, ViewModelStore> getViewModelStores()
  {
    return mViewModelStores;
  }
  
  public boolean isRetaining(Fragment paramFragment)
  {
    Collection localCollection = mFragments;
    if (localCollection == null) {
      return false;
    }
    return localCollection.contains(paramFragment);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentManagerNonConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */