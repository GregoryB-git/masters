package com.google.android.exoplayer2.video.spherical;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.zip.Inflater;

public final class ProjectionDecoder
{
  private static final int MAX_COORDINATE_COUNT = 10000;
  private static final int MAX_TRIANGLE_INDICES = 128000;
  private static final int MAX_VERTEX_COUNT = 32000;
  private static final int TYPE_DFL8 = Util.getIntegerCodeForString("dfl8");
  private static final int TYPE_MESH = Util.getIntegerCodeForString("mesh");
  private static final int TYPE_MSHP;
  private static final int TYPE_PROJ = Util.getIntegerCodeForString("proj");
  private static final int TYPE_RAW;
  private static final int TYPE_YTMP = Util.getIntegerCodeForString("ytmp");
  
  static
  {
    TYPE_MSHP = Util.getIntegerCodeForString("mshp");
    TYPE_RAW = Util.getIntegerCodeForString("raw ");
  }
  
  @Nullable
  public static Projection decode(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new ParsableByteArray(paramArrayOfByte);
    try
    {
      if (isProj(paramArrayOfByte)) {
        paramArrayOfByte = parseProj(paramArrayOfByte);
      } else {
        paramArrayOfByte = parseMshp(paramArrayOfByte);
      }
    }
    catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
    {
      paramArrayOfByte = null;
    }
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.size();
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      return new Projection((Projection.Mesh)paramArrayOfByte.get(0), (Projection.Mesh)paramArrayOfByte.get(1), paramInt);
    }
    return new Projection((Projection.Mesh)paramArrayOfByte.get(0), paramInt);
  }
  
  private static int decodeZigZag(int paramInt)
  {
    return -(paramInt & 0x1) ^ paramInt >> 1;
  }
  
  private static boolean isProj(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.skipBytes(4);
    int i = paramParsableByteArray.readInt();
    boolean bool = false;
    paramParsableByteArray.setPosition(0);
    if (i == TYPE_PROJ) {
      bool = true;
    }
    return bool;
  }
  
  @Nullable
  private static Projection.Mesh parseMesh(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.readInt();
    if (i > 10000) {
      return null;
    }
    float[] arrayOfFloat1 = new float[i];
    for (int j = 0; j < i; j++) {
      arrayOfFloat1[j] = paramParsableByteArray.readFloat();
    }
    int k = paramParsableByteArray.readInt();
    if (k > 32000) {
      return null;
    }
    double d = Math.log(2.0D);
    int m = (int)Math.ceil(Math.log(i * 2.0D) / d);
    ParsableBitArray localParsableBitArray = new ParsableBitArray(data);
    localParsableBitArray.setPosition(paramParsableByteArray.getPosition() * 8);
    paramParsableByteArray = new float[k * 5];
    Object localObject = new int[5];
    j = 0;
    int n = 0;
    int i1;
    int i2;
    while (j < k)
    {
      i1 = 0;
      while (i1 < 5)
      {
        i2 = localObject[i1] + decodeZigZag(localParsableBitArray.readBits(m));
        if ((i2 < i) && (i2 >= 0))
        {
          paramParsableByteArray[n] = arrayOfFloat1[i2];
          localObject[i1] = i2;
          i1++;
          n++;
        }
        else
        {
          return null;
        }
      }
      j++;
    }
    localParsableBitArray.setPosition(localParsableBitArray.getPosition() + 7 & 0xFFFFFFF8);
    i = localParsableBitArray.readBits(32);
    localObject = new Projection.SubMesh[i];
    for (j = 0; j < i; j++)
    {
      int i3 = localParsableBitArray.readBits(8);
      i2 = localParsableBitArray.readBits(8);
      int i4 = localParsableBitArray.readBits(32);
      if (i4 > 128000) {
        return null;
      }
      m = (int)Math.ceil(Math.log(k * 2.0D) / d);
      float[] arrayOfFloat2 = new float[i4 * 3];
      arrayOfFloat1 = new float[i4 * 2];
      n = 0;
      i1 = 0;
      while (n < i4)
      {
        i1 += decodeZigZag(localParsableBitArray.readBits(m));
        if ((i1 >= 0) && (i1 < k))
        {
          int i5 = n * 3;
          int i6 = i1 * 5;
          arrayOfFloat2[i5] = paramParsableByteArray[i6];
          arrayOfFloat2[(i5 + 1)] = paramParsableByteArray[(i6 + 1)];
          arrayOfFloat2[(i5 + 2)] = paramParsableByteArray[(i6 + 2)];
          i5 = n * 2;
          arrayOfFloat1[i5] = paramParsableByteArray[(i6 + 3)];
          arrayOfFloat1[(i5 + 1)] = paramParsableByteArray[(i6 + 4)];
          n++;
        }
        else
        {
          return null;
        }
      }
      localObject[j] = new Projection.SubMesh(i3, arrayOfFloat2, arrayOfFloat1, i2);
    }
    return new Projection.Mesh((Projection.SubMesh[])localObject);
  }
  
  @Nullable
  private static ArrayList<Projection.Mesh> parseMshp(ParsableByteArray paramParsableByteArray)
  {
    if (paramParsableByteArray.readUnsignedByte() != 0) {
      return null;
    }
    paramParsableByteArray.skipBytes(7);
    int i = paramParsableByteArray.readInt();
    ParsableByteArray localParsableByteArray;
    Inflater localInflater;
    if (i == TYPE_DFL8)
    {
      localParsableByteArray = new ParsableByteArray();
      localInflater = new Inflater(true);
    }
    try
    {
      boolean bool = Util.inflate(paramParsableByteArray, localParsableByteArray, localInflater);
      if (!bool) {
        return null;
      }
      localInflater.end();
      paramParsableByteArray = localParsableByteArray;
    }
    finally
    {
      localInflater.end();
    }
    return null;
    return parseRawMshpData(paramParsableByteArray);
  }
  
  @Nullable
  private static ArrayList<Projection.Mesh> parseProj(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.skipBytes(8);
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j)
    {
      int k = paramParsableByteArray.readInt() + i;
      if ((k > i) && (k <= j))
      {
        i = paramParsableByteArray.readInt();
        if ((i != TYPE_YTMP) && (i != TYPE_MSHP))
        {
          paramParsableByteArray.setPosition(k);
          i = k;
        }
        else
        {
          paramParsableByteArray.setLimit(k);
          return parseMshp(paramParsableByteArray);
        }
      }
    }
    return null;
  }
  
  @Nullable
  private static ArrayList<Projection.Mesh> parseRawMshpData(ParsableByteArray paramParsableByteArray)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramParsableByteArray.getPosition();
    int j = paramParsableByteArray.limit();
    while (i < j)
    {
      int k = paramParsableByteArray.readInt() + i;
      if ((k > i) && (k <= j))
      {
        if (paramParsableByteArray.readInt() == TYPE_MESH)
        {
          Projection.Mesh localMesh = parseMesh(paramParsableByteArray);
          if (localMesh == null) {
            return null;
          }
          localArrayList.add(localMesh);
        }
        paramParsableByteArray.setPosition(k);
        i = k;
      }
      else
      {
        return null;
      }
    }
    return localArrayList;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.ProjectionDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */