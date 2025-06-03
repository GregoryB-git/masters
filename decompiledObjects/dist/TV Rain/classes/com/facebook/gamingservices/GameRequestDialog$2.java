package com.facebook.gamingservices;

import android.content.Intent;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.internal.ResultProcessor;
import com.facebook.share.internal.ShareInternalUtility;

class GameRequestDialog$2
  implements CallbackManagerImpl.Callback
{
  public GameRequestDialog$2(GameRequestDialog paramGameRequestDialog, ResultProcessor paramResultProcessor) {}
  
  public boolean onActivityResult(int paramInt, Intent paramIntent)
  {
    return ShareInternalUtility.handleActivityResult(this$0.getRequestCode(), paramInt, paramIntent, val$resultProcessor);
  }
}

/* Location:
 * Qualified Name:     com.facebook.gamingservices.GameRequestDialog.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */