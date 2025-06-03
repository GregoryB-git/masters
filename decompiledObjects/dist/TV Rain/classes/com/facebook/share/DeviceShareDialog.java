package com.facebook.share;

import android.app.Activity;
import android.content.Intent;
import com.facebook.FacebookActivity;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.internal.AppCall;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.internal.CallbackManagerImpl.Callback;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.FragmentWrapper;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.List;

@Deprecated
public class DeviceShareDialog
  extends FacebookDialogBase<ShareContent, Result>
{
  private static final int DEFAULT_REQUEST_CODE = CallbackManagerImpl.RequestCodeOffset.DeviceShare.toRequestCode();
  
  public DeviceShareDialog(Activity paramActivity)
  {
    super(paramActivity, DEFAULT_REQUEST_CODE);
  }
  
  public DeviceShareDialog(android.app.Fragment paramFragment)
  {
    super(new FragmentWrapper(paramFragment), DEFAULT_REQUEST_CODE);
  }
  
  public DeviceShareDialog(androidx.fragment.app.Fragment paramFragment)
  {
    super(new FragmentWrapper(paramFragment), DEFAULT_REQUEST_CODE);
  }
  
  public boolean canShowImpl(ShareContent paramShareContent, Object paramObject)
  {
    boolean bool;
    if ((!(paramShareContent instanceof ShareLinkContent)) && (!(paramShareContent instanceof ShareOpenGraphContent))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public AppCall createBaseAppCall()
  {
    return null;
  }
  
  public List<FacebookDialogBase<ShareContent, Result>.ModeHandler> getOrderedModeHandlers()
  {
    return null;
  }
  
  public void registerCallbackImpl(CallbackManagerImpl paramCallbackManagerImpl, final FacebookCallback<Result> paramFacebookCallback)
  {
    paramCallbackManagerImpl.registerCallback(getRequestCode(), new CallbackManagerImpl.Callback()
    {
      public boolean onActivityResult(int paramAnonymousInt, Intent paramAnonymousIntent)
      {
        if (paramAnonymousIntent.hasExtra("error"))
        {
          paramAnonymousIntent = (FacebookRequestError)paramAnonymousIntent.getParcelableExtra("error");
          paramFacebookCallback.onError(paramAnonymousIntent.getException());
          return true;
        }
        paramFacebookCallback.onSuccess(new DeviceShareDialog.Result());
        return true;
      }
    });
  }
  
  public void showImpl(ShareContent paramShareContent, Object paramObject)
  {
    if (paramShareContent != null)
    {
      if ((!(paramShareContent instanceof ShareLinkContent)) && (!(paramShareContent instanceof ShareOpenGraphContent)))
      {
        paramShareContent = new StringBuilder();
        paramShareContent.append(getClass().getSimpleName());
        paramShareContent.append(" only supports ShareLinkContent or ShareOpenGraphContent");
        throw new FacebookException(paramShareContent.toString());
      }
      paramObject = new Intent();
      ((Intent)paramObject).setClass(FacebookSdk.getApplicationContext(), FacebookActivity.class);
      ((Intent)paramObject).setAction("DeviceShareDialogFragment");
      ((Intent)paramObject).putExtra("content", paramShareContent);
      startActivityForResult((Intent)paramObject, getRequestCode());
      return;
    }
    throw new FacebookException("Must provide non-null content to share");
  }
  
  public static class Result {}
}

/* Location:
 * Qualified Name:     com.facebook.share.DeviceShareDialog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */