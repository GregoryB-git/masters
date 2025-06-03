package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

public class DialogFragment
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  private static final String SAVED_BACK_STACK_ID = "android:backStackId";
  private static final String SAVED_CANCELABLE = "android:cancelable";
  private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
  private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
  private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
  private static final String SAVED_STYLE = "android:style";
  private static final String SAVED_THEME = "android:theme";
  public static final int STYLE_NORMAL = 0;
  public static final int STYLE_NO_FRAME = 2;
  public static final int STYLE_NO_INPUT = 3;
  public static final int STYLE_NO_TITLE = 1;
  private int mBackStackId = -1;
  private boolean mCancelable = true;
  private boolean mCreatingDialog;
  @Nullable
  private Dialog mDialog;
  private boolean mDialogCreated = false;
  private Runnable mDismissRunnable = new Runnable()
  {
    @SuppressLint({"SyntheticAccessor"})
    public void run()
    {
      DialogFragment.access$100(DialogFragment.this).onDismiss(DialogFragment.access$000(DialogFragment.this));
    }
  };
  private boolean mDismissed;
  private Handler mHandler;
  private Observer<LifecycleOwner> mObserver = new Observer()
  {
    @SuppressLint({"SyntheticAccessor"})
    public void onChanged(LifecycleOwner paramAnonymousLifecycleOwner)
    {
      if ((paramAnonymousLifecycleOwner != null) && (DialogFragment.access$200(DialogFragment.this)))
      {
        View localView = requireView();
        if (localView.getParent() == null)
        {
          if (DialogFragment.access$000(DialogFragment.this) != null)
          {
            if (FragmentManager.isLoggingEnabled(3))
            {
              paramAnonymousLifecycleOwner = new StringBuilder();
              paramAnonymousLifecycleOwner.append("DialogFragment ");
              paramAnonymousLifecycleOwner.append(this);
              paramAnonymousLifecycleOwner.append(" setting the content view on ");
              paramAnonymousLifecycleOwner.append(DialogFragment.access$000(DialogFragment.this));
              Log.d("FragmentManager", paramAnonymousLifecycleOwner.toString());
            }
            DialogFragment.access$000(DialogFragment.this).setContentView(localView);
          }
        }
        else {
          throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
      }
    }
  };
  private DialogInterface.OnCancelListener mOnCancelListener = new DialogInterface.OnCancelListener()
  {
    @SuppressLint({"SyntheticAccessor"})
    public void onCancel(@Nullable DialogInterface paramAnonymousDialogInterface)
    {
      if (DialogFragment.access$000(DialogFragment.this) != null)
      {
        paramAnonymousDialogInterface = DialogFragment.this;
        paramAnonymousDialogInterface.onCancel(DialogFragment.access$000(paramAnonymousDialogInterface));
      }
    }
  };
  private DialogInterface.OnDismissListener mOnDismissListener = new DialogInterface.OnDismissListener()
  {
    @SuppressLint({"SyntheticAccessor"})
    public void onDismiss(@Nullable DialogInterface paramAnonymousDialogInterface)
    {
      if (DialogFragment.access$000(DialogFragment.this) != null)
      {
        paramAnonymousDialogInterface = DialogFragment.this;
        paramAnonymousDialogInterface.onDismiss(DialogFragment.access$000(paramAnonymousDialogInterface));
      }
    }
  };
  private boolean mShownByMe;
  private boolean mShowsDialog = true;
  private int mStyle = 0;
  private int mTheme = 0;
  private boolean mViewDestroyed;
  
  public DialogFragment() {}
  
  public DialogFragment(@LayoutRes int paramInt)
  {
    super(paramInt);
  }
  
  private void dismissInternal(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mDismissed) {
      return;
    }
    mDismissed = true;
    mShownByMe = false;
    Object localObject = mDialog;
    if (localObject != null)
    {
      ((Dialog)localObject).setOnDismissListener(null);
      mDialog.dismiss();
      if (!paramBoolean2) {
        if (Looper.myLooper() == mHandler.getLooper()) {
          onDismiss(mDialog);
        } else {
          mHandler.post(mDismissRunnable);
        }
      }
    }
    mViewDestroyed = true;
    if (mBackStackId >= 0)
    {
      getParentFragmentManager().popBackStack(mBackStackId, 1);
      mBackStackId = -1;
    }
    else
    {
      localObject = getParentFragmentManager().beginTransaction();
      ((FragmentTransaction)localObject).remove(this);
      if (paramBoolean1) {
        ((FragmentTransaction)localObject).commitAllowingStateLoss();
      } else {
        ((FragmentTransaction)localObject).commit();
      }
    }
  }
  
  private void prepareDialog(@Nullable Bundle paramBundle)
  {
    if (!mShowsDialog) {
      return;
    }
    if (!mDialogCreated) {
      try
      {
        mCreatingDialog = true;
        paramBundle = onCreateDialog(paramBundle);
        mDialog = paramBundle;
        if (mShowsDialog)
        {
          setupDialog(paramBundle, mStyle);
          paramBundle = getContext();
          if ((paramBundle instanceof Activity)) {
            mDialog.setOwnerActivity((Activity)paramBundle);
          }
          mDialog.setCancelable(mCancelable);
          mDialog.setOnCancelListener(mOnCancelListener);
          mDialog.setOnDismissListener(mOnDismissListener);
          mDialogCreated = true;
        }
        else
        {
          mDialog = null;
        }
      }
      finally
      {
        mCreatingDialog = false;
      }
    }
  }
  
  @NonNull
  public FragmentContainer createFragmentContainer()
  {
    new FragmentContainer()
    {
      @Nullable
      public View onFindViewById(int paramAnonymousInt)
      {
        if (val$fragmentContainer.onHasView()) {
          return val$fragmentContainer.onFindViewById(paramAnonymousInt);
        }
        return DialogFragment.this.onFindViewById(paramAnonymousInt);
      }
      
      public boolean onHasView()
      {
        boolean bool;
        if ((!val$fragmentContainer.onHasView()) && (!DialogFragment.this.onHasView())) {
          bool = false;
        } else {
          bool = true;
        }
        return bool;
      }
    };
  }
  
  public void dismiss()
  {
    dismissInternal(false, false);
  }
  
  public void dismissAllowingStateLoss()
  {
    dismissInternal(true, false);
  }
  
  @Nullable
  public Dialog getDialog()
  {
    return mDialog;
  }
  
  public boolean getShowsDialog()
  {
    return mShowsDialog;
  }
  
  @StyleRes
  public int getTheme()
  {
    return mTheme;
  }
  
  public boolean isCancelable()
  {
    return mCancelable;
  }
  
  @MainThread
  public void onAttach(@NonNull Context paramContext)
  {
    super.onAttach(paramContext);
    getViewLifecycleOwnerLiveData().observeForever(mObserver);
    if (!mShownByMe) {
      mDismissed = false;
    }
  }
  
  public void onCancel(@NonNull DialogInterface paramDialogInterface) {}
  
  @MainThread
  public void onCreate(@Nullable Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mHandler = new Handler();
    boolean bool;
    if (mContainerId == 0) {
      bool = true;
    } else {
      bool = false;
    }
    mShowsDialog = bool;
    if (paramBundle != null)
    {
      mStyle = paramBundle.getInt("android:style", 0);
      mTheme = paramBundle.getInt("android:theme", 0);
      mCancelable = paramBundle.getBoolean("android:cancelable", true);
      mShowsDialog = paramBundle.getBoolean("android:showsDialog", mShowsDialog);
      mBackStackId = paramBundle.getInt("android:backStackId", -1);
    }
  }
  
  @MainThread
  @NonNull
  public Dialog onCreateDialog(@Nullable Bundle paramBundle)
  {
    if (FragmentManager.isLoggingEnabled(3))
    {
      paramBundle = new StringBuilder();
      paramBundle.append("onCreateDialog called for DialogFragment ");
      paramBundle.append(this);
      Log.d("FragmentManager", paramBundle.toString());
    }
    return new Dialog(requireContext(), getTheme());
  }
  
  @MainThread
  public void onDestroyView()
  {
    super.onDestroyView();
    Dialog localDialog = mDialog;
    if (localDialog != null)
    {
      mViewDestroyed = true;
      localDialog.setOnDismissListener(null);
      mDialog.dismiss();
      if (!mDismissed) {
        onDismiss(mDialog);
      }
      mDialog = null;
      mDialogCreated = false;
    }
  }
  
  @MainThread
  public void onDetach()
  {
    super.onDetach();
    if ((!mShownByMe) && (!mDismissed)) {
      mDismissed = true;
    }
    getViewLifecycleOwnerLiveData().removeObserver(mObserver);
  }
  
  public void onDismiss(@NonNull DialogInterface paramDialogInterface)
  {
    if (!mViewDestroyed)
    {
      if (FragmentManager.isLoggingEnabled(3))
      {
        paramDialogInterface = new StringBuilder();
        paramDialogInterface.append("onDismiss called for DialogFragment ");
        paramDialogInterface.append(this);
        Log.d("FragmentManager", paramDialogInterface.toString());
      }
      dismissInternal(true, true);
    }
  }
  
  @Nullable
  public View onFindViewById(int paramInt)
  {
    Dialog localDialog = mDialog;
    if (localDialog != null) {
      return localDialog.findViewById(paramInt);
    }
    return null;
  }
  
  @NonNull
  public LayoutInflater onGetLayoutInflater(@Nullable Bundle paramBundle)
  {
    LayoutInflater localLayoutInflater = super.onGetLayoutInflater(paramBundle);
    Object localObject;
    if ((mShowsDialog) && (!mCreatingDialog))
    {
      prepareDialog(paramBundle);
      if (FragmentManager.isLoggingEnabled(2))
      {
        paramBundle = new StringBuilder();
        paramBundle.append("get layout inflater for DialogFragment ");
        paramBundle.append(this);
        paramBundle.append(" from dialog context");
        Log.d("FragmentManager", paramBundle.toString());
      }
      localObject = mDialog;
      paramBundle = localLayoutInflater;
      if (localObject != null) {
        paramBundle = localLayoutInflater.cloneInContext(((Dialog)localObject).getContext());
      }
      return paramBundle;
    }
    if (FragmentManager.isLoggingEnabled(2))
    {
      paramBundle = new StringBuilder();
      paramBundle.append("getting layout inflater for DialogFragment ");
      paramBundle.append(this);
      paramBundle = paramBundle.toString();
      if (!mShowsDialog)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("mShowsDialog = false: ");
        ((StringBuilder)localObject).append(paramBundle);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
      else
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("mCreatingDialog = true: ");
        ((StringBuilder)localObject).append(paramBundle);
        Log.d("FragmentManager", ((StringBuilder)localObject).toString());
      }
    }
    return localLayoutInflater;
  }
  
  public boolean onHasView()
  {
    return mDialogCreated;
  }
  
  @MainThread
  public void onSaveInstanceState(@NonNull Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    Object localObject = mDialog;
    if (localObject != null)
    {
      localObject = ((Dialog)localObject).onSaveInstanceState();
      ((BaseBundle)localObject).putBoolean("android:dialogShowing", false);
      paramBundle.putBundle("android:savedDialogState", (Bundle)localObject);
    }
    int i = mStyle;
    if (i != 0) {
      paramBundle.putInt("android:style", i);
    }
    i = mTheme;
    if (i != 0) {
      paramBundle.putInt("android:theme", i);
    }
    boolean bool = mCancelable;
    if (!bool) {
      paramBundle.putBoolean("android:cancelable", bool);
    }
    bool = mShowsDialog;
    if (!bool) {
      paramBundle.putBoolean("android:showsDialog", bool);
    }
    i = mBackStackId;
    if (i != -1) {
      paramBundle.putInt("android:backStackId", i);
    }
  }
  
  @MainThread
  public void onStart()
  {
    super.onStart();
    Object localObject = mDialog;
    if (localObject != null)
    {
      mViewDestroyed = false;
      ((Dialog)localObject).show();
      localObject = mDialog.getWindow().getDecorView();
      ViewTreeLifecycleOwner.set((View)localObject, this);
      ViewTreeViewModelStoreOwner.set((View)localObject, this);
      ViewTreeSavedStateRegistryOwner.set((View)localObject, this);
    }
  }
  
  @MainThread
  public void onStop()
  {
    super.onStop();
    Dialog localDialog = mDialog;
    if (localDialog != null) {
      localDialog.hide();
    }
  }
  
  @MainThread
  public void onViewStateRestored(@Nullable Bundle paramBundle)
  {
    super.onViewStateRestored(paramBundle);
    if ((mDialog != null) && (paramBundle != null))
    {
      paramBundle = paramBundle.getBundle("android:savedDialogState");
      if (paramBundle != null) {
        mDialog.onRestoreInstanceState(paramBundle);
      }
    }
  }
  
  public void performCreateView(@NonNull LayoutInflater paramLayoutInflater, @Nullable ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    super.performCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    if ((mView == null) && (mDialog != null) && (paramBundle != null))
    {
      paramLayoutInflater = paramBundle.getBundle("android:savedDialogState");
      if (paramLayoutInflater != null) {
        mDialog.onRestoreInstanceState(paramLayoutInflater);
      }
    }
  }
  
  @NonNull
  public final Dialog requireDialog()
  {
    Object localObject = getDialog();
    if (localObject != null) {
      return (Dialog)localObject;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("DialogFragment ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" does not have a Dialog.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void setCancelable(boolean paramBoolean)
  {
    mCancelable = paramBoolean;
    Dialog localDialog = mDialog;
    if (localDialog != null) {
      localDialog.setCancelable(paramBoolean);
    }
  }
  
  public void setShowsDialog(boolean paramBoolean)
  {
    mShowsDialog = paramBoolean;
  }
  
  public void setStyle(int paramInt1, @StyleRes int paramInt2)
  {
    if (FragmentManager.isLoggingEnabled(2))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Setting style and theme for DialogFragment ");
      localStringBuilder.append(this);
      localStringBuilder.append(" to ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(", ");
      localStringBuilder.append(paramInt2);
      Log.d("FragmentManager", localStringBuilder.toString());
    }
    mStyle = paramInt1;
    if ((paramInt1 == 2) || (paramInt1 == 3)) {
      mTheme = 16973913;
    }
    if (paramInt2 != 0) {
      mTheme = paramInt2;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public void setupDialog(@NonNull Dialog paramDialog, int paramInt)
  {
    if ((paramInt != 1) && (paramInt != 2))
    {
      if (paramInt != 3) {
        return;
      }
      Window localWindow = paramDialog.getWindow();
      if (localWindow != null) {
        localWindow.addFlags(24);
      }
    }
    paramDialog.requestWindowFeature(1);
  }
  
  public int show(@NonNull FragmentTransaction paramFragmentTransaction, @Nullable String paramString)
  {
    mDismissed = false;
    mShownByMe = true;
    paramFragmentTransaction.add(this, paramString);
    mViewDestroyed = false;
    int i = paramFragmentTransaction.commit();
    mBackStackId = i;
    return i;
  }
  
  public void show(@NonNull FragmentManager paramFragmentManager, @Nullable String paramString)
  {
    mDismissed = false;
    mShownByMe = true;
    paramFragmentManager = paramFragmentManager.beginTransaction();
    paramFragmentManager.add(this, paramString);
    paramFragmentManager.commit();
  }
  
  public void showNow(@NonNull FragmentManager paramFragmentManager, @Nullable String paramString)
  {
    mDismissed = false;
    mShownByMe = true;
    paramFragmentManager = paramFragmentManager.beginTransaction();
    paramFragmentManager.add(this, paramString);
    paramFragmentManager.commitNow();
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.DialogFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */