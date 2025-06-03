.class public final Lcom/google/android/gms/measurement/internal/zzig;
.super Lcom/google/android/gms/measurement/internal/zzfy;
.source "SourceFile"


# instance fields
.field public final a:Le7/i6;

.field public b:Ljava/lang/Boolean;

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Le7/i6;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/measurement/internal/zzfy;-><init>()V

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->c:Ljava/lang/String;

    return-void
.end method

.method public static zza(Lcom/google/android/gms/measurement/internal/zzig;Landroid/os/Bundle;Ljava/lang/String;Le7/k6;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v12, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p3

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->R()Le7/h;

    move-result-object v0

    sget-object v2, Le7/h0;->Y0:Le7/m0;

    const/4 v15, 0x0

    .line 1
    invoke-virtual {v0, v15, v2}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    .line 2
    iget-object v2, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v2}, Le7/i6;->R()Le7/h;

    move-result-object v2

    sget-object v3, Le7/h0;->a1:Le7/m0;

    .line 3
    invoke-virtual {v2, v15, v3}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v16

    .line 4
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v2

    const/4 v11, 0x1

    const/16 v17, 0x0

    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 5
    iget-object v1, v0, Le7/i6;->c:Le7/o;

    .line 6
    invoke-static {v1}, Le7/i6;->q(Le7/h6;)V

    .line 7
    invoke-virtual {v1}, Ld2/q;->l()V

    invoke-virtual {v1}, Le7/h6;->p()V

    :try_start_0
    invoke-virtual {v1}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v2, "delete from default_event_params where app_id=?"

    new-array v3, v11, [Ljava/lang/String;

    aput-object v13, v3, v17

    invoke-virtual {v0, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    move-result-object v1

    .line 8
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    const-string v2, "Error clearing default event params"

    .line 9
    invoke-virtual {v1, v2, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 10
    iget-object v9, v0, Le7/i6;->c:Le7/o;

    .line 11
    invoke-static {v9}, Le7/i6;->q(Le7/h6;)V

    .line 12
    invoke-virtual {v9}, Ld2/q;->l()V

    invoke-virtual {v9}, Le7/h6;->p()V

    new-instance v0, Le7/y;

    iget-object v2, v9, Ld2/q;->b:Ljava/lang/Object;

    move-object v3, v2

    check-cast v3, Le7/j2;

    const-wide/16 v7, 0x0

    const-wide/16 v18, 0x0

    const-string v4, ""

    const-string v6, "dep"

    move-object v2, v0

    move-object/from16 v5, p2

    move-object/from16 v20, v9

    move-wide/from16 v9, v18

    move/from16 v18, v11

    move-object/from16 v11, p1

    invoke-direct/range {v2 .. v11}, Le7/y;-><init>(Le7/j2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual/range {v20 .. v20}, Le7/z5;->m()Le7/o6;

    move-result-object v2

    invoke-virtual {v2, v0}, Le7/o6;->x(Le7/y;)Lcom/google/android/gms/internal/measurement/zzgf$zzf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzio;->zzce()[B

    move-result-object v0

    invoke-virtual/range {v20 .. v20}, Ld2/q;->zzj()Le7/a1;

    move-result-object v2

    .line 13
    iget-object v2, v2, Le7/a1;->w:Le7/b1;

    .line 14
    invoke-virtual/range {v20 .. v20}, Ld2/q;->i()Le7/x0;

    move-result-object v3

    invoke-virtual {v3, v13}, Le7/x0;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    array-length v4, v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "Saving default event parameters, appId, data size"

    invoke-virtual {v2, v5, v3, v4}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v2, v3, v13}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "parameters"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_1
    invoke-virtual/range {v20 .. v20}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v3, "default_event_params"

    const/4 v4, 0x5

    invoke-virtual {v0, v3, v15, v2, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    invoke-virtual/range {v20 .. v20}, Ld2/q;->zzj()Le7/a1;

    move-result-object v0

    .line 15
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    const-string v2, "Failed to insert default event parameters (got -1). appId"

    .line 16
    invoke-static/range {p2 .. p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-virtual/range {v20 .. v20}, Ld2/q;->zzj()Le7/a1;

    move-result-object v2

    .line 17
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    .line 18
    invoke-static/range {p2 .. p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object v3

    const-string v4, "Error storing default event parameters. appId"

    invoke-virtual {v2, v4, v3, v0}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    :cond_1
    :goto_0
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 20
    iget-object v2, v0, Le7/i6;->c:Le7/o;

    .line 21
    invoke-static {v2}, Le7/i6;->q(Le7/h6;)V

    .line 22
    iget-wide v3, v14, Le7/k6;->N:J

    .line 23
    invoke-virtual {v2}, Ld2/q;->h()Le7/h;

    move-result-object v0

    sget-object v5, Le7/h0;->a1:Le7/m0;

    .line 24
    invoke-virtual {v0, v15, v5}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 25
    invoke-virtual {v2}, Ld2/q;->zzb()Lv6/b;

    move-result-object v0

    check-cast v0, Lb/z;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/16 v7, 0x3a98

    add-long/2addr v7, v3

    cmp-long v0, v5, v7

    if-lez v0, :cond_2

    goto :goto_1

    :cond_2
    :try_start_2
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like \'!_%\' escape \'!\' limit 1;"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/String;

    aput-object v13, v6, v17

    .line 27
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v18

    const-wide/16 v7, 0x0

    invoke-virtual {v2, v0, v6, v7, v8}, Le7/o;->w(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v9

    cmp-long v0, v9, v7

    if-lez v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "select count(*) from raw_events where app_id=? and timestamp >= ? and name like \'!_%\' escape \'!\' limit 1;"

    new-array v5, v5, [Ljava/lang/String;

    aput-object v13, v5, v17

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v5, v18

    invoke-virtual {v2, v0, v5, v7, v8}, Le7/o;->w(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2

    cmp-long v0, v2, v7

    if-lez v0, :cond_4

    move/from16 v11, v18

    goto :goto_2

    :catch_2
    move-exception v0

    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    move-result-object v2

    .line 28
    iget-object v2, v2, Le7/a1;->o:Le7/b1;

    const-string v3, "Error checking backfill conditions"

    .line 29
    invoke-virtual {v2, v3, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    move/from16 v11, v17

    :goto_2
    if-eqz v11, :cond_6

    .line 30
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    if-eqz v16, :cond_5

    .line 31
    iget-object v0, v0, Le7/i6;->c:Le7/o;

    .line 32
    invoke-static {v0}, Le7/i6;->q(Le7/h6;)V

    .line 33
    iget-wide v1, v14, Le7/k6;->N:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v13, v1, v15, v12}, Le7/o;->P(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 34
    :cond_5
    iget-object v0, v0, Le7/i6;->c:Le7/o;

    .line 35
    invoke-static {v0}, Le7/i6;->q(Le7/h6;)V

    .line 36
    invoke-virtual {v0, v13, v15, v15, v12}, Le7/o;->P(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_6
    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->c0()V

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {p0, p1}, Le7/i6;->W(Le7/k6;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;Le7/p0;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->c0()V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0, p2, p1}, Le7/i6;->j(Landroid/os/Bundle;Le7/k6;)Ljava/util/List;

    move-result-object p1

    :try_start_0
    invoke-interface {p3, p1}, Le7/p0;->zza(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {p0}, Le7/i6;->zzj()Le7/a1;

    move-result-object p0

    .line 37
    iget-object p0, p0, Le7/a1;->o:Le7/b1;

    const-string p2, "Failed to return trigger URIs for app"

    .line 38
    invoke-virtual {p0, p2, p4, p1}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static zza(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Le7/e;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v2}, Le7/i6;->c0()V

    iget-object v2, v0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    move-object/from16 v0, p1

    iget-object v3, v0, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 39
    invoke-virtual {v2}, Le7/i6;->R()Le7/h;

    move-result-object v0

    .line 40
    sget-object v4, Le7/h0;->K0:Le7/m0;

    const/4 v5, 0x0

    .line 41
    invoke-virtual {v0, v5, v4}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_5

    .line 42
    :cond_0
    invoke-static {v2}, La0/j;->q(Le7/i6;)V

    .line 43
    iget-object v15, v2, Le7/i6;->c:Le7/o;

    invoke-static {v15}, Le7/i6;->q(Le7/h6;)V

    .line 44
    iget-wide v13, v1, Le7/e;->a:J

    .line 45
    invoke-virtual {v15}, Ld2/q;->h()Le7/h;

    move-result-object v0

    .line 46
    invoke-virtual {v0, v5, v4}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    const/4 v4, 0x0

    const/4 v12, 0x1

    const/4 v11, 0x4

    const/4 v6, 0x3

    const/4 v10, 0x2

    if-nez v0, :cond_1

    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {v15}, Ld2/q;->l()V

    invoke-virtual {v15}, Le7/h6;->p()V

    :try_start_0
    invoke-virtual {v15}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v16

    const-string v17, "upload_queue"

    const-string v18, "rowId"

    const-string v19, "app_id"

    const-string v20, "measurement_batch"

    const-string v21, "upload_uri"

    const-string v22, "upload_headers"

    const-string v23, "upload_type"

    const-string v24, "retry_count"

    const-string v25, "creation_timestamp"

    const-string v26, "associated_row_id"

    filled-new-array/range {v18 .. v26}, [Ljava/lang/String;

    move-result-object v18

    const-string v19, "rowId=?"

    new-array v0, v12, [Ljava/lang/String;

    invoke-static {v13, v14}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v0, v4

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-string v24, "1"

    move-object/from16 v20, v0

    invoke-virtual/range {v16 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v0, :cond_2

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :goto_0
    move/from16 v24, v10

    move/from16 v25, v11

    move v5, v12

    goto/16 :goto_2

    :cond_2
    :try_start_2
    invoke-interface {v4, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-interface {v4, v10}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v16

    invoke-interface {v4, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v17

    const/4 v6, 0x5

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    const/4 v6, 0x6

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v19

    const/4 v6, 0x7

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    const/16 v6, 0x8

    invoke-interface {v4, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v22
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object v6, v15

    move-wide v8, v13

    move/from16 v24, v10

    move-object v10, v0

    move/from16 v25, v11

    move-object/from16 v11, v16

    move v5, v12

    move-object/from16 v12, v17

    move-wide/from16 v26, v13

    move/from16 v13, v18

    move/from16 v14, v19

    move-object/from16 v19, v15

    move-wide/from16 v15, v20

    move-wide/from16 v17, v22

    :try_start_3
    invoke-virtual/range {v6 .. v18}, Le7/o;->z(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJ)Le7/n6;

    move-result-object v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    move/from16 v24, v10

    move/from16 v25, v11

    move v5, v12

    move-wide/from16 v26, v13

    move-object/from16 v19, v15

    goto :goto_1

    :catchall_0
    move-exception v0

    const/4 v5, 0x0

    goto/16 :goto_6

    :catch_2
    move-exception v0

    move/from16 v24, v10

    move/from16 v25, v11

    move v5, v12

    move-wide/from16 v26, v13

    move-object/from16 v19, v15

    const/4 v4, 0x0

    :goto_1
    :try_start_4
    invoke-virtual/range {v19 .. v19}, Ld2/q;->zzj()Le7/a1;

    move-result-object v6

    .line 48
    iget-object v6, v6, Le7/a1;->o:Le7/b1;

    const-string v7, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 49
    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v7, v8, v0}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v4, :cond_3

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_3
    :goto_2
    const/4 v0, 0x0

    :goto_3
    if-nez v0, :cond_4

    .line 50
    invoke-virtual {v2}, Le7/i6;->zzj()Le7/a1;

    move-result-object v0

    .line 51
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    .line 52
    iget-wide v1, v1, Le7/e;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "Queued batch doesn\'t exist. appId, rowId"

    invoke-virtual {v0, v2, v3, v1}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_5

    .line 53
    :cond_4
    iget-object v0, v0, Le7/n6;->c:Ljava/lang/String;

    .line 54
    iget v4, v1, Le7/e;->b:I

    if-ne v4, v5, :cond_6

    iget-object v4, v2, Le7/i6;->M:Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v2, Le7/i6;->M:Ljava/util/HashMap;

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    :cond_5
    iget-object v0, v2, Le7/i6;->c:Le7/o;

    invoke-static {v0}, Le7/i6;->q(Le7/h6;)V

    .line 56
    iget-wide v6, v1, Le7/e;->a:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v4}, Le7/o;->K(Ljava/lang/Long;)V

    iget-wide v6, v1, Le7/e;->c:J

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-lez v0, :cond_8

    .line 57
    iget-object v2, v2, Le7/i6;->c:Le7/o;

    invoke-static {v2}, Le7/i6;->q(Le7/h6;)V

    .line 58
    iget-wide v6, v1, Le7/e;->c:J

    invoke-virtual {v2}, Ld2/q;->h()Le7/h;

    move-result-object v0

    sget-object v1, Le7/h0;->K0:Le7/m0;

    const/4 v4, 0x0

    .line 59
    invoke-virtual {v0, v4, v1}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 60
    invoke-virtual {v2}, Ld2/q;->l()V

    invoke-virtual {v2}, Le7/h6;->p()V

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v4, "upload_type"

    invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {v2}, Ld2/q;->zzb()Lv6/b;

    move-result-object v1

    check-cast v1, Lb/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 62
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "creation_timestamp"

    invoke-virtual {v0, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :try_start_5
    invoke-virtual {v2}, Le7/o;->s()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v4, "upload_queue"

    const-string v8, "rowid=? AND app_id=? AND upload_type=?"

    const/4 v9, 0x3

    new-array v9, v9, [Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    aput-object v10, v9, v11

    aput-object v3, v9, v5

    invoke-static/range {v25 .. v25}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v9, v24

    invoke-virtual {v1, v4, v0, v8, v9}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v4, 0x1

    cmp-long v0, v0, v4

    if-eqz v0, :cond_8

    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    move-result-object v0

    .line 63
    iget-object v0, v0, Le7/a1;->r:Le7/b1;

    const-string v1, "Google Signal pending batch not updated. appId, rowId"

    .line 64
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v0, v1, v3, v4}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_5

    :catch_3
    move-exception v0

    invoke-virtual {v2}, Ld2/q;->zzj()Le7/a1;

    move-result-object v1

    .line 65
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 66
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v4, "Failed to update google Signal pending batch. appid, rowId"

    invoke-virtual {v1, v3, v2, v0, v4}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-object v3, v2, Le7/i6;->M:Ljava/util/HashMap;

    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le7/i6$b;

    if-nez v3, :cond_7

    iget-object v3, v2, Le7/i6;->M:Ljava/util/HashMap;

    new-instance v4, Le7/i6$b;

    invoke-direct {v4, v2}, Le7/i6$b;-><init>(Le7/i6;)V

    invoke-virtual {v3, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 67
    :cond_7
    iget v0, v3, Le7/i6$b;->b:I

    add-int/2addr v0, v5

    iput v0, v3, Le7/i6$b;->b:I

    invoke-virtual {v3}, Le7/i6$b;->a()J

    move-result-wide v4

    iput-wide v4, v3, Le7/i6$b;->c:J

    .line 68
    :goto_4
    iget-object v0, v2, Le7/i6;->c:Le7/o;

    invoke-static {v0}, Le7/i6;->q(Le7/h6;)V

    .line 69
    iget-wide v1, v1, Le7/e;->a:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Le7/o;->e0(Ljava/lang/Long;)V

    :cond_8
    :goto_5
    return-void

    :catchall_1
    move-exception v0

    move-object v5, v4

    :goto_6
    if-eqz v5, :cond_9

    .line 70
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_9
    throw v0
.end method

.method public static zza(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Le7/d6;Le7/s0;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->c0()V

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 74
    invoke-virtual {v0}, Le7/i6;->R()Le7/h;

    move-result-object v3

    .line 75
    sget-object v4, Le7/h0;->K0:Le7/m0;

    const/4 v5, 0x0

    .line 76
    invoke-virtual {v3, v5, v4}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 77
    new-instance v0, Le7/f6;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v3}, Le7/f6;-><init>(Ljava/util/List;)V

    goto/16 :goto_3

    .line 78
    :cond_0
    invoke-static {v0}, La0/j;->q(Le7/i6;)V

    .line 79
    iget-object v3, v0, Le7/i6;->c:Le7/o;

    invoke-static {v3}, Le7/i6;->q(Le7/h6;)V

    .line 80
    sget-object v4, Le7/h0;->x:Le7/m0;

    invoke-virtual {v4, v5}, Le7/m0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    move-object/from16 v5, p2

    invoke-virtual {v3, v2, v5, v4}, Le7/o;->C(Ljava/lang/String;Le7/d6;I)Ljava/util/List;

    move-result-object v3

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le7/n6;

    .line 81
    iget-object v6, v5, Le7/n6;->c:Ljava/lang/String;

    .line 82
    invoke-virtual {v0, v6}, Le7/i6;->V(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 83
    new-instance v12, Landroid/os/Bundle;

    invoke-direct {v12}, Landroid/os/Bundle;-><init>()V

    iget-object v6, v5, Le7/n6;->d:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v12, v8, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    new-instance v6, Le7/b6;

    iget-wide v8, v5, Le7/n6;->a:J

    iget-object v7, v5, Le7/n6;->b:Lcom/google/android/gms/internal/measurement/zzgf$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzio;->zzce()[B

    move-result-object v10

    iget-object v11, v5, Le7/n6;->c:Ljava/lang/String;

    iget v7, v5, Le7/n6;->e:I

    .line 84
    invoke-static {v7}, Lg;->a(I)I

    move-result v13

    .line 85
    iget-wide v14, v5, Le7/n6;->f:J

    const-string v16, ""

    move-object v7, v6

    .line 86
    invoke-direct/range {v7 .. v16}, Le7/b6;-><init>(J[BLjava/lang/String;Landroid/os/Bundle;IJLjava/lang/String;)V

    .line 87
    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzgf$zzj;->zzb()Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;

    move-result-object v5

    iget-object v7, v6, Le7/b6;->b:[B

    invoke-static {v5, v7}, Le7/o6;->z(Lcom/google/android/gms/internal/measurement/zzkg$zza;[B)Lcom/google/android/gms/internal/measurement/zzlp;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;

    const/4 v7, 0x0

    :goto_2
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;->zza()I

    move-result v8

    if-ge v7, v8, :cond_3

    invoke-virtual {v5, v7}, Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;->zza(I)Lcom/google/android/gms/internal/measurement/zzgf$zzk;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzkg;->zzch()Lcom/google/android/gms/internal/measurement/zzkg$zza;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzgf$zzk$zza;

    invoke-virtual {v0}, Le7/i6;->zzb()Lv6/b;

    move-result-object v9

    check-cast v9, Lb/z;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    .line 89
    invoke-virtual {v8, v9, v10}, Lcom/google/android/gms/internal/measurement/zzgf$zzk$zza;->zzl(J)Lcom/google/android/gms/internal/measurement/zzgf$zzk$zza;

    move-result-object v8

    invoke-virtual {v5, v7, v8}, Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;->zza(ILcom/google/android/gms/internal/measurement/zzgf$zzk$zza;)Lcom/google/android/gms/internal/measurement/zzgf$zzj$zzb;

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkg$zza;->zzaj()Lcom/google/android/gms/internal/measurement/zzlm;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzkg;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzgf$zzj;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzio;->zzce()[B

    move-result-object v7

    iput-object v7, v6, Le7/b6;->b:[B

    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    move-result-object v7

    const/4 v8, 0x2

    invoke-virtual {v7, v8}, Le7/a1;->u(I)Z

    move-result v7

    if-eqz v7, :cond_4

    .line 90
    iget-object v7, v0, Le7/i6;->o:Le7/o6;

    invoke-static {v7}, Le7/i6;->q(Le7/h6;)V

    .line 91
    invoke-virtual {v5}, Lcom/google/android/gms/internal/measurement/zzkg$zza;->zzaj()Lcom/google/android/gms/internal/measurement/zzlm;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzkg;

    check-cast v5, Lcom/google/android/gms/internal/measurement/zzgf$zzj;

    invoke-virtual {v7, v5}, Le7/o6;->C(Lcom/google/android/gms/internal/measurement/zzgf$zzj;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v6, Le7/b6;->o:Ljava/lang/String;
    :try_end_0
    .catch Lcom/google/android/gms/internal/measurement/zzkp; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :catch_0
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    move-result-object v5

    .line 92
    iget-object v5, v5, Le7/a1;->r:Le7/b1;

    const-string v6, "Failed to parse queued batch. appId"

    .line 93
    invoke-virtual {v5, v6, v2}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_5
    new-instance v0, Le7/f6;

    invoke-direct {v0, v4}, Le7/f6;-><init>(Ljava/util/List;)V

    :goto_3
    move-object/from16 v3, p3

    .line 94
    :try_start_1
    invoke-interface {v3, v0}, Le7/s0;->E(Le7/f6;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    move-object v3, v0

    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    move-result-object v0

    .line 95
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    const-string v1, "[sgtm] Failed to return upload batches for app"

    .line 96
    invoke-virtual {v0, v1, v2, v3}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->c0()V

    iget-object p0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {p0, p1}, Le7/i6;->U(Le7/k6;)V

    return-void
.end method


# virtual methods
.method public final C(Le7/k6;)V
    .locals 2

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p1, Le7/k6;->C:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Le7/r2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Le7/r2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final E0(Le7/k6;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/l2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Le7/l2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final F(Le7/f;Le7/k6;)V
    .locals 1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p1, Le7/f;->c:Le7/q6;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/f;

    invoke-direct {v0, p1}, Le7/f;-><init>(Le7/f;)V

    iget-object p1, p2, Le7/k6;->a:Ljava/lang/String;

    iput-object p1, v0, Le7/f;->a:Ljava/lang/String;

    new-instance p1, Le7/k2;

    invoke-direct {p1, p0, v0, p2}, Le7/k2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/f;Le7/k6;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final M1(Le7/k6;Le7/e;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/i6;->R()Le7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Le7/h0;->K0:Le7/m0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2, v1}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, Le7/k2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1, p2}, Le7/k2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Le7/e;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public final M2(Le7/k6;)V
    .locals 2

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    new-instance v0, Le7/l2;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, v1}, Le7/l2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final N1(Le7/k6;Le7/d6;Le7/s0;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 2
    .line 3
    invoke-virtual {v0}, Le7/i6;->R()Le7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Le7/h0;->K0:Le7/m0;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, v2, v1}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, p1, Le7/k6;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 26
    .line 27
    invoke-virtual {p1}, Le7/i6;->zzl()Le7/e2;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance v0, Le7/o2;

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v1, v0

    .line 35
    move-object v2, p0

    .line 36
    move-object v4, p2

    .line 37
    move-object v5, p3

    .line 38
    invoke-direct/range {v1 .. v6}, Le7/o2;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ln6/a;Ljava/lang/Object;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Le7/e2;->u(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final O2(Ljava/lang/String;Ljava/lang/String;ZLe7/k6;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z",
            "Le7/k6;",
            ")",
            "Ljava/util/List<",
            "Le7/q6;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p4}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p4, Le7/k6;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 10
    .line 11
    invoke-virtual {v1}, Le7/i6;->zzl()Le7/e2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v2, Le7/u2;

    .line 16
    .line 17
    invoke-direct {v2, p0, v0, p1, p2}, Le7/u2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/util/List;

    .line 29
    .line 30
    new-instance p2, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Le7/s6;

    .line 54
    .line 55
    if-nez p3, :cond_1

    .line 56
    .line 57
    iget-object v1, v0, Le7/s6;->c:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1}, Le7/r6;->r0(Ljava/lang/String;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_0

    .line 64
    .line 65
    :cond_1
    new-instance v1, Le7/q6;

    .line 66
    .line 67
    invoke-direct {v1, v0}, Le7/q6;-><init>(Le7/s6;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    return-object p2

    .line 75
    :catch_0
    move-exception p1

    .line 76
    goto :goto_1

    .line 77
    :catch_1
    move-exception p1

    .line 78
    :goto_1
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 79
    .line 80
    invoke-virtual {p2}, Le7/i6;->zzj()Le7/a1;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iget-object p2, p2, Le7/a1;->o:Le7/b1;

    .line 85
    .line 86
    iget-object p3, p4, Le7/k6;->a:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {p3}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    const-string p4, "Failed to query user properties. appId"

    .line 93
    .line 94
    invoke-virtual {p2, p4, p3, p1}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    return-object p1
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final T2(Ljava/lang/String;Ljava/lang/String;Le7/k6;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Le7/k6;",
            ")",
            "Ljava/util/List<",
            "Le7/f;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p3}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 2
    .line 3
    .line 4
    iget-object p3, p3, Le7/k6;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {p3}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 10
    .line 11
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Le7/w2;

    .line 16
    .line 17
    invoke-direct {v1, p0, p3, p1, p2}, Le7/w2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    return-object p1

    .line 31
    :catch_0
    move-exception p1

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception p1

    .line 34
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 35
    .line 36
    invoke-virtual {p2}, Le7/i6;->zzj()Le7/a1;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object p2, p2, Le7/a1;->o:Le7/b1;

    .line 41
    .line 42
    const-string p3, "Failed to get conditional user properties"

    .line 43
    .line 44
    invoke-virtual {p2, p3, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final V(Le7/f0;Le7/k6;)V
    .locals 2

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/x2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p2, v1}, Le7/x2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/f0;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final V1(Le7/k6;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 5
    .line 6
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    new-instance v2, Le7/y2;

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v2, v0, p1, v3}, Le7/y2;-><init>(Ljava/lang/Object;Le7/k6;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    const-wide/16 v3, 0x7530

    .line 23
    .line 24
    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catch_0
    move-exception v1

    .line 32
    goto :goto_0

    .line 33
    :catch_1
    move-exception v1

    .line 34
    goto :goto_0

    .line 35
    :catch_2
    move-exception v1

    .line 36
    :goto_0
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 41
    .line 42
    iget-object p1, p1, Le7/k6;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {p1}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string v2, "Failed to get app instance id. appId"

    .line 49
    .line 50
    invoke-virtual {v0, v2, p1, v1}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_1
    return-object v1
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final V2(Le7/f0;Ljava/lang/String;)[B
    .locals 9

    .line 1
    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p2, v0}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 12
    .line 13
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Le7/a1;->v:Le7/b1;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 20
    .line 21
    iget-object v1, v1, Le7/i6;->t:Le7/j2;

    .line 22
    .line 23
    iget-object v1, v1, Le7/j2;->u:Le7/x0;

    .line 24
    .line 25
    iget-object v2, p1, Le7/f0;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Le7/x0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "Log and bundle. event"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 37
    .line 38
    invoke-virtual {v0}, Le7/i6;->zzb()Lv6/b;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lb/z;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-wide/32 v2, 0xf4240

    .line 52
    .line 53
    .line 54
    div-long/2addr v0, v2

    .line 55
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 56
    .line 57
    invoke-virtual {v4}, Le7/i6;->zzl()Le7/e2;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    new-instance v5, Le7/z2;

    .line 62
    .line 63
    invoke-direct {v5, p0, p1, p2}, Le7/z2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/f0;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v5}, Le7/e2;->t(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    :try_start_0
    invoke-virtual {v4}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    check-cast v4, [B

    .line 75
    .line 76
    if-nez v4, :cond_0

    .line 77
    .line 78
    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 79
    .line 80
    invoke-virtual {v4}, Le7/i6;->zzj()Le7/a1;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iget-object v4, v4, Le7/a1;->o:Le7/b1;

    .line 85
    .line 86
    const-string v5, "Log and bundle returned null. appId"

    .line 87
    .line 88
    invoke-static {p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 89
    .line 90
    .line 91
    move-result-object v6

    .line 92
    invoke-virtual {v4, v5, v6}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    const/4 v4, 0x0

    .line 96
    new-array v4, v4, [B

    .line 97
    .line 98
    :cond_0
    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 99
    .line 100
    invoke-virtual {v5}, Le7/i6;->zzb()Lv6/b;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    check-cast v5, Lb/z;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 110
    .line 111
    .line 112
    move-result-wide v5

    .line 113
    div-long/2addr v5, v2

    .line 114
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 115
    .line 116
    invoke-virtual {v2}, Le7/i6;->zzj()Le7/a1;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object v2, v2, Le7/a1;->v:Le7/b1;

    .line 121
    .line 122
    const-string v3, "Log and bundle processed. event, size, time_ms"

    .line 123
    .line 124
    iget-object v7, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 125
    .line 126
    iget-object v7, v7, Le7/i6;->t:Le7/j2;

    .line 127
    .line 128
    iget-object v7, v7, Le7/j2;->u:Le7/x0;

    .line 129
    .line 130
    iget-object v8, p1, Le7/f0;->a:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v7, v8}, Le7/x0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    array-length v8, v4

    .line 137
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object v8

    .line 141
    sub-long/2addr v5, v0

    .line 142
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v2, v7, v8, v0, v3}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 147
    .line 148
    .line 149
    return-object v4

    .line 150
    :catch_0
    move-exception v0

    .line 151
    goto :goto_0

    .line 152
    :catch_1
    move-exception v0

    .line 153
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 154
    .line 155
    invoke-virtual {v1}, Le7/i6;->zzj()Le7/a1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 160
    .line 161
    invoke-static {p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 166
    .line 167
    iget-object v2, v2, Le7/i6;->t:Le7/j2;

    .line 168
    .line 169
    iget-object v2, v2, Le7/j2;->u:Le7/x0;

    .line 170
    .line 171
    iget-object p1, p1, Le7/f0;->a:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v2, p1}, Le7/x0;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    const-string v2, "Failed to log and bundle. appId, event, error"

    .line 178
    .line 179
    invoke-virtual {v1, p2, p1, v0, v2}, Le7/b1;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    const/4 p1, 0x0

    .line 183
    return-object p1
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final Y1(Le7/k6;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/r2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le7/r2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d1(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v7, Le7/q2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p4

    move-object v3, p5

    move-object v4, p3

    move-wide v5, p1

    invoke-direct/range {v0 .. v6}, Le7/q2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    invoke-virtual {p0, v7}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final d3(Ljava/lang/String;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_3

    .line 10
    .line 11
    :try_start_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->b:Ljava/lang/Boolean;

    .line 12
    .line 13
    if-nez p2, :cond_2

    .line 14
    .line 15
    const-string p2, "com.google.android.gms"

    .line 16
    .line 17
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/zzig;->c:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 26
    .line 27
    iget-object p2, p2, Le7/i6;->t:Le7/j2;

    .line 28
    .line 29
    iget-object p2, p2, Le7/j2;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {p2, v2}, Lv6/h;->a(Landroid/content/Context;I)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 42
    .line 43
    iget-object p2, p2, Le7/i6;->t:Le7/j2;

    .line 44
    .line 45
    iget-object p2, p2, Le7/j2;->a:Landroid/content/Context;

    .line 46
    .line 47
    invoke-static {p2}, Lj6/k;->a(Landroid/content/Context;)Lj6/k;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {p2, v2}, Lj6/k;->b(I)Z

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    if-eqz p2, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move p2, v0

    .line 63
    goto :goto_1

    .line 64
    :cond_1
    :goto_0
    move p2, v1

    .line 65
    :goto_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->b:Ljava/lang/Boolean;

    .line 70
    .line 71
    :cond_2
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->b:Ljava/lang/Boolean;

    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 74
    .line 75
    .line 76
    move-result p2

    .line 77
    if-nez p2, :cond_5

    .line 78
    .line 79
    :cond_3
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->c:Ljava/lang/String;

    .line 80
    .line 81
    if-nez p2, :cond_4

    .line 82
    .line 83
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 84
    .line 85
    iget-object p2, p2, Le7/i6;->t:Le7/j2;

    .line 86
    .line 87
    iget-object p2, p2, Le7/j2;->a:Landroid/content/Context;

    .line 88
    .line 89
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    sget-object v3, Lj6/j;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 94
    .line 95
    invoke-static {p2, p1, v2}, Lv6/h;->b(Landroid/content/Context;Ljava/lang/String;I)Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_4

    .line 100
    .line 101
    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->c:Ljava/lang/String;

    .line 102
    .line 103
    :cond_4
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->c:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p2

    .line 109
    if-eqz p2, :cond_6

    .line 110
    .line 111
    :cond_5
    return-void

    .line 112
    :cond_6
    new-instance p2, Ljava/lang/SecurityException;

    .line 113
    .line 114
    const-string v2, "Unknown calling package name \'%s\'."

    .line 115
    .line 116
    new-array v1, v1, [Ljava/lang/Object;

    .line 117
    .line 118
    aput-object p1, v1, v0

    .line 119
    .line 120
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p2, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p2
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 128
    :catch_0
    move-exception p2

    .line 129
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 130
    .line 131
    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 136
    .line 137
    invoke-static {p1}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string v1, "Measurement Service called with invalid calling package. appId"

    .line 142
    .line 143
    invoke-virtual {v0, v1, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    throw p2

    .line 147
    :cond_7
    iget-object p1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 148
    .line 149
    invoke-virtual {p1}, Le7/i6;->zzj()Le7/a1;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    iget-object p1, p1, Le7/a1;->o:Le7/b1;

    .line 154
    .line 155
    const-string p2, "Measurement Service called without app package"

    .line 156
    .line 157
    invoke-virtual {p1, p2}, Le7/b1;->b(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    new-instance p1, Ljava/lang/SecurityException;

    .line 161
    .line 162
    invoke-direct {p1, p2}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    throw p1
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
.end method

.method public final e3(Le7/k6;)V
    .locals 2

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->b0()Le7/r6;

    move-result-object v0

    iget-object v1, p1, Le7/k6;->b:Ljava/lang/String;

    iget-object p1, p1, Le7/k6;->x:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Le7/r6;->V(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method public final f3(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le7/e2;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g(Le7/f0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-static {p2}, Lm6/j;->e(Ljava/lang/String;)V

    const/4 p3, 0x1

    invoke-virtual {p0, p2, p3}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    new-instance v0, Le7/x2;

    invoke-direct {v0, p0, p1, p2, p3}, Le7/x2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/f0;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final g0(Le7/q6;Le7/k6;)V
    .locals 2

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/v1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p2, v1}, Le7/v1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final h0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Z)",
            "Ljava/util/List<",
            "Le7/q6;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 6
    .line 7
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Le7/t2;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, Le7/t2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    :try_start_0
    invoke-virtual {p2}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    check-cast p2, Ljava/util/List;

    .line 25
    .line 26
    new-instance p3, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-direct {p3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Le7/s6;

    .line 50
    .line 51
    if-nez p4, :cond_1

    .line 52
    .line 53
    iget-object v1, v0, Le7/s6;->c:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v1}, Le7/r6;->r0(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_0

    .line 60
    .line 61
    :cond_1
    new-instance v1, Le7/q6;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Le7/q6;-><init>(Le7/s6;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    return-object p3

    .line 71
    :catch_0
    move-exception p2

    .line 72
    goto :goto_1

    .line 73
    :catch_1
    move-exception p2

    .line 74
    :goto_1
    iget-object p3, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 75
    .line 76
    invoke-virtual {p3}, Le7/i6;->zzj()Le7/a1;

    .line 77
    .line 78
    .line 79
    move-result-object p3

    .line 80
    iget-object p3, p3, Le7/a1;->o:Le7/b1;

    .line 81
    .line 82
    invoke-static {p1}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    const-string p4, "Failed to get user properties as. appId"

    .line 87
    .line 88
    invoke-virtual {p3, p4, p1, p2}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final h1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Le7/f;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/measurement/internal/zzig;->d3(Ljava/lang/String;Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 6
    .line 7
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Le7/v2;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2, p3}, Le7/v2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :try_start_0
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    .line 26
    return-object p1

    .line 27
    :catch_0
    move-exception p1

    .line 28
    goto :goto_0

    .line 29
    :catch_1
    move-exception p1

    .line 30
    :goto_0
    iget-object p2, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 31
    .line 32
    invoke-virtual {p2}, Le7/i6;->zzj()Le7/a1;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-object p2, p2, Le7/a1;->o:Le7/b1;

    .line 37
    .line 38
    const-string p3, "Failed to get conditional user properties as"

    .line 39
    .line 40
    invoke-virtual {p2, p3, p1}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
.end method

.method public final h2(Le7/k6;Landroid/os/Bundle;Le7/p0;)V
    .locals 8

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    iget-object v5, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v5}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v6

    new-instance v7, Le7/m2;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Le7/m2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;Le7/p0;Ljava/lang/String;)V

    invoke-virtual {v6, v7}, Le7/e2;->u(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final k0(Le7/k6;)V
    .locals 2

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p1, Le7/k6;->C:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Le7/n2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le7/n2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final l1(Le7/k6;)V
    .locals 2

    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    iget-object v0, p1, Le7/k6;->C:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v0, Le7/l2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Le7/l2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->r(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final m(Landroid/os/Bundle;Le7/k6;)Ljava/util/List;
    .locals 3

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    iget-object v0, p2, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->R()Le7/h;

    move-result-object v0

    sget-object v1, Le7/h0;->d1:Le7/m0;

    const/4 v2, 0x0

    .line 1
    invoke-virtual {v0, v2, v1}, Le7/h;->x(Ljava/lang/String;Le7/m0;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    new-instance v1, Le7/a3;

    invoke-direct {v1, p0, p2, p1}, Le7/a3;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Le7/e2;->t(Ljava/util/concurrent/Callable;)Le7/i2;

    move-result-object p1

    const-wide/16 v0, 0x2710

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    new-instance v1, Le7/b3;

    invoke-direct {v1, p0, p2, p1}, Le7/b3;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;Landroid/os/Bundle;)V

    invoke-virtual {v0, v1}, Le7/e2;->p(Ljava/util/concurrent/Callable;)Le7/i2;

    move-result-object p1

    :try_start_1
    invoke-virtual {p1}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    move-exception p1

    goto :goto_0

    :catch_2
    move-exception p1

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzj()Le7/a1;

    move-result-object v0

    .line 3
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 4
    iget-object p2, p2, Le7/k6;->a:Ljava/lang/String;

    invoke-static {p2}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    move-result-object p2

    const-string v1, "Failed to get trigger URIs. appId"

    invoke-virtual {v0, v1, p2, p1}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final m(Landroid/os/Bundle;Le7/k6;)V
    .locals 2

    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    iget-object v0, p2, Le7/k6;->a:Ljava/lang/String;

    invoke-static {v0}, Lm6/j;->i(Ljava/lang/Object;)V

    new-instance v1, Le7/p2;

    invoke-direct {v1, p0, p1, v0, p2}, Le7/p2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Landroid/os/Bundle;Ljava/lang/String;Le7/k6;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0}, Le7/e2;->w()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    move-result-object v0

    invoke-virtual {v0, p1}, Le7/e2;->v(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final r2(Le7/k6;)V
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    new-instance v0, Le7/n2;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Le7/n2;-><init>(Lcom/google/android/gms/measurement/internal/zzig;Le7/k6;I)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/measurement/internal/zzig;->f3(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final v1(Le7/k6;)Le7/n;
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/android/gms/measurement/internal/zzig;->e3(Le7/k6;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Le7/k6;->a:Ljava/lang/String;

    .line 5
    .line 6
    invoke-static {v0}, Lm6/j;->e(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 10
    .line 11
    invoke-virtual {v0}, Le7/i6;->zzl()Le7/e2;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Le7/y2;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, p1, v2}, Le7/y2;-><init>(Ljava/lang/Object;Le7/k6;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Le7/e2;->t(Ljava/util/concurrent/Callable;)Le7/i2;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 26
    .line 27
    const-wide/16 v2, 0x2710

    .line 28
    .line 29
    invoke-virtual {v0, v2, v3, v1}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Le7/n;
    :try_end_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    return-object v0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception v0

    .line 39
    goto :goto_0

    .line 40
    :catch_2
    move-exception v0

    .line 41
    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/zzig;->a:Le7/i6;

    .line 42
    .line 43
    invoke-virtual {v1}, Le7/i6;->zzj()Le7/a1;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 48
    .line 49
    iget-object p1, p1, Le7/k6;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p1}, Le7/a1;->p(Ljava/lang/String;)Le7/e1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string v2, "Failed to get consent. appId"

    .line 56
    .line 57
    invoke-virtual {v1, v2, p1, v0}, Le7/b1;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Le7/n;

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-direct {p1, v0}, Le7/n;-><init>(Landroid/os/Bundle;)V

    .line 64
    .line 65
    .line 66
    return-object p1
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method
