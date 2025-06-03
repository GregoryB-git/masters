.class public final enum Le7/e3$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le7/e3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le7/e3$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Le7/e3$a;

.field public static final enum c:Le7/e3$a;

.field public static final enum d:Le7/e3$a;

.field public static final enum e:Le7/e3$a;

.field public static final synthetic f:[Le7/e3$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    new-instance v0, Le7/e3$a;

    const-string v1, "AD_STORAGE"

    const/4 v2, 0x0

    const-string v3, "ad_storage"

    invoke-direct {v0, v1, v2, v3}, Le7/e3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Le7/e3$a;->b:Le7/e3$a;

    new-instance v1, Le7/e3$a;

    const-string v3, "ANALYTICS_STORAGE"

    const/4 v4, 0x1

    const-string v5, "analytics_storage"

    invoke-direct {v1, v3, v4, v5}, Le7/e3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Le7/e3$a;->c:Le7/e3$a;

    new-instance v3, Le7/e3$a;

    const-string v5, "AD_USER_DATA"

    const/4 v6, 0x2

    const-string v7, "ad_user_data"

    invoke-direct {v3, v5, v6, v7}, Le7/e3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Le7/e3$a;->d:Le7/e3$a;

    new-instance v5, Le7/e3$a;

    const-string v7, "AD_PERSONALIZATION"

    const/4 v8, 0x3

    const-string v9, "ad_personalization"

    invoke-direct {v5, v7, v8, v9}, Le7/e3$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v5, Le7/e3$a;->e:Le7/e3$a;

    const/4 v7, 0x4

    new-array v7, v7, [Le7/e3$a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Le7/e3$a;->f:[Le7/e3$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Le7/e3$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static values()[Le7/e3$a;
    .locals 1

    sget-object v0, Le7/e3$a;->f:[Le7/e3$a;

    invoke-virtual {v0}, [Le7/e3$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le7/e3$a;

    return-object v0
.end method
