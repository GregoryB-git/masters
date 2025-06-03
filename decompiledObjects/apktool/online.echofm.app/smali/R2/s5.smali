.class public final synthetic LR2/s5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic o:LR2/p5;


# direct methods
.method public synthetic constructor <init>(LR2/p5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR2/s5;->o:LR2/p5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, LR2/s5;->o:LR2/p5;

    .line 2
    .line 3
    iget-object v1, v0, LR2/p5;->q:LR2/q5;

    .line 4
    .line 5
    iget-wide v5, v0, LR2/p5;->o:J

    .line 6
    .line 7
    iget-wide v2, v0, LR2/p5;->p:J

    .line 8
    .line 9
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/m3;->n()V

    .line 12
    .line 13
    .line 14
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

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
    const-string v4, "Application going to the background"

    .line 25
    .line 26
    invoke-virtual {v0, v4}, LR2/a2;->a(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 30
    .line 31
    invoke-virtual {v0}, LR2/m3;->i()LR2/l2;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, LR2/l2;->s:LR2/o2;

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    invoke-virtual {v0, v4}, LR2/o2;->a(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 42
    .line 43
    invoke-virtual {v0, v4}, LR2/l5;->D(Z)V

    .line 44
    .line 45
    .line 46
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 47
    .line 48
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, LR2/g;->Q()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 59
    .line 60
    iget-object v0, v0, LR2/l5;->f:LR2/r5;

    .line 61
    .line 62
    invoke-virtual {v0, v2, v3}, LR2/r5;->e(J)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 66
    .line 67
    const/4 v4, 0x0

    .line 68
    invoke-virtual {v0, v4, v4, v2, v3}, LR2/l5;->E(ZZJ)Z

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/m7;->a()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 78
    .line 79
    invoke-virtual {v0}, LR2/m3;->f()LR2/g;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sget-object v2, LR2/K;->K0:LR2/P1;

    .line 84
    .line 85
    invoke-virtual {v0, v2}, LR2/g;->s(LR2/P1;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 92
    .line 93
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {v0}, LR2/Y1;->J()LR2/a2;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    const-string v2, "Application backgrounded at: timestamp_millis"

    .line 106
    .line 107
    invoke-virtual {v0, v2, v1}, LR2/a2;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_1
    iget-object v0, v1, LR2/q5;->b:LR2/l5;

    .line 112
    .line 113
    invoke-virtual {v0}, LR2/G1;->r()LR2/C3;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    new-instance v7, Landroid/os/Bundle;

    .line 118
    .line 119
    invoke-direct {v7}, Landroid/os/Bundle;-><init>()V

    .line 120
    .line 121
    .line 122
    const-string v3, "auto"

    .line 123
    .line 124
    const-string v4, "_ab"

    .line 125
    .line 126
    invoke-virtual/range {v2 .. v7}, LR2/C3;->U(Ljava/lang/String;Ljava/lang/String;JLandroid/os/Bundle;)V

    .line 127
    .line 128
    .line 129
    return-void
.end method
