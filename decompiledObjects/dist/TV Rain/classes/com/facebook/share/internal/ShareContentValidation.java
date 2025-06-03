package com.facebook.share.internal;

import android.graphics.Bitmap;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import z2;

public class ShareContentValidation
{
  private static Validator ApiValidator;
  private static Validator DefaultValidator;
  private static Validator StoryValidator;
  private static Validator WebShareValidator;
  
  private static Validator getApiValidator()
  {
    if (ApiValidator == null) {
      ApiValidator = new ApiValidator(null);
    }
    return ApiValidator;
  }
  
  private static Validator getDefaultValidator()
  {
    if (DefaultValidator == null) {
      DefaultValidator = new Validator(null);
    }
    return DefaultValidator;
  }
  
  private static Validator getStoryValidator()
  {
    if (StoryValidator == null) {
      StoryValidator = new StoryShareValidator(null);
    }
    return StoryValidator;
  }
  
  private static Validator getWebShareValidator()
  {
    if (WebShareValidator == null) {
      WebShareValidator = new WebShareValidator(null);
    }
    return WebShareValidator;
  }
  
  private static void validate(ShareContent paramShareContent, Validator paramValidator)
    throws FacebookException
  {
    if (paramShareContent != null)
    {
      if ((paramShareContent instanceof ShareLinkContent)) {
        paramValidator.validate((ShareLinkContent)paramShareContent);
      } else if ((paramShareContent instanceof SharePhotoContent)) {
        paramValidator.validate((SharePhotoContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareVideoContent)) {
        paramValidator.validate((ShareVideoContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareOpenGraphContent)) {
        paramValidator.validate((ShareOpenGraphContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareMediaContent)) {
        paramValidator.validate((ShareMediaContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareCameraEffectContent)) {
        paramValidator.validate((ShareCameraEffectContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareMessengerOpenGraphMusicTemplateContent)) {
        paramValidator.validate((ShareMessengerOpenGraphMusicTemplateContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareMessengerMediaTemplateContent)) {
        paramValidator.validate((ShareMessengerMediaTemplateContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareMessengerGenericTemplateContent)) {
        paramValidator.validate((ShareMessengerGenericTemplateContent)paramShareContent);
      } else if ((paramShareContent instanceof ShareStoryContent)) {
        paramValidator.validate((ShareStoryContent)paramShareContent);
      }
      return;
    }
    throw new FacebookException("Must provide non-null content to share");
  }
  
  private static void validateCameraEffectContent(ShareCameraEffectContent paramShareCameraEffectContent, Validator paramValidator)
  {
    if (!Utility.isNullOrEmpty(paramShareCameraEffectContent.getEffectId())) {
      return;
    }
    throw new FacebookException("Must specify a non-empty effectId");
  }
  
  public static void validateForApiShare(ShareContent paramShareContent)
  {
    validate(paramShareContent, getApiValidator());
  }
  
  public static void validateForMessage(ShareContent paramShareContent)
  {
    validate(paramShareContent, getDefaultValidator());
  }
  
  public static void validateForNativeShare(ShareContent paramShareContent)
  {
    validate(paramShareContent, getDefaultValidator());
  }
  
  public static void validateForStoryShare(ShareContent paramShareContent)
  {
    validate(paramShareContent, getStoryValidator());
  }
  
  public static void validateForWebShare(ShareContent paramShareContent)
  {
    validate(paramShareContent, getWebShareValidator());
  }
  
  private static void validateLinkContent(ShareLinkContent paramShareLinkContent, Validator paramValidator)
  {
    paramShareLinkContent = paramShareLinkContent.getImageUrl();
    if ((paramShareLinkContent != null) && (!Utility.isWebUri(paramShareLinkContent))) {
      throw new FacebookException("Image Url must be an http:// or https:// url");
    }
  }
  
  private static void validateMediaContent(ShareMediaContent paramShareMediaContent, Validator paramValidator)
  {
    paramShareMediaContent = paramShareMediaContent.getMedia();
    if ((paramShareMediaContent != null) && (!paramShareMediaContent.isEmpty()))
    {
      if (paramShareMediaContent.size() <= 6)
      {
        paramShareMediaContent = paramShareMediaContent.iterator();
        while (paramShareMediaContent.hasNext()) {
          paramValidator.validate((ShareMedia)paramShareMediaContent.next());
        }
        return;
      }
      throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[] { Integer.valueOf(6) }));
    }
    throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
  }
  
  public static void validateMedium(ShareMedia paramShareMedia, Validator paramValidator)
  {
    if ((paramShareMedia instanceof SharePhoto))
    {
      paramValidator.validate((SharePhoto)paramShareMedia);
    }
    else
    {
      if (!(paramShareMedia instanceof ShareVideo)) {
        break label34;
      }
      paramValidator.validate((ShareVideo)paramShareMedia);
    }
    return;
    label34:
    throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[] { paramShareMedia.getClass().getSimpleName() }));
  }
  
  private static void validateMessengerOpenGraphMusicTemplate(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
  {
    if (!Utility.isNullOrEmpty(paramShareMessengerOpenGraphMusicTemplateContent.getPageId()))
    {
      if (paramShareMessengerOpenGraphMusicTemplateContent.getUrl() != null)
      {
        validateShareMessengerActionButton(paramShareMessengerOpenGraphMusicTemplateContent.getButton());
        return;
      }
      throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
    }
    throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
  }
  
  private static void validateOpenGraphAction(ShareOpenGraphAction paramShareOpenGraphAction, Validator paramValidator)
  {
    if (paramShareOpenGraphAction != null)
    {
      if (!Utility.isNullOrEmpty(paramShareOpenGraphAction.getActionType()))
      {
        paramValidator.validate(paramShareOpenGraphAction, false);
        return;
      }
      throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
    }
    throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
  }
  
  private static void validateOpenGraphContent(ShareOpenGraphContent paramShareOpenGraphContent, Validator paramValidator)
  {
    paramValidator.validate(paramShareOpenGraphContent.getAction());
    paramValidator = paramShareOpenGraphContent.getPreviewPropertyName();
    if (!Utility.isNullOrEmpty(paramValidator))
    {
      if (paramShareOpenGraphContent.getAction().get(paramValidator) != null) {
        return;
      }
      throw new FacebookException(z2.p("Property \"", paramValidator, "\" was not found on the action. The name of the preview property must match the name of an action property."));
    }
    throw new FacebookException("Must specify a previewPropertyName.");
  }
  
  private static void validateOpenGraphKey(String paramString, boolean paramBoolean)
  {
    if (!paramBoolean) {
      return;
    }
    String[] arrayOfString = paramString.split(":");
    if (arrayOfString.length >= 2)
    {
      int i = arrayOfString.length;
      int j = 0;
      while (j < i) {
        if (!arrayOfString[j].isEmpty()) {
          j++;
        } else {
          throw new FacebookException("Invalid key found in Open Graph dictionary: %s", new Object[] { paramString });
        }
      }
      return;
    }
    throw new FacebookException("Open Graph keys must be namespaced: %s", new Object[] { paramString });
  }
  
  private static void validateOpenGraphObject(ShareOpenGraphObject paramShareOpenGraphObject, Validator paramValidator)
  {
    if (paramShareOpenGraphObject != null)
    {
      paramValidator.validate(paramShareOpenGraphObject, true);
      return;
    }
    throw new FacebookException("Cannot share a null ShareOpenGraphObject");
  }
  
  private static void validateOpenGraphValueContainer(ShareOpenGraphValueContainer paramShareOpenGraphValueContainer, Validator paramValidator, boolean paramBoolean)
  {
    Iterator localIterator1 = paramShareOpenGraphValueContainer.keySet().iterator();
    while (localIterator1.hasNext())
    {
      Object localObject = (String)localIterator1.next();
      validateOpenGraphKey((String)localObject, paramBoolean);
      localObject = paramShareOpenGraphValueContainer.get((String)localObject);
      if ((localObject instanceof List))
      {
        Iterator localIterator2 = ((List)localObject).iterator();
        while (localIterator2.hasNext())
        {
          localObject = localIterator2.next();
          if (localObject == null) {
            break label97;
          }
          validateOpenGraphValueContainerObject(localObject, paramValidator);
        }
        continue;
        label97:
        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
      }
      else
      {
        validateOpenGraphValueContainerObject(localObject, paramValidator);
      }
    }
  }
  
  private static void validateOpenGraphValueContainerObject(Object paramObject, Validator paramValidator)
  {
    if ((paramObject instanceof ShareOpenGraphObject)) {
      paramValidator.validate((ShareOpenGraphObject)paramObject);
    } else if ((paramObject instanceof SharePhoto)) {
      paramValidator.validate((SharePhoto)paramObject);
    }
  }
  
  private static void validatePhoto(SharePhoto paramSharePhoto)
  {
    if (paramSharePhoto != null)
    {
      Bitmap localBitmap = paramSharePhoto.getBitmap();
      paramSharePhoto = paramSharePhoto.getImageUrl();
      if ((localBitmap == null) && (paramSharePhoto == null)) {
        throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
      }
      return;
    }
    throw new FacebookException("Cannot share a null SharePhoto");
  }
  
  private static void validatePhotoContent(SharePhotoContent paramSharePhotoContent, Validator paramValidator)
  {
    paramSharePhotoContent = paramSharePhotoContent.getPhotos();
    if ((paramSharePhotoContent != null) && (!paramSharePhotoContent.isEmpty()))
    {
      if (paramSharePhotoContent.size() <= 6)
      {
        paramSharePhotoContent = paramSharePhotoContent.iterator();
        while (paramSharePhotoContent.hasNext()) {
          paramValidator.validate((SharePhoto)paramSharePhotoContent.next());
        }
        return;
      }
      throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[] { Integer.valueOf(6) }));
    }
    throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
  }
  
  private static void validatePhotoForApi(SharePhoto paramSharePhoto, Validator paramValidator)
  {
    validatePhoto(paramSharePhoto);
    Bitmap localBitmap = paramSharePhoto.getBitmap();
    paramSharePhoto = paramSharePhoto.getImageUrl();
    if ((localBitmap == null) && (Utility.isWebUri(paramSharePhoto)) && (!paramValidator.isOpenGraphContent())) {
      throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
    }
  }
  
  private static void validatePhotoForNativeDialog(SharePhoto paramSharePhoto, Validator paramValidator)
  {
    validatePhotoForApi(paramSharePhoto, paramValidator);
    if ((paramSharePhoto.getBitmap() != null) || (!Utility.isWebUri(paramSharePhoto.getImageUrl()))) {
      Validate.hasContentProvider(FacebookSdk.getApplicationContext());
    }
  }
  
  private static void validatePhotoForWebDialog(SharePhoto paramSharePhoto, Validator paramValidator)
  {
    validatePhoto(paramSharePhoto);
  }
  
  private static void validateShareMessengerActionButton(ShareMessengerActionButton paramShareMessengerActionButton)
  {
    if (paramShareMessengerActionButton == null) {
      return;
    }
    if (!Utility.isNullOrEmpty(paramShareMessengerActionButton.getTitle()))
    {
      if ((paramShareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
        validateShareMessengerURLActionButton((ShareMessengerURLActionButton)paramShareMessengerActionButton);
      }
      return;
    }
    throw new FacebookException("Must specify title for ShareMessengerActionButton");
  }
  
  private static void validateShareMessengerGenericTemplateContent(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
  {
    if (!Utility.isNullOrEmpty(paramShareMessengerGenericTemplateContent.getPageId()))
    {
      if (paramShareMessengerGenericTemplateContent.getGenericTemplateElement() != null)
      {
        if (!Utility.isNullOrEmpty(paramShareMessengerGenericTemplateContent.getGenericTemplateElement().getTitle()))
        {
          validateShareMessengerActionButton(paramShareMessengerGenericTemplateContent.getGenericTemplateElement().getButton());
          return;
        }
        throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
      }
      throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
    }
    throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
  }
  
  private static void validateShareMessengerMediaTemplateContent(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
  {
    if (!Utility.isNullOrEmpty(paramShareMessengerMediaTemplateContent.getPageId()))
    {
      if ((paramShareMessengerMediaTemplateContent.getMediaUrl() == null) && (Utility.isNullOrEmpty(paramShareMessengerMediaTemplateContent.getAttachmentId()))) {
        throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
      }
      validateShareMessengerActionButton(paramShareMessengerMediaTemplateContent.getButton());
      return;
    }
    throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
  }
  
  private static void validateShareMessengerURLActionButton(ShareMessengerURLActionButton paramShareMessengerURLActionButton)
  {
    if (paramShareMessengerURLActionButton.getUrl() != null) {
      return;
    }
    throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
  }
  
  private static void validateStoryContent(ShareStoryContent paramShareStoryContent, Validator paramValidator)
  {
    if ((paramShareStoryContent != null) && ((paramShareStoryContent.getBackgroundAsset() != null) || (paramShareStoryContent.getStickerAsset() != null)))
    {
      if (paramShareStoryContent.getBackgroundAsset() != null) {
        paramValidator.validate(paramShareStoryContent.getBackgroundAsset());
      }
      if (paramShareStoryContent.getStickerAsset() != null) {
        paramValidator.validate(paramShareStoryContent.getStickerAsset());
      }
      return;
    }
    throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
  }
  
  private static void validateVideo(ShareVideo paramShareVideo, Validator paramValidator)
  {
    if (paramShareVideo != null)
    {
      paramShareVideo = paramShareVideo.getLocalUrl();
      if (paramShareVideo != null)
      {
        if ((!Utility.isContentUri(paramShareVideo)) && (!Utility.isFileUri(paramShareVideo))) {
          throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
        return;
      }
      throw new FacebookException("ShareVideo does not have a LocalUrl specified");
    }
    throw new FacebookException("Cannot share a null ShareVideo");
  }
  
  private static void validateVideoContent(ShareVideoContent paramShareVideoContent, Validator paramValidator)
  {
    paramValidator.validate(paramShareVideoContent.getVideo());
    paramShareVideoContent = paramShareVideoContent.getPreviewPhoto();
    if (paramShareVideoContent != null) {
      paramValidator.validate(paramShareVideoContent);
    }
  }
  
  public static class ApiValidator
    extends ShareContentValidation.Validator
  {
    private ApiValidator()
    {
      super();
    }
    
    public void validate(ShareLinkContent paramShareLinkContent)
    {
      if (Utility.isNullOrEmpty(paramShareLinkContent.getQuote())) {
        return;
      }
      throw new FacebookException("Cannot share link content with quote using the share api");
    }
    
    public void validate(ShareMediaContent paramShareMediaContent)
    {
      throw new FacebookException("Cannot share ShareMediaContent using the share api");
    }
    
    public void validate(SharePhoto paramSharePhoto)
    {
      ShareContentValidation.access$600(paramSharePhoto, this);
    }
    
    public void validate(ShareVideoContent paramShareVideoContent)
    {
      if (Utility.isNullOrEmpty(paramShareVideoContent.getPlaceId()))
      {
        if (Utility.isNullOrEmpty(paramShareVideoContent.getPeopleIds()))
        {
          if (Utility.isNullOrEmpty(paramShareVideoContent.getRef())) {
            return;
          }
          throw new FacebookException("Cannot share video content with referrer URL using the share api");
        }
        throw new FacebookException("Cannot share video content with people IDs using the share api");
      }
      throw new FacebookException("Cannot share video content with place IDs using the share api");
    }
  }
  
  public static class StoryShareValidator
    extends ShareContentValidation.Validator
  {
    private StoryShareValidator()
    {
      super();
    }
    
    public void validate(ShareStoryContent paramShareStoryContent)
    {
      ShareContentValidation.access$400(paramShareStoryContent, this);
    }
  }
  
  public static class Validator
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
  
  public static class WebShareValidator
    extends ShareContentValidation.Validator
  {
    private WebShareValidator()
    {
      super();
    }
    
    public void validate(ShareMediaContent paramShareMediaContent)
    {
      throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
    }
    
    public void validate(SharePhoto paramSharePhoto)
    {
      ShareContentValidation.access$500(paramSharePhoto, this);
    }
    
    public void validate(ShareVideoContent paramShareVideoContent)
    {
      throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareContentValidation
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */