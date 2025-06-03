package i9;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import i9.s;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f7693a;

    /* renamed from: b, reason: collision with root package name */
    public final i f7694b;

    public h1(SQLiteDatabase sQLiteDatabase, i iVar) {
        this.f7693a = sQLiteDatabase;
        this.f7694b = iVar;
    }

    public final void a() {
        SQLiteDatabase sQLiteDatabase = this.f7693a;
        d1 d1Var = new d1(this, 1);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT target_id, target_proto FROM targets", null);
        while (rawQuery.moveToNext()) {
            try {
                d1Var.accept(rawQuery);
            } catch (Throwable th) {
                if (rawQuery != null) {
                    try {
                        rawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        rawQuery.close();
    }

    public final void b(String[] strArr, Runnable runnable) {
        String str;
        String f = defpackage.g.f(defpackage.f.l("["), TextUtils.join(", ", strArr), "]");
        boolean z10 = false;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str2 = strArr[i10];
            boolean e10 = e(str2);
            if (i10 == 0) {
                z10 = e10;
            } else if (e10 != z10) {
                StringBuilder l10 = defpackage.f.l(defpackage.g.e("Expected all of ", f, " to either exist or not, but "));
                if (z10) {
                    l10.append(strArr[0]);
                    l10.append(" exists and ");
                    l10.append(str2);
                    str = " does not";
                } else {
                    l10.append(strArr[0]);
                    l10.append(" does not exist and ");
                    l10.append(str2);
                    str = " does";
                }
                l10.append(str);
                throw new IllegalStateException(l10.toString());
            }
        }
        if (z10) {
            p2.m0.y(1, "SQLiteSchema", defpackage.g.e("Skipping migration because all of ", f, " already exist"), new Object[0]);
        } else {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public final void c(int i10) {
        final int i11;
        Long l10;
        long currentTimeMillis = System.currentTimeMillis();
        final int i12 = 3;
        final int i13 = 0;
        boolean z10 = true;
        if (i10 < 1) {
            b(new String[]{"mutation_queues", "mutations", "document_mutations"}, new Runnable(this) { // from class: i9.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7657b;

                {
                    this.f7657b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            h1 h1Var = this.f7657b;
                            h1Var.f7693a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            h1Var.f7693a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            h1Var.f7693a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 1:
                            h1 h1Var2 = this.f7657b;
                            h1Var2.f7693a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            h1Var2.f7693a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 2:
                            h1 h1Var3 = this.f7657b;
                            h1Var3.f7693a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            h1Var3.f7693a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            h1 h1Var4 = this.f7657b;
                            h1Var4.f7693a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            h1Var4.f7693a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            h1Var4.f7693a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                    }
                }
            });
            b(new String[]{"targets", "target_globals", "target_documents"}, new Runnable(this) { // from class: i9.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7657b;

                {
                    this.f7657b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            h1 h1Var = this.f7657b;
                            h1Var.f7693a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            h1Var.f7693a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            h1Var.f7693a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 1:
                            h1 h1Var2 = this.f7657b;
                            h1Var2.f7693a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            h1Var2.f7693a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 2:
                            h1 h1Var3 = this.f7657b;
                            h1Var3.f7693a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            h1Var3.f7693a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            h1 h1Var4 = this.f7657b;
                            h1Var4.f7693a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            h1Var4.f7693a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            h1Var4.f7693a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                    }
                }
            });
            b(new String[]{"remote_documents"}, new Runnable(this) { // from class: i9.f1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7681b;

                {
                    this.f7681b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            this.f7681b.f7693a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        default:
                            this.f7681b.f7693a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                    }
                }
            });
        }
        if (i10 < 3 && i10 != 0) {
            if (e("targets")) {
                this.f7693a.execSQL("DROP TABLE targets");
            }
            if (e("target_globals")) {
                this.f7693a.execSQL("DROP TABLE target_globals");
            }
            if (e("target_documents")) {
                this.f7693a.execSQL("DROP TABLE target_documents");
            }
            b(new String[]{"targets", "target_globals", "target_documents"}, new Runnable(this) { // from class: i9.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7657b;

                {
                    this.f7657b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            h1 h1Var = this.f7657b;
                            h1Var.f7693a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            h1Var.f7693a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            h1Var.f7693a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 1:
                            h1 h1Var2 = this.f7657b;
                            h1Var2.f7693a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            h1Var2.f7693a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 2:
                            h1 h1Var3 = this.f7657b;
                            h1Var3.f7693a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            h1Var3.f7693a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            h1 h1Var4 = this.f7657b;
                            h1Var4.f7693a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            h1Var4.f7693a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            h1Var4.f7693a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                    }
                }
            });
        }
        ?? r12 = 0;
        if (i10 < 4) {
            if ((DatabaseUtils.queryNumEntries(this.f7693a, "target_globals") == 1) == false) {
                this.f7693a.execSQL("INSERT INTO target_globals (highest_target_id, highest_listen_sequence_number, last_remote_snapshot_version_seconds, last_remote_snapshot_version_nanos) VALUES (?, ?, ?, ?)", new String[]{"0", "0", "0", "0"});
            }
            if (!d("target_globals", "target_count")) {
                this.f7693a.execSQL("ALTER TABLE target_globals ADD COLUMN target_count INTEGER");
            }
            long queryNumEntries = DatabaseUtils.queryNumEntries(this.f7693a, "targets");
            ContentValues contentValues = new ContentValues();
            contentValues.put("target_count", Long.valueOf(queryNumEntries));
            this.f7693a.update("target_globals", contentValues, null, null);
        }
        if (i10 < 5 && !d("target_documents", "sequence_number")) {
            this.f7693a.execSQL("ALTER TABLE target_documents ADD COLUMN sequence_number INTEGER");
        }
        if (i10 < 6) {
            SQLiteDatabase sQLiteDatabase = this.f7693a;
            m mVar = new m(this, 3);
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT uid, last_acknowledged_batch_id FROM mutation_queues", null);
            while (rawQuery.moveToNext()) {
                try {
                    mVar.accept(rawQuery);
                } finally {
                }
            }
            rawQuery.close();
        }
        int i14 = 2;
        if (i10 < 7) {
            Cursor rawQuery2 = this.f7693a.rawQuery("SELECT highest_listen_sequence_number FROM target_globals LIMIT 1", null);
            try {
                if (rawQuery2.moveToFirst()) {
                    l10 = Long.valueOf(rawQuery2.getLong(0));
                    rawQuery2.close();
                } else {
                    rawQuery2.close();
                    l10 = null;
                }
                x6.b.Z("Missing highest sequence number", l10 != null, new Object[0]);
                long longValue = l10.longValue();
                SQLiteStatement compileStatement = this.f7693a.compileStatement("INSERT INTO target_documents (target_id, path, sequence_number) VALUES (0, ?, ?)");
                SQLiteDatabase sQLiteDatabase2 = this.f7693a;
                u1.b bVar = new u1.b(new Object[]{100}, 1);
                boolean[] zArr = new boolean[1];
                while (true) {
                    zArr[0] = false;
                    Cursor rawQueryWithFactory = sQLiteDatabase2.rawQueryWithFactory(bVar, "SELECT RD.path FROM remote_documents AS RD WHERE NOT EXISTS (SELECT TD.path FROM target_documents AS TD WHERE RD.path = TD.path AND TD.target_id = 0) LIMIT ?", r12, r12);
                    while (rawQueryWithFactory.moveToNext()) {
                        try {
                            zArr[0] = z10;
                            compileStatement.clearBindings();
                            compileStatement.bindString(z10 ? 1 : 0, rawQueryWithFactory.getString(0));
                            compileStatement.bindLong(i14, longValue);
                            x6.b.Z("Failed to insert a sentinel row", compileStatement.executeInsert() != -1 ? z10 ? 1 : 0 : false, new Object[0]);
                            i14 = 2;
                            z10 = true;
                        } finally {
                        }
                    }
                    rawQueryWithFactory.close();
                    if (!zArr[0]) {
                        break;
                    }
                    i14 = 2;
                    z10 = true;
                    r12 = 0;
                }
            } finally {
            }
        }
        if (i10 < 8) {
            final int i15 = 1;
            b(new String[]{"collection_parents"}, new Runnable(this) { // from class: i9.f1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7681b;

                {
                    this.f7681b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i15) {
                        case 0:
                            this.f7681b.f7693a.execSQL("CREATE TABLE remote_documents (path TEXT PRIMARY KEY, contents BLOB)");
                            break;
                        default:
                            this.f7681b.f7693a.execSQL("CREATE TABLE collection_parents (collection_id TEXT, parent TEXT, PRIMARY KEY(collection_id, parent))");
                            break;
                    }
                }
            });
            g1 g1Var = new g1(0, new s.a(), this.f7693a.compileStatement("INSERT OR REPLACE INTO collection_parents (collection_id, parent) VALUES (?, ?)"));
            Cursor rawQuery3 = this.f7693a.rawQuery("SELECT path FROM remote_documents", null);
            while (rawQuery3.moveToNext()) {
                try {
                    g1Var.accept(p2.m0.x(rawQuery3.getString(0)).s());
                } finally {
                    if (rawQuery3 == null) {
                        throw th;
                    }
                    try {
                        rawQuery3.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
            rawQuery3.close();
            SQLiteDatabase sQLiteDatabase3 = this.f7693a;
            t tVar = new t(g1Var, 2);
            Cursor rawQuery4 = sQLiteDatabase3.rawQuery("SELECT path FROM document_mutations", null);
            while (rawQuery4.moveToNext()) {
                try {
                    tVar.accept(rawQuery4);
                } finally {
                    if (rawQuery4 == null) {
                        throw th;
                    }
                    try {
                        rawQuery4.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            rawQuery4.close();
        }
        if (i10 < 9) {
            boolean d10 = d("remote_documents", "read_time_seconds");
            boolean d11 = d("remote_documents", "read_time_nanos");
            x6.b.Z("Table contained just one of read_time_seconds or read_time_nanos", d10 == d11, new Object[0]);
            if (d10 && d11) {
                a();
            } else {
                this.f7693a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_seconds INTEGER");
                this.f7693a.execSQL("ALTER TABLE remote_documents ADD COLUMN read_time_nanos INTEGER");
            }
        }
        if (i10 == 9) {
            a();
        }
        if (i10 < 11) {
            SQLiteDatabase sQLiteDatabase4 = this.f7693a;
            d1 d1Var = new d1(this, i13);
            Cursor rawQuery5 = sQLiteDatabase4.rawQuery("SELECT target_id, target_proto FROM targets", null);
            while (rawQuery5.moveToNext()) {
                try {
                    d1Var.accept(rawQuery5);
                } finally {
                    if (rawQuery5 == null) {
                        throw th;
                    }
                    try {
                        rawQuery5.close();
                        throw th;
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
            }
            rawQuery5.close();
        }
        if (i10 < 12) {
            final int i16 = 2;
            b(new String[]{"bundles", "named_queries"}, new Runnable(this) { // from class: i9.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7657b;

                {
                    this.f7657b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i16) {
                        case 0:
                            h1 h1Var = this.f7657b;
                            h1Var.f7693a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            h1Var.f7693a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            h1Var.f7693a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 1:
                            h1 h1Var2 = this.f7657b;
                            h1Var2.f7693a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            h1Var2.f7693a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 2:
                            h1 h1Var3 = this.f7657b;
                            h1Var3.f7693a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            h1Var3.f7693a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            h1 h1Var4 = this.f7657b;
                            h1Var4.f7693a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            h1Var4.f7693a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            h1Var4.f7693a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                    }
                }
            });
        }
        if (i10 < 13) {
            if (!d("remote_documents", "path_length")) {
                this.f7693a.execSQL("ALTER TABLE remote_documents ADD COLUMN path_length INTEGER");
            }
            SQLiteDatabase sQLiteDatabase5 = this.f7693a;
            int i17 = 1;
            u1.b bVar2 = new u1.b(new Object[]{100}, 1);
            SQLiteStatement compileStatement2 = this.f7693a.compileStatement("UPDATE remote_documents SET path_length = ? WHERE path = ?");
            boolean[] zArr2 = new boolean[1];
            while (true) {
                zArr2[0] = false;
                r0 r0Var = new r0(i17, zArr2, compileStatement2);
                Cursor rawQueryWithFactory2 = sQLiteDatabase5.rawQueryWithFactory(bVar2, "SELECT path FROM remote_documents WHERE path_length IS NULL LIMIT ?", null, null);
                while (rawQueryWithFactory2.moveToNext()) {
                    try {
                        r0Var.accept(rawQueryWithFactory2);
                    } finally {
                    }
                }
                rawQueryWithFactory2.close();
                if (!zArr2[0]) {
                    break;
                } else {
                    i17 = 1;
                }
            }
        }
        int i18 = 15;
        if (i10 < 14) {
            b(new String[]{"document_overlays"}, new Runnable(this) { // from class: i9.e1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7679b;

                {
                    this.f7679b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            h1 h1Var = this.f7679b;
                            h1Var.f7693a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            h1Var.f7693a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            h1Var.f7693a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                        default:
                            this.f7679b.f7693a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                    }
                }
            });
            b(new String[]{"data_migrations"}, new b.k(this, i18));
            int i19 = e9.a.f4846a;
            this.f7693a.execSQL("INSERT OR IGNORE INTO data_migrations (migration_name) VALUES (?)", new String[]{"BUILD_OVERLAYS"});
        }
        if (i10 < 15) {
            this.f7693a.execSQL("UPDATE remote_documents SET read_time_seconds = 0, read_time_nanos = 0 WHERE read_time_seconds IS NULL");
        }
        if (i10 < 16) {
            i11 = 1;
            b(new String[]{"index_configuration", "index_state", "index_entries"}, new Runnable(this) { // from class: i9.c1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7657b;

                {
                    this.f7657b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            h1 h1Var = this.f7657b;
                            h1Var.f7693a.execSQL("CREATE TABLE targets (target_id INTEGER PRIMARY KEY, canonical_id TEXT, snapshot_version_seconds INTEGER, snapshot_version_nanos INTEGER, resume_token BLOB, last_listen_sequence_number INTEGER,target_proto BLOB)");
                            h1Var.f7693a.execSQL("CREATE INDEX query_targets ON targets (canonical_id, target_id)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_globals (highest_target_id INTEGER, highest_listen_sequence_number INTEGER, last_remote_snapshot_version_seconds INTEGER, last_remote_snapshot_version_nanos INTEGER)");
                            h1Var.f7693a.execSQL("CREATE TABLE target_documents (target_id INTEGER, path TEXT, PRIMARY KEY (target_id, path))");
                            h1Var.f7693a.execSQL("CREATE INDEX document_targets ON target_documents (path, target_id)");
                            break;
                        case 1:
                            h1 h1Var2 = this.f7657b;
                            h1Var2.f7693a.execSQL("CREATE TABLE index_configuration (index_id INTEGER, collection_group TEXT, index_proto BLOB, PRIMARY KEY (index_id))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_state (index_id INTEGER, uid TEXT, sequence_number INTEGER, read_time_seconds INTEGER, read_time_nanos INTEGER, document_key TEXT, largest_batch_id INTEGER, PRIMARY KEY (index_id, uid))");
                            h1Var2.f7693a.execSQL("CREATE TABLE index_entries (index_id INTEGER, uid TEXT, array_value BLOB, directional_value BLOB, document_key TEXT, PRIMARY KEY (index_id, uid, array_value, directional_value, document_key))");
                            h1Var2.f7693a.execSQL("CREATE INDEX read_time ON remote_documents(read_time_seconds, read_time_nanos)");
                            break;
                        case 2:
                            h1 h1Var3 = this.f7657b;
                            h1Var3.f7693a.execSQL("CREATE TABLE bundles (bundle_id TEXT PRIMARY KEY, create_time_seconds INTEGER, create_time_nanos INTEGER, schema_version INTEGER, total_documents INTEGER, total_bytes INTEGER)");
                            h1Var3.f7693a.execSQL("CREATE TABLE named_queries (name TEXT PRIMARY KEY, read_time_seconds INTEGER, read_time_nanos INTEGER, bundled_query_proto BLOB)");
                            break;
                        default:
                            h1 h1Var4 = this.f7657b;
                            h1Var4.f7693a.execSQL("CREATE TABLE mutation_queues (uid TEXT PRIMARY KEY, last_acknowledged_batch_id INTEGER, last_stream_token BLOB)");
                            h1Var4.f7693a.execSQL("CREATE TABLE mutations (uid TEXT, batch_id INTEGER, mutations BLOB, PRIMARY KEY (uid, batch_id))");
                            h1Var4.f7693a.execSQL("CREATE TABLE document_mutations (uid TEXT, path TEXT, batch_id INTEGER, PRIMARY KEY (uid, path, batch_id))");
                            break;
                    }
                }
            });
        } else {
            i11 = 1;
        }
        if (i10 < 17) {
            b(new String[]{"globals"}, new Runnable(this) { // from class: i9.e1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h1 f7679b;

                {
                    this.f7679b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            h1 h1Var = this.f7679b;
                            h1Var.f7693a.execSQL("CREATE TABLE document_overlays (uid TEXT, collection_path TEXT, document_id TEXT, collection_group TEXT, largest_batch_id INTEGER, overlay_mutation BLOB, PRIMARY KEY (uid, collection_path, document_id))");
                            h1Var.f7693a.execSQL("CREATE INDEX batch_id_overlay ON document_overlays (uid, largest_batch_id)");
                            h1Var.f7693a.execSQL("CREATE INDEX collection_group_overlay ON document_overlays (uid, collection_group)");
                            break;
                        default:
                            this.f7679b.f7693a.execSQL("CREATE TABLE globals (name TEXT PRIMARY KEY, value BLOB)");
                            break;
                    }
                }
            });
        }
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i10);
        objArr[i11] = 17;
        objArr[2] = Long.valueOf(System.currentTimeMillis() - currentTimeMillis);
        p2.m0.y(i11, "SQLiteSchema", "Migration from version %s to %s took %s milliseconds", objArr);
    }

    public final boolean d(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f7693a.rawQuery("PRAGMA table_info(" + str + ")", null);
            int columnIndex = cursor.getColumnIndex("name");
            while (cursor.moveToNext()) {
                arrayList.add(cursor.getString(columnIndex));
            }
            cursor.close();
            return arrayList.indexOf(str2) != -1;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean e(String str) {
        Cursor rawQueryWithFactory = this.f7693a.rawQueryWithFactory(new u1.b(new Object[]{str}, 1), "SELECT 1=1 FROM sqlite_master WHERE tbl_name = ?", null, null);
        try {
            boolean z10 = !rawQueryWithFactory.moveToFirst();
            rawQueryWithFactory.close();
            return !z10;
        } catch (Throwable th) {
            if (rawQueryWithFactory != null) {
                try {
                    rawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
