package j3;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

public abstract class v
{
  public static l a(BufferedReader paramBufferedReader)
  {
    paramBufferedReader = new JsonReader(paramBufferedReader);
    try
    {
      paramBufferedReader.beginObject();
      while (paramBufferedReader.hasNext())
      {
        if (paramBufferedReader.nextName().equals("nextRequestWaitMillis"))
        {
          if (paramBufferedReader.peek() == JsonToken.STRING)
          {
            localObject1 = new l(Long.parseLong(paramBufferedReader.nextString()));
            return (l)localObject1;
          }
          localObject1 = new l(paramBufferedReader.nextLong());
          return (l)localObject1;
        }
        paramBufferedReader.skipValue();
      }
      Object localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Response is missing nextRequestWaitMillis field.");
      throw ((Throwable)localObject1);
    }
    finally
    {
      paramBufferedReader.close();
    }
  }
  
  public abstract long b();
}

/* Location:
 * Qualified Name:     j3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */