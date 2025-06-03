package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
class TreeDocumentFile
  extends DocumentFile
{
  private Context mContext;
  private Uri mUri;
  
  public TreeDocumentFile(@Nullable DocumentFile paramDocumentFile, Context paramContext, Uri paramUri)
  {
    super(paramDocumentFile);
    mContext = paramContext;
    mUri = paramUri;
  }
  
  private static void closeQuietly(@Nullable AutoCloseable paramAutoCloseable)
  {
    if (paramAutoCloseable != null) {}
    try
    {
      try
      {
        paramAutoCloseable.close();
      }
      catch (RuntimeException paramAutoCloseable)
      {
        throw paramAutoCloseable;
      }
      return;
    }
    catch (Exception paramAutoCloseable)
    {
      for (;;) {}
    }
  }
  
  @Nullable
  private static Uri createFile(Context paramContext, Uri paramUri, String paramString1, String paramString2)
  {
    try
    {
      paramContext = DocumentsContract.createDocument(paramContext.getContentResolver(), paramUri, paramString1, paramString2);
      return paramContext;
    }
    catch (Exception paramContext) {}
    return null;
  }
  
  public boolean canRead()
  {
    return DocumentsContractApi19.canRead(mContext, mUri);
  }
  
  public boolean canWrite()
  {
    return DocumentsContractApi19.canWrite(mContext, mUri);
  }
  
  @Nullable
  public DocumentFile createDirectory(String paramString)
  {
    paramString = createFile(mContext, mUri, "vnd.android.document/directory", paramString);
    if (paramString != null) {
      paramString = new TreeDocumentFile(this, mContext, paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  @Nullable
  public DocumentFile createFile(String paramString1, String paramString2)
  {
    paramString1 = createFile(mContext, mUri, paramString1, paramString2);
    if (paramString1 != null) {
      paramString1 = new TreeDocumentFile(this, mContext, paramString1);
    } else {
      paramString1 = null;
    }
    return paramString1;
  }
  
  public boolean delete()
  {
    try
    {
      boolean bool = DocumentsContract.deleteDocument(mContext.getContentResolver(), mUri);
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public boolean exists()
  {
    return DocumentsContractApi19.exists(mContext, mUri);
  }
  
  @Nullable
  public String getName()
  {
    return DocumentsContractApi19.getName(mContext, mUri);
  }
  
  @Nullable
  public String getType()
  {
    return DocumentsContractApi19.getType(mContext, mUri);
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public boolean isDirectory()
  {
    return DocumentsContractApi19.isDirectory(mContext, mUri);
  }
  
  public boolean isFile()
  {
    return DocumentsContractApi19.isFile(mContext, mUri);
  }
  
  public boolean isVirtual()
  {
    return DocumentsContractApi19.isVirtual(mContext, mUri);
  }
  
  public long lastModified()
  {
    return DocumentsContractApi19.lastModified(mContext, mUri);
  }
  
  public long length()
  {
    return DocumentsContractApi19.length(mContext, mUri);
  }
  
  /* Error */
  public DocumentFile[] listFiles()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	androidx/documentfile/provider/TreeDocumentFile:mContext	Landroid/content/Context;
    //   4: invokevirtual 43	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   7: astore_1
    //   8: aload_0
    //   9: getfield 21	androidx/documentfile/provider/TreeDocumentFile:mUri	Landroid/net/Uri;
    //   12: astore_2
    //   13: aload_2
    //   14: aload_2
    //   15: invokestatic 110	android/provider/DocumentsContract:getDocumentId	(Landroid/net/Uri;)Ljava/lang/String;
    //   18: invokestatic 114	android/provider/DocumentsContract:buildChildDocumentsUriUsingTree	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   21: astore_3
    //   22: new 116	java/util/ArrayList
    //   25: dup
    //   26: invokespecial 118	java/util/ArrayList:<init>	()V
    //   29: astore 4
    //   31: iconst_0
    //   32: istore 5
    //   34: aconst_null
    //   35: astore_2
    //   36: aconst_null
    //   37: astore 6
    //   39: aload_1
    //   40: aload_3
    //   41: iconst_1
    //   42: anewarray 120	java/lang/String
    //   45: dup
    //   46: iconst_0
    //   47: ldc 122
    //   49: aastore
    //   50: aconst_null
    //   51: aconst_null
    //   52: aconst_null
    //   53: invokevirtual 128	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   56: astore_1
    //   57: aload_1
    //   58: astore_3
    //   59: aload_1
    //   60: astore 6
    //   62: aload_1
    //   63: astore_2
    //   64: aload_1
    //   65: invokeinterface 133 1 0
    //   70: ifeq +38 -> 108
    //   73: aload_1
    //   74: astore 6
    //   76: aload_1
    //   77: astore_2
    //   78: aload_1
    //   79: iconst_0
    //   80: invokeinterface 137 2 0
    //   85: astore_3
    //   86: aload_1
    //   87: astore 6
    //   89: aload_1
    //   90: astore_2
    //   91: aload 4
    //   93: aload_0
    //   94: getfield 21	androidx/documentfile/provider/TreeDocumentFile:mUri	Landroid/net/Uri;
    //   97: aload_3
    //   98: invokestatic 140	android/provider/DocumentsContract:buildDocumentUriUsingTree	(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;
    //   101: invokevirtual 144	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   104: pop
    //   105: goto -48 -> 57
    //   108: aload_3
    //   109: invokestatic 146	androidx/documentfile/provider/TreeDocumentFile:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   112: goto +59 -> 171
    //   115: astore_2
    //   116: goto +117 -> 233
    //   119: astore_3
    //   120: aload_2
    //   121: astore 6
    //   123: new 148	java/lang/StringBuilder
    //   126: astore_1
    //   127: aload_2
    //   128: astore 6
    //   130: aload_1
    //   131: invokespecial 149	java/lang/StringBuilder:<init>	()V
    //   134: aload_2
    //   135: astore 6
    //   137: aload_1
    //   138: ldc -105
    //   140: invokevirtual 155	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: pop
    //   144: aload_2
    //   145: astore 6
    //   147: aload_1
    //   148: aload_3
    //   149: invokevirtual 158	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   152: pop
    //   153: aload_2
    //   154: astore 6
    //   156: ldc -96
    //   158: aload_1
    //   159: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   162: invokestatic 169	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   165: pop
    //   166: aload_2
    //   167: astore_3
    //   168: goto -60 -> 108
    //   171: aload 4
    //   173: aload 4
    //   175: invokevirtual 173	java/util/ArrayList:size	()I
    //   178: anewarray 175	android/net/Uri
    //   181: invokevirtual 179	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   184: checkcast 181	[Landroid/net/Uri;
    //   187: astore 6
    //   189: aload 6
    //   191: arraylength
    //   192: anewarray 4	androidx/documentfile/provider/DocumentFile
    //   195: astore_2
    //   196: iload 5
    //   198: aload 6
    //   200: arraylength
    //   201: if_icmpge +30 -> 231
    //   204: aload_2
    //   205: iload 5
    //   207: new 2	androidx/documentfile/provider/TreeDocumentFile
    //   210: dup
    //   211: aload_0
    //   212: aload_0
    //   213: getfield 19	androidx/documentfile/provider/TreeDocumentFile:mContext	Landroid/content/Context;
    //   216: aload 6
    //   218: iload 5
    //   220: aaload
    //   221: invokespecial 68	androidx/documentfile/provider/TreeDocumentFile:<init>	(Landroidx/documentfile/provider/DocumentFile;Landroid/content/Context;Landroid/net/Uri;)V
    //   224: aastore
    //   225: iinc 5 1
    //   228: goto -32 -> 196
    //   231: aload_2
    //   232: areturn
    //   233: aload 6
    //   235: invokestatic 146	androidx/documentfile/provider/TreeDocumentFile:closeQuietly	(Ljava/lang/AutoCloseable;)V
    //   238: aload_2
    //   239: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	240	0	this	TreeDocumentFile
    //   7	152	1	localObject1	Object
    //   12	79	2	localObject2	Object
    //   115	52	2	localObject3	Object
    //   195	44	2	arrayOfDocumentFile	DocumentFile[]
    //   21	88	3	localObject4	Object
    //   119	30	3	localException	Exception
    //   167	1	3	localObject5	Object
    //   29	145	4	localArrayList	java.util.ArrayList
    //   32	194	5	i	int
    //   37	197	6	localObject6	Object
    // Exception table:
    //   from	to	target	type
    //   39	57	115	finally
    //   64	73	115	finally
    //   78	86	115	finally
    //   91	105	115	finally
    //   123	127	115	finally
    //   130	134	115	finally
    //   137	144	115	finally
    //   147	153	115	finally
    //   156	166	115	finally
    //   39	57	119	java/lang/Exception
    //   64	73	119	java/lang/Exception
    //   78	86	119	java/lang/Exception
    //   91	105	119	java/lang/Exception
  }
  
  public boolean renameTo(String paramString)
  {
    try
    {
      paramString = DocumentsContract.renameDocument(mContext.getContentResolver(), mUri, paramString);
      if (paramString != null)
      {
        mUri = paramString;
        return true;
      }
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.documentfile.provider.TreeDocumentFile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */