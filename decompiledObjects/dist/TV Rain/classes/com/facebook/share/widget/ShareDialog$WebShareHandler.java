package com.facebook.share.widget;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.AppCall;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.Builder;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.Builder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

class ShareDialog$WebShareHandler
  extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
{
  private ShareDialog$WebShareHandler(ShareDialog paramShareDialog)
  {
    super(paramShareDialog);
  }
  
  private SharePhotoContent createAndMapAttachments(SharePhotoContent paramSharePhotoContent, UUID paramUUID)
  {
    SharePhotoContent.Builder localBuilder = new SharePhotoContent.Builder().readFrom(paramSharePhotoContent);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    for (int i = 0; i < paramSharePhotoContent.getPhotos().size(); i++)
    {
      SharePhoto localSharePhoto1 = (SharePhoto)paramSharePhotoContent.getPhotos().get(i);
      Object localObject = localSharePhoto1.getBitmap();
      SharePhoto localSharePhoto2 = localSharePhoto1;
      if (localObject != null)
      {
        localObject = NativeAppCallAttachmentStore.createAttachment(paramUUID, (Bitmap)localObject);
        localSharePhoto2 = new SharePhoto.Builder().readFrom(localSharePhoto1).setImageUrl(Uri.parse(((NativeAppCallAttachmentStore.Attachment)localObject).getAttachmentUrl())).setBitmap(null).build();
        localArrayList2.add(localObject);
      }
      localArrayList1.add(localSharePhoto2);
    }
    localBuilder.setPhotos(localArrayList1);
    NativeAppCallAttachmentStore.addAttachments(localArrayList2);
    return localBuilder.build();
  }
  
  private String getActionName(ShareContent paramShareContent)
  {
    if ((!(paramShareContent instanceof ShareLinkContent)) && (!(paramShareContent instanceof SharePhotoContent)))
    {
      if ((paramShareContent instanceof ShareOpenGraphContent)) {
        return "share_open_graph";
      }
      return null;
    }
    return "share";
  }
  
  public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
  {
    if ((paramShareContent != null) && (ShareDialog.access$900(paramShareContent))) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    return paramBoolean;
  }
  
  public AppCall createAppCall(ShareContent paramShareContent)
  {
    Object localObject = this$0;
    ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$1000((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.WEB);
    AppCall localAppCall = this$0.createBaseAppCall();
    ShareContentValidation.validateForWebShare(paramShareContent);
    if ((paramShareContent instanceof ShareLinkContent)) {
      localObject = WebDialogParameters.create((ShareLinkContent)paramShareContent);
    } else if ((paramShareContent instanceof SharePhotoContent)) {
      localObject = WebDialogParameters.create(createAndMapAttachments((SharePhotoContent)paramShareContent, localAppCall.getCallId()));
    } else {
      localObject = WebDialogParameters.create((ShareOpenGraphContent)paramShareContent);
    }
    DialogPresenter.setupAppCallForWebDialog(localAppCall, getActionName(paramShareContent), (Bundle)localObject);
    return localAppCall;
  }
  
  public Object getMode()
  {
    return ShareDialog.Mode.WEB;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog.WebShareHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */