package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import androidx.appcompat.R.style;

public class ContextThemeWrapper
  extends ContextWrapper
{
  private static Configuration sEmptyConfig;
  private LayoutInflater mInflater;
  private Configuration mOverrideConfiguration;
  private Resources mResources;
  private Resources.Theme mTheme;
  private int mThemeResource;
  
  public ContextThemeWrapper()
  {
    super(null);
  }
  
  public ContextThemeWrapper(Context paramContext, @StyleRes int paramInt)
  {
    super(paramContext);
    mThemeResource = paramInt;
  }
  
  public ContextThemeWrapper(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    mTheme = paramTheme;
  }
  
  private Resources getResourcesInternal()
  {
    if (mResources == null)
    {
      Configuration localConfiguration = mOverrideConfiguration;
      if ((localConfiguration != null) && ((Build.VERSION.SDK_INT < 26) || (!isEmptyConfiguration(localConfiguration)))) {
        mResources = Api17Impl.createConfigurationContext(this, mOverrideConfiguration).getResources();
      } else {
        mResources = super.getResources();
      }
    }
    return mResources;
  }
  
  private void initializeTheme()
  {
    boolean bool;
    if (mTheme == null) {
      bool = true;
    } else {
      bool = false;
    }
    if (bool)
    {
      mTheme = getResources().newTheme();
      Resources.Theme localTheme = getBaseContext().getTheme();
      if (localTheme != null) {
        mTheme.setTo(localTheme);
      }
    }
    onApplyThemeResource(mTheme, mThemeResource, bool);
  }
  
  @RequiresApi(26)
  private static boolean isEmptyConfiguration(Configuration paramConfiguration)
  {
    if (paramConfiguration == null) {
      return true;
    }
    if (sEmptyConfig == null)
    {
      Configuration localConfiguration = new Configuration();
      fontScale = 0.0F;
      sEmptyConfig = localConfiguration;
    }
    return paramConfiguration.equals(sEmptyConfig);
  }
  
  public void applyOverrideConfiguration(Configuration paramConfiguration)
  {
    if (mResources == null)
    {
      if (mOverrideConfiguration == null)
      {
        mOverrideConfiguration = new Configuration(paramConfiguration);
        return;
      }
      throw new IllegalStateException("Override configuration has already been set");
    }
    throw new IllegalStateException("getResources() or getAssets() has already been called");
  }
  
  public void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public Resources getResources()
  {
    return getResourcesInternal();
  }
  
  public Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (mInflater == null) {
        mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return mInflater;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = mTheme;
    if (localTheme != null) {
      return localTheme;
    }
    if (mThemeResource == 0) {
      mThemeResource = R.style.Theme_AppCompat_Light;
    }
    initializeTheme();
    return mTheme;
  }
  
  public int getThemeResId()
  {
    return mThemeResource;
  }
  
  public void onApplyThemeResource(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    paramTheme.applyStyle(paramInt, true);
  }
  
  public void setTheme(int paramInt)
  {
    if (mThemeResource != paramInt)
    {
      mThemeResource = paramInt;
      initializeTheme();
    }
  }
  
  @RequiresApi(17)
  public static class Api17Impl
  {
    @DoNotInline
    public static Context createConfigurationContext(ContextThemeWrapper paramContextThemeWrapper, Configuration paramConfiguration)
    {
      return paramContextThemeWrapper.createConfigurationContext(paramConfiguration);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.view.ContextThemeWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */