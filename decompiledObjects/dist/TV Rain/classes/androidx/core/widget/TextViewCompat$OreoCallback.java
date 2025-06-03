package androidx.core.widget;

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
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(26)
class TextViewCompat$OreoCallback
  implements ActionMode.Callback
{
  private static final int MENU_ITEM_ORDER_PROCESS_TEXT_INTENT_ACTIONS_START = 100;
  private final ActionMode.Callback mCallback;
  private boolean mCanUseMenuBuilderReferences;
  private boolean mInitializedMenuBuilderReferences;
  private Class<?> mMenuBuilderClass;
  private Method mMenuBuilderRemoveItemAtMethod;
  private final TextView mTextView;
  
  public TextViewCompat$OreoCallback(ActionMode.Callback paramCallback, TextView paramTextView)
  {
    mCallback = paramCallback;
    mTextView = paramTextView;
    mInitializedMenuBuilderReferences = false;
  }
  
  private Intent createProcessTextIntent()
  {
    return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
  }
  
  private Intent createProcessTextIntentForResolveInfo(ResolveInfo paramResolveInfo, TextView paramTextView)
  {
    paramTextView = createProcessTextIntent().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", isEditable(paramTextView) ^ true);
    paramResolveInfo = activityInfo;
    return paramTextView.setClassName(packageName, name);
  }
  
  private List<ResolveInfo> getSupportedActivities(Context paramContext, PackageManager paramPackageManager)
  {
    ArrayList localArrayList = new ArrayList();
    if (!(paramContext instanceof Activity)) {
      return localArrayList;
    }
    Iterator localIterator = paramPackageManager.queryIntentActivities(createProcessTextIntent(), 0).iterator();
    while (localIterator.hasNext())
    {
      paramPackageManager = (ResolveInfo)localIterator.next();
      if (isSupportedActivity(paramPackageManager, paramContext)) {
        localArrayList.add(paramPackageManager);
      }
    }
    return localArrayList;
  }
  
  private boolean isEditable(TextView paramTextView)
  {
    boolean bool;
    if (((paramTextView instanceof Editable)) && (paramTextView.onCheckIsTextEditor()) && (paramTextView.isEnabled())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private boolean isSupportedActivity(ResolveInfo paramResolveInfo, Context paramContext)
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
  
  private void recomputeProcessTextMenuItems(Menu paramMenu)
  {
    Object localObject1 = mTextView.getContext();
    PackageManager localPackageManager = ((Context)localObject1).getPackageManager();
    if (!mInitializedMenuBuilderReferences)
    {
      mInitializedMenuBuilderReferences = true;
      try
      {
        Class localClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
        mMenuBuilderClass = localClass;
        mMenuBuilderRemoveItemAtMethod = localClass.getDeclaredMethod("removeItemAt", new Class[] { Integer.TYPE });
        mCanUseMenuBuilderReferences = true;
      }
      catch (ClassNotFoundException|NoSuchMethodException localClassNotFoundException)
      {
        mMenuBuilderClass = null;
        mMenuBuilderRemoveItemAtMethod = null;
        mCanUseMenuBuilderReferences = false;
      }
    }
    try
    {
      Object localObject2;
      if ((mCanUseMenuBuilderReferences) && (mMenuBuilderClass.isInstance(paramMenu))) {
        localObject2 = mMenuBuilderRemoveItemAtMethod;
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
      localObject1 = getSupportedActivities((Context)localObject1, localPackageManager);
      for (i = 0; i < ((List)localObject1).size(); i++)
      {
        localObject2 = (ResolveInfo)((List)localObject1).get(i);
        paramMenu.add(0, 0, i + 100, ((ResolveInfo)localObject2).loadLabel(localPackageManager)).setIntent(createProcessTextIntentForResolveInfo((ResolveInfo)localObject2, mTextView)).setShowAsAction(1);
      }
      return;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramMenu)
    {
      for (;;) {}
    }
  }
  
  @NonNull
  public ActionMode.Callback getWrappedCallback()
  {
    return mCallback;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, MenuItem paramMenuItem)
  {
    return mCallback.onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    return mCallback.onCreateActionMode(paramActionMode, paramMenu);
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    mCallback.onDestroyActionMode(paramActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, Menu paramMenu)
  {
    recomputeProcessTextMenuItems(paramMenu);
    return mCallback.onPrepareActionMode(paramActionMode, paramMenu);
  }
}

/* Location:
 * Qualified Name:     androidx.core.widget.TextViewCompat.OreoCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */