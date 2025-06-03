.class public final enum Leb/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb/n;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Leb/n;

.field public static final enum b:Leb/n;

.field public static final enum c:Leb/n;

.field public static final enum d:Leb/n;

.field public static final enum e:Leb/n;

.field public static final synthetic f:[Leb/n;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    new-instance v0, Leb/n;

    const-string v1, "CONNECTING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/n;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/n;->a:Leb/n;

    new-instance v1, Leb/n;

    const-string v3, "READY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Leb/n;-><init>(Ljava/lang/String;I)V

    sput-object v1, Leb/n;->b:Leb/n;

    new-instance v3, Leb/n;

    const-string v5, "TRANSIENT_FAILURE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Leb/n;-><init>(Ljava/lang/String;I)V

    sput-object v3, Leb/n;->c:Leb/n;

    new-instance v5, Leb/n;

    const-string v7, "IDLE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Leb/n;-><init>(Ljava/lang/String;I)V

    sput-object v5, Leb/n;->d:Leb/n;

    new-instance v7, Leb/n;

    const-string v9, "SHUTDOWN"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Leb/n;-><init>(Ljava/lang/String;I)V

    sput-object v7, Leb/n;->e:Leb/n;

    const/4 v9, 0x5

    new-array v9, v9, [Leb/n;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Leb/n;->f:[Leb/n;

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

.method public static valueOf(Ljava/lang/String;)Leb/n;
    .locals 1

    const-class v0, Leb/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb/n;

    return-object p0
.end method

.method public static values()[Leb/n;
    .locals 1

    sget-object v0, Leb/n;->f:[Leb/n;

    invoke-virtual {v0}, [Leb/n;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/n;

    return-object v0
.end method
