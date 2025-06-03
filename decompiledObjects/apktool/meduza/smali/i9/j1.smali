.class public final Li9/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/l1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li9/j1$a;
    }
.end annotation


# instance fields
.field public final a:Li9/y0;

.field public final b:Li9/i;

.field public c:I

.field public d:J

.field public e:Lj9/q;

.field public f:J


# direct methods
.method public constructor <init>(Li9/y0;Li9/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lj9/q;->b:Lj9/q;

    iput-object v0, p0, Li9/j1;->e:Lj9/q;

    iput-object p1, p0, Li9/j1;->a:Li9/y0;

    iput-object p2, p0, Li9/j1;->b:Li9/i;

    return-void
.end method


# virtual methods
.method public final a(Lg9/k0;)Li9/m1;
    .locals 5

    .line 1
    invoke-virtual {p1}, Lg9/k0;->b()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Li9/j1;->a:Li9/y0;

    .line 6
    .line 7
    const-string v2, "SELECT target_proto FROM targets WHERE canonical_id = ?"

    .line 8
    .line 9
    invoke-virtual {v1, v2}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x1

    .line 14
    new-array v2, v2, [Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    aput-object v0, v2, v3

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Li9/y0$d;->a([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Li9/y0$d;->e()Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/4 v1, 0x0

    .line 27
    :cond_0
    :goto_0
    :try_start_0
    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_1

    .line 32
    .line 33
    invoke-interface {v0, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {p0, v2}, Li9/j1;->k([B)Li9/m1;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v4, v2, Li9/m1;->a:Lg9/k0;

    .line 42
    .line 43
    invoke-virtual {p1, v4}, Lg9/k0;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    if-eqz v4, :cond_0

    .line 48
    .line 49
    move-object v1, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :catchall_1
    move-exception v0

    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    :goto_1
    throw p1
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

.method public final b(Lt8/e;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e<",
            "Lj9/i;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/j1;->a:Li9/y0;

    .line 2
    .line 3
    iget-object v0, v0, Li9/y0;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    const-string v1, "INSERT OR IGNORE INTO target_documents (target_id, path) VALUES (?, ?)"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Li9/j1;->a:Li9/y0;

    .line 12
    .line 13
    iget-object v1, v1, Li9/y0;->g:Li9/v0;

    .line 14
    .line 15
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    move-object v2, p1

    .line 20
    check-cast v2, Lt8/e$a;

    .line 21
    .line 22
    invoke-virtual {v2}, Lt8/e$a;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lj9/i;

    .line 33
    .line 34
    iget-object v3, v2, Lj9/i;->a:Lj9/o;

    .line 35
    .line 36
    invoke-static {v3}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, p0, Li9/j1;->a:Li9/y0;

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    new-array v5, v5, [Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    aput-object v7, v5, v6

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    aput-object v3, v5, v6

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v5}, Li9/y0;->F(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Li9/v0;->p(Lj9/i;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-void
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

.method public final c(Li9/m1;)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Li9/j1;->l(Li9/m1;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Li9/m1;->b:I

    .line 5
    .line 6
    iget v1, p0, Li9/j1;->c:I

    .line 7
    .line 8
    if-le v0, v1, :cond_0

    .line 9
    .line 10
    iput v0, p0, Li9/j1;->c:I

    .line 11
    .line 12
    :cond_0
    iget-wide v0, p1, Li9/m1;->c:J

    .line 13
    .line 14
    iget-wide v2, p0, Li9/j1;->d:J

    .line 15
    .line 16
    cmp-long p1, v0, v2

    .line 17
    .line 18
    if-lez p1, :cond_1

    .line 19
    .line 20
    iput-wide v0, p0, Li9/j1;->d:J

    .line 21
    .line 22
    :cond_1
    iget-wide v0, p0, Li9/j1;->f:J

    .line 23
    .line 24
    const-wide/16 v2, 0x1

    .line 25
    .line 26
    add-long/2addr v0, v2

    .line 27
    iput-wide v0, p0, Li9/j1;->f:J

    .line 28
    .line 29
    invoke-virtual {p0}, Li9/j1;->m()V

    .line 30
    .line 31
    .line 32
    return-void
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
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Li9/j1;->c:I

    return v0
.end method

.method public final e(Lt8/e;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e<",
            "Lj9/i;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Li9/j1;->a:Li9/y0;

    .line 2
    .line 3
    iget-object v0, v0, Li9/y0;->i:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    const-string v1, "DELETE FROM target_documents WHERE target_id = ? AND path = ?"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Li9/j1;->a:Li9/y0;

    .line 12
    .line 13
    iget-object v1, v1, Li9/y0;->g:Li9/v0;

    .line 14
    .line 15
    invoke-virtual {p1}, Lt8/e;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    move-object v2, p1

    .line 20
    check-cast v2, Lt8/e$a;

    .line 21
    .line 22
    invoke-virtual {v2}, Lt8/e$a;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, Lt8/e$a;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lj9/i;

    .line 33
    .line 34
    iget-object v3, v2, Lj9/i;->a:Lj9/o;

    .line 35
    .line 36
    invoke-static {v3}, Lp2/m0;->A(Lj9/e;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget-object v4, p0, Li9/j1;->a:Li9/y0;

    .line 41
    .line 42
    const/4 v5, 0x2

    .line 43
    new-array v5, v5, [Ljava/lang/Object;

    .line 44
    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    aput-object v7, v5, v6

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    aput-object v3, v5, v6

    .line 54
    .line 55
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v5}, Li9/y0;->F(Landroid/database/sqlite/SQLiteStatement;[Ljava/lang/Object;)I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Li9/v0;->p(Lj9/i;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    return-void
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

.method public final f(I)Lt8/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lt8/e<",
            "Lj9/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Li9/j1$a;

    invoke-direct {v0}, Li9/j1$a;-><init>()V

    iget-object v1, p0, Li9/j1;->a:Li9/y0;

    const-string v2, "SELECT path FROM target_documents WHERE target_id = ?"

    invoke-virtual {v1, v2}, Li9/y0;->H(Ljava/lang/String;)Li9/y0$d;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v1, v2}, Li9/y0$d;->a([Ljava/lang/Object;)V

    new-instance p1, Li9/l;

    const/4 v2, 0x3

    invoke-direct {p1, v0, v2}, Li9/l;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, p1}, Li9/y0$d;->d(Ln9/d;)I

    iget-object p1, v0, Li9/j1$a;->a:Lt8/e;

    return-object p1
.end method

.method public final g()Lj9/q;
    .locals 1

    iget-object v0, p0, Li9/j1;->e:Lj9/q;

    return-object v0
.end method

.method public final h(Li9/m1;)V
    .locals 7

    .line 1
    invoke-virtual {p0, p1}, Li9/j1;->l(Li9/m1;)V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Li9/m1;->b:I

    .line 5
    .line 6
    iget v1, p0, Li9/j1;->c:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    if-le v0, v1, :cond_0

    .line 10
    .line 11
    iput v0, p0, Li9/j1;->c:I

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-wide v3, p1, Li9/m1;->c:J

    .line 17
    .line 18
    iget-wide v5, p0, Li9/j1;->d:J

    .line 19
    .line 20
    cmp-long p1, v3, v5

    .line 21
    .line 22
    if-lez p1, :cond_1

    .line 23
    .line 24
    iput-wide v3, p0, Li9/j1;->d:J

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v2, v0

    .line 28
    :goto_1
    if-eqz v2, :cond_2

    .line 29
    .line 30
    invoke-virtual {p0}, Li9/j1;->m()V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
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
.end method

.method public final i(I)V
    .locals 3

    iget-object v0, p0, Li9/j1;->a:Li9/y0;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "DELETE FROM target_documents WHERE target_id = ?"

    invoke-virtual {v0, p1, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final j(Lj9/q;)V
    .locals 0

    iput-object p1, p0, Li9/j1;->e:Lj9/q;

    invoke-virtual {p0}, Li9/j1;->m()V

    return-void
.end method

.method public final k([B)Li9/m1;
    .locals 2

    :try_start_0
    iget-object v0, p0, Li9/j1;->b:Li9/i;

    invoke-static {p1}, Ll9/c;->X([B)Ll9/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Li9/i;->d(Ll9/c;)Li9/m1;

    move-result-object p1
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "TargetData failed to parse: %s"

    invoke-static {p1, v0}, Lx6/b;->T(Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final l(Li9/m1;)V
    .locals 7

    .line 1
    iget v0, p1, Li9/m1;->b:I

    .line 2
    .line 3
    iget-object v1, p1, Li9/m1;->a:Lg9/k0;

    .line 4
    .line 5
    invoke-virtual {v1}, Lg9/k0;->b()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, p1, Li9/m1;->e:Lj9/q;

    .line 10
    .line 11
    iget-object v2, v2, Lj9/q;->a:Lu7/m;

    .line 12
    .line 13
    iget-object v3, p0, Li9/j1;->b:Li9/i;

    .line 14
    .line 15
    invoke-virtual {v3, p1}, Li9/i;->g(Li9/m1;)Ll9/c;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, Li9/j1;->a:Li9/y0;

    .line 20
    .line 21
    const/4 v5, 0x7

    .line 22
    new-array v5, v5, [Ljava/lang/Object;

    .line 23
    .line 24
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v6, 0x0

    .line 29
    aput-object v0, v5, v6

    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    aput-object v1, v5, v0

    .line 33
    .line 34
    iget-wide v0, v2, Lu7/m;->a:J

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const/4 v1, 0x2

    .line 41
    aput-object v0, v5, v1

    .line 42
    .line 43
    iget v0, v2, Lu7/m;->b:I

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const/4 v1, 0x3

    .line 50
    aput-object v0, v5, v1

    .line 51
    .line 52
    iget-object v0, p1, Li9/m1;->g:Lma/h;

    .line 53
    .line 54
    invoke-virtual {v0}, Lma/h;->z()[B

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const/4 v1, 0x4

    .line 59
    aput-object v0, v5, v1

    .line 60
    .line 61
    iget-wide v0, p1, Li9/m1;->c:J

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const/4 v0, 0x5

    .line 68
    aput-object p1, v5, v0

    .line 69
    .line 70
    invoke-virtual {v3}, Lma/a;->j()[B

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const/4 v0, 0x6

    .line 75
    aput-object p1, v5, v0

    .line 76
    .line 77
    const-string p1, "INSERT OR REPLACE INTO targets (target_id, canonical_id, snapshot_version_seconds, snapshot_version_nanos, resume_token, last_listen_sequence_number, target_proto) VALUES (?, ?, ?, ?, ?, ?, ?)"

    .line 78
    .line 79
    invoke-virtual {v4, p1, v5}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void
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
.end method

.method public final m()V
    .locals 5

    .line 1
    iget-object v0, p0, Li9/j1;->a:Li9/y0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    iget v2, p0, Li9/j1;->c:I

    .line 7
    .line 8
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    iget-wide v2, p0, Li9/j1;->d:J

    .line 16
    .line 17
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    aput-object v2, v1, v3

    .line 23
    .line 24
    iget-object v2, p0, Li9/j1;->e:Lj9/q;

    .line 25
    .line 26
    iget-object v2, v2, Lj9/q;->a:Lu7/m;

    .line 27
    .line 28
    iget-wide v2, v2, Lu7/m;->a:J

    .line 29
    .line 30
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x2

    .line 35
    aput-object v2, v1, v3

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    iget-object v3, p0, Li9/j1;->e:Lj9/q;

    .line 39
    .line 40
    iget-object v3, v3, Lj9/q;->a:Lu7/m;

    .line 41
    .line 42
    iget v3, v3, Lu7/m;->b:I

    .line 43
    .line 44
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    aput-object v3, v1, v2

    .line 49
    .line 50
    const/4 v2, 0x4

    .line 51
    iget-wide v3, p0, Li9/j1;->f:J

    .line 52
    .line 53
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    aput-object v3, v1, v2

    .line 58
    .line 59
    const-string v2, "UPDATE target_globals SET highest_target_id = ?, highest_listen_sequence_number = ?, last_remote_snapshot_version_seconds = ?, last_remote_snapshot_version_nanos = ?, target_count = ?"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Li9/y0;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void
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
