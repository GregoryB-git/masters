package com.facebook.share.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookCallback;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.DialogFeature;
import com.facebook.internal.DialogPresenter;
import com.facebook.internal.DialogPresenter.ParameterProvider;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FacebookDialogBase.ModeHandler;
import com.facebook.internal.FragmentWrapper;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public class LikeDialog
  extends FacebookDialogBase<LikeContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.Like.toRequestCode();
  private static final String TAG = "LikeDialog";
  
  @Deprecated
  public LikeDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public LikeDialog(android.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  @Deprecated
  public LikeDialog(androidx.fragment.app.Fragment paramFragment)
  {
    this(new FragmentWrapper(paramFragment));
  }
  
  @Deprecated
  public LikeDialog(FragmentWrapper paramFragmentWrapper)
  {
    super(paramFragmentWrapper, DEFAULT_REQUEST_CODE);
  }
  
  @Deprecated
  public static boolean canShowNativeDialog()
  {
    return false;
  }
  
  @Deprecated
  public static boolean canShowWebFallback()
  {
    return false;
  }
  
  private static Bundle createParameters(LikeContent paramLikeContent)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("object_id", paramLikeContent.getObjectId());
    localBundle.putString("object_type", paramLikeContent.getObjectType());
    return localBundle;
  }
  
  private static DialogFeature getFeature()
  {
    return LikeDialogFeature.LIKE_DIALOG;
  }
  
  public AppCall createBaseAppCall()
  {
    return new AppCall(getRequestCode());
  }
  
  public List<FacebookDialogBase<LikeContent, Result>.ModeHandler> getOrderedModeHandlers()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new NativeHandler(null));
    localArrayList.add(new WebFallbackHandler(null));
    return localArrayList;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, final FacebookCallback<Result> paramFacebookCallback)
  {
    if (paramFacebookCallback == null) {
      paramFacebookCallback = null;
    } else {
      paramFacebookCallback = new ResultProcessor(paramFacebookCallback)
      {
        public void onSuccess(AppCall paramAnonymousAppCall, Bundle paramAnonymousBundle)
        {
          paramFacebookCallback.onSuccess(new LikeDialog.Result(paramAnonymousBundle));
        }
      };
    }
    paramFacebookCallback = new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        return ShareInternalUtility.handleActivityResult(getRequestCode(), paramAnonymousInt, paramAnonymousIntent, paramFacebookCallback);
      }
    };
    paramCallbackManagerImpl.registerCallback(getRequestCode(), paramFacebookCallback);
  }
  
  @Deprecated
  public void show(LikeContent paramLikeContent) {}
  
  public class NativeHandler
    extends FacebookDialogBase<LikeContent, LikeDialog.Result>.ModeHandler
  {
    private NativeHandler()
    {
      super();
    }
    
    public boolean canShow(LikeContent paramLikeContent, boolean paramBoolean)
    {
      return false;
    }
    
    public AppCall createAppCall(final LikeContent paramLikeContent)
    {
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForNativeDialog(localAppCall, new DialogPresenter.ParameterProvider()
      {
        public Bundle getLegacyParameters()
        {
          Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
          return new Bundle();
        }
        
        public Bundle getParameters()
        {
          return LikeDialog.access$200(paramLikeContent);
        }
      }, LikeDialog.access$300());
      return localAppCall;
    }
  }
  
  @Deprecated
  public static final class Result
  {
    private final Bundle bundle;
    
    public Result(Bundle paramBundle)
    {
      bundle = paramBundle;
    }
    
    public Bundle getData()
    {
      return bundle;
    }
  }
  
  public class WebFallbackHandler
    extends FacebookDialogBase<LikeContent, LikeDialog.Result>.ModeHandler
  {
    private WebFallbackHandler()
    {
      super();
    }
    
    public boolean canShow(LikeContent paramLikeContent, boolean paramBoolean)
    {
      return false;
    }
    
    public AppCall createAppCall(LikeContent paramLikeContent)
    {
      AppCall localAppCall = createBaseAppCall();
      DialogPresenter.setupAppCallForWebFallbackDialog(localAppCall, LikeDialog.access$200(paramLikeContent), LikeDialog.access$300());
      return localAppCall;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */