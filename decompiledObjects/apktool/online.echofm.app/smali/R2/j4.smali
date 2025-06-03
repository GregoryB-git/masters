.class public final LR2/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/z;

.field public final synthetic p:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;LR2/z;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/j4;->p:LR2/C3;

    .line 2
    .line 3
    iput-object p2, p0, LR2/j4;->o:LR2/z;

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
    iget-object v0, p0, LR2/j4;->p:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LR2/j4;->o:LR2/z;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LR2/l2;->z(LR2/z;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, LR2/j4;->p:LR2/C3;

    .line 16
    .line 17
    invoke-virtual {v0}, LR2/G1;->t()LR2/D4;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, LR2/D4;->U(Z)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object v0, p0, LR2/j4;->p:LR2/C3;

    .line 27
    .line 28
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget-object v1, p0, LR2/j4;->o:LR2/z;

    .line 37
    .line 38
    invoke-virtual {v1}, LR2/z;->a()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "Lower precedence consent source ignored, proposed source"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
