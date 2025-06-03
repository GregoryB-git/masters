package androidx.startup;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class InitializationProvider
  extends ContentProvider
{
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  public final String getType(Uri paramUri)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  /* Error */
  public final boolean onCreate()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 30	android/content/ContentProvider:getContext	()Landroid/content/Context;
    //   4: astore_1
    //   5: aload_1
    //   6: ifnull +98 -> 104
    //   9: aload_1
    //   10: invokevirtual 35	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   13: ifnull +89 -> 102
    //   16: aload_1
    //   17: invokestatic 41	w1/a:c	(Landroid/content/Context;)Lw1/a;
    //   20: astore_1
    //   21: aload_1
    //   22: invokevirtual 47	java/lang/Object:getClass	()Ljava/lang/Class;
    //   25: pop
    //   26: ldc 49
    //   28: invokestatic 54	z1/a:c	(Ljava/lang/String;)Ljava/lang/String;
    //   31: invokestatic 59	android/os/Trace:beginSection	(Ljava/lang/String;)V
    //   34: new 61	android/content/ComponentName
    //   37: astore_2
    //   38: aload_2
    //   39: aload_1
    //   40: getfield 64	w1/a:c	Landroid/content/Context;
    //   43: invokevirtual 68	android/content/Context:getPackageName	()Ljava/lang/String;
    //   46: ldc 2
    //   48: invokevirtual 73	java/lang/Class:getName	()Ljava/lang/String;
    //   51: invokespecial 76	android/content/ComponentName:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload_1
    //   55: aload_1
    //   56: getfield 64	w1/a:c	Landroid/content/Context;
    //   59: invokevirtual 80	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   62: aload_2
    //   63: sipush 128
    //   66: invokevirtual 86	android/content/pm/PackageManager:getProviderInfo	(Landroid/content/ComponentName;I)Landroid/content/pm/ProviderInfo;
    //   69: getfield 92	android/content/pm/ProviderInfo:metaData	Landroid/os/Bundle;
    //   72: invokevirtual 96	w1/a:a	(Landroid/os/Bundle;)V
    //   75: invokestatic 99	android/os/Trace:endSection	()V
    //   78: goto +24 -> 102
    //   81: astore_1
    //   82: goto +15 -> 97
    //   85: astore_2
    //   86: new 101	w1/c
    //   89: astore_1
    //   90: aload_1
    //   91: aload_2
    //   92: invokespecial 104	w1/c:<init>	(Ljava/lang/Throwable;)V
    //   95: aload_1
    //   96: athrow
    //   97: invokestatic 99	android/os/Trace:endSection	()V
    //   100: aload_1
    //   101: athrow
    //   102: iconst_1
    //   103: ireturn
    //   104: new 101	w1/c
    //   107: dup
    //   108: iconst_0
    //   109: invokespecial 107	w1/c:<init>	(I)V
    //   112: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	113	0	this	InitializationProvider
    //   4	52	1	localObject1	Object
    //   81	1	1	localObject2	Object
    //   89	12	1	localc	w1.c
    //   37	26	2	localComponentName	android.content.ComponentName
    //   85	7	2	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    // Exception table:
    //   from	to	target	type
    //   26	75	81	finally
    //   86	97	81	finally
    //   26	75	85	android/content/pm/PackageManager$NameNotFoundException
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    throw new IllegalStateException("Not allowed.");
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new IllegalStateException("Not allowed.");
  }
}

/* Location:
 * Qualified Name:     androidx.startup.InitializationProvider
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */