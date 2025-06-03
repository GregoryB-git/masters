package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
public abstract class zzcj extends SQLiteOpenHelper {
    public zzcj(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10) {
        this(context, str, null, 1, zzco.zza);
    }

    private zzcj(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i10, zzco zzcoVar) {
        super(context, (str == null || zzcf.zza().zzb(str, zzcoVar, zzcl.SQLITE_OPEN_HELPER_TYPE).equals("")) ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
