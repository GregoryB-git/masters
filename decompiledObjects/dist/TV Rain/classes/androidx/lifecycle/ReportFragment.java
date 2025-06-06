package androidx.lifecycle;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import o3;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ReportFragment
  extends Fragment
{
  private static final String REPORT_FRAGMENT_TAG = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";
  private ActivityInitializationListener mProcessListener;
  
  public static void dispatch(@NonNull Activity paramActivity, @NonNull Lifecycle.Event paramEvent)
  {
    if ((paramActivity instanceof LifecycleRegistryOwner))
    {
      ((LifecycleRegistryOwner)paramActivity).getLifecycle().handleLifecycleEvent(paramEvent);
      return;
    }
    if ((paramActivity instanceof LifecycleOwner))
    {
      paramActivity = ((LifecycleOwner)paramActivity).getLifecycle();
      if ((paramActivity instanceof LifecycleRegistry)) {
        ((LifecycleRegistry)paramActivity).handleLifecycleEvent(paramEvent);
      }
    }
  }
  
  private void dispatch(@NonNull Lifecycle.Event paramEvent)
  {
    if (Build.VERSION.SDK_INT < 29) {
      dispatch(getActivity(), paramEvent);
    }
  }
  
  private void dispatchCreate(ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.onCreate();
    }
  }
  
  private void dispatchResume(ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.onResume();
    }
  }
  
  private void dispatchStart(ActivityInitializationListener paramActivityInitializationListener)
  {
    if (paramActivityInitializationListener != null) {
      paramActivityInitializationListener.onStart();
    }
  }
  
  public static ReportFragment get(Activity paramActivity)
  {
    return (ReportFragment)paramActivity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
  }
  
  public static void injectIfNeededIn(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      LifecycleCallbacks.registerIn(paramActivity);
    }
    paramActivity = paramActivity.getFragmentManager();
    if (paramActivity.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null)
    {
      paramActivity.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
      paramActivity.executePendingTransactions();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    dispatchCreate(mProcessListener);
    dispatch(Lifecycle.Event.ON_CREATE);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    dispatch(Lifecycle.Event.ON_DESTROY);
    mProcessListener = null;
  }
  
  public void onPause()
  {
    super.onPause();
    dispatch(Lifecycle.Event.ON_PAUSE);
  }
  
  public void onResume()
  {
    super.onResume();
    dispatchResume(mProcessListener);
    dispatch(Lifecycle.Event.ON_RESUME);
  }
  
  public void onStart()
  {
    super.onStart();
    dispatchStart(mProcessListener);
    dispatch(Lifecycle.Event.ON_START);
  }
  
  public void onStop()
  {
    super.onStop();
    dispatch(Lifecycle.Event.ON_STOP);
  }
  
  public void setProcessListener(ActivityInitializationListener paramActivityInitializationListener)
  {
    mProcessListener = paramActivityInitializationListener;
  }
  
  public static abstract interface ActivityInitializationListener
  {
    public abstract void onCreate();
    
    public abstract void onResume();
    
    public abstract void onStart();
  }
  
  @RequiresApi(29)
  public static class LifecycleCallbacks
    implements Application.ActivityLifecycleCallbacks
  {
    public static void registerIn(Activity paramActivity)
    {
      o3.l(paramActivity, new LifecycleCallbacks());
    }
    
    public void onActivityCreated(@NonNull Activity paramActivity, @Nullable Bundle paramBundle) {}
    
    public void onActivityDestroyed(@NonNull Activity paramActivity) {}
    
    public void onActivityPaused(@NonNull Activity paramActivity) {}
    
    public void onActivityPostCreated(@NonNull Activity paramActivity, @Nullable Bundle paramBundle)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_CREATE);
    }
    
    public void onActivityPostResumed(@NonNull Activity paramActivity)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_RESUME);
    }
    
    public void onActivityPostStarted(@NonNull Activity paramActivity)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_START);
    }
    
    public void onActivityPreDestroyed(@NonNull Activity paramActivity)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_DESTROY);
    }
    
    public void onActivityPrePaused(@NonNull Activity paramActivity)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_PAUSE);
    }
    
    public void onActivityPreStopped(@NonNull Activity paramActivity)
    {
      ReportFragment.dispatch(paramActivity, Lifecycle.Event.ON_STOP);
    }
    
    public void onActivityResumed(@NonNull Activity paramActivity) {}
    
    public void onActivitySaveInstanceState(@NonNull Activity paramActivity, @NonNull Bundle paramBundle) {}
    
    public void onActivityStarted(@NonNull Activity paramActivity) {}
    
    public void onActivityStopped(@NonNull Activity paramActivity) {}
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ReportFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */