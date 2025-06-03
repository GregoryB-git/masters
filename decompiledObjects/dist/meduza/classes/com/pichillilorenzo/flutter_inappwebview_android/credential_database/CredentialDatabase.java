package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.List;

public class CredentialDatabase
{
  public static final String DATABASE_NAME = "CredentialDatabase.db";
  public static final int DATABASE_VERSION = 2;
  public static final String LOG_TAG = "CredentialDatabase";
  private static CredentialDatabase instance;
  public URLCredentialDao credentialDao;
  public CredentialDatabaseHelper db;
  public URLProtectionSpaceDao protectionSpaceDao;
  
  private CredentialDatabase() {}
  
  private CredentialDatabase(CredentialDatabaseHelper paramCredentialDatabaseHelper, URLProtectionSpaceDao paramURLProtectionSpaceDao, URLCredentialDao paramURLCredentialDao)
  {
    db = paramCredentialDatabaseHelper;
    protectionSpaceDao = paramURLProtectionSpaceDao;
    credentialDao = paramURLCredentialDao;
  }
  
  public static CredentialDatabase getInstance(Context paramContext)
  {
    CredentialDatabase localCredentialDatabase = instance;
    if (localCredentialDatabase != null) {
      return localCredentialDatabase;
    }
    paramContext = new CredentialDatabaseHelper(paramContext);
    paramContext = new CredentialDatabase(paramContext, new URLProtectionSpaceDao(paramContext), new URLCredentialDao(paramContext));
    instance = paramContext;
    return paramContext;
  }
  
  public void clearAllAuthCredentials()
  {
    CredentialDatabaseHelper localCredentialDatabaseHelper = db;
    localCredentialDatabaseHelper.clearAllTables(localCredentialDatabaseHelper.getWritableDatabase());
  }
  
  public List<URLCredential> getHttpAuthCredentials(String paramString1, String paramString2, String paramString3, Integer paramInteger)
  {
    ArrayList localArrayList = new ArrayList();
    paramString2 = protectionSpaceDao.find(paramString1, paramString2, paramString3, paramInteger);
    paramString1 = localArrayList;
    if (paramString2 != null) {
      paramString1 = credentialDao.getAllByProtectionSpaceId(paramString2.getId());
    }
    return paramString1;
  }
  
  public void removeHttpAuthCredential(String paramString1, String paramString2, String paramString3, Integer paramInteger, String paramString4, String paramString5)
  {
    paramString1 = protectionSpaceDao.find(paramString1, paramString2, paramString3, paramInteger);
    if (paramString1 != null)
    {
      paramString1 = credentialDao.find(paramString4, paramString5, paramString1.getId());
      credentialDao.delete(paramString1);
    }
  }
  
  public void removeHttpAuthCredentials(String paramString1, String paramString2, String paramString3, Integer paramInteger)
  {
    paramString1 = protectionSpaceDao.find(paramString1, paramString2, paramString3, paramInteger);
    if (paramString1 != null) {
      protectionSpaceDao.delete(paramString1);
    }
  }
  
  public void setHttpAuthCredential(String paramString1, String paramString2, String paramString3, Integer paramInteger, String paramString4, String paramString5)
  {
    URLProtectionSpace localURLProtectionSpace = protectionSpaceDao.find(paramString1, paramString2, paramString3, paramInteger);
    if (localURLProtectionSpace == null) {
      paramString1 = Long.valueOf(protectionSpaceDao.insert(new URLProtectionSpace(null, paramString1, paramString2, paramString3, paramInteger.intValue())));
    } else {
      paramString1 = localURLProtectionSpace.getId();
    }
    paramString2 = credentialDao.find(paramString4, paramString5, paramString1);
    if (paramString2 != null)
    {
      int i = 0;
      boolean bool = paramString2.getUsername().equals(paramString4);
      int j = 1;
      if (!bool)
      {
        paramString2.setUsername(paramString4);
        i = 1;
      }
      if (!paramString2.getPassword().equals(paramString5))
      {
        paramString2.setPassword(paramString5);
        i = j;
      }
      if (i != 0) {
        credentialDao.update(paramString2);
      }
    }
    else
    {
      paramString1 = new URLCredential(null, paramString4, paramString5, paramString1);
      paramString1.setId(Long.valueOf(credentialDao.insert(paramString1)));
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */