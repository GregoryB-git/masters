package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.internal.Utility.Mapper;
import com.facebook.share.model.SharePhoto;

final class WebDialogParameters$1
  implements Utility.Mapper<SharePhoto, String>
{
  public String apply(SharePhoto paramSharePhoto)
  {
    return paramSharePhoto.getImageUrl().toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.WebDialogParameters.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */