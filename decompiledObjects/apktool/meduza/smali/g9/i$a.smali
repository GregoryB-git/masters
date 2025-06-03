.class public final enum Lg9/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg9/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg9/i$a;

.field public static final enum b:Lg9/i$a;

.field public static final enum c:Lg9/i$a;

.field public static final enum d:Lg9/i$a;

.field public static final synthetic e:[Lg9/i$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lg9/i$a;

    const-string v1, "REMOVED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg9/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg9/i$a;->a:Lg9/i$a;

    new-instance v1, Lg9/i$a;

    const-string v3, "ADDED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg9/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg9/i$a;->b:Lg9/i$a;

    new-instance v3, Lg9/i$a;

    const-string v5, "MODIFIED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lg9/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg9/i$a;->c:Lg9/i$a;

    new-instance v5, Lg9/i$a;

    const-string v7, "METADATA"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lg9/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lg9/i$a;->d:Lg9/i$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lg9/i$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lg9/i$a;->e:[Lg9/i$a;

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

.method public static valueOf(Ljava/lang/String;)Lg9/i$a;
    .locals 1

    const-class v0, Lg9/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg9/i$a;

    return-object p0
.end method

.method public static values()[Lg9/i$a;
    .locals 1

    sget-object v0, Lg9/i$a;->e:[Lg9/i$a;

    invoke-virtual {v0}, [Lg9/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg9/i$a;

    return-object v0
.end method
