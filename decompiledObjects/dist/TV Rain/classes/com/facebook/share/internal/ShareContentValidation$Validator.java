package com.facebook.share.internal;

import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;

class ShareContentValidation$Validator
{
  private boolean isOpenGraphContent = false;
  
  public boolean isOpenGraphContent()
  {
    return isOpenGraphContent;
  }
  
  public void validate(ShareCameraEffectContent paramShareCameraEffectContent)
  {
    ShareContentValidation.access$1100(paramShareCameraEffectContent, this);
  }
  
  public void validate(ShareLinkContent paramShareLinkContent)
  {
    ShareContentValidation.access$700(paramShareLinkContent, this);
  }
  
  public void validate(ShareMedia paramShareMedia)
  {
    ShareContentValidation.validateMedium(paramShareMedia, this);
  }
  
  public void validate(ShareMediaContent paramShareMediaContent)
  {
    ShareContentValidation.access$1000(paramShareMediaContent, this);
  }
  
  public void validate(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
  {
    ShareContentValidation.access$1900(paramShareMessengerGenericTemplateContent);
  }
  
  public void validate(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
  {
    ShareContentValidation.access$2000(paramShareMessengerMediaTemplateContent);
  }
  
  public void validate(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
  {
    ShareContentValidation.access$1800(paramShareMessengerOpenGraphMusicTemplateContent);
  }
  
  public void validate(ShareOpenGraphAction paramShareOpenGraphAction)
  {
    ShareContentValidation.access$1300(paramShareOpenGraphAction, this);
  }
  
  public void validate(ShareOpenGraphContent paramShareOpenGraphContent)
  {
    isOpenGraphContent = true;
    ShareContentValidation.access$1200(paramShareOpenGraphContent, this);
  }
  
  public void validate(ShareOpenGraphObject paramShareOpenGraphObject)
  {
    ShareContentValidation.access$1400(paramShareOpenGraphObject, this);
  }
  
  public void validate(ShareOpenGraphValueContainer paramShareOpenGraphValueContainer, boolean paramBoolean)
  {
    ShareContentValidation.access$1500(paramShareOpenGraphValueContainer, this, paramBoolean);
  }
  
  public void validate(SharePhoto paramSharePhoto)
  {
    ShareContentValidation.access$1600(paramSharePhoto, this);
  }
  
  public void validate(SharePhotoContent paramSharePhotoContent)
  {
    ShareContentValidation.access$800(paramSharePhotoContent, this);
  }
  
  public void validate(ShareStoryContent paramShareStoryContent)
  {
    ShareContentValidation.access$400(paramShareStoryContent, this);
  }
  
  public void validate(ShareVideo paramShareVideo)
  {
    ShareContentValidation.access$1700(paramShareVideo, this);
  }
  
  public void validate(ShareVideoContent paramShareVideoContent)
  {
    ShareContentValidation.access$900(paramShareVideoContent, this);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareContentValidation.Validator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */