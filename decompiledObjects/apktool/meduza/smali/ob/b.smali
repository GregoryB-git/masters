.class public final enum Lob/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lob/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lob/b;

.field public static final enum b:Lob/b;

.field public static final synthetic c:[Lob/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lob/b;

    const-string v1, "OUTLINE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lob/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lob/b;->a:Lob/b;

    new-instance v1, Lob/b;

    const-string v3, "SMART"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lob/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lob/b;->b:Lob/b;

    const/4 v3, 0x2

    new-array v3, v3, [Lob/b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lob/b;->c:[Lob/b;

    invoke-static {v3}, Lp2/m0;->D([Ljava/lang/Enum;)Lxb/b;

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

.method public static valueOf(Ljava/lang/String;)Lob/b;
    .locals 1

    const-class v0, Lob/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lob/b;

    return-object p0
.end method

.method public static values()[Lob/b;
    .locals 1

    sget-object v0, Lob/b;->c:[Lob/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lob/b;

    return-object v0
.end method
