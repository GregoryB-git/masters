.class public final enum Lg9/z$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg9/z$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lg9/z$a;

.field public static final enum b:Lg9/z$a;

.field public static final synthetic c:[Lg9/z$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lg9/z$a;

    const-string v1, "ADDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lg9/z$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg9/z$a;->a:Lg9/z$a;

    new-instance v1, Lg9/z$a;

    const-string v3, "REMOVED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lg9/z$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg9/z$a;->b:Lg9/z$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lg9/z$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lg9/z$a;->c:[Lg9/z$a;

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

.method public static valueOf(Ljava/lang/String;)Lg9/z$a;
    .locals 1

    const-class v0, Lg9/z$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lg9/z$a;

    return-object p0
.end method

.method public static values()[Lg9/z$a;
    .locals 1

    sget-object v0, Lg9/z$a;->c:[Lg9/z$a;

    invoke-virtual {v0}, [Lg9/z$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg9/z$a;

    return-object v0
.end method
