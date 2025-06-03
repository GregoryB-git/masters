package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
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
import com.facebook.share.Sharer;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.LegacyNativeDialogParameters;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.internal.NativeDialogParameters;
import com.facebook.share.internal.ShareContentValidation;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import z2;

@Deprecated
public final class MessageDialog
  extends FacebookDialogBase<ShareContent, Sharer.Result>
  implements Sharer
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
  private boolean shouldFailOnDataError = false;
  
  public MessageDialog(Activity paramActivity)
  {
    super(paramActivity, i);
    ShareInternalUtility.registerStaticShareCallback(i);
  }
  
  public MessageDialog(Activity paramActivity, int paramInt)
  {
    super(paramActivity, paramInt);
    ShareInternalUtility.registerStaticShareCallback(paramInt);
  }
  
  public MessageDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  public MessageDialog(android.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
  }
  
  public MessageDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  public MessageDialog(androidx.fragment.app.Fragment paramFragment, int paramInt)
  {
    this(new FragmentWrapper(paramFragment), paramInt);
  }
  
  private MessageDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, i);
    ShareInternalUtility.registerStaticShareCallback(i);
  }
  
  private MessageDialog(FragmentWrapper paramFragmentWrapper, int paramInt)
  {
    super(paramFragmentWrapper, paramInt);
    ShareInternalUtility.registerStaticShareCallback(paramInt);
  }
  
  public static boolean canShow(Class<? extends ShareContent> paramClass)
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
  
  private static DialogFeature getFeature(Class<? extends ShareContent> paramClass)
  {
    if (ShareLinkContent.class.isAssignableFrom(paramClass)) {
      return MessageDialogFeature.MESSAGE_DIALOG;
    }
    if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(paramClass)) {
      return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
    }
    if (ShareMessengerOpenGraphMusicTemplateContent.class.isAssignableFrom(paramClass)) {
      return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
    }
    if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(paramClass)) {
      return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
    }
    return null;
  }
  
  private static void logDialogShare(Context paramContext, ShareContent paramShareContent, AppCall paramAppCall)
  {
    Object localObject = getFeature(paramShareContent.getClass());
    if (localObject == MessageDialogFeature.MESSAGE_DIALOG) {
      localObject = "status";
    } else if (localObject == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE) {
      localObject = "GenericTemplate";
    } else if (localObject == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE) {
      localObject = "MediaTemplate";
    } else if (localObject == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE) {
      localObject = "OpenGraphMusicTemplate";
    } else {
      localObject = "unknown";
    }
    paramContext = new InternalAppEventsLogger(paramContext);
    localObject = z2.d("fb_share_dialog_content_type", (String)localObject);
    ((BaseBundle)localObject).putString("fb_share_dialog_content_uuid", paramAppCall.getCallId().toString());
    ((BaseBundle)localObject).putString("fb_share_dialog_content_page_id", paramShareContent.getPageId());
    paramContext.logEventImplicitly("fb_messenger_share_dialog_show", (Bundle)localObject);
  }
  
  public static void show(Activity paramActivity, ShareContent paramShareContent)
  {
    new MessageDialog(paramActivity).show(paramShareContent);
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
    new MessageDialog(paramFragmentWrapper).show(paramShareContent);
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeHandler(null));
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
  
  public class NativeHandler
    extends FacebookDialogBase<ShareContent, Sharer.Result>.ModeHandler
  {
    private NativeHandler()
    {
      super();
    }
    
    public boolean canShow(ShareContent paramShareContent, boolean paramBoolean)
    {
      if ((paramShareContent != null) && (MessageDialog.canShow(paramShareContent.getClass()))) {
        paramBoolean = true;
      } else {
        paramBoolean = false;
      }
      return paramBoolean;
    }
    
    public AppCall createAppCall(final ShareContent paramShareContent)
    {
      ShareContentValidation.validateForMessage(paramShareContent);
      final AppCall localAppCall = createBaseAppCall();
      final boolean bool = getShouldFailOnDataError();
      MessageDialog.access$200(MessageDialog.access$100(MessageDialog.this), paramShareContent, localAppCall);
      DialogPresenter.setupAppCallForNativeDialog(localAppCall, new DialogPresenter.ParameterProvider()
      {
        public Bundle getLegacyParameters()
        {
          return LegacyNativeDialogParameters.create(localAppCall.getCallId(), paramShareContent, bool);
        }
        
        public Bundle getParameters()
        {
          return NativeDialogParameters.create(localAppCall.getCallId(), paramShareContent, bool);
        }
      }, MessageDialog.access$300(paramShareContent.getClass()));
      return localAppCall;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.MessageDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */