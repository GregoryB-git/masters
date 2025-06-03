.class public Lg1/c$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg1/c$e$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Lg1/c$e$a;

.field public c:Landroid/os/Messenger;

.field public final synthetic d:Lg1/c;


# direct methods
.method public constructor <init>(Lg1/c;)V
    .locals 0

    iput-object p1, p0, Lg1/c$e;->d:Lg1/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg1/c$e;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lg1/c$e;->b:Lg1/c$e$a;

    invoke-virtual {p1, p2}, Landroid/service/media/MediaBrowserService;->notifyChildrenChanged(Ljava/lang/String;)V

    return-void
.end method
