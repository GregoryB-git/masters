.class public interface abstract Landroid/support/customtabs/trusted/ITrustedWebActivityService;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IInterface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/customtabs/trusted/ITrustedWebActivityService$a;,
        Landroid/support/customtabs/trusted/ITrustedWebActivityService$Stub;
    }
.end annotation


# static fields
.field public static final l:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "android$support$customtabs$trusted$ITrustedWebActivityService"

    const/16 v1, 0x24

    const/16 v2, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/customtabs/trusted/ITrustedWebActivityService;->l:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public abstract A1()I
.end method

.method public abstract B1()Landroid/os/Bundle;
.end method

.method public abstract D1()Landroid/os/Bundle;
.end method

.method public abstract J2()Landroid/os/Bundle;
.end method

.method public abstract X0()V
.end method

.method public abstract c0()Landroid/os/Bundle;
.end method

.method public abstract t()Landroid/os/Bundle;
.end method
