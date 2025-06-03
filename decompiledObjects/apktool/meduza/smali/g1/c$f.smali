.class public Lg1/c$f;
.super Lg1/c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/c$f$a;
    }
.end annotation


# instance fields
.field public final synthetic e:Lg1/c;


# direct methods
.method public constructor <init>(Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$f;->e:Lg1/c;

    invoke-direct {p0, p1}, Lg1/c$e;-><init>(Lg1/c;)V

    return-void
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    new-instance v0, Lg1/c$f$a;

    iget-object v1, p0, Lg1/c$f;->e:Lg1/c;

    invoke-direct {v0, p0, v1}, Lg1/c$f$a;-><init>(Lg1/c$f;Lg1/c;)V

    iput-object v0, p0, Lg1/c$e;->b:Lg1/c$e$a;

    invoke-virtual {v0}, Landroid/service/media/MediaBrowserService;->onCreate()V

    return-void
.end method
