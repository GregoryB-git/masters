// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import android.database.sqlite.SQLiteOpenHelper;

public final class U extends SQLiteOpenHelper
{
    public static final String q;
    public static int r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final List x;
    public final int o;
    public boolean p;
    
    static {
        final StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        q = sb.toString();
        U.r = 5;
        x = Arrays.asList(s = (a)new O(), t = (a)new P(), u = (a)new Q(), v = (a)new S(), w = (a)new T());
    }
    
    public U(final Context context, final String s, final int o) {
        super(context, s, (SQLiteDatabase$CursorFactory)null, o);
        this.p = false;
        this.o = o;
    }
    
    public final void i(final SQLiteDatabase sqLiteDatabase) {
        if (!this.p) {
            this.onConfigure(sqLiteDatabase);
        }
    }
    
    public void onConfigure(final SQLiteDatabase sqLiteDatabase) {
        this.p = true;
        sqLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }
    
    public void onCreate(final SQLiteDatabase sqLiteDatabase) {
        this.r(sqLiteDatabase, this.o);
    }
    
    public void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        sqLiteDatabase.execSQL("DROP TABLE events");
        sqLiteDatabase.execSQL("DROP TABLE event_metadata");
        sqLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        this.r(sqLiteDatabase, n2);
    }
    
    public void onOpen(final SQLiteDatabase sqLiteDatabase) {
        this.i(sqLiteDatabase);
    }
    
    public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
        this.i(sqLiteDatabase);
        this.s(sqLiteDatabase, n, n2);
    }
    
    public final void r(final SQLiteDatabase sqLiteDatabase, final int n) {
        this.i(sqLiteDatabase);
        this.s(sqLiteDatabase, 0, n);
    }
    
    public final void s(final SQLiteDatabase sqLiteDatabase, int i, final int j) {
        final List x = U.x;
        if (j <= x.size()) {
            while (i < j) {
                U.x.get(i).a(sqLiteDatabase);
                ++i;
            }
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Migration from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(j);
        sb.append(" was requested, but cannot be performed. Only ");
        sb.append(x.size());
        sb.append(" migrations are provided");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public interface a
    {
        void a(final SQLiteDatabase p0);
    }
}
