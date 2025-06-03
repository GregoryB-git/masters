.class public final LR2/C4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LR2/v4;


# direct methods
.method public constructor <init>(LR2/v4;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/C4;->p:LR2/v4;

    .line 2
    .line 3
    iput-wide p2, p0, LR2/C4;->o:J

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/C4;->p:LR2/v4;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/G1;->o()LR2/B;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, LR2/C4;->o:J

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, LR2/B;->v(J)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LR2/C4;->p:LR2/v4;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput-object v1, v0, LR2/v4;->e:LR2/w4;

    .line 16
    .line 17
    return-void
.end method
