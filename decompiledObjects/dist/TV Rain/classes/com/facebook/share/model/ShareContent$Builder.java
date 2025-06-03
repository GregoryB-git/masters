package com.facebook.share.model;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent$Builder<P extends ShareContent, E extends Builder>
  implements ShareModelBuilder<P, E>
{
  private Uri contentUrl;
  private ShareHashtag hashtag;
  private String pageId;
  private List<String> peopleIds;
  private String placeId;
  private String ref;
  
  public E readFrom(P paramP)
  {
    if (paramP == null) {
      return this;
    }
    return setContentUrl(paramP.getContentUrl()).setPeopleIds(paramP.getPeopleIds()).setPlaceId(paramP.getPlaceId()).setPageId(paramP.getPageId()).setRef(paramP.getRef()).setShareHashtag(paramP.getShareHashtag());
  }
  
  public E setContentUrl(@Nullable Uri paramUri)
  {
    contentUrl = paramUri;
    return this;
  }
  
  public E setPageId(@Nullable String paramString)
  {
    pageId = paramString;
    return this;
  }
  
  public E setPeopleIds(@Nullable List<String> paramList)
  {
    if (paramList == null) {
      paramList = null;
    } else {
      paramList = Collections.unmodifiableList(paramList);
    }
    peopleIds = paramList;
    return this;
  }
  
  public E setPlaceId(@Nullable String paramString)
  {
    placeId = paramString;
    return this;
  }
  
  public E setRef(@Nullable String paramString)
  {
    ref = paramString;
    return this;
  }
  
  public E setShareHashtag(@Nullable ShareHashtag paramShareHashtag)
  {
    hashtag = paramShareHashtag;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */