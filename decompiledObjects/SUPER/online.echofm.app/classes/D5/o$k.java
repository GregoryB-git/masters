package D5;

public enum o$k
{
  public String o;
  
  public o$k(String paramString1)
  {
    o = paramString1;
  }
  
  public static k e(String paramString)
  {
    for (localObject : ) {
      if (o.equals(paramString)) {
        return (k)localObject;
      }
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No such SystemUiMode: ");
    ((StringBuilder)localObject).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)localObject).toString());
  }
}

/* Location:
 * Qualified Name:     D5.o.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */