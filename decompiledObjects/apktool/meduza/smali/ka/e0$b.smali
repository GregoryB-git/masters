.class public final enum Lka/e0$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lka/e0$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lka/e0$b;

.field public static final enum b:Lka/e0$b;

.field public static final enum c:Lka/e0$b;

.field public static final enum d:Lka/e0$b;

.field public static final enum e:Lka/e0$b;

.field public static final synthetic f:[Lka/e0$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lka/e0$b;

    const-string v1, "UPDATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lka/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lka/e0$b;->a:Lka/e0$b;

    new-instance v1, Lka/e0$b;

    const-string v3, "DELETE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lka/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lka/e0$b;->b:Lka/e0$b;

    new-instance v3, Lka/e0$b;

    const-string v5, "VERIFY"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lka/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lka/e0$b;->c:Lka/e0$b;

    new-instance v5, Lka/e0$b;

    const-string v7, "TRANSFORM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lka/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lka/e0$b;->d:Lka/e0$b;

    new-instance v7, Lka/e0$b;

    const-string v9, "OPERATION_NOT_SET"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lka/e0$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lka/e0$b;->e:Lka/e0$b;

    const/4 v9, 0x5

    new-array v9, v9, [Lka/e0$b;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lka/e0$b;->f:[Lka/e0$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lka/e0$b;
    .locals 1

    const-class v0, Lka/e0$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lka/e0$b;

    return-object p0
.end method

.method public static values()[Lka/e0$b;
    .locals 1

    sget-object v0, Lka/e0$b;->f:[Lka/e0$b;

    invoke-virtual {v0}, [Lka/e0$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lka/e0$b;

    return-object v0
.end method
