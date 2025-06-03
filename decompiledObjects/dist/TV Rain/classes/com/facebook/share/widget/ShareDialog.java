package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookCallback;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeAppCallAttachmentStore;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.internal.Utility;
import com.facebook.share.Sharer;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.internal.ShareStoryFeature;
import com.facebook.share.internal.WebDialogParameters;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto.Builder;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.SharePhotoContent.Builder;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class ShareDialog
  extends FacebookDialogBase<ShareContent, Sharer.Result>
  implements Sharer
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
  private static final String FEED_DIALOG = "feed";
  private static final String TAG = "ShareDialog";
  private static final String WEB_OG_SHARE_DIALOG = "share_open_graph";
  public static final String WEB_SHARE_DIALOG = "share";
  private boolean isAutomaticMode = true;
  private boolean shouldFailOnDataError = false;
  
  public ShareDialog(Activity paramActivity)
  {
    super(paramActivity, i);
    ShareInternalUtility.registerStaticShareCallback(i);
  }
  
  public ShareDialog(Activity paramActivity, int paramInt)
  {
    super(paramActivity, paramInt);
    ShareInternalUtility.registerStaticShareCallback(paramInt);
  }
  
  public ShareDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  public ShareDialog(android.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
  }
  
  public ShareDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  public ShareDialog(androidx.fragment.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
  }
  
  private ShareDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, i);
    ShareInternalUtility.registerStaticShareCallback(i);
  }
  
  private ShareDialog(FragmentWrapper paramFragmentWrapper, int paramInt)
  {
    super(paramFragmentWrapper, paramInt);
    ShareInternalUtility.registerStaticShareCallback(paramInt);
  }
  
  public static boolean canShow(Class<? extends ShareContent> paramClass)
  {
    boolean bool;
    if ((!canShowWebTypeCheck(paramClass)) && (!canShowNative(paramClass))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean canShowNative(Class<? extends ShareContent> paramClass)
  {
    paramClass = getFeature(paramClass);
    boolean bool;
    if ((paramClass != null) && (DialogPresenter.canPresentNativeDialogWithFeature(paramClass))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static boolean canShowWebCheck(ShareContent paramShareContent)
  {
    if (!canShowWebTypeCheck(paramShareContent.getClass())) {
      return false;
    }
    if ((paramShareContent instanceof ShareOpenGraphContent))
    {
      paramShareContent = (ShareOpenGraphContent)paramShareContent;
      try
      {
        ShareInternalUtility.toJSONObjectForWeb(paramShareContent);
      }
      catch (Exception paramShareContent)
      {
        Utility.logd(TAG, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", paramShareContent);
        return false;
      }
    }
    return true;
  }
  
  private static boolean canShowWebTypeCheck(Class<? extends ShareContent> paramClass)
  {
    boolean bool;
    if ((!ShareLinkContent.class.isAssignableFrom(paramClass)) && (!ShareOpenGraphContent.class.isAssignableFrom(paramClass)) && ((!SharePhotoContent.class.isAssignableFrom(paramClass)) || (!AccessToken.isCurrentAccessTokenActive()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static DialogFeature getFeature(Class<? extends ShareContent> paramClass)
  {
    if (ShareLinkContent.class.isAssignableFrom(paramClass)) {
      return ShareDialogFeature.SHARE_DIALOG;
    }
    if (SharePhotoContent.class.isAssignableFrom(paramClass)) {
      return ShareDialogFeature.PHOTOS;
    }
    if (ShareVideoContent.class.isAssignableFrom(paramClass)) {
      return ShareDialogFeature.VIDEO;
    }
    if (ShareOpenGraphContent.class.isAssignableFrom(paramClass)) {
      return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
    }
    if (ShareMediaContent.class.isAssignableFrom(paramClass)) {
      return ShareDialogFeature.MULTIMEDIA;
    }
    if (ShareCameraEffectContent.class.isAssignableFrom(paramClass)) {
      return CameraEffectFeature.SHARE_CAMERA_EFFECT;
    }
    if (ShareStoryContent.class.isAssignableFrom(paramClass)) {
      return ShareStoryFeature.SHARE_STORY_ASSET;
    }
    return null;
  }
  
  private void logDialogShare(Context paramContext, ShareContent paramShareContent, Mode paramMode)
  {
    if (isAutomaticMode) {
      paramMode = Mode.AUTOMATIC;
    }
    int i = 1.$SwitchMap$com$facebook$share$widget$ShareDialog$Mode[paramMode.ordinal()];
    Object localObject = "unknown";
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          paramMode = "unknown";
        } else {
          paramMode = "native";
        }
      }
      else {
        paramMode = "web";
      }
    }
    else {
      paramMode = "automatic";
    }
    DialogFeature localDialogFeature = getFeature(paramShareContent.getClass());
    if (localDialogFeature == ShareDialogFeature.SHARE_DIALOG)
    {
      paramShareContent = "status";
    }
    else if (localDialogFeature == ShareDialogFeature.PHOTOS)
    {
      paramShareContent = "photo";
    }
    else if (localDialogFeature == ShareDialogFeature.VIDEO)
    {
      paramShareContent = "video";
    }
    else
    {
      paramShareContent = (ShareContent)localObject;
      if (localDialogFeature == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
        paramShareContent = "open_graph";
      }
    }
    paramContext = new InternalAppEventsLogger(paramContext);
    localObject = new Bundle();
    ((BaseBundle)localObject).putString("fb_share_dialog_show", paramMode);
    ((BaseBundle)localObject).putString("fb_share_dialog_content_type", paramShareContent);
    paramContext.logEventImplicitly("fb_share_dialog_show", (Bundle)localObject);
  }
  
  public static void show(Activity paramActivity, ShareContent paramShareContent)
  {
    new ShareDialog(paramActivity).show(paramShareContent);
  }
  
  public static void show(android.app.Fragment paramFragment, ShareContent paramShareContent)
  {
    show(new FragmentWrapper(paramFragment), paramShareContent);
  }
  
  public static void show(androidx.fragment.app.Fragment paramFragment, ShareContent paramShareContent)
  {
    show(new FragmentWrapper(paramFragment), paramShareContent);
  }
  
  private static void show(FragmentWrapper paramFragmentWrapper, ShareContent paramShareContent)
  {
    new ShareDialog(paramFragmentWrapper).show(paramShareContent);
  }
  
  public boolean canShow(ShareContent paramShareContent, Mode paramMode)
  {
    Object localObject = paramMode;
    if (paramMode == Mode.AUTOMATIC) {
      localObject = FacebookDialogBase.BASE_AUTOMATIC_MODE;
    }
    return canShowImpl(paramShareContent, localObject);
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeHandler(null));
    localArrayList.add(new FeedHandler(null));
    localArrayList.add(new WebShareHandler(null));
    localArrayList.add(new CameraEffectHandler(null));
    localArrayList.add(new ShareStoryHandler(null));
    return localArrayList;
  }
  
  public boolean getShouldFailOnDataError()
  {
    return shouldFailOnDataError;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    ShareInternalUtility.registerSharerCallback(getRequestCode(), paramCallbackManagerImpl, paramFacebookCallback);
  }
  
  public void setShouldFailOnDataError(boolean paramBoolean)
  {
    shouldFailOnDataError = paramBoolean;
  }
  
  public void show(ShareContent paramShareContent, Mode paramMode)
  {
    boolean bool;
    if (paramMode == Mode.AUTOMATIC) {
      bool = true;
    } else {
      bool = false;
    }
    isAutomaticMode = bool;
    if (bool) {
      paramMode = FacebookDialogBase.BASE_AUTOMATIC_MODE;
    }
    showImpl(paramShareContent, paramMode);
  }
  
  public class CameraEffectHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private CameraEffectHandler()
    {
      super();
    }
    
    public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
    {
      if (((paramShareContent instanceof ShareCameraEffectContent)) && (ShareDialog.access$500(paramShareContent.getClass()))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      return paramBoolean;
    }
    
    public AppCall createAppCall(final ShareContent paramShareContent)
    {
      ShareContentValidation.validateForNativeShare(paramShareContent);
      final AppCall localAppCall = createBaseAppCall();
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
  
  public class FeedHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private FeedHandler()
    {
      super();
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
      Object localObject = ShareDialog.this;
      ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$1100((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.FEED);
      localObject = createBaseAppCall();
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
  
  public static enum Mode
  {
    static
    {
      Mode localMode1 = new Mode("AUTOMATIC", 0);
      AUTOMATIC = localMode1;
      Mode localMode2 = new Mode("NATIVE", 1);
      NATIVE = localMode2;
      Mode localMode3 = new Mode("WEB", 2);
      WEB = localMode3;
      Mode localMode4 = new Mode("FEED", 3);
      FEED = localMode4;
      $VALUES = new Mode[] { localMode1, localMode2, localMode3, localMode4 };
    }
    
    private Mode() {}
  }
  
  public class NativeHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private NativeHandler()
    {
      super();
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
      final Object localObject = ShareDialog.this;
      ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$600((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.NATIVE);
      ShareContentValidation.validateForNativeShare(paramShareContent);
      localObject = createBaseAppCall();
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
  
  public class ShareStoryHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private ShareStoryHandler()
    {
      super();
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
      final AppCall localAppCall = createBaseAppCall();
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
  
  public class WebShareHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private WebShareHandler()
    {
      super();
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
      Object localObject = ShareDialog.this;
      ShareDialog.access$700((ShareDialog)localObject, ShareDialog.access$1000((ShareDialog)localObject), paramShareContent, ShareDialog.Mode.WEB);
      AppCall localAppCall = createBaseAppCall();
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
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */