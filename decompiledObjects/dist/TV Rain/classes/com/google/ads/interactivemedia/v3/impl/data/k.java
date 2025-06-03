package com.google.ads.interactivemedia.v3.impl.data;

final class k
  extends CompanionData
{
  private final String clickThroughUrl;
  private final String size;
  private final String src;
  private final CompanionData.a type;
  
  public k(String paramString1, String paramString2, String paramString3, CompanionData.a parama)
  {
    if (paramString1 != null)
    {
      size = paramString1;
      if (paramString2 != null)
      {
        src = paramString2;
        if (paramString3 != null)
        {
          clickThroughUrl = paramString3;
          if (parama != null)
          {
            type = parama;
            return;
          }
          throw new NullPointerException("Null type");
        }
        throw new NullPointerException("Null clickThroughUrl");
      }
      throw new NullPointerException("Null src");
    }
    throw new NullPointerException("Null size");
  }
  
  public final String clickThroughUrl()
  {
    return clickThroughUrl;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof CompanionData))
    {
      paramObject = (CompanionData)paramObject;
      if ((size.equals(((CompanionData)paramObject).size())) && (src.equals(((CompanionData)paramObject).src())) && (clickThroughUrl.equals(((CompanionData)paramObject).clickThroughUrl())) && (type.equals(((CompanionData)paramObject).type()))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return (((size.hashCode() ^ 0xF4243) * 1000003 ^ src.hashCode()) * 1000003 ^ clickThroughUrl.hashCode()) * 1000003 ^ type.hashCode();
  }
  
  public final String size()
  {
    return size;
  }
  
  public final String src()
  {
    return src;
  }
  
  public final CompanionData.a type()
  {
    return type;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.impl.data.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */