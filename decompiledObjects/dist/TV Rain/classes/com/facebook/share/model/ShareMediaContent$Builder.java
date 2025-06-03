package com.facebook.share.model;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShareMediaContent$Builder
  extends ShareContent.Builder<ShareMediaContent, Builder>
{
  private final List<ShareMedia> media = new ArrayList();
  
  public Builder addMedia(@Nullable List<ShareMedia> paramList)
  {
    if (paramList != null)
    {
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        addMedium((ShareMedia)paramList.next());
      }
    }
    return this;
  }
  
  public Builder addMedium(@Nullable ShareMedia paramShareMedia)
  {
    if (paramShareMedia != null)
    {
      if ((paramShareMedia instanceof SharePhoto))
      {
        paramShareMedia = new SharePhoto.Builder().readFrom((SharePhoto)paramShareMedia).build();
      }
      else
      {
        if (!(paramShareMedia instanceof ShareVideo)) {
          break label71;
        }
        paramShareMedia = new ShareVideo.Builder().readFrom((ShareVideo)paramShareMedia).build();
      }
      media.add(paramShareMedia);
      return this;
      label71:
      throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
    }
    return this;
  }
  
  public ShareMediaContent build()
  {
    return new ShareMediaContent(this, null);
  }
  
  public Builder readFrom(ShareMediaContent paramShareMediaContent)
  {
    if (paramShareMediaContent == null) {
      return this;
    }
    return ((Builder)super.readFrom(paramShareMediaContent)).addMedia(paramShareMediaContent.getMedia());
  }
  
  public Builder setMedia(@Nullable List<ShareMedia> paramList)
  {
    media.clear();
    addMedia(paramList);
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMediaContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */