.class public final LR2/Q3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/b;


# instance fields
.field public final synthetic a:LR2/v5;

.field public final synthetic b:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;LR2/v5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/Q3;->b:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/Q3;->a:LR2/v5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object p1, p0, LR2/Q3;->b:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {p1}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LR2/Q3;->b:LR2/C3;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p1, v0}, LR2/C3;->N(LR2/C3;Z)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, LR2/Q3;->b:LR2/C3;

    .line 13
    .line 14
    invoke-virtual {p1}, LR2/C3;->r0()V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LR2/Q3;->b:LR2/C3;

    .line 18
    .line 19
    invoke-virtual {p1}, LR2/m3;->j()LR2/Y1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, LR2/Y1;->F()LR2/a2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object v0, p0, LR2/Q3;->a:LR2/v5;

    .line 28
    .line 29
    iget-object v0, v0, LR2/v5;->o:Ljava/lang/String;

    .line 30
    .line 31
    const-string v1, "registerTriggerAsync ran. uri"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final onFailure(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/Q3;->b:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/Q3;->b:LR2/C3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, LR2/C3;->N(LR2/C3;Z)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LR2/Q3;->b:LR2/C3;

    .line 13
    .line 14
    invoke-virtual {v0}, LR2/C3;->r0()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LR2/Q3;->b:LR2/C3;

    .line 18
    .line 19
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "registerTriggerAsync failed with throwable"

    .line 28
    .line 29
    invoke-virtual {v0, v1, p1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method
