package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

public final class PgsDecoder
  extends SimpleSubtitleDecoder
{
  private static final byte INFLATE_HEADER = 120;
  private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
  private static final int SECTION_TYPE_END = 128;
  private static final int SECTION_TYPE_IDENTIFIER = 22;
  private static final int SECTION_TYPE_PALETTE = 20;
  private final ParsableByteArray buffer = new ParsableByteArray();
  private final CueBuilder cueBuilder = new CueBuilder();
  private final ParsableByteArray inflatedBuffer = new ParsableByteArray();
  private Inflater inflater;
  
  public PgsDecoder()
  {
    super("PgsDecoder");
  }
  
  private void maybeInflateData(ParsableByteArray paramParsableByteArray)
  {
    if ((paramParsableByteArray.bytesLeft() > 0) && (paramParsableByteArray.peekUnsignedByte() == 120))
    {
      if (inflater == null) {
        inflater = new Inflater();
      }
      if (Util.inflate(paramParsableByteArray, inflatedBuffer, inflater))
      {
        ParsableByteArray localParsableByteArray = inflatedBuffer;
        paramParsableByteArray.reset(data, localParsableByteArray.limit());
      }
    }
  }
  
  private static Cue readNextSection(ParsableByteArray paramParsableByteArray, CueBuilder paramCueBuilder)
  {
    int i = paramParsableByteArray.limit();
    int j = paramParsableByteArray.readUnsignedByte();
    int k = paramParsableByteArray.readUnsignedShort();
    int m = paramParsableByteArray.getPosition() + k;
    Cue localCue = null;
    if (m > i)
    {
      paramParsableByteArray.setPosition(i);
      return null;
    }
    if (j != 128)
    {
      switch (j)
      {
      default: 
        paramCueBuilder = localCue;
        break;
      case 22: 
        CueBuilder.access$200(paramCueBuilder, paramParsableByteArray, k);
        paramCueBuilder = localCue;
        break;
      case 21: 
        CueBuilder.access$100(paramCueBuilder, paramParsableByteArray, k);
        paramCueBuilder = localCue;
        break;
      case 20: 
        CueBuilder.access$000(paramCueBuilder, paramParsableByteArray, k);
        paramCueBuilder = localCue;
        break;
      }
    }
    else
    {
      localCue = paramCueBuilder.build();
      paramCueBuilder.reset();
      paramCueBuilder = localCue;
    }
    paramParsableByteArray.setPosition(m);
    return paramCueBuilder;
  }
  
  public Subtitle decode(byte[] paramArrayOfByte, int paramInt, boolean paramBoolean)
    throws SubtitleDecoderException
  {
    buffer.reset(paramArrayOfByte, paramInt);
    maybeInflateData(buffer);
    cueBuilder.reset();
    paramArrayOfByte = new ArrayList();
    while (buffer.bytesLeft() >= 3)
    {
      Cue localCue = readNextSection(buffer, cueBuilder);
      if (localCue != null) {
        paramArrayOfByte.add(localCue);
      }
    }
    return new PgsSubtitle(Collections.unmodifiableList(paramArrayOfByte));
  }
  
  public static final class CueBuilder
  {
    private final ParsableByteArray bitmapData = new ParsableByteArray();
    private int bitmapHeight;
    private int bitmapWidth;
    private int bitmapX;
    private int bitmapY;
    private final int[] colors = new int['Ā'];
    private boolean colorsSet;
    private int planeHeight;
    private int planeWidth;
    
    private void parseBitmapSection(ParsableByteArray paramParsableByteArray, int paramInt)
    {
      if (paramInt < 4) {
        return;
      }
      paramParsableByteArray.skipBytes(3);
      if ((paramParsableByteArray.readUnsignedByte() & 0x80) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      int j = paramInt - 4;
      paramInt = j;
      if (i != 0)
      {
        if (j < 7) {
          return;
        }
        paramInt = paramParsableByteArray.readUnsignedInt24();
        if (paramInt < 4) {
          return;
        }
        bitmapWidth = paramParsableByteArray.readUnsignedShort();
        bitmapHeight = paramParsableByteArray.readUnsignedShort();
        bitmapData.reset(paramInt - 4);
        paramInt = j - 7;
      }
      int i = bitmapData.getPosition();
      j = bitmapData.limit();
      if ((i < j) && (paramInt > 0))
      {
        paramInt = Math.min(paramInt, j - i);
        paramParsableByteArray.readBytes(bitmapData.data, i, paramInt);
        bitmapData.setPosition(i + paramInt);
      }
    }
    
    private void parseIdentifierSection(ParsableByteArray paramParsableByteArray, int paramInt)
    {
      if (paramInt < 19) {
        return;
      }
      planeWidth = paramParsableByteArray.readUnsignedShort();
      planeHeight = paramParsableByteArray.readUnsignedShort();
      paramParsableByteArray.skipBytes(11);
      bitmapX = paramParsableByteArray.readUnsignedShort();
      bitmapY = paramParsableByteArray.readUnsignedShort();
    }
    
    private void parsePaletteSection(ParsableByteArray paramParsableByteArray, int paramInt)
    {
      if (paramInt % 5 != 2) {
        return;
      }
      paramParsableByteArray.skipBytes(2);
      Arrays.fill(colors, 0);
      int i = paramInt / 5;
      for (paramInt = 0; paramInt < i; paramInt++)
      {
        int j = paramParsableByteArray.readUnsignedByte();
        int k = paramParsableByteArray.readUnsignedByte();
        int m = paramParsableByteArray.readUnsignedByte();
        int n = paramParsableByteArray.readUnsignedByte();
        int i1 = paramParsableByteArray.readUnsignedByte();
        double d1 = k;
        double d2 = m - 128;
        m = (int)(1.402D * d2 + d1);
        double d3 = n - 128;
        k = (int)(d1 - 0.34414D * d3 - d2 * 0.71414D);
        n = (int)(d3 * 1.772D + d1);
        int[] arrayOfInt = colors;
        m = Util.constrainValue(m, 0, 255);
        k = Util.constrainValue(k, 0, 255);
        arrayOfInt[j] = (Util.constrainValue(n, 0, 255) | k << 8 | i1 << 24 | m << 16);
      }
      colorsSet = true;
    }
    
    public Cue build()
    {
      if ((planeWidth != 0) && (planeHeight != 0) && (bitmapWidth != 0) && (bitmapHeight != 0) && (bitmapData.limit() != 0) && (bitmapData.getPosition() == bitmapData.limit()) && (colorsSet))
      {
        bitmapData.setPosition(0);
        int i = bitmapWidth * bitmapHeight;
        Object localObject = new int[i];
        int j = 0;
        if (j < i)
        {
          int k = bitmapData.readUnsignedByte();
          if (k != 0)
          {
            m = j + 1;
            localObject[j] = colors[k];
          }
          for (j = m;; j = m)
          {
            break;
            k = bitmapData.readUnsignedByte();
            if (k == 0) {
              break;
            }
            if ((k & 0x40) == 0) {
              m = k & 0x3F;
            } else {
              m = (k & 0x3F) << 8 | bitmapData.readUnsignedByte();
            }
            if ((k & 0x80) == 0) {
              k = 0;
            } else {
              k = colors[bitmapData.readUnsignedByte()];
            }
            m += j;
            Arrays.fill((int[])localObject, j, m, k);
          }
        }
        localObject = Bitmap.createBitmap((int[])localObject, bitmapWidth, bitmapHeight, Bitmap.Config.ARGB_8888);
        float f1 = bitmapX;
        int m = planeWidth;
        float f2 = f1 / m;
        f1 = bitmapY;
        j = planeHeight;
        return new Cue((Bitmap)localObject, f2, 0, f1 / j, 0, bitmapWidth / m, bitmapHeight / j);
      }
      return null;
    }
    
    public void reset()
    {
      planeWidth = 0;
      planeHeight = 0;
      bitmapX = 0;
      bitmapY = 0;
      bitmapWidth = 0;
      bitmapHeight = 0;
      bitmapData.reset(0);
      colorsSet = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.pgs.PgsDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */