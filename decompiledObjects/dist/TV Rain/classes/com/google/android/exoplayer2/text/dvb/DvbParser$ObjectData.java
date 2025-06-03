package com.google.android.exoplayer2.text.dvb;

final class DvbParser$ObjectData
{
  public final byte[] bottomFieldData;
  public final int id;
  public final boolean nonModifyingColorFlag;
  public final byte[] topFieldData;
  
  public DvbParser$ObjectData(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    id = paramInt;
    nonModifyingColorFlag = paramBoolean;
    topFieldData = paramArrayOfByte1;
    bottomFieldData = paramArrayOfByte2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser.ObjectData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */