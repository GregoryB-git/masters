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
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.DeviceShareDialog;
import com.facebook.share.DeviceShareDialog.Result;
import com.facebook.share.R.style;
import com.facebook.share.model.ShareContent;

@Deprecated
public final class DeviceShareButton
  extends FacebookButtonBase
{
  private DeviceShareDialog dialog = null;
  private boolean enabledExplicitlySet = false;
  private int requestCode = 0;
  private ShareContent shareContent;
  
  public DeviceShareButton(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public DeviceShareButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  private DeviceShareButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, 0, "fb_device_share_button_create", "fb_device_share_button_did_tap");
    if (isInEditMode()) {
      paramInt = 0;
    } else {
      paramInt = getDefaultRequestCode();
    }
    requestCode = paramInt;
    internalSetEnabled(false);
  }
  
  private boolean canShare()
  {
    return new DeviceShareDialog(getActivity()).canShow(getShareContent());
  }
  
  private DeviceShareDialog getDialog()
  {
    DeviceShareDialog localDeviceShareDialog = dialog;
    if (localDeviceShareDialog != null) {
      return localDeviceShareDialog;
    }
    if (getFragment() != null) {
      dialog = new DeviceShareDialog(getFragment());
    } else if (getNativeFragment() != null) {
      dialog = new DeviceShareDialog(getNativeFragment());
    } else {
      dialog = new DeviceShareDialog(getActivity());
    }
    return dialog;
  }
  
  private void internalSetEnabled(boolean paramBoolean)
  {
    setEnabled(paramBoolean);
    enabledExplicitlySet = false;
  }
  
  private void setRequestCode(int paramInt)
  {
    if (!FacebookSdk.isFacebookRequestCode(paramInt))
    {
      requestCode = paramInt;
      return;
    }
    throw new IllegalArgumentException(a.g("Request code ", paramInt, " cannot be within the range reserved by the Facebook SDK."));
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setInternalOnClickListener(getShareOnClickListener());
  }
  
  public int getDefaultRequestCode()
  {
    return CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
  }
  
  public int getDefaultStyleResource()
  {
    return R.style.com_facebook_button_share;
  }
  
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
          DeviceShareButton.access$000(DeviceShareButton.this, paramAnonymousView);
          DeviceShareButton.access$100(DeviceShareButton.this).show(getShareContent());
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(paramAnonymousView, this);
        }
      }
    };
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<DeviceShareDialog.Result> paramFacebookCallback)
  {
    getDialog().registerCallback(paramCallbackManager, paramFacebookCallback);
  }
  
  public void registerCallback(CallbackManager paramCallbackManager, FacebookCallback<DeviceShareDialog.Result> paramFacebookCallback, int paramInt)
  {
    setRequestCode(paramInt);
    getDialog().registerCallback(paramCallbackManager, paramFacebookCallback, paramInt);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    enabledExplicitlySet = true;
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
 * Qualified Name:     com.facebook.share.widget.DeviceShareButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */