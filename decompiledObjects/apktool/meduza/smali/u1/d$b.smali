.class public final Lu1/d$b;
.super Landroid/database/sqlite/SQLiteOpenHelper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu1/d$b$a;,
        Lu1/d$b$b;
    }
.end annotation


# static fields
.field public static final synthetic p:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lu1/d$a;

.field public final c:Lt1/c$a;

.field public final d:Z

.field public e:Z

.field public final f:Lv1/a;

.field public o:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lu1/d$a;Lt1/c$a;Z)V
    .locals 7

    const-string v0, "context"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v5, p4, Lt1/c$a;->a:I

    new-instance v6, Lu1/e;

    invoke-direct {v6, p4, p3}, Lu1/e;-><init>(Lt1/c$a;Lu1/d$a;)V

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroid/database/sqlite/SQLiteOpenHelper;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;ILandroid/database/DatabaseErrorHandler;)V

    iput-object p1, p0, Lu1/d$b;->a:Landroid/content/Context;

    iput-object p3, p0, Lu1/d$b;->b:Lu1/d$a;

    iput-object p4, p0, Lu1/d$b;->c:Lt1/c$a;

    iput-boolean p5, p0, Lu1/d$b;->d:Z

    new-instance p3, Lv1/a;

    if-nez p2, :cond_0

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p4, "randomUUID().toString()"

    invoke-static {p2, p4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p1

    const-string p4, "context.cacheDir"

    invoke-static {p1, p4}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p4, 0x0

    invoke-direct {p3, p2, p1, p4}, Lv1/a;-><init>(Ljava/lang/String;Ljava/io/File;Z)V

    iput-object p3, p0, Lu1/d$b;->f:Lv1/a;

    return-void
.end method


# virtual methods
.method public final C(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 1

    const-string v0, "{\n                super.\u2026eDatabase()\n            }"

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    :goto_0
    invoke-static {p1, v0}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final H(Z)Landroid/database/sqlite/SQLiteDatabase;
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lu1/d$b;->a:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    new-instance v2, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v3, "Invalid database parent file, not a directory: "

    .line 34
    .line 35
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "SupportSQLite"

    .line 46
    .line 47
    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    :cond_0
    :try_start_0
    invoke-virtual {p0, p1}, Lu1/d$b;->C(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 51
    .line 52
    .line 53
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    return-object p1

    .line 55
    :catchall_0
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 56
    .line 57
    .line 58
    const-wide/16 v1, 0x1f4

    .line 59
    .line 60
    :try_start_1
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 61
    .line 62
    .line 63
    :catch_0
    :try_start_2
    invoke-virtual {p0, p1}, Lu1/d$b;->C(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 64
    .line 65
    .line 66
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 67
    return-object p1

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 70
    .line 71
    .line 72
    instance-of v2, v1, Lu1/d$b$a;

    .line 73
    .line 74
    if-eqz v2, :cond_3

    .line 75
    .line 76
    check-cast v1, Lu1/d$b$a;

    .line 77
    .line 78
    iget-object v2, v1, Lu1/d$b$a;->b:Ljava/lang/Throwable;

    .line 79
    .line 80
    iget v1, v1, Lu1/d$b$a;->a:I

    .line 81
    .line 82
    invoke-static {v1}, Lq0/g;->c(I)I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_2

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    if-eq v1, v3, :cond_2

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    if-eq v1, v3, :cond_2

    .line 93
    .line 94
    const/4 v3, 0x3

    .line 95
    if-eq v1, v3, :cond_2

    .line 96
    .line 97
    instance-of v1, v2, Landroid/database/sqlite/SQLiteException;

    .line 98
    .line 99
    if-eqz v1, :cond_1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_1
    throw v2

    .line 103
    :cond_2
    throw v2

    .line 104
    :cond_3
    instance-of v2, v1, Landroid/database/sqlite/SQLiteException;

    .line 105
    .line 106
    if-eqz v2, :cond_5

    .line 107
    .line 108
    if-eqz v0, :cond_4

    .line 109
    .line 110
    iget-boolean v2, p0, Lu1/d$b;->d:Z

    .line 111
    .line 112
    if-eqz v2, :cond_4

    .line 113
    .line 114
    :goto_0
    iget-object v1, p0, Lu1/d$b;->a:Landroid/content/Context;

    .line 115
    .line 116
    invoke-virtual {v1, v0}, Landroid/content/Context;->deleteDatabase(Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    :try_start_3
    invoke-virtual {p0, p1}, Lu1/d$b;->C(Z)Landroid/database/sqlite/SQLiteDatabase;

    .line 120
    .line 121
    .line 122
    move-result-object p1
    :try_end_3
    .catch Lu1/d$b$a; {:try_start_3 .. :try_end_3} :catch_1

    .line 123
    return-object p1

    .line 124
    :catch_1
    move-exception p1

    .line 125
    iget-object p1, p1, Lu1/d$b$a;->b:Ljava/lang/Throwable;

    .line 126
    .line 127
    throw p1

    .line 128
    :cond_4
    throw v1

    .line 129
    :cond_5
    throw v1
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
.end method

.method public final close()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-boolean v3, v0, Lv1/a;->a:Z

    .line 6
    .line 7
    invoke-virtual {v0, v3}, Lv1/a;->a(Z)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->close()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lu1/d$b;->b:Lu1/d$a;

    .line 14
    .line 15
    iput-object v1, v0, Lu1/d$a;->a:Lu1/c;

    .line 16
    .line 17
    iput-boolean v2, p0, Lu1/d$b;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    .line 20
    .line 21
    invoke-virtual {v0}, Lv1/a;->b()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    iget-object v1, p0, Lu1/d$b;->f:Lv1/a;

    .line 27
    .line 28
    invoke-virtual {v1}, Lv1/a;->b()V

    .line 29
    .line 30
    .line 31
    throw v0
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
.end method

.method public final f(Z)Lt1/b;
    .locals 3

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    iget-boolean v1, p0, Lu1/d$b;->o:Z

    const/4 v2, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteOpenHelper;->getDatabaseName()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lv1/a;->a(Z)V

    iput-boolean v2, p0, Lu1/d$b;->e:Z

    invoke-virtual {p0, p1}, Lu1/d$b;->H(Z)Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    iget-boolean v1, p0, Lu1/d$b;->e:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lu1/d$b;->close()V

    invoke-virtual {p0, p1}, Lu1/d$b;->f(Z)Lt1/b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    invoke-virtual {v0}, Lv1/a;->b()V

    return-object p1

    :cond_1
    :try_start_1
    invoke-virtual {p0, v0}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    invoke-virtual {v0}, Lv1/a;->b()V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lu1/d$b;->f:Lv1/a;

    invoke-virtual {v0}, Lv1/a;->b()V

    throw p1
.end method

.method public final g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;
    .locals 1

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu1/d$b;->b:Lu1/d$a;

    invoke-static {v0, p1}, Lu1/d$b$b;->a(Lu1/d$a;Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    return-object p1
.end method

.method public final onConfigure(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->c:Lt1/c$a;

    invoke-virtual {p0, p1}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt1/c$a;->b(Lu1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lu1/d$b$a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lu1/d$b$a;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public final onCreate(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->c:Lt1/c$a;

    invoke-virtual {p0, p1}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt1/c$a;->c(Lu1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance v0, Lu1/d$b$a;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lu1/d$b$a;-><init>(ILjava/lang/Throwable;)V

    throw v0
.end method

.method public final onDowngrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "db"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/d$b;->e:Z

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->c:Lt1/c$a;

    invoke-virtual {p0, p1}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lt1/c$a;->d(Lu1/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lu1/d$b$a;

    const/4 p3, 0x4

    invoke-direct {p2, p3, p1}, Lu1/d$b$a;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method

.method public final onOpen(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    const-string v0, "db"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lu1/d$b;->e:Z

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->c:Lt1/c$a;

    invoke-virtual {p0, p1}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt1/c$a;->e(Lu1/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Lu1/d$b$a;

    const/4 v1, 0x5

    invoke-direct {v0, v1, p1}, Lu1/d$b$a;-><init>(ILjava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lu1/d$b;->o:Z

    return-void
.end method

.method public final onUpgrade(Landroid/database/sqlite/SQLiteDatabase;II)V
    .locals 1

    const-string v0, "sqLiteDatabase"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/d$b;->e:Z

    :try_start_0
    iget-object v0, p0, Lu1/d$b;->c:Lt1/c$a;

    invoke-virtual {p0, p1}, Lu1/d$b;->g(Landroid/database/sqlite/SQLiteDatabase;)Lu1/c;

    move-result-object p1

    invoke-virtual {v0, p1, p2, p3}, Lt1/c$a;->f(Lu1/c;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    new-instance p2, Lu1/d$b$a;

    const/4 p3, 0x3

    invoke-direct {p2, p3, p1}, Lu1/d$b$a;-><init>(ILjava/lang/Throwable;)V

    throw p2
.end method
