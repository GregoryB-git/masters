.class public final enum Ll9/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ll9/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ll9/c$b;

.field public static final enum b:Ll9/c$b;

.field public static final enum c:Ll9/c$b;

.field public static final synthetic d:[Ll9/c$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Ll9/c$b;

    const-string v1, "QUERY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll9/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ll9/c$b;->a:Ll9/c$b;

    new-instance v1, Ll9/c$b;

    const-string v3, "DOCUMENTS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ll9/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ll9/c$b;->b:Ll9/c$b;

    new-instance v3, Ll9/c$b;

    const-string v5, "TARGETTYPE_NOT_SET"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll9/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ll9/c$b;->c:Ll9/c$b;

    const/4 v5, 0x3

    new-array v5, v5, [Ll9/c$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ll9/c$b;->d:[Ll9/c$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll9/c$b;
    .locals 1

    const-class v0, Ll9/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ll9/c$b;

    return-object p0
.end method

.method public static values()[Ll9/c$b;
    .locals 1

    sget-object v0, Ll9/c$b;->d:[Ll9/c$b;

    invoke-virtual {v0}, [Ll9/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll9/c$b;

    return-object v0
.end method
