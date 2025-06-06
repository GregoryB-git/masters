package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class DefaultDataSource
  implements DataSource
{
  private static final String SCHEME_ASSET = "asset";
  private static final String SCHEME_CONTENT = "content";
  private static final String SCHEME_RAW = "rawresource";
  private static final String SCHEME_RTMP = "rtmp";
  private static final String TAG = "DefaultDataSource";
  @Nullable
  private DataSource assetDataSource;
  private final DataSource baseDataSource;
  @Nullable
  private DataSource contentDataSource;
  private final Context context;
  @Nullable
  private DataSource dataSchemeDataSource;
  @Nullable
  private DataSource dataSource;
  @Nullable
  private DataSource fileDataSource;
  @Nullable
  private DataSource rawResourceDataSource;
  @Nullable
  private DataSource rtmpDataSource;
  private final List<TransferListener> transferListeners;
  
  public DefaultDataSource(Context paramContext, DataSource paramDataSource)
  {
    context = paramContext.getApplicationContext();
    baseDataSource = ((DataSource)Assertions.checkNotNull(paramDataSource));
    transferListeners = new ArrayList();
  }
  
  @Deprecated
  public DefaultDataSource(Context paramContext, @Nullable TransferListener paramTransferListener, DataSource paramDataSource)
  {
    this(paramContext, paramDataSource);
    if (paramTransferListener != null) {
      transferListeners.add(paramTransferListener);
    }
  }
  
  @Deprecated
  public DefaultDataSource(Context paramContext, @Nullable TransferListener paramTransferListener, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramContext, paramTransferListener, new DefaultHttpDataSource(paramString, null, paramTransferListener, paramInt1, paramInt2, paramBoolean, null));
  }
  
  @Deprecated
  public DefaultDataSource(Context paramContext, @Nullable TransferListener paramTransferListener, String paramString, boolean paramBoolean)
  {
    this(paramContext, paramTransferListener, paramString, 8000, 8000, paramBoolean);
  }
  
  public DefaultDataSource(Context paramContext, String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this(paramContext, new DefaultHttpDataSource(paramString, null, paramInt1, paramInt2, paramBoolean, null));
  }
  
  public DefaultDataSource(Context paramContext, String paramString, boolean paramBoolean)
  {
    this(paramContext, paramString, 8000, 8000, paramBoolean);
  }
  
  private void addListenersToDataSource(DataSource paramDataSource)
  {
    for (int i = 0; i < transferListeners.size(); i++) {
      paramDataSource.addTransferListener((TransferListener)transferListeners.get(i));
    }
  }
  
  private DataSource getAssetDataSource()
  {
    if (assetDataSource == null)
    {
      AssetDataSource localAssetDataSource = new AssetDataSource(context);
      assetDataSource = localAssetDataSource;
      addListenersToDataSource(localAssetDataSource);
    }
    return assetDataSource;
  }
  
  private DataSource getContentDataSource()
  {
    if (contentDataSource == null)
    {
      ContentDataSource localContentDataSource = new ContentDataSource(context);
      contentDataSource = localContentDataSource;
      addListenersToDataSource(localContentDataSource);
    }
    return contentDataSource;
  }
  
  private DataSource getDataSchemeDataSource()
  {
    if (dataSchemeDataSource == null)
    {
      DataSchemeDataSource localDataSchemeDataSource = new DataSchemeDataSource();
      dataSchemeDataSource = localDataSchemeDataSource;
      addListenersToDataSource(localDataSchemeDataSource);
    }
    return dataSchemeDataSource;
  }
  
  private DataSource getFileDataSource()
  {
    if (fileDataSource == null)
    {
      FileDataSource localFileDataSource = new FileDataSource();
      fileDataSource = localFileDataSource;
      addListenersToDataSource(localFileDataSource);
    }
    return fileDataSource;
  }
  
  private DataSource getRawResourceDataSource()
  {
    if (rawResourceDataSource == null)
    {
      RawResourceDataSource localRawResourceDataSource = new RawResourceDataSource(context);
      rawResourceDataSource = localRawResourceDataSource;
      addListenersToDataSource(localRawResourceDataSource);
    }
    return rawResourceDataSource;
  }
  
  private DataSource getRtmpDataSource()
  {
    if (rtmpDataSource == null)
    {
      try
      {
        DataSource localDataSource = (DataSource)Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
        rtmpDataSource = localDataSource;
        addListenersToDataSource(localDataSource);
      }
      catch (Exception localException)
      {
        throw new RuntimeException("Error instantiating RTMP extension", localException);
      }
      catch (ClassNotFoundException localClassNotFoundException)
      {
        Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
      }
      if (rtmpDataSource == null) {
        rtmpDataSource = baseDataSource;
      }
    }
    return rtmpDataSource;
  }
  
  private void maybeAddListenerToDataSource(@Nullable DataSource paramDataSource, TransferListener paramTransferListener)
  {
    if (paramDataSource != null) {
      paramDataSource.addTransferListener(paramTransferListener);
    }
  }
  
  public void addTransferListener(TransferListener paramTransferListener)
  {
    baseDataSource.addTransferListener(paramTransferListener);
    transferListeners.add(paramTransferListener);
    maybeAddListenerToDataSource(fileDataSource, paramTransferListener);
    maybeAddListenerToDataSource(assetDataSource, paramTransferListener);
    maybeAddListenerToDataSource(contentDataSource, paramTransferListener);
    maybeAddListenerToDataSource(rtmpDataSource, paramTransferListener);
    maybeAddListenerToDataSource(dataSchemeDataSource, paramTransferListener);
    maybeAddListenerToDataSource(rawResourceDataSource, paramTransferListener);
  }
  
  /* Error */
  public void close()
    throws IOException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 194	com/google/android/exoplayer2/upstream/DefaultDataSource:dataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +25 -> 31
    //   9: aload_1
    //   10: invokeinterface 196 1 0
    //   15: aload_0
    //   16: aconst_null
    //   17: putfield 194	com/google/android/exoplayer2/upstream/DefaultDataSource:dataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   20: goto +11 -> 31
    //   23: astore_1
    //   24: aload_0
    //   25: aconst_null
    //   26: putfield 194	com/google/android/exoplayer2/upstream/DefaultDataSource:dataSource	Lcom/google/android/exoplayer2/upstream/DataSource;
    //   29: aload_1
    //   30: athrow
    //   31: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	32	0	this	DefaultDataSource
    //   4	6	1	localDataSource	DataSource
    //   23	7	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	15	23	finally
  }
  
  public Map<String, List<String>> getResponseHeaders()
  {
    Object localObject = dataSource;
    if (localObject == null) {
      localObject = Collections.emptyMap();
    } else {
      localObject = ((DataSource)localObject).getResponseHeaders();
    }
    return (Map<String, List<String>>)localObject;
  }
  
  @Nullable
  public Uri getUri()
  {
    Object localObject = dataSource;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((DataSource)localObject).getUri();
    }
    return (Uri)localObject;
  }
  
  public long open(DataSpec paramDataSpec)
    throws IOException
  {
    boolean bool;
    if (dataSource == null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    String str = uri.getScheme();
    if (Util.isLocalFileUri(uri))
    {
      if (uri.getPath().startsWith("/android_asset/")) {
        dataSource = getAssetDataSource();
      } else {
        dataSource = getFileDataSource();
      }
    }
    else if ("asset".equals(str)) {
      dataSource = getAssetDataSource();
    } else if ("content".equals(str)) {
      dataSource = getContentDataSource();
    } else if ("rtmp".equals(str)) {
      dataSource = getRtmpDataSource();
    } else if ("data".equals(str)) {
      dataSource = getDataSchemeDataSource();
    } else if ("rawresource".equals(str)) {
      dataSource = getRawResourceDataSource();
    } else {
      dataSource = baseDataSource;
    }
    return dataSource.open(paramDataSpec);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException
  {
    return ((DataSource)Assertions.checkNotNull(dataSource)).read(paramArrayOfByte, paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.DefaultDataSource
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */