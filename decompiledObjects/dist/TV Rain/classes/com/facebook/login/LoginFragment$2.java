package com.facebook.login;

import android.view.View;

class LoginFragment$2
  implements LoginClient.BackgroundProcessingListener
{
  public LoginFragment$2(LoginFragment paramLoginFragment, View paramView) {}
  
  public void onBackgroundProcessingStarted()
  {
    val$progressBar.setVisibility(0);
  }
  
  public void onBackgroundProcessingStopped()
  {
    val$progressBar.setVisibility(8);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.LoginFragment.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */