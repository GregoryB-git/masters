package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorCode;
import com.google.ads.interactivemedia.v3.api.AdError.AdErrorType;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

public class aew
{
  public aew(ado paramado) {}
  
  public void a(String paramString1, AdError.AdErrorType paramAdErrorType, int paramInt, String paramString2)
  {
    if (ado.a(a).get(paramString1) != null) {
      paramString1 = ((AdsRequest)ado.a(a).get(paramString1)).getUserRequestContext();
    } else {
      paramString1 = ((StreamRequest)ado.f(a).get(paramString1)).getUserRequestContext();
    }
    paramString1 = new adi(new AdError(paramAdErrorType, paramInt, paramString2), paramString1);
    ado.e(a).a(paramString1);
  }
  
  public void a(String paramString1, AdError.AdErrorType paramAdErrorType, AdError.AdErrorCode paramAdErrorCode, String paramString2)
  {
    if (ado.a(a).get(paramString1) != null) {
      paramString1 = ((AdsRequest)ado.a(a).get(paramString1)).getUserRequestContext();
    } else {
      paramString1 = ((StreamRequest)ado.f(a).get(paramString1)).getUserRequestContext();
    }
    paramString1 = new adi(new AdError(paramAdErrorType, paramAdErrorCode, paramString2), paramString1);
    ado.e(a).a(paramString1);
  }
  
  public void a(String paramString1, afb paramafb, String paramString2, boolean paramBoolean)
  {
    StreamRequest localStreamRequest = (StreamRequest)ado.f(a).get(paramString1);
    ado.c(a).a(true);
    try
    {
      ado localado = a;
      adr localadr = new com/google/ads/interactivemedia/v3/internal/adr;
      afj localafj = new com/google/ads/interactivemedia/v3/internal/afj;
      localafj.<init>(paramString1, ado.b(localado), paramafb, localStreamRequest.getManifestSuffix(), ado.c(a), ado.d(a), paramString2, paramBoolean, ado.a(a, localStreamRequest));
      localadr.<init>(localafj, localStreamRequest.getUserRequestContext());
      localado.a(localadr);
      return;
    }
    catch (AdError paramString1)
    {
      ado.e(a).a(new adi(paramString1, localStreamRequest.getUserRequestContext()));
    }
  }
  
  public void a(String paramString, afb paramafb, List<Float> paramList, SortedSet<Float> paramSortedSet, boolean paramBoolean)
  {
    AdsRequest localAdsRequest = (AdsRequest)ado.a(a).get(paramString);
    try
    {
      ado localado = a;
      adr localadr = new com/google/ads/interactivemedia/v3/internal/adr;
      ads localads = new com/google/ads/interactivemedia/v3/internal/ads;
      localads.<init>(paramString, ado.b(localado), paramafb, ado.a(a, localAdsRequest), localAdsRequest.getContentProgressProvider(), paramList, paramSortedSet, ado.c(a), ado.d(a), paramBoolean);
      localadr.<init>(localads, localAdsRequest.getUserRequestContext());
      localado.a(localadr);
      return;
    }
    catch (AdError paramString)
    {
      ado.e(a).a(new adi(paramString, localAdsRequest.getUserRequestContext()));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */