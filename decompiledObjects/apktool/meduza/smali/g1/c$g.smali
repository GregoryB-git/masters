.class public Lg1/c$g;
.super Lg1/c$f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/c$g$a;
    }
.end annotation


# instance fields
.field public final synthetic f:Lg1/c;


# direct methods
.method public constructor <init>(Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$g;->f:Lg1/c;

    invoke-direct {p0, p1}, Lg1/c$f;-><init>(Lg1/c;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lg1/c$e;->b:Lg1/c$e$a;

    invoke-static {v0, p2, p1}, Lb0/f;->j(Landroid/service/media/MediaBrowserService;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public final onCreate()V
    .locals 2

    new-instance v0, Lg1/c$g$a;

    iget-object v1, p0, Lg1/c$g;->f:Lg1/c;

    invoke-direct {v0, p0, v1}, Lg1/c$g$a;-><init>(Lg1/c$g;Lg1/c;)V

    iput-object v0, p0, Lg1/c$e;->b:Lg1/c$e$a;

    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method
