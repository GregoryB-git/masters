package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot.ClickListener;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData.a;
import java.util.List;
import z2;

public final class aed
  extends WebView
{
  public aed(Context paramContext, afc paramafc, CompanionData paramCompanionData, List<CompanionAdSlot.ClickListener> paramList)
  {
    super(paramContext);
    getSettings().setJavaScriptEnabled(true);
    getSettings().setSupportMultipleWindows(true);
    setWebChromeClient(new aeg(paramContext, paramafc, paramList));
    if (paramCompanionData.type() == CompanionData.a.Html)
    {
      loadData(paramCompanionData.src(), "text/html", null);
      return;
    }
    if (paramCompanionData.type() == CompanionData.a.IFrame)
    {
      loadUrl(paramCompanionData.src());
      return;
    }
    paramContext = String.valueOf(paramCompanionData.type());
    throw new IllegalArgumentException(z2.l(paramContext.length() + 51, "Companion type ", paramContext, " is not valid for a CompanionWebView"));
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aed
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */