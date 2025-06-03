package D5;

public enum o$e
{
  public String o;
  
  public o$e(String paramString1)
  {
    o = paramString1;
  }
  
  public static e e(String paramString)
  {
    for (localObject : ) {
      if (o.equals(paramString)) {
        return (e)localObject;
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No such ClipboardContentFormat: ");
    ((StringBuilder)localObject).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     D5.o.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */