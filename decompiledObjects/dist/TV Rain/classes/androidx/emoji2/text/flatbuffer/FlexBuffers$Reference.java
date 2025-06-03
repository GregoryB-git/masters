package androidx.emoji2.text.flatbuffer;

import z2;

public class FlexBuffers$Reference
{
  private static final Reference NULL_REFERENCE = new Reference(FlexBuffers.access$000(), 0, 1, 0);
  private ReadBuf bb;
  private int byteWidth;
  private int end;
  private int parentWidth;
  private int type;
  
  public FlexBuffers$Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3)
  {
    this(paramReadBuf, paramInt1, paramInt2, 1 << (paramInt3 & 0x3), paramInt3 >> 2);
  }
  
  public FlexBuffers$Reference(ReadBuf paramReadBuf, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    bb = paramReadBuf;
    end = paramInt1;
    parentWidth = paramInt2;
    byteWidth = paramInt3;
    type = paramInt4;
  }
  
  public FlexBuffers.Blob asBlob()
  {
    if ((!isBlob()) && (!isString())) {
      return FlexBuffers.Blob.empty();
    }
    ReadBuf localReadBuf = bb;
    return new FlexBuffers.Blob(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
  }
  
  public boolean asBoolean()
  {
    boolean bool1 = isBoolean();
    boolean bool2 = true;
    boolean bool3 = true;
    if (bool1)
    {
      if (bb.get(end) == 0) {
        bool3 = false;
      }
      return bool3;
    }
    if (asUInt() != 0L) {
      bool3 = bool2;
    } else {
      bool3 = false;
    }
    return bool3;
  }
  
  public double asFloat()
  {
    int i = type;
    if (i == 3) {
      return FlexBuffers.access$400(bb, end, parentWidth);
    }
    if (i != 1)
    {
      if (i != 2) {
        if (i != 5)
        {
          ReadBuf localReadBuf;
          if (i != 6)
          {
            if (i != 7)
            {
              if (i != 8)
              {
                if (i != 10)
                {
                  if (i != 26) {
                    return 0.0D;
                  }
                }
                else {
                  return asVector().size();
                }
              }
              else
              {
                localReadBuf = bb;
                return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
            }
            else
            {
              localReadBuf = bb;
              return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
            }
          }
          else
          {
            localReadBuf = bb;
            return FlexBuffers.access$100(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
          }
        }
        else
        {
          return Double.parseDouble(asString());
        }
      }
      return FlexBuffers.access$300(bb, end, parentWidth);
    }
    return FlexBuffers.access$100(bb, end, parentWidth);
  }
  
  public int asInt()
  {
    int i = type;
    if (i == 1) {
      return FlexBuffers.access$100(bb, end, parentWidth);
    }
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 5)
        {
          if (i != 6)
          {
            if (i != 7)
            {
              if (i != 8)
              {
                if (i != 10)
                {
                  if (i != 26) {
                    return 0;
                  }
                  return FlexBuffers.access$100(bb, end, parentWidth);
                }
                return asVector().size();
              }
              localReadBuf = bb;
              return (int)FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
            }
            localReadBuf = bb;
            return (int)FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
          }
          ReadBuf localReadBuf = bb;
          return FlexBuffers.access$100(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
        }
        return Integer.parseInt(asString());
      }
      return (int)FlexBuffers.access$400(bb, end, parentWidth);
    }
    return (int)FlexBuffers.access$300(bb, end, parentWidth);
  }
  
  public FlexBuffers.Key asKey()
  {
    if (isKey())
    {
      ReadBuf localReadBuf = bb;
      return new FlexBuffers.Key(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
    }
    return FlexBuffers.Key.empty();
  }
  
  public long asLong()
  {
    int i = type;
    if (i == 1) {
      return FlexBuffers.access$500(bb, end, parentWidth);
    }
    if (i != 2)
    {
      if (i != 3)
      {
        if (i != 5)
        {
          if (i != 6)
          {
            if (i != 7)
            {
              if (i != 8)
              {
                if (i != 10)
                {
                  if (i != 26) {
                    return 0L;
                  }
                  return FlexBuffers.access$100(bb, end, parentWidth);
                }
                return asVector().size();
              }
              localReadBuf = bb;
              return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
            }
            localReadBuf = bb;
            return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
          }
          ReadBuf localReadBuf = bb;
          return FlexBuffers.access$500(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
        }
        try
        {
          long l = Long.parseLong(asString());
          return l;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          return 0L;
        }
      }
      return FlexBuffers.access$400(bb, end, parentWidth);
    }
    return FlexBuffers.access$300(bb, end, parentWidth);
  }
  
  public FlexBuffers.Map asMap()
  {
    if (isMap())
    {
      ReadBuf localReadBuf = bb;
      return new FlexBuffers.Map(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
    }
    return FlexBuffers.Map.empty();
  }
  
  public String asString()
  {
    int i;
    int j;
    if (isString())
    {
      i = FlexBuffers.access$200(bb, end, parentWidth);
      ReadBuf localReadBuf = bb;
      j = byteWidth;
      j = (int)FlexBuffers.access$300(localReadBuf, i - j, j);
      return bb.getString(i, j);
    }
    if (isKey())
    {
      j = FlexBuffers.access$200(bb, end, byteWidth);
      for (i = j;; i++) {
        if (bb.get(i) == 0) {
          return bb.getString(j, i - j);
        }
      }
    }
    return "";
  }
  
  public long asUInt()
  {
    int i = type;
    if (i == 2) {
      return FlexBuffers.access$300(bb, end, parentWidth);
    }
    if (i != 1)
    {
      if (i != 3)
      {
        if (i != 10)
        {
          if (i != 26)
          {
            if (i != 5)
            {
              if (i != 6)
              {
                if (i != 7)
                {
                  if (i != 8) {
                    return 0L;
                  }
                  localReadBuf = bb;
                  return FlexBuffers.access$400(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), parentWidth);
                }
                localReadBuf = bb;
                return FlexBuffers.access$300(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
              }
              ReadBuf localReadBuf = bb;
              return FlexBuffers.access$500(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
            }
            return Long.parseLong(asString());
          }
          return FlexBuffers.access$100(bb, end, parentWidth);
        }
        return asVector().size();
      }
      return FlexBuffers.access$400(bb, end, parentWidth);
    }
    return FlexBuffers.access$500(bb, end, parentWidth);
  }
  
  public FlexBuffers.Vector asVector()
  {
    ReadBuf localReadBuf;
    if (isVector())
    {
      localReadBuf = bb;
      return new FlexBuffers.Vector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth);
    }
    int i = type;
    if (i == 15)
    {
      localReadBuf = bb;
      return new FlexBuffers.TypedVector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth, 4);
    }
    if (FlexBuffers.isTypedVector(i))
    {
      localReadBuf = bb;
      return new FlexBuffers.TypedVector(localReadBuf, FlexBuffers.access$200(localReadBuf, end, parentWidth), byteWidth, FlexBuffers.toTypedVectorElementType(type));
    }
    return FlexBuffers.Vector.empty();
  }
  
  public int getType()
  {
    return type;
  }
  
  public boolean isBlob()
  {
    boolean bool;
    if (type == 25) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isBoolean()
  {
    boolean bool;
    if (type == 26) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isFloat()
  {
    int i = type;
    boolean bool;
    if ((i != 3) && (i != 8)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isInt()
  {
    int i = type;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i != 1) {
      if (i == 6) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public boolean isIntOrUInt()
  {
    boolean bool;
    if ((!isInt()) && (!isUInt())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isKey()
  {
    boolean bool;
    if (type == 4) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isMap()
  {
    boolean bool;
    if (type == 9) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isNull()
  {
    boolean bool;
    if (type == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isNumeric()
  {
    boolean bool;
    if ((!isIntOrUInt()) && (!isFloat())) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isString()
  {
    boolean bool;
    if (type == 5) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean isTypedVector()
  {
    return FlexBuffers.isTypedVector(type);
  }
  
  public boolean isUInt()
  {
    int i = type;
    boolean bool;
    if ((i != 2) && (i != 7)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public boolean isVector()
  {
    int i = type;
    boolean bool;
    if ((i != 10) && (i != 9)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public String toString()
  {
    return toString(new StringBuilder(128)).toString();
  }
  
  public StringBuilder toString(StringBuilder paramStringBuilder)
  {
    int i = type;
    if (i != 36) {
      switch (i)
      {
      default: 
        return paramStringBuilder;
      case 26: 
        paramStringBuilder.append(asBoolean());
        return paramStringBuilder;
      case 25: 
        return asBlob().toString(paramStringBuilder);
      case 16: 
      case 17: 
      case 18: 
      case 19: 
      case 20: 
      case 21: 
      case 22: 
      case 23: 
      case 24: 
        paramStringBuilder = z2.t("not_implemented:");
        paramStringBuilder.append(type);
        throw new FlexBuffers.FlexBufferException(paramStringBuilder.toString());
      case 10: 
        return asVector().toString(paramStringBuilder);
      case 9: 
        return asMap().toString(paramStringBuilder);
      case 5: 
        paramStringBuilder.append('"');
        paramStringBuilder.append(asString());
        paramStringBuilder.append('"');
        return paramStringBuilder;
      case 4: 
        FlexBuffers.Key localKey = asKey();
        paramStringBuilder.append('"');
        paramStringBuilder = localKey.toString(paramStringBuilder);
        paramStringBuilder.append('"');
        return paramStringBuilder;
      case 3: 
      case 8: 
        paramStringBuilder.append(asFloat());
        return paramStringBuilder;
      case 2: 
      case 7: 
        paramStringBuilder.append(asUInt());
        return paramStringBuilder;
      case 1: 
      case 6: 
        paramStringBuilder.append(asLong());
        return paramStringBuilder;
      case 0: 
        paramStringBuilder.append("null");
        return paramStringBuilder;
      }
    }
    paramStringBuilder.append(asVector());
    return paramStringBuilder;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffers.Reference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */