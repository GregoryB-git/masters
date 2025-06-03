package androidx.emoji2.text.flatbuffer;

public class FlexBuffers$Key
  extends FlexBuffers.Object
{
  private static final Key EMPTY = new Key(FlexBuffers.access$000(), 0, 0);
  
  public FlexBuffers$Key(ReadBuf paramReadBuf, int paramInt1, int paramInt2)
  {
    super(paramReadBuf, paramInt1, paramInt2);
  }
  
  public static Key empty()
  {
    return EMPTY;
  }
  
  public int compareTo(byte[] paramArrayOfByte)
  {
    int i = end;
    int j = 0;
    int k;
    int m;
    do
    {
      k = bb.get(i);
      m = paramArrayOfByte[j];
      if (k == 0) {
        return k - m;
      }
      i++;
      j++;
      if (j == paramArrayOfByte.length) {
        return k - m;
      }
    } while (k == m);
    return k - m;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Key;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Key)paramObject;
    bool1 = bool2;
    if (end == end)
    {
      bool1 = bool2;
      if (byteWidth == byteWidth) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    return end ^ byteWidth;
  }
  
  public String toString()
  {
    for (int i = end;; i++) {
      if (bb.get(i) == 0)
      {
        int j = end;
        return bb.getString(j, i - j);
      }
    }
  }
  
  public StringBuilder toString(StringBuilder paramStringBuilder)
  {
    paramStringBuilder.append(toString());
    return paramStringBuilder;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Key
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */