.class public final enum Lio/flutter/embedding/android/TransparencyMode;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/embedding/android/TransparencyMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/embedding/android/TransparencyMode;

.field public static final enum opaque:Lio/flutter/embedding/android/TransparencyMode;

.field public static final enum transparent:Lio/flutter/embedding/android/TransparencyMode;


# direct methods
.method private static synthetic $values()[Lio/flutter/embedding/android/TransparencyMode;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lio/flutter/embedding/android/TransparencyMode;

    sget-object v1, Lio/flutter/embedding/android/TransparencyMode;->opaque:Lio/flutter/embedding/android/TransparencyMode;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/embedding/android/TransparencyMode;->transparent:Lio/flutter/embedding/android/TransparencyMode;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/embedding/android/TransparencyMode;

    const-string v1, "opaque"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/android/TransparencyMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/TransparencyMode;->opaque:Lio/flutter/embedding/android/TransparencyMode;

    new-instance v0, Lio/flutter/embedding/android/TransparencyMode;

    const-string v1, "transparent"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/embedding/android/TransparencyMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/embedding/android/TransparencyMode;->transparent:Lio/flutter/embedding/android/TransparencyMode;

    invoke-static {}, Lio/flutter/embedding/android/TransparencyMode;->$values()[Lio/flutter/embedding/android/TransparencyMode;

    move-result-object v0

    sput-object v0, Lio/flutter/embedding/android/TransparencyMode;->$VALUES:[Lio/flutter/embedding/android/TransparencyMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/embedding/android/TransparencyMode;
    .locals 1

    const-class v0, Lio/flutter/embedding/android/TransparencyMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/embedding/android/TransparencyMode;

    return-object p0
.end method

.method public static values()[Lio/flutter/embedding/android/TransparencyMode;
    .locals 1

    sget-object v0, Lio/flutter/embedding/android/TransparencyMode;->$VALUES:[Lio/flutter/embedding/android/TransparencyMode;

    invoke-virtual {v0}, [Lio/flutter/embedding/android/TransparencyMode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/embedding/android/TransparencyMode;

    return-object v0
.end method
