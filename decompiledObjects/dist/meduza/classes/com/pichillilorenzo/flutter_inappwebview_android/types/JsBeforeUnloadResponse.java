package com.pichillilorenzo.flutter_inappwebview_android.types;

import a0.j;
import f;
import java.util.Map;

public class JsBeforeUnloadResponse
{
  private Integer action;
  private String cancelButtonTitle;
  private String confirmButtonTitle;
  private boolean handledByClient;
  private String message;
  
  public JsBeforeUnloadResponse(String paramString1, String paramString2, String paramString3, boolean paramBoolean, Integer paramInteger)
  {
    message = paramString1;
    confirmButtonTitle = paramString2;
    cancelButtonTitle = paramString3;
    handledByClient = paramBoolean;
    action = paramInteger;
  }
  
  public static JsBeforeUnloadResponse fromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    return new JsBeforeUnloadResponse((String)paramMap.get("message"), (String)paramMap.get("confirmButtonTitle"), (String)paramMap.get("cancelButtonTitle"), ((Boolean)paramMap.get("handledByClient")).booleanValue(), (Integer)paramMap.get("action"));
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (JsBeforeUnloadResponse)paramObject;
      if (handledByClient != handledByClient) {
        return false;
      }
      Object localObject = message;
      if (localObject != null ? !((String)localObject).equals(message) : message != null) {
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
  
  public String getMessage()
  {
    return message;
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
    localObject = confirmButtonTitle;
    int k;
    if (localObject != null) {
      k = ((String)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = cancelButtonTitle;
    int m;
    if (localObject != null) {
      m = ((String)localObject).hashCode();
    } else {
      m = 0;
    }
    int n = handledByClient;
    localObject = action;
    if (localObject != null) {
      i = ((Integer)localObject).hashCode();
    }
    return (((j * 31 + k) * 31 + m) * 31 + n) * 31 + i;
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
  
  public void setHandledByClient(boolean paramBoolean)
  {
    handledByClient = paramBoolean;
  }
  
  public void setMessage(String paramString)
  {
    message = paramString;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("JsConfirmResponse{message='");
    j.s(localStringBuilder, message, '\'', ", confirmButtonTitle='");
    j.s(localStringBuilder, confirmButtonTitle, '\'', ", cancelButtonTitle='");
    j.s(localStringBuilder, cancelButtonTitle, '\'', ", handledByClient=");
    localStringBuilder.append(handledByClient);
    localStringBuilder.append(", action=");
    localStringBuilder.append(action);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */