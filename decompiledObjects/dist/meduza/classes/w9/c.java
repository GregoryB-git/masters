package w9;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import q0.g;
import u7.f;

public final class c
{
  public File a;
  public final f b;
  
  public c(f paramf)
  {
    b = paramf;
  }
  
  public final File a()
  {
    if (a == null) {
      try
      {
        if (a == null)
        {
          File localFile = new java/io/File;
          Object localObject2 = b;
          ((f)localObject2).a();
          localObject2 = a.getFilesDir();
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localStringBuilder.append("PersistedInstallation.");
          localStringBuilder.append(b.g());
          localStringBuilder.append(".json");
          localFile.<init>((File)localObject2, localStringBuilder.toString());
          a = localFile;
        }
      }
      finally {}
    }
    return a;
  }
  
  public final void b(a parama)
  {
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("Fid", b);
      localJSONObject.put("Status", g.c(c));
      localJSONObject.put("AuthToken", d);
      localJSONObject.put("RefreshToken", e);
      localJSONObject.put("TokenCreationEpochInSecs", g);
      localJSONObject.put("ExpiresInSecs", f);
      localJSONObject.put("FisError", h);
      parama = b;
      parama.a();
      File localFile = File.createTempFile("PersistedInstallation", "tmp", a.getFilesDir());
      parama = new java/io/FileOutputStream;
      parama.<init>(localFile);
      parama.write(localJSONObject.toString().getBytes("UTF-8"));
      parama.close();
      if (!localFile.renameTo(a()))
      {
        parama = new java/io/IOException;
        parama.<init>("unable to rename the tmpfile to PersistedInstallation");
        throw parama;
      }
    }
    catch (JSONException|IOException parama)
    {
      for (;;) {}
    }
  }
  
  /* Error */
  public final a c()
  {
    // Byte code:
    //   0: new 158	java/io/ByteArrayOutputStream
    //   3: dup
    //   4: invokespecial 159	java/io/ByteArrayOutputStream:<init>	()V
    //   7: astore_1
    //   8: sipush 16384
    //   11: newarray <illegal type>
    //   13: astore_2
    //   14: new 161	java/io/FileInputStream
    //   17: astore_3
    //   18: aload_3
    //   19: aload_0
    //   20: invokevirtual 146	w9/c:a	()Ljava/io/File;
    //   23: invokespecial 162	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   26: aload_3
    //   27: aload_2
    //   28: iconst_0
    //   29: sipush 16384
    //   32: invokevirtual 166	java/io/FileInputStream:read	([BII)I
    //   35: istore 4
    //   37: iload 4
    //   39: ifge +22 -> 61
    //   42: new 61	org/json/JSONObject
    //   45: astore_2
    //   46: aload_2
    //   47: aload_1
    //   48: invokevirtual 167	java/io/ByteArrayOutputStream:toString	()Ljava/lang/String;
    //   51: invokespecial 168	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   54: aload_3
    //   55: invokevirtual 169	java/io/FileInputStream:close	()V
    //   58: goto +39 -> 97
    //   61: aload_1
    //   62: aload_2
    //   63: iconst_0
    //   64: iload 4
    //   66: invokevirtual 172	java/io/ByteArrayOutputStream:write	([BII)V
    //   69: goto -43 -> 26
    //   72: astore_2
    //   73: aload_3
    //   74: invokevirtual 169	java/io/FileInputStream:close	()V
    //   77: goto +9 -> 86
    //   80: astore_3
    //   81: aload_2
    //   82: aload_3
    //   83: invokevirtual 178	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   86: aload_2
    //   87: athrow
    //   88: astore_2
    //   89: new 61	org/json/JSONObject
    //   92: dup
    //   93: invokespecial 62	org/json/JSONObject:<init>	()V
    //   96: astore_2
    //   97: aload_2
    //   98: ldc 64
    //   100: aconst_null
    //   101: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   104: astore_1
    //   105: aload_2
    //   106: ldc 75
    //   108: iconst_0
    //   109: invokevirtual 186	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   112: istore 4
    //   114: aload_2
    //   115: ldc 89
    //   117: aconst_null
    //   118: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   121: astore 5
    //   123: aload_2
    //   124: ldc 94
    //   126: aconst_null
    //   127: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   130: astore_3
    //   131: aload_2
    //   132: ldc 99
    //   134: lconst_0
    //   135: invokevirtual 190	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   138: lstore 6
    //   140: aload_2
    //   141: ldc 107
    //   143: lconst_0
    //   144: invokevirtual 190	org/json/JSONObject:optLong	(Ljava/lang/String;J)J
    //   147: lstore 8
    //   149: aload_2
    //   150: ldc 112
    //   152: aconst_null
    //   153: invokevirtual 182	org/json/JSONObject:optString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   156: astore_2
    //   157: getstatic 194	w9/d:a	I
    //   160: istore 10
    //   162: new 196	w9/a$a
    //   165: dup
    //   166: invokespecial 197	w9/a$a:<init>	()V
    //   169: astore 11
    //   171: aload 11
    //   173: lconst_0
    //   174: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   177: putfield 206	w9/a$a:f	Ljava/lang/Long;
    //   180: aload 11
    //   182: iconst_1
    //   183: invokevirtual 209	w9/a$a:b	(I)Lw9/a$a;
    //   186: pop
    //   187: aload 11
    //   189: lconst_0
    //   190: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   193: putfield 211	w9/a$a:e	Ljava/lang/Long;
    //   196: aload 11
    //   198: aload_1
    //   199: putfield 213	w9/a$a:a	Ljava/lang/String;
    //   202: aload 11
    //   204: iconst_5
    //   205: invokestatic 216	q0/g:d	(I)[I
    //   208: iload 4
    //   210: iaload
    //   211: invokevirtual 209	w9/a$a:b	(I)Lw9/a$a;
    //   214: pop
    //   215: aload 11
    //   217: aload 5
    //   219: putfield 218	w9/a$a:c	Ljava/lang/String;
    //   222: aload 11
    //   224: aload_3
    //   225: putfield 219	w9/a$a:d	Ljava/lang/String;
    //   228: aload 11
    //   230: lload 6
    //   232: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   235: putfield 206	w9/a$a:f	Ljava/lang/Long;
    //   238: aload 11
    //   240: lload 8
    //   242: invokestatic 203	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   245: putfield 211	w9/a$a:e	Ljava/lang/Long;
    //   248: aload 11
    //   250: aload_2
    //   251: putfield 221	w9/a$a:g	Ljava/lang/String;
    //   254: aload 11
    //   256: invokevirtual 223	w9/a$a:a	()Lw9/a;
    //   259: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	260	0	this	c
    //   7	192	1	localObject1	Object
    //   13	50	2	localObject2	Object
    //   72	15	2	localObject3	Object
    //   88	1	2	localIOException	IOException
    //   96	155	2	localObject4	Object
    //   17	57	3	localFileInputStream	java.io.FileInputStream
    //   80	3	3	localThrowable	Throwable
    //   130	95	3	str1	String
    //   35	174	4	i	int
    //   121	97	5	str2	String
    //   138	93	6	l1	long
    //   147	94	8	l2	long
    //   160	1	10	j	int
    //   169	86	11	locala	a.a
    // Exception table:
    //   from	to	target	type
    //   26	37	72	finally
    //   42	54	72	finally
    //   61	69	72	finally
    //   73	77	80	finally
    //   14	26	88	java/io/IOException
    //   14	26	88	org/json/JSONException
    //   54	58	88	java/io/IOException
    //   54	58	88	org/json/JSONException
    //   81	86	88	java/io/IOException
    //   81	86	88	org/json/JSONException
    //   86	88	88	java/io/IOException
    //   86	88	88	org/json/JSONException
  }
}

/* Location:
 * Qualified Name:     w9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */