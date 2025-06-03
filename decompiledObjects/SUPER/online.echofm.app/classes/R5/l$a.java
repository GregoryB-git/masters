package R5;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class l$a
  implements k
{
  public String a(List paramList)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(paramList);
      localObjectOutputStream.flush();
      paramList = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      return paramList;
    }
    catch (IOException paramList)
    {
      throw new RuntimeException(paramList);
    }
  }
  
  public List b(String paramString)
  {
    try
    {
      ObjectInputStream localObjectInputStream = new java/io/ObjectInputStream;
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      localByteArrayInputStream.<init>(Base64.decode(paramString, 0));
      localObjectInputStream.<init>(localByteArrayInputStream);
      paramString = (List)localObjectInputStream.readObject();
      return paramString;
    }
    catch (ClassNotFoundException paramString) {}catch (IOException paramString) {}
    throw new RuntimeException(paramString);
  }
}

/* Location:
 * Qualified Name:     R5.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */