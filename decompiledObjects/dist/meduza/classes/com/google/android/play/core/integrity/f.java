package com.google.android.play.core.integrity;

final class f
  extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder
{
  private String a;
  
  public final StandardIntegrityManager.StandardIntegrityTokenRequest build()
  {
    return new h(a, null);
  }
  
  public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String paramString)
  {
    a = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */