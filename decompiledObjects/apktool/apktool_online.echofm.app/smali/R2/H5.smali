.class public final LR2/H5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:LR2/W5;

.field public final synthetic p:LR2/D5;


# direct methods
.method public constructor <init>(LR2/D5;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/H5;->p:LR2/D5;

    .line 2
    .line 3
    iput-object p2, p0, LR2/H5;->o:LR2/W5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LR2/H5;->p:LR2/D5;

    .line 2
    .line 3
    iget-object v1, p0, LR2/H5;->o:LR2/W5;

    .line 4
    .line 5
    iget-object v1, v1, LR2/W5;->o:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {v1}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LR2/q3;->y()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, LR2/H5;->o:LR2/W5;

    .line 25
    .line 26
    iget-object v0, v0, LR2/W5;->J:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0}, LR2/q3;->e(Ljava/lang/String;)LR2/q3;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, LR2/q3;->y()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v0, p0, LR2/H5;->p:LR2/D5;

    .line 40
    .line 41
    iget-object v2, p0, LR2/H5;->o:LR2/W5;

    .line 42
    .line 43
    invoke-virtual {v0, v2}, LR2/D5;->g(LR2/W5;)LR2/I2;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, LR2/H5;->p:LR2/D5;

    .line 50
    .line 51
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const-string v2, "App info was null when attempting to get app instance id"

    .line 60
    .line 61
    :goto_0
    invoke-virtual {v0, v2}, LR2/a2;->a(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    invoke-virtual {v0}, LR2/I2;->u0()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :cond_2
    :goto_1
    iget-object v0, p0, LR2/H5;->p:LR2/D5;

    .line 71
    .line 72
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, LR2/Y1;->K()LR2/a2;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    const-string v2, "Analytics storage consent denied. Returning null app instance id"

    .line 81
    .line 82
    goto :goto_0
.end method
