package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class c
  extends ContextWrapper
{
  public static Configuration f;
  public int a;
  public Resources.Theme b;
  public LayoutInflater c;
  public Configuration d;
  public Resources e;
  
  public c()
  {
    super(null);
  }
  
  public c(Context paramContext, int paramInt)
  {
    super(paramContext);
    a = paramInt;
  }
  
  public final void a(Configuration paramConfiguration)
  {
    if (e == null)
    {
      if (d == null)
      {
        d = new Configuration(paramConfiguration);
        return;
      }
      throw new IllegalStateException("Override configuration has already been set");
    }
    throw new IllegalStateException("getResources() or getAssets() has already been called");
  }
  
  public final void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public final void b()
  {
    int i;
    if (b == null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      b = getResources().newTheme();
      Resources.Theme localTheme = getBaseContext().getTheme();
      if (localTheme != null) {
        b.setTo(localTheme);
      }
    }
    b.applyStyle(a, true);
  }
  
  public final AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public final Resources getResources()
  {
    if (e == null)
    {
      Configuration localConfiguration = d;
      if (localConfiguration != null) {
        if (Build.VERSION.SDK_INT >= 26)
        {
          if (f == null)
          {
            localObject = new Configuration();
            fontScale = 0.0F;
            f = (Configuration)localObject;
          }
          if (localConfiguration.equals(f)) {}
        }
        else
        {
          localObject = a.a(this, d).getResources();
          break label80;
        }
      }
      Object localObject = super.getResources();
      label80:
      e = ((Resources)localObject);
    }
    return e;
  }
  
  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
    {
      if (c == null) {
        c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
      }
      return c;
    }
    return getBaseContext().getSystemService(paramString);
  }
  
  public final Resources.Theme getTheme()
  {
    Resources.Theme localTheme = b;
    if (localTheme != null) {
      return localTheme;
    }
    if (a == 0) {
      a = 2131951914;
    }
    b();
    return b;
  }
  
  public final void setTheme(int paramInt)
  {
    if (a != paramInt)
    {
      a = paramInt;
      b();
    }
  }
  
  public static final class a
  {
    public static Context a(c paramc, Configuration paramConfiguration)
    {
      return paramc.createConfigurationContext(paramConfiguration);
    }
  }
}

/* Location:
 * Qualified Name:     j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */