.class public LG4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/firebase/perf/metrics/Trace;


# direct methods
.method public constructor <init>(Lcom/google/firebase/perf/metrics/Trace;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()LN4/m;
    .locals 6

    .line 1
    invoke-static {}, LN4/m;->z0()LN4/m$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->k()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, LN4/m$b;->N(Ljava/lang/String;)LN4/m$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->m()LM4/l;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, LM4/l;->e()J

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-virtual {v0, v1, v2}, LN4/m$b;->L(J)LN4/m$b;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 30
    .line 31
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->m()LM4/l;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 36
    .line 37
    invoke-virtual {v2}, Lcom/google/firebase/perf/metrics/Trace;->j()LM4/l;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v1, v2}, LM4/l;->d(LM4/l;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    invoke-virtual {v0, v1, v2}, LN4/m$b;->M(J)LN4/m$b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->i()Ljava/util/Map;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, LG4/g;

    .line 74
    .line 75
    invoke-virtual {v2}, LG4/g;->b()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v2}, LG4/g;->a()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    invoke-virtual {v0, v3, v4, v5}, LN4/m$b;->J(Ljava/lang/String;J)LN4/m$b;

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_0
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 88
    .line 89
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->n()Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_1

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Lcom/google/firebase/perf/metrics/Trace;

    .line 114
    .line 115
    new-instance v3, LG4/k;

    .line 116
    .line 117
    invoke-direct {v3, v2}, LG4/k;-><init>(Lcom/google/firebase/perf/metrics/Trace;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3}, LG4/k;->a()LN4/m;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v0, v2}, LN4/m$b;->G(LN4/m;)LN4/m$b;

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_1
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 129
    .line 130
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->getAttributes()Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, LN4/m$b;->I(Ljava/util/Map;)LN4/m$b;

    .line 135
    .line 136
    .line 137
    iget-object v1, p0, LG4/k;->a:Lcom/google/firebase/perf/metrics/Trace;

    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/google/firebase/perf/metrics/Trace;->l()Ljava/util/List;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v1}, LJ4/a;->b(Ljava/util/List;)[LN4/k;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_2

    .line 148
    .line 149
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0, v1}, LN4/m$b;->D(Ljava/lang/Iterable;)LN4/m$b;

    .line 154
    .line 155
    .line 156
    :cond_2
    invoke-virtual {v0}, Lcom/google/protobuf/r$a;->v()Lcom/google/protobuf/r;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, LN4/m;

    .line 161
    .line 162
    return-object v0
.end method
