package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback;
import androidx.core.app.ActivityCompat.RequestPermissionsRequestCodeValidator;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistry.SavedStateProvider;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

public class FragmentActivity
  extends ComponentActivity
  implements ActivityCompat.OnRequestPermissionsResultCallback, ActivityCompat.RequestPermissionsRequestCodeValidator
{
  public static final String FRAGMENTS_TAG = "android:support:fragments";
  public boolean mCreated;
  public final LifecycleRegistry mFragmentLifecycleRegistry = new LifecycleRegistry(this);
  public final FragmentController mFragments = FragmentController.createController(new HostCallbacks());
  public boolean mResumed;
  public boolean mStopped = true;
  
  public FragmentActivity()
  {
    init();
  }
  
  @ContentView
  public FragmentActivity(@LayoutRes int paramInt)
  {
    super(paramInt);
    init();
  }
  
  private void init()
  {
    getSavedStateRegistry().registerSavedStateProvider("android:support:fragments", new SavedStateRegistry.SavedStateProvider()
    {
      @NonNull
      public Bundle saveState()
      {
        Bundle localBundle = new Bundle();
        markFragmentsCreated();
        mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        Parcelable localParcelable = mFragments.saveAllState();
        if (localParcelable != null) {
          localBundle.putParcelable("android:support:fragments", localParcelable);
        }
        return localBundle;
      }
    });
    addOnContextAvailableListener(new OnContextAvailableListener()
    {
      public void onContextAvailable(@NonNull Context paramAnonymousContext)
      {
        mFragments.attachHost(null);
        paramAnonymousContext = getSavedStateRegistry().consumeRestoredStateForKey("android:support:fragments");
        if (paramAnonymousContext != null)
        {
          paramAnonymousContext = paramAnonymousContext.getParcelable("android:support:fragments");
          mFragments.restoreSaveState(paramAnonymousContext);
        }
      }
    });
  }
  
  private static boolean markState(FragmentManager paramFragmentManager, Lifecycle.State paramState)
  {
    paramFragmentManager = paramFragmentManager.getFragments().iterator();
    boolean bool1 = false;
    while (paramFragmentManager.hasNext())
    {
      Fragment localFragment = (Fragment)paramFragmentManager.next();
      if (localFragment != null)
      {
        boolean bool2 = bool1;
        if (localFragment.getHost() != null) {
          bool2 = bool1 | markState(localFragment.getChildFragmentManager(), paramState);
        }
        FragmentViewLifecycleOwner localFragmentViewLifecycleOwner = mViewLifecycleOwner;
        bool1 = bool2;
        if (localFragmentViewLifecycleOwner != null)
        {
          bool1 = bool2;
          if (localFragmentViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED))
          {
            mViewLifecycleOwner.setCurrentState(paramState);
            bool1 = true;
          }
        }
        if (mLifecycleRegistry.getCurrentState().isAtLeast(Lifecycle.State.STARTED))
        {
          mLifecycleRegistry.setCurrentState(paramState);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  @Nullable
  public final View dispatchFragmentsOnCreateView(@Nullable View paramView, @NonNull String paramString, @NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    return mFragments.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void dump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(mCreated);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(mStopped);
    if (getApplication() != null) {
      LoaderManager.getInstance(this).dump((String)localObject, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    mFragments.getSupportFragmentManager().dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  @NonNull
  public FragmentManager getSupportFragmentManager()
  {
    return mFragments.getSupportFragmentManager();
  }
  
  @Deprecated
  @NonNull
  public LoaderManager getSupportLoaderManager()
  {
    return LoaderManager.getInstance(this);
  }
  
  public void markFragmentsCreated()
  {
    while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED)) {}
  }
  
  @CallSuper
  public void onActivityResult(int paramInt1, int paramInt2, @Nullable Intent paramIntent)
  {
    mFragments.noteStateNotSaved();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  @Deprecated
  @MainThread
  public void onAttachFragment(@NonNull Fragment paramFragment) {}
  
  public void onConfigurationChanged(@NonNull Configuration paramConfiguration)
  {
    mFragments.noteStateNotSaved();
    super.onConfigurationChanged(paramConfiguration);
    mFragments.dispatchConfigurationChanged(paramConfiguration);
  }
  
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    mFragments.dispatchCreate();
  }
  
  public boolean onCreatePanelMenu(int paramInt, @NonNull Menu paramMenu)
  {
    if (paramInt == 0) {
      return super.onCreatePanelMenu(paramInt, paramMenu) | mFragments.dispatchCreateOptionsMenu(paramMenu, getMenuInflater());
    }
    return super.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  @Nullable
  public View onCreateView(@Nullable View paramView, @NonNull String paramString, @NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  @Nullable
  public View onCreateView(@NonNull String paramString, @NonNull Context paramContext, @NonNull AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(null, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    mFragments.dispatchDestroy();
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
  }
  
  public void onLowMemory()
  {
    super.onLowMemory();
    mFragments.dispatchLowMemory();
  }
  
  public boolean onMenuItemSelected(int paramInt, @NonNull MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt != 0)
    {
      if (paramInt != 6) {
        return false;
      }
      return mFragments.dispatchContextItemSelected(paramMenuItem);
    }
    return mFragments.dispatchOptionsItemSelected(paramMenuItem);
  }
  
  @CallSuper
  public void onMultiWindowModeChanged(boolean paramBoolean)
  {
    mFragments.dispatchMultiWindowModeChanged(paramBoolean);
  }
  
  @CallSuper
  public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent paramIntent)
  {
    mFragments.noteStateNotSaved();
    super.onNewIntent(paramIntent);
  }
  
  public void onPanelClosed(int paramInt, @NonNull Menu paramMenu)
  {
    if (paramInt == 0) {
      mFragments.dispatchOptionsMenuClosed(paramMenu);
    }
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPause()
  {
    super.onPause();
    mResumed = false;
    mFragments.dispatchPause();
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
  }
  
  @CallSuper
  public void onPictureInPictureModeChanged(boolean paramBoolean)
  {
    mFragments.dispatchPictureInPictureModeChanged(paramBoolean);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    onResumeFragments();
  }
  
  @Deprecated
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public boolean onPrepareOptionsPanel(@Nullable View paramView, @NonNull Menu paramMenu)
  {
    return super.onPreparePanel(0, paramView, paramMenu);
  }
  
  public boolean onPreparePanel(int paramInt, @Nullable View paramView, @NonNull Menu paramMenu)
  {
    if (paramInt == 0) {
      return onPrepareOptionsPanel(paramView, paramMenu) | mFragments.dispatchPrepareOptionsMenu(paramMenu);
    }
    return super.onPreparePanel(paramInt, paramView, paramMenu);
  }
  
  @CallSuper
  public void onRequestPermissionsResult(int paramInt, @NonNull String[] paramArrayOfString, @NonNull int[] paramArrayOfInt)
  {
    mFragments.noteStateNotSaved();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    mFragments.noteStateNotSaved();
    super.onResume();
    mResumed = true;
    mFragments.execPendingActions();
  }
  
  public void onResumeFragments()
  {
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    mFragments.dispatchResume();
  }
  
  public void onStart()
  {
    mFragments.noteStateNotSaved();
    super.onStart();
    mStopped = false;
    if (!mCreated)
    {
      mCreated = true;
      mFragments.dispatchActivityCreated();
    }
    mFragments.execPendingActions();
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    mFragments.dispatchStart();
  }
  
  public void onStateNotSaved()
  {
    mFragments.noteStateNotSaved();
  }
  
  public void onStop()
  {
    super.onStop();
    mStopped = true;
    markFragmentsCreated();
    mFragments.dispatchStop();
    mFragmentLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
  }
  
  public void setEnterSharedElementCallback(@Nullable SharedElementCallback paramSharedElementCallback)
  {
    ActivityCompat.setEnterSharedElementCallback(this, paramSharedElementCallback);
  }
  
  public void setExitSharedElementCallback(@Nullable SharedElementCallback paramSharedElementCallback)
  {
    ActivityCompat.setExitSharedElementCallback(this, paramSharedElementCallback);
  }
  
  public void startActivityFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      ActivityCompat.startActivityForResult(this, paramIntent, -1, paramBundle);
      return;
    }
    paramFragment.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    if (paramInt1 == -1)
    {
      ActivityCompat.startIntentSenderForResult(this, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    paramFragment.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void supportFinishAfterTransition()
  {
    ActivityCompat.finishAfterTransition(this);
  }
  
  @Deprecated
  public void supportInvalidateOptionsMenu()
  {
    invalidateOptionsMenu();
  }
  
  public void supportPostponeEnterTransition()
  {
    ActivityCompat.postponeEnterTransition(this);
  }
  
  public void supportStartPostponedEnterTransition()
  {
    ActivityCompat.startPostponedEnterTransition(this);
  }
  
  @Deprecated
  public final void validateRequestPermissionsRequestCode(int paramInt) {}
  
  public class HostCallbacks
    extends FragmentHostCallback<FragmentActivity>
    implements ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, FragmentOnAttachListener
  {
    public HostCallbacks()
    {
      super();
    }
    
    @NonNull
    public ActivityResultRegistry getActivityResultRegistry()
    {
      return FragmentActivity.this.getActivityResultRegistry();
    }
    
    @NonNull
    public Lifecycle getLifecycle()
    {
      return mFragmentLifecycleRegistry;
    }
    
    @NonNull
    public OnBackPressedDispatcher getOnBackPressedDispatcher()
    {
      return FragmentActivity.this.getOnBackPressedDispatcher();
    }
    
    @NonNull
    public ViewModelStore getViewModelStore()
    {
      return FragmentActivity.this.getViewModelStore();
    }
    
    public void onAttachFragment(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment)
    {
      onAttachFragment(paramFragment);
    }
    
    public void onDump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
    {
      dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
    
    @Nullable
    public View onFindViewById(int paramInt)
    {
      return findViewById(paramInt);
    }
    
    public FragmentActivity onGetHost()
    {
      return FragmentActivity.this;
    }
    
    @NonNull
    public LayoutInflater onGetLayoutInflater()
    {
      return getLayoutInflater().cloneInContext(FragmentActivity.this);
    }
    
    public int onGetWindowAnimations()
    {
      Window localWindow = getWindow();
      int i;
      if (localWindow == null) {
        i = 0;
      } else {
        i = getAttributeswindowAnimations;
      }
      return i;
    }
    
    public boolean onHasView()
    {
      Window localWindow = getWindow();
      boolean bool;
      if ((localWindow != null) && (localWindow.peekDecorView() != null)) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean onHasWindowAnimations()
    {
      boolean bool;
      if (getWindow() != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean onShouldSaveFragmentState(@NonNull Fragment paramFragment)
    {
      return isFinishing() ^ true;
    }
    
    public boolean onShouldShowRequestPermissionRationale(@NonNull String paramString)
    {
      return ActivityCompat.shouldShowRequestPermissionRationale(FragmentActivity.this, paramString);
    }
    
    public void onSupportInvalidateOptionsMenu()
    {
      supportInvalidateOptionsMenu();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */