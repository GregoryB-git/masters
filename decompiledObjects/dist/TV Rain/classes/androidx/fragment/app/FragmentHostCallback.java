package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.util.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class FragmentHostCallback<E>
  extends FragmentContainer
{
  @Nullable
  private final Activity mActivity;
  @NonNull
  private final Context mContext;
  public final FragmentManager mFragmentManager = new FragmentManagerImpl();
  @NonNull
  private final Handler mHandler;
  private final int mWindowAnimations;
  
  public FragmentHostCallback(@Nullable Activity paramActivity, @NonNull Context paramContext, @NonNull Handler paramHandler, int paramInt)
  {
    mActivity = paramActivity;
    mContext = ((Context)Preconditions.checkNotNull(paramContext, "context == null"));
    mHandler = ((Handler)Preconditions.checkNotNull(paramHandler, "handler == null"));
    mWindowAnimations = paramInt;
  }
  
  public FragmentHostCallback(@NonNull Context paramContext, @NonNull Handler paramHandler, int paramInt)
  {
    this(localActivity, paramContext, paramHandler, paramInt);
  }
  
  public FragmentHostCallback(@NonNull FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, new Handler(), 0);
  }
  
  @Nullable
  Activity getActivity()
  {
    return mActivity;
  }
  
  @NonNull
  Context getContext()
  {
    return mContext;
  }
  
  @NonNull
  Handler getHandler()
  {
    return mHandler;
  }
  
  public void onDump(@NonNull String paramString, @Nullable FileDescriptor paramFileDescriptor, @NonNull PrintWriter paramPrintWriter, @Nullable String[] paramArrayOfString) {}
  
  @Nullable
  public View onFindViewById(int paramInt)
  {
    return null;
  }
  
  @Nullable
  public abstract E onGetHost();
  
  @NonNull
  public LayoutInflater onGetLayoutInflater()
  {
    return LayoutInflater.from(mContext);
  }
  
  public int onGetWindowAnimations()
  {
    return mWindowAnimations;
  }
  
  public boolean onHasView()
  {
    return true;
  }
  
  public boolean onHasWindowAnimations()
  {
    return true;
  }
  
  @Deprecated
  public void onRequestPermissionsFromFragment(@NonNull Fragment paramFragment, @NonNull String[] paramArrayOfString, int paramInt) {}
  
  public boolean onShouldSaveFragmentState(@NonNull Fragment paramFragment)
  {
    return true;
  }
  
  public boolean onShouldShowRequestPermissionRationale(@NonNull String paramString)
  {
    return false;
  }
  
  public void onStartActivityFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt)
  {
    onStartActivityFromFragment(paramFragment, paramIntent, paramInt, null);
  }
  
  public void onStartActivityFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) Intent paramIntent, int paramInt, @Nullable Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      ContextCompat.startActivity(mContext, paramIntent, paramBundle);
      return;
    }
    throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
  }
  
  @Deprecated
  public void onStartIntentSenderFromFragment(@NonNull Fragment paramFragment, @SuppressLint({"UnknownNullness"}) IntentSender paramIntentSender, int paramInt1, @Nullable Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, @Nullable Bundle paramBundle)
    throws IntentSender.SendIntentException
  {
    if (paramInt1 == -1)
    {
      ActivityCompat.startIntentSenderForResult(mActivity, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
  }
  
  public void onSupportInvalidateOptionsMenu() {}
}

/* Location:
 * Qualified Name:     androidx.fragment.app.FragmentHostCallback
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */