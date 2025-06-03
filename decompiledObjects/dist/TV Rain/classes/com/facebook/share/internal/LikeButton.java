package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.facebook.FacebookButtonBase;
import com.facebook.common.R.drawable;
import com.facebook.common.R.string;
import com.facebook.common.R.style;

@Deprecated
public class LikeButton
  extends FacebookButtonBase
{
  @Deprecated
  public LikeButton(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 0, 0, "fb_like_button_create", "fb_like_button_did_tap");
    setSelected(paramBoolean);
  }
  
  private void updateForLikeStatus()
  {
    if (isSelected())
    {
      setCompoundDrawablesWithIntrinsicBounds(R.drawable.com_facebook_button_like_icon_selected, 0, 0, 0);
      setText(getResources().getString(R.string.com_facebook_like_button_liked));
    }
    else
    {
      setCompoundDrawablesWithIntrinsicBounds(AppCompatResources.getDrawable(getContext(), R.drawable.com_facebook_button_icon), null, null, null);
      setText(getResources().getString(R.string.com_facebook_like_button_not_liked));
    }
  }
  
  public void configureButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    super.configureButton(paramContext, paramAttributeSet, paramInt1, paramInt2);
    updateForLikeStatus();
  }
  
  public int getDefaultRequestCode()
  {
    return 0;
  }
  
  public int getDefaultStyleResource()
  {
    return R.style.com_facebook_button_like;
  }
  
  @Deprecated
  public void setSelected(boolean paramBoolean)
  {
    super.setSelected(paramBoolean);
    updateForLikeStatus();
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */