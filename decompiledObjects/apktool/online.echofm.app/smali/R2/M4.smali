.class public final LR2/M4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/w4;

.field public final synthetic p:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;LR2/w4;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/M4;->p:LR2/D4;

    .line 2
    .line 3
    iput-object p2, p0, LR2/M4;->o:LR2/w4;

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
    .locals 7

    .line 1
    iget-object v0, p0, LR2/M4;->p:LR2/D4;

    .line 2
    .line 3
    invoke-static {v0}, LR2/D4;->B(LR2/D4;)LR2/R1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/M4;->p:LR2/D4;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, LR2/Y1;->G()LR2/a2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "Failed to send current screen to service"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    :try_start_0
    iget-object v0, p0, LR2/M4;->o:LR2/w4;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, LR2/M4;->p:LR2/D4;

    .line 30
    .line 31
    invoke-virtual {v0}, LR2/m3;->a()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-interface/range {v1 .. v6}, LR2/R1;->I0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catch_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-wide v2, v0, LR2/w4;->c:J

    .line 50
    .line 51
    iget-object v4, v0, LR2/w4;->a:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v5, v0, LR2/w4;->b:Ljava/lang/String;

    .line 54
    .line 55
    iget-object v0, p0, LR2/M4;->p:LR2/D4;

    .line 56
    .line 57
    invoke-virtual {v0}, LR2/m3;->a()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    invoke-interface/range {v1 .. v6}, LR2/R1;->I0(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    iget-object v0, p0, LR2/M4;->p:LR2/D4;

    .line 69
    .line 70
    invoke-static {v0}, LR2/D4;->m0(LR2/D4;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :goto_1
    iget-object v1, p0, LR2/M4;->p:LR2/D4;

    .line 75
    .line 76
    invoke-virtual {v1}, LR2/m3;->j()LR2/Y1;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v1}, LR2/Y1;->G()LR2/a2;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "Failed to send current screen to the service"

    .line 85
    .line 86
    invoke-virtual {v1, v2, v0}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    return-void
.end method
