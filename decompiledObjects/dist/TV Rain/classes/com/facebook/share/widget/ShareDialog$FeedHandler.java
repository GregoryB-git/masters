package com.facebook.share.widget;

import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;

class ShareDialog$FeedHandler
  extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$FeedHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }
  
  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    if ((!(paramShareContent instanceof ShareLinkContent)) && (!(paramShareContent instanceof ShareFeedContent))) {
      paramBoolean = false;
    } else {
      paramBoolean = true;
    }
    return paramBoolean;
  }
  
  public AppCall createAppCall(ShareContent paramShareContent)
  {
    Object localObject = this$0;
    ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$1100((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.FEED);
    localObject = this$0.createBaseAppCall();
    if ((paramShareContent instanceof ShareLinkContent))
    {
      paramShareContent = (ShareLinkContent)paramShareContent;
      ShareContentValidation.validateForWebShare(paramShareContent);
      paramShareContent = WebDialogParameters.createForFeed(paramShareContent);
    }
    else
    {
      paramShareContent = WebDialogParameters.createForFeed((ShareFeedContent)paramShareContent);
    }
    DialogPresenter.setupAppCallForWebDialog((AppCall)localObject, "feed", paramShareContent);
    return (AppCall)localObject;
  }
  
  public Object getMode()
  {
    return ShareDialog.Mode.FEED;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog.FeedHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */