// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import android.database.Cursor;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentProvider;

public class ProcessLifecycleOwnerInitializer extends ContentProvider
{
    public int delete(final Uri uri, final String s, final String[] array) {
        return 0;
    }
    
    public String getType(final Uri uri) {
        return null;
    }
    
    public Uri insert(final Uri uri, final ContentValues contentValues) {
        return null;
    }
    
    public boolean onCreate() {
        e.a(this.getContext());
        o.l(this.getContext());
        return true;
    }
    
    public Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        return null;
    }
    
    public int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        return 0;
    }
}
