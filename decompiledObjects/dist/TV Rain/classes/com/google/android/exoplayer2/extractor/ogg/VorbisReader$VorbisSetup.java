package com.google.android.exoplayer2.extractor.ogg;

final class VorbisReader$VorbisSetup
{
  public final VorbisUtil.CommentHeader commentHeader;
  public final int iLogModes;
  public final VorbisUtil.VorbisIdHeader idHeader;
  public final VorbisUtil.Mode[] modes;
  public final byte[] setupHeaderData;
  
  public VorbisReader$VorbisSetup(VorbisUtil.VorbisIdHeader paramVorbisIdHeader, VorbisUtil.CommentHeader paramCommentHeader, byte[] paramArrayOfByte, VorbisUtil.Mode[] paramArrayOfMode, int paramInt)
  {
    idHeader = paramVorbisIdHeader;
    commentHeader = paramCommentHeader;
    setupHeaderData = paramArrayOfByte;
    modes = paramArrayOfMode;
    iLogModes = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.VorbisReader.VorbisSetup
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */