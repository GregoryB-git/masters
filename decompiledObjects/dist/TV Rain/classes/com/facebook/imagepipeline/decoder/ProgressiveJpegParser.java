package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Throwables;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.util.StreamUtil;
import java.io.IOException;
import java.io.InputStream;

public class ProgressiveJpegParser
{
  private static final int BUFFER_SIZE = 16384;
  private static final int NOT_A_JPEG = 6;
  private static final int READ_FIRST_JPEG_BYTE = 0;
  private static final int READ_MARKER_FIRST_BYTE_OR_ENTROPY_DATA = 2;
  private static final int READ_MARKER_SECOND_BYTE = 3;
  private static final int READ_SECOND_JPEG_BYTE = 1;
  private static final int READ_SIZE_FIRST_BYTE = 4;
  private static final int READ_SIZE_SECOND_BYTE = 5;
  private int mBestScanEndOffset;
  private int mBestScanNumber;
  private final ByteArrayPool mByteArrayPool;
  private int mBytesParsed;
  private boolean mEndMarkerRead;
  private int mLastByteRead;
  private int mNextFullScanNumber;
  private int mParserState;
  
  public ProgressiveJpegParser(ByteArrayPool paramByteArrayPool)
  {
    mByteArrayPool = ((ByteArrayPool)Preconditions.checkNotNull(paramByteArrayPool));
    mBytesParsed = 0;
    mLastByteRead = 0;
    mNextFullScanNumber = 0;
    mBestScanEndOffset = 0;
    mBestScanNumber = 0;
    mParserState = 0;
  }
  
  private boolean doParseMoreData(InputStream paramInputStream)
  {
    int i = mBestScanNumber;
    for (;;)
    {
      boolean bool1 = false;
      try
      {
        if (mParserState != 6)
        {
          int j = paramInputStream.read();
          if (j != -1)
          {
            int k = mBytesParsed + 1;
            mBytesParsed = k;
            if (mEndMarkerRead)
            {
              mParserState = 6;
              mEndMarkerRead = false;
              return false;
            }
            int m = mParserState;
            if (m != 0)
            {
              if (m != 1)
              {
                if (m != 2)
                {
                  if (m != 3)
                  {
                    if (m != 4)
                    {
                      if (m != 5)
                      {
                        Preconditions.checkState(false);
                      }
                      else
                      {
                        m = (mLastByteRead << 8) + j - 2;
                        StreamUtil.skip(paramInputStream, m);
                        mBytesParsed += m;
                        mParserState = 2;
                      }
                    }
                    else {
                      mParserState = 5;
                    }
                  }
                  else if (j == 255)
                  {
                    mParserState = 3;
                  }
                  else if (j == 0)
                  {
                    mParserState = 2;
                  }
                  else if (j == 217)
                  {
                    mEndMarkerRead = true;
                    newScanOrImageEndFound(k - 2);
                    mParserState = 2;
                  }
                  else
                  {
                    if (j == 218) {
                      newScanOrImageEndFound(k - 2);
                    }
                    if (doesMarkerStartSegment(j)) {
                      mParserState = 4;
                    } else {
                      mParserState = 2;
                    }
                  }
                }
                else if (j == 255) {
                  mParserState = 3;
                }
              }
              else if (j == 216) {
                mParserState = 2;
              } else {
                mParserState = 6;
              }
            }
            else if (j == 255) {
              mParserState = 1;
            } else {
              mParserState = 6;
            }
            mLastByteRead = j;
          }
        }
      }
      catch (IOException paramInputStream)
      {
        Throwables.propagate(paramInputStream);
        boolean bool2 = bool1;
        if (mParserState != 6)
        {
          bool2 = bool1;
          if (mBestScanNumber != i) {
            bool2 = true;
          }
        }
        return bool2;
      }
    }
  }
  
  private static boolean doesMarkerStartSegment(int paramInt)
  {
    boolean bool = true;
    if (paramInt == 1) {
      return false;
    }
    if ((paramInt >= 208) && (paramInt <= 215)) {
      return false;
    }
    if ((paramInt == 217) || (paramInt == 216)) {
      bool = false;
    }
    return bool;
  }
  
  private void newScanOrImageEndFound(int paramInt)
  {
    int i = mNextFullScanNumber;
    if (i > 0) {
      mBestScanEndOffset = paramInt;
    }
    mNextFullScanNumber = (i + 1);
    mBestScanNumber = i;
  }
  
  public int getBestScanEndOffset()
  {
    return mBestScanEndOffset;
  }
  
  public int getBestScanNumber()
  {
    return mBestScanNumber;
  }
  
  public boolean isEndMarkerRead()
  {
    return mEndMarkerRead;
  }
  
  public boolean isJpeg()
  {
    int i = mBytesParsed;
    boolean bool = true;
    if ((i <= 1) || (mParserState == 6)) {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public boolean parseMoreData(com.facebook.imagepipeline.image.EncodedImage paramEncodedImage)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 58	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:mParserState	I
    //   4: bipush 6
    //   6: if_icmpne +5 -> 11
    //   9: iconst_0
    //   10: ireturn
    //   11: aload_1
    //   12: invokevirtual 107	com/facebook/imagepipeline/image/EncodedImage:getSize	()I
    //   15: aload_0
    //   16: getfield 48	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:mBytesParsed	I
    //   19: if_icmpgt +5 -> 24
    //   22: iconst_0
    //   23: ireturn
    //   24: new 109	com/facebook/common/memory/PooledByteArrayBufferedInputStream
    //   27: dup
    //   28: aload_1
    //   29: invokevirtual 113	com/facebook/imagepipeline/image/EncodedImage:getInputStream	()Ljava/io/InputStream;
    //   32: aload_0
    //   33: getfield 46	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:mByteArrayPool	Lcom/facebook/common/memory/ByteArrayPool;
    //   36: sipush 16384
    //   39: invokeinterface 119 2 0
    //   44: checkcast 121	[B
    //   47: aload_0
    //   48: getfield 46	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:mByteArrayPool	Lcom/facebook/common/memory/ByteArrayPool;
    //   51: invokespecial 124	com/facebook/common/memory/PooledByteArrayBufferedInputStream:<init>	(Ljava/io/InputStream;[BLcom/facebook/common/references/ResourceReleaser;)V
    //   54: astore_1
    //   55: aload_1
    //   56: aload_0
    //   57: getfield 48	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:mBytesParsed	I
    //   60: i2l
    //   61: invokestatic 81	com/facebook/common/util/StreamUtil:skip	(Ljava/io/InputStream;J)J
    //   64: pop2
    //   65: aload_0
    //   66: aload_1
    //   67: invokespecial 126	com/facebook/imagepipeline/decoder/ProgressiveJpegParser:doParseMoreData	(Ljava/io/InputStream;)Z
    //   70: istore_2
    //   71: aload_1
    //   72: invokestatic 132	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   75: iload_2
    //   76: ireturn
    //   77: astore_3
    //   78: goto +15 -> 93
    //   81: astore_3
    //   82: aload_3
    //   83: invokestatic 95	com/facebook/common/internal/Throwables:propagate	(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    //   86: pop
    //   87: aload_1
    //   88: invokestatic 132	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   91: iconst_0
    //   92: ireturn
    //   93: aload_1
    //   94: invokestatic 132	com/facebook/common/internal/Closeables:closeQuietly	(Ljava/io/InputStream;)V
    //   97: aload_3
    //   98: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	ProgressiveJpegParser
    //   0	99	1	paramEncodedImage	com.facebook.imagepipeline.image.EncodedImage
    //   70	6	2	bool	boolean
    //   77	1	3	localObject	Object
    //   81	17	3	localIOException	IOException
    // Exception table:
    //   from	to	target	type
    //   55	71	77	finally
    //   82	87	77	finally
    //   55	71	81	java/io/IOException
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.decoder.ProgressiveJpegParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */