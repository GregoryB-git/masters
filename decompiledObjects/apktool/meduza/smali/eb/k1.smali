.class public final enum Leb/k1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb/k1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Leb/k1;

.field public static final enum b:Leb/k1;

.field public static final synthetic c:[Leb/k1;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Leb/k1;

    const-string v1, "FAKE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/k1;-><init>(Ljava/lang/String;I)V

    new-instance v1, Leb/k1;

    const-string v3, "MTLS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Leb/k1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Leb/k1;->a:Leb/k1;

    new-instance v3, Leb/k1;

    const-string v5, "CUSTOM_MANAGERS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Leb/k1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Leb/k1;->b:Leb/k1;

    const/4 v5, 0x3

    new-array v5, v5, [Leb/k1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Leb/k1;->c:[Leb/k1;

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

.method public static valueOf(Ljava/lang/String;)Leb/k1;
    .locals 1

    const-class v0, Leb/k1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb/k1;

    return-object p0
.end method

.method public static values()[Leb/k1;
    .locals 1

    sget-object v0, Leb/k1;->c:[Leb/k1;

    invoke-virtual {v0}, [Leb/k1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/k1;

    return-object v0
.end method
