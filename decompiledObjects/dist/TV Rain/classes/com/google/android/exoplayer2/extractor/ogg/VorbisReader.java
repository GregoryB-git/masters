package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.ArrayList;

final class VorbisReader
  extends StreamReader
{
  private VorbisUtil.CommentHeader commentHeader;
  private int previousPacketBlockSize;
  private boolean seenFirstAudioPacket;
  private VorbisUtil.VorbisIdHeader vorbisIdHeader;
  private VorbisSetup vorbisSetup;
  
  public static void appendNumberOfSamples(ParsableByteArray paramParsableByteArray, long paramLong)
  {
    paramParsableByteArray.setLimit(paramParsableByteArray.limit() + 4);
    data[(paramParsableByteArray.limit() - 4)] = ((byte)(byte)(int)(paramLong & 0xFF));
    data[(paramParsableByteArray.limit() - 3)] = ((byte)(byte)(int)(paramLong >>> 8 & 0xFF));
    data[(paramParsableByteArray.limit() - 2)] = ((byte)(byte)(int)(paramLong >>> 16 & 0xFF));
    data[(paramParsableByteArray.limit() - 1)] = ((byte)(byte)(int)(paramLong >>> 24 & 0xFF));
  }
  
  private static int decodeBlockSize(byte paramByte, VorbisSetup paramVorbisSetup)
  {
    int i = readBits(paramByte, iLogModes, 1);
    if (!modes[i].blockFlag) {
      i = idHeader.blockSize0;
    } else {
      i = idHeader.blockSize1;
    }
    return i;
  }
  
  public static int readBits(byte paramByte, int paramInt1, int paramInt2)
  {
    return paramByte >> paramInt2 & 255 >>> 8 - paramInt1;
  }
  
  public static boolean verifyBitstreamType(ParsableByteArray paramParsableByteArray)
  {
    try
    {
      boolean bool = VorbisUtil.verifyVorbisHeaderCapturePattern(1, paramParsableByteArray, true);
      return bool;
    }
    catch (ParserException paramParsableByteArray) {}
    return false;
  }
  
  public void onSeekEnd(long paramLong)
  {
    super.onSeekEnd(paramLong);
    int i = 0;
    boolean bool;
    if (paramLong != 0L) {
      bool = true;
    } else {
      bool = false;
    }
    seenFirstAudioPacket = bool;
    VorbisUtil.VorbisIdHeader localVorbisIdHeader = vorbisIdHeader;
    if (localVorbisIdHeader != null) {
      i = blockSize0;
    }
    previousPacketBlockSize = i;
  }
  
  public long preparePayload(ParsableByteArray paramParsableByteArray)
  {
    byte[] arrayOfByte = data;
    int i = 0;
    byte b = arrayOfByte[0];
    if ((b & 0x1) == 1) {
      return -1L;
    }
    int j = decodeBlockSize(b, vorbisSetup);
    if (seenFirstAudioPacket) {
      i = (previousPacketBlockSize + j) / 4;
    }
    long l = i;
    appendNumberOfSamples(paramParsableByteArray, l);
    seenFirstAudioPacket = true;
    previousPacketBlockSize = j;
    return l;
  }
  
  public boolean readHeaders(ParsableByteArray paramParsableByteArray, long paramLong, StreamReader.SetupData paramSetupData)
    throws IOException, InterruptedException
  {
    if (vorbisSetup != null) {
      return false;
    }
    paramParsableByteArray = readSetupHeaders(paramParsableByteArray);
    vorbisSetup = paramParsableByteArray;
    if (paramParsableByteArray == null) {
      return true;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(vorbisSetup.idHeader.data);
    localArrayList.add(vorbisSetup.setupHeaderData);
    paramParsableByteArray = vorbisSetup.idHeader;
    format = Format.createAudioSampleFormat(null, "audio/vorbis", null, bitrateNominal, -1, channels, (int)sampleRate, localArrayList, null, 0, null);
    return true;
  }
  
  public VorbisSetup readSetupHeaders(ParsableByteArray paramParsableByteArray)
    throws IOException
  {
    if (vorbisIdHeader == null)
    {
      vorbisIdHeader = VorbisUtil.readVorbisIdentificationHeader(paramParsableByteArray);
      return null;
    }
    if (commentHeader == null)
    {
      commentHeader = VorbisUtil.readVorbisCommentHeader(paramParsableByteArray);
      return null;
    }
    byte[] arrayOfByte = new byte[paramParsableByteArray.limit()];
    System.arraycopy(data, 0, arrayOfByte, 0, paramParsableByteArray.limit());
    paramParsableByteArray = VorbisUtil.readVorbisModes(paramParsableByteArray, vorbisIdHeader.channels);
    int i = VorbisUtil.iLog(paramParsableByteArray.length - 1);
    return new VorbisSetup(vorbisIdHeader, commentHeader, arrayOfByte, paramParsableByteArray, i);
  }
  
  public void reset(boolean paramBoolean)
  {
    super.reset(paramBoolean);
    if (paramBoolean)
    {
      vorbisSetup = null;
      vorbisIdHeader = null;
      commentHeader = null;
    }
    previousPacketBlockSize = 0;
    seenFirstAudioPacket = false;
  }
  
  public static final class VorbisSetup
  {
    public final VorbisUtil.CommentHeader commentHeader;
    public final int iLogModes;
    public final VorbisUtil.VorbisIdHeader idHeader;
    public final VorbisUtil.Mode[] modes;
    public final byte[] setupHeaderData;
    
    public VorbisSetup(VorbisUtil.VorbisIdHeader paramVorbisIdHeader, VorbisUtil.CommentHeader paramCommentHeader, byte[] paramArrayOfByte, VorbisUtil.Mode[] paramArrayOfMode, int paramInt)
    {
      idHeader = paramVorbisIdHeader;
      commentHeader = paramCommentHeader;
      setupHeaderData = paramArrayOfByte;
      modes = paramArrayOfMode;
      iLogModes = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.VorbisReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */