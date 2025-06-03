package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Map;

public class JsPromptResponse
{
  private Integer action;
  private String cancelButtonTitle;
  private String confirmButtonTitle;
  private String defaultValue;
  private boolean handledByClient;
  private String message;
  private String value;
  
  public JsPromptResponse(String paramString1, String paramString2, String paramString3, String paramString4, boolean paramBoolean, String paramString5, Integer paramInteger)
  {
    message = paramString1;
    defaultValue = paramString2;
    confirmButtonTitle = paramString3;
    cancelButtonTitle = paramString4;
    handledByClient = paramBoolean;
    value = paramString5;
    action = paramInteger;
  }
  
  public static JsPromptResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new JsPromptResponse((String)paramMap.get("message"), (String)paramMap.get("defaultValue"), (String)paramMap.get("confirmButtonTitle"), (String)paramMap.get("cancelButtonTitle"), ((Boolean)paramMap.get("handledByClient")).booleanValue(), (String)paramMap.get("value"), (Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (JsPromptResponse)paramObject;
      if (handledByClient != handledByClient) {
        return false;
      }
      Object localObject = message;
      if (localObject != null ? !((String)localObject).equals(message) : message != null) {
        return false;
      }
      localObject = defaultValue;
      if (localObject != null ? !((String)localObject).equals(defaultValue) : defaultValue != null) {
        return false;
      }
      localObject = confirmButtonTitle;
      if (localObject != null ? !((String)localObject).equals(confirmButtonTitle) : confirmButtonTitle != null) {
        return false;
      }
      localObject = cancelButtonTitle;
      if (localObject != null ? !((String)localObject).equals(cancelButtonTitle) : cancelButtonTitle != null) {
        return false;
      }
      localObject = value;
      if (localObject != null ? !((String)localObject).equals(value) : value != null) {
        return false;
      }
      localObject = action;
      paramObject = action;
      if (localObject != null) {
        bool = ((Integer)localObject).equals(paramObject);
      } else if (paramObject != null) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public Integer getAction()
  {
    return action;
  }
  
  public String getCancelButtonTitle()
  {
    return cancelButtonTitle;
  }
  
  public String getConfirmButtonTitle()
  {
    return confirmButtonTitle;
  }
  
  public String getDefaultValue()
  {
    return defaultValue;
  }
  
  public String getMessage()
  {
    return message;
  }
  
  public String getValue()
  {
    return value;
  }
  
  public int hashCode()
  {
    Object localObject = message;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = defaultValue;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = confirmButtonTitle;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    localObject = cancelButtonTitle;
    int n;
    if (localObject != null) {
      n = ((String)localObject).hashCode();
    } else {
      n = 0;
    }
    int i1 = handledByClient;
    localObject = value;
    int i2;
    if (localObject != null) {
      i2 = ((String)localObject).hashCode();
    } else {
      i2 = 0;
    }
    localObject = action;
    if (localObject != null) {
      i = ((Integer)localObject).hashCode();
    }
    return (((((j * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i;
  }
  
  public boolean isHandledByClient()
  {
    return handledByClient;
  }
  
  public void setAction(Integer paramInteger)
  {
    action = paramInteger;
  }
  
  public void setCancelButtonTitle(String paramString)
  {
    cancelButtonTitle = paramString;
  }
  
  public void setConfirmButtonTitle(String paramString)
  {
    confirmButtonTitle = paramString;
  }
  
  public void setDefaultValue(String paramString)
  {
    defaultValue = paramString;
  }
  
  public void setHandledByClient(boolean paramBoolean)
  {
    handledByClient = paramBoolean;
  }
  
  public void setMessage(String paramString)
  {
    message = paramString;
  }
  
  public void setValue(String paramString)
  {
    value = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("JsPromptResponse{message='");
    j.s(localStringBuilder, message, '\'', ", defaultValue='");
    j.s(localStringBuilder, defaultValue, '\'', ", confirmButtonTitle='");
    j.s(localStringBuilder, confirmButtonTitle, '\'', ", cancelButtonTitle='");
    j.s(localStringBuilder, cancelButtonTitle, '\'', ", handledByClient=");
    localStringBuilder.append(handledByClient);
    localStringBuilder.append(", value='");
    j.s(localStringBuilder, value, '\'', ", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */