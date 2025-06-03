.class public final Lf5/e$a;
.super Lf5/e$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final t:Z

.field public final u:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZZZ)V
    .locals 2

    move-object v0, p0

    invoke-direct/range {p0 .. p15}, Lf5/e$d;-><init>(Ljava/lang/String;Lf5/e$c;JIJLa4/d;Ljava/lang/String;Ljava/lang/String;JJZ)V

    move/from16 v1, p16

    iput-boolean v1, v0, Lf5/e$a;->t:Z

    move/from16 v1, p17

    iput-boolean v1, v0, Lf5/e$a;->u:Z

    return-void
.end method
