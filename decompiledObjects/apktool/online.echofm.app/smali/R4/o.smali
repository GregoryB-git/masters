.class public final LR4/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR4/o$a;
    }
.end annotation


# static fields
.field public static final c:LR4/o$a;


# instance fields
.field public final a:Ls4/i;

.field public final b:LR4/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LR4/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LR4/o$a;-><init>(Lkotlin/jvm/internal/g;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LR4/o;->c:LR4/o$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ls4/i;LR4/i;)V
    .locals 1

    .line 1
    const-string v0, "firebaseInstallations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventGDTLogger"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LR4/o;->a:Ls4/i;

    .line 15
    .line 16
    iput-object p2, p0, LR4/o;->b:LR4/i;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(LR4/q;LX5/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, LR4/o$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LR4/o$b;

    .line 7
    .line 8
    iget v1, v0, LR4/o$b;->u:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LR4/o$b;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LR4/o$b;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LR4/o$b;-><init>(LR4/o;LX5/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LR4/o$b;->s:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, LY5/b;->c()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LR4/o$b;->u:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const-string v4, "SessionCoordinator"

    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    if-ne v2, v3, :cond_1

    .line 39
    .line 40
    iget-object p1, v0, LR4/o$b;->r:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LR4/t;

    .line 43
    .line 44
    iget-object v1, v0, LR4/o$b;->q:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, LR4/t;

    .line 47
    .line 48
    iget-object v2, v0, LR4/o$b;->p:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, LR4/q;

    .line 51
    .line 52
    iget-object v0, v0, LR4/o$b;->o:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, LR4/o;

    .line 55
    .line 56
    :try_start_0
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :catch_0
    move-exception p1

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :cond_2
    invoke-static {p2}, LV5/o;->b(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, LR4/q;->c()LR4/t;

    .line 74
    .line 75
    .line 76
    move-result-object p2

    .line 77
    :try_start_1
    iget-object v2, p0, LR4/o;->a:Ls4/i;

    .line 78
    .line 79
    invoke-interface {v2}, Ls4/i;->a()LV2/j;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v5, "firebaseInstallations.id"

    .line 84
    .line 85
    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object p0, v0, LR4/o$b;->o:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object p1, v0, LR4/o$b;->p:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object p2, v0, LR4/o$b;->q:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p2, v0, LR4/o$b;->r:Ljava/lang/Object;

    .line 95
    .line 96
    iput v3, v0, LR4/o$b;->u:I

    .line 97
    .line 98
    invoke-static {v2, v0}, Lz6/b;->a(LV2/j;LX5/d;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 102
    if-ne v0, v1, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    move-object v2, p1

    .line 106
    move-object p1, p2

    .line 107
    move-object v1, p1

    .line 108
    move-object p2, v0

    .line 109
    move-object v0, p0

    .line 110
    :goto_1
    :try_start_2
    const-string v3, "{\n        firebaseInstallations.id.await()\n      }"

    .line 111
    .line 112
    invoke-static {p2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    check-cast p2, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :catch_1
    move-exception v0

    .line 119
    move-object v2, p1

    .line 120
    move-object v1, p2

    .line 121
    move-object p1, v0

    .line 122
    move-object v0, p0

    .line 123
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v3, "Error getting Firebase Installation ID: "

    .line 129
    .line 130
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    const-string p1, ". Using an empty ID"

    .line 137
    .line 138
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-static {v4, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 146
    .line 147
    .line 148
    const-string p2, ""

    .line 149
    .line 150
    move-object p1, v1

    .line 151
    :goto_3
    invoke-virtual {p1, p2}, LR4/t;->g(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    :try_start_3
    iget-object p1, v0, LR4/o;->b:LR4/i;

    .line 155
    .line 156
    invoke-interface {p1, v2}, LR4/i;->a(LR4/q;)V

    .line 157
    .line 158
    .line 159
    new-instance p1, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    const-string p2, "Successfully logged Session Start event: "

    .line 165
    .line 166
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v2}, LR4/q;->c()LR4/t;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    invoke-virtual {p2}, LR4/t;->e()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v4, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    .line 185
    .line 186
    .line 187
    goto :goto_4

    .line 188
    :catch_2
    move-exception p1

    .line 189
    const-string p2, "Error logging Session Start event to DataTransport: "

    .line 190
    .line 191
    invoke-static {v4, p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 192
    .line 193
    .line 194
    :goto_4
    sget-object p1, LV5/t;->a:LV5/t;

    .line 195
    .line 196
    return-object p1
.end method
