.class public final enum Lea/m;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La9/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lea/m;",
        ">;",
        "La9/g;"
    }
.end annotation


# static fields
.field public static final enum b:Lea/m;

.field public static final synthetic c:[Lea/m;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lea/m;

    const-string v1, "EVENT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lea/m;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lea/m;

    const-string v3, "SESSION_START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lea/m;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lea/m;->b:Lea/m;

    const/4 v3, 0x2

    new-array v3, v3, [Lea/m;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lea/m;->c:[Lea/m;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lea/m;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lea/m;
    .locals 1

    const-class v0, Lea/m;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lea/m;

    return-object p0
.end method

.method public static values()[Lea/m;
    .locals 1

    sget-object v0, Lea/m;->c:[Lea/m;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lea/m;

    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lea/m;->a:I

    return v0
.end method
