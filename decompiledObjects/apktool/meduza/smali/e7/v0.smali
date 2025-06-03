.class public final Le7/v0;
.super Lcom/google/android/gms/internal/measurement/zzcj;
.source "SourceFile"


# instance fields
.field public final synthetic a:Le7/w0;


# direct methods
.method public constructor <init>(Le7/w0;Landroid/content/Context;)V
    .locals 2

    iput-object p1, p0, Le7/v0;->a:Le7/w0;

    const-string p1, "google_app_measurement_local.db"

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p2, p1, v0, v1}, Lcom/google/android/gms/internal/measurement/zzcj;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;I)V

    return-void
.end method


# virtual methods
.method public final getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    .line 1
    :try_start_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    .line 4
    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object v0

    .line 6
    :catch_0
    iget-object v0, p0, Le7/v0;->a:Le7/w0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v0, v0, Le7/a1;->o:Le7/b1;

    .line 13
    .line 14
    const-string v1, "Opening the local database failed, dropping and recreating it"

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Le7/b1;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "google_app_measurement_local.db"

    .line 20
    .line 21
    iget-object v1, p0, Le7/v0;->a:Le7/w0;

    .line 22
    .line 23
    invoke-virtual {v1}, Ld2/q;->zza()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Le7/v0;->a:Le7/w0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 44
    .line 45
    const-string v2, "Failed to delete corrupted local db file"

    .line 46
    .line 47
    invoke-virtual {v1, v2, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    :try_start_1
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 54
    return-object v0

    .line 55
    :catch_1
    move-exception v0

    .line 56
    iget-object v1, p0, Le7/v0;->a:Le7/w0;

    .line 57
    .line 58
    invoke-virtual {v1}, Ld2/q;->zzj()Le7/a1;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    iget-object v1, v1, Le7/a1;->o:Le7/b1;

    .line 63
    .line 64
    const-string v2, "Failed to open local database. Events will bypass local storage"

    .line 65
    .line 66
    invoke-virtual {v1, v2, v0}, Le7/b1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    return-object v0

    .line 71
    :catch_2
    move-exception v0

    .line 72
    throw v0
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
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 1

    iget-object v0, p0, Le7/v0;->a:Le7/w0;

    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    move-result-object v0

    invoke-static {v0, p1}, Le7/s;->b(Le7/a1;Landroid/database/sqlite/SQLiteDatabase;)V

    return-void
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    return-void
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 7

    iget-object v0, p0, Le7/v0;->a:Le7/w0;

    invoke-virtual {v0}, Ld2/q;->zzj()Le7/a1;

    move-result-object v1

    const-string v3, "messages"

    const-string v4, "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)"

    const-string v5, "type,entry"

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v6}, Le7/s;->c(Le7/a1;Landroid/database/sqlite/SQLiteDatabase;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 0

    return-void
.end method
