package com.google.android.exoplayer2.extractor.mp4;

import java.util.UUID;

class PsshAtomUtil$PsshAtom
{
  private final byte[] schemeData;
  private final UUID uuid;
  private final int version;
  
  public PsshAtomUtil$PsshAtom(UUID paramUUID, int paramInt, byte[] paramArrayOfByte)
  {
    uuid = paramUUID;
    version = paramInt;
    schemeData = paramArrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.PsshAtomUtil.PsshAtom
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */