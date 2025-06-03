/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.List
 */
package n2;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import n2.O;
import n2.P;
import n2.Q;
import n2.S;
import n2.T;

public final class U
extends SQLiteOpenHelper {
    public static final String q;
    public static int r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final List x;
    public final int o;
    public boolean p = false;

    static {
        Object object = new StringBuilder();
        object.append("INSERT INTO global_log_event_state VALUES (");
        object.append(System.currentTimeMillis());
        object.append(")");
        q = object.toString();
        r = 5;
        s = object = new O();
        P p8 = new P();
        t = p8;
        Q q8 = new Q();
        u = q8;
        S s8 = new S();
        v = s8;
        T t8 = new T();
        w = t8;
        x = Arrays.asList((Object[])new a[]{object, p8, q8, s8, t8});
    }

    public U(Context context, String string2, int n8) {
        super(context, string2, null, n8);
        this.o = n8;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        U.k(sQLiteDatabase);
    }

    public static /* synthetic */ void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void c(SQLiteDatabase sQLiteDatabase) {
        U.q(sQLiteDatabase);
    }

    public static /* synthetic */ void e(SQLiteDatabase sQLiteDatabase) {
        U.l(sQLiteDatabase);
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        U.n(sQLiteDatabase);
    }

    public static /* synthetic */ void k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void q(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(q);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) {
        if (!this.p) {
            this.onConfigure(sQLiteDatabase);
        }
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.p = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.r(sQLiteDatabase, this.o);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        this.r(sQLiteDatabase, n9);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        this.i(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
        this.i(sQLiteDatabase);
        this.s(sQLiteDatabase, n8, n9);
    }

    public final void r(SQLiteDatabase sQLiteDatabase, int n8) {
        this.i(sQLiteDatabase);
        this.s(sQLiteDatabase, 0, n8);
    }

    public final void s(SQLiteDatabase sQLiteDatabase, int n8, int n9) {
        List list = x;
        if (n9 <= list.size()) {
            while (n8 < n9) {
                ((a)x.get(n8)).a(sQLiteDatabase);
                ++n8;
            }
            return;
        }
        sQLiteDatabase = new StringBuilder();
        sQLiteDatabase.append("Migration from ");
        sQLiteDatabase.append(n8);
        sQLiteDatabase.append(" to ");
        sQLiteDatabase.append(n9);
        sQLiteDatabase.append(" was requested, but cannot be performed. Only ");
        sQLiteDatabase.append(list.size());
        sQLiteDatabase.append(" migrations are provided");
        throw new IllegalArgumentException(sQLiteDatabase.toString());
    }

    public static interface a {
        public void a(SQLiteDatabase var1);
    }

}

