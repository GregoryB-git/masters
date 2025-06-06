package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TintContextWrapper
  extends ContextWrapper
{
  private static final Object CACHE_LOCK = new Object();
  private static ArrayList<WeakReference<TintContextWrapper>> sCache;
  private final Resources mResources;
  private final Resources.Theme mTheme;
  
  private TintContextWrapper(@NonNull Context paramContext)
  {
    super(paramContext);
    if (VectorEnabledTintResources.shouldBeUsed())
    {
      Object localObject = new VectorEnabledTintResources(this, paramContext.getResources());
      mResources = ((Resources)localObject);
      localObject = ((Resources)localObject).newTheme();
      mTheme = ((Resources.Theme)localObject);
      ((Resources.Theme)localObject).setTo(paramContext.getTheme());
    }
    else
    {
      mResources = new TintResources(this, paramContext.getResources());
      mTheme = null;
    }
  }
  
  private static boolean shouldWrap(@NonNull Context paramContext)
  {
    boolean bool1 = paramContext instanceof TintContextWrapper;
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool3 = bool2;
      if (!(paramContext.getResources() instanceof TintResources)) {
        if ((paramContext.getResources() instanceof VectorEnabledTintResources))
        {
          bool3 = bool2;
        }
        else
        {
          bool3 = bool2;
          if (VectorEnabledTintResources.shouldBeUsed()) {
            bool3 = true;
          }
        }
      }
    }
    return bool3;
  }
  
  public static Context wrap(@NonNull Context paramContext)
  {
    if (shouldWrap(paramContext)) {
      synchronized (CACHE_LOCK)
      {
        Object localObject2 = sCache;
        if (localObject2 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          sCache = (ArrayList)localObject2;
        }
        else
        {
          for (int i = ((ArrayList)localObject2).size() - 1; i >= 0; i--)
          {
            localObject2 = (WeakReference)sCache.get(i);
            if ((localObject2 == null) || (((Reference)localObject2).get() == null)) {
              sCache.remove(i);
            }
          }
          for (i = sCache.size() - 1; i >= 0; i--)
          {
            localObject2 = (WeakReference)sCache.get(i);
            if (localObject2 != null) {
              localObject2 = (TintContextWrapper)((Reference)localObject2).get();
            } else {
              localObject2 = null;
            }
            if ((localObject2 != null) && (((ContextWrapper)localObject2).getBaseContext() == paramContext)) {
              return (Context)localObject2;
            }
          }
        }
        localObject2 = new androidx/appcompat/widget/TintContextWrapper;
        ((TintContextWrapper)localObject2).<init>(paramContext);
        paramContext = sCache;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(localObject2);
        paramContext.add(localWeakReference);
        return (Context)localObject2;
      }
    }
    return paramContext;
  }
  
  public AssetManager getAssets()
  {
    return mResources.getAssets();
  }
  
  public Resources getResources()
  {
    return mResources;
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme1 = mTheme;
    Resources.Theme localTheme2 = localTheme1;
    if (localTheme1 == null) {
      localTheme2 = super.getTheme();
    }
    return localTheme2;
  }
  
  public void setTheme(int paramInt)
  {
    Resources.Theme localTheme = mTheme;
    if (localTheme == null) {
      super.setTheme(paramInt);
    } else {
      localTheme.applyStyle(paramInt, true);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.TintContextWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */