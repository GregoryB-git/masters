package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.UiElement;
import java.util.List;
import java.util.Set;

public final class adu
  implements AdsRenderingSettings
{
  @yr(a="bitrate")
  private int a = -1;
  @yr(a="mimeTypes")
  private List<String> b = null;
  @yr(a="uiElements")
  private Set<UiElement> c;
  @yr(a="enablePreloading")
  private boolean d;
  @yr(a="enableFocusSkipButton")
  private boolean e = true;
  @yr(a="playAdsAfterTime")
  private double f = -1.0D;
  @yr(a="disableUi")
  private boolean g = false;
  private boolean h = true;
  
  public final int getBitrateKbps()
  {
    return a;
  }
  
  public final boolean getDisableUi()
  {
    return g;
  }
  
  public final boolean getEnablePreloading()
  {
    return d;
  }
  
  public final boolean getFocusSkipButtonWhenAvailable()
  {
    return e;
  }
  
  public final List<String> getMimeTypes()
  {
    return b;
  }
  
  public final boolean isRenderCompanions()
  {
    return h;
  }
  
  public final void setBitrateKbps(int paramInt)
  {
    a = paramInt;
  }
  
  public final void setDisableUi(boolean paramBoolean)
  {
    g = paramBoolean;
  }
  
  public final void setEnablePreloading(boolean paramBoolean)
  {
    d = paramBoolean;
  }
  
  public final void setFocusSkipButtonWhenAvailable(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public final void setLoadVideoTimeout(int paramInt) {}
  
  public final void setMimeTypes(List<String> paramList)
  {
    b = paramList;
  }
  
  public final void setPlayAdsAfterTime(double paramDouble)
  {
    f = paramDouble;
  }
  
  public final void setRenderCompanions(boolean paramBoolean)
  {
    h = paramBoolean;
  }
  
  public final void setUiElements(Set<UiElement> paramSet)
  {
    c = paramSet;
  }
  
  public final String toString()
  {
    int i = a;
    String str1 = String.valueOf(b);
    String str2 = String.valueOf(c);
    boolean bool = d;
    double d1 = f;
    int j = str1.length();
    StringBuilder localStringBuilder = new StringBuilder(str2.length() + (j + 134));
    localStringBuilder.append("AdsRenderingSettings [bitrate=");
    localStringBuilder.append(i);
    localStringBuilder.append(", mimeTypes=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", uiElements=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", enablePreloading=");
    localStringBuilder.append(bool);
    localStringBuilder.append(", playAdsAfterTime=");
    localStringBuilder.append(d1);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.adu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */