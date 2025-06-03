package i0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import android.text.TextUtils;
import g0.M;
import g0.a;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

public final class w
  extends b
{
  public final Context e;
  public k f;
  public AssetFileDescriptor g;
  public InputStream h;
  public long i;
  public boolean j;
  
  public w(Context paramContext)
  {
    super(false);
    e = paramContext.getApplicationContext();
  }
  
  @Deprecated
  public static Uri buildRawResourceUri(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("rawresource:///");
    localStringBuilder.append(paramInt);
    return Uri.parse(localStringBuilder.toString());
  }
  
  public static AssetFileDescriptor u(Context paramContext, k paramk)
  {
    Uri localUri = a.normalizeScheme();
    if (TextUtils.equals("rawresource", localUri.getScheme()))
    {
      paramContext = paramContext.getResources();
      paramk = localUri.getPathSegments();
      if (paramk.size() == 1) {
        paramk = (String)paramk.get(0);
      }
    }
    for (;;)
    {
      int k = v(paramk);
      break label257;
      paramContext = new StringBuilder();
      paramContext.append("rawresource:// URI must have exactly one path element, found ");
      paramContext.append(paramk.size());
      throw new a(paramContext.toString());
      if (TextUtils.equals("android.resource", localUri.getScheme()))
      {
        String str = (String)a.e(localUri.getPath());
        paramk = str;
        if (str.startsWith("/")) {
          paramk = str.substring(1);
        }
        if (TextUtils.isEmpty(localUri.getHost())) {
          str = paramContext.getPackageName();
        } else {
          str = localUri.getHost();
        }
        if (str.equals(paramContext.getPackageName())) {
          paramContext = paramContext.getResources();
        }
        try
        {
          paramContext = paramContext.getPackageManager().getResourcesForApplication(str);
          if (!paramk.matches("\\d+"))
          {
            StringBuilder localStringBuilder = new StringBuilder();
            localStringBuilder.append(str);
            localStringBuilder.append(":");
            localStringBuilder.append(paramk);
            k = paramContext.getIdentifier(localStringBuilder.toString(), "raw", null);
            if (k != 0) {
              try
              {
                label257:
                paramContext = paramContext.openRawResourceFd(k);
                if (paramContext != null) {
                  return paramContext;
                }
                paramContext = new StringBuilder();
                paramContext.append("Resource is compressed: ");
                paramContext.append(localUri);
                throw new a(paramContext.toString(), null, 2000);
              }
              catch (Resources.NotFoundException paramContext)
              {
                throw new a(null, paramContext, 2005);
              }
            }
            throw new a("Resource not found.", null, 2005);
          }
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          throw new a("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", paramContext, 2005);
        }
      }
    }
    paramContext = new StringBuilder();
    paramContext.append("Unsupported URI scheme (");
    paramContext.append(localUri.getScheme());
    paramContext.append("). Only ");
    paramContext.append("android.resource");
    paramContext.append(" is supported.");
    throw new a(paramContext.toString(), null, 1004);
  }
  
  public static int v(String paramString)
  {
    try
    {
      int k = Integer.parseInt(paramString);
      return k;
    }
    catch (NumberFormatException paramString)
    {
      throw new a("Resource identifier must be an integer.", null, 1004);
    }
  }
  
  /* Error */
  public void close()
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 210	i0/w:f	Li0/k;
    //   5: aload_0
    //   6: getfield 212	i0/w:h	Ljava/io/InputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +18 -> 29
    //   14: aload_1
    //   15: invokevirtual 216	java/io/InputStream:close	()V
    //   18: goto +11 -> 29
    //   21: astore_2
    //   22: goto +111 -> 133
    //   25: astore_1
    //   26: goto +92 -> 118
    //   29: aload_0
    //   30: aconst_null
    //   31: putfield 212	i0/w:h	Ljava/io/InputStream;
    //   34: aload_0
    //   35: getfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   38: astore_1
    //   39: aload_1
    //   40: ifnull +18 -> 58
    //   43: aload_1
    //   44: invokevirtual 221	android/content/res/AssetFileDescriptor:close	()V
    //   47: goto +11 -> 58
    //   50: astore_1
    //   51: goto +44 -> 95
    //   54: astore_2
    //   55: goto +25 -> 80
    //   58: aload_0
    //   59: aconst_null
    //   60: putfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   63: aload_0
    //   64: getfield 223	i0/w:j	Z
    //   67: ifeq +12 -> 79
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield 223	i0/w:j	Z
    //   75: aload_0
    //   76: invokevirtual 226	i0/b:r	()V
    //   79: return
    //   80: new 6	i0/w$a
    //   83: astore_1
    //   84: aload_1
    //   85: aconst_null
    //   86: aload_2
    //   87: sipush 2000
    //   90: invokespecial 186	i0/w$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;I)V
    //   93: aload_1
    //   94: athrow
    //   95: aload_0
    //   96: aconst_null
    //   97: putfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   100: aload_0
    //   101: getfield 223	i0/w:j	Z
    //   104: ifeq +12 -> 116
    //   107: aload_0
    //   108: iconst_0
    //   109: putfield 223	i0/w:j	Z
    //   112: aload_0
    //   113: invokevirtual 226	i0/b:r	()V
    //   116: aload_1
    //   117: athrow
    //   118: new 6	i0/w$a
    //   121: astore_2
    //   122: aload_2
    //   123: aconst_null
    //   124: aload_1
    //   125: sipush 2000
    //   128: invokespecial 186	i0/w$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;I)V
    //   131: aload_2
    //   132: athrow
    //   133: aload_0
    //   134: aconst_null
    //   135: putfield 212	i0/w:h	Ljava/io/InputStream;
    //   138: aload_0
    //   139: getfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   142: astore_1
    //   143: aload_1
    //   144: ifnull +18 -> 162
    //   147: aload_1
    //   148: invokevirtual 221	android/content/res/AssetFileDescriptor:close	()V
    //   151: goto +11 -> 162
    //   154: astore_1
    //   155: goto +45 -> 200
    //   158: astore_2
    //   159: goto +26 -> 185
    //   162: aload_0
    //   163: aconst_null
    //   164: putfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   167: aload_0
    //   168: getfield 223	i0/w:j	Z
    //   171: ifeq +12 -> 183
    //   174: aload_0
    //   175: iconst_0
    //   176: putfield 223	i0/w:j	Z
    //   179: aload_0
    //   180: invokevirtual 226	i0/b:r	()V
    //   183: aload_2
    //   184: athrow
    //   185: new 6	i0/w$a
    //   188: astore_1
    //   189: aload_1
    //   190: aconst_null
    //   191: aload_2
    //   192: sipush 2000
    //   195: invokespecial 186	i0/w$a:<init>	(Ljava/lang/String;Ljava/lang/Throwable;I)V
    //   198: aload_1
    //   199: athrow
    //   200: aload_0
    //   201: aconst_null
    //   202: putfield 218	i0/w:g	Landroid/content/res/AssetFileDescriptor;
    //   205: aload_0
    //   206: getfield 223	i0/w:j	Z
    //   209: ifeq +12 -> 221
    //   212: aload_0
    //   213: iconst_0
    //   214: putfield 223	i0/w:j	Z
    //   217: aload_0
    //   218: invokevirtual 226	i0/b:r	()V
    //   221: aload_1
    //   222: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	223	0	this	w
    //   9	6	1	localInputStream	InputStream
    //   25	1	1	localIOException1	IOException
    //   38	6	1	localAssetFileDescriptor	AssetFileDescriptor
    //   50	1	1	localObject1	Object
    //   83	65	1	localObject2	Object
    //   154	1	1	localObject3	Object
    //   188	34	1	locala1	a
    //   21	1	2	localObject4	Object
    //   54	33	2	localIOException2	IOException
    //   121	11	2	locala2	a
    //   158	34	2	localIOException3	IOException
    // Exception table:
    //   from	to	target	type
    //   5	10	21	finally
    //   14	18	21	finally
    //   118	133	21	finally
    //   5	10	25	java/io/IOException
    //   14	18	25	java/io/IOException
    //   34	39	50	finally
    //   43	47	50	finally
    //   80	95	50	finally
    //   34	39	54	java/io/IOException
    //   43	47	54	java/io/IOException
    //   138	143	154	finally
    //   147	151	154	finally
    //   185	200	154	finally
    //   138	143	158	java/io/IOException
    //   147	151	158	java/io/IOException
  }
  
  public long e(k paramk)
  {
    f = paramk;
    s(paramk);
    Object localObject = u(e, paramk);
    g = ((AssetFileDescriptor)localObject);
    long l1 = ((AssetFileDescriptor)localObject).getLength();
    localObject = new FileInputStream(g.getFileDescriptor());
    h = ((InputStream)localObject);
    boolean bool = l1 < -1L;
    if (bool) {
      try
      {
        if (g > l1)
        {
          paramk = new i0/w$a;
          paramk.<init>(null, null, 2008);
          throw paramk;
        }
      }
      catch (IOException paramk)
      {
        break label319;
      }
      catch (a paramk) {}
    }
    long l2 = g.getStartOffset();
    l2 = ((FileInputStream)localObject).skip(g + l2) - l2;
    if (l2 == g)
    {
      if (!bool)
      {
        localObject = ((FileInputStream)localObject).getChannel();
        if (((FileChannel)localObject).size() == 0L)
        {
          i = -1L;
        }
        else
        {
          l1 = ((FileChannel)localObject).size() - ((FileChannel)localObject).position();
          i = l1;
          if (l1 < 0L)
          {
            paramk = new i0/w$a;
            paramk.<init>(null, null, 2008);
            throw paramk;
          }
        }
      }
      else
      {
        l1 -= l2;
        i = l1;
        if (l1 < 0L) {
          break label291;
        }
      }
      l1 = h;
      if (l1 != -1L)
      {
        l2 = i;
        if (l2 != -1L) {
          l1 = Math.min(l2, l1);
        }
        i = l1;
      }
      j = true;
      t(paramk);
      l1 = h;
      if (l1 == -1L) {
        l1 = i;
      }
      return l1;
      label291:
      paramk = new i0/h;
      paramk.<init>(2008);
      throw paramk;
    }
    paramk = new i0/w$a;
    paramk.<init>(null, null, 2008);
    throw paramk;
    label319:
    throw new a(null, paramk, 2000);
    throw paramk;
  }
  
  public Uri k()
  {
    Object localObject = f;
    if (localObject != null) {
      localObject = a;
    } else {
      localObject = null;
    }
    return (Uri)localObject;
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l1 = i;
    if (l1 == 0L) {
      return -1;
    }
    long l2;
    if (l1 != -1L) {
      l2 = paramInt2;
    }
    try
    {
      paramInt2 = (int)Math.min(l1, l2);
      paramInt1 = ((InputStream)M.i(h)).read(paramArrayOfByte, paramInt1, paramInt2);
      if (paramInt1 == -1)
      {
        if (i == -1L) {
          return -1;
        }
        throw new a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
      }
      l1 = i;
      if (l1 != -1L) {
        i = (l1 - paramInt1);
      }
      q(paramInt1);
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new a(null, paramArrayOfByte, 2000);
    }
  }
  
  public static class a
    extends h
  {
    public a(String paramString)
    {
      super(null, 2000);
    }
    
    public a(String paramString, Throwable paramThrowable, int paramInt)
    {
      super(paramThrowable, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     i0.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */