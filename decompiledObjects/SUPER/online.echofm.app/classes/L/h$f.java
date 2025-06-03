package L;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class h$f
  implements ActionMode.Callback
{
  public final ActionMode.Callback a;
  public final TextView b;
  public Class c;
  public Method d;
  public boolean e;
  public boolean f;
  
  public h$f(ActionMode.Callback paramCallback, TextView paramTextView)
  {
    a = paramCallback;
    b = paramTextView;
    f = false;
  }
  
  public final Intent a()
  {
    return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
  }
  
  public final Intent b(ResolveInfo paramResolveInfo, TextView paramTextView)
  {
    paramTextView = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", d(paramTextView) ^ true);
    paramResolveInfo = activityInfo;
    return paramTextView.setClassName(packageName, name);
  }
  
  public final List c(Context paramContext, PackageManager paramPackageManager)
  {
    ArrayList localArrayList = new ArrayList();
    if (!(paramContext instanceof Activity)) {
      return localArrayList;
    }
    paramPackageManager = paramPackageManager.queryIntentActivities(a(), 0).iterator();
    while (paramPackageManager.hasNext())
    {
      ResolveInfo localResolveInfo = (ResolveInfo)paramPackageManager.next();
      if (e(localResolveInfo, paramContext)) {
        localArrayList.add(localResolveInfo);
      }
    }
    return localArrayList;
  }
  
  public final boolean d(TextView paramTextView)
  {
    boolean bool;
    if (((paramTextView instanceof Editable)) && (paramTextView.onCheckIsTextEditor()) && (paramTextView.isEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean e(ResolveInfo paramResolveInfo, Context paramContext)
  {
    boolean bool1 = paramContext.getPackageName().equals(activityInfo.packageName);
    boolean bool2 = true;
    if (bool1) {
      return true;
    }
    paramResolveInfo = activityInfo;
    if (!exported) {
      return false;
    }
    paramResolveInfo = permission;
    bool1 = bool2;
    if (paramResolveInfo != null) {
      if (paramContext.checkSelfPermission(paramResolveInfo) == 0) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
    }
    return bool1;
  }
  
  public final void f(Menu paramMenu)
  {
    Object localObject1 = b.getContext();
    PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
    if (!f)
    {
      f = true;
      try
      {
        Class localClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
        c = localClass;
        d = localClass.getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
        e = true;
      }
      catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
      {
        c = null;
        d = null;
        e = false;
      }
    }
    try
    {
      if ((e) && (c.isInstance(paramMenu))) {
        localObject2 = d;
      } else {
        localObject2 = paramMenu.getClass().getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
      }
      for (int i = paramMenu.size() - 1; i >= 0; i--)
      {
        MenuItem localMenuItem = paramMenu.getItem(i);
        if ((localMenuItem.getIntent() != null) && ("android.intent.action.PROCESS_TEXT".equals(localMenuItem.getIntent().getAction()))) {
          ((Method)localObject2).invoke(paramMenu, new Object[] { Integer.valueOf(i) });
        }
      }
      Object localObject2 = c((Context)localObject1, localPackageManager);
      for (i = 0; i < ((List)localObject2).size(); i++)
      {
        localObject1 = (ResolveInfo)((List)localObject2).get(i);
        paramMenu.add(0, 0, i + 100, ((ResolveInfo)localObject1).loadLabel(localPackageManager)).setIntent(b((ResolveInfo)localObject1, b)).setShowAsAction(1);
      }
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramMenu)
    {
      for (;;) {}
    }
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return a.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return a.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    a.onDestroyActionMode(paramActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    f(paramMenu);
    return a.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     L.h.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */