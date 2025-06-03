package H;

public abstract class b
{
  public static void a(Object paramObject, StringBuilder paramStringBuilder)
  {
    if (paramObject == null) {}
    for (paramObject = "null";; paramObject = Integer.toHexString(System.identityHashCode(paramObject)))
    {
      paramStringBuilder.append((String)paramObject);
      break;
      String str1 = paramObject.getClass().getSimpleName();
      String str2 = str1;
      if (str1.length() <= 0)
      {
        str1 = paramObject.getClass().getName();
        int i = str1.lastIndexOf('.');
        str2 = str1;
        if (i > 0) {
          str2 = str1.substring(i + 1);
        }
      }
      paramStringBuilder.append(str2);
      paramStringBuilder.append('{');
    }
  }
}

/* Location:
 * Qualified Name:     H.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */