package n2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class U extends SQLiteOpenHelper {

    /* renamed from: q, reason: collision with root package name */
    public static final String f17891q = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: r, reason: collision with root package name */
    public static int f17892r = 5;

    /* renamed from: s, reason: collision with root package name */
    public static final a f17893s;

    /* renamed from: t, reason: collision with root package name */
    public static final a f17894t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f17895u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f17896v;

    /* renamed from: w, reason: collision with root package name */
    public static final a f17897w;

    /* renamed from: x, reason: collision with root package name */
    public static final List f17898x;

    /* renamed from: o, reason: collision with root package name */
    public final int f17899o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17900p;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: n2.O
            @Override // n2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.k(sQLiteDatabase);
            }
        };
        f17893s = aVar;
        a aVar2 = new a() { // from class: n2.P
            @Override // n2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.l(sQLiteDatabase);
            }
        };
        f17894t = aVar2;
        a aVar3 = new a() { // from class: n2.Q
            @Override // n2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f17895u = aVar3;
        a aVar4 = new a() { // from class: n2.S
            @Override // n2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.n(sQLiteDatabase);
            }
        };
        f17896v = aVar4;
        a aVar5 = new a() { // from class: n2.T
            @Override // n2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.q(sQLiteDatabase);
            }
        };
        f17897w = aVar5;
        f17898x = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public U(Context context, String str, int i7) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i7);
        this.f17900p = false;
        this.f17899o = i7;
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
        sQLiteDatabase.execSQL(f17891q);
    }

    public final void i(SQLiteDatabase sQLiteDatabase) {
        if (this.f17900p) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f17900p = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        r(sQLiteDatabase, this.f17899o);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        r(sQLiteDatabase, i8);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        i(sQLiteDatabase);
        s(sQLiteDatabase, i7, i8);
    }

    public final void r(SQLiteDatabase sQLiteDatabase, int i7) {
        i(sQLiteDatabase);
        s(sQLiteDatabase, 0, i7);
    }

    public final void s(SQLiteDatabase sQLiteDatabase, int i7, int i8) {
        List list = f17898x;
        if (i8 <= list.size()) {
            while (i7 < i8) {
                ((a) f17898x.get(i7)).a(sQLiteDatabase);
                i7++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i7 + " to " + i8 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
