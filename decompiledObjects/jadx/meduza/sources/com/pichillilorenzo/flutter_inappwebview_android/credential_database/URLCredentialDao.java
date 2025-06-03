package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.ContentValues;
import android.database.Cursor;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class URLCredentialDao {
    public CredentialDatabaseHelper credentialDatabaseHelper;
    public String[] projection = {"_id", URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, "password", URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID};

    public URLCredentialDao(CredentialDatabaseHelper credentialDatabaseHelper) {
        this.credentialDatabaseHelper = credentialDatabaseHelper;
    }

    public long delete(URLCredential uRLCredential) {
        return this.credentialDatabaseHelper.getWritableDatabase().delete("credential", "_id = ?", new String[]{uRLCredential.getId().toString()});
    }

    public URLCredential find(String str, String str2, Long l10) {
        Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("credential", this.projection, "username = ? AND password = ? AND protection_space_id = ?", new String[]{str, str2, l10.toString()}, null, null, null);
        URLCredential uRLCredential = query.moveToNext() ? new URLCredential(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)), query.getString(query.getColumnIndexOrThrow("password")), l10) : null;
        query.close();
        return uRLCredential;
    }

    public List<URLCredential> getAllByProtectionSpaceId(Long l10) {
        Cursor query = this.credentialDatabaseHelper.getReadableDatabase().query("credential", this.projection, "protection_space_id = ?", new String[]{l10.toString()}, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(new URLCredential(Long.valueOf(query.getLong(query.getColumnIndexOrThrow("_id"))), query.getString(query.getColumnIndexOrThrow(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME)), query.getString(query.getColumnIndexOrThrow("password")), l10));
        }
        query.close();
        return arrayList;
    }

    public long insert(URLCredential uRLCredential) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, uRLCredential.getUsername());
        contentValues.put("password", uRLCredential.getPassword());
        contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PROTECTION_SPACE_ID, uRLCredential.getProtectionSpaceId());
        return this.credentialDatabaseHelper.getWritableDatabase().insert("credential", null, contentValues);
    }

    public long update(URLCredential uRLCredential) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, uRLCredential.getUsername());
        contentValues.put("password", uRLCredential.getPassword());
        return this.credentialDatabaseHelper.getWritableDatabase().update("credential", contentValues, "protection_space_id = ?", new String[]{uRLCredential.getProtectionSpaceId().toString()});
    }
}
