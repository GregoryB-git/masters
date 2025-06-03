package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class GameRequestContent
  implements ShareModel
{
  public static final Parcelable.Creator<GameRequestContent> CREATOR = new Parcelable.Creator()
  {
    public GameRequestContent createFromParcel(Parcel paramAnonymousParcel)
    {
      return new GameRequestContent(paramAnonymousParcel);
    }
    
    public GameRequestContent[] newArray(int paramAnonymousInt)
    {
      return new GameRequestContent[paramAnonymousInt];
    }
  };
  private final ActionType actionType;
  private final String data;
  private final Filters filters;
  private final String message;
  private final String objectId;
  private final List<String> recipients;
  private final List<String> suggestions;
  private final String title;
  
  public GameRequestContent(Parcel paramParcel)
  {
    message = paramParcel.readString();
    recipients = paramParcel.createStringArrayList();
    title = paramParcel.readString();
    data = paramParcel.readString();
    actionType = ((ActionType)paramParcel.readSerializable());
    objectId = paramParcel.readString();
    filters = ((Filters)paramParcel.readSerializable());
    ArrayList localArrayList = paramParcel.createStringArrayList();
    suggestions = localArrayList;
    paramParcel.readStringList(localArrayList);
  }
  
  private GameRequestContent(Builder paramBuilder)
  {
    message = Builder.access$000(paramBuilder);
    recipients = Builder.access$100(paramBuilder);
    title = Builder.access$200(paramBuilder);
    data = Builder.access$300(paramBuilder);
    actionType = Builder.access$400(paramBuilder);
    objectId = Builder.access$500(paramBuilder);
    filters = Builder.access$600(paramBuilder);
    suggestions = Builder.access$700(paramBuilder);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public ActionType getActionType()
  {
    return actionType;
  }
  
  public String getData()
  {
    return data;
  }
  
  public Filters getFilters()
  {
    return filters;
  }
  
  public String getMessage()
  {
    return message;
  }
  
  public String getObjectId()
  {
    return objectId;
  }
  
  public List<String> getRecipients()
  {
    return recipients;
  }
  
  public List<String> getSuggestions()
  {
    return suggestions;
  }
  
  public String getTitle()
  {
    return title;
  }
  
  public String getTo()
  {
    String str;
    if (getRecipients() != null) {
      str = TextUtils.join(",", getRecipients());
    } else {
      str = null;
    }
    return str;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(message);
    paramParcel.writeStringList(recipients);
    paramParcel.writeString(title);
    paramParcel.writeString(data);
    paramParcel.writeSerializable(actionType);
    paramParcel.writeString(objectId);
    paramParcel.writeSerializable(filters);
    paramParcel.writeStringList(suggestions);
  }
  
  public static enum ActionType
  {
    static
    {
      ActionType localActionType1 = new ActionType("SEND", 0);
      SEND = localActionType1;
      ActionType localActionType2 = new ActionType("ASKFOR", 1);
      ASKFOR = localActionType2;
      ActionType localActionType3 = new ActionType("TURN", 2);
      TURN = localActionType3;
      $VALUES = new ActionType[] { localActionType1, localActionType2, localActionType3 };
    }
    
    private ActionType() {}
  }
  
  public static class Builder
    implements ShareModelBuilder<GameRequestContent, Builder>
  {
    private GameRequestContent.ActionType actionType;
    private String data;
    private GameRequestContent.Filters filters;
    private String message;
    private String objectId;
    private List<String> recipients;
    private List<String> suggestions;
    private String title;
    
    public GameRequestContent build()
    {
      return new GameRequestContent(this, null);
    }
    
    public Builder readFrom(Parcel paramParcel)
    {
      return readFrom((GameRequestContent)paramParcel.readParcelable(GameRequestContent.class.getClassLoader()));
    }
    
    public Builder readFrom(GameRequestContent paramGameRequestContent)
    {
      if (paramGameRequestContent == null) {
        return this;
      }
      return setMessage(paramGameRequestContent.getMessage()).setRecipients(paramGameRequestContent.getRecipients()).setTitle(paramGameRequestContent.getTitle()).setData(paramGameRequestContent.getData()).setActionType(paramGameRequestContent.getActionType()).setObjectId(paramGameRequestContent.getObjectId()).setFilters(paramGameRequestContent.getFilters()).setSuggestions(paramGameRequestContent.getSuggestions());
    }
    
    public Builder setActionType(GameRequestContent.ActionType paramActionType)
    {
      actionType = paramActionType;
      return this;
    }
    
    public Builder setData(String paramString)
    {
      data = paramString;
      return this;
    }
    
    public Builder setFilters(GameRequestContent.Filters paramFilters)
    {
      filters = paramFilters;
      return this;
    }
    
    public Builder setMessage(String paramString)
    {
      message = paramString;
      return this;
    }
    
    public Builder setObjectId(String paramString)
    {
      objectId = paramString;
      return this;
    }
    
    public Builder setRecipients(List<String> paramList)
    {
      recipients = paramList;
      return this;
    }
    
    public Builder setSuggestions(List<String> paramList)
    {
      suggestions = paramList;
      return this;
    }
    
    public Builder setTitle(String paramString)
    {
      title = paramString;
      return this;
    }
    
    public Builder setTo(String paramString)
    {
      if (paramString != null) {
        recipients = Arrays.asList(paramString.split(","));
      }
      return this;
    }
  }
  
  public static enum Filters
  {
    static
    {
      Filters localFilters1 = new Filters("APP_USERS", 0);
      APP_USERS = localFilters1;
      Filters localFilters2 = new Filters("APP_NON_USERS", 1);
      APP_NON_USERS = localFilters2;
      $VALUES = new Filters[] { localFilters1, localFilters2 };
    }
    
    private Filters() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.GameRequestContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */