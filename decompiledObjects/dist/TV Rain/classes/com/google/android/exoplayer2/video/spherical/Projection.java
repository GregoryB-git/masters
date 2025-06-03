package com.google.android.exoplayer2.video.spherical;

import com.google.android.exoplayer2.util.Assertions;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Projection
{
  public static final int DRAW_MODE_TRIANGLES = 0;
  public static final int DRAW_MODE_TRIANGLES_FAN = 2;
  public static final int DRAW_MODE_TRIANGLES_STRIP = 1;
  public static final int POSITION_COORDS_PER_VERTEX = 3;
  public static final int TEXTURE_COORDS_PER_VERTEX = 2;
  public final Mesh leftMesh;
  public final Mesh rightMesh;
  public final boolean singleMesh;
  public final int stereoMode;
  
  public Projection(Mesh paramMesh, int paramInt)
  {
    this(paramMesh, paramMesh, paramInt);
  }
  
  public Projection(Mesh paramMesh1, Mesh paramMesh2, int paramInt)
  {
    leftMesh = paramMesh1;
    rightMesh = paramMesh2;
    stereoMode = paramInt;
    boolean bool;
    if (paramMesh1 == paramMesh2) {
      bool = true;
    } else {
      bool = false;
    }
    singleMesh = bool;
  }
  
  public static Projection createEquirectangular(float paramFloat1, int paramInt1, int paramInt2, float paramFloat2, float paramFloat3, int paramInt3)
  {
    int i = paramInt1;
    int j = paramInt2;
    boolean bool;
    if (paramFloat1 > 0.0F) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if (i >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if (j >= 1) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if ((paramFloat2 > 0.0F) && (paramFloat2 <= 180.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    if ((paramFloat3 > 0.0F) && (paramFloat3 <= 360.0F)) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkArgument(bool);
    float f1 = (float)Math.toRadians(paramFloat2);
    float f2 = (float)Math.toRadians(paramFloat3);
    float f3 = f1 / i;
    float f4 = f2 / j;
    int k = j + 1;
    i = (k * 2 + 2) * i;
    float[] arrayOfFloat1 = new float[i * 3];
    float[] arrayOfFloat2 = new float[i * 2];
    i = 0;
    int m = 0;
    int n = 0;
    while (i < paramInt1)
    {
      paramFloat3 = i;
      paramFloat2 = f1 / 2.0F;
      paramFloat3 = paramFloat3 * f3 - paramFloat2;
      int i1 = i + 1;
      paramFloat2 = i1 * f3 - paramFloat2;
      int i2 = 0;
      int i3 = i;
      i = i1;
      float f5 = f4;
      f4 = f3;
      while (i2 < k)
      {
        int i4 = 0;
        int i5 = 2;
        f3 = f5;
        i1 = i2;
        while (i4 < i5)
        {
          if (i4 == 0) {
            f5 = paramFloat3;
          } else {
            f5 = paramFloat2;
          }
          float f6 = i1 * f3;
          float f7 = f2 / 2.0F;
          j = m + 1;
          double d1 = paramFloat1;
          double d2 = f6 + 3.1415927F - f7;
          double d3 = Math.sin(d2);
          double d4 = f5;
          arrayOfFloat1[m] = (-(float)(Math.cos(d4) * (d3 * d1)));
          i2 = j + 1;
          arrayOfFloat1[j] = ((float)(Math.sin(d4) * d1));
          j = i2 + 1;
          d2 = Math.cos(d2);
          arrayOfFloat1[i2] = ((float)(Math.cos(d4) * (d2 * d1)));
          m = n + 1;
          arrayOfFloat2[n] = (f6 / f2);
          i2 = m + 1;
          arrayOfFloat2[m] = ((i3 + i4) * f4 / f1);
          if ((i1 == 0) && (i4 == 0)) {
            break label481;
          }
          if ((i1 == paramInt2) && (i4 == 1))
          {
            label481:
            System.arraycopy(arrayOfFloat1, j - 3, arrayOfFloat1, j, 3);
            j += 3;
            float[] arrayOfFloat3 = arrayOfFloat2;
            System.arraycopy(arrayOfFloat3, i2 - 2, arrayOfFloat3, i2, 2);
            i2 += 2;
          }
          m = j;
          i4++;
          j = paramInt2;
          i5 = 2;
          n = i2;
        }
        i2 = i1 + 1;
        f5 = f3;
      }
      f3 = f4;
      f4 = f5;
    }
    return new Projection(new Mesh(new SubMesh[] { new SubMesh(0, arrayOfFloat1, arrayOfFloat2, 1) }), paramInt3);
  }
  
  public static Projection createEquirectangular(int paramInt)
  {
    return createEquirectangular(50.0F, 36, 72, 180.0F, 360.0F, paramInt);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface DrawMode {}
  
  public static final class Mesh
  {
    private final Projection.SubMesh[] subMeshes;
    
    public Mesh(Projection.SubMesh... paramVarArgs)
    {
      subMeshes = paramVarArgs;
    }
    
    public Projection.SubMesh getSubMesh(int paramInt)
    {
      return subMeshes[paramInt];
    }
    
    public int getSubMeshCount()
    {
      return subMeshes.length;
    }
  }
  
  public static final class SubMesh
  {
    public static final int VIDEO_TEXTURE_ID = 0;
    public final int mode;
    public final float[] textureCoords;
    public final int textureId;
    public final float[] vertices;
    
    public SubMesh(int paramInt1, float[] paramArrayOfFloat1, float[] paramArrayOfFloat2, int paramInt2)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.Projection
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */