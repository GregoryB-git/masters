package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.os.CancellationSignal;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader
  extends AsyncTaskLoader<Cursor>
{
  public CancellationSignal mCancellationSignal;
  public Cursor mCursor;
  public final Loader<Cursor>.ForceLoadContentObserver mObserver = new Loader.ForceLoadContentObserver(this);
  public String[] mProjection;
  public String mSelection;
  public String[] mSelectionArgs;
  public String mSortOrder;
  public Uri mUri;
  
  public CursorLoader(@NonNull Context paramContext)
  {
    super(paramContext);
  }
  
  public CursorLoader(@NonNull Context paramContext, @NonNull Uri paramUri, @Nullable String[] paramArrayOfString1, @Nullable String paramString1, @Nullable String[] paramArrayOfString2, @Nullable String paramString2)
  {
    super(paramContext);
    mUri = paramUri;
    mProjection = paramArrayOfString1;
    mSelection = paramString1;
    mSelectionArgs = paramArrayOfString2;
    mSortOrder = paramString2;
  }
  
  public void cancelLoadInBackground()
  {
    super.cancelLoadInBackground();
    try
    {
      CancellationSignal localCancellationSignal = mCancellationSignal;
      if (localCancellationSignal != null) {
        localCancellationSignal.cancel();
      }
      return;
    }
    finally {}
  }
  
  public void deliverResult(Cursor paramCursor)
  {
    if (isReset())
    {
      if (paramCursor != null) {
        paramCursor.close();
      }
      return;
    }
    Cursor localCursor = mCursor;
    mCursor = paramCursor;
    if (isStarted()) {
      super.deliverResult(paramCursor);
    }
    if ((localCursor != null) && (localCursor != paramCursor) && (!localCursor.isClosed())) {
      localCursor.close();
    }
  }
  
  @Deprecated
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mUri=");
    paramPrintWriter.println(mUri);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mProjection=");
    paramPrintWriter.println(Arrays.toString(mProjection));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelection=");
    paramPrintWriter.println(mSelection);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSelectionArgs=");
    paramPrintWriter.println(Arrays.toString(mSelectionArgs));
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mSortOrder=");
    paramPrintWriter.println(mSortOrder);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mCursor=");
    paramPrintWriter.println(mCursor);
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("mContentChanged=");
    paramPrintWriter.println(mContentChanged);
  }
  
  @Nullable
  public String[] getProjection()
  {
    return mProjection;
  }
  
  @Nullable
  public String getSelection()
  {
    return mSelection;
  }
  
  @Nullable
  public String[] getSelectionArgs()
  {
    return mSelectionArgs;
  }
  
  @Nullable
  public String getSortOrder()
  {
    return mSortOrder;
  }
  
  @NonNull
  public Uri getUri()
  {
    return mUri;
  }
  
  /* Error */
  public Cursor loadInBackground()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 143	androidx/loader/content/AsyncTaskLoader:isLoadInBackgroundCanceled	()Z
    //   6: ifne +119 -> 125
    //   9: new 54	androidx/core/os/CancellationSignal
    //   12: astore_1
    //   13: aload_1
    //   14: invokespecial 145	androidx/core/os/CancellationSignal:<init>	()V
    //   17: aload_0
    //   18: aload_1
    //   19: putfield 52	androidx/loader/content/CursorLoader:mCancellationSignal	Landroidx/core/os/CancellationSignal;
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_0
    //   25: invokevirtual 149	androidx/loader/content/Loader:getContext	()Landroid/content/Context;
    //   28: invokevirtual 155	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   31: aload_0
    //   32: getfield 38	androidx/loader/content/CursorLoader:mUri	Landroid/net/Uri;
    //   35: aload_0
    //   36: getfield 40	androidx/loader/content/CursorLoader:mProjection	[Ljava/lang/String;
    //   39: aload_0
    //   40: getfield 42	androidx/loader/content/CursorLoader:mSelection	Ljava/lang/String;
    //   43: aload_0
    //   44: getfield 44	androidx/loader/content/CursorLoader:mSelectionArgs	[Ljava/lang/String;
    //   47: aload_0
    //   48: getfield 46	androidx/loader/content/CursorLoader:mSortOrder	Ljava/lang/String;
    //   51: aload_0
    //   52: getfield 52	androidx/loader/content/CursorLoader:mCancellationSignal	Landroidx/core/os/CancellationSignal;
    //   55: invokestatic 161	androidx/core/content/ContentResolverCompat:query	(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroidx/core/os/CancellationSignal;)Landroid/database/Cursor;
    //   58: astore_2
    //   59: aload_2
    //   60: ifnull +32 -> 92
    //   63: aload_2
    //   64: invokeinterface 165 1 0
    //   69: pop
    //   70: aload_2
    //   71: aload_0
    //   72: getfield 32	androidx/loader/content/CursorLoader:mObserver	Landroidx/loader/content/Loader$ForceLoadContentObserver;
    //   75: invokeinterface 169 2 0
    //   80: goto +12 -> 92
    //   83: astore_1
    //   84: aload_2
    //   85: invokeinterface 70 1 0
    //   90: aload_1
    //   91: athrow
    //   92: aload_0
    //   93: monitorenter
    //   94: aload_0
    //   95: aconst_null
    //   96: putfield 52	androidx/loader/content/CursorLoader:mCancellationSignal	Landroidx/core/os/CancellationSignal;
    //   99: aload_0
    //   100: monitorexit
    //   101: aload_2
    //   102: areturn
    //   103: astore_1
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_1
    //   107: athrow
    //   108: astore_1
    //   109: aload_0
    //   110: monitorenter
    //   111: aload_0
    //   112: aconst_null
    //   113: putfield 52	androidx/loader/content/CursorLoader:mCancellationSignal	Landroidx/core/os/CancellationSignal;
    //   116: aload_0
    //   117: monitorexit
    //   118: aload_1
    //   119: athrow
    //   120: astore_1
    //   121: aload_0
    //   122: monitorexit
    //   123: aload_1
    //   124: athrow
    //   125: new 171	androidx/core/os/OperationCanceledException
    //   128: astore_1
    //   129: aload_1
    //   130: invokespecial 172	androidx/core/os/OperationCanceledException:<init>	()V
    //   133: aload_1
    //   134: athrow
    //   135: astore_1
    //   136: aload_0
    //   137: monitorexit
    //   138: aload_1
    //   139: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	140	0	this	CursorLoader
    //   12	7	1	localCancellationSignal	CancellationSignal
    //   83	8	1	localRuntimeException	RuntimeException
    //   103	4	1	localObject1	Object
    //   108	11	1	localObject2	Object
    //   120	4	1	localObject3	Object
    //   128	6	1	localOperationCanceledException	androidx.core.os.OperationCanceledException
    //   135	4	1	localObject4	Object
    //   58	44	2	localCursor	Cursor
    // Exception table:
    //   from	to	target	type
    //   63	80	83	java/lang/RuntimeException
    //   94	101	103	finally
    //   104	106	103	finally
    //   24	59	108	finally
    //   63	80	108	finally
    //   84	92	108	finally
    //   111	118	120	finally
    //   121	123	120	finally
    //   2	24	135	finally
    //   125	135	135	finally
    //   136	138	135	finally
  }
  
  public void onCanceled(Cursor paramCursor)
  {
    if ((paramCursor != null) && (!paramCursor.isClosed())) {
      paramCursor.close();
    }
  }
  
  public void onReset()
  {
    super.onReset();
    onStopLoading();
    Cursor localCursor = mCursor;
    if ((localCursor != null) && (!localCursor.isClosed())) {
      mCursor.close();
    }
    mCursor = null;
  }
  
  public void onStartLoading()
  {
    Cursor localCursor = mCursor;
    if (localCursor != null) {
      deliverResult(localCursor);
    }
    if ((takeContentChanged()) || (mCursor == null)) {
      forceLoad();
    }
  }
  
  public void onStopLoading()
  {
    cancelLoad();
  }
  
  public void setProjection(@Nullable String[] paramArrayOfString)
  {
    mProjection = paramArrayOfString;
  }
  
  public void setSelection(@Nullable String paramString)
  {
    mSelection = paramString;
  }
  
  public void setSelectionArgs(@Nullable String[] paramArrayOfString)
  {
    mSelectionArgs = paramArrayOfString;
  }
  
  public void setSortOrder(@Nullable String paramString)
  {
    mSortOrder = paramString;
  }
  
  public void setUri(@NonNull Uri paramUri)
  {
    mUri = paramUri;
  }
}

/* Location:
 * Qualified Name:     androidx.loader.content.CursorLoader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */