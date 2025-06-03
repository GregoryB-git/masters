package g;

import a0.i;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.appcompat.widget.Toolbar;
import j.a.a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import r.d;

public abstract class f
{
  public static r.a a = new r.a(new r.b());
  public static int b = -100;
  public static i c = null;
  public static i d = null;
  public static Boolean e = null;
  public static boolean f = false;
  public static final d<WeakReference<f>> o = new d();
  public static final Object p = new Object();
  public static final Object q = new Object();
  
  public static boolean m(Context paramContext)
  {
    if (e == null) {
      try
      {
        int i = p.a;
        if (Build.VERSION.SDK_INT >= 24) {
          i = p.a.a() | 0x80;
        } else {
          i = 640;
        }
        PackageManager localPackageManager = paramContext.getPackageManager();
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(paramContext, p.class);
        paramContext = getServiceInfometaData;
        if (paramContext != null) {
          e = Boolean.valueOf(paramContext.getBoolean("autoStoreLocales"));
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
        e = Boolean.FALSE;
      }
    }
    return e.booleanValue();
  }
  
  public static void v(f paramf)
  {
    synchronized (p)
    {
      Iterator localIterator = o.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)((WeakReference)localIterator.next()).get();
        if ((localf == paramf) || (localf == null)) {
          localIterator.remove();
        }
      }
      return;
    }
  }
  
  public abstract void A(Toolbar paramToolbar);
  
  public void B(int paramInt) {}
  
  public abstract void C(CharSequence paramCharSequence);
  
  public abstract j.a D(a.a parama);
  
  public abstract void c(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public Context d(Context paramContext)
  {
    return paramContext;
  }
  
  public abstract <T extends View> T e(int paramInt);
  
  public Context f()
  {
    return null;
  }
  
  public abstract g.b g();
  
  public int h()
  {
    return -100;
  }
  
  public abstract MenuInflater i();
  
  public abstract a j();
  
  public abstract void k();
  
  public abstract void l();
  
  public abstract void n(Configuration paramConfiguration);
  
  public abstract void o();
  
  public abstract void p();
  
  public abstract void q();
  
  public abstract void r();
  
  public abstract void s();
  
  public abstract void t();
  
  public abstract void u();
  
  public abstract boolean w(int paramInt);
  
  public abstract void x(int paramInt);
  
  public abstract void y(View paramView);
  
  public abstract void z(View paramView, ViewGroup.LayoutParams paramLayoutParams);
  
  public static final class a
  {
    public static LocaleList a(String paramString)
    {
      return LocaleList.forLanguageTags(paramString);
    }
  }
  
  public static final class b
  {
    public static LocaleList a(Object paramObject)
    {
      return ((LocaleManager)paramObject).getApplicationLocales();
    }
    
    public static void b(Object paramObject, LocaleList paramLocaleList)
    {
      ((LocaleManager)paramObject).setApplicationLocales(paramLocaleList);
    }
  }
}

/* Location:
 * Qualified Name:     g.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */