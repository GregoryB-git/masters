.class public final LR2/A4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/w4;

.field public final synthetic p:LR2/w4;

.field public final synthetic q:J

.field public final synthetic r:Z

.field public final synthetic s:LR2/v4;


# direct methods
.method public constructor <init>(LR2/v4;LR2/w4;LR2/w4;JZ)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/A4;->s:LR2/v4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/A4;->o:LR2/w4;

    .line 4
    .line 5
    iput-object p3, p0, LR2/A4;->p:LR2/w4;

    .line 6
    .line 7
    iput-wide p4, p0, LR2/A4;->q:J

    .line 8
    .line 9
    iput-boolean p6, p0, LR2/A4;->r:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, LR2/A4;->s:LR2/v4;

    .line 2
    .line 3
    iget-object v1, p0, LR2/A4;->o:LR2/w4;

    .line 4
    .line 5
    iget-object v2, p0, LR2/A4;->p:LR2/w4;

    .line 6
    .line 7
    iget-wide v3, p0, LR2/A4;->q:J

    .line 8
    .line 9
    iget-boolean v5, p0, LR2/A4;->r:Z

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    invoke-static/range {v0 .. v6}, LR2/v4;->F(LR2/v4;LR2/w4;LR2/w4;JZLandroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
