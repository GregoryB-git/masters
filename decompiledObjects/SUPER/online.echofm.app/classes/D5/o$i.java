package D5;

public enum o$i
{
  public final String o;
  
  public o$i(String paramString1)
  {
    o = paramString1;
  }
  
  public static i e(String paramString)
  {
    for (localObject : ) {
      if (o.equals(paramString)) {
        return (i)localObject;
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No such SoundType: ");
    ((StringBuilder)localObject).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     D5.o.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */