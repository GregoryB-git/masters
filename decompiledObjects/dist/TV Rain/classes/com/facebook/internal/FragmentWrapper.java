package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;

public class FragmentWrapper
{
  private android.app.Fragment nativeFragment;
  private androidx.fragment.app.Fragment supportFragment;
  
  public FragmentWrapper(android.app.Fragment paramFragment)
  {
    Validate.notNull(paramFragment, "fragment");
    nativeFragment = paramFragment;
  }
  
  public FragmentWrapper(androidx.fragment.app.Fragment paramFragment)
  {
    Validate.notNull(paramFragment, "fragment");
    supportFragment = paramFragment;
  }
  
  public final Activity getActivity()
  {
    androidx.fragment.app.Fragment localFragment = supportFragment;
    if (localFragment != null) {
      return localFragment.getActivity();
    }
    return nativeFragment.getActivity();
  }
  
  public android.app.Fragment getNativeFragment()
  {
    return nativeFragment;
  }
  
  public androidx.fragment.app.Fragment getSupportFragment()
  {
    return supportFragment;
  }
  
  public void startActivityForResult(Intent paramIntent, int paramInt)
  {
    androidx.fragment.app.Fragment localFragment = supportFragment;
    if (localFragment != null) {
      localFragment.startActivityForResult(paramIntent, paramInt);
    } else {
      nativeFragment.startActivityForResult(paramIntent, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FragmentWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */