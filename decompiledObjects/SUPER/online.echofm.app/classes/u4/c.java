package u4;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import s3.e;

public class c
{
  public File a;
  public final e b;
  
  public c(e parame)
  {
    b = parame;
  }
  
  public final File a()
  {
    if (a == null)
    {
      try
      {
        if (a == null)
        {
          File localFile1 = new java/io/File;
          File localFile2 = b.m().getFilesDir();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("PersistedInstallation.");
          localStringBuilder.append(b.s());
          localStringBuilder.append(".json");
          localFile1.<init>(localFile2, localStringBuilder.toString());
          a = localFile1;
        }
      }
      finally
      {
        break label91;
      }
      break label95;
      label91:
      throw ((Throwable)localObject);
    }
    label95:
    return a;
  }
  
  public d b(d paramd)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("Fid", paramd.d());
      localJSONObject.put("Status", paramd.g().ordinal());
      localJSONObject.put("AuthToken", paramd.b());
      localJSONObject.put("RefreshToken", paramd.f());
      localJSONObject.put("TokenCreationEpochInSecs", paramd.h());
      localJSONObject.put("ExpiresInSecs", paramd.c());
      localJSONObject.put("FisError", paramd.e());
      File localFile = File.createTempFile("PersistedInstallation", "tmp", b.m().getFilesDir());
      Object localObject = new java/io/FileOutputStream;
      ((FileOutputStream)localObject).<init>(localFile);
      ((FileOutputStream)localObject).write(localJSONObject.toString().getBytes("UTF-8"));
      ((FileOutputStream)localObject).close();
      if (!localFile.renameTo(a()))
      {
        localObject = new java/io/IOException;
        ((IOException)localObject).<init>("unable to rename the tmpfile to PersistedInstallation");
        throw ((Throwable)localObject);
      }
    }
    catch (JSONException|IOException localJSONException)
    {
      for (;;) {}
    }
    return paramd;
  }
  
  /* Error */
  public final JSONObject c()
  {
    // Byte code:
    //   0: new 160	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 161	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: sipush 16384
    //   11: newarray <illegal type>
    //   13: astore_2
    //   14: new 163	java/io/FileInputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_0
    //   20: invokevirtual 148	u4/c:a	()Ljava/io/File;
    //   23: invokespecial 164	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: aload_3
    //   27: aload_2
    //   28: iconst_0
    //   29: sipush 16384
    //   32: invokevirtual 168	java/io/FileInputStream:read	([BII)I
    //   35: istore 4
    //   37: iload 4
    //   39: ifge +25 -> 64
    //   42: new 62	org/json/JSONObject
    //   45: astore_2
    //   46: aload_2
    //   47: aload_1
    //   48: invokevirtual 169	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   51: invokespecial 170	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   54: aload_3
    //   55: invokevirtual 171	java/io/FileInputStream:close	()V
    //   58: aload_2
    //   59: areturn
    //   60: astore_1
    //   61: goto +14 -> 75
    //   64: aload_1
    //   65: aload_2
    //   66: iconst_0
    //   67: iload 4
    //   69: invokevirtual 174	java/io/ByteArrayOutputStream:write	([BII)V
    //   72: goto -46 -> 26
    //   75: aload_3
    //   76: invokevirtual 171	java/io/FileInputStream:close	()V
    //   79: goto +9 -> 88
    //   82: astore_3
    //   83: aload_1
    //   84: aload_3
    //   85: invokevirtual 180	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   88: aload_1
    //   89: athrow
    //   90: astore_3
    //   91: new 62	org/json/JSONObject
    //   94: dup
    //   95: invokespecial 63	org/json/JSONObject:<init>	()V
    //   98: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	99	0	this	c
    //   7	41	1	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   60	29	1	localObject1	Object
    //   13	53	2	localObject2	Object
    //   17	59	3	localFileInputStream	java.io.FileInputStream
    //   82	3	3	localThrowable	Throwable
    //   90	1	3	localIOException	IOException
    //   35	33	4	i	int
    // Exception table:
    //   from	to	target	type
    //   26	37	60	finally
    //   42	54	60	finally
    //   64	72	60	finally
    //   75	79	82	finally
    //   14	26	90	java/io/IOException
    //   14	26	90	org/json/JSONException
    //   54	58	90	java/io/IOException
    //   54	58	90	org/json/JSONException
    //   83	88	90	java/io/IOException
    //   83	88	90	org/json/JSONException
    //   88	90	90	java/io/IOException
    //   88	90	90	org/json/JSONException
  }
  
  public d d()
  {
    Object localObject = c();
    String str1 = ((JSONObject)localObject).optString("Fid", null);
    int i = ((JSONObject)localObject).optInt("Status", a.o.ordinal());
    String str2 = ((JSONObject)localObject).optString("AuthToken", null);
    String str3 = ((JSONObject)localObject).optString("RefreshToken", null);
    long l1 = ((JSONObject)localObject).optLong("TokenCreationEpochInSecs", 0L);
    long l2 = ((JSONObject)localObject).optLong("ExpiresInSecs", 0L);
    localObject = ((JSONObject)localObject).optString("FisError", null);
    return d.a().d(str1).g(a.values()[i]).b(str2).f(str3).h(l1).c(l2).e((String)localObject).a();
  }
  
  public static enum a
  {
    static
    {
      a locala1 = new a("ATTEMPT_MIGRATION", 0);
      o = locala1;
      a locala2 = new a("NOT_GENERATED", 1);
      p = locala2;
      a locala3 = new a("UNREGISTERED", 2);
      q = locala3;
      a locala4 = new a("REGISTERED", 3);
      r = locala4;
      a locala5 = new a("REGISTER_ERROR", 4);
      s = locala5;
      t = new a[] { locala1, locala2, locala3, locala4, locala5 };
    }
  }
}

/* Location:
 * Qualified Name:     u4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */