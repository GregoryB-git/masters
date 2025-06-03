package com.google.ads.interactivemedia.v3.api;

import android.content.Context;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.internal.adf;
import com.google.ads.interactivemedia.v3.internal.ado;
import com.google.ads.interactivemedia.v3.internal.adt;
import com.google.ads.interactivemedia.v3.internal.adu;
import com.google.ads.interactivemedia.v3.internal.aee;
import com.google.ads.interactivemedia.v3.internal.aej;
import com.google.ads.interactivemedia.v3.internal.ael;
import com.google.ads.interactivemedia.v3.internal.afk;
import com.google.ads.interactivemedia.v3.internal.afm;

public class ImaSdkFactory
{
  private static ImaSdkFactory instance;
  
  private AdsLoader createAdsLoader(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration, AdDisplayContainer paramAdDisplayContainer)
  {
    paramContext = new ado(paramContext, paramUri, paramImaSdkSettings, paramAdDisplayContainer, paramTestingConfiguration);
    paramContext.a();
    return paramContext;
  }
  
  private AdsLoader createAdsLoader(Context paramContext, Uri paramUri, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration, StreamDisplayContainer paramStreamDisplayContainer)
  {
    paramContext = new ado(paramContext, paramUri, paramImaSdkSettings, paramStreamDisplayContainer, paramTestingConfiguration);
    paramContext.a();
    return paramContext;
  }
  
  private AdsLoader createAdsLoader(Context paramContext, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration, AdDisplayContainer paramAdDisplayContainer)
  {
    return createAdsLoader(paramContext, readJsCoreUri(paramImaSdkSettings), paramImaSdkSettings, paramTestingConfiguration, paramAdDisplayContainer);
  }
  
  private AdsLoader createAdsLoader(Context paramContext, ImaSdkSettings paramImaSdkSettings, TestingConfiguration paramTestingConfiguration, StreamDisplayContainer paramStreamDisplayContainer)
  {
    return createAdsLoader(paramContext, readJsCoreUri(paramImaSdkSettings), paramImaSdkSettings, paramTestingConfiguration, paramStreamDisplayContainer);
  }
  
  public static ImaSdkFactory getInstance()
  {
    if (instance == null) {
      instance = new ImaSdkFactory();
    }
    return instance;
  }
  
  private Uri readJsCoreUri(ImaSdkSettings paramImaSdkSettings)
  {
    Uri localUri1 = aej.b;
    Uri localUri2 = localUri1;
    if (paramImaSdkSettings != null)
    {
      localUri2 = localUri1;
      if (paramImaSdkSettings.isDebugMode()) {
        localUri2 = aej.c;
      }
    }
    return localUri2;
  }
  
  public AdDisplayContainer createAdDisplayContainer()
  {
    return new adf();
  }
  
  public AdsLoader createAdsLoader(Context paramContext)
  {
    return createAdsLoader(paramContext, createImaSdkSettings());
  }
  
  @Deprecated
  public AdsLoader createAdsLoader(Context paramContext, ImaSdkSettings paramImaSdkSettings)
  {
    return new ado(paramContext, readJsCoreUri(paramImaSdkSettings), paramImaSdkSettings);
  }
  
  public AdsLoader createAdsLoader(Context paramContext, ImaSdkSettings paramImaSdkSettings, AdDisplayContainer paramAdDisplayContainer)
  {
    return new ado(paramContext, readJsCoreUri(paramImaSdkSettings), paramImaSdkSettings, paramAdDisplayContainer, null);
  }
  
  public AdsLoader createAdsLoader(Context paramContext, ImaSdkSettings paramImaSdkSettings, StreamDisplayContainer paramStreamDisplayContainer)
  {
    return new ado(paramContext, readJsCoreUri(paramImaSdkSettings), paramImaSdkSettings, paramStreamDisplayContainer, null);
  }
  
  public AdsRenderingSettings createAdsRenderingSettings()
  {
    return new adu();
  }
  
  public AdsRequest createAdsRequest()
  {
    return new adt();
  }
  
  public CompanionAdSlot createCompanionAdSlot()
  {
    return new aee();
  }
  
  public ImaSdkSettings createImaSdkSettings()
  {
    return new ael();
  }
  
  public StreamRequest createLiveStreamRequest(String paramString1, String paramString2)
  {
    afm localafm = new afm();
    localafm.a(paramString1);
    localafm.d(paramString2);
    return localafm;
  }
  
  @Deprecated
  public StreamRequest createLiveStreamRequest(String paramString1, String paramString2, StreamDisplayContainer paramStreamDisplayContainer)
  {
    afm localafm = new afm();
    localafm.a(paramString1);
    localafm.d(paramString2);
    localafm.a(paramStreamDisplayContainer);
    return localafm;
  }
  
  public StreamDisplayContainer createStreamDisplayContainer()
  {
    return new afk();
  }
  
  public StreamRequest createVodStreamRequest(String paramString1, String paramString2, String paramString3)
  {
    afm localafm = new afm();
    localafm.b(paramString1);
    localafm.c(paramString2);
    localafm.d(paramString3);
    return localafm;
  }
  
  @Deprecated
  public StreamRequest createVodStreamRequest(String paramString1, String paramString2, String paramString3, StreamDisplayContainer paramStreamDisplayContainer)
  {
    afm localafm = new afm();
    localafm.b(paramString1);
    localafm.c(paramString2);
    localafm.d(paramString3);
    localafm.a(paramStreamDisplayContainer);
    return localafm;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.api.ImaSdkFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */