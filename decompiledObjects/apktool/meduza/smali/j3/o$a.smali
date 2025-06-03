.class public final enum Lj3/o$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj3/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj3/o$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj3/o$a;

.field public static final synthetic b:[Lj3/o$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj3/o$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj3/o$a;-><init>(Ljava/lang/String;I)V

    new-instance v1, Lj3/o$a;

    const-string v3, "ANDROID_FIREBASE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lj3/o$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj3/o$a;->a:Lj3/o$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lj3/o$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lj3/o$a;->b:[Lj3/o$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lj3/o$a;
    .locals 1

    const-class v0, Lj3/o$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj3/o$a;

    return-object p0
.end method

.method public static values()[Lj3/o$a;
    .locals 1

    sget-object v0, Lj3/o$a;->b:[Lj3/o$a;

    invoke-virtual {v0}, [Lj3/o$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj3/o$a;

    return-object v0
.end method
