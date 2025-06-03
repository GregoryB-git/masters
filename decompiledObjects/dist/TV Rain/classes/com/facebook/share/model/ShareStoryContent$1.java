package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ShareStoryContent$1
  implements Parcelable.Creator<ShareStoryContent>
{
  public ShareStoryContent createFromParcel(Parcel paramParcel)
  {
    return new ShareStoryContent(paramParcel);
  }
  
  public ShareStoryContent[] newArray(int paramInt)
  {
    return new ShareStoryContent[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareStoryContent.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */