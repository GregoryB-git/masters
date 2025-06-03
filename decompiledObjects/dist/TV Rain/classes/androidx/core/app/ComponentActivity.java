package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.BuildCompat;
import androidx.core.os.BuildCompat.PrereleaseSdkCheck;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.KeyEventDispatcher.Component;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ComponentActivity
  extends Activity
  implements LifecycleOwner, KeyEventDispatcher.Component
{
  private SimpleArrayMap<Class<? extends ExtraData>, ExtraData> mExtraDataMap = new SimpleArrayMap();
  private LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
  
  @OptIn(markerClass={BuildCompat.PrereleaseSdkCheck.class})
  private static boolean shouldSkipDump(@Nullable String[] paramArrayOfString)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    boolean bool3 = false;
    boolean bool4 = bool2;
    if (paramArrayOfString != null)
    {
      bool4 = bool2;
      if (paramArrayOfString.length > 0)
      {
        paramArrayOfString = paramArrayOfString[0];
        paramArrayOfString.getClass();
        int i = -1;
        switch (paramArrayOfString.hashCode())
        {
        default: 
          break;
        case 1455016274: 
          if (paramArrayOfString.equals("--autofill")) {
            i = 4;
          }
          break;
        case 1159329357: 
          if (paramArrayOfString.equals("--contentcapture")) {
            i = 3;
          }
          break;
        case 472614934: 
          if (paramArrayOfString.equals("--list-dumpables")) {
            i = 2;
          }
          break;
        case 100470631: 
          if (paramArrayOfString.equals("--dump-dumpable")) {
            i = 1;
          }
          break;
        case -645125871: 
          if (paramArrayOfString.equals("--translation")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          bool4 = bool2;
          break;
        case 4: 
          bool4 = bool3;
          if (Build.VERSION.SDK_INT >= 26) {
            bool4 = true;
          }
          return bool4;
        case 3: 
          bool4 = bool1;
          if (Build.VERSION.SDK_INT >= 29) {
            bool4 = true;
          }
          return bool4;
        case 1: 
        case 2: 
          return BuildCompat.isAtLeastT();
        case 0: 
          bool4 = bool2;
          if (Build.VERSION.SDK_INT >= 31) {
            bool4 = true;
          }
          break;
        }
      }
    }
    return bool4;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (KeyEventDispatcher.dispatchBeforeHierarchy(localView, paramKeyEvent))) {
      return true;
    }
    return KeyEventDispatcher.dispatchKeyEvent(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    if ((localView != null) && (KeyEventDispatcher.dispatchBeforeHierarchy(localView, paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public <T extends ExtraData> T getExtraData(Class<T> paramClass)
  {
    return (ExtraData)mExtraDataMap.get(paramClass);
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return mLifecycleRegistry;
  }
  
  @SuppressLint({"RestrictedApi"})
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ReportFragment.injectIfNeededIn(this);
  }
  
  @CallSuper
  public void onSaveInstanceState(@NonNull Bundle paramBundle)
  {
    mLifecycleRegistry.markState(Lifecycle.State.CREATED);
    super.onSaveInstanceState(paramBundle);
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void putExtraData(ExtraData paramExtraData)
  {
    mExtraDataMap.put(paramExtraData.getClass(), paramExtraData);
  }
  
  public final boolean shouldDumpInternalState(@Nullable String[] paramArrayOfString)
  {
    return shouldSkipDump(paramArrayOfString) ^ true;
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean superDispatchKeyEvent(@NonNull KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class ExtraData {}
}

/* Location:
 * Qualified Name:     androidx.core.app.ComponentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */