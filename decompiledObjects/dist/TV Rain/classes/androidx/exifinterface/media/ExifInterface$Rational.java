package androidx.exifinterface.media;

class ExifInterface$Rational
{
  public final long denominator;
  public final long numerator;
  
  public ExifInterface$Rational(double paramDouble)
  {
    this((paramDouble * 10000.0D), 10000L);
  }
  
  public ExifInterface$Rational(long paramLong1, long paramLong2)
  {
    if (paramLong2 == 0L)
    {
      numerator = 0L;
      denominator = 1L;
      return;
    }
    numerator = paramLong1;
    denominator = paramLong2;
  }
  
  public double calculate()
  {
    return numerator / denominator;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(numerator);
    localStringBuilder.append("/");
    localStringBuilder.append(denominator);
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.exifinterface.media.ExifInterface.Rational
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */