.class public final Lka/p$b;
.super Lma/w;
.source "SourceFile"

# interfaces
.implements Lma/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lka/p$b$b;,
        Lka/p$b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lma/w<",
        "Lka/p$b;",
        "Lka/p$b$a;",
        ">;",
        "Lma/t0;"
    }
.end annotation


# static fields
.field public static final APPEND_MISSING_ELEMENTS_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Lka/p$b;

.field public static final FIELD_PATH_FIELD_NUMBER:I = 0x1

.field public static final INCREMENT_FIELD_NUMBER:I = 0x3

.field public static final MAXIMUM_FIELD_NUMBER:I = 0x4

.field public static final MINIMUM_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lma/b1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lma/b1<",
            "Lka/p$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER:I = 0x7

.field public static final SET_TO_SERVER_VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private fieldPath_:Ljava/lang/String;

.field private transformTypeCase_:I

.field private transformType_:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lka/p$b;

    invoke-direct {v0}, Lka/p$b;-><init>()V

    sput-object v0, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    const-class v1, Lka/p$b;

    invoke-static {v1, v0}, Lma/w;->D(Ljava/lang/Class;Lma/w;)V

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lma/w;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lka/p$b;->transformTypeCase_:I

    const-string v0, ""

    iput-object v0, p0, Lka/p$b;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method public static synthetic F()Lka/p$b;
    .locals 1

    sget-object v0, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    return-object v0
.end method

.method public static G(Lka/p$b;Lka/b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lka/p$b;->transformTypeCase_:I

    return-void
.end method

.method public static H(Lka/p$b;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/p$b;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method public static I(Lka/p$b;Lka/b;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lka/p$b;->transformTypeCase_:I

    return-void
.end method

.method public static J(Lka/p$b;)V
    .locals 1

    .line 1
    sget-object v0, Lka/p$b$b;->c:Lka/p$b$b;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lka/p$b$b;->a()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 v0, 0x2

    .line 17
    iput v0, p0, Lka/p$b;->transformTypeCase_:I

    .line 18
    .line 19
    return-void
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

.method public static K(Lka/p$b;Lka/d0;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lka/p$b;->transformTypeCase_:I

    return-void
.end method

.method public static R()Lka/p$b$a;
    .locals 1

    sget-object v0, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    invoke-virtual {v0}, Lma/w;->s()Lma/w$a;

    move-result-object v0

    check-cast v0, Lka/p$b$a;

    return-object v0
.end method


# virtual methods
.method public final L()Lka/b;
    .locals 2

    iget v0, p0, Lka/p$b;->transformTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    check-cast v0, Lka/b;

    return-object v0

    :cond_0
    invoke-static {}, Lka/b;->J()Lka/b;

    move-result-object v0

    return-object v0
.end method

.method public final M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lka/p$b;->fieldPath_:Ljava/lang/String;

    return-object v0
.end method

.method public final N()Lka/d0;
    .locals 2

    iget v0, p0, Lka/p$b;->transformTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    check-cast v0, Lka/d0;

    return-object v0

    :cond_0
    invoke-static {}, Lka/d0;->U()Lka/d0;

    move-result-object v0

    return-object v0
.end method

.method public final O()Lka/b;
    .locals 2

    iget v0, p0, Lka/p$b;->transformTypeCase_:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    check-cast v0, Lka/b;

    return-object v0

    :cond_0
    invoke-static {}, Lka/b;->J()Lka/b;

    move-result-object v0

    return-object v0
.end method

.method public final P()Lka/p$b$b;
    .locals 3

    .line 1
    sget-object v0, Lka/p$b$b;->b:Lka/p$b$b;

    .line 2
    .line 3
    iget v1, p0, Lka/p$b;->transformTypeCase_:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    if-ne v1, v2, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Lka/p$b;->transformType_:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eq v1, v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, Lka/p$b$b;->c:Lka/p$b$b;

    .line 24
    .line 25
    :cond_1
    :goto_0
    if-nez v0, :cond_2

    .line 26
    .line 27
    sget-object v0, Lka/p$b$b;->d:Lka/p$b$b;

    .line 28
    .line 29
    :cond_2
    return-object v0
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

.method public final Q()I
    .locals 1

    iget v0, p0, Lka/p$b;->transformTypeCase_:I

    if-eqz v0, :cond_0

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    :pswitch_0
    const/4 v0, 0x6

    goto :goto_0

    :pswitch_1
    const/4 v0, 0x5

    goto :goto_0

    :pswitch_2
    const/4 v0, 0x4

    goto :goto_0

    :pswitch_3
    const/4 v0, 0x3

    goto :goto_0

    :pswitch_4
    const/4 v0, 0x2

    goto :goto_0

    :pswitch_5
    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(Lma/w$f;)Ljava/lang/Object;
    .locals 5

    .line 1
    const-class v0, Lka/b;

    .line 2
    .line 3
    const-class v1, Lka/d0;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v2, 0x1

    .line 10
    packed-switch p1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 14
    .line 15
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 16
    .line 17
    .line 18
    throw p1

    .line 19
    :pswitch_0
    sget-object p1, Lka/p$b;->PARSER:Lma/b1;

    .line 20
    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    const-class v0, Lka/p$b;

    .line 24
    .line 25
    monitor-enter v0

    .line 26
    :try_start_0
    sget-object p1, Lka/p$b;->PARSER:Lma/b1;

    .line 27
    .line 28
    if-nez p1, :cond_0

    .line 29
    .line 30
    new-instance p1, Lma/w$b;

    .line 31
    .line 32
    sget-object v1, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    .line 33
    .line 34
    invoke-direct {p1, v1}, Lma/w$b;-><init>(Lma/w;)V

    .line 35
    .line 36
    .line 37
    sput-object p1, Lka/p$b;->PARSER:Lma/b1;

    .line 38
    .line 39
    :cond_0
    monitor-exit v0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    throw p1

    .line 44
    :cond_1
    :goto_0
    return-object p1

    .line 45
    :pswitch_1
    sget-object p1, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_2
    new-instance p1, Lka/p$b$a;

    .line 49
    .line 50
    invoke-direct {p1}, Lka/p$b$a;-><init>()V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_3
    new-instance p1, Lka/p$b;

    .line 55
    .line 56
    invoke-direct {p1}, Lka/p$b;-><init>()V

    .line 57
    .line 58
    .line 59
    return-object p1

    .line 60
    :pswitch_4
    const/16 p1, 0x8

    .line 61
    .line 62
    new-array p1, p1, [Ljava/lang/Object;

    .line 63
    .line 64
    const/4 v3, 0x0

    .line 65
    const-string v4, "transformType_"

    .line 66
    .line 67
    aput-object v4, p1, v3

    .line 68
    .line 69
    const-string v3, "transformTypeCase_"

    .line 70
    .line 71
    aput-object v3, p1, v2

    .line 72
    .line 73
    const/4 v2, 0x2

    .line 74
    const-string v3, "fieldPath_"

    .line 75
    .line 76
    aput-object v3, p1, v2

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    aput-object v1, p1, v2

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    aput-object v1, p1, v2

    .line 83
    .line 84
    const/4 v2, 0x5

    .line 85
    aput-object v1, p1, v2

    .line 86
    .line 87
    const/4 v1, 0x6

    .line 88
    aput-object v0, p1, v1

    .line 89
    .line 90
    const/4 v1, 0x7

    .line 91
    aput-object v0, p1, v1

    .line 92
    .line 93
    const-string v0, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000"

    .line 94
    .line 95
    sget-object v1, Lka/p$b;->DEFAULT_INSTANCE:Lka/p$b;

    .line 96
    .line 97
    new-instance v2, Lma/f1;

    .line 98
    .line 99
    invoke-direct {v2, v1, v0, p1}, Lma/f1;-><init>(Lma/w;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-object v2

    .line 103
    :pswitch_5
    const/4 p1, 0x0

    .line 104
    return-object p1

    .line 105
    :pswitch_6
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    return-object p1

    .line 110
    nop

    .line 111
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
