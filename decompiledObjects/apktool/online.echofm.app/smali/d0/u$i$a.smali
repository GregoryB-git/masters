.class public final Ld0/u$i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u$i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:Ljava/lang/String;

.field public c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ld0/u$i$a;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$i$a;->a:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ld0/u$i$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$i$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Ld0/u$i$a;)Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$i$a;->c:Landroid/os/Bundle;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public d()Ld0/u$i;
    .locals 2

    .line 1
    new-instance v0, Ld0/u$i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/u$i;-><init>(Ld0/u$i$a;Ld0/u$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
