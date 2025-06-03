package com.facebook.referrals;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public class ReferralFragment
  extends Fragment
{
  public static final String TAG = "ReferralFragment";
  private ReferralClient referralClient;
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    referralClient.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    referralClient = new ReferralClient(this);
  }
  
  public void onResume()
  {
    super.onResume();
    referralClient.startReferral();
  }
}

/* Location:
 * Qualified Name:     com.facebook.referrals.ReferralFragment
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */