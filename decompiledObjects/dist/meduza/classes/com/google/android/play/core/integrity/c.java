package com.google.android.play.core.integrity;

final class c
  extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
{
  private long a;
  private byte b;
  
  public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int paramInt)
  {
    b = ((byte)(byte)(b | 0x2));
    return this;
  }
  
  public final StandardIntegrityManager.PrepareIntegrityTokenRequest build()
  {
    if (b != 3)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      if ((b & 0x1) == 0) {
        localStringBuilder.append(" cloudProjectNumber");
      }
      if ((b & 0x2) == 0) {
        localStringBuilder.append(" webViewRequestMode");
      }
      throw new IllegalStateException("Missing required properties:".concat(localStringBuilder.toString()));
    }
    return new e(a, 0, null);
  }
  
  public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long paramLong)
  {
    a = paramLong;
    b = ((byte)(byte)(b | 0x1));
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */