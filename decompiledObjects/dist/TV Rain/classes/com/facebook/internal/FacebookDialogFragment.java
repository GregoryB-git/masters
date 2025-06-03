package com.facebook.internal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.BaseBundle;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;

public class FacebookDialogFragment
  extends DialogFragment
{
  public static final String TAG = "FacebookDialogFragment";
  private Dialog dialog;
  
  private void onCompleteWebDialog(Bundle paramBundle, FacebookException paramFacebookException)
  {
    FragmentActivity localFragmentActivity = getActivity();
    paramBundle = NativeProtocol.createProtocolResultIntent(localFragmentActivity.getIntent(), paramBundle, paramFacebookException);
    int i;
    if (paramFacebookException == null) {
      i = -1;
    } else {
      i = 0;
    }
    localFragmentActivity.setResult(i, paramBundle);
    localFragmentActivity.finish();
  }
  
  private void onCompleteWebFallbackDialog(Bundle paramBundle)
  {
    FragmentActivity localFragmentActivity = getActivity();
    Intent localIntent = new Intent();
    Bundle localBundle = paramBundle;
    if (paramBundle == null) {
      localBundle = new Bundle();
    }
    localIntent.putExtras(localBundle);
    localFragmentActivity.setResult(-1, localIntent);
    localFragmentActivity.finish();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (((dialog instanceof WebDialog)) && (isResumed())) {
      ((WebDialog)dialog).resize();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (dialog == null)
    {
      paramBundle = getActivity();
      Bundle localBundle = NativeProtocol.getMethodArgumentsFromIntent(paramBundle.getIntent());
      String str;
      if (!localBundle.getBoolean("is_fallback", false))
      {
        str = localBundle.getString("action");
        localBundle = localBundle.getBundle("params");
        if (Utility.isNullOrEmpty(str))
        {
          Utility.logd("FacebookDialogFragment", "Cannot start a WebDialog with an empty/missing 'actionName'");
          paramBundle.finish();
          return;
        }
        paramBundle = new WebDialog.Builder(paramBundle, str, localBundle).setOnCompleteListener(new WebDialog.OnCompleteListener()
        {
          public void onComplete(Bundle paramAnonymousBundle, FacebookException paramAnonymousFacebookException)
          {
            FacebookDialogFragment.access$000(FacebookDialogFragment.this, paramAnonymousBundle, paramAnonymousFacebookException);
          }
        }).build();
      }
      else
      {
        str = localBundle.getString("url");
        if (Utility.isNullOrEmpty(str))
        {
          Utility.logd("FacebookDialogFragment", "Cannot start a fallback WebDialog with an empty/missing 'url'");
          paramBundle.finish();
          return;
        }
        paramBundle = FacebookWebFallbackDialog.newInstance(paramBundle, str, String.format("fb%s://bridge/", new Object[] { FacebookSdk.getApplicationId() }));
        paramBundle.setOnCompleteListener(new WebDialog.OnCompleteListener()
        {
          public void onComplete(Bundle paramAnonymousBundle, FacebookException paramAnonymousFacebookException)
          {
            FacebookDialogFragment.access$100(FacebookDialogFragment.this, paramAnonymousBundle);
          }
        });
      }
      dialog = paramBundle;
    }
  }
  
  @NonNull
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    if (dialog == null)
    {
      onCompleteWebDialog(null, null);
      setShowsDialog(false);
    }
    return dialog;
  }
  
  public void onDestroyView()
  {
    if ((getDialog() != null) && (getRetainInstance())) {
      getDialog().setDismissMessage(null);
    }
    super.onDestroyView();
  }
  
  public void onResume()
  {
    super.onResume();
    Dialog localDialog = dialog;
    if ((localDialog instanceof WebDialog)) {
      ((WebDialog)localDialog).resize();
    }
  }
  
  public void setDialog(Dialog paramDialog)
  {
    dialog = paramDialog;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FacebookDialogFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */