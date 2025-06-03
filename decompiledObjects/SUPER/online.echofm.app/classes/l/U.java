package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class U
  extends ContextWrapper
{
  public static final Object c = new Object();
  public static ArrayList d;
  public final Resources a;
  public final Resources.Theme b;
  
  public U(Context paramContext)
  {
    super(paramContext);
    if (c0.b())
    {
      Object localObject = new c0(this, paramContext.getResources());
      a = ((Resources)localObject);
      localObject = ((Resources)localObject).newTheme();
      b = ((Resources.Theme)localObject);
      ((Resources.Theme)localObject).setTo(paramContext.getTheme());
    }
    else
    {
      a = new W(this, paramContext.getResources());
      b = null;
    }
  }
  
  public static boolean a(Context paramContext)
  {
    if ((!(paramContext instanceof U)) && (!(paramContext.getResources() instanceof W)) && (!(paramContext.getResources() instanceof c0))) {
      return c0.b();
    }
    return false;
  }
  
  public static Context b(Context paramContext)
  {
    if (a(paramContext))
    {
      synchronized (c)
      {
        localObject2 = d;
        if (localObject2 == null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          d = (ArrayList)localObject2;
        }
      }
      for (int i = ((ArrayList)localObject2).size() - 1; i >= 0; i--)
      {
        localObject2 = (WeakReference)d.get(i);
        if ((localObject2 == null) || (((Reference)localObject2).get() == null)) {
          d.remove(i);
        }
      }
      for (i = d.size() - 1; i >= 0; i--)
      {
        localObject2 = (WeakReference)d.get(i);
        if (localObject2 != null) {
          localObject2 = (U)((Reference)localObject2).get();
        } else {
          localObject2 = null;
        }
        if ((localObject2 != null) && (((ContextWrapper)localObject2).getBaseContext() == paramContext)) {
          return (Context)localObject2;
        }
      }
      Object localObject2 = new l/U;
      ((U)localObject2).<init>(paramContext);
      ArrayList localArrayList = d;
      paramContext = new java/lang/ref/WeakReference;
      paramContext.<init>(localObject2);
      localArrayList.add(paramContext);
      return (Context)localObject2;
      throw paramContext;
    }
    return paramContext;
  }
  
  public AssetManager getAssets()
  {
    return a.getAssets();
  }
  
  public Resources getResources()
  {
    return a;
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme1 = b;
    Resources.Theme localTheme2 = localTheme1;
    if (localTheme1 == null) {
      localTheme2 = super.getTheme();
    }
    return localTheme2;
  }
  
  public void setTheme(int paramInt)
  {
    Resources.Theme localTheme = b;
    if (localTheme == null) {
      super.setTheme(paramInt);
    } else {
      localTheme.applyStyle(paramInt, true);
    }
  }
}

/* Location:
 * Qualified Name:     l.U
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */