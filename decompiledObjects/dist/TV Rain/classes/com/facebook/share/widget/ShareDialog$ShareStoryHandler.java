package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareStoryContent;

class ShareDialog$ShareStoryHandler
  extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$ShareStoryHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }
  
  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    if (((paramShareContent instanceof ShareStoryContent)) && (ShareDialog.access$500(paramShareContent.getClass()))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public AppCall createAppCall(final ShareContent paramShareContent)
  {
    ShareContentValidation.validateForStoryShare(paramShareContent);
    final AppCall localAppCall = this$0.createBaseAppCall();
    DialogPresenter.setupAppCallForNativeDialog(localAppCall, new DialogPresenter.ParameterProvider()
    {
      public Bundle getLegacyParameters()
      {
        return LegacyNativeDialogParameters.create(localAppCall.getCallId(), paramShareContent, val$shouldFailOnDataError);
      }
      
      public Bundle getParameters()
      {
        return NativeDialogParameters.create(localAppCall.getCallId(), paramShareContent, val$shouldFailOnDataError);
      }
    }, ShareDialog.access$800(paramShareContent.getClass()));
    return localAppCall;
  }
  
  public Object getMode()
  {
    return ShareDialog.Mode.NATIVE;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog.ShareStoryHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */