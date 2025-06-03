package androidx.constraintlayout.core.parser;

import a;

public class CLNumber
  extends CLElement
{
  public float value;
  
  public CLNumber(float paramFloat)
  {
    super(null);
    value = paramFloat;
  }
  
  public CLNumber(char[] paramArrayOfChar)
  {
    super(paramArrayOfChar);
    value = NaN.0F;
  }
  
  public static CLElement allocate(char[] paramArrayOfChar)
  {
    return new CLNumber(paramArrayOfChar);
  }
  
  public float getFloat()
  {
    if (Float.isNaN(value)) {
      value = Float.parseFloat(content());
    }
    return value;
  }
  
  public int getInt()
  {
    if (Float.isNaN(value)) {
      value = Integer.parseInt(content());
    }
    return (int)value;
  }
  
  public boolean isInt()
  {
    float f = getFloat();
    boolean bool;
    if ((int)f == f) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void putValue(float paramFloat)
  {
    value = paramFloat;
  }
  
  public String toFormattedJSON(int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    addIndent(localStringBuilder, paramInt1);
    float f = getFloat();
    paramInt1 = (int)f;
    if (paramInt1 == f) {
      localStringBuilder.append(paramInt1);
    } else {
      localStringBuilder.append(f);
    }
    return localStringBuilder.toString();
  }
  
  public String toJSON()
  {
    float f = getFloat();
    int i = (int)f;
    if (i == f) {
      return a.f("", i);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("");
    localStringBuilder.append(f);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.constraintlayout.core.parser.CLNumber
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */