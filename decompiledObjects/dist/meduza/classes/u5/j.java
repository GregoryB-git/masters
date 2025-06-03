package u5;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import f;
import g;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import v5.a.a;
import v5.e0;
import y3.b;
import y3.c;
import y3.e;

public final class j
{
  public final HashMap<String, i> a = new HashMap();
  public final SparseArray<String> b = new SparseArray();
  public final SparseBooleanArray c = new SparseBooleanArray();
  public final SparseBooleanArray d = new SparseBooleanArray();
  public c e;
  public c f;
  
  public j(c paramc, File paramFile)
  {
    paramc = new a(paramc);
    paramFile = new b(new File(paramFile, "cached_content_index.exi"));
    e = paramc;
    f = paramFile;
  }
  
  public static m a(DataInputStream paramDataInputStream)
  {
    int i = paramDataInputStream.readInt();
    HashMap localHashMap = new HashMap();
    int j = 0;
    while (j < i)
    {
      String str = paramDataInputStream.readUTF();
      int k = paramDataInputStream.readInt();
      if (k >= 0)
      {
        int m = Math.min(k, 10485760);
        byte[] arrayOfByte = e0.f;
        int i1;
        for (int n = 0; n != k; n = i1)
        {
          i1 = n + m;
          arrayOfByte = Arrays.copyOf(arrayOfByte, i1);
          paramDataInputStream.readFully(arrayOfByte, n, m);
          m = Math.min(k - i1, 10485760);
        }
        localHashMap.put(str, arrayOfByte);
        j++;
      }
      else
      {
        throw new IOException(f.h("Invalid value size: ", k));
      }
    }
    return new m(localHashMap);
  }
  
  public static void b(m paramm, DataOutputStream paramDataOutputStream)
  {
    paramm = b.entrySet();
    paramDataOutputStream.writeInt(paramm.size());
    paramm = paramm.iterator();
    while (paramm.hasNext())
    {
      Object localObject = (Map.Entry)paramm.next();
      paramDataOutputStream.writeUTF((String)((Map.Entry)localObject).getKey());
      localObject = (byte[])((Map.Entry)localObject).getValue();
      paramDataOutputStream.writeInt(localObject.length);
      paramDataOutputStream.write((byte[])localObject);
    }
  }
  
  public final i c(String paramString)
  {
    return (i)a.get(paramString);
  }
  
  public final i d(String paramString)
  {
    i locali = (i)a.get(paramString);
    Object localObject = locali;
    if (locali == null)
    {
      localObject = b;
      int i = ((SparseArray)localObject).size();
      int j = 0;
      int k;
      if (i == 0) {
        k = 0;
      } else {
        k = ((SparseArray)localObject).keyAt(i - 1) + 1;
      }
      int m = k;
      if (k < 0)
      {
        for (k = j; (k < i) && (k == ((SparseArray)localObject).keyAt(k)); k++) {}
        m = k;
      }
      localObject = new i(m, paramString, m.c);
      a.put(paramString, localObject);
      b.put(m, paramString);
      d.put(m, true);
      e.f((i)localObject);
    }
    return (i)localObject;
  }
  
  public final void e(long paramLong)
  {
    e.e(paramLong);
    c localc = f;
    if (localc != null) {
      localc.e(paramLong);
    }
    if (!e.c())
    {
      localc = f;
      if ((localc != null) && (localc.c()))
      {
        f.g(a, b);
        e.a(a);
        break label106;
      }
    }
    e.g(a, b);
    label106:
    localc = f;
    if (localc != null)
    {
      localc.h();
      f = null;
    }
  }
  
  public final void f(String paramString)
  {
    i locali = (i)a.get(paramString);
    if ((locali != null) && (c.isEmpty()) && (d.isEmpty()))
    {
      a.remove(paramString);
      int i = a;
      boolean bool = d.get(i);
      e.b(locali, bool);
      paramString = b;
      if (bool)
      {
        paramString.remove(i);
        d.delete(i);
      }
      else
      {
        paramString.put(i, null);
        c.put(i, true);
      }
    }
  }
  
  public final void g()
  {
    e.d(a);
    int i = c.size();
    for (int j = 0; j < i; j++) {
      b.remove(c.keyAt(j));
    }
    c.clear();
    d.clear();
  }
  
  public static final class a
    implements j.c
  {
    public static final String[] e = { "id", "key", "metadata" };
    public final b a;
    public final SparseArray<i> b;
    public String c;
    public String d;
    
    public a(c paramc)
    {
      a = paramc;
      b = new SparseArray();
    }
    
    /* Error */
    public final void a(HashMap<String, i> paramHashMap)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 37	u5/j$a:a	Ly3/b;
      //   4: invokeinterface 51 1 0
      //   9: astore_2
      //   10: aload_2
      //   11: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
      //   14: aload_0
      //   15: aload_2
      //   16: invokevirtual 60	u5/j$a:j	(Landroid/database/sqlite/SQLiteDatabase;)V
      //   19: aload_1
      //   20: invokevirtual 66	java/util/HashMap:values	()Ljava/util/Collection;
      //   23: invokeinterface 72 1 0
      //   28: astore_1
      //   29: aload_1
      //   30: invokeinterface 78 1 0
      //   35: ifeq +20 -> 55
      //   38: aload_0
      //   39: aload_2
      //   40: aload_1
      //   41: invokeinterface 82 1 0
      //   46: checkcast 84	u5/i
      //   49: invokevirtual 88	u5/j$a:i	(Landroid/database/sqlite/SQLiteDatabase;Lu5/i;)V
      //   52: goto -23 -> 29
      //   55: aload_2
      //   56: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
      //   59: aload_0
      //   60: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   63: invokevirtual 94	android/util/SparseArray:clear	()V
      //   66: aload_2
      //   67: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   70: return
      //   71: astore_1
      //   72: aload_2
      //   73: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   76: aload_1
      //   77: athrow
      //   78: astore_1
      //   79: new 99	y3/a
      //   82: dup
      //   83: aload_1
      //   84: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
      //   87: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	88	0	this	a
      //   0	88	1	paramHashMap	HashMap<String, i>
      //   9	64	2	localSQLiteDatabase	SQLiteDatabase
      // Exception table:
      //   from	to	target	type
      //   14	29	71	finally
      //   29	52	71	finally
      //   55	66	71	finally
      //   0	14	78	android/database/SQLException
      //   66	70	78	android/database/SQLException
      //   72	78	78	android/database/SQLException
    }
    
    public final void b(i parami, boolean paramBoolean)
    {
      if (paramBoolean) {
        b.delete(a);
      } else {
        b.put(a, null);
      }
    }
    
    public final boolean c()
    {
      try
      {
        SQLiteDatabase localSQLiteDatabase = a.getReadableDatabase();
        String str = c;
        str.getClass();
        boolean bool = true;
        int i = e.a(localSQLiteDatabase, 1, str);
        if (i == -1) {
          bool = false;
        }
        return bool;
      }
      catch (SQLException localSQLException)
      {
        throw new y3.a(localSQLException);
      }
    }
    
    /* Error */
    public final void d(HashMap<String, i> paramHashMap)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   4: invokevirtual 134	android/util/SparseArray:size	()I
      //   7: ifne +4 -> 11
      //   10: return
      //   11: aload_0
      //   12: getfield 37	u5/j$a:a	Ly3/b;
      //   15: invokeinterface 51 1 0
      //   20: astore_1
      //   21: aload_1
      //   22: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
      //   25: iconst_0
      //   26: istore_2
      //   27: iload_2
      //   28: aload_0
      //   29: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   32: invokevirtual 134	android/util/SparseArray:size	()I
      //   35: if_icmpge +74 -> 109
      //   38: aload_0
      //   39: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   42: iload_2
      //   43: invokevirtual 138	android/util/SparseArray:valueAt	(I)Ljava/lang/Object;
      //   46: checkcast 84	u5/i
      //   49: astore_3
      //   50: aload_3
      //   51: ifnonnull +46 -> 97
      //   54: aload_0
      //   55: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   58: iload_2
      //   59: invokevirtual 142	android/util/SparseArray:keyAt	(I)I
      //   62: istore 4
      //   64: aload_0
      //   65: getfield 144	u5/j$a:d	Ljava/lang/String;
      //   68: astore_3
      //   69: aload_3
      //   70: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
      //   73: pop
      //   74: aload_1
      //   75: aload_3
      //   76: ldc -110
      //   78: iconst_1
      //   79: anewarray 22	java/lang/String
      //   82: dup
      //   83: iconst_0
      //   84: iload 4
      //   86: invokestatic 152	java/lang/Integer:toString	(I)Ljava/lang/String;
      //   89: aastore
      //   90: invokevirtual 155	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
      //   93: pop
      //   94: goto +9 -> 103
      //   97: aload_0
      //   98: aload_1
      //   99: aload_3
      //   100: invokevirtual 88	u5/j$a:i	(Landroid/database/sqlite/SQLiteDatabase;Lu5/i;)V
      //   103: iinc 2 1
      //   106: goto -79 -> 27
      //   109: aload_1
      //   110: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
      //   113: aload_0
      //   114: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   117: invokevirtual 94	android/util/SparseArray:clear	()V
      //   120: aload_1
      //   121: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   124: return
      //   125: astore_3
      //   126: aload_1
      //   127: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   130: aload_3
      //   131: athrow
      //   132: astore_1
      //   133: new 99	y3/a
      //   136: dup
      //   137: aload_1
      //   138: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
      //   141: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	142	0	this	a
      //   0	142	1	paramHashMap	HashMap<String, i>
      //   26	78	2	i	int
      //   49	51	3	localObject1	Object
      //   125	6	3	localObject2	Object
      //   62	23	4	j	int
      // Exception table:
      //   from	to	target	type
      //   27	50	125	finally
      //   54	94	125	finally
      //   97	103	125	finally
      //   109	120	125	finally
      //   11	25	132	android/database/SQLException
      //   120	124	132	android/database/SQLException
      //   126	132	132	android/database/SQLException
    }
    
    public final void e(long paramLong)
    {
      String str = Long.toHexString(paramLong);
      c = str;
      d = g.d("ExoPlayerCacheIndex", str);
    }
    
    public final void f(i parami)
    {
      b.put(a, parami);
    }
    
    /* Error */
    public final void g(HashMap<String, i> paramHashMap, SparseArray<String> paramSparseArray)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 42	u5/j$a:b	Landroid/util/SparseArray;
      //   4: invokevirtual 134	android/util/SparseArray:size	()I
      //   7: ifne +8 -> 15
      //   10: iconst_1
      //   11: istore_3
      //   12: goto +5 -> 17
      //   15: iconst_0
      //   16: istore_3
      //   17: iload_3
      //   18: invokestatic 180	x6/b:H	(Z)V
      //   21: aload_0
      //   22: getfield 37	u5/j$a:a	Ly3/b;
      //   25: invokeinterface 119 1 0
      //   30: astore 4
      //   32: aload_0
      //   33: getfield 121	u5/j$a:c	Ljava/lang/String;
      //   36: astore 5
      //   38: aload 5
      //   40: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
      //   43: pop
      //   44: aload 4
      //   46: iconst_1
      //   47: aload 5
      //   49: invokestatic 130	y3/e:a	(Landroid/database/sqlite/SQLiteDatabase;ILjava/lang/String;)I
      //   52: iconst_1
      //   53: if_icmpeq +48 -> 101
      //   56: aload_0
      //   57: getfield 37	u5/j$a:a	Ly3/b;
      //   60: invokeinterface 51 1 0
      //   65: astore 5
      //   67: aload 5
      //   69: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
      //   72: aload_0
      //   73: aload 5
      //   75: invokevirtual 60	u5/j$a:j	(Landroid/database/sqlite/SQLiteDatabase;)V
      //   78: aload 5
      //   80: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
      //   83: aload 5
      //   85: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   88: goto +13 -> 101
      //   91: astore 4
      //   93: aload 5
      //   95: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   98: aload 4
      //   100: athrow
      //   101: aload_0
      //   102: getfield 37	u5/j$a:a	Ly3/b;
      //   105: invokeinterface 119 1 0
      //   110: astore 5
      //   112: aload_0
      //   113: getfield 144	u5/j$a:d	Ljava/lang/String;
      //   116: astore 4
      //   118: aload 4
      //   120: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
      //   123: pop
      //   124: aload 5
      //   126: aload 4
      //   128: getstatic 30	u5/j$a:e	[Ljava/lang/String;
      //   131: aconst_null
      //   132: aconst_null
      //   133: aconst_null
      //   134: aconst_null
      //   135: aconst_null
      //   136: invokevirtual 184	android/database/sqlite/SQLiteDatabase:query	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
      //   139: astore 5
      //   141: aload 5
      //   143: invokeinterface 189 1 0
      //   148: ifeq +106 -> 254
      //   151: aload 5
      //   153: iconst_0
      //   154: invokeinterface 192 2 0
      //   159: istore 6
      //   161: aload 5
      //   163: iconst_1
      //   164: invokeinterface 195 2 0
      //   169: astore 4
      //   171: aload 4
      //   173: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
      //   176: pop
      //   177: aload 5
      //   179: iconst_2
      //   180: invokeinterface 199 2 0
      //   185: astore 7
      //   187: new 201	java/io/ByteArrayInputStream
      //   190: astore 8
      //   192: aload 8
      //   194: aload 7
      //   196: invokespecial 204	java/io/ByteArrayInputStream:<init>	([B)V
      //   199: new 206	java/io/DataInputStream
      //   202: astore 7
      //   204: aload 7
      //   206: aload 8
      //   208: invokespecial 209	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
      //   211: aload 7
      //   213: invokestatic 212	u5/j:a	(Ljava/io/DataInputStream;)Lu5/m;
      //   216: astore 7
      //   218: new 84	u5/i
      //   221: astore 8
      //   223: aload 8
      //   225: iload 6
      //   227: aload 4
      //   229: aload 7
      //   231: invokespecial 215	u5/i:<init>	(ILjava/lang/String;Lu5/m;)V
      //   234: aload_1
      //   235: aload 4
      //   237: aload 8
      //   239: invokevirtual 218	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   242: pop
      //   243: aload_2
      //   244: iload 6
      //   246: aload 4
      //   248: invokevirtual 116	android/util/SparseArray:put	(ILjava/lang/Object;)V
      //   251: goto -110 -> 141
      //   254: aload 5
      //   256: invokeinterface 221 1 0
      //   261: return
      //   262: astore 4
      //   264: aload 5
      //   266: ifnull +22 -> 288
      //   269: aload 5
      //   271: invokeinterface 221 1 0
      //   276: goto +12 -> 288
      //   279: astore 5
      //   281: aload 4
      //   283: aload 5
      //   285: invokevirtual 227	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
      //   288: aload 4
      //   290: athrow
      //   291: astore 5
      //   293: aload_1
      //   294: invokevirtual 228	java/util/HashMap:clear	()V
      //   297: aload_2
      //   298: invokevirtual 94	android/util/SparseArray:clear	()V
      //   301: new 99	y3/a
      //   304: dup
      //   305: aload 5
      //   307: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
      //   310: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	311	0	this	a
      //   0	311	1	paramHashMap	HashMap<String, i>
      //   0	311	2	paramSparseArray	SparseArray<String>
      //   11	7	3	bool	boolean
      //   30	15	4	localSQLiteDatabase	SQLiteDatabase
      //   91	8	4	localObject1	Object
      //   116	131	4	str	String
      //   262	27	4	localObject2	Object
      //   36	234	5	localObject3	Object
      //   279	5	5	localThrowable	Throwable
      //   291	15	5	localSQLiteException	android.database.sqlite.SQLiteException
      //   159	86	6	i	int
      //   185	45	7	localObject4	Object
      //   190	48	8	localObject5	Object
      // Exception table:
      //   from	to	target	type
      //   72	83	91	finally
      //   141	251	262	finally
      //   269	276	279	finally
      //   21	72	291	android/database/sqlite/SQLiteException
      //   83	88	291	android/database/sqlite/SQLiteException
      //   93	101	291	android/database/sqlite/SQLiteException
      //   101	141	291	android/database/sqlite/SQLiteException
      //   254	261	291	android/database/sqlite/SQLiteException
      //   281	288	291	android/database/sqlite/SQLiteException
      //   288	291	291	android/database/sqlite/SQLiteException
    }
    
    /* Error */
    public final void h()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 37	u5/j$a:a	Ly3/b;
      //   4: astore_1
      //   5: aload_0
      //   6: getfield 121	u5/j$a:c	Ljava/lang/String;
      //   9: astore_2
      //   10: aload_2
      //   11: invokevirtual 125	java/lang/Object:getClass	()Ljava/lang/Class;
      //   14: pop
      //   15: new 232	java/lang/StringBuilder
      //   18: astore_3
      //   19: aload_3
      //   20: invokespecial 233	java/lang/StringBuilder:<init>	()V
      //   23: aload_3
      //   24: ldc -92
      //   26: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   29: pop
      //   30: aload_3
      //   31: aload_2
      //   32: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   35: pop
      //   36: aload_3
      //   37: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   40: astore_3
      //   41: aload_1
      //   42: invokeinterface 51 1 0
      //   47: astore_1
      //   48: aload_1
      //   49: invokevirtual 56	android/database/sqlite/SQLiteDatabase:beginTransactionNonExclusive	()V
      //   52: getstatic 241	y3/e:a	I
      //   55: istore 4
      //   57: getstatic 244	v5/e0:a	I
      //   60: istore 4
      //   62: aload_1
      //   63: ldc -10
      //   65: ldc -8
      //   67: iconst_1
      //   68: anewarray 22	java/lang/String
      //   71: dup
      //   72: iconst_0
      //   73: ldc -6
      //   75: aastore
      //   76: invokestatic 256	android/database/DatabaseUtils:queryNumEntries	(Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)J
      //   79: lconst_0
      //   80: lcmp
      //   81: ifle +9 -> 90
      //   84: iconst_1
      //   85: istore 4
      //   87: goto +6 -> 93
      //   90: iconst_0
      //   91: istore 4
      //   93: iload 4
      //   95: ifne +6 -> 101
      //   98: goto +28 -> 126
      //   101: aload_1
      //   102: ldc -6
      //   104: ldc_w 258
      //   107: iconst_2
      //   108: anewarray 22	java/lang/String
      //   111: dup
      //   112: iconst_0
      //   113: iconst_1
      //   114: invokestatic 152	java/lang/Integer:toString	(I)Ljava/lang/String;
      //   117: aastore
      //   118: dup
      //   119: iconst_1
      //   120: aload_2
      //   121: aastore
      //   122: invokevirtual 155	android/database/sqlite/SQLiteDatabase:delete	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
      //   125: pop
      //   126: new 232	java/lang/StringBuilder
      //   129: astore_2
      //   130: aload_2
      //   131: invokespecial 233	java/lang/StringBuilder:<init>	()V
      //   134: aload_2
      //   135: ldc_w 260
      //   138: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   141: pop
      //   142: aload_2
      //   143: aload_3
      //   144: invokevirtual 237	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   147: pop
      //   148: aload_1
      //   149: aload_2
      //   150: invokevirtual 240	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   153: invokevirtual 264	android/database/sqlite/SQLiteDatabase:execSQL	(Ljava/lang/String;)V
      //   156: aload_1
      //   157: invokevirtual 91	android/database/sqlite/SQLiteDatabase:setTransactionSuccessful	()V
      //   160: aload_1
      //   161: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   164: return
      //   165: astore_2
      //   166: goto +15 -> 181
      //   169: astore_3
      //   170: new 99	y3/a
      //   173: astore_2
      //   174: aload_2
      //   175: aload_3
      //   176: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
      //   179: aload_2
      //   180: athrow
      //   181: aload_1
      //   182: invokevirtual 97	android/database/sqlite/SQLiteDatabase:endTransaction	()V
      //   185: aload_2
      //   186: athrow
      //   187: astore_1
      //   188: new 99	y3/a
      //   191: dup
      //   192: aload_1
      //   193: invokespecial 102	y3/a:<init>	(Landroid/database/SQLException;)V
      //   196: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	197	0	this	a
      //   4	178	1	localObject1	Object
      //   187	6	1	localSQLException1	SQLException
      //   9	141	2	localObject2	Object
      //   165	1	2	localObject3	Object
      //   173	13	2	locala	y3.a
      //   18	126	3	localObject4	Object
      //   169	7	3	localSQLException2	SQLException
      //   55	39	4	i	int
      // Exception table:
      //   from	to	target	type
      //   52	57	165	finally
      //   57	84	165	finally
      //   101	126	165	finally
      //   126	160	165	finally
      //   170	181	165	finally
      //   57	84	169	android/database/SQLException
      //   101	126	169	android/database/SQLException
      //   15	52	187	android/database/SQLException
      //   160	164	187	android/database/SQLException
      //   181	187	187	android/database/SQLException
    }
    
    public final void i(SQLiteDatabase paramSQLiteDatabase, i parami)
    {
      Object localObject = new ByteArrayOutputStream();
      j.b(e, new DataOutputStream((OutputStream)localObject));
      byte[] arrayOfByte = ((ByteArrayOutputStream)localObject).toByteArray();
      localObject = new ContentValues();
      ((ContentValues)localObject).put("id", Integer.valueOf(a));
      ((ContentValues)localObject).put("key", b);
      ((ContentValues)localObject).put("metadata", arrayOfByte);
      parami = d;
      parami.getClass();
      paramSQLiteDatabase.replaceOrThrow(parami, null, (ContentValues)localObject);
    }
    
    public final void j(SQLiteDatabase paramSQLiteDatabase)
    {
      Object localObject = c;
      localObject.getClass();
      e.b(paramSQLiteDatabase, 1, (String)localObject);
      String str = d;
      str.getClass();
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("DROP TABLE IF EXISTS ");
      ((StringBuilder)localObject).append(str);
      paramSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("CREATE TABLE ");
      ((StringBuilder)localObject).append(d);
      ((StringBuilder)localObject).append(" ");
      ((StringBuilder)localObject).append("(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
      paramSQLiteDatabase.execSQL(((StringBuilder)localObject).toString());
    }
  }
  
  public static final class b
    implements j.c
  {
    public final boolean a = false;
    public final Cipher b = null;
    public final SecretKeySpec c = null;
    public final SecureRandom d = null;
    public final v5.a e;
    public boolean f;
    public o g;
    
    public b(File paramFile)
    {
      e = new v5.a(paramFile);
    }
    
    public static int i(i parami, int paramInt)
    {
      int i = a;
      i = b.hashCode() + i * 31;
      if (paramInt < 2)
      {
        long l = f.d(e);
        paramInt = i * 31 + (int)(l ^ l >>> 32);
      }
      else
      {
        paramInt = i * 31 + e.hashCode();
      }
      return paramInt;
    }
    
    public static i j(int paramInt, DataInputStream paramDataInputStream)
    {
      int i = paramDataInputStream.readInt();
      String str = paramDataInputStream.readUTF();
      if (paramInt < 2)
      {
        long l = paramDataInputStream.readLong();
        paramDataInputStream = new l();
        Long localLong = Long.valueOf(l);
        HashMap localHashMap = a;
        localLong.getClass();
        localHashMap.put("exo_len", localLong);
        b.remove("exo_len");
        paramDataInputStream = m.c.a(paramDataInputStream);
      }
      else
      {
        paramDataInputStream = j.a(paramDataInputStream);
      }
      return new i(i, str, paramDataInputStream);
    }
    
    public final void a(HashMap<String, i> paramHashMap)
    {
      try
      {
        Object localObject1 = e.b();
        Object localObject2 = g;
        if (localObject2 == null)
        {
          localObject2 = new u5/o;
          ((o)localObject2).<init>((a.a)localObject1);
          g = ((o)localObject2);
        }
        else
        {
          ((o)localObject2).f((OutputStream)localObject1);
        }
        o localo = g;
        Object localObject3 = new java/io/DataOutputStream;
        ((DataOutputStream)localObject3).<init>(localo);
        localObject1 = localObject3;
        try
        {
          ((DataOutputStream)localObject3).writeInt(2);
          localObject1 = localObject3;
          if (a) {
            i = 1;
          } else {
            i = 0;
          }
          localObject1 = localObject3;
          ((DataOutputStream)localObject3).writeInt(i);
          localObject2 = localObject3;
          localObject1 = localObject3;
          if (a)
          {
            localObject1 = localObject3;
            localObject2 = new byte[16];
            localObject1 = localObject3;
            Object localObject4 = d;
            localObject1 = localObject3;
            i = e0.a;
            localObject1 = localObject3;
            ((SecureRandom)localObject4).nextBytes((byte[])localObject2);
            localObject1 = localObject3;
            ((OutputStream)localObject3).write((byte[])localObject2);
            localObject1 = localObject3;
            localObject4 = new javax/crypto/spec/IvParameterSpec;
            localObject1 = localObject3;
            ((IvParameterSpec)localObject4).<init>((byte[])localObject2);
            localObject1 = localObject3;
            try
            {
              b.init(1, c, (AlgorithmParameterSpec)localObject4);
              localObject1 = localObject3;
              ((DataOutputStream)localObject3).flush();
              localObject1 = localObject3;
              localObject2 = new java/io/DataOutputStream;
              localObject1 = localObject3;
              localObject4 = new javax/crypto/CipherOutputStream;
              localObject1 = localObject3;
              ((CipherOutputStream)localObject4).<init>(localo, b);
              localObject1 = localObject3;
              ((DataOutputStream)localObject2).<init>((OutputStream)localObject4);
            }
            catch (InvalidAlgorithmParameterException paramHashMap) {}catch (InvalidKeyException paramHashMap) {}
            localObject1 = localObject3;
            localObject2 = new java/lang/IllegalStateException;
            localObject1 = localObject3;
            ((IllegalStateException)localObject2).<init>(paramHashMap);
            localObject1 = localObject3;
            throw ((Throwable)localObject2);
          }
          localObject1 = localObject2;
          ((DataOutputStream)localObject2).writeInt(paramHashMap.size());
          localObject1 = localObject2;
          localObject3 = paramHashMap.values().iterator();
          int i = 0;
          for (;;)
          {
            localObject1 = localObject2;
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            localObject1 = localObject2;
            paramHashMap = (i)((Iterator)localObject3).next();
            localObject1 = localObject2;
            ((DataOutputStream)localObject2).writeInt(a);
            localObject1 = localObject2;
            ((DataOutputStream)localObject2).writeUTF(b);
            localObject1 = localObject2;
            j.b(e, (DataOutputStream)localObject2);
            localObject1 = localObject2;
            i += i(paramHashMap, 2);
          }
          localObject1 = localObject2;
          ((DataOutputStream)localObject2).writeInt(i);
          localObject1 = localObject2;
          paramHashMap = e;
          localObject1 = localObject2;
          paramHashMap.getClass();
          localObject1 = localObject2;
          ((OutputStream)localObject2).close();
          localObject1 = localObject2;
          b.delete();
          i = e0.a;
          f = false;
          return;
        }
        finally {}
        e0.g((Closeable)localObject1);
      }
      finally
      {
        localObject1 = null;
      }
      throw paramHashMap;
    }
    
    public final void b(i parami, boolean paramBoolean)
    {
      f = true;
    }
    
    public final boolean c()
    {
      v5.a locala = e;
      boolean bool;
      if ((!a.exists()) && (!b.exists())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final void d(HashMap<String, i> paramHashMap)
    {
      if (!f) {
        return;
      }
      a(paramHashMap);
    }
    
    public final void e(long paramLong) {}
    
    public final void f(i parami)
    {
      f = true;
    }
    
    /* Error */
    public final void g(HashMap<String, i> paramHashMap, SparseArray<String> paramSparseArray)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 234	u5/j$b:f	Z
      //   4: istore_3
      //   5: iconst_1
      //   6: istore 4
      //   8: iload_3
      //   9: iconst_1
      //   10: ixor
      //   11: invokestatic 258	x6/b:H	(Z)V
      //   14: aload_0
      //   15: getfield 40	u5/j$b:e	Lv5/a;
      //   18: astore 5
      //   20: aload 5
      //   22: getfield 242	v5/a:a	Ljava/io/File;
      //   25: invokevirtual 245	java/io/File:exists	()Z
      //   28: ifne +23 -> 51
      //   31: aload 5
      //   33: getfield 227	v5/a:b	Ljava/io/File;
      //   36: invokevirtual 245	java/io/File:exists	()Z
      //   39: ifeq +6 -> 45
      //   42: goto +9 -> 51
      //   45: iconst_0
      //   46: istore 6
      //   48: goto +6 -> 54
      //   51: iconst_1
      //   52: istore 6
      //   54: iload 6
      //   56: ifne +10 -> 66
      //   59: iload 4
      //   61: istore 6
      //   63: goto +621 -> 684
      //   66: aconst_null
      //   67: astore 7
      //   69: aconst_null
      //   70: astore 5
      //   72: new 260	java/io/BufferedInputStream
      //   75: astore 8
      //   77: aload 8
      //   79: aload_0
      //   80: getfield 40	u5/j$b:e	Lv5/a;
      //   83: invokevirtual 263	v5/a:a	()Ljava/io/FileInputStream;
      //   86: invokespecial 266	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
      //   89: new 71	java/io/DataInputStream
      //   92: astore 9
      //   94: aload 9
      //   96: aload 8
      //   98: invokespecial 267	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
      //   101: aload 9
      //   103: astore 7
      //   105: aload 9
      //   107: astore 10
      //   109: aload 9
      //   111: invokevirtual 74	java/io/DataInputStream:readInt	()I
      //   114: istore 11
      //   116: aload 9
      //   118: astore 7
      //   120: iload 11
      //   122: iflt +511 -> 633
      //   125: iload 11
      //   127: iconst_2
      //   128: if_icmple +10 -> 138
      //   131: aload 9
      //   133: astore 7
      //   135: goto +498 -> 633
      //   138: aload 9
      //   140: astore 7
      //   142: aload 9
      //   144: astore 10
      //   146: aload 9
      //   148: invokevirtual 74	java/io/DataInputStream:readInt	()I
      //   151: iconst_1
      //   152: iand
      //   153: ifeq +250 -> 403
      //   156: aload 9
      //   158: astore 7
      //   160: aload 9
      //   162: astore 10
      //   164: aload_0
      //   165: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
      //   168: ifnonnull +10 -> 178
      //   171: aload 9
      //   173: astore 7
      //   175: goto +458 -> 633
      //   178: aload 9
      //   180: astore 7
      //   182: aload 9
      //   184: astore 10
      //   186: bipush 16
      //   188: newarray <illegal type>
      //   190: astore 12
      //   192: aload 9
      //   194: astore 7
      //   196: aload 9
      //   198: astore 10
      //   200: aload 9
      //   202: aload 12
      //   204: invokevirtual 270	java/io/DataInputStream:readFully	([B)V
      //   207: aload 9
      //   209: astore 7
      //   211: aload 9
      //   213: astore 10
      //   215: new 168	javax/crypto/spec/IvParameterSpec
      //   218: astore 5
      //   220: aload 9
      //   222: astore 7
      //   224: aload 9
      //   226: astore 10
      //   228: aload 5
      //   230: aload 12
      //   232: invokespecial 170	javax/crypto/spec/IvParameterSpec:<init>	([B)V
      //   235: aload 9
      //   237: astore 7
      //   239: aload 9
      //   241: astore 10
      //   243: aload_0
      //   244: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
      //   247: astore 13
      //   249: aload 9
      //   251: astore 7
      //   253: aload 9
      //   255: astore 10
      //   257: aload_0
      //   258: getfield 32	u5/j$b:c	Ljavax/crypto/spec/SecretKeySpec;
      //   261: astore 12
      //   263: aload 9
      //   265: astore 7
      //   267: aload 9
      //   269: astore 10
      //   271: getstatic 155	v5/e0:a	I
      //   274: istore 6
      //   276: aload 9
      //   278: astore 7
      //   280: aload 9
      //   282: astore 10
      //   284: aload 13
      //   286: iconst_2
      //   287: aload 12
      //   289: aload 5
      //   291: invokevirtual 176	javax/crypto/Cipher:init	(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
      //   294: aload 9
      //   296: astore 7
      //   298: aload 9
      //   300: astore 10
      //   302: new 71	java/io/DataInputStream
      //   305: astore 5
      //   307: aload 9
      //   309: astore 7
      //   311: aload 9
      //   313: astore 10
      //   315: new 272	javax/crypto/CipherInputStream
      //   318: astore 12
      //   320: aload 9
      //   322: astore 7
      //   324: aload 9
      //   326: astore 10
      //   328: aload 12
      //   330: aload 8
      //   332: aload_0
      //   333: getfield 30	u5/j$b:b	Ljavax/crypto/Cipher;
      //   336: invokespecial 275	javax/crypto/CipherInputStream:<init>	(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
      //   339: aload 9
      //   341: astore 7
      //   343: aload 9
      //   345: astore 10
      //   347: aload 5
      //   349: aload 12
      //   351: invokespecial 267	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
      //   354: goto +85 -> 439
      //   357: astore 5
      //   359: goto +5 -> 364
      //   362: astore 5
      //   364: aload 9
      //   366: astore 7
      //   368: aload 9
      //   370: astore 10
      //   372: new 186	java/lang/IllegalStateException
      //   375: astore 8
      //   377: aload 9
      //   379: astore 7
      //   381: aload 9
      //   383: astore 10
      //   385: aload 8
      //   387: aload 5
      //   389: invokespecial 189	java/lang/IllegalStateException:<init>	(Ljava/lang/Throwable;)V
      //   392: aload 9
      //   394: astore 7
      //   396: aload 9
      //   398: astore 10
      //   400: aload 8
      //   402: athrow
      //   403: aload 9
      //   405: astore 5
      //   407: aload 9
      //   409: astore 7
      //   411: aload 9
      //   413: astore 10
      //   415: aload_0
      //   416: getfield 28	u5/j$b:a	Z
      //   419: ifeq +20 -> 439
      //   422: aload 9
      //   424: astore 7
      //   426: aload 9
      //   428: astore 10
      //   430: aload_0
      //   431: iconst_1
      //   432: putfield 234	u5/j$b:f	Z
      //   435: aload 9
      //   437: astore 5
      //   439: aload 5
      //   441: astore 7
      //   443: aload 5
      //   445: astore 10
      //   447: aload 5
      //   449: invokevirtual 74	java/io/DataInputStream:readInt	()I
      //   452: istore 14
      //   454: iconst_0
      //   455: istore 15
      //   457: iload 15
      //   459: istore 6
      //   461: iload 15
      //   463: iload 14
      //   465: if_icmpge +88 -> 553
      //   468: aload 5
      //   470: astore 7
      //   472: aload 5
      //   474: astore 10
      //   476: iload 11
      //   478: aload 5
      //   480: invokestatic 277	u5/j$b:j	(ILjava/io/DataInputStream;)Lu5/i;
      //   483: astore 9
      //   485: aload 5
      //   487: astore 7
      //   489: aload 5
      //   491: astore 10
      //   493: aload_1
      //   494: aload 9
      //   496: getfield 51	u5/i:b	Ljava/lang/String;
      //   499: aload 9
      //   501: invokevirtual 106	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      //   504: pop
      //   505: aload 5
      //   507: astore 7
      //   509: aload 5
      //   511: astore 10
      //   513: aload_2
      //   514: aload 9
      //   516: getfield 48	u5/i:a	I
      //   519: aload 9
      //   521: getfield 51	u5/i:b	Ljava/lang/String;
      //   524: invokevirtual 282	android/util/SparseArray:put	(ILjava/lang/Object;)V
      //   527: aload 5
      //   529: astore 7
      //   531: aload 5
      //   533: astore 10
      //   535: iload 6
      //   537: aload 9
      //   539: iload 11
      //   541: invokestatic 221	u5/j$b:i	(Lu5/i;I)I
      //   544: iadd
      //   545: istore 6
      //   547: iinc 15 1
      //   550: goto -89 -> 461
      //   553: aload 5
      //   555: astore 7
      //   557: aload 5
      //   559: astore 10
      //   561: aload 5
      //   563: invokevirtual 74	java/io/DataInputStream:readInt	()I
      //   566: istore 11
      //   568: aload 5
      //   570: astore 7
      //   572: aload 5
      //   574: astore 10
      //   576: aload 5
      //   578: invokevirtual 287	java/io/InputStream:read	()I
      //   581: istore 15
      //   583: iload 15
      //   585: iconst_m1
      //   586: if_icmpne +9 -> 595
      //   589: iconst_1
      //   590: istore 15
      //   592: goto +6 -> 598
      //   595: iconst_0
      //   596: istore 15
      //   598: aload 5
      //   600: astore 7
      //   602: iload 11
      //   604: iload 6
      //   606: if_icmpne +27 -> 633
      //   609: iload 15
      //   611: ifne +10 -> 621
      //   614: aload 5
      //   616: astore 7
      //   618: goto +15 -> 633
      //   621: aload 5
      //   623: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
      //   626: iload 4
      //   628: istore 6
      //   630: goto +54 -> 684
      //   633: aload 7
      //   635: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
      //   638: goto +43 -> 681
      //   641: astore_1
      //   642: aload 7
      //   644: astore_2
      //   645: goto +16 -> 661
      //   648: astore 5
      //   650: aload 10
      //   652: astore 5
      //   654: goto +17 -> 671
      //   657: astore_1
      //   658: aload 5
      //   660: astore_2
      //   661: aload_2
      //   662: ifnull +7 -> 669
      //   665: aload_2
      //   666: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
      //   669: aload_1
      //   670: athrow
      //   671: aload 5
      //   673: ifnull +8 -> 681
      //   676: aload 5
      //   678: invokestatic 237	v5/e0:g	(Ljava/io/Closeable;)V
      //   681: iconst_0
      //   682: istore 6
      //   684: iload 6
      //   686: ifne +32 -> 718
      //   689: aload_1
      //   690: invokevirtual 290	java/util/HashMap:clear	()V
      //   693: aload_2
      //   694: invokevirtual 291	android/util/SparseArray:clear	()V
      //   697: aload_0
      //   698: getfield 40	u5/j$b:e	Lv5/a;
      //   701: astore_1
      //   702: aload_1
      //   703: getfield 242	v5/a:a	Ljava/io/File;
      //   706: invokevirtual 232	java/io/File:delete	()Z
      //   709: pop
      //   710: aload_1
      //   711: getfield 227	v5/a:b	Ljava/io/File;
      //   714: invokevirtual 232	java/io/File:delete	()Z
      //   717: pop
      //   718: return
      //   719: astore 5
      //   721: aload 7
      //   723: astore 5
      //   725: goto -54 -> 671
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	728	0	this	b
      //   0	728	1	paramHashMap	HashMap<String, i>
      //   0	728	2	paramSparseArray	SparseArray<String>
      //   4	7	3	bool	boolean
      //   6	621	4	i	int
      //   18	330	5	localObject1	Object
      //   357	1	5	localInvalidAlgorithmParameterException	InvalidAlgorithmParameterException
      //   362	26	5	localInvalidKeyException	InvalidKeyException
      //   405	217	5	localObject2	Object
      //   648	1	5	localIOException1	IOException
      //   652	25	5	localObject3	Object
      //   719	1	5	localIOException2	IOException
      //   723	1	5	localObject4	Object
      //   46	639	6	j	int
      //   67	655	7	localObject5	Object
      //   75	326	8	localObject6	Object
      //   92	446	9	localObject7	Object
      //   107	544	10	localObject8	Object
      //   114	493	11	k	int
      //   190	160	12	localObject9	Object
      //   247	38	13	localCipher	Cipher
      //   452	14	14	m	int
      //   455	155	15	n	int
      // Exception table:
      //   from	to	target	type
      //   243	249	357	java/security/InvalidAlgorithmParameterException
      //   257	263	357	java/security/InvalidAlgorithmParameterException
      //   271	276	357	java/security/InvalidAlgorithmParameterException
      //   284	294	357	java/security/InvalidAlgorithmParameterException
      //   243	249	362	java/security/InvalidKeyException
      //   257	263	362	java/security/InvalidKeyException
      //   271	276	362	java/security/InvalidKeyException
      //   284	294	362	java/security/InvalidKeyException
      //   109	116	641	finally
      //   146	156	641	finally
      //   164	171	641	finally
      //   186	192	641	finally
      //   200	207	641	finally
      //   215	220	641	finally
      //   228	235	641	finally
      //   243	249	641	finally
      //   257	263	641	finally
      //   271	276	641	finally
      //   284	294	641	finally
      //   302	307	641	finally
      //   315	320	641	finally
      //   328	339	641	finally
      //   347	354	641	finally
      //   372	377	641	finally
      //   385	392	641	finally
      //   400	403	641	finally
      //   415	422	641	finally
      //   430	435	641	finally
      //   447	454	641	finally
      //   476	485	641	finally
      //   493	505	641	finally
      //   513	527	641	finally
      //   535	547	641	finally
      //   561	568	641	finally
      //   576	583	641	finally
      //   109	116	648	java/io/IOException
      //   146	156	648	java/io/IOException
      //   164	171	648	java/io/IOException
      //   186	192	648	java/io/IOException
      //   200	207	648	java/io/IOException
      //   215	220	648	java/io/IOException
      //   228	235	648	java/io/IOException
      //   243	249	648	java/io/IOException
      //   257	263	648	java/io/IOException
      //   271	276	648	java/io/IOException
      //   284	294	648	java/io/IOException
      //   302	307	648	java/io/IOException
      //   315	320	648	java/io/IOException
      //   328	339	648	java/io/IOException
      //   347	354	648	java/io/IOException
      //   372	377	648	java/io/IOException
      //   385	392	648	java/io/IOException
      //   400	403	648	java/io/IOException
      //   415	422	648	java/io/IOException
      //   430	435	648	java/io/IOException
      //   447	454	648	java/io/IOException
      //   476	485	648	java/io/IOException
      //   493	505	648	java/io/IOException
      //   513	527	648	java/io/IOException
      //   535	547	648	java/io/IOException
      //   561	568	648	java/io/IOException
      //   576	583	648	java/io/IOException
      //   72	101	657	finally
      //   72	101	719	java/io/IOException
    }
    
    public final void h()
    {
      v5.a locala = e;
      a.delete();
      b.delete();
    }
  }
  
  public static abstract interface c
  {
    public abstract void a(HashMap<String, i> paramHashMap);
    
    public abstract void b(i parami, boolean paramBoolean);
    
    public abstract boolean c();
    
    public abstract void d(HashMap<String, i> paramHashMap);
    
    public abstract void e(long paramLong);
    
    public abstract void f(i parami);
    
    public abstract void g(HashMap<String, i> paramHashMap, SparseArray<String> paramSparseArray);
    
    public abstract void h();
  }
}

/* Location:
 * Qualified Name:     u5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */