package D5;

public enum o$f
{
  public String o;
  
  public o$f(String paramString1)
  {
    o = paramString1;
  }
  
  public static f e(String paramString)
  {
    for (f localf : ) {
      if (o.equals(paramString)) {
        return localf;
      }
    }
    ??? = new StringBuilder();
    ((StringBuilder)???).append("No such DeviceOrientation: ");
    ((StringBuilder)???).append(paramString);
    throw new NoSuchFieldException(((StringBuilder)???).toString());
  }
}

/* Location:
 * Qualified Name:     D5.o.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */