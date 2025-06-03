package com.google.android.exoplayer2.upstream.crypto;

final class CryptoUtil
{
  public static long getFNV64Hash(String paramString)
  {
    long l = 0L;
    if (paramString == null) {
      return 0L;
    }
    for (int i = 0; i < paramString.length(); i++)
    {
      l ^= paramString.charAt(i);
      l += (l << 1) + (l << 4) + (l << 5) + (l << 7) + (l << 8) + (l << 40);
    }
    return l;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.crypto.CryptoUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */