.class public final LR2/d3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/W5;

.field public final synthetic p:LR2/R2;


# direct methods
.method public constructor <init>(LR2/R2;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/d3;->p:LR2/R2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/d3;->o:LR2/W5;

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
    iget-object v0, p0, LR2/d3;->p:LR2/R2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/D5;->o0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/d3;->p:LR2/R2;

    .line 11
    .line 12
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LR2/d3;->o:LR2/W5;

    .line 17
    .line 18
    invoke-virtual {v0}, LR2/D5;->e()LR2/G2;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, LR2/m3;->n()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, LR2/D5;->p0()V

    .line 26
    .line 27
    .line 28
    iget-object v2, v1, LR2/W5;->o:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v2}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v0}, LR2/D5;->c0()LR2/g;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    sget-object v3, LR2/K;->T0:LR2/P1;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_0

    .line 50
    .line 51
    iget v2, v1, LR2/W5;->O:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/16 v2, 0x64

    .line 55
    .line 56
    :goto_0
    iget-object v3, v1, LR2/W5;->J:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v3, v2}, LR2/q3;->f(Ljava/lang/String;I)LR2/q3;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    iget-object v3, v1, LR2/W5;->o:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v0, v3}, LR2/D5;->Q(Ljava/lang/String;)LR2/q3;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4}, LR2/Y1;->K()LR2/a2;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    const-string v5, "Setting consent, package, consent"

    .line 77
    .line 78
    iget-object v6, v1, LR2/W5;->o:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v4, v5, v6, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, v1, LR2/W5;->o:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v0, v4, v2}, LR2/D5;->B(Ljava/lang/String;LR2/q3;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v3}, LR2/q3;->t(LR2/q3;)Z

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0, v1}, LR2/D5;->b0(LR2/W5;)V

    .line 95
    .line 96
    .line 97
    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/n6;->a()Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, LR2/D5;->c0()LR2/g;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    sget-object v3, LR2/K;->T0:LR2/P1;

    .line 108
    .line 109
    invoke-virtual {v2, v3}, LR2/g;->s(LR2/P1;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_2

    .line 114
    .line 115
    iget-object v2, v1, LR2/W5;->P:Ljava/lang/String;

    .line 116
    .line 117
    invoke-static {v2}, LR2/z;->c(Ljava/lang/String;)LR2/z;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    sget-object v3, LR2/z;->f:LR2/z;

    .line 122
    .line 123
    invoke-virtual {v3, v2}, LR2/z;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_2

    .line 128
    .line 129
    invoke-virtual {v0}, LR2/D5;->j()LR2/Y1;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, LR2/Y1;->K()LR2/a2;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    const-string v4, "Setting DMA consent. package, consent"

    .line 138
    .line 139
    iget-object v5, v1, LR2/W5;->o:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v3, v4, v5, v2}, LR2/a2;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    iget-object v1, v1, LR2/W5;->o:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v0, v1, v2}, LR2/D5;->A(Ljava/lang/String;LR2/z;)V

    .line 147
    .line 148
    .line 149
    :cond_2
    return-void
.end method
