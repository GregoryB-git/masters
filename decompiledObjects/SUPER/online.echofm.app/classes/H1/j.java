package H1;

import W5.g;
import android.text.TextUtils;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
{
  public static final j a = new j();
  
  /* Error */
  public static final File a()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 22	T1/a:d	(Ljava/lang/Object;)Z
    //   5: istore_0
    //   6: aconst_null
    //   7: astore_1
    //   8: iload_0
    //   9: ifeq +5 -> 14
    //   12: aconst_null
    //   13: areturn
    //   14: new 24	java/io/File
    //   17: astore_2
    //   18: aload_2
    //   19: invokestatic 30	x1/B:l	()Landroid/content/Context;
    //   22: invokevirtual 35	android/content/Context:getFilesDir	()Ljava/io/File;
    //   25: ldc 37
    //   27: invokespecial 40	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   30: aload_2
    //   31: invokevirtual 44	java/io/File:exists	()Z
    //   34: ifne +19 -> 53
    //   37: aload_2
    //   38: invokevirtual 47	java/io/File:mkdirs	()Z
    //   41: istore_0
    //   42: iload_0
    //   43: ifeq +12 -> 55
    //   46: goto +7 -> 53
    //   49: astore_1
    //   50: goto +7 -> 57
    //   53: aload_2
    //   54: astore_1
    //   55: aload_1
    //   56: areturn
    //   57: aload_1
    //   58: ldc 2
    //   60: invokestatic 51	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   63: aconst_null
    //   64: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   5	38	0	bool	boolean
    //   7	1	1	localObject1	Object
    //   49	1	1	localObject2	Object
    //   54	4	1	localObject3	Object
    //   17	37	2	localFile	File
    // Exception table:
    //   from	to	target	type
    //   14	42	49	finally
  }
  
  public static final Map c(File paramFile)
  {
    if (T1.a.d(j.class)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramFile, "file");
      Object localObject1;
      int i;
      Object localObject2;
      int j;
      int k;
      JSONArray localJSONArray;
      int m;
      int n;
      int i1;
      HashMap localHashMap;
      int i2;
      Object localObject3;
      int[] arrayOfInt;
      int i3;
      int i4;
      label352:
      a locala;
      label447:
      label449:
      return null;
    }
    finally
    {
      for (;;)
      {
        try
        {
          localObject1 = new java/io/FileInputStream;
          ((FileInputStream)localObject1).<init>(paramFile);
          i = ((InputStream)localObject1).available();
          localObject2 = new java/io/DataInputStream;
          ((DataInputStream)localObject2).<init>((InputStream)localObject1);
          paramFile = new byte[i];
          ((DataInputStream)localObject2).readFully(paramFile);
          ((InputStream)localObject2).close();
          if (i < 4) {
            return null;
          }
          localObject1 = ByteBuffer.wrap(paramFile, 0, 4);
          ((ByteBuffer)localObject1).order(ByteOrder.LITTLE_ENDIAN);
          j = ((ByteBuffer)localObject1).getInt();
          k = j + 4;
          if (i < k) {
            return null;
          }
          localObject2 = new java/lang/String;
          ((String)localObject2).<init>(paramFile, 4, j, b.b);
          localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>((String)localObject2);
          localJSONArray = ((JSONObject)localObject1).names();
          m = localJSONArray.length();
          localObject2 = new String[m];
          n = m - 1;
          if (n >= 0)
          {
            j = 0;
            i1 = j + 1;
            localObject2[j] = localJSONArray.getString(j);
            if (i1 <= n)
            {
              j = i1;
              continue;
              paramFile = finally;
            }
          }
        }
        catch (Exception paramFile)
        {
          paramFile = null;
          break label447;
          g.f((Object[])localObject2);
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          i1 = 0;
          j = k;
          i2 = 0;
          if (i1 >= m) {
            break;
          }
          localJSONArray = localObject2[i1];
          n = i1 + 1;
          if (localJSONArray == null)
          {
            i1 = n;
            continue;
          }
          localObject3 = ((JSONObject)localObject1).getJSONArray(localJSONArray);
          i1 = ((JSONArray)localObject3).length();
          arrayOfInt = new int[i1];
          i3 = i1 - 1;
          i1 = 1;
          k = 1;
          if (i3 >= 0)
          {
            i1 = i2;
            i2 = i1 + 1;
          }
        }
        finally
        {
          try
          {
            i4 = ((JSONArray)localObject3).getInt(i1);
            arrayOfInt[i1] = i4;
            k *= i4;
            if (i2 > i3)
            {
              i1 = k;
              break label352;
            }
            i1 = i2;
          }
          catch (Exception paramFile)
          {
            paramFile = null;
            break label447;
          }
          paramFile = finally;
          break label449;
        }
        i2 = i1 * 4;
        k = j + i2;
        if (k > i) {
          return null;
        }
        localObject3 = ByteBuffer.wrap(paramFile, j, i2);
        ((ByteBuffer)localObject3).order(ByteOrder.LITTLE_ENDIAN);
        locala = new H1/a;
        locala.<init>(arrayOfInt);
        ((ByteBuffer)localObject3).asFloatBuffer().get(locala.a(), 0, i1);
        localHashMap.put(localJSONArray, locala);
        j = k;
        i1 = n;
      }
      return localHashMap;
      return paramFile;
      T1.a.b(paramFile, j.class);
    }
  }
  
  public final String b(String paramString)
  {
    if (T1.a.d(this)) {
      return null;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "str");
      int i = paramString.length() - 1;
      int j = 0;
      int k = j;
      while (j <= i)
      {
        int m;
        if (k == 0) {
          m = j;
        } else {
          m = i;
        }
        if (Intrinsics.d(paramString.charAt(m), 32) <= 0) {
          m = 1;
        } else {
          m = 0;
        }
        if (k == 0)
        {
          if (m == 0) {
            k = 1;
          } else {
            j++;
          }
        }
        else
        {
          if (m == 0) {
            break;
          }
          i--;
        }
      }
      String str;
      label192:
      return null;
    }
    finally
    {
      break label192;
      str = paramString.subSequence(j, i + 1).toString();
      paramString = new kotlin/text/Regex;
      paramString.<init>("\\s+");
      paramString = ((Collection)paramString.c(str, 0)).toArray(new String[0]);
      if (paramString != null)
      {
        paramString = TextUtils.join(" ", (String[])paramString);
        Intrinsics.checkNotNullExpressionValue(paramString, "join(\" \", strArray)");
        return paramString;
      }
      paramString = new java/lang/NullPointerException;
      paramString.<init>("null cannot be cast to non-null type kotlin.Array<T>");
      throw paramString;
      T1.a.b(paramString, this);
    }
  }
  
  public final int[] d(String paramString, int paramInt)
  {
    if (T1.a.d(this)) {
      return null;
    }
    int[] arrayOfInt;
    for (;;)
    {
      int j;
      try
      {
        Intrinsics.checkNotNullParameter(paramString, "texts");
        arrayOfInt = new int[paramInt];
        paramString = b(paramString);
        Charset localCharset = Charset.forName("UTF-8");
        Intrinsics.checkNotNullExpressionValue(localCharset, "forName(\"UTF-8\")");
        if (paramString == null) {
          break label118;
        }
        paramString = paramString.getBytes(localCharset);
        Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).getBytes(charset)");
        if (paramInt <= 0) {
          break;
        }
        i = 0;
        j = i + 1;
        if (i < paramString.length) {
          paramString[i] &= 0xFF;
        }
      }
      finally
      {
        break label130;
      }
      arrayOfInt[i] = 0;
      if (j >= paramInt) {
        break;
      }
      int i = j;
    }
    return arrayOfInt;
    label118:
    paramString = new java/lang/NullPointerException;
    paramString.<init>("null cannot be cast to non-null type java.lang.String");
    throw paramString;
    label130:
    T1.a.b(paramString, this);
    return null;
  }
}

/* Location:
 * Qualified Name:     H1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */