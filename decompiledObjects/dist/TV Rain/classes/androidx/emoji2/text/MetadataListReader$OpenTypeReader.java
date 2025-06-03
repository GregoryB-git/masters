package androidx.emoji2.text;

import java.io.IOException;

abstract interface MetadataListReader$OpenTypeReader
{
  public static final int UINT16_BYTE_COUNT = 2;
  public static final int UINT32_BYTE_COUNT = 4;
  
  public abstract long getPosition();
  
  public abstract int readTag()
    throws IOException;
  
  public abstract long readUnsignedInt()
    throws IOException;
  
  public abstract int readUnsignedShort()
    throws IOException;
  
  public abstract void skip(int paramInt)
    throws IOException;
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.MetadataListReader.OpenTypeReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */