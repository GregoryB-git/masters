.class public final Le7/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/Long;

.field public final i:Ljava/lang/Long;

.field public final j:Ljava/lang/Long;

.field public final k:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;J)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v9, p3

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Le7/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V
    .locals 14

    move-object v0, p0

    move-wide/from16 v1, p3

    move-wide/from16 v3, p5

    move-wide/from16 v5, p7

    move-wide/from16 v7, p11

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lm6/j;->e(Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, Lm6/j;->e(Ljava/lang/String;)V

    const-wide/16 v9, 0x0

    cmp-long v11, v1, v9

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-ltz v11, :cond_0

    move v11, v12

    goto :goto_0

    :cond_0
    move v11, v13

    :goto_0
    invoke-static {v11}, Lm6/j;->b(Z)V

    cmp-long v11, v3, v9

    if-ltz v11, :cond_1

    move v11, v12

    goto :goto_1

    :cond_1
    move v11, v13

    :goto_1
    invoke-static {v11}, Lm6/j;->b(Z)V

    cmp-long v11, v5, v9

    if-ltz v11, :cond_2

    move v11, v12

    goto :goto_2

    :cond_2
    move v11, v13

    :goto_2
    invoke-static {v11}, Lm6/j;->b(Z)V

    cmp-long v9, v7, v9

    if-ltz v9, :cond_3

    goto :goto_3

    :cond_3
    move v12, v13

    :goto_3
    invoke-static {v12}, Lm6/j;->b(Z)V

    move-object v9, p1

    iput-object v9, v0, Le7/b0;->a:Ljava/lang/String;

    move-object/from16 v9, p2

    iput-object v9, v0, Le7/b0;->b:Ljava/lang/String;

    iput-wide v1, v0, Le7/b0;->c:J

    iput-wide v3, v0, Le7/b0;->d:J

    iput-wide v5, v0, Le7/b0;->e:J

    move-wide/from16 v1, p9

    iput-wide v1, v0, Le7/b0;->f:J

    iput-wide v7, v0, Le7/b0;->g:J

    move-object/from16 v1, p13

    iput-object v1, v0, Le7/b0;->h:Ljava/lang/Long;

    move-object/from16 v1, p14

    iput-object v1, v0, Le7/b0;->i:Ljava/lang/Long;

    move-object/from16 v1, p15

    iput-object v1, v0, Le7/b0;->j:Ljava/lang/Long;

    move-object/from16 v1, p16

    iput-object v1, v0, Le7/b0;->k:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method public final a(JJ)Le7/b0;
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v12, p1

    new-instance v18, Le7/b0;

    move-object/from16 v1, v18

    iget-object v2, v0, Le7/b0;->a:Ljava/lang/String;

    iget-object v3, v0, Le7/b0;->b:Ljava/lang/String;

    iget-wide v4, v0, Le7/b0;->c:J

    iget-wide v6, v0, Le7/b0;->d:J

    iget-wide v8, v0, Le7/b0;->e:J

    iget-wide v10, v0, Le7/b0;->f:J

    invoke-static/range {p3 .. p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v14

    iget-object v15, v0, Le7/b0;->i:Ljava/lang/Long;

    move-object/from16 p1, v1

    iget-object v1, v0, Le7/b0;->j:Ljava/lang/Long;

    move-object/from16 v16, v1

    iget-object v1, v0, Le7/b0;->k:Ljava/lang/Boolean;

    move-object/from16 v17, v1

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v17}, Le7/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v18
.end method

.method public final b(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)Le7/b0;
    .locals 19

    move-object/from16 v0, p0

    if-eqz p3, :cond_0

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    move-object/from16 v18, v1

    goto :goto_0

    :cond_0
    move-object/from16 v18, p3

    :goto_0
    new-instance v1, Le7/b0;

    move-object v2, v1

    iget-object v3, v0, Le7/b0;->a:Ljava/lang/String;

    iget-object v4, v0, Le7/b0;->b:Ljava/lang/String;

    iget-wide v5, v0, Le7/b0;->c:J

    iget-wide v7, v0, Le7/b0;->d:J

    iget-wide v9, v0, Le7/b0;->e:J

    iget-wide v11, v0, Le7/b0;->f:J

    iget-wide v13, v0, Le7/b0;->g:J

    iget-object v15, v0, Le7/b0;->h:Ljava/lang/Long;

    move-object/from16 v16, p1

    move-object/from16 v17, p2

    invoke-direct/range {v2 .. v18}, Le7/b0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    return-object v1
.end method
