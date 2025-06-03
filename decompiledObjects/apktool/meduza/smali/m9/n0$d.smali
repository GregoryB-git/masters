.class public final enum Lm9/n0$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm9/n0$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lm9/n0$d;

.field public static final enum b:Lm9/n0$d;

.field public static final enum c:Lm9/n0$d;

.field public static final enum d:Lm9/n0$d;

.field public static final enum e:Lm9/n0$d;

.field public static final synthetic f:[Lm9/n0$d;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Lm9/n0$d;

    const-string v1, "NoChange"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm9/n0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm9/n0$d;->a:Lm9/n0$d;

    new-instance v1, Lm9/n0$d;

    const-string v3, "Added"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lm9/n0$d;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lm9/n0$d;->b:Lm9/n0$d;

    new-instance v3, Lm9/n0$d;

    const-string v5, "Removed"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lm9/n0$d;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lm9/n0$d;->c:Lm9/n0$d;

    new-instance v5, Lm9/n0$d;

    const-string v7, "Current"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lm9/n0$d;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lm9/n0$d;->d:Lm9/n0$d;

    new-instance v7, Lm9/n0$d;

    const-string v9, "Reset"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lm9/n0$d;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lm9/n0$d;->e:Lm9/n0$d;

    const/4 v9, 0x5

    new-array v9, v9, [Lm9/n0$d;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lm9/n0$d;->f:[Lm9/n0$d;

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

.method public static valueOf(Ljava/lang/String;)Lm9/n0$d;
    .locals 1

    const-class v0, Lm9/n0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm9/n0$d;

    return-object p0
.end method

.method public static values()[Lm9/n0$d;
    .locals 1

    sget-object v0, Lm9/n0$d;->f:[Lm9/n0$d;

    invoke-virtual {v0}, [Lm9/n0$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm9/n0$d;

    return-object v0
.end method
