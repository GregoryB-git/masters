package com.facebook.imageutils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.util.Pair;
import androidx.core.util.Pools.SynchronizedPool;
import com.facebook.common.internal.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import javax.annotation.Nullable;

public final class BitmapUtil
{
  public static final int ALPHA_8_BYTES_PER_PIXEL = 1;
  public static final int ARGB_4444_BYTES_PER_PIXEL = 2;
  public static final int ARGB_8888_BYTES_PER_PIXEL = 4;
  private static final Pools.SynchronizedPool<ByteBuffer> DECODE_BUFFERS = new Pools.SynchronizedPool(12);
  private static final int DECODE_BUFFER_SIZE = 16384;
  public static final float MAX_BITMAP_SIZE = 2048.0F;
  private static final int POOL_SIZE = 12;
  public static final int RGB_565_BYTES_PER_PIXEL = 2;
  
  @Nullable
  public static Pair<Integer, Integer> decodeDimensions(InputStream paramInputStream)
  {
    Preconditions.checkNotNull(paramInputStream);
    Pools.SynchronizedPool localSynchronizedPool = DECODE_BUFFERS;
    ByteBuffer localByteBuffer1 = (ByteBuffer)localSynchronizedPool.acquire();
    ByteBuffer localByteBuffer2 = localByteBuffer1;
    if (localByteBuffer1 == null) {
      localByteBuffer2 = ByteBuffer.allocate(16384);
    }
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    inJustDecodeBounds = true;
    try
    {
      inTempStorage = localByteBuffer2.array();
      localByteBuffer1 = null;
      BitmapFactory.decodeStream(paramInputStream, null, localOptions);
      paramInputStream = localByteBuffer1;
      if (outWidth != -1) {
        if (outHeight == -1) {
          paramInputStream = localByteBuffer1;
        } else {
          paramInputStream = new Pair(Integer.valueOf(outWidth), Integer.valueOf(outHeight));
        }
      }
      return paramInputStream;
    }
    finally
    {
      DECODE_BUFFERS.release(localByteBuffer2);
    }
  }
  
  @Nullable
  public static Pair<Integer, Integer> decodeDimensions(byte[] paramArrayOfByte)
  {
    return decodeDimensions(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public static int getPixelSizeForBitmapConfig(Bitmap.Config paramConfig)
  {
    int i = 1.$SwitchMap$android$graphics$Bitmap$Config[paramConfig.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i == 4) {
            return 2;
          }
          throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
        return 2;
      }
      return 1;
    }
    return 4;
  }
  
  public static int getSizeInByteForBitmap(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return getPixelSizeForBitmapConfig(paramConfig) * (paramInt1 * paramInt2);
  }
  
  @SuppressLint({"NewApi"})
  public static int getSizeInBytes(@Nullable Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return 0;
    }
    try
    {
      int i = paramBitmap.getAllocationByteCount();
      return i;
    }
    catch (NullPointerException localNullPointerException) {}
    return paramBitmap.getByteCount();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imageutils.BitmapUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */