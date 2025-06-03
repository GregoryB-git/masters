package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(19)
@ThreadSafe
public class KitKatPurgeableDecoder
  extends DalvikPurgeableDecoder
{
  private final FlexByteArrayPool mFlexByteArrayPool;
  
  public KitKatPurgeableDecoder(FlexByteArrayPool paramFlexByteArrayPool)
  {
    mFlexByteArrayPool = paramFlexByteArrayPool;
  }
  
  private static void putEOI(byte[] paramArrayOfByte, int paramInt)
  {
    paramArrayOfByte[paramInt] = ((byte)-1);
    paramArrayOfByte[(paramInt + 1)] = ((byte)-39);
  }
  
  public Bitmap decodeByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, BitmapFactory.Options paramOptions)
  {
    PooledByteBuffer localPooledByteBuffer = (PooledByteBuffer)paramCloseableReference.get();
    int i = localPooledByteBuffer.size();
    paramCloseableReference = mFlexByteArrayPool.get(i);
    try
    {
      byte[] arrayOfByte = (byte[])paramCloseableReference.get();
      localPooledByteBuffer.read(0, arrayOfByte, 0, i);
      paramOptions = (Bitmap)Preconditions.checkNotNull(BitmapFactory.decodeByteArray(arrayOfByte, 0, i, paramOptions), "BitmapFactory returned null");
      return paramOptions;
    }
    finally
    {
      CloseableReference.closeSafely(paramCloseableReference);
    }
  }
  
  public Bitmap decodeJPEGByteArrayAsPurgeable(CloseableReference<PooledByteBuffer> paramCloseableReference, int paramInt, BitmapFactory.Options paramOptions)
  {
    byte[] arrayOfByte1;
    if (DalvikPurgeableDecoder.endsWithEOI(paramCloseableReference, paramInt)) {
      arrayOfByte1 = null;
    } else {
      arrayOfByte1 = DalvikPurgeableDecoder.EOI;
    }
    PooledByteBuffer localPooledByteBuffer = (PooledByteBuffer)paramCloseableReference.get();
    boolean bool;
    if (paramInt <= localPooledByteBuffer.size()) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    paramCloseableReference = mFlexByteArrayPool;
    int i = paramInt + 2;
    paramCloseableReference = paramCloseableReference.get(i);
    try
    {
      byte[] arrayOfByte2 = (byte[])paramCloseableReference.get();
      localPooledByteBuffer.read(0, arrayOfByte2, 0, paramInt);
      int j = paramInt;
      if (arrayOfByte1 != null)
      {
        putEOI(arrayOfByte2, paramInt);
        j = i;
      }
      paramOptions = (Bitmap)Preconditions.checkNotNull(BitmapFactory.decodeByteArray(arrayOfByte2, 0, j, paramOptions), "BitmapFactory returned null");
      return paramOptions;
    }
    finally
    {
      CloseableReference.closeSafely(paramCloseableReference);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.platform.KitKatPurgeableDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */