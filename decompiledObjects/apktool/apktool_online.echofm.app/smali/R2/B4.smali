.class public final LR2/B4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/w4;

.field public final synthetic p:J

.field public final synthetic q:LR2/v4;


# direct methods
.method public constructor <init>(LR2/v4;LR2/w4;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/B4;->q:LR2/v4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/B4;->o:LR2/w4;

    .line 4
    .line 5
    iput-wide p3, p0, LR2/B4;->p:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/B4;->q:LR2/v4;

    .line 2
    .line 3
    iget-object v1, p0, LR2/B4;->o:LR2/w4;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-wide v3, p0, LR2/B4;->p:J

    .line 7
    .line 8
    invoke-static {v0, v1, v2, v3, v4}, LR2/v4;->G(LR2/v4;LR2/w4;ZJ)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, LR2/B4;->q:LR2/v4;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, v0, LR2/v4;->e:LR2/w4;

    .line 15
    .line 16
    invoke-virtual {v0}, LR2/G1;->t()LR2/D4;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0, v1}, LR2/D4;->G(LR2/w4;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
