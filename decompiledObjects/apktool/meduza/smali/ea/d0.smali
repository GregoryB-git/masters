.class public final synthetic Lea/d0;
.super Lec/h;
.source "SourceFile"

# interfaces
.implements Ldc/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/h;",
        "Ldc/a<",
        "Ljava/util/UUID;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lea/d0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/d0;

    invoke-direct {v0}, Lea/d0;-><init>()V

    sput-object v0, Lea/d0;->a:Lea/d0;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const-class v2, Ljava/util/UUID;

    const/4 v1, 0x0

    const-string v3, "randomUUID"

    const-string v4, "randomUUID()Ljava/util/UUID;"

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lec/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method
