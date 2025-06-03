package q;

import android.os.BaseBundle;
import android.os.Bundle;

public final class a
{
  public final Integer a;
  public final Integer b;
  public final Integer c;
  public final Integer d;
  
  public a(Integer paramInteger1, Integer paramInteger2, Integer paramInteger3, Integer paramInteger4)
  {
    a = paramInteger1;
    b = paramInteger2;
    c = paramInteger3;
    d = paramInteger4;
  }
  
  public Bundle a()
  {
    Bundle localBundle = new Bundle();
    Integer localInteger = a;
    if (localInteger != null) {
      localBundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", localInteger.intValue());
    }
    localInteger = b;
    if (localInteger != null) {
      localBundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", localInteger.intValue());
    }
    localInteger = c;
    if (localInteger != null) {
      localBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", localInteger.intValue());
    }
    localInteger = d;
    if (localInteger != null) {
      localBundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", localInteger.intValue());
    }
    return localBundle;
  }
  
  public static final class a
  {
    public Integer a;
    public Integer b;
    public Integer c;
    public Integer d;
    
    public a a()
    {
      return new a(a, b, c, d);
    }
  }
}

/* Location:
 * Qualified Name:     q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */