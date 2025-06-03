.class public final LR2/R3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:J

.field public final synthetic p:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;J)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/R3;->p:LR2/C3;

    .line 2
    .line 3
    iput-wide p2, p0, LR2/R3;->o:J

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
    iget-object v0, p0, LR2/R3;->p:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, LR2/l2;->k:LR2/q2;

    .line 8
    .line 9
    iget-wide v1, p0, LR2/R3;->o:J

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, LR2/q2;->b(J)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LR2/R3;->p:LR2/C3;

    .line 15
    .line 16
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, LR2/Y1;->F()LR2/a2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-wide v1, p0, LR2/R3;->o:J

    .line 25
    .line 26
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    const-string v2, "Session timeout duration set"

    .line 31
    .line 32
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
