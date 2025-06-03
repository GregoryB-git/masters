.class public final enum Lb7/p;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb7/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/p;",
        ">;",
        "Lb7/a;"
    }
.end annotation


# static fields
.field public static final synthetic b:[Lb7/p;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lb7/p;

    const-string v1, "ED256"

    const/4 v2, 0x0

    const/16 v3, -0x104

    invoke-direct {v0, v1, v2, v3}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lb7/p;

    const-string v3, "ED512"

    const/4 v4, 0x1

    const/16 v5, -0x105

    invoke-direct {v1, v3, v4, v5}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lb7/p;

    const-string v5, "ED25519"

    const/4 v6, 0x2

    const/4 v7, -0x8

    invoke-direct {v3, v5, v6, v7}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lb7/p;

    const-string v7, "ES256"

    const/4 v8, 0x3

    const/4 v9, -0x7

    invoke-direct {v5, v7, v8, v9}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lb7/p;

    const-string v9, "ECDH_HKDF_256"

    const/4 v10, 0x4

    const/16 v11, -0x19

    invoke-direct {v7, v9, v10, v11}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lb7/p;

    const-string v11, "ES384"

    const/4 v12, 0x5

    const/16 v13, -0x23

    invoke-direct {v9, v11, v12, v13}, Lb7/p;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lb7/p;

    const-string v13, "ES512"

    const/4 v14, 0x6

    const/16 v15, -0x24

    invoke-direct {v11, v13, v14, v15}, Lb7/p;-><init>(Ljava/lang/String;II)V

    const/4 v13, 0x7

    new-array v13, v13, [Lb7/p;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lb7/p;->b:[Lb7/p;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb7/p;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/p;
    .locals 1

    const-class v0, Lb7/p;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/p;

    return-object p0
.end method

.method public static values()[Lb7/p;
    .locals 1

    sget-object v0, Lb7/p;->b:[Lb7/p;

    invoke-virtual {v0}, [Lb7/p;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/p;

    return-object v0
.end method


# virtual methods
.method public final f()I
    .locals 1

    iget v0, p0, Lb7/p;->a:I

    return v0
.end method
