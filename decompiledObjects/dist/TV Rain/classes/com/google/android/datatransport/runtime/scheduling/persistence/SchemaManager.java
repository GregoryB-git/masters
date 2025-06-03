package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import z2;

final class SchemaManager
  extends SQLiteOpenHelper
{
  private static final String CREATE_CONTEXTS_SQL_V1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
  private static final String CREATE_CONTEXT_BACKEND_PRIORITY_INDEX_V1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
  private static final String CREATE_EVENTS_SQL_V1 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
  private static final String CREATE_EVENT_BACKEND_INDEX_V1 = "CREATE INDEX events_backend_id on events(context_id)";
  private static final String CREATE_EVENT_METADATA_SQL_V1 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
  private static final String CREATE_GLOBAL_LOG_EVENT_STATE_TABLE = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
  private static final String CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL;
  private static final String CREATE_LOG_EVENT_DROPPED_TABLE = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
  private static final String CREATE_PAYLOADS_TABLE_V4 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
  public static final String DB_NAME = "com.google.android.datatransport.events";
  private static final String DROP_CONTEXTS_SQL = "DROP TABLE transport_contexts";
  private static final String DROP_EVENTS_SQL = "DROP TABLE events";
  private static final String DROP_EVENT_METADATA_SQL = "DROP TABLE event_metadata";
  private static final String DROP_GLOBAL_LOG_EVENT_STATE_SQL = "DROP TABLE IF EXISTS global_log_event_state";
  private static final String DROP_LOG_EVENT_DROPPED_SQL = "DROP TABLE IF EXISTS log_event_dropped";
  private static final String DROP_PAYLOADS_SQL = "DROP TABLE IF EXISTS event_payloads";
  private static final List<Migration> INCREMENTAL_MIGRATIONS;
  private static final Migration MIGRATE_TO_V1;
  private static final Migration MIGRATE_TO_V2;
  private static final Migration MIGRATE_TO_V3;
  private static final Migration MIGRATE_TO_V4;
  private static final Migration MIGRATION_TO_V5;
  public static int SCHEMA_VERSION;
  private boolean configured = false;
  private final int schemaVersion;
  
  static
  {
    Object localObject = z2.t("INSERT INTO global_log_event_state VALUES (");
    ((StringBuilder)localObject).append(System.currentTimeMillis());
    ((StringBuilder)localObject).append(")");
    CREATE_INITIAL_GLOBAL_LOG_EVENT_STATE_VALUE_SQL = ((StringBuilder)localObject).toString();
    SCHEMA_VERSION = 5;
    j localj1 = new j(0);
    MIGRATE_TO_V1 = localj1;
    j localj2 = new j(1);
    MIGRATE_TO_V2 = localj2;
    j localj3 = new j(2);
    MIGRATE_TO_V3 = localj3;
    localObject = new j(3);
    MIGRATE_TO_V4 = (Migration)localObject;
    j localj4 = new j(4);
    MIGRATION_TO_V5 = localj4;
    INCREMENTAL_MIGRATIONS = Arrays.asList(new Migration[] { localj1, localj2, localj3, localObject, localj4 });
  }
  
  @Inject
  public SchemaManager(Context paramContext, @Named("SQLITE_DB_NAME") String paramString, @Named("SCHEMA_VERSION") int paramInt)
  {
    super(paramContext, paramString, null, paramInt);
    schemaVersion = paramInt;
  }
  
  private void ensureConfigured(SQLiteDatabase paramSQLiteDatabase)
  {
    if (!configured) {
      onConfigure(paramSQLiteDatabase);
    }
  }
  
  private void onCreate(SQLiteDatabase paramSQLiteDatabase, int paramInt)
  {
    ensureConfigured(paramSQLiteDatabase);
    upgrade(paramSQLiteDatabase, 0, paramInt);
  }
  
  private void upgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    List localList = INCREMENTAL_MIGRATIONS;
    if (paramInt2 <= localList.size())
    {
      while (paramInt1 < paramInt2)
      {
        ((Migration)INCREMENTAL_MIGRATIONS.get(paramInt1)).upgrade(paramSQLiteDatabase);
        paramInt1++;
      }
      return;
    }
    paramSQLiteDatabase = new StringBuilder();
    paramSQLiteDatabase.append("Migration from ");
    paramSQLiteDatabase.append(paramInt1);
    paramSQLiteDatabase.append(" to ");
    paramSQLiteDatabase.append(paramInt2);
    paramSQLiteDatabase.append(" was requested, but cannot be performed. Only ");
    paramSQLiteDatabase.append(localList.size());
    paramSQLiteDatabase.append(" migrations are provided");
    throw new IllegalArgumentException(paramSQLiteDatabase.toString());
  }
  
  public void onConfigure(SQLiteDatabase paramSQLiteDatabase)
  {
    configured = true;
    paramSQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
    paramSQLiteDatabase.setForeignKeyConstraintsEnabled(true);
  }
  
  public void onCreate(SQLiteDatabase paramSQLiteDatabase)
  {
    onCreate(paramSQLiteDatabase, schemaVersion);
  }
  
  public void onDowngrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    paramSQLiteDatabase.execSQL("DROP TABLE events");
    paramSQLiteDatabase.execSQL("DROP TABLE event_metadata");
    paramSQLiteDatabase.execSQL("DROP TABLE transport_contexts");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
    paramSQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
    onCreate(paramSQLiteDatabase, paramInt2);
  }
  
  public void onOpen(SQLiteDatabase paramSQLiteDatabase)
  {
    ensureConfigured(paramSQLiteDatabase);
  }
  
  public void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2)
  {
    ensureConfigured(paramSQLiteDatabase);
    upgrade(paramSQLiteDatabase, paramInt1, paramInt2);
  }
  
  public static abstract interface Migration
  {
    public abstract void upgrade(SQLiteDatabase paramSQLiteDatabase);
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */