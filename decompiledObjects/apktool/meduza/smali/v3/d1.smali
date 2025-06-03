.class public final Lv3/d1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final s:Lz4/t$b;


# instance fields
.field public final a:Lv3/r1;

.field public final b:Lz4/t$b;

.field public final c:J

.field public final d:J

.field public final e:I

.field public final f:Lv3/n;

.field public final g:Z

.field public final h:Lz4/j0;

.field public final i:Lr5/p;

.field public final j:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp4/a;",
            ">;"
        }
    .end annotation
.end field

.field public final k:Lz4/t$b;

.field public final l:Z

.field public final m:I

.field public final n:Lv3/e1;

.field public final o:Z

.field public volatile p:J

.field public volatile q:J

.field public volatile r:J


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lz4/t$b;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Lz4/t$b;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lv3/d1;->s:Lz4/t$b;

    return-void
.end method

.method public constructor <init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv3/r1;",
            "Lz4/t$b;",
            "JJI",
            "Lv3/n;",
            "Z",
            "Lz4/j0;",
            "Lr5/p;",
            "Ljava/util/List<",
            "Lp4/a;",
            ">;",
            "Lz4/t$b;",
            "ZI",
            "Lv3/e1;",
            "JJJZ)V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lv3/d1;->a:Lv3/r1;

    move-object v1, p2

    iput-object v1, v0, Lv3/d1;->b:Lz4/t$b;

    move-wide v1, p3

    iput-wide v1, v0, Lv3/d1;->c:J

    move-wide v1, p5

    iput-wide v1, v0, Lv3/d1;->d:J

    move v1, p7

    iput v1, v0, Lv3/d1;->e:I

    move-object v1, p8

    iput-object v1, v0, Lv3/d1;->f:Lv3/n;

    move v1, p9

    iput-boolean v1, v0, Lv3/d1;->g:Z

    move-object v1, p10

    iput-object v1, v0, Lv3/d1;->h:Lz4/j0;

    move-object v1, p11

    iput-object v1, v0, Lv3/d1;->i:Lr5/p;

    move-object v1, p12

    iput-object v1, v0, Lv3/d1;->j:Ljava/util/List;

    move-object/from16 v1, p13

    iput-object v1, v0, Lv3/d1;->k:Lz4/t$b;

    move/from16 v1, p14

    iput-boolean v1, v0, Lv3/d1;->l:Z

    move/from16 v1, p15

    iput v1, v0, Lv3/d1;->m:I

    move-object/from16 v1, p16

    iput-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-wide/from16 v1, p17

    iput-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v1, p19

    iput-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v1, p21

    iput-wide v1, v0, Lv3/d1;->r:J

    move/from16 v1, p23

    iput-boolean v1, v0, Lv3/d1;->o:Z

    return-void
.end method

.method public static h(Lr5/p;)Lv3/d1;
    .locals 25

    .line 1
    move-object/from16 v11, p0

    .line 2
    .line 3
    new-instance v24, Lv3/d1;

    .line 4
    .line 5
    move-object/from16 v0, v24

    .line 6
    .line 7
    sget-object v1, Lv3/r1;->a:Lv3/r1$a;

    .line 8
    .line 9
    sget-object v13, Lv3/d1;->s:Lz4/t$b;

    .line 10
    .line 11
    move-object v2, v13

    .line 12
    sget-object v10, Lz4/j0;->d:Lz4/j0;

    .line 13
    .line 14
    sget-object v12, Lo7/l0;->e:Lo7/l0;

    .line 15
    .line 16
    sget-object v16, Lv3/e1;->d:Lv3/e1;

    .line 17
    .line 18
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    const-wide/16 v5, 0x0

    .line 24
    .line 25
    const/4 v7, 0x1

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v9, 0x0

    .line 28
    const/4 v14, 0x0

    .line 29
    const/4 v15, 0x0

    .line 30
    const-wide/16 v17, 0x0

    .line 31
    .line 32
    const-wide/16 v19, 0x0

    .line 33
    .line 34
    const-wide/16 v21, 0x0

    .line 35
    .line 36
    const/16 v23, 0x0

    .line 37
    .line 38
    invoke-direct/range {v0 .. v23}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    .line 39
    .line 40
    .line 41
    return-object v24
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


# virtual methods
.method public final a(Lz4/t$b;)Lv3/d1;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v14, p1

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget v8, v0, Lv3/d1;->e:I

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final b(Lz4/t$b;JJJJLz4/j0;Lr5/p;Ljava/util/List;)Lv3/d1;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz4/t$b;",
            "JJJJ",
            "Lz4/j0;",
            "Lr5/p;",
            "Ljava/util/List<",
            "Lp4/a;",
            ">;)",
            "Lv3/d1;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-wide/from16 v22, p2

    move-wide/from16 v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v20, p8

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget v8, v0, Lv3/d1;->e:I

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final c(IZ)Lv3/d1;
    .locals 26

    move-object/from16 v0, p0

    move/from16 v16, p1

    move/from16 v15, p2

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget v8, v0, Lv3/d1;->e:I

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    move-object/from16 p1, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 p2, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final d(Lv3/n;)Lv3/d1;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget v8, v0, Lv3/d1;->e:I

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final e(Lv3/e1;)Lv3/d1;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v17, p1

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget v8, v0, Lv3/d1;->e:I

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final f(I)Lv3/d1;
    .locals 27

    move-object/from16 v0, p0

    move/from16 v8, p1

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v2, v0, Lv3/d1;->a:Lv3/r1;

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method

.method public final g(Lv3/r1;)Lv3/d1;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    new-instance v25, Lv3/d1;

    move-object/from16 v1, v25

    iget-object v3, v0, Lv3/d1;->b:Lz4/t$b;

    iget-wide v4, v0, Lv3/d1;->c:J

    iget-wide v6, v0, Lv3/d1;->d:J

    iget v8, v0, Lv3/d1;->e:I

    iget-object v9, v0, Lv3/d1;->f:Lv3/n;

    iget-boolean v10, v0, Lv3/d1;->g:Z

    iget-object v11, v0, Lv3/d1;->h:Lz4/j0;

    iget-object v12, v0, Lv3/d1;->i:Lr5/p;

    iget-object v13, v0, Lv3/d1;->j:Ljava/util/List;

    iget-object v14, v0, Lv3/d1;->k:Lz4/t$b;

    iget-boolean v15, v0, Lv3/d1;->l:Z

    move-object/from16 p1, v1

    iget v1, v0, Lv3/d1;->m:I

    move/from16 v16, v1

    iget-object v1, v0, Lv3/d1;->n:Lv3/e1;

    move-object/from16 v17, v1

    move-object/from16 v26, v2

    iget-wide v1, v0, Lv3/d1;->p:J

    move-wide/from16 v18, v1

    iget-wide v1, v0, Lv3/d1;->q:J

    move-wide/from16 v20, v1

    iget-wide v1, v0, Lv3/d1;->r:J

    move-wide/from16 v22, v1

    iget-boolean v1, v0, Lv3/d1;->o:Z

    move/from16 v24, v1

    move-object/from16 v1, p1

    move-object/from16 v2, v26

    invoke-direct/range {v1 .. v24}, Lv3/d1;-><init>(Lv3/r1;Lz4/t$b;JJILv3/n;ZLz4/j0;Lr5/p;Ljava/util/List;Lz4/t$b;ZILv3/e1;JJJZ)V

    return-object v25
.end method
