package androidx.sqlite.db;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class SupportSQLiteQueryBuilder
{
  private static final Pattern sLimitPattern = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
  private Object[] mBindArgs;
  private String[] mColumns = null;
  private boolean mDistinct = false;
  private String mGroupBy = null;
  private String mHaving = null;
  private String mLimit = null;
  private String mOrderBy = null;
  private String mSelection;
  private final String mTable;
  
  private SupportSQLiteQueryBuilder(String paramString)
  {
    mTable = paramString;
  }
  
  private static void appendClause(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    if (!isEmpty(paramString2))
    {
      paramStringBuilder.append(paramString1);
      paramStringBuilder.append(paramString2);
    }
  }
  
  private static void appendColumns(StringBuilder paramStringBuilder, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++)
    {
      String str = paramArrayOfString[j];
      if (j > 0) {
        paramStringBuilder.append(", ");
      }
      paramStringBuilder.append(str);
    }
    paramStringBuilder.append(' ');
  }
  
  public static SupportSQLiteQueryBuilder builder(String paramString)
  {
    return new SupportSQLiteQueryBuilder(paramString);
  }
  
  private static boolean isEmpty(String paramString)
  {
    boolean bool;
    if ((paramString != null) && (paramString.length() != 0)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public SupportSQLiteQueryBuilder columns(String[] paramArrayOfString)
  {
    mColumns = paramArrayOfString;
    return this;
  }
  
  public SupportSQLiteQuery create()
  {
    if ((isEmpty(mGroupBy)) && (!isEmpty(mHaving))) {
      throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
    }
    StringBuilder localStringBuilder = new StringBuilder(120);
    localStringBuilder.append("SELECT ");
    if (mDistinct) {
      localStringBuilder.append("DISTINCT ");
    }
    String[] arrayOfString = mColumns;
    if ((arrayOfString != null) && (arrayOfString.length != 0)) {
      appendColumns(localStringBuilder, arrayOfString);
    } else {
      localStringBuilder.append(" * ");
    }
    localStringBuilder.append(" FROM ");
    localStringBuilder.append(mTable);
    appendClause(localStringBuilder, " WHERE ", mSelection);
    appendClause(localStringBuilder, " GROUP BY ", mGroupBy);
    appendClause(localStringBuilder, " HAVING ", mHaving);
    appendClause(localStringBuilder, " ORDER BY ", mOrderBy);
    appendClause(localStringBuilder, " LIMIT ", mLimit);
    return new SimpleSQLiteQuery(localStringBuilder.toString(), mBindArgs);
  }
  
  public SupportSQLiteQueryBuilder distinct()
  {
    mDistinct = true;
    return this;
  }
  
  public SupportSQLiteQueryBuilder groupBy(String paramString)
  {
    mGroupBy = paramString;
    return this;
  }
  
  public SupportSQLiteQueryBuilder having(String paramString)
  {
    mHaving = paramString;
    return this;
  }
  
  public SupportSQLiteQueryBuilder limit(String paramString)
  {
    if ((!isEmpty(paramString)) && (!sLimitPattern.matcher(paramString).matches())) {
      throw new IllegalArgumentException(z2.o("invalid LIMIT clauses:", paramString));
    }
    mLimit = paramString;
    return this;
  }
  
  public SupportSQLiteQueryBuilder orderBy(String paramString)
  {
    mOrderBy = paramString;
    return this;
  }
  
  public SupportSQLiteQueryBuilder selection(String paramString, Object[] paramArrayOfObject)
  {
    mSelection = paramString;
    mBindArgs = paramArrayOfObject;
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.sqlite.db.SupportSQLiteQueryBuilder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */