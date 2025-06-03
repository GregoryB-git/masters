package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;

public final class Projection$SubMesh
{
  public static final int VIDEO_TEXTURE_ID = 0;
  public final int mode;
  public final float[] textureCoords;
  public final int textureId;
  public final float[] vertices;
  
  public Projection$SubMesh(int paramInt1, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt2)
  {
    textureId = paramInt1;
    boolean bool;
    if (paramArrayOfFloat1.length * 2L == paramArrayOfFloat2.length * 3L) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    vertices = paramArrayOfFloat1;
    textureCoords = paramArrayOfFloat2;
    mode = paramInt2;
  }
  
  public int getVertexCount()
  {
    return vertices.length / 3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.Projection.SubMesh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */