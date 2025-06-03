package com.pichillilorenzo.flutter_inappwebview_android.types;

import f;
import java.util.Map;

public class CreateWindowAction
  extends NavigationAction
{
  public boolean isDialog;
  public int windowId;
  
  public CreateWindowAction(URLRequest paramURLRequest, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt, boolean paramBoolean4)
  {
    super(paramURLRequest, paramBoolean1, paramBoolean2, paramBoolean3);
    windowId = paramInt;
    isDialog = paramBoolean4;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      if (!super.equals(paramObject)) {
        return false;
      }
      paramObject = (CreateWindowAction)paramObject;
      if (windowId != windowId) {
        return false;
      }
      if (isDialog != isDialog) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getWindowId()
  {
    return windowId;
  }
  
  public int hashCode()
  {
    return (super.hashCode() * 31 + windowId) * 31 + isDialog;
  }
  
  public boolean isDialog()
  {
    return isDialog;
  }
  
  public void setDialog(boolean paramBoolean)
  {
    isDialog = paramBoolean;
  }
  
  public void setWindowId(int paramInt)
  {
    windowId = paramInt;
  }
  
  public Map<String, Object> toMap()
  {
    Map localMap = super.toMap();
    localMap.put("windowId", Integer.valueOf(windowId));
    localMap.put("isDialog", Boolean.valueOf(isDialog));
    localMap.put("windowFeatures", null);
    return localMap;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = f.l("CreateWindowAction{windowId=");
    localStringBuilder.append(windowId);
    localStringBuilder.append(", isDialog=");
    localStringBuilder.append(isDialog);
    localStringBuilder.append(", request=");
    localStringBuilder.append(request);
    localStringBuilder.append(", isForMainFrame=");
    localStringBuilder.append(isForMainFrame);
    localStringBuilder.append(", hasGesture=");
    localStringBuilder.append(hasGesture);
    localStringBuilder.append(", isRedirect=");
    localStringBuilder.append(isRedirect);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */