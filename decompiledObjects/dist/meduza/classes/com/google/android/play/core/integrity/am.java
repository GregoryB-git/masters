package com.google.android.play.core.integrity;

final class am
  extends IntegrityTokenRequest.Builder
{
  private String a;
  private Long b;
  
  public final IntegrityTokenRequest build()
  {
    String str = a;
    if (str != null) {
      return new ao(str, b, null, null);
    }
    throw new IllegalStateException("Missing required properties: nonce");
  }
  
  public final IntegrityTokenRequest.Builder setCloudProjectNumber(long paramLong)
  {
    b = Long.valueOf(paramLong);
    return this;
  }
  
  public final IntegrityTokenRequest.Builder setNonce(String paramString)
  {
    if (paramString != null)
    {
      a = paramString;
      return this;
    }
    throw new NullPointerException("Null nonce");
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.am
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */