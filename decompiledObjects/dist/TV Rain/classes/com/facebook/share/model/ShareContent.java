package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class ShareContent<P extends ShareContent, E extends Builder>
  implements ShareModel
{
  private final Uri contentUrl;
  private final ShareHashtag hashtag;
  private final String pageId;
  private final List<String> peopleIds;
  private final String placeId;
  private final String ref;
  
  public ShareContent(Parcel paramParcel)
  {
    contentUrl = ((Uri)paramParcel.readParcelable(Uri.class.getClassLoader()));
    peopleIds = readUnmodifiableStringList(paramParcel);
    placeId = paramParcel.readString();
    pageId = paramParcel.readString();
    ref = paramParcel.readString();
    hashtag = new ShareHashtag.Builder().readFrom(paramParcel).build();
  }
  
  public ShareContent(Builder paramBuilder)
  {
    contentUrl = Builder.access$000(paramBuilder);
    peopleIds = Builder.access$100(paramBuilder);
    placeId = Builder.access$200(paramBuilder);
    pageId = Builder.access$300(paramBuilder);
    ref = Builder.access$400(paramBuilder);
    hashtag = Builder.access$500(paramBuilder);
  }
  
  private List<String> readUnmodifiableStringList(Parcel paramParcel)
  {
    ArrayList localArrayList = new ArrayList();
    paramParcel.readStringList(localArrayList);
    if (localArrayList.size() == 0) {
      paramParcel = null;
    } else {
      paramParcel = Collections.unmodifiableList(localArrayList);
    }
    return paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Uri getContentUrl()
  {
    return contentUrl;
  }
  
  @Nullable
  public String getPageId()
  {
    return pageId;
  }
  
  @Nullable
  public List<String> getPeopleIds()
  {
    return peopleIds;
  }
  
  @Nullable
  public String getPlaceId()
  {
    return placeId;
  }
  
  @Nullable
  public String getRef()
  {
    return ref;
  }
  
  @Nullable
  public ShareHashtag getShareHashtag()
  {
    return hashtag;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(contentUrl, 0);
    paramParcel.writeStringList(peopleIds);
    paramParcel.writeString(placeId);
    paramParcel.writeString(pageId);
    paramParcel.writeString(ref);
    paramParcel.writeParcelable(hashtag, 0);
  }
  
  public static abstract class Builder<P extends ShareContent, E extends Builder>
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
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */