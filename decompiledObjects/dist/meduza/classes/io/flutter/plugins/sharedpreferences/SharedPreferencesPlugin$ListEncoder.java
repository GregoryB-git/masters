package io.flutter.plugins.sharedpreferences;

import android.util.Base64;
import ec.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class SharedPreferencesPlugin$ListEncoder
  implements SharedPreferencesListEncoder
{
  public List<String> decode(String paramString)
  {
    i.e(paramString, "listString");
    try
    {
      Object localObject1 = Base64.decode(paramString, 0);
      Object localObject2 = new java/io/ObjectInputStream;
      paramString = new java/io/ByteArrayInputStream;
      paramString.<init>((byte[])localObject1);
      ((ObjectInputStream)localObject2).<init>(paramString);
      paramString = ((ObjectInputStream)localObject2).readObject();
      i.c(paramString, "null cannot be cast to non-null type kotlin.collections.List<*>");
      localObject2 = (List)paramString;
      paramString = new java/util/ArrayList;
      paramString.<init>();
      localObject2 = ((Iterable)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject1 = ((Iterator)localObject2).next();
        if ((localObject1 instanceof String)) {
          paramString.add(localObject1);
        }
      }
      return paramString;
    }
    catch (RuntimeException paramString)
    {
      throw new RuntimeException(paramString);
    }
  }
  
  public String encode(List<String> paramList)
  {
    i.e(paramList, "list");
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(paramList);
      localObjectOutputStream.flush();
      paramList = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
      i.d(paramList, "encodeToString(...)");
      return paramList;
    }
    catch (RuntimeException paramList)
    {
      throw new RuntimeException(paramList);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.ListEncoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */