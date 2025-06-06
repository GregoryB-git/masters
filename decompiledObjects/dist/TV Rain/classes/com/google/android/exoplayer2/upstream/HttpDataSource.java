package com.google.android.exoplayer2.upstream;

import a;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Predicate;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import z2;
import z3;

public abstract interface HttpDataSource
  extends DataSource
{
  public static final Predicate<String> REJECT_PAYWALL_TYPES = new z3(26);
  
  public abstract void clearAllRequestProperties();
  
  public abstract void clearRequestProperty(String paramString);
  
  public abstract void close()
    throws HttpDataSource.HttpDataSourceException;
  
  public abstract Map<String, List<String>> getResponseHeaders();
  
  public abstract long open(DataSpec paramDataSpec)
    throws HttpDataSource.HttpDataSourceException;
  
  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws HttpDataSource.HttpDataSourceException;
  
  public abstract void setRequestProperty(String paramString1, String paramString2);
  
  public static abstract class BaseFactory
    implements HttpDataSource.Factory
  {
    private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
    
    @Deprecated
    public final void clearAllDefaultRequestProperties()
    {
      defaultRequestProperties.clear();
    }
    
    @Deprecated
    public final void clearDefaultRequestProperty(String paramString)
    {
      defaultRequestProperties.remove(paramString);
    }
    
    public final HttpDataSource createDataSource()
    {
      return createDataSourceInternal(defaultRequestProperties);
    }
    
    public abstract HttpDataSource createDataSourceInternal(HttpDataSource.RequestProperties paramRequestProperties);
    
    public final HttpDataSource.RequestProperties getDefaultRequestProperties()
    {
      return defaultRequestProperties;
    }
    
    @Deprecated
    public final void setDefaultRequestProperty(String paramString1, String paramString2)
    {
      defaultRequestProperties.set(paramString1, paramString2);
    }
  }
  
  public static abstract interface Factory
    extends DataSource.Factory
  {
    @Deprecated
    public abstract void clearAllDefaultRequestProperties();
    
    @Deprecated
    public abstract void clearDefaultRequestProperty(String paramString);
    
    public abstract HttpDataSource createDataSource();
    
    public abstract HttpDataSource.RequestProperties getDefaultRequestProperties();
    
    @Deprecated
    public abstract void setDefaultRequestProperty(String paramString1, String paramString2);
  }
  
  public static class HttpDataSourceException
    extends IOException
  {
    public static final int TYPE_CLOSE = 3;
    public static final int TYPE_OPEN = 1;
    public static final int TYPE_READ = 2;
    public final DataSpec dataSpec;
    public final int type;
    
    public HttpDataSourceException(DataSpec paramDataSpec, int paramInt)
    {
      dataSpec = paramDataSpec;
      type = paramInt;
    }
    
    public HttpDataSourceException(IOException paramIOException, DataSpec paramDataSpec, int paramInt)
    {
      super();
      dataSpec = paramDataSpec;
      type = paramInt;
    }
    
    public HttpDataSourceException(String paramString, DataSpec paramDataSpec, int paramInt)
    {
      super();
      dataSpec = paramDataSpec;
      type = paramInt;
    }
    
    public HttpDataSourceException(String paramString, IOException paramIOException, DataSpec paramDataSpec, int paramInt)
    {
      super(paramIOException);
      dataSpec = paramDataSpec;
      type = paramInt;
    }
    
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public static @interface Type {}
  }
  
  public static final class InvalidContentTypeException
    extends HttpDataSource.HttpDataSourceException
  {
    public final String contentType;
    
    public InvalidContentTypeException(String paramString, DataSpec paramDataSpec)
    {
      super(paramDataSpec, 1);
      contentType = paramString;
    }
  }
  
  public static final class InvalidResponseCodeException
    extends HttpDataSource.HttpDataSourceException
  {
    public final Map<String, List<String>> headerFields;
    public final int responseCode;
    @Nullable
    public final String responseMessage;
    
    public InvalidResponseCodeException(int paramInt, @Nullable String paramString, Map<String, List<String>> paramMap, DataSpec paramDataSpec)
    {
      super(paramDataSpec, 1);
      responseCode = paramInt;
      responseMessage = paramString;
      headerFields = paramMap;
    }
    
    @Deprecated
    public InvalidResponseCodeException(int paramInt, Map<String, List<String>> paramMap, DataSpec paramDataSpec)
    {
      this(paramInt, null, paramMap, paramDataSpec);
    }
  }
  
  public static final class RequestProperties
  {
    private final Map<String, String> requestProperties = new HashMap();
    private Map<String, String> requestPropertiesSnapshot;
    
    public void clear()
    {
      try
      {
        requestPropertiesSnapshot = null;
        requestProperties.clear();
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    public void clearAndSet(Map<String, String> paramMap)
    {
      try
      {
        requestPropertiesSnapshot = null;
        requestProperties.clear();
        requestProperties.putAll(paramMap);
        return;
      }
      finally
      {
        paramMap = finally;
        throw paramMap;
      }
    }
    
    public Map<String, String> getSnapshot()
    {
      try
      {
        if (requestPropertiesSnapshot == null)
        {
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>(requestProperties);
          requestPropertiesSnapshot = Collections.unmodifiableMap((Map)localObject1);
        }
        Object localObject1 = requestPropertiesSnapshot;
        return (Map<String, String>)localObject1;
      }
      finally {}
    }
    
    public void remove(String paramString)
    {
      try
      {
        requestPropertiesSnapshot = null;
        requestProperties.remove(paramString);
        return;
      }
      finally
      {
        paramString = finally;
        throw paramString;
      }
    }
    
    public void set(String paramString1, String paramString2)
    {
      try
      {
        requestPropertiesSnapshot = null;
        requestProperties.put(paramString1, paramString2);
        return;
      }
      finally
      {
        paramString1 = finally;
        throw paramString1;
      }
    }
    
    public void set(Map<String, String> paramMap)
    {
      try
      {
        requestPropertiesSnapshot = null;
        requestProperties.putAll(paramMap);
        return;
      }
      finally
      {
        paramMap = finally;
        throw paramMap;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.HttpDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */