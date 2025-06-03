.class public final Lg/c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg/c;->initDelegate()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lg/c;


# direct methods
.method public constructor <init>(Lg/c;)V
    .locals 0

    iput-object p1, p0, Lg/c$a;->a:Lg/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lg/c$a;->a:Lg/c;

    invoke-virtual {v1}, Lg/c;->getDelegate()Lg/f;

    move-result-object v1

    invoke-virtual {v1}, Lg/f;->s()V

    return-object v0
.end method
