.class public final enum Lt8/h$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt8/h$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lt8/h$a;

.field public static final enum b:Lt8/h$a;

.field public static final synthetic c:[Lt8/h$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lt8/h$a;

    const-string v1, "RED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt8/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lt8/h$a;->a:Lt8/h$a;

    new-instance v1, Lt8/h$a;

    const-string v3, "BLACK"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lt8/h$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lt8/h$a;->b:Lt8/h$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lt8/h$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lt8/h$a;->c:[Lt8/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt8/h$a;
    .locals 1

    const-class v0, Lt8/h$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt8/h$a;

    return-object p0
.end method

.method public static values()[Lt8/h$a;
    .locals 1

    sget-object v0, Lt8/h$a;->c:[Lt8/h$a;

    invoke-virtual {v0}, [Lt8/h$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt8/h$a;

    return-object v0
.end method
