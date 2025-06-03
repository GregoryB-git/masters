package com.google.android.exoplayer2.extractor.ts;

public final class TsPayloadReader$TrackIdGenerator
{
  private static final int ID_UNSET = Integer.MIN_VALUE;
  private final int firstTrackId;
  private String formatId;
  private final String formatIdPrefix;
  private int trackId;
  private final int trackIdIncrement;
  
  public TsPayloadReader$TrackIdGenerator(int paramInt1, int paramInt2)
  {
    this(Integer.MIN_VALUE, paramInt1, paramInt2);
  }
  
  public TsPayloadReader$TrackIdGenerator(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject;
    if (paramInt1 != Integer.MIN_VALUE)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramInt1);
      ((StringBuilder)localObject).append("/");
      localObject = ((StringBuilder)localObject).toString();
    }
    else
    {
      localObject = "";
    }
    formatIdPrefix = ((String)localObject);
    firstTrackId = paramInt2;
    trackIdIncrement = paramInt3;
    trackId = Integer.MIN_VALUE;
  }
  
  private void maybeThrowUninitializedError()
  {
    if (trackId != Integer.MIN_VALUE) {
      return;
    }
    throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
  }
  
  public void generateNewId()
  {
    int i = trackId;
    if (i == Integer.MIN_VALUE) {
      i = firstTrackId;
    } else {
      i += trackIdIncrement;
    }
    trackId = i;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(formatIdPrefix);
    localStringBuilder.append(trackId);
    formatId = localStringBuilder.toString();
  }
  
  public String getFormatId()
  {
    maybeThrowUninitializedError();
    return formatId;
  }
  
  public int getTrackId()
  {
    maybeThrowUninitializedError();
    return trackId;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsPayloadReader.TrackIdGenerator
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */