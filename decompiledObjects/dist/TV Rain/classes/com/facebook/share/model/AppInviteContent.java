package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;

@Deprecated
public final class AppInviteContent
  implements ShareModel
{
  @Deprecated
  public static final Parcelable.Creator<AppInviteContent> CREATOR = new Parcelable.Creator()
  {
    public AppInviteContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new AppInviteContent(paramAnonymousParcel);
    }
    
    public AppInviteContent[] newArray(int paramAnonymousInt)
    {
      return new AppInviteContent[paramAnonymousInt];
    }
  };
  private final String applinkUrl;
  private final AppInviteContent.Builder.Destination destination;
  private final String previewImageUrl;
  private final String promoCode;
  private final String promoText;
  
  @Deprecated
  public AppInviteContent(Parcel paramParcel)
  {
    applinkUrl = paramParcel.readString();
    previewImageUrl = paramParcel.readString();
    promoText = paramParcel.readString();
    promoCode = paramParcel.readString();
    paramParcel = paramParcel.readString();
    if (paramParcel.length() > 0) {
      destination = AppInviteContent.Builder.Destination.valueOf(paramParcel);
    } else {
      destination = AppInviteContent.Builder.Destination.FACEBOOK;
    }
  }
  
  private AppInviteContent(Builder paramBuilder)
  {
    applinkUrl = Builder.access$000(paramBuilder);
    previewImageUrl = Builder.access$100(paramBuilder);
    promoCode = Builder.access$200(paramBuilder);
    promoText = Builder.access$300(paramBuilder);
    destination = Builder.access$400(paramBuilder);
  }
  
  @Deprecated
  public int describeContents()
  {
    return 0;
  }
  
  @Deprecated
  public String getApplinkUrl()
  {
    return applinkUrl;
  }
  
  @Deprecated
  public AppInviteContent.Builder.Destination getDestination()
  {
    AppInviteContent.Builder.Destination localDestination = destination;
    if (localDestination != null) {
      return localDestination;
    }
    return AppInviteContent.Builder.Destination.FACEBOOK;
  }
  
  @Deprecated
  public String getPreviewImageUrl()
  {
    return previewImageUrl;
  }
  
  @Deprecated
  public String getPromotionCode()
  {
    return promoCode;
  }
  
  @Deprecated
  public String getPromotionText()
  {
    return promoText;
  }
  
  @Deprecated
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(applinkUrl);
    paramParcel.writeString(previewImageUrl);
    paramParcel.writeString(promoText);
    paramParcel.writeString(promoCode);
    paramParcel.writeString(destination.toString());
  }
  
  @Deprecated
  public static class Builder
    implements ShareModelBuilder<AppInviteContent, Builder>
  {
    private String applinkUrl;
    private Destination destination;
    private String previewImageUrl;
    private String promoCode;
    private String promoText;
    
    private boolean isAlphanumericWithSpaces(String paramString)
    {
      for (int i = 0; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if ((!Character.isDigit(c)) && (!Character.isLetter(c)) && (!Character.isSpaceChar(c))) {
          return false;
        }
      }
      return true;
    }
    
    @Deprecated
    public AppInviteContent build()
    {
      return new AppInviteContent(this, null);
    }
    
    @Deprecated
    public Builder readFrom(AppInviteContent paramAppInviteContent)
    {
      if (paramAppInviteContent == null) {
        return this;
      }
      return setApplinkUrl(paramAppInviteContent.getApplinkUrl()).setPreviewImageUrl(paramAppInviteContent.getPreviewImageUrl()).setPromotionDetails(paramAppInviteContent.getPromotionText(), paramAppInviteContent.getPromotionCode()).setDestination(paramAppInviteContent.getDestination());
    }
    
    @Deprecated
    public Builder setApplinkUrl(String paramString)
    {
      applinkUrl = paramString;
      return this;
    }
    
    @Deprecated
    public Builder setDestination(Destination paramDestination)
    {
      destination = paramDestination;
      return this;
    }
    
    @Deprecated
    public Builder setPreviewImageUrl(String paramString)
    {
      previewImageUrl = paramString;
      return this;
    }
    
    @Deprecated
    public Builder setPromotionDetails(String paramString1, String paramString2)
    {
      if (!TextUtils.isEmpty(paramString1))
      {
        if (paramString1.length() <= 80)
        {
          if (isAlphanumericWithSpaces(paramString1))
          {
            if (!TextUtils.isEmpty(paramString2)) {
              if (paramString2.length() <= 10)
              {
                if (!isAlphanumericWithSpaces(paramString2)) {
                  throw new IllegalArgumentException("Invalid promotion code, promotionCode can only contain alphanumeric characters and spaces.");
                }
              }
              else {
                throw new IllegalArgumentException("Invalid promotion code, promotionCode can be between1 and 10 characters long");
              }
            }
          }
          else {
            throw new IllegalArgumentException("Invalid promotion text, promotionText can only contain alphanumericcharacters and spaces.");
          }
        }
        else {
          throw new IllegalArgumentException("Invalid promotion text, promotionText needs to be between1 and 80 characters long");
        }
      }
      else {
        if (!TextUtils.isEmpty(paramString2)) {
          break label110;
        }
      }
      promoCode = paramString2;
      promoText = paramString1;
      return this;
      label110:
      throw new IllegalArgumentException("promotionCode cannot be specified without a valid promotionText");
    }
    
    @Deprecated
    public static enum Destination
    {
      private final String name;
      
      static
      {
        Destination localDestination1 = new Destination("FACEBOOK", 0, "facebook");
        FACEBOOK = localDestination1;
        Destination localDestination2 = new Destination("MESSENGER", 1, "messenger");
        MESSENGER = localDestination2;
        $VALUES = new Destination[] { localDestination1, localDestination2 };
      }
      
      private Destination(String paramString)
      {
        name = paramString;
      }
      
      public boolean equalsName(String paramString)
      {
        boolean bool;
        if (paramString == null) {
          bool = false;
        } else {
          bool = name.equals(paramString);
        }
        return bool;
      }
      
      public String toString()
      {
        return name;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.AppInviteContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */