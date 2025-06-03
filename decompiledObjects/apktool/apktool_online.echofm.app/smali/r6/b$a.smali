.class public final Lr6/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;
.implements Lp6/P0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public o:Ljava/lang/Object;

.field public p:Lp6/m;

.field public final synthetic q:Lr6/b;


# direct methods
.method public constructor <init>(Lr6/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/b$a;->q:Lr6/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lr6/c;->m()Lu6/F;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic c(Lr6/b$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lr6/b$a;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d(Lr6/b$a;Lp6/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/b$a;->p:Lp6/m;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic e(Lr6/b$a;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public a(Lu6/C;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr6/b$a;->p:Lp6/m;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lp6/m;->a(Lu6/C;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public b(LX5/d;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v6, p0, Lr6/b$a;->q:Lr6/b;

    .line 2
    .line 3
    invoke-static {}, Lr6/b;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lr6/i;

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v6}, Lr6/b;->P()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lr6/b$a;->g()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    :goto_1
    invoke-static {p1}, LZ5/b;->a(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_3

    .line 28
    :cond_0
    invoke-static {}, Lr6/b;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v10

    .line 36
    sget v1, Lr6/c;->b:I

    .line 37
    .line 38
    int-to-long v2, v1

    .line 39
    div-long v2, v10, v2

    .line 40
    .line 41
    int-to-long v4, v1

    .line 42
    rem-long v4, v10, v4

    .line 43
    .line 44
    long-to-int v9, v4

    .line 45
    iget-wide v4, v0, Lu6/C;->q:J

    .line 46
    .line 47
    cmp-long v1, v4, v2

    .line 48
    .line 49
    if-eqz v1, :cond_2

    .line 50
    .line 51
    invoke-static {v6, v2, v3, v0}, Lr6/b;->e(Lr6/b;JLr6/i;)Lr6/i;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    move-object v8, v1

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move-object v8, v0

    .line 61
    :goto_2
    const/4 v5, 0x0

    .line 62
    move-object v0, v6

    .line 63
    move-object v1, v8

    .line 64
    move v2, v9

    .line 65
    move-wide v3, v10

    .line 66
    invoke-static/range {v0 .. v5}, Lr6/b;->p(Lr6/b;Lr6/i;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {}, Lr6/c;->r()Lu6/F;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eq v0, v1, :cond_6

    .line 75
    .line 76
    invoke-static {}, Lr6/c;->h()Lu6/F;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-ne v0, v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {v6}, Lr6/b;->I()J

    .line 83
    .line 84
    .line 85
    move-result-wide v0

    .line 86
    cmp-long v0, v10, v0

    .line 87
    .line 88
    if-gez v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {v8}, Lu6/e;->b()V

    .line 91
    .line 92
    .line 93
    :cond_3
    move-object v0, v8

    .line 94
    goto :goto_0

    .line 95
    :cond_4
    invoke-static {}, Lr6/c;->s()Lu6/F;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    if-ne v0, v1, :cond_5

    .line 100
    .line 101
    move-object v7, p0

    .line 102
    move-object v12, p1

    .line 103
    invoke-virtual/range {v7 .. v12}, Lr6/b$a;->f(Lr6/i;IJLX5/d;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    :cond_5
    invoke-virtual {v8}, Lu6/e;->b()V

    .line 109
    .line 110
    .line 111
    iput-object v0, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 112
    .line 113
    const/4 p1, 0x1

    .line 114
    goto :goto_1

    .line 115
    :goto_3
    return-object p1

    .line 116
    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    const-string v0, "unreachable"

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p1
.end method

.method public final f(Lr6/i;IJLX5/d;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v6, p0, Lr6/b$a;->q:Lr6/b;

    invoke-static {p5}, LY5/b;->b(LX5/d;)LX5/d;

    move-result-object v0

    invoke-static {v0}, Lp6/o;->b(LX5/d;)Lp6/m;

    move-result-object v7

    :try_start_0
    invoke-static {p0, v7}, Lr6/b$a;->d(Lr6/b$a;Lp6/m;)V

    move-object v0, v6

    move-object v1, p1

    move v2, p2

    move-wide v3, p3

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lr6/b;->p(Lr6/b;Lr6/i;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lr6/c;->r()Lu6/F;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {v6, p0, p1, p2}, Lr6/b;->n(Lr6/b;Lp6/P0;Lr6/i;I)V

    goto/16 :goto_2

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Lr6/c;->h()Lu6/F;

    move-result-object p2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v0, p2, :cond_a

    invoke-virtual {v6}, Lr6/b;->I()J

    move-result-wide v0

    cmp-long p2, p3, v0

    if-gez p2, :cond_1

    invoke-virtual {p1}, Lu6/e;->b()V

    :cond_1
    invoke-static {}, Lr6/b;->h()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object p1

    invoke-virtual {p1, v6}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr6/i;

    :cond_2
    :goto_0
    invoke-virtual {v6}, Lr6/b;->P()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {p0}, Lr6/b$a;->c(Lr6/b$a;)V

    goto/16 :goto_2

    :cond_3
    invoke-static {}, Lr6/b;->i()Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    move-result-object p2

    invoke-virtual {p2, v6}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    move-result-wide p2

    sget p4, Lr6/c;->b:I

    int-to-long v0, p4

    div-long v0, p2, v0

    int-to-long v2, p4

    rem-long v2, p2, v2

    long-to-int p4, v2

    iget-wide v2, p1, Lu6/C;->q:J

    cmp-long v2, v2, v0

    if-eqz v2, :cond_5

    invoke-static {v6, v0, v1, p1}, Lr6/b;->e(Lr6/b;JLr6/i;)Lr6/i;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    move-object p1, v0

    :cond_5
    move-object v0, v6

    move-object v1, p1

    move v2, p4

    move-wide v3, p2

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Lr6/b;->p(Lr6/b;Lr6/i;IJLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lr6/c;->r()Lu6/F;

    move-result-object v1

    if-ne v0, v1, :cond_6

    invoke-static {v6, p0, p1, p4}, Lr6/b;->n(Lr6/b;Lp6/P0;Lr6/i;I)V

    goto :goto_2

    :cond_6
    invoke-static {}, Lr6/c;->h()Lu6/F;

    move-result-object p4

    if-ne v0, p4, :cond_7

    invoke-virtual {v6}, Lr6/b;->I()J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-gez p2, :cond_2

    invoke-virtual {p1}, Lu6/e;->b()V

    goto :goto_0

    :cond_7
    invoke-static {}, Lr6/c;->s()Lu6/F;

    move-result-object p2

    if-eq v0, p2, :cond_9

    invoke-virtual {p1}, Lu6/e;->b()V

    invoke-static {p0, v0}, Lr6/b$a;->e(Lr6/b$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, Lr6/b$a;->d(Lr6/b$a;Lp6/m;)V

    invoke-static {v8}, LZ5/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, Lr6/b;->c:Lg6/l;

    if-eqz p2, :cond_8

    invoke-virtual {v7}, Lp6/m;->getContext()LX5/g;

    move-result-object p3

    invoke-static {p2, v0, p3}, Lu6/x;->a(Lg6/l;Ljava/lang/Object;LX5/g;)Lg6/l;

    move-result-object v9

    :cond_8
    :goto_1
    invoke-virtual {v7, p1, v9}, Lp6/m;->j(Ljava/lang/Object;Lg6/l;)V

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "unexpected"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1}, Lu6/e;->b()V

    invoke-static {p0, v0}, Lr6/b$a;->e(Lr6/b$a;Ljava/lang/Object;)V

    invoke-static {p0, v9}, Lr6/b$a;->d(Lr6/b$a;Lp6/m;)V

    invoke-static {v8}, LZ5/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    iget-object p2, v6, Lr6/b;->c:Lg6/l;

    if-eqz p2, :cond_8

    invoke-virtual {v7}, Lp6/m;->getContext()LX5/g;

    move-result-object p3

    invoke-static {p2, v0, p3}, Lu6/x;->a(Lg6/l;Ljava/lang/Object;LX5/g;)Lg6/l;

    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_2
    invoke-virtual {v7}, Lp6/m;->w()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_b

    invoke-static {p5}, LZ5/h;->c(LX5/d;)V

    :cond_b
    return-object p1

    :goto_3
    invoke-virtual {v7}, Lp6/m;->I()V

    throw p1
.end method

.method public final g()Z
    .locals 1

    .line 1
    invoke-static {}, Lr6/c;->z()Lu6/F;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v0, p0, Lr6/b$a;->q:Lr6/b;

    .line 8
    .line 9
    invoke-virtual {v0}, Lr6/b;->E()Ljava/lang/Throwable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return v0

    .line 17
    :cond_0
    invoke-static {v0}, Lu6/E;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    throw v0
.end method

.method public final h()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr6/b$a;->p:Lp6/m;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lr6/b$a;->p:Lp6/m;

    .line 8
    .line 9
    invoke-static {}, Lr6/c;->z()Lu6/F;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, p0, Lr6/b$a;->q:Lr6/b;

    .line 16
    .line 17
    invoke-virtual {v1}, Lr6/b;->E()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    :goto_0
    invoke-static {v1}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    sget-object v2, LV5/n;->o:LV5/n$a;

    .line 36
    .line 37
    invoke-static {v1}, LV5/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    return-void
.end method

.method public final i(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lr6/b$a;->p:Lp6/m;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lr6/b$a;->p:Lp6/m;

    .line 8
    .line 9
    iput-object p1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 12
    .line 13
    iget-object v3, p0, Lr6/b$a;->q:Lr6/b;

    .line 14
    .line 15
    iget-object v3, v3, Lr6/b;->c:Lg6/l;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Lp6/m;->getContext()LX5/g;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-static {v3, p1, v1}, Lu6/x;->a(Lg6/l;Ljava/lang/Object;LX5/g;)Lg6/l;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_0
    invoke-static {v0, v2, v1}, Lr6/c;->u(Lp6/l;Ljava/lang/Object;Lg6/l;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    return p1
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr6/b$a;->p:Lp6/m;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lr6/b$a;->p:Lp6/m;

    .line 8
    .line 9
    invoke-static {}, Lr6/c;->z()Lu6/F;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, p0, Lr6/b$a;->q:Lr6/b;

    .line 16
    .line 17
    invoke-virtual {v1}, Lr6/b;->E()Ljava/lang/Throwable;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    sget-object v1, LV5/n;->o:LV5/n$a;

    .line 24
    .line 25
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    :goto_0
    invoke-static {v1}, LV5/n;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v0, v1}, LX5/d;->resumeWith(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    sget-object v2, LV5/n;->o:LV5/n$a;

    .line 36
    .line 37
    invoke-static {v1}, LV5/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    return-void
.end method

.method public next()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {}, Lr6/c;->m()Lu6/F;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    invoke-static {}, Lr6/c;->m()Lu6/F;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, Lr6/b$a;->o:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {}, Lr6/c;->z()Lu6/F;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eq v0, v1, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    iget-object v0, p0, Lr6/b$a;->q:Lr6/b;

    .line 23
    .line 24
    invoke-static {v0}, Lr6/b;->g(Lr6/b;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Lu6/E;->a(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    throw v0

    .line 33
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    const-string v1, "`hasNext()` has not been invoked"

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method
