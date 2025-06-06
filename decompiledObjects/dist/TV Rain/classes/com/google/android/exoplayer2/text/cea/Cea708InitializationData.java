package com.google.android.exoplayer2.text.cea;

import java.util.Collections;
import java.util.List;

public final class Cea708InitializationData
{
  public final boolean isWideAspectRatio;
  
  private Cea708InitializationData(List<byte[]> paramList)
  {
    boolean bool = false;
    if (((byte[])paramList.get(0))[0] != 0) {
      bool = true;
    }
    isWideAspectRatio = bool;
  }
  
  public static List<byte[]> buildData(boolean paramBoolean)
  {
    return Collections.singletonList(new byte[] { (byte)paramBoolean });
  }
  
  public static Cea708InitializationData fromData(List<byte[]> paramList)
  {
    return new Cea708InitializationData(paramList);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.Cea708InitializationData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */