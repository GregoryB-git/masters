package androidx.versionedparcelable;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.NetworkOnMainThreadException;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import androidx.collection.SimpleArrayMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class VersionedParcel
{
  private static final int EX_BAD_PARCELABLE = -2;
  private static final int EX_ILLEGAL_ARGUMENT = -3;
  private static final int EX_ILLEGAL_STATE = -5;
  private static final int EX_NETWORK_MAIN_THREAD = -6;
  private static final int EX_NULL_POINTER = -4;
  private static final int EX_PARCELABLE = -9;
  private static final int EX_SECURITY = -1;
  private static final int EX_UNSUPPORTED_OPERATION = -7;
  private static final String TAG = "VersionedParcel";
  private static final int TYPE_BINDER = 5;
  private static final int TYPE_FLOAT = 8;
  private static final int TYPE_INTEGER = 7;
  private static final int TYPE_PARCELABLE = 2;
  private static final int TYPE_SERIALIZABLE = 3;
  private static final int TYPE_STRING = 4;
  private static final int TYPE_VERSIONED_PARCELABLE = 1;
  public final ArrayMap<String, Class> mParcelizerCache;
  public final ArrayMap<String, Method> mReadCache;
  public final ArrayMap<String, Method> mWriteCache;
  
  public VersionedParcel(ArrayMap<String, Method> paramArrayMap1, ArrayMap<String, Method> paramArrayMap2, ArrayMap<String, Class> paramArrayMap)
  {
    mReadCache = paramArrayMap1;
    mWriteCache = paramArrayMap2;
    mParcelizerCache = paramArrayMap;
  }
  
  private Exception createException(int paramInt, String paramString)
  {
    switch (paramInt)
    {
    case -8: 
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown exception code: ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" msg ");
      localStringBuilder.append(paramString);
      return new RuntimeException(localStringBuilder.toString());
    case -1: 
      return new SecurityException(paramString);
    case -2: 
      return new BadParcelableException(paramString);
    case -3: 
      return new IllegalArgumentException(paramString);
    case -4: 
      return new NullPointerException(paramString);
    case -5: 
      return new IllegalStateException(paramString);
    case -6: 
      return new NetworkOnMainThreadException();
    case -7: 
      return new UnsupportedOperationException(paramString);
    }
    return (Exception)readParcelable();
  }
  
  private Class findParcelClass(Class<? extends VersionedParcelable> paramClass)
    throws ClassNotFoundException
  {
    Class localClass1 = (Class)mParcelizerCache.get(paramClass.getName());
    Class localClass2 = localClass1;
    if (localClass1 == null)
    {
      localClass2 = Class.forName(String.format("%s.%sParcelizer", new Object[] { paramClass.getPackage().getName(), paramClass.getSimpleName() }), false, paramClass.getClassLoader());
      mParcelizerCache.put(paramClass.getName(), localClass2);
    }
    return localClass2;
  }
  
  private Method getReadMethod(String paramString)
    throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException
  {
    Method localMethod1 = (Method)mReadCache.get(paramString);
    Method localMethod2 = localMethod1;
    if (localMethod1 == null)
    {
      System.currentTimeMillis();
      localMethod2 = Class.forName(paramString, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", new Class[] { VersionedParcel.class });
      mReadCache.put(paramString, localMethod2);
    }
    return localMethod2;
  }
  
  @NonNull
  public static Throwable getRootCause(@NonNull Throwable paramThrowable)
  {
    while (paramThrowable.getCause() != null) {
      paramThrowable = paramThrowable.getCause();
    }
    return paramThrowable;
  }
  
  private <T> int getType(T paramT)
  {
    if ((paramT instanceof String)) {
      return 4;
    }
    if ((paramT instanceof Parcelable)) {
      return 2;
    }
    if ((paramT instanceof VersionedParcelable)) {
      return 1;
    }
    if ((paramT instanceof Serializable)) {
      return 3;
    }
    if ((paramT instanceof IBinder)) {
      return 5;
    }
    if ((paramT instanceof Integer)) {
      return 7;
    }
    if ((paramT instanceof Float)) {
      return 8;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramT.getClass().getName());
    localStringBuilder.append(" cannot be VersionedParcelled");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  private Method getWriteMethod(Class paramClass)
    throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException
  {
    Method localMethod = (Method)mWriteCache.get(paramClass.getName());
    Object localObject = localMethod;
    if (localMethod == null)
    {
      localObject = findParcelClass(paramClass);
      System.currentTimeMillis();
      localObject = ((Class)localObject).getDeclaredMethod("write", new Class[] { paramClass, VersionedParcel.class });
      mWriteCache.put(paramClass.getName(), localObject);
    }
    return (Method)localObject;
  }
  
  private <T, S extends Collection<T>> S readCollection(S paramS)
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    if (i != 0)
    {
      int j = readInt();
      if (i < 0) {
        return null;
      }
      int k = i;
      if (j != 1)
      {
        k = i;
        if (j != 2)
        {
          k = i;
          if (j != 3)
          {
            k = i;
            if (j != 4)
            {
              if (j == 5) {
                while (i > 0)
                {
                  paramS.add(readStrongBinder());
                  i--;
                }
              }
            }
            else {
              while (k > 0)
              {
                paramS.add(readString());
                k--;
              }
            }
          }
          else
          {
            while (k > 0)
            {
              paramS.add(readSerializable());
              k--;
            }
          }
        }
        else
        {
          while (k > 0)
          {
            paramS.add(readParcelable());
            k--;
          }
        }
      }
      else
      {
        while (k > 0)
        {
          paramS.add(readVersionedParcelable());
          k--;
        }
      }
    }
    return paramS;
  }
  
  private Exception readException(int paramInt, String paramString)
  {
    return createException(paramInt, paramString);
  }
  
  private int readExceptionCode()
  {
    return readInt();
  }
  
  private <T> void writeCollection(Collection<T> paramCollection)
  {
    if (paramCollection == null)
    {
      writeInt(-1);
      return;
    }
    int i = paramCollection.size();
    writeInt(i);
    if (i > 0)
    {
      i = getType(paramCollection.iterator().next());
      writeInt(i);
      switch (i)
      {
      case 6: 
      default: 
        break;
      case 8: 
        paramCollection = paramCollection.iterator();
      case 7: 
      case 5: 
      case 4: 
      case 3: 
      case 2: 
      case 1: 
        while (paramCollection.hasNext())
        {
          writeFloat(((Float)paramCollection.next()).floatValue());
          continue;
          paramCollection = paramCollection.iterator();
          while (paramCollection.hasNext())
          {
            writeInt(((Integer)paramCollection.next()).intValue());
            continue;
            paramCollection = paramCollection.iterator();
            while (paramCollection.hasNext())
            {
              writeStrongBinder((IBinder)paramCollection.next());
              continue;
              paramCollection = paramCollection.iterator();
              while (paramCollection.hasNext())
              {
                writeString((String)paramCollection.next());
                continue;
                paramCollection = paramCollection.iterator();
                while (paramCollection.hasNext())
                {
                  writeSerializable((Serializable)paramCollection.next());
                  continue;
                  paramCollection = paramCollection.iterator();
                  while (paramCollection.hasNext())
                  {
                    writeParcelable((Parcelable)paramCollection.next());
                    continue;
                    paramCollection = paramCollection.iterator();
                    while (paramCollection.hasNext()) {
                      writeVersionedParcelable((VersionedParcelable)paramCollection.next());
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private <T> void writeCollection(Collection<T> paramCollection, int paramInt)
  {
    setOutputField(paramInt);
    writeCollection(paramCollection);
  }
  
  private void writeSerializable(Serializable paramSerializable)
  {
    if (paramSerializable == null)
    {
      writeString(null);
      return;
    }
    String str = paramSerializable.getClass().getName();
    writeString(str);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      ObjectOutputStream localObjectOutputStream = new java/io/ObjectOutputStream;
      localObjectOutputStream.<init>(localByteArrayOutputStream);
      localObjectOutputStream.writeObject(paramSerializable);
      localObjectOutputStream.close();
      writeByteArray(localByteArrayOutputStream.toByteArray());
      return;
    }
    catch (IOException paramSerializable)
    {
      throw new RuntimeException(z2.p("VersionedParcelable encountered IOException writing serializable object (name = ", str, ")"), paramSerializable);
    }
  }
  
  private void writeVersionedParcelableCreator(VersionedParcelable paramVersionedParcelable)
  {
    try
    {
      localObject = findParcelClass(paramVersionedParcelable.getClass());
      writeString(((Class)localObject).getName());
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramVersionedParcelable.getClass().getSimpleName());
      ((StringBuilder)localObject).append(" does not have a Parcelizer");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localClassNotFoundException);
    }
  }
  
  public abstract void closeField();
  
  public abstract VersionedParcel createSubParcel();
  
  public boolean isStream()
  {
    return false;
  }
  
  public <T> T[] readArray(T[] paramArrayOfT)
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(i);
    if (i != 0)
    {
      int j = readInt();
      if (i < 0) {
        return null;
      }
      int k = i;
      if (j != 1)
      {
        k = i;
        if (j != 2)
        {
          k = i;
          if (j != 3)
          {
            k = i;
            if (j != 4)
            {
              if (j == 5) {
                while (i > 0)
                {
                  localArrayList.add(readStrongBinder());
                  i--;
                }
              }
            }
            else {
              while (k > 0)
              {
                localArrayList.add(readString());
                k--;
              }
            }
          }
          else
          {
            while (k > 0)
            {
              localArrayList.add(readSerializable());
              k--;
            }
          }
        }
        else
        {
          while (k > 0)
          {
            localArrayList.add(readParcelable());
            k--;
          }
        }
      }
      else
      {
        while (k > 0)
        {
          localArrayList.add(readVersionedParcelable());
          k--;
        }
      }
    }
    return localArrayList.toArray(paramArrayOfT);
  }
  
  public <T> T[] readArray(T[] paramArrayOfT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfT;
    }
    return readArray(paramArrayOfT);
  }
  
  public abstract boolean readBoolean();
  
  public boolean readBoolean(boolean paramBoolean, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramBoolean;
    }
    return readBoolean();
  }
  
  public boolean[] readBooleanArray()
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    boolean[] arrayOfBoolean = new boolean[i];
    for (int j = 0; j < i; j++)
    {
      int k;
      if (readInt() != 0) {
        k = 1;
      } else {
        k = 0;
      }
      arrayOfBoolean[j] = k;
    }
    return arrayOfBoolean;
  }
  
  public boolean[] readBooleanArray(boolean[] paramArrayOfBoolean, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfBoolean;
    }
    return readBooleanArray();
  }
  
  public abstract Bundle readBundle();
  
  public Bundle readBundle(Bundle paramBundle, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramBundle;
    }
    return readBundle();
  }
  
  public byte readByte(byte paramByte, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramByte;
    }
    return (byte)(readInt() & 0xFF);
  }
  
  public abstract byte[] readByteArray();
  
  public byte[] readByteArray(byte[] paramArrayOfByte, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfByte;
    }
    return readByteArray();
  }
  
  public char[] readCharArray(char[] paramArrayOfChar, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfChar;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    paramArrayOfChar = new char[i];
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramArrayOfChar[paramInt] = ((char)(char)readInt());
    }
    return paramArrayOfChar;
  }
  
  public abstract CharSequence readCharSequence();
  
  public CharSequence readCharSequence(CharSequence paramCharSequence, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramCharSequence;
    }
    return readCharSequence();
  }
  
  public abstract double readDouble();
  
  public double readDouble(double paramDouble, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramDouble;
    }
    return readDouble();
  }
  
  public double[] readDoubleArray()
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    double[] arrayOfDouble = new double[i];
    for (int j = 0; j < i; j++) {
      arrayOfDouble[j] = readDouble();
    }
    return arrayOfDouble;
  }
  
  public double[] readDoubleArray(double[] paramArrayOfDouble, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfDouble;
    }
    return readDoubleArray();
  }
  
  public Exception readException(Exception paramException, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramException;
    }
    paramInt = readExceptionCode();
    if (paramInt != 0) {
      paramException = readException(paramInt, readString());
    }
    return paramException;
  }
  
  public abstract boolean readField(int paramInt);
  
  public abstract float readFloat();
  
  public float readFloat(float paramFloat, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramFloat;
    }
    return readFloat();
  }
  
  public float[] readFloatArray()
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    float[] arrayOfFloat = new float[i];
    for (int j = 0; j < i; j++) {
      arrayOfFloat[j] = readFloat();
    }
    return arrayOfFloat;
  }
  
  public float[] readFloatArray(float[] paramArrayOfFloat, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfFloat;
    }
    return readFloatArray();
  }
  
  public <T extends VersionedParcelable> T readFromParcel(String paramString, VersionedParcel paramVersionedParcel)
  {
    try
    {
      paramString = (VersionedParcelable)getReadMethod(paramString).invoke(null, new Object[] { paramVersionedParcel });
      return paramString;
    }
    catch (ClassNotFoundException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramString);
    }
    catch (NoSuchMethodException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramString);
    }
    catch (InvocationTargetException paramString)
    {
      if ((paramString.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramString.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramString);
    }
    catch (IllegalAccessException paramString)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramString);
    }
  }
  
  public abstract int readInt();
  
  public int readInt(int paramInt1, int paramInt2)
  {
    if (!readField(paramInt2)) {
      return paramInt1;
    }
    return readInt();
  }
  
  public int[] readIntArray()
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = readInt();
    }
    return arrayOfInt;
  }
  
  public int[] readIntArray(int[] paramArrayOfInt, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfInt;
    }
    return readIntArray();
  }
  
  public <T> List<T> readList(List<T> paramList, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramList;
    }
    return (List)readCollection(new ArrayList());
  }
  
  public abstract long readLong();
  
  public long readLong(long paramLong, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramLong;
    }
    return readLong();
  }
  
  public long[] readLongArray()
  {
    int i = readInt();
    if (i < 0) {
      return null;
    }
    long[] arrayOfLong = new long[i];
    for (int j = 0; j < i; j++) {
      arrayOfLong[j] = readLong();
    }
    return arrayOfLong;
  }
  
  public long[] readLongArray(long[] paramArrayOfLong, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramArrayOfLong;
    }
    return readLongArray();
  }
  
  public <K, V> Map<K, V> readMap(Map<K, V> paramMap, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramMap;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    ArrayMap localArrayMap = new ArrayMap();
    if (i == 0) {
      return localArrayMap;
    }
    ArrayList localArrayList = new ArrayList();
    paramMap = new ArrayList();
    readCollection(localArrayList);
    readCollection(paramMap);
    for (paramInt = 0; paramInt < i; paramInt++) {
      localArrayMap.put(localArrayList.get(paramInt), paramMap.get(paramInt));
    }
    return localArrayMap;
  }
  
  public abstract <T extends Parcelable> T readParcelable();
  
  public <T extends Parcelable> T readParcelable(T paramT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramT;
    }
    return readParcelable();
  }
  
  public Serializable readSerializable()
  {
    String str = readString();
    if (str == null) {
      return null;
    }
    Object localObject = new ByteArrayInputStream(readByteArray());
    try
    {
      ObjectInputStream local1 = new androidx/versionedparcelable/VersionedParcel$1;
      local1.<init>(this, (InputStream)localObject);
      localObject = (Serializable)local1.readObject();
      return (Serializable)localObject;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new RuntimeException(z2.p("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", str, ")"), localClassNotFoundException);
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(z2.p("VersionedParcelable encountered IOException reading a Serializable object (name = ", str, ")"), localIOException);
    }
  }
  
  public <T> Set<T> readSet(Set<T> paramSet, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSet;
    }
    return (Set)readCollection(new ArraySet());
  }
  
  @RequiresApi(api=21)
  public Size readSize(Size paramSize, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSize;
    }
    if (readBoolean()) {
      return new Size(readInt(), readInt());
    }
    return null;
  }
  
  @RequiresApi(api=21)
  public SizeF readSizeF(SizeF paramSizeF, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSizeF;
    }
    if (readBoolean()) {
      return new SizeF(readFloat(), readFloat());
    }
    return null;
  }
  
  public SparseBooleanArray readSparseBooleanArray(SparseBooleanArray paramSparseBooleanArray, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramSparseBooleanArray;
    }
    int i = readInt();
    if (i < 0) {
      return null;
    }
    paramSparseBooleanArray = new SparseBooleanArray(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramSparseBooleanArray.put(readInt(), readBoolean());
    }
    return paramSparseBooleanArray;
  }
  
  public abstract String readString();
  
  public String readString(String paramString, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramString;
    }
    return readString();
  }
  
  public abstract IBinder readStrongBinder();
  
  public IBinder readStrongBinder(IBinder paramIBinder, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramIBinder;
    }
    return readStrongBinder();
  }
  
  public <T extends VersionedParcelable> T readVersionedParcelable()
  {
    String str = readString();
    if (str == null) {
      return null;
    }
    return readFromParcel(str, createSubParcel());
  }
  
  public <T extends VersionedParcelable> T readVersionedParcelable(T paramT, int paramInt)
  {
    if (!readField(paramInt)) {
      return paramT;
    }
    return readVersionedParcelable();
  }
  
  public abstract void setOutputField(int paramInt);
  
  public void setSerializationFlags(boolean paramBoolean1, boolean paramBoolean2) {}
  
  public <T> void writeArray(T[] paramArrayOfT)
  {
    if (paramArrayOfT == null)
    {
      writeInt(-1);
      return;
    }
    int i = paramArrayOfT.length;
    writeInt(i);
    if (i > 0)
    {
      int j = 0;
      int k = 0;
      int m = 0;
      int n = 0;
      int i1 = 0;
      int i2 = getType(paramArrayOfT[0]);
      writeInt(i2);
      if (i2 != 1)
      {
        n = m;
        if (i2 != 2)
        {
          n = k;
          if (i2 != 3)
          {
            n = j;
            if (i2 != 4)
            {
              n = i1;
              if (i2 == 5) {
                while (n < i)
                {
                  writeStrongBinder((IBinder)paramArrayOfT[n]);
                  n++;
                }
              }
            }
            else
            {
              while (n < i)
              {
                writeString((String)paramArrayOfT[n]);
                n++;
              }
            }
          }
          else
          {
            while (n < i)
            {
              writeSerializable((Serializable)paramArrayOfT[n]);
              n++;
            }
          }
        }
        else
        {
          while (n < i)
          {
            writeParcelable((Parcelable)paramArrayOfT[n]);
            n++;
          }
        }
      }
      else
      {
        while (n < i)
        {
          writeVersionedParcelable((VersionedParcelable)paramArrayOfT[n]);
          n++;
        }
      }
    }
  }
  
  public <T> void writeArray(T[] paramArrayOfT, int paramInt)
  {
    setOutputField(paramInt);
    writeArray(paramArrayOfT);
  }
  
  public abstract void writeBoolean(boolean paramBoolean);
  
  public void writeBoolean(boolean paramBoolean, int paramInt)
  {
    setOutputField(paramInt);
    writeBoolean(paramBoolean);
  }
  
  public void writeBooleanArray(boolean[] paramArrayOfBoolean)
  {
    if (paramArrayOfBoolean != null)
    {
      int i = paramArrayOfBoolean.length;
      writeInt(i);
      for (int j = 0; j < i; j++) {
        writeInt(paramArrayOfBoolean[j]);
      }
    }
    writeInt(-1);
  }
  
  public void writeBooleanArray(boolean[] paramArrayOfBoolean, int paramInt)
  {
    setOutputField(paramInt);
    writeBooleanArray(paramArrayOfBoolean);
  }
  
  public abstract void writeBundle(Bundle paramBundle);
  
  public void writeBundle(Bundle paramBundle, int paramInt)
  {
    setOutputField(paramInt);
    writeBundle(paramBundle);
  }
  
  public void writeByte(byte paramByte, int paramInt)
  {
    setOutputField(paramInt);
    writeInt(paramByte);
  }
  
  public abstract void writeByteArray(byte[] paramArrayOfByte);
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt)
  {
    setOutputField(paramInt);
    writeByteArray(paramArrayOfByte);
  }
  
  public abstract void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public void writeByteArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    setOutputField(paramInt3);
    writeByteArray(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public void writeCharArray(char[] paramArrayOfChar, int paramInt)
  {
    setOutputField(paramInt);
    if (paramArrayOfChar != null)
    {
      int i = paramArrayOfChar.length;
      writeInt(i);
      for (paramInt = 0; paramInt < i; paramInt++) {
        writeInt(paramArrayOfChar[paramInt]);
      }
    }
    writeInt(-1);
  }
  
  public abstract void writeCharSequence(CharSequence paramCharSequence);
  
  public void writeCharSequence(CharSequence paramCharSequence, int paramInt)
  {
    setOutputField(paramInt);
    writeCharSequence(paramCharSequence);
  }
  
  public abstract void writeDouble(double paramDouble);
  
  public void writeDouble(double paramDouble, int paramInt)
  {
    setOutputField(paramInt);
    writeDouble(paramDouble);
  }
  
  public void writeDoubleArray(double[] paramArrayOfDouble)
  {
    if (paramArrayOfDouble != null)
    {
      int i = paramArrayOfDouble.length;
      writeInt(i);
      for (int j = 0; j < i; j++) {
        writeDouble(paramArrayOfDouble[j]);
      }
    }
    writeInt(-1);
  }
  
  public void writeDoubleArray(double[] paramArrayOfDouble, int paramInt)
  {
    setOutputField(paramInt);
    writeDoubleArray(paramArrayOfDouble);
  }
  
  public void writeException(Exception paramException, int paramInt)
  {
    setOutputField(paramInt);
    if (paramException == null)
    {
      writeNoException();
      return;
    }
    paramInt = 0;
    if (((paramException instanceof Parcelable)) && (paramException.getClass().getClassLoader() == Parcelable.class.getClassLoader())) {
      paramInt = -9;
    } else if ((paramException instanceof SecurityException)) {
      paramInt = -1;
    } else if ((paramException instanceof BadParcelableException)) {
      paramInt = -2;
    } else if ((paramException instanceof IllegalArgumentException)) {
      paramInt = -3;
    } else if ((paramException instanceof NullPointerException)) {
      paramInt = -4;
    } else if ((paramException instanceof IllegalStateException)) {
      paramInt = -5;
    } else if ((paramException instanceof NetworkOnMainThreadException)) {
      paramInt = -6;
    } else if ((paramException instanceof UnsupportedOperationException)) {
      paramInt = -7;
    }
    writeInt(paramInt);
    if (paramInt == 0)
    {
      if ((paramException instanceof RuntimeException)) {
        throw ((RuntimeException)paramException);
      }
      throw new RuntimeException(paramException);
    }
    writeString(paramException.getMessage());
    if (paramInt == -9) {
      writeParcelable((Parcelable)paramException);
    }
  }
  
  public abstract void writeFloat(float paramFloat);
  
  public void writeFloat(float paramFloat, int paramInt)
  {
    setOutputField(paramInt);
    writeFloat(paramFloat);
  }
  
  public void writeFloatArray(float[] paramArrayOfFloat)
  {
    if (paramArrayOfFloat != null)
    {
      int i = paramArrayOfFloat.length;
      writeInt(i);
      for (int j = 0; j < i; j++) {
        writeFloat(paramArrayOfFloat[j]);
      }
    }
    writeInt(-1);
  }
  
  public void writeFloatArray(float[] paramArrayOfFloat, int paramInt)
  {
    setOutputField(paramInt);
    writeFloatArray(paramArrayOfFloat);
  }
  
  public abstract void writeInt(int paramInt);
  
  public void writeInt(int paramInt1, int paramInt2)
  {
    setOutputField(paramInt2);
    writeInt(paramInt1);
  }
  
  public void writeIntArray(int[] paramArrayOfInt)
  {
    if (paramArrayOfInt != null)
    {
      int i = paramArrayOfInt.length;
      writeInt(i);
      for (int j = 0; j < i; j++) {
        writeInt(paramArrayOfInt[j]);
      }
    }
    writeInt(-1);
  }
  
  public void writeIntArray(int[] paramArrayOfInt, int paramInt)
  {
    setOutputField(paramInt);
    writeIntArray(paramArrayOfInt);
  }
  
  public <T> void writeList(List<T> paramList, int paramInt)
  {
    writeCollection(paramList, paramInt);
  }
  
  public abstract void writeLong(long paramLong);
  
  public void writeLong(long paramLong, int paramInt)
  {
    setOutputField(paramInt);
    writeLong(paramLong);
  }
  
  public void writeLongArray(long[] paramArrayOfLong)
  {
    if (paramArrayOfLong != null)
    {
      int i = paramArrayOfLong.length;
      writeInt(i);
      for (int j = 0; j < i; j++) {
        writeLong(paramArrayOfLong[j]);
      }
    }
    writeInt(-1);
  }
  
  public void writeLongArray(long[] paramArrayOfLong, int paramInt)
  {
    setOutputField(paramInt);
    writeLongArray(paramArrayOfLong);
  }
  
  public <K, V> void writeMap(Map<K, V> paramMap, int paramInt)
  {
    setOutputField(paramInt);
    if (paramMap == null)
    {
      writeInt(-1);
      return;
    }
    paramInt = paramMap.size();
    writeInt(paramInt);
    if (paramInt == 0) {
      return;
    }
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      localArrayList1.add(paramMap.getKey());
      localArrayList2.add(paramMap.getValue());
    }
    writeCollection(localArrayList1);
    writeCollection(localArrayList2);
  }
  
  public void writeNoException()
  {
    writeInt(0);
  }
  
  public abstract void writeParcelable(Parcelable paramParcelable);
  
  public void writeParcelable(Parcelable paramParcelable, int paramInt)
  {
    setOutputField(paramInt);
    writeParcelable(paramParcelable);
  }
  
  public void writeSerializable(Serializable paramSerializable, int paramInt)
  {
    setOutputField(paramInt);
    writeSerializable(paramSerializable);
  }
  
  public <T> void writeSet(Set<T> paramSet, int paramInt)
  {
    writeCollection(paramSet, paramInt);
  }
  
  @RequiresApi(api=21)
  public void writeSize(Size paramSize, int paramInt)
  {
    setOutputField(paramInt);
    boolean bool;
    if (paramSize != null) {
      bool = true;
    } else {
      bool = false;
    }
    writeBoolean(bool);
    if (paramSize != null)
    {
      writeInt(paramSize.getWidth());
      writeInt(paramSize.getHeight());
    }
  }
  
  @RequiresApi(api=21)
  public void writeSizeF(SizeF paramSizeF, int paramInt)
  {
    setOutputField(paramInt);
    boolean bool;
    if (paramSizeF != null) {
      bool = true;
    } else {
      bool = false;
    }
    writeBoolean(bool);
    if (paramSizeF != null)
    {
      writeFloat(paramSizeF.getWidth());
      writeFloat(paramSizeF.getHeight());
    }
  }
  
  public void writeSparseBooleanArray(SparseBooleanArray paramSparseBooleanArray, int paramInt)
  {
    setOutputField(paramInt);
    if (paramSparseBooleanArray == null)
    {
      writeInt(-1);
      return;
    }
    int i = paramSparseBooleanArray.size();
    writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      writeInt(paramSparseBooleanArray.keyAt(paramInt));
      writeBoolean(paramSparseBooleanArray.valueAt(paramInt));
    }
  }
  
  public abstract void writeString(String paramString);
  
  public void writeString(String paramString, int paramInt)
  {
    setOutputField(paramInt);
    writeString(paramString);
  }
  
  public abstract void writeStrongBinder(IBinder paramIBinder);
  
  public void writeStrongBinder(IBinder paramIBinder, int paramInt)
  {
    setOutputField(paramInt);
    writeStrongBinder(paramIBinder);
  }
  
  public abstract void writeStrongInterface(IInterface paramIInterface);
  
  public void writeStrongInterface(IInterface paramIInterface, int paramInt)
  {
    setOutputField(paramInt);
    writeStrongInterface(paramIInterface);
  }
  
  public <T extends VersionedParcelable> void writeToParcel(T paramT, VersionedParcel paramVersionedParcel)
  {
    try
    {
      getWriteMethod(paramT.getClass()).invoke(null, new Object[] { paramT, paramVersionedParcel });
      return;
    }
    catch (ClassNotFoundException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", paramT);
    }
    catch (NoSuchMethodException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", paramT);
    }
    catch (InvocationTargetException paramT)
    {
      if ((paramT.getCause() instanceof RuntimeException)) {
        throw ((RuntimeException)paramT.getCause());
      }
      throw new RuntimeException("VersionedParcel encountered InvocationTargetException", paramT);
    }
    catch (IllegalAccessException paramT)
    {
      throw new RuntimeException("VersionedParcel encountered IllegalAccessException", paramT);
    }
  }
  
  public void writeVersionedParcelable(VersionedParcelable paramVersionedParcelable)
  {
    if (paramVersionedParcelable == null)
    {
      writeString(null);
      return;
    }
    writeVersionedParcelableCreator(paramVersionedParcelable);
    VersionedParcel localVersionedParcel = createSubParcel();
    writeToParcel(paramVersionedParcelable, localVersionedParcel);
    localVersionedParcel.closeField();
  }
  
  public void writeVersionedParcelable(VersionedParcelable paramVersionedParcelable, int paramInt)
  {
    setOutputField(paramInt);
    writeVersionedParcelable(paramVersionedParcelable);
  }
  
  public static class ParcelException
    extends RuntimeException
  {
    public ParcelException(Throwable paramThrowable)
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.versionedparcelable.VersionedParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */