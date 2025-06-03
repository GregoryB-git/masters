.class public final enum Lgb/t$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgb/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lgb/t$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lgb/t$a;

.field public static final enum b:Lgb/t$a;

.field public static final enum c:Lgb/t$a;

.field public static final enum d:Lgb/t$a;

.field public static final synthetic e:[Lgb/t$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lgb/t$a;

    const-string v1, "PROCESSED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lgb/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lgb/t$a;->a:Lgb/t$a;

    new-instance v1, Lgb/t$a;

    const-string v3, "REFUSED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lgb/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lgb/t$a;->b:Lgb/t$a;

    new-instance v3, Lgb/t$a;

    const-string v5, "DROPPED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lgb/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lgb/t$a;->c:Lgb/t$a;

    new-instance v5, Lgb/t$a;

    const-string v7, "MISCARRIED"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lgb/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lgb/t$a;->d:Lgb/t$a;

    const/4 v7, 0x4

    new-array v7, v7, [Lgb/t$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lgb/t$a;->e:[Lgb/t$a;

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

.method public static valueOf(Ljava/lang/String;)Lgb/t$a;
    .locals 1

    const-class v0, Lgb/t$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lgb/t$a;

    return-object p0
.end method

.method public static values()[Lgb/t$a;
    .locals 1

    sget-object v0, Lgb/t$a;->e:[Lgb/t$a;

    invoke-virtual {v0}, [Lgb/t$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lgb/t$a;

    return-object v0
.end method
