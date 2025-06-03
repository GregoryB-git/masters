package com.facebook.share.model;

import android.text.TextUtils;

@Deprecated
public class AppInviteContent$Builder
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

/* Location:
 * Qualified Name:     com.facebook.share.model.AppInviteContent.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */