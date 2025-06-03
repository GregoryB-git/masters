package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.FacebookButtonBase;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.internal.FacebookDialogBase;
import com.facebook.share.R.style;
import com.facebook.share.Sharer.Result;
import com.facebook.share.model.ShareContent;

@Deprecated
public final class SendButton
  extends ShareButtonBase
{
  public SendButton(Context paramContext)
  {
    super(paramContext, null, 0, "fb_send_button_create", "fb_send_button_did_tap");
  }
  
  public SendButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0, "fb_send_button_create", "fb_send_button_did_tap");
  }
  
  public SendButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt, "fb_send_button_create", "fb_send_button_did_tap");
  }
  
  public int getDefaultRequestCode()
  {
    return CallbackManagerImpl.RequestCodeOffset.Message.toRequestCode();
  }
  
  public int getDefaultStyleResource()
  {
    return R.style.com_facebook_button_send;
  }
  
  public FacebookDialogBase<ShareContent, Sharer.Result> getDialog()
  {
    MessageDialog localMessageDialog;
    if (getFragment() != null) {
      localMessageDialog = new MessageDialog(getFragment(), getRequestCode());
    } else if (getNativeFragment() != null) {
      localMessageDialog = new MessageDialog(getNativeFragment(), getRequestCode());
    } else {
      localMessageDialog = new MessageDialog(getActivity(), getRequestCode());
    }
    return localMessageDialog;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.widget.SendButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */