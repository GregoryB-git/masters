package androidx.fragment.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class FragmentActivity$HostCallbacks
  extends FragmentHostCallback<FragmentActivity>
  implements ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, FragmentOnAttachListener
{
  public FragmentActivity$HostCallbacks(FragmentActivity paramFragmentActivity)
  {
    super(paramFragmentActivity);
  }
  
  @NonNull
  public ActivityResultRegistry getActivityResultRegistry()
  {
    return this$0.getActivityResultRegistry();
  }
  
  @NonNull
  public Lifecycle getLifecycle()
  {
    return this$0.mFragmentLifecycleRegistry;
  }
  
  @NonNull
  public OnBackPressedDispatcher getOnBackPressedDispatcher()
  {
    return this$0.getOnBackPressedDispatcher();
  }
  
  @NonNull
  public ViewModelStore getViewModelStore()
  {
    return this$0.getViewModelStore();
  }
  
  public void onAttachFragment(@NonNull FragmentManager paramFragmentManager, @NonNull Fragment paramFragment)
  {
    this$0.onAttachFragment(paramFragment);
  }
  
  public void onDump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString)
  {
    this$0.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  @Nullable
  public View onFindViewById(int paramInt)
  {
    return this$0.findViewById(paramInt);
  }
  
  public FragmentActivity onGetHost()
  {
    return this$0;
  }
  
  @NonNull
  public LayoutInflater onGetLayoutInflater()
  {
    return this$0.getLayoutInflater().cloneInContext(this$0);
  }
  
  public int onGetWindowAnimations()
  {
    Window localWindow = this$0.getWindow();
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
    Window localWindow = this$0.getWindow();
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
    if (this$0.getWindow() != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean onShouldSaveFragmentState(@NonNull Fragment paramFragment)
  {
    return this$0.isFinishing() ^ true;
  }
  
  public boolean onShouldShowRequestPermissionRationale(@NonNull String paramString)
  {
    return ActivityCompat.shouldShowRequestPermissionRationale(this$0, paramString);
  }
  
  public void onSupportInvalidateOptionsMenu()
  {
    this$0.supportInvalidateOptionsMenu();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentActivity.HostCallbacks
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */