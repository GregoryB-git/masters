package io.flutter.view;

import android.view.View;

public class AccessibilityViewEmbedder$c
{
  public final View a;
  public final int b;
  
  public AccessibilityViewEmbedder$c(View paramView, int paramInt)
  {
    a = paramView;
    b = paramInt;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if ((b != b) || (!a.equals(a))) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return (a.hashCode() + 31) * 31 + b;
  }
}

/* Location:
 * Qualified Name:     io.flutter.view.AccessibilityViewEmbedder.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */