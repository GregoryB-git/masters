.class public LT3/n$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/n$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT3/n;->B0(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:LT3/n$o;

.field public final synthetic d:LT3/p;

.field public final synthetic e:LT3/n;


# direct methods
.method public constructor <init>(LT3/n;Ljava/lang/String;JLT3/n$o;LT3/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/n$e;->e:LT3/n;

    .line 2
    .line 3
    iput-object p2, p0, LT3/n$e;->a:Ljava/lang/String;

    .line 4
    .line 5
    iput-wide p3, p0, LT3/n$e;->b:J

    .line 6
    .line 7
    iput-object p5, p0, LT3/n$e;->c:LT3/n$o;

    .line 8
    .line 9
    iput-object p6, p0, LT3/n$e;->d:LT3/p;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 4

    .line 1
    iget-object v0, p0, LT3/n$e;->e:LT3/n;

    .line 2
    .line 3
    invoke-static {v0}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lc4/c;->f()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, LT3/n$e;->e:LT3/n;

    .line 15
    .line 16
    invoke-static {v0}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v3, p0, LT3/n$e;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v3, " response: "

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    new-array v3, v1, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v2, v3}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, LT3/n$e;->e:LT3/n;

    .line 48
    .line 49
    invoke-static {v0}, LT3/n;->H(LT3/n;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-wide v2, p0, LT3/n$e;->b:J

    .line 54
    .line 55
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, LT3/n$o;

    .line 64
    .line 65
    iget-object v2, p0, LT3/n$e;->c:LT3/n$o;

    .line 66
    .line 67
    if-ne v0, v2, :cond_2

    .line 68
    .line 69
    iget-object v0, p0, LT3/n$e;->e:LT3/n;

    .line 70
    .line 71
    invoke-static {v0}, LT3/n;->H(LT3/n;)Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-wide v1, p0, LT3/n$e;->b:J

    .line 76
    .line 77
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, LT3/n$e;->d:LT3/p;

    .line 85
    .line 86
    if-eqz v0, :cond_3

    .line 87
    .line 88
    const-string v0, "s"

    .line 89
    .line 90
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Ljava/lang/String;

    .line 95
    .line 96
    const-string v1, "ok"

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    iget-object p1, p0, LT3/n$e;->d:LT3/p;

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-interface {p1, v0, v0}, LT3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    const-string v1, "d"

    .line 112
    .line 113
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    iget-object v1, p0, LT3/n$e;->d:LT3/p;

    .line 120
    .line 121
    invoke-interface {v1, v0, p1}, LT3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_2
    iget-object p1, p0, LT3/n$e;->e:LT3/n;

    .line 126
    .line 127
    invoke-static {p1}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Lc4/c;->f()Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-eqz p1, :cond_3

    .line 136
    .line 137
    iget-object p1, p0, LT3/n$e;->e:LT3/n;

    .line 138
    .line 139
    invoke-static {p1}, LT3/n;->E(LT3/n;)Lc4/c;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance v0, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    const-string v2, "Ignoring on complete for put "

    .line 149
    .line 150
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    iget-wide v2, p0, LT3/n$e;->b:J

    .line 154
    .line 155
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v2, " because it was removed already."

    .line 159
    .line 160
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    new-array v1, v1, [Ljava/lang/Object;

    .line 168
    .line 169
    invoke-virtual {p1, v0, v1}, Lc4/c;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    :cond_3
    :goto_0
    iget-object p1, p0, LT3/n$e;->e:LT3/n;

    .line 173
    .line 174
    invoke-static {p1}, LT3/n;->I(LT3/n;)V

    .line 175
    .line 176
    .line 177
    return-void
.end method
