.class public final Ll9/e;
.super Lma/w;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w<",
        "Ll9/e;",
        "Ll9/e$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# static fields
.field public static final BASE_WRITES_FIELD_NUMBER:I = 0x4

.field public static final BATCH_ID_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Ll9/e;

.field public static final LOCAL_WRITE_TIME_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lma/b1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "Ll9/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final WRITES_FIELD_NUMBER:I = 0x2


# instance fields
.field private baseWrites_:Lma/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/a0$d<",
            "Lka/e0;",
            ">;"
        }
    .end annotation
.end field

.field private batchId_:I

.field private bitField0_:I

.field private localWriteTime_:Lma/n1;

.field private writes_:Lma/a0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/a0$d<",
            "Lka/e0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll9/e;

    invoke-direct {v0}, Ll9/e;-><init>()V

    sput-object v0, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    const-class v1, Ll9/e;

    invoke-static {v1, v0}, Lma/w;->D(Ljava/lang/Class;Lma/w;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lma/w;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lma/e1;->d:Lma/e1;

    .line 5
    .line 6
    iput-object v0, p0, Ll9/e;->writes_:Lma/a0$d;

    .line 7
    .line 8
    iput-object v0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public static synthetic F()Ll9/e;
    .locals 1

    sget-object v0, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    return-object v0
.end method

.method public static G(Ll9/e;I)V
    .locals 0

    iput p1, p0, Ll9/e;->batchId_:I

    return-void
.end method

.method public static H(Ll9/e;Lka/e0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    .line 5
    .line 6
    invoke-interface {v0}, Lma/a0$d;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lma/w;->A(Lma/a0$d;)Lma/a0$d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static I(Ll9/e;Lka/e0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ll9/e;->writes_:Lma/a0$d;

    .line 5
    .line 6
    invoke-interface {v0}, Lma/a0$d;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    invoke-static {v0}, Lma/w;->A(Lma/a0$d;)Lma/a0$d;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Ll9/e;->writes_:Lma/a0$d;

    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Ll9/e;->writes_:Lma/a0$d;

    .line 19
    .line 20
    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method

.method public static J(Ll9/e;Lma/n1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/e;->localWriteTime_:Lma/n1;

    iget p1, p0, Ll9/e;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll9/e;->bitField0_:I

    return-void
.end method

.method public static Q()Ll9/e$a;
    .locals 1

    sget-object v0, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    invoke-virtual {v0}, Lma/w;->s()Lma/w$a;

    move-result-object v0

    check-cast v0, Ll9/e$a;

    return-object v0
.end method

.method public static R(Lma/h;)Ll9/e;
    .locals 2

    .line 1
    sget-object v0, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    .line 2
    .line 3
    invoke-static {}, Lma/o;->a()Lma/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p0}, Lma/h;->t()Lma/i;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {v0, p0, v1}, Lma/w;->C(Lma/w;Lma/i;Lma/o;)Lma/w;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :try_start_0
    invoke-virtual {p0, v1}, Lma/i;->a(I)V
    :try_end_0
    .catch Lma/b0; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lma/w;->p(Lma/w;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lma/w;->p(Lma/w;)V

    .line 23
    .line 24
    .line 25
    check-cast v0, Ll9/e;

    .line 26
    .line 27
    return-object v0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    throw p0
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static S([B)Ll9/e;
    .locals 1

    sget-object v0, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    invoke-static {v0, p0}, Lma/w;->B(Lma/w;[B)Lma/w;

    move-result-object p0

    check-cast p0, Ll9/e;

    return-object p0
.end method


# virtual methods
.method public final K(I)Lka/e0;
    .locals 1

    iget-object v0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lka/e0;

    return-object p1
.end method

.method public final L()I
    .locals 1

    iget-object v0, p0, Ll9/e;->baseWrites_:Lma/a0$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final M()I
    .locals 1

    iget v0, p0, Ll9/e;->batchId_:I

    return v0
.end method

.method public final N()Lma/n1;
    .locals 1

    iget-object v0, p0, Ll9/e;->localWriteTime_:Lma/n1;

    if-nez v0, :cond_0

    invoke-static {}, Lma/n1;->I()Lma/n1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final O(I)Lka/e0;
    .locals 1

    iget-object v0, p0, Ll9/e;->writes_:Lma/a0$d;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lka/e0;

    return-object p1
.end method

.method public final P()I
    .locals 1

    iget-object v0, p0, Ll9/e;->writes_:Lma/a0$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final t(Lma/w$f;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-class v0, Lka/e0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v1, 0x1

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p1

    .line 17
    :pswitch_0
    sget-object p1, Ll9/e;->PARSER:Lma/b1;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    const-class v0, Ll9/e;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    sget-object p1, Ll9/e;->PARSER:Lma/b1;

    .line 25
    .line 26
    if-nez p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Lma/w$b;

    .line 29
    .line 30
    sget-object v1, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    .line 31
    .line 32
    invoke-direct {p1, v1}, Lma/w$b;-><init>(Lma/w;)V

    .line 33
    .line 34
    .line 35
    sput-object p1, Ll9/e;->PARSER:Lma/b1;

    .line 36
    .line 37
    :cond_0
    monitor-exit v0

    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p1

    .line 42
    :cond_1
    :goto_0
    return-object p1

    .line 43
    :pswitch_1
    sget-object p1, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_2
    new-instance p1, Ll9/e$a;

    .line 47
    .line 48
    invoke-direct {p1}, Ll9/e$a;-><init>()V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_3
    new-instance p1, Ll9/e;

    .line 53
    .line 54
    invoke-direct {p1}, Ll9/e;-><init>()V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_4
    const/4 p1, 0x7

    .line 59
    new-array p1, p1, [Ljava/lang/Object;

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const-string v3, "bitField0_"

    .line 63
    .line 64
    aput-object v3, p1, v2

    .line 65
    .line 66
    const-string v2, "batchId_"

    .line 67
    .line 68
    aput-object v2, p1, v1

    .line 69
    .line 70
    const/4 v1, 0x2

    .line 71
    const-string v2, "writes_"

    .line 72
    .line 73
    aput-object v2, p1, v1

    .line 74
    .line 75
    const/4 v1, 0x3

    .line 76
    aput-object v0, p1, v1

    .line 77
    .line 78
    const/4 v1, 0x4

    .line 79
    const-string v2, "localWriteTime_"

    .line 80
    .line 81
    aput-object v2, p1, v1

    .line 82
    .line 83
    const/4 v1, 0x5

    .line 84
    const-string v2, "baseWrites_"

    .line 85
    .line 86
    aput-object v2, p1, v1

    .line 87
    .line 88
    const/4 v1, 0x6

    .line 89
    aput-object v0, p1, v1

    .line 90
    .line 91
    const-string v0, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u1009\u0000\u0004\u001b"

    .line 92
    .line 93
    sget-object v1, Ll9/e;->DEFAULT_INSTANCE:Ll9/e;

    .line 94
    .line 95
    new-instance v2, Lma/f1;

    .line 96
    .line 97
    invoke-direct {v2, v1, v0, p1}, Lma/f1;-><init>(Lma/w;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    return-object v2

    .line 101
    :pswitch_5
    const/4 p1, 0x0

    .line 102
    return-object p1

    .line 103
    :pswitch_6
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    return-object p1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
.end method
