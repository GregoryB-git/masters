package com.google.android.exoplayer2.text.cea;

final class Cea708Decoder$DtvCcPacket
{
  public int currentIndex;
  public final byte[] packetData;
  public final int packetSize;
  public final int sequenceNumber;
  
  public Cea708Decoder$DtvCcPacket(int paramInt1, int paramInt2)
  {
    sequenceNumber = paramInt1;
    packetSize = paramInt2;
    packetData = new byte[paramInt2 * 2 - 1];
    currentIndex = 0;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.Cea708Decoder.DtvCcPacket
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */