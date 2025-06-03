package com.facebook.share.widget;

import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareStoryContent;

class ShareDialog$NativeHandler
  extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$NativeHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }
  
  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramShareContent != null)
    {
      bool2 = bool1;
      if (!(paramShareContent instanceof ShareCameraEffectContent)) {
        if ((paramShareContent instanceof ShareStoryContent))
        {
          bool2 = bool1;
        }
        else
        {
          if (!paramBoolean)
          {
            if (paramShareContent.getShareHashtag() != null) {
              bool2 = DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.HASHTAG);
            } else {
              bool2 = true;
            }
            paramBoolean = bool2;
            if ((paramShareContent instanceof ShareLinkContent))
            {
              paramBoolean = bool2;
              if (!Utility.isNullOrEmpty(((ShareLinkContent)paramShareContent).getQuote())) {
                paramBoolean = bool2 & DialogPresenter.canPresentNativeDialogWithFeature(ShareDialogFeature.LINK_SHARE_QUOTES);
              }
            }
          }
          else
          {
            paramBoolean = true;
          }
          bool2 = bool1;
          if (paramBoolean)
          {
            bool2 = bool1;
            if (ShareDialog.access$500(paramShareContent.getClass())) {
              bool2 = true;
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public AppCall createAppCall(final ShareContent paramShareContent)
  {
    final Object localObject = this$0;
    ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$600((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.NATIVE);
    ShareContentValidation.validateForNativeShare(paramShareContent);
    localObject = this$0.createBaseAppCall();
    DialogPresenter.setupAppCallForNativeDialog((AppCall)localObject, new DialogPresenter.ParameterProvider()
    {
      public Bundle getLegacyParameters()
      {
        return LegacyNativeDialogParameters.create(localObject.getCallId(), paramShareContent, val$shouldFailOnDataError);
      }
      
      public Bundle getParameters()
      {
        return NativeDialogParameters.create(localObject.getCallId(), paramShareContent, val$shouldFailOnDataError);
      }
    }, ShareDialog.access$800(paramShareContent.getClass()));
    return (AppCall)localObject;
  }
  
  public Object getMode()
  {
    return ShareDialog.Mode.NATIVE;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog.NativeHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */