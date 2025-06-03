package androidx.mediarouter.media;

import android.content.IntentFilter;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import z2;

public final class MediaRouteSelector
{
  public static final MediaRouteSelector EMPTY = new MediaRouteSelector(new Bundle(), null);
  public static final String KEY_CONTROL_CATEGORIES = "controlCategories";
  private final Bundle mBundle;
  public List<String> mControlCategories;
  
  public MediaRouteSelector(Bundle paramBundle, List<String> paramList)
  {
    mBundle = paramBundle;
    mControlCategories = paramList;
  }
  
  @Nullable
  public static MediaRouteSelector fromBundle(@Nullable Bundle paramBundle)
  {
    MediaRouteSelector localMediaRouteSelector = null;
    if (paramBundle != null) {
      localMediaRouteSelector = new MediaRouteSelector(paramBundle, null);
    }
    return localMediaRouteSelector;
  }
  
  @NonNull
  public Bundle asBundle()
  {
    return mBundle;
  }
  
  public boolean contains(@NonNull MediaRouteSelector paramMediaRouteSelector)
  {
    if (paramMediaRouteSelector == null) {
      return false;
    }
    ensureControlCategories();
    paramMediaRouteSelector.ensureControlCategories();
    return mControlCategories.containsAll(mControlCategories);
  }
  
  public void ensureControlCategories()
  {
    if (mControlCategories == null)
    {
      ArrayList localArrayList = mBundle.getStringArrayList("controlCategories");
      mControlCategories = localArrayList;
      if ((localArrayList == null) || (localArrayList.isEmpty())) {
        mControlCategories = Collections.emptyList();
      }
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject instanceof MediaRouteSelector))
    {
      paramObject = (MediaRouteSelector)paramObject;
      ensureControlCategories();
      ((MediaRouteSelector)paramObject).ensureControlCategories();
      return mControlCategories.equals(mControlCategories);
    }
    return false;
  }
  
  @NonNull
  public List<String> getControlCategories()
  {
    ensureControlCategories();
    return new ArrayList(mControlCategories);
  }
  
  public boolean hasControlCategory(@Nullable String paramString)
  {
    if (paramString == null) {
      return false;
    }
    ensureControlCategories();
    int i = mControlCategories.size();
    for (int j = 0; j < i; j++) {
      if (((String)mControlCategories.get(j)).equals(paramString)) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    ensureControlCategories();
    return mControlCategories.hashCode();
  }
  
  public boolean isEmpty()
  {
    ensureControlCategories();
    return mControlCategories.isEmpty();
  }
  
  public boolean isValid()
  {
    ensureControlCategories();
    return !mControlCategories.contains(null);
  }
  
  public boolean matchesControlFilters(@Nullable List<IntentFilter> paramList)
  {
    if (paramList == null) {
      return false;
    }
    ensureControlCategories();
    if (mControlCategories.isEmpty()) {
      return false;
    }
    Iterator localIterator2;
    do
    {
      Iterator localIterator1 = paramList.iterator();
      while (!localIterator2.hasNext())
      {
        do
        {
          if (!localIterator1.hasNext()) {
            break;
          }
          paramList = (IntentFilter)localIterator1.next();
        } while (paramList == null);
        localIterator2 = mControlCategories.iterator();
      }
    } while (!paramList.hasCategory((String)localIterator2.next()));
    return true;
    return false;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.u("MediaRouteSelector{ ", "controlCategories=");
    localStringBuilder.append(Arrays.toString(getControlCategories().toArray()));
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
  
  public static final class Builder
  {
    private ArrayList<String> mControlCategories;
    
    public Builder() {}
    
    public Builder(@NonNull MediaRouteSelector paramMediaRouteSelector)
    {
      if (paramMediaRouteSelector != null)
      {
        paramMediaRouteSelector.ensureControlCategories();
        if (!mControlCategories.isEmpty()) {
          mControlCategories = new ArrayList(mControlCategories);
        }
        return;
      }
      throw new IllegalArgumentException("selector must not be null");
    }
    
    @NonNull
    public Builder addControlCategories(@NonNull Collection<String> paramCollection)
    {
      if (paramCollection != null)
      {
        if (!paramCollection.isEmpty())
        {
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext()) {
            addControlCategory((String)paramCollection.next());
          }
        }
        return this;
      }
      throw new IllegalArgumentException("categories must not be null");
    }
    
    @NonNull
    public Builder addControlCategory(@NonNull String paramString)
    {
      if (paramString != null)
      {
        if (mControlCategories == null) {
          mControlCategories = new ArrayList();
        }
        if (!mControlCategories.contains(paramString)) {
          mControlCategories.add(paramString);
        }
        return this;
      }
      throw new IllegalArgumentException("category must not be null");
    }
    
    @NonNull
    public Builder addSelector(@NonNull MediaRouteSelector paramMediaRouteSelector)
    {
      if (paramMediaRouteSelector != null)
      {
        addControlCategories(paramMediaRouteSelector.getControlCategories());
        return this;
      }
      throw new IllegalArgumentException("selector must not be null");
    }
    
    @NonNull
    public MediaRouteSelector build()
    {
      if (mControlCategories == null) {
        return MediaRouteSelector.EMPTY;
      }
      Bundle localBundle = new Bundle();
      localBundle.putStringArrayList("controlCategories", mControlCategories);
      return new MediaRouteSelector(localBundle, mControlCategories);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.mediarouter.media.MediaRouteSelector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */