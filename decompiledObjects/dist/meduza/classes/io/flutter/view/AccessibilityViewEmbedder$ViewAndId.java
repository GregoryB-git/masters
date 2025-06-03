package io.flutter.view;

import android.view.View;

class AccessibilityViewEmbedder$ViewAndId
{
  public final int id;
  public final View view;
  
  private AccessibilityViewEmbedder$ViewAndId(View paramView, int paramInt)
  {
    view = paramView;
    id = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof ViewAndId)) {
      return false;
    }
    paramObject = (ViewAndId)paramObject;
    if ((id != id) || (!view.equals(view))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return (view.hashCode() + 31) * 31 + id;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder.ViewAndId
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */