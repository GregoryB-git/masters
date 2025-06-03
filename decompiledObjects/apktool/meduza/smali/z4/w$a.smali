.class public final Lz4/w$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz4/w$a$a;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lz4/t$b;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lz4/w$a$a;",
            ">;"
        }
    .end annotation
.end field

.field public final d:J


# direct methods
.method public constructor <init>()V
    .locals 6

    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lz4/w$a;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;J)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILz4/t$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lz4/w$a$a;",
            ">;I",
            "Lz4/t$b;",
            "J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, Lz4/w$a;->a:I

    iput-object p3, p0, Lz4/w$a;->b:Lz4/t$b;

    iput-wide p4, p0, Lz4/w$a;->d:J

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 3

    invoke-static {p1, p2}, Lv5/e0;->R(J)J

    move-result-wide p1

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v0, p0, Lz4/w$a;->d:J

    add-long/2addr v0, p1

    :goto_0
    return-wide v0
.end method

.method public final b(ILv3/i0;ILjava/lang/Object;J)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lz4/q;

    move-wide/from16 v1, p5

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v7

    const/4 v2, 0x1

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v1, v11

    move v3, p1

    move-object v4, p2

    move v5, p3

    move-object/from16 v6, p4

    invoke-direct/range {v1 .. v10}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    invoke-virtual {p0, v11}, Lz4/w$a;->c(Lz4/q;)V

    return-void
.end method

.method public final c(Lz4/q;)V
    .locals 5

    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/w$a$a;

    iget-object v2, v1, Lz4/w$a$a;->b:Lz4/w;

    iget-object v1, v1, Lz4/w$a$a;->a:Landroid/os/Handler;

    new-instance v3, Lv3/x0;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v2, p1, v4}, Lv3/x0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v3}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lz4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lz4/w$a;->e(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final e(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lz4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lz4/w$a;->f(Lz4/n;Lz4/q;)V

    return-void
.end method

.method public final f(Lz4/n;Lz4/q;)V
    .locals 9

    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/w$a$a;

    iget-object v4, v1, Lz4/w$a$a;->b:Lz4/w;

    iget-object v1, v1, Lz4/w$a$a;->a:Landroid/os/Handler;

    new-instance v8, Lz4/u;

    const/4 v7, 0x1

    move-object v2, v8

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lz4/u;-><init>(Lz4/w$a;Lz4/w;Lz4/n;Lz4/q;I)V

    invoke-static {v1, v8}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final g(Lz4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lz4/w$a;->h(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final h(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lz4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lz4/w$a;->i(Lz4/n;Lz4/q;)V

    return-void
.end method

.method public final i(Lz4/n;Lz4/q;)V
    .locals 9

    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/w$a$a;

    iget-object v4, v1, Lz4/w$a$a;->b:Lz4/w;

    iget-object v1, v1, Lz4/w$a$a;->a:Landroid/os/Handler;

    new-instance v8, Lp2/v;

    const/4 v7, 0x2

    move-object v2, v8

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lp2/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v1, v8}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Lz4/n;IILv3/i0;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lz4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    move-object/from16 v2, p11

    move/from16 v3, p12

    invoke-virtual {p0, p1, v11, v2, v3}, Lz4/w$a;->l(Lz4/n;Lz4/q;Ljava/io/IOException;Z)V

    return-void
.end method

.method public final k(Lz4/n;ILjava/io/IOException;Z)V
    .locals 13

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object/from16 v11, p3

    move/from16 v12, p4

    invoke-virtual/range {v0 .. v12}, Lz4/w$a;->j(Lz4/n;IILv3/i0;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    return-void
.end method

.method public final l(Lz4/n;Lz4/q;Ljava/io/IOException;Z)V
    .locals 10

    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/w$a$a;

    iget-object v4, v1, Lz4/w$a$a;->b:Lz4/w;

    iget-object v1, v1, Lz4/w$a$a;->a:Landroid/os/Handler;

    new-instance v9, Lz4/v;

    move-object v2, v9

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move v8, p4

    invoke-direct/range {v2 .. v8}, Lz4/v;-><init>(Lz4/w$a;Lz4/w;Lz4/n;Lz4/q;Ljava/io/IOException;Z)V

    invoke-static {v1, v9}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final m(Lz4/n;I)V
    .locals 11

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v0 .. v10}, Lz4/w$a;->n(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V

    return-void
.end method

.method public final n(Lz4/n;IILv3/i0;ILjava/lang/Object;JJ)V
    .locals 12

    move-object v0, p0

    new-instance v11, Lz4/q;

    move-wide/from16 v1, p7

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v7

    move-wide/from16 v1, p9

    invoke-virtual {p0, v1, v2}, Lz4/w$a;->a(J)J

    move-result-wide v9

    move-object v1, v11

    move v2, p2

    move v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p6

    invoke-direct/range {v1 .. v10}, Lz4/q;-><init>(IILv3/i0;ILjava/lang/Object;JJ)V

    move-object v1, p1

    invoke-virtual {p0, p1, v11}, Lz4/w$a;->o(Lz4/n;Lz4/q;)V

    return-void
.end method

.method public final o(Lz4/n;Lz4/q;)V
    .locals 9

    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz4/w$a$a;

    iget-object v4, v1, Lz4/w$a$a;->b:Lz4/w;

    iget-object v1, v1, Lz4/w$a$a;->a:Landroid/os/Handler;

    new-instance v8, Lz4/u;

    const/4 v7, 0x0

    move-object v2, v8

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v2 .. v7}, Lz4/u;-><init>(Lz4/w$a;Lz4/w;Lz4/n;Lz4/q;I)V

    invoke-static {v1, v8}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p(Lz4/q;)V
    .locals 10

    .line 1
    iget-object v6, p0, Lz4/w$a;->b:Lz4/t$b;

    .line 2
    .line 3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lz4/w$a;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v7

    .line 12
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lz4/w$a$a;

    .line 23
    .line 24
    iget-object v2, v0, Lz4/w$a$a;->b:Lz4/w;

    .line 25
    .line 26
    iget-object v8, v0, Lz4/w$a$a;->a:Landroid/os/Handler;

    .line 27
    .line 28
    new-instance v9, Lp3/a;

    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    move-object v0, v9

    .line 32
    move-object v1, p0

    .line 33
    move-object v3, v6

    .line 34
    move-object v4, p1

    .line 35
    invoke-direct/range {v0 .. v5}, Lp3/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {v8, v9}, Lv5/e0;->M(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-void
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
