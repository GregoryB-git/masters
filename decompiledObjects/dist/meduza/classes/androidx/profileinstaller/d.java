package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.os.Build.VERSION;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import s.e;

public final class d
{
  public static final e<c> a = new e();
  public static final Object b = new Object();
  public static c c = null;
  
  public static c a(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    c localc = new c();
    c = localc;
    a.p(localc);
    return c;
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    if ((!paramBoolean) && (c != null)) {
      return;
    }
    Object localObject1 = b;
    if (!paramBoolean) {}
    try
    {
      if (c != null) {
        return;
      }
      int i = Build.VERSION.SDK_INT;
      int j = 0;
      if ((i >= 28) && (i != 30))
      {
        Object localObject2 = new java/io/File;
        Object localObject3 = new java/io/File;
        ((File)localObject3).<init>("/data/misc/profiles/ref/", paramContext.getPackageName());
        ((File)localObject2).<init>((File)localObject3, "primary.prof");
        long l1 = ((File)localObject2).length();
        boolean bool1;
        if ((((File)localObject2).exists()) && (l1 > 0L)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
        localObject3 = new java/io/File;
        localObject2 = new java/io/File;
        ((File)localObject2).<init>("/data/misc/profiles/cur/0/", paramContext.getPackageName());
        ((File)localObject3).<init>((File)localObject2, "primary.prof");
        long l2 = ((File)localObject3).length();
        boolean bool2 = ((File)localObject3).exists();
        if ((bool2) && (l2 > 0L)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        try
        {
          localObject3 = paramContext.getApplicationContext().getPackageManager();
          if (i >= 33) {
            localObject3 = a.a((PackageManager)localObject3, paramContext);
          } else {
            localObject3 = ((PackageManager)localObject3).getPackageInfo(paramContext.getPackageName(), 0);
          }
          long l3 = lastUpdateTime;
          localObject3 = new java/io/File;
          ((File)localObject3).<init>(paramContext.getFilesDir(), "profileInstalled");
          paramContext = null;
          boolean bool3 = ((File)localObject3).exists();
          if (bool3) {
            try
            {
              paramContext = b.a((File)localObject3);
            }
            catch (IOException paramContext)
            {
              a(131072, bool1, bool2);
              return;
            }
          }
          if ((paramContext != null) && (c == l3))
          {
            i = b;
            if (i != 2)
            {
              j = i;
              break label328;
            }
          }
          if (bool1) {
            j = 1;
          } else if (bool2) {
            j = 2;
          }
          label328:
          i = j;
          if (paramBoolean)
          {
            i = j;
            if (bool2)
            {
              i = j;
              if (j != 1) {
                i = 2;
              }
            }
          }
          j = i;
          if (paramContext != null)
          {
            j = i;
            if (b == 2)
            {
              j = i;
              if (i == 1)
              {
                j = i;
                if (l1 < d) {
                  j = 3;
                }
              }
            }
          }
          localObject2 = new androidx/profileinstaller/d$b;
          ((b)localObject2).<init>(1, j, l3, l2);
          if (paramContext != null)
          {
            paramBoolean = paramContext.equals(localObject2);
            i = j;
            if (paramBoolean) {}
          }
          else
          {
            try
            {
              ((b)localObject2).b((File)localObject3);
              i = j;
            }
            catch (IOException paramContext)
            {
              i = 196608;
            }
          }
          a(i, bool1, bool2);
          return;
        }
        catch (PackageManager.NameNotFoundException paramContext)
        {
          a(65536, bool1, bool2);
          return;
        }
      }
      a(262144, false, false);
      return;
    }
    finally {}
  }
  
  public static final class a
  {
    public static PackageInfo a(PackageManager paramPackageManager, Context paramContext)
    {
      return paramPackageManager.getPackageInfo(paramContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
  }
  
  public static final class b
  {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    
    public b(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
    {
      a = paramInt1;
      b = paramInt2;
      c = paramLong1;
      d = paramLong2;
    }
    
    /* Error */
    public static b a(File paramFile)
    {
      // Byte code:
      //   0: new 29	java/io/DataInputStream
      //   3: dup
      //   4: new 31	java/io/FileInputStream
      //   7: dup
      //   8: aload_0
      //   9: invokespecial 34	java/io/FileInputStream:<init>	(Ljava/io/File;)V
      //   12: invokespecial 37	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
      //   15: astore_1
      //   16: new 2	androidx/profileinstaller/d$b
      //   19: dup
      //   20: aload_1
      //   21: invokevirtual 41	java/io/DataInputStream:readInt	()I
      //   24: aload_1
      //   25: invokevirtual 41	java/io/DataInputStream:readInt	()I
      //   28: aload_1
      //   29: invokevirtual 45	java/io/DataInputStream:readLong	()J
      //   32: aload_1
      //   33: invokevirtual 45	java/io/DataInputStream:readLong	()J
      //   36: invokespecial 47	androidx/profileinstaller/d$b:<init>	(IIJJ)V
      //   39: astore_0
      //   40: aload_1
      //   41: invokevirtual 52	java/io/InputStream:close	()V
      //   44: aload_0
      //   45: areturn
      //   46: astore_0
      //   47: aload_1
      //   48: invokevirtual 52	java/io/InputStream:close	()V
      //   51: goto +9 -> 60
      //   54: astore_1
      //   55: aload_0
      //   56: aload_1
      //   57: invokevirtual 58	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   60: aload_0
      //   61: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	62	0	paramFile	File
      //   15	33	1	localDataInputStream	java.io.DataInputStream
      //   54	3	1	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   16	40	46	finally
      //   47	51	54	finally
    }
    
    /* Error */
    public final void b(File paramFile)
    {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual 64	java/io/File:delete	()Z
      //   4: pop
      //   5: new 66	java/io/DataOutputStream
      //   8: dup
      //   9: new 68	java/io/FileOutputStream
      //   12: dup
      //   13: aload_1
      //   14: invokespecial 69	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
      //   17: invokespecial 72	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
      //   20: astore_2
      //   21: aload_2
      //   22: aload_0
      //   23: getfield 19	androidx/profileinstaller/d$b:a	I
      //   26: invokevirtual 76	java/io/DataOutputStream:writeInt	(I)V
      //   29: aload_2
      //   30: aload_0
      //   31: getfield 21	androidx/profileinstaller/d$b:b	I
      //   34: invokevirtual 76	java/io/DataOutputStream:writeInt	(I)V
      //   37: aload_2
      //   38: aload_0
      //   39: getfield 23	androidx/profileinstaller/d$b:c	J
      //   42: invokevirtual 80	java/io/DataOutputStream:writeLong	(J)V
      //   45: aload_2
      //   46: aload_0
      //   47: getfield 25	androidx/profileinstaller/d$b:d	J
      //   50: invokevirtual 80	java/io/DataOutputStream:writeLong	(J)V
      //   53: aload_2
      //   54: invokevirtual 83	java/io/OutputStream:close	()V
      //   57: return
      //   58: astore_1
      //   59: aload_2
      //   60: invokevirtual 83	java/io/OutputStream:close	()V
      //   63: goto +9 -> 72
      //   66: astore_2
      //   67: aload_1
      //   68: aload_2
      //   69: invokevirtual 58	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   72: aload_1
      //   73: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	74	0	this	b
      //   0	74	1	paramFile	File
      //   20	40	2	localDataOutputStream	java.io.DataOutputStream
      //   66	3	2	localThrowable	Throwable
      // Exception table:
      //   from	to	target	type
      //   21	53	58	finally
      //   59	63	66	finally
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && ((paramObject instanceof b)))
      {
        paramObject = (b)paramObject;
        if ((b != b) || (c != c) || (a != a) || (d != d)) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Objects.hash(new Object[] { Integer.valueOf(b), Long.valueOf(c), Integer.valueOf(a), Long.valueOf(d) });
    }
  }
  
  public static final class c {}
}

/* Location:
 * Qualified Name:     androidx.profileinstaller.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */