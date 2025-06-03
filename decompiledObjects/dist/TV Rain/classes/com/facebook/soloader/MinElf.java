package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

public final class MinElf
{
  public static final int DT_NEEDED = 1;
  public static final int DT_NULL = 0;
  public static final int DT_STRTAB = 5;
  public static final int ELF_MAGIC = 1179403647;
  public static final int PN_XNUM = 65535;
  public static final int PT_DYNAMIC = 2;
  public static final int PT_LOAD = 1;
  
  public static String[] extract_DT_NEEDED(File paramFile)
    throws IOException
  {
    paramFile = new FileInputStream(paramFile);
    try
    {
      String[] arrayOfString = extract_DT_NEEDED(paramFile.getChannel());
      return arrayOfString;
    }
    finally
    {
      paramFile.close();
    }
  }
  
  public static String[] extract_DT_NEEDED(FileChannel paramFileChannel)
    throws IOException
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    if (getu32(paramFileChannel, localByteBuffer, 0L) == 1179403647L)
    {
      int i = getu8(paramFileChannel, localByteBuffer, 4L);
      int j = 1;
      if (i != 1) {
        j = 0;
      }
      if (getu8(paramFileChannel, localByteBuffer, 5L) == 2) {
        localByteBuffer.order(ByteOrder.BIG_ENDIAN);
      }
      long l1;
      if (j != 0) {
        l1 = getu32(paramFileChannel, localByteBuffer, 28L);
      } else {
        l1 = get64(paramFileChannel, localByteBuffer, 32L);
      }
      if (j != 0) {
        l2 = getu16(paramFileChannel, localByteBuffer, 44L);
      } else {
        l2 = getu16(paramFileChannel, localByteBuffer, 56L);
      }
      if (j != 0) {
        i = getu16(paramFileChannel, localByteBuffer, 42L);
      } else {
        i = getu16(paramFileChannel, localByteBuffer, 54L);
      }
      long l3 = l2;
      if (l2 == 65535L)
      {
        if (j != 0) {
          l2 = getu32(paramFileChannel, localByteBuffer, 32L);
        } else {
          l2 = get64(paramFileChannel, localByteBuffer, 40L);
        }
        if (j != 0) {
          l2 = getu32(paramFileChannel, localByteBuffer, l2 + 28L);
        } else {
          l2 = getu32(paramFileChannel, localByteBuffer, l2 + 44L);
        }
        l3 = l2;
      }
      long l4 = l1;
      long l5;
      for (long l2 = 0L; l2 < l3; l2 += 1L)
      {
        if (j != 0) {
          l5 = getu32(paramFileChannel, localByteBuffer, l4 + 0L);
        } else {
          l5 = getu32(paramFileChannel, localByteBuffer, l4 + 0L);
        }
        if (l5 == 2L)
        {
          if (j != 0)
          {
            l2 = getu32(paramFileChannel, localByteBuffer, l4 + 4L);
            break label334;
          }
          l2 = get64(paramFileChannel, localByteBuffer, l4 + 8L);
          break label334;
        }
        l4 += i;
      }
      l2 = 0L;
      label334:
      if (l2 != 0L)
      {
        l5 = l2;
        l4 = 0L;
        int k = 0;
        for (;;)
        {
          long l6;
          if (j != 0) {
            l6 = getu32(paramFileChannel, localByteBuffer, l5 + 0L);
          } else {
            l6 = get64(paramFileChannel, localByteBuffer, l5 + 0L);
          }
          String str = "malformed DT_NEEDED section";
          if (l6 == 1L)
          {
            if (k != Integer.MAX_VALUE) {
              k++;
            } else {
              throw new ElfError("malformed DT_NEEDED section");
            }
          }
          else if (l6 == 5L) {
            if (j != 0) {
              l4 = getu32(paramFileChannel, localByteBuffer, l5 + 4L);
            } else {
              l4 = get64(paramFileChannel, localByteBuffer, l5 + 8L);
            }
          }
          long l7;
          if (j != 0) {
            l7 = 8L;
          } else {
            l7 = 16L;
          }
          l5 += l7;
          if (l6 == 0L)
          {
            if (l4 != 0L)
            {
              for (int m = 0; m < l3; m++)
              {
                if (j != 0) {
                  l5 = getu32(paramFileChannel, localByteBuffer, l1 + 0L);
                } else {
                  l5 = getu32(paramFileChannel, localByteBuffer, l1 + 0L);
                }
                if (l5 == 1L)
                {
                  if (j != 0) {
                    l5 = getu32(paramFileChannel, localByteBuffer, l1 + 8L);
                  } else {
                    l5 = get64(paramFileChannel, localByteBuffer, l1 + 16L);
                  }
                  if (j != 0) {
                    l6 = getu32(paramFileChannel, localByteBuffer, l1 + 20L);
                  } else {
                    l6 = get64(paramFileChannel, localByteBuffer, l1 + 40L);
                  }
                  if ((l5 <= l4) && (l4 < l6 + l5))
                  {
                    if (j != 0) {
                      l1 = getu32(paramFileChannel, localByteBuffer, l1 + 4L);
                    } else {
                      l1 = get64(paramFileChannel, localByteBuffer, l1 + 8L);
                    }
                    l1 += l4 - l5;
                    break label692;
                  }
                }
                l1 += i;
              }
              l1 = 0L;
              label692:
              if (l1 != 0L)
              {
                String[] arrayOfString = new String[k];
                i = 0;
                for (;;)
                {
                  if (j != 0) {
                    l4 = getu32(paramFileChannel, localByteBuffer, l2 + 0L);
                  } else {
                    l4 = get64(paramFileChannel, localByteBuffer, l2 + 0L);
                  }
                  if (l4 == 1L)
                  {
                    if (j != 0) {
                      l3 = getu32(paramFileChannel, localByteBuffer, l2 + 4L);
                    } else {
                      l3 = get64(paramFileChannel, localByteBuffer, l2 + 8L);
                    }
                    arrayOfString[i] = getSz(paramFileChannel, localByteBuffer, l3 + l1);
                    if (i != Integer.MAX_VALUE) {
                      i++;
                    } else {
                      throw new ElfError(str);
                    }
                  }
                  if (j != 0) {
                    l3 = 8L;
                  } else {
                    l3 = 16L;
                  }
                  l2 += l3;
                  if (l4 == 0L)
                  {
                    if (i == k) {
                      return arrayOfString;
                    }
                    throw new ElfError(str);
                  }
                }
              }
              throw new ElfError("did not find file offset of DT_STRTAB table");
            }
            throw new ElfError("Dynamic section string-table not found");
          }
        }
      }
      throw new ElfError("ELF file does not contain dynamic linking information");
    }
    throw new ElfError("file is not ELF");
  }
  
  private static long get64(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong)
    throws IOException
  {
    read(paramFileChannel, paramByteBuffer, 8, paramLong);
    return paramByteBuffer.getLong();
  }
  
  private static String getSz(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong)
    throws IOException
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      int i = getu8(paramFileChannel, paramByteBuffer, paramLong);
      if (i == 0) {
        break;
      }
      localStringBuilder.append((char)i);
      paramLong = 1L + paramLong;
    }
    return localStringBuilder.toString();
  }
  
  private static int getu16(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong)
    throws IOException
  {
    read(paramFileChannel, paramByteBuffer, 2, paramLong);
    return paramByteBuffer.getShort() & 0xFFFF;
  }
  
  private static long getu32(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong)
    throws IOException
  {
    read(paramFileChannel, paramByteBuffer, 4, paramLong);
    return paramByteBuffer.getInt() & 0xFFFFFFFF;
  }
  
  private static short getu8(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, long paramLong)
    throws IOException
  {
    read(paramFileChannel, paramByteBuffer, 1, paramLong);
    return (short)(paramByteBuffer.get() & 0xFF);
  }
  
  private static void read(FileChannel paramFileChannel, ByteBuffer paramByteBuffer, int paramInt, long paramLong)
    throws IOException
  {
    paramByteBuffer.position(0);
    paramByteBuffer.limit(paramInt);
    while (paramByteBuffer.remaining() > 0)
    {
      paramInt = paramFileChannel.read(paramByteBuffer, paramLong);
      if (paramInt == -1) {
        break;
      }
      paramLong += paramInt;
    }
    if (paramByteBuffer.remaining() <= 0)
    {
      paramByteBuffer.position(0);
      return;
    }
    throw new ElfError("ELF file truncated");
  }
  
  public static class ElfError
    extends RuntimeException
  {
    public ElfError(String paramString)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.MinElf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */