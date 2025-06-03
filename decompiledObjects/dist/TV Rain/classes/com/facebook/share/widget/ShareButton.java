package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.FacebookButtonBase;
import com.facebook.common.R.drawable;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.R.style;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.ShareContent;

public final class ShareButton
  extends ShareButtonBase
{
  public ShareButton(Context paramContext)
  {
    super(paramContext, null, 0, "fb_share_button_create", "fb_share_button_did_tap");
  }
  
  public ShareButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0, "fb_share_button_create", "fb_share_button_did_tap");
  }
  
  public ShareButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, "fb_share_button_create", "fb_share_button_did_tap");
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), R.drawable.com_facebook_button_icon), null, null, null);
  }
  
  public int getDefaultRequestCode()
  {
    return CallbackManagerImpl.RequestCodeOffset.Share.toRequestCode();
  }
  
  public int getDefaultStyleResource()
  {
    return R.style.com_facebook_button_share;
  }
  
  public FacebookDialogBase<ShareContent, Sharer.Result> getDialog()
  {
    ShareDialog localShareDialog;
    if (getFragment() != null) {
      localShareDialog = new ShareDialog(getFragment(), getRequestCode());
    } else if (getNativeFragment() != null) {
      localShareDialog = new ShareDialog(getNativeFragment(), getRequestCode());
    } else {
      localShareDialog = new ShareDialog(getActivity(), getRequestCode());
    }
    return localShareDialog;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.ShareButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */