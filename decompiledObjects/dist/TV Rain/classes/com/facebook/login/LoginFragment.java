package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.facebook.common.R.id;
import com.facebook.common.R.layout;

public class LoginFragment
  extends Fragment
{
  public static final String EXTRA_REQUEST = "request";
  private static final String NULL_CALLING_PKG_ERROR_MSG = "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.";
  public static final String REQUEST_KEY = "com.facebook.LoginFragment:Request";
  public static final String RESULT_KEY = "com.facebook.LoginFragment:Result";
  private static final String SAVED_LOGIN_CLIENT = "loginClient";
  private static final String TAG = "LoginFragment";
  private String callingPackage;
  private LoginClient loginClient;
  private LoginClient.Request request;
  
  private void initializeCallingPackage(Activity paramActivity)
  {
    paramActivity = paramActivity.getCallingActivity();
    if (paramActivity == null) {
      return;
    }
    callingPackage = paramActivity.getPackageName();
  }
  
  private void onLoginClientCompleted(LoginClient.Result paramResult)
  {
    request = null;
    int i;
    if (code == LoginClient.Result.Code.CANCEL) {
      i = 0;
    } else {
      i = -1;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("com.facebook.LoginFragment:Result", paramResult);
    paramResult = new Intent();
    paramResult.putExtras(localBundle);
    if (isAdded())
    {
      getActivity().setResult(i, paramResult);
      getActivity().finish();
    }
  }
  
  public LoginClient createLoginClient()
  {
    return new LoginClient(this);
  }
  
  @LayoutRes
  public int getLayoutResId()
  {
    return R.layout.com_facebook_login_fragment;
  }
  
  public LoginClient getLoginClient()
  {
    return loginClient;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    loginClient.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      paramBundle = (LoginClient)paramBundle.getParcelable("loginClient");
      loginClient = paramBundle;
      paramBundle.setFragment(this);
    }
    else
    {
      loginClient = createLoginClient();
    }
    loginClient.setOnCompletedListener(new LoginClient.OnCompletedListener()
    {
      public void onCompleted(LoginClient.Result paramAnonymousResult)
      {
        LoginFragment.access$000(LoginFragment.this, paramAnonymousResult);
      }
    });
    paramBundle = getActivity();
    if (paramBundle == null) {
      return;
    }
    initializeCallingPackage(paramBundle);
    paramBundle = paramBundle.getIntent();
    if (paramBundle != null)
    {
      paramBundle = paramBundle.getBundleExtra("com.facebook.LoginFragment:Request");
      if (paramBundle != null) {
        request = ((LoginClient.Request)paramBundle.getParcelable("request"));
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, @Nullable final ViewGroup paramViewGroup, @Nullable Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(getLayoutResId(), paramViewGroup, false);
    paramViewGroup = paramLayoutInflater.findViewById(R.id.com_facebook_login_fragment_progress_bar);
    loginClient.setBackgroundProcessingListener(new LoginClient.BackgroundProcessingListener()
    {
      public void onBackgroundProcessingStarted()
      {
        paramViewGroup.setVisibility(0);
      }
      
      public void onBackgroundProcessingStopped()
      {
        paramViewGroup.setVisibility(8);
      }
    });
    return paramLayoutInflater;
  }
  
  public void onDestroy()
  {
    loginClient.cancelCurrentHandler();
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    View localView;
    if (getView() == null) {
      localView = null;
    } else {
      localView = getView().findViewById(R.id.com_facebook_login_fragment_progress_bar);
    }
    if (localView != null) {
      localView.setVisibility(8);
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (callingPackage == null)
    {
      Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
      getActivity().finish();
      return;
    }
    loginClient.startOrContinueAuth(request);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putParcelable("loginClient", loginClient);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */