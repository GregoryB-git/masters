package I3;

import H3.i;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;

public class f
  implements a
{
  public static final Charset d = Charset.forName("UTF-8");
  public final File a;
  public final int b;
  public e c;
  
  public f(File paramFile, int paramInt)
  {
    a = paramFile;
    b = paramInt;
  }
  
  public void a()
  {
    i.f(c, "There was a problem closing the Crashlytics log file.");
    c = null;
  }
  
  public String b()
  {
    Object localObject = c();
    if (localObject != null) {
      localObject = new String((byte[])localObject, d);
    } else {
      localObject = null;
    }
    return (String)localObject;
  }
  
  public byte[] c()
  {
    b localb = g();
    if (localb == null) {
      return null;
    }
    int i = b;
    byte[] arrayOfByte = new byte[i];
    System.arraycopy(a, 0, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public void d()
  {
    a();
    a.delete();
  }
  
  public void e(long paramLong, String paramString)
  {
    h();
    f(paramLong, paramString);
  }
  
  public final void f(long paramLong, String paramString)
  {
    if (c == null) {
      return;
    }
    String str = paramString;
    if (paramString == null) {
      str = "null";
    }
    try
    {
      int i = b / 4;
      paramString = str;
      if (str.length() > i)
      {
        paramString = new java/lang/StringBuilder;
        paramString.<init>();
        paramString.append("...");
        paramString.append(str.substring(str.length() - i));
        paramString = paramString.toString();
      }
    }
    catch (IOException paramString)
    {
      break label173;
    }
    paramString = paramString.replaceAll("\r", " ").replaceAll("\n", " ");
    paramString = String.format(Locale.US, "%d %s%n", new Object[] { Long.valueOf(paramLong), paramString }).getBytes(d);
    c.h(paramString);
    while ((!c.q()) && (c.E() > b))
    {
      c.x();
      continue;
      label173:
      E3.f.f().e("There was a problem writing to the Crashlytics log.", paramString);
    }
  }
  
  public final b g()
  {
    if (!a.exists()) {
      return null;
    }
    h();
    Object localObject = c;
    if (localObject == null) {
      return null;
    }
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 0;
    localObject = new byte[((e)localObject).E()];
    try
    {
      e locale = c;
      a locala = new I3/f$a;
      locala.<init>(this, (byte[])localObject, arrayOfInt);
      locale.m(locala);
    }
    catch (IOException localIOException)
    {
      E3.f.f().e("A problem occurred while reading the Crashlytics log file.", localIOException);
    }
    return new b((byte[])localObject, arrayOfInt[0]);
  }
  
  public final void h()
  {
    if (c == null) {
      try
      {
        localObject = new I3/e;
        ((e)localObject).<init>(a);
        c = ((e)localObject);
      }
      catch (IOException localIOException)
      {
        Object localObject = E3.f.f();
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Could not open log file: ");
        localStringBuilder.append(a);
        ((E3.f)localObject).e(localStringBuilder.toString(), localIOException);
      }
    }
  }
  
  public class a
    implements e.d
  {
    public a(byte[] paramArrayOfByte, int[] paramArrayOfInt) {}
    
    public void a(InputStream paramInputStream, int paramInt)
    {
      try
      {
        paramInputStream.read(a, b[0], paramInt);
        int[] arrayOfInt = b;
        arrayOfInt[0] += paramInt;
        return;
      }
      finally
      {
        paramInputStream.close();
      }
    }
  }
  
  public static class b
  {
    public final byte[] a;
    public final int b;
    
    public b(byte[] paramArrayOfByte, int paramInt)
    {
      a = paramArrayOfByte;
      b = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     I3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */