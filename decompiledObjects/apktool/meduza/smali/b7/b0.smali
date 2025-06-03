.class public final enum Lb7/b0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb7/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb7/b0;",
        ">;",
        "Lb7/a;"
    }
.end annotation


# static fields
.field public static final enum b:Lb7/b0;

.field public static final synthetic c:[Lb7/b0;


# instance fields
.field public final a:I


# direct methods
.method public static constructor <clinit>()V
    .locals 16

    new-instance v0, Lb7/b0;

    const-string v1, "RS256"

    const/4 v2, 0x0

    const/16 v3, -0x101

    invoke-direct {v0, v1, v2, v3}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v1, Lb7/b0;

    const-string v3, "RS384"

    const/4 v4, 0x1

    const/16 v5, -0x102

    invoke-direct {v1, v3, v4, v5}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v3, Lb7/b0;

    const-string v5, "RS512"

    const/4 v6, 0x2

    const/16 v7, -0x103

    invoke-direct {v3, v5, v6, v7}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v5, Lb7/b0;

    const-string v7, "LEGACY_RS1"

    const/4 v8, 0x3

    const/16 v9, -0x106

    invoke-direct {v5, v7, v8, v9}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v7, Lb7/b0;

    const-string v9, "PS256"

    const/4 v10, 0x4

    const/16 v11, -0x25

    invoke-direct {v7, v9, v10, v11}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v9, Lb7/b0;

    const-string v11, "PS384"

    const/4 v12, 0x5

    const/16 v13, -0x26

    invoke-direct {v9, v11, v12, v13}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v11, Lb7/b0;

    const-string v13, "PS512"

    const/4 v14, 0x6

    const/16 v15, -0x27

    invoke-direct {v11, v13, v14, v15}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    new-instance v13, Lb7/b0;

    const-string v15, "RS1"

    const/4 v14, 0x7

    const v12, -0xffff

    invoke-direct {v13, v15, v14, v12}, Lb7/b0;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lb7/b0;->b:Lb7/b0;

    const/16 v12, 0x8

    new-array v12, v12, [Lb7/b0;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    aput-object v7, v12, v10

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    aput-object v13, v12, v14

    sput-object v12, Lb7/b0;->c:[Lb7/b0;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb7/b0;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb7/b0;
    .locals 1

    const-class v0, Lb7/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb7/b0;

    return-object p0
.end method

.method public static values()[Lb7/b0;
    .locals 1

    sget-object v0, Lb7/b0;->c:[Lb7/b0;

    invoke-virtual {v0}, [Lb7/b0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb7/b0;

    return-object v0
.end method


# virtual methods
.method public final f()I
    .locals 1

    iget v0, p0, Lb7/b0;->a:I

    return v0
.end method
