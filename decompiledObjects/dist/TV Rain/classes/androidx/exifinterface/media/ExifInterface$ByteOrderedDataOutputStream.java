package androidx.exifinterface.media;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

class ExifInterface$ByteOrderedDataOutputStream
  extends FilterOutputStream
{
  private ByteOrder mByteOrder;
  private final OutputStream mOutputStream;
  
  public ExifInterface$ByteOrderedDataOutputStream(OutputStream paramOutputStream, ByteOrder paramByteOrder)
  {
    super(paramOutputStream);
    mOutputStream = paramOutputStream;
    mByteOrder = paramByteOrder;
  }
  
  public void setByteOrder(ByteOrder paramByteOrder)
  {
    mByteOrder = paramByteOrder;
  }
  
  public void write(byte[] paramArrayOfByte)
    throws IOException
  {
    mOutputStream.write(paramArrayOfByte);
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    mOutputStream.write(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void writeByte(int paramInt)
    throws IOException
  {
    mOutputStream.write(paramInt);
  }
  
  public void writeInt(int paramInt)
    throws IOException
  {
    ByteOrder localByteOrder = mByteOrder;
    if (localByteOrder == ByteOrder.LITTLE_ENDIAN)
    {
      mOutputStream.write(paramInt >>> 0 & 0xFF);
      mOutputStream.write(paramInt >>> 8 & 0xFF);
      mOutputStream.write(paramInt >>> 16 & 0xFF);
      mOutputStream.write(paramInt >>> 24 & 0xFF);
    }
    else if (localByteOrder == ByteOrder.BIG_ENDIAN)
    {
      mOutputStream.write(paramInt >>> 24 & 0xFF);
      mOutputStream.write(paramInt >>> 16 & 0xFF);
      mOutputStream.write(paramInt >>> 8 & 0xFF);
      mOutputStream.write(paramInt >>> 0 & 0xFF);
    }
  }
  
  public void writeShort(short paramShort)
    throws IOException
  {
    ByteOrder localByteOrder = mByteOrder;
    if (localByteOrder == ByteOrder.LITTLE_ENDIAN)
    {
      mOutputStream.write(paramShort >>> 0 & 0xFF);
      mOutputStream.write(paramShort >>> 8 & 0xFF);
    }
    else if (localByteOrder == ByteOrder.BIG_ENDIAN)
    {
      mOutputStream.write(paramShort >>> 8 & 0xFF);
      mOutputStream.write(paramShort >>> 0 & 0xFF);
    }
  }
  
  public void writeUnsignedInt(long paramLong)
    throws IOException
  {
    writeInt((int)paramLong);
  }
  
  public void writeUnsignedShort(int paramInt)
    throws IOException
  {
    writeShort((short)paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface.ByteOrderedDataOutputStream
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */