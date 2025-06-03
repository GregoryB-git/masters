.class public final LR2/V3;
.super LR2/x;
.source "SourceFile"


# instance fields
.field public final synthetic e:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;LR2/o3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/V3;->e:LR2/C3;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LR2/x;-><init>(LR2/o3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/V3;->e:LR2/C3;

    .line 2
    .line 3
    iget-object v0, v0, LR2/m3;->a:LR2/N2;

    .line 4
    .line 5
    invoke-virtual {v0}, LR2/N2;->u()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LR2/V3;->e:LR2/C3;

    .line 12
    .line 13
    invoke-static {v0}, LR2/C3;->B(LR2/C3;)LR2/x;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-wide/16 v1, 0x7d0

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, LR2/x;->b(J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
