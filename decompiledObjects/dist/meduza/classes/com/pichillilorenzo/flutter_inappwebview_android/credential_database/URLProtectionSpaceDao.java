package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.List;

public class URLProtectionSpaceDao
{
  public CredentialDatabaseHelper credentialDatabaseHelper;
  public String[] projection = { "_id", "host", "protocol", "realm", "port" };
  
  public URLProtectionSpaceDao(CredentialDatabaseHelper paramCredentialDatabaseHelper)
  {
    credentialDatabaseHelper = paramCredentialDatabaseHelper;
  }
  
  public long delete(URLProtectionSpace paramURLProtectionSpace)
  {
    paramURLProtectionSpace = paramURLProtectionSpace.getId().toString();
    return credentialDatabaseHelper.getWritableDatabase().delete("protection_space", "_id = ?", new String[] { paramURLProtectionSpace });
  }
  
  public URLProtectionSpace find(String paramString1, String paramString2, String paramString3, Integer paramInteger)
  {
    SQLiteDatabase localSQLiteDatabase = credentialDatabaseHelper.getReadableDatabase();
    paramInteger = paramInteger.toString();
    paramString2 = localSQLiteDatabase.query("protection_space", projection, "host = ? AND protocol = ? AND realm = ? AND port = ?", new String[] { paramString1, paramString2, paramString3, paramInteger }, null, null, null);
    if (paramString2.moveToNext()) {
      paramString1 = new URLProtectionSpace(Long.valueOf(paramString2.getLong(paramString2.getColumnIndexOrThrow("_id"))), paramString2.getString(paramString2.getColumnIndexOrThrow("host")), paramString2.getString(paramString2.getColumnIndexOrThrow("protocol")), paramString2.getString(paramString2.getColumnIndexOrThrow("realm")), Integer.valueOf(paramString2.getInt(paramString2.getColumnIndexOrThrow("port"))).intValue());
    } else {
      paramString1 = null;
    }
    paramString2.close();
    return paramString1;
  }
  
  public List<URLProtectionSpace> getAll()
  {
    Cursor localCursor = credentialDatabaseHelper.getReadableDatabase().query("protection_space", projection, null, null, null, null, null);
    ArrayList localArrayList = new ArrayList();
    while (localCursor.moveToNext()) {
      localArrayList.add(new URLProtectionSpace(Long.valueOf(localCursor.getLong(localCursor.getColumnIndexOrThrow("_id"))), localCursor.getString(localCursor.getColumnIndexOrThrow("host")), localCursor.getString(localCursor.getColumnIndexOrThrow("protocol")), localCursor.getString(localCursor.getColumnIndexOrThrow("realm")), Integer.valueOf(localCursor.getInt(localCursor.getColumnIndexOrThrow("port"))).intValue()));
    }
    localCursor.close();
    return localArrayList;
  }
  
  public long insert(URLProtectionSpace paramURLProtectionSpace)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("host", paramURLProtectionSpace.getHost());
    localContentValues.put("protocol", paramURLProtectionSpace.getProtocol());
    localContentValues.put("realm", paramURLProtectionSpace.getRealm());
    localContentValues.put("port", Integer.valueOf(paramURLProtectionSpace.getPort()));
    return credentialDatabaseHelper.getWritableDatabase().insert("protection_space", null, localContentValues);
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */