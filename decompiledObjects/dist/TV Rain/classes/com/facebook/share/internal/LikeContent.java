package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

@Deprecated
public class LikeContent
  implements ShareModel
{
  @Deprecated
  public static final Parcelable.Creator<LikeContent> CREATOR = new Parcelable.Creator()
  {
    public LikeContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new LikeContent(paramAnonymousParcel);
    }
    
    public LikeContent[] newArray(int paramAnonymousInt)
    {
      return new LikeContent[paramAnonymousInt];
    }
  };
  private final String objectId;
  private final String objectType;
  
  @Deprecated
  public LikeContent(Parcel paramParcel)
  {
    objectId = paramParcel.readString();
    objectType = paramParcel.readString();
  }
  
  private LikeContent(Builder paramBuilder)
  {
    objectId = Builder.access$000(paramBuilder);
    objectType = Builder.access$100(paramBuilder);
  }
  
  @Deprecated
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public String getObjectId()
  {
    return objectId;
  }
  
  @Deprecated
  public String getObjectType()
  {
    return objectType;
  }
  
  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(objectId);
    paramParcel.writeString(objectType);
  }
  
  @Deprecated
  public static class Builder
    implements ShareModelBuilder<LikeContent, Builder>
  {
    private String objectId;
    private String objectType;
    
    @Deprecated
    public LikeContent build()
    {
      return new LikeContent(this, null);
    }
    
    @Deprecated
    public Builder readFrom(LikeContent paramLikeContent)
    {
      if (paramLikeContent == null) {
        return this;
      }
      return setObjectId(paramLikeContent.getObjectId()).setObjectType(paramLikeContent.getObjectType());
    }
    
    @Deprecated
    public Builder setObjectId(String paramString)
    {
      objectId = paramString;
      return this;
    }
    
    @Deprecated
    public Builder setObjectType(String paramString)
    {
      objectType = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LikeContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */