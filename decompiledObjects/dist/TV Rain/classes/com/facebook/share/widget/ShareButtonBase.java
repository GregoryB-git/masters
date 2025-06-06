package com.facebook.share.widget;

import a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.facebook.CallbackManager;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.Sharer.Result;
import com.facebook.share.internal.ShareInternalUtility;
import com.facebook.share.model.ShareContent;

public abstract class ShareButtonBase
  extends FacebookButtonBase
{
  private boolean enabledExplicitlySet = false;
  private int requestCode = 0;
  private ShareContent shareContent;
  
  public ShareButtonBase(Context paramContext, AttributeSet paramAttributeSet, int paramInt, String paramString1, String paramString2)
  {
    super(paramContext, paramAttributeSet, paramInt, 0, paramString1, paramString2);
    if (isInEditMode()) {
      paramInt = 0;
    } else {
      paramInt = getDefaultRequestCode();
    }
    requestCode = paramInt;
    internalSetEnabled(false);
  }
  
  private void internalSetEnabled(boolean paramBoolean)
  {
    setEnabled(paramBoolean);
    enabledExplicitlySet = false;
  }
  
  public boolean canShare()
  {
    return getDialog().canShow(getShareContent());
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setInternalOnClickListener(getShareOnClickListener());
  }
  
  public abstract FacebookDialogBase<ShareContent, Sharer.Result> getDialog();
  
  public int getRequestCode()
  {
    return requestCode;
  }
  
  public ShareContent getShareContent()
  {
    return shareContent;
  }
  
  public View.OnClickListener getShareOnClickListener()
  {
    new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          ShareButtonBase.access$000(ShareButtonBase.this, paramAnonymousView);
          getDialog().show(getShareContent());
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    };
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<Sharer.Result> paramFacebookCallback)
  {
    ShareInternalUtility.registerSharerCallback(getRequestCode(), paramCallbackManager, paramFacebookCallback);
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<Sharer.Result> paramFacebookCallback, int paramInt)
  {
    setRequestCode(paramInt);
    registerCallback(paramCallbackManager, paramFacebookCallback);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    enabledExplicitlySet = true;
  }
  
  public void setRequestCode(int paramInt)
  {
    if (!FacebookSdk.isFacebookRequestCode(paramInt))
    {
      requestCode = paramInt;
      return;
    }
    throw new IllegalArgumentException(a.g("Request code ", paramInt, " cannot be within the range reserved by the Facebook SDK."));
  }
  
  public void setShareContent(ShareContent paramShareContent)
  {
    shareContent = paramShareContent;
    if (!enabledExplicitlySet) {
      internalSetEnabled(canShare());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareButtonBase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */