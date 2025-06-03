.class public final Ll9/c;
.super Lma/w;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll9/c$b;,
        Ll9/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w<",
        "Ll9/c;",
        "Ll9/c$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ll9/c;

.field public static final DOCUMENTS_FIELD_NUMBER:I = 0x6

.field public static final LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER:I = 0x7

.field public static final LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lma/b1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "Ll9/c;",
            ">;"
        }
    .end annotation
.end field

.field public static final QUERY_FIELD_NUMBER:I = 0x5

.field public static final RESUME_TOKEN_FIELD_NUMBER:I = 0x3

.field public static final SNAPSHOT_VERSION_FIELD_NUMBER:I = 0x2

.field public static final TARGET_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private bitField0_:I

.field private lastLimboFreeSnapshotVersion_:Lma/n1;

.field private lastListenSequenceNumber_:J

.field private resumeToken_:Lma/h;

.field private snapshotVersion_:Lma/n1;

.field private targetId_:I

.field private targetTypeCase_:I

.field private targetType_:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll9/c;

    invoke-direct {v0}, Ll9/c;-><init>()V

    sput-object v0, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    const-class v1, Ll9/c;

    invoke-static {v1, v0}, Lma/w;->D(Ljava/lang/Class;Lma/w;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lma/w;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ll9/c;->targetTypeCase_:I

    sget-object v0, Lma/h;->b:Lma/h$h;

    iput-object v0, p0, Ll9/c;->resumeToken_:Lma/h;

    return-void
.end method

.method public static synthetic F()Ll9/c;
    .locals 1

    sget-object v0, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    return-object v0
.end method

.method public static G(Ll9/c;Lka/a0$c;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/c;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, p0, Ll9/c;->targetTypeCase_:I

    return-void
.end method

.method public static H(Ll9/c;Lka/a0$b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/c;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Ll9/c;->targetTypeCase_:I

    return-void
.end method

.method public static I(Ll9/c;Lma/n1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/c;->lastLimboFreeSnapshotVersion_:Lma/n1;

    iget p1, p0, Ll9/c;->bitField0_:I

    or-int/lit8 p1, p1, 0x2

    iput p1, p0, Ll9/c;->bitField0_:I

    return-void
.end method

.method public static J(Ll9/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ll9/c;->lastLimboFreeSnapshotVersion_:Lma/n1;

    .line 3
    .line 4
    iget v0, p0, Ll9/c;->bitField0_:I

    .line 5
    .line 6
    and-int/lit8 v0, v0, -0x3

    .line 7
    .line 8
    iput v0, p0, Ll9/c;->bitField0_:I

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
.end method

.method public static K(Ll9/c;I)V
    .locals 0

    iput p1, p0, Ll9/c;->targetId_:I

    return-void
.end method

.method public static L(Ll9/c;Lma/n1;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/c;->snapshotVersion_:Lma/n1;

    iget p1, p0, Ll9/c;->bitField0_:I

    or-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll9/c;->bitField0_:I

    return-void
.end method

.method public static M(Ll9/c;Lma/h;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ll9/c;->resumeToken_:Lma/h;

    return-void
.end method

.method public static N(Ll9/c;J)V
    .locals 0

    iput-wide p1, p0, Ll9/c;->lastListenSequenceNumber_:J

    return-void
.end method

.method public static W()Ll9/c$a;
    .locals 1

    sget-object v0, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    invoke-virtual {v0}, Lma/w;->s()Lma/w$a;

    move-result-object v0

    check-cast v0, Ll9/c$a;

    return-object v0
.end method

.method public static X([B)Ll9/c;
    .locals 1

    sget-object v0, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    invoke-static {v0, p0}, Lma/w;->B(Lma/w;[B)Lma/w;

    move-result-object p0

    check-cast p0, Ll9/c;

    return-object p0
.end method


# virtual methods
.method public final O()Lka/a0$b;
    .locals 2

    iget v0, p0, Ll9/c;->targetTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll9/c;->targetType_:Ljava/lang/Object;

    check-cast v0, Lka/a0$b;

    return-object v0

    :cond_0
    invoke-static {}, Lka/a0$b;->H()Lka/a0$b;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lma/n1;
    .locals 1

    iget-object v0, p0, Ll9/c;->lastLimboFreeSnapshotVersion_:Lma/n1;

    if-nez v0, :cond_0

    invoke-static {}, Lma/n1;->I()Lma/n1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final Q()J
    .locals 2

    iget-wide v0, p0, Ll9/c;->lastListenSequenceNumber_:J

    return-wide v0
.end method

.method public final R()Lka/a0$c;
    .locals 2

    iget v0, p0, Ll9/c;->targetTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll9/c;->targetType_:Ljava/lang/Object;

    check-cast v0, Lka/a0$c;

    return-object v0

    :cond_0
    invoke-static {}, Lka/a0$c;->I()Lka/a0$c;

    move-result-object v0

    return-object v0
.end method

.method public final S()Lma/h;
    .locals 1

    iget-object v0, p0, Ll9/c;->resumeToken_:Lma/h;

    return-object v0
.end method

.method public final T()Lma/n1;
    .locals 1

    iget-object v0, p0, Ll9/c;->snapshotVersion_:Lma/n1;

    if-nez v0, :cond_0

    invoke-static {}, Lma/n1;->I()Lma/n1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final U()I
    .locals 1

    iget v0, p0, Ll9/c;->targetId_:I

    return v0
.end method

.method public final V()Ll9/c$b;
    .locals 2

    iget v0, p0, Ll9/c;->targetTypeCase_:I

    if-eqz v0, :cond_2

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Ll9/c$b;->b:Ll9/c$b;

    goto :goto_0

    :cond_1
    sget-object v0, Ll9/c$b;->a:Ll9/c$b;

    goto :goto_0

    :cond_2
    sget-object v0, Ll9/c$b;->c:Ll9/c$b;

    :goto_0
    return-object v0
.end method

.method public final t(Lma/w$f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 12
    .line 13
    .line 14
    throw p1

    .line 15
    :pswitch_0
    sget-object p1, Ll9/c;->PARSER:Lma/b1;

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    const-class v0, Ll9/c;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    sget-object p1, Ll9/c;->PARSER:Lma/b1;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    new-instance p1, Lma/w$b;

    .line 27
    .line 28
    sget-object v1, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    .line 29
    .line 30
    invoke-direct {p1, v1}, Lma/w$b;-><init>(Lma/w;)V

    .line 31
    .line 32
    .line 33
    sput-object p1, Ll9/c;->PARSER:Lma/b1;

    .line 34
    .line 35
    :cond_0
    monitor-exit v0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw p1

    .line 40
    :cond_1
    :goto_0
    return-object p1

    .line 41
    :pswitch_1
    sget-object p1, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    .line 42
    .line 43
    return-object p1

    .line 44
    :pswitch_2
    new-instance p1, Ll9/c$a;

    .line 45
    .line 46
    invoke-direct {p1}, Ll9/c$a;-><init>()V

    .line 47
    .line 48
    .line 49
    return-object p1

    .line 50
    :pswitch_3
    new-instance p1, Ll9/c;

    .line 51
    .line 52
    invoke-direct {p1}, Ll9/c;-><init>()V

    .line 53
    .line 54
    .line 55
    return-object p1

    .line 56
    :pswitch_4
    const/16 p1, 0xa

    .line 57
    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    const/4 v1, 0x0

    .line 61
    const-string v2, "targetType_"

    .line 62
    .line 63
    aput-object v2, p1, v1

    .line 64
    .line 65
    const-string v1, "targetTypeCase_"

    .line 66
    .line 67
    aput-object v1, p1, v0

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    const-string v1, "bitField0_"

    .line 71
    .line 72
    aput-object v1, p1, v0

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    const-string v1, "targetId_"

    .line 76
    .line 77
    aput-object v1, p1, v0

    .line 78
    .line 79
    const/4 v0, 0x4

    .line 80
    const-string v1, "snapshotVersion_"

    .line 81
    .line 82
    aput-object v1, p1, v0

    .line 83
    .line 84
    const/4 v0, 0x5

    .line 85
    const-string v1, "resumeToken_"

    .line 86
    .line 87
    aput-object v1, p1, v0

    .line 88
    .line 89
    const/4 v0, 0x6

    .line 90
    const-string v1, "lastListenSequenceNumber_"

    .line 91
    .line 92
    aput-object v1, p1, v0

    .line 93
    .line 94
    const/4 v0, 0x7

    .line 95
    const-class v1, Lka/a0$c;

    .line 96
    .line 97
    aput-object v1, p1, v0

    .line 98
    .line 99
    const/16 v0, 0x8

    .line 100
    .line 101
    const-class v1, Lka/a0$b;

    .line 102
    .line 103
    aput-object v1, p1, v0

    .line 104
    .line 105
    const/16 v0, 0x9

    .line 106
    .line 107
    const-string v1, "lastLimboFreeSnapshotVersion_"

    .line 108
    .line 109
    aput-object v1, p1, v0

    .line 110
    .line 111
    const-string v0, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u1009\u0000\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\u1009\u0001"

    .line 112
    .line 113
    sget-object v1, Ll9/c;->DEFAULT_INSTANCE:Ll9/c;

    .line 114
    .line 115
    new-instance v2, Lma/f1;

    .line 116
    .line 117
    invoke-direct {v2, v1, v0, p1}, Lma/f1;-><init>(Lma/w;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :pswitch_5
    const/4 p1, 0x0

    .line 122
    return-object p1

    .line 123
    :pswitch_6
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    return-object p1

    .line 128
    nop

    .line 129
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
