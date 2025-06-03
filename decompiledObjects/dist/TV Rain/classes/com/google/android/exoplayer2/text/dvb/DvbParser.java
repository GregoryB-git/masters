package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Region.Op;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class DvbParser
{
  private static final int DATA_TYPE_24_TABLE_DATA = 32;
  private static final int DATA_TYPE_28_TABLE_DATA = 33;
  private static final int DATA_TYPE_2BP_CODE_STRING = 16;
  private static final int DATA_TYPE_48_TABLE_DATA = 34;
  private static final int DATA_TYPE_4BP_CODE_STRING = 17;
  private static final int DATA_TYPE_8BP_CODE_STRING = 18;
  private static final int DATA_TYPE_END_LINE = 240;
  private static final int OBJECT_CODING_PIXELS = 0;
  private static final int OBJECT_CODING_STRING = 1;
  private static final int PAGE_STATE_NORMAL = 0;
  private static final int REGION_DEPTH_4_BIT = 2;
  private static final int REGION_DEPTH_8_BIT = 3;
  private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
  private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
  private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
  private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
  private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
  private static final String TAG = "DvbParser";
  private static final byte[] defaultMap2To4 = { 0, 7, 8, 15 };
  private static final byte[] defaultMap2To8 = { 0, 119, -120, -1 };
  private static final byte[] defaultMap4To8 = { 0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1 };
  private Bitmap bitmap;
  private final Canvas canvas;
  private final ClutDefinition defaultClutDefinition;
  private final DisplayDefinition defaultDisplayDefinition;
  private final Paint defaultPaint;
  private final Paint fillRegionPaint;
  private final SubtitleService subtitleService;
  
  public DvbParser(int paramInt1, int paramInt2)
  {
    Paint localPaint = new Paint();
    defaultPaint = localPaint;
    localPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    localPaint.setPathEffect(null);
    localPaint = new Paint();
    fillRegionPaint = localPaint;
    localPaint.setStyle(Paint.Style.FILL);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
    localPaint.setPathEffect(null);
    canvas = new Canvas();
    defaultDisplayDefinition = new DisplayDefinition(719, 575, 0, 719, 0, 575);
    defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
    subtitleService = new SubtitleService(paramInt1, paramInt2);
  }
  
  private static byte[] buildClutMapTable(int paramInt1, int paramInt2, ParsableBitArray paramParsableBitArray)
  {
    byte[] arrayOfByte = new byte[paramInt1];
    for (int i = 0; i < paramInt1; i++) {
      arrayOfByte[i] = ((byte)(byte)paramParsableBitArray.readBits(paramInt2));
    }
    return arrayOfByte;
  }
  
  private static int[] generateDefault2BitClutEntries()
  {
    return new int[] { 0, -1, -16777216, -8421505 };
  }
  
  private static int[] generateDefault4BitClutEntries()
  {
    int[] arrayOfInt = new int[16];
    arrayOfInt[0] = 0;
    for (int i = 1; i < 16; i++)
    {
      int j;
      int k;
      int m;
      if (i < 8)
      {
        if ((i & 0x1) != 0) {
          j = 255;
        } else {
          j = 0;
        }
        if ((i & 0x2) != 0) {
          k = 255;
        } else {
          k = 0;
        }
        if ((i & 0x4) != 0) {
          m = 255;
        } else {
          m = 0;
        }
        arrayOfInt[i] = getColor(255, j, k, m);
      }
      else
      {
        m = 127;
        if ((i & 0x1) != 0) {
          j = 127;
        } else {
          j = 0;
        }
        if ((i & 0x2) != 0) {
          k = 127;
        } else {
          k = 0;
        }
        if ((i & 0x4) == 0) {
          m = 0;
        }
        arrayOfInt[i] = getColor(255, j, k, m);
      }
    }
    return arrayOfInt;
  }
  
  private static int[] generateDefault8BitClutEntries()
  {
    int[] arrayOfInt = new int['Ā'];
    arrayOfInt[0] = 0;
    for (int i = 0; i < 256; i++)
    {
      int j = 255;
      int k;
      int m;
      if (i < 8)
      {
        if ((i & 0x1) != 0) {
          k = 255;
        } else {
          k = 0;
        }
        if ((i & 0x2) != 0) {
          m = 255;
        } else {
          m = 0;
        }
        if ((i & 0x4) == 0) {
          j = 0;
        }
        arrayOfInt[i] = getColor(63, k, m, j);
      }
      else
      {
        j = i & 0x88;
        m = 170;
        k = 85;
        int n;
        int i1;
        int i2;
        if (j != 0)
        {
          if (j != 8)
          {
            m = 43;
            if (j != 128)
            {
              if (j == 136)
              {
                if ((i & 0x1) != 0) {
                  j = 43;
                } else {
                  j = 0;
                }
                if ((i & 0x10) != 0) {
                  n = 85;
                } else {
                  n = 0;
                }
                if ((i & 0x2) != 0) {
                  i1 = 43;
                } else {
                  i1 = 0;
                }
                if ((i & 0x20) != 0) {
                  i2 = 85;
                } else {
                  i2 = 0;
                }
                if ((i & 0x4) == 0) {
                  m = 0;
                }
                if ((i & 0x40) == 0) {
                  k = 0;
                }
                arrayOfInt[i] = getColor(255, j + n, i1 + i2, m + k);
              }
            }
            else
            {
              if ((i & 0x1) != 0) {
                j = 43;
              } else {
                j = 0;
              }
              if ((i & 0x10) != 0) {
                n = 85;
              } else {
                n = 0;
              }
              if ((i & 0x2) != 0) {
                i1 = 43;
              } else {
                i1 = 0;
              }
              if ((i & 0x20) != 0) {
                i2 = 85;
              } else {
                i2 = 0;
              }
              if ((i & 0x4) == 0) {
                m = 0;
              }
              if ((i & 0x40) == 0) {
                k = 0;
              }
              arrayOfInt[i] = getColor(255, j + 127 + n, i1 + 127 + i2, m + 127 + k);
            }
          }
          else
          {
            if ((i & 0x1) != 0) {
              j = 85;
            } else {
              j = 0;
            }
            if ((i & 0x10) != 0) {
              n = 170;
            } else {
              n = 0;
            }
            if ((i & 0x2) != 0) {
              i1 = 85;
            } else {
              i1 = 0;
            }
            if ((i & 0x20) != 0) {
              i2 = 170;
            } else {
              i2 = 0;
            }
            if ((i & 0x4) == 0) {
              k = 0;
            }
            if ((i & 0x40) == 0) {
              m = 0;
            }
            arrayOfInt[i] = getColor(127, j + n, i1 + i2, k + m);
          }
        }
        else
        {
          if ((i & 0x1) != 0) {
            j = 85;
          } else {
            j = 0;
          }
          if ((i & 0x10) != 0) {
            n = 170;
          } else {
            n = 0;
          }
          if ((i & 0x2) != 0) {
            i1 = 85;
          } else {
            i1 = 0;
          }
          if ((i & 0x20) != 0) {
            i2 = 170;
          } else {
            i2 = 0;
          }
          if ((i & 0x4) == 0) {
            k = 0;
          }
          if ((i & 0x40) == 0) {
            m = 0;
          }
          arrayOfInt[i] = getColor(255, j + n, i1 + i2, k + m);
        }
      }
    }
    return arrayOfInt;
  }
  
  private static int getColor(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return paramInt1 << 24 | paramInt2 << 16 | paramInt3 << 8 | paramInt4;
  }
  
  private static int paint2BitPixelCodeString(ParsableBitArray paramParsableBitArray, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i;; paramInt1 = i)
    {
      int k = paramParsableBitArray.readBits(2);
      int m;
      if (k != 0)
      {
        i = paramInt1;
        m = 1;
        paramInt1 = k;
      }
      else if (paramParsableBitArray.readBit())
      {
        m = paramParsableBitArray.readBits(3) + 3;
        i = paramParsableBitArray.readBits(2);
        k = paramInt1;
        paramInt1 = i;
        i = k;
      }
      else if (paramParsableBitArray.readBit())
      {
        m = 1;
        label79:
        i = paramInt1;
        paramInt1 = 0;
      }
      else
      {
        i = paramParsableBitArray.readBits(2);
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i == 3) {}
            }
          }
        }
        for (i = paramInt1;; i = 1)
        {
          paramInt1 = 0;
          m = paramInt1;
          break label181;
          m = paramParsableBitArray.readBits(8) + 29;
          i = paramParsableBitArray.readBits(2);
          break;
          m = paramParsableBitArray.readBits(4) + 12;
          i = paramParsableBitArray.readBits(2);
          break;
          m = 2;
          break label79;
        }
      }
      label181:
      if ((m != 0) && (paramPaint != null))
      {
        k = paramInt1;
        if (paramArrayOfByte != null) {
          k = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[k]);
        paramCanvas.drawRect(j, paramInt2, j + m, paramInt2 + 1, paramPaint);
      }
      j += m;
      if (i != 0) {
        return j;
      }
    }
  }
  
  private static int paint4BitPixelCodeString(ParsableBitArray paramParsableBitArray, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i;; paramInt1 = i)
    {
      int k = paramParsableBitArray.readBits(4);
      i = 2;
      int m;
      if (k != 0)
      {
        i = paramInt1;
        m = 1;
        paramInt1 = k;
      }
      else
      {
        if (!paramParsableBitArray.readBit())
        {
          i = paramParsableBitArray.readBits(3);
          if (i != 0) {
            i += 2;
          }
        }
        label145:
        label194:
        for (m = i;; m = 1)
        {
          i = paramInt1;
          paramInt1 = 0;
          break label200;
          i = 1;
          break label145;
          if (!paramParsableBitArray.readBit())
          {
            m = paramParsableBitArray.readBits(2) + 4;
            i = paramParsableBitArray.readBits(4);
          }
          for (;;)
          {
            k = paramInt1;
            paramInt1 = i;
            i = k;
            break label200;
            m = paramParsableBitArray.readBits(2);
            if (m == 0) {
              break label194;
            }
            if (m == 1) {
              break;
            }
            if (m != 2)
            {
              if (m != 3)
              {
                i = paramInt1;
                paramInt1 = 0;
                m = paramInt1;
                break label200;
              }
              m = paramParsableBitArray.readBits(8) + 25;
              i = paramParsableBitArray.readBits(4);
            }
            else
            {
              m = paramParsableBitArray.readBits(4) + 9;
              i = paramParsableBitArray.readBits(4);
            }
          }
        }
      }
      label200:
      if ((m != 0) && (paramPaint != null))
      {
        k = paramInt1;
        if (paramArrayOfByte != null) {
          k = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[k]);
        paramCanvas.drawRect(j, paramInt2, j + m, paramInt2 + 1, paramPaint);
      }
      j += m;
      if (i != 0) {
        return j;
      }
    }
  }
  
  private static int paint8BitPixelCodeString(ParsableBitArray paramParsableBitArray, int[] paramArrayOfInt, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Paint paramPaint, Canvas paramCanvas)
  {
    int i = 0;
    int j = paramInt1;
    for (paramInt1 = i;; paramInt1 = i)
    {
      int k = paramParsableBitArray.readBits(8);
      int m;
      if (k != 0)
      {
        i = paramInt1;
        m = 1;
        paramInt1 = k;
      }
      else if (!paramParsableBitArray.readBit())
      {
        m = paramParsableBitArray.readBits(7);
        if (m != 0)
        {
          i = paramInt1;
          paramInt1 = 0;
        }
        else
        {
          i = 1;
          paramInt1 = 0;
          m = paramInt1;
        }
      }
      else
      {
        m = paramParsableBitArray.readBits(7);
        k = paramParsableBitArray.readBits(8);
        i = paramInt1;
        paramInt1 = k;
      }
      if ((m != 0) && (paramPaint != null))
      {
        k = paramInt1;
        if (paramArrayOfByte != null) {
          k = paramArrayOfByte[paramInt1];
        }
        paramPaint.setColor(paramArrayOfInt[k]);
        paramCanvas.drawRect(j, paramInt2, j + m, paramInt2 + 1, paramPaint);
      }
      j += m;
      if (i != 0) {
        return j;
      }
    }
  }
  
  private static void paintPixelDataSubBlock(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    ParsableBitArray localParsableBitArray = new ParsableBitArray(paramArrayOfByte);
    int i = paramInt2;
    byte[] arrayOfByte1 = null;
    byte[] arrayOfByte2 = arrayOfByte1;
    int j = paramInt3;
    paramInt3 = i;
    while (localParsableBitArray.bitsLeft() != 0)
    {
      i = localParsableBitArray.readBits(8);
      if (i != 240)
      {
        switch (i)
        {
        default: 
          switch (i)
          {
          default: 
            break;
          case 34: 
            arrayOfByte1 = buildClutMapTable(16, 8, localParsableBitArray);
            break;
          case 33: 
            arrayOfByte1 = buildClutMapTable(4, 8, localParsableBitArray);
            break;
          case 32: 
            arrayOfByte2 = buildClutMapTable(4, 4, localParsableBitArray);
          }
          break;
        case 18: 
          paramInt3 = paint8BitPixelCodeString(localParsableBitArray, paramArrayOfInt, null, paramInt3, j, paramPaint, paramCanvas);
          break;
        case 17: 
          if (paramInt1 == 3) {
            paramArrayOfByte = defaultMap4To8;
          } else {
            paramArrayOfByte = null;
          }
          paramInt3 = paint4BitPixelCodeString(localParsableBitArray, paramArrayOfInt, paramArrayOfByte, paramInt3, j, paramPaint, paramCanvas);
          localParsableBitArray.byteAlign();
          break;
        case 16: 
          if (paramInt1 == 3) {
            if (arrayOfByte1 == null) {
              paramArrayOfByte = defaultMap2To8;
            } else {
              paramArrayOfByte = arrayOfByte1;
            }
          }
          for (;;)
          {
            break;
            if (paramInt1 == 2)
            {
              if (arrayOfByte2 == null) {
                paramArrayOfByte = defaultMap2To4;
              } else {
                paramArrayOfByte = arrayOfByte2;
              }
            }
            else {
              paramArrayOfByte = null;
            }
          }
          paramInt3 = paint2BitPixelCodeString(localParsableBitArray, paramArrayOfInt, paramArrayOfByte, paramInt3, j, paramPaint, paramCanvas);
          localParsableBitArray.byteAlign();
          break;
        }
      }
      else
      {
        j += 2;
        paramInt3 = paramInt2;
      }
    }
  }
  
  private static void paintPixelDataSubBlocks(ObjectData paramObjectData, ClutDefinition paramClutDefinition, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint, Canvas paramCanvas)
  {
    if (paramInt1 == 3) {
      paramClutDefinition = clutEntries8Bit;
    } else if (paramInt1 == 2) {
      paramClutDefinition = clutEntries4Bit;
    } else {
      paramClutDefinition = clutEntries2Bit;
    }
    paintPixelDataSubBlock(topFieldData, paramClutDefinition, paramInt1, paramInt2, paramInt3, paramPaint, paramCanvas);
    paintPixelDataSubBlock(bottomFieldData, paramClutDefinition, paramInt1, paramInt2, paramInt3 + 1, paramPaint, paramCanvas);
  }
  
  private static ClutDefinition parseClutDefinition(ParsableBitArray paramParsableBitArray, int paramInt)
  {
    int i = paramParsableBitArray.readBits(8);
    paramParsableBitArray.skipBits(8);
    paramInt -= 2;
    int[] arrayOfInt1 = generateDefault2BitClutEntries();
    int[] arrayOfInt2 = generateDefault4BitClutEntries();
    int[] arrayOfInt3 = generateDefault8BitClutEntries();
    while (paramInt > 0)
    {
      int j = paramParsableBitArray.readBits(8);
      int k = paramParsableBitArray.readBits(8);
      paramInt -= 2;
      int[] arrayOfInt4;
      if ((k & 0x80) != 0) {
        arrayOfInt4 = arrayOfInt1;
      } else if ((k & 0x40) != 0) {
        arrayOfInt4 = arrayOfInt2;
      } else {
        arrayOfInt4 = arrayOfInt3;
      }
      if ((k & 0x1) != 0)
      {
        m = paramParsableBitArray.readBits(8);
        n = paramParsableBitArray.readBits(8);
        i1 = paramParsableBitArray.readBits(8);
        k = paramParsableBitArray.readBits(8);
        paramInt -= 4;
      }
      else
      {
        m = paramParsableBitArray.readBits(6);
        n = paramParsableBitArray.readBits(4);
        i1 = paramParsableBitArray.readBits(4) << 4;
        k = paramParsableBitArray.readBits(2);
        paramInt -= 2;
        k <<= 6;
        m <<= 2;
        n <<= 4;
      }
      if (m == 0)
      {
        k = 255;
        n = 0;
        i1 = 0;
      }
      k = (byte)(255 - (k & 0xFF));
      double d1 = m;
      double d2 = n - 128;
      int n = (int)(1.402D * d2 + d1);
      double d3 = i1 - 128;
      int i1 = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
      int m = (int)(d3 * 1.772D + d1);
      arrayOfInt4[j] = getColor(k, Util.constrainValue(n, 0, 255), Util.constrainValue(i1, 0, 255), Util.constrainValue(m, 0, 255));
    }
    return new ClutDefinition(i, arrayOfInt1, arrayOfInt2, arrayOfInt3);
  }
  
  private static DisplayDefinition parseDisplayDefinition(ParsableBitArray paramParsableBitArray)
  {
    paramParsableBitArray.skipBits(4);
    boolean bool = paramParsableBitArray.readBit();
    paramParsableBitArray.skipBits(3);
    int i = paramParsableBitArray.readBits(16);
    int j = paramParsableBitArray.readBits(16);
    int k;
    int m;
    int n;
    int i2;
    if (bool)
    {
      k = paramParsableBitArray.readBits(16);
      m = paramParsableBitArray.readBits(16);
      n = paramParsableBitArray.readBits(16);
      int i1 = paramParsableBitArray.readBits(16);
      i2 = m;
      m = i1;
    }
    else
    {
      k = 0;
      n = k;
      i2 = i;
      m = j;
    }
    return new DisplayDefinition(i, j, k, i2, n, m);
  }
  
  private static ObjectData parseObjectData(ParsableBitArray paramParsableBitArray)
  {
    int i = paramParsableBitArray.readBits(16);
    paramParsableBitArray.skipBits(4);
    int j = paramParsableBitArray.readBits(2);
    boolean bool = paramParsableBitArray.readBit();
    paramParsableBitArray.skipBits(1);
    Object localObject1 = null;
    Object localObject2 = null;
    if (j == 1)
    {
      paramParsableBitArray.skipBits(paramParsableBitArray.readBits(8) * 16);
    }
    else if (j == 0)
    {
      int k = paramParsableBitArray.readBits(16);
      j = paramParsableBitArray.readBits(16);
      if (k > 0)
      {
        localObject2 = new byte[k];
        paramParsableBitArray.readBytes((byte[])localObject2, 0, k);
      }
      localObject1 = localObject2;
      if (j > 0)
      {
        localObject1 = new byte[j];
        paramParsableBitArray.readBytes((byte[])localObject1, 0, j);
        paramParsableBitArray = (ParsableBitArray)localObject1;
        break label128;
      }
    }
    paramParsableBitArray = (ParsableBitArray)localObject1;
    localObject2 = localObject1;
    label128:
    return new ObjectData(i, bool, (byte[])localObject2, paramParsableBitArray);
  }
  
  private static PageComposition parsePageComposition(ParsableBitArray paramParsableBitArray, int paramInt)
  {
    int i = paramParsableBitArray.readBits(8);
    int j = paramParsableBitArray.readBits(4);
    int k = paramParsableBitArray.readBits(2);
    paramParsableBitArray.skipBits(2);
    paramInt -= 2;
    SparseArray localSparseArray = new SparseArray();
    while (paramInt > 0)
    {
      int m = paramParsableBitArray.readBits(8);
      paramParsableBitArray.skipBits(8);
      int n = paramParsableBitArray.readBits(16);
      int i1 = paramParsableBitArray.readBits(16);
      paramInt -= 6;
      localSparseArray.put(m, new PageRegion(n, i1));
    }
    return new PageComposition(i, j, k, localSparseArray);
  }
  
  private static RegionComposition parseRegionComposition(ParsableBitArray paramParsableBitArray, int paramInt)
  {
    int i = paramParsableBitArray.readBits(8);
    paramParsableBitArray.skipBits(4);
    boolean bool = paramParsableBitArray.readBit();
    paramParsableBitArray.skipBits(3);
    int j = paramParsableBitArray.readBits(16);
    int k = paramParsableBitArray.readBits(16);
    int m = paramParsableBitArray.readBits(3);
    int n = paramParsableBitArray.readBits(3);
    paramParsableBitArray.skipBits(2);
    int i1 = paramParsableBitArray.readBits(8);
    int i2 = paramParsableBitArray.readBits(8);
    int i3 = paramParsableBitArray.readBits(4);
    int i4 = paramParsableBitArray.readBits(2);
    paramParsableBitArray.skipBits(2);
    paramInt -= 10;
    SparseArray localSparseArray = new SparseArray();
    while (paramInt > 0)
    {
      int i5 = paramParsableBitArray.readBits(16);
      int i6 = paramParsableBitArray.readBits(2);
      int i7 = paramParsableBitArray.readBits(2);
      int i8 = paramParsableBitArray.readBits(12);
      paramParsableBitArray.skipBits(4);
      int i9 = paramParsableBitArray.readBits(12);
      paramInt -= 6;
      int i10;
      int i11;
      if ((i6 != 1) && (i6 != 2))
      {
        i10 = 0;
        i11 = i10;
      }
      else
      {
        i10 = paramParsableBitArray.readBits(8);
        i11 = paramParsableBitArray.readBits(8);
        int i12 = paramInt - 2;
        paramInt = i10;
        i10 = paramInt;
        paramInt = i12;
      }
      localSparseArray.put(i5, new RegionObject(i6, i7, i8, i9, i10, i11));
    }
    return new RegionComposition(i, bool, j, k, m, n, i1, i2, i3, i4, localSparseArray);
  }
  
  private static void parseSubtitlingSegment(ParsableBitArray paramParsableBitArray, SubtitleService paramSubtitleService)
  {
    int i = paramParsableBitArray.readBits(8);
    int j = paramParsableBitArray.readBits(16);
    int k = paramParsableBitArray.readBits(16);
    int m = paramParsableBitArray.getBytePosition();
    if (k * 8 > paramParsableBitArray.bitsLeft())
    {
      Log.w("DvbParser", "Data field length exceeds limit");
      paramParsableBitArray.skipBits(paramParsableBitArray.bitsLeft());
      return;
    }
    Object localObject;
    PageComposition localPageComposition;
    switch (i)
    {
    default: 
      break;
    case 20: 
      if (j == subtitlePageId) {
        displayDefinition = parseDisplayDefinition(paramParsableBitArray);
      }
      break;
    case 19: 
      if (j == subtitlePageId)
      {
        localObject = parseObjectData(paramParsableBitArray);
        objects.put(id, localObject);
      }
      else if (j == ancillaryPageId)
      {
        localObject = parseObjectData(paramParsableBitArray);
        ancillaryObjects.put(id, localObject);
      }
      break;
    case 18: 
      if (j == subtitlePageId)
      {
        localObject = parseClutDefinition(paramParsableBitArray, k);
        cluts.put(id, localObject);
      }
      else if (j == ancillaryPageId)
      {
        localObject = parseClutDefinition(paramParsableBitArray, k);
        ancillaryCluts.put(id, localObject);
      }
      break;
    case 17: 
      localPageComposition = pageComposition;
      if ((j == subtitlePageId) && (localPageComposition != null))
      {
        localObject = parseRegionComposition(paramParsableBitArray, k);
        if (state == 0) {
          ((RegionComposition)localObject).mergeFrom((RegionComposition)regions.get(id));
        }
        regions.put(id, localObject);
      }
      break;
    case 16: 
      if (j == subtitlePageId)
      {
        localPageComposition = pageComposition;
        localObject = parsePageComposition(paramParsableBitArray, k);
        if (state != 0)
        {
          pageComposition = ((PageComposition)localObject);
          regions.clear();
          cluts.clear();
          objects.clear();
        }
        else if ((localPageComposition != null) && (version != version))
        {
          pageComposition = ((PageComposition)localObject);
        }
      }
      break;
    }
    paramParsableBitArray.skipBytes(m + k - paramParsableBitArray.getBytePosition());
  }
  
  public List<Cue> decode(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte = new ParsableBitArray(paramArrayOfByte, paramInt);
    while ((paramArrayOfByte.bitsLeft() >= 48) && (paramArrayOfByte.readBits(8) == 15)) {
      parseSubtitlingSegment(paramArrayOfByte, subtitleService);
    }
    paramArrayOfByte = subtitleService;
    if (pageComposition == null) {
      return Collections.emptyList();
    }
    DisplayDefinition localDisplayDefinition = displayDefinition;
    if (localDisplayDefinition == null) {
      localDisplayDefinition = defaultDisplayDefinition;
    }
    paramArrayOfByte = bitmap;
    if ((paramArrayOfByte == null) || (width + 1 != paramArrayOfByte.getWidth()) || (height + 1 != bitmap.getHeight()))
    {
      paramArrayOfByte = Bitmap.createBitmap(width + 1, height + 1, Bitmap.Config.ARGB_8888);
      bitmap = paramArrayOfByte;
      canvas.setBitmap(paramArrayOfByte);
    }
    ArrayList localArrayList = new ArrayList();
    SparseArray localSparseArray = subtitleService.pageComposition.regions;
    for (int i = 0; i < localSparseArray.size(); i++)
    {
      paramArrayOfByte = (PageRegion)localSparseArray.valueAt(i);
      paramInt = localSparseArray.keyAt(i);
      RegionComposition localRegionComposition = (RegionComposition)subtitleService.regions.get(paramInt);
      int j = horizontalAddress + horizontalPositionMinimum;
      int k = verticalAddress + verticalPositionMinimum;
      paramInt = Math.min(width + j, horizontalPositionMaximum);
      int m = Math.min(height + k, verticalPositionMaximum);
      paramArrayOfByte = canvas;
      float f1 = j;
      float f2 = k;
      paramArrayOfByte.clipRect(f1, f2, paramInt, m, Region.Op.REPLACE);
      Object localObject = (ClutDefinition)subtitleService.cluts.get(clutId);
      paramArrayOfByte = (byte[])localObject;
      if (localObject == null)
      {
        localObject = (ClutDefinition)subtitleService.ancillaryCluts.get(clutId);
        paramArrayOfByte = (byte[])localObject;
        if (localObject == null) {
          paramArrayOfByte = defaultClutDefinition;
        }
      }
      localObject = regionObjects;
      for (paramInt = 0; paramInt < ((SparseArray)localObject).size(); paramInt++)
      {
        m = ((SparseArray)localObject).keyAt(paramInt);
        RegionObject localRegionObject = (RegionObject)((SparseArray)localObject).valueAt(paramInt);
        ObjectData localObjectData = (ObjectData)subtitleService.objects.get(m);
        if (localObjectData == null) {
          localObjectData = (ObjectData)subtitleService.ancillaryObjects.get(m);
        }
        if (localObjectData != null)
        {
          Paint localPaint;
          if (nonModifyingColorFlag) {
            localPaint = null;
          } else {
            localPaint = defaultPaint;
          }
          paintPixelDataSubBlocks(localObjectData, paramArrayOfByte, depth, horizontalPosition + j, k + verticalPosition, localPaint, canvas);
        }
      }
      if (fillFlag)
      {
        paramInt = depth;
        if (paramInt == 3) {
          paramInt = clutEntries8Bit[pixelCode8Bit];
        } else if (paramInt == 2) {
          paramInt = clutEntries4Bit[pixelCode4Bit];
        } else {
          paramInt = clutEntries2Bit[pixelCode2Bit];
        }
        fillRegionPaint.setColor(paramInt);
        canvas.drawRect(f1, f2, width + j, height + k, fillRegionPaint);
      }
      paramArrayOfByte = Bitmap.createBitmap(bitmap, j, k, width, height);
      paramInt = width;
      f1 /= paramInt;
      j = height;
      localArrayList.add(new Cue(paramArrayOfByte, f1, 0, f2 / j, 0, width / paramInt, height / j));
      canvas.drawColor(0, PorterDuff.Mode.CLEAR);
    }
    return localArrayList;
  }
  
  public void reset()
  {
    subtitleService.reset();
  }
  
  public static final class ClutDefinition
  {
    public final int[] clutEntries2Bit;
    public final int[] clutEntries4Bit;
    public final int[] clutEntries8Bit;
    public final int id;
    
    public ClutDefinition(int paramInt, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int[] paramArrayOfInt3)
    {
      id = paramInt;
      clutEntries2Bit = paramArrayOfInt1;
      clutEntries4Bit = paramArrayOfInt2;
      clutEntries8Bit = paramArrayOfInt3;
    }
  }
  
  public static final class DisplayDefinition
  {
    public final int height;
    public final int horizontalPositionMaximum;
    public final int horizontalPositionMinimum;
    public final int verticalPositionMaximum;
    public final int verticalPositionMinimum;
    public final int width;
    
    public DisplayDefinition(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      width = paramInt1;
      height = paramInt2;
      horizontalPositionMinimum = paramInt3;
      horizontalPositionMaximum = paramInt4;
      verticalPositionMinimum = paramInt5;
      verticalPositionMaximum = paramInt6;
    }
  }
  
  public static final class ObjectData
  {
    public final byte[] bottomFieldData;
    public final int id;
    public final boolean nonModifyingColorFlag;
    public final byte[] topFieldData;
    
    public ObjectData(int paramInt, boolean paramBoolean, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
    {
      id = paramInt;
      nonModifyingColorFlag = paramBoolean;
      topFieldData = paramArrayOfByte1;
      bottomFieldData = paramArrayOfByte2;
    }
  }
  
  public static final class PageComposition
  {
    public final SparseArray<DvbParser.PageRegion> regions;
    public final int state;
    public final int timeOutSecs;
    public final int version;
    
    public PageComposition(int paramInt1, int paramInt2, int paramInt3, SparseArray<DvbParser.PageRegion> paramSparseArray)
    {
      timeOutSecs = paramInt1;
      version = paramInt2;
      state = paramInt3;
      regions = paramSparseArray;
    }
  }
  
  public static final class PageRegion
  {
    public final int horizontalAddress;
    public final int verticalAddress;
    
    public PageRegion(int paramInt1, int paramInt2)
    {
      horizontalAddress = paramInt1;
      verticalAddress = paramInt2;
    }
  }
  
  public static final class RegionComposition
  {
    public final int clutId;
    public final int depth;
    public final boolean fillFlag;
    public final int height;
    public final int id;
    public final int levelOfCompatibility;
    public final int pixelCode2Bit;
    public final int pixelCode4Bit;
    public final int pixelCode8Bit;
    public final SparseArray<DvbParser.RegionObject> regionObjects;
    public final int width;
    
    public RegionComposition(int paramInt1, boolean paramBoolean, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, SparseArray<DvbParser.RegionObject> paramSparseArray)
    {
      id = paramInt1;
      fillFlag = paramBoolean;
      width = paramInt2;
      height = paramInt3;
      levelOfCompatibility = paramInt4;
      depth = paramInt5;
      clutId = paramInt6;
      pixelCode8Bit = paramInt7;
      pixelCode4Bit = paramInt8;
      pixelCode2Bit = paramInt9;
      regionObjects = paramSparseArray;
    }
    
    public void mergeFrom(RegionComposition paramRegionComposition)
    {
      if (paramRegionComposition == null) {
        return;
      }
      paramRegionComposition = regionObjects;
      for (int i = 0; i < paramRegionComposition.size(); i++) {
        regionObjects.put(paramRegionComposition.keyAt(i), paramRegionComposition.valueAt(i));
      }
    }
  }
  
  public static final class RegionObject
  {
    public final int backgroundPixelCode;
    public final int foregroundPixelCode;
    public final int horizontalPosition;
    public final int provider;
    public final int type;
    public final int verticalPosition;
    
    public RegionObject(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
    {
      type = paramInt1;
      provider = paramInt2;
      horizontalPosition = paramInt3;
      verticalPosition = paramInt4;
      foregroundPixelCode = paramInt5;
      backgroundPixelCode = paramInt6;
    }
  }
  
  public static final class SubtitleService
  {
    public final SparseArray<DvbParser.ClutDefinition> ancillaryCluts = new SparseArray();
    public final SparseArray<DvbParser.ObjectData> ancillaryObjects = new SparseArray();
    public final int ancillaryPageId;
    public final SparseArray<DvbParser.ClutDefinition> cluts = new SparseArray();
    public DvbParser.DisplayDefinition displayDefinition;
    public final SparseArray<DvbParser.ObjectData> objects = new SparseArray();
    public DvbParser.PageComposition pageComposition;
    public final SparseArray<DvbParser.RegionComposition> regions = new SparseArray();
    public final int subtitlePageId;
    
    public SubtitleService(int paramInt1, int paramInt2)
    {
      subtitlePageId = paramInt1;
      ancillaryPageId = paramInt2;
    }
    
    public void reset()
    {
      regions.clear();
      cluts.clear();
      objects.clear();
      ancillaryCluts.clear();
      ancillaryObjects.clear();
      displayDefinition = null;
      pageComposition = null;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.dvb.DvbParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */