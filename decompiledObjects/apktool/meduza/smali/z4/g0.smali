.class public final Lz4/g0;
.super Lv3/r1;
.source "SourceFile"


# static fields
.field public static final w:Ljava/lang/Object;


# instance fields
.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final o:J

.field public final p:J

.field public final q:Z

.field public final r:Z

.field public final s:Z

.field public final t:Ljava/lang/Object;

.field public final u:Lv3/o0;

.field public final v:Lv3/o0$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz4/g0;->w:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Lv3/o0$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lv3/o0$a;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v1, "SinglePeriodTimeline"

    .line 14
    .line 15
    iput-object v1, v0, Lv3/o0$a;->a:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v1, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 18
    .line 19
    iput-object v1, v0, Lv3/o0$a;->b:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-virtual {v0}, Lv3/o0$a;->a()Lv3/o0;

    .line 22
    .line 23
    .line 24
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>(JJJJJJZZZLjava/lang/Object;Lv3/o0;Lv3/o0$e;)V
    .locals 3

    move-object v0, p0

    invoke-direct {p0}, Lv3/r1;-><init>()V

    move-wide v1, p1

    iput-wide v1, v0, Lz4/g0;->b:J

    move-wide v1, p3

    iput-wide v1, v0, Lz4/g0;->c:J

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lz4/g0;->d:J

    move-wide v1, p5

    iput-wide v1, v0, Lz4/g0;->e:J

    move-wide v1, p7

    iput-wide v1, v0, Lz4/g0;->f:J

    move-wide v1, p9

    iput-wide v1, v0, Lz4/g0;->o:J

    move-wide v1, p11

    iput-wide v1, v0, Lz4/g0;->p:J

    move/from16 v1, p13

    iput-boolean v1, v0, Lz4/g0;->q:Z

    move/from16 v1, p14

    iput-boolean v1, v0, Lz4/g0;->r:Z

    move/from16 v1, p15

    iput-boolean v1, v0, Lz4/g0;->s:Z

    move-object/from16 v1, p16

    iput-object v1, v0, Lz4/g0;->t:Ljava/lang/Object;

    .line 1
    invoke-virtual/range {p17 .. p17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v1, p17

    .line 2
    iput-object v1, v0, Lz4/g0;->u:Lv3/o0;

    move-object/from16 v1, p18

    iput-object v1, v0, Lz4/g0;->v:Lv3/o0$e;

    return-void
.end method

.method public constructor <init>(JJJJZZZLg5/a;Lv3/o0;)V
    .locals 19

    move-object/from16 v14, p13

    if-eqz p11, :cond_0

    iget-object v0, v14, Lv3/o0;->c:Lv3/o0$e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v18, v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v5, p1

    move-wide/from16 v7, p3

    move-wide/from16 v9, p5

    move-wide/from16 v11, p7

    move/from16 v13, p9

    move/from16 v14, p10

    move-object/from16 v16, p12

    move-object/from16 v17, p13

    invoke-direct/range {v0 .. v18}, Lz4/g0;-><init>(JJJJJJZZZLjava/lang/Object;Lv3/o0;Lv3/o0$e;)V

    return-void
.end method

.method public constructor <init>(JZZLv3/o0;)V
    .locals 14

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p1

    move/from16 v9, p3

    move/from16 v11, p4

    move-object/from16 v13, p5

    invoke-direct/range {v0 .. v13}, Lz4/g0;-><init>(JJJJZZZLg5/a;Lv3/o0;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Lz4/g0;->w:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method public final f(ILv3/r1$b;Z)Lv3/r1$b;
    .locals 10

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lx6/b;->x(II)V

    if-eqz p3, :cond_0

    sget-object p1, Lz4/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v2, p1

    const/4 v1, 0x0

    iget-wide v4, p0, Lz4/g0;->e:J

    iget-wide v6, p0, Lz4/g0;->o:J

    neg-long v6, v6

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La5/a;->o:La5/a;

    const/4 v3, 0x0

    const/4 v9, 0x0

    move-object v0, p2

    invoke-virtual/range {v0 .. v9}, Lv3/r1$b;->h(Ljava/lang/Object;Ljava/lang/Object;IJJLa5/a;Z)V

    return-object p2
.end method

.method public final h()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lx6/b;->x(II)V

    sget-object p1, Lz4/g0;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final n(ILv3/r1$c;J)Lv3/r1$c;
    .locals 24

    move-object/from16 v0, p0

    const/4 v1, 0x1

    move/from16 v2, p1

    invoke-static {v2, v1}, Lx6/b;->x(II)V

    iget-wide v1, v0, Lz4/g0;->p:J

    iget-boolean v14, v0, Lz4/g0;->r:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v14, :cond_1

    iget-boolean v5, v0, Lz4/g0;->s:Z

    if-nez v5, :cond_1

    const-wide/16 v5, 0x0

    cmp-long v5, p3, v5

    if-eqz v5, :cond_1

    iget-wide v5, v0, Lz4/g0;->f:J

    cmp-long v7, v5, v3

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    add-long v1, v1, p3

    cmp-long v5, v1, v5

    if-lez v5, :cond_1

    :goto_0
    move-wide/from16 v16, v3

    goto :goto_1

    :cond_1
    move-wide/from16 v16, v1

    :goto_1
    sget-object v4, Lv3/r1$c;->z:Ljava/lang/Object;

    iget-object v5, v0, Lz4/g0;->u:Lv3/o0;

    iget-object v6, v0, Lz4/g0;->t:Ljava/lang/Object;

    iget-wide v7, v0, Lz4/g0;->b:J

    iget-wide v9, v0, Lz4/g0;->c:J

    iget-wide v11, v0, Lz4/g0;->d:J

    iget-boolean v13, v0, Lz4/g0;->q:Z

    iget-object v15, v0, Lz4/g0;->v:Lv3/o0$e;

    iget-wide v1, v0, Lz4/g0;->f:J

    move-wide/from16 v18, v1

    const/16 v20, 0x0

    const/16 v21, 0x0

    iget-wide v1, v0, Lz4/g0;->o:J

    move-wide/from16 v22, v1

    move-object/from16 v3, p2

    invoke-virtual/range {v3 .. v23}, Lv3/r1$c;->b(Ljava/lang/Object;Lv3/o0;Ljava/lang/Object;JJJZZLv3/o0$e;JJIIJ)V

    return-object p2
.end method

.method public final o()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
