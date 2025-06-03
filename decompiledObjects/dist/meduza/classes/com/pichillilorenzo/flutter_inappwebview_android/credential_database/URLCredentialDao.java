package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import java.util.ArrayList;
import java.util.List;

public class URLCredentialDao
{
  public CredentialDatabaseHelper credentialDatabaseHelper;
  public String[] projection = { "_id", "username", "password", "protection_space_id" };
  
  public URLCredentialDao(CredentialDatabaseHelper paramCredentialDatabaseHelper)
  {
    credentialDatabaseHelper = paramCredentialDatabaseHelper;
  }
  
  public long delete(URLCredential paramURLCredential)
  {
    paramURLCredential = paramURLCredential.getId().toString();
    return credentialDatabaseHelper.getWritableDatabase().delete("credential", "_id = ?", new String[] { paramURLCredential });
  }
  
  public URLCredential find(String paramString1, String paramString2, Long paramLong)
  {
    String str = paramLong.toString();
    paramString2 = credentialDatabaseHelper.getReadableDatabase().query("credential", projection, "username = ? AND password = ? AND protection_space_id = ?", new String[] { paramString1, paramString2, str }, null, null, null);
    if (paramString2.moveToNext()) {
      paramString1 = new URLCredential(Long.valueOf(paramString2.getLong(paramString2.getColumnIndexOrThrow("_id"))), paramString2.getString(paramString2.getColumnIndexOrThrow("username")), paramString2.getString(paramString2.getColumnIndexOrThrow("password")), paramLong);
    } else {
      paramString1 = null;
    }
    paramString2.close();
    return paramString1;
  }
  
  public List<URLCredential> getAllByProtectionSpaceId(Long paramLong)
  {
    Object localObject = paramLong.toString();
    Cursor localCursor = credentialDatabaseHelper.getReadableDatabase().query("credential", projection, "protection_space_id = ?", new String[] { localObject }, null, null, null);
    localObject = new ArrayList();
    while (localCursor.moveToNext()) {
      ((ArrayList)localObject).add(new URLCredential(Long.valueOf(localCursor.getLong(localCursor.getColumnIndexOrThrow("_id"))), localCursor.getString(localCursor.getColumnIndexOrThrow("username")), localCursor.getString(localCursor.getColumnIndexOrThrow("password")), paramLong));
    }
    localCursor.close();
    return (List<URLCredential>)localObject;
  }
  
  public long insert(URLCredential paramURLCredential)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("username", paramURLCredential.getUsername());
    localContentValues.put("password", paramURLCredential.getPassword());
    localContentValues.put("protection_space_id", paramURLCredential.getProtectionSpaceId());
    return credentialDatabaseHelper.getWritableDatabase().insert("credential", null, localContentValues);
  }
  
  public long update(URLCredential paramURLCredential)
  {
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("username", paramURLCredential.getUsername());
    localContentValues.put("password", paramURLCredential.getPassword());
    paramURLCredential = paramURLCredential.getProtectionSpaceId().toString();
    return credentialDatabaseHelper.getWritableDatabase().update("credential", localContentValues, "protection_space_id = ?", new String[] { paramURLCredential });
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialDao
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */