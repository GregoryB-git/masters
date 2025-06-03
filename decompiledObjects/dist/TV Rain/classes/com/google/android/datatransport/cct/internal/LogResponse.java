package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class LogResponse
{
  private static final String LOG_TAG = "LogResponseInternal";
  
  public static LogResponse create(long paramLong)
  {
    return new AutoValue_LogResponse(paramLong);
  }
  
  @NonNull
  public static LogResponse fromJson(@NonNull Reader paramReader)
    throws IOException
  {
    paramReader = new JsonReader(paramReader);
    try
    {
      paramReader.beginObject();
      while (paramReader.hasNext())
      {
        if (paramReader.nextName().equals("nextRequestWaitMillis"))
        {
          if (paramReader.peek() == JsonToken.STRING)
          {
            localObject1 = create(Long.parseLong(paramReader.nextString()));
            return (LogResponse)localObject1;
          }
          localObject1 = create(paramReader.nextLong());
          return (LogResponse)localObject1;
        }
        paramReader.skipValue();
      }
      Object localObject1 = new java/io/IOException;
      ((IOException)localObject1).<init>("Response is missing nextRequestWaitMillis field.");
      throw ((Throwable)localObject1);
    }
    finally
    {
      paramReader.close();
    }
  }
  
  public abstract long getNextRequestWaitMillis();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.cct.internal.LogResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */