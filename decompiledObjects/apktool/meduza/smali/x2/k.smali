.class public final Lx2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/j;


# instance fields
.field public final a:Lp1/j;

.field public final b:Lx2/k$a;

.field public final c:Lx2/k$b;

.field public final d:Lx2/k$c;


# direct methods
.method public constructor <init>(Lp1/j;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/k;->a:Lp1/j;

    new-instance v0, Lx2/k$a;

    invoke-direct {v0, p1}, Lx2/k$a;-><init>(Lp1/j;)V

    iput-object v0, p0, Lx2/k;->b:Lx2/k$a;

    new-instance v0, Lx2/k$b;

    invoke-direct {v0, p1}, Lx2/k$b;-><init>(Lp1/j;)V

    iput-object v0, p0, Lx2/k;->c:Lx2/k$b;

    new-instance v0, Lx2/k$c;

    invoke-direct {v0, p1}, Lx2/k$c;-><init>(Lp1/j;)V

    iput-object v0, p0, Lx2/k;->d:Lx2/k$c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 5

    const/4 v0, 0x0

    const-string v1, "SELECT DISTINCT work_spec_id FROM SystemIdInfo"

    invoke-static {v0, v1}, Lp1/l;->C(ILjava/lang/String;)Lp1/l;

    move-result-object v1

    iget-object v2, p0, Lx2/k;->a:Lp1/j;

    invoke-virtual {v2}, Lp1/j;->b()V

    iget-object v2, p0, Lx2/k;->a:Lp1/j;

    invoke-static {v2, v1, v0}, Lb/z;->o(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;

    move-result-object v2

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    :goto_1
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    return-object v3

    :catchall_0
    move-exception v0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    throw v0
.end method

.method public final b(Lx2/l;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lx2/l;->a:Ljava/lang/String;

    .line 2
    .line 3
    iget p1, p1, Lx2/l;->b:I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Lx2/k;->g(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
.end method

.method public final c(Lx2/l;)Lx2/i;
    .locals 1

    .line 1
    const-string v0, "id"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lx2/l;->a:Ljava/lang/String;

    .line 7
    .line 8
    iget p1, p1, Lx2/l;->b:I

    .line 9
    .line 10
    invoke-virtual {p0, p1, v0}, Lx2/k;->f(ILjava/lang/String;)Lx2/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
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
.end method

.method public final d(Lx2/i;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/k;->a:Lp1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/j;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx2/k;->a:Lp1/j;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp1/j;->c()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lx2/k;->b:Lx2/k$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lp1/d;->f(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 17
    .line 18
    invoke-virtual {p1}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 22
    .line 23
    invoke-virtual {p1}, Lp1/j;->j()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    iget-object v0, p0, Lx2/k;->a:Lp1/j;

    .line 29
    .line 30
    invoke-virtual {v0}, Lp1/j;->j()V

    .line 31
    .line 32
    .line 33
    throw p1
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

.method public final e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/k;->a:Lp1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/j;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx2/k;->d:Lx2/k$c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp1/p;->a()Lt1/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lt1/d;->d0(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1, p1}, Lt1/d;->n(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 23
    .line 24
    invoke-virtual {p1}, Lp1/j;->c()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    invoke-interface {v0}, Lt1/f;->p()I

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 31
    .line 32
    invoke-virtual {p1}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 36
    .line 37
    invoke-virtual {p1}, Lp1/j;->j()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lx2/k;->d:Lx2/k$c;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Lp1/p;->d(Lt1/f;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    iget-object v1, p0, Lx2/k;->a:Lp1/j;

    .line 48
    .line 49
    invoke-virtual {v1}, Lp1/j;->j()V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lx2/k;->d:Lx2/k$c;

    .line 53
    .line 54
    invoke-virtual {v1, v0}, Lp1/p;->d(Lt1/f;)V

    .line 55
    .line 56
    .line 57
    throw p1
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

.method public final f(ILjava/lang/String;)Lx2/i;
    .locals 5

    const/4 v0, 0x2

    const-string v1, "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"

    invoke-static {v0, v1}, Lp1/l;->C(ILjava/lang/String;)Lp1/l;

    move-result-object v1

    const/4 v2, 0x1

    if-nez p2, :cond_0

    invoke-virtual {v1, v2}, Lp1/l;->d0(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2, p2}, Lp1/l;->n(ILjava/lang/String;)V

    :goto_0
    int-to-long p1, p1

    invoke-virtual {v1, v0, p1, p2}, Lp1/l;->F(IJ)V

    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    invoke-virtual {p1}, Lp1/j;->b()V

    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-static {p1, v1, p2}, Lb/z;->o(Lp1/j;Lp1/l;Z)Landroid/database/Cursor;

    move-result-object p1

    :try_start_0
    const-string p2, "work_spec_id"

    invoke-static {p1, p2}, Lp2/m0;->J(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result p2

    const-string v2, "generation"

    invoke-static {p1, v2}, Lp2/m0;->J(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v2

    const-string v3, "system_id"

    invoke-static {p1, v3}, Lp2/m0;->J(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v3

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {p1, p2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-interface {p1, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result p2

    invoke-interface {p1, v3}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    new-instance v3, Lx2/i;

    invoke-direct {v3, v0, p2, v2}, Lx2/i;-><init>(Ljava/lang/String;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v0, v3

    :cond_2
    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    return-object v0

    :catchall_0
    move-exception p2

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    invoke-virtual {v1}, Lp1/l;->H()V

    throw p2
.end method

.method public final g(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx2/k;->a:Lp1/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lp1/j;->b()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx2/k;->c:Lx2/k$b;

    .line 7
    .line 8
    invoke-virtual {v0}, Lp1/p;->a()Lt1/f;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    invoke-interface {v0, v1}, Lt1/d;->d0(I)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v0, v1, p2}, Lt1/d;->n(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 p2, 0x2

    .line 23
    int-to-long v1, p1

    .line 24
    invoke-interface {v0, p2, v1, v2}, Lt1/d;->F(IJ)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 28
    .line 29
    invoke-virtual {p1}, Lp1/j;->c()V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-interface {v0}, Lt1/f;->p()I

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 36
    .line 37
    invoke-virtual {p1}, Lp1/j;->n()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lx2/k;->a:Lp1/j;

    .line 41
    .line 42
    invoke-virtual {p1}, Lp1/j;->j()V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lx2/k;->c:Lx2/k$b;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Lp1/p;->d(Lt1/f;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    iget-object p2, p0, Lx2/k;->a:Lp1/j;

    .line 53
    .line 54
    invoke-virtual {p2}, Lp1/j;->j()V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lx2/k;->c:Lx2/k$b;

    .line 58
    .line 59
    invoke-virtual {p2, v0}, Lp1/p;->d(Lt1/f;)V

    .line 60
    .line 61
    .line 62
    throw p1
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
