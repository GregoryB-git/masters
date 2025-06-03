.class public final LR2/x4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/os/Bundle;

.field public final synthetic p:LR2/w4;

.field public final synthetic q:LR2/w4;

.field public final synthetic r:J

.field public final synthetic s:LR2/v4;


# direct methods
.method public constructor <init>(LR2/v4;Landroid/os/Bundle;LR2/w4;LR2/w4;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/x4;->s:LR2/v4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/x4;->o:Landroid/os/Bundle;

    .line 4
    .line 5
    iput-object p3, p0, LR2/x4;->p:LR2/w4;

    .line 6
    .line 7
    iput-object p4, p0, LR2/x4;->q:LR2/w4;

    .line 8
    .line 9
    iput-wide p5, p0, LR2/x4;->r:J

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
    .locals 6

    .line 1
    iget-object v0, p0, LR2/x4;->s:LR2/v4;

    .line 2
    .line 3
    iget-object v1, p0, LR2/x4;->o:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-object v2, p0, LR2/x4;->p:LR2/w4;

    .line 6
    .line 7
    iget-object v3, p0, LR2/x4;->q:LR2/w4;

    .line 8
    .line 9
    iget-wide v4, p0, LR2/x4;->r:J

    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, LR2/v4;->H(LR2/v4;Landroid/os/Bundle;LR2/w4;LR2/w4;J)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
