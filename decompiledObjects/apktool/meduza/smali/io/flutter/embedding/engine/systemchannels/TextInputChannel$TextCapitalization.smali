.class public final enum Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/embedding/engine/systemchannels/TextInputChannel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TextCapitalization"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

.field public static final enum CHARACTERS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

.field public static final enum NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

.field public static final enum SENTENCES:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

.field public static final enum WORDS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;


# instance fields
.field private final encodedName:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    sget-object v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->CHARACTERS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->WORDS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->SENTENCES:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const-string v1, "CHARACTERS"

    const/4 v2, 0x0

    const-string v3, "TextCapitalization.characters"

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->CHARACTERS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const-string v1, "WORDS"

    const/4 v2, 0x1

    const-string v3, "TextCapitalization.words"

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->WORDS:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const-string v1, "SENTENCES"

    const/4 v2, 0x2

    const-string v3, "TextCapitalization.sentences"

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->SENTENCES:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    new-instance v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    const-string v1, "NONE"

    const/4 v2, 0x3

    const-string v3, "TextCapitalization.none"

    invoke-direct {v0, v1, v2, v3}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->NONE:Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    invoke-static {}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->$values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->encodedName:Ljava/lang/String;

    return-void
.end method

.method public static fromValue(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;
    .locals 5

    .line 1
    invoke-static {}, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    iget-object v4, v3, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->encodedName:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    return-object v3

    .line 20
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/NoSuchFieldException;

    .line 24
    .line 25
    const-string v1, "No such TextCapitalization: "

    .line 26
    .line 27
    invoke-static {v1, p0}, Lg;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
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

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;
    .locals 1

    const-class v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;
    .locals 1

    sget-object v0, Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->$VALUES:[Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    invoke-virtual {v0}, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/engine/systemchannels/TextInputChannel$TextCapitalization;

    return-object v0
.end method
