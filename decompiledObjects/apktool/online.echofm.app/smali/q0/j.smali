.class public final Lq0/j;
.super Ly0/m;
.source "SourceFile"


# static fields
.field public static final N:Ljava/util/concurrent/atomic/AtomicInteger;


# instance fields
.field public final A:Z

.field public final B:Z

.field public final C:Ll0/y1;

.field public final D:J

.field public E:Lq0/k;

.field public F:Lq0/s;

.field public G:I

.field public H:Z

.field public volatile I:Z

.field public J:Z

.field public K:LX2/v;

.field public L:Z

.field public M:Z

.field public final k:I

.field public final l:I

.field public final m:Landroid/net/Uri;

.field public final n:Z

.field public final o:I

.field public final p:Li0/g;

.field public final q:Li0/k;

.field public final r:Lq0/k;

.field public final s:Z

.field public final t:Z

.field public final u:Lg0/E;

.field public final v:Lq0/h;

.field public final w:Ljava/util/List;

.field public final x:Ld0/m;

.field public final y:LT0/h;

.field public final z:Lg0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lq0/j;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lq0/h;Li0/g;Li0/k;Ld0/q;ZLi0/g;Li0/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLg0/E;JLd0/m;Lq0/k;LT0/h;Lg0/z;ZLl0/y1;)V
    .locals 14

    .line 1
    move-object v12, p0

    move-object/from16 v13, p7

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p11

    move-object/from16 v5, p12

    move-wide/from16 v6, p13

    move-wide/from16 v8, p15

    move-wide/from16 v10, p17

    invoke-direct/range {v0 .. v11}, Ly0/m;-><init>(Li0/g;Li0/k;Ld0/q;ILjava/lang/Object;JJJ)V

    move/from16 v0, p5

    iput-boolean v0, v12, Lq0/j;->A:Z

    move/from16 v0, p19

    iput v0, v12, Lq0/j;->o:I

    move/from16 v0, p20

    iput-boolean v0, v12, Lq0/j;->M:Z

    move/from16 v0, p21

    iput v0, v12, Lq0/j;->l:I

    iput-object v13, v12, Lq0/j;->q:Li0/k;

    move-object/from16 v0, p6

    iput-object v0, v12, Lq0/j;->p:Li0/g;

    if-eqz v13, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, v12, Lq0/j;->H:Z

    move/from16 v0, p8

    iput-boolean v0, v12, Lq0/j;->B:Z

    move-object/from16 v0, p9

    iput-object v0, v12, Lq0/j;->m:Landroid/net/Uri;

    move/from16 v0, p23

    iput-boolean v0, v12, Lq0/j;->s:Z

    move-object/from16 v0, p24

    iput-object v0, v12, Lq0/j;->u:Lg0/E;

    move-wide/from16 v0, p25

    iput-wide v0, v12, Lq0/j;->D:J

    move/from16 v0, p22

    iput-boolean v0, v12, Lq0/j;->t:Z

    move-object v0, p1

    iput-object v0, v12, Lq0/j;->v:Lq0/h;

    move-object/from16 v0, p10

    iput-object v0, v12, Lq0/j;->w:Ljava/util/List;

    move-object/from16 v0, p27

    iput-object v0, v12, Lq0/j;->x:Ld0/m;

    move-object/from16 v0, p28

    iput-object v0, v12, Lq0/j;->r:Lq0/k;

    move-object/from16 v0, p29

    iput-object v0, v12, Lq0/j;->y:LT0/h;

    move-object/from16 v0, p30

    iput-object v0, v12, Lq0/j;->z:Lg0/z;

    move/from16 v0, p31

    iput-boolean v0, v12, Lq0/j;->n:Z

    move-object/from16 v0, p32

    iput-object v0, v12, Lq0/j;->C:Ll0/y1;

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, v12, Lq0/j;->K:LX2/v;

    sget-object v0, Lq0/j;->N:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    iput v0, v12, Lq0/j;->k:I

    return-void
.end method

.method public static i(Li0/g;[B[B)Li0/g;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p2}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lq0/a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2}, Lq0/a;-><init>(Li0/g;[B[B)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    return-object p0
.end method

.method public static j(Lq0/h;Li0/g;Ld0/q;JLr0/f;Lq0/f$e;Landroid/net/Uri;Ljava/util/List;ILjava/lang/Object;ZLq0/v;JLq0/j;[B[BZLl0/y1;LB0/g$a;)Lq0/j;
    .locals 43

    .line 1
    move-object/from16 v0, p1

    move-object/from16 v1, p5

    move-object/from16 v2, p6

    move-object/from16 v3, p15

    move-object/from16 v4, p16

    move-object/from16 v5, p17

    iget-object v6, v2, Lq0/f$e;->a:Lr0/f$e;

    new-instance v7, Li0/k$b;

    invoke-direct {v7}, Li0/k$b;-><init>()V

    iget-object v8, v1, Lr0/h;->a:Ljava/lang/String;

    iget-object v9, v6, Lr0/f$e;->o:Ljava/lang/String;

    invoke-static {v8, v9}, Lg0/G;->f(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    invoke-virtual {v7, v8}, Li0/k$b;->i(Landroid/net/Uri;)Li0/k$b;

    move-result-object v7

    iget-wide v8, v6, Lr0/f$e;->w:J

    invoke-virtual {v7, v8, v9}, Li0/k$b;->h(J)Li0/k$b;

    move-result-object v7

    iget-wide v8, v6, Lr0/f$e;->x:J

    invoke-virtual {v7, v8, v9}, Li0/k$b;->g(J)Li0/k$b;

    move-result-object v7

    iget-boolean v8, v2, Lq0/f$e;->d:Z

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    goto :goto_0

    :cond_0
    const/4 v8, 0x0

    :goto_0
    invoke-virtual {v7, v8}, Li0/k$b;->b(I)Li0/k$b;

    move-result-object v7

    invoke-virtual {v7}, Li0/k$b;->a()Li0/k;

    move-result-object v13

    const/4 v7, 0x1

    if-eqz v4, :cond_1

    move v15, v7

    goto :goto_1

    :cond_1
    const/4 v15, 0x0

    :goto_1
    if-eqz v15, :cond_2

    iget-object v10, v6, Lr0/f$e;->v:Ljava/lang/String;

    invoke-static {v10}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Lq0/j;->l(Ljava/lang/String;)[B

    move-result-object v10

    goto :goto_2

    :cond_2
    const/4 v10, 0x0

    :goto_2
    invoke-static {v0, v4, v10}, Lq0/j;->i(Li0/g;[B[B)Li0/g;

    move-result-object v12

    iget-object v4, v6, Lr0/f$e;->p:Lr0/f$d;

    if-eqz v4, :cond_5

    if-eqz v5, :cond_3

    move v10, v7

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-eqz v10, :cond_4

    iget-object v11, v4, Lr0/f$e;->v:Ljava/lang/String;

    invoke-static {v11}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Lq0/j;->l(Ljava/lang/String;)[B

    move-result-object v11

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    iget-object v14, v1, Lr0/h;->a:Ljava/lang/String;

    iget-object v8, v4, Lr0/f$e;->o:Ljava/lang/String;

    invoke-static {v14, v8}, Lg0/G;->f(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v8

    new-instance v14, Li0/k$b;

    invoke-direct {v14}, Li0/k$b;-><init>()V

    invoke-virtual {v14, v8}, Li0/k$b;->i(Landroid/net/Uri;)Li0/k$b;

    move-result-object v8

    move/from16 p16, v10

    iget-wide v9, v4, Lr0/f$e;->w:J

    invoke-virtual {v8, v9, v10}, Li0/k$b;->h(J)Li0/k$b;

    move-result-object v8

    iget-wide v9, v4, Lr0/f$e;->x:J

    invoke-virtual {v8, v9, v10}, Li0/k$b;->g(J)Li0/k$b;

    move-result-object v4

    invoke-virtual {v4}, Li0/k$b;->a()Li0/k;

    move-result-object v4

    invoke-static {v0, v5, v11}, Lq0/j;->i(Li0/g;[B[B)Li0/g;

    move-result-object v0

    move/from16 v18, p16

    move-object/from16 v16, v0

    goto :goto_5

    :cond_5
    const/4 v4, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    :goto_5
    iget-wide v8, v6, Lr0/f$e;->s:J

    add-long v23, p3, v8

    iget-wide v8, v6, Lr0/f$e;->q:J

    add-long v25, v23, v8

    iget v0, v1, Lr0/f;->j:I

    iget v1, v6, Lr0/f$e;->r:I

    add-int/2addr v0, v1

    if-eqz v3, :cond_a

    iget-object v1, v3, Lq0/j;->q:Li0/k;

    if-eq v4, v1, :cond_7

    if-eqz v4, :cond_6

    if-eqz v1, :cond_6

    iget-object v5, v4, Li0/k;->a:Landroid/net/Uri;

    iget-object v1, v1, Li0/k;->a:Landroid/net/Uri;

    invoke-virtual {v5, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-wide v8, v4, Li0/k;->g:J

    iget-object v1, v3, Lq0/j;->q:Li0/k;

    iget-wide v10, v1, Li0/k;->g:J

    cmp-long v1, v8, v10

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    const/4 v1, 0x0

    goto :goto_7

    :cond_7
    :goto_6
    move v1, v7

    :goto_7
    iget-object v5, v3, Lq0/j;->m:Landroid/net/Uri;

    move-object/from16 v8, p7

    invoke-virtual {v8, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    iget-boolean v5, v3, Lq0/j;->J:Z

    if-eqz v5, :cond_8

    move v9, v7

    goto :goto_8

    :cond_8
    const/4 v9, 0x0

    :goto_8
    iget-object v5, v3, Lq0/j;->y:LT0/h;

    iget-object v10, v3, Lq0/j;->z:Lg0/z;

    if-eqz v1, :cond_9

    if-eqz v9, :cond_9

    iget-boolean v1, v3, Lq0/j;->L:Z

    if-nez v1, :cond_9

    iget v1, v3, Lq0/j;->l:I

    if-ne v1, v0, :cond_9

    iget-object v1, v3, Lq0/j;->E:Lq0/k;

    goto :goto_9

    :cond_9
    const/4 v1, 0x0

    :goto_9
    move-object/from16 v38, v1

    move-object/from16 v39, v5

    move-object/from16 v40, v10

    goto :goto_a

    :cond_a
    move-object/from16 v8, p7

    new-instance v1, LT0/h;

    invoke-direct {v1}, LT0/h;-><init>()V

    new-instance v3, Lg0/z;

    const/16 v5, 0xa

    invoke-direct {v3, v5}, Lg0/z;-><init>(I)V

    move-object/from16 v39, v1

    move-object/from16 v40, v3

    const/16 v38, 0x0

    :goto_a
    new-instance v1, Lq0/j;

    iget-wide v9, v2, Lq0/f$e;->b:J

    iget v3, v2, Lq0/f$e;->c:I

    iget-boolean v2, v2, Lq0/f$e;->d:Z

    xor-int/lit8 v30, v2, 0x1

    iget-boolean v2, v6, Lr0/f$e;->y:Z

    move/from16 v32, v2

    move-object/from16 v2, p12

    invoke-virtual {v2, v0}, Lq0/v;->a(I)Lg0/E;

    move-result-object v34

    iget-object v2, v6, Lr0/f$e;->t:Ld0/m;

    move-object/from16 v37, v2

    move-wide v5, v9

    move-object v10, v1

    move-object/from16 v11, p0

    move-object/from16 v14, p2

    move-object/from16 v17, v4

    move-object/from16 v19, p7

    move-object/from16 v20, p8

    move/from16 v21, p9

    move-object/from16 v22, p10

    move-wide/from16 v27, v5

    move/from16 v29, v3

    move/from16 v31, v0

    move/from16 v33, p11

    move-wide/from16 v35, p13

    move/from16 v41, p18

    move-object/from16 v42, p19

    invoke-direct/range {v10 .. v42}, Lq0/j;-><init>(Lq0/h;Li0/g;Li0/k;Ld0/q;ZLi0/g;Li0/k;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLg0/E;JLd0/m;Lq0/k;LT0/h;Lg0/z;ZLl0/y1;)V

    return-object v1
.end method

.method public static l(Ljava/lang/String;)[B
    .locals 4

    .line 1
    invoke-static {p0}, LW2/c;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "0x"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    new-instance v0, Ljava/math/BigInteger;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    invoke-direct {v0, p0, v1}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-array v0, v1, [B

    .line 30
    .line 31
    array-length v2, p0

    .line 32
    if-le v2, v1, :cond_1

    .line 33
    .line 34
    array-length v2, p0

    .line 35
    sub-int/2addr v2, v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v2, 0x0

    .line 38
    :goto_0
    array-length v3, p0

    .line 39
    sub-int/2addr v1, v3

    .line 40
    add-int/2addr v1, v2

    .line 41
    array-length v3, p0

    .line 42
    sub-int/2addr v3, v2

    .line 43
    invoke-static {p0, v2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method

.method public static p(Lq0/f$e;Lr0/f;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lq0/f$e;->a:Lr0/f$e;

    .line 2
    .line 3
    instance-of v1, v0, Lr0/f$b;

    .line 4
    .line 5
    if-eqz v1, :cond_2

    .line 6
    .line 7
    check-cast v0, Lr0/f$b;

    .line 8
    .line 9
    iget-boolean v0, v0, Lr0/f$b;->z:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget p0, p0, Lq0/f$e;->c:I

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    iget-boolean p0, p1, Lr0/h;->c:Z

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    :goto_1
    return p0

    .line 26
    :cond_2
    iget-boolean p0, p1, Lr0/h;->c:Z

    .line 27
    .line 28
    return p0
.end method

.method public static w(Lq0/j;Landroid/net/Uri;Lr0/f;Lq0/f$e;J)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lq0/j;->m:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Lq0/j;->J:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    return v0

    .line 18
    :cond_1
    iget-object p1, p3, Lq0/f$e;->a:Lr0/f$e;

    .line 19
    .line 20
    iget-wide v1, p1, Lr0/f$e;->s:J

    .line 21
    .line 22
    add-long/2addr p4, v1

    .line 23
    invoke-static {p3, p2}, Lq0/j;->p(Lq0/f$e;Lr0/f;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-wide p0, p0, Ly0/e;->h:J

    .line 30
    .line 31
    cmp-long p0, p4, p0

    .line 32
    .line 33
    if-gez p0, :cond_3

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x1

    .line 36
    :cond_3
    return v0
.end method


# virtual methods
.method public b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lq0/j;->F:Lq0/s;

    .line 2
    .line 3
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq0/j;->E:Lq0/k;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lq0/j;->r:Lq0/k;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {v0}, Lq0/k;->e()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lq0/j;->r:Lq0/k;

    .line 21
    .line 22
    iput-object v0, p0, Lq0/j;->E:Lq0/k;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    iput-boolean v0, p0, Lq0/j;->H:Z

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lq0/j;->s()V

    .line 28
    .line 29
    .line 30
    iget-boolean v0, p0, Lq0/j;->I:Z

    .line 31
    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    iget-boolean v0, p0, Lq0/j;->t:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lq0/j;->r()V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget-boolean v0, p0, Lq0/j;->I:Z

    .line 42
    .line 43
    xor-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iput-boolean v0, p0, Lq0/j;->J:Z

    .line 46
    .line 47
    :cond_2
    return-void
.end method

.method public c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq0/j;->I:Z

    .line 3
    .line 4
    return-void
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/j;->J:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k(Li0/g;Li0/k;ZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_1

    .line 3
    .line 4
    iget p3, p0, Lq0/j;->G:I

    .line 5
    .line 6
    if-eqz p3, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    :cond_0
    move-object p3, p2

    .line 10
    goto :goto_0

    .line 11
    :cond_1
    iget p3, p0, Lq0/j;->G:I

    .line 12
    .line 13
    int-to-long v1, p3

    .line 14
    invoke-virtual {p2, v1, v2}, Li0/k;->e(J)Li0/k;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1, p3, p4}, Lq0/j;->u(Li0/g;Li0/k;Z)LF0/j;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget p4, p0, Lq0/j;->G:I

    .line 25
    .line 26
    invoke-interface {p3, p4}, LF0/s;->i(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p2

    .line 31
    goto :goto_6

    .line 32
    :cond_2
    :goto_1
    :try_start_1
    iget-boolean p4, p0, Lq0/j;->I:Z

    .line 33
    .line 34
    if-nez p4, :cond_3

    .line 35
    .line 36
    iget-object p4, p0, Lq0/j;->E:Lq0/k;

    .line 37
    .line 38
    invoke-interface {p4, p3}, Lq0/k;->c(LF0/s;)Z

    .line 39
    .line 40
    .line 41
    move-result p4
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 42
    if-eqz p4, :cond_3

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :catchall_1
    move-exception p4

    .line 46
    goto :goto_5

    .line 47
    :catch_0
    move-exception p4

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    :try_start_2
    invoke-interface {p3}, LF0/s;->p()J

    .line 50
    .line 51
    .line 52
    move-result-wide p3

    .line 53
    iget-wide v0, p2, Li0/k;->g:J

    .line 54
    .line 55
    :goto_2
    sub-long/2addr p3, v0

    .line 56
    long-to-int p2, p3

    .line 57
    iput p2, p0, Lq0/j;->G:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    goto :goto_4

    .line 60
    :goto_3
    :try_start_3
    iget-object v0, p0, Ly0/e;->d:Ld0/q;

    .line 61
    .line 62
    iget v0, v0, Ld0/q;->f:I

    .line 63
    .line 64
    and-int/lit16 v0, v0, 0x4000

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    iget-object p4, p0, Lq0/j;->E:Lq0/k;

    .line 69
    .line 70
    invoke-interface {p4}, Lq0/k;->d()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 71
    .line 72
    .line 73
    :try_start_4
    invoke-interface {p3}, LF0/s;->p()J

    .line 74
    .line 75
    .line 76
    move-result-wide p3

    .line 77
    iget-wide v0, p2, Li0/k;->g:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :goto_4
    invoke-static {p1}, Li0/j;->a(Li0/g;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    :try_start_5
    throw p4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 85
    :goto_5
    :try_start_6
    invoke-interface {p3}, LF0/s;->p()J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iget-wide p2, p2, Li0/k;->g:J

    .line 90
    .line 91
    sub-long/2addr v0, p2

    .line 92
    long-to-int p2, v0

    .line 93
    iput p2, p0, Lq0/j;->G:I

    .line 94
    .line 95
    throw p4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 96
    :goto_6
    invoke-static {p1}, Li0/j;->a(Li0/g;)V

    .line 97
    .line 98
    .line 99
    throw p2
.end method

.method public m(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/j;->n:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lq0/j;->K:LX2/v;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    iget-object v0, p0, Lq0/j;->K:LX2/v;

    .line 19
    .line 20
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    check-cast p1, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public n(Lq0/s;LX2/v;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lq0/j;->F:Lq0/s;

    .line 2
    .line 3
    iput-object p2, p0, Lq0/j;->K:LX2/v;

    .line 4
    .line 5
    return-void
.end method

.method public o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq0/j;->L:Z

    .line 3
    .line 4
    return-void
.end method

.method public q()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lq0/j;->M:Z

    .line 2
    .line 3
    return v0
.end method

.method public final r()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly0/e;->i:Li0/x;

    .line 2
    .line 3
    iget-object v1, p0, Ly0/e;->b:Li0/k;

    .line 4
    .line 5
    iget-boolean v2, p0, Lq0/j;->A:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-virtual {p0, v0, v1, v2, v3}, Lq0/j;->k(Li0/g;Li0/k;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lq0/j;->H:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lq0/j;->p:Li0/g;

    .line 7
    .line 8
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lq0/j;->q:Li0/k;

    .line 12
    .line 13
    invoke-static {v0}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lq0/j;->p:Li0/g;

    .line 17
    .line 18
    iget-object v1, p0, Lq0/j;->q:Li0/k;

    .line 19
    .line 20
    iget-boolean v2, p0, Lq0/j;->B:Z

    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-virtual {p0, v0, v1, v2, v3}, Lq0/j;->k(Li0/g;Li0/k;ZZ)V

    .line 24
    .line 25
    .line 26
    iput v3, p0, Lq0/j;->G:I

    .line 27
    .line 28
    iput-boolean v3, p0, Lq0/j;->H:Z

    .line 29
    .line 30
    return-void
.end method

.method public final t(LF0/s;)J
    .locals 8

    .line 1
    invoke-interface {p1}, LF0/s;->h()V

    .line 2
    .line 3
    .line 4
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v2, p0, Lq0/j;->z:Lg0/z;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Lg0/z;->P(I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lq0/j;->z:Lg0/z;

    .line 17
    .line 18
    invoke-virtual {v2}, Lg0/z;->e()[B

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v4, 0x0

    .line 23
    invoke-interface {p1, v2, v4, v3}, LF0/s;->n([BII)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    .line 26
    iget-object v2, p0, Lq0/j;->z:Lg0/z;

    .line 27
    .line 28
    invoke-virtual {v2}, Lg0/z;->J()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const v5, 0x494433

    .line 33
    .line 34
    .line 35
    if-eq v2, v5, :cond_0

    .line 36
    .line 37
    return-wide v0

    .line 38
    :cond_0
    iget-object v2, p0, Lq0/j;->z:Lg0/z;

    .line 39
    .line 40
    const/4 v5, 0x3

    .line 41
    invoke-virtual {v2, v5}, Lg0/z;->U(I)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Lq0/j;->z:Lg0/z;

    .line 45
    .line 46
    invoke-virtual {v2}, Lg0/z;->F()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/lit8 v5, v2, 0xa

    .line 51
    .line 52
    iget-object v6, p0, Lq0/j;->z:Lg0/z;

    .line 53
    .line 54
    invoke-virtual {v6}, Lg0/z;->b()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-le v5, v6, :cond_1

    .line 59
    .line 60
    iget-object v6, p0, Lq0/j;->z:Lg0/z;

    .line 61
    .line 62
    invoke-virtual {v6}, Lg0/z;->e()[B

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    iget-object v7, p0, Lq0/j;->z:Lg0/z;

    .line 67
    .line 68
    invoke-virtual {v7, v5}, Lg0/z;->P(I)V

    .line 69
    .line 70
    .line 71
    iget-object v5, p0, Lq0/j;->z:Lg0/z;

    .line 72
    .line 73
    invoke-virtual {v5}, Lg0/z;->e()[B

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v6, v4, v5, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v5, p0, Lq0/j;->z:Lg0/z;

    .line 81
    .line 82
    invoke-virtual {v5}, Lg0/z;->e()[B

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {p1, v5, v3, v2}, LF0/s;->n([BII)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lq0/j;->y:LT0/h;

    .line 90
    .line 91
    iget-object v3, p0, Lq0/j;->z:Lg0/z;

    .line 92
    .line 93
    invoke-virtual {v3}, Lg0/z;->e()[B

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {p1, v3, v2}, LT0/h;->e([BI)Ld0/x;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    if-nez p1, :cond_2

    .line 102
    .line 103
    return-wide v0

    .line 104
    :cond_2
    invoke-virtual {p1}, Ld0/x;->e()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    move v3, v4

    .line 109
    :goto_0
    if-ge v3, v2, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1, v3}, Ld0/x;->d(I)Ld0/x$b;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    instance-of v6, v5, LT0/m;

    .line 116
    .line 117
    if-eqz v6, :cond_3

    .line 118
    .line 119
    check-cast v5, LT0/m;

    .line 120
    .line 121
    iget-object v6, v5, LT0/m;->p:Ljava/lang/String;

    .line 122
    .line 123
    const-string v7, "com.apple.streaming.transportStreamTimestamp"

    .line 124
    .line 125
    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_3

    .line 130
    .line 131
    iget-object p1, v5, LT0/m;->q:[B

    .line 132
    .line 133
    iget-object v0, p0, Lq0/j;->z:Lg0/z;

    .line 134
    .line 135
    invoke-virtual {v0}, Lg0/z;->e()[B

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const/16 v1, 0x8

    .line 140
    .line 141
    invoke-static {p1, v4, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lq0/j;->z:Lg0/z;

    .line 145
    .line 146
    invoke-virtual {p1, v4}, Lg0/z;->T(I)V

    .line 147
    .line 148
    .line 149
    iget-object p1, p0, Lq0/j;->z:Lg0/z;

    .line 150
    .line 151
    invoke-virtual {p1, v1}, Lg0/z;->S(I)V

    .line 152
    .line 153
    .line 154
    iget-object p1, p0, Lq0/j;->z:Lg0/z;

    .line 155
    .line 156
    invoke-virtual {p1}, Lg0/z;->z()J

    .line 157
    .line 158
    .line 159
    move-result-wide v0

    .line 160
    const-wide v2, 0x1ffffffffL

    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    and-long/2addr v0, v2

    .line 166
    return-wide v0

    .line 167
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 168
    .line 169
    goto :goto_0

    .line 170
    :catch_0
    :cond_4
    return-wide v0
.end method

.method public final u(Li0/g;Li0/k;Z)LF0/j;
    .locals 12

    .line 1
    invoke-interface {p1, p2}, Li0/g;->e(Li0/k;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    if-eqz p3, :cond_0

    .line 6
    .line 7
    :try_start_0
    iget-object v6, p0, Lq0/j;->u:Lg0/E;

    .line 8
    .line 9
    iget-boolean v7, p0, Lq0/j;->s:Z

    .line 10
    .line 11
    iget-wide v8, p0, Ly0/e;->g:J

    .line 12
    .line 13
    iget-wide v10, p0, Lq0/j;->D:J

    .line 14
    .line 15
    invoke-virtual/range {v6 .. v11}, Lg0/E;->j(ZJJ)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception p1

    .line 20
    new-instance p2, Ljava/io/IOException;

    .line 21
    .line 22
    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    throw p2

    .line 26
    :catch_1
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 27
    .line 28
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p1

    .line 32
    :cond_0
    :goto_0
    new-instance p3, LF0/j;

    .line 33
    .line 34
    iget-wide v2, p2, Li0/k;->g:J

    .line 35
    .line 36
    move-object v0, p3

    .line 37
    move-object v1, p1

    .line 38
    invoke-direct/range {v0 .. v5}, LF0/j;-><init>(Ld0/i;JJ)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lq0/j;->E:Lq0/k;

    .line 42
    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    invoke-virtual {p0, p3}, Lq0/j;->t(LF0/s;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v8

    .line 49
    invoke-virtual {p3}, LF0/j;->h()V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lq0/j;->r:Lq0/k;

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-interface {v0}, Lq0/k;->f()Lq0/k;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v0, p0, Lq0/j;->v:Lq0/h;

    .line 62
    .line 63
    iget-object v1, p2, Li0/k;->a:Landroid/net/Uri;

    .line 64
    .line 65
    iget-object v2, p0, Ly0/e;->d:Ld0/q;

    .line 66
    .line 67
    iget-object v3, p0, Lq0/j;->w:Ljava/util/List;

    .line 68
    .line 69
    iget-object v4, p0, Lq0/j;->u:Lg0/E;

    .line 70
    .line 71
    invoke-interface {p1}, Li0/g;->g()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    iget-object v7, p0, Lq0/j;->C:Ll0/y1;

    .line 76
    .line 77
    move-object v6, p3

    .line 78
    invoke-interface/range {v0 .. v7}, Lq0/h;->c(Landroid/net/Uri;Ld0/q;Ljava/util/List;Lg0/E;Ljava/util/Map;LF0/s;Ll0/y1;)Lq0/k;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :goto_1
    iput-object p1, p0, Lq0/j;->E:Lq0/k;

    .line 83
    .line 84
    invoke-interface {p1}, Lq0/k;->a()Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    iget-object p1, p0, Lq0/j;->F:Lq0/s;

    .line 91
    .line 92
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    cmp-long p2, v8, v0

    .line 98
    .line 99
    if-eqz p2, :cond_2

    .line 100
    .line 101
    iget-object p2, p0, Lq0/j;->u:Lg0/E;

    .line 102
    .line 103
    invoke-virtual {p2, v8, v9}, Lg0/E;->b(J)J

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    iget-wide v0, p0, Ly0/e;->g:J

    .line 109
    .line 110
    :goto_2
    invoke-virtual {p1, v0, v1}, Lq0/s;->p0(J)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    iget-object p1, p0, Lq0/j;->F:Lq0/s;

    .line 115
    .line 116
    const-wide/16 v0, 0x0

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :goto_3
    iget-object p1, p0, Lq0/j;->F:Lq0/s;

    .line 120
    .line 121
    invoke-virtual {p1}, Lq0/s;->b0()V

    .line 122
    .line 123
    .line 124
    iget-object p1, p0, Lq0/j;->E:Lq0/k;

    .line 125
    .line 126
    iget-object p2, p0, Lq0/j;->F:Lq0/s;

    .line 127
    .line 128
    invoke-interface {p1, p2}, Lq0/k;->b(LF0/t;)V

    .line 129
    .line 130
    .line 131
    :cond_4
    iget-object p1, p0, Lq0/j;->F:Lq0/s;

    .line 132
    .line 133
    iget-object p2, p0, Lq0/j;->x:Ld0/m;

    .line 134
    .line 135
    invoke-virtual {p1, p2}, Lq0/s;->m0(Ld0/m;)V

    .line 136
    .line 137
    .line 138
    return-object p3
.end method

.method public v()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq0/j;->M:Z

    .line 3
    .line 4
    return-void
.end method
