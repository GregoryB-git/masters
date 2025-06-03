package com.facebook.share.model;

import android.os.Parcel;
import androidx.annotation.Nullable;

@Deprecated
public abstract class ShareMessengerActionButton
  implements ShareModel
{
  private final String title;
  
  public ShareMessengerActionButton(Parcel paramParcel)
  {
    title = paramParcel.readString();
  }
  
  public ShareMessengerActionButton(Builder paramBuilder)
  {
    title = Builder.access$000(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(title);
  }
  
  public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder>
    implements ShareModelBuilder<M, B>
  {
    private String title;
    
    public B readFrom(M paramM)
    {
      if (paramM == null) {
        return this;
      }
      return setTitle(paramM.getTitle());
    }
    
    public B setTitle(@Nullable String paramString)
    {
      title = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareMessengerActionButton
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */