.class public abstract LR2/f1;
.super LR2/G1;
.source "SourceFile"


# instance fields
.field public b:Z


# direct methods
.method public constructor <init>(LR2/N2;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LR2/G1;-><init>(LR2/N2;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LR2/m3;->a:LR2/N2;

    .line 5
    .line 6
    invoke-virtual {p1}, LR2/N2;->n()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public abstract A()Z
.end method

.method public final v()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LR2/f1;->z()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 9
    .line 10
    const-string v1, "Not initialized"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method public final w()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LR2/f1;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, LR2/f1;->A()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 12
    .line 13
    invoke-virtual {v0}, LR2/N2;->R()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, LR2/f1;->b:Z

    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v1, "Can\'t initialize twice"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0
.end method

.method public final x()V
    .locals 2

    .line 1
    iget-boolean v0, p0, LR2/f1;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LR2/f1;->y()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/m3;->a:LR2/N2;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/N2;->R()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, LR2/f1;->b:Z

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "Can\'t initialize twice"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0
.end method

.method public y()V
    .locals 0

    .line 1
    return-void
.end method

.method public final z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LR2/f1;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
