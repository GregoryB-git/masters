.class public LH3/q$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LH3/q;->K(LO3/i;Ljava/lang/Thread;Ljava/lang/Throwable;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/Throwable;

.field public final synthetic q:Ljava/lang/Thread;

.field public final synthetic r:LO3/i;

.field public final synthetic s:Z

.field public final synthetic t:LH3/q;


# direct methods
.method public constructor <init>(LH3/q;JLjava/lang/Throwable;Ljava/lang/Thread;LO3/i;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LH3/q$b;->t:LH3/q;

    .line 2
    .line 3
    iput-wide p2, p0, LH3/q$b;->o:J

    .line 4
    .line 5
    iput-object p4, p0, LH3/q$b;->p:Ljava/lang/Throwable;

    .line 6
    .line 7
    iput-object p5, p0, LH3/q$b;->q:Ljava/lang/Thread;

    .line 8
    .line 9
    iput-object p6, p0, LH3/q$b;->r:LO3/i;

    .line 10
    .line 11
    iput-boolean p7, p0, LH3/q$b;->s:Z

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()LV2/j;
    .locals 8

    .line 1
    iget-wide v0, p0, LH3/q$b;->o:J

    .line 2
    .line 3
    invoke-static {v0, v1}, LH3/q;->b(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    iget-object v0, p0, LH3/q$b;->t:LH3/q;

    .line 8
    .line 9
    invoke-static {v0}, LH3/q;->c(LH3/q;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-static {}, LE3/f;->f()LE3/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v2, "Tried to write a fatal exception while no session was open."

    .line 21
    .line 22
    invoke-virtual {v0, v2}, LE3/f;->d(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 31
    .line 32
    invoke-static {v2}, LH3/q;->g(LH3/q;)LH3/t;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2}, LH3/t;->a()Z

    .line 37
    .line 38
    .line 39
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 40
    .line 41
    invoke-static {v2}, LH3/q;->h(LH3/q;)LH3/V;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    iget-object v3, p0, LH3/q$b;->p:Ljava/lang/Throwable;

    .line 46
    .line 47
    iget-object v4, p0, LH3/q$b;->q:Ljava/lang/Thread;

    .line 48
    .line 49
    move-object v5, v0

    .line 50
    invoke-virtual/range {v2 .. v7}, LH3/V;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 54
    .line 55
    iget-wide v3, p0, LH3/q$b;->o:J

    .line 56
    .line 57
    invoke-static {v2, v3, v4}, LH3/q;->i(LH3/q;J)V

    .line 58
    .line 59
    .line 60
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 61
    .line 62
    iget-object v3, p0, LH3/q$b;->r:LO3/i;

    .line 63
    .line 64
    invoke-virtual {v2, v3}, LH3/q;->v(LO3/i;)V

    .line 65
    .line 66
    .line 67
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 68
    .line 69
    new-instance v3, LH3/h;

    .line 70
    .line 71
    iget-object v4, p0, LH3/q$b;->t:LH3/q;

    .line 72
    .line 73
    invoke-static {v4}, LH3/q;->j(LH3/q;)LH3/C;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    invoke-direct {v3, v4}, LH3/h;-><init>(LH3/C;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v3}, LH3/h;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iget-boolean v4, p0, LH3/q$b;->s:Z

    .line 85
    .line 86
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v2, v3, v4}, LH3/q;->k(LH3/q;Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 91
    .line 92
    .line 93
    iget-object v2, p0, LH3/q$b;->t:LH3/q;

    .line 94
    .line 95
    invoke-static {v2}, LH3/q;->l(LH3/q;)LH3/y;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v2}, LH3/y;->d()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-nez v2, :cond_1

    .line 104
    .line 105
    invoke-static {v1}, LV2/m;->e(Ljava/lang/Object;)LV2/j;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    return-object v0

    .line 110
    :cond_1
    iget-object v1, p0, LH3/q$b;->t:LH3/q;

    .line 111
    .line 112
    invoke-static {v1}, LH3/q;->m(LH3/q;)LH3/n;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, LH3/n;->c()Ljava/util/concurrent/Executor;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v2, p0, LH3/q$b;->r:LO3/i;

    .line 121
    .line 122
    invoke-interface {v2}, LO3/i;->a()LV2/j;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    new-instance v3, LH3/q$b$a;

    .line 127
    .line 128
    invoke-direct {v3, p0, v1, v0}, LH3/q$b$a;-><init>(LH3/q$b;Ljava/util/concurrent/Executor;Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v1, v3}, LV2/j;->p(Ljava/util/concurrent/Executor;LV2/i;)LV2/j;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LH3/q$b;->a()LV2/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
