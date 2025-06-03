.class public final Lf5/e$c;
.super Lf5/e$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final t:Ljava/lang/String;

.field public final u:Lo7/t;


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v12, p1

    move-wide/from16 v14, p3

    move-object/from16 v1, p5

    move-object/from16 v10, p6

    move-object/from16 v11, p7

    sget-object v2, Lo7/t;->b:Lo7/t$b;

    .line 1
    sget-object v17, Lo7/l0;->e:Lo7/l0;

    const/4 v2, 0x0

    const-string v3, ""

    const-wide/16 v4, 0x0

    const/4 v6, -0x1

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v9, 0x0

    const/16 v16, 0x0

    .line 2
    invoke-direct/range {v0 .. v17}, Lf5/e$c;-><init>(Ljava/lang/String;Lf5/e$c;Ljava/lang/String;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lf5/e$c;Ljava/lang/String;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZLjava/util/List;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lf5/e$c;",
            "Ljava/lang/String;",
            "JIJ",
            "La4/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "JJZ",
            "Ljava/util/List<",
            "Lf5/e$a;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide/from16 v3, p4

    move/from16 v5, p6

    move-wide/from16 v6, p7

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-wide/from16 v11, p12

    move-wide/from16 v13, p14

    move/from16 v15, p16

    invoke-direct/range {v0 .. v15}, Lf5/e$d;-><init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZ)V

    move-object/from16 v1, p3

    iput-object v1, v0, Lf5/e$c;->t:Ljava/lang/String;

    invoke-static/range {p17 .. p17}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object v1

    iput-object v1, v0, Lf5/e$c;->u:Lo7/t;

    return-void
.end method
