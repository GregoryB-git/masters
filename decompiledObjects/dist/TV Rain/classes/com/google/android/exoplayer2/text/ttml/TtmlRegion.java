package com.google.android.exoplayer2.text.ttml;

final class TtmlRegion
{
  public final String id;
  public final float line;
  public final int lineAnchor;
  public final int lineType;
  public final float position;
  public final float textSize;
  public final int textSizeType;
  public final float width;
  
  public TtmlRegion(String paramString)
  {
    this(paramString, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
  }
  
  public TtmlRegion(String paramString, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, float paramFloat3, int paramInt3, float paramFloat4)
  {
    id = paramString;
    position = paramFloat1;
    line = paramFloat2;
    lineType = paramInt1;
    lineAnchor = paramInt2;
    width = paramFloat3;
    textSizeType = paramInt3;
    textSize = paramFloat4;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.ttml.TtmlRegion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */