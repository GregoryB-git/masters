.class final enum Lio/flutter/view/AccessibilityBridge$TextDirection;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/view/AccessibilityBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TextDirection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/view/AccessibilityBridge$TextDirection;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/flutter/view/AccessibilityBridge$TextDirection;

.field public static final enum LTR:Lio/flutter/view/AccessibilityBridge$TextDirection;

.field public static final enum RTL:Lio/flutter/view/AccessibilityBridge$TextDirection;

.field public static final enum UNKNOWN:Lio/flutter/view/AccessibilityBridge$TextDirection;


# direct methods
.method private static synthetic $values()[Lio/flutter/view/AccessibilityBridge$TextDirection;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lio/flutter/view/AccessibilityBridge$TextDirection;

    sget-object v1, Lio/flutter/view/AccessibilityBridge$TextDirection;->UNKNOWN:Lio/flutter/view/AccessibilityBridge$TextDirection;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/AccessibilityBridge$TextDirection;->LTR:Lio/flutter/view/AccessibilityBridge$TextDirection;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lio/flutter/view/AccessibilityBridge$TextDirection;->RTL:Lio/flutter/view/AccessibilityBridge$TextDirection;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/flutter/view/AccessibilityBridge$TextDirection;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/flutter/view/AccessibilityBridge$TextDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/AccessibilityBridge$TextDirection;->UNKNOWN:Lio/flutter/view/AccessibilityBridge$TextDirection;

    new-instance v0, Lio/flutter/view/AccessibilityBridge$TextDirection;

    const-string v1, "LTR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/flutter/view/AccessibilityBridge$TextDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/AccessibilityBridge$TextDirection;->LTR:Lio/flutter/view/AccessibilityBridge$TextDirection;

    new-instance v0, Lio/flutter/view/AccessibilityBridge$TextDirection;

    const-string v1, "RTL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/flutter/view/AccessibilityBridge$TextDirection;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/flutter/view/AccessibilityBridge$TextDirection;->RTL:Lio/flutter/view/AccessibilityBridge$TextDirection;

    invoke-static {}, Lio/flutter/view/AccessibilityBridge$TextDirection;->$values()[Lio/flutter/view/AccessibilityBridge$TextDirection;

    move-result-object v0

    sput-object v0, Lio/flutter/view/AccessibilityBridge$TextDirection;->$VALUES:[Lio/flutter/view/AccessibilityBridge$TextDirection;

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

.method public static fromInt(I)Lio/flutter/view/AccessibilityBridge$TextDirection;
    .locals 1

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    sget-object p0, Lio/flutter/view/AccessibilityBridge$TextDirection;->UNKNOWN:Lio/flutter/view/AccessibilityBridge$TextDirection;

    return-object p0

    :cond_0
    sget-object p0, Lio/flutter/view/AccessibilityBridge$TextDirection;->LTR:Lio/flutter/view/AccessibilityBridge$TextDirection;

    return-object p0

    :cond_1
    sget-object p0, Lio/flutter/view/AccessibilityBridge$TextDirection;->RTL:Lio/flutter/view/AccessibilityBridge$TextDirection;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/view/AccessibilityBridge$TextDirection;
    .locals 1

    const-class v0, Lio/flutter/view/AccessibilityBridge$TextDirection;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/view/AccessibilityBridge$TextDirection;

    return-object p0
.end method

.method public static values()[Lio/flutter/view/AccessibilityBridge$TextDirection;
    .locals 1

    sget-object v0, Lio/flutter/view/AccessibilityBridge$TextDirection;->$VALUES:[Lio/flutter/view/AccessibilityBridge$TextDirection;

    invoke-virtual {v0}, [Lio/flutter/view/AccessibilityBridge$TextDirection;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/view/AccessibilityBridge$TextDirection;

    return-object v0
.end method
