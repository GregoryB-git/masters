package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class AppGroupCreationContent
  implements ShareModel
{
  public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator()
  {
    public AppGroupCreationContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new AppGroupCreationContent(paramAnonymousParcel);
    }
    
    public AppGroupCreationContent[] newArray(int paramAnonymousInt)
    {
      return new AppGroupCreationContent[paramAnonymousInt];
    }
  };
  private final String description;
  private final String name;
  private AppGroupPrivacy privacy;
  
  public AppGroupCreationContent(Parcel paramParcel)
  {
    name = paramParcel.readString();
    description = paramParcel.readString();
    privacy = ((AppGroupPrivacy)paramParcel.readSerializable());
  }
  
  private AppGroupCreationContent(Builder paramBuilder)
  {
    name = Builder.access$000(paramBuilder);
    description = Builder.access$100(paramBuilder);
    privacy = Builder.access$200(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public AppGroupPrivacy getAppGroupPrivacy()
  {
    return privacy;
  }
  
  public String getDescription()
  {
    return description;
  }
  
  public String getName()
  {
    return name;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(name);
    paramParcel.writeString(description);
    paramParcel.writeSerializable(privacy);
  }
  
  public static enum AppGroupPrivacy
  {
    static
    {
      AppGroupPrivacy localAppGroupPrivacy1 = new AppGroupPrivacy("Open", 0);
      Open = localAppGroupPrivacy1;
      AppGroupPrivacy localAppGroupPrivacy2 = new AppGroupPrivacy("Closed", 1);
      Closed = localAppGroupPrivacy2;
      $VALUES = new AppGroupPrivacy[] { localAppGroupPrivacy1, localAppGroupPrivacy2 };
    }
    
    private AppGroupPrivacy() {}
  }
  
  public static class Builder
    implements ShareModelBuilder<AppGroupCreationContent, Builder>
  {
    private String description;
    private String name;
    private AppGroupCreationContent.AppGroupPrivacy privacy;
    
    public AppGroupCreationContent build()
    {
      return new AppGroupCreationContent(this, null);
    }
    
    public Builder readFrom(AppGroupCreationContent paramAppGroupCreationContent)
    {
      if (paramAppGroupCreationContent == null) {
        return this;
      }
      return setName(paramAppGroupCreationContent.getName()).setDescription(paramAppGroupCreationContent.getDescription()).setAppGroupPrivacy(paramAppGroupCreationContent.getAppGroupPrivacy());
    }
    
    public Builder setAppGroupPrivacy(AppGroupCreationContent.AppGroupPrivacy paramAppGroupPrivacy)
    {
      privacy = paramAppGroupPrivacy;
      return this;
    }
    
    public Builder setDescription(String paramString)
    {
      description = paramString;
      return this;
    }
    
    public Builder setName(String paramString)
    {
      name = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.AppGroupCreationContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */