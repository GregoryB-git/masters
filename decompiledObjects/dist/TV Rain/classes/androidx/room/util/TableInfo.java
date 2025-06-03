package androidx.room.util;

import a;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo.SQLiteTypeAffinity;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import z2;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class TableInfo
{
  public static final int CREATED_FROM_DATABASE = 2;
  public static final int CREATED_FROM_ENTITY = 1;
  public static final int CREATED_FROM_UNKNOWN = 0;
  public final Map<String, Column> columns;
  public final Set<ForeignKey> foreignKeys;
  @Nullable
  public final Set<Index> indices;
  public final String name;
  
  public TableInfo(String paramString, Map<String, Column> paramMap, Set<ForeignKey> paramSet)
  {
    this(paramString, paramMap, paramSet, Collections.emptySet());
  }
  
  public TableInfo(String paramString, Map<String, Column> paramMap, Set<ForeignKey> paramSet, Set<Index> paramSet1)
  {
    name = paramString;
    columns = Collections.unmodifiableMap(paramMap);
    foreignKeys = Collections.unmodifiableSet(paramSet);
    if (paramSet1 == null) {
      paramString = null;
    } else {
      paramString = Collections.unmodifiableSet(paramSet1);
    }
    indices = paramString;
  }
  
  public static TableInfo read(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    return new TableInfo(paramString, readColumns(paramSupportSQLiteDatabase, paramString), readForeignKeys(paramSupportSQLiteDatabase, paramString), readIndices(paramSupportSQLiteDatabase, paramString));
  }
  
  private static Map<String, Column> readColumns(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PRAGMA table_info(`");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject).toString());
    HashMap localHashMap = new HashMap();
    try
    {
      if (paramSupportSQLiteDatabase.getColumnCount() > 0)
      {
        int i = paramSupportSQLiteDatabase.getColumnIndex("name");
        int j = paramSupportSQLiteDatabase.getColumnIndex("type");
        int k = paramSupportSQLiteDatabase.getColumnIndex("notnull");
        int m = paramSupportSQLiteDatabase.getColumnIndex("pk");
        int n = paramSupportSQLiteDatabase.getColumnIndex("dflt_value");
        while (paramSupportSQLiteDatabase.moveToNext())
        {
          localObject = paramSupportSQLiteDatabase.getString(i);
          String str1 = paramSupportSQLiteDatabase.getString(j);
          boolean bool;
          if (paramSupportSQLiteDatabase.getInt(k) != 0) {
            bool = true;
          } else {
            bool = false;
          }
          int i1 = paramSupportSQLiteDatabase.getInt(m);
          String str2 = paramSupportSQLiteDatabase.getString(n);
          paramString = new androidx/room/util/TableInfo$Column;
          paramString.<init>((String)localObject, str1, bool, i1, str2, 2);
          localHashMap.put(localObject, paramString);
        }
      }
      return localHashMap;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  private static List<ForeignKeyWithSequence> readForeignKeyFieldMappings(Cursor paramCursor)
  {
    int i = paramCursor.getColumnIndex("id");
    int j = paramCursor.getColumnIndex("seq");
    int k = paramCursor.getColumnIndex("from");
    int m = paramCursor.getColumnIndex("to");
    int n = paramCursor.getCount();
    ArrayList localArrayList = new ArrayList();
    for (int i1 = 0; i1 < n; i1++)
    {
      paramCursor.moveToPosition(i1);
      localArrayList.add(new ForeignKeyWithSequence(paramCursor.getInt(i), paramCursor.getInt(j), paramCursor.getString(k), paramCursor.getString(m)));
    }
    Collections.sort(localArrayList);
    return localArrayList;
  }
  
  private static Set<ForeignKey> readForeignKeys(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    HashSet localHashSet = new HashSet();
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("PRAGMA foreign_key_list(`");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject1).toString());
    try
    {
      int i = paramSupportSQLiteDatabase.getColumnIndex("id");
      int j = paramSupportSQLiteDatabase.getColumnIndex("seq");
      int k = paramSupportSQLiteDatabase.getColumnIndex("table");
      int m = paramSupportSQLiteDatabase.getColumnIndex("on_delete");
      int n = paramSupportSQLiteDatabase.getColumnIndex("on_update");
      paramString = readForeignKeyFieldMappings(paramSupportSQLiteDatabase);
      int i1 = paramSupportSQLiteDatabase.getCount();
      for (int i2 = 0; i2 < i1; i2++)
      {
        paramSupportSQLiteDatabase.moveToPosition(i2);
        if (paramSupportSQLiteDatabase.getInt(j) == 0)
        {
          int i3 = paramSupportSQLiteDatabase.getInt(i);
          ArrayList localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          Object localObject2 = paramString.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            ForeignKeyWithSequence localForeignKeyWithSequence = (ForeignKeyWithSequence)((Iterator)localObject2).next();
            if (mId == i3)
            {
              localArrayList.add(mFrom);
              ((ArrayList)localObject1).add(mTo);
            }
          }
          localObject2 = new androidx/room/util/TableInfo$ForeignKey;
          ((ForeignKey)localObject2).<init>(paramSupportSQLiteDatabase.getString(k), paramSupportSQLiteDatabase.getString(m), paramSupportSQLiteDatabase.getString(n), localArrayList, (List)localObject1);
          localHashSet.add(localObject2);
        }
      }
      return localHashSet;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  @Nullable
  private static Index readIndex(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString, boolean paramBoolean)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("PRAGMA index_xinfo(`");
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("`)");
    paramSupportSQLiteDatabase = paramSupportSQLiteDatabase.query(((StringBuilder)localObject).toString());
    try
    {
      int i = paramSupportSQLiteDatabase.getColumnIndex("seqno");
      int j = paramSupportSQLiteDatabase.getColumnIndex("cid");
      int k = paramSupportSQLiteDatabase.getColumnIndex("name");
      if ((i != -1) && (j != -1) && (k != -1))
      {
        TreeMap localTreeMap = new java/util/TreeMap;
        localTreeMap.<init>();
        while (paramSupportSQLiteDatabase.moveToNext()) {
          if (paramSupportSQLiteDatabase.getInt(j) >= 0) {
            localTreeMap.put(Integer.valueOf(paramSupportSQLiteDatabase.getInt(i)), paramSupportSQLiteDatabase.getString(k));
          }
        }
        localObject = new java/util/ArrayList;
        ((ArrayList)localObject).<init>(localTreeMap.size());
        ((ArrayList)localObject).addAll(localTreeMap.values());
        paramString = new Index(paramString, paramBoolean, (List)localObject);
        return paramString;
      }
      return null;
    }
    finally
    {
      paramSupportSQLiteDatabase.close();
    }
  }
  
  @Nullable
  private static Set<Index> readIndices(SupportSQLiteDatabase paramSupportSQLiteDatabase, String paramString)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("PRAGMA index_list(`");
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("`)");
    paramString = paramSupportSQLiteDatabase.query(((StringBuilder)localObject1).toString());
    try
    {
      int i = paramString.getColumnIndex("name");
      int j = paramString.getColumnIndex("origin");
      int k = paramString.getColumnIndex("unique");
      if ((i != -1) && (j != -1) && (k != -1))
      {
        localObject1 = new java/util/HashSet;
        ((HashSet)localObject1).<init>();
        while (paramString.moveToNext()) {
          if ("c".equals(paramString.getString(j)))
          {
            Object localObject2 = paramString.getString(i);
            int m = paramString.getInt(k);
            boolean bool = true;
            if (m != 1) {
              bool = false;
            }
            localObject2 = readIndex(paramSupportSQLiteDatabase, (String)localObject2, bool);
            if (localObject2 == null) {
              return null;
            }
            ((HashSet)localObject1).add(localObject2);
          }
        }
        return (Set<Index>)localObject1;
      }
      return null;
    }
    finally
    {
      paramString.close();
    }
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (TableInfo)paramObject;
      Object localObject = name;
      if (localObject != null ? !((String)localObject).equals(name) : name != null) {
        return false;
      }
      localObject = columns;
      if (localObject != null ? !((Map)localObject).equals(columns) : columns != null) {
        return false;
      }
      localObject = foreignKeys;
      if (localObject != null ? !((Set)localObject).equals(foreignKeys) : foreignKeys != null) {
        return false;
      }
      localObject = indices;
      if (localObject != null)
      {
        paramObject = indices;
        if (paramObject != null) {
          return ((Set)localObject).equals(paramObject);
        }
      }
      return true;
    }
    return false;
  }
  
  public int hashCode()
  {
    Object localObject = name;
    int i = 0;
    int j;
    if (localObject != null) {
      j = ((String)localObject).hashCode();
    } else {
      j = 0;
    }
    localObject = columns;
    int k;
    if (localObject != null) {
      k = ((Map)localObject).hashCode();
    } else {
      k = 0;
    }
    localObject = foreignKeys;
    if (localObject != null) {
      i = ((Set)localObject).hashCode();
    }
    return (j * 31 + k) * 31 + i;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("TableInfo{name='");
    a.B(localStringBuilder, name, '\'', ", columns=");
    localStringBuilder.append(columns);
    localStringBuilder.append(", foreignKeys=");
    localStringBuilder.append(foreignKeys);
    localStringBuilder.append(", indices=");
    localStringBuilder.append(indices);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public static class Column
  {
    @ColumnInfo.SQLiteTypeAffinity
    public final int affinity;
    public final String defaultValue;
    private final int mCreatedFrom;
    public final String name;
    public final boolean notNull;
    public final int primaryKeyPosition;
    public final String type;
    
    @Deprecated
    public Column(String paramString1, String paramString2, boolean paramBoolean, int paramInt)
    {
      this(paramString1, paramString2, paramBoolean, paramInt, null, 0);
    }
    
    public Column(String paramString1, String paramString2, boolean paramBoolean, int paramInt1, String paramString3, int paramInt2)
    {
      name = paramString1;
      type = paramString2;
      notNull = paramBoolean;
      primaryKeyPosition = paramInt1;
      affinity = findAffinity(paramString2);
      defaultValue = paramString3;
      mCreatedFrom = paramInt2;
    }
    
    @ColumnInfo.SQLiteTypeAffinity
    private static int findAffinity(@Nullable String paramString)
    {
      if (paramString == null) {
        return 5;
      }
      paramString = paramString.toUpperCase(Locale.US);
      if (paramString.contains("INT")) {
        return 3;
      }
      if ((!paramString.contains("CHAR")) && (!paramString.contains("CLOB")) && (!paramString.contains("TEXT")))
      {
        if (paramString.contains("BLOB")) {
          return 5;
        }
        if ((!paramString.contains("REAL")) && (!paramString.contains("FLOA")) && (!paramString.contains("DOUB"))) {
          return 1;
        }
        return 4;
      }
      return 2;
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (Column)paramObject;
        if (primaryKeyPosition != primaryKeyPosition) {
          return false;
        }
        if (!name.equals(name)) {
          return false;
        }
        if (notNull != notNull) {
          return false;
        }
        String str;
        if ((mCreatedFrom == 1) && (mCreatedFrom == 2))
        {
          str = defaultValue;
          if ((str != null) && (!str.equals(defaultValue))) {
            return false;
          }
        }
        if ((mCreatedFrom == 2) && (mCreatedFrom == 1))
        {
          str = defaultValue;
          if ((str != null) && (!str.equals(defaultValue))) {
            return false;
          }
        }
        int i = mCreatedFrom;
        if ((i != 0) && (i == mCreatedFrom))
        {
          str = defaultValue;
          if (str != null ? !str.equals(defaultValue) : defaultValue != null) {
            return false;
          }
        }
        if (affinity != affinity) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = name.hashCode();
      int j = affinity;
      int k;
      if (notNull) {
        k = 1231;
      } else {
        k = 1237;
      }
      return ((i * 31 + j) * 31 + k) * 31 + primaryKeyPosition;
    }
    
    public boolean isPrimaryKey()
    {
      boolean bool;
      if (primaryKeyPosition > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("Column{name='");
      a.B(localStringBuilder, name, '\'', ", type='");
      a.B(localStringBuilder, type, '\'', ", affinity='");
      localStringBuilder.append(affinity);
      localStringBuilder.append('\'');
      localStringBuilder.append(", notNull=");
      localStringBuilder.append(notNull);
      localStringBuilder.append(", primaryKeyPosition=");
      localStringBuilder.append(primaryKeyPosition);
      localStringBuilder.append(", defaultValue='");
      localStringBuilder.append(defaultValue);
      localStringBuilder.append('\'');
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class ForeignKey
  {
    @NonNull
    public final List<String> columnNames;
    @NonNull
    public final String onDelete;
    @NonNull
    public final String onUpdate;
    @NonNull
    public final List<String> referenceColumnNames;
    @NonNull
    public final String referenceTable;
    
    public ForeignKey(@NonNull String paramString1, @NonNull String paramString2, @NonNull String paramString3, @NonNull List<String> paramList1, @NonNull List<String> paramList2)
    {
      referenceTable = paramString1;
      onDelete = paramString2;
      onUpdate = paramString3;
      columnNames = Collections.unmodifiableList(paramList1);
      referenceColumnNames = Collections.unmodifiableList(paramList2);
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (ForeignKey)paramObject;
        if (!referenceTable.equals(referenceTable)) {
          return false;
        }
        if (!onDelete.equals(onDelete)) {
          return false;
        }
        if (!onUpdate.equals(onUpdate)) {
          return false;
        }
        if (!columnNames.equals(columnNames)) {
          return false;
        }
        return referenceColumnNames.equals(referenceColumnNames);
      }
      return false;
    }
    
    public int hashCode()
    {
      int i = referenceTable.hashCode();
      i = z2.c(onDelete, i * 31, 31);
      i = z2.c(onUpdate, i, 31);
      int j = columnNames.hashCode();
      return referenceColumnNames.hashCode() + (j + i) * 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("ForeignKey{referenceTable='");
      a.B(localStringBuilder, referenceTable, '\'', ", onDelete='");
      a.B(localStringBuilder, onDelete, '\'', ", onUpdate='");
      a.B(localStringBuilder, onUpdate, '\'', ", columnNames=");
      localStringBuilder.append(columnNames);
      localStringBuilder.append(", referenceColumnNames=");
      localStringBuilder.append(referenceColumnNames);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class ForeignKeyWithSequence
    implements Comparable<ForeignKeyWithSequence>
  {
    public final String mFrom;
    public final int mId;
    public final int mSequence;
    public final String mTo;
    
    public ForeignKeyWithSequence(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      mId = paramInt1;
      mSequence = paramInt2;
      mFrom = paramString1;
      mTo = paramString2;
    }
    
    public int compareTo(@NonNull ForeignKeyWithSequence paramForeignKeyWithSequence)
    {
      int i = mId - mId;
      int j = i;
      if (i == 0) {
        j = mSequence - mSequence;
      }
      return j;
    }
  }
  
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static class Index
  {
    public static final String DEFAULT_PREFIX = "index_";
    public final List<String> columns;
    public final String name;
    public final boolean unique;
    
    public Index(String paramString, boolean paramBoolean, List<String> paramList)
    {
      name = paramString;
      unique = paramBoolean;
      columns = paramList;
    }
    
    public boolean equals(Object paramObject)
    {
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (getClass() == paramObject.getClass()))
      {
        paramObject = (Index)paramObject;
        if (unique != unique) {
          return false;
        }
        if (!columns.equals(columns)) {
          return false;
        }
        if (name.startsWith("index_")) {
          return name.startsWith("index_");
        }
        return name.equals(name);
      }
      return false;
    }
    
    public int hashCode()
    {
      int i;
      if (name.startsWith("index_")) {
        i = -1184239155;
      } else {
        i = name.hashCode();
      }
      int j = unique;
      return columns.hashCode() + (i * 31 + j) * 31;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = z2.t("Index{name='");
      a.B(localStringBuilder, name, '\'', ", unique=");
      localStringBuilder.append(unique);
      localStringBuilder.append(", columns=");
      localStringBuilder.append(columns);
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.room.util.TableInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */