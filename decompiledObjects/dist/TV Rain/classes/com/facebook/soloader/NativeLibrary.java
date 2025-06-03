package com.facebook.soloader;

import java.util.List;
import javax.annotation.Nullable;

public abstract class NativeLibrary
{
  private static final String TAG = "com.facebook.soloader.NativeLibrary";
  private boolean mLibrariesLoaded = false;
  @Nullable
  private List<String> mLibraryNames;
  @Nullable
  private volatile UnsatisfiedLinkError mLinkError = null;
  private Boolean mLoadLibraries = Boolean.TRUE;
  private final Object mLock = new Object();
  
  public NativeLibrary(List<String> paramList)
  {
    mLibraryNames = paramList;
  }
  
  public void ensureLoaded()
    throws UnsatisfiedLinkError
  {
    if (loadLibraries()) {
      return;
    }
    throw mLinkError;
  }
  
  @Nullable
  public UnsatisfiedLinkError getError()
  {
    return mLinkError;
  }
  
  public void initialNativeCheck()
    throws UnsatisfiedLinkError
  {}
  
  /* Error */
  @Nullable
  public boolean loadLibraries()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	com/facebook/soloader/NativeLibrary:mLock	Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield 34	com/facebook/soloader/NativeLibrary:mLoadLibraries	Ljava/lang/Boolean;
    //   11: invokevirtual 58	java/lang/Boolean:booleanValue	()Z
    //   14: ifne +12 -> 26
    //   17: aload_0
    //   18: getfield 36	com/facebook/soloader/NativeLibrary:mLibrariesLoaded	Z
    //   21: istore_2
    //   22: aload_1
    //   23: monitorexit
    //   24: iload_2
    //   25: ireturn
    //   26: aload_0
    //   27: getfield 40	com/facebook/soloader/NativeLibrary:mLibraryNames	Ljava/util/List;
    //   30: astore_3
    //   31: aload_3
    //   32: ifnull +34 -> 66
    //   35: aload_3
    //   36: invokeinterface 64 1 0
    //   41: astore_3
    //   42: aload_3
    //   43: invokeinterface 69 1 0
    //   48: ifeq +18 -> 66
    //   51: aload_3
    //   52: invokeinterface 73 1 0
    //   57: checkcast 75	java/lang/String
    //   60: invokestatic 81	com/facebook/soloader/SoLoader:loadLibrary	(Ljava/lang/String;)V
    //   63: goto -21 -> 42
    //   66: aload_0
    //   67: invokevirtual 83	com/facebook/soloader/NativeLibrary:initialNativeCheck	()V
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield 36	com/facebook/soloader/NativeLibrary:mLibrariesLoaded	Z
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield 40	com/facebook/soloader/NativeLibrary:mLibraryNames	Ljava/util/List;
    //   80: goto +70 -> 150
    //   83: astore 4
    //   85: getstatic 85	com/facebook/soloader/NativeLibrary:TAG	Ljava/lang/String;
    //   88: ldc 87
    //   90: aload 4
    //   92: invokestatic 93	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   95: pop
    //   96: new 46	java/lang/UnsatisfiedLinkError
    //   99: astore_3
    //   100: aload_3
    //   101: ldc 95
    //   103: invokespecial 97	java/lang/UnsatisfiedLinkError:<init>	(Ljava/lang/String;)V
    //   106: aload_0
    //   107: aload_3
    //   108: putfield 38	com/facebook/soloader/NativeLibrary:mLinkError	Ljava/lang/UnsatisfiedLinkError;
    //   111: aload_0
    //   112: getfield 38	com/facebook/soloader/NativeLibrary:mLinkError	Ljava/lang/UnsatisfiedLinkError;
    //   115: aload 4
    //   117: invokevirtual 103	java/lang/Throwable:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   120: pop
    //   121: aload_0
    //   122: iconst_0
    //   123: putfield 36	com/facebook/soloader/NativeLibrary:mLibrariesLoaded	Z
    //   126: goto +24 -> 150
    //   129: astore_3
    //   130: getstatic 85	com/facebook/soloader/NativeLibrary:TAG	Ljava/lang/String;
    //   133: ldc 105
    //   135: aload_3
    //   136: invokestatic 93	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   139: pop
    //   140: aload_0
    //   141: aload_3
    //   142: putfield 38	com/facebook/soloader/NativeLibrary:mLinkError	Ljava/lang/UnsatisfiedLinkError;
    //   145: aload_0
    //   146: iconst_0
    //   147: putfield 36	com/facebook/soloader/NativeLibrary:mLibrariesLoaded	Z
    //   150: aload_0
    //   151: getstatic 108	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   154: putfield 34	com/facebook/soloader/NativeLibrary:mLoadLibraries	Ljava/lang/Boolean;
    //   157: aload_0
    //   158: getfield 36	com/facebook/soloader/NativeLibrary:mLibrariesLoaded	Z
    //   161: istore_2
    //   162: aload_1
    //   163: monitorexit
    //   164: iload_2
    //   165: ireturn
    //   166: astore_3
    //   167: aload_1
    //   168: monitorexit
    //   169: aload_3
    //   170: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	171	0	this	NativeLibrary
    //   4	164	1	localObject1	Object
    //   21	144	2	bool	boolean
    //   30	78	3	localObject2	Object
    //   129	13	3	localUnsatisfiedLinkError	UnsatisfiedLinkError
    //   166	4	3	localObject3	Object
    //   83	33	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   26	31	83	finally
    //   35	42	83	finally
    //   42	63	83	finally
    //   66	80	83	finally
    //   26	31	129	java/lang/UnsatisfiedLinkError
    //   35	42	129	java/lang/UnsatisfiedLinkError
    //   42	63	129	java/lang/UnsatisfiedLinkError
    //   66	80	129	java/lang/UnsatisfiedLinkError
    //   7	24	166	finally
    //   85	126	166	finally
    //   130	150	166	finally
    //   150	164	166	finally
    //   167	169	166	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.soloader.NativeLibrary
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */